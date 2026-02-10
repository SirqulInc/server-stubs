require 'json'


MyApp.add_route('POST', '/api/{version}/filter/create', {
  "resourcePath" => "/Filter",
  "summary" => "Create Filter",
  "nickname" => "create_filter",
  "responseClass" => "FilterTreeResponse",
  "endpoint" => "/api/{version}/filter/create",
  "notes" => "Create a filter",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the user (must have permissions to the target application)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The appKey of the application to assign the filter to, if not provided then the filter will be applied to the global application (if the account has permissions)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "parent_filter_id",
      "description" => "The ID of the parent filter, if not provided then the parent filter will be null",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the filter",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "The description of the filter",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_id",
      "description" => "A string identifier used by client applications to store external information",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_type",
      "description" => "A string type used by client applications to store external information",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "Sets whether the filter is active or inactive (hidden from consumers)",
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


MyApp.add_route('POST', '/api/{version}/filter/delete', {
  "resourcePath" => "/Filter",
  "summary" => "Delete Filter",
  "nickname" => "delete_filter",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/filter/delete",
  "notes" => "Delete a filter.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the user (must have permissions to the filter&#39;s assigned application)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_id",
      "description" => "The ID of the filter to delete",
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


MyApp.add_route('GET', '/api/{version}/filter/get', {
  "resourcePath" => "/Filter",
  "summary" => "Get Filter",
  "nickname" => "get_filter",
  "responseClass" => "FilterTreeResponse",
  "endpoint" => "/api/{version}/filter/get",
  "notes" => "Get the details of a specific filter. Recursively include all child filters and their children.",
  "parameters" => [
    {
      "name" => "filter_id",
      "description" => "the id of the filter to get",
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


MyApp.add_route('GET', '/api/{version}/filter/search', {
  "resourcePath" => "/Filter",
  "summary" => "Search Filters",
  "nickname" => "search_filters",
  "responseClass" => "Array<FilterResponse>",
  "endpoint" => "/api/{version}/filter/search",
  "notes" => "Search for filters.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "The string to search on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "the appKey of the application to retrieve filters for",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "response_group",
      "description" => "The group of filters to return: ALL, GLOBAL or MINE. ALL returns both global and application specific matches, GLOBAL only returns global matches, and MINE only returns the application specific matches. If not provided search on the application provided.",
      "dataType" => "String",
      "allowableValues" => "[ALL, GLOBAL, MINE]",
      "paramType" => "query",
    },
    {
      "name" => "root_only",
      "description" => "Restrict the search to only those filters with no parent filter assigned.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, DISPLAY",
      "dataType" => "String",
      "allowableValues" => "[ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DISPLAY]",
      "defaultValue" => "'DISPLAY'",
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
      "description" => "Determines whether to return only active categories",
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


MyApp.add_route('POST', '/api/{version}/filter/update', {
  "resourcePath" => "/Filter",
  "summary" => "Update Filter",
  "nickname" => "update_filter",
  "responseClass" => "FilterTreeResponse",
  "endpoint" => "/api/{version}/filter/update",
  "notes" => "Update a filter.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_id",
      "description" => "The ID of the filter to edit",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "parent_filter_id",
      "description" => "The ID of the parent filter, if not provided then the parent filter will be null",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the filter",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "The description of the filter",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_id",
      "description" => "A string identifier used by client applications to store external information",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_type",
      "description" => "A string type used by client applications to store external information",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "Sets whether the filter is active or inactive (hidden from consumers)",
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

