using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Trigger
/// </summary>

public class CreateTriggerEndpoint : FastEndpoints.Endpoint<CreateTriggerRequest, TriggerResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/trigger/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Trigger");
        });

        Summary(s => {
            s.Summary = "Create Trigger";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user");
            s.RequestParam(r => r.Name, "The name of the trigger");
            s.RequestParam(r => r.AppKey, "The application to target");
            s.RequestParam(r => r.GroupingId, "Client defined identifier for grouping triggers");
            s.RequestParam(r => r.EndpointURL, "The URL for making an HTTP call");
            s.RequestParam(r => r.Payload, "The parameters for making an HTTP call");
            s.RequestParam(r => r.ScheduledDate, "The date and time of the next trigger");
            s.RequestParam(r => r.StartDate, "The starting date of the trigger");
            s.RequestParam(r => r.EndDate, "The ending date of the trigger");
            s.RequestParam(r => r.CronExpression, "The cron expression that represents the trigger&#39;s schedule");
            s.RequestParam(r => r.ConditionalInput, "Json input representing conditional logic that has to be met before running the trigger");
            s.RequestParam(r => r.Visibility, "The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)");
            s.RequestParam(r => r.Active, "Sets whether the Trigger is active or not (inactive Triggers are not processed)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateTriggerRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Trigger
/// </summary>

public class DeleteTriggerEndpoint : FastEndpoints.Endpoint<DeleteTriggerRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/trigger/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Trigger");
        });

        Summary(s => {
            s.Summary = "Delete Trigger";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.TriggerId, "The id of the trigger to delete.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteTriggerRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Trigger
/// </summary>

public class GetTriggerEndpoint : FastEndpoints.Endpoint<GetTriggerRequest, TriggerResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/trigger/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Trigger");
        });

        Summary(s => {
            s.Summary = "Get Trigger";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.TriggerId, "The id of the Trigger to return.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetTriggerRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Triggers
/// </summary>

public class SearchTriggersEndpoint : FastEndpoints.Endpoint<SearchTriggersRequest, List<TriggerResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/trigger/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Trigger");
        });

        Summary(s => {
            s.Summary = "Search Triggers";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.GroupingId, "Filter results by a grouping identifier defined by the client");
            s.RequestParam(r => r.Filter, "A comma separated list of filters. * MINE - Return triggers that the user has created * SHARED - Return triggers that have been shared to the user * FOLLOWER - Return triggers that have been created by the user&#39;&#39;s followers (the content needs to have been APPROVED or FEATURED) * FOLLOWING - Return triggers that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED) * PUBLIC - Return all PUBLIC triggers that have been APPROVED or FEATURED * ALL_PUBLIC - Return all PUBLIC triggers regardless of whether they are approved or not (ignores the approval status) * LIKED - Return all triggers that the user has liked * FEATURED - Return all triggers that have been featured * PENDING - Return all pending triggers ");
            s.RequestParam(r => r.Statuses, "Filter results by status (comma separated list). Values include: NEW, ERROR, COMPLETE, PROCESSING, TEMPLATE");
            s.RequestParam(r => r.TemplateTypes, "Template Types");
            s.RequestParam(r => r.AppKey, "Filter the list by a specific application");
            s.RequestParam(r => r.Keyword, "Keyword search on the trigger names.");
            s.RequestParam(r => r.SortField, "The field to sort by. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, SCHEDULED_DATE, START_DATE, END_DATE");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "Start the result set at some index.");
            s.RequestParam(r => r.Limit, "Limit the result to some number.");
            s.RequestParam(r => r.ActiveOnly, "Determines whether to return only active results");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchTriggersRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Trigger
/// </summary>

public class UpdateTriggerEndpoint : FastEndpoints.Endpoint<UpdateTriggerRequest, TriggerResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/trigger/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Trigger");
        });

        Summary(s => {
            s.Summary = "Update Trigger";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.TriggerId, "The trigger to update");
            s.RequestParam(r => r.AccountId, "The logged in user");
            s.RequestParam(r => r.Name, "The name of the trigger");
            s.RequestParam(r => r.AppKey, "The application to target");
            s.RequestParam(r => r.GroupingId, "Client defined identifier for grouping triggers");
            s.RequestParam(r => r.EndpointURL, "The URL for making an HTTP call");
            s.RequestParam(r => r.Payload, "The parameters for making an HTTP call");
            s.RequestParam(r => r.ScheduledDate, "The date and time of the next trigger");
            s.RequestParam(r => r.StartDate, "The starting date of the trigger");
            s.RequestParam(r => r.EndDate, "The ending date of the trigger");
            s.RequestParam(r => r.CronExpression, "The cron expression that represents the trigger&#39;s schedule");
            s.RequestParam(r => r.ConditionalInput, "Json input representing conditional logic that has to be met before running the trigger");
            s.RequestParam(r => r.Visibility, "The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)");
            s.RequestParam(r => r.Active, "Sets whether the Trigger is active or not (inactive Triggers are not processed)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateTriggerRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

