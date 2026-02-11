require 'json'


MyApp.add_route('POST', '/api/3.18/trip', {
  "resourcePath" => "/Trip",
  "summary" => "Create Trip",
  "nickname" => "create_trip",
  "responseClass" => "Trip",
  "endpoint" => "/trip",
  "notes" => "Create a new trip",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Trip",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/3.18/trip/{id}', {
  "resourcePath" => "/Trip",
  "summary" => "Delete Trip",
  "nickname" => "delete",
  "responseClass" => "void",
  "endpoint" => "/trip/{id}",
  "notes" => "Delete an existing trip",
  "parameters" => [
    {
      "name" => "id",
      "description" => "the id of the trip to delete",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/trip/{id}/drive', {
  "resourcePath" => "/Trip",
  "summary" => "Set Trip Preference Driver",
  "nickname" => "drive_trip",
  "responseClass" => "Trip",
  "endpoint" => "/trip/{id}/drive",
  "notes" => "Update trip preference to drive, also create a route and assign the trip to the route",
  "parameters" => [
    {
      "name" => "recurrence",
      "description" => "the frequency of the trip (e.g. weekly, until 2018-08-09)",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "id",
      "description" => "the id of the trip",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/trip/{id}/flexible', {
  "resourcePath" => "/Trip",
  "summary" => "Set Trip Preference Flexible",
  "nickname" => "flexible_trip",
  "responseClass" => "Trip",
  "endpoint" => "/trip/{id}/flexible",
  "notes" => "Update trip preference to flexible.",
  "parameters" => [
    {
      "name" => "recurrence",
      "description" => "the frequency of the trip (e.g. weekly, until 2018-08-09)",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "id",
      "description" => "the id of the trip",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/trip/{id}', {
  "resourcePath" => "/Trip",
  "summary" => "Get Trip",
  "nickname" => "get_trip",
  "responseClass" => "Trip",
  "endpoint" => "/trip/{id}",
  "notes" => "Get an existing trip",
  "parameters" => [
    {
      "name" => "id",
      "description" => "the id of the trip to get",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/trip/{id}/match', {
  "resourcePath" => "/Trip",
  "summary" => "Get Trip Matches",
  "nickname" => "get_trip_matches",
  "responseClass" => "Array<Trip>",
  "endpoint" => "/trip/{id}/match",
  "notes" => "Get matching trips of specific trip",
  "parameters" => [
    {
      "name" => "matched_has_route",
      "description" => "Only return matchings that already have route assigned",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "matched_has_driver",
      "description" => "Only return matchings that already have driver assigned",
      "dataType" => "Boolean",
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
      "name" => "id",
      "description" => "The id The id of the trip to search for matches for",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/trip/match/process', {
  "resourcePath" => "/Trip",
  "summary" => "Process Trip Matches",
  "nickname" => "process_trip_matches",
  "responseClass" => "Array<Trip>",
  "endpoint" => "/trip/match/process",
  "notes" => "Process trip matching, assign trips with no route to matched trips with route.",
  "parameters" => [
    {
      "name" => "start_date",
      "description" => "The lower bound date to process matchings",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "The upper bound date to process matchings",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "trip_id",
      "description" => "the id of the trip to process",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/trip/{id}/ride', {
  "resourcePath" => "/Trip",
  "summary" => "Set Trip Preference Rider",
  "nickname" => "ride",
  "responseClass" => "Trip",
  "endpoint" => "/trip/{id}/ride",
  "notes" => "Update trip preference to ride.",
  "parameters" => [
    {
      "name" => "recurrence",
      "description" => "the frequency of the trip (e.g. weekly, until 2018-08-09)",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "id",
      "description" => "the id of the trip",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/trip', {
  "resourcePath" => "/Trip",
  "summary" => "Search Trips",
  "nickname" => "search",
  "responseClass" => "Array<Trip>",
  "endpoint" => "/trip",
  "notes" => "Search for trips",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The owner of the trips",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "The lower bound limit of time",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "The upper bound limit of time",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "has_notifications",
      "description" => "whether to search on trips that have notifications or not",
      "dataType" => "Boolean",
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


MyApp.add_route('GET', '/api/3.18/trip/match', {
  "resourcePath" => "/Trip",
  "summary" => "Search Trips",
  "nickname" => "search_trips",
  "responseClass" => "Array<Trip>",
  "endpoint" => "/trip/match",
  "notes" => "Search for trips with matching information.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The owner of the trips",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "The lower bound limit of time",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "The upper bound limit of time",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "matched_has_route",
      "description" => "Only return matchings that already have route assigned",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "matched_has_driver",
      "description" => "Only return matchings that already have driver assigned",
      "dataType" => "Boolean",
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


MyApp.add_route('POST', '/api/3.18/trip/{id}/locations', {
  "resourcePath" => "/Trip",
  "summary" => "Update Trip Locations",
  "nickname" => "update_locations",
  "responseClass" => "Trip",
  "endpoint" => "/trip/{id}/locations",
  "notes" => "",
  "parameters" => [
    {
      "name" => "id",
      "description" => "the id of the trip to update locations for",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Trip",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/trip/{id}/locations/recurrence', {
  "resourcePath" => "/Trip",
  "summary" => "Update Recurrence Locations",
  "nickname" => "update_recurrence_locations",
  "responseClass" => "Array<Trip>",
  "endpoint" => "/trip/{id}/locations/recurrence",
  "notes" => "",
  "parameters" => [
    {
      "name" => "id",
      "description" => "the id of the trip",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Trip",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/trip/{id}/shipments/recurrence', {
  "resourcePath" => "/Trip",
  "summary" => "Update Recurrence Shipments",
  "nickname" => "update_recurrence_shipments",
  "responseClass" => "Array<Trip>",
  "endpoint" => "/trip/{id}/shipments/recurrence",
  "notes" => "",
  "parameters" => [
    {
      "name" => "id",
      "description" => "the id of the trip",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Trip",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/trip/{id}/shipments', {
  "resourcePath" => "/Trip",
  "summary" => "Update Trip Shipments",
  "nickname" => "update_shipments",
  "responseClass" => "Trip",
  "endpoint" => "/trip/{id}/shipments",
  "notes" => "",
  "parameters" => [
    {
      "name" => "id",
      "description" => "the id of the trip shipments to update",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Trip",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/api/3.18/trip/{id}', {
  "resourcePath" => "/Trip",
  "summary" => "Update Trip",
  "nickname" => "update_trip",
  "responseClass" => "Trip",
  "endpoint" => "/trip/{id}",
  "notes" => "Update an existing trip. Does not support recurring trip update.",
  "parameters" => [
    {
      "name" => "id",
      "description" => "the id of the trip to update",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Trip",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/trip/notifications', {
  "resourcePath" => "/Trip",
  "summary" => "Trip Notifications",
  "nickname" => "update_trip_notifications",
  "responseClass" => "Trip",
  "endpoint" => "/trip/notifications",
  "notes" => "Update the trip notifications",
  "parameters" => [
    {
      "name" => "id",
      "description" => "the id of the trip",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "notifications",
      "description" => "the notifications to update on the trip",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

