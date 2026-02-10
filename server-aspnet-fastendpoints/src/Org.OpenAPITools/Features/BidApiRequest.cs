
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateBidRequest
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
    /// A biddable object type. Possible values include: CREATIVE (ads).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("biddableType")]
    public string BiddableType { get; set; }
    /// <summary>
    /// The id of the biddable object
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("biddableId")]
    public long BiddableId { get; set; }
    /// <summary>
    /// The bid amount for views. For ads, this is the amount that will be taken for each impression.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("amountPerView")]
    public double AmountPerView { get; set; }
    /// <summary>
    /// The bid amount for actions. For ads, this is the amount that will be taken for each click.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("amountPerAction")]
    public double AmountPerAction { get; set; }
    /// <summary>
    /// The allocated budget amount that will be used
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("budgetAmount")]
    public double BudgetAmount { get; set; }
    /// <summary>
    /// The schedule for when the allocated budget amount is reset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("budgetSchedule")]
    public string BudgetSchedule { get; set; }
}
public class DeleteBidRequest
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
    /// The bid id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bidId")]
    public long BidId { get; set; }
}
public class GetBidRequest
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
    /// The bid id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bidId")]
    public long BidId { get; set; }
}
public class UpdateBidRequest
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
    /// The bid id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bidId")]
    public long BidId { get; set; }
    /// <summary>
    /// The bid amount for views. For ads, this is the amount that will be taken for each impression.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("amountPerView")]
    public double? AmountPerView { get; set; }
    /// <summary>
    /// The bid amount for actions. For ads, this is the amount that will be taken for each click.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("amountPerAction")]
    public double? AmountPerAction { get; set; }
    /// <summary>
    /// The allocated budget amount that will be used
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("budgetAmount")]
    public double? BudgetAmount { get; set; }
    /// <summary>
    /// The schedule for when the allocated budget amount is reset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("budgetSchedule")]
    public string? BudgetSchedule { get; set; }
}


