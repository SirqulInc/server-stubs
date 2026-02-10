namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TrilatAppSettings 
{
    
    /// <summary>
    /// Gets or Sets ProcessingType
    /// </summary>
    public enum ProcessingTypeEnum
    {
        
        /// <summary>
        /// Enum DEFAULTEnum for DEFAULT
        /// </summary>
        DEFAULTEnum = 1,
        
        /// <summary>
        /// Enum FINGERPRINTEnum for FINGERPRINT
        /// </summary>
        FINGERPRINTEnum = 2,
        
        /// <summary>
        /// Enum FINGERPRINTV2Enum for FINGERPRINT_V2
        /// </summary>
        FINGERPRINTV2Enum = 3
    }

    public ProcessingTypeEnum ProcessingType { get; set; }
    public int MaxSampleSize { get; set; }
    public double MinRSSI { get; set; }
}


