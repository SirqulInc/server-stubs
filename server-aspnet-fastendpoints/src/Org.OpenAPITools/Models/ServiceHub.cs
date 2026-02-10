namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ServiceHub 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string LocationDescription { get; set; }
    public string Name { get; set; }
    public string ExternalId { get; set; }
    public Retailer Business { get; set; }
    public Location Location { get; set; }
    public string VarTimeZone { get; set; }
}


