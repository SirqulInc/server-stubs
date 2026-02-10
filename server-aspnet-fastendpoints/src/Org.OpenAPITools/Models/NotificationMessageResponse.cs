namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class NotificationMessageResponse 
{
    public AccountShortResponse Sender { get; set; }
    public string Event { get; set; }
    public string NotificationMessage { get; set; }
    public long Created { get; set; }
    public bool HasRead { get; set; }
    public long ContentId { get; set; }
    public string ContentType { get; set; }
    public string ContentName { get; set; }
    public long ParentId { get; set; }
    public string ParentType { get; set; }
    public string ActionCategory { get; set; }
    public string ThumbnailURL { get; set; }
    public string CoverURL { get; set; }
}


