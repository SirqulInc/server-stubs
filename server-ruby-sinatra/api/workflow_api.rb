require 'json'


MyApp.add_route('POST', '/api/{version}/workflow/run', {
  "resourcePath" => "/Workflow",
  "summary" => "Run Workflow",
  "nickname" => "run_workflow",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/workflow/run",
  "notes" => "Runs a published executable workflow",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the account ID of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "workflow_id",
      "description" => "the workflow to run",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sku_id",
      "description" => "this runs a particular sku on the workflow",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version_code",
      "description" => "this runs a particular sku version on the workflow",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "parameters",
      "description" => "Override parameters in JSON format. Example: &#x60;&#x60;&#x60;json {   \&quot;arguments_81\&quot;: { \&quot;filter\&quot;: \&quot;PUBLIC\&quot; },   \&quot;arguments_87\&quot;: { \&quot;tag\&quot;: \&quot;custom_tag\&quot; } } &#x60;&#x60;&#x60; ",
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

