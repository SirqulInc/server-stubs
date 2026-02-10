using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Bid
/// </summary>

public class CreateBidEndpoint : FastEndpoints.Endpoint<CreateBidRequest, BidResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/bid/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Bid");
        });

        Summary(s => {
            s.Summary = "Create Bid";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.BiddableType, "A biddable object type. Possible values include: CREATIVE (ads).");
            s.RequestParam(r => r.BiddableId, "The id of the biddable object");
            s.RequestParam(r => r.AmountPerView, "The bid amount for views. For ads, this is the amount that will be taken for each impression.");
            s.RequestParam(r => r.AmountPerAction, "The bid amount for actions. For ads, this is the amount that will be taken for each click.");
            s.RequestParam(r => r.BudgetAmount, "The allocated budget amount that will be used");
            s.RequestParam(r => r.BudgetSchedule, "The schedule for when the allocated budget amount is reset");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateBidRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Bid
/// </summary>

public class DeleteBidEndpoint : FastEndpoints.Endpoint<DeleteBidRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/bid/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Bid");
        });

        Summary(s => {
            s.Summary = "Delete Bid";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.BidId, "The bid id");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteBidRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Bid
/// </summary>

public class GetBidEndpoint : FastEndpoints.Endpoint<GetBidRequest, BidResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/bid/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Bid");
        });

        Summary(s => {
            s.Summary = "Get Bid";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.BidId, "The bid id");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetBidRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Bid
/// </summary>

public class UpdateBidEndpoint : FastEndpoints.Endpoint<UpdateBidRequest, BidResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/bid/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Bid");
        });

        Summary(s => {
            s.Summary = "Update Bid";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.BidId, "The bid id");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AmountPerView, "The bid amount for views. For ads, this is the amount that will be taken for each impression.");
            s.RequestParam(r => r.AmountPerAction, "The bid amount for actions. For ads, this is the amount that will be taken for each click.");
            s.RequestParam(r => r.BudgetAmount, "The allocated budget amount that will be used");
            s.RequestParam(r => r.BudgetSchedule, "The schedule for when the allocated budget amount is reset");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateBidRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

