require 'json'


MyApp.add_route('POST', '/api/3.18/listing/create', {
  "resourcePath" => "/Listing",
  "summary" => "Create Listing",
  "nickname" => "create_listing",
  "responseClass" => "ListingFullResponse",
  "endpoint" => "/listing/create",
  "notes" => "Creates a listing.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the user&#39;s account ID",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "the name of the listing",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_ids",
      "description" => "comma separated list of filter IDs",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "the description of the listing",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "the start date of the listing",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "_end",
      "description" => "the end date of the listing",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "location_name",
      "description" => "the name of the location the listing will be held at",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "location_description",
      "description" => "the description of the location the listing will be held at",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "is_private",
      "description" => "determines whether the listing is public or private",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "external_id",
      "description" => "external identifier used by a third party",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_id2",
      "description" => "secondary external identifier used by a third party",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_group_id",
      "description" => "external group identifier used by a third party",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "Sets the active flag",
      "dataType" => "Boolean",
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


MyApp.add_route('POST', '/api/3.18/listing/delete', {
  "resourcePath" => "/Listing",
  "summary" => "Delete Listing",
  "nickname" => "delete_listing",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/listing/delete",
  "notes" => "Delete a listing.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "listing_id",
      "description" => "the id of the listing to delete",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/listing/get', {
  "resourcePath" => "/Listing",
  "summary" => "Get Listing",
  "nickname" => "get_listing",
  "responseClass" => "ListingFullResponse",
  "endpoint" => "/listing/get",
  "notes" => "Get a listing by id.",
  "parameters" => [
    {
      "name" => "listing_id",
      "description" => "the id of the listing to get",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/listing/search', {
  "resourcePath" => "/Listing",
  "summary" => "Search Listings",
  "nickname" => "search_listing",
  "responseClass" => "Array<ListingResponse>",
  "endpoint" => "/listing/search",
  "notes" => "Search for event listings from the start time to end time",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the account id of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "search the event name and description for this keyword",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "the record to begin the return set on",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the number of records to return",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    {
      "name" => "active_only",
      "description" => "whether to search on active listings only",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "the current latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "the current longitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "the start date to search from",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "the end date to search to",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "only return items of these categories",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_ids",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "use_listing_order_ids",
      "description" => "determines whether to use configured listing order ids",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "external_id",
      "description" => "external identifier used by a third party",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_id2",
      "description" => "secondary external identifier used by a third party",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_group_id",
      "description" => "external group identifier used by a third party",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/listing/summary', {
  "resourcePath" => "/Listing",
  "summary" => "Summary Listing",
  "nickname" => "summary_listing",
  "responseClass" => "Array<ListingGroupResponse>",
  "endpoint" => "/listing/summary",
  "notes" => "Search for a list of summary listings from the start time up to 8 days out.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the account id of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "the start date to search from",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "the list of categories to search on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "days_to_include",
      "description" => "how far out to search, in days",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "15",
      "paramType" => "query",
    },
    {
      "name" => "use_listing_order_ids",
      "description" => "determines whether to use configured listing order ids",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/listing/update', {
  "resourcePath" => "/Listing",
  "summary" => "Update Listing",
  "nickname" => "update_listing",
  "responseClass" => "ListingFullResponse",
  "endpoint" => "/listing/update",
  "notes" => "Updates a listing.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the user&#39;s account ID",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "listing_id",
      "description" => "the listing to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_ids",
      "description" => "comma separated list of filter IDs",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "the name of the listing",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "the description of the listing",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "the start date of the listing",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "_end",
      "description" => "the end date of the listing",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "location_name",
      "description" => "the name of the location the listing will be held at",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "location_description",
      "description" => "the description of the location the listing will be held at",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "is_private",
      "description" => "determines whether the listing is public or private",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_id",
      "description" => "external identifier used by a third party",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_id2",
      "description" => "secondary external identifier used by a third party",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_group_id",
      "description" => "external group identifier used by a third party",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "Sets the active flag",
      "dataType" => "Boolean",
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

