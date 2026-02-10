using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Media
/// </summary>

public class CreateMediaEndpoint : FastEndpoints.Endpoint<CreateMediaRequest, MediaOfferResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/media/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Media");
        });

        Summary(s => {
            s.Summary = "Create Media";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the logged in user");
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
            s.RequestParam(r => r.SpecialOfferType, "The special offer type {ALL, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}");
            s.RequestParam(r => r.OfferVisibility, "The offer visibility {PUBLIC, REWARDABLE, TRIGGERABLE}");
            s.RequestParam(r => r.Active, "Sets the active flag");
            s.RequestParam(r => r.RetailerLocationIds, "Comma separated list of retailer location ids. This will assign the offer to these retailer locations.");
            s.RequestParam(r => r.SubTitle, "The sub title (255 char limit)");
            s.RequestParam(r => r.Details, "The details of the media");
            s.RequestParam(r => r.SubDetails, "A string for custom details (255 char limit)");
            s.RequestParam(r => r.FinePrint, "The fine print of the media");
            s.RequestParam(r => r.BarcodeEntry, "The bar code entry string");
            s.RequestParam(r => r.ExternalRedeemOptions, "An external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer");
            s.RequestParam(r => r.ExternalUrl, "The clickUrl of the offer");
            s.RequestParam(r => r.TicketsRewardType, "The type of ticket to reward, null means default type");
            s.RequestParam(r => r.TicketsReward, "Determines how many tickets are awarded");
            s.RequestParam(r => r.Activated, "The date of when the offer will be visible to consumers");
            s.RequestParam(r => r.Expires, "The date of when the offer expires");
            s.RequestParam(r => r.TicketPriceType, "the type of ticket needed to buy offer");
            s.RequestParam(r => r.ShowRemaining, "show how many of the media is remaining (if there is a limit)");
            s.RequestParam(r => r.ShowRedeemed, "show how many of the media has been redeemed");
            s.RequestParam(r => r.Replaced, "if the media has been replaced");
            s.RequestParam(r => r.Featured, "if the media should be featured or not");
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
            s.RequestParam(r => r.ConditionType, "The condition type of the media");
            s.RequestParam(r => r.Isbn, "The ISBN id");
            s.RequestParam(r => r.Asin, "The ASIN id");
            s.RequestParam(r => r.CatalogNumbers, "The list of catelog numbers, comma seperated");
            s.RequestParam(r => r.ParentalRating, "The parental control rating");
            s.RequestParam(r => r.AvailabilityDate, "The date the media is available to use");
            s.RequestParam(r => r.MediaType, "the media type");
            s.RequestParam(r => r.Duration, "The total playing time of the media item");
            s.RequestParam(r => r.Author, "The created/author of the media item");
            s.RequestParam(r => r.ReleaseDate, "The date/time of when the media item was originally released");
            s.RequestParam(r => r.CollectionIds, "the IDs of the collections this media should be assigned to");
            s.RequestParam(r => r.Availability, "ability to assign if this media should active or not");
            s.RequestParam(r => r.AvailabilitySummary, "ability to assign when the media expires");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateMediaRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Media
/// </summary>

public class DeleteMediaEndpoint : FastEndpoints.Endpoint<DeleteMediaRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/media/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Media");
        });

        Summary(s => {
            s.Summary = "Delete Media";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.MediaId, "the ID of the media to delete");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteMediaRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Media Get
/// </summary>

public class GetMediaEndpoint : FastEndpoints.Endpoint<GetMediaRequest, MediaOfferResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/media/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Media");
        });

        Summary(s => {
            s.Summary = "Media Get";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.MediaId, "the id of the media to get");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetMediaRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Media
/// </summary>

public class SearchMediaEndpoint : FastEndpoints.Endpoint<SearchMediaRequest, List<MediaOfferResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/media/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Media");
        });

        Summary(s => {
            s.Summary = "Search Media";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.ActiveOnly, "Return only active results");
            s.RequestParam(r => r.SortField, "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY, AVAILABILITY_DATE, RELEASE_DATE");
            s.RequestParam(r => r.Descending, "The order to return the search results");
            s.RequestParam(r => r.Keyword, "The keyword used to search");
            s.RequestParam(r => r.CategoryIds, "");
            s.RequestParam(r => r.FilterIds, "");
            s.RequestParam(r => r.Start, "The record to begin the return set on");
            s.RequestParam(r => r.Limit, "The number of records to return");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchMediaRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Media
/// </summary>

public class UpdateMediaEndpoint : FastEndpoints.Endpoint<UpdateMediaRequest, MediaOfferResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/media/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Media");
        });

        Summary(s => {
            s.Summary = "Update Media";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account used to perform the update, must have rights to edit the offer (deviceId or accountId required)");
            s.RequestParam(r => r.MediaId, "");
            s.RequestParam(r => r.RetailerLocationIds, "Comma separated list of retailer location ids. This will assign the offer to these retailer locations.");
            s.RequestParam(r => r.OfferLocations, "A list of json data that has offer location specific values.");
            s.RequestParam(r => r.Title, "The title (255 char limit)");
            s.RequestParam(r => r.SubTitle, "The sub title (255 char limit)");
            s.RequestParam(r => r.Details, "The details");
            s.RequestParam(r => r.SubDetails, "A string for custom details (255 char limit)");
            s.RequestParam(r => r.FinePrint, "The fine print");
            s.RequestParam(r => r.BarcodeType, "The bar code type {NONE, UPC, CODE_128, QR, CUSTOM_MEDIA}");
            s.RequestParam(r => r.BarcodeEntry, "The bar code entry string");
            s.RequestParam(r => r.ExternalRedeemOptions, "An external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer.");
            s.RequestParam(r => r.ExternalUrl, "The clickUrl of the offer");
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
            s.RequestParam(r => r.ShowRemaining, "The show remaining");
            s.RequestParam(r => r.ShowRedeemed, "The show redeemed");
            s.RequestParam(r => r.Replaced, "The replaced");
            s.RequestParam(r => r.Featured, "The featured");
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
            s.RequestParam(r => r.ConditionType, "The condition. OfferType PRODUCT only.");
            s.RequestParam(r => r.Isbn, "The ISBN id. OfferType PRODUCT only.");
            s.RequestParam(r => r.Asin, "The ASIN id. OfferType PRODUCT only.");
            s.RequestParam(r => r.CatalogNumbers, "The list of catelog numbers, comma seperated. OfferType PRODUCT only.");
            s.RequestParam(r => r.AvailabilityDate, "The date available. OfferType PRODUCT only.");
            s.RequestParam(r => r.ParentalRating, "The parental control rating. OfferType PRODUCT only.");
            s.RequestParam(r => r.MediaType, "");
            s.RequestParam(r => r.Duration, "The total playing time of the media item. OfferType MEDIA only.");
            s.RequestParam(r => r.Author, "The created/author of the media item. OfferType MEDIA only.");
            s.RequestParam(r => r.ReleaseDate, "The date/time of when the media item was originally released. OfferType MEDIA only.");
            s.RequestParam(r => r.CollectionIds, "");
            s.RequestParam(r => r.Availability, "");
            s.RequestParam(r => r.AvailabilitySummary, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateMediaRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

