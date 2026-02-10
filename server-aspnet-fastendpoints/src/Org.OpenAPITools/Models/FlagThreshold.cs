namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class FlagThreshold 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public long Threshold { get; set; }
    public string FlagableObjectType { get; set; }
    public Application Application { get; set; }
}


