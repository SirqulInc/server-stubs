package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.ListCountResponse;
import org.openapitools.model.OfferListResponse;
import org.openapitools.model.OfferResponse;
import org.openapitools.model.OfferShortResponse;
import org.openapitools.model.OfferTransactionResponse;
import org.openapitools.model.RetailerOfferResponse;
import org.openapitools.model.SirqulResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
public class OfferApiServiceImpl implements OfferApi {
    /**
     * Update Offer Locations
     *
     * Batch update offer locations.
     *
     */
    public SirqulResponse batchUpdateOfferLocations(BigDecimal version, String data, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Offer
     *
     * Create an offer and assign it to the provided retailer locations.
     *
     */
    public RetailerOfferResponse createOffer(BigDecimal version, Boolean includeOfferLocations, String title, String barcodeType, Boolean noExpiration, Integer availableLimit, Integer availableLimitPerUser, Integer addedLimit, Integer viewLimit, Integer maxPrints, Long ticketPrice, Double fullPrice, Double discountPrice, String offerType, String specialOfferType, String offerVisibility, Boolean active, String deviceId, Long accountId, String tags, Long parentOfferId, String retailerLocationIds, String offerLocations, String subTitle, String details, String subDetails, String finePrint, String barcodeEntry, String externalRedeemOptions, String externalUrl, String externalId, String ticketsRewardType, Long ticketsReward, Long activated, Long expires, String ticketPriceType, Boolean showRemaining, Boolean showRedeemed, Boolean replaced, Boolean featured, String categoryIds, String filterIds, Long barcodeAssetId, Long imageAssetId, Long imageAssetId1, Long imageAssetId2, Long imageAssetId3, Long imageAssetId4, Long imageAssetId5, String publisher, Long redeemableStart, Long redeemableEnd, String brand, String productType, String conditionType, String isbn, String asin, String catalogNumbers, String department, String features, Double minimumPrice, Double width, Double height, Double depth, Double weight, String unit, String studio, String parentalRating, Long publishDate, Long availabilityDate, Long sizeId, Long listingId, String mediaType, Integer duration, String author, Long releaseDate, String collectionIds, Integer rebootTimeHour, Integer rebootTimeMinute, Integer idleTimeoutInSecond, String serialNumber, String udid, String deviceType, Double devicePower, Double deviceInterference, String availability, String availabilitySummary) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Offer
     *
     * Set the deleted timestamp to current time. This effectively deletes the offer since all queries should ignore any records with a deleted time stamp.
     *
     */
    public SirqulResponse deleteOffer(BigDecimal version, Long offerId, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Offer Location
     *
     * Set the deleted timestamp to current time. This effectively deletes the offer location since all queries should ignore any records with a deleted time stamp.
     *
     */
    public SirqulResponse deleteOfferLocation(BigDecimal version, Long offerLocationId, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Offer
     *
     * Gets the details of an offer that the user has access to.
     *
     */
    public RetailerOfferResponse getOffer(BigDecimal version, Long offerId, Boolean includeOfferLocations, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Offer
     *
     * Gets offer or offer location details as a consumer.  Will check if it is a favorite if the deviceId/accountId is provided.  If the offerId is provided it will look up the main offer and ignore the the offerLocationId. If no offerId is provided then an offerLocationId must be specified.
     *
     */
    public OfferResponse getOfferDetails(BigDecimal version, String deviceId, Long accountId, Long offerId, Long offerLocationId, Double distance, Double latitude, Double longitude, Boolean includeOfferLocations, Boolean includeRetailerLocations, Boolean includeChildOffers) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Offers (Counts)
     *
     * Gets the offer list counts.
     *
     */
    public ListCountResponse getOfferListCounts(BigDecimal version, Double latitude, Double longitude, BigDecimal searchRange, String distanceUnit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Offer Location
     *
     * Gets the offer location by offer location id or udid (of a device)
     *
     */
    public OfferShortResponse getOfferLocation(BigDecimal version, Long offerLocationId, String udid) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Offer Locations
     *
     * Searches on offer locations, which are records that represent an offer that has been assigned to a retailer location. If an offer does not have any locations assigned, then it will NOT be returned.
     *
     */
    public List<OfferShortResponse> getOfferLocationsForRetailers(BigDecimal version, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Boolean includeRetailerLocation, String deviceId, Long accountId, String keyword, Long retailerId, Long retailerLocationId, String offerType, String specialOfferType, String barcodeType, String barcodeEntry, String isbn, String asin, String deviceStatus, Boolean needsNotificationSent, Long lastNotificationSent) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Offers
     *
     * Searches on offers that the account has access to.
     *
     */
    public List<OfferResponse> getOffersForRetailers(BigDecimal version, String offerVisibility, String sortField, Boolean descending, Integer start, Integer limit, Boolean availableOnly, Boolean activeOnly, Boolean includeCategories, Boolean includeFilters, Boolean includeOfferLocations, String deviceId, Long accountId, String categoryIds, String filterIds, String q, String keyword, Long retailerId, Long retailerLocationId, String couponType, String offerType, String offerTypes, String specialOfferType, Integer i, Integer l, String barcodeType, String barcodeEntry, String isbn, String asin, String deviceStatus, Boolean needsNotificationSent, Long lastNotificationSent) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Offer Transaction
     *
     * Redeems an offer.
     *
     */
    public SirqulResponse redeemOfferTransaction(BigDecimal version, Long offerTransactionId, Integer status, String deviceId, Long accountId, Long offerLocationId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Offer Transactions
     *
     * Searches on offer transactions for offers that the account has access to.
     *
     */
    public List<OfferTransactionResponse> searchOfferTransactionsForRetailers(BigDecimal version, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly, String deviceId, Long accountId, String q, String keyword, Long retailerId, Long retailerLocationId, Long offerId, Long offerLocationId, Boolean redeemed, Boolean reservationsOnly, String couponType, String offerType, String specialOfferType, String customerAccountIds, String categoryIds, Long redeemableStartDate, Long redeemableEndDate, Integer i, Integer l) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Offers
     *
     * Searches for offers as a consumer.
     *
     */
    public OfferListResponse searchOffersForConsumer(BigDecimal version, Double latitude, Double longitude, String recommendationType, Long locationId, Integer start, Integer limit, Integer maxRecommendations, String distanceUnit, String appKey, String deviceId, Long accountId, Double searchRange, String tags, String supportedPostalCodes, String keyword, String categories, String filters, String offerTypes, String type, String sortField, String recommendOfferIds, String retailerLocationIds, Long offerId, Boolean includeMission, Boolean includeCategories, Boolean includeFilters, Boolean includeExpired, Boolean includeFavorite, Boolean closestOfferOnly, String searchExpression, String groupBy) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Offers (Top)
     *
     * Gets the top active offers.
     *
     */
    public OfferListResponse topOfferTransactions(BigDecimal version, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Offer
     *
     * Update an offer, must provide a current list of retailer locations or the current offer locations will be marked as deleted.
     *
     */
    public RetailerOfferResponse updateOffer(BigDecimal version, Long offerId, Boolean includeOfferLocations, String deviceId, Long accountId, Long parentOfferId, String retailerLocationIds, String offerLocations, String tags, String title, String subTitle, String details, String subDetails, String finePrint, String barcodeType, String barcodeEntry, String externalRedeemOptions, String externalUrl, String externalId, String ticketsRewardType, Long ticketsReward, Long activated, Long expires, Boolean noExpiration, Integer availableLimit, Integer availableLimitPerUser, Integer addedLimit, Integer viewLimit, Integer maxPrints, String ticketPriceType, Long ticketPrice, Double fullPrice, Double discountPrice, Boolean showRemaining, Boolean showRedeemed, Boolean replaced, Boolean featured, String offerType, String specialOfferType, String offerVisibility, String categoryIds, String filterIds, Boolean active, Long barcodeAssetId, Long imageAssetId, Long imageAssetId1, Long imageAssetId2, Long imageAssetId3, Long imageAssetId4, Long imageAssetId5, String publisher, Long redeemableStart, Long redeemableEnd, String brand, String productType, String conditionType, String isbn, String asin, String catalogNumbers, String department, String features, Double minimumPrice, Double width, Double height, Double depth, Double weight, String unit, String studio, String parentalRating, Long publishDate, Long availabilityDate, Long sizeId, Long listingId, String mediaType, Integer duration, String author, Long releaseDate, String collectionIds, Integer rebootTimeHour, Integer rebootTimeMinute, Integer idleTimeoutInSecond, String serialNumber, String udid, String deviceType, Double devicePower, Double deviceInterference, String availability, String availabilitySummary) {
        // TODO: Implement...

        return null;
    }

    /**
     * Activate Offer
     *
     * Sets the activated date on offers. This will make offers visible for consumers.
     *
     */
    public SirqulResponse updateOfferStatus(BigDecimal version, String offerIds, Boolean active, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

}
