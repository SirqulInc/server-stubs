namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ReportBatchResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public long BatchId { get; set; }
    
    /// <summary>
    /// Gets or Sets ReportBatchStatus
    /// </summary>
    public enum ReportBatchStatusEnum
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
        /// Enum PARSEERROREnum for PARSE_ERROR
        /// </summary>
        PARSEERROREnum = 4,
        
        /// <summary>
        /// Enum PROCESSINGEnum for PROCESSING
        /// </summary>
        PROCESSINGEnum = 5,
        
        /// <summary>
        /// Enum DUPLICATEEnum for DUPLICATE
        /// </summary>
        DUPLICATEEnum = 6,
        
        /// <summary>
        /// Enum SAVEONLYEnum for SAVEONLY
        /// </summary>
        SAVEONLYEnum = 7
    }

    public ReportBatchStatusEnum ReportBatchStatus { get; set; }
    public string ErrorMessage { get; set; }
    public string Endpoint { get; set; }
    public string PageUrl { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public long Created { get; set; }
    public long Updated { get; set; }
    public string Returning { get; set; }
}


