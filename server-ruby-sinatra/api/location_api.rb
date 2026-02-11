require 'json'


MyApp.add_route('POST', '/api/3.18/location/trilaterate/cache', {
  "resourcePath" => "/Location",
  "summary" => "Create Trilateration Data with File",
  "nickname" => "cache_trilateration_data",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/location/trilaterate/cache",
  "notes" => "Creates trilateration samples for a source device (i.e. a router).",
  "parameters" => [
    {
      "name" => "udid",
      "description" => "The unique identifier of the source device",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "source_time",
      "description" => "The current timestamp of the source device",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "minimum_sample_size",
      "description" => "the minimum number of Edysen devices that must be used to be able to trilaterate a device",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "data",
      "description" => "The json formated sample data:  &#x60;&#x60;&#x60;json {    \&quot;count\&quot;: 2,   \&quot;timespan\&quot;: 10,    \&quot;samples\&quot;: [     {       \&quot;deviceId\&quot;: \&quot;device1\&quot;,       \&quot;randomizedId\&quot;: true,        \&quot;deviceSignature\&quot;: \&quot;probe:xyz...\&quot;,        \&quot;alternativeId\&quot;:\&quot;adc123\&quot;,        \&quot;rssi\&quot;: [-63, -75]     },      {       \&quot;deviceId\&quot;: \&quot;device2\&quot;,       \&quot;randomizedId\&quot;: true,        \&quot;deviceSignature\&quot;: \&quot;probe:xyz...\&quot;,        \&quot;alternativeId\&quot;: \&quot;adc123\&quot;,        \&quot;rssi\&quot;: [-83, -79]     }   ] } &#x60;&#x60;&#x60; ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "data_file",
      "description" => "Binary file containing data (multipart upload)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/location/trilaterate/cache/submit', {
  "resourcePath" => "/Location",
  "summary" => "Create Trilateration Data with Rest",
  "nickname" => "cache_trilateration_data_gzip",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/location/trilaterate/cache/submit",
  "notes" => "Creates trilateration samples for a source device (i.e. a router).",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "TrilatCacheRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/location/ip', {
  "resourcePath" => "/Location",
  "summary" => "Get Location by IP",
  "nickname" => "get_location_by_ip",
  "responseClass" => "CoordsResponse",
  "endpoint" => "/location/ip",
  "notes" => "Get location information based on an IP address.",
  "parameters" => [
    {
      "name" => "ip",
      "description" => "the ip address of the client device",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/account/location/trilaterate', {
  "resourcePath" => "/Location",
  "summary" => "Get Location by Trilateration",
  "nickname" => "get_location_by_trilateration",
  "responseClass" => "GeoPointResponse",
  "endpoint" => "/account/location/trilaterate",
  "notes" => "Send in device data and calculate a position based on signal strengths.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account making the request, if provided the last know location will be updated",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "The known GPS latitude to compare to the calculated version",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The known GPS longitude to compare to the calculated version",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "data",
      "description" => "The json formated sample data:  &#x60;&#x60;&#x60;json {    \&quot;count\&quot;: 2,   \&quot;timespan\&quot;: 10,    \&quot;samples\&quot;: [     {       \&quot;deviceId\&quot;: \&quot;device1\&quot;,       \&quot;rssi\&quot;: [-63, -75]     },      {       \&quot;deviceId\&quot;: \&quot;device2\&quot;,       \&quot;rssi\&quot;: [-83, -79]     }   ] } &#x60;&#x60;&#x60; ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "response_filters",
      "description" => "Optional response filters (not used currently)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/location/search', {
  "resourcePath" => "/Location",
  "summary" => "Search Regions or Postal Codes",
  "nickname" => "get_locations",
  "responseClass" => "LocationSearchResponse",
  "endpoint" => "/location/search",
  "notes" => "Searches geographic locations by proximity via address or keyword.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the device id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "currentlatitude",
      "description" => "This parameter is deprecated.",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "currentlongitude",
      "description" => "This parameter is deprecated.",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "current_latitude",
      "description" => "the current latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "current_longitude",
      "description" => "the current longitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "query",
      "description" => "the query results by keyword or address",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "zipcode",
      "description" => "This parameter is deprecated.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "zip_code",
      "description" => "the zip code to filter results",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "selected_maplatitude",
      "description" => "This parameter is deprecated.",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "selected_maplongitude",
      "description" => "This parameter is deprecated.",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "selected_map_latitude",
      "description" => "the latitude of where the search should originate from",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "selected_map_longitude",
      "description" => "the longitude of where the search should originate from",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "search_range",
      "description" => "the search range of the search in miles",
      "dataType" => "Float",
      "allowableValues" => "",
      "defaultValue" => "5",
      "paramType" => "query",
    },
    {
      "name" => "use_geocode",
      "description" => "determines whether to allow searches via address",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "_i",
      "description" => "This parameter is deprecated.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "the start index for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "_l",
      "description" => "This parameter is deprecated.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the limit for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

