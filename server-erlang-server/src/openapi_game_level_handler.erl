-module(openapi_game_level_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/api/:version/level/create`, OperationId: `createGameLevel`:
Create Game Level.
Create a game level. Currently does NOT support game objects.

- `POST` to `/api/:version/level/delete`, OperationId: `deleteGameLevel`:
Delete Game Level.
Delete a game level. The level and account must be valid and have the appropirate permissions to view the content.

- `GET` to `/api/:version/level/get`, OperationId: `getGameLevel`:
Get Game Level.
Get a game level. The level and account must be valid and have the appropirate permissions to view the content.

- `GET` to `/api/:version/level/search`, OperationId: `getGameLevelsByApplication`:
Search Game Levels.
Get a list of levels for an application, just those the account has permissions to view.

- `GET` to `/api/:version/level/searchByBillableEntity`, OperationId: `getGameLevelsByBillableEntity`:
Search Game Level by Billable Entity.
Searches on game levels that the logged in user has access to. A user would have access if the creator of the game level is managed under the same BillableEntity.

- `GET` to `/api/:version/level/questions/get`, OperationId: `getQuestionsInLevel`:
Get Level Questions.
Get questions within a level.

- `GET` to `/api/:version/level/words/get`, OperationId: `getWordsInLevel`:
Get Level Words.
Get words within a level.

- `POST` to `/api/:version/level/update`, OperationId: `updateGameLevel`:
Update Game Level.
Update a game level. Currently does NOT support game objects.

- `POST` to `/api/:version/level/questions/update`, OperationId: `updateQuestionsInLevel`:
Update Level Questions.
Updates a level with question game objects.

- `POST` to `/api/:version/level/words/update`, OperationId: `updateWordsInLevel`:
Update Level Words.
Updates a level with word game objects.

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

-type class() :: 'gameLevel'.

-type operation_id() ::
    'createGameLevel' %% Create Game Level
    | 'deleteGameLevel' %% Delete Game Level
    | 'getGameLevel' %% Get Game Level
    | 'getGameLevelsByApplication' %% Search Game Levels
    | 'getGameLevelsByBillableEntity' %% Search Game Level by Billable Entity
    | 'getQuestionsInLevel' %% Get Level Questions
    | 'getWordsInLevel' %% Get Level Words
    | 'updateGameLevel' %% Update Game Level
    | 'updateQuestionsInLevel' %% Update Level Questions
    | 'updateWordsInLevel'. %% Update Level Words


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
allowed_methods(Req, #state{operation_id = 'createGameLevel'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteGameLevel'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getGameLevel'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getGameLevelsByApplication'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getGameLevelsByBillableEntity'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getQuestionsInLevel'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getWordsInLevel'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateGameLevel'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateQuestionsInLevel'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateWordsInLevel'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createGameLevel'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteGameLevel'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getGameLevel'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getGameLevelsByApplication'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getGameLevelsByBillableEntity'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getQuestionsInLevel'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getWordsInLevel'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateGameLevel'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateQuestionsInLevel'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateWordsInLevel'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createGameLevel'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteGameLevel'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getGameLevel'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getGameLevelsByApplication'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getGameLevelsByBillableEntity'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getQuestionsInLevel'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getWordsInLevel'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateGameLevel'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateQuestionsInLevel'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateWordsInLevel'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createGameLevel'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteGameLevel'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getGameLevel'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getGameLevelsByApplication'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getGameLevelsByBillableEntity'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getQuestionsInLevel'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getWordsInLevel'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateGameLevel'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateQuestionsInLevel'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateWordsInLevel'} = State) ->
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
    {Res, Req1, Context1} = Handler(gameLevel, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(gameLevel, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
