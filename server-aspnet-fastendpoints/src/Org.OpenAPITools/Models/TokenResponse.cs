namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TokenResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public string Token { get; set; }
    public string Returning { get; set; }
}


