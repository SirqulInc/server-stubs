require 'json'


MyApp.add_route('GET', '/api/{version}/assignment/assignee/search', {
  "resourcePath" => "/Assignment",
  "summary" => "Search Assignment Assignees",
  "nickname" => "assigment_assignee_account_search",
  "responseClass" => "Array<AccountMiniResponse>",
  "endpoint" => "/api/{version}/assignment/assignee/search",
  "notes" => "Search for avaiable users for creating or updating assignment.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id sending the request",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "The keyword to filter the returned results",
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


MyApp.add_route('POST', '/api/{version}/assignment/create', {
  "resourcePath" => "/Assignment",
  "summary" => "Create Assignment",
  "nickname" => "assignment_create",
  "responseClass" => "AssignmentResponse",
  "endpoint" => "/api/{version}/assignment/create",
  "notes" => "Create an assignment.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the user account id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "the name for the assignment",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "the desciprtion for the assignment",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assignee_account_id",
      "description" => "the account id to assign to",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_location_id",
      "description" => "the retailer location id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tags",
      "description" => "the tags",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "determines whether the assignment is active or inactive",
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


MyApp.add_route('POST', '/api/{version}/assignment/delete', {
  "resourcePath" => "/Assignment",
  "summary" => "Delete Assignment",
  "nickname" => "assignment_delete",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/assignment/delete",
  "notes" => "Delete an assignment.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the user account id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assignment_id",
      "description" => "the assignment id",
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


MyApp.add_route('GET', '/api/{version}/assignment/get', {
  "resourcePath" => "/Assignment",
  "summary" => "Get Assignment",
  "nickname" => "assignment_get",
  "responseClass" => "AssignmentResponse",
  "endpoint" => "/api/{version}/assignment/get",
  "notes" => "Get the details of an assignment.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the user account id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assignment_id",
      "description" => "the assignment id",
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


MyApp.add_route('GET', '/api/{version}/assignment/search', {
  "resourcePath" => "/Assignment",
  "summary" => "Search Assignments",
  "nickname" => "assignment_search",
  "responseClass" => "Array<AssignmentResponse>",
  "endpoint" => "/api/{version}/assignment/search",
  "notes" => "Search for assignments by the given parameters.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the account sending the request",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "creator_account_id",
      "description" => "the creator of the assignment",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assignee_account_ids",
      "description" => "filter results by assignee accounts. If not provided, all assignments that are assigned to accounts that are managed by the requested account will be returned.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_location_ids",
      "description" => "filter results by retailer locations",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "current_status_type",
      "description" => "filter results by assignment status",
      "dataType" => "String",
      "allowableValues" => "[NEW, IN_PROGRESS, SUBSCRIBED, ARCHIVED]",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "filter results by keyword search that matches the assignee, creator, or retailer location name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "sort by table field",
      "dataType" => "String",
      "allowableValues" => "[ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ASSIGNEE_ID, CREATOR_ID, LOCATION_ID, LOCATION_NAME, CURRENT_STATUS, CURRENT_STATUS_TYPE, STATUSES]",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "return results in descending order or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active_only",
      "description" => "return active results only or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "The record to begin the return set on",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "The number of records to return",
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


MyApp.add_route('POST', '/api/{version}/assignment/status/create', {
  "resourcePath" => "/Assignment",
  "summary" => "Create Assignment Status",
  "nickname" => "assignment_status_create",
  "responseClass" => "AssignmentStatusResponse",
  "endpoint" => "/api/{version}/assignment/status/create",
  "notes" => "Create an assignment status.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the user account id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assignment_id",
      "description" => "the assignment id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "scheduled_notification_id",
      "description" => "the scheduled notification id for reminders",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "to_do",
      "description" => "the type of to do. Possible values include: SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT",
      "dataType" => "String",
      "allowableValues" => "[SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT]",
      "paramType" => "query",
    },
    {
      "name" => "connection",
      "description" => "the connection type. Possible values include: INITIAL, FOLLOW_UP, DECLINED",
      "dataType" => "String",
      "allowableValues" => "[INITIAL, FOLLOW_UP, DECLINED]",
      "paramType" => "query",
    },
    {
      "name" => "method",
      "description" => "the communication method type. Possible values include: PHONE, SITE_VISIT, EMAIL",
      "dataType" => "String",
      "allowableValues" => "[PHONE, SITE_VISIT, EMAIL]",
      "paramType" => "query",
    },
    {
      "name" => "status",
      "description" => "the status type. Possible values include: ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED",
      "dataType" => "String",
      "allowableValues" => "[ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED]",
      "paramType" => "query",
    },
    {
      "name" => "closure",
      "description" => "the closure type. Possible values include: PHONE, SITE_VISIT, PHONE_SITE, WEB",
      "dataType" => "String",
      "allowableValues" => "[PHONE, SITE_VISIT, PHONE_SITE, WEB]",
      "paramType" => "query",
    },
    {
      "name" => "message",
      "description" => "the message from the assignee",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "follow_up",
      "description" => "the date to follow up by",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "determines whether the assignment status is active or inactive",
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


MyApp.add_route('POST', '/api/{version}/assignment/status/delete', {
  "resourcePath" => "/Assignment",
  "summary" => "Deletes Assignment Status",
  "nickname" => "assignment_status_delete",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/assignment/status/delete",
  "notes" => "Deletes an assignment status.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the user account id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assignment_status_id",
      "description" => "the assignment status id",
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


MyApp.add_route('GET', '/api/{version}/assignment/status/get', {
  "resourcePath" => "/Assignment",
  "summary" => "Get Assignment Status",
  "nickname" => "assignment_status_get",
  "responseClass" => "AssignmentStatusResponse",
  "endpoint" => "/api/{version}/assignment/status/get",
  "notes" => "Get an assignment status.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the user account id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assignment_status_id",
      "description" => "the assignment status id",
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


MyApp.add_route('GET', '/api/{version}/assignment/status/search', {
  "resourcePath" => "/Assignment",
  "summary" => "Search Assignment Statuses",
  "nickname" => "assignment_status_search",
  "responseClass" => "Array<AssignmentStatusResponse>",
  "endpoint" => "/api/{version}/assignment/status/search",
  "notes" => "Search on assignment statuses.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the user account id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assignment_id",
      "description" => "the assignment id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "creator_account_id",
      "description" => "filter results by the account who created the status",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assignee_account_id",
      "description" => "filter results by the assignee account",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_location_id",
      "description" => "filter results by by retailer location",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "status_type",
      "description" => "filter results by the status type",
      "dataType" => "String",
      "allowableValues" => "[ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED]",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "filter results by keyword search",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "the field to sort by. Possible values include: ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, CURRENT_STATUS, TODO, CONNECTION, METHOD, STATUS, CLOSURE, MESSAGE, FOLLOW_UP",
      "dataType" => "String",
      "allowableValues" => "[ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ASSIGNEE_ID, CREATOR_ID, LOCATION_ID, LOCATION_NAME, CURRENT_STATUS, CURRENT_STATUS_TYPE, TODO, CONNECTION, METHOD, STATUS, CLOSURE, MESSAGE, FOLLOW_UP]",
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
      "name" => "active_only",
      "description" => "determines whether to only return active results",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "the start index for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the limit for pagination",
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


MyApp.add_route('POST', '/api/{version}/assignment/status/update', {
  "resourcePath" => "/Assignment",
  "summary" => "Update Assignment Status",
  "nickname" => "assignment_status_update",
  "responseClass" => "AssignmentStatusResponse",
  "endpoint" => "/api/{version}/assignment/status/update",
  "notes" => "Updates an assignment status.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the user account id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assignment_status_id",
      "description" => "the assignment status id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "scheduled_notification_id",
      "description" => "the scheduled notification id for reminders",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "to_do",
      "description" => "the type of to do. Possible values include: SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT",
      "dataType" => "String",
      "allowableValues" => "[SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT]",
      "paramType" => "query",
    },
    {
      "name" => "connection",
      "description" => "the connection type. Possible values include: INITIAL, FOLLOW_UP, DECLINED",
      "dataType" => "String",
      "allowableValues" => "[INITIAL, FOLLOW_UP, DECLINED]",
      "paramType" => "query",
    },
    {
      "name" => "method",
      "description" => "the communication method type. Possible values include: PHONE, SITE_VISIT, EMAIL",
      "dataType" => "String",
      "allowableValues" => "[PHONE, SITE_VISIT, EMAIL]",
      "paramType" => "query",
    },
    {
      "name" => "status",
      "description" => "the status type. Possible values include: ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED",
      "dataType" => "String",
      "allowableValues" => "[ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED]",
      "paramType" => "query",
    },
    {
      "name" => "closure",
      "description" => "the closure type. Possible values include: PHONE, SITE_VISIT, PHONE_SITE, WEB",
      "dataType" => "String",
      "allowableValues" => "[PHONE, SITE_VISIT, PHONE_SITE, WEB]",
      "paramType" => "query",
    },
    {
      "name" => "message",
      "description" => "the message from the assignee",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "follow_up",
      "description" => "the date to follow up by",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "determines whether the assignment status is active or inactive",
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


MyApp.add_route('POST', '/api/{version}/assignment/update', {
  "resourcePath" => "/Assignment",
  "summary" => "Update Assignment",
  "nickname" => "assignment_update",
  "responseClass" => "AssignmentResponse",
  "endpoint" => "/api/{version}/assignment/update",
  "notes" => "Updates an assignment.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the user account id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assignment_id",
      "description" => "the assignment id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "the name of the assignment",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "the description of the assignment",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assignee_account_id",
      "description" => "the account id to assign to",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_location_id",
      "description" => "the retailer location id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tags",
      "description" => "the tags",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "determines whether the assignment is active or inactive",
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

