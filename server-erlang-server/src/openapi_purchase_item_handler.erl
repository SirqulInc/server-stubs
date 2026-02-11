-module(openapi_purchase_item_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/purchase/create`, OperationId: `createPurchaseItem`:
Create Purchase.
Creates a purchase item for in app purchases

- `POST` to `/purchase/delete`, OperationId: `deletePurchaseItem`:
Delete Purchase.
Marks the purchase item as deleted

- `GET` to `/purchase/get`, OperationId: `getPurchaseItem`:
Get Purchase.
Get detailed information about a purchase item

- `GET` to `/purchase/search`, OperationId: `searchPurchaseItems`:
Search Purchases.
Search for purchasable items from the system

- `POST` to `/purchase/update`, OperationId: `updatePurchaseItem`:
Update Purchase.
Updates a purchase item for in app purchases

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

-type class() :: 'purchaseItem'.

-type operation_id() ::
    'createPurchaseItem' %% Create Purchase
    | 'deletePurchaseItem' %% Delete Purchase
    | 'getPurchaseItem' %% Get Purchase
    | 'searchPurchaseItems' %% Search Purchases
    | 'updatePurchaseItem'. %% Update Purchase


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
allowed_methods(Req, #state{operation_id = 'createPurchaseItem'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deletePurchaseItem'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getPurchaseItem'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchPurchaseItems'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updatePurchaseItem'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createPurchaseItem'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deletePurchaseItem'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getPurchaseItem'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchPurchaseItems'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updatePurchaseItem'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createPurchaseItem'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deletePurchaseItem'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getPurchaseItem'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchPurchaseItems'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updatePurchaseItem'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createPurchaseItem'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deletePurchaseItem'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getPurchaseItem'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchPurchaseItems'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updatePurchaseItem'} = State) ->
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
    {Res, Req1, Context1} = Handler(purchaseItem, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(purchaseItem, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
