namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AssignmentResponse 
{
    public long AssignmentId { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public bool Active { get; set; }
    public long Created { get; set; }
    public long Updated { get; set; }
    public AccountShortResponse Assignee { get; set; }
    public AccountShortResponse Creator { get; set; }
    public AccountShortResponse LastReportedBy { get; set; }
    public RetailerLocationShortResponse Location { get; set; }
    public AssignmentStatusResponse CurrentStatus { get; set; }
    
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
}


