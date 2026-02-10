require 'json'


MyApp.add_route('POST', '/api/{version}/program', {
  "resourcePath" => "/Program",
  "summary" => "Create Program",
  "nickname" => "create_program",
  "responseClass" => "Program",
  "endpoint" => "/api/{version}/program",
  "notes" => "Create a new program",
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
      "dataType" => "Program",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/{version}/program/{id}', {
  "resourcePath" => "/Program",
  "summary" => "Delete Program",
  "nickname" => "delete_program",
  "responseClass" => "void",
  "endpoint" => "/api/{version}/program/{id}",
  "notes" => "Delete an existing program",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "id",
      "description" => "the id of the program",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/program/{id}', {
  "resourcePath" => "/Program",
  "summary" => "Get Program",
  "nickname" => "get_program",
  "responseClass" => "Program",
  "endpoint" => "/api/{version}/program/{id}",
  "notes" => "Get an existing program",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "id",
      "description" => "the id of the program",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/program/{id}', {
  "resourcePath" => "/Program",
  "summary" => "Update Program",
  "nickname" => "post_program",
  "responseClass" => "Program",
  "endpoint" => "/api/{version}/program/{id}",
  "notes" => "Update an existing program",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "id",
      "description" => "the id of the program",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Program",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/api/{version}/program/{id}', {
  "resourcePath" => "/Program",
  "summary" => "Update Program",
  "nickname" => "put_program",
  "responseClass" => "Program",
  "endpoint" => "/api/{version}/program/{id}",
  "notes" => "Update an existing program",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "id",
      "description" => "the id of the program",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Program",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/program', {
  "resourcePath" => "/Program",
  "summary" => "Search Programs",
  "nickname" => "search_programs",
  "responseClass" => "Array<Program>",
  "endpoint" => "/api/{version}/program",
  "notes" => "Search for programs",
  "parameters" => [
    {
      "name" => "keyword",
      "description" => "The keyword to filter results by",
      "dataType" => "String",
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

