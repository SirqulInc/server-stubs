
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateCredentialRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the unique id of the account that needs authenticating (optional for PHONE_V2)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the unique id of the device making the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the session id for the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sessionId")]
    public string? SessionId { get; set; }
    /// <summary>
    /// the third party user account id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyId")]
    public string ThirdPartyId { get; set; }
    /// <summary>
    /// the third party user&#39;s display name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyName")]
    public string? ThirdPartyName { get; set; }
    /// <summary>
    /// the access token to authenticate with (ex: username or fb token or phone number)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyToken")]
    public string ThirdPartyToken { get; set; }
    /// <summary>
    /// the access provider to authenticate against
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("networkUID")]
    public string NetworkUID { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// optional email address associated with the third party account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("emailAddress")]
    public string? EmailAddress { get; set; }
    /// <summary>
    /// when true will error out if can&#39;t find any accounts matching (signin only)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("signinOnlyMode")]
    public bool? SigninOnlyMode { get; set; }
    /// <summary>
    /// this determines how much of the profile should be returned, see ProfileFilters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseFilters")]
    public string? ResponseFilters { get; set; }
    /// <summary>
    /// the latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// External custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// optional refresh token for the third party
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyRefreshToken")]
    public string? ThirdPartyRefreshToken { get; set; }
    /// <summary>
    /// audience ids to add to the account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIdsToAdd")]
    public string? AudienceIdsToAdd { get; set; }
    /// <summary>
    /// audience ids to remove from the account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIdsToRemove")]
    public string? AudienceIdsToRemove { get; set; }
}
public class CreateNetworkRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id making the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The name of the network
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// The description of the network
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// Whether the network uses introspection calls
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("enableIntrospection")]
    public bool EnableIntrospection { get; set; }
    /// <summary>
    /// HTTP method to use for introspection calls (e.g., GET, POST)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("introspectionMethod")]
    public string? IntrospectionMethod { get; set; }
    /// <summary>
    /// The HTTP URL of the introspection call
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("introspectionURL")]
    public string? IntrospectionURL { get; set; }
    /// <summary>
    /// The parameters of the introspection call
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("introspectionParams")]
    public string? IntrospectionParams { get; set; }
    /// <summary>
    /// Required response params
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("requiredRootField")]
    public string? RequiredRootField { get; set; }
    /// <summary>
    /// Whether this network uses MFA
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("enableMFA")]
    public bool? EnableMFA { get; set; }
    /// <summary>
    /// Size of the MFA token
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sizeMFA")]
    public int? SizeMFA { get; set; }
    /// <summary>
    /// Shelf life (seconds) of the MFA token
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("shelfLifeMFA")]
    public int? ShelfLifeMFA { get; set; }
    /// <summary>
    /// OAuth token endpoint URL
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("oauthTokenURL")]
    public string? OauthTokenURL { get; set; }
    /// <summary>
    /// OAuth private key file (multipart)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("oauthPrivateKey")]
    public System.IO.Stream? OauthPrivateKey { get; set; }
    /// <summary>
    /// OAuth public key file (multipart)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("oauthPublicKey")]
    public System.IO.Stream? OauthPublicKey { get; set; }
    /// <summary>
    /// OAuth client id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("oauthClientId")]
    public string? OauthClientId { get; set; }
    /// <summary>
    /// OAuth secret key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("oauthSecretKey")]
    public string? OauthSecretKey { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public string? body { get; set; }
}
public class DeleteCredentialRequest
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
    /// <summary>
    /// The third party network identifier
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("networkUID")]
    public string NetworkUID { get; set; }
    /// <summary>
    /// The third party user id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyId")]
    public string ThirdPartyId { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
}
public class DeleteNetworkRequest
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
    /// The unique identifier for the third party network defined by Sirqul
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("networkUID")]
    public string NetworkUID { get; set; }
}
public class GetCredentialRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the unique account id of a specific account that will be bound to the third-party credentials
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the unique id of the device making the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the session id for the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sessionId")]
    public string? SessionId { get; set; }
    /// <summary>
    /// the third-party credentials id from the response of the credential/create step
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyCredentialId")]
    public long? ThirdPartyCredentialId { get; set; }
    /// <summary>
    /// the access token to authenticate with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyToken")]
    public string? ThirdPartyToken { get; set; }
    /// <summary>
    /// the secret code to authenticate with (used for MFA)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartySecret")]
    public string? ThirdPartySecret { get; set; }
    /// <summary>
    /// flag to force creation of a new account when no accountId is passed and user chooses not to use listed accounts
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("createNewAccount")]
    public bool? CreateNewAccount { get; set; }
    /// <summary>
    /// the access provider to authenticate against
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("networkUID")]
    public string NetworkUID { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// this determines how much of the profile should be returned, see ProfileFilters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseFilters")]
    public string? ResponseFilters { get; set; }
    /// <summary>
    /// the latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// audience ids to add to the account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIdsToAdd")]
    public string? AudienceIdsToAdd { get; set; }
    /// <summary>
    /// audience ids to remove from the account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIdsToRemove")]
    public string? AudienceIdsToRemove { get; set; }
    /// <summary>
    /// account id of the referrer (inviter-invitee relationship)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("referralAccountId")]
    public long? ReferralAccountId { get; set; }
}
public class GetNetworkRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id making the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The unique identifier for the third party network defined by Sirqul
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("networkUID")]
    public string NetworkUID { get; set; }
}
public class SearchCredentialsRequest
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
    /// <summary>
    /// The keyword used to search on the third party name and network string
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// The network UID to filter results with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("networkUID")]
    public string? NetworkUID { get; set; }
    /// <summary>
    /// The order to return the search results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// The start of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// The limit of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class SearchNetworksRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id making the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The keyword used to search on the network name and description fields
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// The column to sort the search on, possible values include: UPDATED (default), CREATED, NAME
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// The order to return the search results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// The start of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// The limit of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// Return only active results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool ActiveOnly { get; set; }
    /// <summary>
    /// Determines whether to only return applications that the user has access to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterBillable")]
    public bool? FilterBillable { get; set; }
}
public class SendMFAChallengeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the access token to authenticate with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyToken")]
    public string? ThirdPartyToken { get; set; }
    /// <summary>
    /// optional id of the existing third party credential
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyCredentialId")]
    public long? ThirdPartyCredentialId { get; set; }
    /// <summary>
    /// the third party network provider that has MFA enabled
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("networkUID")]
    public string NetworkUID { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// the unique id of the device making the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
}
public class UpdateCredentialRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the unique id of the device making the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the access provider to authenticate against
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("networkUID")]
    public string NetworkUID { get; set; }
    /// <summary>
    /// the third party user account id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyId")]
    public string ThirdPartyId { get; set; }
    /// <summary>
    /// the third party user name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyName")]
    public string? ThirdPartyName { get; set; }
    /// <summary>
    /// the access token to authenticate with (ex: username or fb token)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyToken")]
    public string? ThirdPartyToken { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// this determines how much of the profile should be returned, see ProfileFilters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseFilters")]
    public string? ResponseFilters { get; set; }
    /// <summary>
    /// External custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// optional refresh token for the third party
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyRefreshToken")]
    public string? ThirdPartyRefreshToken { get; set; }
}
public class UpdateNetworkRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id making the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The unique identifier for the third party network defined by Sirqul
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("networkUID")]
    public string NetworkUID { get; set; }
    /// <summary>
    /// The name of the network
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// The description of the network
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// Whether the network uses introspection calls
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("enableIntrospection")]
    public bool? EnableIntrospection { get; set; }
    /// <summary>
    /// HTTP method to use for introspection calls (e.g., GET, POST)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("introspectionMethod")]
    public string? IntrospectionMethod { get; set; }
    /// <summary>
    /// The HTTP URL of the introspection call
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("introspectionURL")]
    public string? IntrospectionURL { get; set; }
    /// <summary>
    /// The parameters of the introspection call
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("introspectionParams")]
    public string? IntrospectionParams { get; set; }
    /// <summary>
    /// Required response params
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("requiredRootField")]
    public string? RequiredRootField { get; set; }
    /// <summary>
    /// Whether this network uses MFA
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("enableMFA")]
    public bool? EnableMFA { get; set; }
    /// <summary>
    /// Size of the MFA token
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sizeMFA")]
    public int? SizeMFA { get; set; }
    /// <summary>
    /// Shelf life (seconds) of the MFA token
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("shelfLifeMFA")]
    public int? ShelfLifeMFA { get; set; }
    /// <summary>
    /// OAuth token endpoint URL
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("oauthTokenURL")]
    public string? OauthTokenURL { get; set; }
    /// <summary>
    /// OAuth private key file (multipart)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("oauthPrivateKey")]
    public System.IO.Stream? OauthPrivateKey { get; set; }
    /// <summary>
    /// OAuth public key file (multipart)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("oauthPublicKey")]
    public System.IO.Stream? OauthPublicKey { get; set; }
    /// <summary>
    /// OAuth client id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("oauthClientId")]
    public string? OauthClientId { get; set; }
    /// <summary>
    /// OAuth secret key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("oauthSecretKey")]
    public string? OauthSecretKey { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public string? body { get; set; }
}


