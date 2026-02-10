namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RatingResponse 
{
    public long RatingId { get; set; }
    public int RatingValue { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string LocationDescription { get; set; }
    public CategoryResponse Category { get; set; }
    public AccountShortResponse Owner { get; set; }
}


