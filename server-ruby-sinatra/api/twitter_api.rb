require 'json'


MyApp.add_route('POST', '/api/3.18/twitter/authorize', {
  "resourcePath" => "/Twitter",
  "summary" => "Authorize Twitter",
  "nickname" => "authorize_twitter",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/twitter/authorize",
  "notes" => "Makes an authorization call to twitter for a user to login and allow any app permissions.",
  "parameters" => [
    {
      "name" => "app_key",
      "description" => "the application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/twitter/login', {
  "resourcePath" => "/Twitter",
  "summary" => "Login Twitter",
  "nickname" => "login_twitter",
  "responseClass" => "ProfileResponse",
  "endpoint" => "/twitter/login",
  "notes" => "Returns the user profile information given an access token and the secret access token. This call verifies the tokens with twitter and creates a Sirqul account for the user if its their first time logging in.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The device id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "access_token",
      "description" => "The access token",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "access_token_secret",
      "description" => "The secret access token",
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
      "name" => "response_filters",
      "description" => "a comma separated list of ProfileFilters for filtering the returned response data",
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

