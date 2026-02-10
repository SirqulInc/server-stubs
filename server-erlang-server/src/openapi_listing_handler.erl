-module(openapi_listing_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/api/:version/listing/create`, OperationId: `createListing`:
Create Listing.
Creates a listing.

- `POST` to `/api/:version/listing/delete`, OperationId: `deleteListing`:
Delete Listing.
Delete a listing.

- `GET` to `/api/:version/listing/get`, OperationId: `getListing`:
Get Listing.
Get a listing by id.

- `GET` to `/api/:version/listing/search`, OperationId: `searchListing`:
Search Listings.
Search for event listings from the start time to end time

- `GET` to `/api/:version/listing/summary`, OperationId: `summaryListing`:
Summary Listing.
Search for a list of summary listings from the start time up to 8 days out.

- `POST` to `/api/:version/listing/update`, OperationId: `updateListing`:
Update Listing.
Updates a listing.

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

-type class() :: 'listing'.

-type operation_id() ::
    'createListing' %% Create Listing
    | 'deleteListing' %% Delete Listing
    | 'getListing' %% Get Listing
    | 'searchListing' %% Search Listings
    | 'summaryListing' %% Summary Listing
    | 'updateListing'. %% Update Listing


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
allowed_methods(Req, #state{operation_id = 'createListing'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteListing'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getListing'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchListing'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'summaryListing'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateListing'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createListing'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteListing'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getListing'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchListing'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'summaryListing'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateListing'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createListing'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteListing'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getListing'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchListing'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'summaryListing'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateListing'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createListing'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteListing'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getListing'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchListing'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'summaryListing'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateListing'} = State) ->
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
    {Res, Req1, Context1} = Handler(listing, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(listing, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
