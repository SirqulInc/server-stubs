
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AcceptInviteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the invite token
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("token")]
    public string Token { get; set; }
    /// <summary>
    /// the accountId of the user who is accepting the invite
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the album id associated with this invite (if applicable)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumId")]
    public long? AlbumId { get; set; }
    /// <summary>
    /// the mission id associated with this invite (if applicable)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long? MissionId { get; set; }
    /// <summary>
    /// the album contest id associated with this invite (if applicable)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumContestId")]
    public long? AlbumContestId { get; set; }
    /// <summary>
    /// the offer id associated with this invite (if applicable)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerId")]
    public long? OfferId { get; set; }
    /// <summary>
    /// the offer location id associated with this invite (if applicable)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerLocationId")]
    public long? OfferLocationId { get; set; }
    /// <summary>
    /// the retailer location id associated with this invite (if applicable)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long? RetailerLocationId { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// whether to auto-friend the invite sender and receiver
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("autoFriend")]
    public bool? AutoFriend { get; set; }
    /// <summary>
    /// whether to mark the event as attending automatically after invite is accepted
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("autoAttendEvent")]
    public bool? AutoAttendEvent { get; set; }
    /// <summary>
    /// whether to mark the offer as favorited automatically after invite is accepted
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("autoFavoriteOffer")]
    public bool? AutoFavoriteOffer { get; set; }
    /// <summary>
    /// whether to mark the offer location as favorited automatically after invite is accepted
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("autoFavoriteOfferLocation")]
    public bool? AutoFavoriteOfferLocation { get; set; }
    /// <summary>
    /// whether to mark the retailer location as favorited automatically after invite is accepted
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("autoFavoriteRetailerLocation")]
    public bool? AutoFavoriteRetailerLocation { get; set; }
}
public class AlbumContestInviteRequest
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
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appId")]
    public long? AppId { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// the album contest to share
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumContestId")]
    public long? AlbumContestId { get; set; }
    /// <summary>
    /// the current latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the current longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class AlbumInviteRequest
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
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appId")]
    public long? AppId { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// the album to share
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumId")]
    public long? AlbumId { get; set; }
    /// <summary>
    /// the current latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the current longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class EventInviteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account ID of the user making the share
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the account ID of a Sirqul user they would like to share an event with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("receiverAccountIds")]
    public string? ReceiverAccountIds { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The ID of the event listing
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("listingId")]
    public long ListingId { get; set; }
    /// <summary>
    /// The retailer location id of where the event will take place
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long? RetailerLocationId { get; set; }
}
public class GameInviteRequest
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
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appId")]
    public long? AppId { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// the game level that the user owns and is giving access to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameLevelId")]
    public long? GameLevelId { get; set; }
    /// <summary>
    /// the current latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the current longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class GetInviteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Account ID of the user if they are logged in
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the invite token
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("token")]
    public string? Token { get; set; }
    /// <summary>
    /// album id to match the invite against (if applicable)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumId")]
    public long? AlbumId { get; set; }
    /// <summary>
    /// mission id to match the invite against (if applicable)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long? MissionId { get; set; }
    /// <summary>
    /// album contest id to match the invite against (if applicable)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumContestId")]
    public long? AlbumContestId { get; set; }
    /// <summary>
    /// offer id to match the invite against (if applicable)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerId")]
    public long? OfferId { get; set; }
    /// <summary>
    /// offer location id to match the invite against (if applicable)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerLocationId")]
    public long? OfferLocationId { get; set; }
    /// <summary>
    /// retailer location id to match the invite against (if applicable)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long? RetailerLocationId { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
}
public class MissionInviteRequest
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
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appId")]
    public long? AppId { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// the mission to share
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long? MissionId { get; set; }
    /// <summary>
    /// the current latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the current longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class OfferInviteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account ID of the user making the share
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// the ID of the offer used to invite to favorite
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerId")]
    public long OfferId { get; set; }
}
public class OfferLocationInviteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account ID of the user making the share
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// the id of the offer location to share
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerLocationId")]
    public long OfferLocationId { get; set; }
}
public class RetailerLocationInviteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account ID of the user making the share
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The retailer location id of where the event will take place
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long RetailerLocationId { get; set; }
    /// <summary>
    /// Optional album id to link with the invite
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumId")]
    public long? AlbumId { get; set; }
}


