require 'json'


MyApp.add_route('POST', '/api/{version}/territory/create', {
  "resourcePath" => "/Territory",
  "summary" => "Create Territory",
  "nickname" => "create_territory",
  "responseClass" => "TerritoryResponse",
  "endpoint" => "/api/{version}/territory/create",
  "notes" => "Creates a territory.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the territory",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "If true set the game level as active. Default is true.",
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


MyApp.add_route('POST', '/api/{version}/territory/delete', {
  "resourcePath" => "/Territory",
  "summary" => "Delete Territory",
  "nickname" => "delete_territory",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/territory/delete",
  "notes" => "Deletes a territory.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "territory_id",
      "description" => "the id of the territory to delete",
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


MyApp.add_route('GET', '/api/{version}/territory/get', {
  "resourcePath" => "/Territory",
  "summary" => "Get Territory",
  "nickname" => "get_territory",
  "responseClass" => "TerritoryResponse",
  "endpoint" => "/api/{version}/territory/get",
  "notes" => "Get a territory.",
  "parameters" => [
    {
      "name" => "territory_id",
      "description" => "the id of the territory to get",
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


MyApp.add_route('GET', '/api/{version}/territory/search', {
  "resourcePath" => "/Territory",
  "summary" => "Search Territories",
  "nickname" => "search_territories",
  "responseClass" => "Array<TerritoryResponse>",
  "endpoint" => "/api/{version}/territory/search",
  "notes" => "Searches on territories.",
  "parameters" => [
    {
      "name" => "keyword",
      "description" => "Return results that match this keyword.",
      "dataType" => "String",
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
    {
      "name" => "sort_field",
      "description" => "the field to sort by. Supported values include: ID, CREATED, UPDATED, NAME",
      "dataType" => "String",
      "allowableValues" => "[ID, UPDATED, CREATED, NAME]",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "determines whether the sorted list is in descending or ascending order",
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


MyApp.add_route('POST', '/api/{version}/territory/update', {
  "resourcePath" => "/Territory",
  "summary" => "Update Territory",
  "nickname" => "update_territory",
  "responseClass" => "TerritoryResponse",
  "endpoint" => "/api/{version}/territory/update",
  "notes" => "Updates a territory.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "territory_id",
      "description" => "the id of the territory to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the territory",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "If true set the game level as active.",
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

