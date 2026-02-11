require 'json'


MyApp.add_route('GET', '/api/3.18/asset/download/{filename}', {
  "resourcePath" => "/Asset",
  "summary" => "Download Asset",
  "nickname" => "asset_download",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/asset/download/{filename}",
  "notes" => "Downloads an asset from the server for assets that have been uploaded to the server.",
  "parameters" => [
    {
      "name" => "filename",
      "description" => "the filename in the following formats: {assetId}-{suffix}.{extension} | {assetId}.{extension} | {assetId}",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/asset/morph', {
  "resourcePath" => "/Asset",
  "summary" => "Convert Offer to Creative",
  "nickname" => "asset_morph",
  "responseClass" => "AssetShortResponse",
  "endpoint" => "/asset/morph",
  "notes" => "Converts an offer image + text into a creative image.",
  "parameters" => [
    {
      "name" => "offer_id",
      "description" => "offer id used for inserting offer text/flavor",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "creative_id",
      "description" => "used for inserting the newly created image into",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ad_size",
      "description" => "the ad size used for selecting a format for the creative image",
      "dataType" => "String",
      "allowableValues" => "[CONFIG, BANNER, LEADERBOARD, SKYSCRAPER, VIDEO, ZIP, INTERSTITIAL, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, CUSTOM6, CUSTOM7, CUSTOM8, CUSTOM9, CUSTOM10]",
      "paramType" => "query",
    },
    {
      "name" => "width",
      "description" => "total width of the creative image",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "height",
      "description" => "total height of the creative image",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "background_size",
      "description" => "the size of the background",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "template",
      "description" => "the template to use",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/asset/create', {
  "resourcePath" => "/Asset",
  "summary" => "Create Asset",
  "nickname" => "create_asset",
  "responseClass" => "AssetResponse",
  "endpoint" => "/asset/create",
  "notes" => "Uploads an asset to server and returns an asset id which can be used to assign to various objects.",
  "parameters" => [
    {
      "name" => "return_nulls",
      "description" => "to return nulls",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
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
      "name" => "album_id",
      "description" => "the album the asset will be added to (optional)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "collection_id",
      "description" => "Deprecated: use collections via the collection endpoints.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "add_to_default_album",
      "description" => "Whether to add to a default album",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "add_to_media_library",
      "description" => "Whether to add to the media library",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version_code",
      "description" => "the version code",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version_name",
      "description" => "the version name",
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
      "name" => "caption",
      "description" => "the caption (optional)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_type",
      "description" => "the asset type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "approval_status",
      "description" => "approval status for the asset",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assigned_account_id",
      "description" => "account id assigned to the asset",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "media",
      "description" => "a MultipartFile containing the mimetype, etc",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "media_url",
      "description" => "this can be used if the \&quot;media\&quot; is a link (optional)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "media_string",
      "description" => "the media content as a string (optional)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "media_string_file_name",
      "description" => "file name for mediaString (optional)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "media_string_content_type",
      "description" => "content type for mediaString (optional)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "media_height",
      "description" => "the media height (optional)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "media_width",
      "description" => "the media width (optional)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "attached_media",
      "description" => "a MultipartFile containing an asset that the \&quot;media\&quot; file references (optional). Example: to upload a video the \&quot;media\&quot; file should contain a screen capture and the \&quot;attachedMedia\&quot; should be the actual video.",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "attached_media_url",
      "description" => "this can be used if the \&quot;attachedMedia\&quot; is a link (i.e. a Youtube video, etc) (optional)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "attached_media_string",
      "description" => "attached media content as a string (optional)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "attached_media_string_file_name",
      "description" => "file name for attachedMediaString (optional)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "attached_media_string_content_type",
      "description" => "content type for attachedMediaString (optional)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "attached_media_height",
      "description" => "the attached media height (optional)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "attached_media_width",
      "description" => "the attached media width (optional)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "location_description",
      "description" => "the location description (optional)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app",
      "description" => "Deprecated: app parameter",
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
      "name" => "search_tags",
      "description" => "the search tags",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "latitude",
      "description" => "the latitude (optional)",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "the longitude (optional)",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/asset/delete', {
  "resourcePath" => "/Asset",
  "summary" => "Delete Asset",
  "nickname" => "delete_asset",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/asset/delete",
  "notes" => "Delete an asset.",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the device id (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_id",
      "description" => "the id of the asset to delete",
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


MyApp.add_route('GET', '/api/3.18/asset/get', {
  "resourcePath" => "/Asset",
  "summary" => "Get Asset",
  "nickname" => "get_asset",
  "responseClass" => "AssetFullResponse",
  "endpoint" => "/asset/get",
  "notes" => "Gets the full asset response including attached likes and notes.",
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
      "name" => "asset_id",
      "description" => "the asset ID",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "note_descending",
      "description" => "determines whether the notes on the asset are in descending order",
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


MyApp.add_route('POST', '/api/3.18/asset/remove', {
  "resourcePath" => "/Asset",
  "summary" => "Remove Asset from Collection",
  "nickname" => "remove_asset",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/asset/remove",
  "notes" => "Remove assets from collections",
  "parameters" => [
    {
      "name" => "device_id",
      "description" => "the device id (deviceId or accountId required)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_id",
      "description" => "the account id of the user (deviceId or accountId required)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "album_id",
      "description" => "the album id to remove the asset from",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "collection_id",
      "description" => "the collection id to remove the asset from",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_id",
      "description" => "the id of the asset to remove",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "remove_from_default_albums",
      "description" => "remove from the user&#39;s profile album",
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


MyApp.add_route('GET', '/api/3.18/asset/search', {
  "resourcePath" => "/Asset",
  "summary" => "Search Assets",
  "nickname" => "search_assets",
  "responseClass" => "Array<AssetResponse>",
  "endpoint" => "/asset/search",
  "notes" => "Searches for assets",
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
      "name" => "album_ids",
      "description" => "comma separated list of album ids to search on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_ids",
      "description" => "comma separated list of asset ids to search on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "the application key to filter results by application.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "media_type",
      "description" => "filter results by media type. Possible values include: APPLICATION, IMAGE, AUDIO, VIDEO, MULTIPART, TEXT",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "mime_type",
      "description" => "filter results by mime type",
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
      "name" => "version_code",
      "description" => "filter results by version code",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version_name",
      "description" => "filter results by version name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "updated_since",
      "description" => "return items that have been updated since this date (time-stamp in milliseconds)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "updated_before",
      "description" => "return items that have been updated before this date (time-stamp in milliseconds)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "the field to sort by. See AssetApiMap",
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
      "name" => "search_media_library",
      "description" => "determines whether to search on the media library album",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_by_billable",
      "description" => "filter results by billable entity",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active_only",
      "description" => "if only searching for active assets",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_app",
      "description" => "determines whether to include the application response as part of the asset response",
      "dataType" => "Boolean",
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
      "description" => "the limit for pagination (there is a hard limit of 200)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "search_mode",
      "description" => "search mode for index (SearchIndexMode)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_type",
      "description" => "filter by asset type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "approval_status",
      "description" => "filter by approval status",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assigned_account_id",
      "description" => "filter results by an assigned account id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/asset/update', {
  "resourcePath" => "/Asset",
  "summary" => "Update Asset",
  "nickname" => "update_asset",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/asset/update",
  "notes" => "Updates an asset's meta data. If an album reference is passed in, the participants with write permissions are allowed to edit the asset. Otherwise, only the asset up-loader has permission to edit the data.",
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
      "name" => "asset_id",
      "description" => "the ID of the asset to update",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "album_id",
      "description" => "the ID of the album to check user permissions",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "attached_asset_id",
      "description" => "the ID of the attached asset",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version_code",
      "description" => "the version code",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version_name",
      "description" => "the version name",
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
      "name" => "caption",
      "description" => "the caption",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_type",
      "description" => "the asset type",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "approval_status",
      "description" => "approval status for the asset",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assigned_account_id",
      "description" => "account id assigned to the asset",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "media",
      "description" => "a MultipartFile containing the mimetype, etc",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "media_url",
      "description" => "this can be used if the \&quot;media\&quot; is a link (optional)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "media_string",
      "description" => "the media content as a string (optional)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "media_string_file_name",
      "description" => "file name for mediaString (optional)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "media_string_content_type",
      "description" => "content type for mediaString (optional)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "media_height",
      "description" => "the media height (optional)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "media_width",
      "description" => "the media width (optional)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "attached_media",
      "description" => "a MultipartFile containing an asset that the \&quot;media\&quot; file references (optional). Example: to upload a video the \&quot;media\&quot; file should contain a screen capture and the \&quot;attachedMedia\&quot; should be the actual video.",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "attached_media_url",
      "description" => "this can be used if the \&quot;attachedMedia\&quot; is a link (i.e. a Youtube video, etc) (optional)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "attached_media_string",
      "description" => "attached media content as a string (optional)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "attached_media_string_file_name",
      "description" => "file name for attachedMediaString (optional)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "attached_media_string_content_type",
      "description" => "content type for attachedMediaString (optional)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "attached_media_height",
      "description" => "the attached media height (optional)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "attached_media_width",
      "description" => "the attached media width (optional)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "location_description",
      "description" => "the location description",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "search_tags",
      "description" => "search tags",
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
      "name" => "latitude",
      "description" => "latitude used to update the asset&#39;s location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "longitude",
      "description" => "longitude used to update the asset&#39;s location",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

