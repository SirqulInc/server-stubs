namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ApplicationMiniResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public long ApplicationId { get; set; }
    public string AppKey { get; set; }
    public string Title { get; set; }
    public string CurrentBuildVersion { get; set; }
    public string CurrentApiVersion { get; set; }
    public AssetShortResponse AppIcon { get; set; }
    public AssetShortResponse AppLogo { get; set; }
    public bool Active { get; set; }
    public string Returning { get; set; }
}


