namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class UserActivityResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public DateTime Created { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string Tag { get; set; }
    public long CustomId { get; set; }
    public string CustomType { get; set; }
    public long UserId { get; set; }
    public string Username { get; set; }
    public string AppTitle { get; set; }
    public long AppId { get; set; }
    public string AppUrl { get; set; }
    public string AppDescription { get; set; }
    public string ImageURL { get; set; }
    public string ProfileImage { get; set; }
    public string Fields { get; set; }
    public long Id { get; set; }
    public string CustomText { get; set; }
    public double CustomValue { get; set; }
    public string CustomMessage { get; set; }
    public string Returning { get; set; }
}


