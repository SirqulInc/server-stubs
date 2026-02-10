namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class WrappedProxyResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public string Returning { get; set; }
    public string Type { get; set; }
    public int ResponseCode { get; set; }
    public string ResponseRaw { get; set; }
    public long RequestDuration { get; set; }
    public long RequestEndTime { get; set; }
}


