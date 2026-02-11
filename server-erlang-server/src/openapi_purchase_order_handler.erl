-module(openapi_purchase_order_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/order/create`, OperationId: `createOrder`:
Create Order.
Creates a new purchase with some number of items associated with it. The purchase is added to the order that was created

- `POST` to `/order/delete`, OperationId: `deleteOrder`:
Delete Order.
Removes the transaction from the wallet by setting the deleted date to the current date/time.  Requires a valid account and transactionId.

- `GET` to `/order/get`, OperationId: `getOrder`:
Get Order.
Get an order record

- `POST` to `/order/preview`, OperationId: `previewOrder`:
Preview Order.
Previews a purchase to see the total cost before making it.

- `GET` to `/order/search`, OperationId: `searchOrders`:
Search Orders.
Search on active orders by customer

- `POST` to `/order/update`, OperationId: `updateOrder`:
Update Order.
Updates new purchase with some number of items associated with it. The orderId provided is used to retrieve the record and the payment is added to it.

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

-type class() :: 'purchaseOrder'.

-type operation_id() ::
    'createOrder' %% Create Order
    | 'deleteOrder' %% Delete Order
    | 'getOrder' %% Get Order
    | 'previewOrder' %% Preview Order
    | 'searchOrders' %% Search Orders
    | 'updateOrder'. %% Update Order


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
allowed_methods(Req, #state{operation_id = 'createOrder'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteOrder'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getOrder'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'previewOrder'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchOrders'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateOrder'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createOrder'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteOrder'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getOrder'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'previewOrder'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchOrders'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateOrder'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createOrder'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteOrder'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getOrder'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'previewOrder'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchOrders'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateOrder'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createOrder'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteOrder'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getOrder'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'previewOrder'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchOrders'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateOrder'} = State) ->
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
    {Res, Req1, Context1} = Handler(purchaseOrder, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(purchaseOrder, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
