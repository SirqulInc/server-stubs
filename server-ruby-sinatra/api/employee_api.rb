require 'json'


MyApp.add_route('POST', '/api/{version}/employee/assign', {
  "resourcePath" => "/Employee",
  "summary" => "Assign Employee",
  "nickname" => "assign_employee",
  "responseClass" => "EmployeeResponse",
  "endpoint" => "/api/{version}/employee/assign",
  "notes" => "Assign An existing account to be an employee",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "manager_account_id",
      "description" => "The account id of the manager to assign under",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "employee_account_id",
      "description" => "The account id of the user to be assigned as employee",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "role",
      "description" => "The role to assign to the employee (e.g. RETAILER or RETAILER_LIMITED)",
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


MyApp.add_route('POST', '/api/{version}/employee/assignToLocation', {
  "resourcePath" => "/Employee",
  "summary" => "Assign Employee to Location",
  "nickname" => "assign_to_location_employee",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/employee/assignToLocation",
  "notes" => "Assign or unassign the account to a retailer location.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "employee_account_id",
      "description" => "The account id of the user to apply the change to",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_location_id",
      "description" => "The retailer location to apply the change to",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assign",
      "description" => "If true (default) assign to the location, otherwise remove from the retailer",
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


MyApp.add_route('POST', '/api/{version}/employee/create', {
  "resourcePath" => "/Employee",
  "summary" => "Create Employee",
  "nickname" => "create_employee",
  "responseClass" => "EmployeeResponse",
  "endpoint" => "/api/{version}/employee/create",
  "notes" => "Create a new account record with the provided information.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "manager_account_id",
      "description" => "The account id of the manager to assign under",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "username",
      "description" => "The username/email for the new user. This must be unique across the entire the system.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "password",
      "description" => "The password for the new user",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "a name field",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "prefix_name",
      "description" => "The name prefix; Mr, Mrs, etc",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "first_name",
      "description" => "The first name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "middle_name",
      "description" => "The middle name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "last_name",
      "description" => "The last name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "suffix_name",
      "description" => "The name suffix; Jr, Sr, III, etc",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "The title of the user",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "about_us",
      "description" => "Additional about/biography text",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_id",
      "description" => "the asset id to set the user&#39;s profile image",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "gender",
      "description" => "The gender",
      "dataType" => "String",
      "allowableValues" => "[MALE, FEMALE, ANY]",
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
      "description" => "The cellular service provider. This is required for sending SMS. Leave this empty if the provider is not on the list of supported carriers.",
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
      "name" => "role",
      "description" => "The role; RETAILER or RETAILER_LIMITED, defaulted to RETAILER_LIMITED",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_location_ids",
      "description" => "the retailer location IDs the employee is associated with",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "settings_app_key",
      "description" => "Determines whether to return the application settings for the employee for a particular application",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_blob",
      "description" => "external custom client defined data (per Application)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assigned_device_id",
      "description" => "The device id to assign to the user (used for IPS beacon tracking)",
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


MyApp.add_route('POST', '/api/{version}/employee/delete', {
  "resourcePath" => "/Employee",
  "summary" => "Delete Employee",
  "nickname" => "delete_employee",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/employee/delete",
  "notes" => "Set the deleted date field which marks the record as deleted.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "employee_account_id",
      "description" => "the id of the employee to delete",
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


MyApp.add_route('POST', '/api/{version}/employee/get', {
  "resourcePath" => "/Employee",
  "summary" => "Get Employee",
  "nickname" => "get_employee",
  "responseClass" => "EmployeeResponse",
  "endpoint" => "/api/{version}/employee/get",
  "notes" => "Get the account record for the account id provided.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "employee_account_id",
      "description" => "the id of the employee account to get",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "settings_app_key",
      "description" => "Determines whether to return the application settings for the employee for a particular application",
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


MyApp.add_route('POST', '/api/{version}/employee/search', {
  "resourcePath" => "/Employee",
  "summary" => "Search Employees",
  "nickname" => "search_employees",
  "responseClass" => "Array<EmployeeResponse>",
  "endpoint" => "/api/{version}/employee/search",
  "notes" => "Use the accountId to determine the associated BillableEntity. From there get a list of all accounts associated as managers/employees.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "role",
      "description" => "The role to limit the search to: RETAILER or RETAILER_LIMITED. Leave empty to search on both roles.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_id",
      "description" => "Filters employees by retailer",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_location_id",
      "description" => "Filter employees by retailer locations",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "q",
      "description" => "Deprecated parameter",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "an optional keyword to search on; ignored if empty",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "The field to sort by. Possible values include: DISPLAY, CREATED, UPDATED, ACTIVE, DELETED, LAST_LOGGED_IN, CONTACT_EMAIL, RETAILER_LOCATION_NAME, RETAILER_NAME",
      "dataType" => "String",
      "allowableValues" => "[ID, DISPLAY, CREATED, UPDATED, ACTIVE, DELETED, LAST_LOGGED_IN, CONTACT_EMAIL, ACCOUNT_TYPE, RETAILER_LOCATION_NAME, RETAILER_NAME]",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "Determines whether the sorted list is in descending or ascending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "_i",
      "description" => "Deprecated parameter",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "Start the result set at some index",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "_l",
      "description" => "Deprecated parameter",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Limit the result to some number",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    {
      "name" => "active_only",
      "description" => "Filter results to only return active employees",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "managed_only",
      "description" => "Filter results to only employees that you manage",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "settings_app_key",
      "description" => "Determines whether to return the application settings for the employee for a particular application",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "category_ids",
      "description" => "Comma separated list of category ids to filter results",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "query",
      "description" => "Legacy/reporting query parameter used for formatting employee responses",
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


MyApp.add_route('POST', '/api/{version}/employee/unassign', {
  "resourcePath" => "/Employee",
  "summary" => "Unassign Employee",
  "nickname" => "unassign_employee",
  "responseClass" => "EmployeeResponse",
  "endpoint" => "/api/{version}/employee/unassign",
  "notes" => "Unassign An existing account to be an employee",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "employee_account_id",
      "description" => "The account id of the user to be unassigned",
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


MyApp.add_route('POST', '/api/{version}/employee/update', {
  "resourcePath" => "/Employee",
  "summary" => "Update Employee",
  "nickname" => "update_employee",
  "responseClass" => "EmployeeResponse",
  "endpoint" => "/api/{version}/employee/update",
  "notes" => "Update the account record with the provided information.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "employee_account_id",
      "description" => "the id of the employee account",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "manager_account_id",
      "description" => "The account id of the manager to assign under",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "a name field",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "prefix_name",
      "description" => "The name prefix; Mr, Mrs, etc",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "first_name",
      "description" => "The first name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "middle_name",
      "description" => "The middle name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "last_name",
      "description" => "The last name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "suffix_name",
      "description" => "The name suffix; Jr, Sr, III, etc",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "The title of the user",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_id",
      "description" => "the asset id to set the user&#39;s profile image",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "gender",
      "description" => "The gender {MALE, FEMALE, ANY}",
      "dataType" => "String",
      "allowableValues" => "[MALE, FEMALE, ANY]",
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
      "description" => "The cellular service provider. This is required for sending SMS. Leave this empty if the provider is not on the list of supported carriers. Supported Carriers: {ATT, QWEST, T_MOBILE, VERIZON, SPRINT, VIRIGIN_MOBILE, NEXTEL, ALLTEL, METRO_PCS, POWERTEL, BOOST_MOBILE, SUNCOM, TRACFONE, US_CELLULAR}",
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
      "name" => "role",
      "description" => "The role; RETAILER or RETAILER_LIMITED, defaulted to RETAILER_LIMITED",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "Sets whether the employee is active or inactive",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "password",
      "description" => "Sets the password for the employee",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_location_ids",
      "description" => "Sets which retailer locations the employee is assigned to",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "settings_app_key",
      "description" => "Determines whether to return the application settings for the employee for a particular application",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_blob",
      "description" => "external custom client defined data (per Application)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assigned_device_id",
      "description" => "The device id to assign to the user (used for IPS beacon tracking)",
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

