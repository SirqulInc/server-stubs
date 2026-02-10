namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CoordsResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string Country { get; set; }
    public string CountryCode { get; set; }
    public string Region { get; set; }
    public string City { get; set; }
    public string PostalCode { get; set; }
    public string RegionCode { get; set; }
    public string Returning { get; set; }
}


