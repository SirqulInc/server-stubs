namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class BillableEntityShortResponse 
{
    public long BillableEntityId { get; set; }
    public string Name { get; set; }
    public ProfileShortResponse Responsible { get; set; }
}


