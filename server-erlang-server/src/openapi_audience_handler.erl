-module(openapi_audience_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/api/:version/audience/create`, OperationId: `createAudience`:
Create Audience.
Create a user defined audience.

- `POST` to `/api/:version/audience/delete`, OperationId: `deleteAudience`:
Delete Audience.
Delete an audience. The audience and account must be valid and have the appropirate permissions to view the content.

- `GET` to `/api/:version/audience/ageGroups`, OperationId: `getAgeGroups`:
Get Age Groups.
Gets the list of available age groups that can be selected by consumers and retailers targeting offers.

- `GET` to `/api/:version/audience/get`, OperationId: `getAudience`:
Get Audience.
Get an audience. The audience and account must be valid and have the appropriate permissions to view the content.

- `GET` to `/api/:version/audience/search`, OperationId: `getAudienceList`:
Search Audiences.
Get the list audiences owned by the account

- `GET` to `/api/:version/audience/devices`, OperationId: `getDevices`:
Get Devices.
Gets the list of available devices that can be selected by consumers and retailers.

- `GET` to `/api/:version/audience/experiences`, OperationId: `getExperiences`:
Get Experiences.
Gets the list of available experiences that can be selected by consumers and retailers.

- `GET` to `/api/:version/audience/grouped/get`, OperationId: `getGroupedAudiences`:
Get GroupedAudiences.
Get a group of audiences. The audience and account must be valid and have the appropriate permissions to view the content.

- `POST` to `/api/:version/audience/suggestion/list`, OperationId: `listByAccount`:
List Suggestions by Audience.
List either Missions or Offers that the user matches the assigned audience.

- `GET` to `/api/:version/audience/suggestion/offersByAudience`, OperationId: `listByAudience`:
List Offers by Audience.
Get a list of offer locations based on audience information provided.

- `GET` to `/api/:version/audience/suggestion/latest`, OperationId: `listLastestByAccount`:
List Sent Suggestions .
Return list of recent trigger suggestions that have been sent to the user.

- `POST` to `/api/:version/audience/suggestion/send`, OperationId: `sendByAccount`:
Send Suggestions.
Use the accountId to determine the associated BillableEntity. From there get a list of all triggers associated with the BillableEntity.

- `POST` to `/api/:version/audience/update`, OperationId: `updateAudience`:
Update Audience.
Update a user defined audience.

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

-type class() :: 'audience'.

-type operation_id() ::
    'createAudience' %% Create Audience
    | 'deleteAudience' %% Delete Audience
    | 'getAgeGroups' %% Get Age Groups
    | 'getAudience' %% Get Audience
    | 'getAudienceList' %% Search Audiences
    | 'getDevices' %% Get Devices
    | 'getExperiences' %% Get Experiences
    | 'getGroupedAudiences' %% Get GroupedAudiences
    | 'listByAccount' %% List Suggestions by Audience
    | 'listByAudience' %% List Offers by Audience
    | 'listLastestByAccount' %% List Sent Suggestions 
    | 'sendByAccount' %% Send Suggestions
    | 'updateAudience'. %% Update Audience


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
allowed_methods(Req, #state{operation_id = 'createAudience'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteAudience'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getAgeGroups'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getAudience'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getAudienceList'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getDevices'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getExperiences'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getGroupedAudiences'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'listByAccount'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'listByAudience'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'listLastestByAccount'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'sendByAccount'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateAudience'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createAudience'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteAudience'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getAgeGroups'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getAudience'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getAudienceList'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getDevices'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getExperiences'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getGroupedAudiences'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'listByAccount'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'listByAudience'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'listLastestByAccount'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'sendByAccount'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateAudience'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createAudience'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteAudience'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getAgeGroups'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getAudience'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getAudienceList'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getDevices'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getExperiences'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getGroupedAudiences'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'listByAccount'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'listByAudience'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'listLastestByAccount'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'sendByAccount'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateAudience'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createAudience'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteAudience'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getAgeGroups'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getAudience'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getAudienceList'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getDevices'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getExperiences'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getGroupedAudiences'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'listByAccount'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'listByAudience'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'listLastestByAccount'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'sendByAccount'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateAudience'} = State) ->
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
    {Res, Req1, Context1} = Handler(audience, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(audience, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
