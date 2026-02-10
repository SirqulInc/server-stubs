namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class GeoPointResponse 
{
    public string ObjectId { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public double Altitude { get; set; }
    public string LocationDescription { get; set; }
    public long LocatableId { get; set; }
    public string LocatableObjectId { get; set; }
    public string LocatableObjectName { get; set; }
    public string LocatableDisplay { get; set; }
    public AssetShortResponse Asset { get; set; }
    public double Distance { get; set; }
}


