require 'json'


MyApp.add_route('POST', '/api/3.18/game/question/create', {
  "resourcePath" => "/Question",
  "summary" => "Create Question",
  "nickname" => "create_question",
  "responseClass" => "QuestionResponse",
  "endpoint" => "/game/question/create",
  "notes" => "Create a question and related answers by the given params.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "question",
      "description" => "the text of the question",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "answers",
      "description" => "&#x60;&#x60;&#x60;json [   {     \&quot;text\&quot;: \&quot;1942\&quot;,     \&quot;image\&quot;: 123,     \&quot;videoURL\&quot;: \&quot;http://www.here.com\&quot;,     \&quot;correct\&quot;: true   },   {     \&quot;text\&quot;: \&quot;1943\&quot;,     \&quot;image\&quot;: 124,     \&quot;videoURL\&quot;: \&quot;http://www.there.com\&quot;,     \&quot;correct\&quot;: false   } ] &#x60;&#x60;&#x60; ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tags",
      "description" => "The tags of the question for search.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "video_url",
      "description" => "The video link for the question.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_id",
      "description" => "The asset id of the question.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "If true set the question to active. Default to false.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "allocate_tickets",
      "description" => "If true then scoring will give tickets. Default to false.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ticket_count",
      "description" => "The number of tickets to reward",
      "dataType" => "Integer",
      "allowableValues" => "",
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


MyApp.add_route('POST', '/api/3.18/game/question/delete', {
  "resourcePath" => "/Question",
  "summary" => "Delete Question",
  "nickname" => "delete_question",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/game/question/delete",
  "notes" => "Delete a question by the given questionId. The accountId given needs to be the owner or executive to delete.",
  "parameters" => [
    {
      "name" => "question_id",
      "description" => "the id of the question to delete",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the id of the account that can execute this request",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/game/question/get', {
  "resourcePath" => "/Question",
  "summary" => "Get Question",
  "nickname" => "get_question",
  "responseClass" => "QuestionResponse",
  "endpoint" => "/game/question/get",
  "notes" => "Get a question by the given id.",
  "parameters" => [
    {
      "name" => "question_id",
      "description" => "the id of the question to get",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the id of the account that can make this request",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/game/question/search', {
  "resourcePath" => "/Question",
  "summary" => "Search Questions",
  "nickname" => "search_questions",
  "responseClass" => "Array<QuestionResponse>",
  "endpoint" => "/game/question/search",
  "notes" => "Search for questions by the given params.",
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
      "description" => "The keyword for searching questions with matching tags or question text.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "The column to sort the search on",
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
      "name" => "active_only",
      "description" => "Return only active results if set to true.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "The record to begin the return set on.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "The number of records to return.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/game/question/update', {
  "resourcePath" => "/Question",
  "summary" => "Update Question",
  "nickname" => "update_question",
  "responseClass" => "QuestionResponse",
  "endpoint" => "/game/question/update",
  "notes" => "Update a question and related answers.",
  "parameters" => [
    {
      "name" => "question_id",
      "description" => "The id of the question to update.",
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
      "name" => "question",
      "description" => "The text of the question.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "answers",
      "description" => "The json representations of answers for the question.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tags",
      "description" => "The tags of the question for search.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "video_url",
      "description" => "The video link for the question.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_id",
      "description" => "The asset id of the question.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "If true set the question to active.",
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

