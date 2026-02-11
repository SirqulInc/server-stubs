package org.openapitools.api;

import org.openapitools.api.MediaApiService;
import org.openapitools.api.factories.MediaApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.MediaOfferResponse;
import org.openapitools.model.SirqulResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/media")


@io.swagger.annotations.Api(description = "the media API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class MediaApi  {
   private final MediaApiService delegate;

   public MediaApi(@Context ServletConfig servletContext) {
      MediaApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("MediaApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (MediaApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = MediaApiServiceFactory.getMediaApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Media", notes = "Create a media offering.", response = MediaOfferResponse.class, tags={ "Media", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MediaOfferResponse.class)
    })
    public Response createMedia(@ApiParam(value = "The account id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The title (255 char limit)", required = true) @QueryParam("title") @NotNull  String title,@ApiParam(value = "The bar code type {NONE, UPC, CODE_128, QR, CUSTOM_MEDIA}", required = true, allowableValues="NONE, UPC, CODE_128, QR, CUSTOM_MEDIA") @QueryParam("barcodeType") @NotNull  String barcodeType,@ApiParam(value = "Overrides the expiration date so that the offer does not expire", required = true) @QueryParam("noExpiration") @NotNull  Boolean noExpiration,@ApiParam(value = "The limit of how many times the offer can be used by consumers", required = true) @QueryParam("availableLimit") @NotNull  Integer availableLimit,@ApiParam(value = "The limit of how many times a user can used the same offer", required = true) @QueryParam("availableLimitPerUser") @NotNull  Integer availableLimitPerUser,@ApiParam(value = "The limit of how many times the offer can be added to consumer wallets", required = true) @QueryParam("addedLimit") @NotNull  Integer addedLimit,@ApiParam(value = "The limit of how many times the offer can be viewed", required = true) @QueryParam("viewLimit") @NotNull  Integer viewLimit,@ApiParam(value = "The maximum number of times the offer can be printed", required = true) @QueryParam("maxPrints") @NotNull  Integer maxPrints,@ApiParam(value = "The cost of the offer in tickets", required = true) @QueryParam("ticketPrice") @NotNull  Long ticketPrice,@ApiParam(value = "The retail/full price cost of the offer in real currency", required = true) @QueryParam("fullPrice") @NotNull  Double fullPrice,@ApiParam(value = "The cost of the offer at a discounted price (what the consumer pays)", required = true) @QueryParam("discountPrice") @NotNull  Double discountPrice,@ApiParam(value = "The special offer type {ALL, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}", required = true, allowableValues="ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW, SQOOT, TICKETS, YIPIT") @QueryParam("specialOfferType") @NotNull  String specialOfferType,@ApiParam(value = "The offer visibility {PUBLIC, REWARDABLE, TRIGGERABLE}", required = true, allowableValues="PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE") @QueryParam("offerVisibility") @NotNull  String offerVisibility,@ApiParam(value = "Sets the active flag", required = true) @QueryParam("active") @NotNull  Boolean active,@ApiParam(value = "Comma separated list of retailer location ids. This will assign the offer to these retailer locations.") @QueryParam("retailerLocationIds")  String retailerLocationIds,@ApiParam(value = "The sub title (255 char limit)") @QueryParam("subTitle")  String subTitle,@ApiParam(value = "The details of the media") @QueryParam("details")  String details,@ApiParam(value = "A string for custom details (255 char limit)") @QueryParam("subDetails")  String subDetails,@ApiParam(value = "The fine print of the media") @QueryParam("finePrint")  String finePrint,@ApiParam(value = "The bar code entry string") @QueryParam("barcodeEntry")  String barcodeEntry,@ApiParam(value = "An external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer") @QueryParam("externalRedeemOptions")  String externalRedeemOptions,@ApiParam(value = "The clickUrl of the offer") @QueryParam("externalUrl")  String externalUrl,@ApiParam(value = "The type of ticket to reward, null means default type") @QueryParam("ticketsRewardType")  String ticketsRewardType,@ApiParam(value = "Determines how many tickets are awarded") @QueryParam("ticketsReward")  Long ticketsReward,@ApiParam(value = "The date of when the offer will be visible to consumers") @QueryParam("activated")  Long activated,@ApiParam(value = "The date of when the offer expires") @QueryParam("expires")  Long expires,@ApiParam(value = "the type of ticket needed to buy offer") @QueryParam("ticketPriceType")  String ticketPriceType,@ApiParam(value = "show how many of the media is remaining (if there is a limit)") @QueryParam("showRemaining")  Boolean showRemaining,@ApiParam(value = "show how many of the media has been redeemed") @QueryParam("showRedeemed")  Boolean showRedeemed,@ApiParam(value = "if the media has been replaced") @QueryParam("replaced")  Boolean replaced,@ApiParam(value = "if the media should be featured or not") @QueryParam("featured")  Boolean featured,@ApiParam(value = "Comma separated list of category ids") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "Comma separated list of filter ids") @QueryParam("filterIds")  String filterIds,@ApiParam(value = "The id of the barcode asset") @QueryParam("barcodeAssetId")  Long barcodeAssetId,@ApiParam(value = "The id of the an offer asset") @QueryParam("imageAssetId")  Long imageAssetId,@ApiParam(value = "The id of the an offer asset") @QueryParam("imageAssetId1")  Long imageAssetId1,@ApiParam(value = "The id of the an offer asset") @QueryParam("imageAssetId2")  Long imageAssetId2,@ApiParam(value = "The id of the an offer asset") @QueryParam("imageAssetId3")  Long imageAssetId3,@ApiParam(value = "The id of the an offer asset") @QueryParam("imageAssetId4")  Long imageAssetId4,@ApiParam(value = "The id of the an offer asset") @QueryParam("imageAssetId5")  Long imageAssetId5,@ApiParam(value = "The maker of the item.") @QueryParam("publisher")  String publisher,@ApiParam(value = "The redeemable start date/time of the offer.") @QueryParam("redeemableStart")  Long redeemableStart,@ApiParam(value = "The redeemable start date/time of the offer.") @QueryParam("redeemableEnd")  Long redeemableEnd,@ApiParam(value = "The condition type of the media", allowableValues="NEW, USED, REFURBISHED, OTHER") @QueryParam("conditionType")  String conditionType,@ApiParam(value = "The ISBN id") @QueryParam("isbn")  String isbn,@ApiParam(value = "The ASIN id") @QueryParam("asin")  String asin,@ApiParam(value = "The list of catelog numbers, comma seperated") @QueryParam("catalogNumbers")  String catalogNumbers,@ApiParam(value = "The parental control rating") @QueryParam("parentalRating")  String parentalRating,@ApiParam(value = "The date the media is available to use") @QueryParam("availabilityDate")  Long availabilityDate,@ApiParam(value = "the media type", allowableValues="APK, APPLICATION, IMAGE, AUDIO, VIDEO, MULTIPART, BAR_CODE, TEXT, OTHER") @QueryParam("mediaType")  String mediaType,@ApiParam(value = "The total playing time of the media item") @QueryParam("duration")  Integer duration,@ApiParam(value = "The created/author of the media item") @QueryParam("author")  String author,@ApiParam(value = "The date/time of when the media item was originally released") @QueryParam("releaseDate")  Long releaseDate,@ApiParam(value = "the IDs of the collections this media should be assigned to") @QueryParam("collectionIds")  String collectionIds,@ApiParam(value = "ability to assign if this media should active or not") @QueryParam("availability")  String availability,@ApiParam(value = "ability to assign when the media expires") @QueryParam("availabilitySummary")  String availabilitySummary,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createMedia(accountId, title, barcodeType, noExpiration, availableLimit, availableLimitPerUser, addedLimit, viewLimit, maxPrints, ticketPrice, fullPrice, discountPrice, specialOfferType, offerVisibility, active, retailerLocationIds, subTitle, details, subDetails, finePrint, barcodeEntry, externalRedeemOptions, externalUrl, ticketsRewardType, ticketsReward, activated, expires, ticketPriceType, showRemaining, showRedeemed, replaced, featured, categoryIds, filterIds, barcodeAssetId, imageAssetId, imageAssetId1, imageAssetId2, imageAssetId3, imageAssetId4, imageAssetId5, publisher, redeemableStart, redeemableEnd, conditionType, isbn, asin, catalogNumbers, parentalRating, availabilityDate, mediaType, duration, author, releaseDate, collectionIds, availability, availabilitySummary, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Media", notes = "Delete a media offering that the user has permissions to.", response = SirqulResponse.class, tags={ "Media", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteMedia(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the ID of the media to delete", required = true) @QueryParam("mediaId") @NotNull  Long mediaId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteMedia(accountId, mediaId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Media Get", notes = "Get a media offering.", response = MediaOfferResponse.class, tags={ "Media", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MediaOfferResponse.class)
    })
    public Response getMedia(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the media to get", required = true) @QueryParam("mediaId") @NotNull  Long mediaId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getMedia(accountId, mediaId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Media", notes = "Searches on events that the account has access to.", response = MediaOfferResponse.class, responseContainer = "List", tags={ "Media", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MediaOfferResponse.class, responseContainer = "List")
    })
    public Response searchMedia(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Return only active results", required = true) @QueryParam("activeOnly") @NotNull  Boolean activeOnly,@ApiParam(value = "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY, AVAILABILITY_DATE, RELEASE_DATE", required = true, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, REDEEMABLE_START, REDEEMABLE_END, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, VOUCHER_DISCOUNT_PRICE, FULL_PRICE, DICOUNT_PRICE, TICKETS_REWARD, AVAILABILITY_DATE, RELEASE_DATE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY") @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "The order to return the search results", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "The keyword used to search") @QueryParam("keyword")  String keyword,@ApiParam(value = "") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "") @QueryParam("filterIds")  String filterIds,@ApiParam(value = "The record to begin the return set on") @QueryParam("start")  Integer start,@ApiParam(value = "The number of records to return") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchMedia(accountId, activeOnly, sortField, descending, keyword, categoryIds, filterIds, start, limit, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Media", notes = "Update a media offering.", response = MediaOfferResponse.class, tags={ "Media", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MediaOfferResponse.class)
    })
    public Response updateMedia(@ApiParam(value = "The account used to perform the update, must have rights to edit the offer (deviceId or accountId required)", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "", required = true) @QueryParam("mediaId") @NotNull  Long mediaId,@ApiParam(value = "Comma separated list of retailer location ids. This will assign the offer to these retailer locations.") @QueryParam("retailerLocationIds")  String retailerLocationIds,@ApiParam(value = "A list of json data that has offer location specific values.") @QueryParam("offerLocations")  String offerLocations,@ApiParam(value = "The title (255 char limit)") @QueryParam("title")  String title,@ApiParam(value = "The sub title (255 char limit)") @QueryParam("subTitle")  String subTitle,@ApiParam(value = "The details") @QueryParam("details")  String details,@ApiParam(value = "A string for custom details (255 char limit)") @QueryParam("subDetails")  String subDetails,@ApiParam(value = "The fine print") @QueryParam("finePrint")  String finePrint,@ApiParam(value = "The bar code type {NONE, UPC, CODE_128, QR, CUSTOM_MEDIA}", allowableValues="NONE, UPC, CODE_128, QR, CUSTOM_MEDIA") @QueryParam("barcodeType")  String barcodeType,@ApiParam(value = "The bar code entry string") @QueryParam("barcodeEntry")  String barcodeEntry,@ApiParam(value = "An external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer.") @QueryParam("externalRedeemOptions")  String externalRedeemOptions,@ApiParam(value = "The clickUrl of the offer") @QueryParam("externalUrl")  String externalUrl,@ApiParam(value = "The type of ticket to reward, null means default type") @QueryParam("ticketsRewardType")  String ticketsRewardType,@ApiParam(value = "Determines how many tickets are awarded") @QueryParam("ticketsReward")  Long ticketsReward,@ApiParam(value = "The date of when the offer will be visible to consumers") @QueryParam("activated")  Long activated,@ApiParam(value = "The date of when the offer expires") @QueryParam("expires")  Long expires,@ApiParam(value = "Overrides the expiration date so that the offer does not expire") @QueryParam("noExpiration")  Boolean noExpiration,@ApiParam(value = "The limit of how many times the offer can be used by consumers") @QueryParam("availableLimit")  Integer availableLimit,@ApiParam(value = "The limit of how many times a user can used the same offer") @QueryParam("availableLimitPerUser")  Integer availableLimitPerUser,@ApiParam(value = "The limit of how many times the offer can be added to consumer wallets") @QueryParam("addedLimit")  Integer addedLimit,@ApiParam(value = "") @QueryParam("viewLimit")  Integer viewLimit,@ApiParam(value = "The maximum number of times the offer can be printed") @QueryParam("maxPrints")  Integer maxPrints,@ApiParam(value = "the type of ticket needed to buy the offer") @QueryParam("ticketPriceType")  String ticketPriceType,@ApiParam(value = "The cost of the offer in tickets") @QueryParam("ticketPrice")  Long ticketPrice,@ApiParam(value = "The retail/full price cost of the offer in real currency") @QueryParam("fullPrice")  Double fullPrice,@ApiParam(value = "The cost of the offer at a discounted price (what the consumer pays)") @QueryParam("discountPrice")  Double discountPrice,@ApiParam(value = "The show remaining") @QueryParam("showRemaining")  Boolean showRemaining,@ApiParam(value = "The show redeemed") @QueryParam("showRedeemed")  Boolean showRedeemed,@ApiParam(value = "The replaced") @QueryParam("replaced")  Boolean replaced,@ApiParam(value = "The featured") @QueryParam("featured")  Boolean featured,@ApiParam(value = "The special offer type {ALL, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}", allowableValues="ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW, SQOOT, TICKETS, YIPIT") @QueryParam("specialOfferType")  String specialOfferType,@ApiParam(value = "The offer visibility {PUBLIC, REWARDABLE, TRIGGERABLE}", allowableValues="PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE") @QueryParam("offerVisibility")  String offerVisibility,@ApiParam(value = "Comma separated list of category ids") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "Comma separated list of filter ids") @QueryParam("filterIds")  String filterIds,@ApiParam(value = "Sets the active flag") @QueryParam("active")  Boolean active,@ApiParam(value = "The id of the barcode asset") @QueryParam("barcodeAssetId")  Long barcodeAssetId,@ApiParam(value = "The id of the an offer asset") @QueryParam("imageAssetId")  Long imageAssetId,@ApiParam(value = "The id of the an offer asset") @QueryParam("imageAssetId1")  Long imageAssetId1,@ApiParam(value = "The id of the an offer asset") @QueryParam("imageAssetId2")  Long imageAssetId2,@ApiParam(value = "The id of the an offer asset") @QueryParam("imageAssetId3")  Long imageAssetId3,@ApiParam(value = "The id of the an offer asset") @QueryParam("imageAssetId4")  Long imageAssetId4,@ApiParam(value = "The id of the an offer asset") @QueryParam("imageAssetId5")  Long imageAssetId5,@ApiParam(value = "The maker of the item.") @QueryParam("publisher")  String publisher,@ApiParam(value = "The redeemable start date/time of the offer.") @QueryParam("redeemableStart")  Long redeemableStart,@ApiParam(value = "The redeemable start date/time of the offer.") @QueryParam("redeemableEnd")  Long redeemableEnd,@ApiParam(value = "The condition. OfferType PRODUCT only.", allowableValues="NEW, USED, REFURBISHED, OTHER") @QueryParam("conditionType")  String conditionType,@ApiParam(value = "The ISBN id. OfferType PRODUCT only.") @QueryParam("isbn")  String isbn,@ApiParam(value = "The ASIN id. OfferType PRODUCT only.") @QueryParam("asin")  String asin,@ApiParam(value = "The list of catelog numbers, comma seperated. OfferType PRODUCT only.") @QueryParam("catalogNumbers")  String catalogNumbers,@ApiParam(value = "The date available. OfferType PRODUCT only.") @QueryParam("availabilityDate")  Long availabilityDate,@ApiParam(value = "The parental control rating. OfferType PRODUCT only.") @QueryParam("parentalRating")  String parentalRating,@ApiParam(value = "", allowableValues="APK, APPLICATION, IMAGE, AUDIO, VIDEO, MULTIPART, BAR_CODE, TEXT, OTHER") @QueryParam("mediaType")  String mediaType,@ApiParam(value = "The total playing time of the media item. OfferType MEDIA only.") @QueryParam("duration")  Integer duration,@ApiParam(value = "The created/author of the media item. OfferType MEDIA only.") @QueryParam("author")  String author,@ApiParam(value = "The date/time of when the media item was originally released. OfferType MEDIA only.") @QueryParam("releaseDate")  Long releaseDate,@ApiParam(value = "") @QueryParam("collectionIds")  String collectionIds,@ApiParam(value = "") @QueryParam("availability")  String availability,@ApiParam(value = "") @QueryParam("availabilitySummary")  String availabilitySummary,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateMedia(accountId, mediaId, retailerLocationIds, offerLocations, title, subTitle, details, subDetails, finePrint, barcodeType, barcodeEntry, externalRedeemOptions, externalUrl, ticketsRewardType, ticketsReward, activated, expires, noExpiration, availableLimit, availableLimitPerUser, addedLimit, viewLimit, maxPrints, ticketPriceType, ticketPrice, fullPrice, discountPrice, showRemaining, showRedeemed, replaced, featured, specialOfferType, offerVisibility, categoryIds, filterIds, active, barcodeAssetId, imageAssetId, imageAssetId1, imageAssetId2, imageAssetId3, imageAssetId4, imageAssetId5, publisher, redeemableStart, redeemableEnd, conditionType, isbn, asin, catalogNumbers, availabilityDate, parentalRating, mediaType, duration, author, releaseDate, collectionIds, availability, availabilitySummary, securityContext);
    }
}
