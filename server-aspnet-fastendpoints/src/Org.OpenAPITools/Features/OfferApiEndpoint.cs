using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Update Offer Locations
/// </summary>

public class BatchUpdateOfferLocationsEndpoint : FastEndpoints.Endpoint<BatchUpdateOfferLocationsRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/retailer/offer/location/batchUpdate");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Offer");
        });

        Summary(s => {
            s.Summary = "Update Offer Locations";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Data, "JSON string in the following format: &#x60;&#x60;&#x60;json [{   \&quot;offerLocationId\&quot;: 1705,   \&quot;latitude\&quot;: 54.0,   \&quot;longitude\&quot;: -122.0,   \&quot;altitude\&quot;: 1.0,   \&quot;locationDetail\&quot;: \&quot;floor 1\&quot;,   \&quot;locationDescription\&quot;: \&quot;behind the Coke sign\&quot; }, {   \&quot;offerLocationId\&quot;: 1704,   \&quot;latitude\&quot;: 54.1,   \&quot;longitude\&quot;: -122.1 }] &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(BatchUpdateOfferLocationsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Offer
/// </summary>

public class CreateOfferEndpoint : FastEndpoints.Endpoint<CreateOfferRequest, RetailerOfferResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/retailer/offer/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Offer");
        });

        Summary(s => {
            s.Summary = "Create Offer";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.IncludeOfferLocations, "If true return all the offer locations associated with the offer");
            s.RequestParam(r => r.Title, "The title (255 char limit)");
            s.RequestParam(r => r.BarcodeType, "The bar code type {NONE, UPC, CODE_128, QR, CUSTOM_MEDIA}");
            s.RequestParam(r => r.NoExpiration, "Overrides the expiration date so that the offer does not expire");
            s.RequestParam(r => r.AvailableLimit, "The limit of how many times the offer can be used by consumers");
            s.RequestParam(r => r.AvailableLimitPerUser, "The limit of how many times a user can used the same offer");
            s.RequestParam(r => r.AddedLimit, "The limit of how many times the offer can be added to consumer wallets");
            s.RequestParam(r => r.ViewLimit, "The limit of how many times the offer can be viewed");
            s.RequestParam(r => r.MaxPrints, "The maximum number of times the offer can be printed");
            s.RequestParam(r => r.TicketPrice, "The cost of the offer in tickets");
            s.RequestParam(r => r.FullPrice, "The retail/full price cost of the offer in real currency");
            s.RequestParam(r => r.DiscountPrice, "The cost of the offer at a discounted price (what the consumer pays)");
            s.RequestParam(r => r.OfferType, "The offer type {VOUCHER, COUPON, PRODUCT, EVENT, MEDIA, DEVICE}");
            s.RequestParam(r => r.SpecialOfferType, "The special offer type {ALL, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}");
            s.RequestParam(r => r.OfferVisibility, "The offer visibility {PUBLIC, REWARDABLE, TRIGGERABLE}");
            s.RequestParam(r => r.Active, "Sets the active flag");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id (deviceId or accountId required)");
            s.RequestParam(r => r.Tags, "Custom string field for doing full-text searches");
            s.RequestParam(r => r.ParentOfferId, "the parent offer id");
            s.RequestParam(r => r.RetailerLocationIds, "Comma separated list of retailer location ids. This will assign the offer to these retailer locations.");
            s.RequestParam(r => r.OfferLocations, "A list of json data that has offer location specific values.");
            s.RequestParam(r => r.SubTitle, "The sub title (255 char limit)");
            s.RequestParam(r => r.Details, "The details");
            s.RequestParam(r => r.SubDetails, "A string for custom details (255 char limit)");
            s.RequestParam(r => r.FinePrint, "The fine print");
            s.RequestParam(r => r.BarcodeEntry, "The bar code entry string");
            s.RequestParam(r => r.ExternalRedeemOptions, "An external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer");
            s.RequestParam(r => r.ExternalUrl, "The clickUrl of the offer");
            s.RequestParam(r => r.ExternalId, "an external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer");
            s.RequestParam(r => r.TicketsRewardType, "The type of ticket to reward, null means default type");
            s.RequestParam(r => r.TicketsReward, "Determines how many tickets are awarded");
            s.RequestParam(r => r.Activated, "The date of when the offer will be visible to consumers");
            s.RequestParam(r => r.Expires, "The date of when the offer expires");
            s.RequestParam(r => r.TicketPriceType, "the type of ticket needed to buy offer");
            s.RequestParam(r => r.ShowRemaining, "show remaining offers available");
            s.RequestParam(r => r.ShowRedeemed, "show how many offers have been redeemed");
            s.RequestParam(r => r.Replaced, "");
            s.RequestParam(r => r.Featured, "flag if offer is featured or not");
            s.RequestParam(r => r.CategoryIds, "Comma separated list of category ids");
            s.RequestParam(r => r.FilterIds, "Comma separated list of filter ids");
            s.RequestParam(r => r.BarcodeAssetId, "The id of the barcode asset");
            s.RequestParam(r => r.ImageAssetId, "The id of the an offer asset");
            s.RequestParam(r => r.ImageAssetId1, "The id of the an offer asset");
            s.RequestParam(r => r.ImageAssetId2, "The id of the an offer asset");
            s.RequestParam(r => r.ImageAssetId3, "The id of the an offer asset");
            s.RequestParam(r => r.ImageAssetId4, "The id of the an offer asset");
            s.RequestParam(r => r.ImageAssetId5, "The id of the an offer asset");
            s.RequestParam(r => r.Publisher, "The maker of the item.");
            s.RequestParam(r => r.RedeemableStart, "The redeemable start date/time of the offer.");
            s.RequestParam(r => r.RedeemableEnd, "The redeemable start date/time of the offer.");
            s.RequestParam(r => r.Brand, "The brand. OfferType PRODUCT only.");
            s.RequestParam(r => r.ProductType, "The product type. OfferType PRODUCT only.");
            s.RequestParam(r => r.ConditionType, "The condition. OfferType PRODUCT only.");
            s.RequestParam(r => r.Isbn, "The ISBN id. OfferType PRODUCT only.");
            s.RequestParam(r => r.Asin, "The ASIN id. OfferType PRODUCT only.");
            s.RequestParam(r => r.CatalogNumbers, "The list of catelog numbers, comma seperated. OfferType PRODUCT only.");
            s.RequestParam(r => r.Department, "The department name. The OfferType PRODUCT only.");
            s.RequestParam(r => r.Features, "The list of features, comma seperated. OfferType PRODUCT only.");
            s.RequestParam(r => r.MinimumPrice, "The MAP price. OfferType PRODUCT only.");
            s.RequestParam(r => r.Width, "The width of the item. OfferType PRODUCT only.");
            s.RequestParam(r => r.Height, "The height of the item. OfferType PRODUCT only.");
            s.RequestParam(r => r.Depth, "The depth of the item. OfferType PRODUCT only.");
            s.RequestParam(r => r.Weight, "The weight of the item. OfferType PRODUCT only.");
            s.RequestParam(r => r.Unit, "The unit of measurement. OfferType PRODUCT only.");
            s.RequestParam(r => r.Studio, "The studio name. OfferType PRODUCT only.");
            s.RequestParam(r => r.ParentalRating, "The parental control rating. OfferType PRODUCT only.");
            s.RequestParam(r => r.PublishDate, "The date published. OfferType PRODUCT only.");
            s.RequestParam(r => r.AvailabilityDate, "The date available. OfferType PRODUCT only.");
            s.RequestParam(r => r.SizeId, "");
            s.RequestParam(r => r.ListingId, "The ID of the event listing");
            s.RequestParam(r => r.MediaType, "the media type of the offer");
            s.RequestParam(r => r.Duration, "The total playing time of the media item. OfferType MEDIA only.");
            s.RequestParam(r => r.Author, "The created/author of the media item. OfferType MEDIA only.");
            s.RequestParam(r => r.ReleaseDate, "The date/time of when the media item was originally released. OfferType MEDIA only.");
            s.RequestParam(r => r.CollectionIds, "");
            s.RequestParam(r => r.RebootTimeHour, "The reboot hour time ranging from 0 to 23");
            s.RequestParam(r => r.RebootTimeMinute, "The reboot minute time ranging from 0 to 59");
            s.RequestParam(r => r.IdleTimeoutInSecond, "If the device is idle for idleTimeoutInSecond then the device should timeout");
            s.RequestParam(r => r.SerialNumber, "The serial number on the device");
            s.RequestParam(r => r.Udid, "The unique device id for the device");
            s.RequestParam(r => r.DeviceType, "The type of the device, for example: \&quot;Kiosk\&quot;, \&quot;Beacon\&quot;.");
            s.RequestParam(r => r.DevicePower, "Edysen device power level setting");
            s.RequestParam(r => r.DeviceInterference, "Edysen device inteference setting");
            s.RequestParam(r => r.Availability, "");
            s.RequestParam(r => r.AvailabilitySummary, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateOfferRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Offer
/// </summary>

public class DeleteOfferEndpoint : FastEndpoints.Endpoint<DeleteOfferRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/retailer/offer/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Offer");
        });

        Summary(s => {
            s.Summary = "Delete Offer";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.OfferId, "The ID of the offer to be deleted");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account used to perform the delete, must have rights to edit the offer.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteOfferRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Offer Location
/// </summary>

public class DeleteOfferLocationEndpoint : FastEndpoints.Endpoint<DeleteOfferLocationRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/retailer/offer/location/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Offer");
        });

        Summary(s => {
            s.Summary = "Delete Offer Location";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.OfferLocationId, "The ID of the offer location to be deleted");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account used to perform the delete, must have rights to edit the offer location.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteOfferLocationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Offer
/// </summary>

public class GetOfferEndpoint : FastEndpoints.Endpoint<GetOfferRequest, RetailerOfferResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/retailer/offer/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Offer");
        });

        Summary(s => {
            s.Summary = "Get Offer";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.OfferId, "The id of the offer");
            s.RequestParam(r => r.IncludeOfferLocations, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id (deviceId or accountId required)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetOfferRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Offer
/// </summary>

public class GetOfferDetailsEndpoint : FastEndpoints.Endpoint<GetOfferDetailsRequest, OfferResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/offer/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Offer");
        });

        Summary(s => {
            s.Summary = "Get Offer";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id for returning account information (i.e. favorites)");
            s.RequestParam(r => r.AccountId, "The account id for returning account information (i.e. favorites)");
            s.RequestParam(r => r.OfferId, "The offer id (either offeLocationId or offerId must be provided)");
            s.RequestParam(r => r.OfferLocationId, "The offer location id (either offeLocationId or offerId must be provided)");
            s.RequestParam(r => r.Distance, "The distance of the offer from the user&#39;s current location (this is returned when the offer is searched)");
            s.RequestParam(r => r.Latitude, "The latitude to calculate distance from the offer");
            s.RequestParam(r => r.Longitude, "The longitude to calculate distance from the offer");
            s.RequestParam(r => r.IncludeOfferLocations, "Determines whether to return offer locations for the offer");
            s.RequestParam(r => r.IncludeRetailerLocations, "Determines whether to return the retailer location info for each offer location response (includeOfferLocations must also be true for this to work)");
            s.RequestParam(r => r.IncludeChildOffers, "Determines whether to include child offers in the response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetOfferDetailsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Offers (Counts)
/// </summary>

public class GetOfferListCountsEndpoint : FastEndpoints.Endpoint<GetOfferListCountsRequest, ListCountResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/offer/lists/count");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Offer");
        });

        Summary(s => {
            s.Summary = "Get Offers (Counts)";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Latitude, "The latitude of where the search will center at");
            s.RequestParam(r => r.Longitude, "The longitude of where the search will center at");
            s.RequestParam(r => r.SearchRange, "The range of the search");
            s.RequestParam(r => r.DistanceUnit, "The units to use for distance calculations (e.g. MILES, KILOMETERS)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetOfferListCountsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Offer Location
/// </summary>

public class GetOfferLocationEndpoint : FastEndpoints.Endpoint<GetOfferLocationRequest, OfferShortResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/offer/location/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Offer");
        });

        Summary(s => {
            s.Summary = "Get Offer Location";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.OfferLocationId, "the id of the offer location to get");
            s.RequestParam(r => r.Udid, "the UDID of the device");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetOfferLocationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Offer Locations
/// </summary>

public class GetOfferLocationsForRetailersEndpoint : FastEndpoints.Endpoint<GetOfferLocationsForRetailersRequest, List<OfferShortResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/retailer/offer/location/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Offer");
        });

        Summary(s => {
            s.Summary = "Search Offer Locations";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.SortField, "The column to sort the results on. Default is \&quot;TITLE\&quot;, which will sort the results by the offer title. Possible input values: {CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, RETAILER_ID,RETAILER_LOCATION_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY}");
            s.RequestParam(r => r.Descending, "The order to return the results. Default is false, which will return the results in ascending order.");
            s.RequestParam(r => r.Start, "The index into the record set to start with. Default is 0.");
            s.RequestParam(r => r.Limit, "The total number of records to return. Default is 20.");
            s.RequestParam(r => r.ActiveOnly, "Determines whether to return only active results. Default is false.");
            s.RequestParam(r => r.IncludeRetailerLocation, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Keyword, "The keyword used to search");
            s.RequestParam(r => r.RetailerId, "Filter results for a specific retailer");
            s.RequestParam(r => r.RetailerLocationId, "Filter results for a specific retailer location");
            s.RequestParam(r => r.OfferType, "Filter results to only return COUPON, VOUCHER, PRODUCT, MEDIA, or EVENT offers");
            s.RequestParam(r => r.SpecialOfferType, "Filter results to only return REGULAR_OFFER, ACT_NOW, GET_THERE_NOW offer specials");
            s.RequestParam(r => r.BarcodeType, "");
            s.RequestParam(r => r.BarcodeEntry, "");
            s.RequestParam(r => r.Isbn, "");
            s.RequestParam(r => r.Asin, "");
            s.RequestParam(r => r.DeviceStatus, "Edysen device status, running, warning, or down");
            s.RequestParam(r => r.NeedsNotificationSent, "");
            s.RequestParam(r => r.LastNotificationSent, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetOfferLocationsForRetailersRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Offers
/// </summary>

public class GetOffersForRetailersEndpoint : FastEndpoints.Endpoint<GetOffersForRetailersRequest, List<OfferResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/retailer/offer/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Offer");
        });

        Summary(s => {
            s.Summary = "Search Offers";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.OfferVisibility, "");
            s.RequestParam(r => r.SortField, "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY");
            s.RequestParam(r => r.Descending, "The order to return the search results");
            s.RequestParam(r => r.Start, "The record to begin the return set on");
            s.RequestParam(r => r.Limit, "The number of records to return");
            s.RequestParam(r => r.AvailableOnly, "Return only results that are currently being promoted (is activated and not expired)");
            s.RequestParam(r => r.ActiveOnly, "Return only active results");
            s.RequestParam(r => r.IncludeCategories, "");
            s.RequestParam(r => r.IncludeFilters, "");
            s.RequestParam(r => r.IncludeOfferLocations, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.CategoryIds, "");
            s.RequestParam(r => r.FilterIds, "");
            s.RequestParam(r => r.Q, "This parameter is deprecated.");
            s.RequestParam(r => r.Keyword, "The keyword used to search");
            s.RequestParam(r => r.RetailerId, "the id of the retailer");
            s.RequestParam(r => r.RetailerLocationId, "the id of the retailer location");
            s.RequestParam(r => r.CouponType, "This parameter is deprecated.");
            s.RequestParam(r => r.OfferType, "This parameter is deprecated. Use offer types. Filter results to only return COUPON, VOUCHER, PRODUCT, MEDIA, or EVENT offers");
            s.RequestParam(r => r.OfferTypes, "Comma separated list of offer types {COUPON, VOUCHER, PRODUCT, MEDIA, EVENT, DEVICE}");
            s.RequestParam(r => r.SpecialOfferType, "Filter results to only return REGULAR_OFFER, ACT_NOW, GET_THERE_NOW offer specials");
            s.RequestParam(r => r.I, "This parameter is deprecated.");
            s.RequestParam(r => r.L, "This parameter is deprecated.");
            s.RequestParam(r => r.BarcodeType, "");
            s.RequestParam(r => r.BarcodeEntry, "");
            s.RequestParam(r => r.Isbn, "");
            s.RequestParam(r => r.Asin, "");
            s.RequestParam(r => r.DeviceStatus, "Edysen device status");
            s.RequestParam(r => r.NeedsNotificationSent, "");
            s.RequestParam(r => r.LastNotificationSent, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetOffersForRetailersRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Offer Transaction
/// </summary>

public class RedeemOfferTransactionEndpoint : FastEndpoints.Endpoint<RedeemOfferTransactionRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/retailer/offer/transaction/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Offer");
        });

        Summary(s => {
            s.Summary = "Update Offer Transaction";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.OfferTransactionId, "the OfferTransaction ID of the transaction being redeemed");
            s.RequestParam(r => r.Status, "the status to set the offer transaction to - 1 sets it to redeemable and 2 sets it to redeemed");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.OfferLocationId, "the OfferLocation ID where the offer is being redeemed");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RedeemOfferTransactionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Offer Transactions
/// </summary>

public class SearchOfferTransactionsForRetailersEndpoint : FastEndpoints.Endpoint<SearchOfferTransactionsForRetailersRequest, List<OfferTransactionResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/retailer/offer/transaction/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Offer");
        });

        Summary(s => {
            s.Summary = "Search Offer Transactions";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.SortField, "Determines what to sort the results by {CREATED, UPDATED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY}");
            s.RequestParam(r => r.Descending, "Determines whether the results are in descending order");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.RequestParam(r => r.ActiveOnly, "Determines whether to only return active offer transactions");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Q, "This parameter is deprecated.");
            s.RequestParam(r => r.Keyword, "The keyword to search for");
            s.RequestParam(r => r.RetailerId, "Filter results for this retailer");
            s.RequestParam(r => r.RetailerLocationId, "Filter results for this retailer location");
            s.RequestParam(r => r.OfferId, "Filter results for this offer");
            s.RequestParam(r => r.OfferLocationId, "Filter results for this offer location");
            s.RequestParam(r => r.Redeemed, "if true return redeemed transactions (status 2), if false return active transactions (status 0 or 1)");
            s.RequestParam(r => r.ReservationsOnly, "returns only reservation transactions if true");
            s.RequestParam(r => r.CouponType, "This parameter is deprecated.");
            s.RequestParam(r => r.OfferType, "Filter results to only return COUPON, VOUCHER, PRODUCT, MEDIA, or EVENT offers");
            s.RequestParam(r => r.SpecialOfferType, "Filter results to only return REGULAR_OFFER, ACT_NOW, GET_THERE_NOW offer specials");
            s.RequestParam(r => r.CustomerAccountIds, "Filter results by accounts");
            s.RequestParam(r => r.CategoryIds, "");
            s.RequestParam(r => r.RedeemableStartDate, "");
            s.RequestParam(r => r.RedeemableEndDate, "");
            s.RequestParam(r => r.I, "This parameter is deprecated.");
            s.RequestParam(r => r.L, "This parameter is deprecated.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchOfferTransactionsForRetailersRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Offers
/// </summary>

public class SearchOffersForConsumerEndpoint : FastEndpoints.Endpoint<SearchOffersForConsumerRequest, OfferListResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/offer/lists");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Offer");
        });

        Summary(s => {
            s.Summary = "Search Offers";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Latitude, "The latitude of where the search will center at");
            s.RequestParam(r => r.Longitude, "The longitude of where the search will center at");
            s.RequestParam(r => r.RecommendationType, "The method to use to gather recommendations: WALLET base relevance on items in users wallets CLICKS base relevance on items users have clicked on BLENDED blend using all methods available");
            s.RequestParam(r => r.LocationId, "This parameter is deprecated. The location id");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.RequestParam(r => r.MaxRecommendations, "");
            s.RequestParam(r => r.DistanceUnit, "");
            s.RequestParam(r => r.AppKey, "The application key used to identify the application");
            s.RequestParam(r => r.DeviceId, "The device id for returning account information (i.e. offer transactions made by the user)");
            s.RequestParam(r => r.AccountId, "The account id for returning account information (i.e. offer transactions made by the user)");
            s.RequestParam(r => r.SearchRange, "The range of the search");
            s.RequestParam(r => r.Tags, "Does a full-text search on tags");
            s.RequestParam(r => r.SupportedPostalCodes, "supported postal codes");
            s.RequestParam(r => r.Keyword, "The keyword to filter results by");
            s.RequestParam(r => r.Categories, "Comma separate list of category ids");
            s.RequestParam(r => r.Filters, "Comma separated list of filter ids");
            s.RequestParam(r => r.OfferTypes, "Comma separated list of offer types {COUPON, VOUCHER, PRODUCT, MEDIA, EVENT, DEVICE}");
            s.RequestParam(r => r.Type, "The special offer type {ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}");
            s.RequestParam(r => r.SortField, "The field to sort the result set on:DISTANCE Sort the offers nearest to farthest BUSINESS_NAME Sort the offers alphabetically by location name SHUFFLE Sort the nearest offers randomly USERPREFS accountId must accompany this parameter. Gives the first X recommendations where X equals the parameter maxRecommendations");
            s.RequestParam(r => r.RecommendOfferIds, "Return recommendations based on these offers IDs");
            s.RequestParam(r => r.RetailerLocationIds, "Only return offer locations for the specific retailer locations.");
            s.RequestParam(r => r.OfferId, "Only return offer locations for the specific offer.");
            s.RequestParam(r => r.IncludeMission, "If true include the mission response as part of the offer. Default is false.");
            s.RequestParam(r => r.IncludeCategories, "If true include the category list response as part of the offer. Default is false.");
            s.RequestParam(r => r.IncludeFilters, "If true include the filter list response as part of the offer. Default is false.");
            s.RequestParam(r => r.IncludeExpired, "If true then ignore the expired dates. Default is false.");
            s.RequestParam(r => r.IncludeFavorite, "If true then ignore the favorite. Default is false.");
            s.RequestParam(r => r.ClosestOfferOnly, "This parameter is deprecated. see groupBy. If true then it only returns the offer location for an offer closest to the given lat/lon");
            s.RequestParam(r => r.SearchExpression, "");
            s.RequestParam(r => r.GroupBy, "groups the results by a certain field. For example, if you want to return the closest offer location of an offer, then pass in groupBy&#x3D;OFFER_ID and sortField&#x3D;DISTANCE (to sort by distance).");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchOffersForConsumerRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Offers (Top)
/// </summary>

public class TopOfferTransactionsEndpoint : FastEndpoints.Endpoint<TopOfferTransactionsRequest, OfferListResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/offer/top");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Offer");
        });

        Summary(s => {
            s.Summary = "Get Offers (Top)";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Start, "The index into the record set to start with. Default is 0.");
            s.RequestParam(r => r.Limit, "The total number of record to return. Default id 20.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(TopOfferTransactionsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Offer
/// </summary>

public class UpdateOfferEndpoint : FastEndpoints.Endpoint<UpdateOfferRequest, RetailerOfferResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/retailer/offer/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Offer");
        });

        Summary(s => {
            s.Summary = "Update Offer";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.OfferId, "The offer to update");
            s.RequestParam(r => r.IncludeOfferLocations, "If true return all the offer locations associated with the offer");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account used to perform the update, must have rights to edit the offer (deviceId or accountId required)");
            s.RequestParam(r => r.ParentOfferId, "");
            s.RequestParam(r => r.RetailerLocationIds, "Comma separated list of retailer location ids. This will assign the offer to these retailer locations.");
            s.RequestParam(r => r.OfferLocations, "A list of json data that has offer location specific values.");
            s.RequestParam(r => r.Tags, "Custom string field for doing full-text searches");
            s.RequestParam(r => r.Title, "The title (255 char limit)");
            s.RequestParam(r => r.SubTitle, "The sub title (255 char limit)");
            s.RequestParam(r => r.Details, "The details");
            s.RequestParam(r => r.SubDetails, "A string for custom details (255 char limit)");
            s.RequestParam(r => r.FinePrint, "The fine print");
            s.RequestParam(r => r.BarcodeType, "The bar code type {NONE, UPC, CODE_128, QR, CUSTOM_MEDIA}");
            s.RequestParam(r => r.BarcodeEntry, "The bar code entry string");
            s.RequestParam(r => r.ExternalRedeemOptions, "An external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer.");
            s.RequestParam(r => r.ExternalUrl, "The clickUrl of the offer");
            s.RequestParam(r => r.ExternalId, "");
            s.RequestParam(r => r.TicketsRewardType, "The type of ticket to reward, null means default type");
            s.RequestParam(r => r.TicketsReward, "Determines how many tickets are awarded");
            s.RequestParam(r => r.Activated, "The date of when the offer will be visible to consumers");
            s.RequestParam(r => r.Expires, "The date of when the offer expires");
            s.RequestParam(r => r.NoExpiration, "Overrides the expiration date so that the offer does not expire");
            s.RequestParam(r => r.AvailableLimit, "The limit of how many times the offer can be used by consumers");
            s.RequestParam(r => r.AvailableLimitPerUser, "The limit of how many times a user can used the same offer");
            s.RequestParam(r => r.AddedLimit, "The limit of how many times the offer can be added to consumer wallets");
            s.RequestParam(r => r.ViewLimit, "");
            s.RequestParam(r => r.MaxPrints, "The maximum number of times the offer can be printed");
            s.RequestParam(r => r.TicketPriceType, "the type of ticket needed to buy the offer");
            s.RequestParam(r => r.TicketPrice, "The cost of the offer in tickets");
            s.RequestParam(r => r.FullPrice, "The retail/full price cost of the offer in real currency");
            s.RequestParam(r => r.DiscountPrice, "The cost of the offer at a discounted price (what the consumer pays)");
            s.RequestParam(r => r.ShowRemaining, "show remaining offers available");
            s.RequestParam(r => r.ShowRedeemed, "show how many offers have been redeemed");
            s.RequestParam(r => r.Replaced, "");
            s.RequestParam(r => r.Featured, "whether the offer is featured or not");
            s.RequestParam(r => r.OfferType, "The offer type {VOUCHER, COUPON, PRODUCT, MEDIA, EVENT}");
            s.RequestParam(r => r.SpecialOfferType, "The special offer type {ALL, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}");
            s.RequestParam(r => r.OfferVisibility, "The offer visibility {PUBLIC, REWARDABLE, TRIGGERABLE}");
            s.RequestParam(r => r.CategoryIds, "Comma separated list of category ids");
            s.RequestParam(r => r.FilterIds, "Comma separated list of filter ids");
            s.RequestParam(r => r.Active, "Sets the active flag");
            s.RequestParam(r => r.BarcodeAssetId, "The id of the barcode asset");
            s.RequestParam(r => r.ImageAssetId, "The id of the an offer asset");
            s.RequestParam(r => r.ImageAssetId1, "The id of the an offer asset");
            s.RequestParam(r => r.ImageAssetId2, "The id of the an offer asset");
            s.RequestParam(r => r.ImageAssetId3, "The id of the an offer asset");
            s.RequestParam(r => r.ImageAssetId4, "The id of the an offer asset");
            s.RequestParam(r => r.ImageAssetId5, "The id of the an offer asset");
            s.RequestParam(r => r.Publisher, "The maker of the item.");
            s.RequestParam(r => r.RedeemableStart, "The redeemable start date/time of the offer.");
            s.RequestParam(r => r.RedeemableEnd, "The redeemable start date/time of the offer.");
            s.RequestParam(r => r.Brand, "The brand. OfferType PRODUCT only.");
            s.RequestParam(r => r.ProductType, "The product type. OfferType PRODUCT only.");
            s.RequestParam(r => r.ConditionType, "The condition. OfferType PRODUCT only.");
            s.RequestParam(r => r.Isbn, "The ISBN id. OfferType PRODUCT only.");
            s.RequestParam(r => r.Asin, "The ASIN id. OfferType PRODUCT only.");
            s.RequestParam(r => r.CatalogNumbers, "The list of catelog numbers, comma seperated. OfferType PRODUCT only.");
            s.RequestParam(r => r.Department, "The department name. The OfferType PRODUCT only.");
            s.RequestParam(r => r.Features, "The list of features, comma seperated. OfferType PRODUCT only.");
            s.RequestParam(r => r.MinimumPrice, "The MAP price. OfferType PRODUCT only.");
            s.RequestParam(r => r.Width, "The width of the item. OfferType PRODUCT only.");
            s.RequestParam(r => r.Height, "The height of the item. OfferType PRODUCT only.");
            s.RequestParam(r => r.Depth, "The depth of the item. OfferType PRODUCT only.");
            s.RequestParam(r => r.Weight, "The weight of the item. OfferType PRODUCT only.");
            s.RequestParam(r => r.Unit, "The unit of measurement. OfferType PRODUCT only.");
            s.RequestParam(r => r.Studio, "The studio name. OfferType PRODUCT only.");
            s.RequestParam(r => r.ParentalRating, "The parental control rating. OfferType PRODUCT only.");
            s.RequestParam(r => r.PublishDate, "The date published. OfferType PRODUCT only.");
            s.RequestParam(r => r.AvailabilityDate, "The date available. OfferType PRODUCT only.");
            s.RequestParam(r => r.SizeId, "The size Id. OfferType PRODUCT only.");
            s.RequestParam(r => r.ListingId, "The ID of the event listing");
            s.RequestParam(r => r.MediaType, "");
            s.RequestParam(r => r.Duration, "The total playing time of the media item. OfferType MEDIA only.");
            s.RequestParam(r => r.Author, "The created/author of the media item. OfferType MEDIA only.");
            s.RequestParam(r => r.ReleaseDate, "The date/time of when the media item was originally released. OfferType MEDIA only.");
            s.RequestParam(r => r.CollectionIds, "");
            s.RequestParam(r => r.RebootTimeHour, "The reboot hour time ranging from 0 to 23");
            s.RequestParam(r => r.RebootTimeMinute, "The reboot minute time ranging from 0 to 59");
            s.RequestParam(r => r.IdleTimeoutInSecond, "If the device is idle for idleTimeoutInSecond then the device should timeout");
            s.RequestParam(r => r.SerialNumber, "The serial number on the device");
            s.RequestParam(r => r.Udid, "The unique device id for the device");
            s.RequestParam(r => r.DeviceType, "The type of the device, for example: \&quot;Kiosk\&quot;, \&quot;Beacon\&quot;.");
            s.RequestParam(r => r.DevicePower, "RSSI reading at 1 meter from device (-10 to -140)");
            s.RequestParam(r => r.DeviceInterference, "");
            s.RequestParam(r => r.Availability, "");
            s.RequestParam(r => r.AvailabilitySummary, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateOfferRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Activate Offer
/// </summary>

public class UpdateOfferStatusEndpoint : FastEndpoints.Endpoint<UpdateOfferStatusRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/retailer/offer/status");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Offer");
        });

        Summary(s => {
            s.Summary = "Activate Offer";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.OfferIds, "Comma separated list of offer ids");
            s.RequestParam(r => r.Active, "Determines whether to make the offer active as well");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account used to perform the activation, must have rights to edit the offer.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateOfferStatusRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

