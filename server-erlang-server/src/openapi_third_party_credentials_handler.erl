-module(openapi_third_party_credentials_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/thirdparty/credential/create`, OperationId: `createCredential`:
Create Credential.
This endpoint creates a third-party login for a Sirqul account. A third party login is a way for external systems (Third Party Networks) to link their own user accounts with a Sirqul account.   The thirdPartyId parameter is used to determine if the user already exists in Sirqul or not. This parameter needs to be unique for each user in the Third Party Network (identified by the networkUID parameter). Note that subsequent calls will update the user&#39;s third-party login credentials for the user with the same thirdPartyId and networkUID combination.    The thirdPartyToken parameter acts as a shared secret and used by client applications to log users into Sirqul without providing a Sirqul username and password. 

- `POST` to `/thirdparty/network/create`, OperationId: `createNetwork`:
Create Network.
Creates a custom third party network.

- `POST` to `/thirdparty/credential/delete`, OperationId: `deleteCredential`:
Delete Credential.
Delete a third party network on a Sirqul account.

- `POST` to `/thirdparty/network/delete`, OperationId: `deleteNetwork`:
Delete Network.
Marks a custom third party network as deleted. Only the network owners and managers have access to this.

- `POST` to `/thirdparty/credential/get`, OperationId: `getCredential`:
Get Credential.
Gets the account information given a third party token.

- `GET` to `/thirdparty/network/get`, OperationId: `getNetwork`:
Get Network.
Get the details of a third party network. Only the network owners and managers have access to this.

- `GET` to `/thirdparty/credential/search`, OperationId: `searchCredentials`:
Search Credentials.
Search on a user&#39;s linked third party networks.

- `GET` to `/thirdparty/network/search`, OperationId: `searchNetworks`:
Search Networks.
Search on supported third party networks and custom networks from external users.

- `POST` to `/thirdparty/credential/mfa/send`, OperationId: `sendMFAChallenge`:
Send MFA Challenge.
Sends an MFA challenge (SMS or Email) for networks with MFA enabled.

- `POST` to `/thirdparty/credential/update`, OperationId: `updateCredential`:
Update Credential.
Updates a third-party login for an account.

- `POST` to `/thirdparty/network/update`, OperationId: `updateNetwork`:
Update Network.
Updates a custom third party network. Only the network owners and managers have access to this.

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

-type class() :: 'thirdPartyCredentials'.

-type operation_id() ::
    'createCredential' %% Create Credential
    | 'createNetwork' %% Create Network
    | 'deleteCredential' %% Delete Credential
    | 'deleteNetwork' %% Delete Network
    | 'getCredential' %% Get Credential
    | 'getNetwork' %% Get Network
    | 'searchCredentials' %% Search Credentials
    | 'searchNetworks' %% Search Networks
    | 'sendMFAChallenge' %% Send MFA Challenge
    | 'updateCredential' %% Update Credential
    | 'updateNetwork'. %% Update Network


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
allowed_methods(Req, #state{operation_id = 'createCredential'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createNetwork'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteCredential'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteNetwork'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getCredential'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getNetwork'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchCredentials'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchNetworks'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'sendMFAChallenge'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateCredential'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateNetwork'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createCredential'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createNetwork'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteCredential'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteNetwork'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getCredential'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getNetwork'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchCredentials'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchNetworks'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'sendMFAChallenge'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateCredential'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateNetwork'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createCredential'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createNetwork'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteCredential'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteNetwork'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getCredential'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getNetwork'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchCredentials'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchNetworks'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'sendMFAChallenge'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateCredential'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateNetwork'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createCredential'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createNetwork'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteCredential'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteNetwork'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getCredential'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getNetwork'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchCredentials'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchNetworks'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'sendMFAChallenge'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateCredential'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateNetwork'} = State) ->
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
    {Res, Req1, Context1} = Handler(thirdPartyCredentials, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(thirdPartyCredentials, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
