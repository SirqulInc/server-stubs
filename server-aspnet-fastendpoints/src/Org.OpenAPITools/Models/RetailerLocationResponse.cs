namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RetailerLocationResponse 
{
    public long RetailerLocationId { get; set; }
    public string Name { get; set; }
    public ContactInfoResponse Contact { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public bool Active { get; set; }
    public long FavoriteId { get; set; }
    public bool Favorite { get; set; }
    public ProfileShortResponse Responsible { get; set; }
    public ProfileShortResponse Manager { get; set; }
    public List<CategoryResponse> Categories { get; set; }
    public List<FilterResponse> Filters { get; set; }
    public AssetShortResponse Logo { get; set; }
    public AssetShortResponse Picture1 { get; set; }
    public AssetShortResponse Picture2 { get; set; }
    public BillableEntityResponse BillableEntity { get; set; }
    public RetailerCountResponse Counts { get; set; }
    public RetailerShortResponse Retailer { get; set; }
    public ListResponse Offers { get; set; }
    public string InternalId { get; set; }
    public string DetailsHeader { get; set; }
    public string DetailsBody { get; set; }
    public string Hours { get; set; }
    public string LocationToken { get; set; }
    public string Building { get; set; }
    public string QrCodeUrl { get; set; }
    public double Distance { get; set; }
    public string GooglePlaceId { get; set; }
    public string YelpId { get; set; }
}


