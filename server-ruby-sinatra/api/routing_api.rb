require 'json'


MyApp.add_route('POST', '/api/3.18/routing/compute', {
  "resourcePath" => "/Routing",
  "summary" => "Compute Route",
  "nickname" => "compute_routing",
  "responseClass" => "RoutingListResponse",
  "endpoint" => "/routing/compute",
  "notes" => "This service finds the most optimal routes for delivering items between locations (reducing transit time/resources). It can take in a list of vehicles and a list of items (to be transported).All load items have pick-up and drop-off locations with time windows for when the item is expected to be picked-up and dropped-off. ",
  "parameters" => [
    {
      "name" => "data",
      "description" => "Json object containing inputs for generating the routes. See description for more info. Also see RoutingRequest",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

