namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AudienceDeviceVersionRange 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public AudienceDevice Device { get; set; }
    public long Minimum { get; set; }
    public long Maximum { get; set; }
}


