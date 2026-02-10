namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrsonEpisodeResponse 
{
    public string Id { get; set; }
    public string Status { get; set; }
    public string StatusDescription { get; set; }
    public int ResponseCode { get; set; }
    public string ResponseRaw { get; set; }
    public List<OrsonRenderResponse> Renders { get; set; }
}


