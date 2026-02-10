using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Listing
/// </summary>

public class CreateListingEndpoint : FastEndpoints.Endpoint<CreateListingRequest, ListingFullResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/listing/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Listing");
        });

        Summary(s => {
            s.Summary = "Create Listing";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the user&#39;s account ID");
            s.RequestParam(r => r.Name, "the name of the listing");
            s.RequestParam(r => r.FilterIds, "comma separated list of filter IDs");
            s.RequestParam(r => r.Description, "the description of the listing");
            s.RequestParam(r => r.Start, "the start date of the listing");
            s.RequestParam(r => r.End, "the end date of the listing");
            s.RequestParam(r => r.LocationName, "the name of the location the listing will be held at");
            s.RequestParam(r => r.LocationDescription, "the description of the location the listing will be held at");
            s.RequestParam(r => r.IsPrivate, "determines whether the listing is public or private");
            s.RequestParam(r => r.ExternalId, "external identifier used by a third party");
            s.RequestParam(r => r.ExternalId2, "secondary external identifier used by a third party");
            s.RequestParam(r => r.ExternalGroupId, "external group identifier used by a third party");
            s.RequestParam(r => r.Active, "Sets the active flag");
            s.RequestParam(r => r.MetaData, "external custom client defined data");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateListingRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Listing
/// </summary>

public class DeleteListingEndpoint : FastEndpoints.Endpoint<DeleteListingRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/listing/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Listing");
        });

        Summary(s => {
            s.Summary = "Delete Listing";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.ListingId, "the id of the listing to delete");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteListingRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Listing
/// </summary>

public class GetListingEndpoint : FastEndpoints.Endpoint<GetListingRequest, ListingFullResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/listing/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Listing");
        });

        Summary(s => {
            s.Summary = "Get Listing";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ListingId, "the id of the listing to get");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetListingRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Listings
/// </summary>

public class SearchListingEndpoint : FastEndpoints.Endpoint<SearchListingRequest, List<ListingResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/listing/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Listing");
        });

        Summary(s => {
            s.Summary = "Search Listings";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account id of the user");
            s.RequestParam(r => r.Keyword, "search the event name and description for this keyword");
            s.RequestParam(r => r.Start, "the record to begin the return set on");
            s.RequestParam(r => r.Limit, "the number of records to return");
            s.RequestParam(r => r.ActiveOnly, "whether to search on active listings only");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.RequestParam(r => r.StartDate, "the start date to search from");
            s.RequestParam(r => r.EndDate, "the end date to search to");
            s.RequestParam(r => r.CategoryIds, "only return items of these categories");
            s.RequestParam(r => r.FilterIds, "");
            s.RequestParam(r => r.UseListingOrderIds, "determines whether to use configured listing order ids");
            s.RequestParam(r => r.ExternalId, "external identifier used by a third party");
            s.RequestParam(r => r.ExternalId2, "secondary external identifier used by a third party");
            s.RequestParam(r => r.ExternalGroupId, "external group identifier used by a third party");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchListingRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Summary Listing
/// </summary>

public class SummaryListingEndpoint : FastEndpoints.Endpoint<SummaryListingRequest, List<ListingGroupResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/listing/summary");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Listing");
        });

        Summary(s => {
            s.Summary = "Summary Listing";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account id of the user");
            s.RequestParam(r => r.StartDate, "the start date to search from");
            s.RequestParam(r => r.CategoryIds, "the list of categories to search on");
            s.RequestParam(r => r.DaysToInclude, "how far out to search, in days");
            s.RequestParam(r => r.UseListingOrderIds, "determines whether to use configured listing order ids");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SummaryListingRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Listing
/// </summary>

public class UpdateListingEndpoint : FastEndpoints.Endpoint<UpdateListingRequest, ListingFullResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/listing/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Listing");
        });

        Summary(s => {
            s.Summary = "Update Listing";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the user&#39;s account ID");
            s.RequestParam(r => r.ListingId, "the listing to update");
            s.RequestParam(r => r.FilterIds, "comma separated list of filter IDs");
            s.RequestParam(r => r.Name, "the name of the listing");
            s.RequestParam(r => r.Description, "the description of the listing");
            s.RequestParam(r => r.Start, "the start date of the listing");
            s.RequestParam(r => r.End, "the end date of the listing");
            s.RequestParam(r => r.LocationName, "the name of the location the listing will be held at");
            s.RequestParam(r => r.LocationDescription, "the description of the location the listing will be held at");
            s.RequestParam(r => r.IsPrivate, "determines whether the listing is public or private");
            s.RequestParam(r => r.ExternalId, "external identifier used by a third party");
            s.RequestParam(r => r.ExternalId2, "secondary external identifier used by a third party");
            s.RequestParam(r => r.ExternalGroupId, "external group identifier used by a third party");
            s.RequestParam(r => r.Active, "Sets the active flag");
            s.RequestParam(r => r.MetaData, "external custom client defined data");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateListingRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

