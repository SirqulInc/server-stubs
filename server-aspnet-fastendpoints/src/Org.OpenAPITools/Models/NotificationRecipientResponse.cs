namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class NotificationRecipientResponse 
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
    public long ApplicationId { get; set; }
    public string AppName { get; set; }
    public bool HasApns { get; set; }
    public bool HasGcm { get; set; }
    public bool HasEmail { get; set; }
    public bool HasSms { get; set; }
}


