namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrsonAiEmotionsResponse 
{
    public string RequestId { get; set; }
    public int ResponseCode { get; set; }
    public string ResponseRaw { get; set; }
    public string Status { get; set; }
    public string Error { get; set; }
    public List<string> AudioEmotions { get; set; }
    public List<OrsonAiVisualEmotionResponse> VisualEmotions { get; set; }
}


