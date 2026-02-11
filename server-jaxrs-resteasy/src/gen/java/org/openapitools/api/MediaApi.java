package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.MediaApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.MediaOfferResponse;
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

@Path("/media")


@io.swagger.annotations.Api(description = "the media API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class MediaApi  {

    @Inject MediaApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Media", notes = "Create a media offering.", response = MediaOfferResponse.class, tags={ "Media", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MediaOfferResponse.class) })
    public Response createMedia( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("title") String title, @NotNull, allowableValues="NONE, UPC, CODE_128, QR, CUSTOM_MEDIA" @QueryParam("barcodeType") String barcodeType, @NotNull @QueryParam("noExpiration") Boolean noExpiration, @NotNull @QueryParam("availableLimit") Integer availableLimit, @NotNull @QueryParam("availableLimitPerUser") Integer availableLimitPerUser, @NotNull @QueryParam("addedLimit") Integer addedLimit, @NotNull @QueryParam("viewLimit") Integer viewLimit, @NotNull @QueryParam("maxPrints") Integer maxPrints, @NotNull @QueryParam("ticketPrice") Long ticketPrice, @NotNull @QueryParam("fullPrice") Double fullPrice, @NotNull @QueryParam("discountPrice") Double discountPrice, @NotNull, allowableValues="ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW, SQOOT, TICKETS, YIPIT" @QueryParam("specialOfferType") String specialOfferType, @NotNull, allowableValues="PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE" @QueryParam("offerVisibility") String offerVisibility, @NotNull @QueryParam("active") Boolean active, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("subTitle") String subTitle, @QueryParam("details") String details, @QueryParam("subDetails") String subDetails, @QueryParam("finePrint") String finePrint, @QueryParam("barcodeEntry") String barcodeEntry, @QueryParam("externalRedeemOptions") String externalRedeemOptions, @QueryParam("externalUrl") String externalUrl, @QueryParam("ticketsRewardType") String ticketsRewardType, @QueryParam("ticketsReward") Long ticketsReward, @QueryParam("activated") Long activated, @QueryParam("expires") Long expires, @QueryParam("ticketPriceType") String ticketPriceType, @QueryParam("showRemaining") Boolean showRemaining, @QueryParam("showRedeemed") Boolean showRedeemed, @QueryParam("replaced") Boolean replaced, @QueryParam("featured") Boolean featured, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("barcodeAssetId") Long barcodeAssetId, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("imageAssetId1") Long imageAssetId1, @QueryParam("imageAssetId2") Long imageAssetId2, @QueryParam("imageAssetId3") Long imageAssetId3, @QueryParam("imageAssetId4") Long imageAssetId4, @QueryParam("imageAssetId5") Long imageAssetId5, @QueryParam("publisher") String publisher, @QueryParam("redeemableStart") Long redeemableStart, @QueryParam("redeemableEnd") Long redeemableEnd,, allowableValues="NEW, USED, REFURBISHED, OTHER" @QueryParam("conditionType") String conditionType, @QueryParam("isbn") String isbn, @QueryParam("asin") String asin, @QueryParam("catalogNumbers") String catalogNumbers, @QueryParam("parentalRating") String parentalRating, @QueryParam("availabilityDate") Long availabilityDate,, allowableValues="APK, APPLICATION, IMAGE, AUDIO, VIDEO, MULTIPART, BAR_CODE, TEXT, OTHER" @QueryParam("mediaType") String mediaType, @QueryParam("duration") Integer duration, @QueryParam("author") String author, @QueryParam("releaseDate") Long releaseDate, @QueryParam("collectionIds") String collectionIds, @QueryParam("availability") String availability, @QueryParam("availabilitySummary") String availabilitySummary,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createMedia(accountId,title,barcodeType,noExpiration,availableLimit,availableLimitPerUser,addedLimit,viewLimit,maxPrints,ticketPrice,fullPrice,discountPrice,specialOfferType,offerVisibility,active,retailerLocationIds,subTitle,details,subDetails,finePrint,barcodeEntry,externalRedeemOptions,externalUrl,ticketsRewardType,ticketsReward,activated,expires,ticketPriceType,showRemaining,showRedeemed,replaced,featured,categoryIds,filterIds,barcodeAssetId,imageAssetId,imageAssetId1,imageAssetId2,imageAssetId3,imageAssetId4,imageAssetId5,publisher,redeemableStart,redeemableEnd,conditionType,isbn,asin,catalogNumbers,parentalRating,availabilityDate,mediaType,duration,author,releaseDate,collectionIds,availability,availabilitySummary,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Media", notes = "Delete a media offering that the user has permissions to.", response = SirqulResponse.class, tags={ "Media", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteMedia( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("mediaId") Long mediaId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteMedia(accountId,mediaId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Media Get", notes = "Get a media offering.", response = MediaOfferResponse.class, tags={ "Media", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MediaOfferResponse.class) })
    public Response getMedia( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("mediaId") Long mediaId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getMedia(accountId,mediaId,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Media", notes = "Searches on events that the account has access to.", response = MediaOfferResponse.class, responseContainer = "List", tags={ "Media", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MediaOfferResponse.class, responseContainer = "List") })
    public Response searchMedia( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @NotNull, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, REDEEMABLE_START, REDEEMABLE_END, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, VOUCHER_DISCOUNT_PRICE, FULL_PRICE, DICOUNT_PRICE, TICKETS_REWARD, AVAILABILITY_DATE, RELEASE_DATE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @QueryParam("keyword") String keyword, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchMedia(accountId,activeOnly,sortField,descending,keyword,categoryIds,filterIds,start,limit,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Media", notes = "Update a media offering.", response = MediaOfferResponse.class, tags={ "Media", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MediaOfferResponse.class) })
    public Response updateMedia( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("mediaId") Long mediaId, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("offerLocations") String offerLocations, @QueryParam("title") String title, @QueryParam("subTitle") String subTitle, @QueryParam("details") String details, @QueryParam("subDetails") String subDetails, @QueryParam("finePrint") String finePrint,, allowableValues="NONE, UPC, CODE_128, QR, CUSTOM_MEDIA" @QueryParam("barcodeType") String barcodeType, @QueryParam("barcodeEntry") String barcodeEntry, @QueryParam("externalRedeemOptions") String externalRedeemOptions, @QueryParam("externalUrl") String externalUrl, @QueryParam("ticketsRewardType") String ticketsRewardType, @QueryParam("ticketsReward") Long ticketsReward, @QueryParam("activated") Long activated, @QueryParam("expires") Long expires, @QueryParam("noExpiration") Boolean noExpiration, @QueryParam("availableLimit") Integer availableLimit, @QueryParam("availableLimitPerUser") Integer availableLimitPerUser, @QueryParam("addedLimit") Integer addedLimit, @QueryParam("viewLimit") Integer viewLimit, @QueryParam("maxPrints") Integer maxPrints, @QueryParam("ticketPriceType") String ticketPriceType, @QueryParam("ticketPrice") Long ticketPrice, @QueryParam("fullPrice") Double fullPrice, @QueryParam("discountPrice") Double discountPrice, @QueryParam("showRemaining") Boolean showRemaining, @QueryParam("showRedeemed") Boolean showRedeemed, @QueryParam("replaced") Boolean replaced, @QueryParam("featured") Boolean featured,, allowableValues="ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW, SQOOT, TICKETS, YIPIT" @QueryParam("specialOfferType") String specialOfferType,, allowableValues="PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE" @QueryParam("offerVisibility") String offerVisibility, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("active") Boolean active, @QueryParam("barcodeAssetId") Long barcodeAssetId, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("imageAssetId1") Long imageAssetId1, @QueryParam("imageAssetId2") Long imageAssetId2, @QueryParam("imageAssetId3") Long imageAssetId3, @QueryParam("imageAssetId4") Long imageAssetId4, @QueryParam("imageAssetId5") Long imageAssetId5, @QueryParam("publisher") String publisher, @QueryParam("redeemableStart") Long redeemableStart, @QueryParam("redeemableEnd") Long redeemableEnd,, allowableValues="NEW, USED, REFURBISHED, OTHER" @QueryParam("conditionType") String conditionType, @QueryParam("isbn") String isbn, @QueryParam("asin") String asin, @QueryParam("catalogNumbers") String catalogNumbers, @QueryParam("availabilityDate") Long availabilityDate, @QueryParam("parentalRating") String parentalRating,, allowableValues="APK, APPLICATION, IMAGE, AUDIO, VIDEO, MULTIPART, BAR_CODE, TEXT, OTHER" @QueryParam("mediaType") String mediaType, @QueryParam("duration") Integer duration, @QueryParam("author") String author, @QueryParam("releaseDate") Long releaseDate, @QueryParam("collectionIds") String collectionIds, @QueryParam("availability") String availability, @QueryParam("availabilitySummary") String availabilitySummary,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateMedia(accountId,mediaId,retailerLocationIds,offerLocations,title,subTitle,details,subDetails,finePrint,barcodeType,barcodeEntry,externalRedeemOptions,externalUrl,ticketsRewardType,ticketsReward,activated,expires,noExpiration,availableLimit,availableLimitPerUser,addedLimit,viewLimit,maxPrints,ticketPriceType,ticketPrice,fullPrice,discountPrice,showRemaining,showRedeemed,replaced,featured,specialOfferType,offerVisibility,categoryIds,filterIds,active,barcodeAssetId,imageAssetId,imageAssetId1,imageAssetId2,imageAssetId3,imageAssetId4,imageAssetId5,publisher,redeemableStart,redeemableEnd,conditionType,isbn,asin,catalogNumbers,availabilityDate,parentalRating,mediaType,duration,author,releaseDate,collectionIds,availability,availabilitySummary,securityContext);
    }
}
