namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ConnectionResponse 
{
    public long ConnectionId { get; set; }
    public string ConnectionAccountId { get; set; }
    public string ConnectionPendingId { get; set; }
    public string Display { get; set; }
    public string LocationDisplay { get; set; }
    public long ConnectionViewedDate { get; set; }
    public string ProfileImage { get; set; }
    public string Title { get; set; }
    public string ConnectionAccountType { get; set; }
    public bool Trusted { get; set; }
    public bool Following { get; set; }
    public bool FriendRequested { get; set; }
    public bool FriendRequestPending { get; set; }
    public bool Blocked { get; set; }
    public bool Friend { get; set; }
}


