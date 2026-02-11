require 'json'


MyApp.add_route('POST', '/api/3.18/region/create', {
  "resourcePath" => "/Region",
  "summary" => "Create Region",
  "nickname" => "create_region",
  "responseClass" => "RegionResponse",
  "endpoint" => "/region/create",
  "notes" => "Create a region.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The id of the account sending the request",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "region_class",
      "description" => "RegionClass of this region",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "short_name",
      "description" => "Short name of the region. This is optimized for search",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "full_name",
      "description" => "Full name of the region",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "parent_ids",
      "description" => "Comma separated region ids that are parents of this region",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "children_ids",
      "description" => "Comma separated region ids that are children of this region",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "postal_code_ids",
      "description" => "Comma separated postal code ids the region will include",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "locations",
      "description" => "Sets of name,lat,long used to create new postal codes assigned to the region",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_location_id",
      "description" => "the id of the retailer location that the region is being created for",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "visibility",
      "description" => "The Visibility of the region",
      "dataType" => "String",
      "allowableValues" => "[PUBLIC, PRIVATE, FRIENDS]",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "the categories that the region is assigned to",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_ids",
      "description" => "the filters that the region is assigned to",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "_end",
      "description" => "",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "polygon",
      "description" => "the polygon generated for the region",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "meta_data",
      "description" => "the meta data associated with the region",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "the latitude of the region",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "the longitude of the region",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version_code",
      "description" => "the version code",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "root",
      "description" => "If this is a root region or not. If true means this region has no parent regions",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "Active or inactive status of the region",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/region/delete', {
  "resourcePath" => "/Region",
  "summary" => "Delete Region",
  "nickname" => "delete_region",
  "responseClass" => "RegionResponse",
  "endpoint" => "/region/delete",
  "notes" => "Delete a region.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the account logged in",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "region_id",
      "description" => "the id of the region",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/region/get', {
  "resourcePath" => "/Region",
  "summary" => "Get Region",
  "nickname" => "get_region",
  "responseClass" => "RegionResponse",
  "endpoint" => "/region/get",
  "notes" => "Get a region.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "region_id",
      "description" => "the id of the region to get",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/region/search', {
  "resourcePath" => "/Region",
  "summary" => "Search Regions",
  "nickname" => "search_regions",
  "responseClass" => "Array<RegionResponse>",
  "endpoint" => "/region/search",
  "notes" => "Get the list of regions.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the owner account id of the region to be created",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "query",
      "description" => "This parameter is deprecated. deprecated - use \&quot;keyword\&quot;",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "the keyword to filter results on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "the latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "the longitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "range",
      "description" => "the search radius",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "region_class",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "[NATIONAL, STATE, COUNTY, METRO_AREA, CITY, NEIGHBORHOOD, TERRITORY, CUSTOM, ZONE]",
      "paramType" => "query",
    },
    {
      "name" => "visibility",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "[PUBLIC, PRIVATE, FRIENDS]",
      "paramType" => "query",
    },
    {
      "name" => "search_mode",
      "description" => "the SearchIndexMode: RDS, LUCENE, or CLOUDINDEX. If not provided, will use the default defined in the Sirqul server",
      "dataType" => "String",
      "allowableValues" => "[RDS, LUCENE, CLOUDINDEX]",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "the field to order results by: ID, UPDATED, NAME, or DISTANCE. If not provided, will use the default which is by ID for text and DISTANCE when lat/long is provided.",
      "dataType" => "String",
      "allowableValues" => "[ID, UPDATED, NAME, DISTANCE]",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "determines if the results get ordered in descending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_parent",
      "description" => "include the parent region or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_children",
      "description" => "include the chidren regions or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_postal_codes",
      "description" => "include the postal codes associated with the region or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "search on the categories associated with the region",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_ids",
      "description" => "search on the filters associated with the region",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version_code",
      "description" => "filter by a specific version code",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active_only",
      "description" => "filter to show only active results",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "show_deleted",
      "description" => "If showDeleted is true and activeOnly is false, will return regions that have been deleted",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "last_updated_since",
      "description" => "only returns records that have last updated since this date \\(UTC timestamp in milliseconds\\)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "the start index for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the limit for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/region/update', {
  "resourcePath" => "/Region",
  "summary" => "Update Region",
  "nickname" => "update_region",
  "responseClass" => "RegionResponse",
  "endpoint" => "/region/update",
  "notes" => "Update a region.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The id of the account sending the request",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "region_id",
      "description" => "The id of the region to be updated",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "region_class",
      "description" => "RegionClass of this region",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "short_name",
      "description" => "Short name of the region. This is optimized for search",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "full_name",
      "description" => "Full name of the region",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "parent_ids",
      "description" => "Comma separated region ids that are parents of this region",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "children_ids",
      "description" => "Comma separated region ids that are children of this region",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "postal_code_ids",
      "description" => "Comma separated postal code ids the region will include",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "locations",
      "description" => "Sets of name,lat,long used to create new postal codes assigned to the region",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_location_id",
      "description" => "the retailer location ID that the region is associated with",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "visibility",
      "description" => "The Visibility of the region",
      "dataType" => "String",
      "allowableValues" => "[PUBLIC, PRIVATE, FRIENDS]",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "the categories that the region is assigned to",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_ids",
      "description" => "the filters that the region is assigned to",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "_end",
      "description" => "",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "polygon",
      "description" => "the polygon of the region",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "meta_data",
      "description" => "the meta data of the region",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "the latitude of the region",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "the longitude of the region",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version_code",
      "description" => "the version code",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "root",
      "description" => "If this is a root region or not. If true means this region has no parent regions",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "Active or inactive status of the region",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "clear_lists",
      "description" => "If true clear the children and postal code lists before add new ones, otherwise just append.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

