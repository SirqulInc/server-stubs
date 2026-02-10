
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateTaskRequest
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
    /// The name of the task
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// The application to target
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Client defined identifier for grouping tasks
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
    /// The date and time of the task
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scheduledDate")]
    public long? ScheduledDate { get; set; }
    /// <summary>
    /// The starting date of the task
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// The ending date of the task
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// The cron expression that represents the task&#39;s schedule
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cronExpression")]
    public string? CronExpression { get; set; }
    /// <summary>
    /// The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string? Visibility { get; set; }
    /// <summary>
    /// Sets whether the Task is active or not (inactive Tasks are not processed)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
}
public class DeleteTaskRequest
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
    /// The id of the Task to delete.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("taskId")]
    public long TaskId { get; set; }
}
public class GetTaskRequest
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
    /// The id of the Task to return.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("taskId")]
    public long TaskId { get; set; }
}
public class SearchTasksRequest
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
    /// A comma separated list of filters:  * MINE - Return tasks that the user has created * SHARED - Return tasks that have been shared to the user * FOLLOWER - Return tasks that have been created by the user&#39;&#39;s followers (the content needs to have been APPROVED or FEATURED) * FOLLOWING - Return tasks that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED) * PUBLIC - Return all PUBLIC tasks that have been APPROVED or FEATURED * ALL_PUBLIC - Return all PUBLIC tasks regardless of whether they are approved or not (ignores the approval status) * LIKED - Return all tasks that the user has liked * FEATURED - Return all tasks that have been featured * PENDING - Return all pending tasks 
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
    /// Keyword search on the task names.
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
public class UpdateTaskRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Task Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("taskId")]
    public long TaskId { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The name of the task
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// The application to target
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Client defined identifier for grouping tasks
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
    /// The date and time of the task
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scheduledDate")]
    public long? ScheduledDate { get; set; }
    /// <summary>
    /// The starting date of the task
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// The ending date of the task
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// The cron expression that represents the task&#39;s schedule
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cronExpression")]
    public string? CronExpression { get; set; }
    /// <summary>
    /// The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string? Visibility { get; set; }
    /// <summary>
    /// Sets whether the Task is active or not (inactive Tasks are not processed)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
}


