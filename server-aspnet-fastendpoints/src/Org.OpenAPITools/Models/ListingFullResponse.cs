namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ListingFullResponse 
{
    public long Id { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public long Start { get; set; }
    public long End { get; set; }
    public string LocationName { get; set; }
    public string LocationDescription { get; set; }
    public bool PrivateListing { get; set; }
    public bool Active { get; set; }
    public List<ParticipantResponse> Participants { get; set; }
    public AccountShortResponse Owner { get; set; }
    public List<FilterResponse> Filters { get; set; }
}


