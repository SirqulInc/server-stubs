namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class VehicleResponse 
{
    public string Id { get; set; }
    public string Name { get; set; }
    public long Capacity { get; set; }
    public GeoResponse Depot { get; set; }
    public long StartWindow { get; set; }
    public long EndWindow { get; set; }
    public GeoResponse Current { get; set; }
    public StopResponse DepotAsStop { get; set; }
}


