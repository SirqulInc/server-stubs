namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class UserLocationListResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public List<UserLocationResponse> Items { get; set; }
    
    /// <summary>
    /// Gets or Sets UserLocationType
    /// </summary>
    public enum UserLocationTypeEnum
    {
        
        /// <summary>
        /// Enum POSTALCODEEnum for POSTALCODE
        /// </summary>
        POSTALCODEEnum = 1,
        
        /// <summary>
        /// Enum EXACTEnum for EXACT
        /// </summary>
        EXACTEnum = 2
    }

    public UserLocationTypeEnum UserLocationType { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string PostalCode { get; set; }
    public int Count { get; set; }
    public string Returning { get; set; }
}


