namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrsonAiTopicsResponse 
{
    public string RequestId { get; set; }
    public int ResponseCode { get; set; }
    public string ResponseRaw { get; set; }
    public List<OrsonAiTopicResponse> Topics { get; set; }
}


