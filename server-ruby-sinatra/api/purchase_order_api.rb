require 'json'


MyApp.add_route('POST', '/api/{version}/order/create', {
  "resourcePath" => "/PurchaseOrder",
  "summary" => "Create Order",
  "nickname" => "create_order",
  "responseClass" => "OrderResponse",
  "endpoint" => "/api/{version}/order/create",
  "notes" => "Creates a new purchase with some number of items associated with it. The purchase is added to the order that was created",
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
      "description" => "The application requesting the purchase",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "A description of the purchase",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "currency_type",
      "description" => "Determines the method of purchasing offer.  * VOID: used for when there is no payment involved (ie. for updating the status of a purchase order)  * CASH: use card on file  * POINTS: use account balance  * TICKETS: use tickets  * REFUND: not allowed for a create, requires a paymentTransactionId.  * CREDIT: add to the account balance  * RELOAD: charge a credit card then add to the account balance  ",
      "dataType" => "String",
      "allowableValues" => "[VOID, CASH, POINTS, TICKETS, REFUND, CREDIT, RELOAD]",
      "defaultValue" => "'CASH'",
      "paramType" => "query",
    },
    {
      "name" => "cart",
      "description" => "&#x60;&#x60;&#x60;json [   { \&quot;orderItemType\&quot;: \&quot;OFFER\&quot;, \&quot;orderItemId\&quot;: 234, \&quot;orderCustomType\&quot;: \&quot;OfferLocation\&quot;, \&quot;orderCustomId\&quot;: 123, \&quot;retailerLocationId\&quot;: 1234, \&quot;quantity\&quot;: 2 },   { \&quot;orderItemType\&quot;: \&quot;OFFER\&quot;, \&quot;orderItemId\&quot;: 235, \&quot;quantity\&quot;: 2 },   { \&quot;orderItemType\&quot;: \&quot;CUSTOM\&quot;, \&quot;amount\&quot;: 10.50, \&quot;orderCustomType\&quot;: \&quot;ServiceFee\&quot; },   { \&quot;orderItemType\&quot;: \&quot;CUSTOM\&quot;, \&quot;amount\&quot;: 25.10, \&quot;quantity\&quot;: 2, \&quot;orderCustomType\&quot;: \&quot;Hat\&quot;, \&quot;orderCustomId\&quot;: 123 } ] &#x60;&#x60;&#x60; ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "payment_method_id",
      "description" => "Use a specific payment method (CASH), if not provided use default",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_order_id",
      "description" => "Store identifier from external system",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_payment_id",
      "description" => "Store identifier from external system",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "remote_ref_type",
      "description" => "Remote Reference type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_date",
      "description" => "External Date",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "promo_code",
      "description" => "The Promo Code",
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


MyApp.add_route('POST', '/api/{version}/order/delete', {
  "resourcePath" => "/PurchaseOrder",
  "summary" => "Delete Order",
  "nickname" => "delete_order",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/order/delete",
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
      "name" => "order_id",
      "description" => "Order Id",
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


MyApp.add_route('GET', '/api/{version}/order/get', {
  "resourcePath" => "/PurchaseOrder",
  "summary" => "Get Order",
  "nickname" => "get_order",
  "responseClass" => "OrderResponse",
  "endpoint" => "/api/{version}/order/get",
  "notes" => "Get an order record",
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
      "name" => "order_id",
      "description" => "The order id to get details of, either orderId or externalOrderId must be provided",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_order_id",
      "description" => "The external order id to get details of, either orderId or externalOrderId must be provided",
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


MyApp.add_route('POST', '/api/{version}/order/preview', {
  "resourcePath" => "/PurchaseOrder",
  "summary" => "Preview Order",
  "nickname" => "preview_order",
  "responseClass" => "OrderResponse",
  "endpoint" => "/api/{version}/order/preview",
  "notes" => "Previews a purchase to see the total cost before making it.",
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
      "description" => "The application requesting the purchase",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "A description of the purchase",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "currency_type",
      "description" => "Determines the method of purchasing offer. &#x60;&#x60;&#x60;json {   \&quot;VOID\&quot;: \&quot;used for when there is no payment involved (ie. for updating the status of a purchase order)\&quot;,   \&quot;CASH\&quot;: \&quot;use card on file\&quot;,   \&quot;POINTS\&quot;: \&quot;use account balance\&quot;,   \&quot;TICKETS\&quot;: \&quot;use tickets\&quot;,   \&quot;REFUND\&quot;: \&quot;not allowed for a create, requires a paymentTransactionId\&quot;,   \&quot;CREDIT\&quot;: \&quot;add to the account balance\&quot;,   \&quot;RELOAD\&quot;: \&quot;charge a credit card then add to the account balance\&quot; } &#x60;&#x60;&#x60; ",
      "dataType" => "String",
      "allowableValues" => "[VOID, CASH, POINTS, TICKETS, REFUND, CREDIT, RELOAD]",
      "defaultValue" => "'CASH'",
      "paramType" => "query",
    },
    {
      "name" => "cart",
      "description" => "A JSON list of items to purchase",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "payment_method_id",
      "description" => "Use a specific payment method (CASH), if not provided use default",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_order_id",
      "description" => "Store identifier from external system",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_payment_id",
      "description" => "Store identifier from external system",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "remote_ref_type",
      "description" => "Remote Reference type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_date",
      "description" => "External Date",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "promo_code",
      "description" => "The Promo Code",
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


MyApp.add_route('GET', '/api/{version}/order/search', {
  "resourcePath" => "/PurchaseOrder",
  "summary" => "Search Orders",
  "nickname" => "search_orders",
  "responseClass" => "Array<OrderResponse>",
  "endpoint" => "/api/{version}/order/search",
  "notes" => "Search on active orders by customer",
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
      "description" => "The application requesting the purchase",
      "dataType" => "String",
      "allowableValues" => "",
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
      "name" => "descending",
      "description" => "Determines whether to return the resulting list in descending or ascending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "active_only",
      "description" => "Only return active orders",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "ignore_customer_filter",
      "description" => "Determines whether to ignore the customer filter (requires an Admin/Exec account)",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "order_item_types",
      "description" => "Filter results by orderItemTypes",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "order_item_ids",
      "description" => "Filter results by orderItemIds",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "order_custom_types",
      "description" => "Filter results by orderCustomTypes",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "order_custom_ids",
      "description" => "Filter results by orderCustomIds",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "Determines what to sort the results by",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'ID'",
      "paramType" => "query",
    },
    {
      "name" => "offer_types",
      "description" => "Filter results by offer type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "special_offer_types",
      "description" => "Filter results by special offer type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "Filter results by category Ids",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_ids",
      "description" => "Filter results by filter Ids",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_audience_ids",
      "description" => "Filter results by offer audience Ids",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "transaction_audience_ids",
      "description" => "Filter results by transaction audience Ids",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_ids",
      "description" => "Filter results by offer Ids",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_location_ids",
      "description" => "Filter results by offer location Ids",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_ids",
      "description" => "Filter results by retailer Ids",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_location_ids",
      "description" => "Filter results by retailer location Ids",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "statuses",
      "description" => "Filter results by offer transaction status (0: non-redeemable, 1: redeemable, 2: redeemed, 3: user deleted, 4: unclaimed/rewarded, 5: membership active, 6: membership cancelled)",
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


MyApp.add_route('POST', '/api/{version}/order/update', {
  "resourcePath" => "/PurchaseOrder",
  "summary" => "Update Order",
  "nickname" => "update_order",
  "responseClass" => "OrderResponse",
  "endpoint" => "/api/{version}/order/update",
  "notes" => "Updates new purchase with some number of items associated with it. The orderId provided is used to retrieve the record and the payment is added to it.",
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
      "name" => "order_id",
      "description" => "The order to add the purchase to, leave null for new order.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "payment_transaction_id",
      "description" => "The payment transaction to apply the refund to",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application requesting the purchase",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "A description of the purchase",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "currency_type",
      "description" => "Determines the method of purchasing offer.  * VOID: used for when there is no payment involved (ie. for updating the status of a purchase order)  * CASH: use card on file  * POINTS: use account balance  * TICKETS: use tickets  * REFUND: not allowed for a create, requires a paymentTransactionId.  * CREDIT: add to the account balance  * RELOAD: charge a credit card then add to the account balance  ",
      "dataType" => "String",
      "allowableValues" => "[VOID, CASH, POINTS, TICKETS, REFUND, CREDIT, RELOAD]",
      "defaultValue" => "'CASH'",
      "paramType" => "query",
    },
    {
      "name" => "cart",
      "description" => "&#x60;&#x60;&#x60;json [   { \&quot;orderItemType\&quot;: \&quot;OFFER\&quot;, \&quot;orderItemId\&quot;: 234, \&quot;orderCustomType\&quot;: \&quot;OfferLocation\&quot;, \&quot;orderCustomId\&quot;: 123, \&quot;retailerLocationId\&quot;: 1234, \&quot;quantity\&quot;: 2 },   { \&quot;orderItemType\&quot;: \&quot;OFFER\&quot;, \&quot;orderItemId\&quot;: 235, \&quot;quantity\&quot;: 2 },   { \&quot;orderItemType\&quot;: \&quot;CUSTOM\&quot;, \&quot;amount\&quot;: 10.50, \&quot;orderCustomType\&quot;: \&quot;ServiceFee\&quot; },   { \&quot;orderItemType\&quot;: \&quot;CUSTOM\&quot;, \&quot;amount\&quot;: 25.10, \&quot;quantity\&quot;: 2, \&quot;orderCustomType\&quot;: \&quot;Hat\&quot;, \&quot;orderCustomId\&quot;: 123 } ] &#x60;&#x60;&#x60; ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "payment_method_id",
      "description" => "Use a specific payment method (CASH), if not provided use default",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_payment_id",
      "description" => "Store identifier from external system",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_date",
      "description" => "External Date",
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

