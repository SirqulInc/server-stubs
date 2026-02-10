using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Subscription
/// </summary>

public class CreateSubscriptionEndpoint : FastEndpoints.Endpoint<CreateSubscriptionRequest, SubscriptionResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/subscription/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Subscription");
        });

        Summary(s => {
            s.Summary = "Create Subscription";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account used to perform the create, must be the responsible manager");
            s.RequestParam(r => r.PlanId, "The plan to subscribe to, if null use default plan");
            s.RequestParam(r => r.PromoCode, "Set a promo code for a discount.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateSubscriptionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Subscription
/// </summary>

public class DeleteSubscriptionEndpoint : FastEndpoints.Endpoint<DeleteSubscriptionRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/subscription/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Subscription");
        });

        Summary(s => {
            s.Summary = "Delete Subscription";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account used to perform the delete, must be the responsible manager");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteSubscriptionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Subscription
/// </summary>

public class GetSubscriptionEndpoint : FastEndpoints.Endpoint<GetSubscriptionRequest, SubscriptionResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/subscription/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Subscription");
        });

        Summary(s => {
            s.Summary = "Get Subscription";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account used to perform the lookup");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetSubscriptionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Subscription Plan
/// </summary>

public class GetSubscriptionPlanEndpoint : FastEndpoints.Endpoint<GetSubscriptionPlanRequest, SubscriptionPlanResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/subscription/plan/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Subscription");
        });

        Summary(s => {
            s.Summary = "Get Subscription Plan";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.PlanId, "The ID of the plan to get");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetSubscriptionPlanRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List Subscription Plans
/// </summary>

public class GetSubscriptionPlansEndpoint : FastEndpoints.Endpoint<GetSubscriptionPlansRequest, List<SubscriptionPlanResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/subscription/plan/list");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Subscription");
        });

        Summary(s => {
            s.Summary = "List Subscription Plans";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Visible, "Include visible only (true), hidden only (false), or all (null)");
            s.RequestParam(r => r.Role, "The role the plan is targeted for, values are: DEVELOPER, RETAILER, ADVERTISER");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetSubscriptionPlansRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Subscription Usage
/// </summary>

public class GetSubscriptionUsageEndpoint : FastEndpoints.Endpoint<GetSubscriptionUsageRequest, ApplicationUsageResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/subscription/usage/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Subscription");
        });

        Summary(s => {
            s.Summary = "Get Subscription Usage";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account used to perform the lookup");
            s.RequestParam(r => r.ApplicationId, "Get for just 1 application instead of the BillableEntity");
            s.RequestParam(r => r.Start, "The start time frame");
            s.RequestParam(r => r.End, "The end time frame");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetSubscriptionUsageRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Subscription
/// </summary>

public class UpdateSubscriptionEndpoint : FastEndpoints.Endpoint<UpdateSubscriptionRequest, SubscriptionResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/subscription/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Subscription");
        });

        Summary(s => {
            s.Summary = "Update Subscription";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account used to perform the update, must be the responsible manager");
            s.RequestParam(r => r.PlanId, "The plan to subscribe to");
            s.RequestParam(r => r.PromoCode, "Set a promo code for a discount.");
            s.RequestParam(r => r.Active, "Set active status");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateSubscriptionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

