namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class NotificationTemplateResponse 
{
    public long NotificationTemplateId { get; set; }
    public string Event { get; set; }
    
    /// <summary>
    /// Gets or Sets Conduit
    /// </summary>
    public enum ConduitEnum
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

    public ConduitEnum Conduit { get; set; }
    public string Title { get; set; }
    public string Body { get; set; }
    public string PublicBody { get; set; }
    public ApplicationMiniResponse Application { get; set; }
    public long Updated { get; set; }
    public long Created { get; set; }
    public string Tags { get; set; }
}


