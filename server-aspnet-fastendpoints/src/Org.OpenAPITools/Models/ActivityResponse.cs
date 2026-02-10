namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ActivityResponse 
{
    public long ActivityId { get; set; }
    public long Created { get; set; }
    public string AppKey { get; set; }
    public long TargetId { get; set; }
    public string TargetType { get; set; }
    public string TargetLegacyId { get; set; }
    public string TargetDescription { get; set; }
    public bool TargetActive { get; set; }
    public string Action { get; set; }
    public long SlaveEntityId { get; set; }
}


