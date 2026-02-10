namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Media 
{
    
    /// <summary>
    /// Gets or Sets MediaType
    /// </summary>
    public enum MediaTypeEnum
    {
        
        /// <summary>
        /// Enum APKEnum for APK
        /// </summary>
        APKEnum = 1,
        
        /// <summary>
        /// Enum APPLICATIONEnum for APPLICATION
        /// </summary>
        APPLICATIONEnum = 2,
        
        /// <summary>
        /// Enum IMAGEEnum for IMAGE
        /// </summary>
        IMAGEEnum = 3,
        
        /// <summary>
        /// Enum AUDIOEnum for AUDIO
        /// </summary>
        AUDIOEnum = 4,
        
        /// <summary>
        /// Enum VIDEOEnum for VIDEO
        /// </summary>
        VIDEOEnum = 5,
        
        /// <summary>
        /// Enum MULTIPARTEnum for MULTIPART
        /// </summary>
        MULTIPARTEnum = 6,
        
        /// <summary>
        /// Enum BARCODEEnum for BAR_CODE
        /// </summary>
        BARCODEEnum = 7,
        
        /// <summary>
        /// Enum TEXTEnum for TEXT
        /// </summary>
        TEXTEnum = 8,
        
        /// <summary>
        /// Enum OTHEREnum for OTHER
        /// </summary>
        OTHEREnum = 9
    }

    public MediaTypeEnum MediaType { get; set; }
    
    /// <summary>
    /// Gets or Sets Condition
    /// </summary>
    public enum ConditionEnum
    {
        
        /// <summary>
        /// Enum NEWEnum for NEW
        /// </summary>
        NEWEnum = 1,
        
        /// <summary>
        /// Enum USEDEnum for USED
        /// </summary>
        USEDEnum = 2,
        
        /// <summary>
        /// Enum REFURBISHEDEnum for REFURBISHED
        /// </summary>
        REFURBISHEDEnum = 3,
        
        /// <summary>
        /// Enum OTHEREnum for OTHER
        /// </summary>
        OTHEREnum = 4
    }

    public ConditionEnum Condition { get; set; }
    public string Isbn { get; set; }
    public string Asin { get; set; }
    public List<string> CatalogNumbers { get; set; }
    public int Duration { get; set; }
    public string Author { get; set; }
    public long ReleaseDate { get; set; }
    public long AvailabilityDate { get; set; }
    public string ParentalRating { get; set; }
    public List<Album> Collections { get; set; }
    public int CollectionCount { get; set; }
}


