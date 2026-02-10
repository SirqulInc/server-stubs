namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ThirdPartyNetworkShortResponse 
{
    public long Updated { get; set; }
    public long Created { get; set; }
    public bool Active { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public string NetworkUID { get; set; }
    
    /// <summary>
    /// Gets or Sets Network
    /// </summary>
    public enum NetworkEnum
    {
        
        /// <summary>
        /// Enum FACEBOOKEnum for FACEBOOK
        /// </summary>
        FACEBOOKEnum = 1,
        
        /// <summary>
        /// Enum TWITTEREnum for TWITTER
        /// </summary>
        TWITTEREnum = 2,
        
        /// <summary>
        /// Enum CLEAREnum for CLEAR
        /// </summary>
        CLEAREnum = 3,
        
        /// <summary>
        /// Enum USERNAMEEnum for USERNAME
        /// </summary>
        USERNAMEEnum = 4,
        
        /// <summary>
        /// Enum PHONEEnum for PHONE
        /// </summary>
        PHONEEnum = 5,
        
        /// <summary>
        /// Enum UNKNOWNEnum for UNKNOWN
        /// </summary>
        UNKNOWNEnum = 6,
        
        /// <summary>
        /// Enum CUSTOMEnum for CUSTOM
        /// </summary>
        CUSTOMEnum = 7
    }

    public NetworkEnum Network { get; set; }
}


