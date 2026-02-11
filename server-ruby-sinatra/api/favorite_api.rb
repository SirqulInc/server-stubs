require 'json'


MyApp.add_route('POST', '/api/3.18/favorite/create', {
  "resourcePath" => "/Favorite",
  "summary" => "Create Favorite",
  "nickname" => "add_favorite",
  "responseClass" => "WrappedResponse",
  "endpoint" => "/favorite/create",
  "notes" => "Adds an offer, offer location, retailer location, or category to your favorites.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The unique ID given by the device (deviceId or accountId required)",
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
      "name" => "favoritable_id",
      "description" => "The ID of the object to favorite {offerId, offerLocationId, retailerLocationId, categoryId}",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "favoritable_type",
      "description" => "The type of the object to favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY, ALBUM}",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "The current latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The current longitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/favorite/delete', {
  "resourcePath" => "/Favorite",
  "summary" => "Delete Favorite",
  "nickname" => "delete_favorite",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/favorite/delete",
  "notes" => "Removes a favorited item from the user's favorites list.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The unique ID given by the device (deviceId or accountId required)",
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
      "name" => "favorite_id",
      "description" => "The ID of the favorite reference record (only optional if favoritableId &amp; favoritableType is pass in instead)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "favoritable_id",
      "description" => "The ID of the object to un-favorite {offerId, offerLocationId, retailerLocationId, categoryId} (this is required if favoriteId is NOT passed in)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "favoritable_type",
      "description" => "The type of the object to un-favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY} (this is required if favoriteId is NOT passed in)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/favorite/get', {
  "resourcePath" => "/Favorite",
  "summary" => "Get Favorite",
  "nickname" => "get_favorite",
  "responseClass" => "WrappedResponse",
  "endpoint" => "/favorite/get",
  "notes" => "Retrieves a single favorited item.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The unique ID given by the device (deviceId or accountId required)",
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
      "name" => "favorite_id",
      "description" => "The ID of the favorite reference record",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "The current latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The current longitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/favorite/search', {
  "resourcePath" => "/Favorite",
  "summary" => "Search Favorites",
  "nickname" => "search_favorites",
  "responseClass" => "SearchResponse",
  "endpoint" => "/favorite/search",
  "notes" => "Searches on the user's favorites.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The unique ID given by the device (deviceId or accountId required)",
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
      "description" => "The ID of an account the user would like to view favorites for",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "favoritable_type",
      "description" => "The type of the object to favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY}",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "secondary_type",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "The keyword to search for",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "Determines what to sort the results by {CREATED, UPDATED, DISPLAY}",
      "dataType" => "String",
      "allowableValues" => "[ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, DISPLAY]",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "Determines whether the results are in descending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "The start index for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "The limit for pagination (there is a hard limit of 1000)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active_only",
      "description" => "Determines whether to only return active favorites",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_full_response",
      "description" => "Determines whether to return a detailed version of the response list",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "The current latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The current longitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/favorite/whois', {
  "resourcePath" => "/Favorite",
  "summary" => "Who has Favorited",
  "nickname" => "who_has_favorited",
  "responseClass" => "Array<AccountResponse>",
  "endpoint" => "/favorite/whois",
  "notes" => "Searches for everyone that has favorited an item",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The unique ID given by the device (deviceId or accountId required)",
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
      "name" => "latitude",
      "description" => "The current latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The current longitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "favoritable_id",
      "description" => "The ID of the favoritableType to search on",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "favoritable_type",
      "description" => "The type of the object to favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY}",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "The keyword to limit that account list",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "The start index for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "The limit for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

