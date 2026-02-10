
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CheckDisbursementsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the ID of the disbursement being checked on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("disbursementId")]
    public long DisbursementId { get; set; }
}
public class CreateDisbursementRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the ID of the logging in user (must be an EXECUTIVE account)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the ID of the account receiving the disbursement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("receiverAccountId")]
    public long ReceiverAccountId { get; set; }
    /// <summary>
    /// the ID of the original sender account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("originalSenderAccountId")]
    public long OriginalSenderAccountId { get; set; }
    /// <summary>
    /// the dollar amount of the disbursement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("amount")]
    public decimal Amount { get; set; }
    /// <summary>
    /// the provider (e.g. Authorize.net, Bill.com, etc.)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("provider")]
    public string Provider { get; set; }
    /// <summary>
    /// the date that the disbursement is scheduled to go out to the payment provider
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scheduledDate")]
    public long? ScheduledDate { get; set; }
    /// <summary>
    /// a title given for the disbursement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// a comment that could be made for a disbursement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("comment")]
    public string? Comment { get; set; }
    /// <summary>
    /// external ID, which can be used as a way to reference the disbursement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalId")]
    public string? ExternalId { get; set; }
    /// <summary>
    /// This is for specifying parameters to make an http callback request for validating that the disbursement is valid
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("introspectionParams")]
    public string? IntrospectionParams { get; set; }
}
public class GetDisbursementRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the id of the disbursement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("disbursementId")]
    public long DisbursementId { get; set; }
}
public class SearchDisbursementsRequest
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
    /// filter results by the id of the account receiving the disbursement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("receiverAccountId")]
    public long? ReceiverAccountId { get; set; }
    /// <summary>
    /// comma separated list of status values to search for, possilbe values include: NEW, APPROVED, VALIDATING, ERROR, AUTHORIZED, CAPTURED, SETTLED
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("statuses")]
    public string? Statuses { get; set; }
    /// <summary>
    /// comma separated list of payment providers to search for, possbile values include: AUTHORIZE_NET, AMAZON_FPS, BILL_COM
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("providers")]
    public string? Providers { get; set; }
    /// <summary>
    /// the date for searching disbursements before it has been processed
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("beforeDate")]
    public long? BeforeDate { get; set; }
    /// <summary>
    /// the date for searching disbursements before it has been processed
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("afterDate")]
    public long? AfterDate { get; set; }
    /// <summary>
    /// the start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// the limit per result set for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// search on disbursements that are active only
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool? ActiveOnly { get; set; }
    /// <summary>
    /// search results by this external ID (that can be used to reference the disbursement)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalId")]
    public string? ExternalId { get; set; }
}
public class UpdateDisbursementRequest
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
    /// the id of the disbursement being updated
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("disbursementId")]
    public long DisbursementId { get; set; }
    /// <summary>
    /// the disbursement dollar amount being updated
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("amount")]
    public decimal? Amount { get; set; }
    /// <summary>
    /// the payments and/or billing provider (e.g. Authorize.net, Bill.com, etc.)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("provider")]
    public string? Provider { get; set; }
    /// <summary>
    /// the date that the disbursement is scheduled to go out to the payment provider
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scheduledDate")]
    public long? ScheduledDate { get; set; }
    /// <summary>
    /// the title given to the disbursement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// a comment that can be made on a disbursement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("comment")]
    public string? Comment { get; set; }
    /// <summary>
    /// an external ID that can be used to reference the disbursement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalId")]
    public string? ExternalId { get; set; }
    /// <summary>
    /// determines whether to try sending the disbursement again in the case of a previous failure
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retry")]
    public bool? Retry { get; set; }
    /// <summary>
    /// for specifying parameters to make an http callback request for validating that the disbursement is valid
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("introspectionParams")]
    public string? IntrospectionParams { get; set; }
}


