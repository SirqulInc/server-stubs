using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Trip
/// </summary>

public class CreateTripEndpoint : FastEndpoints.Endpoint<CreateTripRequest, Trip>
{
    public override void Configure()
    {
        Post("/api/{version}/trip");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Trip");
        });

        Summary(s => {
            s.Summary = "Create Trip";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateTripRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Trip
/// </summary>

public class DeleteEndpoint : FastEndpoints.Endpoint<DeleteRequest>
{
    public override void Configure()
    {
        Delete("/api/{version}/trip/{id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Trip");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Delete Trip";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the trip to delete");
            s.Responses[0] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Set Trip Preference Driver
/// </summary>

public class DriveTripEndpoint : FastEndpoints.Endpoint<DriveTripRequest, Trip>
{
    public override void Configure()
    {
        Post("/api/{version}/trip/{id}/drive");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Trip");
        });

        Summary(s => {
            s.Summary = "Set Trip Preference Driver";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the trip");
            s.RequestParam(r => r.Recurrence, "the frequency of the trip (e.g. weekly, until 2018-08-09)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DriveTripRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Set Trip Preference Flexible
/// </summary>

public class FlexibleTripEndpoint : FastEndpoints.Endpoint<FlexibleTripRequest, Trip>
{
    public override void Configure()
    {
        Post("/api/{version}/trip/{id}/flexible");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Trip");
        });

        Summary(s => {
            s.Summary = "Set Trip Preference Flexible";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the trip");
            s.RequestParam(r => r.Recurrence, "the frequency of the trip (e.g. weekly, until 2018-08-09)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(FlexibleTripRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Trip
/// </summary>

public class GetTripEndpoint : FastEndpoints.Endpoint<GetTripRequest, Trip>
{
    public override void Configure()
    {
        Get("/api/{version}/trip/{id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Trip");
        });

        Summary(s => {
            s.Summary = "Get Trip";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the trip to get");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetTripRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Trip Matches
/// </summary>

public class GetTripMatchesEndpoint : FastEndpoints.Endpoint<GetTripMatchesRequest, List<Trip>>
{
    public override void Configure()
    {
        Get("/api/{version}/trip/{id}/match");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Trip");
        });

        Summary(s => {
            s.Summary = "Get Trip Matches";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "The id The id of the trip to search for matches for");
            s.RequestParam(r => r.SortField, "The field to sort by");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.RequestParam(r => r.ActiveOnly, "Return only active results");
            s.RequestParam(r => r.MatchedHasRoute, "Only return matchings that already have route assigned");
            s.RequestParam(r => r.MatchedHasDriver, "Only return matchings that already have driver assigned");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetTripMatchesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Process Trip Matches
/// </summary>

public class ProcessTripMatchesEndpoint : FastEndpoints.Endpoint<ProcessTripMatchesRequest, List<Trip>>
{
    public override void Configure()
    {
        Post("/api/{version}/trip/match/process");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Trip");
        });

        Summary(s => {
            s.Summary = "Process Trip Matches";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.StartDate, "The lower bound date to process matchings");
            s.RequestParam(r => r.EndDate, "The upper bound date to process matchings");
            s.RequestParam(r => r.TripId, "the id of the trip to process");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ProcessTripMatchesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Set Trip Preference Rider
/// </summary>

public class RideEndpoint : FastEndpoints.Endpoint<RideRequest, Trip>
{
    public override void Configure()
    {
        Post("/api/{version}/trip/{id}/ride");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Trip");
        });

        Summary(s => {
            s.Summary = "Set Trip Preference Rider";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the trip");
            s.RequestParam(r => r.Recurrence, "the frequency of the trip (e.g. weekly, until 2018-08-09)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RideRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Trips
/// </summary>

public class SearchEndpoint : FastEndpoints.Endpoint<SearchRequest, List<Trip>>
{
    public override void Configure()
    {
        Get("/api/{version}/trip");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Trip");
        });

        Summary(s => {
            s.Summary = "Search Trips";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The owner of the trips");
            s.RequestParam(r => r.SortField, "The field to sort by");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.RequestParam(r => r.ActiveOnly, "Return only active results");
            s.RequestParam(r => r.StartDate, "The lower bound limit of time");
            s.RequestParam(r => r.EndDate, "The upper bound limit of time");
            s.RequestParam(r => r.HasNotifications, "whether to search on trips that have notifications or not");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Trips
/// </summary>

public class SearchTripsEndpoint : FastEndpoints.Endpoint<SearchTripsRequest, List<Trip>>
{
    public override void Configure()
    {
        Get("/api/{version}/trip/match");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Trip");
        });

        Summary(s => {
            s.Summary = "Search Trips";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The owner of the trips");
            s.RequestParam(r => r.SortField, "The field to sort by");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.RequestParam(r => r.ActiveOnly, "Return only active results");
            s.RequestParam(r => r.StartDate, "The lower bound limit of time");
            s.RequestParam(r => r.EndDate, "The upper bound limit of time");
            s.RequestParam(r => r.MatchedHasRoute, "Only return matchings that already have route assigned");
            s.RequestParam(r => r.MatchedHasDriver, "Only return matchings that already have driver assigned");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchTripsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Trip Locations
/// </summary>

public class UpdateLocationsEndpoint : FastEndpoints.Endpoint<UpdateLocationsRequest, Trip>
{
    public override void Configure()
    {
        Post("/api/{version}/trip/{id}/locations");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Trip");
        });

        Summary(s => {
            s.Summary = "Update Trip Locations";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the trip to update locations for");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateLocationsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Recurrence Locations
/// </summary>

public class UpdateRecurrenceLocationsEndpoint : FastEndpoints.Endpoint<UpdateRecurrenceLocationsRequest, List<Trip>>
{
    public override void Configure()
    {
        Post("/api/{version}/trip/{id}/locations/recurrence");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Trip");
        });

        Summary(s => {
            s.Summary = "Update Recurrence Locations";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the trip");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateRecurrenceLocationsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Recurrence Shipments
/// </summary>

public class UpdateRecurrenceShipmentsEndpoint : FastEndpoints.Endpoint<UpdateRecurrenceShipmentsRequest, List<Trip>>
{
    public override void Configure()
    {
        Post("/api/{version}/trip/{id}/shipments/recurrence");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Trip");
        });

        Summary(s => {
            s.Summary = "Update Recurrence Shipments";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the trip");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateRecurrenceShipmentsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Trip Shipments
/// </summary>

public class UpdateShipmentsEndpoint : FastEndpoints.Endpoint<UpdateShipmentsRequest, Trip>
{
    public override void Configure()
    {
        Post("/api/{version}/trip/{id}/shipments");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Trip");
        });

        Summary(s => {
            s.Summary = "Update Trip Shipments";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the trip shipments to update");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateShipmentsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Trip
/// </summary>

public class UpdateTripEndpoint : FastEndpoints.Endpoint<UpdateTripRequest, Trip>
{
    public override void Configure()
    {
        Put("/api/{version}/trip/{id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Trip");
        });

        Summary(s => {
            s.Summary = "Update Trip";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the trip to update");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateTripRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Trip Notifications
/// </summary>

public class UpdateTripNotificationsEndpoint : FastEndpoints.Endpoint<UpdateTripNotificationsRequest, Trip>
{
    public override void Configure()
    {
        Post("/api/{version}/trip/notifications");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Trip");
        });

        Summary(s => {
            s.Summary = "Trip Notifications";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the trip");
            s.RequestParam(r => r.Notifications, "the notifications to update on the trip");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateTripNotificationsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

