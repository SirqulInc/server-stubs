-module(openapi_application_config_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/appconfig/create`, OperationId: `createApplicationConfig`:
Create AppConfig.
Creates a new application configuration. If the configVersion provided already exists for the given app, an invalid response is returned and the application configuration won&#39;t be created.

- `POST` to `/appconfig/delete`, OperationId: `deleteApplicationConfig`:
Delete AppConfig.
Mark the application configuration for deletion.

- `GET` to `/appconfig/get`, OperationId: `getApplicationConfig`:
Get AppConfig.
Gets the appConfig data by the given configId. If appConfig cannot be found, it returns an invalid response.

- `GET` to `/appconfig/getbyversion`, OperationId: `getApplicationConfigByConfigVersion`:
Get AppConfig by Version.
Gets the appConfig data by the given appKey and app configVersion number.If the appKey is is invalid or appConfig is not found, it returns an invalid response. 

- `GET` to `/appconfig/search`, OperationId: `searchApplicationConfig`:
Search AppConfigs.
Gets all versions of application configurations in a particular app by the given appKey.

- `POST` to `/appconfig/update`, OperationId: `updateApplicationConfig`:
Update AppConfig.
pdates an existing application configuration. If the configVersion provided already exists for the given app the application configuration won&#39;t be updated.

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

-type class() :: 'applicationConfig'.

-type operation_id() ::
    'createApplicationConfig' %% Create AppConfig
    | 'deleteApplicationConfig' %% Delete AppConfig
    | 'getApplicationConfig' %% Get AppConfig
    | 'getApplicationConfigByConfigVersion' %% Get AppConfig by Version
    | 'searchApplicationConfig' %% Search AppConfigs
    | 'updateApplicationConfig'. %% Update AppConfig


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
allowed_methods(Req, #state{operation_id = 'createApplicationConfig'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteApplicationConfig'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getApplicationConfig'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getApplicationConfigByConfigVersion'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchApplicationConfig'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateApplicationConfig'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createApplicationConfig'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteApplicationConfig'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getApplicationConfig'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getApplicationConfigByConfigVersion'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchApplicationConfig'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateApplicationConfig'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createApplicationConfig'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteApplicationConfig'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getApplicationConfig'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getApplicationConfigByConfigVersion'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchApplicationConfig'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateApplicationConfig'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createApplicationConfig'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteApplicationConfig'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getApplicationConfig'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getApplicationConfigByConfigVersion'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchApplicationConfig'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateApplicationConfig'} = State) ->
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
    {Res, Req1, Context1} = Handler(applicationConfig, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(applicationConfig, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
