using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Reservation
/// </summary>

public class CreateReservationEndpoint : FastEndpoints.Endpoint<CreateReservationRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/reservation/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Reservation");
        });

        Summary(s => {
            s.Summary = "Create Reservation";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.StartDate, "The start date");
            s.RequestParam(r => r.EndDate, "The end date");
            s.RequestParam(r => r.OfferId, "The id of the offer being added (offerId or offeLocationId required)");
            s.RequestParam(r => r.OfferLocationId, "The id of the offer location being added (offerId or offeLocationId required)");
            s.RequestParam(r => r.AppKey, "The application requesting the reservation");
            s.RequestParam(r => r.MetaData, "External custom client defined data");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateReservationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Reservation
/// </summary>

public class DeleteReservationEndpoint : FastEndpoints.Endpoint<DeleteReservationRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/reservation/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Reservation");
        });

        Summary(s => {
            s.Summary = "Delete Reservation";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ReservationId, "The reservation id");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteReservationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Availability
/// </summary>

public class ReservableAvailabilityEndpoint : FastEndpoints.Endpoint<ReservableAvailabilityRequest, List<AvailabilityResponse>>
{
    public override void Configure()
    {
        Post("/api/{version}/reservable/availability/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Reservation");
        });

        Summary(s => {
            s.Summary = "Update Availability";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ReservableId, "the id of the reservation");
            s.RequestParam(r => r.ReservableType, "the type of reservation");
            s.RequestParam(r => r.DeviceId, "the device id of the reservation");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.Availability, "Availability");
            s.RequestParam(r => r.AvailabilitySummary, "Availability Summary");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ReservableAvailabilityRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Availability
/// </summary>

public class SearchAvailabilityEndpoint : FastEndpoints.Endpoint<SearchAvailabilityRequest, List<AvailabilityResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/reservable/availability/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Reservation");
        });

        Summary(s => {
            s.Summary = "Search Availability";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ReservableId, "the id of the reservation");
            s.RequestParam(r => r.ReservableType, "the reservable type");
            s.RequestParam(r => r.DeviceId, "the device ID that the reservation is on");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.StartDate, "the start date of the reservation");
            s.RequestParam(r => r.EndDate, "the end date of the reservation");
            s.RequestParam(r => r.Start, "the start of the index and/or pagination");
            s.RequestParam(r => r.Limit, "the limit of the index and/or pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchAvailabilityRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Reservations
/// </summary>

public class SearchReservationsEndpoint : FastEndpoints.Endpoint<SearchReservationsRequest, List<ReservationResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/reservation/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Reservation");
        });

        Summary(s => {
            s.Summary = "Search Reservations";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "Device Id");
            s.RequestParam(r => r.AppKey, "Appilcation Key");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.FilterAccountId, "filter reservations by account ID");
            s.RequestParam(r => r.ReservableId, "the reservation ID");
            s.RequestParam(r => r.ReservableType, "the type of reservation");
            s.RequestParam(r => r.Keyword, "the keyword to search the reservation on");
            s.RequestParam(r => r.StartDate, "the start date of the reservation search");
            s.RequestParam(r => r.EndDate, "the end date of the reservation search");
            s.RequestParam(r => r.Start, "the start of the index and/or pagination");
            s.RequestParam(r => r.Limit, "the limit of the index and/or pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchReservationsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Schedule
/// </summary>

public class SearchScheduleEndpoint : FastEndpoints.Endpoint<SearchScheduleRequest, List<TimeSlotResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/reservable/schedule/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Reservation");
        });

        Summary(s => {
            s.Summary = "Search Schedule";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ReservableId, "the id of the reservation");
            s.RequestParam(r => r.ReservableType, "the reservation type");
            s.RequestParam(r => r.StartDate, "the start date of the reservation");
            s.RequestParam(r => r.EndDate, "the end date of the reservation");
            s.RequestParam(r => r.DeviceId, "the id of the device that the reservation is on");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.TimeBucketMins, "the length of time in minutes to search on for reservation");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchScheduleRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

