
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AssignEmployeeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The account id of the manager to assign under
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("managerAccountId")]
    public long ManagerAccountId { get; set; }
    /// <summary>
    /// The account id of the user to be assigned as employee
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("employeeAccountId")]
    public long EmployeeAccountId { get; set; }
    /// <summary>
    /// The role to assign to the employee (e.g. RETAILER or RETAILER_LIMITED)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("role")]
    public string? Role { get; set; }
}
public class AssignToLocationEmployeeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The account id of the user to apply the change to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("employeeAccountId")]
    public long? EmployeeAccountId { get; set; }
    /// <summary>
    /// The retailer location to apply the change to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long RetailerLocationId { get; set; }
    /// <summary>
    /// If true (default) assign to the location, otherwise remove from the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assign")]
    public bool? Assign { get; set; }
}
public class CreateEmployeeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The account id of the manager to assign under
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("managerAccountId")]
    public long ManagerAccountId { get; set; }
    /// <summary>
    /// The username/email for the new user. This must be unique across the entire the system.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("username")]
    public string Username { get; set; }
    /// <summary>
    /// The password for the new user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("password")]
    public string Password { get; set; }
    /// <summary>
    /// a name field
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// The name prefix; Mr, Mrs, etc
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("prefixName")]
    public string? PrefixName { get; set; }
    /// <summary>
    /// The first name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("firstName")]
    public string? FirstName { get; set; }
    /// <summary>
    /// The middle name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("middleName")]
    public string? MiddleName { get; set; }
    /// <summary>
    /// The last name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("lastName")]
    public string? LastName { get; set; }
    /// <summary>
    /// The name suffix; Jr, Sr, III, etc
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("suffixName")]
    public string? SuffixName { get; set; }
    /// <summary>
    /// The title of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// Additional about/biography text
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("aboutUs")]
    public string? AboutUs { get; set; }
    /// <summary>
    /// the asset id to set the user&#39;s profile image
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetId")]
    public long? AssetId { get; set; }
    /// <summary>
    /// The gender
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gender")]
    public string? Gender { get; set; }
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
    /// The cellular service provider. This is required for sending SMS. Leave this empty if the provider is not on the list of supported carriers.
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
    /// The role; RETAILER or RETAILER_LIMITED, defaulted to RETAILER_LIMITED
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("role")]
    public string? Role { get; set; }
    /// <summary>
    /// the retailer location IDs the employee is associated with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationIds")]
    public string? RetailerLocationIds { get; set; }
    /// <summary>
    /// Determines whether to return the application settings for the employee for a particular application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("settingsAppKey")]
    public string? SettingsAppKey { get; set; }
    /// <summary>
    /// external custom client defined data (per Application)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appBlob")]
    public string? AppBlob { get; set; }
    /// <summary>
    /// The device id to assign to the user (used for IPS beacon tracking)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assignedDeviceId")]
    public string? AssignedDeviceId { get; set; }
}
public class DeleteEmployeeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the id of the employee to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("employeeAccountId")]
    public long EmployeeAccountId { get; set; }
}
public class GetEmployeeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the id of the employee account to get
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("employeeAccountId")]
    public long EmployeeAccountId { get; set; }
    /// <summary>
    /// Determines whether to return the application settings for the employee for a particular application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("settingsAppKey")]
    public string? SettingsAppKey { get; set; }
}
public class SearchEmployeesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The role to limit the search to: RETAILER or RETAILER_LIMITED. Leave empty to search on both roles.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("role")]
    public string? Role { get; set; }
    /// <summary>
    /// Filters employees by retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerId")]
    public long? RetailerId { get; set; }
    /// <summary>
    /// Filter employees by retailer locations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long? RetailerLocationId { get; set; }
    /// <summary>
    /// Deprecated parameter
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
    /// <summary>
    /// an optional keyword to search on; ignored if empty
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// The field to sort by. Possible values include: DISPLAY, CREATED, UPDATED, ACTIVE, DELETED, LAST_LOGGED_IN, CONTACT_EMAIL, RETAILER_LOCATION_NAME, RETAILER_NAME
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// Deprecated parameter
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_i")]
    public int? I { get; set; }
    /// <summary>
    /// Start the result set at some index
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// Deprecated parameter
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_l")]
    public int? L { get; set; }
    /// <summary>
    /// Limit the result to some number
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// Filter results to only return active employees
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool? ActiveOnly { get; set; }
    /// <summary>
    /// Filter results to only employees that you manage
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("managedOnly")]
    public bool? ManagedOnly { get; set; }
    /// <summary>
    /// Determines whether to return the application settings for the employee for a particular application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("settingsAppKey")]
    public string? SettingsAppKey { get; set; }
    /// <summary>
    /// Comma separated list of category ids to filter results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// Legacy/reporting query parameter used for formatting employee responses
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("query")]
    public string? Query { get; set; }
}
public class UnassignEmployeeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The account id of the user to be unassigned
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("employeeAccountId")]
    public long EmployeeAccountId { get; set; }
}
public class UpdateEmployeeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the id of the employee account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("employeeAccountId")]
    public long EmployeeAccountId { get; set; }
    /// <summary>
    /// The account id of the manager to assign under
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("managerAccountId")]
    public long? ManagerAccountId { get; set; }
    /// <summary>
    /// a name field
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// The name prefix; Mr, Mrs, etc
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("prefixName")]
    public string? PrefixName { get; set; }
    /// <summary>
    /// The first name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("firstName")]
    public string? FirstName { get; set; }
    /// <summary>
    /// The middle name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("middleName")]
    public string? MiddleName { get; set; }
    /// <summary>
    /// The last name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("lastName")]
    public string? LastName { get; set; }
    /// <summary>
    /// The name suffix; Jr, Sr, III, etc
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("suffixName")]
    public string? SuffixName { get; set; }
    /// <summary>
    /// The title of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// the asset id to set the user&#39;s profile image
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetId")]
    public long? AssetId { get; set; }
    /// <summary>
    /// The gender {MALE, FEMALE, ANY}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gender")]
    public string? Gender { get; set; }
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
    /// The cellular service provider. This is required for sending SMS. Leave this empty if the provider is not on the list of supported carriers. Supported Carriers: {ATT, QWEST, T_MOBILE, VERIZON, SPRINT, VIRIGIN_MOBILE, NEXTEL, ALLTEL, METRO_PCS, POWERTEL, BOOST_MOBILE, SUNCOM, TRACFONE, US_CELLULAR}
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
    /// The role; RETAILER or RETAILER_LIMITED, defaulted to RETAILER_LIMITED
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("role")]
    public string? Role { get; set; }
    /// <summary>
    /// Sets whether the employee is active or inactive
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// Sets the password for the employee
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("password")]
    public string? Password { get; set; }
    /// <summary>
    /// Sets which retailer locations the employee is assigned to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationIds")]
    public string? RetailerLocationIds { get; set; }
    /// <summary>
    /// Determines whether to return the application settings for the employee for a particular application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("settingsAppKey")]
    public string? SettingsAppKey { get; set; }
    /// <summary>
    /// external custom client defined data (per Application)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appBlob")]
    public string? AppBlob { get; set; }
    /// <summary>
    /// The device id to assign to the user (used for IPS beacon tracking)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assignedDeviceId")]
    public string? AssignedDeviceId { get; set; }
}


