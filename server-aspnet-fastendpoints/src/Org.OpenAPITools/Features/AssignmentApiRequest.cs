
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AssigmentAssigneeAccountSearchRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id sending the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The keyword to filter the returned results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
}
public class AssignmentCreateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the user account id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the name for the assignment
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// the desciprtion for the assignment
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// the account id to assign to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assigneeAccountId")]
    public long AssigneeAccountId { get; set; }
    /// <summary>
    /// the retailer location id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long? RetailerLocationId { get; set; }
    /// <summary>
    /// the tags
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// determines whether the assignment is active or inactive
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
}
public class AssignmentDeleteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the user account id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the assignment id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assignmentId")]
    public long AssignmentId { get; set; }
}
public class AssignmentGetRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the user account id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the assignment id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assignmentId")]
    public long AssignmentId { get; set; }
}
public class AssignmentSearchRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account sending the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the creator of the assignment
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("creatorAccountId")]
    public long? CreatorAccountId { get; set; }
    /// <summary>
    /// filter results by assignee accounts. If not provided, all assignments that are assigned to accounts that are managed by the requested account will be returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assigneeAccountIds")]
    public string? AssigneeAccountIds { get; set; }
    /// <summary>
    /// filter results by retailer locations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationIds")]
    public string? RetailerLocationIds { get; set; }
    /// <summary>
    /// filter results by assignment status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("currentStatusType")]
    public string? CurrentStatusType { get; set; }
    /// <summary>
    /// filter results by keyword search that matches the assignee, creator, or retailer location name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// sort by table field
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// return results in descending order or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// return active results only or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool ActiveOnly { get; set; }
    /// <summary>
    /// The record to begin the return set on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// The number of records to return
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
}
public class AssignmentStatusCreateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the user account id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the assignment id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assignmentId")]
    public long AssignmentId { get; set; }
    /// <summary>
    /// the scheduled notification id for reminders
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scheduledNotificationId")]
    public long? ScheduledNotificationId { get; set; }
    /// <summary>
    /// the type of to do. Possible values include: SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("toDo")]
    public string? ToDo { get; set; }
    /// <summary>
    /// the connection type. Possible values include: INITIAL, FOLLOW_UP, DECLINED
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connection")]
    public string? Connection { get; set; }
    /// <summary>
    /// the communication method type. Possible values include: PHONE, SITE_VISIT, EMAIL
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("method")]
    public string? Method { get; set; }
    /// <summary>
    /// the status type. Possible values include: ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("status")]
    public string? Status { get; set; }
    /// <summary>
    /// the closure type. Possible values include: PHONE, SITE_VISIT, PHONE_SITE, WEB
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("closure")]
    public string? Closure { get; set; }
    /// <summary>
    /// the message from the assignee
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("message")]
    public string? Message { get; set; }
    /// <summary>
    /// the date to follow up by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("followUp")]
    public long? FollowUp { get; set; }
    /// <summary>
    /// determines whether the assignment status is active or inactive
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
}
public class AssignmentStatusDeleteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the user account id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the assignment status id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assignmentStatusId")]
    public long AssignmentStatusId { get; set; }
}
public class AssignmentStatusGetRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the user account id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the assignment status id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assignmentStatusId")]
    public long AssignmentStatusId { get; set; }
}
public class AssignmentStatusSearchRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the user account id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the assignment id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assignmentId")]
    public long? AssignmentId { get; set; }
    /// <summary>
    /// filter results by the account who created the status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("creatorAccountId")]
    public long? CreatorAccountId { get; set; }
    /// <summary>
    /// filter results by the assignee account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assigneeAccountId")]
    public long? AssigneeAccountId { get; set; }
    /// <summary>
    /// filter results by by retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long? RetailerLocationId { get; set; }
    /// <summary>
    /// filter results by the status type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("statusType")]
    public string? StatusType { get; set; }
    /// <summary>
    /// filter results by keyword search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// the field to sort by. Possible values include: ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, CURRENT_STATUS, TODO, CONNECTION, METHOD, STATUS, CLOSURE, MESSAGE, FOLLOW_UP
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// determines whether to only return active results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool ActiveOnly { get; set; }
    /// <summary>
    /// the start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// the limit for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
}
public class AssignmentStatusUpdateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the user account id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the assignment status id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assignmentStatusId")]
    public long AssignmentStatusId { get; set; }
    /// <summary>
    /// the scheduled notification id for reminders
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scheduledNotificationId")]
    public long? ScheduledNotificationId { get; set; }
    /// <summary>
    /// the type of to do. Possible values include: SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("toDo")]
    public string? ToDo { get; set; }
    /// <summary>
    /// the connection type. Possible values include: INITIAL, FOLLOW_UP, DECLINED
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connection")]
    public string? Connection { get; set; }
    /// <summary>
    /// the communication method type. Possible values include: PHONE, SITE_VISIT, EMAIL
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("method")]
    public string? Method { get; set; }
    /// <summary>
    /// the status type. Possible values include: ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("status")]
    public string? Status { get; set; }
    /// <summary>
    /// the closure type. Possible values include: PHONE, SITE_VISIT, PHONE_SITE, WEB
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("closure")]
    public string? Closure { get; set; }
    /// <summary>
    /// the message from the assignee
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("message")]
    public string? Message { get; set; }
    /// <summary>
    /// the date to follow up by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("followUp")]
    public long? FollowUp { get; set; }
    /// <summary>
    /// determines whether the assignment status is active or inactive
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
}
public class AssignmentUpdateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the user account id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the assignment id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assignmentId")]
    public long AssignmentId { get; set; }
    /// <summary>
    /// the name of the assignment
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// the description of the assignment
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// the account id to assign to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assigneeAccountId")]
    public long? AssigneeAccountId { get; set; }
    /// <summary>
    /// the retailer location id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long? RetailerLocationId { get; set; }
    /// <summary>
    /// the tags
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// determines whether the assignment is active or inactive
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
}


