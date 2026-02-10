require 'json'


MyApp.add_route('POST', '/api/{version}/consumer/theme', {
  "resourcePath" => "/ThemeDescriptor",
  "summary" => "Create/Update Theme",
  "nickname" => "add_or_update_theme_descriptor",
  "responseClass" => "ThemeDescriptorResponse",
  "endpoint" => "/api/{version}/consumer/theme",
  "notes" => "Creates or updates a theme descriptor that can be used to give applications a customized look and feel. The theme can be created by consumers and shared to other users, allowing them to use and/or collaborate on making the theme.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "a unique ID given by the device (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account ID of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_type",
      "description" => "the application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "theme_descriptor_id",
      "description" => "the theme descriptor id used to update an existing theme, leave empty for creating a new theme",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "the title of the theme",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "the description of the theme",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "public_read",
      "description" => "determines whether the theme&#39;s participants have read permissions",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "public_write",
      "description" => "determines whether the theme&#39;s participants have write permissions",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "public_delete",
      "description" => "determines whether the theme&#39;s participants have delete permissions",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "public_add",
      "description" => "",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "visibility",
      "description" => "the determines the theme&#39;s participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)",
      "dataType" => "String",
      "allowableValues" => "[PUBLIC, PRIVATE, FRIENDS]",
      "paramType" => "query",
    },
    {
      "name" => "connection_ids_to_add",
      "description" => "a comma separated list of connection IDs to share to users",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_group_ids_to_add",
      "description" => "a comma separated list of connection group IDs to share to groups",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_friend_group",
      "description" => "flag to determine whether to share to the user&#39;s \&quot;friends\&quot; group",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_version",
      "description" => "the application version the theme was created for",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "color_value_json",
      "description" => "a json array used to replace colors within the application. Example: &#x60;&#x60;&#x60;json [   {     \&quot;name\&quot;: \&quot;sceneAtlas\&quot;,     \&quot;valueString\&quot;: \&quot;100,100,100,255\&quot;   },   {     \&quot;name\&quot;: \&quot;bg\&quot;,     \&quot;valueString\&quot;: \&quot;100,100,100,255\&quot;   } ] &#x60;&#x60;&#x60; ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "string_replacer_json",
      "description" => "a json array used to replace strings within the application. Example: &#x60;&#x60;&#x60;json [   {     \&quot;name\&quot;: \&quot;coins\&quot;,     \&quot;valueString\&quot;: \&quot;Gems\&quot;   },   {     \&quot;name\&quot;: \&quot;lives\&quot;,     \&quot;valueString\&quot;: \&quot;lives\&quot;   } ] &#x60;&#x60;&#x60; ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "custom_json_objects",
      "description" => "a json object used by the scene atlas to position sprites. Example: &#x60;&#x60;&#x60;json {   \&quot;pShootingOffset\&quot;: [     {       \&quot;name\&quot;: \&quot;x\&quot;,       \&quot;valueString\&quot;: \&quot;2.2\&quot;     },     {       \&quot;name\&quot;: \&quot;y\&quot;,       \&quot;valueString\&quot;: \&quot;-0.3\&quot;     }   ],   \&quot;e1ShootingOffset\&quot;: [     {       \&quot;name\&quot;: \&quot;x\&quot;,       \&quot;valueString\&quot;: \&quot;0.25\&quot;     },     {       \&quot;name\&quot;: \&quot;y\&quot;,       \&quot;valueString\&quot;: \&quot;0.5\&quot;     }   ] } &#x60;&#x60;&#x60; ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "icon_image",
      "description" => "a MultipartFile containing the image used as the theme icon",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "scene_atlas_image",
      "description" => "a MultipartFile containing the scene atlas",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "bg_image",
      "description" => "a MultipartFile containing the background image",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "bg_sound",
      "description" => "a MultipartFile containing the background sound file (preferably in MP3 format)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "music_selection",
      "description" => "used to select a default sound file that already exists in the application",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "complete_with_default_values",
      "description" => "determines whether to use default values to complete the theme",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "location_description",
      "description" => "the description of the user&#39;s current location",
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


MyApp.add_route('GET', '/api/{version}/consumer/theme/get', {
  "resourcePath" => "/ThemeDescriptor",
  "summary" => "Get Theme",
  "nickname" => "get_theme_descriptor",
  "responseClass" => "PurchaseItemListResponse",
  "endpoint" => "/api/{version}/consumer/theme/get",
  "notes" => "Gets a theme.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "a unique ID given by the device (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account ID of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_type",
      "description" => "the application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "theme_descriptor_id",
      "description" => "the theme id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "latitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "longitude used to update the user&#39;s current location",
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


MyApp.add_route('GET', '/api/{version}/consumer/theme/search', {
  "resourcePath" => "/ThemeDescriptor",
  "summary" => "Search Themes",
  "nickname" => "get_theme_descriptors",
  "responseClass" => "PurchaseItemListResponse",
  "endpoint" => "/api/{version}/consumer/theme/search",
  "notes" => "Searches for themes.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "a unique id given by the device (deviceId or accountId required)",
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
      "name" => "game_type",
      "description" => "the unique title of an application given from the admin tool",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "contest_type",
      "description" => "contest type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "owner_id",
      "description" => "search on contests that an account has access to",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "q",
      "description" => "This parameter is deprecated.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "a keyword to search on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter",
      "description" => "a comma separated list of Ownership",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "the field to sort by. See ThemeDescriptorApiMap",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "determines whether the sorted list is in descending or ascending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
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
      "description" => "the start parameter for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
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
      "description" => "the limit parameter for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "date_created",
      "description" => "filter on items that have been created before this date",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_version",
      "description" => "application version of the theme to filter by",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "latitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "longitude used to update the user&#39;s current location",
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


MyApp.add_route('POST', '/api/{version}/consumer/theme/remove', {
  "resourcePath" => "/ThemeDescriptor",
  "summary" => "Delete Theme",
  "nickname" => "remove_theme_descriptor",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/consumer/theme/remove",
  "notes" => "Removes a theme.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "a unique id given by the device (deviceId or accountId required)",
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
      "name" => "game_type",
      "description" => "the unique title of an application given from the admin tool",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "theme_descriptor_id",
      "description" => "the theme id to remove",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "latitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "longitude used to update the user&#39;s current location",
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

