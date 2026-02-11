require 'json'


MyApp.add_route('POST', '/api/3.18/reservation/create', {
  "resourcePath" => "/Reservation",
  "summary" => "Create Reservation",
  "nickname" => "create_reservation",
  "responseClass" => "void",
  "endpoint" => "/reservation/create",
  "notes" => "Creates a reservation on an offer object",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The device id (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "The start date",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "The end date",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_id",
      "description" => "The id of the offer being added (offerId or offeLocationId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offer_location_id",
      "description" => "The id of the offer location being added (offerId or offeLocationId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "The application requesting the reservation",
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/reservation/delete', {
  "resourcePath" => "/Reservation",
  "summary" => "Delete Reservation",
  "nickname" => "delete_reservation",
  "responseClass" => "void",
  "endpoint" => "/reservation/delete",
  "notes" => "Deleted a reservation on a reservation object",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "The device id (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "reservation_id",
      "description" => "The reservation id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/reservable/availability/update', {
  "resourcePath" => "/Reservation",
  "summary" => "Update Availability",
  "nickname" => "reservable_availability",
  "responseClass" => "Array<AvailabilityResponse>",
  "endpoint" => "/reservable/availability/update",
  "notes" => "",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the device id of the reservation",
      "dataType" => "String",
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
      "name" => "reservable_id",
      "description" => "the id of the reservation",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "reservable_type",
      "description" => "the type of reservation",
      "dataType" => "String",
      "allowableValues" => "[LOCATABLE, RESERVABLE, PERMISSIONABLE, NOTABLE, ASSETABLE, LIKABLE, FLAGABLE, FAVORITABLE, RATABLE, ALBUM, COLLECTION, APPLICATION, APPLICATION_SETTING, APPLICATION_CERT, APPLICATION_PLACEMENT, ACCOUNT, ACCOUNT_SETTING, GAME_LEVEL, PACK, MISSION, TOURNAMENT, ASSET, ALBUM_CONTEST, THEME_DESCRIPTOR, OFFER, OFFER_LOCATION, EVENT, RETAILER, RETAILER_LOCATION, NOTE, CREATIVE, FAVORITE, LIKE, RATING, ANALYTIC, THIRD_PARTY_CREDENTIAL, THIRD_PARTY_NETWORK, REGION]",
      "paramType" => "query",
    },
    {
      "name" => "availability",
      "description" => "Availability",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "availability_summary",
      "description" => "Availability Summary",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/reservable/availability/search', {
  "resourcePath" => "/Reservation",
  "summary" => "Search Availability",
  "nickname" => "search_availability",
  "responseClass" => "Array<AvailabilityResponse>",
  "endpoint" => "/reservable/availability/search",
  "notes" => "",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the device ID that the reservation is on",
      "dataType" => "String",
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
      "name" => "reservable_id",
      "description" => "the id of the reservation",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "reservable_type",
      "description" => "the reservable type",
      "dataType" => "String",
      "allowableValues" => "[LOCATABLE, RESERVABLE, PERMISSIONABLE, NOTABLE, ASSETABLE, LIKABLE, FLAGABLE, FAVORITABLE, RATABLE, ALBUM, COLLECTION, APPLICATION, APPLICATION_SETTING, APPLICATION_CERT, APPLICATION_PLACEMENT, ACCOUNT, ACCOUNT_SETTING, GAME_LEVEL, PACK, MISSION, TOURNAMENT, ASSET, ALBUM_CONTEST, THEME_DESCRIPTOR, OFFER, OFFER_LOCATION, EVENT, RETAILER, RETAILER_LOCATION, NOTE, CREATIVE, FAVORITE, LIKE, RATING, ANALYTIC, THIRD_PARTY_CREDENTIAL, THIRD_PARTY_NETWORK, REGION]",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "the start date of the reservation",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "the end date of the reservation",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "the start of the index and/or pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the limit of the index and/or pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "100",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/reservation/search', {
  "resourcePath" => "/Reservation",
  "summary" => "Search Reservations",
  "nickname" => "search_reservations",
  "responseClass" => "Array<ReservationResponse>",
  "endpoint" => "/reservation/search",
  "notes" => "",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "Device Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Appilcation Key",
      "dataType" => "String",
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
      "name" => "filter_account_id",
      "description" => "filter reservations by account ID",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "reservable_id",
      "description" => "the reservation ID",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "reservable_type",
      "description" => "the type of reservation",
      "dataType" => "String",
      "allowableValues" => "[LOCATABLE, RESERVABLE, PERMISSIONABLE, NOTABLE, ASSETABLE, LIKABLE, FLAGABLE, FAVORITABLE, RATABLE, ALBUM, COLLECTION, APPLICATION, APPLICATION_SETTING, APPLICATION_CERT, APPLICATION_PLACEMENT, ACCOUNT, ACCOUNT_SETTING, GAME_LEVEL, PACK, MISSION, TOURNAMENT, ASSET, ALBUM_CONTEST, THEME_DESCRIPTOR, OFFER, OFFER_LOCATION, EVENT, RETAILER, RETAILER_LOCATION, NOTE, CREATIVE, FAVORITE, LIKE, RATING, ANALYTIC, THIRD_PARTY_CREDENTIAL, THIRD_PARTY_NETWORK, REGION]",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "the keyword to search the reservation on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "the start date of the reservation search",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "the end date of the reservation search",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "the start of the index and/or pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the limit of the index and/or pagination",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "100",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/reservable/schedule/search', {
  "resourcePath" => "/Reservation",
  "summary" => "Search Schedule",
  "nickname" => "search_schedule",
  "responseClass" => "Array<TimeSlotResponse>",
  "endpoint" => "/reservable/schedule/search",
  "notes" => "",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the id of the device that the reservation is on",
      "dataType" => "String",
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
      "name" => "reservable_id",
      "description" => "the id of the reservation",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "reservable_type",
      "description" => "the reservation type",
      "dataType" => "String",
      "allowableValues" => "[LOCATABLE, RESERVABLE, PERMISSIONABLE, NOTABLE, ASSETABLE, LIKABLE, FLAGABLE, FAVORITABLE, RATABLE, ALBUM, COLLECTION, APPLICATION, APPLICATION_SETTING, APPLICATION_CERT, APPLICATION_PLACEMENT, ACCOUNT, ACCOUNT_SETTING, GAME_LEVEL, PACK, MISSION, TOURNAMENT, ASSET, ALBUM_CONTEST, THEME_DESCRIPTOR, OFFER, OFFER_LOCATION, EVENT, RETAILER, RETAILER_LOCATION, NOTE, CREATIVE, FAVORITE, LIKE, RATING, ANALYTIC, THIRD_PARTY_CREDENTIAL, THIRD_PARTY_NETWORK, REGION]",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "the start date of the reservation",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "the end date of the reservation",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "time_bucket_mins",
      "description" => "the length of time in minutes to search on for reservation",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "30",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

