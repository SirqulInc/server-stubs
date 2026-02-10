
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateSecureApplicationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique id of the user making the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The application to secure
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyCert")]
    public System.IO.Stream KeyCert { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("trustStore")]
    public System.IO.Stream TrustStore { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("username")]
    public string Username { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("password")]
    public string Password { get; set; }
    /// <summary>
    /// The type of biometric, options are: - FINGERPRINT - IRIS - FACIAL
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("biometricType")]
    public string? BiometricType { get; set; }
    /// <summary>
    /// The position for the biometric file uploaded
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("biometricPosition")]
    public string? BiometricPosition { get; set; }
    /// <summary>
    /// The position for each the biometric2 file uploaded
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("biometricPosition2")]
    public string? BiometricPosition2 { get; set; }
}
public class DeleteSecureApplicationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique id of the user making the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The application to secure
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
}
public class LoginSecureRequest
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
    /// The application making the request, defines what type and position is required to make a secure login the request.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The data file used to perform authentication
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("biometricFile")]
    public System.IO.Stream BiometricFile { get; set; }
    /// <summary>
    /// The data file used to perform authentication
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("biometricFile2")]
    public System.IO.Stream? BiometricFile2 { get; set; }
    /// <summary>
    /// Checks user&#39;s birthday to see if they meet an age requirement. If the user is under age, an error message is returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ageRestriction")]
    public int? AgeRestriction { get; set; }
    /// <summary>
    /// Determines whether to return a ProfileResponse on success, or a PaymentTypesResponse
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnProfile")]
    public bool? ReturnProfile { get; set; }
    /// <summary>
    /// If returnProfile is set to true, this determines how much of the profile should be returned, see ProfileFilters
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
}
public class PurchaseSecureRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The payment request object
    /// </summary>
    [FastEndpoints.FromBody]
    public PaymentRequest body { get; set; }
}
public class ResetSecureRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique id of the user making the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The application to secure
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
}
public class UpdateSecureApplicationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique id of the user making the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The application to secure
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyCert")]
    public System.IO.Stream? KeyCert { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("trustStore")]
    public System.IO.Stream? TrustStore { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("username")]
    public string? Username { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("password")]
    public string? Password { get; set; }
    /// <summary>
    /// The type of biometric, options are: - FINGERPRINT - IRIS - FACIAL
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("biometricType")]
    public string? BiometricType { get; set; }
    /// <summary>
    /// The position for the biometric file uploaded
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("biometricPosition")]
    public string? BiometricPosition { get; set; }
    /// <summary>
    /// The position for each the biometric2 file uploaded
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("biometricPosition2")]
    public string? BiometricPosition2 { get; set; }
}


