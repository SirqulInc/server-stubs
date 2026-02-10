require 'json'


MyApp.add_route('POST', '/api/{version}/vehicle', {
  "resourcePath" => "/Vehicle",
  "summary" => "Create Vehicle",
  "nickname" => "create_vehicle",
  "responseClass" => "Vehicle",
  "endpoint" => "/api/{version}/vehicle",
  "notes" => "Create new vehicle",
  "parameters" => [
    {
      "name" => "vehicle",
      "description" => "A JSON representation of cargo type. &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;vehicleType\&quot;: { \&quot;id\&quot;: 1 },   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; ",
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
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Vehicle",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/{version}/vehicle/{id}', {
  "resourcePath" => "/Vehicle",
  "summary" => "Delete Vehicle",
  "nickname" => "delete_vehicle",
  "responseClass" => "void",
  "endpoint" => "/api/{version}/vehicle/{id}",
  "notes" => "Delete an existing vehicle",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "id",
      "description" => "The id of the vehicle to delete",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/vehicle/{id}', {
  "resourcePath" => "/Vehicle",
  "summary" => "Get Vehicle",
  "nickname" => "get_vehicle",
  "responseClass" => "Vehicle",
  "endpoint" => "/api/{version}/vehicle/{id}",
  "notes" => "Get an existing vehicle",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "id",
      "description" => "The id of the vehicle requested",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/vehicle', {
  "resourcePath" => "/Vehicle",
  "summary" => "Search Vehicle",
  "nickname" => "search_vehicle",
  "responseClass" => "Array<Vehicle>",
  "endpoint" => "/api/{version}/vehicle",
  "notes" => "Search for vehicles",
  "parameters" => [
    {
      "name" => "hub_id",
      "description" => "Filter by service hub",
      "dataType" => "Integer",
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
      "name" => "sort_field",
      "description" => "The field to sort by",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'id'",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "Determines whether the sorted list is in descending or ascending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
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
      "name" => "active_only",
      "description" => "Return only active results",
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


MyApp.add_route('PUT', '/api/{version}/vehicle/{id}', {
  "resourcePath" => "/Vehicle",
  "summary" => "Update Vehicle",
  "nickname" => "update_vehicle",
  "responseClass" => "Vehicle",
  "endpoint" => "/api/{version}/vehicle/{id}",
  "notes" => "Update an existing vehicle",
  "parameters" => [
    {
      "name" => "vehicle",
      "description" => "A JSON representation of cargo type, for example: &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;vehicleType\&quot;: { \&quot;id\&quot;: 1 },   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; ",
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
    {
      "name" => "id",
      "description" => "The id of the vehicle to update",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Vehicle",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

