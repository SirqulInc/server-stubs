require 'json'


MyApp.add_route('POST', '/api/{version}/creative/addpreview', {
  "resourcePath" => "/Creative",
  "summary" => "Add Preview",
  "nickname" => "add_preview",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/creative/addpreview",
  "notes" => "Enable this ad for preview for this account.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the account",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "creative_id",
      "description" => "The id of the creative that want to enable preview. The type of the creative should be CONFIG, otherwise no action will be applied.",
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


MyApp.add_route('GET', '/api/{version}/ads/find', {
  "resourcePath" => "/Creative",
  "summary" => "Find Missions",
  "nickname" => "ads_find",
  "responseClass" => "Array<MissionResponse>",
  "endpoint" => "/api/{version}/ads/find",
  "notes" => "Get a set of ad filtered by the parameters provided.",
  "parameters" => [
    {
      "name" => "app_key",
      "description" => "The application key, if provided return missions specific for the app. Will always return mission levels that are app agnostic.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "type",
      "description" => "The type of ads to get, possible values are: BANNER, LEADERBOARD, SKYSCRAPER, FULL, VIDEO, ZIP, CONFIG. Use this instead of suffix.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_version",
      "description" => "The version of the application, will not return levels newer than the appVersion.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "The current location of the requesting device",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The current location of the requesting device",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "device",
      "description" => "Should use deviceId if possible. The name of the requesting device; possible values are: Android, iPhone, iPad, iPod, etc. use /audience/devices for list.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "device_identifier",
      "description" => "The device ID of the requesting device, use /audience/devices for list",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "device_version",
      "description" => "The requesting device version; examples are: 2.3, 5.1.4, 6.1.4. Supports X, X.X, or X.X.X formated string.",
      "dataType" => "String",
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
      "name" => "include_audiences",
      "description" => "If true then return the audience data in the response. Default is false.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "allocates_tickets",
      "description" => "If true/false only return missions whose game levels allocate (or don&#39;t allocate) tickets. Do not provide a value to return both.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "randomize",
      "description" => "return a random set of results, default is true. If false returns in nature order.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "targeted_ads_only",
      "description" => "return only ads targets to the specific app, no global ads.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_ids",
      "description" => "return only ads from the specified campaigns.",
      "dataType" => "String",
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


MyApp.add_route('POST', '/api/{version}/creative/create', {
  "resourcePath" => "/Creative",
  "summary" => "Create Creative",
  "nickname" => "create_creative",
  "responseClass" => "CreativeResponse",
  "endpoint" => "/api/{version}/creative/create",
  "notes" => "Create a creative",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the level.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "The description of the level.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_image_id",
      "description" => "The asset Id of the level image.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "action",
      "description" => "This parameter is deprecated. deprecated use data field",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "data",
      "description" => "The creative data, json based format depending on type. If not using action then data is required.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "suffix",
      "description" => "This parameter is deprecated. deprecated use type field",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "type",
      "description" => "The type of creative. If not using suffix then type is required.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "balance",
      "description" => "Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "If true set the game level as active. Default is false.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "reference_id",
      "description" => "if creative related so some other content provided the id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_version",
      "description" => "The version of the application, will not return creatives newer than the appVersion. Only used when requesting application configuration creatives.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_id",
      "description" => "Assign the creative to a campaign for timing and audience matching.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_id",
      "description" => "the id of the offer",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "wait_for_asset",
      "description" => "determines whether the response will wait until the asset gets created",
      "dataType" => "Boolean",
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


MyApp.add_route('POST', '/api/{version}/creative/delete', {
  "resourcePath" => "/Creative",
  "summary" => "Delete Creative",
  "nickname" => "delete_creative",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/creative/delete",
  "notes" => "Delete a creative",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "creative_id",
      "description" => "the id of the creative to delete",
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


MyApp.add_route('GET', '/api/{version}/creative/get', {
  "resourcePath" => "/Creative",
  "summary" => "Get Creative",
  "nickname" => "get_creative",
  "responseClass" => "CreativeResponse",
  "endpoint" => "/api/{version}/creative/get",
  "notes" => "Get a creative",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "creative_id",
      "description" => "the ID of the creative to get",
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


MyApp.add_route('GET', '/api/{version}/creative/search', {
  "resourcePath" => "/Creative",
  "summary" => "Search Creatives",
  "nickname" => "get_creatives_by_application",
  "responseClass" => "Array<CreativeResponse>",
  "endpoint" => "/api/{version}/creative/search",
  "notes" => "Get a list of levels for an application, just those the account has permissions to view.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
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
      "description" => "Creatives contained in the provided mission.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "Match the keyword to the owner name or level name.",
      "dataType" => "String",
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


MyApp.add_route('POST', '/api/{version}/creative/removepreview', {
  "resourcePath" => "/Creative",
  "summary" => "Remove Preview",
  "nickname" => "remove_preview",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/creative/removepreview",
  "notes" => "Remove this ad for preview for this account.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the ID of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "creative_id",
      "description" => "the ID of the creative to remove preview",
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


MyApp.add_route('POST', '/api/{version}/creative/update', {
  "resourcePath" => "/Creative",
  "summary" => "Update Creative",
  "nickname" => "update_creative",
  "responseClass" => "CreativeResponse",
  "endpoint" => "/api/{version}/creative/update",
  "notes" => "Update a creative",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "creative_id",
      "description" => "the creative Id to upate.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the level.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "The description of the level.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_image_id",
      "description" => "The asset Id of the level image.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "action",
      "description" => "This parameter is deprecated. deprecated use data field",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "data",
      "description" => "The creative data, json based format depending on type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "suffix",
      "description" => "This parameter is deprecated. deprecated use type field",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "type",
      "description" => "The type of creative.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "balance",
      "description" => "Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "If true set the game level as active. Default is false.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "reference_id",
      "description" => "if creative related so some other content provided the id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_version",
      "description" => "The version of the application, will not return creatives newer than the appVersion. Only used when requesting application configuration creatives.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_id",
      "description" => "Assign the creative to a campaign for timing and audience matching.",
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

