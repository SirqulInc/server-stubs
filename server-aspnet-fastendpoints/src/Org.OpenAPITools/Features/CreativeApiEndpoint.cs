using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Add Preview
/// </summary>

public class AddPreviewEndpoint : FastEndpoints.Endpoint<AddPreviewRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/creative/addpreview");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Creative");
        });

        Summary(s => {
            s.Summary = "Add Preview";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the account");
            s.RequestParam(r => r.CreativeId, "The id of the creative that want to enable preview. The type of the creative should be CONFIG, otherwise no action will be applied.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AddPreviewRequest req, CancellationToken ct)
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

public class AdsFindEndpoint : FastEndpoints.Endpoint<AdsFindRequest, List<MissionResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/ads/find");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Creative");
        });

        Summary(s => {
            s.Summary = "Find Missions";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "The application key, if provided return missions specific for the app. Will always return mission levels that are app agnostic.");
            s.RequestParam(r => r.Randomize, "return a random set of results, default is true. If false returns in nature order.");
            s.RequestParam(r => r.TargetedAdsOnly, "return only ads targets to the specific app, no global ads.");
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
            s.RequestParam(r => r.IncludeAudiences, "If true then return the audience data in the response. Default is false.");
            s.RequestParam(r => r.AllocatesTickets, "If true/false only return missions whose game levels allocate (or don&#39;t allocate) tickets. Do not provide a value to return both.");
            s.RequestParam(r => r.MissionIds, "return only ads from the specified campaigns.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AdsFindRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Creative
/// </summary>

public class CreateCreativeEndpoint : FastEndpoints.Endpoint<CreateCreativeRequest, CreativeResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/creative/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Creative");
        });

        Summary(s => {
            s.Summary = "Create Creative";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.Name, "The name of the level.");
            s.RequestParam(r => r.Active, "If true set the game level as active. Default is false.");
            s.RequestParam(r => r.WaitForAsset, "determines whether the response will wait until the asset gets created");
            s.RequestParam(r => r.Description, "The description of the level.");
            s.RequestParam(r => r.AssetImageId, "The asset Id of the level image.");
            s.RequestParam(r => r.Action, "This parameter is deprecated. deprecated use data field");
            s.RequestParam(r => r.Data, "The creative data, json based format depending on type. If not using action then data is required.");
            s.RequestParam(r => r.Suffix, "This parameter is deprecated. deprecated use type field");
            s.RequestParam(r => r.Type, "The type of creative. If not using suffix then type is required.");
            s.RequestParam(r => r.Balance, "Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.");
            s.RequestParam(r => r.ReferenceId, "if creative related so some other content provided the id");
            s.RequestParam(r => r.AppVersion, "The version of the application, will not return creatives newer than the appVersion. Only used when requesting application configuration creatives.");
            s.RequestParam(r => r.MissionId, "Assign the creative to a campaign for timing and audience matching.");
            s.RequestParam(r => r.OfferId, "the id of the offer");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateCreativeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Creative
/// </summary>

public class DeleteCreativeEndpoint : FastEndpoints.Endpoint<DeleteCreativeRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/creative/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Creative");
        });

        Summary(s => {
            s.Summary = "Delete Creative";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.CreativeId, "the id of the creative to delete");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteCreativeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Creative
/// </summary>

public class GetCreativeEndpoint : FastEndpoints.Endpoint<GetCreativeRequest, CreativeResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/creative/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Creative");
        });

        Summary(s => {
            s.Summary = "Get Creative";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.CreativeId, "the ID of the creative to get");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetCreativeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Creatives
/// </summary>

public class GetCreativesByApplicationEndpoint : FastEndpoints.Endpoint<GetCreativesByApplicationRequest, List<CreativeResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/creative/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Creative");
        });

        Summary(s => {
            s.Summary = "Search Creatives";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.Start, "Start the result set at some index.");
            s.RequestParam(r => r.Limit, "Limit the result to some number.");
            s.RequestParam(r => r.MissionId, "Creatives contained in the provided mission.");
            s.RequestParam(r => r.Keyword, "Match the keyword to the owner name or level name.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetCreativesByApplicationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Remove Preview
/// </summary>

public class RemovePreviewEndpoint : FastEndpoints.Endpoint<RemovePreviewRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/creative/removepreview");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Creative");
        });

        Summary(s => {
            s.Summary = "Remove Preview";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the ID of the logged in user");
            s.RequestParam(r => r.CreativeId, "the ID of the creative to remove preview");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RemovePreviewRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Creative
/// </summary>

public class UpdateCreativeEndpoint : FastEndpoints.Endpoint<UpdateCreativeRequest, CreativeResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/creative/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Creative");
        });

        Summary(s => {
            s.Summary = "Update Creative";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.CreativeId, "the creative Id to upate.");
            s.RequestParam(r => r.Name, "The name of the level.");
            s.RequestParam(r => r.Description, "The description of the level.");
            s.RequestParam(r => r.AssetImageId, "The asset Id of the level image.");
            s.RequestParam(r => r.Action, "This parameter is deprecated. deprecated use data field");
            s.RequestParam(r => r.Data, "The creative data, json based format depending on type");
            s.RequestParam(r => r.Suffix, "This parameter is deprecated. deprecated use type field");
            s.RequestParam(r => r.Type, "The type of creative.");
            s.RequestParam(r => r.Balance, "Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.");
            s.RequestParam(r => r.Active, "If true set the game level as active. Default is false.");
            s.RequestParam(r => r.ReferenceId, "if creative related so some other content provided the id");
            s.RequestParam(r => r.AppVersion, "The version of the application, will not return creatives newer than the appVersion. Only used when requesting application configuration creatives.");
            s.RequestParam(r => r.MissionId, "Assign the creative to a campaign for timing and audience matching.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateCreativeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

