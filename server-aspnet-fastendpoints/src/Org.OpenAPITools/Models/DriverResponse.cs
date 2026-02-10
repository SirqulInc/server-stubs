namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class DriverResponse 
{
    public string Id { get; set; }
    public string Name { get; set; }
    public LocationResponse Depot { get; set; }
    public List<AvailabilityResponse> Availability { get; set; }
}


