namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class LegResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public string AppKey { get; set; }
    public double Distance { get; set; }
    public long Duration { get; set; }
    public double StartLatitude { get; set; }
    public double StartLongitude { get; set; }
    public double StartAltitude { get; set; }
    public long StartDate { get; set; }
    public double EndLatitude { get; set; }
    public double EndLongitude { get; set; }
    public double EndAltitude { get; set; }
    public long EndDate { get; set; }
    public long Created { get; set; }
    public string Tags { get; set; }
    public string DeviceId { get; set; }
    public long AccountId { get; set; }
    public string DeviceSignature { get; set; }
    public long ParentAccountId { get; set; }
    public List<StepResponse> Steps { get; set; }
    public string Type { get; set; }
    public string Returning { get; set; }
}


