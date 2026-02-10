-module(openapi_offer_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/api/:version/retailer/offer/location/batchUpdate`, OperationId: `batchUpdateOfferLocations`:
Update Offer Locations.
Batch update offer locations.

- `POST` to `/api/:version/retailer/offer/create`, OperationId: `createOffer`:
Create Offer.
Create an offer and assign it to the provided retailer locations.

- `POST` to `/api/:version/retailer/offer/delete`, OperationId: `deleteOffer`:
Delete Offer.
Set the deleted timestamp to current time. This effectively deletes the offer since all queries should ignore any records with a deleted time stamp.

- `POST` to `/api/:version/retailer/offer/location/delete`, OperationId: `deleteOfferLocation`:
Delete Offer Location.
Set the deleted timestamp to current time. This effectively deletes the offer location since all queries should ignore any records with a deleted time stamp.

- `GET` to `/api/:version/retailer/offer/get`, OperationId: `getOffer`:
Get Offer.
Gets the details of an offer that the user has access to.

- `GET` to `/api/:version/offer/get`, OperationId: `getOfferDetails`:
Get Offer.
Gets offer or offer location details as a consumer.  Will check if it is a favorite if the deviceId/accountId is provided.  If the offerId is provided it will look up the main offer and ignore the the offerLocationId. If no offerId is provided then an offerLocationId must be specified.

- `GET` to `/api/:version/offer/lists/count`, OperationId: `getOfferListCounts`:
Get Offers (Counts).
Gets the offer list counts.

- `GET` to `/api/:version/offer/location/get`, OperationId: `getOfferLocation`:
Get Offer Location.
Gets the offer location by offer location id or udid (of a device)

- `GET` to `/api/:version/retailer/offer/location/search`, OperationId: `getOfferLocationsForRetailers`:
Search Offer Locations.
Searches on offer locations, which are records that represent an offer that has been assigned to a retailer location. If an offer does not have any locations assigned, then it will NOT be returned.

- `GET` to `/api/:version/retailer/offer/search`, OperationId: `getOffersForRetailers`:
Search Offers.
Searches on offers that the account has access to.

- `POST` to `/api/:version/retailer/offer/transaction/update`, OperationId: `redeemOfferTransaction`:
Update Offer Transaction.
Redeems an offer.

- `GET` to `/api/:version/retailer/offer/transaction/search`, OperationId: `searchOfferTransactionsForRetailers`:
Search Offer Transactions.
Searches on offer transactions for offers that the account has access to.

- `GET` to `/api/:version/offer/lists`, OperationId: `searchOffersForConsumer`:
Search Offers.
Searches for offers as a consumer.

- `GET` to `/api/:version/offer/top`, OperationId: `topOfferTransactions`:
Get Offers (Top).
Gets the top active offers.

- `POST` to `/api/:version/retailer/offer/update`, OperationId: `updateOffer`:
Update Offer.
Update an offer, must provide a current list of retailer locations or the current offer locations will be marked as deleted.

- `POST` to `/api/:version/retailer/offer/status`, OperationId: `updateOfferStatus`:
Activate Offer.
Sets the activated date on offers. This will make offers visible for consumers.

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

-type class() :: 'offer'.

-type operation_id() ::
    'batchUpdateOfferLocations' %% Update Offer Locations
    | 'createOffer' %% Create Offer
    | 'deleteOffer' %% Delete Offer
    | 'deleteOfferLocation' %% Delete Offer Location
    | 'getOffer' %% Get Offer
    | 'getOfferDetails' %% Get Offer
    | 'getOfferListCounts' %% Get Offers (Counts)
    | 'getOfferLocation' %% Get Offer Location
    | 'getOfferLocationsForRetailers' %% Search Offer Locations
    | 'getOffersForRetailers' %% Search Offers
    | 'redeemOfferTransaction' %% Update Offer Transaction
    | 'searchOfferTransactionsForRetailers' %% Search Offer Transactions
    | 'searchOffersForConsumer' %% Search Offers
    | 'topOfferTransactions' %% Get Offers (Top)
    | 'updateOffer' %% Update Offer
    | 'updateOfferStatus'. %% Activate Offer


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
allowed_methods(Req, #state{operation_id = 'batchUpdateOfferLocations'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createOffer'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteOffer'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteOfferLocation'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getOffer'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getOfferDetails'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getOfferListCounts'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getOfferLocation'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getOfferLocationsForRetailers'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getOffersForRetailers'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'redeemOfferTransaction'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchOfferTransactionsForRetailers'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchOffersForConsumer'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'topOfferTransactions'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateOffer'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateOfferStatus'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'batchUpdateOfferLocations'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createOffer'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteOffer'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteOfferLocation'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getOffer'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getOfferDetails'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getOfferListCounts'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getOfferLocation'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getOfferLocationsForRetailers'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getOffersForRetailers'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'redeemOfferTransaction'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchOfferTransactionsForRetailers'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchOffersForConsumer'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'topOfferTransactions'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateOffer'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateOfferStatus'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'batchUpdateOfferLocations'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createOffer'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteOffer'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteOfferLocation'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getOffer'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getOfferDetails'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getOfferListCounts'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getOfferLocation'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getOfferLocationsForRetailers'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getOffersForRetailers'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'redeemOfferTransaction'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchOfferTransactionsForRetailers'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchOffersForConsumer'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'topOfferTransactions'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateOffer'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateOfferStatus'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'batchUpdateOfferLocations'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createOffer'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteOffer'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteOfferLocation'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getOffer'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getOfferDetails'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getOfferListCounts'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getOfferLocation'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getOfferLocationsForRetailers'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getOffersForRetailers'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'redeemOfferTransaction'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchOfferTransactionsForRetailers'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchOffersForConsumer'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'topOfferTransactions'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateOffer'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateOfferStatus'} = State) ->
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
    {Res, Req1, Context1} = Handler(offer, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(offer, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
