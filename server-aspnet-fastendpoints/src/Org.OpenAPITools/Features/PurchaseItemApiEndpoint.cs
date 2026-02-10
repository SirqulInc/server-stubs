using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Purchase
/// </summary>

public class CreatePurchaseItemEndpoint : FastEndpoints.Endpoint<CreatePurchaseItemRequest, PurchaseItemFullResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/purchase/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Purchase Item");
        });

        Summary(s => {
            s.Summary = "Create Purchase";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "The application key that the purchase can be used in");
            s.RequestParam(r => r.Name, "The name of the purchase item");
            s.RequestParam(r => r.PurchaseType, "The purchase provider &lt;ul&gt; &lt;li&gt;SIRQUL - the Sirqul store to make purchases using tickets&lt;/li&gt; &lt;li&gt;IOS - the iTunes store for iPhone, iPod, iPod Touch&lt;/li&gt; &lt;li&gt;GOOGLE - the Google Play store&lt;/li&gt; &lt;li&gt;AMAZON - the Amazon Android store&lt;/li&gt; &lt;li&gt;MAC - the iTunes store for OSX&lt;/li&gt; &lt;li&gt;WP8 - the Windows Phone 8 store&lt;/li&gt; &lt;li&gt;FREE - used for purchase items that are free (can be used for development/testing purposes)&lt;/li&gt; &lt;/ul&gt;");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Description, "The description of the purchase item");
            s.RequestParam(r => r.Tickets, "How much the purchase item is worth in tickets");
            s.RequestParam(r => r.Price, "How much the purchase item will cost in real money");
            s.RequestParam(r => r.PurchaseCode, "The unique identifier used by purchase providers to identify in-app-purchases");
            s.RequestParam(r => r.SecretKey, "A secret key from purchase providers that would be used for validation");
            s.RequestParam(r => r.PurchaseLimit, "How many times a user acquire the same purchase item");
            s.RequestParam(r => r.ServiceAction, "Determines whether the purchase item will enable certain features &lt;ul&gt; &lt;li&gt;DAY_PREMIUM - subscribes a user for a day of membership&lt;/li&gt; &lt;li&gt;WEEK_PREMIUM - subscribes a user for a week of membership&lt;/li&gt; &lt;li&gt;MONTH_PREMIUM - subscribes a user for a month of membership&lt;/li&gt; &lt;li&gt;ADD_TICKET - allows a user to add more tickets to their account&lt;/li&gt; &lt;li&gt;ADD_GIFT - allows a user to send/recieve the purchase item as a gift&lt;/li&gt; &lt;/ul&gt;");
            s.RequestParam(r => r.CoverAssetId, "The cover image of the purchase item");
            s.RequestParam(r => r.PromoAssetId, "An application specific asset that can be used to store/provide additional data");
            s.RequestParam(r => r.Giftable, "Determines whether the purchase item can be gifted to other users");
            s.RequestParam(r => r.Assetable, "Determines whether users can attach their own media/asset to the purchase item");
            s.RequestParam(r => r.AllocateTickets, "Flag to indicate owner should receive tickets for completed missions");
            s.RequestParam(r => r.TicketType, "The type of ticket to reward, null means default type");
            s.RequestParam(r => r.Points, "The number of points to award for completing a mission");
            s.RequestParam(r => r.OfferLocationId, "The offer location that will get added to the user&#39;s wallet after purchase.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreatePurchaseItemRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Purchase
/// </summary>

public class DeletePurchaseItemEndpoint : FastEndpoints.Endpoint<DeletePurchaseItemRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/purchase/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Purchase Item");
        });

        Summary(s => {
            s.Summary = "Delete Purchase";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.PurchaseItemId, "The purchase item id");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeletePurchaseItemRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Purchase
/// </summary>

public class GetPurchaseItemEndpoint : FastEndpoints.Endpoint<GetPurchaseItemRequest, PurchaseItemFullResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/purchase/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Purchase Item");
        });

        Summary(s => {
            s.Summary = "Get Purchase";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.PurchaseItemId, "The purchase item id");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetPurchaseItemRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Purchases
/// </summary>

public class SearchPurchaseItemsEndpoint : FastEndpoints.Endpoint<SearchPurchaseItemsRequest, List<PurchaseItemResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/purchase/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Purchase Item");
        });

        Summary(s => {
            s.Summary = "Search Purchases";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AppKey, "The application key to filter results by application");
            s.RequestParam(r => r.FilterByBillable, "Determines whether to filter results by the user&#39;s billable entity");
            s.RequestParam(r => r.PurchaseType, "A comma separated list of purchase providers to filter by. Possible values include: &lt;ul&gt; &lt;li&gt;SIRQUL - purchases from the Sirqul store using tickets&lt;/li&gt; &lt;li&gt;IOS - purchases from the iTunes store for iPhone, iPod, iPod Touch&lt;/li&gt; &lt;li&gt;GOOGLE - purchases from the Google Play store&lt;/li&gt; &lt;li&gt;AMAZON - purchases from the Amazon Android store&lt;/li&gt; &lt;li&gt;MAC - purchases from the iTunes store for OSX&lt;/li&gt; &lt;li&gt;WP8 - purchases from the Windows Phone 8 store&lt;/li&gt; &lt;li&gt;FREE - purchases that are free (can be used for development/testing purposes)&lt;/li&gt; &lt;/ul&gt;");
            s.RequestParam(r => r.ServiceAction, "A comma separated list of service actions to filter results by. Possible values include: &lt;ul&gt; &lt;li&gt;DAY_PREMIUM - purchases that subscribes a user for a day of membership&lt;/li&gt; &lt;li&gt;WEEK_PREMIUM - purchases that subscribes a user for a week of membership&lt;/li&gt; &lt;li&gt;MONTH_PREMIUM - purchases that subscribes a user for a month of membership&lt;/li&gt; &lt;li&gt;ADD_TICKET - purchases that allow users to add more tickets&lt;/li&gt; &lt;li&gt;ADD_GIFT - purchases that allow users to recieve gifts&lt;/li&gt; &lt;/ul&gt;");
            s.RequestParam(r => r.Keyword, "The keyword used to search");
            s.RequestParam(r => r.SortField, "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY");
            s.RequestParam(r => r.Descending, "The order to return the search results");
            s.RequestParam(r => r.Start, "The record to begin the return set on");
            s.RequestParam(r => r.Limit, "The number of records to return");
            s.RequestParam(r => r.ActiveOnly, "Return only active results");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchPurchaseItemsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Purchase
/// </summary>

public class UpdatePurchaseItemEndpoint : FastEndpoints.Endpoint<UpdatePurchaseItemRequest, PurchaseItemFullResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/purchase/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Purchase Item");
        });

        Summary(s => {
            s.Summary = "Update Purchase";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.PurchaseItemId, "The purchase item id");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Name, "The name of the purchase item");
            s.RequestParam(r => r.Description, "The description of the purchase item");
            s.RequestParam(r => r.Tickets, "How much the purchase item is worth in tickets");
            s.RequestParam(r => r.Price, "How much the purchase item will cost in real money");
            s.RequestParam(r => r.PurchaseType, "The purchase provider &lt;ul&gt; &lt;li&gt;SIRQUL - the Sirqul store to make purchases using tickets&lt;/li&gt; &lt;li&gt;IOS - the iTunes store for iPhone, iPod, iPod Touch&lt;/li&gt; &lt;li&gt;GOOGLE - the Google Play store&lt;/li&gt; &lt;li&gt;AMAZON - the Amazon Android store&lt;/li&gt; &lt;li&gt;MAC - the iTunes store for OSX&lt;/li&gt; &lt;li&gt;WP8 - the Windows Phone 8 store&lt;/li&gt; &lt;li&gt;FREE - used for purchase items that are free (can be used for development/testing purposes)&lt;/li&gt; &lt;/ul&gt;");
            s.RequestParam(r => r.PurchaseCode, "The unique identifier used by purchase providers to identify in-app-purchases");
            s.RequestParam(r => r.SecretKey, "A secret key from purchase providers that would be used for validation");
            s.RequestParam(r => r.PurchaseLimit, "How many times a user acquire the same purchase item");
            s.RequestParam(r => r.ServiceAction, "Determines whether the purchase item will enable certain features &lt;ul&gt; &lt;li&gt;DAY_PREMIUM - subscribes a user for a day of membership&lt;/li&gt; &lt;li&gt;WEEK_PREMIUM - subscribes a user for a week of membership&lt;/li&gt; &lt;li&gt;MONTH_PREMIUM - subscribes a user for a month of membership&lt;/li&gt; &lt;li&gt;ADD_TICKET - allows a user to add more tickets to their account&lt;/li&gt; &lt;li&gt;ADD_GIFT - allows a user to send/recieve the purchase item as a gift&lt;/li&gt; &lt;/ul&gt;");
            s.RequestParam(r => r.CoverAssetId, "The cover image of the purchase item");
            s.RequestParam(r => r.PromoAssetId, "An application specific asset that can be used to store/provide additional data");
            s.RequestParam(r => r.Giftable, "Determines whether the purchase item can be gifted to other users");
            s.RequestParam(r => r.Assetable, "Determines whether users can attach their own media/asset to the purchase item");
            s.RequestParam(r => r.Active, "Sets whether the purchase item is active or inactive (hidden from consumers)");
            s.RequestParam(r => r.AllocateTickets, "Flag to indicate owner should receive tickets for completed missions");
            s.RequestParam(r => r.TicketType, "The type of ticket to reward, null means default type");
            s.RequestParam(r => r.Points, "The number of points to award for completing a mission");
            s.RequestParam(r => r.OfferLocationId, "The offer location that will get added to the user&#39;s wallet after purchase.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdatePurchaseItemRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

