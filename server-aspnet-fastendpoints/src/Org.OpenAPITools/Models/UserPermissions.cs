namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class UserPermissions 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public string PermissionableType { get; set; }
    public long PermissionableId { get; set; }
    public ConnectionGroup ConnectionGroup { get; set; }
    public bool FriendGroup { get; set; }
    public Connection Connection { get; set; }
    public Permissions Permissions { get; set; }
    public bool Exclude { get; set; }
    public bool Blocked { get; set; }
    public Account Owner { get; set; }
}


