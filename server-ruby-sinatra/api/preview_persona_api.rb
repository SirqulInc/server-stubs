require 'json'


MyApp.add_route('POST', '/api/{version}/persona/create', {
  "resourcePath" => "/PreviewPersona",
  "summary" => "Create Persona",
  "nickname" => "create_persona",
  "responseClass" => "PreviewPersonaResponse",
  "endpoint" => "/api/{version}/persona/create",
  "notes" => "Creates a new persona. If the given params are null those attributes will be override by null.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the account ID of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "the title of the persona",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preview_accounts",
      "description" => "the accounts that are able to preview from this persona",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "date",
      "description" => "the sepcified date that this persona is viewing the app",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "age",
      "description" => "the specified age of this persona",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "gender",
      "description" => "the specified gender of this persona",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_experience_level",
      "description" => "the specified experience level of the persona",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "the specified latitude of the persona",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "the specified longitude of the persona",
      "dataType" => "Float",
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


MyApp.add_route('POST', '/api/{version}/persona/delete', {
  "resourcePath" => "/PreviewPersona",
  "summary" => "Delete Persona",
  "nickname" => "delete_persona",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/persona/delete",
  "notes" => "Mark the persona for deletion.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the account id of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "persona_id",
      "description" => "the id of the persona to delete",
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


MyApp.add_route('GET', '/api/{version}/persona/get', {
  "resourcePath" => "/PreviewPersona",
  "summary" => "Get Persona",
  "nickname" => "get_persona_list",
  "responseClass" => "PreviewPersonaResponse",
  "endpoint" => "/api/{version}/persona/get",
  "notes" => "Get the persona by the given persona ID. If the persona cannot be found, a invalid response is returned.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the account ID of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "persona_id",
      "description" => "the persona ID of the persona",
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


MyApp.add_route('GET', '/api/{version}/persona/search', {
  "resourcePath" => "/PreviewPersona",
  "summary" => "Search Personas",
  "nickname" => "search_persona",
  "responseClass" => "PreviewPersonaResponse",
  "endpoint" => "/api/{version}/persona/search",
  "notes" => "Search for persona that the account owns by the given account ID.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the account ID of the user",
      "dataType" => "Integer",
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
      "description" => "the limit for pagination (There is a hard limit of 100)",
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


MyApp.add_route('POST', '/api/{version}/persona/update', {
  "resourcePath" => "/PreviewPersona",
  "summary" => "Update Persona",
  "nickname" => "update_persona",
  "responseClass" => "PreviewPersonaResponse",
  "endpoint" => "/api/{version}/persona/update",
  "notes" => "Update the persona by the given personaId. If the given params are null those attributes will be override by null. If active is assigned, all other params will be ignored.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the account ID of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "persona_id",
      "description" => "the persona ID of the persona to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "the title of the persona",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preview_accounts",
      "description" => "the accounts that are able to preview from this persona",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "the status of the persona, there can only be one active persona per account",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "date",
      "description" => "the sepcified date that this persona is viewing the app",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "age",
      "description" => "the specified age of this persona",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "gender",
      "description" => "the specified gender of this persona",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_experience_level",
      "description" => "the specified experience level of the persona",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "the specified latitude of the persona",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "the specified longitude of the persona",
      "dataType" => "Float",
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

