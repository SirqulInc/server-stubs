-module(openapi_trip_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/api/:version/trip`, OperationId: `createTrip`:
Create Trip.
Create a new trip

- `DELETE` to `/api/:version/trip/:id`, OperationId: `delete`:
Delete Trip.
Delete an existing trip

- `POST` to `/api/:version/trip/:id/drive`, OperationId: `driveTrip`:
Set Trip Preference Driver.
Update trip preference to drive, also create a route and assign the trip to the route

- `POST` to `/api/:version/trip/:id/flexible`, OperationId: `flexibleTrip`:
Set Trip Preference Flexible.
Update trip preference to flexible.

- `GET` to `/api/:version/trip/:id`, OperationId: `getTrip`:
Get Trip.
Get an existing trip

- `GET` to `/api/:version/trip/:id/match`, OperationId: `getTripMatches`:
Get Trip Matches.
Get matching trips of specific trip

- `POST` to `/api/:version/trip/match/process`, OperationId: `processTripMatches`:
Process Trip Matches.
Process trip matching, assign trips with no route to matched trips with route.

- `POST` to `/api/:version/trip/:id/ride`, OperationId: `ride`:
Set Trip Preference Rider.
Update trip preference to ride.

- `GET` to `/api/:version/trip`, OperationId: `search`:
Search Trips.
Search for trips

- `GET` to `/api/:version/trip/match`, OperationId: `searchTrips`:
Search Trips.
Search for trips with matching information.

- `POST` to `/api/:version/trip/:id/locations`, OperationId: `updateLocations`:
Update Trip Locations.


- `POST` to `/api/:version/trip/:id/locations/recurrence`, OperationId: `updateRecurrenceLocations`:
Update Recurrence Locations.


- `POST` to `/api/:version/trip/:id/shipments/recurrence`, OperationId: `updateRecurrenceShipments`:
Update Recurrence Shipments.


- `POST` to `/api/:version/trip/:id/shipments`, OperationId: `updateShipments`:
Update Trip Shipments.


- `PUT` to `/api/:version/trip/:id`, OperationId: `updateTrip`:
Update Trip.
Update an existing trip. Does not support recurring trip update.

- `POST` to `/api/:version/trip/notifications`, OperationId: `updateTripNotifications`:
Trip Notifications.
Update the trip notifications

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

-type class() :: 'trip'.

-type operation_id() ::
    'createTrip' %% Create Trip
    | 'delete' %% Delete Trip
    | 'driveTrip' %% Set Trip Preference Driver
    | 'flexibleTrip' %% Set Trip Preference Flexible
    | 'getTrip' %% Get Trip
    | 'getTripMatches' %% Get Trip Matches
    | 'processTripMatches' %% Process Trip Matches
    | 'ride' %% Set Trip Preference Rider
    | 'search' %% Search Trips
    | 'searchTrips' %% Search Trips
    | 'updateLocations' %% Update Trip Locations
    | 'updateRecurrenceLocations' %% Update Recurrence Locations
    | 'updateRecurrenceShipments' %% Update Recurrence Shipments
    | 'updateShipments' %% Update Trip Shipments
    | 'updateTrip' %% Update Trip
    | 'updateTripNotifications'. %% Trip Notifications


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
allowed_methods(Req, #state{operation_id = 'createTrip'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'delete'} = State) ->
    {[<<"DELETE">>], Req, State};
allowed_methods(Req, #state{operation_id = 'driveTrip'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'flexibleTrip'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getTrip'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getTripMatches'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'processTripMatches'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'ride'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'search'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchTrips'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateLocations'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateRecurrenceLocations'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateRecurrenceShipments'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateShipments'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateTrip'} = State) ->
    {[<<"PUT">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateTripNotifications'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createTrip'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'delete'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'driveTrip'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'flexibleTrip'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getTrip'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getTripMatches'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'processTripMatches'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'ride'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'search'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchTrips'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateLocations'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateRecurrenceLocations'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateRecurrenceShipments'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateShipments'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateTrip'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateTripNotifications'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createTrip'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'delete'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'driveTrip'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'flexibleTrip'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getTrip'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getTripMatches'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'processTripMatches'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'ride'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'search'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchTrips'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateLocations'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateRecurrenceLocations'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateRecurrenceShipments'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateShipments'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateTrip'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateTripNotifications'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createTrip'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'delete'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'driveTrip'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'flexibleTrip'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getTrip'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getTripMatches'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'processTripMatches'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'ride'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'search'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchTrips'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateLocations'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateRecurrenceLocations'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateRecurrenceShipments'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateShipments'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateTrip'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateTripNotifications'} = State) ->
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
    {Res, Req1, Context1} = Handler(trip, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(trip, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
