-module(openapi_application_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/application/create`, OperationId: `createApplication`:
Create Application.
Create an application record and one placement record for that application. You can create more placements for this application by using {@link createApplicationPlacement}.

- `POST` to `/application/placement/create`, OperationId: `createApplicationPlacement`:
Create Ad Placement.
Creates a new ad placement for an application.

- `POST` to `/application/delete`, OperationId: `deleteApplication`:
Delete Application.
Set the deleted timestamp to current time. This effectively deletes the application since all queries should ignore any records with a deleted timestamp

- `POST` to `/application/placement/delete`, OperationId: `deleteApplicationPlacement`:
Delete Ad Placement.
Deletes an ad placement for an application.

- `GET` to `/application/get`, OperationId: `getApplication`:
Get Application.
Get a specific application by appKey

- `GET` to `/application/placement/get`, OperationId: `getApplicationPlacement`:
Get Ad Placement.
Get details of an ad placement

- `GET` to `/application/versions`, OperationId: `getApplicationVersions`:
Get API versions.
Will return a comma separated list of numbers, newest first. For example: 3.0, 2.2, 2.1, 1.8

- `GET` to `/application/users`, OperationId: `getUniqueUsersByApp`:
Search Application Users.
Get a list of users per application

- `GET` to `/application/list`, OperationId: `listApplications`:
List Applications.
List active applications matching the criteria (as a consumer)

- `GET` to `/application/placement/search`, OperationId: `searchApplicationPlacement`:
Search for Ad Placements.
Searches placements for an application.

- `GET` to `/application/settings/search`, OperationId: `searchApplicationSettings`:
Search for Application Settings.
Returns a list of applications that the user has logged into before, and returns specific settings for that application and user

- `GET` to `/application/search`, OperationId: `searchApplications`:
Search Applications.
Search for applications matching the criteria that the logged in user has access to

- `POST` to `/application/update`, OperationId: `updateApplication`:
Update Application.
Update an application record

- `POST` to `/application/active`, OperationId: `updateApplicationActive`:
Change Appliation Status.
Set the application&#39;s active flag to true/false. This effectively activates or deactivates the application.

- `POST` to `/application/placement/update`, OperationId: `updateApplicationPlacement`:
Update Ad Placement.
Updates an ad placement for an application.

- `POST` to `/application/certificate/create`, OperationId: `uploadApplicationCertificate`:
Create Application Certificate.
Uploads a certificate for an application that the user has access to.

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

-type class() :: 'application'.

-type operation_id() ::
    'createApplication' %% Create Application
    | 'createApplicationPlacement' %% Create Ad Placement
    | 'deleteApplication' %% Delete Application
    | 'deleteApplicationPlacement' %% Delete Ad Placement
    | 'getApplication' %% Get Application
    | 'getApplicationPlacement' %% Get Ad Placement
    | 'getApplicationVersions' %% Get API versions
    | 'getUniqueUsersByApp' %% Search Application Users
    | 'listApplications' %% List Applications
    | 'searchApplicationPlacement' %% Search for Ad Placements
    | 'searchApplicationSettings' %% Search for Application Settings
    | 'searchApplications' %% Search Applications
    | 'updateApplication' %% Update Application
    | 'updateApplicationActive' %% Change Appliation Status
    | 'updateApplicationPlacement' %% Update Ad Placement
    | 'uploadApplicationCertificate'. %% Create Application Certificate


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
allowed_methods(Req, #state{operation_id = 'createApplication'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createApplicationPlacement'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteApplication'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteApplicationPlacement'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getApplication'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getApplicationPlacement'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getApplicationVersions'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getUniqueUsersByApp'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'listApplications'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchApplicationPlacement'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchApplicationSettings'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchApplications'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateApplication'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateApplicationActive'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateApplicationPlacement'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'uploadApplicationCertificate'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createApplication'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createApplicationPlacement'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteApplication'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteApplicationPlacement'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getApplication'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getApplicationPlacement'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getApplicationVersions'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getUniqueUsersByApp'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'listApplications'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchApplicationPlacement'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchApplicationSettings'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchApplications'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateApplication'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateApplicationActive'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateApplicationPlacement'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'uploadApplicationCertificate'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createApplication'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createApplicationPlacement'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteApplication'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteApplicationPlacement'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getApplication'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getApplicationPlacement'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getApplicationVersions'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getUniqueUsersByApp'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'listApplications'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchApplicationPlacement'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchApplicationSettings'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchApplications'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateApplication'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateApplicationActive'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateApplicationPlacement'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'uploadApplicationCertificate'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createApplication'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createApplicationPlacement'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteApplication'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteApplicationPlacement'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getApplication'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getApplicationPlacement'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getApplicationVersions'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getUniqueUsersByApp'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'listApplications'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchApplicationPlacement'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchApplicationSettings'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchApplications'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateApplication'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateApplicationActive'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateApplicationPlacement'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'uploadApplicationCertificate'} = State) ->
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
    {Res, Req1, Context1} = Handler(application, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(application, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
