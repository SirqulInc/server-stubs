namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class MediaOfferResponse 
{
    public string Title { get; set; }
    public string Details { get; set; }
    public string SubTitle { get; set; }
    public long Activated { get; set; }
    public long Expiration { get; set; }
    public long RedeemableStart { get; set; }
    public long RedeemableEnd { get; set; }
    public string OfferType { get; set; }
    public string OfferVisibility { get; set; }
    public bool Favorite { get; set; }
    public long Deleted { get; set; }
    public double FullPrice { get; set; }
    public double DiscountPrice { get; set; }
    public string Image { get; set; }
    public string Image1 { get; set; }
    public string Image2 { get; set; }
    public string Image3 { get; set; }
    public string Image4 { get; set; }
    public string Image5 { get; set; }
    public List<AssetResponse> Images { get; set; }
    public string Barcode { get; set; }
    public string ExternalUrl { get; set; }
    public bool Active { get; set; }
    public string SubDetails { get; set; }
    public string ExternalRedeemOptions { get; set; }
    public string Publisher { get; set; }
    public int ViewedCount { get; set; }
    public int ClickedCount { get; set; }
    public int AddedLimit { get; set; }
    public int AddedCount { get; set; }
    public int UsedCount { get; set; }
    public int RemovedCount { get; set; }
    public long TicketsReward { get; set; }
    public string TicketsRewardType { get; set; }
    
    /// <summary>
    /// Gets or Sets SpecialOfferType
    /// </summary>
    public enum SpecialOfferTypeEnum
    {
        
        /// <summary>
        /// Enum ALLEnum for ALL
        /// </summary>
        ALLEnum = 1,
        
        /// <summary>
        /// Enum RESERVABLEEnum for RESERVABLE
        /// </summary>
        RESERVABLEEnum = 2,
        
        /// <summary>
        /// Enum REGULAROFFEREnum for REGULAR_OFFER
        /// </summary>
        REGULAROFFEREnum = 3,
        
        /// <summary>
        /// Enum ACTNOWEnum for ACT_NOW
        /// </summary>
        ACTNOWEnum = 4,
        
        /// <summary>
        /// Enum GETTHERENOWEnum for GET_THERE_NOW
        /// </summary>
        GETTHERENOWEnum = 5,
        
        /// <summary>
        /// Enum SQOOTEnum for SQOOT
        /// </summary>
        SQOOTEnum = 6,
        
        /// <summary>
        /// Enum TICKETSEnum for TICKETS
        /// </summary>
        TICKETSEnum = 7,
        
        /// <summary>
        /// Enum YIPITEnum for YIPIT
        /// </summary>
        YIPITEnum = 8
    }

    public SpecialOfferTypeEnum SpecialOfferType { get; set; }
    public long LikeCount { get; set; }
    public long DislikeCount { get; set; }
    public long FavoriteCount { get; set; }
    public long NoteCount { get; set; }
    public long BillableEntityId { get; set; }
    public long ResponsibleAccountId { get; set; }
    public string AvailabilitySummary { get; set; }
    public long FlagCount { get; set; }
    public long FlagThreshold { get; set; }
    public string ExternalId { get; set; }
    public BaseOfferResponse ParentOffer { get; set; }
    public List<CategoryResponse> Categories { get; set; }
    public List<FilterResponse> Filters { get; set; }
}


