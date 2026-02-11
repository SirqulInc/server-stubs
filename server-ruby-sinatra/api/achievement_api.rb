require 'json'


MyApp.add_route('POST', '/api/3.18/achievement/tier/search', {
  "resourcePath" => "/Achievement",
  "summary" => "Searches an Achievement Tier",
  "nickname" => "achievement_tier_search_post",
  "responseClass" => "AchievementTierResponse",
  "endpoint" => "/achievement/tier/search",
  "notes" => "Searches a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "a unique id given by the device (deviceId or accountId required)",
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
      "description" => "the application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "the keyword used to filter resutls with (this returns results that have the keyword in the title or the description of the achievement tier)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "achievement_type",
      "description" => "filter results by achievementType (these are exact case sensitive matches)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "rank_type",
      "description" => "filter results by the rankType (these are the exact case sensitive matches)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "the field to sort by. See {@link AchievementApiMap}",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "determines whether the sort list is in descending or ascending order (of the achievement)",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "descending_goal",
      "description" => "determines whether the results are in descending or ascending order by the tier goal count (after the initial sort on the achievement)",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "The start of the index for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the limit for pagination (has a hard limit of 1000)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/achievement/create', {
  "resourcePath" => "/Achievement",
  "summary" => "Create Achievement",
  "nickname" => "create_achievement",
  "responseClass" => "AchievementResponse",
  "endpoint" => "/achievement/create",
  "notes" => "Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "a unique id given by the device (deviceId or accountId required)",
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
      "description" => "the application key the achievement is for",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "analytics_tag",
      "description" => "the analytics tag that will trigger when a user&#39;s achievement count gets updated",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "the title of the achievement (255 character limit)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "the description of the achievement",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "rank_type",
      "description" => "the rank type for updating leader boards",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "rank_increment",
      "description" => "determines how much the rank count is incremented",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "min_increment",
      "description" => "restrict scores to be above or equal to this minimum value",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "max_increment",
      "description" => "restrict scores to be below or equal to this maximum value",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "validate",
      "description" => "determines whether the customId on analytics are used to validate a user&#39;s achievement progress.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "achievement is active or inactive",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "trigger_definition",
      "description" => "if provided will define what triggers to run after a tier is completed",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/achievement/tier/create', {
  "resourcePath" => "/Achievement",
  "summary" => "Create Achievement Tier",
  "nickname" => "create_achievement_tier",
  "responseClass" => "AchievementTierResponse",
  "endpoint" => "/achievement/tier/create",
  "notes" => "Create a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "a unique id given by the device (deviceId or accountId required)",
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
      "name" => "achievement_id",
      "description" => "the achievement id for adding a new tier",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "icon",
      "description" => "achievement tier icon image file",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "icon_asset_id",
      "description" => "the icon assetId, if icon is provided, icon will overrule",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "the title of the achievement tier",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "the description of the achievement tier",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "goal_count",
      "description" => "the count requirement for completing the achievement tier",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_id",
      "description" => "The ID of the mission to associate with the achievement",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_id",
      "description" => "The ID of the game to associate with the achievement",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pack_id",
      "description" => "The ID of the pack to associate with the achievement",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_level_id",
      "description" => "The ID of the game level to associate with the achievement",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_object_id",
      "description" => "The ID of the game object to associate with the achievement",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "score_all_instances",
      "description" => "score all instances",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/achievement/delete', {
  "resourcePath" => "/Achievement",
  "summary" => "Delete Achievement",
  "nickname" => "delete_achievement",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/achievement/delete",
  "notes" => "Deletes an achievement (for developer/retailer use). User must have permissions to the application the achievement was created for.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "achievement_id",
      "description" => "The ID of the achievement",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/achievement/tier/delete', {
  "resourcePath" => "/Achievement",
  "summary" => "Delete Achievement Tier",
  "nickname" => "delete_achievement_tier",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/achievement/tier/delete",
  "notes" => "Deletes an achievement tier (for developer/retailer use). User must have permissions to the application the achievement was created for.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the account id of the user (deviceId or accountId required).",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "achievement_tier_id",
      "description" => "the achievement id for deletion",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/achievement/get', {
  "resourcePath" => "/Achievement",
  "summary" => "Get Achievement",
  "nickname" => "get_achievement",
  "responseClass" => "AchievementTierResponse",
  "endpoint" => "/achievement/get",
  "notes" => "Get an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "a unique id given by the device (deviceId or accountId required)",
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
      "name" => "achievement_id",
      "description" => "The ID of the achievement",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "achievement_type",
      "description" => "achievementType",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/achievement/tier/get', {
  "resourcePath" => "/Achievement",
  "summary" => "Gets an achievement tier",
  "nickname" => "get_achievement_tier",
  "responseClass" => "AchievementTierResponse",
  "endpoint" => "/achievement/tier/get",
  "notes" => "Gets an achievement tier (for developer/retailer use). User must have permissions to the application the achievement is created for.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "achievement_tier_id",
      "description" => "the achievement tier id that is being retrieved",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/achievement/progress/get', {
  "resourcePath" => "/Achievement",
  "summary" => "Get Achievement Progress",
  "nickname" => "get_user_achievements",
  "responseClass" => "Array<AchievementProgressResponse>",
  "endpoint" => "/achievement/progress/get",
  "notes" => "Gets a list of user achievements.",
  "parameters" => [
    {
      "name" => "return_nulls",
      "description" => "determines whether to return null fields in the response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "device_id",
      "description" => "a unique id given by the device (deviceId or accountId required)",
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
      "name" => "connection_account_email",
      "description" => "the email of the account to view achievements",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_account_id",
      "description" => "the id of the account to view achievements",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "the application key for filtering results by application",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "rank_type",
      "description" => "filter results by achievement rankType",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "achievement_type",
      "description" => "filter results by achievement type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_undiscovered",
      "description" => "determines whether to return achievements that the user has not discovered yet",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
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


MyApp.add_route('GET', '/api/3.18/achievement/tag/list', {
  "resourcePath" => "/Achievement",
  "summary" => "List Achievement Tags",
  "nickname" => "list_achievement_tags",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/achievement/tag/list",
  "notes" => "List achievement tags by application",
  "parameters" => [
    {
      "name" => "app_key",
      "description" => "filter results by application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/achievement/list', {
  "resourcePath" => "/Achievement",
  "summary" => "List Achievements",
  "nickname" => "list_achievements",
  "responseClass" => "Array<AchievementShortResponse>",
  "endpoint" => "/achievement/list",
  "notes" => "List achievements by billable.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "a unique id given by the device (deviceId or accountId required)",
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
      "description" => "the application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "the keyword used to filter results with (this returns results that have the keyword in the title or description of the achievement)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "achievement_type",
      "description" => "filter results by the achievementType (these are exact case sensitive matches)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "rank_type",
      "description" => "filter results by the rankType (these are exact case sensitive matches)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "the field to sort by. See AchievementApiMap",
      "dataType" => "String",
      "allowableValues" => "[CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, TITLE, DESCRIPTION, RANK_TYPE, APPLICATION_ID, APPLICATION_NAME, BILLABLE_ID]",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "determines whether the sorted list is in descending or ascending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "the start index for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the limit for pagination (has a hard limit of 1000)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active_only",
      "description" => "Filter results to only return active achievements",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/achievement/search', {
  "resourcePath" => "/Achievement",
  "summary" => "Search Achievements",
  "nickname" => "search_achievements",
  "responseClass" => "Array<AchievementShortResponse>",
  "endpoint" => "/achievement/search",
  "notes" => "Searches achievements by application for consumers.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "a unique id given by the device (deviceId or accountId required)",
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
      "description" => "the application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "the keyword used to filter results with (this returns results that have the keyword in the title or description of the achievement)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "achievement_type",
      "description" => "filter results by the achievementType (these are exact case sensitive matches)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "rank_type",
      "description" => "filter results by the rankType (these are exact case sensitive matches)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "the field to sort by. See AchievementApiMap",
      "dataType" => "String",
      "allowableValues" => "[CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, TITLE, DESCRIPTION, RANK_TYPE, APPLICATION_ID, APPLICATION_NAME, BILLABLE_ID]",
      "defaultValue" => "'TITLE'",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "determines whether the sorted list is in descending or ascending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "include_tiers",
      "description" => "return tiers, only applicable for version &gt;3.18",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "include_inactive_tiers",
      "description" => "return inactive tiers, only applicable when includeTiers is true, only applicable for version &gt;3.18",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
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
      "description" => "the limit for pagination (has a hard limit of 1000)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "100",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/achievement/update', {
  "resourcePath" => "/Achievement",
  "summary" => "Update Achievement",
  "nickname" => "update_achievement",
  "responseClass" => "AchievementResponse",
  "endpoint" => "/achievement/update",
  "notes" => "Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "a unique id given by the device (deviceId or accountId required)",
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
      "name" => "achievement_id",
      "description" => "the achievement ID for updating an existing achievement",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "analytics_tag",
      "description" => "the analytics tag that will trigger when a user&#39;s achievement count gets updated",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "the title of the achievement (255 character limit)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "the description of the achievement",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "rank_type",
      "description" => "the rank type for updating leader boards",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "rank_increment",
      "description" => "determines how much the rank count is incremented",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "min_increment",
      "description" => "restrict scores to be above or equal to this minimum value",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "null_min_increment",
      "description" => "enable to ignore usage of minIncrement",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "max_increment",
      "description" => "restrict scores to be below or equal to this maximum value",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "null_max_increment",
      "description" => "enable to ignore usage of maxIncrement",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "validate",
      "description" => "determines whether the customId on analytics are used to validate a user&#39;s achievement progress.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "if it&#39;s active or inactive",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "trigger_definition",
      "description" => "if provided will define what triggers to run after a tier is completed",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/achievement/tier/update', {
  "resourcePath" => "/Achievement",
  "summary" => "Update Achievement Tier",
  "nickname" => "update_achievement_tier",
  "responseClass" => "AchievementTierResponse",
  "endpoint" => "/achievement/tier/update",
  "notes" => "Updates a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "a unique id given by the device (deviceId or accountId required)",
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
      "name" => "achievement_tier_id",
      "description" => "the achievement tier id for updating",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "icon",
      "description" => "achievement tier icon image file",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "icon_asset_id",
      "description" => "the icon assetId, if icon is provided, icon will overrule",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "the title of the achievement tier",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "the description of the achievement tier",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "goal_count",
      "description" => "the count requirement for completing the achievement tier",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_id",
      "description" => "The ID of the mission to associate with the achievement",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_id",
      "description" => "The ID of the game to associate with the achievement",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pack_id",
      "description" => "The ID of the pack to associate with the achievement",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_level_id",
      "description" => "The ID of the game level to associate with the achievement",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_object_id",
      "description" => "The ID of the game object to associate with the achievement",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "score_all_instances",
      "description" => "score all instances",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/achievement/progress/update', {
  "resourcePath" => "/Achievement",
  "summary" => "Update Achievement Progress",
  "nickname" => "update_user_achievement",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/achievement/progress/update",
  "notes" => "Update user achievement progress.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the account id of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "achievement_id",
      "description" => "the achievement id (achievementId or tag required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tag",
      "description" => "the analytic tag to identify an achievement (achievementId or tag required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "custom_id",
      "description" => "a custom identifier used for validation",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "increment",
      "description" => "the amount to increment an achievement progress by (if no increment is sent in, the server defaults to using the achievement&#39;s rankIncrement value)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "a custom start date that the client can set (not yet used in server logic)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "a custom end date that the client can set (not yet used in server logic)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_progress",
      "description" => "determines whether to return the achievement progress response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

