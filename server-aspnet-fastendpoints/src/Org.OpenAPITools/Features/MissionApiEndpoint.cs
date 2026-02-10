using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Mission
/// </summary>

public class CreateMissionEndpoint : FastEndpoints.Endpoint<CreateMissionRequest, MissionResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/mission/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Mission");
        });

        Summary(s => {
            s.Summary = "Create Mission";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.Title, "The title of the mission");
            s.RequestParam(r => r.Description, "The description of the mission");
            s.RequestParam(r => r.SubType, "Custom string client apps can use for searching/filtering missions");
            s.RequestParam(r => r.StartDate, "The date/time to start the mission, send 0 to unset");
            s.RequestParam(r => r.EndDate, "The date/time to end the mission, send 0 to unset");
            s.RequestParam(r => r.Active, "Activate/deactivate the mission");
            s.RequestParam(r => r.GameLevelIds, "the game level ids to include in the mission, comma separated");
            s.RequestParam(r => r.CreativeIds, "creatives to associate with the mission");
            s.RequestParam(r => r.AudienceIds, "audiences to associate with the mission");
            s.RequestParam(r => r.MissionTask, "This parameter is deprecated.");
            s.RequestParam(r => r.FormatType, "The string identifier for a mission format (this is not the missionFormatId)");
            s.RequestParam(r => r.OfferId, "The offerId to give as a reward");
            s.RequestParam(r => r.Balance, "Set the amount of money available to spend, once 0 deactivate mission. Set to a negative value for unlimited.");
            s.RequestParam(r => r.AdvancedReporting, "Flag to mark the mission as eligible for advanced reporting");
            s.RequestParam(r => r.AllocateTickets, "Flag to indicate owner should receive tickets for completed missions");
            s.RequestParam(r => r.TicketCount, "The number of tickets to reward");
            s.RequestParam(r => r.TicketType, "The type of ticket to reward, null means default type");
            s.RequestParam(r => r.Points, "The number of points to award for completing a mission");
            s.RequestParam(r => r.MetaData, "external custom client defined data");
            s.RequestParam(r => r.ApplicationIds, "Comma separated list of application ids");
            s.RequestParam(r => r.Devices, "Deprecated parameter for device names");
            s.RequestParam(r => r.DeviceIds, "Comma separated list of device ids");
            s.RequestParam(r => r.DeviceVersions, "Comma separated list of device version ranges");
            s.RequestParam(r => r.Locations, "List of lat/long pairs for mission locations");
            s.RequestParam(r => r.Radius, "Comma separated list of radii for locations");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateMissionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Mission
/// </summary>

public class DeleteMissionEndpoint : FastEndpoints.Endpoint<DeleteMissionRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/mission/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Mission");
        });

        Summary(s => {
            s.Summary = "Delete Mission";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.MissionId, "the id of the mission to delete");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteMissionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Find Missions
/// </summary>

public class FindMissionsEndpoint : FastEndpoints.Endpoint<FindMissionsRequest, MissionResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/mission/find");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Mission");
        });

        Summary(s => {
            s.Summary = "Find Missions";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "The application key, if provided return missions specific for the app. Will always return mission levels that are app agnostic.");
            s.RequestParam(r => r.Suffix, "The type of mission to get, possible values are: click_banner, click_leaderboard, click_skyscraper, click_full, click_video, or click_zip");
            s.RequestParam(r => r.Type, "The type of ads to get, possible values are: BANNER, LEADERBOARD, SKYSCRAPER, FULL, VIDEO, ZIP, CONFIG. Use this instead of suffix.");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.AppVersion, "The version of the application, will not return levels newer than the appVersion.");
            s.RequestParam(r => r.Latitude, "The current location of the requesting device");
            s.RequestParam(r => r.Longitude, "The current location of the requesting device");
            s.RequestParam(r => r.Device, "Should use deviceId if possible. The name of the requesting device; possible values are: Android, iPhone, iPad, iPod, etc. use /audience/devices for list.");
            s.RequestParam(r => r.DeviceIdentifier, "The device ID of the requesting device, use /audience/devices for list");
            s.RequestParam(r => r.DeviceVersion, "The requesting device version; examples are: 2.3, 5.1.4, 6.1.4. Supports X, X.X, or X.X.X formated string.");
            s.RequestParam(r => r.Start, "The index into the record set to start with.");
            s.RequestParam(r => r.Limit, "The total number of record to return.");
            s.RequestParam(r => r.IncludeGameData, "Include the game level data with the mission.");
            s.RequestParam(r => r.IncludeAudiences, "If true then return the audience data in the response. Default is false.");
            s.RequestParam(r => r.AllocatesTickets, "If true/false only return missions whose game levels allocate (or don&#39;t allocate) tickets. Do not provide a value to return both.");
            s.RequestParam(r => r.Randomize, "return a random set of results, default is true. If false returns in natural order.");
            s.RequestParam(r => r.TargetedAdsOnly, "return only ads targeted to the specific app, no global ads.");
            s.RequestParam(r => r.MissionIds, "return only ads from the specified campaigns.");
            s.RequestParam(r => r.AudienceOperator, "will return the items that have at least 1 or all of their audiences exist in the logged in user’s audiences, depending if the value is OR or AND");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(FindMissionsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Mission
/// </summary>

public class GetMissionEndpoint : FastEndpoints.Endpoint<GetMissionRequest, MissionResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/mission/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Mission");
        });

        Summary(s => {
            s.Summary = "Get Mission";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.MissionId, "The id of the mission to return.");
            s.RequestParam(r => r.ReturnCreative, "Return creatives associated with the mission when true");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetMissionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Import Mission
/// </summary>

public class ImportMissionEndpoint : FastEndpoints.Endpoint<ImportMissionRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/mission/import");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Mission");
        });

        Summary(s => {
            s.Summary = "Import Mission";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.Latitude, "The current location of the requesting device");
            s.RequestParam(r => r.Longitude, "The current location of the requesting device");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.Keyword, "the keyword of the mission");
            s.RequestParam(r => r.Start, "The starting index in the result set to return. Default is 0.");
            s.RequestParam(r => r.Limit, "The total number of records to return. Default is 20.");
            s.RequestParam(r => r.AdSize, "the size of the ad");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ImportMissionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Mission Formats
/// </summary>

public class SearchMissionFormatsEndpoint : FastEndpoints.Endpoint<SearchMissionFormatsRequest, List<MissionFormatResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/mission/format/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Mission");
        });

        Summary(s => {
            s.Summary = "Search Mission Formats";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Start, "The starting index in the result set to return. Default is 0.");
            s.RequestParam(r => r.Limit, "The total number of records to return. Default is 20.");
            s.RequestParam(r => r.ActiveOnly, "Determines whether to return only active results. Default is false.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchMissionFormatsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Missions
/// </summary>

public class SearchMissionsEndpoint : FastEndpoints.Endpoint<SearchMissionsRequest, List<MissionResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/mission/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Mission");
        });

        Summary(s => {
            s.Summary = "Search Missions";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.Keyword, "Filter by keyword");
            s.RequestParam(r => r.SubType, "Custom string client apps can use for searching/filtering missions");
            s.RequestParam(r => r.Start, "The index into the record set to start with. Default is 0.");
            s.RequestParam(r => r.Limit, "The total number of record to return. Default is 20, maximum is 100.");
            s.RequestParam(r => r.IncludeGameData, "If true then return the game level data in the response. Default is false.");
            s.RequestParam(r => r.IncludeAudiences, "If true then return the audience data in the response. Default is false.");
            s.RequestParam(r => r.IncludeInactive, "If true then include inactive missions. Default is false.");
            s.RequestParam(r => r.Suffix, "A list of game types to include; click_leaderboard, click_banner, click_skyscraper, click_full, click_video, click_zip, create, vote, question, invite, share, json, xml");
            s.RequestParam(r => r.SortField, "The field to sort the search on (for example TITLE)");
            s.RequestParam(r => r.Descending, "Whether to sort in descending order (default true)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchMissionsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Missions by Billable Entity
/// </summary>

public class SearchMissionsByBillableEntityEndpoint : FastEndpoints.Endpoint<SearchMissionsByBillableEntityRequest, List<MissionResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/mission/searchByBillableEntity");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Mission");
        });

        Summary(s => {
            s.Summary = "Search Missions by Billable Entity";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.Keyword, "Filter by keyword");
            s.RequestParam(r => r.Start, "The index into the record set to start with. Default is 0.");
            s.RequestParam(r => r.Limit, "The total number of record to return. Default id 20.");
            s.RequestParam(r => r.IncludeGameData, "If true then return the game level data in the response. Default is false.");
            s.RequestParam(r => r.IncludeAudiences, "If true then return the audience data in the response. Default is false.");
            s.RequestParam(r => r.IncludeInactive, "If true then include inactive missions. Default is false.");
            s.RequestParam(r => r.Suffix, "A list of game types to include; click_leaderboard, click_banner, click_skyscraper, click_full, click_video, click_zip, create, vote, question, invite, share, json, xml");
            s.RequestParam(r => r.SortField, "The field to sort the search on (for example TITLE)");
            s.RequestParam(r => r.Descending, "Whether to sort in descending order (default true)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchMissionsByBillableEntityRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Mission
/// </summary>

public class UpdateMissionEndpoint : FastEndpoints.Endpoint<UpdateMissionRequest, MissionResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/mission/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Mission");
        });

        Summary(s => {
            s.Summary = "Update Mission";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.MissionId, "The id of the mission to update.");
            s.RequestParam(r => r.Title, "The title of the mission");
            s.RequestParam(r => r.Description, "The description of the mission");
            s.RequestParam(r => r.SubType, "Custom string client apps can use for searching/filtering missions");
            s.RequestParam(r => r.MetaData, "external custom client defined data");
            s.RequestParam(r => r.StartDate, "The date/time to start the mission, send 0 to unset");
            s.RequestParam(r => r.EndDate, "The date/time to end the mission, send 0 to unset");
            s.RequestParam(r => r.Active, "Activate/deactivate the mission");
            s.RequestParam(r => r.GameLevelIds, "the game level ids to include in the mission, comma separated");
            s.RequestParam(r => r.CreativeIds, "");
            s.RequestParam(r => r.AudienceIds, "");
            s.RequestParam(r => r.OfferId, "The offerId to give as a reward");
            s.RequestParam(r => r.Balance, "Replace the amount of money available to spend, once 0 deactivate mission. Set to a negative value for unlimited.");
            s.RequestParam(r => r.AdvancedReporting, "Flag to mark the mission as eligible for advanced reporting");
            s.RequestParam(r => r.AllocateTickets, "Flag to indicate owner should receive tickets for completed missions");
            s.RequestParam(r => r.TicketCount, "The number of tickets to reward");
            s.RequestParam(r => r.TicketType, "The type of ticket to reward, null means default type");
            s.RequestParam(r => r.Points, "The number of points to award for completing a mission");
            s.RequestParam(r => r.ApplicationIds, "Comma separated list of application ids");
            s.RequestParam(r => r.Devices, "Deprecated parameter for device names");
            s.RequestParam(r => r.DeviceIds, "Comma separated list of device ids");
            s.RequestParam(r => r.DeviceVersions, "Comma separated list of device version ranges");
            s.RequestParam(r => r.Locations, "List of lat/long pairs for mission locations");
            s.RequestParam(r => r.Radius, "Comma separated list of radii for locations");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateMissionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

