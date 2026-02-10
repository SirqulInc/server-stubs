
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class GetHistoricalRankingsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// a unique id given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the application key for filtering results by application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// the rank type to return
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rankType")]
    public string RankType { get; set; }
    /// <summary>
    /// timestamp in milliseconds to filter results with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long StartDate { get; set; }
    /// <summary>
    /// timestamp in milliseconds to filter results with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long EndDate { get; set; }
    /// <summary>
    /// determines how to order and rank the results. Possible values include: TOTAL, MONTHLY, WEEKLY, DAILY, TOP, LOWEST
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// determines whether to return results in ascending or descending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// the start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// the limit for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class GetRankingsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// a unique id given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// the application key for filtering results by application (required for non-EXECUTIVE users)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
    /// <summary>
    /// keyword to search for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// a comma separated list of rank types to return. Possible default rank types: POINTS, DOWNLOADS, INVITATIONS
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rankType")]
    public string? RankType { get; set; }
    /// <summary>
    /// the type of search to perform. Possible values include: GLOBAL - searches scores globally (all users in the system are included in the ranking) LOCAL - filters results by select users and on users that have logged into the same device CUSTOM - allows for custom filtering using the params: withinAccountIds, albumId, audienceId
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("leaderboardMode")]
    public string? LeaderboardMode { get; set; }
    /// <summary>
    /// comma separated list of account ids. If performing a LOCAL or CUSTOM search, the query will include these accounts.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("withinAccountIds")]
    public string? WithinAccountIds { get; set; }
    /// <summary>
    /// determines whether to return the user&#39;s current rank in the response. This can be turned off for sequential paginated requests.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnUserRank")]
    public bool? ReturnUserRank { get; set; }
    /// <summary>
    /// album id to use when performing CUSTOM filters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumId")]
    public long? AlbumId { get; set; }
    /// <summary>
    /// audience id to use when performing CUSTOM filters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceId")]
    public long? AudienceId { get; set; }
    /// <summary>
    /// determines how to order and rank the results. Possible values include: TOTAL - order results by total score MONTHLY - order results by monthly score WEEKLY - order results by weekly score DAILY - order results by daily score TOP - order results by top score LOWEST - order results by lowest score
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// determines whether to return results in ascending or descending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_i")]
    public int? I { get; set; }
    /// <summary>
    /// the start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_l")]
    public int? L { get; set; }
    /// <summary>
    /// the limit for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class GetUserRankRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// a unique id given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the application key for filtering results by application (required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// pass in all rankTypes and children rankTypes
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rankType")]
    public string? RankType { get; set; }
    /// <summary>
    /// determines whether to return the user&#39;s current rank in the response, for each rankType
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnUserRank")]
    public bool? ReturnUserRank { get; set; }
    /// <summary>
    /// the type of search to perform. Possible values include: GLOBAL, LOCAL, SEARCH, CUSTOM
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("leaderboardMode")]
    public string? LeaderboardMode { get; set; }
    /// <summary>
    /// determines how to order and rank the results. Possible values include: TOTAL, MONTHLY, WEEKLY, DAILY, TOP, LOWEST
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// keyword to search for (on rankType)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// determines whether to return results in descending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// the start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// the limit for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class OverrideUserRankRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the logged in user&#39;s account id (must have permissions to manage data for the application)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the end user&#39;s account id to override
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ownerAccountId")]
    public long OwnerAccountId { get; set; }
    /// <summary>
    /// the application key the leaderboard is for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// the rankType of the leaderboard
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rankType")]
    public string RankType { get; set; }
    /// <summary>
    /// the total score to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("totalScore")]
    public long? TotalScore { get; set; }
    /// <summary>
    /// the total count to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("totalCount")]
    public long? TotalCount { get; set; }
    /// <summary>
    /// the total time to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("totalTime")]
    public long? TotalTime { get; set; }
    /// <summary>
    /// the daily score to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("dailyScore")]
    public long? DailyScore { get; set; }
    /// <summary>
    /// the daily count to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("dailyCount")]
    public long? DailyCount { get; set; }
    /// <summary>
    /// the daily time to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("dailyTime")]
    public long? DailyTime { get; set; }
    /// <summary>
    /// the weekly score to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("weeklyScore")]
    public long? WeeklyScore { get; set; }
    /// <summary>
    /// the weekly count to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("weeklyCount")]
    public long? WeeklyCount { get; set; }
    /// <summary>
    /// the weekly time to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("weeklyTime")]
    public long? WeeklyTime { get; set; }
    /// <summary>
    /// the monthly score to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("monthlyScore")]
    public long? MonthlyScore { get; set; }
    /// <summary>
    /// the monthly count to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("monthlyCount")]
    public long? MonthlyCount { get; set; }
    /// <summary>
    /// the monthly time to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("monthlyTime")]
    public long? MonthlyTime { get; set; }
    /// <summary>
    /// the top score to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("topScore")]
    public long? TopScore { get; set; }
    /// <summary>
    /// the lowest score to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("lowestScore")]
    public long? LowestScore { get; set; }
    /// <summary>
    /// the streak count to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streakCount")]
    public long? StreakCount { get; set; }
    /// <summary>
    /// the best streak count to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streakBestCount")]
    public long? StreakBestCount { get; set; }
    /// <summary>
    /// the start date to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// the end date to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
}
public class UpdateRankingsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the application key for filtering results by application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// a unique label for identifying the ranking. This can be any alphanumeric string (no spaces or special characters) with a maximum length of 64 characters. There are also default rank types to use which include: POINTS, DOWNLOADS, INVITATIONS, CREATIONS, VOTES, REDEEMED, ACTIONS
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rankType")]
    public string RankType { get; set; }
    /// <summary>
    /// the value to increment
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("increment")]
    public long? Increment { get; set; }
    /// <summary>
    /// the time value to increment
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("timeIncrement")]
    public long? TimeIncrement { get; set; }
    /// <summary>
    /// the analytic tag for this achievement (used to validate scores)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tag")]
    public string? Tag { get; set; }
    /// <summary>
    /// custom date you can save along with the score for the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// custom date you can save along with the score for the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// update the global rankings if true, default is false
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("updateGlobal")]
    public bool? UpdateGlobal { get; set; }
    /// <summary>
    /// create the leaderboard if it does not exist (default false)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("createLeaderboard")]
    public bool? CreateLeaderboard { get; set; }
}


