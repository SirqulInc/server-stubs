require 'json'


MyApp.add_route('POST', '/api/{version}/wallet/create', {
  "resourcePath" => "/Wallet",
  "summary" => "Create Wallet Offers",
  "nickname" => "create_offer_transaction",
  "responseClass" => "Array<OfferTransactionResponse>",
  "endpoint" => "/api/{version}/wallet/create",
  "notes" => "Adds offers to the wallet",
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
      "name" => "offer_id",
      "description" => "The id of the offer being added (offerId or offeLocationId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_location_id",
      "description" => "The id of the offer location being added (offerId or offeLocationId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_cart",
      "description" => "A JSON list of offers to purchase. &#x60;&#x60;&#x60;json [   {     \&quot;offerId\&quot;: 123,     \&quot;offerLocationId\&quot;: 234,     \&quot;quantity\&quot;: 2   },   {     \&quot;offerId\&quot;: 456,     \&quot;offerLocationId\&quot;: 567,     \&quot;quantity\&quot;: 1   } ] &#x60;&#x60;&#x60; ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "promo_code",
      "description" => "The promoCode",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "currency_type",
      "description" => "Determines the method of purchasing offer. CASH &#x3D; use card on file, POINTS &#x3D; use points, TICKETS &#x3D; use tickets",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'CASH'",
      "paramType" => "query",
    },
    {
      "name" => "use_points",
      "description" => "Sets the currencyType to POINTS",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "meta_data",
      "description" => "External custom client defined data",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application requesting the purchase, required when currencyType is TICKETS",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "status",
      "description" => "Custom status value to change to (0 or 1 for redeem, 5 or 6 for membership)",
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


MyApp.add_route('POST', '/api/{version}/wallet/delete', {
  "resourcePath" => "/Wallet",
  "summary" => "Delete Wallet Offer",
  "nickname" => "delete_offer_transaction",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/wallet/delete",
  "notes" => "Removes the transaction from the wallet by setting the deleted date to the current date/time.  Requires a valid account and transactionId.",
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
      "name" => "transaction_id",
      "description" => "The offer transaction id to remove",
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


MyApp.add_route('GET', '/api/{version}/wallet/get', {
  "resourcePath" => "/Wallet",
  "summary" => "Get Wallet Offer",
  "nickname" => "get_offer_transaction",
  "responseClass" => "OfferTransactionResponse",
  "endpoint" => "/api/{version}/wallet/get",
  "notes" => "",
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
      "name" => "transaction_id",
      "description" => "The offer transaction id to get details of",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_mission",
      "description" => "If true then include mission data, false to not include",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "The latitude location of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The latitude location of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_full_response",
      "description" => "Determines whether to return a detailed version of the response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
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


MyApp.add_route('POST', '/api/{version}/wallet/preview', {
  "resourcePath" => "/Wallet",
  "summary" => "Preview Wallet Offers",
  "nickname" => "preview_offer_transaction",
  "responseClass" => "Array<OfferTransactionResponse>",
  "endpoint" => "/api/{version}/wallet/preview",
  "notes" => "Preview the final cost of a transaction without charging the user",
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
      "name" => "offer_id",
      "description" => "The id of the offer being added (offerId or offeLocationId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_location_id",
      "description" => "The id of the offer location being added (offerId or offeLocationId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_cart",
      "description" => "A JSON list of offers to purchase.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "promo_code",
      "description" => "The promoCode",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "currency_type",
      "description" => "Determines the method of purchasing offer. CASH &#x3D; use card on file, POINTS &#x3D; use points, TICKETS &#x3D; use tickets",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'CASH'",
      "paramType" => "query",
    },
    {
      "name" => "use_points",
      "description" => "Sets the currencyType to POINTS",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "meta_data",
      "description" => "External custom client defined data",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application requesting the purchase, required when currencyType is TICKETS",
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


MyApp.add_route('GET', '/api/{version}/wallet/search', {
  "resourcePath" => "/Wallet",
  "summary" => "Search Wallet Offers",
  "nickname" => "search_offer_transactions",
  "responseClass" => "Array<OfferTransactionResponse>",
  "endpoint" => "/api/{version}/wallet/search",
  "notes" => "Search on active offers currently in the user's wallet, or past offers the user has already redeemed.",
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
      "name" => "keyword",
      "description" => "The keyword to search for",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_id",
      "description" => "Filter results for this retailer",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_ids",
      "description" => "Filter results for a list of retailers",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_location_id",
      "description" => "Filter results for this retailer location",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_location_ids",
      "description" => "Filter results for a list of retailer locations",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "exclude_retailer_location_ids",
      "description" => "Filter results to exclude retailer locations",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_id",
      "description" => "Filter results for this offer",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_ids",
      "description" => "Filter results for a list of offer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_location_id",
      "description" => "Filter results for this offer location",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_location_ids",
      "description" => "Filter results for a list of offer locations",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_type",
      "description" => "Filter results to return a specific offer type",
      "dataType" => "String",
      "allowableValues" => "[VOUCHER, COUPON, PRODUCT, MEDIA, EVENT, DEVICE]",
      "paramType" => "query",
    },
    {
      "name" => "offer_types",
      "description" => "Filter results to return specific offer types",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "special_offer_type",
      "description" => "Filter results to return a specific special offer type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "special_offer_types",
      "description" => "Filter results to return specific special offer types",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "Category Ids",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_ids",
      "description" => "Filter Ids",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_audience_ids",
      "description" => "Offer Audience Ids",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "Determines what to sort the results by",
      "dataType" => "String",
      "allowableValues" => "[ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, REDEEMABLE_START, REDEEMABLE_END, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY]",
      "defaultValue" => "'CREATED'",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "Determines whether the results are in descending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
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
    {
      "name" => "latitude",
      "description" => "The latitude location of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The latitude location of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "redeemable_start_date",
      "description" => "Filter results by the offer redeemable date",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "redeemable_end_date",
      "description" => "Filter results by the offer redeemable date",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_by_parent_offer",
      "description" => "Apply params to offer&#39;s parent",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "started_since",
      "description" => "Filter results by the offer start date",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "started_before",
      "description" => "Filter results by the offer start date",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ended_since",
      "description" => "Filter results by the offer end date",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ended_before",
      "description" => "Filter results by the offer end date",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "redeemed",
      "description" => "If true return redeemed transactions (status 2), otherwise return active transactions (status 0 or 1)",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "statuses",
      "description" => "Custom status value to change to (0 or 1 for redeem, 5 or 6 for membership)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "reservations_only",
      "description" => "Returns only reservation transactions if true",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "active_only",
      "description" => "Active Only",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "return_full_response",
      "description" => "Determines whether to return a detailed version of the response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "recurring_started_since",
      "description" => "Filter results by the recurring billing start date",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "recurring_started_before",
      "description" => "Filter results by the recurring billing start date",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "recurring_expiration_since",
      "description" => "Filter results by the recurring billing expiration date",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "recurring_expiration_before",
      "description" => "Filter results by the recurring billing expiration date",
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


MyApp.add_route('POST', '/api/{version}/wallet/update', {
  "resourcePath" => "/Wallet",
  "summary" => "Update Wallet Offer",
  "nickname" => "update_offer_transaction",
  "responseClass" => "OfferTransactionResponse",
  "endpoint" => "/api/{version}/wallet/update",
  "notes" => "Update offer status. The status values are: 0 - not redeemable, 1 - redeemable.  Not redeemable means the customer has received the offer but has not decided to use (or print) it yet.  Until they choose to do this the merchant cannot redeem the offer (has not been given permission yet).   Redeemable means the customer has chosen to use the offer and wishes to redeem it.  Redeemed means the merchant has accepted the offer and the given the customer its value, then marked it a used in the system.  This status change is handled by a merchant end point.",
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
      "name" => "transaction_id",
      "description" => "The offer transaction id to remove",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_location_id",
      "description" => "Offer Location Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "currency_type",
      "description" => "Currency Type",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'CASH'",
      "paramType" => "query",
    },
    {
      "name" => "use_points",
      "description" => "Use Points",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "App Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "status",
      "description" => "The status value to change to (0 or 1)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "The latitude location of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The latitude location of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "meta_data",
      "description" => "External custom client defined data",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_full_response",
      "description" => "Determines whether to return a detailed version of the response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "exception_membership_offer_ids",
      "description" => "Exception Offers, transaction audiences of these offers won&#39;t be removed out of the account when up",
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

