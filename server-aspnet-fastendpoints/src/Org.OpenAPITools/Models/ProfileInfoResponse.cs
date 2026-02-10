namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ProfileInfoResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public long AccountId { get; set; }
    public string LocationDisplay { get; set; }
    public string Display { get; set; }
    public string Username { get; set; }
    public string ProfileImage { get; set; }
    public AssetShortResponse ProfileAvatar { get; set; }
    public string AboutUs { get; set; }
    public string Locale { get; set; }
    public string SummaryTitle { get; set; }
    
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
    public string Age { get; set; }
    
    /// <summary>
    /// Gets or Sets GameExperience
    /// </summary>
    public enum GameExperienceEnum
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

    public GameExperienceEnum GameExperience { get; set; }
    public ContactResponse Contact { get; set; }
    public List<CategoryResponse> Categories { get; set; }
    public PersonalProfileResponse PersonalProfile { get; set; }
    public UserSettingsResponse UserSettings { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public PostalCodeResponse CurrentPostalCode { get; set; }
    public string AccountType { get; set; }
    public long PremiumExpiration { get; set; }
    public int MatchIndex { get; set; }
    public string Tags { get; set; }
    public string Returning { get; set; }
}


