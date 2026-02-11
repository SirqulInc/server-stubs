require 'json'


MyApp.add_route('POST', '/api/3.18/shipment/{id}/cancel', {
  "resourcePath" => "/Shipment",
  "summary" => "Cancel Shipment",
  "nickname" => "cancel_shipment",
  "responseClass" => "void",
  "endpoint" => "/shipment/{id}/cancel",
  "notes" => "Remove shipment from route",
  "parameters" => [
    {
      "name" => "id",
      "description" => "the id of the shipment to cancel",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/shipment', {
  "resourcePath" => "/Shipment",
  "summary" => "Create Shipment",
  "nickname" => "create_shipment",
  "responseClass" => "Shipment",
  "endpoint" => "/shipment",
  "notes" => "Create new shipment",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Shipment",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/3.18/shipment/{id}', {
  "resourcePath" => "/Shipment",
  "summary" => "Delete Shipment",
  "nickname" => "delete_shipment",
  "responseClass" => "void",
  "endpoint" => "/shipment/{id}",
  "notes" => "Delete an existing shipment",
  "parameters" => [
    {
      "name" => "id",
      "description" => "the id of the shipment to delete",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/shipment/{id}', {
  "resourcePath" => "/Shipment",
  "summary" => "Get Shipment",
  "nickname" => "get_shipment",
  "responseClass" => "Shipment",
  "endpoint" => "/shipment/{id}",
  "notes" => "Get an existing shipment",
  "parameters" => [
    {
      "name" => "id",
      "description" => "the id of the shipment to get",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/shipment', {
  "resourcePath" => "/Shipment",
  "summary" => "Search Shipments",
  "nickname" => "search_shipments",
  "responseClass" => "Array<Shipment>",
  "endpoint" => "/shipment",
  "notes" => "Search for shipments",
  "parameters" => [
    {
      "name" => "owner_id",
      "description" => "The owner of the shipment",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "rider_id",
      "description" => "The rider associate to this shipment",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "route_id",
      "description" => "The route associate to this shipment",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "The field to sort by",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "Determines whether the sorted list is in descending or ascending order",
      "dataType" => "Boolean",
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
      "name" => "active_only",
      "description" => "Return only active results",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/api/3.18/shipment/{id}', {
  "resourcePath" => "/Shipment",
  "summary" => "Update Shipment",
  "nickname" => "update_shipment",
  "responseClass" => "Shipment",
  "endpoint" => "/shipment/{id}",
  "notes" => "Update an existing shipment",
  "parameters" => [
    {
      "name" => "id",
      "description" => "the id of the shipment to update",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Shipment",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/shipment/{id}/status', {
  "resourcePath" => "/Shipment",
  "summary" => "Uupdate Shipment Status",
  "nickname" => "update_shipment_status",
  "responseClass" => "void",
  "endpoint" => "/shipment/{id}/status",
  "notes" => "Update status of an existing shipment",
  "parameters" => [
    {
      "name" => "id",
      "description" => "the id of the shipment to update status",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Hash<String, Boolean>",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

