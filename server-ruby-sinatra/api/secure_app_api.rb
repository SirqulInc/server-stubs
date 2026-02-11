require 'json'


MyApp.add_route('POST', '/api/3.18/secure/application/create', {
  "resourcePath" => "/SecureApp",
  "summary" => "Create Secure Application",
  "nickname" => "create_secure_application",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/secure/application/create",
  "notes" => "Create a secure application record.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The unique id of the user making the request",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application to secure",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "key_cert",
      "description" => "",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "trust_store",
      "description" => "",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "username",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "password",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "biometric_type",
      "description" => "The type of biometric, options are: - FINGERPRINT - IRIS - FACIAL",
      "dataType" => "String",
      "allowableValues" => "[FINGERPRINT, IRIS, FACIAL]",
      "defaultValue" => "'FACIAL'",
      "paramType" => "query",
    },
    {
      "name" => "biometric_position",
      "description" => "The position for the biometric file uploaded",
      "dataType" => "String",
      "allowableValues" => "[UNKNOWN, LEFT_INDEX, LEFT_MIDDLE, LEFT_RING, LEFT_LITTLE, LEFT_THUMB, RIGHT_INDEX, RIGHT_MIDDLE, RIGHT_RING, RIGHT_LITTLE, RIGHT_THUMB, LEFT, RIGHT]",
      "defaultValue" => "'UNKNOWN'",
      "paramType" => "query",
    },
    {
      "name" => "biometric_position2",
      "description" => "The position for each the biometric2 file uploaded",
      "dataType" => "String",
      "allowableValues" => "[UNKNOWN, LEFT_INDEX, LEFT_MIDDLE, LEFT_RING, LEFT_LITTLE, LEFT_THUMB, RIGHT_INDEX, RIGHT_MIDDLE, RIGHT_RING, RIGHT_LITTLE, RIGHT_THUMB, LEFT, RIGHT]",
      "defaultValue" => "'UNKNOWN'",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/secure/application/delete', {
  "resourcePath" => "/SecureApp",
  "summary" => "Delete Secure Application",
  "nickname" => "delete_secure_application",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/secure/application/delete",
  "notes" => "Delete a secure application record.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The unique id of the user making the request",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application to secure",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/secure/login', {
  "resourcePath" => "/SecureApp",
  "summary" => "Login Clear",
  "nickname" => "login_secure",
  "responseClass" => "ProfileResponse",
  "endpoint" => "/secure/login",
  "notes" => "Login via Clear.me. Creates a new account if logging in for the first time.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The unique id of the device making the request",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application making the request, defines what type and position is required to make a secure login the request.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "biometric_file",
      "description" => "The data file used to perform authentication",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "biometric_file2",
      "description" => "The data file used to perform authentication",
      "dataType" => "File",
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
      "name" => "return_profile",
      "description" => "Determines whether to return a ProfileResponse on success, or a PaymentTypesResponse",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "response_filters",
      "description" => "If returnProfile is set to true, this determines how much of the profile should be returned, see ProfileFilters",
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/secure/purchase', {
  "resourcePath" => "/SecureApp",
  "summary" => "Purchase Clear",
  "nickname" => "purchase_secure",
  "responseClass" => "ProfileResponse",
  "endpoint" => "/secure/purchase",
  "notes" => "Purchase via Clear.me. Creates a new account if purchasing for the first time.",
  "parameters" => [
    {
      "name" => "body",
      "description" => "The payment request object",
      "dataType" => "PaymentRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/secure/application/reset', {
  "resourcePath" => "/SecureApp",
  "summary" => "Rest Secure Application",
  "nickname" => "reset_secure",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/secure/application/reset",
  "notes" => "Reset a secure application client.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The unique id of the user making the request",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application to secure",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/secure/application/update', {
  "resourcePath" => "/SecureApp",
  "summary" => "Update Secure Application",
  "nickname" => "update_secure_application",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/secure/application/update",
  "notes" => "Update a secure application record.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The unique id of the user making the request",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application to secure",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "key_cert",
      "description" => "",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "trust_store",
      "description" => "",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "username",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "password",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "biometric_type",
      "description" => "The type of biometric, options are: - FINGERPRINT - IRIS - FACIAL",
      "dataType" => "String",
      "allowableValues" => "[FINGERPRINT, IRIS, FACIAL]",
      "paramType" => "query",
    },
    {
      "name" => "biometric_position",
      "description" => "The position for the biometric file uploaded",
      "dataType" => "String",
      "allowableValues" => "[UNKNOWN, LEFT_INDEX, LEFT_MIDDLE, LEFT_RING, LEFT_LITTLE, LEFT_THUMB, RIGHT_INDEX, RIGHT_MIDDLE, RIGHT_RING, RIGHT_LITTLE, RIGHT_THUMB, LEFT, RIGHT]",
      "paramType" => "query",
    },
    {
      "name" => "biometric_position2",
      "description" => "The position for each the biometric2 file uploaded",
      "dataType" => "String",
      "allowableValues" => "[UNKNOWN, LEFT_INDEX, LEFT_MIDDLE, LEFT_RING, LEFT_LITTLE, LEFT_THUMB, RIGHT_INDEX, RIGHT_MIDDLE, RIGHT_RING, RIGHT_LITTLE, RIGHT_THUMB, LEFT, RIGHT]",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

