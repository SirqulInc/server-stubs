
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AccountLocationSearchRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// Deprecated - legacy query parameter
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
    /// <summary>
    /// An optional keyword to search on, will be ignore if empty (NOT implemented yet)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// The postal code to search on, either postalCode or the user&#39;s exact location is required
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("postalCode")]
    public string? PostalCode { get; set; }
    /// <summary>
    /// The latitude of the user, either postalCode or the user&#39;s exact location is required
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The longitude of the user, either postalCode or the user&#39;s exact location is required
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The range to search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("range")]
    public double? Range { get; set; }
    /// <summary>
    /// Searches for user&#39;s that has updated their location since this date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationLastUpdated")]
    public long? LocationLastUpdated { get; set; }
    /// <summary>
    /// The preferred gender
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gender")]
    public string? Gender { get; set; }
    /// <summary>
    /// The preferred min age
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("minAge")]
    public int? MinAge { get; set; }
    /// <summary>
    /// The preferred max age
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("maxAge")]
    public int? MaxAge { get; set; }
    /// <summary>
    /// The preferred companionship index
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("companionshipIndex")]
    public int? CompanionshipIndex { get; set; }
    /// <summary>
    /// this is the start index of a query
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_i")]
    public int? I { get; set; }
    /// <summary>
    /// Start of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// this is the limit index of a query
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_l")]
    public int? L { get; set; }
    /// <summary>
    /// Limit of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// Search mode to use for index searches (e.g. CLOUDINDEX, OPENSEARCH)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchMode")]
    public string? SearchMode { get; set; }
    /// <summary>
    /// Sorting field for results (default: DISTANCE)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Whether to sort descending (default: false)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// Roles to filter on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("roles")]
    public string? Roles { get; set; }
    /// <summary>
    /// Tags to filter on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// The experience to filter on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("experience")]
    public string? Experience { get; set; }
    /// <summary>
    /// The category ids to filter on (comma separated)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// The audience ids to filter on (comma separated)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIds")]
    public string? AudienceIds { get; set; }
    /// <summary>
    /// Operator used to combine audience filters (default: AND)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceOperator")]
    public string? AudienceOperator { get; set; }
    /// <summary>
    /// Whether to use the given lat &amp; long to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("updateCurrentLocation")]
    public bool? UpdateCurrentLocation { get; set; }
    /// <summary>
    /// Whether to use the given parameters to update the user&#39;s preferred settings
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("updatePreferredSettings")]
    public bool? UpdatePreferredSettings { get; set; }
    /// <summary>
    /// Determines whether to always display user exact locations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showExactLocations")]
    public bool? ShowExactLocations { get; set; }
    /// <summary>
    /// Return connection of the accounts in the result to the passed in account if there exists any
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showConnectionToSearcher")]
    public bool? ShowConnectionToSearcher { get; set; }
    /// <summary>
    /// Return any results that have a minimum of the specified flag count (even ones that have met the flag threshold)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("flagCountMinimum")]
    public long? FlagCountMinimum { get; set; }
    /// <summary>
    /// Returns only verified users
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("verifiedUserOnly")]
    public bool? VerifiedUserOnly { get; set; }
    /// <summary>
    /// Returns only content admin users
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contentAdminOnly")]
    public bool? ContentAdminOnly { get; set; }
}
public class BlockAccountRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The id of the account to be blocked/unblocked
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountIdBeingBlocked")]
    public long AccountIdBeingBlocked { get; set; }
    /// <summary>
    /// Determines whether the account is blocked or unblocked
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("blockFlagValue")]
    public bool? BlockFlagValue { get; set; }
    /// <summary>
    /// Determines whether the account is removed from all other groups if blocked
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("removeFromGroupsIfBlocked")]
    public bool? RemoveFromGroupsIfBlocked { get; set; }
    /// <summary>
    /// The current latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The current longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class CreateAccountRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The full name of the user. If this parameter is NOT empty, the following parameters will be ignored: prefixName, firstName, middleName, lastName, and suffixName
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// If the parameter &#39;name&#39; is empty or not present, this field will be used to set the prefix of the user&#39;s name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("prefixName")]
    public string? PrefixName { get; set; }
    /// <summary>
    /// If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s first name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("firstName")]
    public string? FirstName { get; set; }
    /// <summary>
    /// If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s middle name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("middleName")]
    public string? MiddleName { get; set; }
    /// <summary>
    /// If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s last name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("lastName")]
    public string? LastName { get; set; }
    /// <summary>
    /// If the parameter &#39;name&#39; is empty or not present, this field will be used to set the suffix of the user&#39;s name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("suffixName")]
    public string? SuffixName { get; set; }
    /// <summary>
    /// This field will be used to set the user&#39;s job title
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// The unique id of the device making the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The type of device id (this is defined by the client), ie. MAC_ADDRESS, APPLE_UDID, etc
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceIdType")]
    public string? DeviceIdType { get; set; }
    /// <summary>
    /// The access token to authenticate with (ex: username)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("username")]
    public string Username { get; set; }
    /// <summary>
    /// The secret to authenticate with (ex: password)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("password")]
    public string Password { get; set; }
    /// <summary>
    /// The user&#39;s contact email address (NOT the username)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("emailAddress")]
    public string? EmailAddress { get; set; }
    /// <summary>
    /// The asset id to set the user&#39;s profile image
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetId")]
    public long? AssetId { get; set; }
    /// <summary>
    /// The street address of the user&#39;s contact location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streetAddress")]
    public string? StreetAddress { get; set; }
    /// <summary>
    /// The zipcode of the user&#39;s contact location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("zipcode")]
    public string? Zipcode { get; set; }
    /// <summary>
    /// The gender of the user (AudienceGender)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gender")]
    public string? Gender { get; set; }
    /// <summary>
    /// The birthday date of the user in UTC milliseconds
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("birthday")]
    public long? Birthday { get; set; }
    /// <summary>
    /// The home phone number
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("homePhone")]
    public string? HomePhone { get; set; }
    /// <summary>
    /// The cellular phone number
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cellPhone")]
    public string? CellPhone { get; set; }
    /// <summary>
    /// The cellular service provider
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cellPhoneCarrier")]
    public string? CellPhoneCarrier { get; set; }
    /// <summary>
    /// The business phone number
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("businessPhone")]
    public string? BusinessPhone { get; set; }
    /// <summary>
    /// The account role (default: MEMBER)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("role")]
    public string? Role { get; set; }
    /// <summary>
    /// Comma separated list of development platforms
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("platforms")]
    public string? Platforms { get; set; }
    /// <summary>
    /// Search tags
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// About us information
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("aboutUs")]
    public string? AboutUs { get; set; }
    /// <summary>
    /// Game experience of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameExperience")]
    public string? GameExperience { get; set; }
    /// <summary>
    /// A list of category ids that represent interests and associations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// The user&#39;s hometown
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hometown")]
    public string? Hometown { get; set; }
    /// <summary>
    /// The user&#39;s height
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("height")]
    public string? Height { get; set; }
    /// <summary>
    /// The user&#39;s height in a numerical value that can be used for ordering/searching
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("heightIndex")]
    public int? HeightIndex { get; set; }
    /// <summary>
    /// The user&#39;s ethnicity
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ethnicity")]
    public string? Ethnicity { get; set; }
    /// <summary>
    /// The user&#39;s body type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bodyType")]
    public string? BodyType { get; set; }
    /// <summary>
    /// The user&#39;s marital status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("maritalStatus")]
    public string? MaritalStatus { get; set; }
    /// <summary>
    /// The user&#39;s children status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("children")]
    public string? Children { get; set; }
    /// <summary>
    /// The user&#39;s religion
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("religion")]
    public string? Religion { get; set; }
    /// <summary>
    /// The user&#39;s education
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("education")]
    public string? Education { get; set; }
    /// <summary>
    /// The user&#39;s education in a numerical value that can be used for ordering/searching
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("educationIndex")]
    public int? EducationIndex { get; set; }
    /// <summary>
    /// The user&#39;s smoke status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("smoke")]
    public string? Smoke { get; set; }
    /// <summary>
    /// The user&#39;s drink status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("drink")]
    public string? Drink { get; set; }
    /// <summary>
    /// The user&#39;s companionship status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("companionship")]
    public string? Companionship { get; set; }
    /// <summary>
    /// The user&#39;s companionship index
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("companionshipIndex")]
    public int? CompanionshipIndex { get; set; }
    /// <summary>
    /// The preferred minimum age in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredMinAge")]
    public int? PreferredMinAge { get; set; }
    /// <summary>
    /// The preferred maximum age in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredMaxAge")]
    public int? PreferredMaxAge { get; set; }
    /// <summary>
    /// The preferred minimum height in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredMinHeight")]
    public int? PreferredMinHeight { get; set; }
    /// <summary>
    /// The preferred maximum height in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredMaxHeight")]
    public int? PreferredMaxHeight { get; set; }
    /// <summary>
    /// The preferred gender in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredGender")]
    public string? PreferredGender { get; set; }
    /// <summary>
    /// The preferred education in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredEducation")]
    public string? PreferredEducation { get; set; }
    /// <summary>
    /// The preferred education in a numerical value that can be used for ordering/searching
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredEducationIndex")]
    public int? PreferredEducationIndex { get; set; }
    /// <summary>
    /// The preferred body type in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredBodyType")]
    public string? PreferredBodyType { get; set; }
    /// <summary>
    /// The preferred ethnicity in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredEthnicity")]
    public string? PreferredEthnicity { get; set; }
    /// <summary>
    /// The preferred location in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredLocation")]
    public string? PreferredLocation { get; set; }
    /// <summary>
    /// The preferred location range in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredLocationRange")]
    public double? PreferredLocationRange { get; set; }
    /// <summary>
    /// The current latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The current longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// Accepted Terms
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("acceptedTerms")]
    public bool? AcceptedTerms { get; set; }
    /// <summary>
    /// The inviteToken that the referrer used for this account to sign up
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("inviteToken")]
    public string? InviteToken { get; set; }
    /// <summary>
    /// The accountId of the referrer (used if there is no inviteToken)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("referralAccountId")]
    public long? ReferralAccountId { get; set; }
    /// <summary>
    /// Whether to send validation email
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sendValidation")]
    public bool? SendValidation { get; set; }
    /// <summary>
    /// Deprecated: use appKey
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The application version
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appVersion")]
    public string? AppVersion { get; set; }
    /// <summary>
    /// Returns an AccountLoginResponse if \&quot;AccountLoginResponse\&quot; is passed in
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseType")]
    public string? ResponseType { get; set; }
    /// <summary>
    /// Comma separated list of audience ids to assign to the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIdsToAdd")]
    public string? AudienceIdsToAdd { get; set; }
    /// <summary>
    /// Application blob data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appBlob")]
    public string? AppBlob { get; set; }
    /// <summary>
    /// Enable push for the app
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appEnablePush")]
    public bool? AppEnablePush { get; set; }
    /// <summary>
    /// Enable SMS for the app
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appEnableSMS")]
    public bool? AppEnableSMS { get; set; }
    /// <summary>
    /// Enable email for the app
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appEnableEmail")]
    public bool? AppEnableEmail { get; set; }
    /// <summary>
    /// Location visibility setting
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationVisibility")]
    public string? LocationVisibility { get; set; }
    /// <summary>
    /// Home latitude
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("homeLatitude")]
    public double? HomeLatitude { get; set; }
    /// <summary>
    /// Home longitude
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("homeLongitude")]
    public double? HomeLongitude { get; set; }
    /// <summary>
    /// The nickname used in the application for this account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appNickname")]
    public string? AppNickname { get; set; }
    /// <summary>
    /// Personal audience id to associate with this account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("personalAudienceId")]
    public long? PersonalAudienceId { get; set; }
}
public class EditAccountRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The account id used to edit another person&#39;s account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountId")]
    public long? ConnectionAccountId { get; set; }
    /// <summary>
    /// The account role to change to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("role")]
    public string? Role { get; set; }
    /// <summary>
    /// The asset id to set the user&#39;s profile image
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetId")]
    public long? AssetId { get; set; }
    /// <summary>
    /// The full name of the user. If this parameter is NOT empty, the  following parameters will be ignored: prefixName, firstName, middleName,  lastName, and suffixName 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// If the parameter &#39;name&#39; is empty or not present, this field will be used to set the prefix of the user&#39;s name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("prefixName")]
    public string? PrefixName { get; set; }
    /// <summary>
    /// If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s first name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("firstName")]
    public string? FirstName { get; set; }
    /// <summary>
    /// If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s middle name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("middleName")]
    public string? MiddleName { get; set; }
    /// <summary>
    /// If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s last name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("lastName")]
    public string? LastName { get; set; }
    /// <summary>
    /// If the parameter &#39;name&#39; is empty or not present, this field will be used to set the suffix of the user&#39;s name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("suffixName")]
    public string? SuffixName { get; set; }
    /// <summary>
    /// This field will be used to set the user&#39;s job title
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// The gender of the user AudienceGender
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gender")]
    public string? Gender { get; set; }
    /// <summary>
    /// This is deperecated, use the birthday parameter
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("age")]
    public int? Age { get; set; }
    /// <summary>
    /// The birthday date of the user in UTC milliseconds
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("birthday")]
    public long? Birthday { get; set; }
    /// <summary>
    /// The home phone number
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("homePhone")]
    public string? HomePhone { get; set; }
    /// <summary>
    /// The cellular phone number
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cellPhone")]
    public string? CellPhone { get; set; }
    /// <summary>
    /// The cellular service provider
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cellPhoneCarrier")]
    public string? CellPhoneCarrier { get; set; }
    /// <summary>
    /// The business phone number
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("businessPhone")]
    public string? BusinessPhone { get; set; }
    /// <summary>
    /// The user&#39;s contact email address (NOT the username)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("emailAddress")]
    public string? EmailAddress { get; set; }
    /// <summary>
    /// The street address of the user&#39;s contact location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streetAddress")]
    public string? StreetAddress { get; set; }
    /// <summary>
    /// Additional address information (such as a suite number, floor number, building name, or PO Box)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streetAddress2")]
    public string? StreetAddress2 { get; set; }
    /// <summary>
    /// The city of the user&#39;s contact location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("city")]
    public string? City { get; set; }
    /// <summary>
    /// The state of the user&#39;s contact location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("state")]
    public string? State { get; set; }
    /// <summary>
    /// The zipcode of the user&#39;s contact location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("zipcode")]
    public string? Zipcode { get; set; }
    /// <summary>
    /// The country of the user&#39;s contact location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("country")]
    public string? Country { get; set; }
    /// <summary>
    /// Allow anyone to view the user&#39;s personal profile
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("makeProfileInfoPublic")]
    public bool? MakeProfileInfoPublic { get; set; }
    /// <summary>
    /// Allow anyone to view the user&#39;s game/app info
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("makeGameInfoPublic")]
    public bool? MakeGameInfoPublic { get; set; }
    /// <summary>
    /// Allow anyone to view the user&#39;s friends list
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("makeFriendsInfoPublic")]
    public bool? MakeFriendsInfoPublic { get; set; }
    /// <summary>
    /// The user&#39;s hometown
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hometown")]
    public string? Hometown { get; set; }
    /// <summary>
    /// The user&#39;s height
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("height")]
    public string? Height { get; set; }
    /// <summary>
    /// The user&#39;s height in a numerical value that can be used for ordering/searching
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("heightIndex")]
    public int? HeightIndex { get; set; }
    /// <summary>
    /// The user&#39;s ethnicity
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ethnicity")]
    public string? Ethnicity { get; set; }
    /// <summary>
    /// The user&#39;s body type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bodyType")]
    public string? BodyType { get; set; }
    /// <summary>
    /// The user&#39;s marital status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("maritalStatus")]
    public string? MaritalStatus { get; set; }
    /// <summary>
    /// The user&#39;s children status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("children")]
    public string? Children { get; set; }
    /// <summary>
    /// The user&#39;s religion
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("religion")]
    public string? Religion { get; set; }
    /// <summary>
    /// The user&#39;s education
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("education")]
    public string? Education { get; set; }
    /// <summary>
    /// The user&#39;s education in a numerical value that can be used for ordering/searching
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("educationIndex")]
    public int? EducationIndex { get; set; }
    /// <summary>
    /// The user&#39;s smoke status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("smoke")]
    public string? Smoke { get; set; }
    /// <summary>
    /// The user&#39;s drink status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("drink")]
    public string? Drink { get; set; }
    /// <summary>
    /// The user&#39;s companionship status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("companionship")]
    public string? Companionship { get; set; }
    /// <summary>
    /// The user&#39;s companionship index
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("companionshipIndex")]
    public int? CompanionshipIndex { get; set; }
    /// <summary>
    /// The preferred minimum age in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredMinAge")]
    public int? PreferredMinAge { get; set; }
    /// <summary>
    /// The preferred maximum age in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredMaxAge")]
    public int? PreferredMaxAge { get; set; }
    /// <summary>
    /// The preferred minimum height in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredMinHeight")]
    public int? PreferredMinHeight { get; set; }
    /// <summary>
    /// The preferred maximum height in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredMaxHeight")]
    public int? PreferredMaxHeight { get; set; }
    /// <summary>
    /// The preferred gender in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredGender")]
    public string? PreferredGender { get; set; }
    /// <summary>
    /// The preferred education in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredEducation")]
    public string? PreferredEducation { get; set; }
    /// <summary>
    /// The preferred education in a numerical value that can be used for ordering/searching
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredEducationIndex")]
    public int? PreferredEducationIndex { get; set; }
    /// <summary>
    /// The preferred body type in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredBodyType")]
    public string? PreferredBodyType { get; set; }
    /// <summary>
    /// The preferred ethnicity in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredEthnicity")]
    public string? PreferredEthnicity { get; set; }
    /// <summary>
    /// The preferred education in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredLocation")]
    public string? PreferredLocation { get; set; }
    /// <summary>
    /// The preferred location range in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredLocationRange")]
    public double? PreferredLocationRange { get; set; }
    /// <summary>
    /// Platforms
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("platforms")]
    public string? Platforms { get; set; }
    /// <summary>
    /// Tags
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// About Us
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("aboutUs")]
    public string? AboutUs { get; set; }
    /// <summary>
    /// Match Token
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("matchToken")]
    public string? MatchToken { get; set; }
    /// <summary>
    /// Game Experience
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameExperience")]
    public string? GameExperience { get; set; }
    /// <summary>
    /// Deprecated use categoryIds
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categories")]
    public string? Categories { get; set; }
    /// <summary>
    /// A list of category ids that represent interests and associations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// A comma separated list of ProfileFilters for filtering the returned response data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseFilters")]
    public string? ResponseFilters { get; set; }
    /// <summary>
    /// The user&#39;s preference if they want to be shown by zipcode on a map
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showAsZipcode")]
    public bool? ShowAsZipcode { get; set; }
    /// <summary>
    /// The user&#39;s preference if they want to be shown by their exact location on a map
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showExactLocation")]
    public bool? ShowExactLocation { get; set; }
    /// <summary>
    /// The user&#39;s preference if they want to see others exact location on a map
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showOthersExactLocation")]
    public bool? ShowOthersExactLocation { get; set; }
    /// <summary>
    /// Accepted Terms
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("acceptedTerms")]
    public bool? AcceptedTerms { get; set; }
    /// <summary>
    /// Location Visibility
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationVisibility")]
    public string? LocationVisibility { get; set; }
    /// <summary>
    /// App Blob
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appBlob")]
    public string? AppBlob { get; set; }
    /// <summary>
    /// App Enable Push
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appEnablePush")]
    public bool? AppEnablePush { get; set; }
    /// <summary>
    /// App Enable SMS
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appEnableSMS")]
    public bool? AppEnableSMS { get; set; }
    /// <summary>
    /// App Enable Email
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appEnableEmail")]
    public bool? AppEnableEmail { get; set; }
    /// <summary>
    /// Game Type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The current latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The current longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// Return Profile
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnProfile")]
    public bool? ReturnProfile { get; set; }
    /// <summary>
    /// Audience Ids to add
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIdsToAdd")]
    public string? AudienceIdsToAdd { get; set; }
    /// <summary>
    /// Audience Ids to remove
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIdsToRemove")]
    public string? AudienceIdsToRemove { get; set; }
    /// <summary>
    /// The account id of the referrer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("referralAccountId")]
    public long? ReferralAccountId { get; set; }
    /// <summary>
    /// App nickname
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appNickname")]
    public string? AppNickname { get; set; }
    /// <summary>
    /// Personal Audience
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("personalAudienceId")]
    public long? PersonalAudienceId { get; set; }
    /// <summary>
    /// The user&#39;s username to update with if they currently have a guest username
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("nonGuestUsername")]
    public string? NonGuestUsername { get; set; }
}
public class EditUsernameRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the user&#39;s contact email address (NOT the username) which is also used for email validation
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("emailAddress")]
    public string? EmailAddress { get; set; }
    /// <summary>
    /// the user&#39;s username to update with if they currently have a guest username
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("username")]
    public string? Username { get; set; }
}
public class GetAccountRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Return Nulls
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnNulls")]
    public bool? ReturnNulls { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// Connection Account Email
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountEmail")]
    public string? ConnectionAccountEmail { get; set; }
    /// <summary>
    /// The account id used to view another person&#39;s account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountId")]
    public long? ConnectionAccountId { get; set; }
    /// <summary>
    /// A comma separated list of ProfileFilters for filtering the returned response data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseFilters")]
    public string? ResponseFilters { get; set; }
    /// <summary>
    /// Game Type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Purchase Type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("purchaseType")]
    public string? PurchaseType { get; set; }
    /// <summary>
    /// Determines whether to track if a person has viewed someone&#39;s profile
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("updateViewedDate")]
    public bool? UpdateViewedDate { get; set; }
    /// <summary>
    /// Latitude used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// Longitude used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class GetProfileAssetsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Determines whether to return null fields in the response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnNulls")]
    public bool? ReturnNulls { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The account id of the person the user wants to view
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ownerId")]
    public long? OwnerId { get; set; }
    /// <summary>
    /// Comma separated list of MediaType
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaTypes")]
    public string? MediaTypes { get; set; }
    /// <summary>
    /// Comma separated list of mime types
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mimeTypes")]
    public string? MimeTypes { get; set; }
    /// <summary>
    /// Determines what the returning list will be sorted by (see AssetApiMap)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Determines whether to return the resulting list in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// Latitude used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// Longitude used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// _i
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_i")]
    public int? I { get; set; }
    /// <summary>
    /// Start of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// _l
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_l")]
    public int? L { get; set; }
    /// <summary>
    /// Limit of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class GetReferralListRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// one of these option - GET_CHILDREN will get all accounts that had signed up using the current account invite link - GET_ANCESTOR will get all accounts that referred the current account and it&#39;s parents, recursively - GET_ALL will get all of the above
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retrieveType")]
    public string? RetrieveType { get; set; }
    /// <summary>
    /// level limit for children and ancestors of current account, starts from current account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("levelLimit")]
    public decimal? LevelLimit { get; set; }
    /// <summary>
    /// level limit for ancestors, will override levelLimit if this is set
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ancestorLevelLimit")]
    public decimal? AncestorLevelLimit { get; set; }
    /// <summary>
    /// level limit for children, will override levelLimit if this is set
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("childrenLevelLimit")]
    public decimal? ChildrenLevelLimit { get; set; }
    /// <summary>
    /// pagination start for children list
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ancestorListStart")]
    public decimal? AncestorListStart { get; set; }
    /// <summary>
    /// pagination limit for children list
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ancestorListLimit")]
    public decimal? AncestorListLimit { get; set; }
    /// <summary>
    /// pagination start for children list
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("childrenListStart")]
    public decimal? ChildrenListStart { get; set; }
    /// <summary>
    /// pagination limit for children list
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("childrenListLimit")]
    public decimal? ChildrenListLimit { get; set; }
    /// <summary>
    /// if true, on each item in ancestor and children list, return the childrenTotalNumber and ancestorTotalNumber for that item
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("childrenChildren")]
    public bool? ChildrenChildren { get; set; }
}
public class GetSettingsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The current latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The current longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class LoginDelegateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accessToken")]
    public string AccessToken { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accessTokenSecret")]
    public string? AccessTokenSecret { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("delegatedAccountId")]
    public long? DelegatedAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("delegatedUsername")]
    public string? DelegatedUsername { get; set; }
    /// <summary>
    /// The access provider to authenticate against (default: USERNAME). Supported values: FACEBOOK, TWITTER, USERNAME, PHONE
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("networkUID")]
    public string? NetworkUID { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Checks user&#39;s birthday to see if they meet an age requirement. If the user is under age, an error message is returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ageRestriction")]
    public int? AgeRestriction { get; set; }
    /// <summary>
    /// This determines how much of the profile should be returned, see ProfileFilters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseFilters")]
    public string? ResponseFilters { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class LoginGeneralRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique id of the device making the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The type of device id (this is defined by the client), ie. MAC_ADDRESS, APPLE_UDID, etc
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceIdType")]
    public string? DeviceIdType { get; set; }
    /// <summary>
    /// The access token to authenticate with (ex: username or fb token)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accessToken")]
    public string AccessToken { get; set; }
    /// <summary>
    /// The secret to authenticate with (ex: password)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accessTokenSecret")]
    public string? AccessTokenSecret { get; set; }
    /// <summary>
    /// The access provider to authenticate against. This can be custom  networks created using the ThirdPartyApi as well. Supported values by default  include: FACEBOOK, TWITTER, USERNAME, PHONE 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("networkUID")]
    public string NetworkUID { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Checks user&#39;s birthday to see if they meet an age requirement. If the user is under age, an error message is returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ageRestriction")]
    public int? AgeRestriction { get; set; }
    /// <summary>
    /// This determines how much of the profile should be returned, see ProfileFilters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseFilters")]
    public string? ResponseFilters { get; set; }
    /// <summary>
    /// Used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// Used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// Option to check for email if username doesn&#39;t match, also support multiple accounts
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("emailMatch")]
    public bool? EmailMatch { get; set; }
    /// <summary>
    /// Chosen account Id sent from the app - pass in the 2nd request to choose an account from multiple accounts matching the email - use one of the account id from the previous request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("chosenAccountId")]
    public long? ChosenAccountId { get; set; }
    /// <summary>
    /// Third-party credential Id, pass in the 2nd request to choose an account from multiple accounts matching the email - use the id from the previous call ThirdPartyCredential object
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyCredentialId")]
    public long? ThirdPartyCredentialId { get; set; }
}
public class LoginUsernameRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the device id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the user&#39;s email address they used to sign-up
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("username")]
    public string Username { get; set; }
    /// <summary>
    /// the password
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("password")]
    public string Password { get; set; }
    /// <summary>
    /// the current latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the current longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// the app
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("app")]
    public string? App { get; set; }
    /// <summary>
    /// This parameter is deprecated. This is deprecated, use appKey.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// the profile to return
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnProfile")]
    public bool? ReturnProfile { get; set; }
    /// <summary>
    /// a comma separated list of ProfileFilters for filtering the returned response data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseFilters")]
    public string? ResponseFilters { get; set; }
}
public class LogoutRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// Device Id Type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceIdType")]
    public string? DeviceIdType { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The current latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The current longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class MergeAccountRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The id of the account to being merged
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mergeAccountId")]
    public long MergeAccountId { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
}
public class PasswordChangeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The current password, used to validate access
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("oldPassword")]
    public string OldPassword { get; set; }
    /// <summary>
    /// The new password to set, cannot be empty
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("newPassword")]
    public string NewPassword { get; set; }
    /// <summary>
    /// The new password to confirm, must match newPassword
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("confirmPassword")]
    public string ConfirmPassword { get; set; }
}
public class PasswordResetRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The token associated with the account to update, good for 24 hours
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("token")]
    public string Token { get; set; }
    /// <summary>
    /// The new password to set, cannot be empty
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("password")]
    public string Password { get; set; }
    /// <summary>
    /// The new password to confirm, must match newPassword
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("confirm")]
    public string Confirm { get; set; }
}
public class RequestPasswordResetRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The email/username of the account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("email")]
    public string Email { get; set; }
    /// <summary>
    /// this is the sender email
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("from")]
    public string? From { get; set; }
    /// <summary>
    /// this is the domain (like dev.sirqul.com) used to generate the password reset link
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("domain")]
    public string? Domain { get; set; }
    /// <summary>
    /// this is the the subUrl (like resetpassword) used to generate a password reset link
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("subUrl")]
    public string? SubUrl { get; set; }
    /// <summary>
    /// this is used to generate a password reset link
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("referer")]
    public string? Referer { get; set; }
}
public class RequestValidateAccountRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
}
public class SearchAccountsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The id of the account requesting
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The keyword for for querying the account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// the latitude
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the longitude
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// the radius
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("radius")]
    public double? Radius { get; set; }
    /// <summary>
    /// the user&#39;s gender
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gender")]
    public string? Gender { get; set; }
    /// <summary>
    /// the user&#39;s Game Experience
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameExperience")]
    public string? GameExperience { get; set; }
    /// <summary>
    /// the user&#39;s age
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("age")]
    public int? Age { get; set; }
    /// <summary>
    /// the user&#39;s Category Ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// Return Nulls
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnNulls")]
    public bool? ReturnNulls { get; set; }
    /// <summary>
    /// A comma separated list of ProfileFilters for filtering the returned response data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseFilters")]
    public string? ResponseFilters { get; set; }
    /// <summary>
    /// A comma separated list of PurchaseType
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("purchaseType")]
    public string? PurchaseType { get; set; }
    /// <summary>
    /// The field to sort by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// The order to return the results. Default is false, which will return the results in ascending order.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// The index into the record set to start with.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// The total number of record to return.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// Determines whether to return only active results. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool? ActiveOnly { get; set; }
}
public class SecureLoginRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The user&#39;s encrypted email address they used to sign-up
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("username")]
    public string Username { get; set; }
    /// <summary>
    /// The encrypted password
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("password")]
    public string Password { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string GameType { get; set; }
    /// <summary>
    /// Charset Name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("charsetName")]
    public string? CharsetName { get; set; }
    /// <summary>
    /// The current latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The current longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// Return Profile
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnProfile")]
    public bool? ReturnProfile { get; set; }
    /// <summary>
    /// A comma separated list of ProfileFilters for filtering the returned response data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseFilters")]
    public string? ResponseFilters { get; set; }
}
public class SecureSignupRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The full name of the user. If this parameter is not empty, the  following parameters will be ignored: prefixName, firstName, middleName,  lastName, and suffixName 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// the inviteToken that the referrer use for this account to sign up
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("inviteToken")]
    public string? InviteToken { get; set; }
    /// <summary>
    /// If the parameter &#39;name&#39; is empty or not present, this field will be used to set the prefix of the user&#39;s name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("prefixName")]
    public string? PrefixName { get; set; }
    /// <summary>
    /// If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s first name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("firstName")]
    public string? FirstName { get; set; }
    /// <summary>
    /// If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s middle name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("middleName")]
    public string? MiddleName { get; set; }
    /// <summary>
    /// If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s last name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("lastName")]
    public string? LastName { get; set; }
    /// <summary>
    /// If the parameter &#39;name&#39; is empty or not present, this field will be used to set the suffix of the user&#39;s name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("suffixName")]
    public string? SuffixName { get; set; }
    /// <summary>
    /// Title
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// The device id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string DeviceId { get; set; }
    /// <summary>
    /// Device Id Type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceIdType")]
    public string? DeviceIdType { get; set; }
    /// <summary>
    /// The encrypted email of the user, this is what will be used when they login
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("username")]
    public string Username { get; set; }
    /// <summary>
    /// The encrypted password of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("password")]
    public string Password { get; set; }
    /// <summary>
    /// The user&#39;s contact email address (NOT the username) which is also used for email validation
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("emailAddress")]
    public string? EmailAddress { get; set; }
    /// <summary>
    /// The asset id to set the user&#39;s profile image
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetId")]
    public long? AssetId { get; set; }
    /// <summary>
    /// the user&#39;s address
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("address")]
    public string? Address { get; set; }
    /// <summary>
    /// The street zipcode of the user&#39;s contact location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("zipcode")]
    public string? Zipcode { get; set; }
    /// <summary>
    /// The gender of the user AudienceGender
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gender")]
    public string? Gender { get; set; }
    /// <summary>
    /// The birthday date of the user in milliseconds
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("birthday")]
    public long? Birthday { get; set; }
    /// <summary>
    /// the user&#39;s home phone number
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("homePhone")]
    public string? HomePhone { get; set; }
    /// <summary>
    /// the user&#39;s cell phone number
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cellPhone")]
    public string? CellPhone { get; set; }
    /// <summary>
    /// the user&#39;s Cell Phone Carrier
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cellPhoneCarrier")]
    public string? CellPhoneCarrier { get; set; }
    /// <summary>
    /// the user&#39;s Business Phone Number
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("businessPhone")]
    public string? BusinessPhone { get; set; }
    /// <summary>
    /// The type of account being created {RETAILER, MEMBER, DEVELOPER, GUEST
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("role")]
    public string? Role { get; set; }
    /// <summary>
    /// Comma separated list of development platforms: MAC, WINDOWS, IOS, ANDROID, WINDOWSPHONE, KINDLE, UNITY3D, COCOS2D, HTML5, FACEBOOK
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("platforms")]
    public string? Platforms { get; set; }
    /// <summary>
    /// Search tags
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// About Us information
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("aboutUs")]
    public string? AboutUs { get; set; }
    /// <summary>
    /// Game experience level of the user {ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameExperience")]
    public string? GameExperience { get; set; }
    /// <summary>
    /// A list of category ids that represent interests and associations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// The user&#39;s hometown
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hometown")]
    public string? Hometown { get; set; }
    /// <summary>
    /// The user&#39;s height
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("height")]
    public string? Height { get; set; }
    /// <summary>
    /// The user&#39;s height in a numerical value that can be used for ordering/searching
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("heightIndex")]
    public int? HeightIndex { get; set; }
    /// <summary>
    /// The user&#39;s ethnicity
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ethnicity")]
    public string? Ethnicity { get; set; }
    /// <summary>
    /// The user&#39;s body type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bodyType")]
    public string? BodyType { get; set; }
    /// <summary>
    /// The user&#39;s maritial status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("maritalStatus")]
    public string? MaritalStatus { get; set; }
    /// <summary>
    /// The user&#39;s children status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("children")]
    public string? Children { get; set; }
    /// <summary>
    /// The user&#39;s religion
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("religion")]
    public string? Religion { get; set; }
    /// <summary>
    /// The user&#39;s education
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("education")]
    public string? Education { get; set; }
    /// <summary>
    /// The user&#39;s education in a numerical value that can be used for ordering/searching
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("educationIndex")]
    public int? EducationIndex { get; set; }
    /// <summary>
    /// The user&#39;s smoke status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("smoke")]
    public string? Smoke { get; set; }
    /// <summary>
    /// The user&#39;s drink status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("drink")]
    public string? Drink { get; set; }
    /// <summary>
    /// The user&#39;s companionship status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("companionship")]
    public string? Companionship { get; set; }
    /// <summary>
    /// The user&#39;s companionship index
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("companionshipIndex")]
    public int? CompanionshipIndex { get; set; }
    /// <summary>
    /// The preferred minimum age in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredMinAge")]
    public int? PreferredMinAge { get; set; }
    /// <summary>
    /// The preferred maximum age in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredMaxAge")]
    public int? PreferredMaxAge { get; set; }
    /// <summary>
    /// The preferred minimum height in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredMinHeight")]
    public int? PreferredMinHeight { get; set; }
    /// <summary>
    /// The preferred maximum height in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredMaxHeight")]
    public int? PreferredMaxHeight { get; set; }
    /// <summary>
    /// The preferred gender in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredGender")]
    public string? PreferredGender { get; set; }
    /// <summary>
    /// The preferred education in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredEducation")]
    public string? PreferredEducation { get; set; }
    /// <summary>
    /// The preferred education in a numerical value that can be used for ordering/searching
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredEducationIndex")]
    public int? PreferredEducationIndex { get; set; }
    /// <summary>
    /// The preferred body type in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredBodyType")]
    public string? PreferredBodyType { get; set; }
    /// <summary>
    /// The preferred ethnicity in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredEthnicity")]
    public string? PreferredEthnicity { get; set; }
    /// <summary>
    /// The preferred education in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredLocation")]
    public string? PreferredLocation { get; set; }
    /// <summary>
    /// The preferred location range in the account location search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preferredLocationRange")]
    public double? PreferredLocationRange { get; set; }
    /// <summary>
    /// The current latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The current longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// Accepted Terms
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("acceptedTerms")]
    public bool? AcceptedTerms { get; set; }
    /// <summary>
    /// Charset Name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("charsetName")]
    public string? CharsetName { get; set; }
    /// <summary>
    /// Game Type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// App Version
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appVersion")]
    public string? AppVersion { get; set; }
    /// <summary>
    /// Response Type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseType")]
    public string? ResponseType { get; set; }
}
public class SetMatchTokenRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// A string of numbers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("matchToken")]
    public string? MatchToken { get; set; }
    /// <summary>
    /// Game Type (deprecated)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The current latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The current longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class UpdateActveStatusRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The account id of the user you want to modify (if this is not set, then the accountId parameter will be used instead)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountId")]
    public long ConnectionAccountId { get; set; }
    /// <summary>
    /// the application key that the user belongs to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// true will activate the user and false will deactivate
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool Active { get; set; }
}
public class UpdateLocationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The current latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The current longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// The time of the update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("clientTime")]
    public long? ClientTime { get; set; }
}
public class UpdateSettingsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The notifications to be blocked
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("blockedNotifications")]
    public string? BlockedNotifications { get; set; }
    /// <summary>
    /// How suggestions are to be sent (APNS, MOBILE_NOTIFICATION, SMS)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("suggestionMethod")]
    public string? SuggestionMethod { get; set; }
    /// <summary>
    /// How many suggestions to receive per time frame
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("suggestionCount")]
    public int? SuggestionCount { get; set; }
    /// <summary>
    /// The time frame in seconds, 3600 would be a 1 hour time frame
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("suggestionTimeFrame")]
    public int? SuggestionTimeFrame { get; set; }
    /// <summary>
    /// Show Others Exact Location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showOthersExactLocation")]
    public bool? ShowOthersExactLocation { get; set; }
    /// <summary>
    /// Show As Zipcode
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showAsZipcode")]
    public bool? ShowAsZipcode { get; set; }
    /// <summary>
    /// Show Exact Location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showExactLocation")]
    public bool? ShowExactLocation { get; set; }
    /// <summary>
    /// Show favorites
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("favoriteVisibility")]
    public string? FavoriteVisibility { get; set; }
    /// <summary>
    /// The current latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The current longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class ValidateAccountSignupRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The token associated with the account to update, good for 24 hours
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("token")]
    public string Token { get; set; }
}
public class ValidatePasswordResetRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The token associated with the account to update, good for 24 hours
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("token")]
    public string Token { get; set; }
}


