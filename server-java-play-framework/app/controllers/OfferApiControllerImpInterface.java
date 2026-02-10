package controllers;

import java.math.BigDecimal;
import apimodels.ListCountResponse;
import apimodels.OfferListResponse;
import apimodels.OfferResponse;
import apimodels.OfferShortResponse;
import apimodels.OfferTransactionResponse;
import apimodels.RetailerOfferResponse;
import apimodels.SirqulResponse;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class OfferApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result batchUpdateOfferLocationsHttp(Http.Request request, BigDecimal version, @NotNull String data, String deviceId, Long accountId) throws Exception {
        SirqulResponse obj = batchUpdateOfferLocations(request, version, data, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse batchUpdateOfferLocations(Http.Request request, BigDecimal version, @NotNull String data, String deviceId, Long accountId) throws Exception;

    public Result createOfferHttp(Http.Request request, BigDecimal version, @NotNull Boolean includeOfferLocations, @NotNull String title, @NotNull String barcodeType, @NotNull Boolean noExpiration, @NotNull Integer availableLimit, @NotNull Integer availableLimitPerUser, @NotNull Integer addedLimit, @NotNull Integer viewLimit, @NotNull Integer maxPrints, @NotNull Long ticketPrice, @NotNull Double fullPrice, @NotNull Double discountPrice, @NotNull String offerType, @NotNull String specialOfferType, @NotNull String offerVisibility, @NotNull Boolean active, String deviceId, Long accountId, String tags, Long parentOfferId, String retailerLocationIds, String offerLocations, String subTitle, String details, String subDetails, String finePrint, String barcodeEntry, String externalRedeemOptions, String externalUrl, String externalId, String ticketsRewardType, Long ticketsReward, Long activated, Long expires, String ticketPriceType, Boolean showRemaining, Boolean showRedeemed, Boolean replaced, Boolean featured, String categoryIds, String filterIds, Long barcodeAssetId, Long imageAssetId, Long imageAssetId1, Long imageAssetId2, Long imageAssetId3, Long imageAssetId4, Long imageAssetId5, String publisher, Long redeemableStart, Long redeemableEnd, String brand, String productType, String conditionType, String isbn, String asin, String catalogNumbers, String department, String features, Double minimumPrice, Double width, Double height, Double depth, Double weight, String unit, String studio, String parentalRating, Long publishDate, Long availabilityDate, Long sizeId, Long listingId, String mediaType, Integer duration, String author, Long releaseDate, String collectionIds, Integer rebootTimeHour, Integer rebootTimeMinute, Integer idleTimeoutInSecond, String serialNumber, String udid, String deviceType, Double devicePower, Double deviceInterference, String availability, String availabilitySummary) throws Exception {
        RetailerOfferResponse obj = createOffer(request, version, includeOfferLocations, title, barcodeType, noExpiration, availableLimit, availableLimitPerUser, addedLimit, viewLimit, maxPrints, ticketPrice, fullPrice, discountPrice, offerType, specialOfferType, offerVisibility, active, deviceId, accountId, tags, parentOfferId, retailerLocationIds, offerLocations, subTitle, details, subDetails, finePrint, barcodeEntry, externalRedeemOptions, externalUrl, externalId, ticketsRewardType, ticketsReward, activated, expires, ticketPriceType, showRemaining, showRedeemed, replaced, featured, categoryIds, filterIds, barcodeAssetId, imageAssetId, imageAssetId1, imageAssetId2, imageAssetId3, imageAssetId4, imageAssetId5, publisher, redeemableStart, redeemableEnd, brand, productType, conditionType, isbn, asin, catalogNumbers, department, features, minimumPrice, width, height, depth, weight, unit, studio, parentalRating, publishDate, availabilityDate, sizeId, listingId, mediaType, duration, author, releaseDate, collectionIds, rebootTimeHour, rebootTimeMinute, idleTimeoutInSecond, serialNumber, udid, deviceType, devicePower, deviceInterference, availability, availabilitySummary);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RetailerOfferResponse createOffer(Http.Request request, BigDecimal version, @NotNull Boolean includeOfferLocations, @NotNull String title, @NotNull String barcodeType, @NotNull Boolean noExpiration, @NotNull Integer availableLimit, @NotNull Integer availableLimitPerUser, @NotNull Integer addedLimit, @NotNull Integer viewLimit, @NotNull Integer maxPrints, @NotNull Long ticketPrice, @NotNull Double fullPrice, @NotNull Double discountPrice, @NotNull String offerType, @NotNull String specialOfferType, @NotNull String offerVisibility, @NotNull Boolean active, String deviceId, Long accountId, String tags, Long parentOfferId, String retailerLocationIds, String offerLocations, String subTitle, String details, String subDetails, String finePrint, String barcodeEntry, String externalRedeemOptions, String externalUrl, String externalId, String ticketsRewardType, Long ticketsReward, Long activated, Long expires, String ticketPriceType, Boolean showRemaining, Boolean showRedeemed, Boolean replaced, Boolean featured, String categoryIds, String filterIds, Long barcodeAssetId, Long imageAssetId, Long imageAssetId1, Long imageAssetId2, Long imageAssetId3, Long imageAssetId4, Long imageAssetId5, String publisher, Long redeemableStart, Long redeemableEnd, String brand, String productType, String conditionType, String isbn, String asin, String catalogNumbers, String department, String features, Double minimumPrice, Double width, Double height, Double depth, Double weight, String unit, String studio, String parentalRating, Long publishDate, Long availabilityDate, Long sizeId, Long listingId, String mediaType, Integer duration, String author, Long releaseDate, String collectionIds, Integer rebootTimeHour, Integer rebootTimeMinute, Integer idleTimeoutInSecond, String serialNumber, String udid, String deviceType, Double devicePower, Double deviceInterference, String availability, String availabilitySummary) throws Exception;

    public Result deleteOfferHttp(Http.Request request, BigDecimal version, @NotNull Long offerId, String deviceId, Long accountId) throws Exception {
        SirqulResponse obj = deleteOffer(request, version, offerId, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteOffer(Http.Request request, BigDecimal version, @NotNull Long offerId, String deviceId, Long accountId) throws Exception;

    public Result deleteOfferLocationHttp(Http.Request request, BigDecimal version, @NotNull Long offerLocationId, String deviceId, Long accountId) throws Exception {
        SirqulResponse obj = deleteOfferLocation(request, version, offerLocationId, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteOfferLocation(Http.Request request, BigDecimal version, @NotNull Long offerLocationId, String deviceId, Long accountId) throws Exception;

    public Result getOfferHttp(Http.Request request, BigDecimal version, @NotNull Long offerId, @NotNull Boolean includeOfferLocations, String deviceId, Long accountId) throws Exception {
        RetailerOfferResponse obj = getOffer(request, version, offerId, includeOfferLocations, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RetailerOfferResponse getOffer(Http.Request request, BigDecimal version, @NotNull Long offerId, @NotNull Boolean includeOfferLocations, String deviceId, Long accountId) throws Exception;

    public Result getOfferDetailsHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long offerId, Long offerLocationId, Double distance, Double latitude, Double longitude, Boolean includeOfferLocations, Boolean includeRetailerLocations, Boolean includeChildOffers) throws Exception {
        OfferResponse obj = getOfferDetails(request, version, deviceId, accountId, offerId, offerLocationId, distance, latitude, longitude, includeOfferLocations, includeRetailerLocations, includeChildOffers);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OfferResponse getOfferDetails(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long offerId, Long offerLocationId, Double distance, Double latitude, Double longitude, Boolean includeOfferLocations, Boolean includeRetailerLocations, Boolean includeChildOffers) throws Exception;

    public Result getOfferListCountsHttp(Http.Request request, BigDecimal version, @NotNull Double latitude, @NotNull Double longitude, BigDecimal searchRange, String distanceUnit) throws Exception {
        ListCountResponse obj = getOfferListCounts(request, version, latitude, longitude, searchRange, distanceUnit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListCountResponse getOfferListCounts(Http.Request request, BigDecimal version, @NotNull Double latitude, @NotNull Double longitude, BigDecimal searchRange, String distanceUnit) throws Exception;

    public Result getOfferLocationHttp(Http.Request request, BigDecimal version, Long offerLocationId, String udid) throws Exception {
        OfferShortResponse obj = getOfferLocation(request, version, offerLocationId, udid);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OfferShortResponse getOfferLocation(Http.Request request, BigDecimal version, Long offerLocationId, String udid) throws Exception;

    public Result getOfferLocationsForRetailersHttp(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, @NotNull Boolean includeRetailerLocation, String deviceId, Long accountId, String keyword, Long retailerId, Long retailerLocationId, String offerType, String specialOfferType, String barcodeType, String barcodeEntry, String isbn, String asin, String deviceStatus, Boolean needsNotificationSent, Long lastNotificationSent) throws Exception {
        List<OfferShortResponse> obj = getOfferLocationsForRetailers(request, version, sortField, descending, start, limit, activeOnly, includeRetailerLocation, deviceId, accountId, keyword, retailerId, retailerLocationId, offerType, specialOfferType, barcodeType, barcodeEntry, isbn, asin, deviceStatus, needsNotificationSent, lastNotificationSent);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (OfferShortResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<OfferShortResponse> getOfferLocationsForRetailers(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, @NotNull Boolean includeRetailerLocation, String deviceId, Long accountId, String keyword, Long retailerId, Long retailerLocationId, String offerType, String specialOfferType, String barcodeType, String barcodeEntry, String isbn, String asin, String deviceStatus, Boolean needsNotificationSent, Long lastNotificationSent) throws Exception;

    public Result getOffersForRetailersHttp(Http.Request request, BigDecimal version, @NotNull String offerVisibility, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean availableOnly, @NotNull Boolean activeOnly, @NotNull Boolean includeCategories, @NotNull Boolean includeFilters, @NotNull Boolean includeOfferLocations, String deviceId, Long accountId, String categoryIds, String filterIds, String q, String keyword, Long retailerId, Long retailerLocationId, String couponType, String offerType, String offerTypes, String specialOfferType, Integer i, Integer l, String barcodeType, String barcodeEntry, String isbn, String asin, String deviceStatus, Boolean needsNotificationSent, Long lastNotificationSent) throws Exception {
        List<OfferResponse> obj = getOffersForRetailers(request, version, offerVisibility, sortField, descending, start, limit, availableOnly, activeOnly, includeCategories, includeFilters, includeOfferLocations, deviceId, accountId, categoryIds, filterIds, q, keyword, retailerId, retailerLocationId, couponType, offerType, offerTypes, specialOfferType, i, l, barcodeType, barcodeEntry, isbn, asin, deviceStatus, needsNotificationSent, lastNotificationSent);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (OfferResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<OfferResponse> getOffersForRetailers(Http.Request request, BigDecimal version, @NotNull String offerVisibility, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean availableOnly, @NotNull Boolean activeOnly, @NotNull Boolean includeCategories, @NotNull Boolean includeFilters, @NotNull Boolean includeOfferLocations, String deviceId, Long accountId, String categoryIds, String filterIds, String q, String keyword, Long retailerId, Long retailerLocationId, String couponType, String offerType, String offerTypes, String specialOfferType, Integer i, Integer l, String barcodeType, String barcodeEntry, String isbn, String asin, String deviceStatus, Boolean needsNotificationSent, Long lastNotificationSent) throws Exception;

    public Result redeemOfferTransactionHttp(Http.Request request, BigDecimal version, @NotNull Long offerTransactionId, @NotNull Integer status, String deviceId, Long accountId, Long offerLocationId) throws Exception {
        SirqulResponse obj = redeemOfferTransaction(request, version, offerTransactionId, status, deviceId, accountId, offerLocationId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse redeemOfferTransaction(Http.Request request, BigDecimal version, @NotNull Long offerTransactionId, @NotNull Integer status, String deviceId, Long accountId, Long offerLocationId) throws Exception;

    public Result searchOfferTransactionsForRetailersHttp(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String deviceId, Long accountId, String q, String keyword, Long retailerId, Long retailerLocationId, Long offerId, Long offerLocationId, Boolean redeemed, Boolean reservationsOnly, String couponType, String offerType, String specialOfferType, String customerAccountIds, String categoryIds, Long redeemableStartDate, Long redeemableEndDate, Integer i, Integer l) throws Exception {
        List<OfferTransactionResponse> obj = searchOfferTransactionsForRetailers(request, version, sortField, descending, start, limit, activeOnly, deviceId, accountId, q, keyword, retailerId, retailerLocationId, offerId, offerLocationId, redeemed, reservationsOnly, couponType, offerType, specialOfferType, customerAccountIds, categoryIds, redeemableStartDate, redeemableEndDate, i, l);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (OfferTransactionResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<OfferTransactionResponse> searchOfferTransactionsForRetailers(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String deviceId, Long accountId, String q, String keyword, Long retailerId, Long retailerLocationId, Long offerId, Long offerLocationId, Boolean redeemed, Boolean reservationsOnly, String couponType, String offerType, String specialOfferType, String customerAccountIds, String categoryIds, Long redeemableStartDate, Long redeemableEndDate, Integer i, Integer l) throws Exception;

    public Result searchOffersForConsumerHttp(Http.Request request, BigDecimal version, @NotNull Double latitude, @NotNull Double longitude, @NotNull String recommendationType, @NotNull Long locationId, @NotNull Integer start, @NotNull Integer limit, @NotNull Integer maxRecommendations, @NotNull String distanceUnit, String appKey, String deviceId, Long accountId, Double searchRange, String tags, String supportedPostalCodes, String keyword, String categories, String filters, String offerTypes, String type, String sortField, String recommendOfferIds, String retailerLocationIds, Long offerId, Boolean includeMission, Boolean includeCategories, Boolean includeFilters, Boolean includeExpired, Boolean includeFavorite, Boolean closestOfferOnly, String searchExpression, String groupBy) throws Exception {
        OfferListResponse obj = searchOffersForConsumer(request, version, latitude, longitude, recommendationType, locationId, start, limit, maxRecommendations, distanceUnit, appKey, deviceId, accountId, searchRange, tags, supportedPostalCodes, keyword, categories, filters, offerTypes, type, sortField, recommendOfferIds, retailerLocationIds, offerId, includeMission, includeCategories, includeFilters, includeExpired, includeFavorite, closestOfferOnly, searchExpression, groupBy);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OfferListResponse searchOffersForConsumer(Http.Request request, BigDecimal version, @NotNull Double latitude, @NotNull Double longitude, @NotNull String recommendationType, @NotNull Long locationId, @NotNull Integer start, @NotNull Integer limit, @NotNull Integer maxRecommendations, @NotNull String distanceUnit, String appKey, String deviceId, Long accountId, Double searchRange, String tags, String supportedPostalCodes, String keyword, String categories, String filters, String offerTypes, String type, String sortField, String recommendOfferIds, String retailerLocationIds, Long offerId, Boolean includeMission, Boolean includeCategories, Boolean includeFilters, Boolean includeExpired, Boolean includeFavorite, Boolean closestOfferOnly, String searchExpression, String groupBy) throws Exception;

    public Result topOfferTransactionsHttp(Http.Request request, BigDecimal version, Integer start, Integer limit) throws Exception {
        OfferListResponse obj = topOfferTransactions(request, version, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OfferListResponse topOfferTransactions(Http.Request request, BigDecimal version, Integer start, Integer limit) throws Exception;

    public Result updateOfferHttp(Http.Request request, BigDecimal version, @NotNull Long offerId, @NotNull Boolean includeOfferLocations, String deviceId, Long accountId, Long parentOfferId, String retailerLocationIds, String offerLocations, String tags, String title, String subTitle, String details, String subDetails, String finePrint, String barcodeType, String barcodeEntry, String externalRedeemOptions, String externalUrl, String externalId, String ticketsRewardType, Long ticketsReward, Long activated, Long expires, Boolean noExpiration, Integer availableLimit, Integer availableLimitPerUser, Integer addedLimit, Integer viewLimit, Integer maxPrints, String ticketPriceType, Long ticketPrice, Double fullPrice, Double discountPrice, Boolean showRemaining, Boolean showRedeemed, Boolean replaced, Boolean featured, String offerType, String specialOfferType, String offerVisibility, String categoryIds, String filterIds, Boolean active, Long barcodeAssetId, Long imageAssetId, Long imageAssetId1, Long imageAssetId2, Long imageAssetId3, Long imageAssetId4, Long imageAssetId5, String publisher, Long redeemableStart, Long redeemableEnd, String brand, String productType, String conditionType, String isbn, String asin, String catalogNumbers, String department, String features, Double minimumPrice, Double width, Double height, Double depth, Double weight, String unit, String studio, String parentalRating, Long publishDate, Long availabilityDate, Long sizeId, Long listingId, String mediaType, Integer duration, String author, Long releaseDate, String collectionIds, Integer rebootTimeHour, Integer rebootTimeMinute, Integer idleTimeoutInSecond, String serialNumber, String udid, String deviceType, Double devicePower, Double deviceInterference, String availability, String availabilitySummary) throws Exception {
        RetailerOfferResponse obj = updateOffer(request, version, offerId, includeOfferLocations, deviceId, accountId, parentOfferId, retailerLocationIds, offerLocations, tags, title, subTitle, details, subDetails, finePrint, barcodeType, barcodeEntry, externalRedeemOptions, externalUrl, externalId, ticketsRewardType, ticketsReward, activated, expires, noExpiration, availableLimit, availableLimitPerUser, addedLimit, viewLimit, maxPrints, ticketPriceType, ticketPrice, fullPrice, discountPrice, showRemaining, showRedeemed, replaced, featured, offerType, specialOfferType, offerVisibility, categoryIds, filterIds, active, barcodeAssetId, imageAssetId, imageAssetId1, imageAssetId2, imageAssetId3, imageAssetId4, imageAssetId5, publisher, redeemableStart, redeemableEnd, brand, productType, conditionType, isbn, asin, catalogNumbers, department, features, minimumPrice, width, height, depth, weight, unit, studio, parentalRating, publishDate, availabilityDate, sizeId, listingId, mediaType, duration, author, releaseDate, collectionIds, rebootTimeHour, rebootTimeMinute, idleTimeoutInSecond, serialNumber, udid, deviceType, devicePower, deviceInterference, availability, availabilitySummary);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RetailerOfferResponse updateOffer(Http.Request request, BigDecimal version, @NotNull Long offerId, @NotNull Boolean includeOfferLocations, String deviceId, Long accountId, Long parentOfferId, String retailerLocationIds, String offerLocations, String tags, String title, String subTitle, String details, String subDetails, String finePrint, String barcodeType, String barcodeEntry, String externalRedeemOptions, String externalUrl, String externalId, String ticketsRewardType, Long ticketsReward, Long activated, Long expires, Boolean noExpiration, Integer availableLimit, Integer availableLimitPerUser, Integer addedLimit, Integer viewLimit, Integer maxPrints, String ticketPriceType, Long ticketPrice, Double fullPrice, Double discountPrice, Boolean showRemaining, Boolean showRedeemed, Boolean replaced, Boolean featured, String offerType, String specialOfferType, String offerVisibility, String categoryIds, String filterIds, Boolean active, Long barcodeAssetId, Long imageAssetId, Long imageAssetId1, Long imageAssetId2, Long imageAssetId3, Long imageAssetId4, Long imageAssetId5, String publisher, Long redeemableStart, Long redeemableEnd, String brand, String productType, String conditionType, String isbn, String asin, String catalogNumbers, String department, String features, Double minimumPrice, Double width, Double height, Double depth, Double weight, String unit, String studio, String parentalRating, Long publishDate, Long availabilityDate, Long sizeId, Long listingId, String mediaType, Integer duration, String author, Long releaseDate, String collectionIds, Integer rebootTimeHour, Integer rebootTimeMinute, Integer idleTimeoutInSecond, String serialNumber, String udid, String deviceType, Double devicePower, Double deviceInterference, String availability, String availabilitySummary) throws Exception;

    public Result updateOfferStatusHttp(Http.Request request, BigDecimal version, @NotNull String offerIds, @NotNull Boolean active, String deviceId, Long accountId) throws Exception {
        SirqulResponse obj = updateOfferStatus(request, version, offerIds, active, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse updateOfferStatus(Http.Request request, BigDecimal version, @NotNull String offerIds, @NotNull Boolean active, String deviceId, Long accountId) throws Exception;

}
