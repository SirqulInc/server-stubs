-module(openapi_mission_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/api/:version/mission/create`, OperationId: `createMission`:
Create Mission.
Create a user defined mission.

- `POST` to `/api/:version/mission/delete`, OperationId: `deleteMission`:
Delete Mission.
Delete a mission.

- `GET` to `/api/:version/mission/find`, OperationId: `findMissions`:
Find Missions.
Get a set of ad filtered by the parameters provided.

- `GET` to `/api/:version/mission/get`, OperationId: `getMission`:
Get Mission.
Get a mission.

- `POST` to `/api/:version/mission/import`, OperationId: `importMission`:
Import Mission.
Create a mission using a source item such as an offer location.

- `GET` to `/api/:version/mission/format/search`, OperationId: `searchMissionFormats`:
Search Mission Formats.
Searches on pre-defined mission formats

- `GET` to `/api/:version/mission/search`, OperationId: `searchMissions`:
Search Missions.
Get the list missions available to the account.  

- `GET` to `/api/:version/mission/searchByBillableEntity`, OperationId: `searchMissionsByBillableEntity`:
Search Missions by Billable Entity.
Use the accountId to determine the associated BillableEntity.  From there get a list of all accounts associated as managers.  Get the list missions owned by all associated managers.

- `POST` to `/api/:version/mission/update`, OperationId: `updateMission`:
Update Mission.
Update a mission.

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

-type class() :: 'mission'.

-type operation_id() ::
    'createMission' %% Create Mission
    | 'deleteMission' %% Delete Mission
    | 'findMissions' %% Find Missions
    | 'getMission' %% Get Mission
    | 'importMission' %% Import Mission
    | 'searchMissionFormats' %% Search Mission Formats
    | 'searchMissions' %% Search Missions
    | 'searchMissionsByBillableEntity' %% Search Missions by Billable Entity
    | 'updateMission'. %% Update Mission


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
allowed_methods(Req, #state{operation_id = 'createMission'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteMission'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'findMissions'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getMission'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'importMission'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchMissionFormats'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchMissions'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchMissionsByBillableEntity'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateMission'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createMission'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteMission'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'findMissions'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getMission'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'importMission'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchMissionFormats'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchMissions'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchMissionsByBillableEntity'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateMission'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createMission'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteMission'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'findMissions'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getMission'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'importMission'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchMissionFormats'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchMissions'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchMissionsByBillableEntity'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateMission'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createMission'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteMission'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'findMissions'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getMission'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'importMission'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchMissionFormats'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchMissions'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchMissionsByBillableEntity'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateMission'} = State) ->
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
    {Res, Req1, Context1} = Handler(mission, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(mission, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
