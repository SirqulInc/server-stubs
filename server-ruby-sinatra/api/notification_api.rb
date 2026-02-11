require 'json'


MyApp.add_route('POST', '/api/3.18/notification/template/create', {
  "resourcePath" => "/Notification",
  "summary" => "Create Notification Template",
  "nickname" => "create_notification_template",
  "responseClass" => "NotificationTemplateResponse",
  "endpoint" => "/notification/template/create",
  "notes" => "Create a notification template. Developers will only be able to create notification templates for their own applications.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account ID of the user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Filter results by application.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "event",
      "description" => "Filter results by event.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "conduit",
      "description" => "Filter results by notification type: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "title of the notification template",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "body of the notification template",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tags",
      "description" => "tags associated with the note template",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/notification/blocked/batch', {
  "resourcePath" => "/Notification",
  "summary" => "Create or update blocked notification settings",
  "nickname" => "create_or_update_blocked_notifications",
  "responseClass" => "BlockedNotificationResponse",
  "endpoint" => "/notification/blocked/batch",
  "notes" => "Create or update blocked notification settings",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the account id of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "data",
      "description" => "batch data payload (application specific)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/notification/template/delete', {
  "resourcePath" => "/Notification",
  "summary" => "Delete Notification Template",
  "nickname" => "delete_notification_template",
  "responseClass" => "NotificationTemplateResponse",
  "endpoint" => "/notification/template/delete",
  "notes" => "Deletes a notification template. Developers will only be able to delete notification templates for their own applications.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the account id of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "notification_template_id",
      "description" => "the id of the notification template to delete",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/notification/template/get', {
  "resourcePath" => "/Notification",
  "summary" => "Get Notification Template",
  "nickname" => "get_notification_template",
  "responseClass" => "NotificationTemplateResponse",
  "endpoint" => "/notification/template/get",
  "notes" => "Get the details of a notification template. Developers will only be able to see notification templates for their own applications.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the account",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "notification_template_id",
      "description" => "the id of the notification template to get",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/notification/search', {
  "resourcePath" => "/Notification",
  "summary" => "Get Notifications",
  "nickname" => "get_notifications",
  "responseClass" => "NotificationMessageListResponse",
  "endpoint" => "/notification/search",
  "notes" => "Get a list of notifications for a user. If the \"markAsRead\" parameter is set to true, the returned notifications will be marked as \"read\" after the response has been sent. By default, read messages will not be returned, so to see read messages, set \"returnReadMessages\" to true.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the unique id of the device making the request (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_account_id",
      "description" => "the account id used to view another person&#39;s notifications",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "the application key to filter messages by application",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "event_type",
      "description" => "comma separated list of EVENTS. Filters search results to only include these events. Don&#39;t include this parameter or pass in an empty string to return all event types.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "content_ids",
      "description" => "comma separated list of content ids to search notifications on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "content_types",
      "description" => "comma separated list of content types to search notifications on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "parent_ids",
      "description" => "comma separated list of parent ids to search notifications on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "parent_types",
      "description" => "comma separated list of parent types to search notifications on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "action_category",
      "description" => "Action category used to filter notifications",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "conduits",
      "description" => "comma separated list of conduits to search notifications on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "search notifications via keyword",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_read_messages",
      "description" => "if set to true, will return notifications that have been marked as read",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mark_as_read",
      "description" => "if set to true, the returned notifications will be marked as \\\&quot;read\\\&quot; after the response has been sent",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "from_date",
      "description" => "filter notifications from this date",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "latitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "longitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_sent",
      "description" => "whether to include notifications sent by the requester in the response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ignore_flagged",
      "description" => "whether to ignore flagged notifications",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "start of the pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "limit of the pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/notification/token', {
  "resourcePath" => "/Notification",
  "summary" => "Register Notification Token",
  "nickname" => "register_notification_token",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/notification/token",
  "notes" => "Register a token to send application dependent notifications like Google Cloud Messaging, or Apple Push Notifications.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The unique id of the device making the request (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "token",
      "description" => "A token that is generated by the device to sign requests for the notification service providers",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "push_type",
      "description" => "The type of push notification. Possible values include: APNS, GCM",
      "dataType" => "String",
      "allowableValues" => "[APNS, GCM, BAIDU, XGPUSH, JPUSH]",
      "paramType" => "query",
    },
    {
      "name" => "environment",
      "description" => "Determines if the token is a DEVELOPMENT or PRODUCTION token",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_type",
      "description" => "This parameter is deprecated (use appKey instead)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "Sets whether the token is active or not (non-active tokens are not used)",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "Latitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "Longitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/notification/blocked/search', {
  "resourcePath" => "/Notification",
  "summary" => "Search on the user's blocked notification settings",
  "nickname" => "search_blocked_notifications",
  "responseClass" => "BlockedNotificationResponse",
  "endpoint" => "/notification/blocked/search",
  "notes" => "Search on the user's blocked notification settings",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the account id of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "search_tags",
      "description" => "search tags to filter results",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "events",
      "description" => "events to filter by (comma separated)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "conduits",
      "description" => "conduits to filter by (comma separated)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "custom_types",
      "description" => "custom types to filter by (comma separated)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "content_types",
      "description" => "content types to filter by (comma separated)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "content_ids",
      "description" => "content ids to filter by (comma separated)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "sort field for results",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "whether to sort descending",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "start of the pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "limit of the pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/notification/template/search', {
  "resourcePath" => "/Notification",
  "summary" => "Search Notification Templates",
  "nickname" => "search_notification_template",
  "responseClass" => "NotificationTemplateResponse",
  "endpoint" => "/notification/template/search",
  "notes" => "Search for notification templates on owned applications.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account ID of the user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Filter results by application.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "event",
      "description" => "Filter results by event.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "conduit",
      "description" => "Filter results by notification type: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "global_only",
      "description" => "Returns only templates that have been reserved for system use on all applications (only for admin accounts).",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "reserved_only",
      "description" => "Returns only templates that use reserved events.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "Filter results by keyword on the title, tags.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "Specifies how results are ordered.ID - order results by the notificationTemplateId CREATED - order results by the created date UPDATED - order results by the updated date TITLE - order results by title EVENT - order results by event CONDUIT - order results by conduit APP_NAME - order results by the application name (&#39;global&#39; templates will not have an application and will be returned last if &#39;descending&#39; is set to false.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "Specified whether the results are returned in descending or ascending order.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "The start of the pagination.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "The limit of the pagination.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/notification/recipient/search', {
  "resourcePath" => "/Notification",
  "summary" => "Search for Recipients",
  "nickname" => "search_recipients",
  "responseClass" => "Array<NotificationRecipientResponse>",
  "endpoint" => "/notification/recipient/search",
  "notes" => "Search for application users to send notifications.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the unique id of the device making the request (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "filters results by application. If this is empty, will return all recipients for all applications that the user has access to.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "conduit",
      "description" => "the type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "search by keyword on user&#39;s display name and email",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_id",
      "description" => "This parameter is deprecated. filter results by audience",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_ids",
      "description" => "filter results by audiences (comma separated list of audience ids)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_group_ids",
      "description" => "filter results by connection groups (comma separated list of connection group ids)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "recipient_account_ids",
      "description" => "filter results by accounts (comma separated list of account ids)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "The field to sort by. Possible values include: {ACCOUNT_DISPLAY, CREATED, UPDATED, ACTIVE, DELETED, LAST_LOGGED_IN, CONTACT_EMAIL, RETAILER_LOCATION_NAME, RETAILER_NAME, APPLICATION_NAME}",
      "dataType" => "String",
      "allowableValues" => "[ID, HAS_SMS, HAS_EMAIL, HAS_APNS, HAS_GCM, APPLICATION_ID, APPLICATION_NAME, ACCOUNT_ID, ACCOUNT_USERNAME, ACCOUNT_DISPLAY, ACCOUNT_TYPE]",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "Determines whether the sorted list is in descending or ascending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "start of the pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "limit of the pagination (hard limit of 1000)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/notification/recipient/search/count', {
  "resourcePath" => "/Notification",
  "summary" => "Search for Recipients (Counts/Grouped)",
  "nickname" => "search_recipients_count",
  "responseClass" => "NotificationRecipientResponseListResponse",
  "endpoint" => "/notification/recipient/search/count",
  "notes" => "Search for application users to send notifications (count/grouped variant).",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the unique id of the device making the request (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "filters results by application. If this is empty, will return all recipients for all applications that the user has access to.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "conduit",
      "description" => "the type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "search by keyword on user&#39;s display name and email",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_id",
      "description" => "This parameter is deprecated. filter results by audience",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_ids",
      "description" => "filter results by audiences (comma separated list of audience ids)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_group_ids",
      "description" => "filter results by connection groups (comma separated list of connection group ids)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "The field to sort by (see API docs for allowed values).",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "Determines whether the sorted list is in descending or ascending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "start of the pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "limit of the pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/notification/batch', {
  "resourcePath" => "/Notification",
  "summary" => "Send Batch Notifications",
  "nickname" => "send_batch_notifications",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/notification/batch",
  "notes" => "Send notifications to all users of an application. Only someone with permissions to the application can do this.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the application owner/manager",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key for updating an existing application",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "conduit",
      "description" => "The type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "custom_message",
      "description" => "Message string that will be displayed in on the notification",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "content_id",
      "description" => "Default notification pay-load field (usage is dependent on the app and the type of event)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "content_name",
      "description" => "Default notification pay-load field (usage is dependent on the app and the type of event)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "content_type",
      "description" => "Default notification pay-load field (usage is dependent on the app and the type of event)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "parent_id",
      "description" => "Default notification pay-load field (usage is dependent on the app and the type of event)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "parent_type",
      "description" => "Default notification pay-load field (usage is dependent on the app and the type of event)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/notification/custom', {
  "resourcePath" => "/Notification",
  "summary" => "Send Custom Notifications",
  "nickname" => "send_custom_notifications",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/notification/custom",
  "notes" => "Send your own custom notification to a user. NOTE: the EventType of these notifications will be CUSTOM. Notifications sent to yourself will currently be ignored.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the unique id of the device making the request (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "receiver_account_ids",
      "description" => "comma separated list of account IDs that will receive the notification",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_friend_group",
      "description" => "determines whether to send to all of the user&#39;s friends, this flag must be true or receiverAccountIds must not be empty",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "the application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_type",
      "description" => "This parameter is deprecated.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "conduit",
      "description" => "the type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "content_id",
      "description" => "default notification pay-load field (usage is dependent on the app and the type of event)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "content_name",
      "description" => "default notification pay-load field (usage is dependent on the app and the type of event)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "content_type",
      "description" => "default notification pay-load field (usage is dependent on the app and the type of event)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "parent_id",
      "description" => "default notification pay-load field (usage is dependent on the app and the type of event)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "parent_type",
      "description" => "default notification pay-load field (usage is dependent on the app and the type of event)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "action_category",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "subject",
      "description" => "the subject line of an email #@param customPayload custom json definition of notification pay-load (usage is dependent on the app and the type of event)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "custom_message",
      "description" => "message string that will be displayed in on the notification",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "friend_only_apns",
      "description" => "only sends APNS to people who are friends of the user (still saves the notification message for feed polling)",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "latitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "longitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/notification/template/update', {
  "resourcePath" => "/Notification",
  "summary" => "Update Notification Template",
  "nickname" => "update_notification_template",
  "responseClass" => "NotificationTemplateResponse",
  "endpoint" => "/notification/template/update",
  "notes" => "Update a notification template. Developers will only be able to update notification templates for their own applications.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account ID of the user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "notification_template_id",
      "description" => "The notification template ID to update.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "The title of the message (this would become the subject title for emails). There is a 191 character limit.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "The body of the message.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tags",
      "description" => "The search tags on the template used during search queries.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

