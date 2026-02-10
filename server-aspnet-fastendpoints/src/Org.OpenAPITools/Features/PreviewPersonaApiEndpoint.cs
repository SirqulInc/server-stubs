using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Persona
/// </summary>

public class CreatePersonaEndpoint : FastEndpoints.Endpoint<CreatePersonaRequest, PreviewPersonaResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/persona/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Preview Persona");
        });

        Summary(s => {
            s.Summary = "Create Persona";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account ID of the user");
            s.RequestParam(r => r.Title, "the title of the persona");
            s.RequestParam(r => r.PreviewAccounts, "the accounts that are able to preview from this persona");
            s.RequestParam(r => r.Date, "the sepcified date that this persona is viewing the app");
            s.RequestParam(r => r.Age, "the specified age of this persona");
            s.RequestParam(r => r.Gender, "the specified gender of this persona");
            s.RequestParam(r => r.GameExperienceLevel, "the specified experience level of the persona");
            s.RequestParam(r => r.Latitude, "the specified latitude of the persona");
            s.RequestParam(r => r.Longitude, "the specified longitude of the persona");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreatePersonaRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Persona
/// </summary>

public class DeletePersonaEndpoint : FastEndpoints.Endpoint<DeletePersonaRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/persona/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Preview Persona");
        });

        Summary(s => {
            s.Summary = "Delete Persona";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account id of the user");
            s.RequestParam(r => r.PersonaId, "the id of the persona to delete");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeletePersonaRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Persona
/// </summary>

public class GetPersonaListEndpoint : FastEndpoints.Endpoint<GetPersonaListRequest, PreviewPersonaResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/persona/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Preview Persona");
        });

        Summary(s => {
            s.Summary = "Get Persona";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account ID of the user");
            s.RequestParam(r => r.PersonaId, "the persona ID of the persona");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetPersonaListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Personas
/// </summary>

public class SearchPersonaEndpoint : FastEndpoints.Endpoint<SearchPersonaRequest, PreviewPersonaResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/persona/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Preview Persona");
        });

        Summary(s => {
            s.Summary = "Search Personas";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account ID of the user");
            s.RequestParam(r => r.Start, "the start index for pagination");
            s.RequestParam(r => r.Limit, "the limit for pagination (There is a hard limit of 100)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchPersonaRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Persona
/// </summary>

public class UpdatePersonaEndpoint : FastEndpoints.Endpoint<UpdatePersonaRequest, PreviewPersonaResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/persona/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Preview Persona");
        });

        Summary(s => {
            s.Summary = "Update Persona";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account ID of the user");
            s.RequestParam(r => r.PersonaId, "the persona ID of the persona to update");
            s.RequestParam(r => r.Title, "the title of the persona");
            s.RequestParam(r => r.PreviewAccounts, "the accounts that are able to preview from this persona");
            s.RequestParam(r => r.Active, "the status of the persona, there can only be one active persona per account");
            s.RequestParam(r => r.Date, "the sepcified date that this persona is viewing the app");
            s.RequestParam(r => r.Age, "the specified age of this persona");
            s.RequestParam(r => r.Gender, "the specified gender of this persona");
            s.RequestParam(r => r.GameExperienceLevel, "the specified experience level of the persona");
            s.RequestParam(r => r.Latitude, "the specified latitude of the persona");
            s.RequestParam(r => r.Longitude, "the specified longitude of the persona");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdatePersonaRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

