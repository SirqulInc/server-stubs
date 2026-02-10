namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RetailerShortResponse 
{
    public long RetailerId { get; set; }
    public string Name { get; set; }
    public string FacebookUrl { get; set; }
    public string TwitterUrl { get; set; }
    public bool Active { get; set; }
    public ContactInfoResponse Contact { get; set; }
    public AssetShortResponse Logo { get; set; }
    public AssetShortResponse Picture1 { get; set; }
    public AssetShortResponse Picture2 { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string Visibility { get; set; }
}


