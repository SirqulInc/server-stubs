package org.openapitools.api;

import org.openapitools.model.MediaOfferResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/media")
@Api(value = "/", description = "")
public interface MediaApi  {

    /**
     * Create Media
     *
     * Create a media offering.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Media", tags={ "Media" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MediaOfferResponse.class) })
    public MediaOfferResponse createMedia(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("title") @NotNull String title, @QueryParam("barcodeType") @NotNull String barcodeType, @QueryParam("noExpiration") @NotNull Boolean noExpiration, @QueryParam("availableLimit") @NotNull Integer availableLimit, @QueryParam("availableLimitPerUser") @NotNull Integer availableLimitPerUser, @QueryParam("addedLimit") @NotNull Integer addedLimit, @QueryParam("viewLimit") @NotNull Integer viewLimit, @QueryParam("maxPrints") @NotNull Integer maxPrints, @QueryParam("ticketPrice") @NotNull Long ticketPrice, @QueryParam("fullPrice") @NotNull Double fullPrice, @QueryParam("discountPrice") @NotNull Double discountPrice, @QueryParam("specialOfferType") @NotNull String specialOfferType, @QueryParam("offerVisibility") @NotNull String offerVisibility, @QueryParam("active") @NotNull Boolean active, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("subTitle") String subTitle, @QueryParam("details") String details, @QueryParam("subDetails") String subDetails, @QueryParam("finePrint") String finePrint, @QueryParam("barcodeEntry") String barcodeEntry, @QueryParam("externalRedeemOptions") String externalRedeemOptions, @QueryParam("externalUrl") String externalUrl, @QueryParam("ticketsRewardType") String ticketsRewardType, @QueryParam("ticketsReward") Long ticketsReward, @QueryParam("activated") Long activated, @QueryParam("expires") Long expires, @QueryParam("ticketPriceType") String ticketPriceType, @QueryParam("showRemaining") Boolean showRemaining, @QueryParam("showRedeemed") Boolean showRedeemed, @QueryParam("replaced") Boolean replaced, @QueryParam("featured") Boolean featured, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("barcodeAssetId") Long barcodeAssetId, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("imageAssetId1") Long imageAssetId1, @QueryParam("imageAssetId2") Long imageAssetId2, @QueryParam("imageAssetId3") Long imageAssetId3, @QueryParam("imageAssetId4") Long imageAssetId4, @QueryParam("imageAssetId5") Long imageAssetId5, @QueryParam("publisher") String publisher, @QueryParam("redeemableStart") Long redeemableStart, @QueryParam("redeemableEnd") Long redeemableEnd, @QueryParam("conditionType") String conditionType, @QueryParam("isbn") String isbn, @QueryParam("asin") String asin, @QueryParam("catalogNumbers") String catalogNumbers, @QueryParam("parentalRating") String parentalRating, @QueryParam("availabilityDate") Long availabilityDate, @QueryParam("mediaType") String mediaType, @QueryParam("duration") Integer duration, @QueryParam("author") String author, @QueryParam("releaseDate") Long releaseDate, @QueryParam("collectionIds") String collectionIds, @QueryParam("availability") String availability, @QueryParam("availabilitySummary") String availabilitySummary);

    /**
     * Delete Media
     *
     * Delete a media offering that the user has permissions to.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Media", tags={ "Media" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteMedia(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("mediaId") @NotNull Long mediaId);

    /**
     * Media Get
     *
     * Get a media offering.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Media Get", tags={ "Media" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MediaOfferResponse.class) })
    public MediaOfferResponse getMedia(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("mediaId") @NotNull Long mediaId);

    /**
     * Search Media
     *
     * Searches on events that the account has access to.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Media", tags={ "Media" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MediaOfferResponse.class, responseContainer = "List") })
    public List<MediaOfferResponse> searchMedia(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("activeOnly") @NotNull Boolean activeOnly, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("keyword") String keyword, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit);

    /**
     * Update Media
     *
     * Update a media offering.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Media", tags={ "Media" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MediaOfferResponse.class) })
    public MediaOfferResponse updateMedia(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("mediaId") @NotNull Long mediaId, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("offerLocations") String offerLocations, @QueryParam("title") String title, @QueryParam("subTitle") String subTitle, @QueryParam("details") String details, @QueryParam("subDetails") String subDetails, @QueryParam("finePrint") String finePrint, @QueryParam("barcodeType") String barcodeType, @QueryParam("barcodeEntry") String barcodeEntry, @QueryParam("externalRedeemOptions") String externalRedeemOptions, @QueryParam("externalUrl") String externalUrl, @QueryParam("ticketsRewardType") String ticketsRewardType, @QueryParam("ticketsReward") Long ticketsReward, @QueryParam("activated") Long activated, @QueryParam("expires") Long expires, @QueryParam("noExpiration") Boolean noExpiration, @QueryParam("availableLimit") Integer availableLimit, @QueryParam("availableLimitPerUser") Integer availableLimitPerUser, @QueryParam("addedLimit") Integer addedLimit, @QueryParam("viewLimit") Integer viewLimit, @QueryParam("maxPrints") Integer maxPrints, @QueryParam("ticketPriceType") String ticketPriceType, @QueryParam("ticketPrice") Long ticketPrice, @QueryParam("fullPrice") Double fullPrice, @QueryParam("discountPrice") Double discountPrice, @QueryParam("showRemaining") Boolean showRemaining, @QueryParam("showRedeemed") Boolean showRedeemed, @QueryParam("replaced") Boolean replaced, @QueryParam("featured") Boolean featured, @QueryParam("specialOfferType") String specialOfferType, @QueryParam("offerVisibility") String offerVisibility, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("active") Boolean active, @QueryParam("barcodeAssetId") Long barcodeAssetId, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("imageAssetId1") Long imageAssetId1, @QueryParam("imageAssetId2") Long imageAssetId2, @QueryParam("imageAssetId3") Long imageAssetId3, @QueryParam("imageAssetId4") Long imageAssetId4, @QueryParam("imageAssetId5") Long imageAssetId5, @QueryParam("publisher") String publisher, @QueryParam("redeemableStart") Long redeemableStart, @QueryParam("redeemableEnd") Long redeemableEnd, @QueryParam("conditionType") String conditionType, @QueryParam("isbn") String isbn, @QueryParam("asin") String asin, @QueryParam("catalogNumbers") String catalogNumbers, @QueryParam("availabilityDate") Long availabilityDate, @QueryParam("parentalRating") String parentalRating, @QueryParam("mediaType") String mediaType, @QueryParam("duration") Integer duration, @QueryParam("author") String author, @QueryParam("releaseDate") Long releaseDate, @QueryParam("collectionIds") String collectionIds, @QueryParam("availability") String availability, @QueryParam("availabilitySummary") String availabilitySummary);
}
