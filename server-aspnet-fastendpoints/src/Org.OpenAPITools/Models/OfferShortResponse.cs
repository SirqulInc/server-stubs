namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OfferShortResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public long OfferLocationId { get; set; }
    public long OfferId { get; set; }
    public long RetailerId { get; set; }
    public long TransactionId { get; set; }
    public long FavoriteId { get; set; }
    public string OfferName { get; set; }
    public string SubTitle { get; set; }
    public string LocationName { get; set; }
    public DateTime Starts { get; set; }
    public DateTime Expires { get; set; }
    public long Activated { get; set; }
    public long Expiration { get; set; }
    public long RedeemableStart { get; set; }
    public long RedeemableEnd { get; set; }
    public double Distance { get; set; }
    public string OfferType { get; set; }
    public double Longitude { get; set; }
    public double Latitude { get; set; }
    public bool Favorite { get; set; }
    public double FullPrice { get; set; }
    public double DiscountPrice { get; set; }
    public double EstimatedValue { get; set; }
    public double VoucherDiscountPrice { get; set; }
    public MissionListResponse MissionListResponse { get; set; }
    public string Image { get; set; }
    public string Image1 { get; set; }
    public string Image2 { get; set; }
    public string Image3 { get; set; }
    public string Image4 { get; set; }
    public string Image5 { get; set; }
    public List<AssetResponse> Images { get; set; }
    public string Barcode { get; set; }
    public string ExternalUrl { get; set; }
    public string SqootUrl { get; set; }
    public bool Active { get; set; }
    public RetailerLocationResponse Location { get; set; }
    public string SubDetails { get; set; }
    public int ExternalRedeemAuth { get; set; }
    public string ExternalRedeemOptions { get; set; }
    public string Publisher { get; set; }
    public ProductResponse Product { get; set; }
    public EventResponse Event { get; set; }
    public MediaResponse Media { get; set; }
    public int ViewedCount { get; set; }
    public int ClickedCount { get; set; }
    public int AddedLimit { get; set; }
    public int AddedCount { get; set; }
    public int UsedCount { get; set; }
    public int RemovedCount { get; set; }
    public int LocationAddedCount { get; set; }
    public string BarcodeEntry { get; set; }
    
    /// <summary>
    /// Gets or Sets BarcodeType
    /// </summary>
    public enum BarcodeTypeEnum
    {
        
        /// <summary>
        /// Enum NONEEnum for NONE
        /// </summary>
        NONEEnum = 1,
        
        /// <summary>
        /// Enum UPCEnum for UPC
        /// </summary>
        UPCEnum = 2,
        
        /// <summary>
        /// Enum CODE128Enum for CODE_128
        /// </summary>
        CODE128Enum = 3,
        
        /// <summary>
        /// Enum QREnum for QR
        /// </summary>
        QREnum = 4,
        
        /// <summary>
        /// Enum CUSTOMMEDIAEnum for CUSTOM_MEDIA
        /// </summary>
        CUSTOMMEDIAEnum = 5
    }

    public BarcodeTypeEnum BarcodeType { get; set; }
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
    public long LogId { get; set; }
    public long BillableEntityId { get; set; }
    public long ResponsibleAccountId { get; set; }
    public string AvailabilitySummary { get; set; }
    public string ExternalId { get; set; }
    public OfferShortResponse ParentOffer { get; set; }
    public string Returning { get; set; }
}


