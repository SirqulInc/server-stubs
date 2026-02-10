-module(openapi_mission_invite_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/api/:version/mission/invite/create`, OperationId: `createMissionInvite`:
Create Mission Invite.
Create the mission invite. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided.

- `POST` to `/api/:version/mission/invite/delete`, OperationId: `deleteMissionInvite`:
Delete Mission Invite.
Update the mission invite status to quit.

- `GET` to `/api/:version/mission/invite/get`, OperationId: `getMissionInvite`:
Get Mission Invite.
Get the mission invite. An account can only be invited to a mission one time.

- `GET` to `/api/:version/mission/invite/search`, OperationId: `searchMissionInvites`:
Search Mission Invites.
Get a list of mission invites that the account has.

- `POST` to `/api/:version/mission/invite/update`, OperationId: `updateMissionInvite`:
Update Mission Invite.
Update the mission invite status. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided.

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

-type class() :: 'missionInvite'.

-type operation_id() ::
    'createMissionInvite' %% Create Mission Invite
    | 'deleteMissionInvite' %% Delete Mission Invite
    | 'getMissionInvite' %% Get Mission Invite
    | 'searchMissionInvites' %% Search Mission Invites
    | 'updateMissionInvite'. %% Update Mission Invite


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
allowed_methods(Req, #state{operation_id = 'createMissionInvite'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteMissionInvite'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getMissionInvite'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchMissionInvites'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateMissionInvite'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createMissionInvite'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteMissionInvite'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getMissionInvite'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchMissionInvites'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateMissionInvite'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createMissionInvite'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteMissionInvite'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getMissionInvite'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchMissionInvites'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateMissionInvite'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createMissionInvite'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteMissionInvite'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getMissionInvite'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchMissionInvites'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateMissionInvite'} = State) ->
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
    {Res, Req1, Context1} = Handler(missionInvite, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(missionInvite, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
