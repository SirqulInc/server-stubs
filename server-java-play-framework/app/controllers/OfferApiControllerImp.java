package controllers;

import java.math.BigDecimal;
import apimodels.ListCountResponse;
import apimodels.OfferListResponse;
import apimodels.OfferResponse;
import apimodels.OfferShortResponse;
import apimodels.OfferTransactionResponse;
import apimodels.RetailerOfferResponse;
import apimodels.SirqulResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OfferApiControllerImp extends OfferApiControllerImpInterface {
    @Override
    public SirqulResponse batchUpdateOfferLocations(Http.Request request, BigDecimal version, @NotNull String data, String deviceId, Long accountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public RetailerOfferResponse createOffer(Http.Request request, BigDecimal version, @NotNull Boolean includeOfferLocations, @NotNull String title, @NotNull String barcodeType, @NotNull Boolean noExpiration, @NotNull Integer availableLimit, @NotNull Integer availableLimitPerUser, @NotNull Integer addedLimit, @NotNull Integer viewLimit, @NotNull Integer maxPrints, @NotNull Long ticketPrice, @NotNull Double fullPrice, @NotNull Double discountPrice, @NotNull String offerType, @NotNull String specialOfferType, @NotNull String offerVisibility, @NotNull Boolean active, String deviceId, Long accountId, String tags, Long parentOfferId, String retailerLocationIds, String offerLocations, String subTitle, String details, String subDetails, String finePrint, String barcodeEntry, String externalRedeemOptions, String externalUrl, String externalId, String ticketsRewardType, Long ticketsReward, Long activated, Long expires, String ticketPriceType, Boolean showRemaining, Boolean showRedeemed, Boolean replaced, Boolean featured, String categoryIds, String filterIds, Long barcodeAssetId, Long imageAssetId, Long imageAssetId1, Long imageAssetId2, Long imageAssetId3, Long imageAssetId4, Long imageAssetId5, String publisher, Long redeemableStart, Long redeemableEnd, String brand, String productType, String conditionType, String isbn, String asin, String catalogNumbers, String department, String features, Double minimumPrice, Double width, Double height, Double depth, Double weight, String unit, String studio, String parentalRating, Long publishDate, Long availabilityDate, Long sizeId, Long listingId, String mediaType, Integer duration, String author, Long releaseDate, String collectionIds, Integer rebootTimeHour, Integer rebootTimeMinute, Integer idleTimeoutInSecond, String serialNumber, String udid, String deviceType, Double devicePower, Double deviceInterference, String availability, String availabilitySummary) throws Exception {
        //Do your magic!!!
        return new RetailerOfferResponse();
    }

    @Override
    public SirqulResponse deleteOffer(Http.Request request, BigDecimal version, @NotNull Long offerId, String deviceId, Long accountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse deleteOfferLocation(Http.Request request, BigDecimal version, @NotNull Long offerLocationId, String deviceId, Long accountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public RetailerOfferResponse getOffer(Http.Request request, BigDecimal version, @NotNull Long offerId, @NotNull Boolean includeOfferLocations, String deviceId, Long accountId) throws Exception {
        //Do your magic!!!
        return new RetailerOfferResponse();
    }

    @Override
    public OfferResponse getOfferDetails(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long offerId, Long offerLocationId, Double distance, Double latitude, Double longitude, Boolean includeOfferLocations, Boolean includeRetailerLocations, Boolean includeChildOffers) throws Exception {
        //Do your magic!!!
        return new OfferResponse();
    }

    @Override
    public ListCountResponse getOfferListCounts(Http.Request request, BigDecimal version, @NotNull Double latitude, @NotNull Double longitude, BigDecimal searchRange, String distanceUnit) throws Exception {
        //Do your magic!!!
        return new ListCountResponse();
    }

    @Override
    public OfferShortResponse getOfferLocation(Http.Request request, BigDecimal version, Long offerLocationId, String udid) throws Exception {
        //Do your magic!!!
        return new OfferShortResponse();
    }

    @Override
    public List<OfferShortResponse> getOfferLocationsForRetailers(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, @NotNull Boolean includeRetailerLocation, String deviceId, Long accountId, String keyword, Long retailerId, Long retailerLocationId, String offerType, String specialOfferType, String barcodeType, String barcodeEntry, String isbn, String asin, String deviceStatus, Boolean needsNotificationSent, Long lastNotificationSent) throws Exception {
        //Do your magic!!!
        return new ArrayList<OfferShortResponse>();
    }

    @Override
    public List<OfferResponse> getOffersForRetailers(Http.Request request, BigDecimal version, @NotNull String offerVisibility, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean availableOnly, @NotNull Boolean activeOnly, @NotNull Boolean includeCategories, @NotNull Boolean includeFilters, @NotNull Boolean includeOfferLocations, String deviceId, Long accountId, String categoryIds, String filterIds, String q, String keyword, Long retailerId, Long retailerLocationId, String couponType, String offerType, String offerTypes, String specialOfferType, Integer i, Integer l, String barcodeType, String barcodeEntry, String isbn, String asin, String deviceStatus, Boolean needsNotificationSent, Long lastNotificationSent) throws Exception {
        //Do your magic!!!
        return new ArrayList<OfferResponse>();
    }

    @Override
    public SirqulResponse redeemOfferTransaction(Http.Request request, BigDecimal version, @NotNull Long offerTransactionId, @NotNull Integer status, String deviceId, Long accountId, Long offerLocationId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public List<OfferTransactionResponse> searchOfferTransactionsForRetailers(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String deviceId, Long accountId, String q, String keyword, Long retailerId, Long retailerLocationId, Long offerId, Long offerLocationId, Boolean redeemed, Boolean reservationsOnly, String couponType, String offerType, String specialOfferType, String customerAccountIds, String categoryIds, Long redeemableStartDate, Long redeemableEndDate, Integer i, Integer l) throws Exception {
        //Do your magic!!!
        return new ArrayList<OfferTransactionResponse>();
    }

    @Override
    public OfferListResponse searchOffersForConsumer(Http.Request request, BigDecimal version, @NotNull Double latitude, @NotNull Double longitude, @NotNull String recommendationType, @NotNull Long locationId, @NotNull Integer start, @NotNull Integer limit, @NotNull Integer maxRecommendations, @NotNull String distanceUnit, String appKey, String deviceId, Long accountId, Double searchRange, String tags, String supportedPostalCodes, String keyword, String categories, String filters, String offerTypes, String type, String sortField, String recommendOfferIds, String retailerLocationIds, Long offerId, Boolean includeMission, Boolean includeCategories, Boolean includeFilters, Boolean includeExpired, Boolean includeFavorite, Boolean closestOfferOnly, String searchExpression, String groupBy) throws Exception {
        //Do your magic!!!
        return new OfferListResponse();
    }

    @Override
    public OfferListResponse topOfferTransactions(Http.Request request, BigDecimal version, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new OfferListResponse();
    }

    @Override
    public RetailerOfferResponse updateOffer(Http.Request request, BigDecimal version, @NotNull Long offerId, @NotNull Boolean includeOfferLocations, String deviceId, Long accountId, Long parentOfferId, String retailerLocationIds, String offerLocations, String tags, String title, String subTitle, String details, String subDetails, String finePrint, String barcodeType, String barcodeEntry, String externalRedeemOptions, String externalUrl, String externalId, String ticketsRewardType, Long ticketsReward, Long activated, Long expires, Boolean noExpiration, Integer availableLimit, Integer availableLimitPerUser, Integer addedLimit, Integer viewLimit, Integer maxPrints, String ticketPriceType, Long ticketPrice, Double fullPrice, Double discountPrice, Boolean showRemaining, Boolean showRedeemed, Boolean replaced, Boolean featured, String offerType, String specialOfferType, String offerVisibility, String categoryIds, String filterIds, Boolean active, Long barcodeAssetId, Long imageAssetId, Long imageAssetId1, Long imageAssetId2, Long imageAssetId3, Long imageAssetId4, Long imageAssetId5, String publisher, Long redeemableStart, Long redeemableEnd, String brand, String productType, String conditionType, String isbn, String asin, String catalogNumbers, String department, String features, Double minimumPrice, Double width, Double height, Double depth, Double weight, String unit, String studio, String parentalRating, Long publishDate, Long availabilityDate, Long sizeId, Long listingId, String mediaType, Integer duration, String author, Long releaseDate, String collectionIds, Integer rebootTimeHour, Integer rebootTimeMinute, Integer idleTimeoutInSecond, String serialNumber, String udid, String deviceType, Double devicePower, Double deviceInterference, String availability, String availabilitySummary) throws Exception {
        //Do your magic!!!
        return new RetailerOfferResponse();
    }

    @Override
    public SirqulResponse updateOfferStatus(Http.Request request, BigDecimal version, @NotNull String offerIds, @NotNull Boolean active, String deviceId, Long accountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

}
