require 'json'


MyApp.add_route('GET', '/api/{version}/disbursement/check', {
  "resourcePath" => "/Disbursement",
  "summary" => "Check Disbursements",
  "nickname" => "check_disbursements",
  "responseClass" => "DisbursementResponse",
  "endpoint" => "/api/{version}/disbursement/check",
  "notes" => "Checks the status of a captured disbrusement to see if it has been settled.",
  "parameters" => [
    {
      "name" => "disbursement_id",
      "description" => "the ID of the disbursement being checked on",
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


MyApp.add_route('POST', '/api/{version}/disbursement/create', {
  "resourcePath" => "/Disbursement",
  "summary" => "Create Disbursement",
  "nickname" => "create_disbursement",
  "responseClass" => "DisbursementResponse",
  "endpoint" => "/api/{version}/disbursement/create",
  "notes" => "Creates a Disbursement for sending money to a retailer",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the ID of the logging in user (must be an EXECUTIVE account)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "receiver_account_id",
      "description" => "the ID of the account receiving the disbursement",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "original_sender_account_id",
      "description" => "the ID of the original sender account",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "amount",
      "description" => "the dollar amount of the disbursement",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "provider",
      "description" => "the provider (e.g. Authorize.net, Bill.com, etc.)",
      "dataType" => "String",
      "allowableValues" => "[AUTHORIZE_NET, AMAZON_FPS, BILL_COM]",
      "paramType" => "query",
    },
    {
      "name" => "scheduled_date",
      "description" => "the date that the disbursement is scheduled to go out to the payment provider",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "a title given for the disbursement",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "comment",
      "description" => "a comment that could be made for a disbursement",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_id",
      "description" => "external ID, which can be used as a way to reference the disbursement",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "introspection_params",
      "description" => "This is for specifying parameters to make an http callback request for validating that the disbursement is valid",
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


MyApp.add_route('GET', '/api/{version}/disbursement/get', {
  "resourcePath" => "/Disbursement",
  "summary" => "Get Disbursement",
  "nickname" => "get_disbursement",
  "responseClass" => "DisbursementResponse",
  "endpoint" => "/api/{version}/disbursement/get",
  "notes" => "Get Disbursement details",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "disbursement_id",
      "description" => "the id of the disbursement",
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


MyApp.add_route('GET', '/api/{version}/disbursement/search', {
  "resourcePath" => "/Disbursement",
  "summary" => "Search Disbursements",
  "nickname" => "search_disbursements",
  "responseClass" => "Array<DisbursementResponse>",
  "endpoint" => "/api/{version}/disbursement/search",
  "notes" => "Search Disbursements",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "receiver_account_id",
      "description" => "filter results by the id of the account receiving the disbursement",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "statuses",
      "description" => "comma separated list of status values to search for, possilbe values include: NEW, APPROVED, VALIDATING, ERROR, AUTHORIZED, CAPTURED, SETTLED",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "providers",
      "description" => "comma separated list of payment providers to search for, possbile values include: AUTHORIZE_NET, AMAZON_FPS, BILL_COM",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "before_date",
      "description" => "the date for searching disbursements before it has been processed",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "after_date",
      "description" => "the date for searching disbursements before it has been processed",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "the start index for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the limit per result set for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    {
      "name" => "active_only",
      "description" => "search on disbursements that are active only",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "external_id",
      "description" => "search results by this external ID (that can be used to reference the disbursement)",
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


MyApp.add_route('POST', '/api/{version}/disbursement/update', {
  "resourcePath" => "/Disbursement",
  "summary" => "Update Disbursement",
  "nickname" => "update_disbursement",
  "responseClass" => "DisbursementResponse",
  "endpoint" => "/api/{version}/disbursement/update",
  "notes" => "Update Disbursement",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "disbursement_id",
      "description" => "the id of the disbursement being updated",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "amount",
      "description" => "the disbursement dollar amount being updated",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "provider",
      "description" => "the payments and/or billing provider (e.g. Authorize.net, Bill.com, etc.)",
      "dataType" => "String",
      "allowableValues" => "[AUTHORIZE_NET, AMAZON_FPS, BILL_COM]",
      "paramType" => "query",
    },
    {
      "name" => "scheduled_date",
      "description" => "the date that the disbursement is scheduled to go out to the payment provider",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "the title given to the disbursement",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "comment",
      "description" => "a comment that can be made on a disbursement",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "external_id",
      "description" => "an external ID that can be used to reference the disbursement",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "_retry",
      "description" => "determines whether to try sending the disbursement again in the case of a previous failure",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "introspection_params",
      "description" => "for specifying parameters to make an http callback request for validating that the disbursement is valid",
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

