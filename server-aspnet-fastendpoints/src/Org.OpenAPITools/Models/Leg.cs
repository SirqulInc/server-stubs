namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Leg 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public Account Owner { get; set; }
    public Account ParentOwner { get; set; }
    public Application Application { get; set; }
    public string DeviceId { get; set; }
    public double Distance { get; set; }
    public long Duration { get; set; }
    public double StartLatitude { get; set; }
    public double StartLongitude { get; set; }
    public double StartAltitude { get; set; }
    public DateTime StartDate { get; set; }
    public double EndLatitude { get; set; }
    public double EndLongitude { get; set; }
    public double EndAltitude { get; set; }
    public DateTime EndDate { get; set; }
    public string Type { get; set; }
    public long RetailerLocationId { get; set; }
    public string FloorId { get; set; }
    public List<Step> Steps { get; set; }
}


