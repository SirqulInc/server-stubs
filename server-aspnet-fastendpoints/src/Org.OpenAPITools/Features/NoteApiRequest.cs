
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class BatchOperationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The id of the notable object the batch operation will affect
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("notableId")]
    public long NotableId { get; set; }
    /// <summary>
    /// The notable object type (for example ALBUM, ASSET, OFFER, etc.)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("notableType")]
    public string NotableType { get; set; }
    /// <summary>
    /// The batch operation to perform (e.g., DELETE_ALL_NOTES_IN_NOTABLE). Optional.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("batchOperation")]
    public string? BatchOperation { get; set; }
}
public class CreateNoteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique device identifier that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The unique accountId that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The notable object type {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, OFFER, OFFER_LOCATION, RETAILER, RETAILER_LOCATION, THEME_DESCRIPTOR}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("notableType")]
    public string? NotableType { get; set; }
    /// <summary>
    /// The id of the notable object
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("notableId")]
    public long? NotableId { get; set; }
    /// <summary>
    /// The message the user wishes to leave a comment on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("comment")]
    public string Comment { get; set; }
    /// <summary>
    /// The custom string defined by the client (used for differentiating various note types)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("noteType")]
    public string? NoteType { get; set; }
    /// <summary>
    /// A comma separated list of asset IDs to add with the note
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetIds")]
    public string? AssetIds { get; set; }
    /// <summary>
    /// search tags
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// This is used for sending out group notifications. For example, when someone adds a note to an asset which is also a part of an album, everyone in the album will receive a notification. This is achieved by passing in the permissionable type (in this case \&quot;album\&quot;), and the permissionable id (the album id). Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("permissionableType")]
    public string? PermissionableType { get; set; }
    /// <summary>
    /// The id of the permissionable object (for sending group notifications)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("permissionableId")]
    public long? PermissionableId { get; set; }
    /// <summary>
    /// The application key used to identify the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The description of the location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationDescription")]
    public string? LocationDescription { get; set; }
    /// <summary>
    /// The current location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The current location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// External custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// Comma separated list of additional account IDs that will receive the note notifications
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("receiverAccountIds")]
    public string? ReceiverAccountIds { get; set; }
    /// <summary>
    /// whether to return the full response or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnFullResponse")]
    public bool? ReturnFullResponse { get; set; }
    /// <summary>
    /// Check true if need to initialize an asset and assign to current note
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("initializeAsset")]
    public bool? InitializeAsset { get; set; }
    /// <summary>
    /// Return null fields for asset response when creating an asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetReturnNulls")]
    public bool? AssetReturnNulls { get; set; }
    /// <summary>
    /// the album the asset will be added to (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetAlbumId")]
    public long? AssetAlbumId { get; set; }
    /// <summary>
    /// the collection ID that the asset is associated with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetCollectionId")]
    public long? AssetCollectionId { get; set; }
    /// <summary>
    /// the default album to add the asset to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetAddToDefaultAlbum")]
    public string? AssetAddToDefaultAlbum { get; set; }
    /// <summary>
    /// the media library to add the asset to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetAddToMediaLibrary")]
    public bool? AssetAddToMediaLibrary { get; set; }
    /// <summary>
    /// the version code of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetVersionCode")]
    public int? AssetVersionCode { get; set; }
    /// <summary>
    /// the version name of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetVersionName")]
    public string? AssetVersionName { get; set; }
    /// <summary>
    /// the meta data of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetMetaData")]
    public string? AssetMetaData { get; set; }
    /// <summary>
    /// the caption of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetCaption")]
    public string? AssetCaption { get; set; }
    /// <summary>
    /// the media of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetMedia")]
    public System.IO.Stream? AssetMedia { get; set; }
    /// <summary>
    /// the media URL of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetMediaUrl")]
    public string? AssetMediaUrl { get; set; }
    /// <summary>
    /// the media string of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetMediaString")]
    public string? AssetMediaString { get; set; }
    /// <summary>
    /// the media string file name of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetMediaStringFileName")]
    public string? AssetMediaStringFileName { get; set; }
    /// <summary>
    /// the media string content type of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetMediaStringContentType")]
    public string? AssetMediaStringContentType { get; set; }
    /// <summary>
    /// the attached media of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetAttachedMedia")]
    public System.IO.Stream? AssetAttachedMedia { get; set; }
    /// <summary>
    /// the attached media URL of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetAttachedMediaUrl")]
    public string? AssetAttachedMediaUrl { get; set; }
    /// <summary>
    /// the attached media string of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetAttachedMediaString")]
    public string? AssetAttachedMediaString { get; set; }
    /// <summary>
    /// the attached media string file name of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetAttachedMediaStringFileName")]
    public string? AssetAttachedMediaStringFileName { get; set; }
    /// <summary>
    /// the attached media string content type of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetAttachedMediaStringContentType")]
    public string? AssetAttachedMediaStringContentType { get; set; }
    /// <summary>
    /// the location description for the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetLocationDescription")]
    public string? AssetLocationDescription { get; set; }
    /// <summary>
    /// the application for the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetApp")]
    public string? AssetApp { get; set; }
    /// <summary>
    /// the search tags used for the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetSearchTags")]
    public string? AssetSearchTags { get; set; }
    /// <summary>
    /// the latitude of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetLatitude")]
    public double? AssetLatitude { get; set; }
    /// <summary>
    /// the longitude of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetLongitude")]
    public decimal? AssetLongitude { get; set; }
}
public class DeleteNoteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique device identifier that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The unique accountId that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The ID of the note to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("noteId")]
    public long NoteId { get; set; }
    /// <summary>
    /// The current location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The current location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// The application key used to identify the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
}
public class GetNoteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique device identifier that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The unique accountId that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// Determines whether to return the NoteFullResponse for the item
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnFullResponse")]
    public bool? ReturnFullResponse { get; set; }
    /// <summary>
    /// the id of the note to get
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("noteId")]
    public long NoteId { get; set; }
}
public class SearchNotesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The notable object type {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, OFFER, OFFER_LOCATION, RETAILER, RETAILER_LOCATION, THEME_DESCRIPTOR}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("notableType")]
    public string? NotableType { get; set; }
    /// <summary>
    /// The id of the notable object
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("notableId")]
    public long? NotableId { get; set; }
    /// <summary>
    /// Comma separated list of noteType strings to filter results with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("noteTypes")]
    public string? NoteTypes { get; set; }
    /// <summary>
    /// The application key used to identify the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The keyword used to search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// return items that has flagCount &gt;&#x3D; flagCountMinimum if this is set, return all items, even ones with flagCount &gt;&#x3D; flagThreshold
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("flagCountMinimum")]
    public long? FlagCountMinimum { get; set; }
    /// <summary>
    /// return items that has flagCount &gt;&#x3D; flagThreshold, which are hidden by default
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("flagsExceedThreshold")]
    public bool? FlagsExceedThreshold { get; set; }
    /// <summary>
    /// include inactive in the result
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeInactive")]
    public bool? IncludeInactive { get; set; }
    /// <summary>
    /// The column to sort the search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// The order to return the search results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// Determines whether to return the NoteFullResponse for each search item
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnFullResponse")]
    public bool? ReturnFullResponse { get; set; }
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
    /// The record to begin the return set on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// The number of records to return
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class UpdateNoteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique device identifier that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The unique accountId that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The id of the note, used when editing a comment
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("noteId")]
    public long NoteId { get; set; }
    /// <summary>
    /// The message the user wishes to leave a comment on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("comment")]
    public string? Comment { get; set; }
    /// <summary>
    /// The custom string defined by the client (used for differentiating on various note types)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("noteType")]
    public string? NoteType { get; set; }
    /// <summary>
    /// A comma separated list of asset IDs to add with the note
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetIds")]
    public string? AssetIds { get; set; }
    /// <summary>
    /// search tags
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// This is used for sending out group notifications. For example, when someone adds a note to an asset which is also a part of an album, everyone in the album will receive a notification. This is achieved by passing in the permissionable type (in this case \&quot;album\&quot;), and the permissionable id (the album id). Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("permissionableType")]
    public string? PermissionableType { get; set; }
    /// <summary>
    /// The id of the permissionable object (for sending group notifications)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("permissionableId")]
    public long? PermissionableId { get; set; }
    /// <summary>
    /// The application key used to identify the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The description of the location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationDescription")]
    public string? LocationDescription { get; set; }
    /// <summary>
    /// The current location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The current location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// meta data to update with the note
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// whether to return the full response or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnFullResponse")]
    public bool? ReturnFullResponse { get; set; }
    /// <summary>
    /// Sets the active flag for the note
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// main flag for updating asset in note, must set to true if you want to update the note&#39;s asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("updateAsset")]
    public bool? UpdateAsset { get; set; }
    /// <summary>
    /// Return null fields for asset response when updating an asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetReturnNulls")]
    public bool? AssetReturnNulls { get; set; }
    /// <summary>
    /// the album the asset will be added to (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetAlbumId")]
    public long? AssetAlbumId { get; set; }
    /// <summary>
    /// the collection ID that the asset is associated with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetCollectionId")]
    public long? AssetCollectionId { get; set; }
    /// <summary>
    /// the default album to add the asset to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetAddToDefaultAlbum")]
    public string? AssetAddToDefaultAlbum { get; set; }
    /// <summary>
    /// the media library to add the asset to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetAddToMediaLibrary")]
    public bool? AssetAddToMediaLibrary { get; set; }
    /// <summary>
    /// the version code of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetVersionCode")]
    public int? AssetVersionCode { get; set; }
    /// <summary>
    /// the version name of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetVersionName")]
    public string? AssetVersionName { get; set; }
    /// <summary>
    /// the meta data of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetMetaData")]
    public string? AssetMetaData { get; set; }
    /// <summary>
    /// the caption of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetCaption")]
    public string? AssetCaption { get; set; }
    /// <summary>
    /// the media of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetMedia")]
    public System.IO.Stream? AssetMedia { get; set; }
    /// <summary>
    /// the media URL of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetMediaUrl")]
    public string? AssetMediaUrl { get; set; }
    /// <summary>
    /// the media string of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetMediaString")]
    public string? AssetMediaString { get; set; }
    /// <summary>
    /// the media string file name of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetMediaStringFileName")]
    public string? AssetMediaStringFileName { get; set; }
    /// <summary>
    /// the media string content type of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetMediaStringContentType")]
    public string? AssetMediaStringContentType { get; set; }
    /// <summary>
    /// the attached media of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetAttachedMedia")]
    public System.IO.Stream? AssetAttachedMedia { get; set; }
    /// <summary>
    /// the attached media URL of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetAttachedMediaUrl")]
    public string? AssetAttachedMediaUrl { get; set; }
    /// <summary>
    /// the attached media string of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetAttachedMediaString")]
    public string? AssetAttachedMediaString { get; set; }
    /// <summary>
    /// the attached media string file name of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetAttachedMediaStringFileName")]
    public string? AssetAttachedMediaStringFileName { get; set; }
    /// <summary>
    /// the attached media string content type of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetAttachedMediaStringContentType")]
    public string? AssetAttachedMediaStringContentType { get; set; }
    /// <summary>
    /// the location description for the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetLocationDescription")]
    public string? AssetLocationDescription { get; set; }
    /// <summary>
    /// the application for the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetApp")]
    public string? AssetApp { get; set; }
    /// <summary>
    /// the search tags used for the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetSearchTags")]
    public string? AssetSearchTags { get; set; }
    /// <summary>
    /// the latitude of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetLatitude")]
    public double? AssetLatitude { get; set; }
    /// <summary>
    /// the longitude of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetLongitude")]
    public double? AssetLongitude { get; set; }
}


