namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ItineraryResponse 
{
    public string ItineraryId { get; set; }
    public long WaypointCount { get; set; }
    public long Score { get; set; }
    public string ErrorCode { get; set; }
    public string Error { get; set; }
    public int ItemCount { get; set; }
    public VehicleResponse Vehicle { get; set; }
    public List<StopResponse> Stops { get; set; }
    public long EstimatedStartTime { get; set; }
    public long EstimatedEndTime { get; set; }
    public long EstimatedDuration { get; set; }
    public double EstimatedDistance { get; set; }
    public long WaitTime { get; set; }
    public bool Generated { get; set; }
    public bool Valid { get; set; }
}


