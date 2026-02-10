require 'json'


MyApp.add_route('POST', '/api/{version}/entity/reference', {
  "resourcePath" => "/Activity",
  "summary" => "Create an entity reference.",
  "nickname" => "create_entity_reference",
  "responseClass" => "ActivityResponse",
  "endpoint" => "/api/{version}/entity/reference",
  "notes" => "Creates a reference for an entity for syncing data between servers.",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "The entity reference object",
      "dataType" => "EntityReference",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

