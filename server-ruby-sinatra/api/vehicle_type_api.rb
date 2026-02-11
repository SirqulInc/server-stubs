require 'json'


MyApp.add_route('POST', '/api/3.18/vehicle/type', {
  "resourcePath" => "/VehicleType",
  "summary" => "Create Vehicle Type",
  "nickname" => "create_vehicle_type",
  "responseClass" => "VehicleType",
  "endpoint" => "/vehicle/type",
  "notes" => "Create a new vehicle type",
  "parameters" => [
    {
      "name" => "vehicle_type",
      "description" => "A JSON representation of cargo type. &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;width\&quot;: 100,   \&quot;height\&quot;: 200,   \&quot;depth\&quot;: 200,   \&quot;maxWeight\&quot;: 5000,   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "VehicleType",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/3.18/vehicle/type/{vehicleTypeId}', {
  "resourcePath" => "/VehicleType",
  "summary" => "Delete Vehicle Type",
  "nickname" => "delete_vehicle_type",
  "responseClass" => "void",
  "endpoint" => "/vehicle/type/{vehicleTypeId}",
  "notes" => "Delete a vehicle type",
  "parameters" => [
    {
      "name" => "vehicle_type_id",
      "description" => "The id of the requested vehicle type",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vehicle/type/{vehicleTypeId}', {
  "resourcePath" => "/VehicleType",
  "summary" => "Get Vehicle Type",
  "nickname" => "get_vehicle_type",
  "responseClass" => "VehicleType",
  "endpoint" => "/vehicle/type/{vehicleTypeId}",
  "notes" => "Get a vehicle type",
  "parameters" => [
    {
      "name" => "vehicle_type_id",
      "description" => "The id of the requested vehicle type",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/vehicle/type', {
  "resourcePath" => "/VehicleType",
  "summary" => "Search Vehicle Type",
  "nickname" => "search_vehicle_types",
  "responseClass" => "Array<VehicleType>",
  "endpoint" => "/vehicle/type",
  "notes" => "Search for types of vehicles",
  "parameters" => [
    {
      "name" => "retailer_id",
      "description" => "Filter by retailer",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "hub_id",
      "description" => "Filter by service hub",
      "dataType" => "Integer",
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/api/3.18/vehicle/type/{vehicleTypeId}', {
  "resourcePath" => "/VehicleType",
  "summary" => "Update Vehicle Type",
  "nickname" => "update_vehicle_type",
  "responseClass" => "VehicleType",
  "endpoint" => "/vehicle/type/{vehicleTypeId}",
  "notes" => "Update a vehicle type",
  "parameters" => [
    {
      "name" => "vehicle_type",
      "description" => "The new data for the vehicle type to update to. A JSON representation of cargo type, for example: &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;width\&quot;: 100,   \&quot;height\&quot;: 200,   \&quot;depth\&quot;: 200,   \&quot;maxWeight\&quot;: 5000,   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "vehicle_type_id",
      "description" => "The id of the vehicle type to update",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "VehicleType",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

