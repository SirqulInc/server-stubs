require 'json'


MyApp.add_route('POST', '/api/{version}/retailer/create', {
  "resourcePath" => "/Retailer",
  "summary" => "Create Retailer",
  "nickname" => "create_retailer",
  "responseClass" => "RetailerFullResponse",
  "endpoint" => "/api/{version}/retailer/create",
  "notes" => "Create a retailer record. A billable entity must be created first before a retailer record can be made.",
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
      "name" => "name",
      "description" => "The name of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "street_address",
      "description" => "The street address of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "street_address2",
      "description" => "Additional address information (such as a suite number, floor number, building name, or PO Box)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "city",
      "description" => "The city of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "state",
      "description" => "The state of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "postal_code",
      "description" => "The postal code of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "country",
      "description" => "the country of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "business_phone",
      "description" => "The business phone number of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "business_phone_ext",
      "description" => "The business phone extension of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "website",
      "description" => "The website of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "email",
      "description" => "The email of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "facebook_url",
      "description" => "The facebook URL of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "twitter_url",
      "description" => "The twitter URL of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "logo",
      "description" => "The retailer logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "logo_asset_id",
      "description" => "The retailer logo asset id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "picture1",
      "description" => "Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "picture1_asset_id",
      "description" => "An asset id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "picture2",
      "description" => "Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "picture2_asset_id",
      "description" => "An asset id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "Comma separated list of category IDs used to filter retailers by categories",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids_to_add",
      "description" => "Comma separated list of category IDs to add to the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids_to_remove",
      "description" => "Comma separated list of category IDs to remove from the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_ids",
      "description" => "Comma separated list of filter IDs used to filter retailers",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "the latitude of the retailer",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "the longitude of the retailer",
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
      "name" => "search_tags",
      "description" => "External custom search keywords",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_type",
      "description" => "External custom type identifier",
      "dataType" => "String",
      "allowableValues" => "",
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
      "name" => "create_default_location",
      "description" => "Determines whether to create a default location using the retailer information",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "response_format",
      "description" => "The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}",
      "dataType" => "String",
      "allowableValues" => "[HTML, XML, JSON, CSV]",
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


MyApp.add_route('POST', '/api/{version}/retailer/delete', {
  "resourcePath" => "/Retailer",
  "summary" => "Delete Retailer",
  "nickname" => "delete_retailer",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/retailer/delete",
  "notes" => "Set the deleted timestamp to current time.",
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
      "description" => "The account used to perform the delete, must have rights to edit the retailer.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_id",
      "description" => "The ID of the retailer to be deleted",
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


MyApp.add_route('GET', '/api/{version}/retailer/get', {
  "resourcePath" => "/Retailer",
  "summary" => "Get Retailer",
  "nickname" => "get_retailer",
  "responseClass" => "RetailerFullResponse",
  "endpoint" => "/api/{version}/retailer/get",
  "notes" => "Gets a retailer. Only the owner and the employees of a retailer have access to view its information.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the device id (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_id",
      "description" => "the ID of the retailer",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_counts",
      "description" => "Determines whether to include counts in the response (default true)",
      "dataType" => "Boolean",
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


MyApp.add_route('GET', '/api/{version}/retailer/search', {
  "resourcePath" => "/Retailer",
  "summary" => "Search Retailers",
  "nickname" => "get_retailers",
  "responseClass" => "Array<RetailerResponse>",
  "endpoint" => "/api/{version}/retailer/search",
  "notes" => "earches on retailers that the account has access to.",
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
      "name" => "q",
      "description" => "This parameter is deprecated.",
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
      "name" => "category_ids",
      "description" => "the categories that the retailer is associated with",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_ids",
      "description" => "the filters that the retailer is associated with",
      "dataType" => "String",
      "allowableValues" => "",
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
      "name" => "sort_field",
      "description" => "The column to sort the search on",
      "dataType" => "String",
      "allowableValues" => "[ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY, ADDRESS_STREET, ADDRESS_CITY, ADDRESS_STATE, ADDRESS_POSTAL_CODE, ADDRESS_COUNTRY, FILTERS, CATEGORIES, VISIBILITY, NAME]",
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
      "name" => "_i",
      "description" => "This parameter is deprecated.",
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
      "name" => "_l",
      "description" => "This parameter is deprecated.",
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
    {
      "name" => "active_only",
      "description" => "Return only active results",
      "dataType" => "Boolean",
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


MyApp.add_route('POST', '/api/{version}/retailer/login', {
  "resourcePath" => "/Retailer",
  "summary" => "Login Retailer",
  "nickname" => "retailer_login_check",
  "responseClass" => "AccountLoginResponse",
  "endpoint" => "/api/{version}/retailer/login",
  "notes" => "Retailer login check.",
  "parameters" => [
    {
      "name" => "username",
      "description" => "the user&#39;s email address they used to sign-up",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "password",
      "description" => "the password",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "device_id",
      "description" => "the device id (optional)",
      "dataType" => "String",
      "allowableValues" => "",
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
      "name" => "app_key",
      "description" => "the application key",
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


MyApp.add_route('POST', '/api/{version}/retailer/update', {
  "resourcePath" => "/Retailer",
  "summary" => "Update Retailer",
  "nickname" => "update_retailer",
  "responseClass" => "RetailerFullResponse",
  "endpoint" => "/api/{version}/retailer/update",
  "notes" => "Update a retailer record. Only the owner and the employees of the retailer have access to update its information.",
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
      "name" => "retailer_id",
      "description" => "The ID of the retailer to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "street_address",
      "description" => "The street address of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "street_address2",
      "description" => "Additional address information (such as a suite number, floor number, building name, or PO Box)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "city",
      "description" => "The city of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "state",
      "description" => "The state of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "postal_code",
      "description" => "The postal code of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "country",
      "description" => "the country of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "business_phone",
      "description" => "The business phone of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "business_phone_ext",
      "description" => "The business phone extension of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "website",
      "description" => "The website of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "email",
      "description" => "The email of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "facebook_url",
      "description" => "The facebook URL of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "twitter_url",
      "description" => "The twitter URL of the retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "logo",
      "description" => "The retailer logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "logo_asset_id",
      "description" => "The retailer logo asset id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "picture1",
      "description" => "Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "picture1_asset_id",
      "description" => "An asset id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "picture2",
      "description" => "Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "picture2_asset_id",
      "description" => "An asset id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "Comma separated list of category IDs used to filter retailers by categories",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_ids",
      "description" => "Comma separated list of filter IDs used to filter retailers",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "the latitude of the retailer",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "the longitude of the retailer",
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
      "name" => "search_tags",
      "description" => "External custom search keywords",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_type",
      "description" => "External custom type identifier",
      "dataType" => "String",
      "allowableValues" => "",
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
      "name" => "active",
      "description" => "Sets whether the retailer is active or inactive (hidden from consumers)",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "response_format",
      "description" => "The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}",
      "dataType" => "String",
      "allowableValues" => "[HTML, XML, JSON, CSV]",
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

