require 'json'


MyApp.add_route('POST', '/api/{version}/bid/create', {
  "resourcePath" => "/Bid",
  "summary" => "Create Bid",
  "nickname" => "create_bid",
  "responseClass" => "BidResponse",
  "endpoint" => "/api/{version}/bid/create",
  "notes" => "Creates a bid on a biddable object",
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
      "name" => "biddable_type",
      "description" => "A biddable object type. Possible values include: CREATIVE (ads).",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "biddable_id",
      "description" => "The id of the biddable object",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "amount_per_view",
      "description" => "The bid amount for views. For ads, this is the amount that will be taken for each impression.",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "amount_per_action",
      "description" => "The bid amount for actions. For ads, this is the amount that will be taken for each click.",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "budget_amount",
      "description" => "The allocated budget amount that will be used",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "budget_schedule",
      "description" => "The schedule for when the allocated budget amount is reset",
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


MyApp.add_route('POST', '/api/{version}/bid/delete', {
  "resourcePath" => "/Bid",
  "summary" => "Delete Bid",
  "nickname" => "delete_bid",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/bid/delete",
  "notes" => "Deleted a bid on a biddable object",
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
      "name" => "bid_id",
      "description" => "The bid id",
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


MyApp.add_route('GET', '/api/{version}/bid/get', {
  "resourcePath" => "/Bid",
  "summary" => "Get Bid",
  "nickname" => "get_bid",
  "responseClass" => "BidResponse",
  "endpoint" => "/api/{version}/bid/get",
  "notes" => "Get the bid details of a biddable object",
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
      "name" => "bid_id",
      "description" => "The bid id",
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


MyApp.add_route('POST', '/api/{version}/bid/update', {
  "resourcePath" => "/Bid",
  "summary" => "Update Bid",
  "nickname" => "update_bid",
  "responseClass" => "BidResponse",
  "endpoint" => "/api/{version}/bid/update",
  "notes" => "Updates a bid on a biddable object",
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
      "name" => "bid_id",
      "description" => "The bid id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "amount_per_view",
      "description" => "The bid amount for views. For ads, this is the amount that will be taken for each impression.",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "amount_per_action",
      "description" => "The bid amount for actions. For ads, this is the amount that will be taken for each click.",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "budget_amount",
      "description" => "The allocated budget amount that will be used",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "budget_schedule",
      "description" => "The schedule for when the allocated budget amount is reset",
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

