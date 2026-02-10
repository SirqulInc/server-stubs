using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation
/// </summary>

public class CreateLeaderboardEndpoint : FastEndpoints.Endpoint<CreateLeaderboardRequest, LeaderboardResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/leaderboard/create");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Leaderboard");
        });

        Summary(s => {
            s.Summary = "Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the user creating the leaderboard.");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.RankType, "a unique label for identifying the ranking. This can be any alphanumeric string with a maximum length of 64 characters. There are also default rank types to use which include: POINTS, DOWNLOADS, INVITATIONS, CREATIONS, VOTES, REDEEMED, ACTIONS");
            s.RequestParam(r => r.LeaderboardMode, "the type of search to perform. Possible values include: GLOBAL - searches scores globally (all users in the system are included in the ranking); LOCAL - filters results by select users and on users that have logged into the same device; SEARCH - does a GLOBAL search by keyword; CUSTOM - does a LOCAL search by keyword");
            s.RequestParam(r => r.IconMedia, "a MultipartFile containing the icon image of the leaderboard (this will only be used if \&quot;iconAssetId\&quot; is empty)");
            s.RequestParam(r => r.IconAssetId, "The asset ID to set the leaderboard icon");
            s.RequestParam(r => r.BannerMedia, "a MultipartFile containing the icon banner of the leaderboard (this will only be used if \&quot;bannerAssetId\&quot; is empty)");
            s.RequestParam(r => r.BannerAssetId, "The asset ID to set the leaderboard banner");
            s.RequestParam(r => r.Limitation, "limit number of rankings for each leaderboard");
            s.RequestParam(r => r.SortField, "determines how to order and rank the results. Possible values include: TOTAL, WEEKLY, DAILY, TOP, LOWEST");
            s.RequestParam(r => r.Title, "leaderboard&#39;s title");
            s.RequestParam(r => r.Description, "leaderboard&#39;s description");
            s.RequestParam(r => r.MetaData, "custom meta data for the leaderboard");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateLeaderboardRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete the Leader Board
/// </summary>

public class DeleteLeaderboardEndpoint : FastEndpoints.Endpoint<DeleteLeaderboardRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/leaderboard/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Leaderboard");
        });

        Summary(s => {
            s.Summary = "Delete the Leader Board";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.LeaderboardId, "The leaderboard id to delete.");
            s.RequestParam(r => r.AccountId, "The account id of the user making the request.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteLeaderboardRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Read a leaderboard by id and retrieve the matching ranking list
/// </summary>

public class GetLeaderboardEndpoint : FastEndpoints.Endpoint<GetLeaderboardRequest, LeaderboardResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/leaderboard/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Leaderboard");
        });

        Summary(s => {
            s.Summary = "Read a leaderboard by id and retrieve the matching ranking list";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.LeaderboardId, "The leaderboard id.");
            s.RequestParam(r => r.AccountId, "A valid account.");
            s.RequestParam(r => r.IncludeFullRankingList, "set to true if need to return the leaderboard&#39;s full ranking list");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetLeaderboardRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search leaderboard and retrieve the matching ranking list
/// </summary>

public class SearchLeaderboardsEndpoint : FastEndpoints.Endpoint<SearchLeaderboardsRequest, LeaderboardResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/leaderboard/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Leaderboard");
        });

        Summary(s => {
            s.Summary = "Search leaderboard and retrieve the matching ranking list";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the user requesting the search.");
            s.RequestParam(r => r.AppKey, "The application key.");
            s.RequestParam(r => r.GlobalOnly, "only include global leaderboards (this overrides the appKey filter)");
            s.RequestParam(r => r.Keyword, "keyword to search by title");
            s.RequestParam(r => r.LeaderboardIds, "comma separated list of leaderboard ids to filter results with");
            s.RequestParam(r => r.RankTypes, "comma separated list of rankType to filter results with");
            s.RequestParam(r => r.SortField, "sortField of the result, from LeaderboardApiMap (TITLE, DESCRIPTION, CREATED, UPDATED, RANK_TYPE, RANK_MODE)");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.IncludeInactive, "include inactive in the result");
            s.RequestParam(r => r.IncludeAppResponse, "determines whether to include the application response for each leaderboard");
            s.RequestParam(r => r.Start, "Start the result set at some index.");
            s.RequestParam(r => r.Limit, "Limit the result to some number.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchLeaderboardsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation
/// </summary>

public class UpdateLeaderboardEndpoint : FastEndpoints.Endpoint<UpdateLeaderboardRequest, LeaderboardResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/leaderboard/update");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Leaderboard");
        });

        Summary(s => {
            s.Summary = "Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.LeaderboardId, "The leaderboard id to update.");
            s.RequestParam(r => r.AccountId, "The account id of the user updating the leaderboard.");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.RankType, "a unique label for identifying the ranking. This can be any alphanumeric string with a maximum length of 64 characters.");
            s.RequestParam(r => r.LeaderboardMode, "the type of search to perform. Possible values include: GLOBAL, LOCAL, SEARCH, CUSTOM");
            s.RequestParam(r => r.SortField, "determines how to order and rank the results. Possible values include: TOTAL, WEEKLY, DAILY, TOP, LOWEST");
            s.RequestParam(r => r.IconMedia, "a MultipartFile containing the icon image of the leaderboard (this will only be used if \&quot;iconAssetId\&quot; is empty)");
            s.RequestParam(r => r.IconAssetId, "The asset ID to set the leaderboard icon");
            s.RequestParam(r => r.BannerMedia, "a MultipartFile containing the icon banner of the leaderboard (this will only be used if \&quot;bannerAssetId\&quot; is empty)");
            s.RequestParam(r => r.BannerAssetId, "The asset ID to set the leaderboard banner");
            s.RequestParam(r => r.Limitation, "limit number of rankings for each leaderboard");
            s.RequestParam(r => r.Active, "Whether the leaderboard is active");
            s.RequestParam(r => r.Title, "leaderboard&#39;s title");
            s.RequestParam(r => r.Description, "leaderboard&#39;s description");
            s.RequestParam(r => r.MetaData, "custom meta data for the leaderboard");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateLeaderboardRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

