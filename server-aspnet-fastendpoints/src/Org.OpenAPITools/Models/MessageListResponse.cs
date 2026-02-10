namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class MessageListResponse 
{
    public int Start { get; set; }
    public int Limit { get; set; }
    public long CountTotal { get; set; }
    public List<MessageResponse> Items { get; set; }
    public int Count { get; set; }
    public bool HasMoreResults { get; set; }
}


