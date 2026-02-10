
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateFollowingRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
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


