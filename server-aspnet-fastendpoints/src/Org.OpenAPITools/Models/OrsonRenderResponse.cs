namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrsonRenderResponse 
{
    public string Id { get; set; }
    public string ThirdPartyAccountId { get; set; }
    public string Status { get; set; }
    public string StatusDescription { get; set; }
    public string CompletedOn { get; set; }
    public int ResponseCode { get; set; }
    public string ResponseRaw { get; set; }
    public OrsonVideoResponse Video { get; set; }
}


