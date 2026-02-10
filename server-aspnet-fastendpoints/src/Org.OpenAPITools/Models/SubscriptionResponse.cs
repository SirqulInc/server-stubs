namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class SubscriptionResponse 
{
    public long Id { get; set; }
    public SubscriptionPlanResponse SubscriptionPlan { get; set; }
    public string PromoCode { get; set; }
    public bool Active { get; set; }
}


