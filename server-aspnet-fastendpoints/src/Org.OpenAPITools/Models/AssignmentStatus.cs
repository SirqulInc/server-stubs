namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AssignmentStatus 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public Assignment Assignment { get; set; }
    public Account Creator { get; set; }
    
    /// <summary>
    /// Gets or Sets ToDo
    /// </summary>
    public enum ToDoEnum
    {
        
        /// <summary>
        /// Enum SITEVISITEnum for SITE_VISIT
        /// </summary>
        SITEVISITEnum = 1,
        
        /// <summary>
        /// Enum PHONEEnum for PHONE
        /// </summary>
        PHONEEnum = 2,
        
        /// <summary>
        /// Enum RECONTACTEnum for RECONTACT
        /// </summary>
        RECONTACTEnum = 3,
        
        /// <summary>
        /// Enum RENEWALEnum for RENEWAL
        /// </summary>
        RENEWALEnum = 4,
        
        /// <summary>
        /// Enum CREDITEnum for CREDIT
        /// </summary>
        CREDITEnum = 5
    }

    public ToDoEnum ToDo { get; set; }
    
    /// <summary>
    /// Gets or Sets Connection
    /// </summary>
    public enum ConnectionEnum
    {
        
        /// <summary>
        /// Enum INITIALEnum for INITIAL
        /// </summary>
        INITIALEnum = 1,
        
        /// <summary>
        /// Enum FOLLOWUPEnum for FOLLOW_UP
        /// </summary>
        FOLLOWUPEnum = 2,
        
        /// <summary>
        /// Enum DECLINEDEnum for DECLINED
        /// </summary>
        DECLINEDEnum = 3
    }

    public ConnectionEnum Connection { get; set; }
    
    /// <summary>
    /// Gets or Sets Method
    /// </summary>
    public enum MethodEnum
    {
        
        /// <summary>
        /// Enum PHONEEnum for PHONE
        /// </summary>
        PHONEEnum = 1,
        
        /// <summary>
        /// Enum SITEVISITEnum for SITE_VISIT
        /// </summary>
        SITEVISITEnum = 2,
        
        /// <summary>
        /// Enum EMAILEnum for EMAIL
        /// </summary>
        EMAILEnum = 3
    }

    public MethodEnum Method { get; set; }
    
    /// <summary>
    /// Gets or Sets Status
    /// </summary>
    public enum StatusEnum
    {
        
        /// <summary>
        /// Enum ARCHIVEDEnum for ARCHIVED
        /// </summary>
        ARCHIVEDEnum = 1,
        
        /// <summary>
        /// Enum SUBSCRIBEDEnum for SUBSCRIBED
        /// </summary>
        SUBSCRIBEDEnum = 2,
        
        /// <summary>
        /// Enum UNSUBSCRIBEDEnum for UNSUBSCRIBED
        /// </summary>
        UNSUBSCRIBEDEnum = 3,
        
        /// <summary>
        /// Enum CONTACTEDEnum for CONTACTED
        /// </summary>
        CONTACTEDEnum = 4,
        
        /// <summary>
        /// Enum DECLINEDEnum for DECLINED
        /// </summary>
        DECLINEDEnum = 5,
        
        /// <summary>
        /// Enum NOTCONTACTEDEnum for NOT_CONTACTED
        /// </summary>
        NOTCONTACTEDEnum = 6
    }

    public StatusEnum Status { get; set; }
    
    /// <summary>
    /// Gets or Sets Closure
    /// </summary>
    public enum ClosureEnum
    {
        
        /// <summary>
        /// Enum PHONEEnum for PHONE
        /// </summary>
        PHONEEnum = 1,
        
        /// <summary>
        /// Enum SITEVISITEnum for SITE_VISIT
        /// </summary>
        SITEVISITEnum = 2,
        
        /// <summary>
        /// Enum PHONESITEEnum for PHONE_SITE
        /// </summary>
        PHONESITEEnum = 3,
        
        /// <summary>
        /// Enum WEBEnum for WEB
        /// </summary>
        WEBEnum = 4
    }

    public ClosureEnum Closure { get; set; }
    public string Message { get; set; }
    public DateTime FollowUp { get; set; }
    public ScheduledNotification Notification { get; set; }
}


