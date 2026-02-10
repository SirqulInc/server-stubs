-module(openapi_billable_entity_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/api/:version/billable/create`, OperationId: `createBillableEntity`:
Create Billable.
reate a billable entity for an account. The creator is assumed to be the responsible account. An account can only have one billable entity

- `POST` to `/api/:version/billable/delete`, OperationId: `deleteBillableEntity`:
Delete Billable.
Mark the billable as deleted

- `GET` to `/api/:version/billable/get`, OperationId: `getBillableEntity`:
Get Billable.
Used to determine the associated BillableEntity of an account

- `POST` to `/api/:version/billable/update`, OperationId: `updateBillableEntity`:
Update Billable.
Updates the billable record for an account

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

-type class() :: 'billableEntity'.

-type operation_id() ::
    'createBillableEntity' %% Create Billable
    | 'deleteBillableEntity' %% Delete Billable
    | 'getBillableEntity' %% Get Billable
    | 'updateBillableEntity'. %% Update Billable


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
allowed_methods(Req, #state{operation_id = 'createBillableEntity'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteBillableEntity'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getBillableEntity'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateBillableEntity'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createBillableEntity'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteBillableEntity'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getBillableEntity'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateBillableEntity'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createBillableEntity'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteBillableEntity'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getBillableEntity'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateBillableEntity'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createBillableEntity'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteBillableEntity'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getBillableEntity'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateBillableEntity'} = State) ->
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
    {Res, Req1, Context1} = Handler(billableEntity, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(billableEntity, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
