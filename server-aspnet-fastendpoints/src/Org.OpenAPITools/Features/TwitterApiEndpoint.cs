using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Authorize Twitter
/// </summary>

public class AuthorizeTwitterEndpoint : FastEndpoints.Endpoint<AuthorizeTwitterRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/twitter/authorize");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Twitter");
        });

        Summary(s => {
            s.Summary = "Authorize Twitter";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "the application key");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AuthorizeTwitterRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Login Twitter
/// </summary>

public class LoginTwitterEndpoint : FastEndpoints.Endpoint<LoginTwitterRequest, ProfileResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/twitter/login");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Twitter");
        });

        Summary(s => {
            s.Summary = "Login Twitter";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccessToken, "The access token");
            s.RequestParam(r => r.AccessTokenSecret, "The secret access token");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.ResponseFilters, "a comma separated list of ProfileFilters for filtering the returned response data");
            s.RequestParam(r => r.DeviceId, "The device id");
            s.RequestParam(r => r.Latitude, "The current latitude of the user");
            s.RequestParam(r => r.Longitude, "The current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(LoginTwitterRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

