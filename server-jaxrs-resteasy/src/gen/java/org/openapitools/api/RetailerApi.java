package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.RetailerApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AccountLoginResponse;
import java.io.File;
import org.openapitools.model.OfferResponse;
import org.openapitools.model.OfferShortResponse;
import org.openapitools.model.OfferTransactionResponse;
import org.openapitools.model.RetailerFullResponse;
import org.openapitools.model.RetailerLocationResponse;
import org.openapitools.model.RetailerOfferResponse;
import org.openapitools.model.RetailerResponse;
import org.openapitools.model.SirqulResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/retailer")


@io.swagger.annotations.Api(description = "the retailer API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RetailerApi  {

    @Inject RetailerApiService service;

    @POST
    @Path("/offer/location/batchUpdate")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Offer Locations", notes = "Batch update offer locations.", response = SirqulResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response batchUpdateOfferLocations( @NotNull @QueryParam("data") String data, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.batchUpdateOfferLocations(data,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/offer/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Offer", notes = "Create an offer and assign it to the provided retailer locations.", response = RetailerOfferResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerOfferResponse.class) })
    public Response createOffer( @NotNull @QueryParam("includeOfferLocations") Boolean includeOfferLocations, @NotNull @QueryParam("title") String title, @NotNull, allowableValues="NONE, UPC, CODE_128, QR, CUSTOM_MEDIA" @QueryParam("barcodeType") String barcodeType, @NotNull @QueryParam("noExpiration") Boolean noExpiration, @NotNull @QueryParam("availableLimit") Integer availableLimit, @NotNull @QueryParam("availableLimitPerUser") Integer availableLimitPerUser, @NotNull @QueryParam("addedLimit") Integer addedLimit, @NotNull @QueryParam("viewLimit") Integer viewLimit, @NotNull @QueryParam("maxPrints") Integer maxPrints, @NotNull @QueryParam("ticketPrice") Long ticketPrice, @NotNull @QueryParam("fullPrice") Double fullPrice, @NotNull @QueryParam("discountPrice") Double discountPrice, @NotNull, allowableValues="VOUCHER, COUPON, PRODUCT, MEDIA, EVENT, DEVICE" @QueryParam("offerType") String offerType, @NotNull, allowableValues="ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW, SQOOT, TICKETS, YIPIT" @QueryParam("specialOfferType") String specialOfferType, @NotNull, allowableValues="PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE" @QueryParam("offerVisibility") String offerVisibility, @NotNull @QueryParam("active") Boolean active, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("tags") String tags, @QueryParam("parentOfferId") Long parentOfferId, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("offerLocations") String offerLocations, @QueryParam("subTitle") String subTitle, @QueryParam("details") String details, @QueryParam("subDetails") String subDetails, @QueryParam("finePrint") String finePrint, @QueryParam("barcodeEntry") String barcodeEntry, @QueryParam("externalRedeemOptions") String externalRedeemOptions, @QueryParam("externalUrl") String externalUrl, @QueryParam("externalId") String externalId, @QueryParam("ticketsRewardType") String ticketsRewardType, @QueryParam("ticketsReward") Long ticketsReward, @QueryParam("activated") Long activated, @QueryParam("expires") Long expires, @QueryParam("ticketPriceType") String ticketPriceType, @QueryParam("showRemaining") Boolean showRemaining, @QueryParam("showRedeemed") Boolean showRedeemed, @QueryParam("replaced") Boolean replaced, @QueryParam("featured") Boolean featured, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("barcodeAssetId") Long barcodeAssetId, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("imageAssetId1") Long imageAssetId1, @QueryParam("imageAssetId2") Long imageAssetId2, @QueryParam("imageAssetId3") Long imageAssetId3, @QueryParam("imageAssetId4") Long imageAssetId4, @QueryParam("imageAssetId5") Long imageAssetId5, @QueryParam("publisher") String publisher, @QueryParam("redeemableStart") Long redeemableStart, @QueryParam("redeemableEnd") Long redeemableEnd, @QueryParam("brand") String brand,, allowableValues="APPAREL, APPLIANCES, APPS, ARTS_CRAFTS, AUTOMOTIVE, BABY, BEAUTY, BOOKS, CLASSICAL, COLLECTIBLES, DVD, ELECTRONICS, GIFT_CARDS, GOURMET_FOOD, GROCERY, HEALTH_PERSONAL_CARE, HOME_GARDEN, INDUSTRIAL, JEWELRY, KITCHEN, LAWN_GARDEN, MAGAZINES, MISCELLANEOUS, MUSICAL_INSTRUMENTS, OFFICE_PRODUCTS, OTHER, OUTDOOR_LIVING, PC_HARDWARE, PET_SUPPLIES, SHOES, SOFTWARE, SPORTING_GOODS, TOOLS, TOYS, VIDEO_GAMES, WATCHES, WIRELESS, WIRELESS_ACCESSORIES" @QueryParam("productType") String productType,, allowableValues="NEW, USED, REFURBISHED, OTHER" @QueryParam("conditionType") String conditionType, @QueryParam("isbn") String isbn, @QueryParam("asin") String asin, @QueryParam("catalogNumbers") String catalogNumbers, @QueryParam("department") String department, @QueryParam("features") String features, @QueryParam("minimumPrice") Double minimumPrice, @QueryParam("width") Double width, @QueryParam("height") Double height, @QueryParam("depth") Double depth, @QueryParam("weight") Double weight,, allowableValues="MILIMETER, CENTIMETER, METER, INCH, FOOT, YARD" @QueryParam("unit") String unit, @QueryParam("studio") String studio, @QueryParam("parentalRating") String parentalRating, @QueryParam("publishDate") Long publishDate, @QueryParam("availabilityDate") Long availabilityDate, @QueryParam("sizeId") Long sizeId, @QueryParam("listingId") Long listingId,, allowableValues="APK, APPLICATION, IMAGE, AUDIO, VIDEO, MULTIPART, BAR_CODE, TEXT, OTHER" @QueryParam("mediaType") String mediaType, @QueryParam("duration") Integer duration, @QueryParam("author") String author, @QueryParam("releaseDate") Long releaseDate, @QueryParam("collectionIds") String collectionIds, @QueryParam("rebootTimeHour") Integer rebootTimeHour, @QueryParam("rebootTimeMinute") Integer rebootTimeMinute, @QueryParam("idleTimeoutInSecond") Integer idleTimeoutInSecond, @QueryParam("serialNumber") String serialNumber, @QueryParam("udid") String udid, @QueryParam("deviceType") String deviceType, @QueryParam("devicePower") Double devicePower, @QueryParam("deviceInterference") Double deviceInterference, @QueryParam("availability") String availability, @QueryParam("availabilitySummary") String availabilitySummary,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createOffer(includeOfferLocations,title,barcodeType,noExpiration,availableLimit,availableLimitPerUser,addedLimit,viewLimit,maxPrints,ticketPrice,fullPrice,discountPrice,offerType,specialOfferType,offerVisibility,active,deviceId,accountId,tags,parentOfferId,retailerLocationIds,offerLocations,subTitle,details,subDetails,finePrint,barcodeEntry,externalRedeemOptions,externalUrl,externalId,ticketsRewardType,ticketsReward,activated,expires,ticketPriceType,showRemaining,showRedeemed,replaced,featured,categoryIds,filterIds,barcodeAssetId,imageAssetId,imageAssetId1,imageAssetId2,imageAssetId3,imageAssetId4,imageAssetId5,publisher,redeemableStart,redeemableEnd,brand,productType,conditionType,isbn,asin,catalogNumbers,department,features,minimumPrice,width,height,depth,weight,unit,studio,parentalRating,publishDate,availabilityDate,sizeId,listingId,mediaType,duration,author,releaseDate,collectionIds,rebootTimeHour,rebootTimeMinute,idleTimeoutInSecond,serialNumber,udid,deviceType,devicePower,deviceInterference,availability,availabilitySummary,securityContext);
    }
    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Retailer", notes = "Create a retailer record. A billable entity must be created first before a retailer record can be made.", response = RetailerFullResponse.class, tags={ "Retailer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerFullResponse.class) })
    public Response createRetailer( @NotNull @QueryParam("name") String name, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("country") String country, @QueryParam("businessPhone") String businessPhone, @QueryParam("businessPhoneExt") String businessPhoneExt, @QueryParam("website") String website, @QueryParam("email") String email, @QueryParam("facebookUrl") String facebookUrl, @QueryParam("twitterUrl") String twitterUrl, @QueryParam("logo") File logo, @QueryParam("logoAssetId") Long logoAssetId, @QueryParam("picture1") File picture1, @QueryParam("picture1AssetId") Long picture1AssetId, @QueryParam("picture2") File picture2, @QueryParam("picture2AssetId") Long picture2AssetId, @QueryParam("categoryIds") String categoryIds, @QueryParam("categoryIdsToAdd") String categoryIdsToAdd, @QueryParam("categoryIdsToRemove") String categoryIdsToRemove, @QueryParam("filterIds") String filterIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("metaData") String metaData, @QueryParam("searchTags") String searchTags, @QueryParam("retailerType") String retailerType,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @QueryParam("createDefaultLocation") Boolean createDefaultLocation,, allowableValues="HTML, XML, JSON, CSV" @QueryParam("responseFormat") String responseFormat,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createRetailer(name,deviceId,accountId,streetAddress,streetAddress2,city,state,postalCode,country,businessPhone,businessPhoneExt,website,email,facebookUrl,twitterUrl,logo,logoAssetId,picture1,picture1AssetId,picture2,picture2AssetId,categoryIds,categoryIdsToAdd,categoryIdsToRemove,filterIds,latitude,longitude,metaData,searchTags,retailerType,visibility,createDefaultLocation,responseFormat,securityContext);
    }
    @POST
    @Path("/location/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Retailer Location", notes = "Creates a location record for a retailer. Only the owner and the employees of the retailer have access to do this.", response = RetailerLocationResponse.class, tags={ "Retailer Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class) })
    public Response createRetailerLocations( @NotNull @QueryParam("retailerId") Long retailerId, @NotNull @QueryParam("name") String name, @NotNull @QueryParam("streetAddress") String streetAddress, @NotNull @QueryParam("city") String city, @NotNull @QueryParam("state") String state, @NotNull @QueryParam("postalCode") String postalCode, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("country") String country, @QueryParam("businessPhone") String businessPhone, @QueryParam("businessPhoneExt") String businessPhoneExt, @QueryParam("website") String website, @QueryParam("email") String email, @QueryParam("internalId") String internalId, @QueryParam("detailsHeader") String detailsHeader, @QueryParam("detailsBody") String detailsBody, @QueryParam("hours") String hours, @QueryParam("logo") File logo, @QueryParam("logoAssetId") Long logoAssetId, @QueryParam("picture1") File picture1, @QueryParam("picture1AssetId") Long picture1AssetId, @QueryParam("picture2") File picture2, @QueryParam("picture2AssetId") Long picture2AssetId, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("building") String building, @QueryParam("googlePlaceId") String googlePlaceId, @QueryParam("yelpId") String yelpId, @QueryParam("active") Boolean active, @QueryParam("publicLocation") Boolean publicLocation, @QueryParam("locationType") String locationType, @QueryParam("audienceIds") String audienceIds, @QueryParam("audienceIdsToAdd") String audienceIdsToAdd, @QueryParam("audienceIdsToRemove") String audienceIdsToRemove,, allowableValues="HTML, XML, JSON, CSV" @QueryParam("responseFormat") String responseFormat, @QueryParam("responseIncludes") String responseIncludes,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createRetailerLocations(retailerId,name,streetAddress,city,state,postalCode,deviceId,accountId,streetAddress2,country,businessPhone,businessPhoneExt,website,email,internalId,detailsHeader,detailsBody,hours,logo,logoAssetId,picture1,picture1AssetId,picture2,picture2AssetId,categoryIds,filterIds,latitude,longitude,building,googlePlaceId,yelpId,active,publicLocation,locationType,audienceIds,audienceIdsToAdd,audienceIdsToRemove,responseFormat,responseIncludes,securityContext);
    }
    @POST
    @Path("/offer/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Offer", notes = "Set the deleted timestamp to current time. This effectively deletes the offer since all queries should ignore any records with a deleted time stamp.", response = SirqulResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteOffer( @NotNull @QueryParam("offerId") Long offerId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteOffer(offerId,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/offer/location/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Offer Location", notes = "Set the deleted timestamp to current time. This effectively deletes the offer location since all queries should ignore any records with a deleted time stamp.", response = SirqulResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteOfferLocation( @NotNull @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteOfferLocation(offerLocationId,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Retailer", notes = "Set the deleted timestamp to current time.", response = SirqulResponse.class, tags={ "Retailer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteRetailer( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("retailerId") Long retailerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteRetailer(deviceId,accountId,retailerId,securityContext);
    }
    @POST
    @Path("/location/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Retailer Location", notes = "Set the deleted timestamp to current time. This effectively deletes the retailer location since all queries should ignore any records with a deleted time stamp.", response = SirqulResponse.class, tags={ "Retailer Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteRetailerLocation( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("retailerLocationId") Long retailerLocationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteRetailerLocation(deviceId,accountId,retailerLocationId,securityContext);
    }
    @GET
    @Path("/offer/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Offer", notes = "Gets the details of an offer that the user has access to.", response = RetailerOfferResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerOfferResponse.class) })
    public Response getOffer( @NotNull @QueryParam("offerId") Long offerId, @NotNull @QueryParam("includeOfferLocations") Boolean includeOfferLocations, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOffer(offerId,includeOfferLocations,deviceId,accountId,securityContext);
    }
    @GET
    @Path("/offer/location/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Offer Locations", notes = "Searches on offer locations, which are records that represent an offer that has been assigned to a retailer location. If an offer does not have any locations assigned, then it will NOT be returned.", response = OfferShortResponse.class, responseContainer = "List", tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferShortResponse.class, responseContainer = "List") })
    public Response getOfferLocationsForRetailers( @NotNull, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, OFFER_ID, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, RETAILER_ID, RETAILER_LOCATION_ID, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @NotNull @QueryParam("includeRetailerLocation") Boolean includeRetailerLocation, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId,, allowableValues="VOUCHER, COUPON, PRODUCT, MEDIA, EVENT, DEVICE" @QueryParam("offerType") String offerType,, allowableValues="ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW, SQOOT, TICKETS, YIPIT" @QueryParam("specialOfferType") String specialOfferType, @QueryParam("barcodeType") String barcodeType, @QueryParam("barcodeEntry") String barcodeEntry, @QueryParam("isbn") String isbn, @QueryParam("asin") String asin,, allowableValues="RUNNING, WARNING, DOWN" @QueryParam("deviceStatus") String deviceStatus, @QueryParam("needsNotificationSent") Boolean needsNotificationSent, @QueryParam("lastNotificationSent") Long lastNotificationSent,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOfferLocationsForRetailers(sortField,descending,start,limit,activeOnly,includeRetailerLocation,deviceId,accountId,keyword,retailerId,retailerLocationId,offerType,specialOfferType,barcodeType,barcodeEntry,isbn,asin,deviceStatus,needsNotificationSent,lastNotificationSent,securityContext);
    }
    @GET
    @Path("/offer/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Offers", notes = "Searches on offers that the account has access to.", response = OfferResponse.class, responseContainer = "List", tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class, responseContainer = "List") })
    public Response getOffersForRetailers( @NotNull, allowableValues="PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE" @QueryParam("offerVisibility") String offerVisibility, @NotNull, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, REDEEMABLE_START, REDEEMABLE_END, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, VOUCHER_DISCOUNT_PRICE, FULL_PRICE, DICOUNT_PRICE, TICKETS_REWARD, AVAILABILITY_DATE, RELEASE_DATE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("availableOnly") Boolean availableOnly, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @NotNull @QueryParam("includeCategories") Boolean includeCategories, @NotNull @QueryParam("includeFilters") Boolean includeFilters, @NotNull @QueryParam("includeOfferLocations") Boolean includeOfferLocations, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId,, allowableValues="VOUCHER, COUPON, PRODUCT, MEDIA, EVENT, DEVICE" @QueryParam("couponType") String couponType,, allowableValues="VOUCHER, COUPON, PRODUCT, MEDIA, EVENT, DEVICE" @QueryParam("offerType") String offerType, @QueryParam("offerTypes") String offerTypes,, allowableValues="ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW, SQOOT, TICKETS, YIPIT" @QueryParam("specialOfferType") String specialOfferType, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l, @QueryParam("barcodeType") String barcodeType, @QueryParam("barcodeEntry") String barcodeEntry, @QueryParam("isbn") String isbn, @QueryParam("asin") String asin,, allowableValues="RUNNING, WARNING, DOWN" @QueryParam("deviceStatus") String deviceStatus, @QueryParam("needsNotificationSent") Boolean needsNotificationSent, @QueryParam("lastNotificationSent") Long lastNotificationSent,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOffersForRetailers(offerVisibility,sortField,descending,start,limit,availableOnly,activeOnly,includeCategories,includeFilters,includeOfferLocations,deviceId,accountId,categoryIds,filterIds,q,keyword,retailerId,retailerLocationId,couponType,offerType,offerTypes,specialOfferType,i,l,barcodeType,barcodeEntry,isbn,asin,deviceStatus,needsNotificationSent,lastNotificationSent,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Retailer", notes = "Gets a retailer. Only the owner and the employees of a retailer have access to view its information.", response = RetailerFullResponse.class, tags={ "Retailer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerFullResponse.class) })
    public Response getRetailer( @NotNull @QueryParam("retailerId") Long retailerId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("includeCounts") Boolean includeCounts,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRetailer(retailerId,deviceId,accountId,includeCounts,securityContext);
    }
    @GET
    @Path("/location/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Retailer Location", notes = "Gets a retailer location. Only the owner and the employees of the retailer have access to view its information.", response = RetailerLocationResponse.class, tags={ "Retailer Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class) })
    public Response getRetailerLocation( @NotNull @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("retailerLocationToken") String retailerLocationToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRetailerLocation(retailerLocationId,deviceId,accountId,retailerLocationToken,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Retailers", notes = "earches on retailers that the account has access to.", response = RetailerResponse.class, responseContainer = "List", tags={ "Retailer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerResponse.class, responseContainer = "List") })
    public Response getRetailers( @NotNull, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @NotNull, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY, ADDRESS_STREET, ADDRESS_CITY, ADDRESS_STATE, ADDRESS_POSTAL_CODE, ADDRESS_COUNTRY, FILTERS, CATEGORIES, VISIBILITY, NAME" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRetailers(visibility,sortField,descending,start,limit,activeOnly,deviceId,accountId,q,keyword,categoryIds,filterIds,i,l,securityContext);
    }
    @GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Retailer", notes = "Gets a retailer. Only the owner and the employees of a retailer have access to view its information.", response = SirqulResponse.class, tags={ "Retailer V2", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response getRetaokiler( @NotNull @QueryParam("retailerId") Long retailerId, @NotNull @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("keyword") String keyword, @DefaultValue("id") @QueryParam("sortField") String sortField, @DefaultValue("0") @QueryParam("start") Long start, @DefaultValue("20") @QueryParam("limit") Long limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRetaokiler(retailerId,activeOnly,keyword,sortField,start,limit,securityContext);
    }
    @GET
    @Path("/location/idistancesearch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Distance Search Retailer Locations (Indexed)", notes = "Retailer location indexed search by distance. This searches on any retailer location with location data and returns the results sorted by distance.", response = RetailerLocationResponse.class, responseContainer = "List", tags={ "Retailer Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class, responseContainer = "List") })
    public Response indexedRetailerLocationDistanceSearch( @NotNull @QueryParam("latitude") Double latitude, @NotNull @QueryParam("longitude") Double longitude, @NotNull @QueryParam("searchRange") Double searchRange, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("accountId") Long accountId, @QueryParam("address") String address, @QueryParam("hasOffers") Boolean hasOffers, @QueryParam("categories") String categories, @QueryParam("filters") String filters, @QueryParam("audiences") String audiences, @QueryParam("retailerIds") String retailerIds, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("tags") String tags, @QueryParam("locationType") String locationType, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("keywordOperator") String keywordOperator, @QueryParam("searchExpression") String searchExpression,, allowableValues="MILES, KILOMETERS" @QueryParam("distanceUnit") String distanceUnit, @QueryParam("returnFavorited") Boolean returnFavorited, @QueryParam("returnRetailer") Boolean returnRetailer, @QueryParam("returnAssets") Boolean returnAssets, @QueryParam("returnOffers") Boolean returnOffers, @QueryParam("returnCategories") Boolean returnCategories, @QueryParam("returnFilters") Boolean returnFilters, @QueryParam("returnAudiences") Boolean returnAudiences, @QueryParam("returnQrCode") Boolean returnQrCode, @QueryParam("returnExternalCategoryData") Boolean returnExternalCategoryData, @QueryParam("includeFavorite") Boolean includeFavorite, @QueryParam("includeLiked") Boolean includeLiked, @QueryParam("includeRating") Boolean includeRating,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.indexedRetailerLocationDistanceSearch(latitude,longitude,searchRange,start,limit,accountId,address,hasOffers,categories,filters,audiences,retailerIds,retailerLocationIds,tags,locationType,sortField,descending,q,keyword,keywordOperator,searchExpression,distanceUnit,returnFavorited,returnRetailer,returnAssets,returnOffers,returnCategories,returnFilters,returnAudiences,returnQrCode,returnExternalCategoryData,includeFavorite,includeLiked,includeRating,securityContext);
    }
    @GET
    @Path("/location/isearch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Keyword Search Retailer Locations (Indexed)", notes = "Retailer location (faster) indexed search. This searches all retailer locations.", response = RetailerLocationResponse.class, responseContainer = "List", tags={ "Retailer Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class, responseContainer = "List") })
    public Response indexedRetailerLocationSearch( @QueryParam("accountId") Long accountId, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("hasOffers") Boolean hasOffers, @QueryParam("categories") String categories, @QueryParam("filters") String filters, @QueryParam("audiences") String audiences, @QueryParam("retailerIds") String retailerIds, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("tags") String tags, @QueryParam("locationType") String locationType, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("keywordOperator") String keywordOperator, @QueryParam("searchExpression") String searchExpression, @QueryParam("returnRetailer") Boolean returnRetailer, @QueryParam("returnAssets") Boolean returnAssets, @QueryParam("returnOffers") Boolean returnOffers, @QueryParam("returnCategories") Boolean returnCategories, @QueryParam("returnFilters") Boolean returnFilters, @QueryParam("returnAudiences") Boolean returnAudiences, @QueryParam("returnQrCode") Boolean returnQrCode, @QueryParam("returnExternalCategoryData") Boolean returnExternalCategoryData, @QueryParam("includeFavorite") Boolean includeFavorite, @QueryParam("includeLiked") Boolean includeLiked, @QueryParam("includeRating") Boolean includeRating,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.indexedRetailerLocationSearch(accountId,start,limit,hasOffers,categories,filters,audiences,retailerIds,retailerLocationIds,tags,locationType,sortField,descending,q,keyword,keywordOperator,searchExpression,returnRetailer,returnAssets,returnOffers,returnCategories,returnFilters,returnAudiences,returnQrCode,returnExternalCategoryData,includeFavorite,includeLiked,includeRating,securityContext);
    }
    @POST
    @Path("/offer/transaction/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Offer Transaction", notes = "Redeems an offer.", response = SirqulResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response redeemOfferTransaction( @NotNull @QueryParam("offerTransactionId") Long offerTransactionId, @NotNull @QueryParam("status") Integer status, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("offerLocationId") Long offerLocationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.redeemOfferTransaction(offerTransactionId,status,deviceId,accountId,offerLocationId,securityContext);
    }
    @POST
    @Path("/login")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Login Retailer", notes = "Retailer login check.", response = AccountLoginResponse.class, tags={ "Retailer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AccountLoginResponse.class) })
    public Response retailerLoginCheck( @NotNull @QueryParam("username") String username, @NotNull @QueryParam("password") String password, @QueryParam("deviceId") String deviceId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.retailerLoginCheck(username,password,deviceId,latitude,longitude,appKey,securityContext);
    }
    @GET
    @Path("/offer/transaction/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Offer Transactions", notes = "Searches on offer transactions for offers that the account has access to.", response = OfferTransactionResponse.class, responseContainer = "List", tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class, responseContainer = "List") })
    public Response searchOfferTransactionsForRetailers( @NotNull, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, REDEEMABLE_START, REDEEMABLE_END, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("redeemed") Boolean redeemed, @QueryParam("reservationsOnly") Boolean reservationsOnly,, allowableValues="VOUCHER, COUPON, PRODUCT, MEDIA, EVENT, DEVICE" @QueryParam("couponType") String couponType,, allowableValues="VOUCHER, COUPON, PRODUCT, MEDIA, EVENT, DEVICE" @QueryParam("offerType") String offerType,, allowableValues="ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW, SQOOT, TICKETS, YIPIT" @QueryParam("specialOfferType") String specialOfferType, @QueryParam("customerAccountIds") String customerAccountIds, @QueryParam("categoryIds") String categoryIds, @QueryParam("redeemableStartDate") Long redeemableStartDate, @QueryParam("redeemableEndDate") Long redeemableEndDate, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchOfferTransactionsForRetailers(sortField,descending,start,limit,activeOnly,deviceId,accountId,q,keyword,retailerId,retailerLocationId,offerId,offerLocationId,redeemed,reservationsOnly,couponType,offerType,specialOfferType,customerAccountIds,categoryIds,redeemableStartDate,redeemableEndDate,i,l,securityContext);
    }
    @GET
    @Path("/location/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Retailer Locations (Owned)", notes = "Searches on retailer locations that the account has access to.", response = RetailerLocationResponse.class, responseContainer = "List", tags={ "Retailer Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class, responseContainer = "List") })
    public Response searchRetailerLocations( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("retailerIds") String retailerIds, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("locationType") String locationType,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, RETAILER_ID, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY, ADDRESS_STREET, ADDRESS_CITY, ADDRESS_STATE, ADDRESS_POSTAL_CODE, ADDRESS_COUNTRY, NAME, CODE" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("_i") Integer i, @QueryParam("start") Integer start, @QueryParam("_l") Integer l, @QueryParam("limit") Integer limit, @QueryParam("showPublicLocations") Boolean showPublicLocations, @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("returnRetailer") Boolean returnRetailer, @QueryParam("returnAssets") Boolean returnAssets, @QueryParam("returnOffers") Boolean returnOffers, @QueryParam("returnCategories") Boolean returnCategories, @QueryParam("returnFilters") Boolean returnFilters, @QueryParam("returnAudiences") Boolean returnAudiences, @QueryParam("returnQrCode") Boolean returnQrCode, @QueryParam("includeFavorite") Boolean includeFavorite, @QueryParam("includeLiked") Boolean includeLiked, @QueryParam("includeRating") Boolean includeRating,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchRetailerLocations(deviceId,accountId,q,keyword,retailerIds,retailerLocationIds,locationType,sortField,descending,i,start,l,limit,showPublicLocations,activeOnly,returnRetailer,returnAssets,returnOffers,returnCategories,returnFilters,returnAudiences,returnQrCode,includeFavorite,includeLiked,includeRating,securityContext);
    }
    @POST
    @Path("/offer/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Offer", notes = "Update an offer, must provide a current list of retailer locations or the current offer locations will be marked as deleted.", response = RetailerOfferResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerOfferResponse.class) })
    public Response updateOffer( @NotNull @QueryParam("offerId") Long offerId, @NotNull @QueryParam("includeOfferLocations") Boolean includeOfferLocations, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("parentOfferId") Long parentOfferId, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("offerLocations") String offerLocations, @QueryParam("tags") String tags, @QueryParam("title") String title, @QueryParam("subTitle") String subTitle, @QueryParam("details") String details, @QueryParam("subDetails") String subDetails, @QueryParam("finePrint") String finePrint,, allowableValues="NONE, UPC, CODE_128, QR, CUSTOM_MEDIA" @QueryParam("barcodeType") String barcodeType, @QueryParam("barcodeEntry") String barcodeEntry, @QueryParam("externalRedeemOptions") String externalRedeemOptions, @QueryParam("externalUrl") String externalUrl, @QueryParam("externalId") String externalId, @QueryParam("ticketsRewardType") String ticketsRewardType, @QueryParam("ticketsReward") Long ticketsReward, @QueryParam("activated") Long activated, @QueryParam("expires") Long expires, @QueryParam("noExpiration") Boolean noExpiration, @QueryParam("availableLimit") Integer availableLimit, @QueryParam("availableLimitPerUser") Integer availableLimitPerUser, @QueryParam("addedLimit") Integer addedLimit, @QueryParam("viewLimit") Integer viewLimit, @QueryParam("maxPrints") Integer maxPrints, @QueryParam("ticketPriceType") String ticketPriceType, @QueryParam("ticketPrice") Long ticketPrice, @QueryParam("fullPrice") Double fullPrice, @QueryParam("discountPrice") Double discountPrice, @QueryParam("showRemaining") Boolean showRemaining, @QueryParam("showRedeemed") Boolean showRedeemed, @QueryParam("replaced") Boolean replaced, @QueryParam("featured") Boolean featured,, allowableValues="VOUCHER, COUPON, PRODUCT, MEDIA, EVENT, DEVICE" @QueryParam("offerType") String offerType,, allowableValues="ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW, SQOOT, TICKETS, YIPIT" @QueryParam("specialOfferType") String specialOfferType,, allowableValues="PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE" @QueryParam("offerVisibility") String offerVisibility, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("active") Boolean active, @QueryParam("barcodeAssetId") Long barcodeAssetId, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("imageAssetId1") Long imageAssetId1, @QueryParam("imageAssetId2") Long imageAssetId2, @QueryParam("imageAssetId3") Long imageAssetId3, @QueryParam("imageAssetId4") Long imageAssetId4, @QueryParam("imageAssetId5") Long imageAssetId5, @QueryParam("publisher") String publisher, @QueryParam("redeemableStart") Long redeemableStart, @QueryParam("redeemableEnd") Long redeemableEnd, @QueryParam("brand") String brand,, allowableValues="APPAREL, APPLIANCES, APPS, ARTS_CRAFTS, AUTOMOTIVE, BABY, BEAUTY, BOOKS, CLASSICAL, COLLECTIBLES, DVD, ELECTRONICS, GIFT_CARDS, GOURMET_FOOD, GROCERY, HEALTH_PERSONAL_CARE, HOME_GARDEN, INDUSTRIAL, JEWELRY, KITCHEN, LAWN_GARDEN, MAGAZINES, MISCELLANEOUS, MUSICAL_INSTRUMENTS, OFFICE_PRODUCTS, OTHER, OUTDOOR_LIVING, PC_HARDWARE, PET_SUPPLIES, SHOES, SOFTWARE, SPORTING_GOODS, TOOLS, TOYS, VIDEO_GAMES, WATCHES, WIRELESS, WIRELESS_ACCESSORIES" @QueryParam("productType") String productType,, allowableValues="NEW, USED, REFURBISHED, OTHER" @QueryParam("conditionType") String conditionType, @QueryParam("isbn") String isbn, @QueryParam("asin") String asin, @QueryParam("catalogNumbers") String catalogNumbers, @QueryParam("department") String department, @QueryParam("features") String features, @QueryParam("minimumPrice") Double minimumPrice, @QueryParam("width") Double width, @QueryParam("height") Double height, @QueryParam("depth") Double depth, @QueryParam("weight") Double weight,, allowableValues="MILIMETER, CENTIMETER, METER, INCH, FOOT, YARD" @QueryParam("unit") String unit, @QueryParam("studio") String studio, @QueryParam("parentalRating") String parentalRating, @QueryParam("publishDate") Long publishDate, @QueryParam("availabilityDate") Long availabilityDate, @QueryParam("sizeId") Long sizeId, @QueryParam("listingId") Long listingId,, allowableValues="APK, APPLICATION, IMAGE, AUDIO, VIDEO, MULTIPART, BAR_CODE, TEXT, OTHER" @QueryParam("mediaType") String mediaType, @QueryParam("duration") Integer duration, @QueryParam("author") String author, @QueryParam("releaseDate") Long releaseDate, @QueryParam("collectionIds") String collectionIds, @QueryParam("rebootTimeHour") Integer rebootTimeHour, @QueryParam("rebootTimeMinute") Integer rebootTimeMinute, @QueryParam("idleTimeoutInSecond") Integer idleTimeoutInSecond, @QueryParam("serialNumber") String serialNumber, @QueryParam("udid") String udid, @QueryParam("deviceType") String deviceType, @QueryParam("devicePower") Double devicePower, @QueryParam("deviceInterference") Double deviceInterference, @QueryParam("availability") String availability, @QueryParam("availabilitySummary") String availabilitySummary,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateOffer(offerId,includeOfferLocations,deviceId,accountId,parentOfferId,retailerLocationIds,offerLocations,tags,title,subTitle,details,subDetails,finePrint,barcodeType,barcodeEntry,externalRedeemOptions,externalUrl,externalId,ticketsRewardType,ticketsReward,activated,expires,noExpiration,availableLimit,availableLimitPerUser,addedLimit,viewLimit,maxPrints,ticketPriceType,ticketPrice,fullPrice,discountPrice,showRemaining,showRedeemed,replaced,featured,offerType,specialOfferType,offerVisibility,categoryIds,filterIds,active,barcodeAssetId,imageAssetId,imageAssetId1,imageAssetId2,imageAssetId3,imageAssetId4,imageAssetId5,publisher,redeemableStart,redeemableEnd,brand,productType,conditionType,isbn,asin,catalogNumbers,department,features,minimumPrice,width,height,depth,weight,unit,studio,parentalRating,publishDate,availabilityDate,sizeId,listingId,mediaType,duration,author,releaseDate,collectionIds,rebootTimeHour,rebootTimeMinute,idleTimeoutInSecond,serialNumber,udid,deviceType,devicePower,deviceInterference,availability,availabilitySummary,securityContext);
    }
    @POST
    @Path("/offer/status")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Activate Offer", notes = "Sets the activated date on offers. This will make offers visible for consumers.", response = SirqulResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateOfferStatus( @NotNull @QueryParam("offerIds") String offerIds, @NotNull @QueryParam("active") Boolean active, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateOfferStatus(offerIds,active,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Retailer", notes = "Update a retailer record. Only the owner and the employees of the retailer have access to update its information.", response = RetailerFullResponse.class, tags={ "Retailer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerFullResponse.class) })
    public Response updateRetailer( @NotNull @QueryParam("retailerId") Long retailerId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("country") String country, @QueryParam("businessPhone") String businessPhone, @QueryParam("businessPhoneExt") String businessPhoneExt, @QueryParam("website") String website, @QueryParam("email") String email, @QueryParam("facebookUrl") String facebookUrl, @QueryParam("twitterUrl") String twitterUrl, @QueryParam("logo") File logo, @QueryParam("logoAssetId") Long logoAssetId, @QueryParam("picture1") File picture1, @QueryParam("picture1AssetId") Long picture1AssetId, @QueryParam("picture2") File picture2, @QueryParam("picture2AssetId") Long picture2AssetId, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("metaData") String metaData, @QueryParam("searchTags") String searchTags, @QueryParam("retailerType") String retailerType,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @QueryParam("active") Boolean active,, allowableValues="HTML, XML, JSON, CSV" @QueryParam("responseFormat") String responseFormat,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateRetailer(retailerId,deviceId,accountId,name,streetAddress,streetAddress2,city,state,postalCode,country,businessPhone,businessPhoneExt,website,email,facebookUrl,twitterUrl,logo,logoAssetId,picture1,picture1AssetId,picture2,picture2AssetId,categoryIds,filterIds,latitude,longitude,metaData,searchTags,retailerType,visibility,active,responseFormat,securityContext);
    }
    @POST
    @Path("/location/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Retailer Location", notes = "Updates a location record for a retailer. Only the owner and the employees of the retailer have access to do this.", response = RetailerLocationResponse.class, tags={ "Retailer Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class) })
    public Response updateRetailerLocations( @NotNull @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("country") String country, @QueryParam("businessPhone") String businessPhone, @QueryParam("businessPhoneExt") String businessPhoneExt, @QueryParam("website") String website, @QueryParam("email") String email, @QueryParam("internalId") String internalId, @QueryParam("detailsHeader") String detailsHeader, @QueryParam("detailsBody") String detailsBody, @QueryParam("hours") String hours, @QueryParam("logo") File logo, @QueryParam("logoAssetId") Long logoAssetId, @QueryParam("picture1") File picture1, @QueryParam("picture1AssetId") Long picture1AssetId, @QueryParam("picture2") File picture2, @QueryParam("picture2AssetId") Long picture2AssetId, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("building") String building, @QueryParam("googlePlaceId") String googlePlaceId, @QueryParam("yelpId") String yelpId, @QueryParam("metaData") String metaData, @QueryParam("paymentProvider") String paymentProvider, @QueryParam("active") Boolean active, @QueryParam("publicLocation") Boolean publicLocation, @QueryParam("locationType") String locationType, @QueryParam("audienceIds") String audienceIds, @QueryParam("audienceIdsToAdd") String audienceIdsToAdd, @QueryParam("audienceIdsToRemove") String audienceIdsToRemove,, allowableValues="HTML, XML, JSON, CSV" @QueryParam("responseFormat") String responseFormat, @QueryParam("tags") String tags,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateRetailerLocations(retailerLocationId,deviceId,accountId,name,streetAddress,streetAddress2,city,state,postalCode,country,businessPhone,businessPhoneExt,website,email,internalId,detailsHeader,detailsBody,hours,logo,logoAssetId,picture1,picture1AssetId,picture2,picture2AssetId,categoryIds,filterIds,latitude,longitude,building,googlePlaceId,yelpId,metaData,paymentProvider,active,publicLocation,locationType,audienceIds,audienceIdsToAdd,audienceIdsToRemove,responseFormat,tags,securityContext);
    }
}
