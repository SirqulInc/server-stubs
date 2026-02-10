-module(openapi_program_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/api/:version/program`, OperationId: `createProgram`:
Create Program.
Create a new program

- `DELETE` to `/api/:version/program/:id`, OperationId: `deleteProgram`:
Delete Program.
Delete an existing program

- `GET` to `/api/:version/program/:id`, OperationId: `getProgram`:
Get Program.
Get an existing program

- `POST` to `/api/:version/program/:id`, OperationId: `postProgram`:
Update Program.
Update an existing program

- `PUT` to `/api/:version/program/:id`, OperationId: `putProgram`:
Update Program.
Update an existing program

- `GET` to `/api/:version/program`, OperationId: `searchPrograms`:
Search Programs.
Search for programs

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

-type class() :: 'program'.

-type operation_id() ::
    'createProgram' %% Create Program
    | 'deleteProgram' %% Delete Program
    | 'getProgram' %% Get Program
    | 'postProgram' %% Update Program
    | 'putProgram' %% Update Program
    | 'searchPrograms'. %% Search Programs


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
allowed_methods(Req, #state{operation_id = 'createProgram'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteProgram'} = State) ->
    {[<<"DELETE">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getProgram'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postProgram'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'putProgram'} = State) ->
    {[<<"PUT">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchPrograms'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createProgram'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteProgram'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getProgram'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'postProgram'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'putProgram'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchPrograms'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createProgram'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteProgram'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getProgram'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postProgram'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'putProgram'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchPrograms'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createProgram'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteProgram'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getProgram'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'postProgram'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'putProgram'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchPrograms'} = State) ->
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
    {Res, Req1, Context1} = Handler(program, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(program, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
