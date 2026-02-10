require 'json'


MyApp.add_route('POST', '/api/{version}/flag/create', {
  "resourcePath" => "/Flag",
  "summary" => "Create Flag",
  "nickname" => "create_flag",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/flag/create",
  "notes" => "Allows a user to flag an object that the user deems inappropriate or offensive. Flagable objects include accounts, albums, album contests, assets, game levels, and theme descriptors",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The unique device identifier that made the request (either deviceId or accountId must be used)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The unique accountId that made the request (either deviceId or accountId must be used)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "flagable_type",
      "description" => "The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, NOTE, OFFER}",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "flagable_id",
      "description" => "The flagable object id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "flag_description",
      "description" => "An optional description of why is it being flagged",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "The current location of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The current location of the user",
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


MyApp.add_route('POST', '/api/{version}/flag/delete', {
  "resourcePath" => "/Flag",
  "summary" => "Delete Flag",
  "nickname" => "delete_flag",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/flag/delete",
  "notes" => "Deletes a flag.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The unique device identifier that made the request (either deviceId or accountId must be used)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The unique accountId that made the request (either deviceId or accountId must be used)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "item_being_flagged_type",
      "description" => "This parameter is deprecated.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "item_being_flagged_id",
      "description" => "This parameter is deprecated.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "flagable_type",
      "description" => "The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, OFFER, NOTE}",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "flagable_id",
      "description" => "The flagable object id",
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


MyApp.add_route('GET', '/api/{version}/flag/get', {
  "resourcePath" => "/Flag",
  "summary" => "Get Flag",
  "nickname" => "get_flag",
  "responseClass" => "FlagResponse",
  "endpoint" => "/api/{version}/flag/get",
  "notes" => "Gets the details on whether the user has flagged a particular flagable object.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The unique device identifier that made the request (either deviceId or accountId must be used)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The unique accountId that made the request (either deviceId or accountId must be used)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "flagable_type",
      "description" => "The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, NOTE, OFFER}",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "flagable_id",
      "description" => "The flagable object id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "The current location of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "The current location of the user",
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


MyApp.add_route('GET', '/api/{version}/flag/threshold/get', {
  "resourcePath" => "/Flag",
  "summary" => "Get Flag Threshold",
  "nickname" => "get_flag_threshold",
  "responseClass" => "CountResponse",
  "endpoint" => "/api/{version}/flag/threshold/get",
  "notes" => "Get the flag threshold value on an object type for a particular application.",
  "parameters" => [
    {
      "name" => "item_being_flagged_type",
      "description" => "The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, OFFER, NOTE}",
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


MyApp.add_route('POST', '/api/{version}/flag/threshold/update', {
  "resourcePath" => "/Flag",
  "summary" => "Update Flag Threshold",
  "nickname" => "update_flag_threshold",
  "responseClass" => "CountResponse",
  "endpoint" => "/api/{version}/flag/threshold/update",
  "notes" => "Update the flag threshold on an object type for a particular application.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The unique device identifier that made the request (either deviceId or accountId must be used)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The unique accountId that made the request (either deviceId or accountId must be used)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "item_being_flagged_type",
      "description" => "The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, OFFER, NOTE}",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "threshold",
      "description" => "The threshold value",
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

