require 'json'


MyApp.add_route('POST', '/api/3.18/billable/create', {
  "resourcePath" => "/BillableEntity",
  "summary" => "Create Billable",
  "nickname" => "create_billable_entity",
  "responseClass" => "BillableEntityResponse",
  "endpoint" => "/billable/create",
  "notes" => "reate a billable entity for an account. The creator is assumed to be the responsible account. An account can only have one billable entity",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The unique device identifier that made the request (either deviceId or accountId must be used)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The unique accountId that made the request (either deviceId or accountId must be used)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the entity responsible for billing ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "street_address",
      "description" => "The street address of the billable entity",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "street_address2",
      "description" => "Additional address information (such as a suite number, floor number, building name, or PO Box) ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "city",
      "description" => "The city of the billable entity",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "state",
      "description" => "The state of the billable entity",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "postal_code",
      "description" => "The postal code of the billable entity",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "business_phone",
      "description" => "The business phone of the billable entity",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "business_phone_ext",
      "description" => "The business phone extension",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "authorize_net_api_key",
      "description" => "Authorize Net Api Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "authorize_net_transaction_key",
      "description" => "Authorize Net Transaction Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/billable/delete', {
  "resourcePath" => "/BillableEntity",
  "summary" => "Delete Billable",
  "nickname" => "delete_billable_entity",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/billable/delete",
  "notes" => "Mark the billable as deleted",
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
      "description" => "The account used to perform the delete, must have rights to edit the billable entity.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/billable/get', {
  "resourcePath" => "/BillableEntity",
  "summary" => "Get Billable",
  "nickname" => "get_billable_entity",
  "responseClass" => "BillableEntityResponse",
  "endpoint" => "/billable/get",
  "notes" => "Used to determine the associated BillableEntity of an account",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The unique device identifier that made the request (either deviceId or accountId must be used)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The unique accountId that made the request (either deviceId or accountId must be used)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_counts",
      "description" => "Determines whether to include the retailer dash board counts into the response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "include_payments",
      "description" => "Whether to enable payments or not",
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


MyApp.add_route('POST', '/api/3.18/billable/update', {
  "resourcePath" => "/BillableEntity",
  "summary" => "Update Billable",
  "nickname" => "update_billable_entity",
  "responseClass" => "BillableEntityResponse",
  "endpoint" => "/billable/update",
  "notes" => "Updates the billable record for an account",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The unique device identifier that made the request (either deviceId or accountId must be used)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The unique accountId that made the request (either deviceId or accountId must be used). The account must have rights to edit the billable entity.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the entity responsible for billing ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "street_address",
      "description" => "The street address of the billable entity",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "street_address2",
      "description" => "Additional address information (such as a suite number, floor number, building name, or PO Box) ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "city",
      "description" => "The city of the billable entity",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "state",
      "description" => "The state of the billable entity",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "postal_code",
      "description" => "The postal code of the billable entity",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "business_phone",
      "description" => "The business phone of the billable entity",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "business_phone_ext",
      "description" => "The business phone extension of the billable entity",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "authorize_net_api_key",
      "description" => "Authorize Net Api Key of the billable entity",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "authorize_net_transaction_key",
      "description" => "Authorize Net Transaction Key of the billable entity",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

