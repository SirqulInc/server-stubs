require 'json'


MyApp.add_route('POST', '/api/3.18/consumer/album/contest', {
  "resourcePath" => "/Contest",
  "summary" => "Create or Update Contest",
  "nickname" => "add_or_update_album_contest",
  "responseClass" => "AlbumContestResponse",
  "endpoint" => "/consumer/album/contest",
  "notes" => "Creates or updates a contest.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "a unique ID given by the device (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account ID of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "game_type",
      "description" => "This parameter is deprecated. the application key",
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
      "name" => "contest_type",
      "description" => "a custom field used for aggregation and searching",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "album_contest_id",
      "description" => "the album contest ID for updating (don&#39;t pass in if creating)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "title",
      "description" => "the title of the contest",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "the description of the contest",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "album_id1",
      "description" => "the album ID for the first album",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "remove_album1",
      "description" => "removes album1 from the contest",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "album_id2",
      "description" => "the album ID for the second album",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "remove_album2",
      "description" => "removes album2 from the contest",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "the start date of the contest (time-stamp in milliseconds)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "the end date of the contest (time-stamp in milliseconds)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "public_read",
      "description" => "determines whether the contest&#39;s participants has read permissions",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "public_write",
      "description" => "determines whether the contest&#39;s participants has write permissions",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "public_delete",
      "description" => "determines whether the contest&#39;s participants has delete permissions",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "public_add",
      "description" => "determines whether the contest&#39;s participants has add permissions",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "location_description",
      "description" => "the location description of the contest taking place",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "visibility",
      "description" => "the determines the album&#39;s participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)",
      "dataType" => "String",
      "allowableValues" => "[PUBLIC, PRIVATE, FRIENDS]",
      "paramType" => "query",
    },
    {
      "name" => "connection_ids_to_add",
      "description" => "comma separated list of connection IDs",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "connection_group_ids_to_add",
      "description" => "comma separated list of connection group IDs",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "include_friend_group",
      "description" => "determines whether to include all friends as participants",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "latitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "longitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/consumer/album/contest/approve', {
  "resourcePath" => "/Contest",
  "summary" => "Approve Contest",
  "nickname" => "approve_album_contest",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/consumer/album/contest/approve",
  "notes" => "Sets the approval status of a contest.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "A unique ID given by the device (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "The account ID of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "album_contest_id",
      "description" => "The ID of the album contest",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "approval_status",
      "description" => "The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}",
      "dataType" => "String",
      "allowableValues" => "[PENDING, REJECTED, APPROVED, FEATURED]",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/consumer/album/contest/remove', {
  "resourcePath" => "/Contest",
  "summary" => "Delete Contest",
  "nickname" => "delete_contest",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/consumer/album/contest/remove",
  "notes" => "Deletes a contest.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "a unique ID given by the device (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account ID of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "album_contest_id",
      "description" => "the album contest ID",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "latitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "longitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/consumer/album/contest/get', {
  "resourcePath" => "/Contest",
  "summary" => "Get Contest",
  "nickname" => "get_album_contest",
  "responseClass" => "AlbumContestResponse",
  "endpoint" => "/consumer/album/contest/get",
  "notes" => "Gets the contest object including the likes and notes",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "a unique ID given by the device (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account ID of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "album_contest_id",
      "description" => "the album contest ID",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "latitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "longitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/consumer/album/contest/search', {
  "resourcePath" => "/Contest",
  "summary" => "Search Contests",
  "nickname" => "get_album_contests",
  "responseClass" => "AlbumContestListResponse",
  "endpoint" => "/consumer/album/contest/search",
  "notes" => "Searches on contests.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "a unique ID given by the device (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account ID of the user (deviceId or accountId required)",
      "dataType" => "Integer",
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
      "description" => "the application key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_type",
      "description" => "the application type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "contest_type",
      "description" => "filter contests with this contest type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "owner_id",
      "description" => "search on contests that have been created by this account (that the user has permissions to)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "q",
      "description" => "This parameter is deprecated.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "keyword search string",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter",
      "description" => "a comma separated list of Ownership",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "the field to sort by. See AlbumContestApiMap",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "determines whether the sorted list is in descending or ascending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "_i",
      "description" => "This parameter is deprecated.",
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
      "name" => "_l",
      "description" => "This parameter is deprecated.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the limit for pagination (there is a hard limit of 30)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "date_created",
      "description" => "filter on items that have been created before this date",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "latitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "longitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/consumer/album/contest/vote', {
  "resourcePath" => "/Contest",
  "summary" => "Vote on Contest",
  "nickname" => "vote_on_album_contest",
  "responseClass" => "AlbumContestResponse",
  "endpoint" => "/consumer/album/contest/vote",
  "notes" => "Vote on a collection in a contest.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "a unique ID given by the device (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account ID of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "album_contest_id",
      "description" => "the album contest ID",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "album_id",
      "description" => "the ID of the album to vote on",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "contest_type",
      "description" => "a custom field used for aggregation and searching",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "latitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "longitude used to update the user&#39;s current location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

