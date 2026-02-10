namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Audience 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string LocationDescription { get; set; }
    public string Name { get; set; }
    public bool Display { get; set; }
    public string Description { get; set; }
    public Account Owner { get; set; }
    
    /// <summary>
    /// Gets or Sets Gender
    /// </summary>
    public enum GenderEnum
    {
        
        /// <summary>
        /// Enum MALEEnum for MALE
        /// </summary>
        MALEEnum = 1,
        
        /// <summary>
        /// Enum FEMALEEnum for FEMALE
        /// </summary>
        FEMALEEnum = 2,
        
        /// <summary>
        /// Enum ANYEnum for ANY
        /// </summary>
        ANYEnum = 3
    }

    public GenderEnum Gender { get; set; }
    public List<Audience.AgeGroupsEnum> AgeGroups { get; set; }
    
    /// <summary>
    /// Gets or Sets GameExperienceLevel
    /// </summary>
    public enum GameExperienceLevelEnum
    {
        
        /// <summary>
        /// Enum ANYEnum for ANY
        /// </summary>
        ANYEnum = 1,
        
        /// <summary>
        /// Enum NEWEnum for NEW
        /// </summary>
        NEWEnum = 2,
        
        /// <summary>
        /// Enum BEGINNEREnum for BEGINNER
        /// </summary>
        BEGINNEREnum = 3,
        
        /// <summary>
        /// Enum INTERMEDIATEEnum for INTERMEDIATE
        /// </summary>
        INTERMEDIATEEnum = 4,
        
        /// <summary>
        /// Enum EXPERTEnum for EXPERT
        /// </summary>
        EXPERTEnum = 5
    }

    public GameExperienceLevelEnum GameExperienceLevel { get; set; }
    public List<AudienceDeviceVersionRange> DeviceVersionRanges { get; set; }
    public List<Category> Categories { get; set; }
    public List<Application> Applications { get; set; }
    public double Radius { get; set; }
    public List<AudienceLocation> Locations { get; set; }
    public bool SendSuggestion { get; set; }
    public int StartTimeOffset { get; set; }
    public int EndTimeOffset { get; set; }
    public AudienceTargetType Target { get; set; }
    public string AssociateContentName { get; set; }
    public string Polygon { get; set; }
    public string AssociateType { get; set; }
    public long AssociateId { get; set; }
}


