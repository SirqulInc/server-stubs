require 'json'


MyApp.add_route('GET', '/api/{version}/ticket/count', {
  "resourcePath" => "/Ticket",
  "summary" => "Get Ticket Count",
  "nickname" => "get_ticket_count",
  "responseClass" => "CountResponse",
  "endpoint" => "/api/{version}/ticket/count",
  "notes" => "Gets the ticket count.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the id of the device that owns the tickets",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the id of the account that owns the tickets",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_type",
      "description" => "this is deprecated.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "the applicationkey",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ticket_type",
      "description" => "the type of ticket",
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


MyApp.add_route('GET', '/api/{version}/ticket/getList', {
  "resourcePath" => "/Ticket",
  "summary" => "Get Ticket List",
  "nickname" => "get_ticket_list",
  "responseClass" => "TicketListResponse",
  "endpoint" => "/api/{version}/ticket/getList",
  "notes" => "Gets the list of tickets.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the id of the device that owns the tickets",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the id of the account that owns the tickets",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ticket_object_type",
      "description" => "comma separated list of TicketObjectType",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "action_type",
      "description" => "comma separated list of TicketActionType",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ticket_ids",
      "description" => "the ids of the tickets to get",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "object_ids",
      "description" => "the ids of the objects to get",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "receipt_tokens",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_type",
      "description" => "",
      "dataType" => "String",
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


MyApp.add_route('POST', '/api/{version}/purchase/gift', {
  "resourcePath" => "/Ticket",
  "summary" => "Gift Tickets",
  "nickname" => "gift_purchase",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/api/{version}/purchase/gift",
  "notes" => "Gift tickets to another user.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the id of the device",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the id of the gift owner",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "receiver_account_id",
      "description" => "the id of the account receiving the tickets",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ticket_id",
      "description" => "the id of the tickets",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_id",
      "description" => "the id of the asset",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "custom_message",
      "description" => "a message that can be written to go along with the gift",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_type",
      "description" => "the type of game associated with the tickets",
      "dataType" => "String",
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


MyApp.add_route('POST', '/api/{version}/ticket/save', {
  "resourcePath" => "/Ticket",
  "summary" => "Save Ticket",
  "nickname" => "save_ticket",
  "responseClass" => "ProfileResponse",
  "endpoint" => "/api/{version}/ticket/save",
  "notes" => "Allow user to acquire a purchase item and generate a ticket record. Used to redeem tickets or add tickets to the system.",
  "parameters" => [
    {
      "name" => "return_nulls",
      "description" => "whether to return nulls or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "device_id",
      "description" => "the device id that owns the tickets",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account id that owns the tickets",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_type",
      "description" => "This parameter is deprecated. deprecated, use the appKey",
      "dataType" => "String",
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
      "name" => "action_type",
      "description" => "the action being performed, values: COMPLETED, // ADD TICKETS FOR COMPLETING A MISSION, CHALLENGE, GAME, PACK, LEVEL, LEVEL OBJECT REDEEMED, // REMOVE TICKETS FOR BUYING PACKS, HINTS, AND PEN TOOLS OPTIONS, ETC USERS_PLAYED, // ADD TICKETS FOR LEVELS PLAYED BY OTHER USERS TOURNAMENT_OWNER, // ADD TICKETS FOR TOURNAMENTS BY OTHER USERS PURCHASED, // ADD TICKET VIA IN APP PURCHASING SUMATION, // SUMATION OF TICKETS EARNED FROM CHILDREN GIFTED, // TRANSFERING OF PURCHASE ITEMS TO OTHER PEOPLE REFUNDED // FOR REFUNDING TICKETS BACK TO THE USER",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ticket_object_type",
      "description" => "the type of object being purchased, values: GAME_OBJECT, GAME_LEVEL, PACK, GAME, MISSION, PROFILE, APPLICATION, TICKETS, ASSET, CUSTOM",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "object_id",
      "description" => "the ID of the item being purchased",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "purchase_code",
      "description" => "a unique string identifier defined by the application owner or Executive",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "receipt_token",
      "description" => "a unique transaction identifier from the purchase provider (i.e. the transaction ID from iTunes, Google Play, etc)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "receipt_data",
      "description" => "the receipt/transaction data for validating a purchase via iTunes/Gooogle/etc. This should be in string format.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "count",
      "description" => "the count of tickets",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ticket_type",
      "description" => "the ticket type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "purchase_provider",
      "description" => "the provider for making the purchase {ITUNES, ITUNES_SANDBOX, GOOGLE}",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "purchase_type",
      "description" => "a comma separated list of purchase types { SIRQUL, // purchasing from the sirqul store using tickets IOS, // purchasing from the itunes store for iPhone, iPod, iPod Touch GOOGLE, // purchasing from the google android store AMAZON, // purchasing from the amazon android store MAC, // purchasing from the itunes store for OSX WP8, // purhasing from the windows phone 8 store FREE }",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_profile_response",
      "description" => "returns a ProfileResponse if true, otherwise will return an AppResponse",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_profile_response",
      "description" => "if returnProfileResponse is false, will return an AppResponse with profile data if true",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_version",
      "description" => "the application version",
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


MyApp.add_route('POST', '/api/{version}/ticket/save/fileUpload', {
  "resourcePath" => "/Ticket",
  "summary" => "Save Ticket with Reciept",
  "nickname" => "save_ticket_via_file_upload",
  "responseClass" => "ProfileResponse",
  "endpoint" => "/api/{version}/ticket/save/fileUpload",
  "notes" => "Similar to the Save Ticket endpoint but allows the receiptData to be in binary format. This must be a multi-part post",
  "parameters" => [
    {
      "name" => "return_nulls",
      "description" => "whether to return nulls or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "device_id",
      "description" => "the device id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_type",
      "description" => "This parameter is deprecated. deprecated, use the appKey",
      "dataType" => "String",
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
      "name" => "action_type",
      "description" => "the action being performed { COMPLETED, // ADD TICKETS FOR COMPLETING A MISSION, CHALLENGE, GAME, PACK, LEVEL, LEVEL OBJECT REDEEMED, // REMOVE TICKETS FOR BUYING PACKS, HINTS, AND PEN TOOLS OPTIONS, ETC USERS_PLAYED, // ADD TICKETS FOR LEVELS PLAYED BY OTHER USERS TOURNAMENT_OWNER, // ADD TICKETS FOR TOURNAMENTS BY OTHER USERS PURCHASED, // ADD TICKET VIA IN APP PURCHASING SUMATION, // SUMATION OF TICKETS EARNED FROM CHILDREN GIFTED, // TRANSFERING OF PURCHASE ITEMS TO OTHER PEOPLE REFUNDED // FOR REFUNDING TICKETS BACK TO THE USER }",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ticket_object_type",
      "description" => "the type of object being purchased {GAME_OBJECT, GAME_LEVEL, PACK, GAME, MISSION, PROFILE, APPLICATION, TICKETS, ASSET, CUSTOM}",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "object_id",
      "description" => "the ID of the item being purchased",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "purchase_code",
      "description" => "a unique string identifier defined by the application owner or Executive",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "receipt_token",
      "description" => "a unique transaction identifier from the purchase provider (i.e. the transaction ID from iTunes, Google Play, etc)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "receipt_data",
      "description" => "the receipt/transaction data for validating a purchase via iTunes/Gooogle/etc. This should be in binary format.",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "count",
      "description" => "the count of tickets",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ticket_type",
      "description" => "the ticket type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "purchase_provider",
      "description" => "the provider for making the purchase {ITUNES, ITUNES_SANDBOX, GOOGLE}",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "purchase_type",
      "description" => "a comma separated list of purchase types { SIRQUL, // purchasing from the sirqul store using tickets IOS, // purchasing from the itunes store for iPhone, iPod, iPod Touch GOOGLE, // purchasing from the google android store AMAZON, // purchasing from the amazon android store MAC, // purchasing from the itunes store for OSX WP8, // purhasing from the windows phone 8 store FREE }",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_profile_response",
      "description" => "returns a ProfileResponse if true, otherwise will return an AppResponse",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_profile_response",
      "description" => "if returnProfileResponse is false, will return an AppResponse with profile data if true",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_version",
      "description" => "the application version",
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


MyApp.add_route('GET', '/api/{version}/ticket/ticketoffers', {
  "resourcePath" => "/Ticket",
  "summary" => "Get Ticket Offers",
  "nickname" => "ticket_offers",
  "responseClass" => "TicketOfferResponse",
  "endpoint" => "/api/{version}/ticket/ticketoffers",
  "notes" => "Get a list offers for tickets owned by sirqul.  Purchasing these will add the number of tickets to the account specified by the offer.",
  "parameters" => [
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

