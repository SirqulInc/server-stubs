namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Platform 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public AudienceDevice Device { get; set; }
    public long Minimum { get; set; }
    public long Maximum { get; set; }
    public string DownloadUrl { get; set; }
    public string Description { get; set; }
}


