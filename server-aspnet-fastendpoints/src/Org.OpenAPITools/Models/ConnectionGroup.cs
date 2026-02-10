namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ConnectionGroup 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public Account Owner { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public List<Connection> Connections { get; set; }
    public GroupPermissions Permissions { get; set; }
    public Asset Image { get; set; }
    public List<ConnectionGroup> SubGroups { get; set; }
}


