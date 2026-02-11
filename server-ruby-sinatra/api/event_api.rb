require 'json'


MyApp.add_route('POST', '/api/3.18/event/attend', {
  "resourcePath" => "/Event",
  "summary" => "Attend Event",
  "nickname" => "attend_event",
  "responseClass" => "OfferResponse",
  "endpoint" => "/event/attend",
  "notes" => " Specify whether the user is attending an event at a particular location. This can also be used as a \"check-in\" action.",
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
      "description" => "The account id (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application of where to send notifications about the attend action",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "listing_id",
      "description" => "The scheduled broadcast or marketing experience id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_location_id",
      "description" => "The retailer location where the event is being held",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_location_id",
      "description" => "The actual event being held",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "transaction_id",
      "description" => "The wallet item to update the status of, if provided then ignore the listingId, retailerLocationId, and the offerLocationId",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "status",
      "description" => "Sets whether the user is: undecided (0), attending (1), attending and checked in (2), or not attending (3)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "The location of the status update",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The location of the status update",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/event/create', {
  "resourcePath" => "/Event",
  "summary" => "Create Event",
  "nickname" => "create_event",
  "responseClass" => "OfferResponse",
  "endpoint" => "/event/create",
  "notes" => "Create a private event to share with associates.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_location_ids",
      "description" => "The retailer location to have the event at",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "The event title",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sub_title",
      "description" => "The event sub title",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "details",
      "description" => "The event details",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "The categories the associate the event with",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_ids",
      "description" => "The filters the associate the event with",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "Is this event active",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "image_asset_id",
      "description" => "The image to show for the event",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "redeemable_start",
      "description" => "The event start date/time",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "redeemable_end",
      "description" => "The event end date/time",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "meta_data",
      "description" => "external custom client defined data",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/event/delete', {
  "resourcePath" => "/Event",
  "summary" => "Delete Event",
  "nickname" => "delete_event",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/event/delete",
  "notes" => "Delete an event that the user has permissions to.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "event_id",
      "description" => "the id of the event to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/event/get', {
  "resourcePath" => "/Event",
  "summary" => "Get Event",
  "nickname" => "get_event",
  "responseClass" => "OfferResponse",
  "endpoint" => "/event/get",
  "notes" => "Get an event.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "event_id",
      "description" => "The id of the event to return",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/event/attendance/search', {
  "resourcePath" => "/Event",
  "summary" => "Search Event Attendance",
  "nickname" => "search_event_transactions",
  "responseClass" => "Array<EventAttendanceResponse>",
  "endpoint" => "/event/attendance/search",
  "notes" => "Searches on event type transactions. This can be used to see who is attending an event.",
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
      "description" => "The application key",
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
      "name" => "retailer_id",
      "description" => "Filter results for this retailer",
      "dataType" => "Integer",
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
      "name" => "exclude_retailer_location_id",
      "description" => "Exclude results from this retailer location",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "listing_id",
      "description" => "Filter results for this event listing",
      "dataType" => "Integer",
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
      "name" => "offer_location_id",
      "description" => "Filter results for this offer location",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "customer_account_ids",
      "description" => "Filter results by accounts",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "affiliated_category_ids",
      "description" => "Comma separated list of category ids to determine whether the attendee is affiliated with the category",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "Filter on attendance starting on or after this date (milliseconds since epoch)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "Filter on attendance starting on or before this date (milliseconds since epoch)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "statuses",
      "description" => "Comma separated list of transaction statuses to filter on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "Determines what to sort the results by {CREATED, UPDATED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY}",
      "dataType" => "String",
      "allowableValues" => "[ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, REDEEMABLE_START, REDEEMABLE_END, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY]",
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


MyApp.add_route('GET', '/api/3.18/event/search', {
  "resourcePath" => "/Event",
  "summary" => "Search Events",
  "nickname" => "search_events",
  "responseClass" => "Array<OfferShortResponse>",
  "endpoint" => "/event/search",
  "notes" => "Searches on events that the account has access to.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
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
      "name" => "active_only",
      "description" => "Return only active results",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "the IDs of the categories that this event is associated with",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_ids",
      "description" => "the IDs of the filters that this event is associated with",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_audience_ids",
      "description" => "Offer audience ids to filter on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "transaction_audience_ids",
      "description" => "Transaction audience ids to filter on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY",
      "dataType" => "String",
      "allowableValues" => "[ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, REDEEMABLE_START, REDEEMABLE_END, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, VOUCHER_DISCOUNT_PRICE, FULL_PRICE, DICOUNT_PRICE, TICKETS_REWARD, AVAILABILITY_DATE, RELEASE_DATE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY]",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "The order to return the search results",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "Filter the events to return only those that start on or after the date",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "Filter the events to return only those that start on or before the date",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "The record to begin the return set on",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "The number of records to return",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/event/update', {
  "resourcePath" => "/Event",
  "summary" => "Update Event",
  "nickname" => "update_event",
  "responseClass" => "OfferResponse",
  "endpoint" => "/event/update",
  "notes" => "Update a private event to share with associates.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "event_id",
      "description" => "The id of the event to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_location_ids",
      "description" => "The retailer location to have the event at",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "The event title",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sub_title",
      "description" => "The event sub title",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "details",
      "description" => "The event details",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "The categories the associate the event with",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_ids",
      "description" => "The filters the associate the event with",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "Is this event active",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "image_asset_id",
      "description" => "The image to show for the event",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "redeemable_start",
      "description" => "The event start date/time",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "redeemable_end",
      "description" => "The event end date/time",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

