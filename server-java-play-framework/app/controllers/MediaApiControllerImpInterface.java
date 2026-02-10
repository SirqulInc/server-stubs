package controllers;

import java.math.BigDecimal;
import apimodels.MediaOfferResponse;
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
public abstract class MediaApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createMediaHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String title, @NotNull String barcodeType, @NotNull Boolean noExpiration, @NotNull Integer availableLimit, @NotNull Integer availableLimitPerUser, @NotNull Integer addedLimit, @NotNull Integer viewLimit, @NotNull Integer maxPrints, @NotNull Long ticketPrice, @NotNull Double fullPrice, @NotNull Double discountPrice, @NotNull String specialOfferType, @NotNull String offerVisibility, @NotNull Boolean active, String retailerLocationIds, String subTitle, String details, String subDetails, String finePrint, String barcodeEntry, String externalRedeemOptions, String externalUrl, String ticketsRewardType, Long ticketsReward, Long activated, Long expires, String ticketPriceType, Boolean showRemaining, Boolean showRedeemed, Boolean replaced, Boolean featured, String categoryIds, String filterIds, Long barcodeAssetId, Long imageAssetId, Long imageAssetId1, Long imageAssetId2, Long imageAssetId3, Long imageAssetId4, Long imageAssetId5, String publisher, Long redeemableStart, Long redeemableEnd, String conditionType, String isbn, String asin, String catalogNumbers, String parentalRating, Long availabilityDate, String mediaType, Integer duration, String author, Long releaseDate, String collectionIds, String availability, String availabilitySummary) throws Exception {
        MediaOfferResponse obj = createMedia(request, version, accountId, title, barcodeType, noExpiration, availableLimit, availableLimitPerUser, addedLimit, viewLimit, maxPrints, ticketPrice, fullPrice, discountPrice, specialOfferType, offerVisibility, active, retailerLocationIds, subTitle, details, subDetails, finePrint, barcodeEntry, externalRedeemOptions, externalUrl, ticketsRewardType, ticketsReward, activated, expires, ticketPriceType, showRemaining, showRedeemed, replaced, featured, categoryIds, filterIds, barcodeAssetId, imageAssetId, imageAssetId1, imageAssetId2, imageAssetId3, imageAssetId4, imageAssetId5, publisher, redeemableStart, redeemableEnd, conditionType, isbn, asin, catalogNumbers, parentalRating, availabilityDate, mediaType, duration, author, releaseDate, collectionIds, availability, availabilitySummary);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MediaOfferResponse createMedia(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String title, @NotNull String barcodeType, @NotNull Boolean noExpiration, @NotNull Integer availableLimit, @NotNull Integer availableLimitPerUser, @NotNull Integer addedLimit, @NotNull Integer viewLimit, @NotNull Integer maxPrints, @NotNull Long ticketPrice, @NotNull Double fullPrice, @NotNull Double discountPrice, @NotNull String specialOfferType, @NotNull String offerVisibility, @NotNull Boolean active, String retailerLocationIds, String subTitle, String details, String subDetails, String finePrint, String barcodeEntry, String externalRedeemOptions, String externalUrl, String ticketsRewardType, Long ticketsReward, Long activated, Long expires, String ticketPriceType, Boolean showRemaining, Boolean showRedeemed, Boolean replaced, Boolean featured, String categoryIds, String filterIds, Long barcodeAssetId, Long imageAssetId, Long imageAssetId1, Long imageAssetId2, Long imageAssetId3, Long imageAssetId4, Long imageAssetId5, String publisher, Long redeemableStart, Long redeemableEnd, String conditionType, String isbn, String asin, String catalogNumbers, String parentalRating, Long availabilityDate, String mediaType, Integer duration, String author, Long releaseDate, String collectionIds, String availability, String availabilitySummary) throws Exception;

    public Result deleteMediaHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long mediaId) throws Exception {
        SirqulResponse obj = deleteMedia(request, version, accountId, mediaId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteMedia(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long mediaId) throws Exception;

    public Result getMediaHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long mediaId) throws Exception {
        MediaOfferResponse obj = getMedia(request, version, accountId, mediaId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MediaOfferResponse getMedia(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long mediaId) throws Exception;

    public Result searchMediaHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Boolean activeOnly, @NotNull String sortField, @NotNull Boolean descending, String keyword, String categoryIds, String filterIds, Integer start, Integer limit) throws Exception {
        List<MediaOfferResponse> obj = searchMedia(request, version, accountId, activeOnly, sortField, descending, keyword, categoryIds, filterIds, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (MediaOfferResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<MediaOfferResponse> searchMedia(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Boolean activeOnly, @NotNull String sortField, @NotNull Boolean descending, String keyword, String categoryIds, String filterIds, Integer start, Integer limit) throws Exception;

    public Result updateMediaHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long mediaId, String retailerLocationIds, String offerLocations, String title, String subTitle, String details, String subDetails, String finePrint, String barcodeType, String barcodeEntry, String externalRedeemOptions, String externalUrl, String ticketsRewardType, Long ticketsReward, Long activated, Long expires, Boolean noExpiration, Integer availableLimit, Integer availableLimitPerUser, Integer addedLimit, Integer viewLimit, Integer maxPrints, String ticketPriceType, Long ticketPrice, Double fullPrice, Double discountPrice, Boolean showRemaining, Boolean showRedeemed, Boolean replaced, Boolean featured, String specialOfferType, String offerVisibility, String categoryIds, String filterIds, Boolean active, Long barcodeAssetId, Long imageAssetId, Long imageAssetId1, Long imageAssetId2, Long imageAssetId3, Long imageAssetId4, Long imageAssetId5, String publisher, Long redeemableStart, Long redeemableEnd, String conditionType, String isbn, String asin, String catalogNumbers, Long availabilityDate, String parentalRating, String mediaType, Integer duration, String author, Long releaseDate, String collectionIds, String availability, String availabilitySummary) throws Exception {
        MediaOfferResponse obj = updateMedia(request, version, accountId, mediaId, retailerLocationIds, offerLocations, title, subTitle, details, subDetails, finePrint, barcodeType, barcodeEntry, externalRedeemOptions, externalUrl, ticketsRewardType, ticketsReward, activated, expires, noExpiration, availableLimit, availableLimitPerUser, addedLimit, viewLimit, maxPrints, ticketPriceType, ticketPrice, fullPrice, discountPrice, showRemaining, showRedeemed, replaced, featured, specialOfferType, offerVisibility, categoryIds, filterIds, active, barcodeAssetId, imageAssetId, imageAssetId1, imageAssetId2, imageAssetId3, imageAssetId4, imageAssetId5, publisher, redeemableStart, redeemableEnd, conditionType, isbn, asin, catalogNumbers, availabilityDate, parentalRating, mediaType, duration, author, releaseDate, collectionIds, availability, availabilitySummary);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MediaOfferResponse updateMedia(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long mediaId, String retailerLocationIds, String offerLocations, String title, String subTitle, String details, String subDetails, String finePrint, String barcodeType, String barcodeEntry, String externalRedeemOptions, String externalUrl, String ticketsRewardType, Long ticketsReward, Long activated, Long expires, Boolean noExpiration, Integer availableLimit, Integer availableLimitPerUser, Integer addedLimit, Integer viewLimit, Integer maxPrints, String ticketPriceType, Long ticketPrice, Double fullPrice, Double discountPrice, Boolean showRemaining, Boolean showRedeemed, Boolean replaced, Boolean featured, String specialOfferType, String offerVisibility, String categoryIds, String filterIds, Boolean active, Long barcodeAssetId, Long imageAssetId, Long imageAssetId1, Long imageAssetId2, Long imageAssetId3, Long imageAssetId4, Long imageAssetId5, String publisher, Long redeemableStart, Long redeemableEnd, String conditionType, String isbn, String asin, String catalogNumbers, Long availabilityDate, String parentalRating, String mediaType, Integer duration, String author, Long releaseDate, String collectionIds, String availability, String availabilitySummary) throws Exception;

}
