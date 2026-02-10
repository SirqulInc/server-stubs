using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Credential
/// </summary>

public class CreateCredentialEndpoint : FastEndpoints.Endpoint<CreateCredentialRequest, ProfileResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/thirdparty/credential/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("ThirdParty Credentials");
        });

        Summary(s => {
            s.Summary = "Create Credential";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ThirdPartyId, "the third party user account id");
            s.RequestParam(r => r.ThirdPartyToken, "the access token to authenticate with (ex: username or fb token or phone number)");
            s.RequestParam(r => r.NetworkUID, "the access provider to authenticate against");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.AccountId, "the unique id of the account that needs authenticating (optional for PHONE_V2)");
            s.RequestParam(r => r.DeviceId, "the unique id of the device making the request");
            s.RequestParam(r => r.SessionId, "the session id for the request");
            s.RequestParam(r => r.ThirdPartyName, "the third party user&#39;s display name");
            s.RequestParam(r => r.EmailAddress, "optional email address associated with the third party account");
            s.RequestParam(r => r.SigninOnlyMode, "when true will error out if can&#39;t find any accounts matching (signin only)");
            s.RequestParam(r => r.ResponseFilters, "this determines how much of the profile should be returned, see ProfileFilters");
            s.RequestParam(r => r.Latitude, "the latitude of the user");
            s.RequestParam(r => r.Longitude, "the longitude of the user");
            s.RequestParam(r => r.MetaData, "External custom client defined data");
            s.RequestParam(r => r.ThirdPartyRefreshToken, "optional refresh token for the third party");
            s.RequestParam(r => r.AudienceIdsToAdd, "audience ids to add to the account");
            s.RequestParam(r => r.AudienceIdsToRemove, "audience ids to remove from the account");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateCredentialRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Network
/// </summary>

public class CreateNetworkEndpoint : FastEndpoints.Endpoint<CreateNetworkRequest, ThirdPartyNetworkResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/thirdparty/network/create");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("ThirdParty Credentials");
        });

        Summary(s => {
            s.Summary = "Create Network";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id making the request");
            s.RequestParam(r => r.Name, "The name of the network");
            s.RequestParam(r => r.EnableIntrospection, "Whether the network uses introspection calls");
            s.RequestParam(r => r.Description, "The description of the network");
            s.RequestParam(r => r.IntrospectionMethod, "HTTP method to use for introspection calls (e.g., GET, POST)");
            s.RequestParam(r => r.IntrospectionURL, "The HTTP URL of the introspection call");
            s.RequestParam(r => r.IntrospectionParams, "The parameters of the introspection call");
            s.RequestParam(r => r.RequiredRootField, "Required response params");
            s.RequestParam(r => r.EnableMFA, "Whether this network uses MFA");
            s.RequestParam(r => r.SizeMFA, "Size of the MFA token");
            s.RequestParam(r => r.ShelfLifeMFA, "Shelf life (seconds) of the MFA token");
            s.RequestParam(r => r.OauthTokenURL, "OAuth token endpoint URL");
            s.RequestParam(r => r.OauthPrivateKey, "OAuth private key file (multipart)");
            s.RequestParam(r => r.OauthPublicKey, "OAuth public key file (multipart)");
            s.RequestParam(r => r.OauthClientId, "OAuth client id");
            s.RequestParam(r => r.OauthSecretKey, "OAuth secret key");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateNetworkRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Credential
/// </summary>

public class DeleteCredentialEndpoint : FastEndpoints.Endpoint<DeleteCredentialRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/thirdparty/credential/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("ThirdParty Credentials");
        });

        Summary(s => {
            s.Summary = "Delete Credential";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the user");
            s.RequestParam(r => r.NetworkUID, "The third party network identifier");
            s.RequestParam(r => r.ThirdPartyId, "The third party user id");
            s.RequestParam(r => r.AppKey, "the application key");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteCredentialRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Network
/// </summary>

public class DeleteNetworkEndpoint : FastEndpoints.Endpoint<DeleteNetworkRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/thirdparty/network/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("ThirdParty Credentials");
        });

        Summary(s => {
            s.Summary = "Delete Network";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.NetworkUID, "The unique identifier for the third party network defined by Sirqul");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteNetworkRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Credential
/// </summary>

public class GetCredentialEndpoint : FastEndpoints.Endpoint<GetCredentialRequest, ProfileResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/thirdparty/credential/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("ThirdParty Credentials");
        });

        Summary(s => {
            s.Summary = "Get Credential";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.NetworkUID, "the access provider to authenticate against");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.AccountId, "the unique account id of a specific account that will be bound to the third-party credentials");
            s.RequestParam(r => r.DeviceId, "the unique id of the device making the request");
            s.RequestParam(r => r.SessionId, "the session id for the request");
            s.RequestParam(r => r.ThirdPartyCredentialId, "the third-party credentials id from the response of the credential/create step");
            s.RequestParam(r => r.ThirdPartyToken, "the access token to authenticate with");
            s.RequestParam(r => r.ThirdPartySecret, "the secret code to authenticate with (used for MFA)");
            s.RequestParam(r => r.CreateNewAccount, "flag to force creation of a new account when no accountId is passed and user chooses not to use listed accounts");
            s.RequestParam(r => r.ResponseFilters, "this determines how much of the profile should be returned, see ProfileFilters");
            s.RequestParam(r => r.Latitude, "the latitude of the user");
            s.RequestParam(r => r.Longitude, "the longitude of the user");
            s.RequestParam(r => r.AudienceIdsToAdd, "audience ids to add to the account");
            s.RequestParam(r => r.AudienceIdsToRemove, "audience ids to remove from the account");
            s.RequestParam(r => r.ReferralAccountId, "account id of the referrer (inviter-invitee relationship)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetCredentialRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Network
/// </summary>

public class GetNetworkEndpoint : FastEndpoints.Endpoint<GetNetworkRequest, ThirdPartyNetworkResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/thirdparty/network/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("ThirdParty Credentials");
        });

        Summary(s => {
            s.Summary = "Get Network";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id making the request");
            s.RequestParam(r => r.NetworkUID, "The unique identifier for the third party network defined by Sirqul");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetNetworkRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Credentials
/// </summary>

public class SearchCredentialsEndpoint : FastEndpoints.Endpoint<SearchCredentialsRequest, List<ThirdPartyCredentialResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/thirdparty/credential/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("ThirdParty Credentials");
        });

        Summary(s => {
            s.Summary = "Search Credentials";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the user");
            s.RequestParam(r => r.Keyword, "The keyword used to search on the third party name and network string");
            s.RequestParam(r => r.NetworkUID, "The network UID to filter results with");
            s.RequestParam(r => r.Descending, "The order to return the search results");
            s.RequestParam(r => r.Start, "The start of the pagination");
            s.RequestParam(r => r.Limit, "The limit of the pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchCredentialsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Networks
/// </summary>

public class SearchNetworksEndpoint : FastEndpoints.Endpoint<SearchNetworksRequest, List<ThirdPartyNetworkShortResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/thirdparty/network/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("ThirdParty Credentials");
        });

        Summary(s => {
            s.Summary = "Search Networks";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id making the request");
            s.RequestParam(r => r.SortField, "The column to sort the search on, possible values include: UPDATED (default), CREATED, NAME");
            s.RequestParam(r => r.Descending, "The order to return the search results");
            s.RequestParam(r => r.Start, "The start of the pagination");
            s.RequestParam(r => r.Limit, "The limit of the pagination");
            s.RequestParam(r => r.ActiveOnly, "Return only active results");
            s.RequestParam(r => r.Keyword, "The keyword used to search on the network name and description fields");
            s.RequestParam(r => r.FilterBillable, "Determines whether to only return applications that the user has access to");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchNetworksRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Send MFA Challenge
/// </summary>

public class SendMFAChallengeEndpoint : FastEndpoints.Endpoint<SendMFAChallengeRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/thirdparty/credential/mfa/send");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("ThirdParty Credentials");
        });

        Summary(s => {
            s.Summary = "Send MFA Challenge";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.NetworkUID, "the third party network provider that has MFA enabled");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.ThirdPartyToken, "the access token to authenticate with");
            s.RequestParam(r => r.ThirdPartyCredentialId, "optional id of the existing third party credential");
            s.RequestParam(r => r.DeviceId, "the unique id of the device making the request");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SendMFAChallengeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Credential
/// </summary>

public class UpdateCredentialEndpoint : FastEndpoints.Endpoint<UpdateCredentialRequest, ProfileResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/thirdparty/credential/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("ThirdParty Credentials");
        });

        Summary(s => {
            s.Summary = "Update Credential";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.NetworkUID, "the access provider to authenticate against");
            s.RequestParam(r => r.ThirdPartyId, "the third party user account id");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.DeviceId, "the unique id of the device making the request");
            s.RequestParam(r => r.ThirdPartyName, "the third party user name");
            s.RequestParam(r => r.ThirdPartyToken, "the access token to authenticate with (ex: username or fb token)");
            s.RequestParam(r => r.ResponseFilters, "this determines how much of the profile should be returned, see ProfileFilters");
            s.RequestParam(r => r.MetaData, "External custom client defined data");
            s.RequestParam(r => r.ThirdPartyRefreshToken, "optional refresh token for the third party");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateCredentialRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Network
/// </summary>

public class UpdateNetworkEndpoint : FastEndpoints.Endpoint<UpdateNetworkRequest, ThirdPartyNetworkResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/thirdparty/network/update");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("ThirdParty Credentials");
        });

        Summary(s => {
            s.Summary = "Update Network";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id making the request");
            s.RequestParam(r => r.NetworkUID, "The unique identifier for the third party network defined by Sirqul");
            s.RequestParam(r => r.Name, "The name of the network");
            s.RequestParam(r => r.Description, "The description of the network");
            s.RequestParam(r => r.EnableIntrospection, "Whether the network uses introspection calls");
            s.RequestParam(r => r.IntrospectionMethod, "HTTP method to use for introspection calls (e.g., GET, POST)");
            s.RequestParam(r => r.IntrospectionURL, "The HTTP URL of the introspection call");
            s.RequestParam(r => r.IntrospectionParams, "The parameters of the introspection call");
            s.RequestParam(r => r.RequiredRootField, "Required response params");
            s.RequestParam(r => r.EnableMFA, "Whether this network uses MFA");
            s.RequestParam(r => r.SizeMFA, "Size of the MFA token");
            s.RequestParam(r => r.ShelfLifeMFA, "Shelf life (seconds) of the MFA token");
            s.RequestParam(r => r.OauthTokenURL, "OAuth token endpoint URL");
            s.RequestParam(r => r.OauthPrivateKey, "OAuth private key file (multipart)");
            s.RequestParam(r => r.OauthPublicKey, "OAuth public key file (multipart)");
            s.RequestParam(r => r.OauthClientId, "OAuth client id");
            s.RequestParam(r => r.OauthSecretKey, "OAuth secret key");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateNetworkRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

