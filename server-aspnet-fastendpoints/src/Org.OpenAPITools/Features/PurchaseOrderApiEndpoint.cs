using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Order
/// </summary>

public class CreateOrderEndpoint : FastEndpoints.Endpoint<CreateOrderRequest, OrderResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/order/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Purchase Order");
        });

        Summary(s => {
            s.Summary = "Create Order";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "The application requesting the purchase");
            s.RequestParam(r => r.Cart, "&#x60;&#x60;&#x60;json [   { \&quot;orderItemType\&quot;: \&quot;OFFER\&quot;, \&quot;orderItemId\&quot;: 234, \&quot;orderCustomType\&quot;: \&quot;OfferLocation\&quot;, \&quot;orderCustomId\&quot;: 123, \&quot;retailerLocationId\&quot;: 1234, \&quot;quantity\&quot;: 2 },   { \&quot;orderItemType\&quot;: \&quot;OFFER\&quot;, \&quot;orderItemId\&quot;: 235, \&quot;quantity\&quot;: 2 },   { \&quot;orderItemType\&quot;: \&quot;CUSTOM\&quot;, \&quot;amount\&quot;: 10.50, \&quot;orderCustomType\&quot;: \&quot;ServiceFee\&quot; },   { \&quot;orderItemType\&quot;: \&quot;CUSTOM\&quot;, \&quot;amount\&quot;: 25.10, \&quot;quantity\&quot;: 2, \&quot;orderCustomType\&quot;: \&quot;Hat\&quot;, \&quot;orderCustomId\&quot;: 123 } ] &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Description, "A description of the purchase");
            s.RequestParam(r => r.CurrencyType, "Determines the method of purchasing offer.  * VOID: used for when there is no payment involved (ie. for updating the status of a purchase order)  * CASH: use card on file  * POINTS: use account balance  * TICKETS: use tickets  * REFUND: not allowed for a create, requires a paymentTransactionId.  * CREDIT: add to the account balance  * RELOAD: charge a credit card then add to the account balance  ");
            s.RequestParam(r => r.PaymentMethodId, "Use a specific payment method (CASH), if not provided use default");
            s.RequestParam(r => r.ExternalOrderId, "Store identifier from external system");
            s.RequestParam(r => r.ExternalPaymentId, "Store identifier from external system");
            s.RequestParam(r => r.RemoteRefType, "Remote Reference type");
            s.RequestParam(r => r.ExternalDate, "External Date");
            s.RequestParam(r => r.PromoCode, "The Promo Code");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateOrderRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Order
/// </summary>

public class DeleteOrderEndpoint : FastEndpoints.Endpoint<DeleteOrderRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/order/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Purchase Order");
        });

        Summary(s => {
            s.Summary = "Delete Order";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.OrderId, "Order Id");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteOrderRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Order
/// </summary>

public class GetOrderEndpoint : FastEndpoints.Endpoint<GetOrderRequest, OrderResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/order/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Purchase Order");
        });

        Summary(s => {
            s.Summary = "Get Order";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.OrderId, "The order id to get details of, either orderId or externalOrderId must be provided");
            s.RequestParam(r => r.ExternalOrderId, "The external order id to get details of, either orderId or externalOrderId must be provided");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetOrderRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Preview Order
/// </summary>

public class PreviewOrderEndpoint : FastEndpoints.Endpoint<PreviewOrderRequest, OrderResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/order/preview");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Purchase Order");
        });

        Summary(s => {
            s.Summary = "Preview Order";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "The application requesting the purchase");
            s.RequestParam(r => r.Cart, "A JSON list of items to purchase");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Description, "A description of the purchase");
            s.RequestParam(r => r.CurrencyType, "Determines the method of purchasing offer. &#x60;&#x60;&#x60;json {   \&quot;VOID\&quot;: \&quot;used for when there is no payment involved (ie. for updating the status of a purchase order)\&quot;,   \&quot;CASH\&quot;: \&quot;use card on file\&quot;,   \&quot;POINTS\&quot;: \&quot;use account balance\&quot;,   \&quot;TICKETS\&quot;: \&quot;use tickets\&quot;,   \&quot;REFUND\&quot;: \&quot;not allowed for a create, requires a paymentTransactionId\&quot;,   \&quot;CREDIT\&quot;: \&quot;add to the account balance\&quot;,   \&quot;RELOAD\&quot;: \&quot;charge a credit card then add to the account balance\&quot; } &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.PaymentMethodId, "Use a specific payment method (CASH), if not provided use default");
            s.RequestParam(r => r.ExternalOrderId, "Store identifier from external system");
            s.RequestParam(r => r.ExternalPaymentId, "Store identifier from external system");
            s.RequestParam(r => r.RemoteRefType, "Remote Reference type");
            s.RequestParam(r => r.ExternalDate, "External Date");
            s.RequestParam(r => r.PromoCode, "The Promo Code");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(PreviewOrderRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Orders
/// </summary>

public class SearchOrdersEndpoint : FastEndpoints.Endpoint<SearchOrdersRequest, List<OrderResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/order/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Purchase Order");
        });

        Summary(s => {
            s.Summary = "Search Orders";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "The application requesting the purchase");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.RequestParam(r => r.Descending, "Determines whether to return the resulting list in descending or ascending order");
            s.RequestParam(r => r.ActiveOnly, "Only return active orders");
            s.RequestParam(r => r.IgnoreCustomerFilter, "Determines whether to ignore the customer filter (requires an Admin/Exec account)");
            s.RequestParam(r => r.OrderItemTypes, "Filter results by orderItemTypes");
            s.RequestParam(r => r.OrderItemIds, "Filter results by orderItemIds");
            s.RequestParam(r => r.OrderCustomTypes, "Filter results by orderCustomTypes");
            s.RequestParam(r => r.OrderCustomIds, "Filter results by orderCustomIds");
            s.RequestParam(r => r.SortField, "Determines what to sort the results by");
            s.RequestParam(r => r.OfferTypes, "Filter results by offer type");
            s.RequestParam(r => r.SpecialOfferTypes, "Filter results by special offer type");
            s.RequestParam(r => r.CategoryIds, "Filter results by category Ids");
            s.RequestParam(r => r.FilterIds, "Filter results by filter Ids");
            s.RequestParam(r => r.OfferAudienceIds, "Filter results by offer audience Ids");
            s.RequestParam(r => r.TransactionAudienceIds, "Filter results by transaction audience Ids");
            s.RequestParam(r => r.OfferIds, "Filter results by offer Ids");
            s.RequestParam(r => r.OfferLocationIds, "Filter results by offer location Ids");
            s.RequestParam(r => r.RetailerIds, "Filter results by retailer Ids");
            s.RequestParam(r => r.RetailerLocationIds, "Filter results by retailer location Ids");
            s.RequestParam(r => r.Statuses, "Filter results by offer transaction status (0: non-redeemable, 1: redeemable, 2: redeemed, 3: user deleted, 4: unclaimed/rewarded, 5: membership active, 6: membership cancelled)");
            s.RequestParam(r => r.Keyword, "The keyword to search for");
            s.RequestParam(r => r.RedeemableStartDate, "Filter results by the offer redeemable date");
            s.RequestParam(r => r.RedeemableEndDate, "Filter results by the offer redeemable date");
            s.RequestParam(r => r.StartedSince, "Filter results by the offer start date");
            s.RequestParam(r => r.StartedBefore, "Filter results by the offer start date");
            s.RequestParam(r => r.EndedSince, "Filter results by the offer end date");
            s.RequestParam(r => r.EndedBefore, "Filter results by the offer end date");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchOrdersRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Order
/// </summary>

public class UpdateOrderEndpoint : FastEndpoints.Endpoint<UpdateOrderRequest, OrderResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/order/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Purchase Order");
        });

        Summary(s => {
            s.Summary = "Update Order";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.OrderId, "The order to add the purchase to, leave null for new order.");
            s.RequestParam(r => r.AppKey, "The application requesting the purchase");
            s.RequestParam(r => r.Cart, "&#x60;&#x60;&#x60;json [   { \&quot;orderItemType\&quot;: \&quot;OFFER\&quot;, \&quot;orderItemId\&quot;: 234, \&quot;orderCustomType\&quot;: \&quot;OfferLocation\&quot;, \&quot;orderCustomId\&quot;: 123, \&quot;retailerLocationId\&quot;: 1234, \&quot;quantity\&quot;: 2 },   { \&quot;orderItemType\&quot;: \&quot;OFFER\&quot;, \&quot;orderItemId\&quot;: 235, \&quot;quantity\&quot;: 2 },   { \&quot;orderItemType\&quot;: \&quot;CUSTOM\&quot;, \&quot;amount\&quot;: 10.50, \&quot;orderCustomType\&quot;: \&quot;ServiceFee\&quot; },   { \&quot;orderItemType\&quot;: \&quot;CUSTOM\&quot;, \&quot;amount\&quot;: 25.10, \&quot;quantity\&quot;: 2, \&quot;orderCustomType\&quot;: \&quot;Hat\&quot;, \&quot;orderCustomId\&quot;: 123 } ] &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.PaymentTransactionId, "The payment transaction to apply the refund to");
            s.RequestParam(r => r.Description, "A description of the purchase");
            s.RequestParam(r => r.CurrencyType, "Determines the method of purchasing offer.  * VOID: used for when there is no payment involved (ie. for updating the status of a purchase order)  * CASH: use card on file  * POINTS: use account balance  * TICKETS: use tickets  * REFUND: not allowed for a create, requires a paymentTransactionId.  * CREDIT: add to the account balance  * RELOAD: charge a credit card then add to the account balance  ");
            s.RequestParam(r => r.PaymentMethodId, "Use a specific payment method (CASH), if not provided use default");
            s.RequestParam(r => r.ExternalPaymentId, "Store identifier from external system");
            s.RequestParam(r => r.ExternalDate, "External Date");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateOrderRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

