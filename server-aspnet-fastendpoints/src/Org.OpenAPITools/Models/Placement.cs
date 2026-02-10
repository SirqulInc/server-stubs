namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Placement 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public Application Application { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    
    /// <summary>
    /// Gets or Sets Size
    /// </summary>
    public enum SizeEnum
    {
        
        /// <summary>
        /// Enum CONFIGEnum for CONFIG
        /// </summary>
        CONFIGEnum = 1,
        
        /// <summary>
        /// Enum BANNEREnum for BANNER
        /// </summary>
        BANNEREnum = 2,
        
        /// <summary>
        /// Enum LEADERBOARDEnum for LEADERBOARD
        /// </summary>
        LEADERBOARDEnum = 3,
        
        /// <summary>
        /// Enum SKYSCRAPEREnum for SKYSCRAPER
        /// </summary>
        SKYSCRAPEREnum = 4,
        
        /// <summary>
        /// Enum VIDEOEnum for VIDEO
        /// </summary>
        VIDEOEnum = 5,
        
        /// <summary>
        /// Enum ZIPEnum for ZIP
        /// </summary>
        ZIPEnum = 6,
        
        /// <summary>
        /// Enum INTERSTITIALEnum for INTERSTITIAL
        /// </summary>
        INTERSTITIALEnum = 7,
        
        /// <summary>
        /// Enum CUSTOM1Enum for CUSTOM1
        /// </summary>
        CUSTOM1Enum = 8,
        
        /// <summary>
        /// Enum CUSTOM2Enum for CUSTOM2
        /// </summary>
        CUSTOM2Enum = 9,
        
        /// <summary>
        /// Enum CUSTOM3Enum for CUSTOM3
        /// </summary>
        CUSTOM3Enum = 10,
        
        /// <summary>
        /// Enum CUSTOM4Enum for CUSTOM4
        /// </summary>
        CUSTOM4Enum = 11,
        
        /// <summary>
        /// Enum CUSTOM5Enum for CUSTOM5
        /// </summary>
        CUSTOM5Enum = 12,
        
        /// <summary>
        /// Enum CUSTOM6Enum for CUSTOM6
        /// </summary>
        CUSTOM6Enum = 13,
        
        /// <summary>
        /// Enum CUSTOM7Enum for CUSTOM7
        /// </summary>
        CUSTOM7Enum = 14,
        
        /// <summary>
        /// Enum CUSTOM8Enum for CUSTOM8
        /// </summary>
        CUSTOM8Enum = 15,
        
        /// <summary>
        /// Enum CUSTOM9Enum for CUSTOM9
        /// </summary>
        CUSTOM9Enum = 16,
        
        /// <summary>
        /// Enum CUSTOM10Enum for CUSTOM10
        /// </summary>
        CUSTOM10Enum = 17
    }

    public SizeEnum Size { get; set; }
    
    /// <summary>
    /// Gets or Sets ClickType
    /// </summary>
    public enum ClickTypeEnum
    {
        
        /// <summary>
        /// Enum CONFIGEnum for CONFIG
        /// </summary>
        CONFIGEnum = 1,
        
        /// <summary>
        /// Enum PURCHASEEnum for PURCHASE
        /// </summary>
        PURCHASEEnum = 2,
        
        /// <summary>
        /// Enum BANNEREnum for BANNER
        /// </summary>
        BANNEREnum = 3,
        
        /// <summary>
        /// Enum LEADERBOARDEnum for LEADERBOARD
        /// </summary>
        LEADERBOARDEnum = 4,
        
        /// <summary>
        /// Enum SKYSCRAPEREnum for SKYSCRAPER
        /// </summary>
        SKYSCRAPEREnum = 5,
        
        /// <summary>
        /// Enum VIDEOEnum for VIDEO
        /// </summary>
        VIDEOEnum = 6,
        
        /// <summary>
        /// Enum ZIPEnum for ZIP
        /// </summary>
        ZIPEnum = 7,
        
        /// <summary>
        /// Enum FULLEnum for FULL
        /// </summary>
        FULLEnum = 8,
        
        /// <summary>
        /// Enum CUSTOM1Enum for CUSTOM1
        /// </summary>
        CUSTOM1Enum = 9,
        
        /// <summary>
        /// Enum CUSTOM2Enum for CUSTOM2
        /// </summary>
        CUSTOM2Enum = 10,
        
        /// <summary>
        /// Enum CUSTOM3Enum for CUSTOM3
        /// </summary>
        CUSTOM3Enum = 11,
        
        /// <summary>
        /// Enum CUSTOM4Enum for CUSTOM4
        /// </summary>
        CUSTOM4Enum = 12,
        
        /// <summary>
        /// Enum CUSTOM5Enum for CUSTOM5
        /// </summary>
        CUSTOM5Enum = 13,
        
        /// <summary>
        /// Enum CUSTOM6Enum for CUSTOM6
        /// </summary>
        CUSTOM6Enum = 14,
        
        /// <summary>
        /// Enum CUSTOM7Enum for CUSTOM7
        /// </summary>
        CUSTOM7Enum = 15,
        
        /// <summary>
        /// Enum CUSTOM8Enum for CUSTOM8
        /// </summary>
        CUSTOM8Enum = 16,
        
        /// <summary>
        /// Enum CUSTOM9Enum for CUSTOM9
        /// </summary>
        CUSTOM9Enum = 17,
        
        /// <summary>
        /// Enum CUSTOM10Enum for CUSTOM10
        /// </summary>
        CUSTOM10Enum = 18
    }

    public ClickTypeEnum ClickType { get; set; }
    public int Height { get; set; }
    public int Width { get; set; }
    public int RefreshInterval { get; set; }
    public Asset DefaultImage { get; set; }
}


