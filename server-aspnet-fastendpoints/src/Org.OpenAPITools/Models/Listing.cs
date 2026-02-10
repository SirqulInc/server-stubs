namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Listing 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public Account Owner { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public DateTime Start { get; set; }
    public DateTime End { get; set; }
    public string LocationName { get; set; }
    public string LocationDescription { get; set; }
    public List<Participant> Participants { get; set; }
    public string ExternalId { get; set; }
    public string ExternalGroupId { get; set; }
    public List<Filter> Filters { get; set; }
    public bool Private { get; set; }
}


