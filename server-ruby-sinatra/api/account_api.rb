require 'json'


MyApp.add_route('GET', '/api/{version}/account/search', {
  "resourcePath" => "/Account",
  "summary" => "Search Accounts by Location",
  "nickname" => "account_location_search",
  "responseClass" => "UserLocationSearchResponse",
  "endpoint" => "/api/{version}/account/search",
  "notes" => "Search accounts by their location. This only searches on users that have location data. Use ConnectionApi to perform a regular search on accounts.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The device id (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "q",
      "description" => "Deprecated - legacy query parameter",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "An optional keyword to search on, will be ignore if empty (NOT implemented yet)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "postal_code",
      "description" => "The postal code to search on, either postalCode or the user&#39;s exact location is required",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "The latitude of the user, either postalCode or the user&#39;s exact location is required",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The longitude of the user, either postalCode or the user&#39;s exact location is required",
      "dataType" => "Float",
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
      "name" => "range",
      "description" => "The range to search on",
      "dataType" => "Float",
      "allowableValues" => "",
      "defaultValue" => "10",
      "paramType" => "query",
    },
    {
      "name" => "location_last_updated",
      "description" => "Searches for user&#39;s that has updated their location since this date",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "gender",
      "description" => "The preferred gender",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "min_age",
      "description" => "The preferred min age",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "max_age",
      "description" => "The preferred max age",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "companionship_index",
      "description" => "The preferred companionship index",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "_i",
      "description" => "this is the start index of a query",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "Start of the pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "_l",
      "description" => "this is the limit index of a query",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Limit of the pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "100",
      "paramType" => "query",
    },
    {
      "name" => "search_mode",
      "description" => "Search mode to use for index searches (e.g. CLOUDINDEX, OPENSEARCH)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "Sorting field for results (default: DISTANCE)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "Whether to sort descending (default: false)",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "roles",
      "description" => "Roles to filter on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tags",
      "description" => "Tags to filter on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "experience",
      "description" => "The experience to filter on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "The category ids to filter on (comma separated)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_ids",
      "description" => "The audience ids to filter on (comma separated)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_operator",
      "description" => "Operator used to combine audience filters (default: AND)",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'AND'",
      "paramType" => "query",
    },
    {
      "name" => "update_current_location",
      "description" => "Whether to use the given lat &amp; long to update the user&#39;s current location",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "update_preferred_settings",
      "description" => "Whether to use the given parameters to update the user&#39;s preferred settings",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "show_exact_locations",
      "description" => "Determines whether to always display user exact locations",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "show_connection_to_searcher",
      "description" => "Return connection of the accounts in the result to the passed in account if there exists any",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "flag_count_minimum",
      "description" => "Return any results that have a minimum of the specified flag count (even ones that have met the flag threshold)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "verified_user_only",
      "description" => "Returns only verified users",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "content_admin_only",
      "description" => "Returns only content admin users",
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


MyApp.add_route('POST', '/api/{version}/account/block', {
  "resourcePath" => "/Account",
  "summary" => "Block Account",
  "nickname" => "block_account",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/account/block",
  "notes" => "Moves or removes an account into the user's blocked group.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The device id (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id_being_blocked",
      "description" => "The id of the account to be blocked/unblocked",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "block_flag_value",
      "description" => "Determines whether the account is blocked or unblocked",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "remove_from_groups_if_blocked",
      "description" => "Determines whether the account is removed from all other groups if blocked",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "The current latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The current longitude of the user",
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


MyApp.add_route('POST', '/api/{version}/account/create', {
  "resourcePath" => "/Account",
  "summary" => "Create Account",
  "nickname" => "create_account",
  "responseClass" => "AccountLoginResponse",
  "endpoint" => "/api/{version}/account/create",
  "notes" => "Create a new account by role.",
  "parameters" => [
    {
      "name" => "name",
      "description" => "The full name of the user. If this parameter is NOT empty, the following parameters will be ignored: prefixName, firstName, middleName, lastName, and suffixName",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "prefix_name",
      "description" => "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the prefix of the user&#39;s name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "first_name",
      "description" => "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s first name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "middle_name",
      "description" => "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s middle name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "last_name",
      "description" => "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s last name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "suffix_name",
      "description" => "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the suffix of the user&#39;s name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "This field will be used to set the user&#39;s job title",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "device_id",
      "description" => "The unique id of the device making the request",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "device_id_type",
      "description" => "The type of device id (this is defined by the client), ie. MAC_ADDRESS, APPLE_UDID, etc",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "username",
      "description" => "The access token to authenticate with (ex: username)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "password",
      "description" => "The secret to authenticate with (ex: password)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "email_address",
      "description" => "The user&#39;s contact email address (NOT the username)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_id",
      "description" => "The asset id to set the user&#39;s profile image",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "street_address",
      "description" => "The street address of the user&#39;s contact location",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "zipcode",
      "description" => "The zipcode of the user&#39;s contact location",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "gender",
      "description" => "The gender of the user (AudienceGender)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "birthday",
      "description" => "The birthday date of the user in UTC milliseconds",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "home_phone",
      "description" => "The home phone number",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "cell_phone",
      "description" => "The cellular phone number",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "cell_phone_carrier",
      "description" => "The cellular service provider",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "business_phone",
      "description" => "The business phone number",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "role",
      "description" => "The account role (default: MEMBER)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "platforms",
      "description" => "Comma separated list of development platforms",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tags",
      "description" => "Search tags",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "about_us",
      "description" => "About us information",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_experience",
      "description" => "Game experience of the user",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "A list of category ids that represent interests and associations",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "hometown",
      "description" => "The user&#39;s hometown",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "height",
      "description" => "The user&#39;s height",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "height_index",
      "description" => "The user&#39;s height in a numerical value that can be used for ordering/searching",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ethnicity",
      "description" => "The user&#39;s ethnicity",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "body_type",
      "description" => "The user&#39;s body type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "marital_status",
      "description" => "The user&#39;s marital status",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "children",
      "description" => "The user&#39;s children status",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "religion",
      "description" => "The user&#39;s religion",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "education",
      "description" => "The user&#39;s education",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "education_index",
      "description" => "The user&#39;s education in a numerical value that can be used for ordering/searching",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "smoke",
      "description" => "The user&#39;s smoke status",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "drink",
      "description" => "The user&#39;s drink status",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "companionship",
      "description" => "The user&#39;s companionship status",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "companionship_index",
      "description" => "The user&#39;s companionship index",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_min_age",
      "description" => "The preferred minimum age in the account location search",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_max_age",
      "description" => "The preferred maximum age in the account location search",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_min_height",
      "description" => "The preferred minimum height in the account location search",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_max_height",
      "description" => "The preferred maximum height in the account location search",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_gender",
      "description" => "The preferred gender in the account location search",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_education",
      "description" => "The preferred education in the account location search",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_education_index",
      "description" => "The preferred education in a numerical value that can be used for ordering/searching",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_body_type",
      "description" => "The preferred body type in the account location search",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_ethnicity",
      "description" => "The preferred ethnicity in the account location search",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_location",
      "description" => "The preferred location in the account location search",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_location_range",
      "description" => "The preferred location range in the account location search",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "The current latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The current longitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "accepted_terms",
      "description" => "Accepted Terms",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "invite_token",
      "description" => "The inviteToken that the referrer used for this account to sign up",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "referral_account_id",
      "description" => "The accountId of the referrer (used if there is no inviteToken)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "send_validation",
      "description" => "Whether to send validation email",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_type",
      "description" => "Deprecated: use appKey",
      "dataType" => "String",
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
      "name" => "app_version",
      "description" => "The application version",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "response_type",
      "description" => "Returns an AccountLoginResponse if \&quot;AccountLoginResponse\&quot; is passed in",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_ids_to_add",
      "description" => "Comma separated list of audience ids to assign to the user",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_blob",
      "description" => "Application blob data",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_enable_push",
      "description" => "Enable push for the app",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_enable_sms",
      "description" => "Enable SMS for the app",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_enable_email",
      "description" => "Enable email for the app",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "location_visibility",
      "description" => "Location visibility setting",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "home_latitude",
      "description" => "Home latitude",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "home_longitude",
      "description" => "Home longitude",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_nickname",
      "description" => "The nickname used in the application for this account",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "personal_audience_id",
      "description" => "Personal audience id to associate with this account",
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


MyApp.add_route('POST', '/api/{version}/account/profile/update', {
  "resourcePath" => "/Account",
  "summary" => "Update Account",
  "nickname" => "edit_account",
  "responseClass" => "ProfileInfoResponse",
  "endpoint" => "/api/{version}/account/profile/update",
  "notes" => "Edit the user's profile information",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The device id (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_account_id",
      "description" => "The account id used to edit another person&#39;s account",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "role",
      "description" => "The account role to change to",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_id",
      "description" => "The asset id to set the user&#39;s profile image",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The full name of the user. If this parameter is NOT empty, the  following parameters will be ignored: prefixName, firstName, middleName,  lastName, and suffixName ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "prefix_name",
      "description" => "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the prefix of the user&#39;s name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "first_name",
      "description" => "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s first name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "middle_name",
      "description" => "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s middle name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "last_name",
      "description" => "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s last name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "suffix_name",
      "description" => "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the suffix of the user&#39;s name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "This field will be used to set the user&#39;s job title",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "gender",
      "description" => "The gender of the user AudienceGender",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "age",
      "description" => "This is deperecated, use the birthday parameter",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "birthday",
      "description" => "The birthday date of the user in UTC milliseconds",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "home_phone",
      "description" => "The home phone number",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "cell_phone",
      "description" => "The cellular phone number",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "cell_phone_carrier",
      "description" => "The cellular service provider",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "business_phone",
      "description" => "The business phone number",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "email_address",
      "description" => "The user&#39;s contact email address (NOT the username)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "street_address",
      "description" => "The street address of the user&#39;s contact location",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "street_address2",
      "description" => "Additional address information (such as a suite number, floor number, building name, or PO Box)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "city",
      "description" => "The city of the user&#39;s contact location",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "state",
      "description" => "The state of the user&#39;s contact location",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "zipcode",
      "description" => "The zipcode of the user&#39;s contact location",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "country",
      "description" => "The country of the user&#39;s contact location",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "make_profile_info_public",
      "description" => "Allow anyone to view the user&#39;s personal profile",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "make_game_info_public",
      "description" => "Allow anyone to view the user&#39;s game/app info",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "make_friends_info_public",
      "description" => "Allow anyone to view the user&#39;s friends list",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "hometown",
      "description" => "The user&#39;s hometown",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "height",
      "description" => "The user&#39;s height",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "height_index",
      "description" => "The user&#39;s height in a numerical value that can be used for ordering/searching",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ethnicity",
      "description" => "The user&#39;s ethnicity",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "body_type",
      "description" => "The user&#39;s body type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "marital_status",
      "description" => "The user&#39;s marital status",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "children",
      "description" => "The user&#39;s children status",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "religion",
      "description" => "The user&#39;s religion",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "education",
      "description" => "The user&#39;s education",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "education_index",
      "description" => "The user&#39;s education in a numerical value that can be used for ordering/searching",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "smoke",
      "description" => "The user&#39;s smoke status",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "drink",
      "description" => "The user&#39;s drink status",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "companionship",
      "description" => "The user&#39;s companionship status",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "companionship_index",
      "description" => "The user&#39;s companionship index",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_min_age",
      "description" => "The preferred minimum age in the account location search",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_max_age",
      "description" => "The preferred maximum age in the account location search",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_min_height",
      "description" => "The preferred minimum height in the account location search",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_max_height",
      "description" => "The preferred maximum height in the account location search",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_gender",
      "description" => "The preferred gender in the account location search",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_education",
      "description" => "The preferred education in the account location search",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_education_index",
      "description" => "The preferred education in a numerical value that can be used for ordering/searching",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_body_type",
      "description" => "The preferred body type in the account location search",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_ethnicity",
      "description" => "The preferred ethnicity in the account location search",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_location",
      "description" => "The preferred education in the account location search",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_location_range",
      "description" => "The preferred location range in the account location search",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "platforms",
      "description" => "Platforms",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tags",
      "description" => "Tags",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "about_us",
      "description" => "About Us",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "match_token",
      "description" => "Match Token",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_experience",
      "description" => "Game Experience",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "categories",
      "description" => "Deprecated use categoryIds",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "A list of category ids that represent interests and associations",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "response_filters",
      "description" => "A comma separated list of ProfileFilters for filtering the returned response data",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'PROFILE,PROFILE_CONTACT'",
      "paramType" => "query",
    },
    {
      "name" => "show_as_zipcode",
      "description" => "The user&#39;s preference if they want to be shown by zipcode on a map",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "show_exact_location",
      "description" => "The user&#39;s preference if they want to be shown by their exact location on a map",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "show_others_exact_location",
      "description" => "The user&#39;s preference if they want to see others exact location on a map",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "accepted_terms",
      "description" => "Accepted Terms",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "location_visibility",
      "description" => "Location Visibility",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_blob",
      "description" => "App Blob",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_enable_push",
      "description" => "App Enable Push",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_enable_sms",
      "description" => "App Enable SMS",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_enable_email",
      "description" => "App Enable Email",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_type",
      "description" => "Game Type",
      "dataType" => "String",
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
      "name" => "latitude",
      "description" => "The current latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The current longitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_profile",
      "description" => "Return Profile",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_ids_to_add",
      "description" => "Audience Ids to add",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_ids_to_remove",
      "description" => "Audience Ids to remove",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "referral_account_id",
      "description" => "The account id of the referrer",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_nickname",
      "description" => "App nickname",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "personal_audience_id",
      "description" => "Personal Audience",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "non_guest_username",
      "description" => "The user&#39;s username to update with if they currently have a guest username",
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


MyApp.add_route('POST', '/api/{version}/account/username/update', {
  "resourcePath" => "/Account",
  "summary" => "Update Username and Email",
  "nickname" => "edit_username",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/account/username/update",
  "notes" => "Update account's own username and/or emailAddress",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The device id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "email_address",
      "description" => "the user&#39;s contact email address (NOT the username) which is also used for email validation",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "username",
      "description" => "the user&#39;s username to update with if they currently have a guest username",
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


MyApp.add_route('GET', '/api/{version}/account/profile/get', {
  "resourcePath" => "/Account",
  "summary" => "Get Account",
  "nickname" => "get_account",
  "responseClass" => "ProfileResponse",
  "endpoint" => "/api/{version}/account/profile/get",
  "notes" => "Gets a user's account profile. Application settings and account settings will also be returned for the owner of the account.",
  "parameters" => [
    {
      "name" => "return_nulls",
      "description" => "Return Nulls",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "device_id",
      "description" => "The device id (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_account_email",
      "description" => "Connection Account Email",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_account_id",
      "description" => "The account id used to view another person&#39;s account",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "response_filters",
      "description" => "A comma separated list of ProfileFilters for filtering the returned response data",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'PROFILE'",
      "paramType" => "query",
    },
    {
      "name" => "game_type",
      "description" => "Game Type",
      "dataType" => "String",
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
      "name" => "purchase_type",
      "description" => "Purchase Type",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'SIRQUL'",
      "paramType" => "query",
    },
    {
      "name" => "update_viewed_date",
      "description" => "Determines whether to track if a person has viewed someone&#39;s profile",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "Latitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "Longitude used to update the user&#39;s current location",
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


MyApp.add_route('GET', '/api/{version}/account/profile/assets', {
  "resourcePath" => "/Account",
  "summary" => "Get Profile Assets",
  "nickname" => "get_profile_assets",
  "responseClass" => "AssetListResponse",
  "endpoint" => "/api/{version}/account/profile/assets",
  "notes" => "Get a list of assets a person has ever uploaded. Filters the list based on parameters.",
  "parameters" => [
    {
      "name" => "return_nulls",
      "description" => "Determines whether to return null fields in the response",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "device_id",
      "description" => "The device id (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "owner_id",
      "description" => "The account id of the person the user wants to view",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "media_types",
      "description" => "Comma separated list of MediaType",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mime_types",
      "description" => "Comma separated list of mime types",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "Determines what the returning list will be sorted by (see AssetApiMap)",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'CREATED'",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "Determines whether to return the resulting list in descending or ascending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "Latitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "Longitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "_i",
      "description" => "_i",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "Start of the pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "_l",
      "description" => "_l",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Limit of the pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
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


MyApp.add_route('GET', '/api/{version}/account/referral/list', {
  "resourcePath" => "/Account",
  "summary" => "Search Accounts",
  "nickname" => "get_referral_list",
  "responseClass" => "void",
  "endpoint" => "/api/{version}/account/referral/list",
  "notes" => "Gets a user's account profile and their referral List.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the user (deviceId or accountId required)",
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
      "name" => "retrieve_type",
      "description" => "one of these option - GET_CHILDREN will get all accounts that had signed up using the current account invite link - GET_ANCESTOR will get all accounts that referred the current account and it&#39;s parents, recursively - GET_ALL will get all of the above",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "level_limit",
      "description" => "level limit for children and ancestors of current account, starts from current account",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ancestor_level_limit",
      "description" => "level limit for ancestors, will override levelLimit if this is set",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "children_level_limit",
      "description" => "level limit for children, will override levelLimit if this is set",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ancestor_list_start",
      "description" => "pagination start for children list",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ancestor_list_limit",
      "description" => "pagination limit for children list",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "children_list_start",
      "description" => "pagination start for children list",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "children_list_limit",
      "description" => "pagination limit for children list",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "children_children",
      "description" => "if true, on each item in ancestor and children list, return the childrenTotalNumber and ancestorTotalNumber for that item",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
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


MyApp.add_route('GET', '/api/{version}/account/settings/get', {
  "resourcePath" => "/Account",
  "summary" => "Get Account Settings",
  "nickname" => "get_settings",
  "responseClass" => "UserSettingsResponse",
  "endpoint" => "/api/{version}/account/settings/get",
  "notes" => "Get the account settings for a user",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The device id (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "The current latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The current longitude of the user",
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


MyApp.add_route('POST', '/api/{version}/account/login/delegate', {
  "resourcePath" => "/Account",
  "summary" => "Login as Account",
  "nickname" => "login_delegate",
  "responseClass" => "ProfileResponse",
  "endpoint" => "/api/{version}/account/login/delegate",
  "notes" => "A login service that supports logging in as someone else (accounts that the user manages). Intended for internal use for now.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "access_token",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "access_token_secret",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "delegated_account_id",
      "description" => "",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "delegated_username",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "network_uid",
      "description" => "The access provider to authenticate against (default: USERNAME). Supported values: FACEBOOK, TWITTER, USERNAME, PHONE",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'USERNAME'",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "age_restriction",
      "description" => "Checks user&#39;s birthday to see if they meet an age requirement. If the user is under age, an error message is returned.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "response_filters",
      "description" => "This determines how much of the profile should be returned, see ProfileFilters",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'PROFILE'",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "",
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


MyApp.add_route('POST', '/api/{version}/account/login', {
  "resourcePath" => "/Account",
  "summary" => "Login Account",
  "nickname" => "login_general",
  "responseClass" => "ProfileResponse",
  "endpoint" => "/api/{version}/account/login",
  "notes" => "General login service that supports various authentication methods. Currently supports Facebook, Twitter, Sirqul Username, and Sirqul Phone by default. Can also support custom networks created using the {@link ThirdPartyApi}",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The unique id of the device making the request",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "device_id_type",
      "description" => "The type of device id (this is defined by the client), ie. MAC_ADDRESS, APPLE_UDID, etc",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "access_token",
      "description" => "The access token to authenticate with (ex: username or fb token)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "access_token_secret",
      "description" => "The secret to authenticate with (ex: password)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "network_uid",
      "description" => "The access provider to authenticate against. This can be custom  networks created using the ThirdPartyApi as well. Supported values by default  include: FACEBOOK, TWITTER, USERNAME, PHONE ",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'USERNAME'",
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
      "name" => "age_restriction",
      "description" => "Checks user&#39;s birthday to see if they meet an age requirement. If the user is under age, an error message is returned.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "response_filters",
      "description" => "This determines how much of the profile should be returned, see ProfileFilters",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'PROFILE'",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "Used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "Used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "email_match",
      "description" => "Option to check for email if username doesn&#39;t match, also support multiple accounts",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "chosen_account_id",
      "description" => "Chosen account Id sent from the app - pass in the 2nd request to choose an account from multiple accounts matching the email - use one of the account id from the previous request",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "third_party_credential_id",
      "description" => "Third-party credential Id, pass in the 2nd request to choose an account from multiple accounts matching the email - use the id from the previous call ThirdPartyCredential object",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
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


MyApp.add_route('POST', '/api/{version}/account/get', {
  "resourcePath" => "/Account",
  "summary" => "Login Account (Username)",
  "nickname" => "login_username",
  "responseClass" => "ProfileResponse",
  "endpoint" => "/api/{version}/account/get",
  "notes" => "Login to system with an account",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the device id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "username",
      "description" => "the user&#39;s email address they used to sign-up",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "password",
      "description" => "the password",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "the current latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "the current longitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app",
      "description" => "the app",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_type",
      "description" => "This parameter is deprecated. This is deprecated, use appKey.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "the application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_profile",
      "description" => "the profile to return",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "response_filters",
      "description" => "a comma separated list of ProfileFilters for filtering the returned response data",
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


MyApp.add_route('POST', '/api/{version}/account/logout', {
  "resourcePath" => "/Account",
  "summary" => "Logout Account",
  "nickname" => "logout",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/account/logout",
  "notes" => "Cleans up the users data for logging out.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The device id (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "device_id_type",
      "description" => "Device Id Type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "The current latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The current longitude of the user",
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


MyApp.add_route('POST', '/api/{version}/account/merge', {
  "resourcePath" => "/Account",
  "summary" => "Merge Account",
  "nickname" => "merge_account",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/account/merge",
  "notes" => "Merges the analytics, achievements, leaderboards of two accounts.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The device id (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "merge_account_id",
      "description" => "The id of the account to being merged",
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


MyApp.add_route('POST', '/api/{version}/account/passwordchange', {
  "resourcePath" => "/Account",
  "summary" => "Update Password",
  "nickname" => "password_change",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/account/passwordchange",
  "notes" => "Update the account password.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "old_password",
      "description" => "The current password, used to validate access",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "new_password",
      "description" => "The new password to set, cannot be empty",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "confirm_password",
      "description" => "The new password to confirm, must match newPassword",
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


MyApp.add_route('POST', '/api/{version}/account/passwordreset', {
  "resourcePath" => "/Account",
  "summary" => "Reset Password",
  "nickname" => "password_reset",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/account/passwordreset",
  "notes" => "Reset the account password. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token.",
  "parameters" => [
    {
      "name" => "token",
      "description" => "The token associated with the account to update, good for 24 hours",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "password",
      "description" => "The new password to set, cannot be empty",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "confirm",
      "description" => "The new password to confirm, must match newPassword",
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


MyApp.add_route('POST', '/api/{version}/account/requestpasswordreset', {
  "resourcePath" => "/Account",
  "summary" => "Request Password Reset",
  "nickname" => "request_password_reset",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/account/requestpasswordreset",
  "notes" => "Request that an account password be reset. The account is looked up by email address and then a link is sent via email to that account with a reset token. The token is valid for 24 hours.",
  "parameters" => [
    {
      "name" => "email",
      "description" => "The email/username of the account",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "from",
      "description" => "this is the sender email",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'Sirqul'",
      "paramType" => "query",
    },
    {
      "name" => "domain",
      "description" => "this is the domain (like dev.sirqul.com) used to generate the password reset link",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sub_url",
      "description" => "this is the the subUrl (like resetpassword) used to generate a password reset link",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "referer",
      "description" => "this is used to generate a password reset link",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'http://dev.sirqul.com/resetpassword'",
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


MyApp.add_route('POST', '/api/{version}/account/requestValidateAccount', {
  "resourcePath" => "/Account",
  "summary" => "Send Validation Request",
  "nickname" => "request_validate_account",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/account/requestValidateAccount",
  "notes" => "Send an email to validate a user's account.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the user",
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


MyApp.add_route('GET', '/api/{version}/account/profile/search', {
  "resourcePath" => "/Account",
  "summary" => "Search Accounts",
  "nickname" => "search_accounts",
  "responseClass" => "Array<ProfileResponse>",
  "endpoint" => "/api/{version}/account/profile/search",
  "notes" => "Search for account profiles.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The id of the account requesting",
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
      "name" => "keyword",
      "description" => "The keyword for for querying the account",
      "dataType" => "String",
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
      "name" => "radius",
      "description" => "the radius",
      "dataType" => "Float",
      "allowableValues" => "",
      "defaultValue" => "5",
      "paramType" => "query",
    },
    {
      "name" => "gender",
      "description" => "the user&#39;s gender",
      "dataType" => "String",
      "allowableValues" => "[MALE, FEMALE, ANY]",
      "paramType" => "query",
    },
    {
      "name" => "game_experience",
      "description" => "the user&#39;s Game Experience",
      "dataType" => "String",
      "allowableValues" => "[ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT]",
      "paramType" => "query",
    },
    {
      "name" => "age",
      "description" => "the user&#39;s age",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "the user&#39;s Category Ids",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_nulls",
      "description" => "Return Nulls",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "response_filters",
      "description" => "A comma separated list of ProfileFilters for filtering the returned response data",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'PROFILE'",
      "paramType" => "query",
    },
    {
      "name" => "purchase_type",
      "description" => "A comma separated list of PurchaseType",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'SIRQUL'",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "The field to sort by",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'id'",
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
      "description" => "The total number of record to return.",
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


MyApp.add_route('POST', '/api/{version}/account/login/validate', {
  "resourcePath" => "/Account",
  "summary" => "Login Account (Encrypted Username)",
  "nickname" => "secure_login",
  "responseClass" => "ProfileResponse",
  "endpoint" => "/api/{version}/account/login/validate",
  "notes" => "ogin with encrypted user-name and password.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The device id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "username",
      "description" => "The user&#39;s encrypted email address they used to sign-up",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "password",
      "description" => "The encrypted password",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_type",
      "description" => "The application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "charset_name",
      "description" => "Charset Name",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'UTF-8'",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "The current latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The current longitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_profile",
      "description" => "Return Profile",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "response_filters",
      "description" => "A comma separated list of ProfileFilters for filtering the returned response data",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'PROFILE'",
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


MyApp.add_route('POST', '/api/{version}/account/create/validate', {
  "resourcePath" => "/Account",
  "summary" => "Create Account (Encrypted Username)",
  "nickname" => "secure_signup",
  "responseClass" => "ProfileInfoResponse",
  "endpoint" => "/api/{version}/account/create/validate",
  "notes" => "Create a new account by role (with encrypted user-name and password)",
  "parameters" => [
    {
      "name" => "name",
      "description" => "The full name of the user. If this parameter is not empty, the  following parameters will be ignored: prefixName, firstName, middleName,  lastName, and suffixName ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "invite_token",
      "description" => "the inviteToken that the referrer use for this account to sign up",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "prefix_name",
      "description" => "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the prefix of the user&#39;s name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "first_name",
      "description" => "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s first name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "middle_name",
      "description" => "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s middle name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "last_name",
      "description" => "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s last name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "suffix_name",
      "description" => "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the suffix of the user&#39;s name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "Title",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "device_id",
      "description" => "The device id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "device_id_type",
      "description" => "Device Id Type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "username",
      "description" => "The encrypted email of the user, this is what will be used when they login",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "password",
      "description" => "The encrypted password of the user",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "email_address",
      "description" => "The user&#39;s contact email address (NOT the username) which is also used for email validation",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_id",
      "description" => "The asset id to set the user&#39;s profile image",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "address",
      "description" => "the user&#39;s address",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "zipcode",
      "description" => "The street zipcode of the user&#39;s contact location",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "gender",
      "description" => "The gender of the user AudienceGender",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "birthday",
      "description" => "The birthday date of the user in milliseconds",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "home_phone",
      "description" => "the user&#39;s home phone number",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "cell_phone",
      "description" => "the user&#39;s cell phone number",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "cell_phone_carrier",
      "description" => "the user&#39;s Cell Phone Carrier",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "business_phone",
      "description" => "the user&#39;s Business Phone Number",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "role",
      "description" => "The type of account being created {RETAILER, MEMBER, DEVELOPER, GUEST",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'MEMBER'",
      "paramType" => "query",
    },
    {
      "name" => "platforms",
      "description" => "Comma separated list of development platforms: MAC, WINDOWS, IOS, ANDROID, WINDOWSPHONE, KINDLE, UNITY3D, COCOS2D, HTML5, FACEBOOK",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tags",
      "description" => "Search tags",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "about_us",
      "description" => "About Us information",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_experience",
      "description" => "Game experience level of the user {ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "A list of category ids that represent interests and associations",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "hometown",
      "description" => "The user&#39;s hometown",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "height",
      "description" => "The user&#39;s height",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "height_index",
      "description" => "The user&#39;s height in a numerical value that can be used for ordering/searching",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ethnicity",
      "description" => "The user&#39;s ethnicity",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "body_type",
      "description" => "The user&#39;s body type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "marital_status",
      "description" => "The user&#39;s maritial status",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "children",
      "description" => "The user&#39;s children status",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "religion",
      "description" => "The user&#39;s religion",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "education",
      "description" => "The user&#39;s education",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "education_index",
      "description" => "The user&#39;s education in a numerical value that can be used for ordering/searching",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "smoke",
      "description" => "The user&#39;s smoke status",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "drink",
      "description" => "The user&#39;s drink status",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "companionship",
      "description" => "The user&#39;s companionship status",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "companionship_index",
      "description" => "The user&#39;s companionship index",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_min_age",
      "description" => "The preferred minimum age in the account location search",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_max_age",
      "description" => "The preferred maximum age in the account location search",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_min_height",
      "description" => "The preferred minimum height in the account location search",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_max_height",
      "description" => "The preferred maximum height in the account location search",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_gender",
      "description" => "The preferred gender in the account location search",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_education",
      "description" => "The preferred education in the account location search",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_education_index",
      "description" => "The preferred education in a numerical value that can be used for ordering/searching",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_body_type",
      "description" => "The preferred body type in the account location search",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_ethnicity",
      "description" => "The preferred ethnicity in the account location search",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_location",
      "description" => "The preferred education in the account location search",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preferred_location_range",
      "description" => "The preferred location range in the account location search",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "The current latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The current longitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "accepted_terms",
      "description" => "Accepted Terms",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "charset_name",
      "description" => "Charset Name",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'UTF-8'",
      "paramType" => "query",
    },
    {
      "name" => "game_type",
      "description" => "Game Type",
      "dataType" => "String",
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
      "name" => "app_version",
      "description" => "App Version",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "response_type",
      "description" => "Response Type",
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


MyApp.add_route('POST', '/api/{version}/consumer/profile/matchToken', {
  "resourcePath" => "/Account",
  "summary" => "Save Match Token",
  "nickname" => "set_match_token",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/consumer/profile/matchToken",
  "notes" => "Save user's match token to be used for profile match making",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The device id (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "match_token",
      "description" => "A string of numbers",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_type",
      "description" => "Game Type (deprecated)",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'BOOPY'",
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
      "name" => "latitude",
      "description" => "The current latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The current longitude of the user",
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


MyApp.add_route('POST', '/api/{version}/account/active/update', {
  "resourcePath" => "/Account",
  "summary" => "Update Account Active Status",
  "nickname" => "update_actve_status",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/account/active/update",
  "notes" => "Activate or deactivate an account (requires appropriate permissions).",
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
      "name" => "connection_account_id",
      "description" => "The account id of the user you want to modify (if this is not set, then the accountId parameter will be used instead)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "the application key that the user belongs to",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "true will activate the user and false will deactivate",
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


MyApp.add_route('POST', '/api/{version}/account/location/update', {
  "resourcePath" => "/Account",
  "summary" => "Update Location",
  "nickname" => "update_location",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/account/location/update",
  "notes" => "Update the account location",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The device id (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "The current latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The current longitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "client_time",
      "description" => "The time of the update",
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


MyApp.add_route('POST', '/api/{version}/account/settings/update', {
  "resourcePath" => "/Account",
  "summary" => "Update Account Settings",
  "nickname" => "update_settings",
  "responseClass" => "UserSettingsResponse",
  "endpoint" => "/api/{version}/account/settings/update",
  "notes" => "Update the account settings for a user",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The device id (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "blocked_notifications",
      "description" => "The notifications to be blocked",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "suggestion_method",
      "description" => "How suggestions are to be sent (APNS, MOBILE_NOTIFICATION, SMS)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "suggestion_count",
      "description" => "How many suggestions to receive per time frame",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "suggestion_time_frame",
      "description" => "The time frame in seconds, 3600 would be a 1 hour time frame",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "show_others_exact_location",
      "description" => "Show Others Exact Location",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "show_as_zipcode",
      "description" => "Show As Zipcode",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "show_exact_location",
      "description" => "Show Exact Location",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "favorite_visibility",
      "description" => "Show favorites",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "The current latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The current longitude of the user",
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


MyApp.add_route('POST', '/api/{version}/account/validateAccountSignup', {
  "resourcePath" => "/Account",
  "summary" => "Save Validation Status",
  "nickname" => "validate_account_signup",
  "responseClass" => "AccountLoginResponse",
  "endpoint" => "/api/{version}/account/validateAccountSignup",
  "notes" => "Validate the account's email address. The token must be valid and not expired. Use the RequestValidateAccount end point to request a new token.",
  "parameters" => [
    {
      "name" => "token",
      "description" => "The token associated with the account to update, good for 24 hours",
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


MyApp.add_route('POST', '/api/{version}/account/validatepasswordreset', {
  "resourcePath" => "/Account",
  "summary" => "Validate Password Reset Token",
  "nickname" => "validate_password_reset",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/account/validatepasswordreset",
  "notes" => "Validate the password reset token. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token. The user receives and email with the reset page, therefore it should be validated before bwing used to reset the password.",
  "parameters" => [
    {
      "name" => "token",
      "description" => "The token associated with the account to update, good for 24 hours",
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

