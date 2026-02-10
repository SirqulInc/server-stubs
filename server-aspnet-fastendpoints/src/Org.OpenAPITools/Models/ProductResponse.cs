namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ProductResponse 
{
    public string Brand { get; set; }
    public string ProductType { get; set; }
    public string Condition { get; set; }
    public string Isbn { get; set; }
    public string Asin { get; set; }
    public List<string> CatalogNumbers { get; set; }
    public string Department { get; set; }
    public List<string> Features { get; set; }
    public double MinimumPrice { get; set; }
    public double Width { get; set; }
    public double Height { get; set; }
    public double Depth { get; set; }
    public double Weight { get; set; }
    public string Unit { get; set; }
    public string Studio { get; set; }
    public string ParentalRating { get; set; }
    public long PublishDate { get; set; }
    public long AvailabilityDate { get; set; }
    public SizeGroupResponse Size { get; set; }
}


