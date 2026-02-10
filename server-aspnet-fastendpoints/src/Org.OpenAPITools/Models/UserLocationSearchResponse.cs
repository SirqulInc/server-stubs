namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class UserLocationSearchResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public bool HasMoreResults { get; set; }
    public int Count { get; set; }
    public List<UserLocationListResponse> UserLocations { get; set; }
    public string Returning { get; set; }
}


