using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Search Assignment Assignees
/// </summary>

public class AssigmentAssigneeAccountSearchEndpoint : FastEndpoints.Endpoint<AssigmentAssigneeAccountSearchRequest, List<AccountMiniResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/assignment/assignee/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assignment");
        });

        Summary(s => {
            s.Summary = "Search Assignment Assignees";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id sending the request");
            s.RequestParam(r => r.Keyword, "The keyword to filter the returned results");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AssigmentAssigneeAccountSearchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Assignment
/// </summary>

public class AssignmentCreateEndpoint : FastEndpoints.Endpoint<AssignmentCreateRequest, AssignmentResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/assignment/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assignment");
        });

        Summary(s => {
            s.Summary = "Create Assignment";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the user account id");
            s.RequestParam(r => r.Name, "the name for the assignment");
            s.RequestParam(r => r.AssigneeAccountId, "the account id to assign to");
            s.RequestParam(r => r.Description, "the desciprtion for the assignment");
            s.RequestParam(r => r.RetailerLocationId, "the retailer location id");
            s.RequestParam(r => r.Tags, "the tags");
            s.RequestParam(r => r.Active, "determines whether the assignment is active or inactive");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AssignmentCreateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Assignment
/// </summary>

public class AssignmentDeleteEndpoint : FastEndpoints.Endpoint<AssignmentDeleteRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/assignment/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assignment");
        });

        Summary(s => {
            s.Summary = "Delete Assignment";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the user account id");
            s.RequestParam(r => r.AssignmentId, "the assignment id");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AssignmentDeleteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Assignment
/// </summary>

public class AssignmentGetEndpoint : FastEndpoints.Endpoint<AssignmentGetRequest, AssignmentResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/assignment/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assignment");
        });

        Summary(s => {
            s.Summary = "Get Assignment";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the user account id");
            s.RequestParam(r => r.AssignmentId, "the assignment id");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AssignmentGetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Assignments
/// </summary>

public class AssignmentSearchEndpoint : FastEndpoints.Endpoint<AssignmentSearchRequest, List<AssignmentResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/assignment/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assignment");
        });

        Summary(s => {
            s.Summary = "Search Assignments";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account sending the request");
            s.RequestParam(r => r.SortField, "sort by table field");
            s.RequestParam(r => r.Descending, "return results in descending order or not");
            s.RequestParam(r => r.ActiveOnly, "return active results only or not");
            s.RequestParam(r => r.Start, "The record to begin the return set on");
            s.RequestParam(r => r.Limit, "The number of records to return");
            s.RequestParam(r => r.CreatorAccountId, "the creator of the assignment");
            s.RequestParam(r => r.AssigneeAccountIds, "filter results by assignee accounts. If not provided, all assignments that are assigned to accounts that are managed by the requested account will be returned.");
            s.RequestParam(r => r.RetailerLocationIds, "filter results by retailer locations");
            s.RequestParam(r => r.CurrentStatusType, "filter results by assignment status");
            s.RequestParam(r => r.Keyword, "filter results by keyword search that matches the assignee, creator, or retailer location name");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AssignmentSearchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Assignment Status
/// </summary>

public class AssignmentStatusCreateEndpoint : FastEndpoints.Endpoint<AssignmentStatusCreateRequest, AssignmentStatusResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/assignment/status/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assignment");
        });

        Summary(s => {
            s.Summary = "Create Assignment Status";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the user account id");
            s.RequestParam(r => r.AssignmentId, "the assignment id");
            s.RequestParam(r => r.ScheduledNotificationId, "the scheduled notification id for reminders");
            s.RequestParam(r => r.ToDo, "the type of to do. Possible values include: SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT");
            s.RequestParam(r => r.Connection, "the connection type. Possible values include: INITIAL, FOLLOW_UP, DECLINED");
            s.RequestParam(r => r.Method, "the communication method type. Possible values include: PHONE, SITE_VISIT, EMAIL");
            s.RequestParam(r => r.Status, "the status type. Possible values include: ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED");
            s.RequestParam(r => r.Closure, "the closure type. Possible values include: PHONE, SITE_VISIT, PHONE_SITE, WEB");
            s.RequestParam(r => r.Message, "the message from the assignee");
            s.RequestParam(r => r.FollowUp, "the date to follow up by");
            s.RequestParam(r => r.Active, "determines whether the assignment status is active or inactive");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AssignmentStatusCreateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Deletes Assignment Status
/// </summary>

public class AssignmentStatusDeleteEndpoint : FastEndpoints.Endpoint<AssignmentStatusDeleteRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/assignment/status/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assignment");
        });

        Summary(s => {
            s.Summary = "Deletes Assignment Status";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the user account id");
            s.RequestParam(r => r.AssignmentStatusId, "the assignment status id");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AssignmentStatusDeleteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Assignment Status
/// </summary>

public class AssignmentStatusGetEndpoint : FastEndpoints.Endpoint<AssignmentStatusGetRequest, AssignmentStatusResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/assignment/status/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assignment");
        });

        Summary(s => {
            s.Summary = "Get Assignment Status";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the user account id");
            s.RequestParam(r => r.AssignmentStatusId, "the assignment status id");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AssignmentStatusGetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Assignment Statuses
/// </summary>

public class AssignmentStatusSearchEndpoint : FastEndpoints.Endpoint<AssignmentStatusSearchRequest, List<AssignmentStatusResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/assignment/status/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assignment");
        });

        Summary(s => {
            s.Summary = "Search Assignment Statuses";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the user account id");
            s.RequestParam(r => r.SortField, "the field to sort by. Possible values include: ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, CURRENT_STATUS, TODO, CONNECTION, METHOD, STATUS, CLOSURE, MESSAGE, FOLLOW_UP");
            s.RequestParam(r => r.Descending, "determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.ActiveOnly, "determines whether to only return active results");
            s.RequestParam(r => r.Start, "the start index for pagination");
            s.RequestParam(r => r.Limit, "the limit for pagination");
            s.RequestParam(r => r.AssignmentId, "the assignment id");
            s.RequestParam(r => r.CreatorAccountId, "filter results by the account who created the status");
            s.RequestParam(r => r.AssigneeAccountId, "filter results by the assignee account");
            s.RequestParam(r => r.RetailerLocationId, "filter results by by retailer location");
            s.RequestParam(r => r.StatusType, "filter results by the status type");
            s.RequestParam(r => r.Keyword, "filter results by keyword search");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AssignmentStatusSearchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Assignment Status
/// </summary>

public class AssignmentStatusUpdateEndpoint : FastEndpoints.Endpoint<AssignmentStatusUpdateRequest, AssignmentStatusResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/assignment/status/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assignment");
        });

        Summary(s => {
            s.Summary = "Update Assignment Status";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the user account id");
            s.RequestParam(r => r.AssignmentStatusId, "the assignment status id");
            s.RequestParam(r => r.ScheduledNotificationId, "the scheduled notification id for reminders");
            s.RequestParam(r => r.ToDo, "the type of to do. Possible values include: SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT");
            s.RequestParam(r => r.Connection, "the connection type. Possible values include: INITIAL, FOLLOW_UP, DECLINED");
            s.RequestParam(r => r.Method, "the communication method type. Possible values include: PHONE, SITE_VISIT, EMAIL");
            s.RequestParam(r => r.Status, "the status type. Possible values include: ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED");
            s.RequestParam(r => r.Closure, "the closure type. Possible values include: PHONE, SITE_VISIT, PHONE_SITE, WEB");
            s.RequestParam(r => r.Message, "the message from the assignee");
            s.RequestParam(r => r.FollowUp, "the date to follow up by");
            s.RequestParam(r => r.Active, "determines whether the assignment status is active or inactive");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AssignmentStatusUpdateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Assignment
/// </summary>

public class AssignmentUpdateEndpoint : FastEndpoints.Endpoint<AssignmentUpdateRequest, AssignmentResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/assignment/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assignment");
        });

        Summary(s => {
            s.Summary = "Update Assignment";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the user account id");
            s.RequestParam(r => r.AssignmentId, "the assignment id");
            s.RequestParam(r => r.Name, "the name of the assignment");
            s.RequestParam(r => r.Description, "the description of the assignment");
            s.RequestParam(r => r.AssigneeAccountId, "the account id to assign to");
            s.RequestParam(r => r.RetailerLocationId, "the retailer location id");
            s.RequestParam(r => r.Tags, "the tags");
            s.RequestParam(r => r.Active, "determines whether the assignment is active or inactive");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AssignmentUpdateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

