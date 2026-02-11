require 'json'


MyApp.add_route('POST', '/api/3.18/tracking/batch/create', {
  "resourcePath" => "/Tracking",
  "summary" => "Create Batch Tracking",
  "nickname" => "batch_save_tracking",
  "responseClass" => "Array<Leg>",
  "endpoint" => "/tracking/batch/create",
  "notes" => "Batch create tracking legs",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the device id (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "data",
      "description" => "JSON array of tracking legs &#x60;&#x60;&#x60;json [   \&quot;distance\&quot;: \&quot;0.08\&quot;,   \&quot;duration\&quot;: \&quot;10000\&quot;,   \&quot;startLatitude\&quot;: \&quot;47.614603\&quot;,   \&quot;startLongitude\&quot;: \&quot;-122.350518\&quot;,   \&quot;endLatitude\&quot;: \&quot;47.614384\&quot;,   \&quot;endLongitude\&quot;: \&quot;-122.349161\&quot;,   \&quot;startDate\&quot;: \&quot;1361924010000\&quot;,   \&quot;endDate\&quot;: \&quot;1361924020000\&quot;,   \&quot;steps\&quot;: [     {       \&quot;distance\&quot;: \&quot;0.03\&quot;,       \&quot;duration\&quot;: \&quot;5000\&quot;,       \&quot;startLat\&quot;: \&quot;47.614603\&quot;,       \&quot;startLng\&quot;: \&quot;-122.350518\&quot;,       \&quot;startDate\&quot;: \&quot;1361924010000\&quot;,       \&quot;endLat\&quot;: \&quot;47.614941\&quot;,       \&quot;endLng\&quot;: \&quot;-122.350062\&quot;,       \&quot;endDate\&quot;: \&quot;1361924015000\&quot;     },{       \&quot;distance\&quot;: \&quot;0.05\&quot;,       \&quot;duration\&quot;: \&quot;5000\&quot;,       \&quot;startLat\&quot;: \&quot;47.614941\&quot;,       \&quot;startLng\&quot;: \&quot;-122.350062\&quot;,       \&quot;startDate\&quot;: \&quot;1361924015000\&quot;,       \&quot;endLat\&quot;: \&quot;47.614384\&quot;,       \&quot;endLng\&quot;: \&quot;-122.349161\&quot;,       \&quot;endDate\&quot;: \&quot;1361924020000\&quot;     }   ] ] &#x60;&#x60;&#x60; ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "generate_accounts",
      "description" => "Whether to generate accounts for tracking entries when the owner does not exist",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "update_account_locations",
      "description" => "Whether to update the account&#39;s current location from the incoming tracking data",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "default_tag",
      "description" => "The default tag to apply to incoming legs when no tag is provided",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'PASSIVE'",
      "paramType" => "query",
    },
    {
      "name" => "slave_uid",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/tracking/predicted/get', {
  "resourcePath" => "/Tracking",
  "summary" => "Get Predicted Locations",
  "nickname" => "get_predicted_locations",
  "responseClass" => "PredictedLocationResponse",
  "endpoint" => "/tracking/predicted/get",
  "notes" => "Get the predicted location for a customer based on previous behavior.  If a customer resides in a place for a period of time this is marked as a preferred location.  We look back over the previous few days and the previous days of the week from the day specified.  If for instance the day was a Wednesday then this would check the days before, including: Tuesday, Monday, Sunday, etc. It will also check some number of previous Wednesdays in the past few weeks.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the customer",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "latitude to return a more likely result set based on the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "longitude to return a more likely result set based on the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "date_check",
      "description" => "Used to specify which day to get predicted locations for. So if you want to look at where they might be tomorrow, pass in tomorrow&#39;s date (timestamp in milliseconds). If no value is passed in, the current date will be used.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "hour_check",
      "description" => "Comma separated list of hours that will filter the results on the hours specified. For example, if you want to see predicted locations for the mornings and evening you can pass in \&quot;8,9,10,11,17,18,19,20\&quot;.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "threshold",
      "description" => "The minimum number matches in 1 hour to be considered a likely location.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "1",
      "paramType" => "query",
    },
    {
      "name" => "distance_unit",
      "description" => "Determines which unit of measurement gets returned for distances: {MILES, KILOMETERS}",
      "dataType" => "String",
      "allowableValues" => "[MILES, KILOMETERS]",
      "defaultValue" => "'MILES'",
      "paramType" => "query",
    },
    {
      "name" => "search_range",
      "description" => "Filter results so only locations within the specified radius will be returned. The distance can either be in miles or kilometers as specified in the distanceUnit parameter. A value of \&quot;0\&quot; (zero) will ignore the radius restriction.",
      "dataType" => "Float",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "sort_order",
      "description" => "The ordering algorithm for sorting the returned results: {MATCHES, DISTANCE, WEIGHTED}",
      "dataType" => "String",
      "allowableValues" => "[MATCHES, DISTANCE, WEIGHTED]",
      "defaultValue" => "'MATCHES'",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/tracking/path/get', {
  "resourcePath" => "/Tracking",
  "summary" => "Get Tracking Path",
  "nickname" => "get_predicted_path",
  "responseClass" => "Array<StepResponse>",
  "endpoint" => "/tracking/path/get",
  "notes" => "Get the path (lat/long coordinates) between 2 steps previously logged for a customer.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the customer",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_step_id",
      "description" => "The stepId to begin from",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_step_id",
      "description" => "The stepId to end with",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/tracking/preferred/search', {
  "resourcePath" => "/Tracking",
  "summary" => "Search Preferred Locations",
  "nickname" => "get_preferred_locations",
  "responseClass" => "Array<PreferredLocationResponse>",
  "endpoint" => "/tracking/preferred/search",
  "notes" => "Search on preferred locations for a user, which is created when a customer resides in a place for a period of time.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the customer",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "latitude to return a more likely result set based on the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "longitude to return a more likely result set based on the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "date_check",
      "description" => "Used to specify which day to get preferred locations for. So if you want to look at where they might be tomorrow, pass in tomorrow&#39;s date (timestamp in milliseconds). If no value is passed in, results from all time will be returned.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "hour_check",
      "description" => "Comma separated list of hours that will filter the results on the hours specified. For example, if you want to see preferred locations for the mornings and evening you can pass in \&quot;8,9,10,11,17,18,19,20\&quot;.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "Specifies how the results will be ordered. Supported values include: CREATED - the time of when the preferred location data was processed. PREFERRED_DATE - the time of when the user sent in the tracking data. HOUR - the hour of when the user sent in the tracking data. DURATION - the duration of the preferred location",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'PREFERRED_DATE'",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "Determines whether the sorted list is in descending or ascending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "The start index for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "The limit for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    {
      "name" => "search_range",
      "description" => "Filter results so only locations within the specified radius will be returned. The distance can either be in miles or kilometers as specified in the distanceUnit parameter. A value of \&quot;0\&quot; (zero) will ignore the radius restriction.",
      "dataType" => "Float",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "distance_unit",
      "description" => "Determines which unit of measurement gets returned for distances: {MILES, KILOMETERS}",
      "dataType" => "String",
      "allowableValues" => "[MILES, KILOMETERS]",
      "defaultValue" => "'MILES'",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/tracking/search', {
  "resourcePath" => "/Tracking",
  "summary" => "Search Tracking",
  "nickname" => "get_tracking_legs",
  "responseClass" => "Array<LegResponse>",
  "endpoint" => "/tracking/search",
  "notes" => "Retrieve tracking data to be able to show where a user has been.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the device id (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "owner_id",
      "description" => "the account id of the person the user wants to tracking data for",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tracking_device_id",
      "description" => "the id of the tracking device",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "the start date in (UTC milliseconds) to filter the tracking results. If no startDate is passed in, the last 30 days will be returned.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "the end date in (UTC milliseconds) to filter the tracking results",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tags",
      "description" => "filter results by tag",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "get_last_point",
      "description" => "gets the last known location of the user",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/tracking/leg/create', {
  "resourcePath" => "/Tracking",
  "summary" => "Create Tracking Leg",
  "nickname" => "save_tracking_leg",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/tracking/leg/create",
  "notes" => "Send tracking points to be able to generate pathing data",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the device id (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "distance",
      "description" => "the total distance",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "duration",
      "description" => "the total duration",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_lat",
      "description" => "the latitude of the first point",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_lng",
      "description" => "the longitude of the first point",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "the start date (in UTC milliseconds) of the first point",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_lat",
      "description" => "the latitude of the last point",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_lng",
      "description" => "the longitude of the last point",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "the end date (in UTC milliseconds) of the last point",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "steps",
      "description" => "JSON array of tracking vectors used for smoother pathing data. If null then the leg data will be used to generate a single step, if an empty array then no steps will be generated. &#x60;&#x60;&#x60;json [{   \&quot;distance\&quot;: \&quot;0.03\&quot;,   \&quot;duration\&quot;: \&quot;5000\&quot;,   \&quot;startLat\&quot;: \&quot;47.614603\&quot;,   \&quot;startLng\&quot;: \&quot;-122.350518\&quot;,   \&quot;startDate\&quot;: \&quot;1361924010000\&quot;,   \&quot;endLat\&quot;: \&quot;47.614941\&quot;,   \&quot;endLng\&quot;: \&quot;-122.350062\&quot;,   \&quot;endDate\&quot;: \&quot;1361924015000\&quot; }] &#x60;&#x60;&#x60; ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tags",
      "description" => "name the leg for searching",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/tracking/step/create', {
  "resourcePath" => "/Tracking",
  "summary" => "Create Tracking Step",
  "nickname" => "save_tracking_step",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/tracking/step/create",
  "notes" => "Send tracking points to be able to generate pathing data",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the device id (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "leg_id",
      "description" => "the leg to add the step to",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "distance",
      "description" => "the total distance",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "duration",
      "description" => "the total duration",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_lat",
      "description" => "the latitude of the first point",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_lng",
      "description" => "the longitude of the first point",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "the start date (in UTC milliseconds) of the first point",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_lat",
      "description" => "the latitude of the last point",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_lng",
      "description" => "the longitude of the last point",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "the end date (in UTC milliseconds) of the last point",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/tracking/list', {
  "resourcePath" => "/Tracking",
  "summary" => "List Tracking",
  "nickname" => "search_accounts_with_tracking_legs",
  "responseClass" => "Array<AccountMiniResponse>",
  "endpoint" => "/tracking/list",
  "notes" => "Search for all accounts that have tracking legs data by the given constraints.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "Used for LIKE search of first or last name on the acocunt",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "Range to begin in UTC milliseconds",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "Range to end in UTC milliseconds",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tags",
      "description" => "Exact match on tag field of Legs&#39;s searchTag",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_ids",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "Origin latitude to perform searching constraints with given range",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "Origin longitude to perform searching constraints with given range",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "range",
      "description" => "The radius, in miles, to perform the search for",
      "dataType" => "Float",
      "allowableValues" => "",
      "defaultValue" => "5",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "The column to sort the search on. Possible values include: {LEG_START_DATE, ACCOUNT_DISPLAY}",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'LEG_START_DATE'",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "The order to return the results. Default is false, which will return the results in ascending order.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "The index into the record set to start with. Default is 0.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "The total number of records to return. Default is 20.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    {
      "name" => "active_only",
      "description" => "Determines whether to return only active results. Default is false.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/tracking/searchByBillable', {
  "resourcePath" => "/Tracking",
  "summary" => "Search Tracking (Billable)",
  "nickname" => "search_tracking_legs",
  "responseClass" => "Array<LegResponse>",
  "endpoint" => "/tracking/searchByBillable",
  "notes" => "Retrieve tracking data for billable/account scoped queries.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id to search tracking for",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tracking_device_id",
      "description" => "The id of the tracking device",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "The start date in (UTC milliseconds) to filter the tracking results",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "The end date in (UTC milliseconds) to filter the tracking results",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tags",
      "description" => "Filter results by tag",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "The start index for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "The limit for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "100",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

