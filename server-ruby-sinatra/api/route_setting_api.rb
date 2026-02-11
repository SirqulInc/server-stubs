require 'json'


MyApp.add_route('POST', '/api/3.18/route/setting', {
  "resourcePath" => "/RouteSetting",
  "summary" => "Create Route Setting",
  "nickname" => "create_route_settings",
  "responseClass" => "RouteSettings",
  "endpoint" => "/route/setting",
  "notes" => "Create a new route setting",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "RouteSettings",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/3.18/route/setting/{routeSettingsId}', {
  "resourcePath" => "/RouteSetting",
  "summary" => "Delete Route Setting",
  "nickname" => "delete_route_settings",
  "responseClass" => "Object",
  "endpoint" => "/route/setting/{routeSettingsId}",
  "notes" => "Delete an existing route setting",
  "parameters" => [
    {
      "name" => "route_settings_id",
      "description" => "the id of the route setting to delete",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/route/setting/{routeSettingsId}', {
  "resourcePath" => "/RouteSetting",
  "summary" => "Get Route Setting",
  "nickname" => "get_route_settings",
  "responseClass" => "RouteSettings",
  "endpoint" => "/route/setting/{routeSettingsId}",
  "notes" => "Get an existing route settings",
  "parameters" => [
    {
      "name" => "route_settings_id",
      "description" => "the id of the route settings to get",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/route/setting', {
  "resourcePath" => "/RouteSetting",
  "summary" => "Search Route Settings",
  "nickname" => "search_route_settings",
  "responseClass" => "Array<RouteSettings>",
  "endpoint" => "/route/setting",
  "notes" => "Search for route settings",
  "parameters" => [
    {
      "name" => "hub_id",
      "description" => "The service hub that the route belongs under",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "program_id",
      "description" => "The program that the route belongs under",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "The keyword to search for the route",
      "dataType" => "String",
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/api/3.18/route/setting/{routeSettingsId}', {
  "resourcePath" => "/RouteSetting",
  "summary" => "Update Route Setting",
  "nickname" => "update_route_settings",
  "responseClass" => "RouteSettings",
  "endpoint" => "/route/setting/{routeSettingsId}",
  "notes" => "Update an existing route setting",
  "parameters" => [
    {
      "name" => "route_settings_id",
      "description" => "the id of the route settings to update",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "RouteSettings",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

