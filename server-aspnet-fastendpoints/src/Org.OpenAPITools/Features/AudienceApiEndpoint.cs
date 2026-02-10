using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Audience
/// </summary>

public class CreateAudienceEndpoint : FastEndpoints.Endpoint<CreateAudienceRequest, AudienceResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/audience/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Audience");
        });

        Summary(s => {
            s.Summary = "Create Audience";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.Name, "The name of the audience");
            s.RequestParam(r => r.Description, "The description of the audience");
            s.RequestParam(r => r.SearchTags, "The search tags");
            s.RequestParam(r => r.Gender, "The gender; possible values are: MALE, FEMALE, ANY");
            s.RequestParam(r => r.AgeGroups, "The list of age groups, comma separated; possible values are AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS, AGE_ANY (to reset to none)");
            s.RequestParam(r => r.CategoryIds, "The list of category ids, comma separated; possible values are retrieved via /api/{version}/category/search (pass in id values)");
            s.RequestParam(r => r.ApplicationIds, "The list of application ids, comma separated; possible values are retrieved via /api/{version}/application/list (pass in id values)");
            s.RequestParam(r => r.GameExperienceLevel, "The experience level of the player; possible values are: ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT");
            s.RequestParam(r => r.Devices, "(Deprecated) Use deviceIds. The list of targeted device names, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in name values)");
            s.RequestParam(r => r.DeviceIds, "The list of targeted device ids, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in id values)");
            s.RequestParam(r => r.DeviceVersions, "The list of targeted device version ranges that are aligned with the provided devices list, comma separated (examples: 2.3-X, 0-5.1.4, 4.3.1-6.1.4)");
            s.RequestParam(r => r.Locations, "The list of locations to build the center around; comma separated list of latitude/longitude pairs (example: lat1,long1,lat2,long2)");
            s.RequestParam(r => r.Radius, "The list of radius of influence for the audience, in miles; comma separated list. Either provide 1 to be applied to all location pairs or a matching list to each lat/long pair.");
            s.RequestParam(r => r.StartTimeOffset, "Seconds from the start time of an event");
            s.RequestParam(r => r.EndTimeOffset, "Seconds from the end time of an event");
            s.RequestParam(r => r.SendSuggestion, "If true, then notify matching users when they are inside the radius");
            s.RequestParam(r => r.AssociateDescription, "The description of the associated object");
            s.RequestParam(r => r.AssociateType, "The type of the object to center the audience geofence");
            s.RequestParam(r => r.AssociateId, "The ID of the object to center the audience geofence");
            s.RequestParam(r => r.GroupingId, "Optional grouping id for the audience");
            s.RequestParam(r => r.MetaData, "External custom client defined data");
            s.RequestParam(r => r.Visibility, "Visibility of the audience");
            s.RequestParam(r => r.AudienceType, "Type of audience");
            s.RequestParam(r => r.UseOrder, "Use order for cohort");
            s.RequestParam(r => r.CohortRegionsData, "Cohort data for \&quot;cohort\&quot; audience type");
            s.RequestParam(r => r.AppKey, "Filter results by application key");
            s.RequestParam(r => r.TrilaterationTypes, "Trilateration types");
            s.RequestParam(r => r.UniqueName, "If true, makes sure the audience name is unique");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateAudienceRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Audience
/// </summary>

public class DeleteAudienceEndpoint : FastEndpoints.Endpoint<DeleteAudienceRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/audience/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Audience");
        });

        Summary(s => {
            s.Summary = "Delete Audience";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.AudienceId, "The id of the audience to delete.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteAudienceRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Age Groups
/// </summary>

public class GetAgeGroupsEndpoint : FastEndpoints.Endpoint<GetAgeGroupsRequest, List<AgeGroupResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/audience/ageGroups");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Audience");
        });

        Summary(s => {
            s.Summary = "Get Age Groups";
            s.RequestParam(r => r.Version, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetAgeGroupsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Audience
/// </summary>

public class GetAudienceEndpoint : FastEndpoints.Endpoint<GetAudienceRequest, AudienceResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/audience/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Audience");
        });

        Summary(s => {
            s.Summary = "Get Audience";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.AudienceId, "The id of the audience to return.");
            s.RequestParam(r => r.AppKey, "The application key (optional). If provided, results may be scoped to this application.");
            s.RequestParam(r => r.ReturnAccountCount, "(boolean) set to true to include the accountCount associated with current audience of the current app");
            s.RequestParam(r => r.ReturnAlbumCount, "(boolean) set to true to include the albumCount associated with current audience of the current app");
            s.RequestParam(r => r.AlbumTypesForCount, "(String) comma separated list, return an array with each item is the count of each album type. If not provided, \&quot;all_types\&quot; count is returned.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetAudienceRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Audiences
/// </summary>

public class GetAudienceListEndpoint : FastEndpoints.Endpoint<GetAudienceListRequest, List<SearchResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/audience/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Audience");
        });

        Summary(s => {
            s.Summary = "Search Audiences";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.AlbumIds, "Comma separated list of album IDs to filter results with");
            s.RequestParam(r => r.Keyword, "The keyword used to search");
            s.RequestParam(r => r.KeywordFields, "Comma separated list of fields that the keywords will match against. Possible values include: SEARCH_TAGS, NAME, DESCRIPTION, OWNER_DISPLAY");
            s.RequestParam(r => r.SortField, "The field to sort by, possible values include: {ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, OWNER_ID, OWNER_DISPLAY, GENDER}");
            s.RequestParam(r => r.Descending, "The order to return the results. Default is false, which will return the results in ascending order.");
            s.RequestParam(r => r.Start, "The index into the record set to start with.");
            s.RequestParam(r => r.Limit, "The total number of record to return (there is a hard limit of 100).");
            s.RequestParam(r => r.SendSuggestion, "Filter results based on whether or not the audience is set to send suggestions");
            s.RequestParam(r => r.ActiveOnly, "Determines whether to return only active results. Default is false.");
            s.RequestParam(r => r.GroupByGroupingId, "Groups results by the audience groupingId (this does not work in conjunction with the following parameters: albumIds, audienceType, appKey, returnGlobal)");
            s.RequestParam(r => r.AppKey, "Filter results by application key");
            s.RequestParam(r => r.ReturnGlobal, "If filtering by appKey, determines whether or not audiences that do not have an application set will also be returned as well");
            s.RequestParam(r => r.ExactKeyword, "If true, match keyword exactly");
            s.RequestParam(r => r.AudienceType, "(Deprecated) Filter results by audience type");
            s.RequestParam(r => r.AudienceTypes, "comma separated string with the different audience types you want to filter for");
            s.RequestParam(r => r.ReturnAccountCount, "(boolean) set to true to include the accountCount associated with current audience of the current app");
            s.RequestParam(r => r.ReturnAlbumCount, "(boolean) set to true to include the albumCount associated with current audience of the current app");
            s.RequestParam(r => r.AlbumTypesForCount, "(String) comma separated list, return an array with each item is the count of each album type. If not provided, \&quot;all_types\&quot; count is returned.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetAudienceListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Devices
/// </summary>

public class GetDevicesEndpoint : FastEndpoints.Endpoint<GetDevicesRequest, List<AudienceDeviceResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/audience/devices");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Audience");
        });

        Summary(s => {
            s.Summary = "Get Devices";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.IncludeInactive, "If true return inactive record as well. default is false.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetDevicesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Experiences
/// </summary>

public class GetExperiencesEndpoint : FastEndpoints.Endpoint<GetExperiencesRequest, SirqulResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/audience/experiences");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Audience");
        });

        Summary(s => {
            s.Summary = "Get Experiences";
            s.RequestParam(r => r.Version, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetExperiencesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get GroupedAudiences
/// </summary>

public class GetGroupedAudiencesEndpoint : FastEndpoints.Endpoint<GetGroupedAudiencesRequest, AudienceResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/audience/grouped/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Audience");
        });

        Summary(s => {
            s.Summary = "Get GroupedAudiences";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.AudienceGroupingId, "The audience grouping id to return.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetGroupedAudiencesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List Suggestions by Audience
/// </summary>

public class ListByAccountEndpoint : FastEndpoints.Endpoint<ListByAccountRequest, OfferListResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/audience/suggestion/list");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Audience");
        });

        Summary(s => {
            s.Summary = "List Suggestions by Audience";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account to match offers for.");
            s.RequestParam(r => r.Limit, "the limit of the index");
            s.RequestParam(r => r.SuggestionType, "the type of suggestion");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ListByAccountRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List Offers by Audience
/// </summary>

public class ListByAudienceEndpoint : FastEndpoints.Endpoint<ListByAudienceRequest, OfferListResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/audience/suggestion/offersByAudience");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Audience");
        });

        Summary(s => {
            s.Summary = "List Offers by Audience";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Limit, "this is the limit of the index");
            s.RequestParam(r => r.Gender, "this is the gender to list offers by");
            s.RequestParam(r => r.Age, "this is the age to list offers by");
            s.RequestParam(r => r.CategoryIds, "this is the category IDs to list offers by");
            s.RequestParam(r => r.Latitude, "this is the latitude to list offers by");
            s.RequestParam(r => r.Longitude, "this is the longitude to list offers by");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ListByAudienceRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List Sent Suggestions 
/// </summary>

public class ListLastestByAccountEndpoint : FastEndpoints.Endpoint<ListLastestByAccountRequest, OfferListResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/audience/suggestion/latest");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Audience");
        });

        Summary(s => {
            s.Summary = "List Sent Suggestions ";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account to match offers for.");
            s.RequestParam(r => r.Timeframe, "The timeframe in seconds of the latest suggestions");
            s.RequestParam(r => r.SuggestionType, "The type of trigger suggestions to return");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ListLastestByAccountRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Send Suggestions
/// </summary>

public class SendByAccountEndpoint : FastEndpoints.Endpoint<SendByAccountRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/audience/suggestion/send");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Audience");
        });

        Summary(s => {
            s.Summary = "Send Suggestions";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account to match offers for.");
            s.RequestParam(r => r.Latitude, "the latitude");
            s.RequestParam(r => r.Longitude, "the longitude");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SendByAccountRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Audience
/// </summary>

public class UpdateAudienceEndpoint : FastEndpoints.Endpoint<UpdateAudienceRequest, AudienceResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/audience/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Audience");
        });

        Summary(s => {
            s.Summary = "Update Audience";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.AudienceId, "The id of the audience to update.");
            s.RequestParam(r => r.Name, "The name of the audience");
            s.RequestParam(r => r.Description, "The description of the audience");
            s.RequestParam(r => r.SearchTags, "The search tags");
            s.RequestParam(r => r.Gender, "The gender; possible values are: MALE, FEMALE, ANY");
            s.RequestParam(r => r.AgeGroups, "The list of age groups, comma separated; possible values are AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS, AGE_ANY (to reset to none)");
            s.RequestParam(r => r.CategoryIds, "The list of category ids, comma separated; possible values are retrieved via /api/{version}/category/search (pass in id values)");
            s.RequestParam(r => r.ApplicationIds, "The list of application ids, comma separated; possible values are retrieved via /api/{version}/application/list (pass in id values)");
            s.RequestParam(r => r.GameExperienceLevel, "The experience level of the player; possible values are: ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT");
            s.RequestParam(r => r.Devices, "(Deprecated) Use deviceIds. The list of targeted device names, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in name values)");
            s.RequestParam(r => r.DeviceIds, "The list of targeted device ids, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in id values)");
            s.RequestParam(r => r.DeviceVersions, "The list of targeted device version ranges that are aligned with the provided devices list, comma separated (examples: 2.3-X, 0-5.1.4, 4.3.1-6.1.4)");
            s.RequestParam(r => r.Locations, "The list of locations to build the center around; comma separated list of latitude/longitude pairs (example: lat1,long1,lat2,long2)");
            s.RequestParam(r => r.Radius, "The list of radius of influence for the audience, in miles; comma separated list. Either provide 1 to be applied to all location pairs or a matching list to each lat/long pair.");
            s.RequestParam(r => r.Active, "if audience is active");
            s.RequestParam(r => r.SendSuggestion, "If true, then notify matching users when they are inside the radius");
            s.RequestParam(r => r.StartTimeOffset, "Seconds from the start time of an event");
            s.RequestParam(r => r.EndTimeOffset, "Seconds from the end time of an event");
            s.RequestParam(r => r.AssociateDescription, "the associate description");
            s.RequestParam(r => r.AssociateType, "The type of the object to center the audience geofence");
            s.RequestParam(r => r.AssociateId, "The ID of the object to center the audience geofence");
            s.RequestParam(r => r.GroupingId, "Optional grouping id for the audience");
            s.RequestParam(r => r.MetaData, "External custom client defined data");
            s.RequestParam(r => r.Visibility, "Visibility of the audience");
            s.RequestParam(r => r.AudienceType, "Type of audience");
            s.RequestParam(r => r.UseOrder, "Use order for cohort");
            s.RequestParam(r => r.CohortRegionsData, "Cohort data for \&quot;cohort\&quot; audience type");
            s.RequestParam(r => r.AppKey, "Filter results by application key");
            s.RequestParam(r => r.TrilaterationTypes, "Trilateration types");
            s.RequestParam(r => r.UniqueName, "If true, makes sure the audience name is unique");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateAudienceRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

