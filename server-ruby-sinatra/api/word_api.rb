require 'json'


MyApp.add_route('POST', '/api/3.18/game/word/create', {
  "resourcePath" => "/Word",
  "summary" => "Create Word",
  "nickname" => "create_word",
  "responseClass" => "WordzWordResponse",
  "endpoint" => "/game/word/create",
  "notes" => "Create a word by the given params.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "word",
      "description" => "The text of the word.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "definition",
      "description" => "The definition of the word.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_id",
      "description" => "The asset id of the word.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "If true set the word to active. Default to false.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "allocate_tickets",
      "description" => "If true then scoring will give tickets. Default to false.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "ticket_count",
      "description" => "The number of tickets to reward",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "ticket_type",
      "description" => "The type of ticket to reward, null means default type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "points",
      "description" => "The number of points to award for completing a mission",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/3.18/game/word/delete', {
  "resourcePath" => "/Word",
  "summary" => "Delete Word",
  "nickname" => "delete_word",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/game/word/delete",
  "notes" => "Delete a word by the given id. The accountId given needs to be the owner or executive to delete.",
  "parameters" => [
    {
      "name" => "word_id",
      "description" => "The id of the word to delete.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account vor validating permission",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/game/word/get', {
  "resourcePath" => "/Word",
  "summary" => "Get Word",
  "nickname" => "get_word",
  "responseClass" => "WordzWordResponse",
  "endpoint" => "/game/word/get",
  "notes" => "Get a word by the given id.",
  "parameters" => [
    {
      "name" => "word_id",
      "description" => "The id of the word to get.",
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/game/word/search', {
  "resourcePath" => "/Word",
  "summary" => "Search Words",
  "nickname" => "get_words",
  "responseClass" => "Array<WordzWordResponse>",
  "endpoint" => "/game/word/search",
  "notes" => "Search for words by the given params.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "The keyword for searching words with matching definition or word text.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "The column to sort the search on",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'id'",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "The order to return the search results",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "active_only",
      "description" => "Return only active results if set to true.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "The record to begin the return set on.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "The number of records to return.",
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


MyApp.add_route('POST', '/api/3.18/game/word/update', {
  "resourcePath" => "/Word",
  "summary" => "Update Word",
  "nickname" => "update_word",
  "responseClass" => "WordzWordResponse",
  "endpoint" => "/game/word/update",
  "notes" => "Update a word by the given params.",
  "parameters" => [
    {
      "name" => "word_id",
      "description" => "The id of the word to update.",
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
      "name" => "word_text",
      "description" => "The text for the word",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "definition",
      "description" => "The definition of the word.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_id",
      "description" => "The asset id of the word.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "If true set the word to active.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "allocate_tickets",
      "description" => "If true then scoring will give tickets.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ticket_count",
      "description" => "The number of tickets to reward",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "ticket_type",
      "description" => "The type of ticket to reward, null means default type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "points",
      "description" => "The number of points to award for completing a mission",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

