using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Get Ticket Count
/// </summary>

public class GetTicketCountEndpoint : FastEndpoints.Endpoint<GetTicketCountRequest, CountResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/ticket/count");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Ticket");
        });

        Summary(s => {
            s.Summary = "Get Ticket Count";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "the id of the device that owns the tickets");
            s.RequestParam(r => r.AccountId, "the id of the account that owns the tickets");
            s.RequestParam(r => r.GameType, "this is deprecated.");
            s.RequestParam(r => r.AppKey, "the applicationkey");
            s.RequestParam(r => r.TicketType, "the type of ticket");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetTicketCountRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Ticket List
/// </summary>

public class GetTicketListEndpoint : FastEndpoints.Endpoint<GetTicketListRequest, TicketListResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/ticket/getList");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Ticket");
        });

        Summary(s => {
            s.Summary = "Get Ticket List";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "the id of the device that owns the tickets");
            s.RequestParam(r => r.AccountId, "the id of the account that owns the tickets");
            s.RequestParam(r => r.TicketObjectType, "comma separated list of TicketObjectType");
            s.RequestParam(r => r.ActionType, "comma separated list of TicketActionType");
            s.RequestParam(r => r.TicketIds, "the ids of the tickets to get");
            s.RequestParam(r => r.ObjectIds, "the ids of the objects to get");
            s.RequestParam(r => r.ReceiptTokens, "");
            s.RequestParam(r => r.GameType, "");
            s.RequestParam(r => r.AppKey, "the application key");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetTicketListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Gift Tickets
/// </summary>

public class GiftPurchaseEndpoint : FastEndpoints.Endpoint<GiftPurchaseRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/purchase/gift");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Ticket");
        });

        Summary(s => {
            s.Summary = "Gift Tickets";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ReceiverAccountId, "the id of the account receiving the tickets");
            s.RequestParam(r => r.TicketId, "the id of the tickets");
            s.RequestParam(r => r.DeviceId, "the id of the device");
            s.RequestParam(r => r.AccountId, "the id of the gift owner");
            s.RequestParam(r => r.AssetId, "the id of the asset");
            s.RequestParam(r => r.CustomMessage, "a message that can be written to go along with the gift");
            s.RequestParam(r => r.GameType, "the type of game associated with the tickets");
            s.RequestParam(r => r.AppKey, "the application key");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GiftPurchaseRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Save Ticket
/// </summary>

public class SaveTicketEndpoint : FastEndpoints.Endpoint<SaveTicketRequest, ProfileResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/ticket/save");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Ticket");
        });

        Summary(s => {
            s.Summary = "Save Ticket";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ActionType, "the action being performed, values: COMPLETED, // ADD TICKETS FOR COMPLETING A MISSION, CHALLENGE, GAME, PACK, LEVEL, LEVEL OBJECT REDEEMED, // REMOVE TICKETS FOR BUYING PACKS, HINTS, AND PEN TOOLS OPTIONS, ETC USERS_PLAYED, // ADD TICKETS FOR LEVELS PLAYED BY OTHER USERS TOURNAMENT_OWNER, // ADD TICKETS FOR TOURNAMENTS BY OTHER USERS PURCHASED, // ADD TICKET VIA IN APP PURCHASING SUMATION, // SUMATION OF TICKETS EARNED FROM CHILDREN GIFTED, // TRANSFERING OF PURCHASE ITEMS TO OTHER PEOPLE REFUNDED // FOR REFUNDING TICKETS BACK TO THE USER");
            s.RequestParam(r => r.TicketObjectType, "the type of object being purchased, values: GAME_OBJECT, GAME_LEVEL, PACK, GAME, MISSION, PROFILE, APPLICATION, TICKETS, ASSET, CUSTOM");
            s.RequestParam(r => r.ReturnNulls, "whether to return nulls or not");
            s.RequestParam(r => r.DeviceId, "the device id that owns the tickets");
            s.RequestParam(r => r.AccountId, "the account id that owns the tickets");
            s.RequestParam(r => r.GameType, "This parameter is deprecated. deprecated, use the appKey");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.ObjectId, "the ID of the item being purchased");
            s.RequestParam(r => r.PurchaseCode, "a unique string identifier defined by the application owner or Executive");
            s.RequestParam(r => r.ReceiptToken, "a unique transaction identifier from the purchase provider (i.e. the transaction ID from iTunes, Google Play, etc)");
            s.RequestParam(r => r.ReceiptData, "the receipt/transaction data for validating a purchase via iTunes/Gooogle/etc. This should be in string format.");
            s.RequestParam(r => r.Count, "the count of tickets");
            s.RequestParam(r => r.TicketType, "the ticket type");
            s.RequestParam(r => r.PurchaseProvider, "the provider for making the purchase {ITUNES, ITUNES_SANDBOX, GOOGLE}");
            s.RequestParam(r => r.PurchaseType, "a comma separated list of purchase types { SIRQUL, // purchasing from the sirqul store using tickets IOS, // purchasing from the itunes store for iPhone, iPod, iPod Touch GOOGLE, // purchasing from the google android store AMAZON, // purchasing from the amazon android store MAC, // purchasing from the itunes store for OSX WP8, // purhasing from the windows phone 8 store FREE }");
            s.RequestParam(r => r.ReturnProfileResponse, "returns a ProfileResponse if true, otherwise will return an AppResponse");
            s.RequestParam(r => r.IncludeProfileResponse, "if returnProfileResponse is false, will return an AppResponse with profile data if true");
            s.RequestParam(r => r.AppVersion, "the application version");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SaveTicketRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Save Ticket with Reciept
/// </summary>

public class SaveTicketViaFileUploadEndpoint : FastEndpoints.Endpoint<SaveTicketViaFileUploadRequest, ProfileResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/ticket/save/fileUpload");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Ticket");
        });

        Summary(s => {
            s.Summary = "Save Ticket with Reciept";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ActionType, "the action being performed { COMPLETED, // ADD TICKETS FOR COMPLETING A MISSION, CHALLENGE, GAME, PACK, LEVEL, LEVEL OBJECT REDEEMED, // REMOVE TICKETS FOR BUYING PACKS, HINTS, AND PEN TOOLS OPTIONS, ETC USERS_PLAYED, // ADD TICKETS FOR LEVELS PLAYED BY OTHER USERS TOURNAMENT_OWNER, // ADD TICKETS FOR TOURNAMENTS BY OTHER USERS PURCHASED, // ADD TICKET VIA IN APP PURCHASING SUMATION, // SUMATION OF TICKETS EARNED FROM CHILDREN GIFTED, // TRANSFERING OF PURCHASE ITEMS TO OTHER PEOPLE REFUNDED // FOR REFUNDING TICKETS BACK TO THE USER }");
            s.RequestParam(r => r.TicketObjectType, "the type of object being purchased {GAME_OBJECT, GAME_LEVEL, PACK, GAME, MISSION, PROFILE, APPLICATION, TICKETS, ASSET, CUSTOM}");
            s.RequestParam(r => r.ReceiptData, "the receipt/transaction data for validating a purchase via iTunes/Gooogle/etc. This should be in binary format.");
            s.RequestParam(r => r.ReturnNulls, "whether to return nulls or not");
            s.RequestParam(r => r.DeviceId, "the device id");
            s.RequestParam(r => r.AccountId, "the account id");
            s.RequestParam(r => r.GameType, "This parameter is deprecated. deprecated, use the appKey");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.ObjectId, "the ID of the item being purchased");
            s.RequestParam(r => r.PurchaseCode, "a unique string identifier defined by the application owner or Executive");
            s.RequestParam(r => r.ReceiptToken, "a unique transaction identifier from the purchase provider (i.e. the transaction ID from iTunes, Google Play, etc)");
            s.RequestParam(r => r.Count, "the count of tickets");
            s.RequestParam(r => r.TicketType, "the ticket type");
            s.RequestParam(r => r.PurchaseProvider, "the provider for making the purchase {ITUNES, ITUNES_SANDBOX, GOOGLE}");
            s.RequestParam(r => r.PurchaseType, "a comma separated list of purchase types { SIRQUL, // purchasing from the sirqul store using tickets IOS, // purchasing from the itunes store for iPhone, iPod, iPod Touch GOOGLE, // purchasing from the google android store AMAZON, // purchasing from the amazon android store MAC, // purchasing from the itunes store for OSX WP8, // purhasing from the windows phone 8 store FREE }");
            s.RequestParam(r => r.ReturnProfileResponse, "returns a ProfileResponse if true, otherwise will return an AppResponse");
            s.RequestParam(r => r.IncludeProfileResponse, "if returnProfileResponse is false, will return an AppResponse with profile data if true");
            s.RequestParam(r => r.AppVersion, "the application version");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SaveTicketViaFileUploadRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Ticket Offers
/// </summary>

public class TicketOffersEndpoint : FastEndpoints.Endpoint<TicketOffersRequest, TicketOfferResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/ticket/ticketoffers");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Ticket");
        });

        Summary(s => {
            s.Summary = "Get Ticket Offers";
            s.RequestParam(r => r.Version, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(TicketOffersRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

