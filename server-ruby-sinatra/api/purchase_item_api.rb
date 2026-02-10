require 'json'


MyApp.add_route('POST', '/api/{version}/purchase/create', {
  "resourcePath" => "/PurchaseItem",
  "summary" => "Create Purchase",
  "nickname" => "create_purchase_item",
  "responseClass" => "PurchaseItemFullResponse",
  "endpoint" => "/api/{version}/purchase/create",
  "notes" => "Creates a purchase item for in app purchases",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The device id (deviceId or accountId required)",
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
      "name" => "app_key",
      "description" => "The application key that the purchase can be used in",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the purchase item",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "The description of the purchase item",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tickets",
      "description" => "How much the purchase item is worth in tickets",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "price",
      "description" => "How much the purchase item will cost in real money",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "purchase_type",
      "description" => "The purchase provider &lt;ul&gt; &lt;li&gt;SIRQUL - the Sirqul store to make purchases using tickets&lt;/li&gt; &lt;li&gt;IOS - the iTunes store for iPhone, iPod, iPod Touch&lt;/li&gt; &lt;li&gt;GOOGLE - the Google Play store&lt;/li&gt; &lt;li&gt;AMAZON - the Amazon Android store&lt;/li&gt; &lt;li&gt;MAC - the iTunes store for OSX&lt;/li&gt; &lt;li&gt;WP8 - the Windows Phone 8 store&lt;/li&gt; &lt;li&gt;FREE - used for purchase items that are free (can be used for development/testing purposes)&lt;/li&gt; &lt;/ul&gt;",
      "dataType" => "String",
      "allowableValues" => "[SIRQUL, IOS, GOOGLE, AMAZON, MAC, WP8, FREE]",
      "paramType" => "query",
    },
    {
      "name" => "purchase_code",
      "description" => "The unique identifier used by purchase providers to identify in-app-purchases",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "secret_key",
      "description" => "A secret key from purchase providers that would be used for validation",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "purchase_limit",
      "description" => "How many times a user acquire the same purchase item",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "service_action",
      "description" => "Determines whether the purchase item will enable certain features &lt;ul&gt; &lt;li&gt;DAY_PREMIUM - subscribes a user for a day of membership&lt;/li&gt; &lt;li&gt;WEEK_PREMIUM - subscribes a user for a week of membership&lt;/li&gt; &lt;li&gt;MONTH_PREMIUM - subscribes a user for a month of membership&lt;/li&gt; &lt;li&gt;ADD_TICKET - allows a user to add more tickets to their account&lt;/li&gt; &lt;li&gt;ADD_GIFT - allows a user to send/recieve the purchase item as a gift&lt;/li&gt; &lt;/ul&gt;",
      "dataType" => "String",
      "allowableValues" => "[DAY_PREMIUM, WEEK_PREMIUM, MONTH_PREMIUM, YEAR_PREMIUM, LIFETIME_PREMIUM, ADD_TICKET, ADD_GIFT, ADD_POINTS]",
      "paramType" => "query",
    },
    {
      "name" => "cover_asset_id",
      "description" => "The cover image of the purchase item",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "promo_asset_id",
      "description" => "An application specific asset that can be used to store/provide additional data",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "giftable",
      "description" => "Determines whether the purchase item can be gifted to other users",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assetable",
      "description" => "Determines whether users can attach their own media/asset to the purchase item",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "allocate_tickets",
      "description" => "Flag to indicate owner should receive tickets for completed missions",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "ticket_type",
      "description" => "The type of ticket to reward, null means default type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "points",
      "description" => "The number of points to award for completing a mission",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_location_id",
      "description" => "The offer location that will get added to the user&#39;s wallet after purchase.",
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


MyApp.add_route('POST', '/api/{version}/purchase/delete', {
  "resourcePath" => "/PurchaseItem",
  "summary" => "Delete Purchase",
  "nickname" => "delete_purchase_item",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/purchase/delete",
  "notes" => "Marks the purchase item as deleted",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The device id (deviceId or accountId required)",
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
      "name" => "purchase_item_id",
      "description" => "The purchase item id",
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


MyApp.add_route('GET', '/api/{version}/purchase/get', {
  "resourcePath" => "/PurchaseItem",
  "summary" => "Get Purchase",
  "nickname" => "get_purchase_item",
  "responseClass" => "PurchaseItemFullResponse",
  "endpoint" => "/api/{version}/purchase/get",
  "notes" => "Get detailed information about a purchase item",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The device id (deviceId or accountId required)",
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
      "name" => "purchase_item_id",
      "description" => "The purchase item id",
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


MyApp.add_route('GET', '/api/{version}/purchase/search', {
  "resourcePath" => "/PurchaseItem",
  "summary" => "Search Purchases",
  "nickname" => "search_purchase_items",
  "responseClass" => "Array<PurchaseItemResponse>",
  "endpoint" => "/api/{version}/purchase/search",
  "notes" => "Search for purchasable items from the system",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The device id (deviceId or accountId required)",
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
      "name" => "app_key",
      "description" => "The application key to filter results by application",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_by_billable",
      "description" => "Determines whether to filter results by the user&#39;s billable entity",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "purchase_type",
      "description" => "A comma separated list of purchase providers to filter by. Possible values include: &lt;ul&gt; &lt;li&gt;SIRQUL - purchases from the Sirqul store using tickets&lt;/li&gt; &lt;li&gt;IOS - purchases from the iTunes store for iPhone, iPod, iPod Touch&lt;/li&gt; &lt;li&gt;GOOGLE - purchases from the Google Play store&lt;/li&gt; &lt;li&gt;AMAZON - purchases from the Amazon Android store&lt;/li&gt; &lt;li&gt;MAC - purchases from the iTunes store for OSX&lt;/li&gt; &lt;li&gt;WP8 - purchases from the Windows Phone 8 store&lt;/li&gt; &lt;li&gt;FREE - purchases that are free (can be used for development/testing purposes)&lt;/li&gt; &lt;/ul&gt;",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "service_action",
      "description" => "A comma separated list of service actions to filter results by. Possible values include: &lt;ul&gt; &lt;li&gt;DAY_PREMIUM - purchases that subscribes a user for a day of membership&lt;/li&gt; &lt;li&gt;WEEK_PREMIUM - purchases that subscribes a user for a week of membership&lt;/li&gt; &lt;li&gt;MONTH_PREMIUM - purchases that subscribes a user for a month of membership&lt;/li&gt; &lt;li&gt;ADD_TICKET - purchases that allow users to add more tickets&lt;/li&gt; &lt;li&gt;ADD_GIFT - purchases that allow users to recieve gifts&lt;/li&gt; &lt;/ul&gt;",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "The keyword used to search",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY",
      "dataType" => "String",
      "allowableValues" => "[ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, TICKETS, PRICE, PURCHASE_TYPE, PURCHASE_CODE, PURCHASE_LIMIT, SERIVCE_ACTION, GIFTABLE, ASSETABLE, APPLICATION_ID, APPLICATION_NAME]",
      "defaultValue" => "'NAME'",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "The order to return the search results",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "The record to begin the return set on",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "The number of records to return",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    {
      "name" => "active_only",
      "description" => "Return only active results",
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


MyApp.add_route('POST', '/api/{version}/purchase/update', {
  "resourcePath" => "/PurchaseItem",
  "summary" => "Update Purchase",
  "nickname" => "update_purchase_item",
  "responseClass" => "PurchaseItemFullResponse",
  "endpoint" => "/api/{version}/purchase/update",
  "notes" => "Updates a purchase item for in app purchases",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The device id (deviceId or accountId required)",
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
      "name" => "purchase_item_id",
      "description" => "The purchase item id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the purchase item",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "The description of the purchase item",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tickets",
      "description" => "How much the purchase item is worth in tickets",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "price",
      "description" => "How much the purchase item will cost in real money",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "purchase_type",
      "description" => "The purchase provider &lt;ul&gt; &lt;li&gt;SIRQUL - the Sirqul store to make purchases using tickets&lt;/li&gt; &lt;li&gt;IOS - the iTunes store for iPhone, iPod, iPod Touch&lt;/li&gt; &lt;li&gt;GOOGLE - the Google Play store&lt;/li&gt; &lt;li&gt;AMAZON - the Amazon Android store&lt;/li&gt; &lt;li&gt;MAC - the iTunes store for OSX&lt;/li&gt; &lt;li&gt;WP8 - the Windows Phone 8 store&lt;/li&gt; &lt;li&gt;FREE - used for purchase items that are free (can be used for development/testing purposes)&lt;/li&gt; &lt;/ul&gt;",
      "dataType" => "String",
      "allowableValues" => "[SIRQUL, IOS, GOOGLE, AMAZON, MAC, WP8, FREE]",
      "paramType" => "query",
    },
    {
      "name" => "purchase_code",
      "description" => "The unique identifier used by purchase providers to identify in-app-purchases",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "secret_key",
      "description" => "A secret key from purchase providers that would be used for validation",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "purchase_limit",
      "description" => "How many times a user acquire the same purchase item",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "service_action",
      "description" => "Determines whether the purchase item will enable certain features &lt;ul&gt; &lt;li&gt;DAY_PREMIUM - subscribes a user for a day of membership&lt;/li&gt; &lt;li&gt;WEEK_PREMIUM - subscribes a user for a week of membership&lt;/li&gt; &lt;li&gt;MONTH_PREMIUM - subscribes a user for a month of membership&lt;/li&gt; &lt;li&gt;ADD_TICKET - allows a user to add more tickets to their account&lt;/li&gt; &lt;li&gt;ADD_GIFT - allows a user to send/recieve the purchase item as a gift&lt;/li&gt; &lt;/ul&gt;",
      "dataType" => "String",
      "allowableValues" => "[DAY_PREMIUM, WEEK_PREMIUM, MONTH_PREMIUM, YEAR_PREMIUM, LIFETIME_PREMIUM, ADD_TICKET, ADD_GIFT, ADD_POINTS]",
      "paramType" => "query",
    },
    {
      "name" => "cover_asset_id",
      "description" => "The cover image of the purchase item",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "promo_asset_id",
      "description" => "An application specific asset that can be used to store/provide additional data",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "giftable",
      "description" => "Determines whether the purchase item can be gifted to other users",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assetable",
      "description" => "Determines whether users can attach their own media/asset to the purchase item",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "Sets whether the purchase item is active or inactive (hidden from consumers)",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "allocate_tickets",
      "description" => "Flag to indicate owner should receive tickets for completed missions",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "ticket_type",
      "description" => "The type of ticket to reward, null means default type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "points",
      "description" => "The number of points to award for completing a mission",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_location_id",
      "description" => "The offer location that will get added to the user&#39;s wallet after purchase.",
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

