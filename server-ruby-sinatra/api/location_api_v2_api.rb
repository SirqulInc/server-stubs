require 'json'


MyApp.add_route('POST', '/api/{version}/location', {
  "resourcePath" => "/LocationApiV2",
  "summary" => "Create new location",
  "nickname" => "create_location_v2",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/location",
  "notes" => "Create a new location from a real object location.",
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
      "dataType" => "Location",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/location/{id}', {
  "resourcePath" => "/LocationApiV2",
  "summary" => "Update an existing location",
  "nickname" => "update_location_v2",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/location/{id}",
  "notes" => "Update an existing location",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "id",
      "description" => "the id of the location to update",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Location",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

