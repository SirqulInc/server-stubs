using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Task
/// </summary>

public class CreateTaskEndpoint : FastEndpoints.Endpoint<CreateTaskRequest, TaskResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/task/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Task");
        });

        Summary(s => {
            s.Summary = "Create Task";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.Name, "The name of the task");
            s.RequestParam(r => r.AppKey, "The application to target");
            s.RequestParam(r => r.GroupingId, "Client defined identifier for grouping tasks");
            s.RequestParam(r => r.EndpointURL, "The URL for making an HTTP call");
            s.RequestParam(r => r.Payload, "The parameters for making an HTTP call");
            s.RequestParam(r => r.ScheduledDate, "The date and time of the task");
            s.RequestParam(r => r.StartDate, "The starting date of the task");
            s.RequestParam(r => r.EndDate, "The ending date of the task");
            s.RequestParam(r => r.CronExpression, "The cron expression that represents the task&#39;s schedule");
            s.RequestParam(r => r.Visibility, "The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)");
            s.RequestParam(r => r.Active, "Sets whether the Task is active or not (inactive Tasks are not processed)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateTaskRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Task
/// </summary>

public class DeleteTaskEndpoint : FastEndpoints.Endpoint<DeleteTaskRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/task/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Task");
        });

        Summary(s => {
            s.Summary = "Delete Task";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.TaskId, "The id of the Task to delete.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteTaskRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Task
/// </summary>

public class GetTaskEndpoint : FastEndpoints.Endpoint<GetTaskRequest, TaskResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/task/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Task");
        });

        Summary(s => {
            s.Summary = "Get Task";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.TaskId, "The id of the Task to return.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetTaskRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Tasks
/// </summary>

public class SearchTasksEndpoint : FastEndpoints.Endpoint<SearchTasksRequest, List<TaskResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/task/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Task");
        });

        Summary(s => {
            s.Summary = "Search Tasks";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.GroupingId, "Filter results by a grouping identifier defined by the client");
            s.RequestParam(r => r.Filter, "A comma separated list of filters:  * MINE - Return tasks that the user has created * SHARED - Return tasks that have been shared to the user * FOLLOWER - Return tasks that have been created by the user&#39;&#39;s followers (the content needs to have been APPROVED or FEATURED) * FOLLOWING - Return tasks that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED) * PUBLIC - Return all PUBLIC tasks that have been APPROVED or FEATURED * ALL_PUBLIC - Return all PUBLIC tasks regardless of whether they are approved or not (ignores the approval status) * LIKED - Return all tasks that the user has liked * FEATURED - Return all tasks that have been featured * PENDING - Return all pending tasks ");
            s.RequestParam(r => r.Statuses, "Filter results by status (comma separated list). Values include: NEW, ERROR, COMPLETE, PROCESSING, TEMPLATE");
            s.RequestParam(r => r.TemplateTypes, "Template Types");
            s.RequestParam(r => r.AppKey, "Filter the list by a specific application");
            s.RequestParam(r => r.Keyword, "Keyword search on the task names.");
            s.RequestParam(r => r.SortField, "The field to sort by. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, SCHEDULED_DATE, START_DATE, END_DATE");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "Start the result set at some index.");
            s.RequestParam(r => r.Limit, "Limit the result to some number.");
            s.RequestParam(r => r.ActiveOnly, "Determines whether to return only active results");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchTasksRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Task
/// </summary>

public class UpdateTaskEndpoint : FastEndpoints.Endpoint<UpdateTaskRequest, TaskResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/task/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Task");
        });

        Summary(s => {
            s.Summary = "Update Task";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.TaskId, "Task Id");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.Name, "The name of the task");
            s.RequestParam(r => r.AppKey, "The application to target");
            s.RequestParam(r => r.GroupingId, "Client defined identifier for grouping tasks");
            s.RequestParam(r => r.EndpointURL, "The URL for making an HTTP call");
            s.RequestParam(r => r.Payload, "The parameters for making an HTTP call");
            s.RequestParam(r => r.ScheduledDate, "The date and time of the task");
            s.RequestParam(r => r.StartDate, "The starting date of the task");
            s.RequestParam(r => r.EndDate, "The ending date of the task");
            s.RequestParam(r => r.CronExpression, "The cron expression that represents the task&#39;s schedule");
            s.RequestParam(r => r.Visibility, "The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)");
            s.RequestParam(r => r.Active, "Sets whether the Task is active or not (inactive Tasks are not processed)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateTaskRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

