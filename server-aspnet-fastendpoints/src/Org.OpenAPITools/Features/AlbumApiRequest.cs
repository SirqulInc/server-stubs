
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AddAlbumCollectionRequest
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
    /// the title of the album
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string Title { get; set; }
    /// <summary>
    /// Comma separated list of asset IDs to add to the album&#39;s asset list (use \&quot;assetId\&quot; for setting the cover of the album)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetsToAdd")]
    public string? AssetsToAdd { get; set; }
    /// <summary>
    /// a MultipartFile containing the cover image of the album (this will only be used if \&quot;assetId\&quot; is empty)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("media")]
    public System.IO.Stream? Media { get; set; }
    /// <summary>
    /// this can be used if the \&quot;media\&quot; is a link (this will only be used if \&quot;assetId\&quot; and media are empty)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaURL")]
    public string? MediaURL { get; set; }
    /// <summary>
    /// The asset ID to set the album cover image
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetId")]
    public long? AssetId { get; set; }
    /// <summary>
    /// a MultipartFile containing an asset that the \&quot;media\&quot; file references. Example to upload a video: the \&quot;media\&quot; file should contain a screen capture of the video, and the \&quot;attachedMedia\&quot; should be the actual video.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("attachedMedia")]
    public System.IO.Stream? AttachedMedia { get; set; }
    /// <summary>
    /// this can be used if the \&quot;attachedMedia\&quot; is a link (i.e. a Youtube video, etc)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("attachedMediaURL")]
    public string? AttachedMediaURL { get; set; }
    /// <summary>
    /// determines whether the cover image of the album can be empty, else will use the user&#39;s profile picture as the cover image
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("coverAssetNullable")]
    public bool CoverAssetNullable { get; set; }
    /// <summary>
    /// determines whether the cover image should be added to the album asset list
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeCoverInAssetList")]
    public bool IncludeCoverInAssetList { get; set; }
    /// <summary>
    /// the start date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// the end date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// the tags
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// the description of the album
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// a custom field used for aggregation and searching
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumType")]
    public string? AlbumType { get; set; }
    /// <summary>
    /// a custom indexed number used for aggregation and searching
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumTypeId")]
    public long? AlbumTypeId { get; set; }
    /// <summary>
    /// a custom string field used for aggregation and searching
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("subType")]
    public string? SubType { get; set; }
    /// <summary>
    /// determines whether the album&#39;s participants has read permissions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicRead")]
    public bool PublicRead { get; set; }
    /// <summary>
    /// determines whether the album&#39;s participants has write permissions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicWrite")]
    public bool PublicWrite { get; set; }
    /// <summary>
    /// determines whether the album&#39;s participants has delete permissions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicDelete")]
    public bool PublicDelete { get; set; }
    /// <summary>
    /// determines whether the album&#39;s participants has add permissions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicAdd")]
    public bool PublicAdd { get; set; }
    /// <summary>
    /// latitude used to update the album&#39;s location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// longitude used to update the album&#39;s location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// the location description
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationDescription")]
    public string? LocationDescription { get; set; }
    /// <summary>
    /// the determines the album&#39;s participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string? Visibility { get; set; }
    /// <summary>
    /// @deprecated, use the appKey
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// the cell phone number
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cellPhone")]
    public string? CellPhone { get; set; }
    /// <summary>
    /// The street address of the location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streetAddress")]
    public string? StreetAddress { get; set; }
    /// <summary>
    /// Additional address information (such as a suite number, floor number, building name, or PO Box)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streetAddress2")]
    public string? StreetAddress2 { get; set; }
    /// <summary>
    /// The city of the location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("city")]
    public string? City { get; set; }
    /// <summary>
    /// The state of of the location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("state")]
    public string? State { get; set; }
    /// <summary>
    /// The postal code of the location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("postalCode")]
    public string? PostalCode { get; set; }
    /// <summary>
    /// The full address of the location which should include the street address, city, state, and postal code
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("fullAddress")]
    public string? FullAddress { get; set; }
    /// <summary>
    /// determines whether the album is posted anonymously
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("anonymous")]
    public bool Anonymous { get; set; }
    /// <summary>
    /// External custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// comma separated category ids string associated with the Album
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// comma separated filter ids string associated with the Album
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryFilterIds")]
    public string? CategoryFilterIds { get; set; }
    /// <summary>
    /// comma separated audience ids string associated with the album
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIds")]
    public string? AudienceIds { get; set; }
    /// <summary>
    /// determines whether to include all app users as members (only admins of the app can do this)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeAllAppUsersAsMembers")]
    public bool? IncludeAllAppUsersAsMembers { get; set; }
    /// <summary>
    /// determines whether to include all users of the audiences as members (only admins of the app can do this)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeAudiencesAsMembers")]
    public bool? IncludeAudiencesAsMembers { get; set; }
    /// <summary>
    /// determines whether to use ands or ors when using the audience list to add users
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceOperator")]
    public string? AudienceOperator { get; set; }
    /// <summary>
    /// The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("approvalStatus")]
    public string? ApprovalStatus { get; set; }
    /// <summary>
    /// sets a linked object so that it can be returned as part of the album response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("linkedObjectType")]
    public string? LinkedObjectType { get; set; }
    /// <summary>
    /// sets a linked object id so that it can be returned as part of the album response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("linkedObjectId")]
    public long? LinkedObjectId { get; set; }
}
public class AddAlbumUsersRequest
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
    /// the album ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumId")]
    public long AlbumId { get; set; }
    /// <summary>
    /// determines whether the users being added have read permissions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("read")]
    public bool? Read { get; set; }
    /// <summary>
    /// determines whether the users being added have write permissions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("write")]
    public bool? Write { get; set; }
    /// <summary>
    /// determines whether the users being added have delete permissions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("delete")]
    public bool? Delete { get; set; }
    /// <summary>
    /// determines whether the users being added have add permissions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("add")]
    public bool? Add { get; set; }
    /// <summary>
    /// comma separated list of connection IDs
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connections")]
    public string? Connections { get; set; }
    /// <summary>
    /// comma separated list of connection group IDs
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionGroups")]
    public string? ConnectionGroups { get; set; }
    /// <summary>
    /// determines whether to include all friends as participants
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeFriendGroup")]
    public bool IncludeFriendGroup { get; set; }
}
public class ApproveAlbumRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// A unique ID given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account ID of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The ID of the album
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumId")]
    public long AlbumId { get; set; }
    /// <summary>
    /// The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("approvalStatus")]
    public string? ApprovalStatus { get; set; }
    /// <summary>
    /// Sets whether the album should be marked as \&quot;verified\&quot;
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("verified")]
    public bool? Verified { get; set; }
}
public class GetAlbumCollectionRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnNulls")]
    public bool ReturnNulls { get; set; }
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
    /// the album to look up
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumId")]
    public long AlbumId { get; set; }
    /// <summary>
    /// returns the last X likes. To search on and paginate the remaining likes - please use the \&quot;/like/search\&quot;Â endpoint.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("likePreviewSize")]
    public int? LikePreviewSize { get; set; }
    /// <summary>
    /// returns the first X assets. To search on and paginate the remaining assets - please use the \&quot;/assets/search\&quot;Â endpoint.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetPreviewSize")]
    public int? AssetPreviewSize { get; set; }
    /// <summary>
    /// returns the last X notes. To search on and paginate the remaining notes - please use the \&quot;/note/search\&quot; endpoint.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("notePreviewSize")]
    public int? NotePreviewSize { get; set; }
    /// <summary>
    /// returns the first X users/connections. To search on and paginate the remaining connections - please use the \&quot;/permissions/search\&quot; endpoint.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionPreviewSize")]
    public int? ConnectionPreviewSize { get; set; }
    /// <summary>
    /// returns the first X audiences. To search on and paginate the remaining audiences - please use the \&quot;/audience/search\&quot; endpoint.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audiencePreviewSize")]
    public int? AudiencePreviewSize { get; set; }
}
public class LeaveAlbumRequest
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
    /// the album ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumId")]
    public long AlbumId { get; set; }
}
public class RemoveAlbumRequest
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
    /// the album ID to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumId")]
    public long AlbumId { get; set; }
}
public class RemoveAlbumUsersRequest
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
    /// the album ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumId")]
    public long AlbumId { get; set; }
    /// <summary>
    /// comma separated list of connection IDs
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connections")]
    public string? Connections { get; set; }
    /// <summary>
    /// comma separated list of connection group IDs
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionGroups")]
    public string? ConnectionGroups { get; set; }
    /// <summary>
    /// remove friend group
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("removeFriendGroup")]
    public bool RemoveFriendGroup { get; set; }
}
public class SearchAlbumsRequest
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
    /// the account ID of the user that the results will be based on. This is used to return albums that this account has liked/favorited.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountId")]
    public long? ConnectionAccountId { get; set; }
    /// <summary>
    /// search on albums that have been created by this account (that the user has permissions to)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ownerId")]
    public long? OwnerId { get; set; }
    /// <summary>
    /// search on album within a comma separated list of album IDs (this does not work with sortField&#x3D;ALBUM_DISTANCE, or when stackSearch&#x3D;true)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumIds")]
    public string? AlbumIds { get; set; }
    /// <summary>
    /// Only for CLOUDINDEX mode, exclude albums with ids matching this list
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("excludeAlbumIds")]
    public string? ExcludeAlbumIds { get; set; }
    /// <summary>
    /// search on albums that are in a particular media offering
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaId")]
    public long? MediaId { get; set; }
    /// <summary>
    /// keyword search string
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// a comma separated list of filters: * MINE - Return albums that the user has created. * SHARED - Return albums that have been shared to the user via addAlbumUsers, or addUsersToPermissionable . * FOLLOWER - Return albums that have been created by the user&#39;s followers (the content needs to have been APPROVED or FEATURED). * FOLLOWING - Return albums that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED). * PUBLIC - Return all PUBLIC albums that have been APPROVED or FEATURED. * ALL_PUBLIC - Return all PUBLIC albums regardless of whether they are approved or not (ignores the approval status). * LIKED - Return all albums that the user has liked. * FEATURED - Return all albums that have been featured. * PENDING - Return all pending albums. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filter")]
    public string Filter { get; set; }
    /// <summary>
    /// filter albums with this album type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumType")]
    public string? AlbumType { get; set; }
    /// <summary>
    /// id of custom albumType
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumTypeId")]
    public long AlbumTypeId { get; set; }
    /// <summary>
    /// filter albums with this album sub type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("subType")]
    public string SubType { get; set; }
    /// <summary>
    /// determines whether to return inactive albums
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeInactive")]
    public bool IncludeInactive { get; set; }
    /// <summary>
    /// the field to sort by. See AlbumApiMap
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// the start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// the limit for pagination (There is a hard limit of 100)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// When using multiple album types this sets a per-album-type limit (used with cloud index mode)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limitPerAlbumType")]
    public int? LimitPerAlbumType { get; set; }
    /// <summary>
    /// return items that have been created before this date (time-stamp in milliseconds)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("dateCreated")]
    public long? DateCreated { get; set; }
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
    /// return items that have been created since this date (time-stamp in milliseconds)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("createdSince")]
    public long? CreatedSince { get; set; }
    /// <summary>
    /// return items that have been created before this date (time-stamp in milliseconds)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("createdBefore")]
    public long? CreatedBefore { get; set; }
    /// <summary>
    /// return items that have been started since this date (time-stamp in milliseconds)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startedSince")]
    public long? StartedSince { get; set; }
    /// <summary>
    /// return items that have been started before this date (time-stamp in milliseconds)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startedBefore")]
    public long? StartedBefore { get; set; }
    /// <summary>
    /// return items that have been ended since this date (time-stamp in milliseconds)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endedSince")]
    public long? EndedSince { get; set; }
    /// <summary>
    /// return items that have been ended before this date (time-stamp in milliseconds)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endedBefore")]
    public long? EndedBefore { get; set; }
    /// <summary>
    /// the latitude of where the search is centered on (used when sortField&#x3D;ALBUM_DISTANCE)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the longitude of where the search is centered on (used when sortField&#x3D;ALBUM_DISTANCE)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// the maximum range the album can be from the center (used when sortField&#x3D;ALBUM_DISTANCE)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("range")]
    public double Range { get; set; }
    /// <summary>
    /// the application key to filter results by application. This is required for consumer searches. Leaving this empty will return albums for the applications that the logged in user owns or has access to.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// return results with categories matching this list
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// return results with filters matching this list
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryFilterIds")]
    public string? CategoryFilterIds { get; set; }
    /// <summary>
    /// return results with audiences matching this list
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIds")]
    public string? AudienceIds { get; set; }
    /// <summary>
    /// exclude audiences with ids matching this list
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("excludeAudienceIds")]
    public string? ExcludeAudienceIds { get; set; }
    /// <summary>
    /// returns whether or not the current logged in user has liked the album
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeLiked")]
    public bool IncludeLiked { get; set; }
    /// <summary>
    /// returns whether or not the current logged in user has favorited the album
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeFavorited")]
    public bool IncludeFavorited { get; set; }
    /// <summary>
    /// returns permission details on whether they have read/write/delete permissions etc (client app probably doesn&#39;t need this)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includePermissions")]
    public bool IncludePermissions { get; set; }
    /// <summary>
    /// returns the user&#39;s completable object for the album if it exists
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeCompletable")]
    public bool? IncludeCompletable { get; set; }
    /// <summary>
    /// returns the user&#39;s rating for the album if it exists
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeRating")]
    public bool? IncludeRating { get; set; }
    /// <summary>
    /// returns the last X likes
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("likePreviewSize")]
    public int LikePreviewSize { get; set; }
    /// <summary>
    /// returns the first X assets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetPreviewSize")]
    public int AssetPreviewSize { get; set; }
    /// <summary>
    /// returns the last X notes
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("notePreviewSize")]
    public int NotePreviewSize { get; set; }
    /// <summary>
    /// returns the first X users/connections
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionPreviewSize")]
    public int ConnectionPreviewSize { get; set; }
    /// <summary>
    /// returns the first X audiences. To search on and paginate the remaining audiences, please use the \&quot;/audience/search\&quot; endpoint.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audiencePreviewSize")]
    public int AudiencePreviewSize { get; set; }
    /// <summary>
    /// The search index mode to use (RDS, LUCENE, or CLOUDINDEX). If not provided will use server default.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchMode")]
    public string? SearchMode { get; set; }
    /// <summary>
    /// groups similar albums together that have the same albumTypeId, within a time window defined in stackWindowSize
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("stackSearch")]
    public bool? StackSearch { get; set; }
    /// <summary>
    /// size of each window for each stack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("stackWindowSize")]
    public int? StackWindowSize { get; set; }
    /// <summary>
    /// The minimum number of stacks returned in a response. For example,  first call, minStackPerPage &#x3D; 20, the API will return at least 20 results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("minStackPerPage")]
    public int? MinStackPerPage { get; set; }
    /// <summary>
    /// this is used to tell the system where it left off on the previous previous page, since we can&#39;t use start/limit for stackSearch
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("stackPaginationIdentifier")]
    public string? StackPaginationIdentifier { get; set; }
    /// <summary>
    /// set this to true when making the call to view the albums in the stack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("stackDetails")]
    public bool? StackDetails { get; set; }
    /// <summary>
    /// Return any results that have a minimum of the specified flag count (even ones that have met the flag threshold)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("flagCountMinimum")]
    public long? FlagCountMinimum { get; set; }
    /// <summary>
    /// return items that have flagCount &gt;&#x3D; flagThreshold (controls removal of flagged content)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("removeFlaggedContent")]
    public bool? RemoveFlaggedContent { get; set; }
    /// <summary>
    /// setting to true will return only verified albums only, setting to false will return non-verified albums only (leave empty to return both)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("verifiedFilter")]
    public bool? VerifiedFilter { get; set; }
    /// <summary>
    /// filter results by the linkedObjectType
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("linkedObjectType")]
    public string? LinkedObjectType { get; set; }
    /// <summary>
    /// filter results by the linkedObjectId
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("linkedObjectId")]
    public long? LinkedObjectId { get; set; }
    /// <summary>
    /// determines whether to use the order assigned via the /album/order/_* api (which is tied to an audience)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("orderAudienceId")]
    public long? OrderAudienceId { get; set; }
    /// <summary>
    /// if true, ignore the application&#39;s default app filter when searching
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ignoreDefaultAppFilter")]
    public bool? IgnoreDefaultAppFilter { get; set; }
    /// <summary>
    /// Advanced search expression to be used by the server
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchExpression")]
    public string? SearchExpression { get; set; }
    /// <summary>
    /// If true and results are empty, attempt to generate albums via templates
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("generateAlbums")]
    public bool? GenerateAlbums { get; set; }
}
public class UpdateAlbumCollectionRequest
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
    /// the ID of the album to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumId")]
    public long AlbumId { get; set; }
    /// <summary>
    /// Comma separated list of asset IDs to add to the album&#39;s asset list (use \&quot;assetId\&quot; for setting the cover of the album)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetsToAdd")]
    public string? AssetsToAdd { get; set; }
    /// <summary>
    /// Comma separated list of asset IDs to remove from the album&#39;s asset list
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetsToRemove")]
    public string? AssetsToRemove { get; set; }
    /// <summary>
    /// the cover asset ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetId")]
    public long? AssetId { get; set; }
    /// <summary>
    /// a MultipartFile containing the cover image of the album (this will only be used if \&quot;assetId\&quot; is empty)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("media")]
    public System.IO.Stream? Media { get; set; }
    /// <summary>
    /// this can be used if the \&quot;media\&quot; is a link (this will only be used if \&quot;assetId\&quot; and media are empty)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaURL")]
    public string? MediaURL { get; set; }
    /// <summary>
    /// determines whether the album is active or inactive
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// the title of the album
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// the start date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// the end date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// the tags
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// the description of the album
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// a custom field used for aggregation and searching
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumType")]
    public string? AlbumType { get; set; }
    /// <summary>
    /// a custom indexed number used for aggregation and searching
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumTypeId")]
    public long? AlbumTypeId { get; set; }
    /// <summary>
    /// a custom string field used for aggregation and searching
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("subType")]
    public string? SubType { get; set; }
    /// <summary>
    /// determines whether the album&#39;s participants have read permissions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicRead")]
    public bool? PublicRead { get; set; }
    /// <summary>
    /// determines whether the album&#39;s participants have write permissions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicWrite")]
    public bool? PublicWrite { get; set; }
    /// <summary>
    /// determines whether the album&#39;s participants have delete permissions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicDelete")]
    public bool? PublicDelete { get; set; }
    /// <summary>
    /// determines whether the album&#39;s participants have add permissions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicAdd")]
    public bool? PublicAdd { get; set; }
    /// <summary>
    /// latitude used to update the album&#39;s location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// longitude used to update the album&#39;s location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// the location description
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationDescription")]
    public string? LocationDescription { get; set; }
    /// <summary>
    /// the determines the album&#39;s participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string? Visibility { get; set; }
    /// <summary>
    /// the cell phone number
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cellPhone")]
    public string? CellPhone { get; set; }
    /// <summary>
    /// The street address of the location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streetAddress")]
    public string? StreetAddress { get; set; }
    /// <summary>
    /// Additional address information (such as a suite number, floor number, building name, or PO Box)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streetAddress2")]
    public string? StreetAddress2 { get; set; }
    /// <summary>
    /// The city of the location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("city")]
    public string? City { get; set; }
    /// <summary>
    /// The state of of the location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("state")]
    public string? State { get; set; }
    /// <summary>
    /// The postal code of the location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("postalCode")]
    public string? PostalCode { get; set; }
    /// <summary>
    /// The full address of the location which should include the street address, city, state, and postal code
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("fullAddress")]
    public string? FullAddress { get; set; }
    /// <summary>
    /// determines whether the album is posted anonymously
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("anonymous")]
    public bool? Anonymous { get; set; }
    /// <summary>
    /// External custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// comma separated category ids string associated with the Album
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// comma separated filter ids string associated with the Album
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryFilterIds")]
    public string? CategoryFilterIds { get; set; }
    /// <summary>
    /// comma separated audience ids string associated with the album
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIds")]
    public string? AudienceIds { get; set; }
    /// <summary>
    /// comma separated audience ids to add to the album
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIdsToAdd")]
    public string? AudienceIdsToAdd { get; set; }
    /// <summary>
    /// comma separated audience ids to remove from the album (overrides audienceIds and audienceIdsToAdd)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIdsToRemove")]
    public string? AudienceIdsToRemove { get; set; }
    /// <summary>
    /// determines whether to include all app users as members (only admins of the app can do this)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeAllAppUsersAsMembers")]
    public bool? IncludeAllAppUsersAsMembers { get; set; }
    /// <summary>
    /// determines whether to include all users of the audiences as members (only admins of the app can do this)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeAudiencesAsMembers")]
    public bool? IncludeAudiencesAsMembers { get; set; }
    /// <summary>
    /// determines whether to use ands or ors when using the audience list to add users
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceOperator")]
    public string? AudienceOperator { get; set; }
    /// <summary>
    /// sets a linked object so that it can be returned as part of the album response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("linkedObjectType")]
    public string? LinkedObjectType { get; set; }
    /// <summary>
    /// sets a linked object id so that it can be returned as part of the album response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("linkedObjectId")]
    public long? LinkedObjectId { get; set; }
    /// <summary>
    /// determines whether the album should be indexed immediately
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("indexNow")]
    public bool? IndexNow { get; set; }
}


