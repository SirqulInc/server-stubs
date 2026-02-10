-module(openapi_achievement_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/api/:version/achievement/tier/search`, OperationId: ``:
Searches an Achievement Tier.
Searches a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.

- `POST` to `/api/:version/achievement/create`, OperationId: `createAchievement`:
Create Achievement.
Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.

- `POST` to `/api/:version/achievement/tier/create`, OperationId: `createAchievementTier`:
Create Achievement Tier.
Create a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.

- `POST` to `/api/:version/achievement/delete`, OperationId: `deleteAchievement`:
Delete Achievement.
Deletes an achievement (for developer/retailer use). User must have permissions to the application the achievement was created for.

- `POST` to `/api/:version/achievement/tier/delete`, OperationId: `deleteAchievementTier`:
Delete Achievement Tier.
Deletes an achievement tier (for developer/retailer use). User must have permissions to the application the achievement was created for.

- `GET` to `/api/:version/achievement/get`, OperationId: `getAchievement`:
Get Achievement.
Get an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.

- `POST` to `/api/:version/achievement/tier/get`, OperationId: `getAchievementTier`:
Gets an achievement tier.
Gets an achievement tier (for developer/retailer use). User must have permissions to the application the achievement is created for.

- `GET` to `/api/:version/achievement/progress/get`, OperationId: `getUserAchievements`:
Get Achievement Progress.
Gets a list of user achievements.

- `GET` to `/api/:version/achievement/tag/list`, OperationId: `listAchievementTags`:
List Achievement Tags.
List achievement tags by application

- `GET` to `/api/:version/achievement/list`, OperationId: `listAchievements`:
List Achievements.
List achievements by billable.

- `GET` to `/api/:version/achievement/search`, OperationId: `searchAchievements`:
Search Achievements.
Searches achievements by application for consumers.

- `POST` to `/api/:version/achievement/update`, OperationId: `updateAchievement`:
Update Achievement.
Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.

- `POST` to `/api/:version/achievement/tier/update`, OperationId: `updateAchievementTier`:
Update Achievement Tier.
Updates a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.

- `POST` to `/api/:version/achievement/progress/update`, OperationId: `updateUserAchievement`:
Update Achievement Progress.
Update user achievement progress.

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

-type class() :: 'achievement'.

-type operation_id() ::
    '' %% Searches an Achievement Tier
    | 'createAchievement' %% Create Achievement
    | 'createAchievementTier' %% Create Achievement Tier
    | 'deleteAchievement' %% Delete Achievement
    | 'deleteAchievementTier' %% Delete Achievement Tier
    | 'getAchievement' %% Get Achievement
    | 'getAchievementTier' %% Gets an achievement tier
    | 'getUserAchievements' %% Get Achievement Progress
    | 'listAchievementTags' %% List Achievement Tags
    | 'listAchievements' %% List Achievements
    | 'searchAchievements' %% Search Achievements
    | 'updateAchievement' %% Update Achievement
    | 'updateAchievementTier' %% Update Achievement Tier
    | 'updateUserAchievement'. %% Update Achievement Progress


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
allowed_methods(Req, #state{operation_id = ''} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createAchievement'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createAchievementTier'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteAchievement'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteAchievementTier'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getAchievement'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getAchievementTier'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getUserAchievements'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'listAchievementTags'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'listAchievements'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchAchievements'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateAchievement'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateAchievementTier'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateUserAchievement'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = ''} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createAchievement'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createAchievementTier'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteAchievement'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteAchievementTier'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getAchievement'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getAchievementTier'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getUserAchievements'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'listAchievementTags'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'listAchievements'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchAchievements'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateAchievement'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateAchievementTier'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateUserAchievement'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = ''} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createAchievement'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createAchievementTier'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteAchievement'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteAchievementTier'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getAchievement'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getAchievementTier'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getUserAchievements'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'listAchievementTags'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'listAchievements'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchAchievements'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateAchievement'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateAchievementTier'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateUserAchievement'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = ''} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createAchievement'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createAchievementTier'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteAchievement'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteAchievementTier'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getAchievement'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getAchievementTier'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getUserAchievements'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'listAchievementTags'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'listAchievements'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchAchievements'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateAchievement'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateAchievementTier'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateUserAchievement'} = State) ->
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
    {Res, Req1, Context1} = Handler(achievement, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(achievement, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
