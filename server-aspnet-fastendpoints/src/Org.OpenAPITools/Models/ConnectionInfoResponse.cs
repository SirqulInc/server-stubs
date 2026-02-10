namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ConnectionInfoResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public List<ConnectionGroupResponse> Groups { get; set; }
    public int FollowerCount { get; set; }
    public int FollowingCount { get; set; }
    public int FriendCount { get; set; }
    public int PrivateGroupCount { get; set; }
    public string Returning { get; set; }
}


