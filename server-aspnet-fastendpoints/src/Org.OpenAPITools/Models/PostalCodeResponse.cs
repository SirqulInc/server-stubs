namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PostalCodeResponse 
{
    public string City { get; set; }
    public string StateCode { get; set; }
    public string Code { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string Timezone { get; set; }
    public int UtcOffset { get; set; }
}


