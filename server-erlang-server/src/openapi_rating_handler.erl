-module(openapi_rating_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/rating/create`, OperationId: `createRating`:
Create Rating.
This is used to leave rating on a ratable object (i.e. retailer locations). Each user can only rate on a ratable object once per category. If a user rates on the same object and category, the previous rating will be overwritten. Leaving a rating on a ratable object will be visible to everyone who has access to view the object.

- `POST` to `/rating/delete`, OperationId: `deleteRating`:
Delete Rating.
Sets a rating as deleted.

- `GET` to `/location/rating/index/search`, OperationId: `searchLocationRatingIndexes`:
Search Location Rating Indexes.
Search for retailer locations by averages near you.

- `GET` to `/rating/index/search`, OperationId: `searchRatingIndexes`:
Search Rating Indexes.
Search for ratable items by averages.

- `GET` to `/rating/search`, OperationId: `searchRatings`:
Search Ratings.
Search for ratings on a ratable object.

- `POST` to `/rating/update`, OperationId: `updateRating`:
Update Rating.
Update an existing rating. Only the creator of the rating have permission to update.

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

-type class() :: 'rating'.

-type operation_id() ::
    'createRating' %% Create Rating
    | 'deleteRating' %% Delete Rating
    | 'searchLocationRatingIndexes' %% Search Location Rating Indexes
    | 'searchRatingIndexes' %% Search Rating Indexes
    | 'searchRatings' %% Search Ratings
    | 'updateRating'. %% Update Rating


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
allowed_methods(Req, #state{operation_id = 'createRating'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteRating'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchLocationRatingIndexes'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchRatingIndexes'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchRatings'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateRating'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createRating'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteRating'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchLocationRatingIndexes'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchRatingIndexes'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchRatings'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateRating'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createRating'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteRating'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchLocationRatingIndexes'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchRatingIndexes'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchRatings'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateRating'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createRating'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteRating'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchLocationRatingIndexes'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchRatingIndexes'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchRatings'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateRating'} = State) ->
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
    {Res, Req1, Context1} = Handler(rating, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(rating, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
