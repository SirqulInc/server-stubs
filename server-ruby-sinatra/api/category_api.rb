require 'json'


MyApp.add_route('GET', '/api/{version}/category/distancesearch', {
  "resourcePath" => "/Category",
  "summary" => "Search Categories by Distance",
  "nickname" => "category_distance_search",
  "responseClass" => "Array<CategoryResponse>",
  "endpoint" => "/api/{version}/category/distancesearch",
  "notes" => "Search for categories by distance.",
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
      "description" => "The keyword string to search on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "the appKey of the application to retrieve categories for, if not specified then search on the global application.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "Restrict the search by specific categories",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "parent_category_ids",
      "description" => "Restrict the search by specific parent categories so that only its sub children are searched.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "root_only",
      "description" => "Restrict the search to only those categories with no parent category assigned.",
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
      "name" => "response_group",
      "description" => "The group of categories to return: ALL, GLOBAL or MINE. ALL returns both global and application specific matches, GLOBAL only returns global matches, and MINE only returns the application specific matches. If not provided search on the application provided.",
      "dataType" => "String",
      "allowableValues" => "[ALL, GLOBAL, MINE]",
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
      "name" => "return_external",
      "description" => "Determines whether to return extra info about the category&#39;s \&quot;Participant\&quot; reference",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "exact_match",
      "description" => "If true search categories using the exact keyword, if false then do a partial match (like) search.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "type",
      "description" => "Filters results by the Category&#39;s type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_type",
      "description" => "Filters results by externalType",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "min_offer_count",
      "description" => "Filters results to only return Categories that have been referenced by a minimum number of Offers",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "the latitude of where the search is centered on",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "the longitude of where the search is centered on",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "range",
      "description" => "the maximum range the category can be from the center",
      "dataType" => "Float",
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


MyApp.add_route('POST', '/api/{version}/category/create', {
  "resourcePath" => "/Category",
  "summary" => "Create Category",
  "nickname" => "create_category",
  "responseClass" => "CategoryTreeResponse",
  "endpoint" => "/api/{version}/category/create",
  "notes" => "Create a new category.",
  "parameters" => [
    {
      "name" => "app_key",
      "description" => "The appKey of the application to assign the category to, if not provided then the category will be applied to the global application (if the account has permissions)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account id of the user (must have permissions to the target application)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "parent_category_id",
      "description" => "The ID of the parent category, if not provided then the parent category will be null",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the category",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "The description of the category",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "type",
      "description" => "The type of the category",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_id",
      "description" => "The ID of the image asset previously uploaded using the media service",
      "dataType" => "Integer",
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
      "name" => "external_category_slug",
      "description" => "external category slug",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sqoot_slug",
      "description" => "sqoot slug",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "Sets whether the category is active or inactive (hidden from consumers)",
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
      "name" => "search_tags",
      "description" => "user defined strings for searching",
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


MyApp.add_route('POST', '/api/{version}/category/delete', {
  "resourcePath" => "/Category",
  "summary" => "Delete Category",
  "nickname" => "delete_category",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/category/delete",
  "notes" => "Delete a category.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the ID of the account",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_id",
      "description" => "the ID of the category",
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


MyApp.add_route('POST', '/api/{version}/category/duplicate', {
  "resourcePath" => "/Category",
  "summary" => "Duplicate Category",
  "nickname" => "duplicate_category",
  "responseClass" => "CategoryTreeResponse",
  "endpoint" => "/api/{version}/category/duplicate",
  "notes" => "Duplicate a category, including all its children.",
  "parameters" => [
    {
      "name" => "app_key",
      "description" => "The application to assign the new category to, may be different then the application the source category is assigned to",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account id of the user (must have permissions to the target application)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_id",
      "description" => "The category ID to duplicate (includes all children)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "parent_category_id",
      "description" => "The parent category ID to add the target category to.",
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


MyApp.add_route('GET', '/api/{version}/category/get', {
  "resourcePath" => "/Category",
  "summary" => "Get Category",
  "nickname" => "get_category",
  "responseClass" => "CategoryTreeResponse",
  "endpoint" => "/api/{version}/category/get",
  "notes" => "Get the details of a specific category. Recursively include all child categories and their children.",
  "parameters" => [
    {
      "name" => "category_id",
      "description" => "the ID of the category",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_external",
      "description" => "Determines whether to return extra info about the category&#39;s \&quot;Participant\&quot; reference",
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


MyApp.add_route('GET', '/api/{version}/category/search', {
  "resourcePath" => "/Category",
  "summary" => "Search Categories",
  "nickname" => "search_categories",
  "responseClass" => "Array<CategoryResponse>",
  "endpoint" => "/api/{version}/category/search",
  "notes" => "Search for categories.",
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
      "description" => "the appKey of the application to retrieve categories for, if not specified then search on the global application.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_id",
      "description" => "@Deprecated, use parentCategoryIds instead",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "Restrict the search by specific categories",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "parent_category_ids",
      "description" => "Restrict the search by specific parent categories so that only its sub children are searched.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "root_only",
      "description" => "Restrict the search to only those categories with no parent category assigned.",
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
      "name" => "response_group",
      "description" => "The group of categories to return: ALL, GLOBAL or MINE. ALL returns both global and application specific matches, GLOBAL only returns global matches, and MINE only returns the application specific matches. If not provided search on the application provided.",
      "dataType" => "String",
      "allowableValues" => "[ALL, GLOBAL, MINE]",
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
      "name" => "return_external",
      "description" => "Determines whether to return extra info about the category&#39;s \&quot;Participant\&quot; reference",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "exact_match",
      "description" => "If true search categories using the exact keyword, if false then do a partial match (like) search. Default is false.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "type",
      "description" => "Filters results by the Category&#39;s type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_type",
      "description" => "Filters results by externalType",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "exclude_external_type",
      "description" => "Determines whether the \&quot;externalType\&quot; param is excluded from the search results",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "min_offer_count",
      "description" => "Filters results to only return Categories that have been referenced by a minimum number of Offers",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "search_depth",
      "description" => "When searching by a specific parent category (to return sub children), this determines the number of child layers to search in. The minimum is 1, the maximum is 4.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "4",
      "paramType" => "query",
    },
    {
      "name" => "search_mode",
      "description" => "The search index mode to use (e.g. OPENSEARCH or RDS)",
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


MyApp.add_route('POST', '/api/{version}/category/update', {
  "resourcePath" => "/Category",
  "summary" => "Update Category",
  "nickname" => "update_category",
  "responseClass" => "CategoryTreeResponse",
  "endpoint" => "/api/{version}/category/update",
  "notes" => "Update a category.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_id",
      "description" => "The ID of the category to edit",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "parent_category_id",
      "description" => "The ID of the parent category, if not provided then the parent category will be null",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the category",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "The description of the category",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "type",
      "description" => "The type of the category",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_id",
      "description" => "The ID of the image asset previously uploaded using the media service",
      "dataType" => "Integer",
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
      "name" => "external_category_slug",
      "description" => "external category slug",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sqoot_slug",
      "description" => "sqoot slug",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "Sets whether the category is active or inactive (hidden from consumers)",
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
      "name" => "search_tags",
      "description" => "user defined strings for searching",
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

