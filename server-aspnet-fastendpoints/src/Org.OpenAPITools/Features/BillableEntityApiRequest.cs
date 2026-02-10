
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateBillableEntityRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique device identifier that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The unique accountId that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The name of the entity responsible for billing 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// The street address of the billable entity
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streetAddress")]
    public string? StreetAddress { get; set; }
    /// <summary>
    /// Additional address information (such as a suite number, floor number, building name, or PO Box) 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streetAddress2")]
    public string? StreetAddress2 { get; set; }
    /// <summary>
    /// The city of the billable entity
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("city")]
    public string? City { get; set; }
    /// <summary>
    /// The state of the billable entity
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("state")]
    public string? State { get; set; }
    /// <summary>
    /// The postal code of the billable entity
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("postalCode")]
    public string? PostalCode { get; set; }
    /// <summary>
    /// The business phone of the billable entity
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("businessPhone")]
    public string? BusinessPhone { get; set; }
    /// <summary>
    /// The business phone extension
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("businessPhoneExt")]
    public string? BusinessPhoneExt { get; set; }
    /// <summary>
    /// Authorize Net Api Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("authorizeNetApiKey")]
    public string? AuthorizeNetApiKey { get; set; }
    /// <summary>
    /// Authorize Net Transaction Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("authorizeNetTransactionKey")]
    public string? AuthorizeNetTransactionKey { get; set; }
}
public class DeleteBillableEntityRequest
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
    /// The account used to perform the delete, must have rights to edit the billable entity.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
}
public class GetBillableEntityRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique device identifier that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The unique accountId that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// Determines whether to include the retailer dash board counts into the response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeCounts")]
    public bool? IncludeCounts { get; set; }
    /// <summary>
    /// Whether to enable payments or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includePayments")]
    public bool? IncludePayments { get; set; }
}
public class UpdateBillableEntityRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique device identifier that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The unique accountId that made the request (either deviceId or accountId must be used). The account must have rights to edit the billable entity.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The name of the entity responsible for billing 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// The street address of the billable entity
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streetAddress")]
    public string? StreetAddress { get; set; }
    /// <summary>
    /// Additional address information (such as a suite number, floor number, building name, or PO Box) 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streetAddress2")]
    public string? StreetAddress2 { get; set; }
    /// <summary>
    /// The city of the billable entity
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("city")]
    public string? City { get; set; }
    /// <summary>
    /// The state of the billable entity
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("state")]
    public string? State { get; set; }
    /// <summary>
    /// The postal code of the billable entity
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("postalCode")]
    public string? PostalCode { get; set; }
    /// <summary>
    /// The business phone of the billable entity
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("businessPhone")]
    public string? BusinessPhone { get; set; }
    /// <summary>
    /// The business phone extension of the billable entity
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("businessPhoneExt")]
    public string? BusinessPhoneExt { get; set; }
    /// <summary>
    /// Authorize Net Api Key of the billable entity
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("authorizeNetApiKey")]
    public string? AuthorizeNetApiKey { get; set; }
    /// <summary>
    /// Authorize Net Transaction Key of the billable entity
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("authorizeNetTransactionKey")]
    public string? AuthorizeNetTransactionKey { get; set; }
}


