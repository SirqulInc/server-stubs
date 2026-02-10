namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AudienceTargetType 
{
    
    /// <summary>
    /// Gets or Sets TargetType
    /// </summary>
    public enum TargetTypeEnum
    {
        
        /// <summary>
        /// Enum RETAILERLOCATIONEnum for RETAILER_LOCATION
        /// </summary>
        RETAILERLOCATIONEnum = 1,
        
        /// <summary>
        /// Enum OFFERLOCATIONEnum for OFFER_LOCATION
        /// </summary>
        OFFERLOCATIONEnum = 2,
        
        /// <summary>
        /// Enum ACCOUNTEnum for ACCOUNT
        /// </summary>
        ACCOUNTEnum = 3,
        
        /// <summary>
        /// Enum REGIONEnum for REGION
        /// </summary>
        REGIONEnum = 4
    }

    public TargetTypeEnum TargetType { get; set; }
    public string TargetDescription { get; set; }
    public RetailerLocation RetailerLocation { get; set; }
    public OfferLocation OfferLocation { get; set; }
    public Account Account { get; set; }
    public Region Region { get; set; }
}


