require 'json'


MyApp.add_route('GET', '/api/{version}/csvimport/batch/status/details', {
  "resourcePath" => "/CSVImport",
  "summary" => "Detail Status",
  "nickname" => "get_status_csv",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/csvimport/batch/status/details",
  "notes" => "",
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
      "description" => "the id of the batch",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "response_group",
      "description" => "The group of categories to return: SUMMARY, DETAILS, ERRORS, OR ALL",
      "dataType" => "String",
      "allowableValues" => "[SUMMARY, DETAILS, ERRORS, ALL]",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "the start of the pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the limit of the pagination",
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


MyApp.add_route('GET', '/api/{version}/csvimport/batch/list', {
  "resourcePath" => "/CSVImport",
  "summary" => "Search Status",
  "nickname" => "list_status_csv",
  "responseClass" => "CsvImportResponse",
  "endpoint" => "/api/{version}/csvimport/batch/list",
  "notes" => "Retrieves batches for a user.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the account",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "the start of the pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the limit of the pagination",
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


MyApp.add_route('GET', '/api/{version}/csvimport/batch/status', {
  "resourcePath" => "/CSVImport",
  "summary" => "Batch Status",
  "nickname" => "status_csv",
  "responseClass" => "CsvImportResponse",
  "endpoint" => "/api/{version}/csvimport/batch/status",
  "notes" => "Checks status of batch upload.",
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
      "description" => "the id of the batch to get its status",
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


MyApp.add_route('POST', '/api/{version}/csvimport/upload', {
  "resourcePath" => "/CSVImport",
  "summary" => "Upload CSV",
  "nickname" => "upload_csv",
  "responseClass" => "CsvImportResponse",
  "endpoint" => "/api/{version}/csvimport/upload",
  "notes" => "Uploads a CSV import file.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the account",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "upload_type",
      "description" => "the upload type: OFFERS, RETAILERS, RETAILERLOCATIONS, CATEGORIES, OR FILTERS",
      "dataType" => "String",
      "allowableValues" => "[OFFERS, RETAILERS, RETAILERLOCATIONS, CATEGORIES, FILTERS]",
      "paramType" => "query",
    },
    {
      "name" => "import_file",
      "description" => "the import file to reference",
      "dataType" => "File",
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
      "name" => "file_format",
      "description" => "the format of the file",
      "dataType" => "String",
      "allowableValues" => "[EXCEL, MYSQL, RFC4180, TDF]",
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

