namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PostalCode 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string LocationDescription { get; set; }
    public string Code { get; set; }
    public string Plus4 { get; set; }
    public string StateCode { get; set; }
    public string City { get; set; }
    public string VarTimeZone { get; set; }
    public int UtcOffset { get; set; }
    public List<Region> Regions { get; set; }
    public bool Eliminated { get; set; }
    public bool SearchPoint { get; set; }
    public DateTime LastOfferImport { get; set; }
    public double TruncatedLatitude { get; set; }
    public double TruncatedLongitude { get; set; }
}


