
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateLeaderboardRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the user creating the leaderboard.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// a unique label for identifying the ranking. This can be any alphanumeric string with a maximum length of 64 characters. There are also default rank types to use which include: POINTS, DOWNLOADS, INVITATIONS, CREATIONS, VOTES, REDEEMED, ACTIONS
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rankType")]
    public string? RankType { get; set; }
    /// <summary>
    /// the type of search to perform. Possible values include: GLOBAL - searches scores globally (all users in the system are included in the ranking); LOCAL - filters results by select users and on users that have logged into the same device; SEARCH - does a GLOBAL search by keyword; CUSTOM - does a LOCAL search by keyword
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("leaderboardMode")]
    public string? LeaderboardMode { get; set; }
    /// <summary>
    /// a MultipartFile containing the icon image of the leaderboard (this will only be used if \&quot;iconAssetId\&quot; is empty)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("iconMedia")]
    public System.IO.Stream? IconMedia { get; set; }
    /// <summary>
    /// The asset ID to set the leaderboard icon
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("iconAssetId")]
    public long? IconAssetId { get; set; }
    /// <summary>
    /// a MultipartFile containing the icon banner of the leaderboard (this will only be used if \&quot;bannerAssetId\&quot; is empty)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bannerMedia")]
    public System.IO.Stream? BannerMedia { get; set; }
    /// <summary>
    /// The asset ID to set the leaderboard banner
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bannerAssetId")]
    public long? BannerAssetId { get; set; }
    /// <summary>
    /// limit number of rankings for each leaderboard
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limitation")]
    public int? Limitation { get; set; }
    /// <summary>
    /// determines how to order and rank the results. Possible values include: TOTAL, WEEKLY, DAILY, TOP, LOWEST
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// leaderboard&#39;s title
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// leaderboard&#39;s description
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// custom meta data for the leaderboard
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
}
public class DeleteLeaderboardRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the user making the request.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The leaderboard id to delete.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("leaderboardId")]
    public long LeaderboardId { get; set; }
}
public class GetLeaderboardRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// A valid account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The leaderboard id.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("leaderboardId")]
    public long LeaderboardId { get; set; }
    /// <summary>
    /// set to true if need to return the leaderboard&#39;s full ranking list
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeFullRankingList")]
    public bool? IncludeFullRankingList { get; set; }
}
public class SearchLeaderboardsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the user requesting the search.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The application key.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// only include global leaderboards (this overrides the appKey filter)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("globalOnly")]
    public bool? GlobalOnly { get; set; }
    /// <summary>
    /// keyword to search by title
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// comma separated list of leaderboard ids to filter results with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("leaderboardIds")]
    public string? LeaderboardIds { get; set; }
    /// <summary>
    /// comma separated list of rankType to filter results with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rankTypes")]
    public string? RankTypes { get; set; }
    /// <summary>
    /// sortField of the result, from LeaderboardApiMap (TITLE, DESCRIPTION, CREATED, UPDATED, RANK_TYPE, RANK_MODE)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// include inactive in the result
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeInactive")]
    public bool? IncludeInactive { get; set; }
    /// <summary>
    /// determines whether to include the application response for each leaderboard
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeAppResponse")]
    public bool? IncludeAppResponse { get; set; }
    /// <summary>
    /// Start the result set at some index.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// Limit the result to some number.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class UpdateLeaderboardRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the user updating the leaderboard.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The leaderboard id to update.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("leaderboardId")]
    public long LeaderboardId { get; set; }
    /// <summary>
    /// a unique label for identifying the ranking. This can be any alphanumeric string with a maximum length of 64 characters.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rankType")]
    public string? RankType { get; set; }
    /// <summary>
    /// the type of search to perform. Possible values include: GLOBAL, LOCAL, SEARCH, CUSTOM
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("leaderboardMode")]
    public string? LeaderboardMode { get; set; }
    /// <summary>
    /// determines how to order and rank the results. Possible values include: TOTAL, WEEKLY, DAILY, TOP, LOWEST
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// a MultipartFile containing the icon image of the leaderboard (this will only be used if \&quot;iconAssetId\&quot; is empty)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("iconMedia")]
    public System.IO.Stream? IconMedia { get; set; }
    /// <summary>
    /// The asset ID to set the leaderboard icon
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("iconAssetId")]
    public long? IconAssetId { get; set; }
    /// <summary>
    /// a MultipartFile containing the icon banner of the leaderboard (this will only be used if \&quot;bannerAssetId\&quot; is empty)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bannerMedia")]
    public System.IO.Stream? BannerMedia { get; set; }
    /// <summary>
    /// The asset ID to set the leaderboard banner
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bannerAssetId")]
    public long? BannerAssetId { get; set; }
    /// <summary>
    /// limit number of rankings for each leaderboard
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limitation")]
    public int? Limitation { get; set; }
    /// <summary>
    /// Whether the leaderboard is active
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// leaderboard&#39;s title
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// leaderboard&#39;s description
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// custom meta data for the leaderboard
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
}


