require 'json'


MyApp.add_route('POST', '/api/3.18/leaderboard/create', {
  "resourcePath" => "/Leaderboard",
  "summary" => "Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation",
  "nickname" => "create_leaderboard",
  "responseClass" => "LeaderboardResponse",
  "endpoint" => "/leaderboard/create",
  "notes" => "Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the user creating the leaderboard.",
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
      "name" => "rank_type",
      "description" => "a unique label for identifying the ranking. This can be any alphanumeric string with a maximum length of 64 characters. There are also default rank types to use which include: POINTS, DOWNLOADS, INVITATIONS, CREATIONS, VOTES, REDEEMED, ACTIONS",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "leaderboard_mode",
      "description" => "the type of search to perform. Possible values include: GLOBAL - searches scores globally (all users in the system are included in the ranking); LOCAL - filters results by select users and on users that have logged into the same device; SEARCH - does a GLOBAL search by keyword; CUSTOM - does a LOCAL search by keyword",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "icon_media",
      "description" => "a MultipartFile containing the icon image of the leaderboard (this will only be used if \&quot;iconAssetId\&quot; is empty)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "icon_asset_id",
      "description" => "The asset ID to set the leaderboard icon",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "banner_media",
      "description" => "a MultipartFile containing the icon banner of the leaderboard (this will only be used if \&quot;bannerAssetId\&quot; is empty)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "banner_asset_id",
      "description" => "The asset ID to set the leaderboard banner",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limitation",
      "description" => "limit number of rankings for each leaderboard",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "determines how to order and rank the results. Possible values include: TOTAL, WEEKLY, DAILY, TOP, LOWEST",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "leaderboard&#39;s title",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "leaderboard&#39;s description",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "meta_data",
      "description" => "custom meta data for the leaderboard",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/leaderboard/delete', {
  "resourcePath" => "/Leaderboard",
  "summary" => "Delete the Leader Board",
  "nickname" => "delete_leaderboard",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/leaderboard/delete",
  "notes" => "Removes a leader board id.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the user making the request.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "leaderboard_id",
      "description" => "The leaderboard id to delete.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/leaderboard/get', {
  "resourcePath" => "/Leaderboard",
  "summary" => "Read a leaderboard by id and retrieve the matching ranking list",
  "nickname" => "get_leaderboard",
  "responseClass" => "LeaderboardResponse",
  "endpoint" => "/leaderboard/get",
  "notes" => "Read a leaderboard by id and retrieve the matching ranking list",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "A valid account.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "leaderboard_id",
      "description" => "The leaderboard id.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_full_ranking_list",
      "description" => "set to true if need to return the leaderboard&#39;s full ranking list",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/leaderboard/search', {
  "resourcePath" => "/Leaderboard",
  "summary" => "Search leaderboard and retrieve the matching ranking list",
  "nickname" => "search_leaderboards",
  "responseClass" => "LeaderboardResponse",
  "endpoint" => "/leaderboard/search",
  "notes" => "Search leaderboard and retrieve the matching ranking list",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the user requesting the search.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "global_only",
      "description" => "only include global leaderboards (this overrides the appKey filter)",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "keyword to search by title",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "leaderboard_ids",
      "description" => "comma separated list of leaderboard ids to filter results with",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "rank_types",
      "description" => "comma separated list of rankType to filter results with",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "sortField of the result, from LeaderboardApiMap (TITLE, DESCRIPTION, CREATED, UPDATED, RANK_TYPE, RANK_MODE)",
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
      "name" => "include_inactive",
      "description" => "include inactive in the result",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_app_response",
      "description" => "determines whether to include the application response for each leaderboard",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "Start the result set at some index.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Limit the result to some number.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/leaderboard/update', {
  "resourcePath" => "/Leaderboard",
  "summary" => "Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation",
  "nickname" => "update_leaderboard",
  "responseClass" => "LeaderboardResponse",
  "endpoint" => "/leaderboard/update",
  "notes" => "Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the user updating the leaderboard.",
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
      "name" => "leaderboard_id",
      "description" => "The leaderboard id to update.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "rank_type",
      "description" => "a unique label for identifying the ranking. This can be any alphanumeric string with a maximum length of 64 characters.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "leaderboard_mode",
      "description" => "the type of search to perform. Possible values include: GLOBAL, LOCAL, SEARCH, CUSTOM",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "determines how to order and rank the results. Possible values include: TOTAL, WEEKLY, DAILY, TOP, LOWEST",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "icon_media",
      "description" => "a MultipartFile containing the icon image of the leaderboard (this will only be used if \&quot;iconAssetId\&quot; is empty)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "icon_asset_id",
      "description" => "The asset ID to set the leaderboard icon",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "banner_media",
      "description" => "a MultipartFile containing the icon banner of the leaderboard (this will only be used if \&quot;bannerAssetId\&quot; is empty)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "banner_asset_id",
      "description" => "The asset ID to set the leaderboard banner",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limitation",
      "description" => "limit number of rankings for each leaderboard",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "Whether the leaderboard is active",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "leaderboard&#39;s title",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "leaderboard&#39;s description",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "meta_data",
      "description" => "custom meta data for the leaderboard",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

