namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PurchaseItemFullResponse 
{
    public long Id { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public int Tickets { get; set; }
    public AssetShortResponse CoverAsset { get; set; }
    public AssetShortResponse PromoAsset { get; set; }
    public bool Giftable { get; set; }
    public bool Assetable { get; set; }
    public string GameType { get; set; }
    public float Price { get; set; }
    public string PurchaseType { get; set; }
    public string PurchaseCode { get; set; }
    public int PurchaseLimit { get; set; }
    public int Quantity { get; set; }
    
    /// <summary>
    /// Gets or Sets ServiceAction
    /// </summary>
    public enum ServiceActionEnum
    {
        
        /// <summary>
        /// Enum DAYPREMIUMEnum for DAY_PREMIUM
        /// </summary>
        DAYPREMIUMEnum = 1,
        
        /// <summary>
        /// Enum WEEKPREMIUMEnum for WEEK_PREMIUM
        /// </summary>
        WEEKPREMIUMEnum = 2,
        
        /// <summary>
        /// Enum MONTHPREMIUMEnum for MONTH_PREMIUM
        /// </summary>
        MONTHPREMIUMEnum = 3,
        
        /// <summary>
        /// Enum YEARPREMIUMEnum for YEAR_PREMIUM
        /// </summary>
        YEARPREMIUMEnum = 4,
        
        /// <summary>
        /// Enum LIFETIMEPREMIUMEnum for LIFETIME_PREMIUM
        /// </summary>
        LIFETIMEPREMIUMEnum = 5,
        
        /// <summary>
        /// Enum ADDTICKETEnum for ADD_TICKET
        /// </summary>
        ADDTICKETEnum = 6,
        
        /// <summary>
        /// Enum ADDGIFTEnum for ADD_GIFT
        /// </summary>
        ADDGIFTEnum = 7,
        
        /// <summary>
        /// Enum ADDPOINTSEnum for ADD_POINTS
        /// </summary>
        ADDPOINTSEnum = 8
    }

    public ServiceActionEnum ServiceAction { get; set; }
    public string AppName { get; set; }
    public string SecretKey { get; set; }
    public string AppKey { get; set; }
    public bool AllocateTickets { get; set; }
    public string TicketType { get; set; }
    public long TicketCount { get; set; }
    public long Points { get; set; }
}


