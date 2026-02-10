namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RoutingResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public List<LoadResponse> Items { get; set; }
    public List<VehicleResponse> Vehicles { get; set; }
    public List<DriverResponse> Drivers { get; set; }
    public ConfigRoutingRequest Config { get; set; }
    public string Error { get; set; }
    public List<string> Debug { get; set; }
    public DateTime StartTime { get; set; }
    public DateTime EndTime { get; set; }
    public List<RoutingResponse> Responses { get; set; }
    public string OrignalRequest { get; set; }
    public bool Generated { get; set; }
    public List<ItineraryResponse> Itineraries { get; set; }
    public long Score { get; set; }
    public int LoadSize { get; set; }
    public long Runtime { get; set; }
    public long EarliestPickupWindow { get; set; }
    public long LatestPickupWindow { get; set; }
    public string Returning { get; set; }
}


