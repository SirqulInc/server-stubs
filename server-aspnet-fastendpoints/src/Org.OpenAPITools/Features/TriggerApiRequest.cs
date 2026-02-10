
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateTriggerRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The name of the trigger
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// The application to target
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Client defined identifier for grouping triggers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupingId")]
    public string? GroupingId { get; set; }
    /// <summary>
    /// The URL for making an HTTP call
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endpointURL")]
    public string? EndpointURL { get; set; }
    /// <summary>
    /// The parameters for making an HTTP call
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("payload")]
    public string? Payload { get; set; }
    /// <summary>
    /// The date and time of the next trigger
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scheduledDate")]
    public long? ScheduledDate { get; set; }
    /// <summary>
    /// The starting date of the trigger
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// The ending date of the trigger
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// The cron expression that represents the trigger&#39;s schedule
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cronExpression")]
    public string? CronExpression { get; set; }
    /// <summary>
    /// Json input representing conditional logic that has to be met before running the trigger
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("conditionalInput")]
    public string? ConditionalInput { get; set; }
    /// <summary>
    /// The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string? Visibility { get; set; }
    /// <summary>
    /// Sets whether the Trigger is active or not (inactive Triggers are not processed)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
}
public class DeleteTriggerRequest
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
    /// The id of the trigger to delete.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("triggerId")]
    public long TriggerId { get; set; }
}
public class GetTriggerRequest
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
    /// The id of the Trigger to return.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("triggerId")]
    public long TriggerId { get; set; }
}
public class SearchTriggersRequest
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
    /// Filter results by a grouping identifier defined by the client
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupingId")]
    public string? GroupingId { get; set; }
    /// <summary>
    /// A comma separated list of filters. * MINE - Return triggers that the user has created * SHARED - Return triggers that have been shared to the user * FOLLOWER - Return triggers that have been created by the user&#39;&#39;s followers (the content needs to have been APPROVED or FEATURED) * FOLLOWING - Return triggers that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED) * PUBLIC - Return all PUBLIC triggers that have been APPROVED or FEATURED * ALL_PUBLIC - Return all PUBLIC triggers regardless of whether they are approved or not (ignores the approval status) * LIKED - Return all triggers that the user has liked * FEATURED - Return all triggers that have been featured * PENDING - Return all pending triggers 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filter")]
    public string? Filter { get; set; }
    /// <summary>
    /// Filter results by status (comma separated list). Values include: NEW, ERROR, COMPLETE, PROCESSING, TEMPLATE
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("statuses")]
    public string? Statuses { get; set; }
    /// <summary>
    /// Template Types
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("templateTypes")]
    public string? TemplateTypes { get; set; }
    /// <summary>
    /// Filter the list by a specific application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Keyword search on the trigger names.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// The field to sort by. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, SCHEDULED_DATE, START_DATE, END_DATE
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// Start the result set at some index.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// Limit the result to some number.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// Determines whether to return only active results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool? ActiveOnly { get; set; }
}
public class UpdateTriggerRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The trigger to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("triggerId")]
    public long TriggerId { get; set; }
    /// <summary>
    /// The logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The name of the trigger
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// The application to target
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Client defined identifier for grouping triggers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupingId")]
    public string? GroupingId { get; set; }
    /// <summary>
    /// The URL for making an HTTP call
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endpointURL")]
    public string? EndpointURL { get; set; }
    /// <summary>
    /// The parameters for making an HTTP call
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("payload")]
    public string? Payload { get; set; }
    /// <summary>
    /// The date and time of the next trigger
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scheduledDate")]
    public long? ScheduledDate { get; set; }
    /// <summary>
    /// The starting date of the trigger
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// The ending date of the trigger
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// The cron expression that represents the trigger&#39;s schedule
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cronExpression")]
    public string? CronExpression { get; set; }
    /// <summary>
    /// Json input representing conditional logic that has to be met before running the trigger
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("conditionalInput")]
    public string? ConditionalInput { get; set; }
    /// <summary>
    /// The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string? Visibility { get; set; }
    /// <summary>
    /// Sets whether the Trigger is active or not (inactive Triggers are not processed)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
}


