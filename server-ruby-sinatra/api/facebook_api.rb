require 'json'


MyApp.add_route('GET', '/api/3.18/facebook/getfbtoken', {
  "resourcePath" => "/Facebook",
  "summary" => "Get Facebook Token",
  "nickname" => "get_token",
  "responseClass" => "TokenResponse",
  "endpoint" => "/facebook/getfbtoken",
  "notes" => "Gets a user's Facebook token.",
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
      "name" => "latitude",
      "description" => "used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/facebook/graph', {
  "resourcePath" => "/Facebook",
  "summary" => "Post to Facebook",
  "nickname" => "graph_interface",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/facebook/graph",
  "notes" => "Make Facebook posts on behalf of the user.",
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
      "name" => "event",
      "description" => "the type of Sirqul event {DOWNLOADED_APP, CHALLENGE, LEVEL_COMPLETED, LEVEL_CREATED}",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "permissionable_type",
      "description" => "for posting about information related to an object. Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "permissionable_id",
      "description" => "the object id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_id",
      "description" => "used to include an asset on a Facebook post",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_type",
      "description" => "This parameter is deprecated.",
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
      "name" => "latitude",
      "description" => "used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

