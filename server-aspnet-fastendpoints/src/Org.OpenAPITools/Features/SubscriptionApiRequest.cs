
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateSubscriptionRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account used to perform the create, must be the responsible manager
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The plan to subscribe to, if null use default plan
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("planId")]
    public long? PlanId { get; set; }
    /// <summary>
    /// Set a promo code for a discount.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("promoCode")]
    public string? PromoCode { get; set; }
}
public class DeleteSubscriptionRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account used to perform the delete, must be the responsible manager
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
}
public class GetSubscriptionRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account used to perform the lookup
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
}
public class GetSubscriptionPlanRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The ID of the plan to get
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("planId")]
    public long PlanId { get; set; }
}
public class GetSubscriptionPlansRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Include visible only (true), hidden only (false), or all (null)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visible")]
    public bool? Visible { get; set; }
    /// <summary>
    /// The role the plan is targeted for, values are: DEVELOPER, RETAILER, ADVERTISER
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("role")]
    public string? Role { get; set; }
}
public class GetSubscriptionUsageRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account used to perform the lookup
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Get for just 1 application instead of the BillableEntity
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("applicationId")]
    public long? ApplicationId { get; set; }
    /// <summary>
    /// The start time frame
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public long? Start { get; set; }
    /// <summary>
    /// The end time frame
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("end")]
    public long? End { get; set; }
}
public class UpdateSubscriptionRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account used to perform the update, must be the responsible manager
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The plan to subscribe to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("planId")]
    public long? PlanId { get; set; }
    /// <summary>
    /// Set a promo code for a discount.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("promoCode")]
    public string? PromoCode { get; set; }
    /// <summary>
    /// Set active status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
}


