using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Wallet Offers
/// </summary>

public class CreateOfferTransactionEndpoint : FastEndpoints.Endpoint<CreateOfferTransactionRequest, List<OfferTransactionResponse>>
{
    public override void Configure()
    {
        Post("/api/{version}/wallet/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Wallet");
        });

        Summary(s => {
            s.Summary = "Create Wallet Offers";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.OfferId, "The id of the offer being added (offerId or offeLocationId required)");
            s.RequestParam(r => r.OfferLocationId, "The id of the offer location being added (offerId or offeLocationId required)");
            s.RequestParam(r => r.OfferCart, "A JSON list of offers to purchase. &#x60;&#x60;&#x60;json [   {     \&quot;offerId\&quot;: 123,     \&quot;offerLocationId\&quot;: 234,     \&quot;quantity\&quot;: 2   },   {     \&quot;offerId\&quot;: 456,     \&quot;offerLocationId\&quot;: 567,     \&quot;quantity\&quot;: 1   } ] &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.PromoCode, "The promoCode");
            s.RequestParam(r => r.CurrencyType, "Determines the method of purchasing offer. CASH &#x3D; use card on file, POINTS &#x3D; use points, TICKETS &#x3D; use tickets");
            s.RequestParam(r => r.UsePoints, "Sets the currencyType to POINTS");
            s.RequestParam(r => r.MetaData, "External custom client defined data");
            s.RequestParam(r => r.AppKey, "The application requesting the purchase, required when currencyType is TICKETS");
            s.RequestParam(r => r.Status, "Custom status value to change to (0 or 1 for redeem, 5 or 6 for membership)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateOfferTransactionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Wallet Offer
/// </summary>

public class DeleteOfferTransactionEndpoint : FastEndpoints.Endpoint<DeleteOfferTransactionRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/wallet/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Wallet");
        });

        Summary(s => {
            s.Summary = "Delete Wallet Offer";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.TransactionId, "The offer transaction id to remove");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteOfferTransactionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Wallet Offer
/// </summary>

public class GetOfferTransactionEndpoint : FastEndpoints.Endpoint<GetOfferTransactionRequest, OfferTransactionResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/wallet/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Wallet");
        });

        Summary(s => {
            s.Summary = "Get Wallet Offer";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.TransactionId, "The offer transaction id to get details of");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.IncludeMission, "If true then include mission data, false to not include");
            s.RequestParam(r => r.Latitude, "The latitude location of the user");
            s.RequestParam(r => r.Longitude, "The latitude location of the user");
            s.RequestParam(r => r.ReturnFullResponse, "Determines whether to return a detailed version of the response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetOfferTransactionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Preview Wallet Offers
/// </summary>

public class PreviewOfferTransactionEndpoint : FastEndpoints.Endpoint<PreviewOfferTransactionRequest, List<OfferTransactionResponse>>
{
    public override void Configure()
    {
        Post("/api/{version}/wallet/preview");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Wallet");
        });

        Summary(s => {
            s.Summary = "Preview Wallet Offers";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.OfferId, "The id of the offer being added (offerId or offeLocationId required)");
            s.RequestParam(r => r.OfferLocationId, "The id of the offer location being added (offerId or offeLocationId required)");
            s.RequestParam(r => r.OfferCart, "A JSON list of offers to purchase.");
            s.RequestParam(r => r.PromoCode, "The promoCode");
            s.RequestParam(r => r.CurrencyType, "Determines the method of purchasing offer. CASH &#x3D; use card on file, POINTS &#x3D; use points, TICKETS &#x3D; use tickets");
            s.RequestParam(r => r.UsePoints, "Sets the currencyType to POINTS");
            s.RequestParam(r => r.MetaData, "External custom client defined data");
            s.RequestParam(r => r.AppKey, "The application requesting the purchase, required when currencyType is TICKETS");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(PreviewOfferTransactionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Wallet Offers
/// </summary>

public class SearchOfferTransactionsEndpoint : FastEndpoints.Endpoint<SearchOfferTransactionsRequest, List<OfferTransactionResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/wallet/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Wallet");
        });

        Summary(s => {
            s.Summary = "Search Wallet Offers";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Keyword, "The keyword to search for");
            s.RequestParam(r => r.RetailerId, "Filter results for this retailer");
            s.RequestParam(r => r.RetailerIds, "Filter results for a list of retailers");
            s.RequestParam(r => r.RetailerLocationId, "Filter results for this retailer location");
            s.RequestParam(r => r.RetailerLocationIds, "Filter results for a list of retailer locations");
            s.RequestParam(r => r.ExcludeRetailerLocationIds, "Filter results to exclude retailer locations");
            s.RequestParam(r => r.OfferId, "Filter results for this offer");
            s.RequestParam(r => r.OfferIds, "Filter results for a list of offer");
            s.RequestParam(r => r.OfferLocationId, "Filter results for this offer location");
            s.RequestParam(r => r.OfferLocationIds, "Filter results for a list of offer locations");
            s.RequestParam(r => r.OfferType, "Filter results to return a specific offer type");
            s.RequestParam(r => r.OfferTypes, "Filter results to return specific offer types");
            s.RequestParam(r => r.SpecialOfferType, "Filter results to return a specific special offer type");
            s.RequestParam(r => r.SpecialOfferTypes, "Filter results to return specific special offer types");
            s.RequestParam(r => r.CategoryIds, "Category Ids");
            s.RequestParam(r => r.FilterIds, "Filter Ids");
            s.RequestParam(r => r.OfferAudienceIds, "Offer Audience Ids");
            s.RequestParam(r => r.SortField, "Determines what to sort the results by");
            s.RequestParam(r => r.Descending, "Determines whether the results are in descending order");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.RequestParam(r => r.Latitude, "The latitude location of the user");
            s.RequestParam(r => r.Longitude, "The latitude location of the user");
            s.RequestParam(r => r.RedeemableStartDate, "Filter results by the offer redeemable date");
            s.RequestParam(r => r.RedeemableEndDate, "Filter results by the offer redeemable date");
            s.RequestParam(r => r.FilterByParentOffer, "Apply params to offer&#39;s parent");
            s.RequestParam(r => r.StartedSince, "Filter results by the offer start date");
            s.RequestParam(r => r.StartedBefore, "Filter results by the offer start date");
            s.RequestParam(r => r.EndedSince, "Filter results by the offer end date");
            s.RequestParam(r => r.EndedBefore, "Filter results by the offer end date");
            s.RequestParam(r => r.Redeemed, "If true return redeemed transactions (status 2), otherwise return active transactions (status 0 or 1)");
            s.RequestParam(r => r.Statuses, "Custom status value to change to (0 or 1 for redeem, 5 or 6 for membership)");
            s.RequestParam(r => r.ReservationsOnly, "Returns only reservation transactions if true");
            s.RequestParam(r => r.ActiveOnly, "Active Only");
            s.RequestParam(r => r.ReturnFullResponse, "Determines whether to return a detailed version of the response");
            s.RequestParam(r => r.RecurringStartedSince, "Filter results by the recurring billing start date");
            s.RequestParam(r => r.RecurringStartedBefore, "Filter results by the recurring billing start date");
            s.RequestParam(r => r.RecurringExpirationSince, "Filter results by the recurring billing expiration date");
            s.RequestParam(r => r.RecurringExpirationBefore, "Filter results by the recurring billing expiration date");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchOfferTransactionsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Wallet Offer
/// </summary>

public class UpdateOfferTransactionEndpoint : FastEndpoints.Endpoint<UpdateOfferTransactionRequest, OfferTransactionResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/wallet/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Wallet");
        });

        Summary(s => {
            s.Summary = "Update Wallet Offer";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.TransactionId, "The offer transaction id to remove");
            s.RequestParam(r => r.Status, "The status value to change to (0 or 1)");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.OfferLocationId, "Offer Location Id");
            s.RequestParam(r => r.CurrencyType, "Currency Type");
            s.RequestParam(r => r.UsePoints, "Use Points");
            s.RequestParam(r => r.AppKey, "App Key");
            s.RequestParam(r => r.Latitude, "The latitude location of the user");
            s.RequestParam(r => r.Longitude, "The latitude location of the user");
            s.RequestParam(r => r.MetaData, "External custom client defined data");
            s.RequestParam(r => r.ReturnFullResponse, "Determines whether to return a detailed version of the response");
            s.RequestParam(r => r.ExceptionMembershipOfferIds, "Exception Offers, transaction audiences of these offers won&#39;t be removed out of the account when up");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateOfferTransactionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

