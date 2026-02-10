-module(openapi_scheduled_notification_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/api/:version/notification/schedule/create`, OperationId: `createScheduledNotification`:
Create Scheduled Notification.
This endpoint creates a Scheduled Notification message that can be configured to process and send periodically at set time periods

- `POST` to `/api/:version/notification/schedule/delete`, OperationId: `deleteScheduledNotification`:
Delete Scheduled Notification.
This endpoint deletes a Scheduled Notification. Only the original owner of the Scheduled Notification or someone with write permissions can use this endpoint. Permissions can be granted to other users by using the UserPermissionsApi.

- `GET` to `/api/:version/notification/schedule/get`, OperationId: `getScheduledNotification`:
Get Scheduled Notification.
Get a ScheduledNotification

- `POST` to `/api/:version/notification/schedule/generate`, OperationId: `scheduleNotificationListings`:
Generate Schedule Notifications.
Use a report to identify events that are starting soon and then create a scheduled notification to push a message to matching users.

- `GET` to `/api/:version/notification/schedule/search`, OperationId: `searchScheduledNotifications`:
Search Scheduled Notifications.
This endpoint searches on Scheduled Notifications. If a scheduled notification was created with the visibility parameter set to PUBLIC, then anyone can search on it if the filter parameter includes the PUBLIC value. PRIVATE visibility means that it can only be searched on by the owner or if it has been shared to the user using the UserPermissionsApi.  In addition, if a PUBLIC Scheduled Notification was created for an application that requires content approval (using the publicContentApproval parameter), then an administrator of the application needs to approve it before it can be search on by other users. Before this happens, it is in a PENDING state, and only the original creator or the owner of the application can search and see it. Also, only the owner of the application can use the UserPermissionsApi to approve or reject it. Scheduled notifications that have been rejected are only visible to the original creators.

- `POST` to `/api/:version/notification/schedule/update`, OperationId: `updateScheduledNotification`:
Update Scheduled Notification.
This endpoint updates a Scheduled Notification message that can be configured to process and send periodically at set time periods. Please see createScheduledNotification for more details.  Only the original owner of the Scheduled Notification or someone with write permissions can use this endpoint. Permissions can be granted to other users by using theUserPermissionsApi.

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

-type class() :: 'scheduledNotification'.

-type operation_id() ::
    'createScheduledNotification' %% Create Scheduled Notification
    | 'deleteScheduledNotification' %% Delete Scheduled Notification
    | 'getScheduledNotification' %% Get Scheduled Notification
    | 'scheduleNotificationListings' %% Generate Schedule Notifications
    | 'searchScheduledNotifications' %% Search Scheduled Notifications
    | 'updateScheduledNotification'. %% Update Scheduled Notification


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
allowed_methods(Req, #state{operation_id = 'createScheduledNotification'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteScheduledNotification'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getScheduledNotification'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'scheduleNotificationListings'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchScheduledNotifications'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateScheduledNotification'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createScheduledNotification'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteScheduledNotification'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getScheduledNotification'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'scheduleNotificationListings'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchScheduledNotifications'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateScheduledNotification'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createScheduledNotification'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteScheduledNotification'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getScheduledNotification'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'scheduleNotificationListings'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchScheduledNotifications'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateScheduledNotification'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createScheduledNotification'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteScheduledNotification'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getScheduledNotification'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'scheduleNotificationListings'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchScheduledNotifications'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateScheduledNotification'} = State) ->
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
    {Res, Req1, Context1} = Handler(scheduledNotification, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(scheduledNotification, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
