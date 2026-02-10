namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ProfileShortResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public long AccountId { get; set; }
    public string LocationDisplay { get; set; }
    public string Display { get; set; }
    public string Username { get; set; }
    public string ProfileImage { get; set; }
    public AssetShortResponse ProfileAvatar { get; set; }
    public string Returning { get; set; }
}


