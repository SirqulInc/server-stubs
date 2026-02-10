using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Pack
/// </summary>

public class CreatePackEndpoint : FastEndpoints.Endpoint<CreatePackRequest, PackResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/pack/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Pack");
        });

        Summary(s => {
            s.Summary = "Create Pack";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.Title, "The title of the pack");
            s.RequestParam(r => r.PackOrder, "The order of the pack");
            s.RequestParam(r => r.Price, "The price in tickets to purchase this pack");
            s.RequestParam(r => r.Highest, "The scoring is highest is best");
            s.RequestParam(r => r.AllocateTickets, "Flag to indicate owner should receive tickets for completed packs");
            s.RequestParam(r => r.TicketCount, "The number of tickets to reward");
            s.RequestParam(r => r.Description, "The description of the pack");
            s.RequestParam(r => r.SearchTags, "The tags for searching the pack, comma separated");
            s.RequestParam(r => r.Active, "Activate/deactivate the pack");
            s.RequestParam(r => r.GameType, "This parameter is deprecated.");
            s.RequestParam(r => r.AppKey, "The application key used to identify the application");
            s.RequestParam(r => r.PackType, "The type of the pack");
            s.RequestParam(r => r.SequenceType, "The type of game sequence of the pack");
            s.RequestParam(r => r.BackgroundId, "The background asset id of the pack");
            s.RequestParam(r => r.ImageId, "The image asset id of the pack");
            s.RequestParam(r => r.StartDate, "The date/time to start the pack, send 0 to unset");
            s.RequestParam(r => r.EndDate, "The date/time to end the pack, send 0 to unset");
            s.RequestParam(r => r.AuthorOverride, "");
            s.RequestParam(r => r.PriceType, "the type of ticket required to purchase this pack");
            s.RequestParam(r => r.GameLevelIds, "the game level ids to include in the pack, comma separated");
            s.RequestParam(r => r.InGame, "");
            s.RequestParam(r => r.TicketType, "The type of ticket to reward, null means default type");
            s.RequestParam(r => r.Points, "The number of points to award for completing a pack");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreatePackRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Pack
/// </summary>

public class DeletePackEndpoint : FastEndpoints.Endpoint<DeletePackRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/pack/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Pack");
        });

        Summary(s => {
            s.Summary = "Delete Pack";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.PackId, "the id of the pack to delete");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeletePackRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Pack
/// </summary>

public class GetPackEndpoint : FastEndpoints.Endpoint<GetPackRequest, PackResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/pack/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Pack");
        });

        Summary(s => {
            s.Summary = "Get Pack";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.PackId, "The id of the pack to return.");
            s.RequestParam(r => r.IncludeGameData, "If true include the game level data, otherwise don&#39;t. default is false.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetPackRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Packs
/// </summary>

public class SearchPacksEndpoint : FastEndpoints.Endpoint<SearchPacksRequest, List<PackResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/pack/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Pack");
        });

        Summary(s => {
            s.Summary = "Search Packs";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.SortField, "The field to sort by. Possible values include: TITLE, DESCRIPTION, CREATED, UPDATED");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Keyword, "Keyword search on the pack name");
            s.RequestParam(r => r.PackType, "Filters results on pack type");
            s.RequestParam(r => r.Start, "Start the result set at some index.");
            s.RequestParam(r => r.Limit, "Limit the result to some number.");
            s.RequestParam(r => r.IncludeGameData, "Determines whether to include game data in the results");
            s.RequestParam(r => r.IncludeInactive, "Determines whether to include inactive results");
            s.RequestParam(r => r.AppKey, "The application to filter results on");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchPacksRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Pack
/// </summary>

public class UpdatePackEndpoint : FastEndpoints.Endpoint<UpdatePackRequest, PackResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/pack/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Pack");
        });

        Summary(s => {
            s.Summary = "Update Pack";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.PackId, "The id of the pack to update.");
            s.RequestParam(r => r.AllocateTickets, "Flag to indicate owner should receive tickets for completed packs");
            s.RequestParam(r => r.TicketCount, "The number of tickets to reward");
            s.RequestParam(r => r.Title, "The title of the pack");
            s.RequestParam(r => r.Description, "The description of the pack");
            s.RequestParam(r => r.SearchTags, "The tags for searching the pack, comma separated");
            s.RequestParam(r => r.Active, "Activate/deactivate the pack");
            s.RequestParam(r => r.GameType, "This parameter is deprecated.");
            s.RequestParam(r => r.AppKey, "The application key used to identify the application");
            s.RequestParam(r => r.PackType, "The type of the pack");
            s.RequestParam(r => r.PackOrder, "The order of the pack");
            s.RequestParam(r => r.SequenceType, "The type of game sequence of the pack");
            s.RequestParam(r => r.BackgroundId, "The background asset id of the pack");
            s.RequestParam(r => r.ImageId, "The image asset id of the pack");
            s.RequestParam(r => r.StartDate, "The date/time to start the pack, send 0 to unset");
            s.RequestParam(r => r.EndDate, "The date/time to end the pack, send 0 to unset");
            s.RequestParam(r => r.AuthorOverride, "");
            s.RequestParam(r => r.Price, "The price in tickets to purchase this pack");
            s.RequestParam(r => r.PriceType, "the type of ticket required to purchase this pack");
            s.RequestParam(r => r.GameLevelIds, "the game level ids to include in the pack, comma separated");
            s.RequestParam(r => r.InGame, "");
            s.RequestParam(r => r.Highest, "The scoring is highest is best");
            s.RequestParam(r => r.TicketType, "The type of ticket to reward, null means default type");
            s.RequestParam(r => r.Points, "The number of points to award for completing a pack");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdatePackRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

