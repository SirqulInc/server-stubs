namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ThirdPartyCredentials 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public Account Account { get; set; }
    public ThirdPartyNetwork ThirdPartyNetwork { get; set; }
    public long ThirdPartyUID { get; set; }
    public string ThirdPartyId { get; set; }
    public string ThirdPartyToken { get; set; }
    public string ThirdPartySecret { get; set; }
    public string ThirdPartyName { get; set; }
    public string ThirdPartyUnencryptedToken { get; set; }
}


