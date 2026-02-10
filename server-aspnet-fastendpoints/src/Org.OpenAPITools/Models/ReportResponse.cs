namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ReportResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public List<ReportTypeResponse> Columns { get; set; }
    public List<Dictionary<string, Object>> Rows { get; set; }
    public Dictionary<string, decimal> Summations { get; set; }
    public long Count { get; set; }
    public string QueryName { get; set; }
    public bool HasMore { get; set; }
    public string Returning { get; set; }
}


