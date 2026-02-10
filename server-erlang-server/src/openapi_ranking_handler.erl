-module(openapi_ranking_handler).
-moduledoc """
Exposes the following operation IDs:

- `GET` to `/api/:version/ranking/historical/search`, OperationId: `getHistoricalRankings`:
Search Historical Rankings.
Get historical leaderboard rankings by time-frame.

- `GET` to `/api/:version/ranking/search`, OperationId: `getRankings`:
Search Rankings.
Get leader board rankings. This is an all in one endpoint that can return multiple ranking types and also the current user rank.

- `POST` to `/api/:version/ranking/personal/ranks`, OperationId: `getUserRank`:
Get Personal Rankings.
Returns the user&#39;s ranks for one or more rank types and modes.

- `POST` to `/api/:version/ranking/override`, OperationId: `overrideUserRank`:
Override User Rank.
Allows an admin of an application to override a user&#39;s scores for a leaderboard.

- `POST` to `/api/:version/ranking/update`, OperationId: `updateRankings`:
Update Ranking.
Update the rank value 

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

-type class() :: 'ranking'.

-type operation_id() ::
    'getHistoricalRankings' %% Search Historical Rankings
    | 'getRankings' %% Search Rankings
    | 'getUserRank' %% Get Personal Rankings
    | 'overrideUserRank' %% Override User Rank
    | 'updateRankings'. %% Update Ranking


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
allowed_methods(Req, #state{operation_id = 'getHistoricalRankings'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getRankings'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getUserRank'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'overrideUserRank'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateRankings'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'getHistoricalRankings'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getRankings'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getUserRank'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'overrideUserRank'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateRankings'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'getHistoricalRankings'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getRankings'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getUserRank'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'overrideUserRank'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateRankings'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'getHistoricalRankings'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getRankings'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getUserRank'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'overrideUserRank'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateRankings'} = State) ->
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
    {Res, Req1, Context1} = Handler(ranking, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(ranking, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
