require 'json'


MyApp.add_route('POST', '/api/3.18/vatom/me/rels/following/create', {
  "resourcePath" => "/Vatom",
  "summary" => "Create following",
  "nickname" => "create_following",
  "responseClass" => "void",
  "endpoint" => "/vatom/me/rels/following/create",
  "notes" => "Create following.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/vatom/b/spaces/create', {
  "resourcePath" => "/Vatom",
  "summary" => "Create Vatom Space",
  "nickname" => "create_space",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/spaces/create",
  "notes" => "Create a Vatom space.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/vatom/b/events/create', {
  "resourcePath" => "/Vatom",
  "summary" => "Create Vatom Event",
  "nickname" => "create_vatom_event",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/events/create",
  "notes" => "Create a Vatom event.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/vatom/me/rels/following/delete', {
  "resourcePath" => "/Vatom",
  "summary" => "Delete following",
  "nickname" => "delete_following",
  "responseClass" => "void",
  "endpoint" => "/vatom/me/rels/following/delete",
  "notes" => "Delete following.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_rels_key",
      "description" => "Vatom Rels Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/vatom/b/campaign/points/delete', {
  "resourcePath" => "/Vatom",
  "summary" => "Reset All Points Balance",
  "nickname" => "delete_points_balance",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/campaign/points/delete",
  "notes" => "Reset All Points Balance.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_campaign_id",
      "description" => "Vatom Campaign Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/vatom/b/spaces/delete', {
  "resourcePath" => "/Vatom",
  "summary" => "Delete Vatom Space",
  "nickname" => "delete_space",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/spaces/delete",
  "notes" => "Delete a Vatom space.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_space_id",
      "description" => "Vatom Space Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/vatom/b/events/delete', {
  "resourcePath" => "/Vatom",
  "summary" => "Delete Vatom Event",
  "nickname" => "delete_vatom_event",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/events/delete",
  "notes" => "Delete a Vatom event.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_event_id",
      "description" => "Vatom Event Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/vatom/vatoms/delete', {
  "resourcePath" => "/Vatom",
  "summary" => "Delete Vatom NFT",
  "nickname" => "delete_vatom_nft",
  "responseClass" => "void",
  "endpoint" => "/vatom/vatoms/delete",
  "notes" => "Delete Vatom NFT",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_id",
      "description" => "Vatom NFT Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/vatom/vatoms/execute-action', {
  "resourcePath" => "/Vatom",
  "summary" => "Execute Action on NFT",
  "nickname" => "execute_action_on_nft",
  "responseClass" => "void",
  "endpoint" => "/vatom/vatoms/execute-action",
  "notes" => "Execute Action on NFT.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_id",
      "description" => "Vatom NFT Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/vatoms/geo-map/search', {
  "resourcePath" => "/Vatom",
  "summary" => "Search Vatom Geo Map",
  "nickname" => "geomap_search",
  "responseClass" => "void",
  "endpoint" => "/vatom/vatoms/geo-map/search",
  "notes" => "Search Vatom Geo Map",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/b/behaviors', {
  "resourcePath" => "/Vatom",
  "summary" => "Get Vatom Business Behaviors",
  "nickname" => "get_business_behaviors",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/behaviors",
  "notes" => "Gets the behaviors of a business.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/b/coins/get', {
  "resourcePath" => "/Vatom",
  "summary" => "Get the coins for a Business",
  "nickname" => "get_business_coins_balance",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/coins/get",
  "notes" => "Get the coins for a Businesss.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/me/businesses', {
  "resourcePath" => "/Vatom",
  "summary" => "Get the user business ids",
  "nickname" => "get_business_ids",
  "responseClass" => "void",
  "endpoint" => "/vatom/me/businesses",
  "notes" => "Get the business ids the logged in user has access to.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/b/get', {
  "resourcePath" => "/Vatom",
  "summary" => "Get Vatom Business Info",
  "nickname" => "get_business_info",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/get",
  "notes" => "Gets the business info tied to this account.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/b/users', {
  "resourcePath" => "/Vatom",
  "summary" => "Get Vatom Business Users",
  "nickname" => "get_business_users",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/users",
  "notes" => "Gets the users of a business.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/b/campaign-groups/entities', {
  "resourcePath" => "/Vatom",
  "summary" => "Get Campaign Group Entities",
  "nickname" => "get_campaign_group_entities",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/campaign-groups/entities",
  "notes" => "Get campaign group entities.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_campaign_id",
      "description" => "Vatom Campaign Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/b/campaign-groups/rules', {
  "resourcePath" => "/Vatom",
  "summary" => "Get Campaign Group Rules",
  "nickname" => "get_campaign_group_rules",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/campaign-groups/rules",
  "notes" => "Get campaign group rules.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_campaign_id",
      "description" => "Vatom Campaign Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/b/campaign-groups/stats', {
  "resourcePath" => "/Vatom",
  "summary" => "Get Campaign Group Stats",
  "nickname" => "get_campaign_group_stats",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/campaign-groups/stats",
  "notes" => "Get campaign group stats.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_campaign_id",
      "description" => "Vatom Campaign Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/b/campaign-groups/get', {
  "resourcePath" => "/Vatom",
  "summary" => "Get Campaign Info",
  "nickname" => "get_campaign_info",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/campaign-groups/get",
  "notes" => "Gets the info on a campaign.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_campaign_id",
      "description" => "Vatom Campaign Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/b/events/guests/get', {
  "resourcePath" => "/Vatom",
  "summary" => "Get Vatom Event Guest List",
  "nickname" => "get_event_guest_list",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/events/guests/get",
  "notes" => "Gets the guest list of an event.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_event_id",
      "description" => "Vatom Event Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/me/inventory', {
  "resourcePath" => "/Vatom",
  "summary" => "Get Vatom User's Inventory",
  "nickname" => "get_inventory",
  "responseClass" => "void",
  "endpoint" => "/vatom/me/inventory",
  "notes" => "Gets the logged in user's Vatom Inventory.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/me/rels/following', {
  "resourcePath" => "/Vatom",
  "summary" => "Get following",
  "nickname" => "get_my_following",
  "responseClass" => "void",
  "endpoint" => "/vatom/me/rels/following",
  "notes" => "Get following.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/u/campaign/points/get', {
  "resourcePath" => "/Vatom",
  "summary" => "Get Points Balance",
  "nickname" => "get_points_balance",
  "responseClass" => "void",
  "endpoint" => "/vatom/u/campaign/points/get",
  "notes" => "Gets the points balance of a Vatom user.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_user_id",
      "description" => "Vatom User Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_campaign_id",
      "description" => "Vatom Campaign Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/b/campaign/u/points/get', {
  "resourcePath" => "/Vatom",
  "summary" => "Get Points Balance as Business",
  "nickname" => "get_points_balance_as_business",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/campaign/u/points/get",
  "notes" => "Gets the points balance of a Vatom user.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_user_id",
      "description" => "Vatom User Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_campaign_id",
      "description" => "Vatom Campaign Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/b/spaces/get', {
  "resourcePath" => "/Vatom",
  "summary" => "Get Vatom Space",
  "nickname" => "get_space",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/spaces/get",
  "notes" => "Gets the details of a space.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_space_id",
      "description" => "Vatom Space Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/b/users/coins/get', {
  "resourcePath" => "/Vatom",
  "summary" => "Get the coins for a user (as a Business)",
  "nickname" => "get_user_coins_as_business",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/users/coins/get",
  "notes" => "Get the coins for a user (as a Business).",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_user_id",
      "description" => "Vatom User Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/u/coins/get', {
  "resourcePath" => "/Vatom",
  "summary" => "Gets the coins balance for a Vatom User",
  "nickname" => "get_user_coins_balance",
  "responseClass" => "void",
  "endpoint" => "/vatom/u/coins/get",
  "notes" => "Gets the coins balance for a Vatom User.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_user_id",
      "description" => "Vatom User Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/users/rels/followers', {
  "resourcePath" => "/Vatom",
  "summary" => "Get user followers",
  "nickname" => "get_user_followers",
  "responseClass" => "void",
  "endpoint" => "/vatom/users/rels/followers",
  "notes" => "Get user followers.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_user_id",
      "description" => "Vatom User Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/users/rels/following', {
  "resourcePath" => "/Vatom",
  "summary" => "Get user following",
  "nickname" => "get_user_following",
  "responseClass" => "void",
  "endpoint" => "/vatom/users/rels/following",
  "notes" => "Get user following.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_user_id",
      "description" => "Vatom User Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/user/get', {
  "resourcePath" => "/Vatom",
  "summary" => "Get User Info",
  "nickname" => "get_user_info",
  "responseClass" => "void",
  "endpoint" => "/vatom/user/get",
  "notes" => "Get a User's Info.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_user_id",
      "description" => "Vatom User Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/me/get', {
  "resourcePath" => "/Vatom",
  "summary" => "Get Vatom User Profile",
  "nickname" => "get_user_profile",
  "responseClass" => "void",
  "endpoint" => "/vatom/me/get",
  "notes" => "Gets the logged in user's profile in Vatom.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/b/events/get', {
  "resourcePath" => "/Vatom",
  "summary" => "Get Vatom Event",
  "nickname" => "get_vatom_event",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/events/get",
  "notes" => "Gets the details of a event.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_event_id",
      "description" => "Vatom Event Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/vatoms/get', {
  "resourcePath" => "/Vatom",
  "summary" => "Get Vatom NFT Details",
  "nickname" => "get_vatom_nft",
  "responseClass" => "void",
  "endpoint" => "/vatom/vatoms/get",
  "notes" => "Get Vatom NFT Details",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_id",
      "description" => "Vatom NFT Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/b/communities/search', {
  "resourcePath" => "/Vatom",
  "summary" => "List Vatom Communities",
  "nickname" => "list_communities",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/communities/search",
  "notes" => "Gets the communities tied to a business.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/b/events/search', {
  "resourcePath" => "/Vatom",
  "summary" => "List Vatom Events",
  "nickname" => "list_events",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/events/search",
  "notes" => "Gets the events tied to a business.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/b/spaces/search', {
  "resourcePath" => "/Vatom",
  "summary" => "List Vatom Spaces",
  "nickname" => "list_spaces",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/spaces/search",
  "notes" => "Gets the spaces tied to a business.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/u/coins/txns/search', {
  "resourcePath" => "/Vatom",
  "summary" => "List Coin Transactions for a Vatom User",
  "nickname" => "list_user_coin_transactions",
  "responseClass" => "void",
  "endpoint" => "/vatom/u/coins/txns/search",
  "notes" => "Gets the logged in user's Vatom coin transactions.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_user_id",
      "description" => "Vatom User Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/b/users/coins/txns/search', {
  "resourcePath" => "/Vatom",
  "summary" => "List coin transactions for a user (as a Business)",
  "nickname" => "list_user_coin_transactions_as_business",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/users/coins/txns/search",
  "notes" => "List coin transactions for a user (as a Business).",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_user_id",
      "description" => "Vatom User Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/vatom/me/vatoms/actions', {
  "resourcePath" => "/Vatom",
  "summary" => "Perform Action on NFT",
  "nickname" => "perform_action_on_nft",
  "responseClass" => "void",
  "endpoint" => "/vatom/me/vatoms/actions",
  "notes" => "Perform Action on NFT.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_id",
      "description" => "Vatom NFT Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_action",
      "description" => "Vatom Action",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/vatom/b/redemptions', {
  "resourcePath" => "/Vatom",
  "summary" => "Redeem NFT",
  "nickname" => "redeem_nft",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/redemptions",
  "notes" => "Redeem an NFT.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/vatom/b/users/coins/redeem', {
  "resourcePath" => "/Vatom",
  "summary" => "Redeem the coins for a user (as a Business)",
  "nickname" => "redeem_user_coins_as_business",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/users/coins/redeem",
  "notes" => "Redeem the coins for a user (as a Business).",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_user_id",
      "description" => "Vatom User Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/b/search', {
  "resourcePath" => "/Vatom",
  "summary" => "Search for Vatom Businesses",
  "nickname" => "search_businesses",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/search",
  "notes" => "Searches for Vatom businesses.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/b/campaign-groups/search', {
  "resourcePath" => "/Vatom",
  "summary" => "Search Campaign Groups",
  "nickname" => "search_campaign_groups",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/campaign-groups/search",
  "notes" => "Search campaign groups.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/me/identities/search', {
  "resourcePath" => "/Vatom",
  "summary" => "Search User Identities",
  "nickname" => "search_identities",
  "responseClass" => "void",
  "endpoint" => "/vatom/me/identities/search",
  "notes" => "Search User Identities.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vatom/user-inventory/search', {
  "resourcePath" => "/Vatom",
  "summary" => "Search Vatom User's Inventory",
  "nickname" => "search_inventory",
  "responseClass" => "void",
  "endpoint" => "/vatom/user-inventory/search",
  "notes" => "Searches the logged in user's Vatom Inventory.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/vatom/b/campaigns/send', {
  "resourcePath" => "/Vatom",
  "summary" => "Send NFT",
  "nickname" => "send_nft",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/campaigns/send",
  "notes" => "Send an NFT.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_campaign_id",
      "description" => "Vatom Campaign Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/vatom/b/campaign/u/points/update', {
  "resourcePath" => "/Vatom",
  "summary" => "Set Points Balance as Business",
  "nickname" => "set_points_balance_as_business",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/campaign/u/points/update",
  "notes" => "Sets the points balance of a Vatom user.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_user_id",
      "description" => "Vatom User Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_campaign_id",
      "description" => "Vatom Campaign Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/vatom/u/coins/transfer', {
  "resourcePath" => "/Vatom",
  "summary" => "Transfer coins from Vatom Users",
  "nickname" => "transfer_user_coins",
  "responseClass" => "void",
  "endpoint" => "/vatom/u/coins/transfer",
  "notes" => "Transfer coins from Vatom Users.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_user_id",
      "description" => "Vatom User Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/vatom/b/coins/update', {
  "resourcePath" => "/Vatom",
  "summary" => "Fund coins for a Business",
  "nickname" => "update_business_coins",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/coins/update",
  "notes" => "Fund/update coins for a Businesss.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/vatom/b/events/guests/update', {
  "resourcePath" => "/Vatom",
  "summary" => "Update Vatom Event Guest List",
  "nickname" => "update_event_guest_list",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/events/guests/update",
  "notes" => "Update the guest list of an event.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_event_id",
      "description" => "Vatom Event Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/vatom/b/spaces/update', {
  "resourcePath" => "/Vatom",
  "summary" => "Update Vatom Space",
  "nickname" => "update_space",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/spaces/update",
  "notes" => "Update a Vatom space.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_space_id",
      "description" => "Vatom Space Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/vatom/b/users/coins/update', {
  "resourcePath" => "/Vatom",
  "summary" => "Update the coins for a user (as a Business)",
  "nickname" => "update_user_coins_as_business",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/users/coins/update",
  "notes" => "Update the coins for a user (as a Business).",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_user_id",
      "description" => "Vatom User Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/vatom/me/update', {
  "resourcePath" => "/Vatom",
  "summary" => "Update Vatom User Profile",
  "nickname" => "update_user_profile",
  "responseClass" => "void",
  "endpoint" => "/vatom/me/update",
  "notes" => "Gets the logged in user's profile in Vatom.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/vatom/b/events/update', {
  "resourcePath" => "/Vatom",
  "summary" => "Update Vatom Event",
  "nickname" => "update_vatom_event",
  "responseClass" => "void",
  "endpoint" => "/vatom/b/events/update",
  "notes" => "Update a Vatom event.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_event_id",
      "description" => "Vatom Event Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vatom_parameters",
      "description" => "Vatom Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

