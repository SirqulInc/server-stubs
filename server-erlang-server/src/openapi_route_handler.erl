-module(openapi_route_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/route/:routeId/approve`, OperationId: `approveRoute`:
Approve Route.
Approve a route

- `POST` to `/route/:routeId/copy`, OperationId: `copyRoute`:
Copy Route.
Make an copy of the given route with optional overriding properties

- `POST` to `/route`, OperationId: `createRoute`:
Create Route.
Create new route

- `PUT` to `/route/:routeId/directions`, OperationId: `createRouteDirections`:
Update Route Directions.
Regenerate the directions of a route

- `PUT` to `/route/:routeId/polyline`, OperationId: `createRoutePolyline`:
Create Route Polyline.
Update the polyline of the requested route

- `DELETE` to `/route/:routeId`, OperationId: `deleteRoute`:
Delete Route.
Delete an existing route

- `POST` to `/route/:routeId/disapprove`, OperationId: `disapproveRoute`:
Disapprove Route.
Disapprove a route

- `GET` to `/route/:routeId`, OperationId: `getRoute`:
Get Route.
Get an existing route

- `GET` to `/route/:routeId/directions`, OperationId: `getRouteDirections`:
Get Route Directions.
Get the directions of a route

- `GET` to `/route/:routeId/shipments`, OperationId: `getRouteShipments`:
Get Route Shipments.
Get the shipments on the requested route

- `GET` to `/route/:routeId/stop/:stopId`, OperationId: `getRouteStop`:
Get Route Stop.
Get the specific stop on a route

- `GET` to `/route/:routeId/stops`, OperationId: `getRouteStops`:
Get Route Stops.
The stops of the route requested

- `GET` to `/route/:routeId/stop/:stopId/shipments`, OperationId: `getShipmentsAtStop`:
Get Shipments At Stop.
Get the list of shipments on the requested route at a stop

- `POST` to `/route/:routeId/optimize`, OperationId: `optimizeRoute`:
Optimize Route.
Optimize a route. The optimization method based on how the server is configured.

- `DELETE` to `/route/:routeId/stop/:stopId`, OperationId: `removeStop`:
Delete Stop.
Delete a stop on a route

- `PATCH` to `/route/:routeId/stops/reorder`, OperationId: `reorderRouteStopsPatch`:
Reorder Route Stops.
Reordering the stops on the route with and update route distance, time, direction, and polyline

- `POST` to `/route/:routeId/stops/reorder`, OperationId: `reorderRouteStopsPost`:
Reorder Route Stops.
Reordering the stops on the route with and update route distance, time, direction, and polyline

- `GET` to `/route`, OperationId: `searchRoutes`:
Search Routes.
Search for routes.

- `POST` to `/route/:id/driver/:driverId`, OperationId: `setDriver`:
Set Driver.
Update the driver of the route.

- `PUT` to `/route/:routeId`, OperationId: `updateRoute`:
Update Route.
Update an existing route

- `PUT` to `/route/:routeId/stop/:stopId`, OperationId: `updateRouteStop`:
Update Route Stop.
Update a stop on a specified route

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

-type class() :: 'route'.

-type operation_id() ::
    'approveRoute' %% Approve Route
    | 'copyRoute' %% Copy Route
    | 'createRoute' %% Create Route
    | 'createRouteDirections' %% Update Route Directions
    | 'createRoutePolyline' %% Create Route Polyline
    | 'deleteRoute' %% Delete Route
    | 'disapproveRoute' %% Disapprove Route
    | 'getRoute' %% Get Route
    | 'getRouteDirections' %% Get Route Directions
    | 'getRouteShipments' %% Get Route Shipments
    | 'getRouteStop' %% Get Route Stop
    | 'getRouteStops' %% Get Route Stops
    | 'getShipmentsAtStop' %% Get Shipments At Stop
    | 'optimizeRoute' %% Optimize Route
    | 'removeStop' %% Delete Stop
    | 'reorderRouteStopsPatch' %% Reorder Route Stops
    | 'reorderRouteStopsPost' %% Reorder Route Stops
    | 'searchRoutes' %% Search Routes
    | 'setDriver' %% Set Driver
    | 'updateRoute' %% Update Route
    | 'updateRouteStop'. %% Update Route Stop


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
allowed_methods(Req, #state{operation_id = 'approveRoute'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'copyRoute'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createRoute'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createRouteDirections'} = State) ->
    {[<<"PUT">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createRoutePolyline'} = State) ->
    {[<<"PUT">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteRoute'} = State) ->
    {[<<"DELETE">>], Req, State};
allowed_methods(Req, #state{operation_id = 'disapproveRoute'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getRoute'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getRouteDirections'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getRouteShipments'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getRouteStop'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getRouteStops'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getShipmentsAtStop'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'optimizeRoute'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'removeStop'} = State) ->
    {[<<"DELETE">>], Req, State};
allowed_methods(Req, #state{operation_id = 'reorderRouteStopsPatch'} = State) ->
    {[<<"PATCH">>], Req, State};
allowed_methods(Req, #state{operation_id = 'reorderRouteStopsPost'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchRoutes'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'setDriver'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateRoute'} = State) ->
    {[<<"PUT">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateRouteStop'} = State) ->
    {[<<"PUT">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'approveRoute'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'copyRoute'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createRoute'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createRouteDirections'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createRoutePolyline'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteRoute'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'disapproveRoute'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getRoute'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getRouteDirections'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getRouteShipments'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getRouteStop'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getRouteStops'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getShipmentsAtStop'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'optimizeRoute'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'removeStop'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'reorderRouteStopsPatch'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'reorderRouteStopsPost'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchRoutes'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'setDriver'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateRoute'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateRouteStop'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'approveRoute'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'copyRoute'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createRoute'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createRouteDirections'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createRoutePolyline'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteRoute'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'disapproveRoute'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getRoute'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getRouteDirections'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getRouteShipments'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getRouteStop'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getRouteStops'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getShipmentsAtStop'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'optimizeRoute'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'removeStop'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'reorderRouteStopsPatch'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'reorderRouteStopsPost'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchRoutes'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'setDriver'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateRoute'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateRouteStop'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'approveRoute'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'copyRoute'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createRoute'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createRouteDirections'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createRoutePolyline'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteRoute'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'disapproveRoute'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getRoute'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getRouteDirections'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getRouteShipments'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getRouteStop'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getRouteStops'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getShipmentsAtStop'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'optimizeRoute'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'removeStop'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'reorderRouteStopsPatch'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'reorderRouteStopsPost'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchRoutes'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'setDriver'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'updateRoute'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateRouteStop'} = State) ->
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
    {Res, Req1, Context1} = Handler(route, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(route, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
