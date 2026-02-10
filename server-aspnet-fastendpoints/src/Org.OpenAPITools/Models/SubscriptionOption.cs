namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class SubscriptionOption 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public string Name { get; set; }
    public double Price { get; set; }
    public int Quantity { get; set; }
    public int Threshold { get; set; }
    public bool Visible { get; set; }
    
    /// <summary>
    /// Gets or Sets OptionType
    /// </summary>
    public enum OptionTypeEnum
    {
        
        /// <summary>
        /// Enum MISSIONEnum for MISSION
        /// </summary>
        MISSIONEnum = 1,
        
        /// <summary>
        /// Enum LOCATIONEnum for LOCATION
        /// </summary>
        LOCATIONEnum = 2,
        
        /// <summary>
        /// Enum OFFEREnum for OFFER
        /// </summary>
        OFFEREnum = 3,
        
        /// <summary>
        /// Enum NOTIFICATIONEnum for NOTIFICATION
        /// </summary>
        NOTIFICATIONEnum = 4,
        
        /// <summary>
        /// Enum REQUESTEnum for REQUEST
        /// </summary>
        REQUESTEnum = 5,
        
        /// <summary>
        /// Enum STORAGES3Enum for STORAGE_S3
        /// </summary>
        STORAGES3Enum = 6,
        
        /// <summary>
        /// Enum STORAGEDBEnum for STORAGE_DB
        /// </summary>
        STORAGEDBEnum = 7
    }

    public OptionTypeEnum OptionType { get; set; }
    
    /// <summary>
    /// Gets or Sets OfferType
    /// </summary>
    public enum OfferTypeEnum
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

    public OfferTypeEnum OfferType { get; set; }
}


