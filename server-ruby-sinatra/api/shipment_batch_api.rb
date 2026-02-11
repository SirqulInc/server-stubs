require 'json'


MyApp.add_route('POST', '/api/3.18/shipment/batch', {
  "resourcePath" => "/ShipmentBatch",
  "summary" => "Create Shipment Batch",
  "nickname" => "create_shipment_batch",
  "responseClass" => "ShipmentBatch",
  "endpoint" => "/shipment/batch",
  "notes" => "Create a new shipment batch",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "ShipmentBatch",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/3.18/shipment/batch/{batchId}', {
  "resourcePath" => "/ShipmentBatch",
  "summary" => "Delete Shipment Batch",
  "nickname" => "delete_shipment_batch",
  "responseClass" => "void",
  "endpoint" => "/shipment/batch/{batchId}",
  "notes" => "Search for shipment batches",
  "parameters" => [
    {
      "name" => "batch_id",
      "description" => "the id of the shipment batch to delete",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/shipment/batch/{batchId}', {
  "resourcePath" => "/ShipmentBatch",
  "summary" => "Get Shipment Batch",
  "nickname" => "get_shipment_batch",
  "responseClass" => "ShipmentBatch",
  "endpoint" => "/shipment/batch/{batchId}",
  "notes" => "Get an existing shipment batch",
  "parameters" => [
    {
      "name" => "batch_id",
      "description" => "the id of the shipment batch to get",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/shipment/batch/{batchId}/status', {
  "resourcePath" => "/ShipmentBatch",
  "summary" => "Get Shipment Batch Status",
  "nickname" => "get_shipment_batch_status",
  "responseClass" => "Array<ShipmentImportStatus>",
  "endpoint" => "/shipment/batch/{batchId}/status",
  "notes" => "Get the import status list of the import shipment batch",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "valid",
      "description" => "Valid import status only or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "started",
      "description" => "Started import status only",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "completed",
      "description" => "Completed import status only",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "has_shipment",
      "description" => "Has shipment associate to the status",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "has_route",
      "description" => "Has route associate to the status",
      "dataType" => "Boolean",
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
      "name" => "batch_id",
      "description" => "The id of the requested shipment batch",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/shipment/batch', {
  "resourcePath" => "/ShipmentBatch",
  "summary" => "Search Shipment Batch",
  "nickname" => "search_shipment_batch",
  "responseClass" => "Array<ShipmentBatch>",
  "endpoint" => "/shipment/batch",
  "notes" => "Search for shipment batches",
  "parameters" => [
    {
      "name" => "hub_id",
      "description" => "The associated service hub",
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

