namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrsonAiBatchResponse 
{
    public string RequestId { get; set; }
    public int ResponseCode { get; set; }
    public string ResponseRaw { get; set; }
    public OrsonAiBatchTranscriptResponse Transcript { get; set; }
    public OrsonAiBatchTopicsResponse Topics { get; set; }
    public OrsonAiBatchEmotionsResponse Emotions { get; set; }
}


