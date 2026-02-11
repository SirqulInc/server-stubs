require 'json'


MyApp.add_route('POST', '/api/3.18/mission/invite/create', {
  "resourcePath" => "/MissionInvite",
  "summary" => "Create Mission Invite",
  "nickname" => "create_mission_invite",
  "responseClass" => "MissionResponse",
  "endpoint" => "/mission/invite/create",
  "notes" => "Create the mission invite. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the device id (deviceId or accountId required).",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account id of the user (deviceId or accountId required).",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_id",
      "description" => "The mission to find the invite for.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "join_code",
      "description" => "code to be entered for user to join the mission",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_game_data",
      "description" => "Include the game level data with the mission.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/mission/invite/delete', {
  "resourcePath" => "/MissionInvite",
  "summary" => "Delete Mission Invite",
  "nickname" => "delete_mission_invite",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/mission/invite/delete",
  "notes" => "Update the mission invite status to quit.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the device id (deviceId or accountId required).",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account id of the user (deviceId or accountId required).",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_id",
      "description" => "The mission to find the invite for (missionId or missionInviteId requried).",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_invite_id",
      "description" => "The mission invite id. This checks on the user&#39;s billable for permission (missionId or missionInviteId requried).",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_game_data",
      "description" => "Include the game level data with the mission.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/mission/invite/get', {
  "resourcePath" => "/MissionInvite",
  "summary" => "Get Mission Invite",
  "nickname" => "get_mission_invite",
  "responseClass" => "MissionResponse",
  "endpoint" => "/mission/invite/get",
  "notes" => "Get the mission invite. An account can only be invited to a mission one time.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the device id (deviceId or accountId required).",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account id of the user (deviceId or accountId required).",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_id",
      "description" => "The mission to find the invite for (missionId or missionInviteId requried).",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_invite_id",
      "description" => "The mission invite id. This checks on the user&#39;s billable for permission (missionId or missionInviteId requried).",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_game_data",
      "description" => "Include the game level data with the mission.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_scores",
      "description" => "include the scores with the mission",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/mission/invite/search', {
  "resourcePath" => "/MissionInvite",
  "summary" => "Search Mission Invites",
  "nickname" => "search_mission_invites",
  "responseClass" => "Array<MissionResponse>",
  "endpoint" => "/mission/invite/search",
  "notes" => "Get a list of mission invites that the account has.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the device id (deviceId or accountId required).",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account id of the user (deviceId or accountId required).",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "the app to retrieve the data for, use your application key.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_version",
      "description" => "the application version, used to version the game level data",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_id",
      "description" => "the mission id to filter on",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "status",
      "description" => "The invite status to filter for, comma separated list {AVAILABLE, PENDING, UPDATED, ACCEPTED, ACTIVE, QUIT, COMPLETED, PENDING_REVIEW, REJECTED}",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "last_updated",
      "description" => "Only return invites that have been updated since this date/time (long)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "The index into the record set to start with.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "The total number of record to return.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "the keyword to search on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_types",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_by_billable",
      "description" => "filter results by the account&#39;s billable",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_game_data",
      "description" => "Include the game level data with the mission.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/mission/invite/update', {
  "resourcePath" => "/MissionInvite",
  "summary" => "Update Mission Invite",
  "nickname" => "update_mission_invite",
  "responseClass" => "MissionResponse",
  "endpoint" => "/mission/invite/update",
  "notes" => "Update the mission invite status. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the device id (deviceId or accountId required).",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account id of the user (deviceId or accountId required).",
      "dataType" => "Integer",
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
      "name" => "mission_id",
      "description" => "The mission to find the invite for (missionId or missionInviteId requried).",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_invite_id",
      "description" => "The mission invite id. This checks on the user&#39;s billable for permission (missionId or missionInviteId requried).",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pack_id",
      "description" => "the pack id to find the invite for",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_level_id",
      "description" => "the game level id to find the invite for",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "status",
      "description" => "The invite status to filter for, comma separated list {AVAILABLE, PENDING, UPDATED, ACCEPTED, ACTIVE, QUIT, COMPLETED, PENDING_REVIEW, REJECTED}",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "permissionable_type",
      "description" => "This is the content type for missions that require user submission. Note that user submitted content must require a status of PENDING_REVIEW to be accpeted. {ACCOUNT, GAMELEVEL, COLLECTION, ALBUM_CONTEST, THEME_DESCRIPTOR, ALBUM}",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "permissionable_id",
      "description" => "The id of the content being submitted.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_game_data",
      "description" => "Include the game level data with the mission.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

