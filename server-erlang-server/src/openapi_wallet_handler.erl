-module(openapi_wallet_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/wallet/create`, OperationId: `createOfferTransaction`:
Create Wallet Offers.
Adds offers to the wallet

- `POST` to `/wallet/delete`, OperationId: `deleteOfferTransaction`:
Delete Wallet Offer.
Removes the transaction from the wallet by setting the deleted date to the current date/time.  Requires a valid account and transactionId.

- `GET` to `/wallet/get`, OperationId: `getOfferTransaction`:
Get Wallet Offer.


- `POST` to `/wallet/preview`, OperationId: `previewOfferTransaction`:
Preview Wallet Offers.
Preview the final cost of a transaction without charging the user

- `GET` to `/wallet/search`, OperationId: `searchOfferTransactions`:
Search Wallet Offers.
Search on active offers currently in the user&#39;s wallet, or past offers the user has already redeemed.

- `POST` to `/wallet/update`, OperationId: `updateOfferTransaction`:
Update Wallet Offer.
Update offer status. The status values are: 0 - not redeemable, 1 - redeemable.  Not redeemable means the customer has received the offer but has not decided to use (or print) it yet.  Until they choose to do this the merchant cannot redeem the offer (has not been given permission yet).   Redeemable means the customer has chosen to use the offer and wishes to redeem it.  Redeemed means the merchant has accepted the offer and the given the customer its value, then marked it a used in the system.  This status change is handled by a merchant end point.

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

-type class() :: 'wallet'.

-type operation_id() ::
    'createOfferTransaction' %% Create Wallet Offers
    | 'deleteOfferTransaction' %% Delete Wallet Offer
    | 'getOfferTransaction' %% Get Wallet Offer
    | 'previewOfferTransaction' %% Preview Wallet Offers
    | 'searchOfferTransactions' %% Search Wallet Offers
    | 'updateOfferTransaction'. %% Update Wallet Offer


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
allowed_methods(Req, #state{operation_id = 'createOfferTransaction'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteOfferTransaction'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getOfferTransaction'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'previewOfferTransaction'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchOfferTransactions'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateOfferTransaction'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createOfferTransaction'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteOfferTransaction'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getOfferTransaction'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'previewOfferTransaction'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchOfferTransactions'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateOfferTransaction'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createOfferTransaction'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteOfferTransaction'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getOfferTransaction'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'previewOfferTransaction'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchOfferTransactions'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateOfferTransaction'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createOfferTransaction'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteOfferTransaction'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getOfferTransaction'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'previewOfferTransaction'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchOfferTransactions'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateOfferTransaction'} = State) ->
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
    {Res, Req1, Context1} = Handler(wallet, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(wallet, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
