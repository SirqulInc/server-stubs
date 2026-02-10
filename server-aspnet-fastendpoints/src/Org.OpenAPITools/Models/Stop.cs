namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Stop 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string LocationDescription { get; set; }
    public string Name { get; set; }
    public Account Owner { get; set; }
    public Location Location { get; set; }
    public List<Note> Notes { get; set; }
    public long NoteCount { get; set; }
    
    /// <summary>
    /// Gets or Sets StopType
    /// </summary>
    public enum StopTypeEnum
    {
        
        /// <summary>
        /// Enum PICKUPEnum for PICKUP
        /// </summary>
        PICKUPEnum = 1,
        
        /// <summary>
        /// Enum DROPOFFEnum for DROPOFF
        /// </summary>
        DROPOFFEnum = 2,
        
        /// <summary>
        /// Enum STARTEnum for START
        /// </summary>
        STARTEnum = 3,
        
        /// <summary>
        /// Enum ENDEnum for END
        /// </summary>
        ENDEnum = 4,
        
        /// <summary>
        /// Enum ROUTINGEnum for ROUTING
        /// </summary>
        ROUTINGEnum = 5
    }

    public StopTypeEnum StopType { get; set; }
    public long OrderIndex { get; set; }
    public DateTime StartTime { get; set; }
    public DateTime EndTime { get; set; }
    public DateTime EstimatedTime { get; set; }
    public DateTime EstimatedArrivalTime { get; set; }
    public DateTime EstimatedDepartureTime { get; set; }
    public DateTime ActualTime { get; set; }
    public DateTime DesiredTime { get; set; }
    public int TimePadding { get; set; }
    public Route Route { get; set; }
    public Shipment Shipment { get; set; }
    
    /// <summary>
    /// Gets or Sets ProgressStatus
    /// </summary>
    public enum ProgressStatusEnum
    {
        
        /// <summary>
        /// Enum PENDINGEnum for PENDING
        /// </summary>
        PENDINGEnum = 1,
        
        /// <summary>
        /// Enum COMPLETEEnum for COMPLETE
        /// </summary>
        COMPLETEEnum = 2,
        
        /// <summary>
        /// Enum INVALIDEnum for INVALID
        /// </summary>
        INVALIDEnum = 3
    }

    public ProgressStatusEnum ProgressStatus { get; set; }
    public DateTime CompareEstimatedTime { get; set; }
    public DateTime CompareEstimatedArrivalTime { get; set; }
    public DateTime CompareEstimiatedDepartureTime { get; set; }
    public string Polyline { get; set; }
    public Stop Parent { get; set; }
    public string LocationDisplay { get; set; }
    public bool Complete { get; set; }
    public string ContentName { get; set; }
    public string LocationAddress { get; set; }
}


