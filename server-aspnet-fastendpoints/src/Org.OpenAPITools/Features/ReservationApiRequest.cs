
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateReservationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The start date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// The end date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// The id of the offer being added (offerId or offeLocationId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerId")]
    public long? OfferId { get; set; }
    /// <summary>
    /// The id of the offer location being added (offerId or offeLocationId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerLocationId")]
    public long? OfferLocationId { get; set; }
    /// <summary>
    /// The application requesting the reservation
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// External custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
}
public class DeleteReservationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The reservation id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("reservationId")]
    public long ReservationId { get; set; }
}
public class ReservableAvailabilityRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the device id of the reservation
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the id of the reservation
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("reservableId")]
    public long ReservableId { get; set; }
    /// <summary>
    /// the type of reservation
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("reservableType")]
    public string ReservableType { get; set; }
    /// <summary>
    /// Availability
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("availability")]
    public string? Availability { get; set; }
    /// <summary>
    /// Availability Summary
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("availabilitySummary")]
    public string? AvailabilitySummary { get; set; }
}
public class SearchAvailabilityRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the device ID that the reservation is on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the id of the reservation
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("reservableId")]
    public long ReservableId { get; set; }
    /// <summary>
    /// the reservable type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("reservableType")]
    public string ReservableType { get; set; }
    /// <summary>
    /// the start date of the reservation
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// the end date of the reservation
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// the start of the index and/or pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// the limit of the index and/or pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class SearchReservationsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Device Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// Appilcation Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// filter reservations by account ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterAccountId")]
    public long? FilterAccountId { get; set; }
    /// <summary>
    /// the reservation ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("reservableId")]
    public long? ReservableId { get; set; }
    /// <summary>
    /// the type of reservation
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("reservableType")]
    public string? ReservableType { get; set; }
    /// <summary>
    /// the keyword to search the reservation on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// the start date of the reservation search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// the end date of the reservation search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// the start of the index and/or pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// the limit of the index and/or pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class SearchScheduleRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the device that the reservation is on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the id of the reservation
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("reservableId")]
    public long ReservableId { get; set; }
    /// <summary>
    /// the reservation type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("reservableType")]
    public string ReservableType { get; set; }
    /// <summary>
    /// the start date of the reservation
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long StartDate { get; set; }
    /// <summary>
    /// the end date of the reservation
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long EndDate { get; set; }
    /// <summary>
    /// the length of time in minutes to search on for reservation
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("timeBucketMins")]
    public int? TimeBucketMins { get; set; }
}


