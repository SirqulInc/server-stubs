require 'json'


MyApp.add_route('GET', '/api/{version}/weather/search', {
  "resourcePath" => "/Weather",
  "summary" => "Search Weather",
  "nickname" => "search_weather",
  "responseClass" => "WeatherResponse",
  "endpoint" => "/api/{version}/weather/search",
  "notes" => "Search the weather forcast for the next 5 days",
  "parameters" => [
    {
      "name" => "region_id",
      "description" => "Region Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "Latitude",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "Longitude",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "timezone_offset",
      "description" => "Timezone Offset",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "-6",
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

