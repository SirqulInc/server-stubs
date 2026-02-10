require 'json'


MyApp.add_route('POST', '/api/{version}/hub', {
  "resourcePath" => "/ServiceHub",
  "summary" => "Create Service Hub",
  "nickname" => "create_service_hub",
  "responseClass" => "ServiceHub",
  "endpoint" => "/api/{version}/hub",
  "notes" => "Create new service hub",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "ServiceHub",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/{version}/hub/{id}', {
  "resourcePath" => "/ServiceHub",
  "summary" => "Delete Service Hub",
  "nickname" => "delete_service_hub",
  "responseClass" => "void",
  "endpoint" => "/api/{version}/hub/{id}",
  "notes" => "Delete an existing service hub",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "id",
      "description" => "the id of the service hub to delete",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/hub/{id}', {
  "resourcePath" => "/ServiceHub",
  "summary" => "Get Service Hub",
  "nickname" => "get_service_hub",
  "responseClass" => "Object",
  "endpoint" => "/api/{version}/hub/{id}",
  "notes" => "Get an existing service hub",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "id",
      "description" => "the id of the service hub to get",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/hub/{id}', {
  "resourcePath" => "/ServiceHub",
  "summary" => "Update Service Hub",
  "nickname" => "post_service_hub",
  "responseClass" => "ServiceHub",
  "endpoint" => "/api/{version}/hub/{id}",
  "notes" => "Update an existing service hub",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "id",
      "description" => "the id of the service hub",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "ServiceHub",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/api/{version}/hub/{id}', {
  "resourcePath" => "/ServiceHub",
  "summary" => "Update Service Hub",
  "nickname" => "put_service_hub",
  "responseClass" => "ServiceHub",
  "endpoint" => "/api/{version}/hub/{id}",
  "notes" => "Update an existing service hub",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "id",
      "description" => "the id of the service hub",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "ServiceHub",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/hub', {
  "resourcePath" => "/ServiceHub",
  "summary" => "Search Service Hubs",
  "nickname" => "search_service_hubs",
  "responseClass" => "Array<ServiceHub>",
  "endpoint" => "/api/{version}/hub",
  "notes" => "Search for service hubs.",
  "parameters" => [
    {
      "name" => "keyword",
      "description" => "The keyword to search for",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "retailer_id",
      "description" => "The retailer belongs to",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "The field to sort by",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "Determines whether the sorted list is in descending or ascending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "The start index for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "The limit for pagination",
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

