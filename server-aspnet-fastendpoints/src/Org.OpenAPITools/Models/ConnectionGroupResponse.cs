namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ConnectionGroupResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public long ConnectionGroupId { get; set; }
    public string Name { get; set; }
    
    /// <summary>
    /// Gets or Sets GroupType
    /// </summary>
    public enum GroupTypeEnum
    {
        
        /// <summary>
        /// Enum PRIVATEEnum for PRIVATE
        /// </summary>
        PRIVATEEnum = 1,
        
        /// <summary>
        /// Enum FRIENDSEnum for FRIENDS
        /// </summary>
        FRIENDSEnum = 2,
        
        /// <summary>
        /// Enum TRUSTEDEnum for TRUSTED
        /// </summary>
        TRUSTEDEnum = 3,
        
        /// <summary>
        /// Enum BLOCKEDEnum for BLOCKED
        /// </summary>
        BLOCKEDEnum = 4,
        
        /// <summary>
        /// Enum FOLLOWERSEnum for FOLLOWERS
        /// </summary>
        FOLLOWERSEnum = 5,
        
        /// <summary>
        /// Enum FOLLOWINGEnum for FOLLOWING
        /// </summary>
        FOLLOWINGEnum = 6,
        
        /// <summary>
        /// Enum PENDINGEnum for PENDING
        /// </summary>
        PENDINGEnum = 7,
        
        /// <summary>
        /// Enum REQUESTEnum for REQUEST
        /// </summary>
        REQUESTEnum = 8
    }

    public GroupTypeEnum GroupType { get; set; }
    public string ThumbnailURL { get; set; }
    public List<ConnectionGroupResponse> SubGroups { get; set; }
    public string Description { get; set; }
    public bool Active { get; set; }
    public int ConnectionCount { get; set; }
    public List<ConnectionResponse> Connections { get; set; }
    public GroupPermissions GroupPermissions { get; set; }
    public long OwnerId { get; set; }
    public string Returning { get; set; }
}


