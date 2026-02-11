-module(openapi_assignment_handler).
-moduledoc """
Exposes the following operation IDs:

- `GET` to `/assignment/assignee/search`, OperationId: `assigmentAssigneeAccountSearch`:
Search Assignment Assignees.
Search for avaiable users for creating or updating assignment.

- `POST` to `/assignment/create`, OperationId: `assignmentCreate`:
Create Assignment.
Create an assignment.

- `POST` to `/assignment/delete`, OperationId: `assignmentDelete`:
Delete Assignment.
Delete an assignment.

- `GET` to `/assignment/get`, OperationId: `assignmentGet`:
Get Assignment.
Get the details of an assignment.

- `GET` to `/assignment/search`, OperationId: `assignmentSearch`:
Search Assignments.
Search for assignments by the given parameters.

- `POST` to `/assignment/status/create`, OperationId: `assignmentStatusCreate`:
Create Assignment Status.
Create an assignment status.

- `POST` to `/assignment/status/delete`, OperationId: `assignmentStatusDelete`:
Deletes Assignment Status.
Deletes an assignment status.

- `GET` to `/assignment/status/get`, OperationId: `assignmentStatusGet`:
Get Assignment Status.
Get an assignment status.

- `GET` to `/assignment/status/search`, OperationId: `assignmentStatusSearch`:
Search Assignment Statuses.
Search on assignment statuses.

- `POST` to `/assignment/status/update`, OperationId: `assignmentStatusUpdate`:
Update Assignment Status.
Updates an assignment status.

- `POST` to `/assignment/update`, OperationId: `assignmentUpdate`:
Update Assignment.
Updates an assignment.

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

-type class() :: 'assignment'.

-type operation_id() ::
    'assigmentAssigneeAccountSearch' %% Search Assignment Assignees
    | 'assignmentCreate' %% Create Assignment
    | 'assignmentDelete' %% Delete Assignment
    | 'assignmentGet' %% Get Assignment
    | 'assignmentSearch' %% Search Assignments
    | 'assignmentStatusCreate' %% Create Assignment Status
    | 'assignmentStatusDelete' %% Deletes Assignment Status
    | 'assignmentStatusGet' %% Get Assignment Status
    | 'assignmentStatusSearch' %% Search Assignment Statuses
    | 'assignmentStatusUpdate' %% Update Assignment Status
    | 'assignmentUpdate'. %% Update Assignment


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
allowed_methods(Req, #state{operation_id = 'assigmentAssigneeAccountSearch'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'assignmentCreate'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'assignmentDelete'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'assignmentGet'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'assignmentSearch'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'assignmentStatusCreate'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'assignmentStatusDelete'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'assignmentStatusGet'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'assignmentStatusSearch'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'assignmentStatusUpdate'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'assignmentUpdate'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'assigmentAssigneeAccountSearch'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'assignmentCreate'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'assignmentDelete'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'assignmentGet'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'assignmentSearch'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'assignmentStatusCreate'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'assignmentStatusDelete'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'assignmentStatusGet'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'assignmentStatusSearch'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'assignmentStatusUpdate'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'assignmentUpdate'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'assigmentAssigneeAccountSearch'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'assignmentCreate'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'assignmentDelete'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'assignmentGet'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'assignmentSearch'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'assignmentStatusCreate'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'assignmentStatusDelete'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'assignmentStatusGet'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'assignmentStatusSearch'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'assignmentStatusUpdate'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'assignmentUpdate'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'assigmentAssigneeAccountSearch'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'assignmentCreate'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'assignmentDelete'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'assignmentGet'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'assignmentSearch'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'assignmentStatusCreate'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'assignmentStatusDelete'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'assignmentStatusGet'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'assignmentStatusSearch'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'assignmentStatusUpdate'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'assignmentUpdate'} = State) ->
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
    {Res, Req1, Context1} = Handler(assignment, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(assignment, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
