require 'json'


MyApp.add_route('GET', '/api/3.18/pathing/compute', {
  "resourcePath" => "/Pathing",
  "summary" => "Calculate Path",
  "nickname" => "compute_path",
  "responseClass" => "PathingResponse",
  "endpoint" => "/pathing/compute",
  "notes" => "Calculates the shortest path from point to point on a grid",
  "parameters" => [
    {
      "name" => "data",
      "description" => "the data to with start, end point and exclusion points",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "units",
      "description" => "the system of measurement for directions: {METRIC, IMPERIAL}",
      "dataType" => "String",
      "allowableValues" => "[METRIC, IMPERIAL]",
      "paramType" => "query",
    },
    {
      "name" => "reduce_path",
      "description" => "determines whether to reduce the path to go in diagonal lines",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "directions",
      "description" => "determines whether to return text directions",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

