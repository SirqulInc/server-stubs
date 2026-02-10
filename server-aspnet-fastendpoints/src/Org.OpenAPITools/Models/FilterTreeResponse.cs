namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class FilterTreeResponse 
{
    public long FilterId { get; set; }
    public string Name { get; set; }
    public string Display { get; set; }
    public int SubFilterCount { get; set; }
    public long ParentId { get; set; }
    public string Description { get; set; }
    public bool Active { get; set; }
    public string ExternalId { get; set; }
    public string ExternalType { get; set; }
    public List<FilterTreeResponse> Children { get; set; }
}


