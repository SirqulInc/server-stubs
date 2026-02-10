using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Process All Participant Feeds
/// </summary>

public class ProcessAllParticipantsEndpoint : FastEndpoints.Endpoint<ProcessAllParticipantsRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/participant/process/all");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Participants");
        });

        Summary(s => {
            s.Summary = "Process All Participant Feeds";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the user");
            s.RequestParam(r => r.AppKey, "The application key used to identify the application");
            s.RequestParam(r => r.UseShortNameAsID, "Whether to use short name as the participant ID");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ProcessAllParticipantsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Process Participants Feed
/// </summary>

public class ProcessParticipantsEndpoint : FastEndpoints.Endpoint<ProcessParticipantsRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/participant/process");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Participants");
        });

        Summary(s => {
            s.Summary = "Process Participants Feed";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the user");
            s.RequestParam(r => r.League, "The league identifier to process");
            s.RequestParam(r => r.AppKey, "The application key used to identify the application");
            s.RequestParam(r => r.UseShortNameAsID, "Whether to use short name as the participant ID");
            s.RequestParam(r => r.File, "Multipart file containing participant feed contents");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ProcessParticipantsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

