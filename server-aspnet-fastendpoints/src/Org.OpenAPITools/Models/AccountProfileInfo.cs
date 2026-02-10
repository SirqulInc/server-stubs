namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AccountProfileInfo 
{
    public long Id { get; set; }
    public DateTime Created { get; set; }
    public DateTime Updated { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public Account Account { get; set; }
    
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
    public DateTime Birthday { get; set; }
    
    /// <summary>
    /// Gets or Sets AgeGroup
    /// </summary>
    public enum AgeGroupEnum
    {
        
        /// <summary>
        /// Enum AGE013Enum for AGE_0_13
        /// </summary>
        AGE013Enum = 1,
        
        /// <summary>
        /// Enum AGE1417Enum for AGE_14_17
        /// </summary>
        AGE1417Enum = 2,
        
        /// <summary>
        /// Enum AGE1822Enum for AGE_18_22
        /// </summary>
        AGE1822Enum = 3,
        
        /// <summary>
        /// Enum AGE2330Enum for AGE_23_30
        /// </summary>
        AGE2330Enum = 4,
        
        /// <summary>
        /// Enum AGE3154Enum for AGE_31_54
        /// </summary>
        AGE3154Enum = 5,
        
        /// <summary>
        /// Enum AGE55PLUSEnum for AGE_55_PLUS
        /// </summary>
        AGE55PLUSEnum = 6
    }

    public AgeGroupEnum AgeGroup { get; set; }
    public int PreferredMinAge { get; set; }
    public int PreferredMaxAge { get; set; }
    public int PreferredMinHeight { get; set; }
    public int PreferredMaxHeight { get; set; }
    
    /// <summary>
    /// Gets or Sets PreferredGender
    /// </summary>
    public enum PreferredGenderEnum
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

    public PreferredGenderEnum PreferredGender { get; set; }
    public string PreferredEducation { get; set; }
    public int PreferredEducationIndex { get; set; }
    public string PreferredBodyType { get; set; }
    public string PreferredEthnicity { get; set; }
    public string PreferredLocation { get; set; }
    public double PreferredLocationRange { get; set; }
    public string Height { get; set; }
    public int HeightIndex { get; set; }
    public string Ethnicity { get; set; }
    public string BodyType { get; set; }
    public string MaritalStatus { get; set; }
    public string Children { get; set; }
    public string Religion { get; set; }
    public string Education { get; set; }
    public int EducationIndex { get; set; }
    public string Smoke { get; set; }
    public string Drink { get; set; }
    public string Companionship { get; set; }
    public int CompanionshipIndex { get; set; }
    public List<AccountProfileInfo.DevelopmentPlatformsEnum> DevelopmentPlatforms { get; set; }
    public long MatchToken { get; set; }
    public string MatchString { get; set; }
    public long NoneZeroMatchToken { get; set; }
    public DateTime PreferredMaxBirthday { get; set; }
    public DateTime PreferredMinBirthday { get; set; }
}


