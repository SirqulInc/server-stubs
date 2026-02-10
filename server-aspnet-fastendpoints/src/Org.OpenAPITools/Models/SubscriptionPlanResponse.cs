namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class SubscriptionPlanResponse 
{
    public long Id { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public List<SubscriptionOptionResponse> Options { get; set; }
    public double Price { get; set; }
    public double Promo { get; set; }
    public double TransactionFee { get; set; }
    public string Role { get; set; }
    public bool DefaultPlan { get; set; }
    public bool Visible { get; set; }
    public AssetShortResponse Image { get; set; }
}


