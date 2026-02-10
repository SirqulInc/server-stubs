using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Attend Event
/// </summary>

public class AttendEventEndpoint : FastEndpoints.Endpoint<AttendEventRequest, OfferResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/event/attend");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Event");
        });

        Summary(s => {
            s.Summary = "Attend Event";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id (deviceId or accountId required)");
            s.RequestParam(r => r.AppKey, "The application of where to send notifications about the attend action");
            s.RequestParam(r => r.ListingId, "The scheduled broadcast or marketing experience id");
            s.RequestParam(r => r.RetailerLocationId, "The retailer location where the event is being held");
            s.RequestParam(r => r.OfferLocationId, "The actual event being held");
            s.RequestParam(r => r.TransactionId, "The wallet item to update the status of, if provided then ignore the listingId, retailerLocationId, and the offerLocationId");
            s.RequestParam(r => r.Status, "Sets whether the user is: undecided (0), attending (1), attending and checked in (2), or not attending (3)");
            s.RequestParam(r => r.Latitude, "The location of the status update");
            s.RequestParam(r => r.Longitude, "The location of the status update");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AttendEventRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Event
/// </summary>

public class CreateEventEndpoint : FastEndpoints.Endpoint<CreateEventRequest, OfferResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/event/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Event");
        });

        Summary(s => {
            s.Summary = "Create Event";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.Title, "The event title");
            s.RequestParam(r => r.RetailerLocationIds, "The retailer location to have the event at");
            s.RequestParam(r => r.SubTitle, "The event sub title");
            s.RequestParam(r => r.Details, "The event details");
            s.RequestParam(r => r.CategoryIds, "The categories the associate the event with");
            s.RequestParam(r => r.FilterIds, "The filters the associate the event with");
            s.RequestParam(r => r.Active, "Is this event active");
            s.RequestParam(r => r.ImageAssetId, "The image to show for the event");
            s.RequestParam(r => r.RedeemableStart, "The event start date/time");
            s.RequestParam(r => r.RedeemableEnd, "The event end date/time");
            s.RequestParam(r => r.MetaData, "external custom client defined data");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateEventRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Event
/// </summary>

public class DeleteEventEndpoint : FastEndpoints.Endpoint<DeleteEventRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/event/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Event");
        });

        Summary(s => {
            s.Summary = "Delete Event";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.EventId, "the id of the event to update");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteEventRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Event
/// </summary>

public class GetEventEndpoint : FastEndpoints.Endpoint<GetEventRequest, OfferResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/event/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Event");
        });

        Summary(s => {
            s.Summary = "Get Event";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.EventId, "The id of the event to return");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetEventRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Event Attendance
/// </summary>

public class SearchEventTransactionsEndpoint : FastEndpoints.Endpoint<SearchEventTransactionsRequest, List<EventAttendanceResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/event/attendance/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Event");
        });

        Summary(s => {
            s.Summary = "Search Event Attendance";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.Keyword, "The keyword to search for");
            s.RequestParam(r => r.RetailerId, "Filter results for this retailer");
            s.RequestParam(r => r.RetailerLocationId, "Filter results for this retailer location");
            s.RequestParam(r => r.ExcludeRetailerLocationId, "Exclude results from this retailer location");
            s.RequestParam(r => r.ListingId, "Filter results for this event listing");
            s.RequestParam(r => r.OfferId, "Filter results for this offer");
            s.RequestParam(r => r.OfferLocationId, "Filter results for this offer location");
            s.RequestParam(r => r.CustomerAccountIds, "Filter results by accounts");
            s.RequestParam(r => r.AffiliatedCategoryIds, "Comma separated list of category ids to determine whether the attendee is affiliated with the category");
            s.RequestParam(r => r.StartDate, "Filter on attendance starting on or after this date (milliseconds since epoch)");
            s.RequestParam(r => r.EndDate, "Filter on attendance starting on or before this date (milliseconds since epoch)");
            s.RequestParam(r => r.Statuses, "Comma separated list of transaction statuses to filter on");
            s.RequestParam(r => r.SortField, "Determines what to sort the results by {CREATED, UPDATED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY}");
            s.RequestParam(r => r.Descending, "Determines whether the results are in descending order");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchEventTransactionsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Events
/// </summary>

public class SearchEventsEndpoint : FastEndpoints.Endpoint<SearchEventsRequest, List<OfferShortResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/event/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Event");
        });

        Summary(s => {
            s.Summary = "Search Events";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.Keyword, "The keyword used to search");
            s.RequestParam(r => r.ActiveOnly, "Return only active results");
            s.RequestParam(r => r.CategoryIds, "the IDs of the categories that this event is associated with");
            s.RequestParam(r => r.FilterIds, "the IDs of the filters that this event is associated with");
            s.RequestParam(r => r.OfferAudienceIds, "Offer audience ids to filter on");
            s.RequestParam(r => r.TransactionAudienceIds, "Transaction audience ids to filter on");
            s.RequestParam(r => r.SortField, "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY");
            s.RequestParam(r => r.Descending, "The order to return the search results");
            s.RequestParam(r => r.StartDate, "Filter the events to return only those that start on or after the date");
            s.RequestParam(r => r.EndDate, "Filter the events to return only those that start on or before the date");
            s.RequestParam(r => r.Start, "The record to begin the return set on");
            s.RequestParam(r => r.Limit, "The number of records to return");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchEventsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Event
/// </summary>

public class UpdateEventEndpoint : FastEndpoints.Endpoint<UpdateEventRequest, OfferResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/event/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Event");
        });

        Summary(s => {
            s.Summary = "Update Event";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.EventId, "The id of the event to update");
            s.RequestParam(r => r.RetailerLocationIds, "The retailer location to have the event at");
            s.RequestParam(r => r.Title, "The event title");
            s.RequestParam(r => r.SubTitle, "The event sub title");
            s.RequestParam(r => r.Details, "The event details");
            s.RequestParam(r => r.CategoryIds, "The categories the associate the event with");
            s.RequestParam(r => r.FilterIds, "The filters the associate the event with");
            s.RequestParam(r => r.Active, "Is this event active");
            s.RequestParam(r => r.ImageAssetId, "The image to show for the event");
            s.RequestParam(r => r.RedeemableStart, "The event start date/time");
            s.RequestParam(r => r.RedeemableEnd, "The event end date/time");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateEventRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

