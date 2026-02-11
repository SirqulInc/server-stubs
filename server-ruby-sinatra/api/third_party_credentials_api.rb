require 'json'


MyApp.add_route('POST', '/api/3.18/thirdparty/credential/create', {
  "resourcePath" => "/ThirdPartyCredentials",
  "summary" => "Create Credential",
  "nickname" => "create_credential",
  "responseClass" => "ProfileResponse",
  "endpoint" => "/thirdparty/credential/create",
  "notes" => "This endpoint creates a third-party login for a Sirqul account. A third party login is a way for external systems (Third Party Networks) to link their own user accounts with a Sirqul account.   The thirdPartyId parameter is used to determine if the user already exists in Sirqul or not. This parameter needs to be unique for each user in the Third Party Network (identified by the networkUID parameter). Note that subsequent calls will update the user's third-party login credentials for the user with the same thirdPartyId and networkUID combination.    The thirdPartyToken parameter acts as a shared secret and used by client applications to log users into Sirqul without providing a Sirqul username and password. ",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the unique id of the account that needs authenticating (optional for PHONE_V2)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "device_id",
      "description" => "the unique id of the device making the request",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "session_id",
      "description" => "the session id for the request",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "third_party_id",
      "description" => "the third party user account id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "third_party_name",
      "description" => "the third party user&#39;s display name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "third_party_token",
      "description" => "the access token to authenticate with (ex: username or fb token or phone number)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "network_uid",
      "description" => "the access provider to authenticate against",
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
      "name" => "email_address",
      "description" => "optional email address associated with the third party account",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "signin_only_mode",
      "description" => "when true will error out if can&#39;t find any accounts matching (signin only)",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "response_filters",
      "description" => "this determines how much of the profile should be returned, see ProfileFilters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "the latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "the longitude of the user",
      "dataType" => "Float",
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
      "name" => "third_party_refresh_token",
      "description" => "optional refresh token for the third party",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_ids_to_add",
      "description" => "audience ids to add to the account",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_ids_to_remove",
      "description" => "audience ids to remove from the account",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/thirdparty/network/create', {
  "resourcePath" => "/ThirdPartyCredentials",
  "summary" => "Create Network",
  "nickname" => "create_network",
  "responseClass" => "ThirdPartyNetworkResponse",
  "endpoint" => "/thirdparty/network/create",
  "notes" => "Creates a custom third party network.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id making the request",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the network",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "The description of the network",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_introspection",
      "description" => "Whether the network uses introspection calls",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "introspection_method",
      "description" => "HTTP method to use for introspection calls (e.g., GET, POST)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "introspection_url",
      "description" => "The HTTP URL of the introspection call",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "introspection_params",
      "description" => "The parameters of the introspection call",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "required_root_field",
      "description" => "Required response params",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_mfa",
      "description" => "Whether this network uses MFA",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "size_mfa",
      "description" => "Size of the MFA token",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "shelf_life_mfa",
      "description" => "Shelf life (seconds) of the MFA token",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "oauth_token_url",
      "description" => "OAuth token endpoint URL",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "oauth_private_key",
      "description" => "OAuth private key file (multipart)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "oauth_public_key",
      "description" => "OAuth public key file (multipart)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "oauth_client_id",
      "description" => "OAuth client id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "oauth_secret_key",
      "description" => "OAuth secret key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "String",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/thirdparty/credential/delete', {
  "resourcePath" => "/ThirdPartyCredentials",
  "summary" => "Delete Credential",
  "nickname" => "delete_credential",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/thirdparty/credential/delete",
  "notes" => "Delete a third party network on a Sirqul account.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "network_uid",
      "description" => "The third party network identifier",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "third_party_id",
      "description" => "The third party user id",
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/thirdparty/network/delete', {
  "resourcePath" => "/ThirdPartyCredentials",
  "summary" => "Delete Network",
  "nickname" => "delete_network",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/thirdparty/network/delete",
  "notes" => "Marks a custom third party network as deleted. Only the network owners and managers have access to this.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "network_uid",
      "description" => "The unique identifier for the third party network defined by Sirqul",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/thirdparty/credential/get', {
  "resourcePath" => "/ThirdPartyCredentials",
  "summary" => "Get Credential",
  "nickname" => "get_credential",
  "responseClass" => "ProfileResponse",
  "endpoint" => "/thirdparty/credential/get",
  "notes" => "Gets the account information given a third party token.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the unique account id of a specific account that will be bound to the third-party credentials",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "device_id",
      "description" => "the unique id of the device making the request",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "session_id",
      "description" => "the session id for the request",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "third_party_credential_id",
      "description" => "the third-party credentials id from the response of the credential/create step",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "third_party_token",
      "description" => "the access token to authenticate with",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "third_party_secret",
      "description" => "the secret code to authenticate with (used for MFA)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "create_new_account",
      "description" => "flag to force creation of a new account when no accountId is passed and user chooses not to use listed accounts",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "network_uid",
      "description" => "the access provider to authenticate against",
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
      "name" => "response_filters",
      "description" => "this determines how much of the profile should be returned, see ProfileFilters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "the latitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "the longitude of the user",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_ids_to_add",
      "description" => "audience ids to add to the account",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_ids_to_remove",
      "description" => "audience ids to remove from the account",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "referral_account_id",
      "description" => "account id of the referrer (inviter-invitee relationship)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/thirdparty/network/get', {
  "resourcePath" => "/ThirdPartyCredentials",
  "summary" => "Get Network",
  "nickname" => "get_network",
  "responseClass" => "ThirdPartyNetworkResponse",
  "endpoint" => "/thirdparty/network/get",
  "notes" => "Get the details of a third party network. Only the network owners and managers have access to this.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id making the request",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "network_uid",
      "description" => "The unique identifier for the third party network defined by Sirqul",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/thirdparty/credential/search', {
  "resourcePath" => "/ThirdPartyCredentials",
  "summary" => "Search Credentials",
  "nickname" => "search_credentials",
  "responseClass" => "Array<ThirdPartyCredentialResponse>",
  "endpoint" => "/thirdparty/credential/search",
  "notes" => "Search on a user's linked third party networks.",
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
      "description" => "The keyword used to search on the third party name and network string",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "network_uid",
      "description" => "The network UID to filter results with",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "The order to return the search results",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "The start of the pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "The limit of the pagination",
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


MyApp.add_route('GET', '/api/3.18/thirdparty/network/search', {
  "resourcePath" => "/ThirdPartyCredentials",
  "summary" => "Search Networks",
  "nickname" => "search_networks",
  "responseClass" => "Array<ThirdPartyNetworkShortResponse>",
  "endpoint" => "/thirdparty/network/search",
  "notes" => "Search on supported third party networks and custom networks from external users.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id making the request",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "The keyword used to search on the network name and description fields",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "The column to sort the search on, possible values include: UPDATED (default), CREATED, NAME",
      "dataType" => "String",
      "allowableValues" => "[ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY, NAME, DESCRIPTION]",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "The order to return the search results",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "The start of the pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "The limit of the pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active_only",
      "description" => "Return only active results",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_billable",
      "description" => "Determines whether to only return applications that the user has access to",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/thirdparty/credential/mfa/send', {
  "resourcePath" => "/ThirdPartyCredentials",
  "summary" => "Send MFA Challenge",
  "nickname" => "send_mfa_challenge",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/thirdparty/credential/mfa/send",
  "notes" => "Sends an MFA challenge (SMS or Email) for networks with MFA enabled.",
  "parameters" => [
    {
      "name" => "third_party_token",
      "description" => "the access token to authenticate with",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "third_party_credential_id",
      "description" => "optional id of the existing third party credential",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "network_uid",
      "description" => "the third party network provider that has MFA enabled",
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
      "name" => "device_id",
      "description" => "the unique id of the device making the request",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/thirdparty/credential/update', {
  "resourcePath" => "/ThirdPartyCredentials",
  "summary" => "Update Credential",
  "nickname" => "update_credential",
  "responseClass" => "ProfileResponse",
  "endpoint" => "/thirdparty/credential/update",
  "notes" => "Updates a third-party login for an account.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the unique id of the device making the request",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "network_uid",
      "description" => "the access provider to authenticate against",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "third_party_id",
      "description" => "the third party user account id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "third_party_name",
      "description" => "the third party user name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "third_party_token",
      "description" => "the access token to authenticate with (ex: username or fb token)",
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
      "name" => "response_filters",
      "description" => "this determines how much of the profile should be returned, see ProfileFilters",
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
      "name" => "third_party_refresh_token",
      "description" => "optional refresh token for the third party",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/thirdparty/network/update', {
  "resourcePath" => "/ThirdPartyCredentials",
  "summary" => "Update Network",
  "nickname" => "update_network",
  "responseClass" => "ThirdPartyNetworkResponse",
  "endpoint" => "/thirdparty/network/update",
  "notes" => "Updates a custom third party network. Only the network owners and managers have access to this.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id making the request",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "network_uid",
      "description" => "The unique identifier for the third party network defined by Sirqul",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the network",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "The description of the network",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_introspection",
      "description" => "Whether the network uses introspection calls",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "introspection_method",
      "description" => "HTTP method to use for introspection calls (e.g., GET, POST)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "introspection_url",
      "description" => "The HTTP URL of the introspection call",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "introspection_params",
      "description" => "The parameters of the introspection call",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "required_root_field",
      "description" => "Required response params",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_mfa",
      "description" => "Whether this network uses MFA",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "size_mfa",
      "description" => "Size of the MFA token",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "shelf_life_mfa",
      "description" => "Shelf life (seconds) of the MFA token",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "oauth_token_url",
      "description" => "OAuth token endpoint URL",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "oauth_private_key",
      "description" => "OAuth private key file (multipart)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "oauth_public_key",
      "description" => "OAuth public key file (multipart)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "oauth_client_id",
      "description" => "OAuth client id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "oauth_secret_key",
      "description" => "OAuth secret key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "String",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

