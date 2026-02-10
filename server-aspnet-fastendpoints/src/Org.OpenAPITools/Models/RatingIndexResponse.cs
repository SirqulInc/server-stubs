namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RatingIndexResponse 
{
    public long RatingIndexId { get; set; }
    public long RatingCount { get; set; }
    public float RatingAverage { get; set; }
    public float Value { get; set; }
    public string Display { get; set; }
    
    /// <summary>
    /// Gets or Sets RatableType
    /// </summary>
    public enum RatableTypeEnum
    {
        
        /// <summary>
        /// Enum LOCATABLEEnum for LOCATABLE
        /// </summary>
        LOCATABLEEnum = 1,
        
        /// <summary>
        /// Enum RESERVABLEEnum for RESERVABLE
        /// </summary>
        RESERVABLEEnum = 2,
        
        /// <summary>
        /// Enum PERMISSIONABLEEnum for PERMISSIONABLE
        /// </summary>
        PERMISSIONABLEEnum = 3,
        
        /// <summary>
        /// Enum NOTABLEEnum for NOTABLE
        /// </summary>
        NOTABLEEnum = 4,
        
        /// <summary>
        /// Enum ASSETABLEEnum for ASSETABLE
        /// </summary>
        ASSETABLEEnum = 5,
        
        /// <summary>
        /// Enum LIKABLEEnum for LIKABLE
        /// </summary>
        LIKABLEEnum = 6,
        
        /// <summary>
        /// Enum FLAGABLEEnum for FLAGABLE
        /// </summary>
        FLAGABLEEnum = 7,
        
        /// <summary>
        /// Enum FAVORITABLEEnum for FAVORITABLE
        /// </summary>
        FAVORITABLEEnum = 8,
        
        /// <summary>
        /// Enum RATABLEEnum for RATABLE
        /// </summary>
        RATABLEEnum = 9,
        
        /// <summary>
        /// Enum ALBUMEnum for ALBUM
        /// </summary>
        ALBUMEnum = 10,
        
        /// <summary>
        /// Enum COLLECTIONEnum for COLLECTION
        /// </summary>
        COLLECTIONEnum = 11,
        
        /// <summary>
        /// Enum APPLICATIONEnum for APPLICATION
        /// </summary>
        APPLICATIONEnum = 12,
        
        /// <summary>
        /// Enum APPLICATIONSETTINGEnum for APPLICATION_SETTING
        /// </summary>
        APPLICATIONSETTINGEnum = 13,
        
        /// <summary>
        /// Enum APPLICATIONCERTEnum for APPLICATION_CERT
        /// </summary>
        APPLICATIONCERTEnum = 14,
        
        /// <summary>
        /// Enum APPLICATIONPLACEMENTEnum for APPLICATION_PLACEMENT
        /// </summary>
        APPLICATIONPLACEMENTEnum = 15,
        
        /// <summary>
        /// Enum ACCOUNTEnum for ACCOUNT
        /// </summary>
        ACCOUNTEnum = 16,
        
        /// <summary>
        /// Enum ACCOUNTSETTINGEnum for ACCOUNT_SETTING
        /// </summary>
        ACCOUNTSETTINGEnum = 17,
        
        /// <summary>
        /// Enum GAMELEVELEnum for GAME_LEVEL
        /// </summary>
        GAMELEVELEnum = 18,
        
        /// <summary>
        /// Enum PACKEnum for PACK
        /// </summary>
        PACKEnum = 19,
        
        /// <summary>
        /// Enum MISSIONEnum for MISSION
        /// </summary>
        MISSIONEnum = 20,
        
        /// <summary>
        /// Enum TOURNAMENTEnum for TOURNAMENT
        /// </summary>
        TOURNAMENTEnum = 21,
        
        /// <summary>
        /// Enum ASSETEnum for ASSET
        /// </summary>
        ASSETEnum = 22,
        
        /// <summary>
        /// Enum ALBUMCONTESTEnum for ALBUM_CONTEST
        /// </summary>
        ALBUMCONTESTEnum = 23,
        
        /// <summary>
        /// Enum THEMEDESCRIPTOREnum for THEME_DESCRIPTOR
        /// </summary>
        THEMEDESCRIPTOREnum = 24,
        
        /// <summary>
        /// Enum OFFEREnum for OFFER
        /// </summary>
        OFFEREnum = 25,
        
        /// <summary>
        /// Enum OFFERLOCATIONEnum for OFFER_LOCATION
        /// </summary>
        OFFERLOCATIONEnum = 26,
        
        /// <summary>
        /// Enum EVENTEnum for EVENT
        /// </summary>
        EVENTEnum = 27,
        
        /// <summary>
        /// Enum RETAILEREnum for RETAILER
        /// </summary>
        RETAILEREnum = 28,
        
        /// <summary>
        /// Enum RETAILERLOCATIONEnum for RETAILER_LOCATION
        /// </summary>
        RETAILERLOCATIONEnum = 29,
        
        /// <summary>
        /// Enum NOTEEnum for NOTE
        /// </summary>
        NOTEEnum = 30,
        
        /// <summary>
        /// Enum CREATIVEEnum for CREATIVE
        /// </summary>
        CREATIVEEnum = 31,
        
        /// <summary>
        /// Enum FAVORITEEnum for FAVORITE
        /// </summary>
        FAVORITEEnum = 32,
        
        /// <summary>
        /// Enum LIKEEnum for LIKE
        /// </summary>
        LIKEEnum = 33,
        
        /// <summary>
        /// Enum RATINGEnum for RATING
        /// </summary>
        RATINGEnum = 34,
        
        /// <summary>
        /// Enum ANALYTICEnum for ANALYTIC
        /// </summary>
        ANALYTICEnum = 35,
        
        /// <summary>
        /// Enum THIRDPARTYCREDENTIALEnum for THIRD_PARTY_CREDENTIAL
        /// </summary>
        THIRDPARTYCREDENTIALEnum = 36,
        
        /// <summary>
        /// Enum THIRDPARTYNETWORKEnum for THIRD_PARTY_NETWORK
        /// </summary>
        THIRDPARTYNETWORKEnum = 37,
        
        /// <summary>
        /// Enum REGIONEnum for REGION
        /// </summary>
        REGIONEnum = 38
    }

    public RatableTypeEnum RatableType { get; set; }
    public long RatableId { get; set; }
    public CategoryResponse Category { get; set; }
    public Object Ratable { get; set; }
    public string SecondaryType { get; set; }
}


