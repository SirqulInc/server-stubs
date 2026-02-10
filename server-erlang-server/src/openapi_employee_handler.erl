-module(openapi_employee_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/api/:version/employee/assign`, OperationId: `assignEmployee`:
Assign Employee.
Assign An existing account to be an employee

- `POST` to `/api/:version/employee/assignToLocation`, OperationId: `assignToLocationEmployee`:
Assign Employee to Location.
Assign or unassign the account to a retailer location.

- `POST` to `/api/:version/employee/create`, OperationId: `createEmployee`:
Create Employee.
Create a new account record with the provided information.

- `POST` to `/api/:version/employee/delete`, OperationId: `deleteEmployee`:
Delete Employee.
Set the deleted date field which marks the record as deleted.

- `POST` to `/api/:version/employee/get`, OperationId: `getEmployee`:
Get Employee.
Get the account record for the account id provided.

- `POST` to `/api/:version/employee/search`, OperationId: `searchEmployees`:
Search Employees.
Use the accountId to determine the associated BillableEntity. From there get a list of all accounts associated as managers/employees.

- `POST` to `/api/:version/employee/unassign`, OperationId: `unassignEmployee`:
Unassign Employee.
Unassign An existing account to be an employee

- `POST` to `/api/:version/employee/update`, OperationId: `updateEmployee`:
Update Employee.
Update the account record with the provided information.

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

-type class() :: 'employee'.

-type operation_id() ::
    'assignEmployee' %% Assign Employee
    | 'assignToLocationEmployee' %% Assign Employee to Location
    | 'createEmployee' %% Create Employee
    | 'deleteEmployee' %% Delete Employee
    | 'getEmployee' %% Get Employee
    | 'searchEmployees' %% Search Employees
    | 'unassignEmployee' %% Unassign Employee
    | 'updateEmployee'. %% Update Employee


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
allowed_methods(Req, #state{operation_id = 'assignEmployee'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'assignToLocationEmployee'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createEmployee'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteEmployee'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getEmployee'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchEmployees'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'unassignEmployee'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateEmployee'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'assignEmployee'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'assignToLocationEmployee'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createEmployee'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteEmployee'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getEmployee'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchEmployees'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'unassignEmployee'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateEmployee'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'assignEmployee'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'assignToLocationEmployee'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createEmployee'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteEmployee'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getEmployee'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchEmployees'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'unassignEmployee'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateEmployee'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'assignEmployee'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'assignToLocationEmployee'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createEmployee'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteEmployee'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getEmployee'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchEmployees'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'unassignEmployee'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateEmployee'} = State) ->
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
    {Res, Req1, Context1} = Handler(employee, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(employee, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
