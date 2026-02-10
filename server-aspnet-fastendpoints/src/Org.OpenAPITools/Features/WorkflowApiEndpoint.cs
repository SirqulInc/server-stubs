using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Run Workflow
/// </summary>

public class RunWorkflowEndpoint : FastEndpoints.Endpoint<RunWorkflowRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/workflow/run");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Workflow");
        });

        Summary(s => {
            s.Summary = "Run Workflow";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account ID of the user");
            s.RequestParam(r => r.WorkflowId, "the workflow to run");
            s.RequestParam(r => r.SkuId, "this runs a particular sku on the workflow");
            s.RequestParam(r => r.VersionCode, "this runs a particular sku version on the workflow");
            s.RequestParam(r => r.Parameters, "Override parameters in JSON format. Example: &#x60;&#x60;&#x60;json {   \&quot;arguments_81\&quot;: { \&quot;filter\&quot;: \&quot;PUBLIC\&quot; },   \&quot;arguments_87\&quot;: { \&quot;tag\&quot;: \&quot;custom_tag\&quot; } } &#x60;&#x60;&#x60; ");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RunWorkflowRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

