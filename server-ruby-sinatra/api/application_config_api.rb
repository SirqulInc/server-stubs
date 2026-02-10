require 'json'


MyApp.add_route('POST', '/api/{version}/appconfig/create', {
  "resourcePath" => "/ApplicationConfig",
  "summary" => "Create AppConfig",
  "nickname" => "create_application_config",
  "responseClass" => "ApplicationConfigResponse",
  "endpoint" => "/api/{version}/appconfig/create",
  "notes" => "Creates a new application configuration. If the configVersion provided already exists for the given app, an invalid response is returned and the application configuration won't be created.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account ID of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key that the newly created applicationConfig will be associated to",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "config_version",
      "description" => "The application configuration, has to be unique within the application",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_id",
      "description" => "The json assetId that stores the configuration detail.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_id",
      "description" => "The retailer id for retailer specific configurations",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_location_id",
      "description" => "The retailer location id for retailer location specific configurations",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "udid",
      "description" => "The device udid for device specific configurations",
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


MyApp.add_route('POST', '/api/{version}/appconfig/delete', {
  "resourcePath" => "/ApplicationConfig",
  "summary" => "Delete AppConfig",
  "nickname" => "delete_application_config",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/appconfig/delete",
  "notes" => "Mark the application configuration for deletion.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account ID of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "config_id",
      "description" => "The config ID of the application configuration to delete",
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


MyApp.add_route('GET', '/api/{version}/appconfig/get', {
  "resourcePath" => "/ApplicationConfig",
  "summary" => "Get AppConfig",
  "nickname" => "get_application_config",
  "responseClass" => "ApplicationConfigResponse",
  "endpoint" => "/api/{version}/appconfig/get",
  "notes" => "Gets the appConfig data by the given configId. If appConfig cannot be found, it returns an invalid response.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account ID of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "config_id",
      "description" => "The config ID of the application configuration",
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


MyApp.add_route('GET', '/api/{version}/appconfig/getbyversion', {
  "resourcePath" => "/ApplicationConfig",
  "summary" => "Get AppConfig by Version",
  "nickname" => "get_application_config_by_config_version",
  "responseClass" => "ApplicationConfigResponse",
  "endpoint" => "/api/{version}/appconfig/getbyversion",
  "notes" => "Gets the appConfig data by the given appKey and app configVersion number.If the appKey is is invalid or appConfig is not found, it returns an invalid response. ",
  "parameters" => [
    {
      "name" => "app_key",
      "description" => "The application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "config_version",
      "description" => "The version of the application configuration",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_id",
      "description" => "Only returns the config that matches the given retailer",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_location_id",
      "description" => "Only returns the config that matches the given retailer location",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "udid",
      "description" => "Only returns only returns the config that matches the given device udid",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "allow_older_versions",
      "description" => "Determines whether to return older config versions if the exact version is not found. If this happens, will try to return the latest version.",
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


MyApp.add_route('GET', '/api/{version}/appconfig/search', {
  "resourcePath" => "/ApplicationConfig",
  "summary" => "Search AppConfigs",
  "nickname" => "search_application_config",
  "responseClass" => "Array<ApplicationConfigResponse>",
  "endpoint" => "/api/{version}/appconfig/search",
  "notes" => "Gets all versions of application configurations in a particular app by the given appKey.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account ID of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key to filter results by application Leaving this empty will return all application configurations for all applications (executive user only)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_id",
      "description" => "Only returns the configs that matches the given retailer",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_location_id",
      "description" => "Only returns the configs that matches the given retailer location",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "udid",
      "description" => "Only returns only returns the configs that matches the given device udid",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "config_version",
      "description" => "Config Version",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "Orders the results by: CREATED, UPDATED, ACTIVE, APPLICATION_ID,  APPLICATION_KEY, APPLICATION_NAME, RETAILER_NAME, RETAILER_ID, RETAILER_LOCATION_NAME,  RETAILER_LOCATION_ID, OFFER_TITLE, OFFER_ID, OFFER_LOCATION_ID, CONFIG_VERSION_MINOR,  CONFIG_VERSION_MAJOR, CONFIG_VERSION_INDEX ",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'CONFIG_VERSION_INDEX'",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "Determines whether the results are in descending or ascending order",
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
      "description" => "The limit for pagination (There is a hard limit of 100)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
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


MyApp.add_route('POST', '/api/{version}/appconfig/update', {
  "resourcePath" => "/ApplicationConfig",
  "summary" => "Update AppConfig",
  "nickname" => "update_application_config",
  "responseClass" => "ApplicationConfigResponse",
  "endpoint" => "/api/{version}/appconfig/update",
  "notes" => "pdates an existing application configuration. If the configVersion provided already exists for the given app the application configuration won't be updated.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account ID of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "config_id",
      "description" => "The config ID of the application configuration to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key that the updated applicationConfig will be associated to",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "config_version",
      "description" => "The application configuration, has to be unique within the application",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_id",
      "description" => "The json assetId that stores the configuration detail.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_id",
      "description" => "The retailer id for retailer specific configurations",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_location_id",
      "description" => "The retailer location id for retailer location specific configurations",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "udid",
      "description" => "The device udid for device specific configurations",
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

