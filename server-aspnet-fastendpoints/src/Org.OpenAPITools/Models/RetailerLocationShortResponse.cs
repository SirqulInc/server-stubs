namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RetailerLocationShortResponse 
{
    public long RetailerLocationId { get; set; }
    public string Name { get; set; }
    public ContactInfoResponse Contact { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public bool Active { get; set; }
    public long FavoriteId { get; set; }
    public bool Favorite { get; set; }
}


