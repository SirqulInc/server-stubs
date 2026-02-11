-module(openapi_orson_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/orson/ai/addMovie`, OperationId: `addMovie`:
Add Movie.
Add a movie to be indexed for Topics. Indexing a movie analyses the content and incorporates it into the topics model for future /topics calls. This does not store the movie file long-term.

- `GET` to `/orson/ai/docs`, OperationId: `aiDocs`:
Search Docs.
Takes in a text string representing one or more sentences and it returns a list of documents which are related to the provided document.

- `GET` to `/orson/ai/img`, OperationId: `aiFindImages`:
Find images.
Returns a list of URIs of images that match the text.

- `GET` to `/orson/ai/tags`, OperationId: `aiTags`:
Search Tags.
Search the tags column of user provided tags using this endpoint.

- `GET` to `/orson/ai/text`, OperationId: `aiText`:
Search Text.
Search the movie text column of movie text using this endpoint.

- `POST` to `/orson/ai/batch`, OperationId: `batch`:
Batch Analysis.
Run several types of analysis on an audio or video file in a single API call, instead of calling several operations for the same file..

- `POST` to `/orson/stories/episodes/instant`, OperationId: `createInstantEpisode`:
Creates an instant episode.
Creates an instant episode for a given StoryStrip by providing all necessary inputs, interview recordings, and pictures, kicking off a render immediately.

- `POST` to `/orson/ai/voiceCanvas`, OperationId: `createVoiceCanvas`:
Create VoiceCanvas images.
Create VoiceCanvas images for provided text, file upload, or file URL

- `POST` to `/orson/ai/emotion`, OperationId: `emotion`:
Detect emotions.
Detects emotions in an audio or video recording.

- `GET` to `/orson/ai/addMovie/:requestId`, OperationId: `getAddMovieResult`:
Get Add Movie Result.
Get the result of an in progress Add Movie request from an earlier POST.

- `GET` to `/orson/ai/batch/:requestId`, OperationId: `getBatch`:
Get Batch Analysis Results.
Gets the completed Video Batch results, if done, or an error or status update if not.

- `GET` to `/orson/ai/emotion/:requestId`, OperationId: `getEmotion`:
Get Emotion Results.
Checks the Emotion analysis and returns in progress, results, or error.

- `GET` to `/orson/stories/episodes/:episodeId/status`, OperationId: `getEpisodeStatus`:
Check episode status.
Gets a summary of the episode&#39;s status, including any renders.

- `GET` to `/orson/stories/renders/:renderId/status`, OperationId: `getRenderStatus`:
Check episode status.
Gets a summary of the episode&#39;s status, including any renders.

- `GET` to `/orson/ai/stt/:requestId`, OperationId: `getSTT`:
Get Speach to Text Result.
The results of the video transcription and optional translation.

- `GET` to `/orson/ai/tts/:requestId`, OperationId: `getTTS`:
Get Text to Speach Result.
Check the status of an in progress Text-to-Speech call or download the result.

- `GET` to `/orson/ai/techTune/:requestId`, OperationId: `getTechTune`:
Get TechTune Results.
Get a result or continue waiting for a pending request for TechTune analysis.

- `GET` to `/orson/ai/topics/:requestId`, OperationId: `getTopics`:
Get Topics.
Get the result of an in progress Topics Analysis from an earlier POST.

- `GET` to `/orson/ai/voiceCanvas/:requestId`, OperationId: `getVoiceCanvas`:
Get VoiceCanvas images.
Get a result or continue waiting for a pending request for VoiceCanvas Images.

- `POST` to `/orson/stories/renders`, OperationId: `startVideoRender`:
Starts a StoryStitch video render.
Starts a StoryStitch video render to produce your final video, returning the status details.

- `POST` to `/orson/ai/stt`, OperationId: `stt`:
Speach to Text.
Accepts a movie URL or uploaded file and transcribes it. You also have the option to translate it into one of our additional supported languages.

- `POST` to `/orson/ai/topics`, OperationId: `summarizeTopics`:
Summarize Topics.
Takes in a string of text sentences (also known as a document) and returns a list of associated topics and their proximity score.

- `POST` to `/orson/ai/techTune`, OperationId: `techTune`:
Detect Technical Issues.
Analyses a movie file to detect technical issues, such as too few people in frame.

- `POST` to `/orson/ai/tts`, OperationId: `tts`:
Text to Speach.
Creates an audio file for the given text, with the option of language and voice selection.

""".

-behaviour(cowboy_rest).

-include_lib("kernel/include/logger.hrl").

%% Cowboy REST callbacks
-export([init/2]).
-export([allowed_methods/2]).
-export([content_types_accepted/2]).
-export([content_types_provided/2]).
-export([delete_resource/2]).
-export([is_authorized/2]).
-export([valid_content_headers/2]).
-export([handle_type_accepted/2, handle_type_provided/2]).

-ignore_xref([handle_type_accepted/2, handle_type_provided/2]).

-export_type([class/0, operation_id/0]).

-type class() :: 'orson'.

-type operation_id() ::
    'addMovie' %% Add Movie
    | 'aiDocs' %% Search Docs
    | 'aiFindImages' %% Find images
    | 'aiTags' %% Search Tags
    | 'aiText' %% Search Text
    | 'batch' %% Batch Analysis
    | 'createInstantEpisode' %% Creates an instant episode
    | 'createVoiceCanvas' %% Create VoiceCanvas images
    | 'emotion' %% Detect emotions
    | 'getAddMovieResult' %% Get Add Movie Result
    | 'getBatch' %% Get Batch Analysis Results
    | 'getEmotion' %% Get Emotion Results
    | 'getEpisodeStatus' %% Check episode status
    | 'getRenderStatus' %% Check episode status
    | 'getSTT' %% Get Speach to Text Result
    | 'getTTS' %% Get Text to Speach Result
    | 'getTechTune' %% Get TechTune Results
    | 'getTopics' %% Get Topics
    | 'getVoiceCanvas' %% Get VoiceCanvas images
    | 'startVideoRender' %% Starts a StoryStitch video render
    | 'stt' %% Speach to Text
    | 'summarizeTopics' %% Summarize Topics
    | 'techTune' %% Detect Technical Issues
    | 'tts'. %% Text to Speach


-record(state,
        {operation_id :: operation_id(),
         accept_callback :: openapi_logic_handler:accept_callback(),
         provide_callback :: openapi_logic_handler:provide_callback(),
         api_key_callback :: openapi_logic_handler:api_key_callback(),
         context = #{} :: openapi_logic_handler:context()}).

-type state() :: #state{}.

-spec init(cowboy_req:req(), openapi_router:init_opts()) ->
    {cowboy_rest, cowboy_req:req(), state()}.
init(Req, {Operations, Module}) ->
    Method = cowboy_req:method(Req),
    OperationID = maps:get(Method, Operations, undefined),
    ?LOG_INFO(#{what => "Attempt to process operation",
                method => Method,
                operation_id => OperationID}),
    State = #state{operation_id = OperationID,
                   accept_callback = fun Module:accept_callback/4,
                   provide_callback = fun Module:provide_callback/4,
                   api_key_callback = fun Module:api_key_callback/2},
    {cowboy_rest, Req, State}.

-spec allowed_methods(cowboy_req:req(), state()) ->
    {[binary()], cowboy_req:req(), state()}.
allowed_methods(Req, #state{operation_id = 'addMovie'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'aiDocs'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'aiFindImages'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'aiTags'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'aiText'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'batch'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createInstantEpisode'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createVoiceCanvas'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'emotion'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getAddMovieResult'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getBatch'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getEmotion'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getEpisodeStatus'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getRenderStatus'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getSTT'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getTTS'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getTechTune'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getTopics'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getVoiceCanvas'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'startVideoRender'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'stt'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'summarizeTopics'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'techTune'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'tts'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'addMovie'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'aiDocs'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'aiFindImages'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'aiTags'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'aiText'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'batch'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createInstantEpisode'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createVoiceCanvas'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'emotion'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getAddMovieResult'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getBatch'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getEmotion'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getEpisodeStatus'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getRenderStatus'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getSTT'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getTTS'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getTechTune'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getTopics'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getVoiceCanvas'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'startVideoRender'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'stt'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'summarizeTopics'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'techTune'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'tts'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'addMovie'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'aiDocs'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'aiFindImages'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'aiTags'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'aiText'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'batch'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createInstantEpisode'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createVoiceCanvas'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'emotion'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getAddMovieResult'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getBatch'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getEmotion'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getEpisodeStatus'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getRenderStatus'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getSTT'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getTTS'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getTechTune'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getTopics'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getVoiceCanvas'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'startVideoRender'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'stt'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'summarizeTopics'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'techTune'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'tts'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'addMovie'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'aiDocs'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'aiFindImages'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'aiTags'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'aiText'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'batch'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createInstantEpisode'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createVoiceCanvas'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'emotion'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getAddMovieResult'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getBatch'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getEmotion'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getEpisodeStatus'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getRenderStatus'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getSTT'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getTTS'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getTechTune'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getTopics'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getVoiceCanvas'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'startVideoRender'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'stt'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'summarizeTopics'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'techTune'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'tts'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, State) ->
    {[], Req, State}.

-spec delete_resource(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
delete_resource(Req, State) ->
    {Res, Req1, State1} = handle_type_accepted(Req, State),
    {true =:= Res, Req1, State1}.

-spec handle_type_accepted(cowboy_req:req(), state()) ->
    { openapi_logic_handler:accept_callback_return(), cowboy_req:req(), state()}.
handle_type_accepted(Req, #state{operation_id = OperationID,
                                 accept_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(orson, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(orson, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
