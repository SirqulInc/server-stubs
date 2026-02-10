namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class DisbursementResponse 
{
    public long DisbursementId { get; set; }
    public string Title { get; set; }
    public string Comment { get; set; }
    public string ExternalId { get; set; }
    public string IntrospectionParams { get; set; }
    public decimal Amount { get; set; }
    public long ScheduledDate { get; set; }
    public long CaptureDate { get; set; }
    public long EstimatedDate { get; set; }
    public long SettledDate { get; set; }
    
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
        /// Enum APPROVEDEnum for APPROVED
        /// </summary>
        APPROVEDEnum = 2,
        
        /// <summary>
        /// Enum VALIDATINGEnum for VALIDATING
        /// </summary>
        VALIDATINGEnum = 3,
        
        /// <summary>
        /// Enum ERROREnum for ERROR
        /// </summary>
        ERROREnum = 4,
        
        /// <summary>
        /// Enum AUTHORIZEDEnum for AUTHORIZED
        /// </summary>
        AUTHORIZEDEnum = 5,
        
        /// <summary>
        /// Enum CAPTUREDEnum for CAPTURED
        /// </summary>
        CAPTUREDEnum = 6,
        
        /// <summary>
        /// Enum SETTLEDEnum for SETTLED
        /// </summary>
        SETTLEDEnum = 7
    }

    public StatusEnum Status { get; set; }
    
    /// <summary>
    /// Gets or Sets Provider
    /// </summary>
    public enum ProviderEnum
    {
        
        /// <summary>
        /// Enum AUTHORIZENETEnum for AUTHORIZE_NET
        /// </summary>
        AUTHORIZENETEnum = 1,
        
        /// <summary>
        /// Enum AMAZONFPSEnum for AMAZON_FPS
        /// </summary>
        AMAZONFPSEnum = 2,
        
        /// <summary>
        /// Enum BILLCOMEnum for BILL_COM
        /// </summary>
        BILLCOMEnum = 3
    }

    public ProviderEnum Provider { get; set; }
    public BillableEntityShortResponse SenderBillable { get; set; }
    public BillableEntityShortResponse ReceiverBillable { get; set; }
    public string ErrorCode { get; set; }
    public string ErrorMessage { get; set; }
}


