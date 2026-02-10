namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ScheduledNotification 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public Account Owner { get; set; }
    public BillableEntity BillableEntity { get; set; }
    
    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum HTTPEnum for HTTP
        /// </summary>
        HTTPEnum = 1,
        
        /// <summary>
        /// Enum SAVEEnum for SAVE
        /// </summary>
        SAVEEnum = 2,
        
        /// <summary>
        /// Enum EMAILEnum for EMAIL
        /// </summary>
        EMAILEnum = 3,
        
        /// <summary>
        /// Enum SMSEnum for SMS
        /// </summary>
        SMSEnum = 4,
        
        /// <summary>
        /// Enum APNSEnum for APNS
        /// </summary>
        APNSEnum = 5,
        
        /// <summary>
        /// Enum GCMEnum for GCM
        /// </summary>
        GCMEnum = 6,
        
        /// <summary>
        /// Enum PUSHEnum for PUSH
        /// </summary>
        PUSHEnum = 7,
        
        /// <summary>
        /// Enum MOBILENOTIFICATIONEnum for MOBILE_NOTIFICATION
        /// </summary>
        MOBILENOTIFICATIONEnum = 8
    }

    public TypeEnum Type { get; set; }
    
    /// <summary>
    /// Gets or Sets Status
    /// </summary>
    public enum StatusEnum
    {
        
        /// <summary>
        /// Enum NEWEnum for NEW
        /// </summary>
        NEWEnum = 1,
        
        /// <summary>
        /// Enum ERROREnum for ERROR
        /// </summary>
        ERROREnum = 2,
        
        /// <summary>
        /// Enum COMPLETEEnum for COMPLETE
        /// </summary>
        COMPLETEEnum = 3,
        
        /// <summary>
        /// Enum PROCESSINGEnum for PROCESSING
        /// </summary>
        PROCESSINGEnum = 4,
        
        /// <summary>
        /// Enum TEMPLATEEnum for TEMPLATE
        /// </summary>
        TEMPLATEEnum = 5
    }

    public StatusEnum Status { get; set; }
    
    /// <summary>
    /// Gets or Sets TemplateType
    /// </summary>
    public enum TemplateTypeEnum
    {
        
        /// <summary>
        /// Enum REPORTINGEnum for REPORTING
        /// </summary>
        REPORTINGEnum = 1,
        
        /// <summary>
        /// Enum ACHIEVEMENTOWNEREnum for ACHIEVEMENT_OWNER
        /// </summary>
        ACHIEVEMENTOWNEREnum = 2,
        
        /// <summary>
        /// Enum ACHIEVEMENTTRIGGEREnum for ACHIEVEMENT_TRIGGER
        /// </summary>
        ACHIEVEMENTTRIGGEREnum = 3,
        
        /// <summary>
        /// Enum GEOFENCEOWNEREnum for GEOFENCE_OWNER
        /// </summary>
        GEOFENCEOWNEREnum = 4,
        
        /// <summary>
        /// Enum GEOFENCETARGETEnum for GEOFENCE_TARGET
        /// </summary>
        GEOFENCETARGETEnum = 5,
        
        /// <summary>
        /// Enum GEOFENCETRIGGEREnum for GEOFENCE_TRIGGER
        /// </summary>
        GEOFENCETRIGGEREnum = 6,
        
        /// <summary>
        /// Enum GEOFENCEHTTPCALLEnum for GEOFENCE_HTTP_CALL
        /// </summary>
        GEOFENCEHTTPCALLEnum = 7
    }

    public TemplateTypeEnum TemplateType { get; set; }
    public string Name { get; set; }
    public string ErrorMessage { get; set; }
    public string Message { get; set; }
    public string Payload { get; set; }
    public string ContentName { get; set; }
    public long ContentId { get; set; }
    public string ContentType { get; set; }
    public long ParentId { get; set; }
    public string ParentType { get; set; }
    public Application Application { get; set; }
    public List<ConnectionGroup> ConnectionGroups { get; set; }
    public List<long> AccountIds { get; set; }
    public List<Audience> Audiences { get; set; }
    public ReportDefinition Report { get; set; }
    public string ReportParams { get; set; }
    public string EndpointURL { get; set; }
    public DateTime LastActionDate { get; set; }
    public DateTime ScheduledDate { get; set; }
    public DateTime StartDate { get; set; }
    public DateTime EndDate { get; set; }
    public string CronExpression { get; set; }
    public long DeliverEstimate { get; set; }
    public long DeliverCount { get; set; }
    public long DeliverFailed { get; set; }
    public long DeliverTotal { get; set; }
    public long DeliverStart { get; set; }
    public long DeliverLimit { get; set; }
    public long ProcessingTime { get; set; }
    public long SendingTime { get; set; }
    public string GroupingId { get; set; }
    public string ConditionalInput { get; set; }
    public string ConditionalCode { get; set; }
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
    public Asset ContentAsset { get; set; }
}


