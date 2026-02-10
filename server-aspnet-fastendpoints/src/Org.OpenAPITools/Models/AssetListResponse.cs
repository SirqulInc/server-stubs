namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AssetListResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public List<AssetResponse> Items { get; set; }
    public bool HasMoreResults { get; set; }
    public int Count { get; set; }
    public string Returning { get; set; }
}


