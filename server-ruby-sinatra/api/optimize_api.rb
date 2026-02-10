require 'json'


MyApp.add_route('GET', '/api/{version}/optimize/result/{batchID}', {
  "resourcePath" => "/Optimize",
  "summary" => "Get Optimization Result",
  "nickname" => "get_optimization_result",
  "responseClass" => "Hash<String, ShipmentOrder>",
  "endpoint" => "/api/{version}/optimize/result/{batchID}",
  "notes" => "Get the results of the import batch.",
  "parameters" => [
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
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "batch_id",
      "description" => "The batchID for getting the import status of.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/optimize/request', {
  "resourcePath" => "/Optimize",
  "summary" => "Request Optimization",
  "nickname" => "request_optimization",
  "responseClass" => "ImportStatuses",
  "endpoint" => "/api/{version}/optimize/request",
  "notes" => "Request and upload of shipment orders and create ShipmentImportBatch for optimization.",
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
      "dataType" => "Orders",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

