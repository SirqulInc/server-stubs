require 'json'


MyApp.add_route('POST', '/api/3.18/like', {
  "resourcePath" => "/Like",
  "summary" => "Create Like",
  "nickname" => "register_like",
  "responseClass" => "LikableResponse",
  "endpoint" => "/like",
  "notes" => "Allows a user to like or dislike accounts, albums, album contests, assets, game levels, notes, and theme descriptors. Multiple likes\\dislikes on the same object will replace the previous one.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The unique device identifier that made the request (either deviceId or accountId must be used)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The unique accountId that made the request (either deviceId or accountId must be used)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "likable_type",
      "description" => "The type of likable object {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, NOTE, THEME_DESCRIPTOR}",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "likable_id",
      "description" => "The id of the likable object",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "permissionable_type",
      "description" => "This is used for sending out group notifications. For example, when someone likes an asset which is also a part of an album, everyone in the album will receive a notification. This is achieved by passing in the permissionable type (in this case \&quot;album\&quot;), and the permissionable id (the album id). Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "permissionable_id",
      "description" => "The id of the permissionable object (for sending group notifications)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "like",
      "description" => "determines whether the user likes or dislikes the object",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app",
      "description" => "This parameter is deprecated. This is deprecated, use \&quot;appKey\&quot; instead.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_type",
      "description" => "This parameter is deprecated. This is deprecated, use \&quot;appKey\&quot; instead.",
      "dataType" => "String",
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
      "name" => "latitude",
      "description" => "The current location of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The current location of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/like/delete', {
  "resourcePath" => "/Like",
  "summary" => "Delete Like",
  "nickname" => "remove_like",
  "responseClass" => "LikableResponse",
  "endpoint" => "/like/delete",
  "notes" => "Removes a like. This will make the user \"neutral\".",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The unique device identifier that made the request (either deviceId or accountId must be used)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The unique accountId that made the request (either deviceId or accountId must be used)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "likable_type",
      "description" => "The type of the likable object {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, NOTE, THEME_DESCRIPTOR}",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "likable_id",
      "description" => "The id of the likable object",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "The current location of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The current location of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/like/search', {
  "resourcePath" => "/Like",
  "summary" => "Search Likes",
  "nickname" => "search_likes",
  "responseClass" => "SearchResponse",
  "endpoint" => "/like/search",
  "notes" => "Search for likes on a likable object.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The unique device identifier that made the request (either deviceId or accountId must be used)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The unique accountId that made the request (either deviceId or accountId must be used)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_account_ids",
      "description" => "Comma separated list of account IDs for filtering on users",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "likable_type",
      "description" => "The type of the likable object {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, NOTE, THEME_DESCRIPTOR}",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "likable_id",
      "description" => "The id of the likable object",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "The field to sort by. Possible values include: ID",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'ID'",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "Determines whether the sorted list is in descending or ascending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "updated_since",
      "description" => "return items that have been updated since this date (time-stamp in milliseconds)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "updated_before",
      "description" => "return items that have been updated before this date (time-stamp in milliseconds)",
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

