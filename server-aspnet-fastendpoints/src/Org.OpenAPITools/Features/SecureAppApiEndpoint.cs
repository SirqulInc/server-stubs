using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Secure Application
/// </summary>

public class CreateSecureApplicationEndpoint : FastEndpoints.Endpoint<CreateSecureApplicationRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/secure/application/create");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("SecureApp");
        });

        Summary(s => {
            s.Summary = "Create Secure Application";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The unique id of the user making the request");
            s.RequestParam(r => r.AppKey, "The application to secure");
            s.RequestParam(r => r.KeyCert, "");
            s.RequestParam(r => r.TrustStore, "");
            s.RequestParam(r => r.Username, "");
            s.RequestParam(r => r.Password, "");
            s.RequestParam(r => r.Active, "");
            s.RequestParam(r => r.BiometricType, "The type of biometric, options are: - FINGERPRINT - IRIS - FACIAL");
            s.RequestParam(r => r.BiometricPosition, "The position for the biometric file uploaded");
            s.RequestParam(r => r.BiometricPosition2, "The position for each the biometric2 file uploaded");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateSecureApplicationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Secure Application
/// </summary>

public class DeleteSecureApplicationEndpoint : FastEndpoints.Endpoint<DeleteSecureApplicationRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/secure/application/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("SecureApp");
        });

        Summary(s => {
            s.Summary = "Delete Secure Application";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The unique id of the user making the request");
            s.RequestParam(r => r.AppKey, "The application to secure");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteSecureApplicationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Login Clear
/// </summary>

public class LoginSecureEndpoint : FastEndpoints.Endpoint<LoginSecureRequest, ProfileResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/secure/login");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("SecureApp");
        });

        Summary(s => {
            s.Summary = "Login Clear";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "The application making the request, defines what type and position is required to make a secure login the request.");
            s.RequestParam(r => r.BiometricFile, "The data file used to perform authentication");
            s.RequestParam(r => r.DeviceId, "The unique id of the device making the request");
            s.RequestParam(r => r.BiometricFile2, "The data file used to perform authentication");
            s.RequestParam(r => r.AgeRestriction, "Checks user&#39;s birthday to see if they meet an age requirement. If the user is under age, an error message is returned.");
            s.RequestParam(r => r.ReturnProfile, "Determines whether to return a ProfileResponse on success, or a PaymentTypesResponse");
            s.RequestParam(r => r.ResponseFilters, "If returnProfile is set to true, this determines how much of the profile should be returned, see ProfileFilters");
            s.RequestParam(r => r.Latitude, "Used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "Used to update the user&#39;s current location");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(LoginSecureRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Purchase Clear
/// </summary>

public class PurchaseSecureEndpoint : FastEndpoints.Endpoint<PurchaseSecureRequest, ProfileResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/secure/purchase");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("SecureApp");
        });

        Summary(s => {
            s.Summary = "Purchase Clear";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.body, "The payment request object");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(PurchaseSecureRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Rest Secure Application
/// </summary>

public class ResetSecureEndpoint : FastEndpoints.Endpoint<ResetSecureRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/secure/application/reset");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("SecureApp");
        });

        Summary(s => {
            s.Summary = "Rest Secure Application";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The unique id of the user making the request");
            s.RequestParam(r => r.AppKey, "The application to secure");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ResetSecureRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Secure Application
/// </summary>

public class UpdateSecureApplicationEndpoint : FastEndpoints.Endpoint<UpdateSecureApplicationRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/secure/application/update");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("SecureApp");
        });

        Summary(s => {
            s.Summary = "Update Secure Application";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The unique id of the user making the request");
            s.RequestParam(r => r.AppKey, "The application to secure");
            s.RequestParam(r => r.Active, "");
            s.RequestParam(r => r.KeyCert, "");
            s.RequestParam(r => r.TrustStore, "");
            s.RequestParam(r => r.Username, "");
            s.RequestParam(r => r.Password, "");
            s.RequestParam(r => r.BiometricType, "The type of biometric, options are: - FINGERPRINT - IRIS - FACIAL");
            s.RequestParam(r => r.BiometricPosition, "The position for the biometric file uploaded");
            s.RequestParam(r => r.BiometricPosition2, "The position for each the biometric2 file uploaded");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateSecureApplicationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

