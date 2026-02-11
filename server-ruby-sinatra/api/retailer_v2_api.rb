require 'json'


MyApp.add_route('GET', '/api/3.18/retailer', {
  "resourcePath" => "/RetailerV2",
  "summary" => "Get Retailer",
  "nickname" => "get_retaokiler",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/retailer",
  "notes" => "Gets a retailer. Only the owner and the employees of a retailer have access to view its information.",
  "parameters" => [
    {
      "name" => "keyword",
      "description" => "the keyword to search on to get retailer",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "the field to sort on",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'id'",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "the start of the index and/or pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the limit of the index and/or pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    {
      "name" => "retailer_id",
      "description" => "the id of the retailer",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active_only",
      "description" => "whether to return results that are active only or all",
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

