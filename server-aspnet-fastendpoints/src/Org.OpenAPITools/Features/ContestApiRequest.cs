
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AddOrUpdateAlbumContestRequest
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
    /// This parameter is deprecated. the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// a custom field used for aggregation and searching
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contestType")]
    public string? ContestType { get; set; }
    /// <summary>
    /// the album contest ID for updating (don&#39;t pass in if creating)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumContestId")]
    public long? AlbumContestId { get; set; }
    /// <summary>
    /// the title of the contest
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// the description of the contest
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// the album ID for the first album
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumId1")]
    public long? AlbumId1 { get; set; }
    /// <summary>
    /// removes album1 from the contest
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("removeAlbum1")]
    public bool? RemoveAlbum1 { get; set; }
    /// <summary>
    /// the album ID for the second album
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumId2")]
    public long? AlbumId2 { get; set; }
    /// <summary>
    /// removes album2 from the contest
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("removeAlbum2")]
    public bool? RemoveAlbum2 { get; set; }
    /// <summary>
    /// the start date of the contest (time-stamp in milliseconds)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// the end date of the contest (time-stamp in milliseconds)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// determines whether the contest&#39;s participants has read permissions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicRead")]
    public bool PublicRead { get; set; }
    /// <summary>
    /// determines whether the contest&#39;s participants has write permissions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicWrite")]
    public bool PublicWrite { get; set; }
    /// <summary>
    /// determines whether the contest&#39;s participants has delete permissions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicDelete")]
    public bool PublicDelete { get; set; }
    /// <summary>
    /// determines whether the contest&#39;s participants has add permissions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicAdd")]
    public bool PublicAdd { get; set; }
    /// <summary>
    /// the location description of the contest taking place
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationDescription")]
    public string? LocationDescription { get; set; }
    /// <summary>
    /// the determines the album&#39;s participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string Visibility { get; set; }
    /// <summary>
    /// comma separated list of connection IDs
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionIdsToAdd")]
    public string? ConnectionIdsToAdd { get; set; }
    /// <summary>
    /// comma separated list of connection group IDs
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionGroupIdsToAdd")]
    public string? ConnectionGroupIdsToAdd { get; set; }
    /// <summary>
    /// determines whether to include all friends as participants
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeFriendGroup")]
    public bool IncludeFriendGroup { get; set; }
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
public class ApproveAlbumContestRequest
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
    /// The ID of the album contest
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumContestId")]
    public long AlbumContestId { get; set; }
    /// <summary>
    /// The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("approvalStatus")]
    public string ApprovalStatus { get; set; }
}
public class DeleteContestRequest
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
    /// the album contest ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumContestId")]
    public long AlbumContestId { get; set; }
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
public class GetAlbumContestRequest
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
    /// the album contest ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumContestId")]
    public long AlbumContestId { get; set; }
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
public class GetAlbumContestsRequest
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
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// the application type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appType")]
    public string? AppType { get; set; }
    /// <summary>
    /// filter contests with this contest type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contestType")]
    public string? ContestType { get; set; }
    /// <summary>
    /// search on contests that have been created by this account (that the user has permissions to)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ownerId")]
    public long? OwnerId { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
    /// <summary>
    /// keyword search string
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// a comma separated list of Ownership
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filter")]
    public string Filter { get; set; }
    /// <summary>
    /// the field to sort by. See AlbumContestApiMap
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_i")]
    public int? I { get; set; }
    /// <summary>
    /// the start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_l")]
    public int? L { get; set; }
    /// <summary>
    /// the limit for pagination (there is a hard limit of 30)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// filter on items that have been created before this date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("dateCreated")]
    public long? DateCreated { get; set; }
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
public class VoteOnAlbumContestRequest
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
    /// the album contest ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumContestId")]
    public long AlbumContestId { get; set; }
    /// <summary>
    /// the ID of the album to vote on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumId")]
    public long AlbumId { get; set; }
    /// <summary>
    /// a custom field used for aggregation and searching
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contestType")]
    public string? ContestType { get; set; }
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


