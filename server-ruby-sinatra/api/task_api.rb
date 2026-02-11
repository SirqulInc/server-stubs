require 'json'


MyApp.add_route('POST', '/api/3.18/task/create', {
  "resourcePath" => "/Task",
  "summary" => "Create Task",
  "nickname" => "create_task",
  "responseClass" => "TaskResponse",
  "endpoint" => "/task/create",
  "notes" => "Create a Task",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the task",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application to target",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "grouping_id",
      "description" => "Client defined identifier for grouping tasks",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "endpoint_url",
      "description" => "The URL for making an HTTP call",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "payload",
      "description" => "The parameters for making an HTTP call",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "scheduled_date",
      "description" => "The date and time of the task",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "The starting date of the task",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "The ending date of the task",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "cron_expression",
      "description" => "The cron expression that represents the task&#39;s schedule",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "visibility",
      "description" => "The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)",
      "dataType" => "String",
      "allowableValues" => "[PUBLIC, PRIVATE, FRIENDS]",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "Sets whether the Task is active or not (inactive Tasks are not processed)",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/task/delete', {
  "resourcePath" => "/Task",
  "summary" => "Delete Task",
  "nickname" => "delete_task",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/task/delete",
  "notes" => "Delete a Task",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "task_id",
      "description" => "The id of the Task to delete.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/task/get', {
  "resourcePath" => "/Task",
  "summary" => "Get Task",
  "nickname" => "get_task",
  "responseClass" => "TaskResponse",
  "endpoint" => "/task/get",
  "notes" => "Get a Task",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "task_id",
      "description" => "The id of the Task to return.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/task/search', {
  "resourcePath" => "/Task",
  "summary" => "Search Tasks",
  "nickname" => "search_tasks",
  "responseClass" => "Array<TaskResponse>",
  "endpoint" => "/task/search",
  "notes" => "Search on Tasks",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "grouping_id",
      "description" => "Filter results by a grouping identifier defined by the client",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter",
      "description" => "A comma separated list of filters:  * MINE - Return tasks that the user has created * SHARED - Return tasks that have been shared to the user * FOLLOWER - Return tasks that have been created by the user&#39;&#39;s followers (the content needs to have been APPROVED or FEATURED) * FOLLOWING - Return tasks that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED) * PUBLIC - Return all PUBLIC tasks that have been APPROVED or FEATURED * ALL_PUBLIC - Return all PUBLIC tasks regardless of whether they are approved or not (ignores the approval status) * LIKED - Return all tasks that the user has liked * FEATURED - Return all tasks that have been featured * PENDING - Return all pending tasks ",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'MINE'",
      "paramType" => "query",
    },
    {
      "name" => "statuses",
      "description" => "Filter results by status (comma separated list). Values include: NEW, ERROR, COMPLETE, PROCESSING, TEMPLATE",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'NEW,ERROR,COMPLETE,PROCESSING'",
      "paramType" => "query",
    },
    {
      "name" => "template_types",
      "description" => "Template Types",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Filter the list by a specific application",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "Keyword search on the task names.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "The field to sort by. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, SCHEDULED_DATE, START_DATE, END_DATE",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'CREATED'",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "Determines whether the sorted list is in descending or ascending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "Start the result set at some index.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Limit the result to some number.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    {
      "name" => "active_only",
      "description" => "Determines whether to return only active results",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/task/update', {
  "resourcePath" => "/Task",
  "summary" => "Update Task",
  "nickname" => "update_task",
  "responseClass" => "TaskResponse",
  "endpoint" => "/task/update",
  "notes" => "Update a Task",
  "parameters" => [
    {
      "name" => "task_id",
      "description" => "Task Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the task",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application to target",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "grouping_id",
      "description" => "Client defined identifier for grouping tasks",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "endpoint_url",
      "description" => "The URL for making an HTTP call",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "payload",
      "description" => "The parameters for making an HTTP call",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "scheduled_date",
      "description" => "The date and time of the task",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "The starting date of the task",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "The ending date of the task",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "cron_expression",
      "description" => "The cron expression that represents the task&#39;s schedule",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "visibility",
      "description" => "The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)",
      "dataType" => "String",
      "allowableValues" => "[PUBLIC, PRIVATE, FRIENDS]",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "Sets whether the Task is active or not (inactive Tasks are not processed)",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

