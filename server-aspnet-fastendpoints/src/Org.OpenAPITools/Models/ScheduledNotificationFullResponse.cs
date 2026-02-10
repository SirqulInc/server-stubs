namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ScheduledNotificationFullResponse 
{
    public long ScheduledNotificationId { get; set; }
    public bool Active { get; set; }
    
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
    public string Name { get; set; }
    public string Message { get; set; }
    public string GroupingId { get; set; }
    public long ScheduledDate { get; set; }
    public long StartDate { get; set; }
    public long EndDate { get; set; }
    public AccountShortResponse Owner { get; set; }
    public BillableEntityShortResponse BillableEntity { get; set; }
    public long ContentId { get; set; }
    public string ContentName { get; set; }
    public string ContentType { get; set; }
    public long ParentId { get; set; }
    public string ParentType { get; set; }
    public ApplicationMiniResponse Application { get; set; }
    public long TargetId { get; set; }
    public string TargetName { get; set; }
    public string TargetType { get; set; }
    public string TargetParams { get; set; }
    public long DeliverEstimate { get; set; }
    public long DeliverCount { get; set; }
    public long DeliverTotal { get; set; }
    public long DeliverFailed { get; set; }
    public long ProcessingTime { get; set; }
    public long SendingTime { get; set; }
    public long Updated { get; set; }
    public long Created { get; set; }
    public string CronExpression { get; set; }
    public string EndpointURL { get; set; }
    public string Payload { get; set; }
    public string ConditionalInput { get; set; }
    public List<long> ConnectionAccountIds { get; set; }
    
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
    public List<ScheduledNotificationFullResponse.GroupedTypesEnum> GroupedTypes { get; set; }
}


