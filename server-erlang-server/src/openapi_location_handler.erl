-module(openapi_location_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/location/trilaterate/cache`, OperationId: `cacheTrilaterationData`:
Create Trilateration Data with File.
Creates trilateration samples for a source device (i.e. a router).

- `POST` to `/location/trilaterate/cache/submit`, OperationId: `cacheTrilaterationDataGzip`:
Create Trilateration Data with Rest.
Creates trilateration samples for a source device (i.e. a router).

- `GET` to `/location/ip`, OperationId: `getLocationByIp`:
Get Location by IP.
Get location information based on an IP address.

- `GET` to `/account/location/trilaterate`, OperationId: `getLocationByTrilateration`:
Get Location by Trilateration.
Send in device data and calculate a position based on signal strengths.

- `GET` to `/location/search`, OperationId: `getLocations`:
Search Regions or Postal Codes.
Searches geographic locations by proximity via address or keyword.

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

-type class() :: 'location'.

-type operation_id() ::
    'cacheTrilaterationData' %% Create Trilateration Data with File
    | 'cacheTrilaterationDataGzip' %% Create Trilateration Data with Rest
    | 'getLocationByIp' %% Get Location by IP
    | 'getLocationByTrilateration' %% Get Location by Trilateration
    | 'getLocations'. %% Search Regions or Postal Codes


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
allowed_methods(Req, #state{operation_id = 'cacheTrilaterationData'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'cacheTrilaterationDataGzip'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getLocationByIp'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getLocationByTrilateration'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getLocations'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'cacheTrilaterationData'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'cacheTrilaterationDataGzip'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getLocationByIp'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getLocationByTrilateration'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getLocations'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'cacheTrilaterationData'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'cacheTrilaterationDataGzip'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getLocationByIp'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getLocationByTrilateration'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getLocations'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'cacheTrilaterationData'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'cacheTrilaterationDataGzip'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getLocationByIp'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getLocationByTrilateration'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getLocations'} = State) ->
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
    {Res, Req1, Context1} = Handler(location, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(location, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
