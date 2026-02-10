
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateTripRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public Trip? body { get; set; }
}
public class DeleteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the trip to delete
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public long Id { get; set; }
}
public class DriveTripRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the trip
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public long Id { get; set; }
    /// <summary>
    /// the frequency of the trip (e.g. weekly, until 2018-08-09)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("recurrence")]
    public bool Recurrence { get; set; }
}
public class FlexibleTripRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the trip
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public long Id { get; set; }
    /// <summary>
    /// the frequency of the trip (e.g. weekly, until 2018-08-09)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("recurrence")]
    public bool Recurrence { get; set; }
}
public class GetTripRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the trip to get
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public long Id { get; set; }
}
public class GetTripMatchesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The id The id of the trip to search for matches for
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public long Id { get; set; }
    /// <summary>
    /// Only return matchings that already have route assigned
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("matchedHasRoute")]
    public bool? MatchedHasRoute { get; set; }
    /// <summary>
    /// Only return matchings that already have driver assigned
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("matchedHasDriver")]
    public bool? MatchedHasDriver { get; set; }
    /// <summary>
    /// The field to sort by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// Determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// The start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// The limit for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// Return only active results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool ActiveOnly { get; set; }
}
public class ProcessTripMatchesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The lower bound date to process matchings
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// The upper bound date to process matchings
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// the id of the trip to process
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tripId")]
    public long? TripId { get; set; }
}
public class RideRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the trip
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public long Id { get; set; }
    /// <summary>
    /// the frequency of the trip (e.g. weekly, until 2018-08-09)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("recurrence")]
    public bool Recurrence { get; set; }
}
public class SearchRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The owner of the trips
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The lower bound limit of time
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// The upper bound limit of time
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// whether to search on trips that have notifications or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hasNotifications")]
    public bool? HasNotifications { get; set; }
    /// <summary>
    /// The field to sort by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// Determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// The start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// The limit for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// Return only active results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool ActiveOnly { get; set; }
}
public class SearchTripsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The owner of the trips
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The lower bound limit of time
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// The upper bound limit of time
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// Only return matchings that already have route assigned
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("matchedHasRoute")]
    public bool? MatchedHasRoute { get; set; }
    /// <summary>
    /// Only return matchings that already have driver assigned
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("matchedHasDriver")]
    public bool? MatchedHasDriver { get; set; }
    /// <summary>
    /// The field to sort by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// Determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// The start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// The limit for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// Return only active results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool ActiveOnly { get; set; }
}
public class UpdateLocationsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the trip to update locations for
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public long Id { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public Trip? body { get; set; }
}
public class UpdateRecurrenceLocationsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the trip
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public long Id { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public Trip? body { get; set; }
}
public class UpdateRecurrenceShipmentsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the trip
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public long Id { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public Trip? body { get; set; }
}
public class UpdateShipmentsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the trip shipments to update
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public long Id { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public Trip? body { get; set; }
}
public class UpdateTripRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the trip to update
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public long Id { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public Trip? body { get; set; }
}
public class UpdateTripNotificationsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the trip
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("id")]
    public long Id { get; set; }
    /// <summary>
    /// the notifications to update on the trip
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("notifications")]
    public string? Notifications { get; set; }
}


