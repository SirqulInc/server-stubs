require 'json'


MyApp.add_route('POST', '/api/{version}/audience/create', {
  "resourcePath" => "/Audience",
  "summary" => "Create Audience",
  "nickname" => "create_audience",
  "responseClass" => "AudienceResponse",
  "endpoint" => "/api/{version}/audience/create",
  "notes" => "Create a user defined audience.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the audience",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "The description of the audience",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "search_tags",
      "description" => "The search tags",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "gender",
      "description" => "The gender; possible values are: MALE, FEMALE, ANY",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "age_groups",
      "description" => "The list of age groups, comma separated; possible values are AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS, AGE_ANY (to reset to none)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "The list of category ids, comma separated; possible values are retrieved via /api/{version}/category/search (pass in id values)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "application_ids",
      "description" => "The list of application ids, comma separated; possible values are retrieved via /api/{version}/application/list (pass in id values)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_experience_level",
      "description" => "The experience level of the player; possible values are: ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "devices",
      "description" => "(Deprecated) Use deviceIds. The list of targeted device names, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in name values)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "device_ids",
      "description" => "The list of targeted device ids, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in id values)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "device_versions",
      "description" => "The list of targeted device version ranges that are aligned with the provided devices list, comma separated (examples: 2.3-X, 0-5.1.4, 4.3.1-6.1.4)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "locations",
      "description" => "The list of locations to build the center around; comma separated list of latitude/longitude pairs (example: lat1,long1,lat2,long2)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "radius",
      "description" => "The list of radius of influence for the audience, in miles; comma separated list. Either provide 1 to be applied to all location pairs or a matching list to each lat/long pair.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_time_offset",
      "description" => "Seconds from the start time of an event",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_time_offset",
      "description" => "Seconds from the end time of an event",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "send_suggestion",
      "description" => "If true, then notify matching users when they are inside the radius",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "associate_description",
      "description" => "The description of the associated object",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "associate_type",
      "description" => "The type of the object to center the audience geofence",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "associate_id",
      "description" => "The ID of the object to center the audience geofence",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "grouping_id",
      "description" => "Optional grouping id for the audience",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "meta_data",
      "description" => "External custom client defined data",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "visibility",
      "description" => "Visibility of the audience",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_type",
      "description" => "Type of audience",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "use_order",
      "description" => "Use order for cohort",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "cohort_regions_data",
      "description" => "Cohort data for \&quot;cohort\&quot; audience type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Filter results by application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "trilateration_types",
      "description" => "Trilateration types",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "unique_name",
      "description" => "If true, makes sure the audience name is unique",
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


MyApp.add_route('POST', '/api/{version}/audience/delete', {
  "resourcePath" => "/Audience",
  "summary" => "Delete Audience",
  "nickname" => "delete_audience",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/audience/delete",
  "notes" => "Delete an audience. The audience and account must be valid and have the appropirate permissions to view the content.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_id",
      "description" => "The id of the audience to delete.",
      "dataType" => "Integer",
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


MyApp.add_route('GET', '/api/{version}/audience/ageGroups', {
  "resourcePath" => "/Audience",
  "summary" => "Get Age Groups",
  "nickname" => "get_age_groups",
  "responseClass" => "Array<AgeGroupResponse>",
  "endpoint" => "/api/{version}/audience/ageGroups",
  "notes" => "Gets the list of available age groups that can be selected by consumers and retailers targeting offers.",
  "parameters" => [
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


MyApp.add_route('GET', '/api/{version}/audience/get', {
  "resourcePath" => "/Audience",
  "summary" => "Get Audience",
  "nickname" => "get_audience",
  "responseClass" => "AudienceResponse",
  "endpoint" => "/api/{version}/audience/get",
  "notes" => "Get an audience. The audience and account must be valid and have the appropriate permissions to view the content.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_id",
      "description" => "The id of the audience to return.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key (optional). If provided, results may be scoped to this application.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_account_count",
      "description" => "(boolean) set to true to include the accountCount associated with current audience of the current app",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "return_album_count",
      "description" => "(boolean) set to true to include the albumCount associated with current audience of the current app",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "album_types_for_count",
      "description" => "(String) comma separated list, return an array with each item is the count of each album type. If not provided, \&quot;all_types\&quot; count is returned.",
      "dataType" => "String",
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


MyApp.add_route('GET', '/api/{version}/audience/search', {
  "resourcePath" => "/Audience",
  "summary" => "Search Audiences",
  "nickname" => "get_audience_list",
  "responseClass" => "Array<SearchResponse>",
  "endpoint" => "/api/{version}/audience/search",
  "notes" => "Get the list audiences owned by the account",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "album_ids",
      "description" => "Comma separated list of album IDs to filter results with",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "The keyword used to search",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword_fields",
      "description" => "Comma separated list of fields that the keywords will match against. Possible values include: SEARCH_TAGS, NAME, DESCRIPTION, OWNER_DISPLAY",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'SEARCH_TAGS,NAME,DESCRIPTION'",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "The field to sort by, possible values include: {ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, OWNER_ID, OWNER_DISPLAY, GENDER}",
      "dataType" => "String",
      "allowableValues" => "[ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, SEND_SUGGESTION, OWNER_ID, OWNER_DISPLAY, GENDER]",
      "defaultValue" => "'NAME'",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "The order to return the results. Default is false, which will return the results in ascending order.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "The index into the record set to start with.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "The total number of record to return (there is a hard limit of 100).",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    {
      "name" => "send_suggestion",
      "description" => "Filter results based on whether or not the audience is set to send suggestions",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active_only",
      "description" => "Determines whether to return only active results. Default is false.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "group_by_grouping_id",
      "description" => "Groups results by the audience groupingId (this does not work in conjunction with the following parameters: albumIds, audienceType, appKey, returnGlobal)",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Filter results by application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_global",
      "description" => "If filtering by appKey, determines whether or not audiences that do not have an application set will also be returned as well",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "exact_keyword",
      "description" => "If true, match keyword exactly",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_type",
      "description" => "(Deprecated) Filter results by audience type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_types",
      "description" => "comma separated string with the different audience types you want to filter for",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_account_count",
      "description" => "(boolean) set to true to include the accountCount associated with current audience of the current app",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "return_album_count",
      "description" => "(boolean) set to true to include the albumCount associated with current audience of the current app",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "album_types_for_count",
      "description" => "(String) comma separated list, return an array with each item is the count of each album type. If not provided, \&quot;all_types\&quot; count is returned.",
      "dataType" => "String",
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


MyApp.add_route('GET', '/api/{version}/audience/devices', {
  "resourcePath" => "/Audience",
  "summary" => "Get Devices",
  "nickname" => "get_devices",
  "responseClass" => "Array<AudienceDeviceResponse>",
  "endpoint" => "/api/{version}/audience/devices",
  "notes" => "Gets the list of available devices that can be selected by consumers and retailers.",
  "parameters" => [
    {
      "name" => "include_inactive",
      "description" => "If true return inactive record as well. default is false.",
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


MyApp.add_route('GET', '/api/{version}/audience/experiences', {
  "resourcePath" => "/Audience",
  "summary" => "Get Experiences",
  "nickname" => "get_experiences",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/audience/experiences",
  "notes" => "Gets the list of available experiences that can be selected by consumers and retailers.",
  "parameters" => [
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


MyApp.add_route('GET', '/api/{version}/audience/grouped/get', {
  "resourcePath" => "/Audience",
  "summary" => "Get GroupedAudiences",
  "nickname" => "get_grouped_audiences",
  "responseClass" => "AudienceResponse",
  "endpoint" => "/api/{version}/audience/grouped/get",
  "notes" => "Get a group of audiences. The audience and account must be valid and have the appropriate permissions to view the content.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_grouping_id",
      "description" => "The audience grouping id to return.",
      "dataType" => "String",
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


MyApp.add_route('POST', '/api/{version}/audience/suggestion/list', {
  "resourcePath" => "/Audience",
  "summary" => "List Suggestions by Audience",
  "nickname" => "list_by_account",
  "responseClass" => "OfferListResponse",
  "endpoint" => "/api/{version}/audience/suggestion/list",
  "notes" => "List either Missions or Offers that the user matches the assigned audience.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account to match offers for.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the limit of the index",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "suggestion_type",
      "description" => "the type of suggestion",
      "dataType" => "String",
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


MyApp.add_route('GET', '/api/{version}/audience/suggestion/offersByAudience', {
  "resourcePath" => "/Audience",
  "summary" => "List Offers by Audience",
  "nickname" => "list_by_audience",
  "responseClass" => "OfferListResponse",
  "endpoint" => "/api/{version}/audience/suggestion/offersByAudience",
  "notes" => "Get a list of offer locations based on audience information provided.",
  "parameters" => [
    {
      "name" => "gender",
      "description" => "this is the gender to list offers by",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "age",
      "description" => "this is the age to list offers by",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "this is the category IDs to list offers by",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "this is the latitude to list offers by",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "this is the longitude to list offers by",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "this is the limit of the index",
      "dataType" => "Integer",
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


MyApp.add_route('GET', '/api/{version}/audience/suggestion/latest', {
  "resourcePath" => "/Audience",
  "summary" => "List Sent Suggestions ",
  "nickname" => "list_lastest_by_account",
  "responseClass" => "OfferListResponse",
  "endpoint" => "/api/{version}/audience/suggestion/latest",
  "notes" => "Return list of recent trigger suggestions that have been sent to the user.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account to match offers for.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "timeframe",
      "description" => "The timeframe in seconds of the latest suggestions",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "suggestion_type",
      "description" => "The type of trigger suggestions to return",
      "dataType" => "String",
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


MyApp.add_route('POST', '/api/{version}/audience/suggestion/send', {
  "resourcePath" => "/Audience",
  "summary" => "Send Suggestions",
  "nickname" => "send_by_account",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/audience/suggestion/send",
  "notes" => "Use the accountId to determine the associated BillableEntity. From there get a list of all triggers associated with the BillableEntity.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account to match offers for.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "the latitude",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "the longitude",
      "dataType" => "Float",
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


MyApp.add_route('POST', '/api/{version}/audience/update', {
  "resourcePath" => "/Audience",
  "summary" => "Update Audience",
  "nickname" => "update_audience",
  "responseClass" => "AudienceResponse",
  "endpoint" => "/api/{version}/audience/update",
  "notes" => "Update a user defined audience.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_id",
      "description" => "The id of the audience to update.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the audience",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "The description of the audience",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "search_tags",
      "description" => "The search tags",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "gender",
      "description" => "The gender; possible values are: MALE, FEMALE, ANY",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "age_groups",
      "description" => "The list of age groups, comma separated; possible values are AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS, AGE_ANY (to reset to none)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "The list of category ids, comma separated; possible values are retrieved via /api/{version}/category/search (pass in id values)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "application_ids",
      "description" => "The list of application ids, comma separated; possible values are retrieved via /api/{version}/application/list (pass in id values)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_experience_level",
      "description" => "The experience level of the player; possible values are: ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "devices",
      "description" => "(Deprecated) Use deviceIds. The list of targeted device names, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in name values)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "device_ids",
      "description" => "The list of targeted device ids, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in id values)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "device_versions",
      "description" => "The list of targeted device version ranges that are aligned with the provided devices list, comma separated (examples: 2.3-X, 0-5.1.4, 4.3.1-6.1.4)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "locations",
      "description" => "The list of locations to build the center around; comma separated list of latitude/longitude pairs (example: lat1,long1,lat2,long2)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "radius",
      "description" => "The list of radius of influence for the audience, in miles; comma separated list. Either provide 1 to be applied to all location pairs or a matching list to each lat/long pair.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "if audience is active",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "send_suggestion",
      "description" => "If true, then notify matching users when they are inside the radius",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_time_offset",
      "description" => "Seconds from the start time of an event",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_time_offset",
      "description" => "Seconds from the end time of an event",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "associate_description",
      "description" => "the associate description",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "associate_type",
      "description" => "The type of the object to center the audience geofence",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "associate_id",
      "description" => "The ID of the object to center the audience geofence",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "grouping_id",
      "description" => "Optional grouping id for the audience",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "meta_data",
      "description" => "External custom client defined data",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "visibility",
      "description" => "Visibility of the audience",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_type",
      "description" => "Type of audience",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "use_order",
      "description" => "Use order for cohort",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "cohort_regions_data",
      "description" => "Cohort data for \&quot;cohort\&quot; audience type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Filter results by application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "trilateration_types",
      "description" => "Trilateration types",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "unique_name",
      "description" => "If true, makes sure the audience name is unique",
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

