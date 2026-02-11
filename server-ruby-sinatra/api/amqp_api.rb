require 'json'


MyApp.add_route('POST', '/api/3.18/queue/consumer/create', {
  "resourcePath" => "/AMQP",
  "summary" => "Create Consumer",
  "nickname" => "consumer_create",
  "responseClass" => "QueueResponse",
  "endpoint" => "/queue/consumer/create",
  "notes" => "Create a connection to an existing amqp queue and register as a consumer.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The client deviceID",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The logged in user ID",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key to use when creating an analytic or service request. The account needs to have permissions to the applicaton or it will be denied.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the queue to connect to",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "hostname",
      "description" => "The hostname of the server the queue is hosted on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "port",
      "description" => "The port of the server the queue is hosted on",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "5672",
      "paramType" => "query",
    },
    {
      "name" => "username",
      "description" => "The username to access the server the queue is hosted on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "password",
      "description" => "The password to access the queue to connect to",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "virtual_host",
      "description" => "The virtual host defined on the server the queue is associated on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "exchanger",
      "description" => "The exchanger of the queue to connect to",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "exchanger_type",
      "description" => "The exchanger type of the queue to connect to",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "workers",
      "description" => "The number of workers to generate ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "1",
      "paramType" => "query",
    },
    {
      "name" => "data_mapping",
      "description" => "The data mapping information in the format of AMQPRequest",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "use_ssl",
      "description" => "Use SSL",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/queue/consumer/update', {
  "resourcePath" => "/AMQP",
  "summary" => "Update Consumer",
  "nickname" => "consumer_update",
  "responseClass" => "QueueResponse",
  "endpoint" => "/queue/consumer/update",
  "notes" => "Update an existing amqp queue's data mapping.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The client deviceID",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The logged in user ID",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key to use when creating an analytic or service request. The account needs to have permissions to the applicaton or it will be denied.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "queue_id",
      "description" => "The queue to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "data_mapping",
      "description" => "The data mapping information in the format of AMQPRequest",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "use_ssl",
      "description" => "Use SSL",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/queue/create', {
  "resourcePath" => "/AMQP",
  "summary" => "Create Queue",
  "nickname" => "queue_create",
  "responseClass" => "QueueResponse",
  "endpoint" => "/queue/create",
  "notes" => "Create a basic AMQP queue. If the username and password and virtual host is not sepcified, the queue will be created on the virtual host assigned to the application.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The client deviceID",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The logged in user ID",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key unique to each application.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the queue to create",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "workers",
      "description" => "The number of workers to generate ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "1",
      "paramType" => "query",
    },
    {
      "name" => "analytic_tags",
      "description" => "If provided the analytic processing will publsih to this queue instead of the default one for the provided list of tags",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "hostname",
      "description" => "The hostname of the server the queue is hosted on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "port",
      "description" => "The port of the server the queue is hosted on",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "username",
      "description" => "The username to access the server that the queue is on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "password",
      "description" => "The password to access the queue to connect to",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "virtual_host",
      "description" => "The virtual host defined on the server to queue",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "use_ssl",
      "description" => "Use SSL",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/queue/delete', {
  "resourcePath" => "/AMQP",
  "summary" => "Delete Queue",
  "nickname" => "queue_delete",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/queue/delete",
  "notes" => "Delete the stored queue record and close any active connections to the AMQP servers.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The client device ID",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The logged in user ID",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "queue_id",
      "description" => "The id of the queue to find",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/queue/get', {
  "resourcePath" => "/AMQP",
  "summary" => "Get Queue",
  "nickname" => "queue_get",
  "responseClass" => "QueueResponse",
  "endpoint" => "/queue/get",
  "notes" => "Get the stored queue record. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The client device ID",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The logged in user ID",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "queue_id",
      "description" => "The id of the queue to find",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key the queue was assigned to",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the queue to find",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "hostname",
      "description" => "The hostname of the queue to find",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "virtual_host",
      "description" => "The virtual host of the queue to find",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/queue/publish', {
  "resourcePath" => "/AMQP",
  "summary" => "Publish Queue",
  "nickname" => "queue_publish",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/queue/publish",
  "notes" => "Publish a message to a stored queue. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record.",
  "parameters" => [
    {
      "name" => "queue_id",
      "description" => "The id of the queue to publish to",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key the queue was assigned to",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the queue to publish to or the analytic tag to handle if the analytic param is true",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "hostname",
      "description" => "The hostname of the server the queue is hosted on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "virtual_host",
      "description" => "The virtual host defined on the server to queue",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "message",
      "description" => "The payload to send to the queue",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/queue/search', {
  "resourcePath" => "/AMQP",
  "summary" => "Search Queue",
  "nickname" => "queue_search",
  "responseClass" => "QueueResponse",
  "endpoint" => "/queue/search",
  "notes" => "Get the queues setup for the BillableEntity's applications.",
  "parameters" => [
    {
      "name" => "queue_id",
      "description" => "The id of the queue to find",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "device_id",
      "description" => "The client device ID",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The logged in user ID",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the queue to find",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "Start of the index",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Limit of the index",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "10",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/queue/update', {
  "resourcePath" => "/AMQP",
  "summary" => "Update Queue",
  "nickname" => "queue_update",
  "responseClass" => "QueueResponse",
  "endpoint" => "/queue/update",
  "notes" => "Update the basic AMQP queue.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The client deviceID",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The logged in user ID",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key unique to each application.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "queue_id",
      "description" => "The id of the queue to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "workers",
      "description" => "The number of workers to generate",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "analytic_tags",
      "description" => "If provided the analytic processing will publsih to this queue instead of the default one for the provided list of tags",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "hostname",
      "description" => "The hostname of the server the queue is hosted on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "port",
      "description" => "The port of the server the queue is hosted on",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "username",
      "description" => "The username to access the server that the queue is on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "password",
      "description" => "The password to access the queue to connect to",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "virtual_host",
      "description" => "The virtual host defined on the server to queue",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "use_ssl",
      "description" => "the SSL to use",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

