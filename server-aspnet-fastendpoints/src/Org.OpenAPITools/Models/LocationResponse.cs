namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class LocationResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public long Id { get; set; }
    public string GetDistanceMiles { get; set; }
    public string Zip { get; set; }
    public string Name { get; set; }
    public string Latitude { get; set; }
    public string Longitude { get; set; }
    public string GetSource { get; set; }
    public string Type { get; set; }
    public string Returning { get; set; }
}


