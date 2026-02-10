namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ShipmentBatch 
{
    public long Id { get; set; }
    public DateTime Created { get; set; }
    public DateTime Updated { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public Retailer Retailer { get; set; }
    public ServiceHub Hub { get; set; }
    public Program Program { get; set; }
    public List<ShipmentImportStatus> ShipmentImportStatuses { get; set; }
    public List<Shipment> Shipments { get; set; }
    public DateTime Uploaded { get; set; }
    public DateTime Started { get; set; }
    public DateTime OptimizationStarted { get; set; }
    public DateTime Completed { get; set; }
    public DateTime OptimizationCompleted { get; set; }
    public string Source { get; set; }
    public string ExternalId { get; set; }
    public int Total { get; set; }
    public int ProcessedCount { get; set; }
    public int SuccessCount { get; set; }
    public int FailedCount { get; set; }
    public int ValidCount { get; set; }
    public int InvalidCount { get; set; }
    public double AverageTravelSpeed { get; set; }
    public long MaxSeconds { get; set; }
    
    /// <summary>
    /// Gets or Sets ImportStatus
    /// </summary>
    public enum ImportStatusEnum
    {
        
        /// <summary>
        /// Enum NEWEnum for NEW
        /// </summary>
        NEWEnum = 1,
        
        /// <summary>
        /// Enum STARTEDEnum for STARTED
        /// </summary>
        STARTEDEnum = 2,
        
        /// <summary>
        /// Enum FETCHINGDISTANCEDATAEnum for FETCHING_DISTANCE_DATA
        /// </summary>
        FETCHINGDISTANCEDATAEnum = 3,
        
        /// <summary>
        /// Enum OPTIMIZINGEnum for OPTIMIZING
        /// </summary>
        OPTIMIZINGEnum = 4,
        
        /// <summary>
        /// Enum CREATINGROUTESEnum for CREATING_ROUTES
        /// </summary>
        CREATINGROUTESEnum = 5,
        
        /// <summary>
        /// Enum COMPLETEDEnum for COMPLETED
        /// </summary>
        COMPLETEDEnum = 6,
        
        /// <summary>
        /// Enum INCOMPLETEEnum for INCOMPLETE
        /// </summary>
        INCOMPLETEEnum = 7
    }

    public ImportStatusEnum ImportStatus { get; set; }
    public int TotalRoutes { get; set; }
    public int RoutesCreated { get; set; }
    public int TotalLegsRequests { get; set; }
    public int LegsRequested { get; set; }
    public int InitScore { get; set; }
    public long HardScore { get; set; }
    public long MediumScore { get; set; }
    public long SoftScore { get; set; }
}


