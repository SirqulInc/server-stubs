namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ScheduledNotificationShortResponse 
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
}


