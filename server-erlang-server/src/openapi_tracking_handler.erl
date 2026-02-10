-module(openapi_tracking_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/api/:version/tracking/batch/create`, OperationId: `batchSaveTracking`:
Create Batch Tracking.
Batch create tracking legs

- `GET` to `/api/:version/tracking/predicted/get`, OperationId: `getPredictedLocations`:
Get Predicted Locations.
Get the predicted location for a customer based on previous behavior.  If a customer resides in a place for a period of time this is marked as a preferred location.  We look back over the previous few days and the previous days of the week from the day specified.  If for instance the day was a Wednesday then this would check the days before, including: Tuesday, Monday, Sunday, etc. It will also check some number of previous Wednesdays in the past few weeks.

- `GET` to `/api/:version/tracking/path/get`, OperationId: `getPredictedPath`:
Get Tracking Path.
Get the path (lat/long coordinates) between 2 steps previously logged for a customer.

- `GET` to `/api/:version/tracking/preferred/search`, OperationId: `getPreferredLocations`:
Search Preferred Locations.
Search on preferred locations for a user, which is created when a customer resides in a place for a period of time.

- `GET` to `/api/:version/tracking/search`, OperationId: `getTrackingLegs`:
Search Tracking.
Retrieve tracking data to be able to show where a user has been.

- `POST` to `/api/:version/tracking/leg/create`, OperationId: `saveTrackingLeg`:
Create Tracking Leg.
Send tracking points to be able to generate pathing data

- `POST` to `/api/:version/tracking/step/create`, OperationId: `saveTrackingStep`:
Create Tracking Step.
Send tracking points to be able to generate pathing data

- `GET` to `/api/:version/tracking/list`, OperationId: `searchAccountsWithTrackingLegs`:
List Tracking.
Search for all accounts that have tracking legs data by the given constraints.

- `GET` to `/api/:version/tracking/searchByBillable`, OperationId: `searchTrackingLegs`:
Search Tracking (Billable).
Retrieve tracking data for billable/account scoped queries.

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

-type class() :: 'tracking'.

-type operation_id() ::
    'batchSaveTracking' %% Create Batch Tracking
    | 'getPredictedLocations' %% Get Predicted Locations
    | 'getPredictedPath' %% Get Tracking Path
    | 'getPreferredLocations' %% Search Preferred Locations
    | 'getTrackingLegs' %% Search Tracking
    | 'saveTrackingLeg' %% Create Tracking Leg
    | 'saveTrackingStep' %% Create Tracking Step
    | 'searchAccountsWithTrackingLegs' %% List Tracking
    | 'searchTrackingLegs'. %% Search Tracking (Billable)


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
allowed_methods(Req, #state{operation_id = 'batchSaveTracking'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getPredictedLocations'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getPredictedPath'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getPreferredLocations'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getTrackingLegs'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'saveTrackingLeg'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'saveTrackingStep'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchAccountsWithTrackingLegs'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchTrackingLegs'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'batchSaveTracking'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getPredictedLocations'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getPredictedPath'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getPreferredLocations'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getTrackingLegs'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'saveTrackingLeg'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'saveTrackingStep'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchAccountsWithTrackingLegs'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchTrackingLegs'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'batchSaveTracking'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getPredictedLocations'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getPredictedPath'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getPreferredLocations'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getTrackingLegs'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'saveTrackingLeg'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'saveTrackingStep'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchAccountsWithTrackingLegs'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchTrackingLegs'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'batchSaveTracking'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getPredictedLocations'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getPredictedPath'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getPreferredLocations'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getTrackingLegs'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'saveTrackingLeg'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'saveTrackingStep'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchAccountsWithTrackingLegs'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchTrackingLegs'} = State) ->
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
    {Res, Req1, Context1} = Handler(tracking, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(tracking, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
