namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class NotificationRecipientResponseListResponse 
{
    public List<Object> Items { get; set; }
    public int Count { get; set; }
    public int StartIndexAudiences { get; set; }
    public int StartIndexGroups { get; set; }
    public long Total { get; set; }
    public long CountAudiences { get; set; }
    public long CountGroups { get; set; }
    public bool HasMoreResults { get; set; }
}


