namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ProfileResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public long LoginAccountId { get; set; }
    public bool Validated { get; set; }
    public AppInfoResponse AppInfo { get; set; }
    public bool CanViewAppInfo { get; set; }
    public bool CanViewFriendInfo { get; set; }
    public bool CanViewProfileInfo { get; set; }
    public long FlagCount { get; set; }
    public ConnectionInfoResponse FriendInfo { get; set; }
    public bool IsBlocked { get; set; }
    public bool IsProfileOwner { get; set; }
    public bool MetFlagThreshold { get; set; }
    public ProfileInfoResponse ProfileInfo { get; set; }
    public bool Trusted { get; set; }
    public bool Following { get; set; }
    public bool FriendRequested { get; set; }
    public bool FriendRequestPending { get; set; }
    public bool Blocked { get; set; }
    public bool Flagged { get; set; }
    public bool ProfileOwner { get; set; }
    public bool Friend { get; set; }
    public string Returning { get; set; }
}


