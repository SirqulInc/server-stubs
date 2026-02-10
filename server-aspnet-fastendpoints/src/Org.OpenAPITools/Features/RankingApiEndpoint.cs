using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Search Historical Rankings
/// </summary>

public class GetHistoricalRankingsEndpoint : FastEndpoints.Endpoint<GetHistoricalRankingsRequest, RankFullResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/ranking/historical/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Ranking");
        });

        Summary(s => {
            s.Summary = "Search Historical Rankings";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "the application key for filtering results by application");
            s.RequestParam(r => r.RankType, "the rank type to return");
            s.RequestParam(r => r.StartDate, "timestamp in milliseconds to filter results with");
            s.RequestParam(r => r.EndDate, "timestamp in milliseconds to filter results with");
            s.RequestParam(r => r.DeviceId, "a unique id given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user");
            s.RequestParam(r => r.SortField, "determines how to order and rank the results. Possible values include: TOTAL, MONTHLY, WEEKLY, DAILY, TOP, LOWEST");
            s.RequestParam(r => r.Descending, "determines whether to return results in ascending or descending order");
            s.RequestParam(r => r.Start, "the start index for pagination");
            s.RequestParam(r => r.Limit, "the limit for pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetHistoricalRankingsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Rankings
/// </summary>

public class GetRankingsEndpoint : FastEndpoints.Endpoint<GetRankingsRequest, RankFullResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/ranking/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Ranking");
        });

        Summary(s => {
            s.Summary = "Search Rankings";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "a unique id given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.GameType, "This parameter is deprecated.");
            s.RequestParam(r => r.AppKey, "the application key for filtering results by application (required for non-EXECUTIVE users)");
            s.RequestParam(r => r.Q, "This parameter is deprecated.");
            s.RequestParam(r => r.Keyword, "keyword to search for");
            s.RequestParam(r => r.RankType, "a comma separated list of rank types to return. Possible default rank types: POINTS, DOWNLOADS, INVITATIONS");
            s.RequestParam(r => r.LeaderboardMode, "the type of search to perform. Possible values include: GLOBAL - searches scores globally (all users in the system are included in the ranking) LOCAL - filters results by select users and on users that have logged into the same device CUSTOM - allows for custom filtering using the params: withinAccountIds, albumId, audienceId");
            s.RequestParam(r => r.WithinAccountIds, "comma separated list of account ids. If performing a LOCAL or CUSTOM search, the query will include these accounts.");
            s.RequestParam(r => r.ReturnUserRank, "determines whether to return the user&#39;s current rank in the response. This can be turned off for sequential paginated requests.");
            s.RequestParam(r => r.AlbumId, "album id to use when performing CUSTOM filters");
            s.RequestParam(r => r.AudienceId, "audience id to use when performing CUSTOM filters");
            s.RequestParam(r => r.SortField, "determines how to order and rank the results. Possible values include: TOTAL - order results by total score MONTHLY - order results by monthly score WEEKLY - order results by weekly score DAILY - order results by daily score TOP - order results by top score LOWEST - order results by lowest score");
            s.RequestParam(r => r.Descending, "determines whether to return results in ascending or descending order");
            s.RequestParam(r => r.I, "This parameter is deprecated.");
            s.RequestParam(r => r.Start, "the start index for pagination");
            s.RequestParam(r => r.L, "This parameter is deprecated.");
            s.RequestParam(r => r.Limit, "the limit for pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetRankingsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Personal Rankings
/// </summary>

public class GetUserRankEndpoint : FastEndpoints.Endpoint<GetUserRankRequest, Object>
{
    public override void Configure()
    {
        Post("/api/{version}/ranking/personal/ranks");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Ranking");
        });

        Summary(s => {
            s.Summary = "Get Personal Rankings";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "a unique id given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user");
            s.RequestParam(r => r.AppKey, "the application key for filtering results by application (required)");
            s.RequestParam(r => r.RankType, "pass in all rankTypes and children rankTypes");
            s.RequestParam(r => r.ReturnUserRank, "determines whether to return the user&#39;s current rank in the response, for each rankType");
            s.RequestParam(r => r.LeaderboardMode, "the type of search to perform. Possible values include: GLOBAL, LOCAL, SEARCH, CUSTOM");
            s.RequestParam(r => r.SortField, "determines how to order and rank the results. Possible values include: TOTAL, MONTHLY, WEEKLY, DAILY, TOP, LOWEST");
            s.RequestParam(r => r.Keyword, "keyword to search for (on rankType)");
            s.RequestParam(r => r.Descending, "determines whether to return results in descending order");
            s.RequestParam(r => r.Start, "the start index for pagination");
            s.RequestParam(r => r.Limit, "the limit for pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetUserRankRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Override User Rank
/// </summary>

public class OverrideUserRankEndpoint : FastEndpoints.Endpoint<OverrideUserRankRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/ranking/override");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Ranking");
        });

        Summary(s => {
            s.Summary = "Override User Rank";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the logged in user&#39;s account id (must have permissions to manage data for the application)");
            s.RequestParam(r => r.OwnerAccountId, "the end user&#39;s account id to override");
            s.RequestParam(r => r.AppKey, "the application key the leaderboard is for");
            s.RequestParam(r => r.RankType, "the rankType of the leaderboard");
            s.RequestParam(r => r.TotalScore, "the total score to update");
            s.RequestParam(r => r.TotalCount, "the total count to update");
            s.RequestParam(r => r.TotalTime, "the total time to update");
            s.RequestParam(r => r.DailyScore, "the daily score to update");
            s.RequestParam(r => r.DailyCount, "the daily count to update");
            s.RequestParam(r => r.DailyTime, "the daily time to update");
            s.RequestParam(r => r.WeeklyScore, "the weekly score to update");
            s.RequestParam(r => r.WeeklyCount, "the weekly count to update");
            s.RequestParam(r => r.WeeklyTime, "the weekly time to update");
            s.RequestParam(r => r.MonthlyScore, "the monthly score to update");
            s.RequestParam(r => r.MonthlyCount, "the monthly count to update");
            s.RequestParam(r => r.MonthlyTime, "the monthly time to update");
            s.RequestParam(r => r.TopScore, "the top score to update");
            s.RequestParam(r => r.LowestScore, "the lowest score to update");
            s.RequestParam(r => r.StreakCount, "the streak count to update");
            s.RequestParam(r => r.StreakBestCount, "the best streak count to update");
            s.RequestParam(r => r.StartDate, "the start date to update");
            s.RequestParam(r => r.EndDate, "the end date to update");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(OverrideUserRankRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Ranking
/// </summary>

public class UpdateRankingsEndpoint : FastEndpoints.Endpoint<UpdateRankingsRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/ranking/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Ranking");
        });

        Summary(s => {
            s.Summary = "Update Ranking";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account id of the user");
            s.RequestParam(r => r.AppKey, "the application key for filtering results by application");
            s.RequestParam(r => r.RankType, "a unique label for identifying the ranking. This can be any alphanumeric string (no spaces or special characters) with a maximum length of 64 characters. There are also default rank types to use which include: POINTS, DOWNLOADS, INVITATIONS, CREATIONS, VOTES, REDEEMED, ACTIONS");
            s.RequestParam(r => r.Increment, "the value to increment");
            s.RequestParam(r => r.TimeIncrement, "the time value to increment");
            s.RequestParam(r => r.Tag, "the analytic tag for this achievement (used to validate scores)");
            s.RequestParam(r => r.StartDate, "custom date you can save along with the score for the user");
            s.RequestParam(r => r.EndDate, "custom date you can save along with the score for the user");
            s.RequestParam(r => r.UpdateGlobal, "update the global rankings if true, default is false");
            s.RequestParam(r => r.CreateLeaderboard, "create the leaderboard if it does not exist (default false)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateRankingsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

