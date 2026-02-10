-module(openapi_tournament_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/api/:version/tournament/create`, OperationId: `createTournament`:
Create Tournament.
Create a tournament.

- `POST` to `/api/:version/tournament/delete`, OperationId: `deleteTournament`:
Delete Tournament.
Delete a tournament.

- `GET` to `/api/:version/tournament/get`, OperationId: `getTournament`:
Get Tournament.
Get a tournament.

- `GET` to `/api/:version/tournament/object/search`, OperationId: `searchObjects`:
Search Tournament Objects.
Search on game objects of tournaments

- `GET` to `/api/:version/tournament/round/search`, OperationId: `searchRounds`:
Search Tournament Rounds.
Search for the user&#39;s tournament games.

- `GET` to `/api/:version/tournament/search`, OperationId: `searchTournaments`:
Search Tournaments.
Search for tournaments

- `POST` to `/api/:version/tournament/score`, OperationId: `submitTournamentScore`:
Submit Tournament Score.
Submit an array of scores for a tournament match. 

- `POST` to `/api/:version/tournament/vote`, OperationId: `submitTournamentVote`:
Submit a vote for a multi-stage album tournament..
Submit a vote for a multi-stage album tournament.

- `POST` to `/api/:version/tournament/substitute`, OperationId: `substituteTournamentPlayer`:
Substitute Tournament Player.
Service to replace the user&#39;s opponent in the current level - pack - mission with an AI account.

- `POST` to `/api/:version/tournament/update`, OperationId: `updateTournament`:
Update Tournament.
Update a tournament.

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

-type class() :: 'tournament'.

-type operation_id() ::
    'createTournament' %% Create Tournament
    | 'deleteTournament' %% Delete Tournament
    | 'getTournament' %% Get Tournament
    | 'searchObjects' %% Search Tournament Objects
    | 'searchRounds' %% Search Tournament Rounds
    | 'searchTournaments' %% Search Tournaments
    | 'submitTournamentScore' %% Submit Tournament Score
    | 'submitTournamentVote' %% Submit a vote for a multi-stage album tournament.
    | 'substituteTournamentPlayer' %% Substitute Tournament Player
    | 'updateTournament'. %% Update Tournament


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
allowed_methods(Req, #state{operation_id = 'createTournament'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteTournament'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getTournament'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchObjects'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchRounds'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchTournaments'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'submitTournamentScore'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'submitTournamentVote'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'substituteTournamentPlayer'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateTournament'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createTournament'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteTournament'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getTournament'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchObjects'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchRounds'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchTournaments'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'submitTournamentScore'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'submitTournamentVote'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'substituteTournamentPlayer'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateTournament'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createTournament'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteTournament'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getTournament'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchObjects'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchRounds'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchTournaments'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'submitTournamentScore'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'submitTournamentVote'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'substituteTournamentPlayer'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateTournament'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createTournament'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteTournament'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getTournament'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchObjects'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchRounds'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchTournaments'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'submitTournamentScore'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'submitTournamentVote'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'substituteTournamentPlayer'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateTournament'} = State) ->
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
    {Res, Req1, Context1} = Handler(tournament, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(tournament, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
