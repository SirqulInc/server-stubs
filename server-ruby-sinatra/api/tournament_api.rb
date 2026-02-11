require 'json'


MyApp.add_route('POST', '/api/3.18/tournament/create', {
  "resourcePath" => "/Tournament",
  "summary" => "Create Tournament",
  "nickname" => "create_tournament",
  "responseClass" => "TournamentResponse",
  "endpoint" => "/tournament/create",
  "notes" => "Create a tournament.",
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
      "description" => "The appKey the tournament is created for.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "The title of the tournament",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sub_type",
      "description" => "Custom string client apps can use for searching/filtering tournaments",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "image_asset_id",
      "description" => "The asset ID to attach to the tournament",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "seconds_between_levels",
      "description" => "The number of seconds in between the start of each tournament game/group",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "600",
      "paramType" => "query",
    },
    {
      "name" => "seconds_for_tie_breaker",
      "description" => "The number of seconds to extend the round end time in the case of a tie breaker",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "600",
      "paramType" => "query",
    },
    {
      "name" => "seconds_between_packs",
      "description" => "The number of seconds in between the start of each tournament round",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "86400",
      "paramType" => "query",
    },
    {
      "name" => "maximum_level_length",
      "description" => "The maximum number of seconds the match is expected to end at, which gets used to determine when a match should end when there is no activity",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "1800",
      "paramType" => "query",
    },
    {
      "name" => "cost_to_play",
      "description" => "The number of tickets required to pay to enter the tournament",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "cost_to_play_type",
      "description" => "The type of ticket required to pay",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "minimum_to_play",
      "description" => "The minimum number of players required to sign up for the tournament to be played",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "1",
      "paramType" => "query",
    },
    {
      "name" => "starting_limit",
      "description" => "The starting number of players for a tournament (filled with AI&#39;s)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "available_limit",
      "description" => "The maximum number of players for a tournament (currently 128 but not enforced)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "The description of the tournament",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "meta_data",
      "description" => "External custom client defined data",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "The date/time to start the tournament",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_ids",
      "description" => "The audiences associated with the tournament",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "Activate/deactivate the tournament",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_buy_back",
      "description" => "Determines whether to allow players to buy back into a tournament",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "offer_ids",
      "description" => "The list of offers to give as a reward beyond the tickets",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_asset_id",
      "description" => "The artwork ID to attach to the reward tickets offers",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "fixed_reward",
      "description" => "If set then do not update the ticket reward, auto set to true if offerIds provided",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "split_reward",
      "description" => "Set the rules for handling the reward in case of a tie, values: EVEN split the reward evenly ALL everyone gets the full reward value FIRST first score submitted RANDOM random player who scored",
      "dataType" => "String",
      "allowableValues" => "[EVEN, ALL, FIRST, RANDOM]",
      "defaultValue" => "'ALL'",
      "paramType" => "query",
    },
    {
      "name" => "allocate_tickets",
      "description" => "Flag to indicate owner should receive tickets for completed missions",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tournament_data",
      "description" => "A text based string that will be passed into each tournament setup to populate the content",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_type",
      "description" => "The style of tournament to build, options are: TOURNAMENT, POOLPLAY",
      "dataType" => "String",
      "allowableValues" => "[TOURNAMENT, POOLPLAY, MULTISTAGE]",
      "defaultValue" => "'MULTISTAGE'",
      "paramType" => "query",
    },
    {
      "name" => "visibility",
      "description" => "Sets the visibility flag for the tournament",
      "dataType" => "String",
      "allowableValues" => "[PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE]",
      "defaultValue" => "'PUBLIC'",
      "paramType" => "query",
    },
    {
      "name" => "preliminary_groups",
      "description" => "The number of initial preliminary groups in a multi-stage tournament (this is expected to be a power of two number)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "1",
      "paramType" => "query",
    },
    {
      "name" => "preliminary_group_advancements",
      "description" => "This determines how many people can advance per round in a preliminary group (this is a comma separated list of integers)",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'1'",
      "paramType" => "query",
    },
    {
      "name" => "enable_multiple_entries",
      "description" => "This determines if multiple submissions/entries are allowed in a multi-stage album tournament",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "enable_multiple_votes",
      "description" => "This determines if users are allowed to vote multiple times per group in a multi-stage album tournament",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "featured",
      "description" => "This determines whether the tournament is \&quot;featured\&quot; or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "winner_tag",
      "description" => "This sets what analytic tag is used when a winner is determined",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tie_tag",
      "description" => "This sets what analytic tag is used when a tie has occurred",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/tournament/delete', {
  "resourcePath" => "/Tournament",
  "summary" => "Delete Tournament",
  "nickname" => "delete_tournament",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/tournament/delete",
  "notes" => "Delete a tournament.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_id",
      "description" => "the id of the mission to delete",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/tournament/get', {
  "resourcePath" => "/Tournament",
  "summary" => "Get Tournament",
  "nickname" => "get_tournament",
  "responseClass" => "TournamentResponse",
  "endpoint" => "/tournament/get",
  "notes" => "Get a tournament.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_id",
      "description" => "The id of the mission to return (either missionId or joinCode is required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "join_code",
      "description" => "Optional identifier for getting the tournament (either missionId or joinCode is required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_scores",
      "description" => "Determines which type of scores are returned. Possible values include: ALL, MINE",
      "dataType" => "String",
      "allowableValues" => "[ALL, MINE]",
      "paramType" => "query",
    },
    {
      "name" => "object_preview_size",
      "description" => "Determines the max number of game objects that will get returned for each game level response",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "50",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/tournament/object/search', {
  "resourcePath" => "/Tournament",
  "summary" => "Search Tournament Objects",
  "nickname" => "search_objects",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/tournament/object/search",
  "notes" => "Search on game objects of tournaments",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the account ID",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_level_id",
      "description" => "the game level id to filter results by",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "the field to sort by",
      "dataType" => "String",
      "allowableValues" => "[ID, PLAYER_SCORE_COUNT]",
      "defaultValue" => "'PLAYER_SCORE_COUNT'",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "determines whether the sorted list is in descending or ascending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "the start index for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the limit for pagination",
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


MyApp.add_route('GET', '/api/3.18/tournament/round/search', {
  "resourcePath" => "/Tournament",
  "summary" => "Search Tournament Rounds",
  "nickname" => "search_rounds",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/tournament/round/search",
  "notes" => "Search for the user's tournament games.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the account ID",
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
      "name" => "status",
      "description" => "comma separated list of statuses to filter results by",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'ACCEPTED,ACTIVE'",
      "paramType" => "query",
    },
    {
      "name" => "mission_type",
      "description" => "The style of tournament to search for, options are: TOURNAMENT, POOLPLAY",
      "dataType" => "String",
      "allowableValues" => "[TOURNAMENT, POOLPLAY]",
      "paramType" => "query",
    },
    {
      "name" => "current_only",
      "description" => "search for games that are flagged current only",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "visibilities",
      "description" => "Filter tournament rounds by the mission visibility flag",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'PUBLIC'",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "the start index for pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the limit for pagination",
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


MyApp.add_route('GET', '/api/3.18/tournament/search', {
  "resourcePath" => "/Tournament",
  "summary" => "Search Tournaments",
  "nickname" => "search_tournaments",
  "responseClass" => "MissionShortResponse",
  "endpoint" => "/tournament/search",
  "notes" => "Search for tournaments",
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
      "description" => "The application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "the keyword to search tournament on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sub_type",
      "description" => "filter results by subType",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_inactive",
      "description" => "whether to include inactives in the search or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "mission_types",
      "description" => "comma separated list of mission types to filter results, possbile values include: TOURNAMENT, POOLPLAY, MULTISTAGE",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'MULTISTAGE,TOURNAMENT,POOLPLAY'",
      "paramType" => "query",
    },
    {
      "name" => "filter",
      "description" => "filter tournaments by the tournament&#39;s current state",
      "dataType" => "String",
      "allowableValues" => "[ALL, UPCOMING, PAST, PRESENT, ACTIVE]",
      "defaultValue" => "'UPCOMING'",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "which field to sort on",
      "dataType" => "String",
      "allowableValues" => "[ACTIVE, TITLE, DESCRIPTION, CREATED, UPDATED, MISSION_TYPE, OWNER_DISPLAY, START_DATE, END_DATE, STARTING_LIMIT, AVAILABLE_LIMIT, INVITE_COUNT, ACCEPTED_COUNT]",
      "defaultValue" => "'START_DATE'",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "Determines whether to return results in descending order. The default value will be true if the filter is \&quot;PAST\&quot;, otherwise the default value will be false.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "visibility",
      "description" => "Comma separated list of visibility flags for search for, possible values include: PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'PUBLIC'",
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
      "description" => "Limit the result to some number",
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


MyApp.add_route('POST', '/api/3.18/tournament/score', {
  "resourcePath" => "/Tournament",
  "summary" => "Submit Tournament Score",
  "nickname" => "submit_tournament_score",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/tournament/score",
  "notes" => "Submit an array of scores for a tournament match. ",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user account ID.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_id",
      "description" => "The missionId to score for",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_id",
      "description" => "The gameId to score for",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pack_id",
      "description" => "The packId to score for",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_level_id",
      "description" => "The gameLevelId to score for",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "scores",
      "description" => "a JSON Array of scores to submit for a tournament match &#x60;&#x60;&#x60;json [   {     \&quot;accountId\&quot;: 2,     \&quot;points\&quot;: 3   },   {     \&quot;accountId\&quot;: 1777662,     \&quot;points\&quot;: 7   } ] &#x60;&#x60;&#x60; ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/tournament/vote', {
  "resourcePath" => "/Tournament",
  "summary" => "Submit a vote for a multi-stage album tournament.",
  "nickname" => "submit_tournament_vote",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/tournament/vote",
  "notes" => "Submit a vote for a multi-stage album tournament.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The unique id of the device making the request (optional)",
      "dataType" => "String",
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
      "name" => "app_key",
      "description" => "The application to target",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_id",
      "description" => "The tournament&#39;s primary id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_object_id",
      "description" => "The tournament game object the user wants to vote on",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "check_if_device_already_voted",
      "description" => "When true, check if the device already voted to prevent duplicate votes from the same device",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/tournament/substitute', {
  "resourcePath" => "/Tournament",
  "summary" => "Substitute Tournament Player",
  "nickname" => "substitute_tournament_player",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/tournament/substitute",
  "notes" => "Service to replace the user's opponent in the current level - pack - mission with an AI account.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_id",
      "description" => "the id of the mission",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pack_id",
      "description" => "the id of the pack",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_level_id",
      "description" => "the id of the game level",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/tournament/update', {
  "resourcePath" => "/Tournament",
  "summary" => "Update Tournament",
  "nickname" => "update_tournament",
  "responseClass" => "TournamentResponse",
  "endpoint" => "/tournament/update",
  "notes" => "Update a tournament.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mission_id",
      "description" => "The mission/tournament to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "The title of the tournament",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sub_type",
      "description" => "Custom string client apps can use for searching/filtering missions",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "image_asset_id",
      "description" => "The asset ID to attach to the tournament",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "seconds_between_levels",
      "description" => "The number of seconds in between the start of each tournament game",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "seconds_for_tie_breaker",
      "description" => "The number of seconds to extend the round end time in the case of a tie breaker",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "seconds_between_packs",
      "description" => "The number of seconds in between the start of each tournament round",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "maximum_level_length",
      "description" => "The maximum number of seconds the match is expected to end at, which gets used to determine when a match should end when there is no activity",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "cost_to_play",
      "description" => "The number of tickets required to pay to enter the tournament",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "cost_to_play_type",
      "description" => "The type of ticket required to pay",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "minimum_to_play",
      "description" => "The minimum number of players required to sign up for the tournament to be played",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "starting_limit",
      "description" => "The starting number of players for a tournament (filled with AI&#39;s)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "available_limit",
      "description" => "The maximum number of players for a tournament (currently 128 but not enforced)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "The description of the tournament",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "meta_data",
      "description" => "External custom client defined data",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "The date/time to start the tournament",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "audience_ids",
      "description" => "The audiences associated with the tournament",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "Activate/deactivate the mission",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_buy_back",
      "description" => "Determines whether to allow players to buy back into a tournament",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_ids",
      "description" => "The list of offers to give as a reward beyond the tickets",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_asset_id",
      "description" => "The artwork ID to attach to the reward offer",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "fixed_reward",
      "description" => "If set then do not update the ticket reward, auto set to true if offerIds provided",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "split_reward",
      "description" => "Set the rules for handling the reward in case of a tie, values: EVEN split the reward evenly ALL everyone gets the full reward value FIRST first score submitted RANDOM random player who scored",
      "dataType" => "String",
      "allowableValues" => "[EVEN, ALL, FIRST, RANDOM]",
      "paramType" => "query",
    },
    {
      "name" => "allocate_tickets",
      "description" => "Flag to indicate owner should receive tickets for completed missions",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tournament_data",
      "description" => "A text based string that will be passed into each tournament setup to populate the content",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "visibility",
      "description" => "Sets the visibility flag for the tournament",
      "dataType" => "String",
      "allowableValues" => "[PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE]",
      "paramType" => "query",
    },
    {
      "name" => "preliminary_groups",
      "description" => "The number of initial preliminary groups in a multi-stage tournament (this is expected to be a power of two number)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "preliminary_group_advancements",
      "description" => "This determines how many people can advance per round in a preliminary group (this is a comma separated list of integers)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_multiple_entries",
      "description" => "This determines if multiple submissions/entries are allowed in a multi-stage album tournament",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_multiple_votes",
      "description" => "This determines if users are allowed to vote multiple times per group in a multi-stage album tournament",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "featured",
      "description" => "This determines whether the tournament is \&quot;featured\&quot; or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "winner_tag",
      "description" => "This sets what analytic tag is used when a winner is determined",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tie_tag",
      "description" => "This sets what analytic tag is used when a winner is determined",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

