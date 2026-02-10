namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class StopResponse 
{
    public string GeoId { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public long StartWindow { get; set; }
    public long EndWindow { get; set; }
    
    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    public enum TypeEnum
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

    public TypeEnum Type { get; set; }
    public long Eta { get; set; }
    public long Etd { get; set; }
    public long Score { get; set; }
    public string ErrorCode { get; set; }
    public string Error { get; set; }
    public string ItemId { get; set; }
    public long ItemSize { get; set; }
    public LoadShortResponse Load { get; set; }
    public List<NodeRequest> FloorPlanPath { get; set; }
    public bool Valid { get; set; }
}


