
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class GetTicketCountRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the device that owns the tickets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the id of the account that owns the tickets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// this is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// the applicationkey
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// the type of ticket
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketType")]
    public string? TicketType { get; set; }
}
public class GetTicketListRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the device that owns the tickets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the id of the account that owns the tickets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// comma separated list of TicketObjectType
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketObjectType")]
    public string? TicketObjectType { get; set; }
    /// <summary>
    /// comma separated list of TicketActionType
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("actionType")]
    public string? ActionType { get; set; }
    /// <summary>
    /// the ids of the tickets to get
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketIds")]
    public string? TicketIds { get; set; }
    /// <summary>
    /// the ids of the objects to get
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("objectIds")]
    public string? ObjectIds { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("receiptTokens")]
    public string? ReceiptTokens { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
}
public class GiftPurchaseRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the id of the gift owner
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the id of the account receiving the tickets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("receiverAccountId")]
    public long ReceiverAccountId { get; set; }
    /// <summary>
    /// the id of the tickets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketId")]
    public long TicketId { get; set; }
    /// <summary>
    /// the id of the asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetId")]
    public long? AssetId { get; set; }
    /// <summary>
    /// a message that can be written to go along with the gift
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customMessage")]
    public string? CustomMessage { get; set; }
    /// <summary>
    /// the type of game associated with the tickets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
}
public class SaveTicketRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// whether to return nulls or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnNulls")]
    public bool? ReturnNulls { get; set; }
    /// <summary>
    /// the device id that owns the tickets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id that owns the tickets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// This parameter is deprecated. deprecated, use the appKey
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// the action being performed, values: COMPLETED, // ADD TICKETS FOR COMPLETING A MISSION, CHALLENGE, GAME, PACK, LEVEL, LEVEL OBJECT REDEEMED, // REMOVE TICKETS FOR BUYING PACKS, HINTS, AND PEN TOOLS OPTIONS, ETC USERS_PLAYED, // ADD TICKETS FOR LEVELS PLAYED BY OTHER USERS TOURNAMENT_OWNER, // ADD TICKETS FOR TOURNAMENTS BY OTHER USERS PURCHASED, // ADD TICKET VIA IN APP PURCHASING SUMATION, // SUMATION OF TICKETS EARNED FROM CHILDREN GIFTED, // TRANSFERING OF PURCHASE ITEMS TO OTHER PEOPLE REFUNDED // FOR REFUNDING TICKETS BACK TO THE USER
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("actionType")]
    public string ActionType { get; set; }
    /// <summary>
    /// the type of object being purchased, values: GAME_OBJECT, GAME_LEVEL, PACK, GAME, MISSION, PROFILE, APPLICATION, TICKETS, ASSET, CUSTOM
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketObjectType")]
    public string TicketObjectType { get; set; }
    /// <summary>
    /// the ID of the item being purchased
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("objectId")]
    public long? ObjectId { get; set; }
    /// <summary>
    /// a unique string identifier defined by the application owner or Executive
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("purchaseCode")]
    public string? PurchaseCode { get; set; }
    /// <summary>
    /// a unique transaction identifier from the purchase provider (i.e. the transaction ID from iTunes, Google Play, etc)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("receiptToken")]
    public string? ReceiptToken { get; set; }
    /// <summary>
    /// the receipt/transaction data for validating a purchase via iTunes/Gooogle/etc. This should be in string format.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("receiptData")]
    public string? ReceiptData { get; set; }
    /// <summary>
    /// the count of tickets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("count")]
    public long? Count { get; set; }
    /// <summary>
    /// the ticket type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketType")]
    public string? TicketType { get; set; }
    /// <summary>
    /// the provider for making the purchase {ITUNES, ITUNES_SANDBOX, GOOGLE}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("purchaseProvider")]
    public string? PurchaseProvider { get; set; }
    /// <summary>
    /// a comma separated list of purchase types { SIRQUL, // purchasing from the sirqul store using tickets IOS, // purchasing from the itunes store for iPhone, iPod, iPod Touch GOOGLE, // purchasing from the google android store AMAZON, // purchasing from the amazon android store MAC, // purchasing from the itunes store for OSX WP8, // purhasing from the windows phone 8 store FREE }
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("purchaseType")]
    public string? PurchaseType { get; set; }
    /// <summary>
    /// returns a ProfileResponse if true, otherwise will return an AppResponse
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnProfileResponse")]
    public bool? ReturnProfileResponse { get; set; }
    /// <summary>
    /// if returnProfileResponse is false, will return an AppResponse with profile data if true
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeProfileResponse")]
    public bool? IncludeProfileResponse { get; set; }
    /// <summary>
    /// the application version
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appVersion")]
    public string? AppVersion { get; set; }
}
public class SaveTicketViaFileUploadRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// whether to return nulls or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnNulls")]
    public bool? ReturnNulls { get; set; }
    /// <summary>
    /// the device id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// This parameter is deprecated. deprecated, use the appKey
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// the action being performed { COMPLETED, // ADD TICKETS FOR COMPLETING A MISSION, CHALLENGE, GAME, PACK, LEVEL, LEVEL OBJECT REDEEMED, // REMOVE TICKETS FOR BUYING PACKS, HINTS, AND PEN TOOLS OPTIONS, ETC USERS_PLAYED, // ADD TICKETS FOR LEVELS PLAYED BY OTHER USERS TOURNAMENT_OWNER, // ADD TICKETS FOR TOURNAMENTS BY OTHER USERS PURCHASED, // ADD TICKET VIA IN APP PURCHASING SUMATION, // SUMATION OF TICKETS EARNED FROM CHILDREN GIFTED, // TRANSFERING OF PURCHASE ITEMS TO OTHER PEOPLE REFUNDED // FOR REFUNDING TICKETS BACK TO THE USER }
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("actionType")]
    public string ActionType { get; set; }
    /// <summary>
    /// the type of object being purchased {GAME_OBJECT, GAME_LEVEL, PACK, GAME, MISSION, PROFILE, APPLICATION, TICKETS, ASSET, CUSTOM}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketObjectType")]
    public string TicketObjectType { get; set; }
    /// <summary>
    /// the ID of the item being purchased
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("objectId")]
    public long? ObjectId { get; set; }
    /// <summary>
    /// a unique string identifier defined by the application owner or Executive
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("purchaseCode")]
    public string? PurchaseCode { get; set; }
    /// <summary>
    /// a unique transaction identifier from the purchase provider (i.e. the transaction ID from iTunes, Google Play, etc)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("receiptToken")]
    public string? ReceiptToken { get; set; }
    /// <summary>
    /// the receipt/transaction data for validating a purchase via iTunes/Gooogle/etc. This should be in binary format.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("receiptData")]
    public System.IO.Stream ReceiptData { get; set; }
    /// <summary>
    /// the count of tickets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("count")]
    public long? Count { get; set; }
    /// <summary>
    /// the ticket type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketType")]
    public string? TicketType { get; set; }
    /// <summary>
    /// the provider for making the purchase {ITUNES, ITUNES_SANDBOX, GOOGLE}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("purchaseProvider")]
    public string? PurchaseProvider { get; set; }
    /// <summary>
    /// a comma separated list of purchase types { SIRQUL, // purchasing from the sirqul store using tickets IOS, // purchasing from the itunes store for iPhone, iPod, iPod Touch GOOGLE, // purchasing from the google android store AMAZON, // purchasing from the amazon android store MAC, // purchasing from the itunes store for OSX WP8, // purhasing from the windows phone 8 store FREE }
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("purchaseType")]
    public string? PurchaseType { get; set; }
    /// <summary>
    /// returns a ProfileResponse if true, otherwise will return an AppResponse
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnProfileResponse")]
    public bool? ReturnProfileResponse { get; set; }
    /// <summary>
    /// if returnProfileResponse is false, will return an AppResponse with profile data if true
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeProfileResponse")]
    public bool? IncludeProfileResponse { get; set; }
    /// <summary>
    /// the application version
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appVersion")]
    public string? AppVersion { get; set; }
}
public class TicketOffersRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
}


