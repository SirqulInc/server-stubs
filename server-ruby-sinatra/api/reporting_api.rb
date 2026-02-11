require 'json'


MyApp.add_route('POST', '/api/3.18/report/batch/create', {
  "resourcePath" => "/Reporting",
  "summary" => "Create Offline Report",
  "nickname" => "create_batch",
  "responseClass" => "ReportBatchResponse",
  "endpoint" => "/report/batch/create",
  "notes" => "Create an entry for the batch for offline report",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the user for passing account related params",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key for passing application related params",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "status",
      "description" => "the status of the report",
      "dataType" => "String",
      "allowableValues" => "[NEW, ERROR, COMPLETE, PARSE_ERROR, PROCESSING, DUPLICATE, SAVEONLY]",
      "paramType" => "query",
    },
    {
      "name" => "endpoint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "parameters",
      "description" => "a json structure list of the parameter values, example: &#x60;&#x60;&#x60;json {   \&quot;string\&quot;:\&quot;value\&quot;,    \&quot;number\&quot;:3.345,   \&quot;date\&quot;:\&quot;2014-05-01 00:00:00\&quot; } &#x60;&#x60;&#x60; ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "name of the batch report",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "the start date of the batch report",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "the end date of the batch report",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "the description of the batch report",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preview_limit",
      "description" => "the limit on how much you can preview of the batch report",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page_url",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/report/region/summary/batch', {
  "resourcePath" => "/Reporting",
  "summary" => "Create Offline Report",
  "nickname" => "create_region_leg_summary_batch",
  "responseClass" => "ReportRegionLegSummaryBatchResponse",
  "endpoint" => "/report/region/summary/batch",
  "notes" => "Create an entry for the batch for offline report",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Array<RegionLegSummary>",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/report/batch/delete', {
  "resourcePath" => "/Reporting",
  "summary" => "Delete Offline Report",
  "nickname" => "delete_batch",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/report/batch/delete",
  "notes" => "Deletes a batch report.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the account",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "batch_id",
      "description" => "the id of the batch to delete",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/report/batch/get', {
  "resourcePath" => "/Reporting",
  "summary" => "Get Offline Report",
  "nickname" => "get_report_batch",
  "responseClass" => "ReportBatchResponse",
  "endpoint" => "/report/batch/get",
  "notes" => "Checks status of batch report.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "batch_id",
      "description" => "returned by /report/batch/create",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "all_results",
      "description" => "whether to return all batch results or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/report/run', {
  "resourcePath" => "/Reporting",
  "summary" => "Run Report",
  "nickname" => "run_report",
  "responseClass" => "ReportResponse",
  "endpoint" => "/report/run",
  "notes" => " This endpoint allows you to run a set of predefined reports that can be used to understand your users' behavior as well as trends within your application.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the user for passing account related params",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "query",
      "description" => "The named identifier of the query",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "parameters",
      "description" => "Parameter values used in the query in JSON format, example: &#x60;&#x60;&#x60;json {   \&quot;string\&quot;:\&quot;value\&quot;,    \&quot;number\&quot;:3.345,   \&quot;date\&quot;:\&quot;2014-05-01 00:00:00\&quot; } &#x60;&#x60;&#x60; ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "order",
      "description" => "The order to use, must be a column name (see response results for list of column names)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "desc",
      "description" => "If true then descending order, false is ascending",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "The start of the pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "The limit of the pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "response_format",
      "description" => "Determines what response format to return. Options are: JSON or CSV",
      "dataType" => "String",
      "allowableValues" => "[HTML, XML, JSON, CSV]",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/report/batch/search', {
  "resourcePath" => "/Reporting",
  "summary" => "Search Offline Reports",
  "nickname" => "search_batch",
  "responseClass" => "Array<ReportBatchResponse>",
  "endpoint" => "/report/batch/search",
  "notes" => "Retrieves batches for a user..",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the account logged in",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "names",
      "description" => "the names of the report batch to search on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "the application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "status",
      "description" => "the report batch status",
      "dataType" => "String",
      "allowableValues" => "[NEW, ERROR, COMPLETE, PARSE_ERROR, PROCESSING, DUPLICATE, SAVEONLY]",
      "paramType" => "query",
    },
    {
      "name" => "global_app_search",
      "description" => "the global app to search on",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "the start date of the report batch to search on",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "the end date of the report batch to search on",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "the start of the index and/or pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the limit of the index and/or pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

