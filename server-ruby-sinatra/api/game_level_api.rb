require 'json'


MyApp.add_route('POST', '/api/{version}/level/create', {
  "resourcePath" => "/GameLevel",
  "summary" => "Create Game Level",
  "nickname" => "create_game_level",
  "responseClass" => "GameLevelResponse",
  "endpoint" => "/api/{version}/level/create",
  "notes" => "Create a game level. Currently does NOT support game objects.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The game application key to save the level for.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the level.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "The description of the level.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "difficulty",
      "description" => "The difficulty, possible values are: VERY_EASY, EASY, MEDIUM, HARD, VERY_HARD.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_version",
      "description" => "The version number of the application required to correctly load/play the level.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_image_id",
      "description" => "The asset Id of the level image.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_icon_id",
      "description" => "The asset Id of the level icon.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_data",
      "description" => "The game level data: xml, json, or other text based format.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_data_suffix",
      "description" => "The game level data format type.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "visibility",
      "description" => "Is the level visible to others, possible values are: PUBLIC, PRIVATE.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "friend_group",
      "description" => "Make the level be readable by all friends.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_ids",
      "description" => "Make the level be readable by connections in this list.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_group_ids",
      "description" => "Make the level be readable by connection groups in this list.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "balance",
      "description" => "Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "If true set the game level as active. Default is false.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "allocate_tickets",
      "description" => "If true then scoring will give tickets. Default is false.",
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
      "description" => "The number of points to award for completing a level",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tutorial_title",
      "description" => "Title of the tutorial.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tutorial_message",
      "description" => "Message of the tutotrial.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tutorial_alignment",
      "description" => "Alignment of the tutorial image. Default to NONE. Possible values are: NONE, IMAGE_ABOVE, IMAGE_BELOW, IMAGE_LEFT, IMAGE_RIGHT, IMAGE_ONLY, TEXT_ONLY",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tutorial_image_asset_id",
      "description" => "Asset id of the tutorial image.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_id",
      "description" => "id of the offer",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "meta_data",
      "description" => "external custom client defined data",
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


MyApp.add_route('POST', '/api/{version}/level/delete', {
  "resourcePath" => "/GameLevel",
  "summary" => "Delete Game Level",
  "nickname" => "delete_game_level",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/level/delete",
  "notes" => "Delete a game level. The level and account must be valid and have the appropirate permissions to view the content.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "level_id",
      "description" => "The id of the level to return.",
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


MyApp.add_route('GET', '/api/{version}/level/get', {
  "resourcePath" => "/GameLevel",
  "summary" => "Get Game Level",
  "nickname" => "get_game_level",
  "responseClass" => "GameLevelResponse",
  "endpoint" => "/api/{version}/level/get",
  "notes" => "Get a game level. The level and account must be valid and have the appropirate permissions to view the content.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "level_id",
      "description" => "The id of the level to return.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_game_data",
      "description" => "If true include the game level data, otherwise don&#39;t. default is false.",
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


MyApp.add_route('GET', '/api/{version}/level/search', {
  "resourcePath" => "/GameLevel",
  "summary" => "Search Game Levels",
  "nickname" => "get_game_levels_by_application",
  "responseClass" => "GameLevelListResponse",
  "endpoint" => "/api/{version}/level/search",
  "notes" => "Get a list of levels for an application, just those the account has permissions to view.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "the application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "Match the keyword to the owner name or level name.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "what field to sort on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "whether to return levels in ascending or descending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "Start the result set at some index.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Limit the result to some number.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_version",
      "description" => "The maximum version of the level to return.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_game_data",
      "description" => "If true include the game level data, otherwise don&#39;t. default is false.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filters",
      "description" => "",
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


MyApp.add_route('GET', '/api/{version}/level/searchByBillableEntity', {
  "resourcePath" => "/GameLevel",
  "summary" => "Search Game Level by Billable Entity",
  "nickname" => "get_game_levels_by_billable_entity",
  "responseClass" => "GameLevelResponse",
  "endpoint" => "/api/{version}/level/searchByBillableEntity",
  "notes" => "Searches on game levels that the logged in user has access to. A user would have access if the creator of the game level is managed under the same BillableEntity.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account id of the user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "the application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "The keyword used to search",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "The column to sort the search on",
      "dataType" => "String",
      "allowableValues" => "[LEVEL_ACTIVE, LEVEL_NAME, LEVEL_DESCRIPTION, LEVEL_CREATED, LEVEL_UPDATED, LEVEL_LIKES, LEVEL_DISLIKES, LEVEL_NOTES, LEVEL_PLAYS, LEVEL_DOWNLOADS, LEVEL_QUITS, LEVEL_COMPLETES, LEVEL_VERSION, LEVEL_MISSION_TYPE, LEVEL_OWNER_DISPLAY, GAME_OWNER_DISPLAY, GAME_TITLE, GAME_DESCRIPTION, GAME_LIKES, GAME_DISLIKES, APP_NAME, APP_SCORING_TYPE]",
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
      "description" => "Return only active results",
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


MyApp.add_route('GET', '/api/{version}/level/questions/get', {
  "resourcePath" => "/GameLevel",
  "summary" => "Get Level Questions",
  "nickname" => "get_questions_in_level",
  "responseClass" => "QuestionResponse",
  "endpoint" => "/api/{version}/level/questions/get",
  "notes" => "Get questions within a level.",
  "parameters" => [
    {
      "name" => "level_id",
      "description" => "the id of the level to get questions from",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
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


MyApp.add_route('GET', '/api/{version}/level/words/get', {
  "resourcePath" => "/GameLevel",
  "summary" => "Get Level Words",
  "nickname" => "get_words_in_level",
  "responseClass" => "WordzWordResponse",
  "endpoint" => "/api/{version}/level/words/get",
  "notes" => "Get words within a level.",
  "parameters" => [
    {
      "name" => "level_id",
      "description" => "the id of the level to get words for",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
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


MyApp.add_route('POST', '/api/{version}/level/update', {
  "resourcePath" => "/GameLevel",
  "summary" => "Update Game Level",
  "nickname" => "update_game_level",
  "responseClass" => "GameLevelResponse",
  "endpoint" => "/api/{version}/level/update",
  "notes" => "Update a game level. Currently does NOT support game objects.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The game application key to save the level for.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "level_id",
      "description" => "If update then include the level Id.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "The name of the level.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "The description of the level.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "difficulty",
      "description" => "The difficulty, possible values are: VERY_EASY, EASY, MEDIUM, HARD, VERY_HARD.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_version",
      "description" => "The version number of the applicatuion required to correctly load/play the level.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_image_id",
      "description" => "The asset Id of the level image.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_icon_id",
      "description" => "The asset Id of the level icon.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_data",
      "description" => "The game level data: xml, json, or other texted based format.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_data_suffix",
      "description" => "The game level data format type.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "visibility",
      "description" => "Is the level visible to others, possible values are: PUBLIC, PRIVATE.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "friend_group",
      "description" => "Make the level be readable by all friends.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_ids",
      "description" => "Make the level be readable by connections in this list.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_group_ids",
      "description" => "Make the level be readable by connection groups in this list.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "balance",
      "description" => "Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "If true set the game level as active.",
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
      "description" => "The number of points to award for completing a level",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tutorial_title",
      "description" => "Title of the tutorial.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tutorial_message",
      "description" => "Message of the tutorial.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tutorial_alignment",
      "description" => "Alignment of the tutorial image, possible values are: NONE, IMAGE_ABOVE, IMAGE_BELOW, IMAGE_LEFT, IMAGE_RIGHT, IMAGE_ONLY, TEXT_ONLY",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tutorial_image_asset_id",
      "description" => "Asset id of the tutorial image.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_id",
      "description" => "",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "meta_data",
      "description" => "external custom client defined data",
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


MyApp.add_route('POST', '/api/{version}/level/questions/update', {
  "resourcePath" => "/GameLevel",
  "summary" => "Update Level Questions",
  "nickname" => "update_questions_in_level",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/level/questions/update",
  "notes" => "Updates a level with question game objects.",
  "parameters" => [
    {
      "name" => "level_id",
      "description" => "the id of the level to update questions on",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "question_ids",
      "description" => "the IDs of the questions to update",
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


MyApp.add_route('POST', '/api/{version}/level/words/update', {
  "resourcePath" => "/GameLevel",
  "summary" => "Update Level Words",
  "nickname" => "update_words_in_level",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/level/words/update",
  "notes" => "Updates a level with word game objects.",
  "parameters" => [
    {
      "name" => "level_id",
      "description" => "the id of the level to update words for",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "word_ids",
      "description" => "the ids of the words to update for the level",
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

