namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class BlockedNotificationResponse 
{
    public long BlockedNotificationId { get; set; }
    public long Created { get; set; }
    public string Event { get; set; }
    public string Conduit { get; set; }
    public string CustomType { get; set; }
    public string ContentType { get; set; }
    public long ContentId { get; set; }
    public string SearchTags { get; set; }
    public bool Blocked { get; set; }
    public bool Deleted { get; set; }
}


