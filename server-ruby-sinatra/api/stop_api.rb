require 'json'


MyApp.add_route('GET', '/api/3.18/stop/{id}', {
  "resourcePath" => "/Stop",
  "summary" => "Get Stop",
  "nickname" => "get_stop",
  "responseClass" => "Stop",
  "endpoint" => "/stop/{id}",
  "notes" => "Get an existing stop",
  "parameters" => [
    {
      "name" => "id",
      "description" => "the id of the stop to get",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/api/3.18/stop/{id}', {
  "resourcePath" => "/Stop",
  "summary" => "Update Stop",
  "nickname" => "update_stop",
  "responseClass" => "Stop",
  "endpoint" => "/stop/{id}",
  "notes" => "Update an existing stop",
  "parameters" => [
    {
      "name" => "id",
      "description" => "the id of the stop to update",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Stop",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

