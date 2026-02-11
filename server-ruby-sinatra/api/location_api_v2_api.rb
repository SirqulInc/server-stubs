require 'json'


MyApp.add_route('POST', '/api/3.18/location', {
  "resourcePath" => "/LocationApiV2",
  "summary" => "Create new location",
  "nickname" => "create_location_v2",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/location",
  "notes" => "Create a new location from a real object location.",
  "parameters" => [
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


MyApp.add_route('POST', '/api/3.18/location/{id}', {
  "resourcePath" => "/LocationApiV2",
  "summary" => "Update an existing location",
  "nickname" => "update_location_v2",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/location/{id}",
  "notes" => "Update an existing location",
  "parameters" => [
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

