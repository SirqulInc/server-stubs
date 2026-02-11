
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateFollowingRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class CreateSpaceRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class CreateVatomEventRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class DeleteFollowingRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom Rels Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomRelsKey")]
    public string VatomRelsKey { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class DeletePointsBalanceRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Campaign Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomCampaignId")]
    public string VatomCampaignId { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class DeleteSpaceRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Space Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomSpaceId")]
    public string VatomSpaceId { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class DeleteVatomEventRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Event Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomEventId")]
    public string VatomEventId { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class DeleteVatomNFTRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom NFT Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomId")]
    public string VatomId { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class ExecuteActionOnNFTRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom NFT Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomId")]
    public string VatomId { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GeomapSearchRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetBusinessBehaviorsRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetBusinessCoinsBalanceRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetBusinessIdsRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetBusinessInfoRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string? VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetBusinessUsersRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetCampaignGroupEntitiesRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Campaign Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomCampaignId")]
    public string VatomCampaignId { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetCampaignGroupRulesRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Campaign Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomCampaignId")]
    public string VatomCampaignId { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetCampaignGroupStatsRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Campaign Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomCampaignId")]
    public string VatomCampaignId { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetCampaignInfoRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Campaign Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomCampaignId")]
    public string VatomCampaignId { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetEventGuestListRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Event Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomEventId")]
    public string VatomEventId { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetInventoryRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetMyFollowingRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetPointsBalanceRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom User Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomUserId")]
    public string VatomUserId { get; set; }
    /// <summary>
    /// Vatom Campaign Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomCampaignId")]
    public string VatomCampaignId { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetPointsBalanceAsBusinessRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom User Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomUserId")]
    public string VatomUserId { get; set; }
    /// <summary>
    /// Vatom Campaign Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomCampaignId")]
    public string VatomCampaignId { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetSpaceRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Space Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomSpaceId")]
    public string VatomSpaceId { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetUserCoinsAsBusinessRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom User Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomUserId")]
    public string VatomUserId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetUserCoinsBalanceRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom User Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomUserId")]
    public string VatomUserId { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string? VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetUserFollowersRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom User Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomUserId")]
    public string VatomUserId { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetUserFollowingRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom User Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomUserId")]
    public string VatomUserId { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetUserInfoRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom User Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomUserId")]
    public string VatomUserId { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetUserProfileRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetVatomEventRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Event Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomEventId")]
    public string VatomEventId { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class GetVatomNFTRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom NFT Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomId")]
    public string VatomId { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class ListCommunitiesRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string? VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class ListEventsRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string? VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class ListSpacesRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string? VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class ListUserCoinTransactionsRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom User Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomUserId")]
    public string VatomUserId { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string? VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class ListUserCoinTransactionsAsBusinessRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom User Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomUserId")]
    public string VatomUserId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string? VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class PerformActionOnNFTRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom NFT Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomId")]
    public string VatomId { get; set; }
    /// <summary>
    /// Vatom Action
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomAction")]
    public string VatomAction { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class RedeemNFTRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class RedeemUserCoinsAsBusinessRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom User Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomUserId")]
    public string VatomUserId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class SearchBusinessesRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string? VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class SearchCampaignGroupsRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class SearchIdentitiesRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class SearchInventoryRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string? VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class SendNFTRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Campaign Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomCampaignId")]
    public string VatomCampaignId { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class SetPointsBalanceAsBusinessRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom User Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomUserId")]
    public string VatomUserId { get; set; }
    /// <summary>
    /// Vatom Campaign Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomCampaignId")]
    public string VatomCampaignId { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class TransferUserCoinsRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom User Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomUserId")]
    public string VatomUserId { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class UpdateBusinessCoinsRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class UpdateEventGuestListRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Event Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomEventId")]
    public string VatomEventId { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class UpdateSpaceRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Space Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomSpaceId")]
    public string VatomSpaceId { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class UpdateUserCoinsAsBusinessRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom User Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomUserId")]
    public string VatomUserId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class UpdateUserProfileRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}
public class UpdateVatomEventRequest
{
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Vatom Event Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomEventId")]
    public string VatomEventId { get; set; }
    /// <summary>
    /// Vatom Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomParameters")]
    public string VatomParameters { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}


