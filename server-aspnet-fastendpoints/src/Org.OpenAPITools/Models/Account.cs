namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Account 
{
    public long Id { get; set; }
    public DateTime Created { get; set; }
    public DateTime Updated { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string LocationDescription { get; set; }
    public Region CurrentRegion { get; set; }
    public DateTime LocationLastUpdated { get; set; }
    public string CurrentPostalCode { get; set; }
    public double CurrentPostalCodeLatitude { get; set; }
    public double CurrentPostalCodeLongitude { get; set; }
    public bool LocationUpdated { get; set; }
    public long PremigrationId { get; set; }
    public string Username { get; set; }
    public string Locale { get; set; }
    public string InviteCode { get; set; }
    public string RetailerInviteCode { get; set; }
    public string AboutUs { get; set; }
    public string BusinessName { get; set; }
    public long LikeCount { get; set; }
    public long DislikeCount { get; set; }
    public List<ThirdPartyCredentials> ThirdPartyCredentials { get; set; }
    public bool PartnerActive { get; set; }
    public string ResetToken { get; set; }
    public string ProfileImage { get; set; }
    public string AccountType { get; set; }
    public List<Asset> Media { get; set; }
    public Asset Picture { get; set; }
    public string FirstName { get; set; }
    public string MiddleName { get; set; }
    public string LastName { get; set; }
    public string Prefix { get; set; }
    public string Suffix { get; set; }
    public string Title { get; set; }
    public string HomePhone { get; set; }
    public string CellPhone { get; set; }
    public CellCarrier CellCarrier { get; set; }
    public string BusinessPhone { get; set; }
    public string BusinessPhoneExt { get; set; }
    public string FaxNumber { get; set; }
    public string VarTimeZone { get; set; }
    public string UtcOffset { get; set; }
    public string Code501c3 { get; set; }
    public string EmailAddress { get; set; }
    public Address Address { get; set; }
    public string Web { get; set; }
    public string Display { get; set; }
    public string Website { get; set; }
    public string ConsumersNotes { get; set; }
    public string ConsumersAboutUs { get; set; }
    public AccountProfileInfo AccountProfile { get; set; }
    public List<RetailerLocation> RetailerLocations { get; set; }
    public bool Executive { get; set; }
    public string ContentName { get; set; }
    public long DefaultThreshold { get; set; }
    
    /// <summary>
    /// Gets or Sets AudienceInfoGender
    /// </summary>
    public enum AudienceInfoGenderEnum
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

    public AudienceInfoGenderEnum AudienceInfoGender { get; set; }
    public long FlagThresholdId { get; set; }
    public string ContentType { get; set; }
}


