require 'json'


MyApp.add_route('GET', '/api/{version}/ranking/historical/search', {
  "resourcePath" => "/Ranking",
  "summary" => "Search Historical Rankings",
  "nickname" => "get_historical_rankings",
  "responseClass" => "RankFullResponse",
  "endpoint" => "/api/{version}/ranking/historical/search",
  "notes" => "Get historical leaderboard rankings by time-frame.",
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
      "description" => "the account id of the user",
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
      "description" => "the rank type to return",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "timestamp in milliseconds to filter results with",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "timestamp in milliseconds to filter results with",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "determines how to order and rank the results. Possible values include: TOTAL, MONTHLY, WEEKLY, DAILY, TOP, LOWEST",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'TOTAL'",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "determines whether to return results in ascending or descending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
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
      "defaultValue" => "100",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/ranking/search', {
  "resourcePath" => "/Ranking",
  "summary" => "Search Rankings",
  "nickname" => "get_rankings",
  "responseClass" => "RankFullResponse",
  "endpoint" => "/api/{version}/ranking/search",
  "notes" => "Get leader board rankings. This is an all in one endpoint that can return multiple ranking types and also the current user rank.",
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
      "name" => "game_type",
      "description" => "This parameter is deprecated.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "the application key for filtering results by application (required for non-EXECUTIVE users)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "q",
      "description" => "This parameter is deprecated.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "keyword to search for",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "rank_type",
      "description" => "a comma separated list of rank types to return. Possible default rank types: POINTS, DOWNLOADS, INVITATIONS",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'POINTS,DOWNLOADS,INVITATIONS'",
      "paramType" => "query",
    },
    {
      "name" => "leaderboard_mode",
      "description" => "the type of search to perform. Possible values include: GLOBAL - searches scores globally (all users in the system are included in the ranking) LOCAL - filters results by select users and on users that have logged into the same device CUSTOM - allows for custom filtering using the params: withinAccountIds, albumId, audienceId",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'GLOBAL'",
      "paramType" => "query",
    },
    {
      "name" => "within_account_ids",
      "description" => "comma separated list of account ids. If performing a LOCAL or CUSTOM search, the query will include these accounts.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_user_rank",
      "description" => "determines whether to return the user&#39;s current rank in the response. This can be turned off for sequential paginated requests.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "album_id",
      "description" => "album id to use when performing CUSTOM filters",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_id",
      "description" => "audience id to use when performing CUSTOM filters",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "determines how to order and rank the results. Possible values include: TOTAL - order results by total score MONTHLY - order results by monthly score WEEKLY - order results by weekly score DAILY - order results by daily score TOP - order results by top score LOWEST - order results by lowest score",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'TOTAL'",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "determines whether to return results in ascending or descending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "_i",
      "description" => "This parameter is deprecated.",
      "dataType" => "Integer",
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
      "name" => "_l",
      "description" => "This parameter is deprecated.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the limit for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "100",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/ranking/personal/ranks', {
  "resourcePath" => "/Ranking",
  "summary" => "Get Personal Rankings",
  "nickname" => "get_user_rank",
  "responseClass" => "Object",
  "endpoint" => "/api/{version}/ranking/personal/ranks",
  "notes" => "Returns the user's ranks for one or more rank types and modes.",
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
      "description" => "the account id of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "the application key for filtering results by application (required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "rank_type",
      "description" => "pass in all rankTypes and children rankTypes",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_user_rank",
      "description" => "determines whether to return the user&#39;s current rank in the response, for each rankType",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "leaderboard_mode",
      "description" => "the type of search to perform. Possible values include: GLOBAL, LOCAL, SEARCH, CUSTOM",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'GLOBAL'",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "determines how to order and rank the results. Possible values include: TOTAL, MONTHLY, WEEKLY, DAILY, TOP, LOWEST",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'TOTAL'",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "keyword to search for (on rankType)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "determines whether to return results in descending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
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
      "defaultValue" => "100",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/ranking/override', {
  "resourcePath" => "/Ranking",
  "summary" => "Override User Rank",
  "nickname" => "override_user_rank",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/ranking/override",
  "notes" => "Allows an admin of an application to override a user's scores for a leaderboard.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the logged in user&#39;s account id (must have permissions to manage data for the application)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "owner_account_id",
      "description" => "the end user&#39;s account id to override",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "the application key the leaderboard is for",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "rank_type",
      "description" => "the rankType of the leaderboard",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "total_score",
      "description" => "the total score to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "total_count",
      "description" => "the total count to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "total_time",
      "description" => "the total time to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "daily_score",
      "description" => "the daily score to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "daily_count",
      "description" => "the daily count to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "daily_time",
      "description" => "the daily time to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "weekly_score",
      "description" => "the weekly score to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "weekly_count",
      "description" => "the weekly count to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "weekly_time",
      "description" => "the weekly time to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "monthly_score",
      "description" => "the monthly score to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "monthly_count",
      "description" => "the monthly count to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "monthly_time",
      "description" => "the monthly time to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "top_score",
      "description" => "the top score to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "lowest_score",
      "description" => "the lowest score to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "streak_count",
      "description" => "the streak count to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "streak_best_count",
      "description" => "the best streak count to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "the start date to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "the end date to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/ranking/update', {
  "resourcePath" => "/Ranking",
  "summary" => "Update Ranking",
  "nickname" => "update_rankings",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/ranking/update",
  "notes" => "Update the rank value ",
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
      "description" => "the application key for filtering results by application",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "rank_type",
      "description" => "a unique label for identifying the ranking. This can be any alphanumeric string (no spaces or special characters) with a maximum length of 64 characters. There are also default rank types to use which include: POINTS, DOWNLOADS, INVITATIONS, CREATIONS, VOTES, REDEEMED, ACTIONS",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "increment",
      "description" => "the value to increment",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "1",
      "paramType" => "query",
    },
    {
      "name" => "time_increment",
      "description" => "the time value to increment",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tag",
      "description" => "the analytic tag for this achievement (used to validate scores)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "custom date you can save along with the score for the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "custom date you can save along with the score for the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "update_global",
      "description" => "update the global rankings if true, default is false",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "create_leaderboard",
      "description" => "create the leaderboard if it does not exist (default false)",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

