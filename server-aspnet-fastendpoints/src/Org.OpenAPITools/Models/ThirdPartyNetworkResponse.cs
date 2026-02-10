namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ThirdPartyNetworkResponse 
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
    
    /// <summary>
    /// Gets or Sets IntrospectionMethod
    /// </summary>
    public enum IntrospectionMethodEnum
    {
        
        /// <summary>
        /// Enum GETEnum for GET
        /// </summary>
        GETEnum = 1,
        
        /// <summary>
        /// Enum HEADEnum for HEAD
        /// </summary>
        HEADEnum = 2,
        
        /// <summary>
        /// Enum POSTEnum for POST
        /// </summary>
        POSTEnum = 3,
        
        /// <summary>
        /// Enum PUTEnum for PUT
        /// </summary>
        PUTEnum = 4,
        
        /// <summary>
        /// Enum PATCHEnum for PATCH
        /// </summary>
        PATCHEnum = 5,
        
        /// <summary>
        /// Enum DELETEEnum for DELETE
        /// </summary>
        DELETEEnum = 6,
        
        /// <summary>
        /// Enum OPTIONSEnum for OPTIONS
        /// </summary>
        OPTIONSEnum = 7,
        
        /// <summary>
        /// Enum TRACEEnum for TRACE
        /// </summary>
        TRACEEnum = 8
    }

    public IntrospectionMethodEnum IntrospectionMethod { get; set; }
    public bool EnableIntrospection { get; set; }
    public string IntrospectionURL { get; set; }
    public string IntrospectionParams { get; set; }
    public string RequiredRootField { get; set; }
}


