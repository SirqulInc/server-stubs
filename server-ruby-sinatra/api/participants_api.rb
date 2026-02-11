require 'json'


MyApp.add_route('POST', '/api/3.18/participant/process/all', {
  "resourcePath" => "/Participants",
  "summary" => "Process All Participant Feeds",
  "nickname" => "process_all_participants",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/participant/process/all",
  "notes" => "Processes all supported participant feeds.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key used to identify the application",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "use_short_name_as_id",
      "description" => "Whether to use short name as the participant ID",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/participant/process', {
  "resourcePath" => "/Participants",
  "summary" => "Process Participants Feed",
  "nickname" => "process_participants",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/participant/process",
  "notes" => "Processes a participant feed or uploaded file for a specific league.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "league",
      "description" => "The league identifier to process",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key used to identify the application",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "use_short_name_as_id",
      "description" => "Whether to use short name as the participant ID",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "file",
      "description" => "Multipart file containing participant feed contents",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

