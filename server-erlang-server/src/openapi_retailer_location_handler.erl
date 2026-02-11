-module(openapi_retailer_location_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/location/create`, OperationId: `createRetailerLocationConsumer`:
Create Retailer Location (Consumer).
Creates a location record for an application that can support crowd sourced locations.

- `POST` to `/retailer/location/create`, OperationId: `createRetailerLocations`:
Create Retailer Location.
Creates a location record for a retailer. Only the owner and the employees of the retailer have access to do this.

- `POST` to `/retailer/location/delete`, OperationId: `deleteRetailerLocation`:
Delete Retailer Location.
Set the deleted timestamp to current time. This effectively deletes the retailer location since all queries should ignore any records with a deleted time stamp.

- `GET` to `/retailer/location/get`, OperationId: `getRetailerLocation`:
Get Retailer Location.
Gets a retailer location. Only the owner and the employees of the retailer have access to view its information.

- `GET` to `/location/get`, OperationId: `getRetailerLocationConsumer`:
Get Retailer Location (Consumer).
Gets the details of a retailer location as a consumer.

- `GET` to `/retailer/location/idistancesearch`, OperationId: `indexedRetailerLocationDistanceSearch`:
Distance Search Retailer Locations (Indexed).
Retailer location indexed search by distance. This searches on any retailer location with location data and returns the results sorted by distance.

- `GET` to `/retailer/location/isearch`, OperationId: `indexedRetailerLocationSearch`:
Keyword Search Retailer Locations (Indexed).
Retailer location (faster) indexed search. This searches all retailer locations.

- `GET` to `/retailer/location/search`, OperationId: `searchRetailerLocations`:
Search Retailer Locations (Owned).
Searches on retailer locations that the account has access to.

- `POST` to `/retailer/location/update`, OperationId: `updateRetailerLocations`:
Update Retailer Location.
Updates a location record for a retailer. Only the owner and the employees of the retailer have access to do this.

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

-type class() :: 'retailerLocation'.

-type operation_id() ::
    'createRetailerLocationConsumer' %% Create Retailer Location (Consumer)
    | 'createRetailerLocations' %% Create Retailer Location
    | 'deleteRetailerLocation' %% Delete Retailer Location
    | 'getRetailerLocation' %% Get Retailer Location
    | 'getRetailerLocationConsumer' %% Get Retailer Location (Consumer)
    | 'indexedRetailerLocationDistanceSearch' %% Distance Search Retailer Locations (Indexed)
    | 'indexedRetailerLocationSearch' %% Keyword Search Retailer Locations (Indexed)
    | 'searchRetailerLocations' %% Search Retailer Locations (Owned)
    | 'updateRetailerLocations'. %% Update Retailer Location


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
allowed_methods(Req, #state{operation_id = 'createRetailerLocationConsumer'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createRetailerLocations'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteRetailerLocation'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getRetailerLocation'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getRetailerLocationConsumer'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'indexedRetailerLocationDistanceSearch'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'indexedRetailerLocationSearch'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchRetailerLocations'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateRetailerLocations'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createRetailerLocationConsumer'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createRetailerLocations'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteRetailerLocation'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getRetailerLocation'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getRetailerLocationConsumer'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'indexedRetailerLocationDistanceSearch'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'indexedRetailerLocationSearch'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchRetailerLocations'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateRetailerLocations'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createRetailerLocationConsumer'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createRetailerLocations'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteRetailerLocation'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getRetailerLocation'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getRetailerLocationConsumer'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'indexedRetailerLocationDistanceSearch'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'indexedRetailerLocationSearch'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchRetailerLocations'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateRetailerLocations'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createRetailerLocationConsumer'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createRetailerLocations'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteRetailerLocation'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getRetailerLocation'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getRetailerLocationConsumer'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'indexedRetailerLocationDistanceSearch'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'indexedRetailerLocationSearch'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchRetailerLocations'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateRetailerLocations'} = State) ->
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
    {Res, Req1, Context1} = Handler(retailerLocation, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(retailerLocation, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
