namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrsonAiVisualEmotionResponse 
{
    public string RequestId { get; set; }
    public int ResponseCode { get; set; }
    public string ResponseRaw { get; set; }
    public long UserIndex { get; set; }
    public string Emotion { get; set; }
    public double Probability { get; set; }
}


