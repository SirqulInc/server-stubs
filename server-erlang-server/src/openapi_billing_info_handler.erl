-module(openapi_billing_info_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/api/:version/billing/update`, OperationId: `addPaymentMethod`:
Update Payment Method.
Update a method of payment. If the paymentMethodId is not passed in then will update their default payment method.

- `POST` to `/api/:version/billing/create`, OperationId: `createPaymentMethod`:
Create Payment Method.
Add a new method of payment.

- `POST` to `/api/:version/billing/crypto/transfer`, OperationId: `createSmartContract`:
Create Smart Contract.
Adds a smart contract.

- `GET` to `/api/:version/billing/crypto/get`, OperationId: `getCryptoBalance`:
Get Crypto Balances.
Get the cypto balance details for a user

- `GET` to `/api/:version/billing/get`, OperationId: `getPaymentMethod`:
Get Payment Method.
Get the details of the user&#39;s payment method or their current default method of payment

- `GET` to `/api/:version/billing/search`, OperationId: `searchPaymentMethod`:
Search Payment Methods.
Search the payment methods of an account

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

-type class() :: 'billingInfo'.

-type operation_id() ::
    'addPaymentMethod' %% Update Payment Method
    | 'createPaymentMethod' %% Create Payment Method
    | 'createSmartContract' %% Create Smart Contract
    | 'getCryptoBalance' %% Get Crypto Balances
    | 'getPaymentMethod' %% Get Payment Method
    | 'searchPaymentMethod'. %% Search Payment Methods


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
allowed_methods(Req, #state{operation_id = 'addPaymentMethod'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createPaymentMethod'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createSmartContract'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getCryptoBalance'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getPaymentMethod'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchPaymentMethod'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'addPaymentMethod'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createPaymentMethod'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createSmartContract'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getCryptoBalance'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getPaymentMethod'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchPaymentMethod'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'addPaymentMethod'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createPaymentMethod'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createSmartContract'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getCryptoBalance'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getPaymentMethod'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchPaymentMethod'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'addPaymentMethod'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createPaymentMethod'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createSmartContract'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getCryptoBalance'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getPaymentMethod'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchPaymentMethod'} = State) ->
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
    {Res, Req1, Context1} = Handler(billingInfo, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(billingInfo, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
