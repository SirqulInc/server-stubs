namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Offer 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public string TestField { get; set; }
    public BillableEntity BillableEntity { get; set; }
    public List<OfferLocation> OfferLocations { get; set; }
    public List<Mission> Missions { get; set; }
    public DateTime Activated { get; set; }
    public DateTime Expires { get; set; }
    public DateTime RedeemableStart { get; set; }
    public DateTime RedeemableEnd { get; set; }
    public string Title { get; set; }
    public string SubTitle { get; set; }
    
    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum VOUCHEREnum for VOUCHER
        /// </summary>
        VOUCHEREnum = 1,
        
        /// <summary>
        /// Enum COUPONEnum for COUPON
        /// </summary>
        COUPONEnum = 2,
        
        /// <summary>
        /// Enum PRODUCTEnum for PRODUCT
        /// </summary>
        PRODUCTEnum = 3,
        
        /// <summary>
        /// Enum MEDIAEnum for MEDIA
        /// </summary>
        MEDIAEnum = 4,
        
        /// <summary>
        /// Enum EVENTEnum for EVENT
        /// </summary>
        EVENTEnum = 5,
        
        /// <summary>
        /// Enum DEVICEEnum for DEVICE
        /// </summary>
        DEVICEEnum = 6
    }

    public TypeEnum Type { get; set; }
    
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
    public string Details { get; set; }
    public string SubDetails { get; set; }
    public string FinePrint { get; set; }
    public string GetThereNowNotification { get; set; }
    public int MaxPrints { get; set; }
    public int ViewLimit { get; set; }
    public bool Featured { get; set; }
    public bool Replaced { get; set; }
    public bool ShowRemaining { get; set; }
    public bool ShowRedeemed { get; set; }
    public Offer ParentOffer { get; set; }
    public Asset Artwork { get; set; }
    public Asset OfferImage1 { get; set; }
    public Asset OfferImage2 { get; set; }
    public Asset OfferImage3 { get; set; }
    public Asset OfferImage4 { get; set; }
    public Asset OfferImage5 { get; set; }
    public Asset BarCode { get; set; }
    
    /// <summary>
    /// Gets or Sets BarCodeType
    /// </summary>
    public enum BarCodeTypeEnum
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

    public BarCodeTypeEnum BarCodeType { get; set; }
    public string BarCodeEntry { get; set; }
    public List<Category> Categories { get; set; }
    public List<Filter> Filters { get; set; }
    public string TicketType { get; set; }
    public bool AllocateTickets { get; set; }
    public string TicketPriceType { get; set; }
    public long TicketPrice { get; set; }
    public double FullPrice { get; set; }
    public double DiscountPrice { get; set; }
    public int AvailableLimit { get; set; }
    public int AvailableLimitPerUser { get; set; }
    public int AddedLimit { get; set; }
    public int UsedCount { get; set; }
    public int AddedCount { get; set; }
    public int RemovedCount { get; set; }
    public int ViewedCount { get; set; }
    public int ClickedCount { get; set; }
    
    /// <summary>
    /// Gets or Sets OfferVisibility
    /// </summary>
    public enum OfferVisibilityEnum
    {
        
        /// <summary>
        /// Enum PUBLICEnum for PUBLIC
        /// </summary>
        PUBLICEnum = 1,
        
        /// <summary>
        /// Enum LISTABLEEnum for LISTABLE
        /// </summary>
        LISTABLEEnum = 2,
        
        /// <summary>
        /// Enum REWARDABLEEnum for REWARDABLE
        /// </summary>
        REWARDABLEEnum = 3,
        
        /// <summary>
        /// Enum TRIGGERABLEEnum for TRIGGERABLE
        /// </summary>
        TRIGGERABLEEnum = 4,
        
        /// <summary>
        /// Enum PRIVATEEnum for PRIVATE
        /// </summary>
        PRIVATEEnum = 5
    }

    public OfferVisibilityEnum OfferVisibility { get; set; }
    
    /// <summary>
    /// Gets or Sets OfferProcessorId
    /// </summary>
    public enum OfferProcessorIdEnum
    {
        
        /// <summary>
        /// Enum SQOOTEnum for SQOOT
        /// </summary>
        SQOOTEnum = 1,
        
        /// <summary>
        /// Enum YIPITEnum for YIPIT
        /// </summary>
        YIPITEnum = 2,
        
        /// <summary>
        /// Enum APIEnum for API
        /// </summary>
        APIEnum = 3,
        
        /// <summary>
        /// Enum CSVEnum for CSV
        /// </summary>
        CSVEnum = 4
    }

    public OfferProcessorIdEnum OfferProcessorId { get; set; }
    public string ExternalId { get; set; }
    public string ExternalUrl { get; set; }
    public string ExternalUntrackedUrl { get; set; }
    public long SqootId { get; set; }
    public string SqootUrl { get; set; }
    public string SqootCategorySlug { get; set; }
    public string SqootCategoryName { get; set; }
    public long YipitId { get; set; }
    public string RedeemAuthOptions { get; set; }
    public string Publisher { get; set; }
    public Product Product { get; set; }
    public Media Media { get; set; }
    public Event Event { get; set; }
    public Device Device { get; set; }
    public List<Note> Notes { get; set; }
    public long NoteCount { get; set; }
    public long FavoriteCount { get; set; }
    public bool HasRatings { get; set; }
    public List<YayOrNay> Likes { get; set; }
    public long LikeCount { get; set; }
    public long DislikeCount { get; set; }
    public string AvailabilitySummary { get; set; }
    public List<Flag> Flags { get; set; }
    public long FlagCount { get; set; }
    public FlagThreshold FlagThreshold { get; set; }
    public double Savings { get; set; }
    public double ClickStream { get; set; }
    public long TicketCount { get; set; }
    public string Display { get; set; }
    public string AppKey { get; set; }
    public string CategoryTree { get; set; }
    public string FilterTree { get; set; }
    public bool Indexable { get; set; }
    public long BillableId { get; set; }
    public string SubType { get; set; }
    public string ContentName { get; set; }
    public long DefaultThreshold { get; set; }
    public Asset ContentAsset { get; set; }
    public Account Owner { get; set; }
    public string SecondaryType { get; set; }
    public double DiscountPercentage { get; set; }
}


