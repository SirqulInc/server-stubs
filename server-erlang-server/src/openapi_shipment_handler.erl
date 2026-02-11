-module(openapi_shipment_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/shipment/:id/cancel`, OperationId: `cancelShipment`:
Cancel Shipment.
Remove shipment from route

- `POST` to `/shipment`, OperationId: `createShipment`:
Create Shipment.
Create new shipment

- `DELETE` to `/shipment/:id`, OperationId: `deleteShipment`:
Delete Shipment.
Delete an existing shipment

- `GET` to `/shipment/:id`, OperationId: `getShipment`:
Get Shipment.
Get an existing shipment

- `GET` to `/shipment`, OperationId: `searchShipments`:
Search Shipments.
Search for shipments

- `PUT` to `/shipment/:id`, OperationId: `updateShipment`:
Update Shipment.
Update an existing shipment

- `POST` to `/shipment/:id/status`, OperationId: `updateShipmentStatus`:
Uupdate Shipment Status.
Update status of an existing shipment

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

-type class() :: 'shipment'.

-type operation_id() ::
    'cancelShipment' %% Cancel Shipment
    | 'createShipment' %% Create Shipment
    | 'deleteShipment' %% Delete Shipment
    | 'getShipment' %% Get Shipment
    | 'searchShipments' %% Search Shipments
    | 'updateShipment' %% Update Shipment
    | 'updateShipmentStatus'. %% Uupdate Shipment Status


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
allowed_methods(Req, #state{operation_id = 'cancelShipment'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createShipment'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteShipment'} = State) ->
    {[<<"DELETE">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getShipment'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchShipments'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateShipment'} = State) ->
    {[<<"PUT">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateShipmentStatus'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'cancelShipment'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createShipment'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteShipment'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getShipment'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchShipments'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateShipment'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateShipmentStatus'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'cancelShipment'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createShipment'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteShipment'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getShipment'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchShipments'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateShipment'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateShipmentStatus'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'cancelShipment'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'createShipment'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteShipment'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getShipment'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchShipments'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateShipment'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateShipmentStatus'} = State) ->
    {[], Req, State};
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
    {Res, Req1, Context1} = Handler(shipment, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(shipment, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
