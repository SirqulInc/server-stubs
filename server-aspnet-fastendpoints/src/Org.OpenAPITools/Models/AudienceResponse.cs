namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AudienceResponse 
{
    public long Id { get; set; }
    public string Name { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public double Radius { get; set; }
    public bool SendSuggestion { get; set; }
    public string Description { get; set; }
    public bool Active { get; set; }
    public string SearchTags { get; set; }
    public long OwnerId { get; set; }
    public string Gender { get; set; }
    public List<AgeGroupResponse> AgeGroups { get; set; }
    public List<CategoryResponse> Categories { get; set; }
    public List<ApplicationShortResponse> Applications { get; set; }
    public List<AudienceDeviceResponse> Devices { get; set; }
    public string GameExperienceLevel { get; set; }
    public List<GeocodeLatLngResponse> Locations { get; set; }
    public string AssociateType { get; set; }
    public long AssociateId { get; set; }
    public string AssociateDescription { get; set; }
}


