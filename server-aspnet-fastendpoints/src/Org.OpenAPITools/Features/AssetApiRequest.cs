
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AssetDownloadRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the filename in the following formats: {assetId}-{suffix}.{extension} | {assetId}.{extension} | {assetId}
    /// </summary>
    [FastEndpoints.BindFrom("filename")]
    public string Filename { get; set; }
}
public class AssetMorphRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// offer id used for inserting offer text/flavor
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerId")]
    public long OfferId { get; set; }
    /// <summary>
    /// used for inserting the newly created image into
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("creativeId")]
    public long? CreativeId { get; set; }
    /// <summary>
    /// the ad size used for selecting a format for the creative image
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("adSize")]
    public string AdSize { get; set; }
    /// <summary>
    /// total width of the creative image
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("width")]
    public int? Width { get; set; }
    /// <summary>
    /// total height of the creative image
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("height")]
    public int? Height { get; set; }
    /// <summary>
    /// the size of the background
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("backgroundSize")]
    public string? BackgroundSize { get; set; }
    /// <summary>
    /// the template to use
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("template")]
    public string? Template { get; set; }
}
public class CreateAssetRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// to return nulls
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnNulls")]
    public bool? ReturnNulls { get; set; }
    /// <summary>
    /// a unique ID given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account ID of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the album the asset will be added to (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumId")]
    public long? AlbumId { get; set; }
    /// <summary>
    /// Deprecated: use collections via the collection endpoints.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("collectionId")]
    public long? CollectionId { get; set; }
    /// <summary>
    /// Whether to add to a default album
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("addToDefaultAlbum")]
    public string? AddToDefaultAlbum { get; set; }
    /// <summary>
    /// Whether to add to the media library
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("addToMediaLibrary")]
    public bool? AddToMediaLibrary { get; set; }
    /// <summary>
    /// the version code
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("versionCode")]
    public int? VersionCode { get; set; }
    /// <summary>
    /// the version name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("versionName")]
    public string? VersionName { get; set; }
    /// <summary>
    /// External custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// the caption (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("caption")]
    public string? Caption { get; set; }
    /// <summary>
    /// the asset type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetType")]
    public string? AssetType { get; set; }
    /// <summary>
    /// approval status for the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("approvalStatus")]
    public string? ApprovalStatus { get; set; }
    /// <summary>
    /// account id assigned to the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assignedAccountId")]
    public long? AssignedAccountId { get; set; }
    /// <summary>
    /// a MultipartFile containing the mimetype, etc
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("media")]
    public System.IO.Stream? Media { get; set; }
    /// <summary>
    /// this can be used if the \&quot;media\&quot; is a link (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaUrl")]
    public string? MediaUrl { get; set; }
    /// <summary>
    /// the media content as a string (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaString")]
    public string? MediaString { get; set; }
    /// <summary>
    /// file name for mediaString (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaStringFileName")]
    public string? MediaStringFileName { get; set; }
    /// <summary>
    /// content type for mediaString (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaStringContentType")]
    public string? MediaStringContentType { get; set; }
    /// <summary>
    /// the media height (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaHeight")]
    public int? MediaHeight { get; set; }
    /// <summary>
    /// the media width (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaWidth")]
    public int? MediaWidth { get; set; }
    /// <summary>
    /// a MultipartFile containing an asset that the \&quot;media\&quot; file references (optional). Example: to upload a video the \&quot;media\&quot; file should contain a screen capture and the \&quot;attachedMedia\&quot; should be the actual video.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("attachedMedia")]
    public System.IO.Stream? AttachedMedia { get; set; }
    /// <summary>
    /// this can be used if the \&quot;attachedMedia\&quot; is a link (i.e. a Youtube video, etc) (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("attachedMediaUrl")]
    public string? AttachedMediaUrl { get; set; }
    /// <summary>
    /// attached media content as a string (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("attachedMediaString")]
    public string? AttachedMediaString { get; set; }
    /// <summary>
    /// file name for attachedMediaString (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("attachedMediaStringFileName")]
    public string? AttachedMediaStringFileName { get; set; }
    /// <summary>
    /// content type for attachedMediaString (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("attachedMediaStringContentType")]
    public string? AttachedMediaStringContentType { get; set; }
    /// <summary>
    /// the attached media height (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("attachedMediaHeight")]
    public int? AttachedMediaHeight { get; set; }
    /// <summary>
    /// the attached media width (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("attachedMediaWidth")]
    public int? AttachedMediaWidth { get; set; }
    /// <summary>
    /// the location description (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationDescription")]
    public string? LocationDescription { get; set; }
    /// <summary>
    /// Deprecated: app parameter
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("app")]
    public string? App { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// the search tags
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchTags")]
    public string? SearchTags { get; set; }
    /// <summary>
    /// the latitude (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the longitude (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class DeleteAssetRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the id of the asset to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetId")]
    public string AssetId { get; set; }
    /// <summary>
    /// latitude used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// longitude used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class GetAssetRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// a unique ID given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account ID of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the asset ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetId")]
    public long AssetId { get; set; }
    /// <summary>
    /// determines whether the notes on the asset are in descending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("noteDescending")]
    public bool? NoteDescending { get; set; }
}
public class RemoveAssetRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the album id to remove the asset from
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumId")]
    public long? AlbumId { get; set; }
    /// <summary>
    /// the collection id to remove the asset from
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("collectionId")]
    public long? CollectionId { get; set; }
    /// <summary>
    /// the id of the asset to remove
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetId")]
    public string AssetId { get; set; }
    /// <summary>
    /// remove from the user&#39;s profile album
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("removeFromDefaultAlbums")]
    public bool? RemoveFromDefaultAlbums { get; set; }
    /// <summary>
    /// latitude used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// longitude used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class SearchAssetsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// a unique ID given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account ID of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// comma separated list of album ids to search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumIds")]
    public string? AlbumIds { get; set; }
    /// <summary>
    /// comma separated list of asset ids to search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetIds")]
    public string? AssetIds { get; set; }
    /// <summary>
    /// the application key to filter results by application.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// filter results by media type. Possible values include: APPLICATION, IMAGE, AUDIO, VIDEO, MULTIPART, TEXT
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaType")]
    public string? MediaType { get; set; }
    /// <summary>
    /// filter results by mime type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mimeType")]
    public string? MimeType { get; set; }
    /// <summary>
    /// keyword search string
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// filter results by version code
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("versionCode")]
    public int? VersionCode { get; set; }
    /// <summary>
    /// filter results by version name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("versionName")]
    public string? VersionName { get; set; }
    /// <summary>
    /// return items that have been updated since this date (time-stamp in milliseconds)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("updatedSince")]
    public long? UpdatedSince { get; set; }
    /// <summary>
    /// return items that have been updated before this date (time-stamp in milliseconds)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("updatedBefore")]
    public long? UpdatedBefore { get; set; }
    /// <summary>
    /// the field to sort by. See AssetApiMap
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// determines whether to search on the media library album
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchMediaLibrary")]
    public bool? SearchMediaLibrary { get; set; }
    /// <summary>
    /// filter results by billable entity
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterByBillable")]
    public bool? FilterByBillable { get; set; }
    /// <summary>
    /// if only searching for active assets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool? ActiveOnly { get; set; }
    /// <summary>
    /// determines whether to include the application response as part of the asset response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnApp")]
    public bool? ReturnApp { get; set; }
    /// <summary>
    /// the start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// the limit for pagination (there is a hard limit of 200)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// search mode for index (SearchIndexMode)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchMode")]
    public string? SearchMode { get; set; }
    /// <summary>
    /// filter by asset type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetType")]
    public string? AssetType { get; set; }
    /// <summary>
    /// filter by approval status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("approvalStatus")]
    public string? ApprovalStatus { get; set; }
    /// <summary>
    /// filter results by an assigned account id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assignedAccountId")]
    public long? AssignedAccountId { get; set; }
}
public class UpdateAssetRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// a unique ID given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account ID of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the ID of the asset to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetId")]
    public long AssetId { get; set; }
    /// <summary>
    /// the ID of the album to check user permissions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumId")]
    public long? AlbumId { get; set; }
    /// <summary>
    /// the ID of the attached asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("attachedAssetId")]
    public long? AttachedAssetId { get; set; }
    /// <summary>
    /// the version code
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("versionCode")]
    public int? VersionCode { get; set; }
    /// <summary>
    /// the version name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("versionName")]
    public string? VersionName { get; set; }
    /// <summary>
    /// External custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// the caption
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("caption")]
    public string? Caption { get; set; }
    /// <summary>
    /// the asset type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetType")]
    public string? AssetType { get; set; }
    /// <summary>
    /// approval status for the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("approvalStatus")]
    public string? ApprovalStatus { get; set; }
    /// <summary>
    /// account id assigned to the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assignedAccountId")]
    public long? AssignedAccountId { get; set; }
    /// <summary>
    /// a MultipartFile containing the mimetype, etc
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("media")]
    public System.IO.Stream? Media { get; set; }
    /// <summary>
    /// this can be used if the \&quot;media\&quot; is a link (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaUrl")]
    public string? MediaUrl { get; set; }
    /// <summary>
    /// the media content as a string (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaString")]
    public string? MediaString { get; set; }
    /// <summary>
    /// file name for mediaString (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaStringFileName")]
    public string? MediaStringFileName { get; set; }
    /// <summary>
    /// content type for mediaString (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaStringContentType")]
    public string? MediaStringContentType { get; set; }
    /// <summary>
    /// the media height (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaHeight")]
    public int? MediaHeight { get; set; }
    /// <summary>
    /// the media width (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaWidth")]
    public int? MediaWidth { get; set; }
    /// <summary>
    /// a MultipartFile containing an asset that the \&quot;media\&quot; file references (optional). Example: to upload a video the \&quot;media\&quot; file should contain a screen capture and the \&quot;attachedMedia\&quot; should be the actual video.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("attachedMedia")]
    public System.IO.Stream? AttachedMedia { get; set; }
    /// <summary>
    /// this can be used if the \&quot;attachedMedia\&quot; is a link (i.e. a Youtube video, etc) (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("attachedMediaUrl")]
    public string? AttachedMediaUrl { get; set; }
    /// <summary>
    /// attached media content as a string (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("attachedMediaString")]
    public string? AttachedMediaString { get; set; }
    /// <summary>
    /// file name for attachedMediaString (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("attachedMediaStringFileName")]
    public string? AttachedMediaStringFileName { get; set; }
    /// <summary>
    /// content type for attachedMediaString (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("attachedMediaStringContentType")]
    public string? AttachedMediaStringContentType { get; set; }
    /// <summary>
    /// the attached media height (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("attachedMediaHeight")]
    public int? AttachedMediaHeight { get; set; }
    /// <summary>
    /// the attached media width (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("attachedMediaWidth")]
    public int? AttachedMediaWidth { get; set; }
    /// <summary>
    /// the location description
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationDescription")]
    public string? LocationDescription { get; set; }
    /// <summary>
    /// search tags
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchTags")]
    public string? SearchTags { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// latitude used to update the asset&#39;s location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// longitude used to update the asset&#39;s location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}


