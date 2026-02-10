namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ApplicationConfigResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public long ConfigId { get; set; }
    public long Created { get; set; }
    public long Updated { get; set; }
    public string ConfigVersion { get; set; }
    public string ConfigJson { get; set; }
    public string ConfigJsonURL { get; set; }
    public long AssetId { get; set; }
    public string Returning { get; set; }
}


