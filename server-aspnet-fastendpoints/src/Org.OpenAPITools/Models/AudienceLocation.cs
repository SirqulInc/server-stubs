namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AudienceLocation 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string LocationDescription { get; set; }
    public double Radius { get; set; }
}


