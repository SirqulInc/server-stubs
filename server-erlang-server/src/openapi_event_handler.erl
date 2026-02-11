-module(openapi_event_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/event/attend`, OperationId: `attendEvent`:
Attend Event.
 Specify whether the user is attending an event at a particular location. This can also be used as a \&quot;check-in\&quot; action.

- `POST` to `/event/create`, OperationId: `createEvent`:
Create Event.
Create a private event to share with associates.

- `POST` to `/event/delete`, OperationId: `deleteEvent`:
Delete Event.
Delete an event that the user has permissions to.

- `GET` to `/event/get`, OperationId: `getEvent`:
Get Event.
Get an event.

- `GET` to `/event/attendance/search`, OperationId: `searchEventTransactions`:
Search Event Attendance.
Searches on event type transactions. This can be used to see who is attending an event.

- `GET` to `/event/search`, OperationId: `searchEvents`:
Search Events.
Searches on events that the account has access to.

- `POST` to `/event/update`, OperationId: `updateEvent`:
Update Event.
Update a private event to share with associates.

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

-type class() :: 'event'.

-type operation_id() ::
    'attendEvent' %% Attend Event
    | 'createEvent' %% Create Event
    | 'deleteEvent' %% Delete Event
    | 'getEvent' %% Get Event
    | 'searchEventTransactions' %% Search Event Attendance
    | 'searchEvents' %% Search Events
    | 'updateEvent'. %% Update Event


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
allowed_methods(Req, #state{operation_id = 'attendEvent'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createEvent'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteEvent'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getEvent'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchEventTransactions'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchEvents'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateEvent'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'attendEvent'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createEvent'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteEvent'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getEvent'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchEventTransactions'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchEvents'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateEvent'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'attendEvent'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createEvent'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteEvent'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getEvent'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchEventTransactions'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchEvents'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateEvent'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'attendEvent'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createEvent'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteEvent'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getEvent'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchEventTransactions'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchEvents'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateEvent'} = State) ->
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
    {Res, Req1, Context1} = Handler(event, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(event, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
