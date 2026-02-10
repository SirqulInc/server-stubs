require 'json'


MyApp.add_route('POST', '/api/{version}/cargo/type', {
  "resourcePath" => "/CargoType",
  "summary" => "Create Cargo Type",
  "nickname" => "create_cargo_type",
  "responseClass" => "CargoType",
  "endpoint" => "/api/{version}/cargo/type",
  "notes" => "Create new cargo type",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CargoType",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/{version}/cargo/type/{cargoTypeId}', {
  "resourcePath" => "/CargoType",
  "summary" => "Delete Cargo Type",
  "nickname" => "delete_cargo_type",
  "responseClass" => "void",
  "endpoint" => "/api/{version}/cargo/type/{cargoTypeId}",
  "notes" => "Delete a type of cargo",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "cargo_type_id",
      "description" => "the ID of the cargo type",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/cargo/type/{cargoTypeId}', {
  "resourcePath" => "/CargoType",
  "summary" => "Get Cargo Type",
  "nickname" => "get_cargo_type",
  "responseClass" => "CargoType",
  "endpoint" => "/api/{version}/cargo/type/{cargoTypeId}",
  "notes" => "Get an existing cargo type",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "cargo_type_id",
      "description" => "the cargo type ID",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/cargo/type', {
  "resourcePath" => "/CargoType",
  "summary" => "Search Cargo Type",
  "nickname" => "search_cargo_types",
  "responseClass" => "Array<CargoType>",
  "endpoint" => "/api/{version}/cargo/type",
  "notes" => "Search for types of cargo",
  "parameters" => [
    {
      "name" => "retailer_id",
      "description" => "the id of the retailer location",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "hub_id",
      "description" => "the ID of the hub",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "the sort field to use for the cargo type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "if the cargo type should be should be in descending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "the start of the search",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the limit of the search",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active_only",
      "description" => "if search should be on active only",
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


MyApp.add_route('PUT', '/api/{version}/cargo/type/{cargoTypeId}', {
  "resourcePath" => "/CargoType",
  "summary" => "Update Cargo Type",
  "nickname" => "update_cargo_type",
  "responseClass" => "CargoType",
  "endpoint" => "/api/{version}/cargo/type/{cargoTypeId}",
  "notes" => "Update an existing cargo type",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "cargo_type_id",
      "description" => "the ID of the cargo type",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CargoType",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

