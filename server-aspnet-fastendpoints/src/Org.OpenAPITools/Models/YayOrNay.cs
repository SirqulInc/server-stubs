namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class YayOrNay 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public Account Owner { get; set; }
    public bool VarYayOrNay { get; set; }
    public string LikableObjectType { get; set; }
    public long LikableObjectId { get; set; }
}


