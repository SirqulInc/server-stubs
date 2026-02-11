package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.ListCountResponse;
import org.openapitools.model.OfferListResponse;
import org.openapitools.model.OfferResponse;
import org.openapitools.model.OfferShortResponse;
import org.openapitools.model.OfferTransactionResponse;
import org.openapitools.model.RetailerOfferResponse;
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
@Path("")
@Api(value = "/", description = "")
public interface OfferApi  {

    /**
     * Update Offer Locations
     *
     * Batch update offer locations.
     *
     */
    @POST
    @Path("/retailer/offer/location/batchUpdate")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Offer Locations", tags={ "Offer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse batchUpdateOfferLocations(@QueryParam("data") @NotNull String data, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Create Offer
     *
     * Create an offer and assign it to the provided retailer locations.
     *
     */
    @POST
    @Path("/retailer/offer/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Offer", tags={ "Offer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RetailerOfferResponse.class) })
    public RetailerOfferResponse createOffer(@QueryParam("includeOfferLocations") @NotNull Boolean includeOfferLocations, @QueryParam("title") @NotNull String title, @QueryParam("barcodeType") @NotNull String barcodeType, @QueryParam("noExpiration") @NotNull Boolean noExpiration, @QueryParam("availableLimit") @NotNull Integer availableLimit, @QueryParam("availableLimitPerUser") @NotNull Integer availableLimitPerUser, @QueryParam("addedLimit") @NotNull Integer addedLimit, @QueryParam("viewLimit") @NotNull Integer viewLimit, @QueryParam("maxPrints") @NotNull Integer maxPrints, @QueryParam("ticketPrice") @NotNull Long ticketPrice, @QueryParam("fullPrice") @NotNull Double fullPrice, @QueryParam("discountPrice") @NotNull Double discountPrice, @QueryParam("offerType") @NotNull String offerType, @QueryParam("specialOfferType") @NotNull String specialOfferType, @QueryParam("offerVisibility") @NotNull String offerVisibility, @QueryParam("active") @NotNull Boolean active, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("tags") String tags, @QueryParam("parentOfferId") Long parentOfferId, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("offerLocations") String offerLocations, @QueryParam("subTitle") String subTitle, @QueryParam("details") String details, @QueryParam("subDetails") String subDetails, @QueryParam("finePrint") String finePrint, @QueryParam("barcodeEntry") String barcodeEntry, @QueryParam("externalRedeemOptions") String externalRedeemOptions, @QueryParam("externalUrl") String externalUrl, @QueryParam("externalId") String externalId, @QueryParam("ticketsRewardType") String ticketsRewardType, @QueryParam("ticketsReward") Long ticketsReward, @QueryParam("activated") Long activated, @QueryParam("expires") Long expires, @QueryParam("ticketPriceType") String ticketPriceType, @QueryParam("showRemaining") Boolean showRemaining, @QueryParam("showRedeemed") Boolean showRedeemed, @QueryParam("replaced") Boolean replaced, @QueryParam("featured") Boolean featured, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("barcodeAssetId") Long barcodeAssetId, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("imageAssetId1") Long imageAssetId1, @QueryParam("imageAssetId2") Long imageAssetId2, @QueryParam("imageAssetId3") Long imageAssetId3, @QueryParam("imageAssetId4") Long imageAssetId4, @QueryParam("imageAssetId5") Long imageAssetId5, @QueryParam("publisher") String publisher, @QueryParam("redeemableStart") Long redeemableStart, @QueryParam("redeemableEnd") Long redeemableEnd, @QueryParam("brand") String brand, @QueryParam("productType") String productType, @QueryParam("conditionType") String conditionType, @QueryParam("isbn") String isbn, @QueryParam("asin") String asin, @QueryParam("catalogNumbers") String catalogNumbers, @QueryParam("department") String department, @QueryParam("features") String features, @QueryParam("minimumPrice") Double minimumPrice, @QueryParam("width") Double width, @QueryParam("height") Double height, @QueryParam("depth") Double depth, @QueryParam("weight") Double weight, @QueryParam("unit") String unit, @QueryParam("studio") String studio, @QueryParam("parentalRating") String parentalRating, @QueryParam("publishDate") Long publishDate, @QueryParam("availabilityDate") Long availabilityDate, @QueryParam("sizeId") Long sizeId, @QueryParam("listingId") Long listingId, @QueryParam("mediaType") String mediaType, @QueryParam("duration") Integer duration, @QueryParam("author") String author, @QueryParam("releaseDate") Long releaseDate, @QueryParam("collectionIds") String collectionIds, @QueryParam("rebootTimeHour") Integer rebootTimeHour, @QueryParam("rebootTimeMinute") Integer rebootTimeMinute, @QueryParam("idleTimeoutInSecond") Integer idleTimeoutInSecond, @QueryParam("serialNumber") String serialNumber, @QueryParam("udid") String udid, @QueryParam("deviceType") String deviceType, @QueryParam("devicePower") Double devicePower, @QueryParam("deviceInterference") Double deviceInterference, @QueryParam("availability") String availability, @QueryParam("availabilitySummary") String availabilitySummary);

    /**
     * Delete Offer
     *
     * Set the deleted timestamp to current time. This effectively deletes the offer since all queries should ignore any records with a deleted time stamp.
     *
     */
    @POST
    @Path("/retailer/offer/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Offer", tags={ "Offer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteOffer(@QueryParam("offerId") @NotNull Long offerId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Delete Offer Location
     *
     * Set the deleted timestamp to current time. This effectively deletes the offer location since all queries should ignore any records with a deleted time stamp.
     *
     */
    @POST
    @Path("/retailer/offer/location/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Offer Location", tags={ "Offer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteOfferLocation(@QueryParam("offerLocationId") @NotNull Long offerLocationId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Get Offer
     *
     * Gets the details of an offer that the user has access to.
     *
     */
    @GET
    @Path("/retailer/offer/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Offer", tags={ "Offer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RetailerOfferResponse.class) })
    public RetailerOfferResponse getOffer(@QueryParam("offerId") @NotNull Long offerId, @QueryParam("includeOfferLocations") @NotNull Boolean includeOfferLocations, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Get Offer
     *
     * Gets offer or offer location details as a consumer.  Will check if it is a favorite if the deviceId/accountId is provided.  If the offerId is provided it will look up the main offer and ignore the the offerLocationId. If no offerId is provided then an offerLocationId must be specified.
     *
     */
    @GET
    @Path("/offer/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Offer", tags={ "Offer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class) })
    public OfferResponse getOfferDetails(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("distance") Double distance, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("includeOfferLocations") @DefaultValue("false")Boolean includeOfferLocations, @QueryParam("includeRetailerLocations") @DefaultValue("false")Boolean includeRetailerLocations, @QueryParam("includeChildOffers") @DefaultValue("false")Boolean includeChildOffers);

    /**
     * Get Offers (Counts)
     *
     * Gets the offer list counts.
     *
     */
    @GET
    @Path("/offer/lists/count")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Offers (Counts)", tags={ "Offer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ListCountResponse.class) })
    public ListCountResponse getOfferListCounts(@QueryParam("latitude") @NotNull Double latitude, @QueryParam("longitude") @NotNull Double longitude, @QueryParam("searchRange") @DefaultValue("5")BigDecimal searchRange, @QueryParam("distanceUnit") @DefaultValue("MILES")String distanceUnit);

    /**
     * Get Offer Location
     *
     * Gets the offer location by offer location id or udid (of a device)
     *
     */
    @GET
    @Path("/offer/location/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Offer Location", tags={ "Offer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferShortResponse.class) })
    public OfferShortResponse getOfferLocation(@QueryParam("offerLocationId") Long offerLocationId, @QueryParam("udid") String udid);

    /**
     * Search Offer Locations
     *
     * Searches on offer locations, which are records that represent an offer that has been assigned to a retailer location. If an offer does not have any locations assigned, then it will NOT be returned.
     *
     */
    @GET
    @Path("/retailer/offer/location/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Offer Locations", tags={ "Offer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferShortResponse.class, responseContainer = "List") })
    public List<OfferShortResponse> getOfferLocationsForRetailers(@QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("activeOnly") @NotNull Boolean activeOnly, @QueryParam("includeRetailerLocation") @NotNull Boolean includeRetailerLocation, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("offerType") String offerType, @QueryParam("specialOfferType") String specialOfferType, @QueryParam("barcodeType") String barcodeType, @QueryParam("barcodeEntry") String barcodeEntry, @QueryParam("isbn") String isbn, @QueryParam("asin") String asin, @QueryParam("deviceStatus") String deviceStatus, @QueryParam("needsNotificationSent") Boolean needsNotificationSent, @QueryParam("lastNotificationSent") Long lastNotificationSent);

    /**
     * Search Offers
     *
     * Searches on offers that the account has access to.
     *
     */
    @GET
    @Path("/retailer/offer/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Offers", tags={ "Offer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class, responseContainer = "List") })
    public List<OfferResponse> getOffersForRetailers(@QueryParam("offerVisibility") @NotNull String offerVisibility, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("availableOnly") @NotNull Boolean availableOnly, @QueryParam("activeOnly") @NotNull Boolean activeOnly, @QueryParam("includeCategories") @NotNull Boolean includeCategories, @QueryParam("includeFilters") @NotNull Boolean includeFilters, @QueryParam("includeOfferLocations") @NotNull Boolean includeOfferLocations, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("couponType") String couponType, @QueryParam("offerType") String offerType, @QueryParam("offerTypes") String offerTypes, @QueryParam("specialOfferType") String specialOfferType, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l, @QueryParam("barcodeType") String barcodeType, @QueryParam("barcodeEntry") String barcodeEntry, @QueryParam("isbn") String isbn, @QueryParam("asin") String asin, @QueryParam("deviceStatus") String deviceStatus, @QueryParam("needsNotificationSent") Boolean needsNotificationSent, @QueryParam("lastNotificationSent") Long lastNotificationSent);

    /**
     * Update Offer Transaction
     *
     * Redeems an offer.
     *
     */
    @POST
    @Path("/retailer/offer/transaction/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Offer Transaction", tags={ "Offer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse redeemOfferTransaction(@QueryParam("offerTransactionId") @NotNull Long offerTransactionId, @QueryParam("status") @NotNull Integer status, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("offerLocationId") Long offerLocationId);

    /**
     * Search Offer Transactions
     *
     * Searches on offer transactions for offers that the account has access to.
     *
     */
    @GET
    @Path("/retailer/offer/transaction/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Offer Transactions", tags={ "Offer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class, responseContainer = "List") })
    public List<OfferTransactionResponse> searchOfferTransactionsForRetailers(@QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("activeOnly") @NotNull Boolean activeOnly, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("redeemed") Boolean redeemed, @QueryParam("reservationsOnly") Boolean reservationsOnly, @QueryParam("couponType") String couponType, @QueryParam("offerType") String offerType, @QueryParam("specialOfferType") String specialOfferType, @QueryParam("customerAccountIds") String customerAccountIds, @QueryParam("categoryIds") String categoryIds, @QueryParam("redeemableStartDate") Long redeemableStartDate, @QueryParam("redeemableEndDate") Long redeemableEndDate, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l);

    /**
     * Search Offers
     *
     * Searches for offers as a consumer.
     *
     */
    @GET
    @Path("/offer/lists")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Offers", tags={ "Offer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferListResponse.class) })
    public OfferListResponse searchOffersForConsumer(@QueryParam("latitude") @NotNull Double latitude, @QueryParam("longitude") @NotNull Double longitude, @QueryParam("recommendationType") @NotNull String recommendationType, @QueryParam("locationId") @NotNull Long locationId, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("maxRecommendations") @NotNull Integer maxRecommendations, @QueryParam("distanceUnit") @NotNull String distanceUnit, @QueryParam("appKey") String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("searchRange") @DefaultValue("5")Double searchRange, @QueryParam("tags") String tags, @QueryParam("supportedPostalCodes") String supportedPostalCodes, @QueryParam("keyword") String keyword, @QueryParam("categories") String categories, @QueryParam("filters") String filters, @QueryParam("offerTypes") @DefaultValue("COUPON, VOUCHER")String offerTypes, @QueryParam("type") String type, @QueryParam("sortField") String sortField, @QueryParam("recommendOfferIds") String recommendOfferIds, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("offerId") Long offerId, @QueryParam("includeMission") Boolean includeMission, @QueryParam("includeCategories") Boolean includeCategories, @QueryParam("includeFilters") Boolean includeFilters, @QueryParam("includeExpired") Boolean includeExpired, @QueryParam("includeFavorite") Boolean includeFavorite, @QueryParam("closestOfferOnly") Boolean closestOfferOnly, @QueryParam("searchExpression") String searchExpression, @QueryParam("groupBy") String groupBy);

    /**
     * Get Offers (Top)
     *
     * Gets the top active offers.
     *
     */
    @GET
    @Path("/offer/top")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Offers (Top)", tags={ "Offer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferListResponse.class) })
    public OfferListResponse topOfferTransactions(@QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit);

    /**
     * Update Offer
     *
     * Update an offer, must provide a current list of retailer locations or the current offer locations will be marked as deleted.
     *
     */
    @POST
    @Path("/retailer/offer/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Offer", tags={ "Offer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RetailerOfferResponse.class) })
    public RetailerOfferResponse updateOffer(@QueryParam("offerId") @NotNull Long offerId, @QueryParam("includeOfferLocations") @NotNull Boolean includeOfferLocations, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("parentOfferId") Long parentOfferId, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("offerLocations") String offerLocations, @QueryParam("tags") String tags, @QueryParam("title") String title, @QueryParam("subTitle") String subTitle, @QueryParam("details") String details, @QueryParam("subDetails") String subDetails, @QueryParam("finePrint") String finePrint, @QueryParam("barcodeType") String barcodeType, @QueryParam("barcodeEntry") String barcodeEntry, @QueryParam("externalRedeemOptions") String externalRedeemOptions, @QueryParam("externalUrl") String externalUrl, @QueryParam("externalId") String externalId, @QueryParam("ticketsRewardType") String ticketsRewardType, @QueryParam("ticketsReward") Long ticketsReward, @QueryParam("activated") Long activated, @QueryParam("expires") Long expires, @QueryParam("noExpiration") Boolean noExpiration, @QueryParam("availableLimit") Integer availableLimit, @QueryParam("availableLimitPerUser") Integer availableLimitPerUser, @QueryParam("addedLimit") Integer addedLimit, @QueryParam("viewLimit") Integer viewLimit, @QueryParam("maxPrints") Integer maxPrints, @QueryParam("ticketPriceType") String ticketPriceType, @QueryParam("ticketPrice") Long ticketPrice, @QueryParam("fullPrice") Double fullPrice, @QueryParam("discountPrice") Double discountPrice, @QueryParam("showRemaining") Boolean showRemaining, @QueryParam("showRedeemed") Boolean showRedeemed, @QueryParam("replaced") Boolean replaced, @QueryParam("featured") Boolean featured, @QueryParam("offerType") String offerType, @QueryParam("specialOfferType") String specialOfferType, @QueryParam("offerVisibility") String offerVisibility, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("active") Boolean active, @QueryParam("barcodeAssetId") Long barcodeAssetId, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("imageAssetId1") Long imageAssetId1, @QueryParam("imageAssetId2") Long imageAssetId2, @QueryParam("imageAssetId3") Long imageAssetId3, @QueryParam("imageAssetId4") Long imageAssetId4, @QueryParam("imageAssetId5") Long imageAssetId5, @QueryParam("publisher") String publisher, @QueryParam("redeemableStart") Long redeemableStart, @QueryParam("redeemableEnd") Long redeemableEnd, @QueryParam("brand") String brand, @QueryParam("productType") String productType, @QueryParam("conditionType") String conditionType, @QueryParam("isbn") String isbn, @QueryParam("asin") String asin, @QueryParam("catalogNumbers") String catalogNumbers, @QueryParam("department") String department, @QueryParam("features") String features, @QueryParam("minimumPrice") Double minimumPrice, @QueryParam("width") Double width, @QueryParam("height") Double height, @QueryParam("depth") Double depth, @QueryParam("weight") Double weight, @QueryParam("unit") String unit, @QueryParam("studio") String studio, @QueryParam("parentalRating") String parentalRating, @QueryParam("publishDate") Long publishDate, @QueryParam("availabilityDate") Long availabilityDate, @QueryParam("sizeId") Long sizeId, @QueryParam("listingId") Long listingId, @QueryParam("mediaType") String mediaType, @QueryParam("duration") Integer duration, @QueryParam("author") String author, @QueryParam("releaseDate") Long releaseDate, @QueryParam("collectionIds") String collectionIds, @QueryParam("rebootTimeHour") Integer rebootTimeHour, @QueryParam("rebootTimeMinute") Integer rebootTimeMinute, @QueryParam("idleTimeoutInSecond") Integer idleTimeoutInSecond, @QueryParam("serialNumber") String serialNumber, @QueryParam("udid") String udid, @QueryParam("deviceType") String deviceType, @QueryParam("devicePower") Double devicePower, @QueryParam("deviceInterference") Double deviceInterference, @QueryParam("availability") String availability, @QueryParam("availabilitySummary") String availabilitySummary);

    /**
     * Activate Offer
     *
     * Sets the activated date on offers. This will make offers visible for consumers.
     *
     */
    @POST
    @Path("/retailer/offer/status")
    @Produces({ "*/*" })
    @ApiOperation(value = "Activate Offer", tags={ "Offer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse updateOfferStatus(@QueryParam("offerIds") @NotNull String offerIds, @QueryParam("active") @NotNull Boolean active, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);
}
