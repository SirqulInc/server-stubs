-module(openapi_notification_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/notification/template/create`, OperationId: `createNotificationTemplate`:
Create Notification Template.
Create a notification template. Developers will only be able to create notification templates for their own applications.

- `POST` to `/notification/blocked/batch`, OperationId: `createOrUpdateBlockedNotifications`:
Create or update blocked notification settings.
Create or update blocked notification settings

- `POST` to `/notification/template/delete`, OperationId: `deleteNotificationTemplate`:
Delete Notification Template.
Deletes a notification template. Developers will only be able to delete notification templates for their own applications.

- `GET` to `/notification/template/get`, OperationId: `getNotificationTemplate`:
Get Notification Template.
Get the details of a notification template. Developers will only be able to see notification templates for their own applications.

- `GET` to `/notification/search`, OperationId: `getNotifications`:
Get Notifications.
Get a list of notifications for a user. If the \&quot;markAsRead\&quot; parameter is set to true, the returned notifications will be marked as \&quot;read\&quot; after the response has been sent. By default, read messages will not be returned, so to see read messages, set \&quot;returnReadMessages\&quot; to true.

- `POST` to `/notification/token`, OperationId: `registerNotificationToken`:
Register Notification Token.
Register a token to send application dependent notifications like Google Cloud Messaging, or Apple Push Notifications.

- `GET` to `/notification/blocked/search`, OperationId: `searchBlockedNotifications`:
Search on the user&#39;s blocked notification settings.
Search on the user&#39;s blocked notification settings

- `GET` to `/notification/template/search`, OperationId: `searchNotificationTemplate`:
Search Notification Templates.
Search for notification templates on owned applications.

- `GET` to `/notification/recipient/search`, OperationId: `searchRecipients`:
Search for Recipients.
Search for application users to send notifications.

- `GET` to `/notification/recipient/search/count`, OperationId: `searchRecipientsCount`:
Search for Recipients (Counts/Grouped).
Search for application users to send notifications (count/grouped variant).

- `POST` to `/notification/batch`, OperationId: `sendBatchNotifications`:
Send Batch Notifications.
Send notifications to all users of an application. Only someone with permissions to the application can do this.

- `POST` to `/notification/custom`, OperationId: `sendCustomNotifications`:
Send Custom Notifications.
Send your own custom notification to a user. NOTE: the EventType of these notifications will be CUSTOM. Notifications sent to yourself will currently be ignored.

- `POST` to `/notification/template/update`, OperationId: `updateNotificationTemplate`:
Update Notification Template.
Update a notification template. Developers will only be able to update notification templates for their own applications.

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

-type class() :: 'notification'.

-type operation_id() ::
    'createNotificationTemplate' %% Create Notification Template
    | 'createOrUpdateBlockedNotifications' %% Create or update blocked notification settings
    | 'deleteNotificationTemplate' %% Delete Notification Template
    | 'getNotificationTemplate' %% Get Notification Template
    | 'getNotifications' %% Get Notifications
    | 'registerNotificationToken' %% Register Notification Token
    | 'searchBlockedNotifications' %% Search on the user&#39;s blocked notification settings
    | 'searchNotificationTemplate' %% Search Notification Templates
    | 'searchRecipients' %% Search for Recipients
    | 'searchRecipientsCount' %% Search for Recipients (Counts/Grouped)
    | 'sendBatchNotifications' %% Send Batch Notifications
    | 'sendCustomNotifications' %% Send Custom Notifications
    | 'updateNotificationTemplate'. %% Update Notification Template


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
allowed_methods(Req, #state{operation_id = 'createNotificationTemplate'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createOrUpdateBlockedNotifications'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteNotificationTemplate'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getNotificationTemplate'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getNotifications'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'registerNotificationToken'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchBlockedNotifications'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchNotificationTemplate'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchRecipients'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchRecipientsCount'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'sendBatchNotifications'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'sendCustomNotifications'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateNotificationTemplate'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createNotificationTemplate'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createOrUpdateBlockedNotifications'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteNotificationTemplate'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getNotificationTemplate'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getNotifications'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'registerNotificationToken'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchBlockedNotifications'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchNotificationTemplate'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchRecipients'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchRecipientsCount'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'sendBatchNotifications'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'sendCustomNotifications'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateNotificationTemplate'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createNotificationTemplate'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createOrUpdateBlockedNotifications'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteNotificationTemplate'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getNotificationTemplate'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getNotifications'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'registerNotificationToken'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchBlockedNotifications'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchNotificationTemplate'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchRecipients'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchRecipientsCount'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'sendBatchNotifications'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'sendCustomNotifications'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateNotificationTemplate'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createNotificationTemplate'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createOrUpdateBlockedNotifications'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteNotificationTemplate'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getNotificationTemplate'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getNotifications'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'registerNotificationToken'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchBlockedNotifications'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchNotificationTemplate'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchRecipients'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchRecipientsCount'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'sendBatchNotifications'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'sendCustomNotifications'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateNotificationTemplate'} = State) ->
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
    {Res, Req1, Context1} = Handler(notification, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(notification, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
