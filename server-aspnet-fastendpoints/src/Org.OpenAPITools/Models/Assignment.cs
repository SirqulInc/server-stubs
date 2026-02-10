namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Assignment 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public Account Assignee { get; set; }
    public RetailerLocation RetailerLocation { get; set; }
    public Account Creator { get; set; }
    public Account LastUpdatedBy { get; set; }
    public AssignmentStatus CurrentStatus { get; set; }
    
    /// <summary>
    /// Gets or Sets CurrentStatusType
    /// </summary>
    public enum CurrentStatusTypeEnum
    {
        
        /// <summary>
        /// Enum NEWEnum for NEW
        /// </summary>
        NEWEnum = 1,
        
        /// <summary>
        /// Enum INPROGRESSEnum for IN_PROGRESS
        /// </summary>
        INPROGRESSEnum = 2,
        
        /// <summary>
        /// Enum SUBSCRIBEDEnum for SUBSCRIBED
        /// </summary>
        SUBSCRIBEDEnum = 3,
        
        /// <summary>
        /// Enum ARCHIVEDEnum for ARCHIVED
        /// </summary>
        ARCHIVEDEnum = 4
    }

    public CurrentStatusTypeEnum CurrentStatusType { get; set; }
    public List<Asset> Assets { get; set; }
    public List<Note> Notes { get; set; }
    public Permissions PublicPermissions { get; set; }
    public List<UserPermissions> UserPermissions { get; set; }
    
    /// <summary>
    /// Gets or Sets Visibility
    /// </summary>
    public enum VisibilityEnum
    {
        
        /// <summary>
        /// Enum PUBLICEnum for PUBLIC
        /// </summary>
        PUBLICEnum = 1,
        
        /// <summary>
        /// Enum PRIVATEEnum for PRIVATE
        /// </summary>
        PRIVATEEnum = 2,
        
        /// <summary>
        /// Enum FRIENDSEnum for FRIENDS
        /// </summary>
        FRIENDSEnum = 3
    }

    public VisibilityEnum Visibility { get; set; }
    public List<AssignmentStatus> Statuses { get; set; }
    public Application Application { get; set; }
    
    /// <summary>
    /// Gets or Sets ApprovalStatus
    /// </summary>
    public enum ApprovalStatusEnum
    {
        
        /// <summary>
        /// Enum PENDINGEnum for PENDING
        /// </summary>
        PENDINGEnum = 1,
        
        /// <summary>
        /// Enum REJECTEDEnum for REJECTED
        /// </summary>
        REJECTEDEnum = 2,
        
        /// <summary>
        /// Enum APPROVEDEnum for APPROVED
        /// </summary>
        APPROVEDEnum = 3,
        
        /// <summary>
        /// Enum FEATUREDEnum for FEATURED
        /// </summary>
        FEATUREDEnum = 4
    }

    public ApprovalStatusEnum ApprovalStatus { get; set; }
    public string ContentName { get; set; }
    public Asset ContentAsset { get; set; }
    public Account Owner { get; set; }
    public long NoteCount { get; set; }
}


