namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RewardResponse 
{
    public long OfferId { get; set; }
    public string Title { get; set; }
    public string SubTitle { get; set; }
    public string Details { get; set; }
    public AssetShortResponse Artwork { get; set; }
    public string FinePrint { get; set; }
    public string RedemptionCode { get; set; }
    public int RedemptionStatus { get; set; }
    public long TransactionId { get; set; }
    public double EstimatedValue { get; set; }
}


