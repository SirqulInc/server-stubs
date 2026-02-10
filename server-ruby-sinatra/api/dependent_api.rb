require 'json'


MyApp.add_route('PUT', '/api/{version}/cargo/dependent/{accountId}', {
  "resourcePath" => "/Dependent",
  "summary" => "Create Dependent",
  "nickname" => "create",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/cargo/dependent/{accountId}",
  "notes" => "Create dependent of the account",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "account_id",
      "description" => "the id of the parent account to create a dependent for",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Account",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/cargo/dependent/{accountId}', {
  "resourcePath" => "/Dependent",
  "summary" => "Get dependent list of an account",
  "nickname" => "get_dependents",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/cargo/dependent/{accountId}",
  "notes" => "Get the dependent list of an account",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "account_id",
      "description" => "the id of the parent account to get a list of dependents",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/{version}/cargo/dependent/{accountId}', {
  "resourcePath" => "/Dependent",
  "summary" => "Delete Dependent",
  "nickname" => "remove_dependent",
  "responseClass" => "void",
  "endpoint" => "/api/{version}/cargo/dependent/{accountId}",
  "notes" => "Delete the Dependent",
  "parameters" => [
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "account_id",
      "description" => "the id of the parent account tied to the dependent",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "dependent_id",
      "description" => "the id of the dependent to delete",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

