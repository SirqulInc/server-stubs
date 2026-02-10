using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Retailer
/// </summary>

public class CreateRetailerEndpoint : FastEndpoints.Endpoint<CreateRetailerRequest, RetailerFullResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/retailer/create");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Retailer");
        });

        Summary(s => {
            s.Summary = "Create Retailer";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Name, "The name of the retailer");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.StreetAddress, "The street address of the retailer");
            s.RequestParam(r => r.StreetAddress2, "Additional address information (such as a suite number, floor number, building name, or PO Box)");
            s.RequestParam(r => r.City, "The city of the retailer");
            s.RequestParam(r => r.State, "The state of the retailer");
            s.RequestParam(r => r.PostalCode, "The postal code of the retailer");
            s.RequestParam(r => r.Country, "the country of the retailer");
            s.RequestParam(r => r.BusinessPhone, "The business phone number of the retailer");
            s.RequestParam(r => r.BusinessPhoneExt, "The business phone extension of the retailer");
            s.RequestParam(r => r.Website, "The website of the retailer");
            s.RequestParam(r => r.Email, "The email of the retailer");
            s.RequestParam(r => r.FacebookUrl, "The facebook URL of the retailer");
            s.RequestParam(r => r.TwitterUrl, "The twitter URL of the retailer");
            s.RequestParam(r => r.Logo, "The retailer logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)");
            s.RequestParam(r => r.LogoAssetId, "The retailer logo asset id");
            s.RequestParam(r => r.Picture1, "Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)");
            s.RequestParam(r => r.Picture1AssetId, "An asset id");
            s.RequestParam(r => r.Picture2, "Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)");
            s.RequestParam(r => r.Picture2AssetId, "An asset id");
            s.RequestParam(r => r.CategoryIds, "Comma separated list of category IDs used to filter retailers by categories");
            s.RequestParam(r => r.CategoryIdsToAdd, "Comma separated list of category IDs to add to the retailer");
            s.RequestParam(r => r.CategoryIdsToRemove, "Comma separated list of category IDs to remove from the retailer");
            s.RequestParam(r => r.FilterIds, "Comma separated list of filter IDs used to filter retailers");
            s.RequestParam(r => r.Latitude, "the latitude of the retailer");
            s.RequestParam(r => r.Longitude, "the longitude of the retailer");
            s.RequestParam(r => r.MetaData, "External custom client defined data");
            s.RequestParam(r => r.SearchTags, "External custom search keywords");
            s.RequestParam(r => r.RetailerType, "External custom type identifier");
            s.RequestParam(r => r.Visibility, "");
            s.RequestParam(r => r.CreateDefaultLocation, "Determines whether to create a default location using the retailer information");
            s.RequestParam(r => r.ResponseFormat, "The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateRetailerRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Retailer
/// </summary>

public class DeleteRetailerEndpoint : FastEndpoints.Endpoint<DeleteRetailerRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/retailer/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Retailer");
        });

        Summary(s => {
            s.Summary = "Delete Retailer";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account used to perform the delete, must have rights to edit the retailer.");
            s.RequestParam(r => r.RetailerId, "The ID of the retailer to be deleted");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteRetailerRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Retailer
/// </summary>

public class GetRetailerEndpoint : FastEndpoints.Endpoint<GetRetailerRequest, RetailerFullResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/retailer/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Retailer");
        });

        Summary(s => {
            s.Summary = "Get Retailer";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RetailerId, "the ID of the retailer");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.IncludeCounts, "Determines whether to include counts in the response (default true)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetRetailerRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Retailers
/// </summary>

public class GetRetailersEndpoint : FastEndpoints.Endpoint<GetRetailersRequest, List<RetailerResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/retailer/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Retailer");
        });

        Summary(s => {
            s.Summary = "Search Retailers";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Visibility, "");
            s.RequestParam(r => r.SortField, "The column to sort the search on");
            s.RequestParam(r => r.Descending, "The order to return the search results");
            s.RequestParam(r => r.Start, "The record to begin the return set on");
            s.RequestParam(r => r.Limit, "The number of records to return");
            s.RequestParam(r => r.ActiveOnly, "Return only active results");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Q, "This parameter is deprecated.");
            s.RequestParam(r => r.Keyword, "The keyword used to search");
            s.RequestParam(r => r.CategoryIds, "the categories that the retailer is associated with");
            s.RequestParam(r => r.FilterIds, "the filters that the retailer is associated with");
            s.RequestParam(r => r.I, "This parameter is deprecated.");
            s.RequestParam(r => r.L, "This parameter is deprecated.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetRetailersRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Login Retailer
/// </summary>

public class RetailerLoginCheckEndpoint : FastEndpoints.Endpoint<RetailerLoginCheckRequest, AccountLoginResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/retailer/login");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Retailer");
        });

        Summary(s => {
            s.Summary = "Login Retailer";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Username, "the user&#39;s email address they used to sign-up");
            s.RequestParam(r => r.Password, "the password");
            s.RequestParam(r => r.DeviceId, "the device id (optional)");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.RequestParam(r => r.AppKey, "the application key");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RetailerLoginCheckRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Retailer
/// </summary>

public class UpdateRetailerEndpoint : FastEndpoints.Endpoint<UpdateRetailerRequest, RetailerFullResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/retailer/update");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Retailer");
        });

        Summary(s => {
            s.Summary = "Update Retailer";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RetailerId, "The ID of the retailer to update");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Name, "The name of the retailer");
            s.RequestParam(r => r.StreetAddress, "The street address of the retailer");
            s.RequestParam(r => r.StreetAddress2, "Additional address information (such as a suite number, floor number, building name, or PO Box)");
            s.RequestParam(r => r.City, "The city of the retailer");
            s.RequestParam(r => r.State, "The state of the retailer");
            s.RequestParam(r => r.PostalCode, "The postal code of the retailer");
            s.RequestParam(r => r.Country, "the country of the retailer");
            s.RequestParam(r => r.BusinessPhone, "The business phone of the retailer");
            s.RequestParam(r => r.BusinessPhoneExt, "The business phone extension of the retailer");
            s.RequestParam(r => r.Website, "The website of the retailer");
            s.RequestParam(r => r.Email, "The email of the retailer");
            s.RequestParam(r => r.FacebookUrl, "The facebook URL of the retailer");
            s.RequestParam(r => r.TwitterUrl, "The twitter URL of the retailer");
            s.RequestParam(r => r.Logo, "The retailer logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)");
            s.RequestParam(r => r.LogoAssetId, "The retailer logo asset id");
            s.RequestParam(r => r.Picture1, "Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)");
            s.RequestParam(r => r.Picture1AssetId, "An asset id");
            s.RequestParam(r => r.Picture2, "Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)");
            s.RequestParam(r => r.Picture2AssetId, "An asset id");
            s.RequestParam(r => r.CategoryIds, "Comma separated list of category IDs used to filter retailers by categories");
            s.RequestParam(r => r.FilterIds, "Comma separated list of filter IDs used to filter retailers");
            s.RequestParam(r => r.Latitude, "the latitude of the retailer");
            s.RequestParam(r => r.Longitude, "the longitude of the retailer");
            s.RequestParam(r => r.MetaData, "External custom client defined data");
            s.RequestParam(r => r.SearchTags, "External custom search keywords");
            s.RequestParam(r => r.RetailerType, "External custom type identifier");
            s.RequestParam(r => r.Visibility, "");
            s.RequestParam(r => r.Active, "Sets whether the retailer is active or inactive (hidden from consumers)");
            s.RequestParam(r => r.ResponseFormat, "The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateRetailerRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

