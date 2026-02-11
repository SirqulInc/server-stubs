require 'json'


MyApp.add_route('POST', '/api/3.18/consumer/permissions/add', {
  "resourcePath" => "/UserPermissions",
  "summary" => "Add User",
  "nickname" => "add_users_to_permissionable",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/consumer/permissions/add",
  "notes" => "Adds a user to a permissionable object.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the device id (deviceId or accountId required)",
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
      "name" => "permissionable_type",
      "description" => "the permissionable type of the object",
      "dataType" => "String",
      "allowableValues" => "[ACCOUNT, GAMELEVEL, ALBUM_CONTEST, THEME_DESCRIPTOR, SCHEDULED_NOTIFICATION, TASK, TRIGGER]",
      "paramType" => "query",
    },
    {
      "name" => "permissionable_id",
      "description" => "the id of the permissionable object",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "read",
      "description" => "the read permission of the users/groups",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "write",
      "description" => "the write permission of the users/groups",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "delete",
      "description" => "the delete permission of the users/groups",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "add",
      "description" => "the add permission of the users/groups",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "connection_ids",
      "description" => "a comma separated list of connection ids (NOT the account ids)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_account_ids",
      "description" => "a comma separated list of account ids",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_group_ids",
      "description" => "a comma separated list of connection group ids (these are groups made by the user)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pending",
      "description" => "sets whether the added users are marked as pending (and will require the album admins to accept) - admins can set this to false (to accept)",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "admin",
      "description" => "sets whether the added users will become admins or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_friend_group",
      "description" => "flag to determine whether to include the built-in \&quot;friends\&quot; group",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "the current latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "the current longitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_ids",
      "description" => "comma separated list of audience ids. This is a feature only available to the permissionable&#39;s application owner (and its employees). This will add all users from these audiences to the permissionable object. Notifications will not be sent to users if this feature is used.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/permissionable/approve', {
  "resourcePath" => "/UserPermissions",
  "summary" => "Approve Permissionable",
  "nickname" => "approve_permissionable",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/permissionable/approve",
  "notes" => "Sets the approval status of a permissionable object.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "A unique ID given by the device (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account ID of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "permissionable_type",
      "description" => "The permissionable type of the object",
      "dataType" => "String",
      "allowableValues" => "[ACCOUNT, GAMELEVEL, ALBUM_CONTEST, THEME_DESCRIPTOR, SCHEDULED_NOTIFICATION, TASK, TRIGGER]",
      "paramType" => "query",
    },
    {
      "name" => "permissionable_id",
      "description" => "The id of the permissionable object",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "approval_status",
      "description" => "The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}",
      "dataType" => "String",
      "allowableValues" => "[PENDING, REJECTED, APPROVED, FEATURED]",
      "defaultValue" => "'APPROVED'",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/consumer/permissions/leave', {
  "resourcePath" => "/UserPermissions",
  "summary" => "Leave",
  "nickname" => "leave_from_permissionable",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/consumer/permissions/leave",
  "notes" => "Used when the user wants to leave from someone else's permissionable object",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the device id (deviceId or accountId required)",
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
      "name" => "permissionable_type",
      "description" => "the permissionable type PermissionableType",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "permissionable_id",
      "description" => "the id of the permissionable object",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "the current latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "the current longitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/consumer/permissions/remove', {
  "resourcePath" => "/UserPermissions",
  "summary" => "Remove User",
  "nickname" => "remove_users_from_permissionable",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/consumer/permissions/remove",
  "notes" => "Used to remove someone (assuming they have permission) from a permissionable object",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the device id (deviceId or accountId required)",
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
      "name" => "permissionable_type",
      "description" => "the permissionable type of the object",
      "dataType" => "String",
      "allowableValues" => "[ACCOUNT, GAMELEVEL, ALBUM_CONTEST, THEME_DESCRIPTOR, SCHEDULED_NOTIFICATION, TASK, TRIGGER]",
      "paramType" => "query",
    },
    {
      "name" => "permissionable_id",
      "description" => "the id of the permissionable object",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_ids",
      "description" => "a comma separated list of connection ids (NOT the account ids)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_account_ids",
      "description" => "a comma separated list of account ids",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_group_ids",
      "description" => "a comma separated list of connection group ids (these are groups made by the user)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "remove_friend_group",
      "description" => "flag to determine whether to remove the built-in \&quot;friends\&quot; group",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "the current latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "the current longitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_ids",
      "description" => "comma separated list of audience ids. This will remove all users from these audiences from the permissionable object. Notifications will not be sent to users if this feature is used.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/permissions/search', {
  "resourcePath" => "/UserPermissions",
  "summary" => "Search Permissionables",
  "nickname" => "search_permissionables",
  "responseClass" => "Array<UserPermissionsResponse>",
  "endpoint" => "/permissions/search",
  "notes" => "Search on UserPermissions",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "A unique ID given by the device (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account ID of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_account_id",
      "description" => "Filter results for a specific user account",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_account_ids",
      "description" => "Comma separated list of account IDs to filter results with",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "permissionable_type",
      "description" => "Filter user permissions by the permissionable object type",
      "dataType" => "String",
      "allowableValues" => "[ACCOUNT, GAMELEVEL, ALBUM_CONTEST, THEME_DESCRIPTOR, SCHEDULED_NOTIFICATION, TASK, TRIGGER]",
      "paramType" => "query",
    },
    {
      "name" => "permissionable_id",
      "description" => "The id of the permissionable object to filter by",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "Keyword to search within permissionable records",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "Field to sort results on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "Sort descending when true",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pending",
      "description" => "Return user permissions that are pending",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "admin",
      "description" => "Return user permissions that are admins",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "the start index for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the limit for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/permissions/distancesearch', {
  "resourcePath" => "/UserPermissions",
  "summary" => "Search Permissionables by Distnace",
  "nickname" => "search_permissionables_following_distance",
  "responseClass" => "Array<UserPermissionsResponse>",
  "endpoint" => "/permissions/distancesearch",
  "notes" => "Search on UserPermissions by distance",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "A unique ID given by the device (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account ID of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_account_id",
      "description" => "Filter results for a specific user account",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_account_ids",
      "description" => "Comma separated list of account IDs to filter results with",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "permissionable_type",
      "description" => "Filter user permissions by the permissionable object type",
      "dataType" => "String",
      "allowableValues" => "[ACCOUNT, GAMELEVEL, ALBUM_CONTEST, THEME_DESCRIPTOR, SCHEDULED_NOTIFICATION, TASK, TRIGGER]",
      "paramType" => "query",
    },
    {
      "name" => "permissionable_id",
      "description" => "The id of the permissionable object to filter by",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "The latitude of the current account",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The longitude of the current account",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "search_range",
      "description" => "The search range in miles",
      "dataType" => "Float",
      "allowableValues" => "",
      "defaultValue" => "5",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "Keyword to search within permissionable records",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pending",
      "description" => "Return user permissions that are pending",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "admin",
      "description" => "Return user permissions that are admins",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "The start index for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "The limit for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

