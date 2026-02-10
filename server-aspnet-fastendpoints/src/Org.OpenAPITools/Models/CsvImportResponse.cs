namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CsvImportResponse 
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
    /// Gets or Sets CsvImportBatchStatus
    /// </summary>
    public enum CsvImportBatchStatusEnum
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
        DUPLICATEEnum = 6
    }

    public CsvImportBatchStatusEnum CsvImportBatchStatus { get; set; }
    public string ErrorMessage { get; set; }
    
    /// <summary>
    /// Gets or Sets ObjectType
    /// </summary>
    public enum ObjectTypeEnum
    {
        
        /// <summary>
        /// Enum OFFERSEnum for OFFERS
        /// </summary>
        OFFERSEnum = 1,
        
        /// <summary>
        /// Enum RETAILERSEnum for RETAILERS
        /// </summary>
        RETAILERSEnum = 2,
        
        /// <summary>
        /// Enum RETAILERLOCATIONSEnum for RETAILERLOCATIONS
        /// </summary>
        RETAILERLOCATIONSEnum = 3,
        
        /// <summary>
        /// Enum CATEGORIESEnum for CATEGORIES
        /// </summary>
        CATEGORIESEnum = 4,
        
        /// <summary>
        /// Enum FILTERSEnum for FILTERS
        /// </summary>
        FILTERSEnum = 5
    }

    public ObjectTypeEnum ObjectType { get; set; }
    public string Returning { get; set; }
}


