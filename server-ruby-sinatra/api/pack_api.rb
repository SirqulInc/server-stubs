require 'json'


MyApp.add_route('POST', '/api/3.18/pack/create', {
  "resourcePath" => "/Pack",
  "summary" => "Create Pack",
  "nickname" => "create_pack",
  "responseClass" => "PackResponse",
  "endpoint" => "/pack/create",
  "notes" => "Create a pack.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "The title of the pack",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "The description of the pack",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "search_tags",
      "description" => "The tags for searching the pack, comma separated",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "Activate/deactivate the pack",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_type",
      "description" => "This parameter is deprecated.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key used to identify the application",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pack_type",
      "description" => "The type of the pack",
      "dataType" => "String",
      "allowableValues" => "[TUTORIAL, BUILTIN, DOWNLOAD, THRESHOLD, THEME, TOURNAMENT]",
      "paramType" => "query",
    },
    {
      "name" => "pack_order",
      "description" => "The order of the pack",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sequence_type",
      "description" => "The type of game sequence of the pack",
      "dataType" => "String",
      "allowableValues" => "[FIRST_AVAILABLE, ALL_AVAILABLE]",
      "paramType" => "query",
    },
    {
      "name" => "background_id",
      "description" => "The background asset id of the pack",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "image_id",
      "description" => "The image asset id of the pack",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "The date/time to start the pack, send 0 to unset",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "The date/time to end the pack, send 0 to unset",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "author_override",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "price",
      "description" => "The price in tickets to purchase this pack",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "price_type",
      "description" => "the type of ticket required to purchase this pack",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_level_ids",
      "description" => "the game level ids to include in the pack, comma separated",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "in_game",
      "description" => "",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "highest",
      "description" => "The scoring is highest is best",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "allocate_tickets",
      "description" => "Flag to indicate owner should receive tickets for completed packs",
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
      "description" => "The number of points to award for completing a pack",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/pack/delete', {
  "resourcePath" => "/Pack",
  "summary" => "Delete Pack",
  "nickname" => "delete_pack",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/pack/delete",
  "notes" => "Delete a pack.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "the id of the logged in user",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pack_id",
      "description" => "the id of the pack to delete",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/pack/get', {
  "resourcePath" => "/Pack",
  "summary" => "Get Pack",
  "nickname" => "get_pack",
  "responseClass" => "PackResponse",
  "endpoint" => "/pack/get",
  "notes" => "Get a pack.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pack_id",
      "description" => "The id of the pack to return.",
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/pack/search', {
  "resourcePath" => "/Pack",
  "summary" => "Search Packs",
  "nickname" => "search_packs",
  "responseClass" => "Array<PackResponse>",
  "endpoint" => "/pack/search",
  "notes" => "Search on packs.",
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
      "description" => "Keyword search on the pack name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pack_type",
      "description" => "Filters results on pack type",
      "dataType" => "String",
      "allowableValues" => "[TUTORIAL, BUILTIN, DOWNLOAD, THRESHOLD, THEME, TOURNAMENT]",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "The field to sort by. Possible values include: TITLE, DESCRIPTION, CREATED, UPDATED",
      "dataType" => "String",
      "allowableValues" => "[TITLE, DESCRIPTION, CREATED, UPDATED]",
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
      "name" => "include_game_data",
      "description" => "Determines whether to include game data in the results",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_inactive",
      "description" => "Determines whether to include inactive results",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application to filter results on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/pack/update', {
  "resourcePath" => "/Pack",
  "summary" => "Update Pack",
  "nickname" => "update_pack",
  "responseClass" => "PackResponse",
  "endpoint" => "/pack/update",
  "notes" => "Update a pack.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The logged in user.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pack_id",
      "description" => "The id of the pack to update.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "The title of the pack",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "The description of the pack",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "search_tags",
      "description" => "The tags for searching the pack, comma separated",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "Activate/deactivate the pack",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_type",
      "description" => "This parameter is deprecated.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application key used to identify the application",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pack_type",
      "description" => "The type of the pack",
      "dataType" => "String",
      "allowableValues" => "[TUTORIAL, BUILTIN, DOWNLOAD, THRESHOLD, THEME, TOURNAMENT]",
      "paramType" => "query",
    },
    {
      "name" => "pack_order",
      "description" => "The order of the pack",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sequence_type",
      "description" => "The type of game sequence of the pack",
      "dataType" => "String",
      "allowableValues" => "[FIRST_AVAILABLE, ALL_AVAILABLE]",
      "paramType" => "query",
    },
    {
      "name" => "background_id",
      "description" => "The background asset id of the pack",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "image_id",
      "description" => "The image asset id of the pack",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "The date/time to start the pack, send 0 to unset",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "The date/time to end the pack, send 0 to unset",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "author_override",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "price",
      "description" => "The price in tickets to purchase this pack",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "price_type",
      "description" => "the type of ticket required to purchase this pack",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_level_ids",
      "description" => "the game level ids to include in the pack, comma separated",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "in_game",
      "description" => "",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "highest",
      "description" => "The scoring is highest is best",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "allocate_tickets",
      "description" => "Flag to indicate owner should receive tickets for completed packs",
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
      "description" => "The number of points to award for completing a pack",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

