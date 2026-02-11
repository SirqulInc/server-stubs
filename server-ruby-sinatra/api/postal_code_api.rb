require 'json'


MyApp.add_route('POST', '/api/3.18/postalCode/create', {
  "resourcePath" => "/PostalCode",
  "summary" => "Create Postal Code",
  "nickname" => "create_postal_code",
  "responseClass" => "PostalCodeResponse",
  "endpoint" => "/postalCode/create",
  "notes" => "Create a Postal Code",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "code",
      "description" => "the postal code",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "the latitude of the postal code",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "the longitude of the postal code",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "state_code",
      "description" => "the state code (e.g WA, WV, WI) that the postal code is located",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "city",
      "description" => "the city that the postal code is located",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "whether the postal code created should be active or inactive",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/postalCode/delete', {
  "resourcePath" => "/PostalCode",
  "summary" => "Delete Postal Code",
  "nickname" => "delete_postal_code",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/postalCode/delete",
  "notes" => "Delete a Postal Code",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "postal_code_id",
      "description" => "the id of the postal code to delete",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/postalCode/get', {
  "resourcePath" => "/PostalCode",
  "summary" => "Get Postal Code",
  "nickname" => "get_postal_code",
  "responseClass" => "PostalCodeResponse",
  "endpoint" => "/postalCode/get",
  "notes" => "Get a Postal Code",
  "parameters" => [
    {
      "name" => "postal_code_id",
      "description" => "the id of the postal code to get",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/postalCode/search', {
  "resourcePath" => "/PostalCode",
  "summary" => "Search Postal Codes",
  "nickname" => "get_postal_codes",
  "responseClass" => "Array<PostalCodeResponse>",
  "endpoint" => "/postalCode/search",
  "notes" => "Get the list of regions. If latitude or longitude is null, will return all postal codes in the system with paginated response.",
  "parameters" => [
    {
      "name" => "latitude",
      "description" => "the latitude of the postal code to search on",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "the longitude of the postal code to search on",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "the keyword of the postal code to search on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "miles",
      "description" => "how far (in miles) to search on for the postal code",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "the start of the index and/or pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the limit of the index and/or pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "the field to sort the results on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "whether to order results in ascending or descending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/postalCode/update', {
  "resourcePath" => "/PostalCode",
  "summary" => "Update Postal Code",
  "nickname" => "update_postal_code",
  "responseClass" => "PostalCodeResponse",
  "endpoint" => "/postalCode/update",
  "notes" => "Update a Postal Code",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "postal_code_id",
      "description" => "the id of the postal code to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "code",
      "description" => "the postal code to update",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "the latitude of the postal code",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "the longitude of the postal code",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "state_code",
      "description" => "the state code (e.g. WA, WI, WY) where the postal code is located",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "city",
      "description" => "the city where the postal code is located",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "whether the postal code is active or inactive",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

