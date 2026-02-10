using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create AppConfig
/// </summary>

public class CreateApplicationConfigEndpoint : FastEndpoints.Endpoint<CreateApplicationConfigRequest, ApplicationConfigResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/appconfig/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Application Config");
        });

        Summary(s => {
            s.Summary = "Create AppConfig";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account ID of the user");
            s.RequestParam(r => r.AppKey, "The application key that the newly created applicationConfig will be associated to");
            s.RequestParam(r => r.ConfigVersion, "The application configuration, has to be unique within the application");
            s.RequestParam(r => r.AssetId, "The json assetId that stores the configuration detail.");
            s.RequestParam(r => r.RetailerId, "The retailer id for retailer specific configurations");
            s.RequestParam(r => r.RetailerLocationId, "The retailer location id for retailer location specific configurations");
            s.RequestParam(r => r.Udid, "The device udid for device specific configurations");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateApplicationConfigRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete AppConfig
/// </summary>

public class DeleteApplicationConfigEndpoint : FastEndpoints.Endpoint<DeleteApplicationConfigRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/appconfig/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Application Config");
        });

        Summary(s => {
            s.Summary = "Delete AppConfig";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account ID of the user");
            s.RequestParam(r => r.ConfigId, "The config ID of the application configuration to delete");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteApplicationConfigRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get AppConfig
/// </summary>

public class GetApplicationConfigEndpoint : FastEndpoints.Endpoint<GetApplicationConfigRequest, ApplicationConfigResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/appconfig/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Application Config");
        });

        Summary(s => {
            s.Summary = "Get AppConfig";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account ID of the user");
            s.RequestParam(r => r.ConfigId, "The config ID of the application configuration");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetApplicationConfigRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get AppConfig by Version
/// </summary>

public class GetApplicationConfigByConfigVersionEndpoint : FastEndpoints.Endpoint<GetApplicationConfigByConfigVersionRequest, ApplicationConfigResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/appconfig/getbyversion");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Application Config");
        });

        Summary(s => {
            s.Summary = "Get AppConfig by Version";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.ConfigVersion, "The version of the application configuration");
            s.RequestParam(r => r.RetailerId, "Only returns the config that matches the given retailer");
            s.RequestParam(r => r.RetailerLocationId, "Only returns the config that matches the given retailer location");
            s.RequestParam(r => r.Udid, "Only returns only returns the config that matches the given device udid");
            s.RequestParam(r => r.AllowOlderVersions, "Determines whether to return older config versions if the exact version is not found. If this happens, will try to return the latest version.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetApplicationConfigByConfigVersionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search AppConfigs
/// </summary>

public class SearchApplicationConfigEndpoint : FastEndpoints.Endpoint<SearchApplicationConfigRequest, List<ApplicationConfigResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/appconfig/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Application Config");
        });

        Summary(s => {
            s.Summary = "Search AppConfigs";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account ID of the user");
            s.RequestParam(r => r.AppKey, "The application key to filter results by application Leaving this empty will return all application configurations for all applications (executive user only)");
            s.RequestParam(r => r.RetailerId, "Only returns the configs that matches the given retailer");
            s.RequestParam(r => r.RetailerLocationId, "Only returns the configs that matches the given retailer location");
            s.RequestParam(r => r.Udid, "Only returns only returns the configs that matches the given device udid");
            s.RequestParam(r => r.ConfigVersion, "Config Version");
            s.RequestParam(r => r.SortField, "Orders the results by: CREATED, UPDATED, ACTIVE, APPLICATION_ID,  APPLICATION_KEY, APPLICATION_NAME, RETAILER_NAME, RETAILER_ID, RETAILER_LOCATION_NAME,  RETAILER_LOCATION_ID, OFFER_TITLE, OFFER_ID, OFFER_LOCATION_ID, CONFIG_VERSION_MINOR,  CONFIG_VERSION_MAJOR, CONFIG_VERSION_INDEX ");
            s.RequestParam(r => r.Descending, "Determines whether the results are in descending or ascending order");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination (There is a hard limit of 100)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchApplicationConfigRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update AppConfig
/// </summary>

public class UpdateApplicationConfigEndpoint : FastEndpoints.Endpoint<UpdateApplicationConfigRequest, ApplicationConfigResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/appconfig/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Application Config");
        });

        Summary(s => {
            s.Summary = "Update AppConfig";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account ID of the user");
            s.RequestParam(r => r.ConfigId, "The config ID of the application configuration to update");
            s.RequestParam(r => r.AppKey, "The application key that the updated applicationConfig will be associated to");
            s.RequestParam(r => r.ConfigVersion, "The application configuration, has to be unique within the application");
            s.RequestParam(r => r.AssetId, "The json assetId that stores the configuration detail.");
            s.RequestParam(r => r.RetailerId, "The retailer id for retailer specific configurations");
            s.RequestParam(r => r.RetailerLocationId, "The retailer location id for retailer location specific configurations");
            s.RequestParam(r => r.Udid, "The device udid for device specific configurations");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateApplicationConfigRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

