namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class MissionInviteResponse 
{
    public long Id { get; set; }
    
    /// <summary>
    /// Gets or Sets Status
    /// </summary>
    public enum StatusEnum
    {
        
        /// <summary>
        /// Enum AVAILABLEEnum for AVAILABLE
        /// </summary>
        AVAILABLEEnum = 1,
        
        /// <summary>
        /// Enum PENDINGEnum for PENDING
        /// </summary>
        PENDINGEnum = 2,
        
        /// <summary>
        /// Enum UPDATEDEnum for UPDATED
        /// </summary>
        UPDATEDEnum = 3,
        
        /// <summary>
        /// Enum ACCEPTEDEnum for ACCEPTED
        /// </summary>
        ACCEPTEDEnum = 4,
        
        /// <summary>
        /// Enum ACTIVEEnum for ACTIVE
        /// </summary>
        ACTIVEEnum = 5,
        
        /// <summary>
        /// Enum BUYBACKEnum for BUY_BACK
        /// </summary>
        BUYBACKEnum = 6,
        
        /// <summary>
        /// Enum FAILEDEnum for FAILED
        /// </summary>
        FAILEDEnum = 7,
        
        /// <summary>
        /// Enum QUITEnum for QUIT
        /// </summary>
        QUITEnum = 8,
        
        /// <summary>
        /// Enum COMPLETEDEnum for COMPLETED
        /// </summary>
        COMPLETEDEnum = 9,
        
        /// <summary>
        /// Enum PENDINGREVIEWEnum for PENDING_REVIEW
        /// </summary>
        PENDINGREVIEWEnum = 10,
        
        /// <summary>
        /// Enum REJECTEDEnum for REJECTED
        /// </summary>
        REJECTEDEnum = 11
    }

    public StatusEnum Status { get; set; }
    public string Title { get; set; }
    public string Description { get; set; }
    public AccountShortResponse Owner { get; set; }
    public long PermissionableId { get; set; }
    public string PermissionableType { get; set; }
    public bool Ranked { get; set; }
    public bool Rewarded { get; set; }
    public long StartDate { get; set; }
    public long EndDate { get; set; }
    public long Updated { get; set; }
    public bool BuyBackAvailable { get; set; }
    
    /// <summary>
    /// Gets or Sets InviteStatus
    /// </summary>
    public enum InviteStatusEnum
    {
        
        /// <summary>
        /// Enum AVAILABLEEnum for AVAILABLE
        /// </summary>
        AVAILABLEEnum = 1,
        
        /// <summary>
        /// Enum PENDINGEnum for PENDING
        /// </summary>
        PENDINGEnum = 2,
        
        /// <summary>
        /// Enum UPDATEDEnum for UPDATED
        /// </summary>
        UPDATEDEnum = 3,
        
        /// <summary>
        /// Enum ACCEPTEDEnum for ACCEPTED
        /// </summary>
        ACCEPTEDEnum = 4,
        
        /// <summary>
        /// Enum ACTIVEEnum for ACTIVE
        /// </summary>
        ACTIVEEnum = 5,
        
        /// <summary>
        /// Enum BUYBACKEnum for BUY_BACK
        /// </summary>
        BUYBACKEnum = 6,
        
        /// <summary>
        /// Enum FAILEDEnum for FAILED
        /// </summary>
        FAILEDEnum = 7,
        
        /// <summary>
        /// Enum QUITEnum for QUIT
        /// </summary>
        QUITEnum = 8,
        
        /// <summary>
        /// Enum COMPLETEDEnum for COMPLETED
        /// </summary>
        COMPLETEDEnum = 9,
        
        /// <summary>
        /// Enum PENDINGREVIEWEnum for PENDING_REVIEW
        /// </summary>
        PENDINGREVIEWEnum = 10,
        
        /// <summary>
        /// Enum REJECTEDEnum for REJECTED
        /// </summary>
        REJECTEDEnum = 11
    }

    public InviteStatusEnum InviteStatus { get; set; }
}


