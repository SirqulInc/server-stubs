namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ConfigRoutingRequest 
{
    public bool DebugMode { get; set; }
    public bool Threaded { get; set; }
    public string ThreadType { get; set; }
    public long MaxRuntime { get; set; }
    public int NumberOfMatches { get; set; }
    public int MaxItineraryTime { get; set; }
    public int MaxStopsPerVehicle { get; set; }
    public int AverageCityTimePerMile { get; set; }
    public int AverageFreewayTimePerMile { get; set; }
    public float FreewayTravelDistance { get; set; }
    public double SameStopBuffer { get; set; }
    
    /// <summary>
    /// Gets or Sets OrderAlgorithm
    /// </summary>
    public enum OrderAlgorithmEnum
    {
        
        /// <summary>
        /// Enum CLOSESTFIRSTEnum for CLOSEST_FIRST
        /// </summary>
        CLOSESTFIRSTEnum = 1,
        
        /// <summary>
        /// Enum FURTHESTFIRSTEnum for FURTHEST_FIRST
        /// </summary>
        FURTHESTFIRSTEnum = 2,
        
        /// <summary>
        /// Enum PICKUPSFIRSTEnum for PICKUPS_FIRST
        /// </summary>
        PICKUPSFIRSTEnum = 3
    }

    public OrderAlgorithmEnum OrderAlgorithm { get; set; }
    
    /// <summary>
    /// Gets or Sets ScoreAlgorithm
    /// </summary>
    public enum ScoreAlgorithmEnum
    {
        
        /// <summary>
        /// Enum FEWESTVEHICLESEnum for FEWEST_VEHICLES
        /// </summary>
        FEWESTVEHICLESEnum = 1,
        
        /// <summary>
        /// Enum SHORTESTPASSENGERTIMEEnum for SHORTEST_PASSENGER_TIME
        /// </summary>
        SHORTESTPASSENGERTIMEEnum = 2
    }

    public ScoreAlgorithmEnum ScoreAlgorithm { get; set; }
}


