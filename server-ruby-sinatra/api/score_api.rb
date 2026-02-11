require 'json'


MyApp.add_route('POST', '/api/3.18/score/create', {
  "resourcePath" => "/Score",
  "summary" => "Create Score",
  "nickname" => "create_score",
  "responseClass" => "ScoreResponse",
  "endpoint" => "/score/create",
  "notes" => "Create a score.  The response object will contain a series of   coded messages detailing what items were completed, the score registered,   and any tickets allocated.  Scoring a  level could complete the pack it   is in, completing that pack could complete the game, which  in turn could   complete the mission.  This completion chain is indicated to the client   via  a list of {@link MessageResponse}.",
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
      "description" => "The game application key to save the score for.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_id",
      "description" => "The missionId to score for, ignore if not playing mission.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_id",
      "description" => "The gameId to score for, ignore if not playing mission.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pack_id",
      "description" => "The packId to score for, send -2 if playing community levels.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_level_id",
      "description" => "The gameLevelId to score for.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_object_id",
      "description" => "The gameObjectId to score for, ignore if level based scoring.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "points",
      "description" => "The score",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "time_taken",
      "description" => "The time taken to complete task",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "highest",
      "description" => "",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/score/get', {
  "resourcePath" => "/Score",
  "summary" => "Get Score",
  "nickname" => "get_score",
  "responseClass" => "ScoreResponse",
  "endpoint" => "/score/get",
  "notes" => "Get the high score for an item.  Pass in the full path IDs for the score.",
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
      "description" => "The game application key to get the level for.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_id",
      "description" => "The missionId to score for, null if not playing mission.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_id",
      "description" => "The gameId to score for, null if not playing mission.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pack_id",
      "description" => "The packId to score for, null if playing community levels.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_level_id",
      "description" => "The gameLevelId to score for.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_object_id",
      "description" => "The gameObjectId to score for, null if level based scoring.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "score_object_type",
      "description" => "The object type to filter scores by (TicketObjectType)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "score_status",
      "description" => "The status of the score to filter (ScoreStatus)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/score/search', {
  "resourcePath" => "/Score",
  "summary" => "Search Score",
  "nickname" => "search_scores",
  "responseClass" => "Array<ScoreResponse>",
  "endpoint" => "/score/search",
  "notes" => "Search the scores for an item.  Pass in the full path IDs for the scores.",
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
      "description" => "The game application key to get the level for.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_id",
      "description" => "The missionId to score for, null if not playing mission.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_id",
      "description" => "The gameId to score for, null if not playing mission.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pack_id",
      "description" => "The packId to score for, null if playing community levels.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_level_id",
      "description" => "The gameLevelId to score for.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_object_id",
      "description" => "The gameObjectId to score for, null if level based scoring.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

