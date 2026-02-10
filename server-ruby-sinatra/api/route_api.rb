require 'json'


MyApp.add_route('POST', '/api/{version}/route/{routeId}/approve', {
  "resourcePath" => "/Route",
  "summary" => "Approve Route",
  "nickname" => "approve_route",
  "responseClass" => "Route",
  "endpoint" => "/api/{version}/route/{routeId}/approve",
  "notes" => "Approve a route",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "route_id",
      "description" => "the id of the route to approve",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/route/{routeId}/copy', {
  "resourcePath" => "/Route",
  "summary" => "Copy Route",
  "nickname" => "copy_route",
  "responseClass" => "Route",
  "endpoint" => "/api/{version}/route/{routeId}/copy",
  "notes" => "Make an copy of the given route with optional overriding properties",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "route_id",
      "description" => "the id of the route to duplicate",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Route",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/route', {
  "resourcePath" => "/Route",
  "summary" => "Create Route",
  "nickname" => "create_route",
  "responseClass" => "Route",
  "endpoint" => "/api/{version}/route",
  "notes" => "Create new route",
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
      "dataType" => "Route",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/api/{version}/route/{routeId}/directions', {
  "resourcePath" => "/Route",
  "summary" => "Update Route Directions",
  "nickname" => "create_route_directions",
  "responseClass" => "Array<Direction>",
  "endpoint" => "/api/{version}/route/{routeId}/directions",
  "notes" => "Regenerate the directions of a route",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "route_id",
      "description" => "the id of the route to update directions for",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/api/{version}/route/{routeId}/polyline', {
  "resourcePath" => "/Route",
  "summary" => "Create Route Polyline",
  "nickname" => "create_route_polyline",
  "responseClass" => "Route",
  "endpoint" => "/api/{version}/route/{routeId}/polyline",
  "notes" => "Update the polyline of the requested route",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "route_id",
      "description" => "the id of the route to create a polyline for",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/{version}/route/{routeId}', {
  "resourcePath" => "/Route",
  "summary" => "Delete Route",
  "nickname" => "delete_route",
  "responseClass" => "void",
  "endpoint" => "/api/{version}/route/{routeId}",
  "notes" => "Delete an existing route",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "route_id",
      "description" => "the id of the route",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/route/{routeId}/disapprove', {
  "resourcePath" => "/Route",
  "summary" => "Disapprove Route",
  "nickname" => "disapprove_route",
  "responseClass" => "Route",
  "endpoint" => "/api/{version}/route/{routeId}/disapprove",
  "notes" => "Disapprove a route",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "route_id",
      "description" => "the id of the route to reject",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/route/{routeId}', {
  "resourcePath" => "/Route",
  "summary" => "Get Route",
  "nickname" => "get_route",
  "responseClass" => "Route",
  "endpoint" => "/api/{version}/route/{routeId}",
  "notes" => "Get an existing route",
  "parameters" => [
    {
      "name" => "show_inherited_properties",
      "description" => "return inherited properties from parent or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "route_id",
      "description" => "the id of the route to get",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/route/{routeId}/directions', {
  "resourcePath" => "/Route",
  "summary" => "Get Route Directions",
  "nickname" => "get_route_directions",
  "responseClass" => "Array<Direction>",
  "endpoint" => "/api/{version}/route/{routeId}/directions",
  "notes" => "Get the directions of a route",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "route_id",
      "description" => "the id of the route to get directions for",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/route/{routeId}/shipments', {
  "resourcePath" => "/Route",
  "summary" => "Get Route Shipments",
  "nickname" => "get_route_shipments",
  "responseClass" => "Array<Shipment>",
  "endpoint" => "/api/{version}/route/{routeId}/shipments",
  "notes" => "Get the shipments on the requested route",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "route_id",
      "description" => "the id of the route to get shipments for",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/route/{routeId}/stop/{stopId}', {
  "resourcePath" => "/Route",
  "summary" => "Get Route Stop",
  "nickname" => "get_route_stop",
  "responseClass" => "Stop",
  "endpoint" => "/api/{version}/route/{routeId}/stop/{stopId}",
  "notes" => "Get the specific stop on a route",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "route_id",
      "description" => "the id of the route to get stops for",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "stop_id",
      "description" => "the id of the specific stop on the route",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/route/{routeId}/stops', {
  "resourcePath" => "/Route",
  "summary" => "Get Route Stops",
  "nickname" => "get_route_stops",
  "responseClass" => "Array<Stop>",
  "endpoint" => "/api/{version}/route/{routeId}/stops",
  "notes" => "The stops of the route requested",
  "parameters" => [
    {
      "name" => "confirmed_only",
      "description" => "only get stops that have been confirmed or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "route_id",
      "description" => "the id of the route",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/route/{routeId}/stop/{stopId}/shipments', {
  "resourcePath" => "/Route",
  "summary" => "Get Shipments At Stop",
  "nickname" => "get_shipments_at_stop",
  "responseClass" => "Array<Shipment>",
  "endpoint" => "/api/{version}/route/{routeId}/stop/{stopId}/shipments",
  "notes" => "Get the list of shipments on the requested route at a stop",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "route_id",
      "description" => "the id of the route",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "stop_id",
      "description" => "the id of the stop to get shipments on",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/route/{routeId}/optimize', {
  "resourcePath" => "/Route",
  "summary" => "Optimize Route",
  "nickname" => "optimize_route",
  "responseClass" => "void",
  "endpoint" => "/api/{version}/route/{routeId}/optimize",
  "notes" => "Optimize a route. The optimization method based on how the server is configured.",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "route_id",
      "description" => "the id of the route to optimize",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/{version}/route/{routeId}/stop/{stopId}', {
  "resourcePath" => "/Route",
  "summary" => "Delete Stop",
  "nickname" => "remove_stop",
  "responseClass" => "void",
  "endpoint" => "/api/{version}/route/{routeId}/stop/{stopId}",
  "notes" => "Delete a stop on a route",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "route_id",
      "description" => "the id of the route",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "stop_id",
      "description" => "the id of the specific stop to delete on the route",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/api/{version}/route/{routeId}/stops/reorder', {
  "resourcePath" => "/Route",
  "summary" => "Reorder Route Stops",
  "nickname" => "reorder_route_stops_patch",
  "responseClass" => "Array<Stop>",
  "endpoint" => "/api/{version}/route/{routeId}/stops/reorder",
  "notes" => "Reordering the stops on the route with and update route distance, time, direction, and polyline",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "route_id",
      "description" => "the id of the route",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Array<Stop>",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/route/{routeId}/stops/reorder', {
  "resourcePath" => "/Route",
  "summary" => "Reorder Route Stops",
  "nickname" => "reorder_route_stops_post",
  "responseClass" => "Array<Stop>",
  "endpoint" => "/api/{version}/route/{routeId}/stops/reorder",
  "notes" => "Reordering the stops on the route with and update route distance, time, direction, and polyline",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "route_id",
      "description" => "the id of the route",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Array<Stop>",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/route', {
  "resourcePath" => "/Route",
  "summary" => "Search Routes",
  "nickname" => "search_routes",
  "responseClass" => "Array<Route>",
  "endpoint" => "/api/{version}/route",
  "notes" => "Search for routes.",
  "parameters" => [
    {
      "name" => "hub_id",
      "description" => "Filter results by service hub",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "program_id",
      "description" => "Filter results by program",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "scheduled_start",
      "description" => "The start date to filter the results by",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "scheduled_end",
      "description" => "The end date to filter the results by",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "updated_start",
      "description" => "The lower bound of updated date",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "updated_end",
      "description" => "The upper bound of updated date",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "featured",
      "description" => "The route is featured or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "seat_count",
      "description" => "Has at least this many seat available",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "approved",
      "description" => "Has been approved or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "started",
      "description" => "Has started or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "completed",
      "description" => "Has completed or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "valid",
      "description" => "Is valid or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "parent_id",
      "description" => "If it is a recurring route based on the parent route",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "The field to sort by",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "Determines whether the sorted list is in descending or ascending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "The start index for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "The limit for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active_only",
      "description" => "Return only active results",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "includes_empty",
      "description" => "Include empty routes or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "root_only",
      "description" => "Only return root instance routes",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "show_inherited_properties",
      "description" => "Display root route properties",
      "dataType" => "Boolean",
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


MyApp.add_route('POST', '/api/{version}/route/{id}/driver/{driverId}', {
  "resourcePath" => "/Route",
  "summary" => "Set Driver",
  "nickname" => "set_driver",
  "responseClass" => "void",
  "endpoint" => "/api/{version}/route/{id}/driver/{driverId}",
  "notes" => "Update the driver of the route.",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "id",
      "description" => "the id of the route",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "driver_id",
      "description" => "the id of the driver",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/api/{version}/route/{routeId}', {
  "resourcePath" => "/Route",
  "summary" => "Update Route",
  "nickname" => "update_route",
  "responseClass" => "Route",
  "endpoint" => "/api/{version}/route/{routeId}",
  "notes" => "Update an existing route",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "route_id",
      "description" => "the id of the route",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Route",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/api/{version}/route/{routeId}/stop/{stopId}', {
  "resourcePath" => "/Route",
  "summary" => "Update Route Stop",
  "nickname" => "update_route_stop",
  "responseClass" => "void",
  "endpoint" => "/api/{version}/route/{routeId}/stop/{stopId}",
  "notes" => "Update a stop on a specified route",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "route_id",
      "description" => "the id of the route to update stops for",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "stop_id",
      "description" => "the id of the specific stop to update on the route",
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

