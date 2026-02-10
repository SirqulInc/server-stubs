namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Filter 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public Application Application { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public Filter Parent { get; set; }
    public List<Filter> Children { get; set; }
    public string Display { get; set; }
    public string ExternalId { get; set; }
    public string ExternalType { get; set; }
    public string Tree { get; set; }
}


