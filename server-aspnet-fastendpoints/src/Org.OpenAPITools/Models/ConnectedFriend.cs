namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ConnectedFriend 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public string Display { get; set; }
    public Asset Avatar { get; set; }
    public string AvatarURL { get; set; }
    public string Platform { get; set; }
    public string PlatformId { get; set; }
    public bool Invited { get; set; }
    public string LocationDescription { get; set; }
}


