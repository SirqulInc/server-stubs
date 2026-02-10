package controllers;

import java.math.BigDecimal;
import apimodels.MediaOfferResponse;
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
public class MediaApiControllerImp extends MediaApiControllerImpInterface {
    @Override
    public MediaOfferResponse createMedia(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String title, @NotNull String barcodeType, @NotNull Boolean noExpiration, @NotNull Integer availableLimit, @NotNull Integer availableLimitPerUser, @NotNull Integer addedLimit, @NotNull Integer viewLimit, @NotNull Integer maxPrints, @NotNull Long ticketPrice, @NotNull Double fullPrice, @NotNull Double discountPrice, @NotNull String specialOfferType, @NotNull String offerVisibility, @NotNull Boolean active, String retailerLocationIds, String subTitle, String details, String subDetails, String finePrint, String barcodeEntry, String externalRedeemOptions, String externalUrl, String ticketsRewardType, Long ticketsReward, Long activated, Long expires, String ticketPriceType, Boolean showRemaining, Boolean showRedeemed, Boolean replaced, Boolean featured, String categoryIds, String filterIds, Long barcodeAssetId, Long imageAssetId, Long imageAssetId1, Long imageAssetId2, Long imageAssetId3, Long imageAssetId4, Long imageAssetId5, String publisher, Long redeemableStart, Long redeemableEnd, String conditionType, String isbn, String asin, String catalogNumbers, String parentalRating, Long availabilityDate, String mediaType, Integer duration, String author, Long releaseDate, String collectionIds, String availability, String availabilitySummary) throws Exception {
        //Do your magic!!!
        return new MediaOfferResponse();
    }

    @Override
    public SirqulResponse deleteMedia(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long mediaId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public MediaOfferResponse getMedia(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long mediaId) throws Exception {
        //Do your magic!!!
        return new MediaOfferResponse();
    }

    @Override
    public List<MediaOfferResponse> searchMedia(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Boolean activeOnly, @NotNull String sortField, @NotNull Boolean descending, String keyword, String categoryIds, String filterIds, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new ArrayList<MediaOfferResponse>();
    }

    @Override
    public MediaOfferResponse updateMedia(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long mediaId, String retailerLocationIds, String offerLocations, String title, String subTitle, String details, String subDetails, String finePrint, String barcodeType, String barcodeEntry, String externalRedeemOptions, String externalUrl, String ticketsRewardType, Long ticketsReward, Long activated, Long expires, Boolean noExpiration, Integer availableLimit, Integer availableLimitPerUser, Integer addedLimit, Integer viewLimit, Integer maxPrints, String ticketPriceType, Long ticketPrice, Double fullPrice, Double discountPrice, Boolean showRemaining, Boolean showRedeemed, Boolean replaced, Boolean featured, String specialOfferType, String offerVisibility, String categoryIds, String filterIds, Boolean active, Long barcodeAssetId, Long imageAssetId, Long imageAssetId1, Long imageAssetId2, Long imageAssetId3, Long imageAssetId4, Long imageAssetId5, String publisher, Long redeemableStart, Long redeemableEnd, String conditionType, String isbn, String asin, String catalogNumbers, Long availabilityDate, String parentalRating, String mediaType, Integer duration, String author, Long releaseDate, String collectionIds, String availability, String availabilitySummary) throws Exception {
        //Do your magic!!!
        return new MediaOfferResponse();
    }

}
