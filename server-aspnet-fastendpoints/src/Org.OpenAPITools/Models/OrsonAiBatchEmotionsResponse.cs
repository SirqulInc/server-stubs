namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrsonAiBatchEmotionsResponse 
{
    public string RequestId { get; set; }
    public int ResponseCode { get; set; }
    public string ResponseRaw { get; set; }
    public string Status { get; set; }
    public string Error { get; set; }
    public OrsonAiEmotionsResponse Result { get; set; }
}


