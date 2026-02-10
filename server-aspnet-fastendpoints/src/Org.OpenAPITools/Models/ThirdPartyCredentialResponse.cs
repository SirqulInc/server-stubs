namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ThirdPartyCredentialResponse 
{
    public long ThirdPartyCredentialId { get; set; }
    public string ThirdPartyId { get; set; }
    public string ThirdPartyName { get; set; }
    public ThirdPartyNetworkShortResponse Network { get; set; }
    public long Updated { get; set; }
    public long Created { get; set; }
}


