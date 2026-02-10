namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ConnectionListResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public List<ConnectionResponse> Connections { get; set; }
    public int FriendCount { get; set; }
    public int FollowingCount { get; set; }
    public int ItemCount { get; set; }
    public bool HasMoreResults { get; set; }
    public string Returning { get; set; }
}


