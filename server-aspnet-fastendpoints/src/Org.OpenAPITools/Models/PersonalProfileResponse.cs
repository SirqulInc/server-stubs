namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PersonalProfileResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    
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
    public string PreferredEthnicity { get; set; }
    public string PreferredEducation { get; set; }
    public int PreferredEducationIndex { get; set; }
    public string PreferredBodyType { get; set; }
    public int PreferredMinAge { get; set; }
    public int PreferredMaxAge { get; set; }
    public int PreferredMinHeight { get; set; }
    public int PreferredMaxHeight { get; set; }
    public double PreferredLocationRange { get; set; }
    
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
    public string Hometown { get; set; }
    public string Height { get; set; }
    public int HeightIndex { get; set; }
    public string Ethnicity { get; set; }
    public string BodyType { get; set; }
    public string Children { get; set; }
    public string Companionship { get; set; }
    public int CompanionshipIndex { get; set; }
    public string Drink { get; set; }
    public string Education { get; set; }
    public int EducationIndex { get; set; }
    public string MaritalStatus { get; set; }
    public string Smoke { get; set; }
    public string Religion { get; set; }
    public long Birthday { get; set; }
    public string Returning { get; set; }
}


