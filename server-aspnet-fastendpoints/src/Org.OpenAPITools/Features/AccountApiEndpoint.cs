using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Search Accounts by Location
/// </summary>

public class AccountLocationSearchEndpoint : FastEndpoints.Endpoint<AccountLocationSearchRequest, UserLocationSearchResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/account/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Search Accounts by Location";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Q, "Deprecated - legacy query parameter");
            s.RequestParam(r => r.Keyword, "An optional keyword to search on, will be ignore if empty (NOT implemented yet)");
            s.RequestParam(r => r.PostalCode, "The postal code to search on, either postalCode or the user&#39;s exact location is required");
            s.RequestParam(r => r.Latitude, "The latitude of the user, either postalCode or the user&#39;s exact location is required");
            s.RequestParam(r => r.Longitude, "The longitude of the user, either postalCode or the user&#39;s exact location is required");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.Range, "The range to search on");
            s.RequestParam(r => r.LocationLastUpdated, "Searches for user&#39;s that has updated their location since this date");
            s.RequestParam(r => r.Gender, "The preferred gender");
            s.RequestParam(r => r.MinAge, "The preferred min age");
            s.RequestParam(r => r.MaxAge, "The preferred max age");
            s.RequestParam(r => r.CompanionshipIndex, "The preferred companionship index");
            s.RequestParam(r => r.I, "this is the start index of a query");
            s.RequestParam(r => r.Start, "Start of the pagination");
            s.RequestParam(r => r.L, "this is the limit index of a query");
            s.RequestParam(r => r.Limit, "Limit of the pagination");
            s.RequestParam(r => r.SearchMode, "Search mode to use for index searches (e.g. CLOUDINDEX, OPENSEARCH)");
            s.RequestParam(r => r.SortField, "Sorting field for results (default: DISTANCE)");
            s.RequestParam(r => r.Descending, "Whether to sort descending (default: false)");
            s.RequestParam(r => r.Roles, "Roles to filter on");
            s.RequestParam(r => r.Tags, "Tags to filter on");
            s.RequestParam(r => r.Experience, "The experience to filter on");
            s.RequestParam(r => r.CategoryIds, "The category ids to filter on (comma separated)");
            s.RequestParam(r => r.AudienceIds, "The audience ids to filter on (comma separated)");
            s.RequestParam(r => r.AudienceOperator, "Operator used to combine audience filters (default: AND)");
            s.RequestParam(r => r.UpdateCurrentLocation, "Whether to use the given lat &amp; long to update the user&#39;s current location");
            s.RequestParam(r => r.UpdatePreferredSettings, "Whether to use the given parameters to update the user&#39;s preferred settings");
            s.RequestParam(r => r.ShowExactLocations, "Determines whether to always display user exact locations");
            s.RequestParam(r => r.ShowConnectionToSearcher, "Return connection of the accounts in the result to the passed in account if there exists any");
            s.RequestParam(r => r.FlagCountMinimum, "Return any results that have a minimum of the specified flag count (even ones that have met the flag threshold)");
            s.RequestParam(r => r.VerifiedUserOnly, "Returns only verified users");
            s.RequestParam(r => r.ContentAdminOnly, "Returns only content admin users");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AccountLocationSearchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Block Account
/// </summary>

public class BlockAccountEndpoint : FastEndpoints.Endpoint<BlockAccountRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/account/block");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Block Account";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountIdBeingBlocked, "The id of the account to be blocked/unblocked");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.BlockFlagValue, "Determines whether the account is blocked or unblocked");
            s.RequestParam(r => r.RemoveFromGroupsIfBlocked, "Determines whether the account is removed from all other groups if blocked");
            s.RequestParam(r => r.Latitude, "The current latitude of the user");
            s.RequestParam(r => r.Longitude, "The current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(BlockAccountRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Account
/// </summary>

public class CreateAccountEndpoint : FastEndpoints.Endpoint<CreateAccountRequest, AccountLoginResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/account/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Create Account";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Username, "The access token to authenticate with (ex: username)");
            s.RequestParam(r => r.Password, "The secret to authenticate with (ex: password)");
            s.RequestParam(r => r.Name, "The full name of the user. If this parameter is NOT empty, the following parameters will be ignored: prefixName, firstName, middleName, lastName, and suffixName");
            s.RequestParam(r => r.PrefixName, "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the prefix of the user&#39;s name");
            s.RequestParam(r => r.FirstName, "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s first name");
            s.RequestParam(r => r.MiddleName, "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s middle name");
            s.RequestParam(r => r.LastName, "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s last name");
            s.RequestParam(r => r.SuffixName, "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the suffix of the user&#39;s name");
            s.RequestParam(r => r.Title, "This field will be used to set the user&#39;s job title");
            s.RequestParam(r => r.DeviceId, "The unique id of the device making the request");
            s.RequestParam(r => r.DeviceIdType, "The type of device id (this is defined by the client), ie. MAC_ADDRESS, APPLE_UDID, etc");
            s.RequestParam(r => r.EmailAddress, "The user&#39;s contact email address (NOT the username)");
            s.RequestParam(r => r.AssetId, "The asset id to set the user&#39;s profile image");
            s.RequestParam(r => r.StreetAddress, "The street address of the user&#39;s contact location");
            s.RequestParam(r => r.Zipcode, "The zipcode of the user&#39;s contact location");
            s.RequestParam(r => r.Gender, "The gender of the user (AudienceGender)");
            s.RequestParam(r => r.Birthday, "The birthday date of the user in UTC milliseconds");
            s.RequestParam(r => r.HomePhone, "The home phone number");
            s.RequestParam(r => r.CellPhone, "The cellular phone number");
            s.RequestParam(r => r.CellPhoneCarrier, "The cellular service provider");
            s.RequestParam(r => r.BusinessPhone, "The business phone number");
            s.RequestParam(r => r.Role, "The account role (default: MEMBER)");
            s.RequestParam(r => r.Platforms, "Comma separated list of development platforms");
            s.RequestParam(r => r.Tags, "Search tags");
            s.RequestParam(r => r.AboutUs, "About us information");
            s.RequestParam(r => r.GameExperience, "Game experience of the user");
            s.RequestParam(r => r.CategoryIds, "A list of category ids that represent interests and associations");
            s.RequestParam(r => r.Hometown, "The user&#39;s hometown");
            s.RequestParam(r => r.Height, "The user&#39;s height");
            s.RequestParam(r => r.HeightIndex, "The user&#39;s height in a numerical value that can be used for ordering/searching");
            s.RequestParam(r => r.Ethnicity, "The user&#39;s ethnicity");
            s.RequestParam(r => r.BodyType, "The user&#39;s body type");
            s.RequestParam(r => r.MaritalStatus, "The user&#39;s marital status");
            s.RequestParam(r => r.Children, "The user&#39;s children status");
            s.RequestParam(r => r.Religion, "The user&#39;s religion");
            s.RequestParam(r => r.Education, "The user&#39;s education");
            s.RequestParam(r => r.EducationIndex, "The user&#39;s education in a numerical value that can be used for ordering/searching");
            s.RequestParam(r => r.Smoke, "The user&#39;s smoke status");
            s.RequestParam(r => r.Drink, "The user&#39;s drink status");
            s.RequestParam(r => r.Companionship, "The user&#39;s companionship status");
            s.RequestParam(r => r.CompanionshipIndex, "The user&#39;s companionship index");
            s.RequestParam(r => r.PreferredMinAge, "The preferred minimum age in the account location search");
            s.RequestParam(r => r.PreferredMaxAge, "The preferred maximum age in the account location search");
            s.RequestParam(r => r.PreferredMinHeight, "The preferred minimum height in the account location search");
            s.RequestParam(r => r.PreferredMaxHeight, "The preferred maximum height in the account location search");
            s.RequestParam(r => r.PreferredGender, "The preferred gender in the account location search");
            s.RequestParam(r => r.PreferredEducation, "The preferred education in the account location search");
            s.RequestParam(r => r.PreferredEducationIndex, "The preferred education in a numerical value that can be used for ordering/searching");
            s.RequestParam(r => r.PreferredBodyType, "The preferred body type in the account location search");
            s.RequestParam(r => r.PreferredEthnicity, "The preferred ethnicity in the account location search");
            s.RequestParam(r => r.PreferredLocation, "The preferred location in the account location search");
            s.RequestParam(r => r.PreferredLocationRange, "The preferred location range in the account location search");
            s.RequestParam(r => r.Latitude, "The current latitude of the user");
            s.RequestParam(r => r.Longitude, "The current longitude of the user");
            s.RequestParam(r => r.AcceptedTerms, "Accepted Terms");
            s.RequestParam(r => r.InviteToken, "The inviteToken that the referrer used for this account to sign up");
            s.RequestParam(r => r.ReferralAccountId, "The accountId of the referrer (used if there is no inviteToken)");
            s.RequestParam(r => r.SendValidation, "Whether to send validation email");
            s.RequestParam(r => r.GameType, "Deprecated: use appKey");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.AppVersion, "The application version");
            s.RequestParam(r => r.ResponseType, "Returns an AccountLoginResponse if \&quot;AccountLoginResponse\&quot; is passed in");
            s.RequestParam(r => r.AudienceIdsToAdd, "Comma separated list of audience ids to assign to the user");
            s.RequestParam(r => r.AppBlob, "Application blob data");
            s.RequestParam(r => r.AppEnablePush, "Enable push for the app");
            s.RequestParam(r => r.AppEnableSMS, "Enable SMS for the app");
            s.RequestParam(r => r.AppEnableEmail, "Enable email for the app");
            s.RequestParam(r => r.LocationVisibility, "Location visibility setting");
            s.RequestParam(r => r.HomeLatitude, "Home latitude");
            s.RequestParam(r => r.HomeLongitude, "Home longitude");
            s.RequestParam(r => r.AppNickname, "The nickname used in the application for this account");
            s.RequestParam(r => r.PersonalAudienceId, "Personal audience id to associate with this account");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateAccountRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Account
/// </summary>

public class EditAccountEndpoint : FastEndpoints.Endpoint<EditAccountRequest, ProfileInfoResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/account/profile/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Update Account";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ConnectionAccountId, "The account id used to edit another person&#39;s account");
            s.RequestParam(r => r.Role, "The account role to change to");
            s.RequestParam(r => r.AssetId, "The asset id to set the user&#39;s profile image");
            s.RequestParam(r => r.Name, "The full name of the user. If this parameter is NOT empty, the  following parameters will be ignored: prefixName, firstName, middleName,  lastName, and suffixName ");
            s.RequestParam(r => r.PrefixName, "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the prefix of the user&#39;s name");
            s.RequestParam(r => r.FirstName, "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s first name");
            s.RequestParam(r => r.MiddleName, "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s middle name");
            s.RequestParam(r => r.LastName, "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s last name");
            s.RequestParam(r => r.SuffixName, "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the suffix of the user&#39;s name");
            s.RequestParam(r => r.Title, "This field will be used to set the user&#39;s job title");
            s.RequestParam(r => r.Gender, "The gender of the user AudienceGender");
            s.RequestParam(r => r.Age, "This is deperecated, use the birthday parameter");
            s.RequestParam(r => r.Birthday, "The birthday date of the user in UTC milliseconds");
            s.RequestParam(r => r.HomePhone, "The home phone number");
            s.RequestParam(r => r.CellPhone, "The cellular phone number");
            s.RequestParam(r => r.CellPhoneCarrier, "The cellular service provider");
            s.RequestParam(r => r.BusinessPhone, "The business phone number");
            s.RequestParam(r => r.EmailAddress, "The user&#39;s contact email address (NOT the username)");
            s.RequestParam(r => r.StreetAddress, "The street address of the user&#39;s contact location");
            s.RequestParam(r => r.StreetAddress2, "Additional address information (such as a suite number, floor number, building name, or PO Box)");
            s.RequestParam(r => r.City, "The city of the user&#39;s contact location");
            s.RequestParam(r => r.State, "The state of the user&#39;s contact location");
            s.RequestParam(r => r.Zipcode, "The zipcode of the user&#39;s contact location");
            s.RequestParam(r => r.Country, "The country of the user&#39;s contact location");
            s.RequestParam(r => r.MakeProfileInfoPublic, "Allow anyone to view the user&#39;s personal profile");
            s.RequestParam(r => r.MakeGameInfoPublic, "Allow anyone to view the user&#39;s game/app info");
            s.RequestParam(r => r.MakeFriendsInfoPublic, "Allow anyone to view the user&#39;s friends list");
            s.RequestParam(r => r.Hometown, "The user&#39;s hometown");
            s.RequestParam(r => r.Height, "The user&#39;s height");
            s.RequestParam(r => r.HeightIndex, "The user&#39;s height in a numerical value that can be used for ordering/searching");
            s.RequestParam(r => r.Ethnicity, "The user&#39;s ethnicity");
            s.RequestParam(r => r.BodyType, "The user&#39;s body type");
            s.RequestParam(r => r.MaritalStatus, "The user&#39;s marital status");
            s.RequestParam(r => r.Children, "The user&#39;s children status");
            s.RequestParam(r => r.Religion, "The user&#39;s religion");
            s.RequestParam(r => r.Education, "The user&#39;s education");
            s.RequestParam(r => r.EducationIndex, "The user&#39;s education in a numerical value that can be used for ordering/searching");
            s.RequestParam(r => r.Smoke, "The user&#39;s smoke status");
            s.RequestParam(r => r.Drink, "The user&#39;s drink status");
            s.RequestParam(r => r.Companionship, "The user&#39;s companionship status");
            s.RequestParam(r => r.CompanionshipIndex, "The user&#39;s companionship index");
            s.RequestParam(r => r.PreferredMinAge, "The preferred minimum age in the account location search");
            s.RequestParam(r => r.PreferredMaxAge, "The preferred maximum age in the account location search");
            s.RequestParam(r => r.PreferredMinHeight, "The preferred minimum height in the account location search");
            s.RequestParam(r => r.PreferredMaxHeight, "The preferred maximum height in the account location search");
            s.RequestParam(r => r.PreferredGender, "The preferred gender in the account location search");
            s.RequestParam(r => r.PreferredEducation, "The preferred education in the account location search");
            s.RequestParam(r => r.PreferredEducationIndex, "The preferred education in a numerical value that can be used for ordering/searching");
            s.RequestParam(r => r.PreferredBodyType, "The preferred body type in the account location search");
            s.RequestParam(r => r.PreferredEthnicity, "The preferred ethnicity in the account location search");
            s.RequestParam(r => r.PreferredLocation, "The preferred education in the account location search");
            s.RequestParam(r => r.PreferredLocationRange, "The preferred location range in the account location search");
            s.RequestParam(r => r.Platforms, "Platforms");
            s.RequestParam(r => r.Tags, "Tags");
            s.RequestParam(r => r.AboutUs, "About Us");
            s.RequestParam(r => r.MatchToken, "Match Token");
            s.RequestParam(r => r.GameExperience, "Game Experience");
            s.RequestParam(r => r.Categories, "Deprecated use categoryIds");
            s.RequestParam(r => r.CategoryIds, "A list of category ids that represent interests and associations");
            s.RequestParam(r => r.ResponseFilters, "A comma separated list of ProfileFilters for filtering the returned response data");
            s.RequestParam(r => r.ShowAsZipcode, "The user&#39;s preference if they want to be shown by zipcode on a map");
            s.RequestParam(r => r.ShowExactLocation, "The user&#39;s preference if they want to be shown by their exact location on a map");
            s.RequestParam(r => r.ShowOthersExactLocation, "The user&#39;s preference if they want to see others exact location on a map");
            s.RequestParam(r => r.AcceptedTerms, "Accepted Terms");
            s.RequestParam(r => r.LocationVisibility, "Location Visibility");
            s.RequestParam(r => r.AppBlob, "App Blob");
            s.RequestParam(r => r.AppEnablePush, "App Enable Push");
            s.RequestParam(r => r.AppEnableSMS, "App Enable SMS");
            s.RequestParam(r => r.AppEnableEmail, "App Enable Email");
            s.RequestParam(r => r.GameType, "Game Type");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.Latitude, "The current latitude of the user");
            s.RequestParam(r => r.Longitude, "The current longitude of the user");
            s.RequestParam(r => r.ReturnProfile, "Return Profile");
            s.RequestParam(r => r.AudienceIdsToAdd, "Audience Ids to add");
            s.RequestParam(r => r.AudienceIdsToRemove, "Audience Ids to remove");
            s.RequestParam(r => r.ReferralAccountId, "The account id of the referrer");
            s.RequestParam(r => r.AppNickname, "App nickname");
            s.RequestParam(r => r.PersonalAudienceId, "Personal Audience");
            s.RequestParam(r => r.NonGuestUsername, "The user&#39;s username to update with if they currently have a guest username");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(EditAccountRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Username and Email
/// </summary>

public class EditUsernameEndpoint : FastEndpoints.Endpoint<EditUsernameRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/account/username/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Update Username and Email";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.EmailAddress, "the user&#39;s contact email address (NOT the username) which is also used for email validation");
            s.RequestParam(r => r.Username, "the user&#39;s username to update with if they currently have a guest username");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(EditUsernameRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Account
/// </summary>

public class GetAccountEndpoint : FastEndpoints.Endpoint<GetAccountRequest, ProfileResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/account/profile/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Get Account";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ReturnNulls, "Return Nulls");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ConnectionAccountEmail, "Connection Account Email");
            s.RequestParam(r => r.ConnectionAccountId, "The account id used to view another person&#39;s account");
            s.RequestParam(r => r.ResponseFilters, "A comma separated list of ProfileFilters for filtering the returned response data");
            s.RequestParam(r => r.GameType, "Game Type");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.PurchaseType, "Purchase Type");
            s.RequestParam(r => r.UpdateViewedDate, "Determines whether to track if a person has viewed someone&#39;s profile");
            s.RequestParam(r => r.Latitude, "Latitude used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "Longitude used to update the user&#39;s current location");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetAccountRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Profile Assets
/// </summary>

public class GetProfileAssetsEndpoint : FastEndpoints.Endpoint<GetProfileAssetsRequest, AssetListResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/account/profile/assets");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Get Profile Assets";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ReturnNulls, "Determines whether to return null fields in the response");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.OwnerId, "The account id of the person the user wants to view");
            s.RequestParam(r => r.MediaTypes, "Comma separated list of MediaType");
            s.RequestParam(r => r.MimeTypes, "Comma separated list of mime types");
            s.RequestParam(r => r.SortField, "Determines what the returning list will be sorted by (see AssetApiMap)");
            s.RequestParam(r => r.Descending, "Determines whether to return the resulting list in descending or ascending order");
            s.RequestParam(r => r.Latitude, "Latitude used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "Longitude used to update the user&#39;s current location");
            s.RequestParam(r => r.I, "_i");
            s.RequestParam(r => r.Start, "Start of the pagination");
            s.RequestParam(r => r.L, "_l");
            s.RequestParam(r => r.Limit, "Limit of the pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetProfileAssetsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Accounts
/// </summary>

public class GetReferralListEndpoint : FastEndpoints.Endpoint<GetReferralListRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/account/referral/list");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Search Accounts";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.RetrieveType, "one of these option - GET_CHILDREN will get all accounts that had signed up using the current account invite link - GET_ANCESTOR will get all accounts that referred the current account and it&#39;s parents, recursively - GET_ALL will get all of the above");
            s.RequestParam(r => r.LevelLimit, "level limit for children and ancestors of current account, starts from current account");
            s.RequestParam(r => r.AncestorLevelLimit, "level limit for ancestors, will override levelLimit if this is set");
            s.RequestParam(r => r.ChildrenLevelLimit, "level limit for children, will override levelLimit if this is set");
            s.RequestParam(r => r.AncestorListStart, "pagination start for children list");
            s.RequestParam(r => r.AncestorListLimit, "pagination limit for children list");
            s.RequestParam(r => r.ChildrenListStart, "pagination start for children list");
            s.RequestParam(r => r.ChildrenListLimit, "pagination limit for children list");
            s.RequestParam(r => r.ChildrenChildren, "if true, on each item in ancestor and children list, return the childrenTotalNumber and ancestorTotalNumber for that item");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetReferralListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Account Settings
/// </summary>

public class GetSettingsEndpoint : FastEndpoints.Endpoint<GetSettingsRequest, UserSettingsResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/account/settings/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Get Account Settings";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Latitude, "The current latitude of the user");
            s.RequestParam(r => r.Longitude, "The current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetSettingsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Login as Account
/// </summary>

public class LoginDelegateEndpoint : FastEndpoints.Endpoint<LoginDelegateRequest, ProfileResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/account/login/delegate");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Login as Account";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccessToken, "");
            s.RequestParam(r => r.AppKey, "");
            s.RequestParam(r => r.DeviceId, "");
            s.RequestParam(r => r.AccessTokenSecret, "");
            s.RequestParam(r => r.DelegatedAccountId, "");
            s.RequestParam(r => r.DelegatedUsername, "");
            s.RequestParam(r => r.NetworkUID, "The access provider to authenticate against (default: USERNAME). Supported values: FACEBOOK, TWITTER, USERNAME, PHONE");
            s.RequestParam(r => r.AgeRestriction, "Checks user&#39;s birthday to see if they meet an age requirement. If the user is under age, an error message is returned.");
            s.RequestParam(r => r.ResponseFilters, "This determines how much of the profile should be returned, see ProfileFilters");
            s.RequestParam(r => r.Latitude, "");
            s.RequestParam(r => r.Longitude, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(LoginDelegateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Login Account
/// </summary>

public class LoginGeneralEndpoint : FastEndpoints.Endpoint<LoginGeneralRequest, ProfileResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/account/login");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Login Account";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccessToken, "The access token to authenticate with (ex: username or fb token)");
            s.RequestParam(r => r.NetworkUID, "The access provider to authenticate against. This can be custom  networks created using the ThirdPartyApi as well. Supported values by default  include: FACEBOOK, TWITTER, USERNAME, PHONE ");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.DeviceId, "The unique id of the device making the request");
            s.RequestParam(r => r.DeviceIdType, "The type of device id (this is defined by the client), ie. MAC_ADDRESS, APPLE_UDID, etc");
            s.RequestParam(r => r.AccessTokenSecret, "The secret to authenticate with (ex: password)");
            s.RequestParam(r => r.AgeRestriction, "Checks user&#39;s birthday to see if they meet an age requirement. If the user is under age, an error message is returned.");
            s.RequestParam(r => r.ResponseFilters, "This determines how much of the profile should be returned, see ProfileFilters");
            s.RequestParam(r => r.Latitude, "Used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "Used to update the user&#39;s current location");
            s.RequestParam(r => r.EmailMatch, "Option to check for email if username doesn&#39;t match, also support multiple accounts");
            s.RequestParam(r => r.ChosenAccountId, "Chosen account Id sent from the app - pass in the 2nd request to choose an account from multiple accounts matching the email - use one of the account id from the previous request");
            s.RequestParam(r => r.ThirdPartyCredentialId, "Third-party credential Id, pass in the 2nd request to choose an account from multiple accounts matching the email - use the id from the previous call ThirdPartyCredential object");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(LoginGeneralRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Login Account (Username)
/// </summary>

public class LoginUsernameEndpoint : FastEndpoints.Endpoint<LoginUsernameRequest, ProfileResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/account/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Login Account (Username)";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Username, "the user&#39;s email address they used to sign-up");
            s.RequestParam(r => r.Password, "the password");
            s.RequestParam(r => r.DeviceId, "the device id");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.RequestParam(r => r.App, "the app");
            s.RequestParam(r => r.GameType, "This parameter is deprecated. This is deprecated, use appKey.");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.ReturnProfile, "the profile to return");
            s.RequestParam(r => r.ResponseFilters, "a comma separated list of ProfileFilters for filtering the returned response data");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(LoginUsernameRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Logout Account
/// </summary>

public class LogoutEndpoint : FastEndpoints.Endpoint<LogoutRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/account/logout");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Logout Account";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.DeviceIdType, "Device Id Type");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Latitude, "The current latitude of the user");
            s.RequestParam(r => r.Longitude, "The current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(LogoutRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Merge Account
/// </summary>

public class MergeAccountEndpoint : FastEndpoints.Endpoint<MergeAccountRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/account/merge");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Merge Account";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.MergeAccountId, "The id of the account to being merged");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(MergeAccountRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Password
/// </summary>

public class PasswordChangeEndpoint : FastEndpoints.Endpoint<PasswordChangeRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/account/passwordchange");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Update Password";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account to update");
            s.RequestParam(r => r.OldPassword, "The current password, used to validate access");
            s.RequestParam(r => r.NewPassword, "The new password to set, cannot be empty");
            s.RequestParam(r => r.ConfirmPassword, "The new password to confirm, must match newPassword");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(PasswordChangeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Reset Password
/// </summary>

public class PasswordResetEndpoint : FastEndpoints.Endpoint<PasswordResetRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/account/passwordreset");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Reset Password";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Token, "The token associated with the account to update, good for 24 hours");
            s.RequestParam(r => r.Password, "The new password to set, cannot be empty");
            s.RequestParam(r => r.Confirm, "The new password to confirm, must match newPassword");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(PasswordResetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Request Password Reset
/// </summary>

public class RequestPasswordResetEndpoint : FastEndpoints.Endpoint<RequestPasswordResetRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/account/requestpasswordreset");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Request Password Reset";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Email, "The email/username of the account");
            s.RequestParam(r => r.From, "this is the sender email");
            s.RequestParam(r => r.Domain, "this is the domain (like dev.sirqul.com) used to generate the password reset link");
            s.RequestParam(r => r.SubUrl, "this is the the subUrl (like resetpassword) used to generate a password reset link");
            s.RequestParam(r => r.Referer, "this is used to generate a password reset link");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RequestPasswordResetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Send Validation Request
/// </summary>

public class RequestValidateAccountEndpoint : FastEndpoints.Endpoint<RequestValidateAccountRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/account/requestValidateAccount");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Send Validation Request";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RequestValidateAccountRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Accounts
/// </summary>

public class SearchAccountsEndpoint : FastEndpoints.Endpoint<SearchAccountsRequest, List<ProfileResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/account/profile/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Search Accounts";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The id of the account requesting");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.Keyword, "The keyword for for querying the account");
            s.RequestParam(r => r.Latitude, "the latitude");
            s.RequestParam(r => r.Longitude, "the longitude");
            s.RequestParam(r => r.Radius, "the radius");
            s.RequestParam(r => r.Gender, "the user&#39;s gender");
            s.RequestParam(r => r.GameExperience, "the user&#39;s Game Experience");
            s.RequestParam(r => r.Age, "the user&#39;s age");
            s.RequestParam(r => r.CategoryIds, "the user&#39;s Category Ids");
            s.RequestParam(r => r.ReturnNulls, "Return Nulls");
            s.RequestParam(r => r.ResponseFilters, "A comma separated list of ProfileFilters for filtering the returned response data");
            s.RequestParam(r => r.PurchaseType, "A comma separated list of PurchaseType");
            s.RequestParam(r => r.SortField, "The field to sort by");
            s.RequestParam(r => r.Descending, "The order to return the results. Default is false, which will return the results in ascending order.");
            s.RequestParam(r => r.Start, "The index into the record set to start with.");
            s.RequestParam(r => r.Limit, "The total number of record to return.");
            s.RequestParam(r => r.ActiveOnly, "Determines whether to return only active results. Default is false.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchAccountsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Login Account (Encrypted Username)
/// </summary>

public class SecureLoginEndpoint : FastEndpoints.Endpoint<SecureLoginRequest, ProfileResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/account/login/validate");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Login Account (Encrypted Username)";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Username, "The user&#39;s encrypted email address they used to sign-up");
            s.RequestParam(r => r.Password, "The encrypted password");
            s.RequestParam(r => r.GameType, "The application key");
            s.RequestParam(r => r.DeviceId, "The device id");
            s.RequestParam(r => r.CharsetName, "Charset Name");
            s.RequestParam(r => r.Latitude, "The current latitude of the user");
            s.RequestParam(r => r.Longitude, "The current longitude of the user");
            s.RequestParam(r => r.ReturnProfile, "Return Profile");
            s.RequestParam(r => r.ResponseFilters, "A comma separated list of ProfileFilters for filtering the returned response data");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SecureLoginRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Account (Encrypted Username)
/// </summary>

public class SecureSignupEndpoint : FastEndpoints.Endpoint<SecureSignupRequest, ProfileInfoResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/account/create/validate");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Create Account (Encrypted Username)";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id");
            s.RequestParam(r => r.Username, "The encrypted email of the user, this is what will be used when they login");
            s.RequestParam(r => r.Password, "The encrypted password of the user");
            s.RequestParam(r => r.Name, "The full name of the user. If this parameter is not empty, the  following parameters will be ignored: prefixName, firstName, middleName,  lastName, and suffixName ");
            s.RequestParam(r => r.InviteToken, "the inviteToken that the referrer use for this account to sign up");
            s.RequestParam(r => r.PrefixName, "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the prefix of the user&#39;s name");
            s.RequestParam(r => r.FirstName, "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s first name");
            s.RequestParam(r => r.MiddleName, "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s middle name");
            s.RequestParam(r => r.LastName, "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s last name");
            s.RequestParam(r => r.SuffixName, "If the parameter &#39;name&#39; is empty or not present, this field will be used to set the suffix of the user&#39;s name");
            s.RequestParam(r => r.Title, "Title");
            s.RequestParam(r => r.DeviceIdType, "Device Id Type");
            s.RequestParam(r => r.EmailAddress, "The user&#39;s contact email address (NOT the username) which is also used for email validation");
            s.RequestParam(r => r.AssetId, "The asset id to set the user&#39;s profile image");
            s.RequestParam(r => r.Address, "the user&#39;s address");
            s.RequestParam(r => r.Zipcode, "The street zipcode of the user&#39;s contact location");
            s.RequestParam(r => r.Gender, "The gender of the user AudienceGender");
            s.RequestParam(r => r.Birthday, "The birthday date of the user in milliseconds");
            s.RequestParam(r => r.HomePhone, "the user&#39;s home phone number");
            s.RequestParam(r => r.CellPhone, "the user&#39;s cell phone number");
            s.RequestParam(r => r.CellPhoneCarrier, "the user&#39;s Cell Phone Carrier");
            s.RequestParam(r => r.BusinessPhone, "the user&#39;s Business Phone Number");
            s.RequestParam(r => r.Role, "The type of account being created {RETAILER, MEMBER, DEVELOPER, GUEST");
            s.RequestParam(r => r.Platforms, "Comma separated list of development platforms: MAC, WINDOWS, IOS, ANDROID, WINDOWSPHONE, KINDLE, UNITY3D, COCOS2D, HTML5, FACEBOOK");
            s.RequestParam(r => r.Tags, "Search tags");
            s.RequestParam(r => r.AboutUs, "About Us information");
            s.RequestParam(r => r.GameExperience, "Game experience level of the user {ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT");
            s.RequestParam(r => r.CategoryIds, "A list of category ids that represent interests and associations");
            s.RequestParam(r => r.Hometown, "The user&#39;s hometown");
            s.RequestParam(r => r.Height, "The user&#39;s height");
            s.RequestParam(r => r.HeightIndex, "The user&#39;s height in a numerical value that can be used for ordering/searching");
            s.RequestParam(r => r.Ethnicity, "The user&#39;s ethnicity");
            s.RequestParam(r => r.BodyType, "The user&#39;s body type");
            s.RequestParam(r => r.MaritalStatus, "The user&#39;s maritial status");
            s.RequestParam(r => r.Children, "The user&#39;s children status");
            s.RequestParam(r => r.Religion, "The user&#39;s religion");
            s.RequestParam(r => r.Education, "The user&#39;s education");
            s.RequestParam(r => r.EducationIndex, "The user&#39;s education in a numerical value that can be used for ordering/searching");
            s.RequestParam(r => r.Smoke, "The user&#39;s smoke status");
            s.RequestParam(r => r.Drink, "The user&#39;s drink status");
            s.RequestParam(r => r.Companionship, "The user&#39;s companionship status");
            s.RequestParam(r => r.CompanionshipIndex, "The user&#39;s companionship index");
            s.RequestParam(r => r.PreferredMinAge, "The preferred minimum age in the account location search");
            s.RequestParam(r => r.PreferredMaxAge, "The preferred maximum age in the account location search");
            s.RequestParam(r => r.PreferredMinHeight, "The preferred minimum height in the account location search");
            s.RequestParam(r => r.PreferredMaxHeight, "The preferred maximum height in the account location search");
            s.RequestParam(r => r.PreferredGender, "The preferred gender in the account location search");
            s.RequestParam(r => r.PreferredEducation, "The preferred education in the account location search");
            s.RequestParam(r => r.PreferredEducationIndex, "The preferred education in a numerical value that can be used for ordering/searching");
            s.RequestParam(r => r.PreferredBodyType, "The preferred body type in the account location search");
            s.RequestParam(r => r.PreferredEthnicity, "The preferred ethnicity in the account location search");
            s.RequestParam(r => r.PreferredLocation, "The preferred education in the account location search");
            s.RequestParam(r => r.PreferredLocationRange, "The preferred location range in the account location search");
            s.RequestParam(r => r.Latitude, "The current latitude of the user");
            s.RequestParam(r => r.Longitude, "The current longitude of the user");
            s.RequestParam(r => r.AcceptedTerms, "Accepted Terms");
            s.RequestParam(r => r.CharsetName, "Charset Name");
            s.RequestParam(r => r.GameType, "Game Type");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.AppVersion, "App Version");
            s.RequestParam(r => r.ResponseType, "Response Type");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SecureSignupRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Save Match Token
/// </summary>

public class SetMatchTokenEndpoint : FastEndpoints.Endpoint<SetMatchTokenRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/profile/matchToken");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Save Match Token";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.MatchToken, "A string of numbers");
            s.RequestParam(r => r.GameType, "Game Type (deprecated)");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.Latitude, "The current latitude of the user");
            s.RequestParam(r => r.Longitude, "The current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SetMatchTokenRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Account Active Status
/// </summary>

public class UpdateActveStatusEndpoint : FastEndpoints.Endpoint<UpdateActveStatusRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/account/active/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Update Account Active Status";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ConnectionAccountId, "The account id of the user you want to modify (if this is not set, then the accountId parameter will be used instead)");
            s.RequestParam(r => r.Active, "true will activate the user and false will deactivate");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AppKey, "the application key that the user belongs to");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateActveStatusRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Location
/// </summary>

public class UpdateLocationEndpoint : FastEndpoints.Endpoint<UpdateLocationRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/account/location/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Update Location";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Latitude, "The current latitude of the user");
            s.RequestParam(r => r.Longitude, "The current longitude of the user");
            s.RequestParam(r => r.ClientTime, "The time of the update");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateLocationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Account Settings
/// </summary>

public class UpdateSettingsEndpoint : FastEndpoints.Endpoint<UpdateSettingsRequest, UserSettingsResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/account/settings/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Update Account Settings";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.BlockedNotifications, "The notifications to be blocked");
            s.RequestParam(r => r.SuggestionMethod, "How suggestions are to be sent (APNS, MOBILE_NOTIFICATION, SMS)");
            s.RequestParam(r => r.SuggestionCount, "How many suggestions to receive per time frame");
            s.RequestParam(r => r.SuggestionTimeFrame, "The time frame in seconds, 3600 would be a 1 hour time frame");
            s.RequestParam(r => r.ShowOthersExactLocation, "Show Others Exact Location");
            s.RequestParam(r => r.ShowAsZipcode, "Show As Zipcode");
            s.RequestParam(r => r.ShowExactLocation, "Show Exact Location");
            s.RequestParam(r => r.FavoriteVisibility, "Show favorites");
            s.RequestParam(r => r.Latitude, "The current latitude of the user");
            s.RequestParam(r => r.Longitude, "The current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateSettingsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Save Validation Status
/// </summary>

public class ValidateAccountSignupEndpoint : FastEndpoints.Endpoint<ValidateAccountSignupRequest, AccountLoginResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/account/validateAccountSignup");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Save Validation Status";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Token, "The token associated with the account to update, good for 24 hours");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ValidateAccountSignupRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Validate Password Reset Token
/// </summary>

public class ValidatePasswordResetEndpoint : FastEndpoints.Endpoint<ValidatePasswordResetRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/account/validatepasswordreset");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Account");
        });

        Summary(s => {
            s.Summary = "Validate Password Reset Token";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Token, "The token associated with the account to update, good for 24 hours");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ValidatePasswordResetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

