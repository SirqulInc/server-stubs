using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Searches an Achievement Tier
/// </summary>

public class ApiVersionAchievementTierSearchPostEndpoint : FastEndpoints.Endpoint<ApiVersionAchievementTierSearchPostRequest, AchievementTierResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/achievement/tier/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Achievement");
        });

        Summary(s => {
            s.Summary = "Searches an Achievement Tier";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "a unique id given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.Keyword, "the keyword used to filter resutls with (this returns results that have the keyword in the title or the description of the achievement tier)");
            s.RequestParam(r => r.AchievementType, "filter results by achievementType (these are exact case sensitive matches)");
            s.RequestParam(r => r.RankType, "filter results by the rankType (these are the exact case sensitive matches)");
            s.RequestParam(r => r.SortField, "the field to sort by. See {@link AchievementApiMap}");
            s.RequestParam(r => r.Descending, "determines whether the sort list is in descending or ascending order (of the achievement)");
            s.RequestParam(r => r.DescendingGoal, "determines whether the results are in descending or ascending order by the tier goal count (after the initial sort on the achievement)");
            s.RequestParam(r => r.Start, "The start of the index for pagination");
            s.RequestParam(r => r.Limit, "the limit for pagination (has a hard limit of 1000)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ApiVersionAchievementTierSearchPostRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Achievement
/// </summary>

public class CreateAchievementEndpoint : FastEndpoints.Endpoint<CreateAchievementRequest, AchievementResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/achievement/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Achievement");
        });

        Summary(s => {
            s.Summary = "Create Achievement";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "the application key the achievement is for");
            s.RequestParam(r => r.Title, "the title of the achievement (255 character limit)");
            s.RequestParam(r => r.DeviceId, "a unique id given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AnalyticsTag, "the analytics tag that will trigger when a user&#39;s achievement count gets updated");
            s.RequestParam(r => r.Description, "the description of the achievement");
            s.RequestParam(r => r.RankType, "the rank type for updating leader boards");
            s.RequestParam(r => r.RankIncrement, "determines how much the rank count is incremented");
            s.RequestParam(r => r.MinIncrement, "restrict scores to be above or equal to this minimum value");
            s.RequestParam(r => r.MaxIncrement, "restrict scores to be below or equal to this maximum value");
            s.RequestParam(r => r.Validate, "determines whether the customId on analytics are used to validate a user&#39;s achievement progress.");
            s.RequestParam(r => r.Active, "achievement is active or inactive");
            s.RequestParam(r => r.TriggerDefinition, "if provided will define what triggers to run after a tier is completed");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateAchievementRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Achievement Tier
/// </summary>

public class CreateAchievementTierEndpoint : FastEndpoints.Endpoint<CreateAchievementTierRequest, AchievementTierResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/achievement/tier/create");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Achievement");
        });

        Summary(s => {
            s.Summary = "Create Achievement Tier";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AchievementId, "the achievement id for adding a new tier");
            s.RequestParam(r => r.ScoreAllInstances, "score all instances");
            s.RequestParam(r => r.DeviceId, "a unique id given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Icon, "achievement tier icon image file");
            s.RequestParam(r => r.IconAssetId, "the icon assetId, if icon is provided, icon will overrule");
            s.RequestParam(r => r.Title, "the title of the achievement tier");
            s.RequestParam(r => r.Description, "the description of the achievement tier");
            s.RequestParam(r => r.GoalCount, "the count requirement for completing the achievement tier");
            s.RequestParam(r => r.MissionId, "The ID of the mission to associate with the achievement");
            s.RequestParam(r => r.GameId, "The ID of the game to associate with the achievement");
            s.RequestParam(r => r.PackId, "The ID of the pack to associate with the achievement");
            s.RequestParam(r => r.GameLevelId, "The ID of the game level to associate with the achievement");
            s.RequestParam(r => r.GameObjectId, "The ID of the game object to associate with the achievement");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateAchievementTierRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Achievement
/// </summary>

public class DeleteAchievementEndpoint : FastEndpoints.Endpoint<DeleteAchievementRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/achievement/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Achievement");
        });

        Summary(s => {
            s.Summary = "Delete Achievement";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AchievementId, "The ID of the achievement");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteAchievementRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Achievement Tier
/// </summary>

public class DeleteAchievementTierEndpoint : FastEndpoints.Endpoint<DeleteAchievementTierRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/achievement/tier/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Achievement");
        });

        Summary(s => {
            s.Summary = "Delete Achievement Tier";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AchievementTierId, "the achievement id for deletion");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required).");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteAchievementTierRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Achievement
/// </summary>

public class GetAchievementEndpoint : FastEndpoints.Endpoint<GetAchievementRequest, AchievementTierResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/achievement/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Achievement");
        });

        Summary(s => {
            s.Summary = "Get Achievement";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AchievementId, "The ID of the achievement");
            s.RequestParam(r => r.DeviceId, "a unique id given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AchievementType, "achievementType");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetAchievementRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Gets an achievement tier
/// </summary>

public class GetAchievementTierEndpoint : FastEndpoints.Endpoint<GetAchievementTierRequest, AchievementTierResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/achievement/tier/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Achievement");
        });

        Summary(s => {
            s.Summary = "Gets an achievement tier";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AchievementTierId, "the achievement tier id that is being retrieved");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetAchievementTierRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Achievement Progress
/// </summary>

public class GetUserAchievementsEndpoint : FastEndpoints.Endpoint<GetUserAchievementsRequest, List<AchievementProgressResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/achievement/progress/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Achievement");
        });

        Summary(s => {
            s.Summary = "Get Achievement Progress";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ReturnNulls, "determines whether to return null fields in the response");
            s.RequestParam(r => r.AppKey, "the application key for filtering results by application");
            s.RequestParam(r => r.IncludeUndiscovered, "determines whether to return achievements that the user has not discovered yet");
            s.RequestParam(r => r.DeviceId, "a unique id given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ConnectionAccountEmail, "the email of the account to view achievements");
            s.RequestParam(r => r.ConnectionAccountId, "the id of the account to view achievements");
            s.RequestParam(r => r.RankType, "filter results by achievement rankType");
            s.RequestParam(r => r.AchievementType, "filter results by achievement type");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetUserAchievementsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List Achievement Tags
/// </summary>

public class ListAchievementTagsEndpoint : FastEndpoints.Endpoint<ListAchievementTagsRequest, SirqulResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/achievement/tag/list");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Achievement");
        });

        Summary(s => {
            s.Summary = "List Achievement Tags";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "filter results by application key");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ListAchievementTagsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List Achievements
/// </summary>

public class ListAchievementsEndpoint : FastEndpoints.Endpoint<ListAchievementsRequest, List<AchievementShortResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/achievement/list");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Achievement");
        });

        Summary(s => {
            s.Summary = "List Achievements";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.SortField, "the field to sort by. See AchievementApiMap");
            s.RequestParam(r => r.Descending, "determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "the start index for pagination");
            s.RequestParam(r => r.Limit, "the limit for pagination (has a hard limit of 1000)");
            s.RequestParam(r => r.ActiveOnly, "Filter results to only return active achievements");
            s.RequestParam(r => r.DeviceId, "a unique id given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.Keyword, "the keyword used to filter results with (this returns results that have the keyword in the title or description of the achievement)");
            s.RequestParam(r => r.AchievementType, "filter results by the achievementType (these are exact case sensitive matches)");
            s.RequestParam(r => r.RankType, "filter results by the rankType (these are exact case sensitive matches)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ListAchievementsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Achievements
/// </summary>

public class SearchAchievementsEndpoint : FastEndpoints.Endpoint<SearchAchievementsRequest, List<AchievementShortResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/achievement/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Achievement");
        });

        Summary(s => {
            s.Summary = "Search Achievements";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.SortField, "the field to sort by. See AchievementApiMap");
            s.RequestParam(r => r.Descending, "determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.IncludeTiers, "return tiers, only applicable for version &gt;3.18");
            s.RequestParam(r => r.IncludeInactiveTiers, "return inactive tiers, only applicable when includeTiers is true, only applicable for version &gt;3.18");
            s.RequestParam(r => r.Start, "the start index for pagination");
            s.RequestParam(r => r.Limit, "the limit for pagination (has a hard limit of 1000)");
            s.RequestParam(r => r.DeviceId, "a unique id given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Keyword, "the keyword used to filter results with (this returns results that have the keyword in the title or description of the achievement)");
            s.RequestParam(r => r.AchievementType, "filter results by the achievementType (these are exact case sensitive matches)");
            s.RequestParam(r => r.RankType, "filter results by the rankType (these are exact case sensitive matches)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchAchievementsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Achievement
/// </summary>

public class UpdateAchievementEndpoint : FastEndpoints.Endpoint<UpdateAchievementRequest, AchievementResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/achievement/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Achievement");
        });

        Summary(s => {
            s.Summary = "Update Achievement";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "a unique id given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AchievementId, "the achievement ID for updating an existing achievement");
            s.RequestParam(r => r.AnalyticsTag, "the analytics tag that will trigger when a user&#39;s achievement count gets updated");
            s.RequestParam(r => r.Title, "the title of the achievement (255 character limit)");
            s.RequestParam(r => r.Description, "the description of the achievement");
            s.RequestParam(r => r.RankType, "the rank type for updating leader boards");
            s.RequestParam(r => r.RankIncrement, "determines how much the rank count is incremented");
            s.RequestParam(r => r.MinIncrement, "restrict scores to be above or equal to this minimum value");
            s.RequestParam(r => r.NullMinIncrement, "enable to ignore usage of minIncrement");
            s.RequestParam(r => r.MaxIncrement, "restrict scores to be below or equal to this maximum value");
            s.RequestParam(r => r.NullMaxIncrement, "enable to ignore usage of maxIncrement");
            s.RequestParam(r => r.Validate, "determines whether the customId on analytics are used to validate a user&#39;s achievement progress.");
            s.RequestParam(r => r.Active, "if it&#39;s active or inactive");
            s.RequestParam(r => r.TriggerDefinition, "if provided will define what triggers to run after a tier is completed");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateAchievementRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Achievement Tier
/// </summary>

public class UpdateAchievementTierEndpoint : FastEndpoints.Endpoint<UpdateAchievementTierRequest, AchievementTierResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/achievement/tier/update");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Achievement");
        });

        Summary(s => {
            s.Summary = "Update Achievement Tier";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AchievementTierId, "the achievement tier id for updating");
            s.RequestParam(r => r.DeviceId, "a unique id given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Icon, "achievement tier icon image file");
            s.RequestParam(r => r.IconAssetId, "the icon assetId, if icon is provided, icon will overrule");
            s.RequestParam(r => r.Title, "the title of the achievement tier");
            s.RequestParam(r => r.Description, "the description of the achievement tier");
            s.RequestParam(r => r.GoalCount, "the count requirement for completing the achievement tier");
            s.RequestParam(r => r.MissionId, "The ID of the mission to associate with the achievement");
            s.RequestParam(r => r.GameId, "The ID of the game to associate with the achievement");
            s.RequestParam(r => r.PackId, "The ID of the pack to associate with the achievement");
            s.RequestParam(r => r.GameLevelId, "The ID of the game level to associate with the achievement");
            s.RequestParam(r => r.GameObjectId, "The ID of the game object to associate with the achievement");
            s.RequestParam(r => r.ScoreAllInstances, "score all instances");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateAchievementTierRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Achievement Progress
/// </summary>

public class UpdateUserAchievementEndpoint : FastEndpoints.Endpoint<UpdateUserAchievementRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/achievement/progress/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Achievement");
        });

        Summary(s => {
            s.Summary = "Update Achievement Progress";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account id of the user");
            s.RequestParam(r => r.AchievementId, "the achievement id (achievementId or tag required)");
            s.RequestParam(r => r.Tag, "the analytic tag to identify an achievement (achievementId or tag required)");
            s.RequestParam(r => r.CustomId, "a custom identifier used for validation");
            s.RequestParam(r => r.Increment, "the amount to increment an achievement progress by (if no increment is sent in, the server defaults to using the achievement&#39;s rankIncrement value)");
            s.RequestParam(r => r.StartDate, "a custom start date that the client can set (not yet used in server logic)");
            s.RequestParam(r => r.EndDate, "a custom end date that the client can set (not yet used in server logic)");
            s.RequestParam(r => r.ReturnProgress, "determines whether to return the achievement progress response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateUserAchievementRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

