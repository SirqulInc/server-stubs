-module(openapi_amqp_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/api/:version/queue/consumer/create`, OperationId: `consumerCreate`:
Create Consumer.
Create a connection to an existing amqp queue and register as a consumer.

- `POST` to `/api/:version/queue/consumer/update`, OperationId: `consumerUpdate`:
Update Consumer.
Update an existing amqp queue&#39;s data mapping.

- `POST` to `/api/:version/queue/create`, OperationId: `queueCreate`:
Create Queue.
Create a basic AMQP queue. If the username and password and virtual host is not sepcified, the queue will be created on the virtual host assigned to the application.

- `POST` to `/api/:version/queue/delete`, OperationId: `queueDelete`:
Delete Queue.
Delete the stored queue record and close any active connections to the AMQP servers.

- `GET` to `/api/:version/queue/get`, OperationId: `queueGet`:
Get Queue.
Get the stored queue record. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record.

- `POST` to `/api/:version/queue/publish`, OperationId: `queuePublish`:
Publish Queue.
Publish a message to a stored queue. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record.

- `GET` to `/api/:version/queue/search`, OperationId: `queueSearch`:
Search Queue.
Get the queues setup for the BillableEntity&#39;s applications.

- `POST` to `/api/:version/queue/update`, OperationId: `queueUpdate`:
Update Queue.
Update the basic AMQP queue.

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

-type class() :: 'aMQP'.

-type operation_id() ::
    'consumerCreate' %% Create Consumer
    | 'consumerUpdate' %% Update Consumer
    | 'queueCreate' %% Create Queue
    | 'queueDelete' %% Delete Queue
    | 'queueGet' %% Get Queue
    | 'queuePublish' %% Publish Queue
    | 'queueSearch' %% Search Queue
    | 'queueUpdate'. %% Update Queue


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
allowed_methods(Req, #state{operation_id = 'consumerCreate'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'consumerUpdate'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'queueCreate'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'queueDelete'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'queueGet'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'queuePublish'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'queueSearch'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'queueUpdate'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'consumerCreate'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'consumerUpdate'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'queueCreate'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'queueDelete'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'queueGet'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'queuePublish'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'queueSearch'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'queueUpdate'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'consumerCreate'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'consumerUpdate'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'queueCreate'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'queueDelete'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'queueGet'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'queuePublish'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'queueSearch'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'queueUpdate'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'consumerCreate'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'consumerUpdate'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'queueCreate'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'queueDelete'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'queueGet'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'queuePublish'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'queueSearch'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'queueUpdate'} = State) ->
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
    {Res, Req1, Context1} = Handler(aMQP, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(aMQP, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
