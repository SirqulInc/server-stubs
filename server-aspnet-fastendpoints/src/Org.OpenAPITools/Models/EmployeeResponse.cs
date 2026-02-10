namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class EmployeeResponse 
{
    public long AccountId { get; set; }
    public string LocationDisplay { get; set; }
    public string Display { get; set; }
    public string Username { get; set; }
    public string AccountType { get; set; }
    public string ProfileImage { get; set; }
    
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
    public string ContactEmail { get; set; }
    public ContactResponse Contact { get; set; }
    public AccountMiniResponse Manager { get; set; }
    public bool Active { get; set; }
    public List<RetailerLocationShortResponse> Locations { get; set; }
    public bool HasDelegateAccess { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public long LocationLastUpdated { get; set; }
    public int LocationCount { get; set; }
}


