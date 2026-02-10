namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Flag 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public Account Owner { get; set; }
    public string FlagableObjectType { get; set; }
    public long FlagableObjectId { get; set; }
    public string FlagDescription { get; set; }
    public string App { get; set; }
}


