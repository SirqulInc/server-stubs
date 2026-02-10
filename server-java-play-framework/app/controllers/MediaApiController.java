package controllers;

import java.math.BigDecimal;
import apimodels.MediaOfferResponse;
import apimodels.SirqulResponse;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class MediaApiController extends Controller {
    private final MediaApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private MediaApiController(Config configuration, MediaApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createMedia(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueretailerLocationIds = request.getQueryString("retailerLocationIds");
        String retailerLocationIds;
        if (valueretailerLocationIds != null) {
            retailerLocationIds = valueretailerLocationIds;
        } else {
            retailerLocationIds = null;
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            throw new IllegalArgumentException("'title' parameter is required");
        }
        String valuesubTitle = request.getQueryString("subTitle");
        String subTitle;
        if (valuesubTitle != null) {
            subTitle = valuesubTitle;
        } else {
            subTitle = null;
        }
        String valuedetails = request.getQueryString("details");
        String details;
        if (valuedetails != null) {
            details = valuedetails;
        } else {
            details = null;
        }
        String valuesubDetails = request.getQueryString("subDetails");
        String subDetails;
        if (valuesubDetails != null) {
            subDetails = valuesubDetails;
        } else {
            subDetails = null;
        }
        String valuefinePrint = request.getQueryString("finePrint");
        String finePrint;
        if (valuefinePrint != null) {
            finePrint = valuefinePrint;
        } else {
            finePrint = null;
        }
        String valuebarcodeType = request.getQueryString("barcodeType");
        String barcodeType;
        if (valuebarcodeType != null) {
            barcodeType = valuebarcodeType;
        } else {
            throw new IllegalArgumentException("'barcodeType' parameter is required");
        }
        String valuebarcodeEntry = request.getQueryString("barcodeEntry");
        String barcodeEntry;
        if (valuebarcodeEntry != null) {
            barcodeEntry = valuebarcodeEntry;
        } else {
            barcodeEntry = null;
        }
        String valueexternalRedeemOptions = request.getQueryString("externalRedeemOptions");
        String externalRedeemOptions;
        if (valueexternalRedeemOptions != null) {
            externalRedeemOptions = valueexternalRedeemOptions;
        } else {
            externalRedeemOptions = null;
        }
        String valueexternalUrl = request.getQueryString("externalUrl");
        String externalUrl;
        if (valueexternalUrl != null) {
            externalUrl = valueexternalUrl;
        } else {
            externalUrl = null;
        }
        String valueticketsRewardType = request.getQueryString("ticketsRewardType");
        String ticketsRewardType;
        if (valueticketsRewardType != null) {
            ticketsRewardType = valueticketsRewardType;
        } else {
            ticketsRewardType = null;
        }
        String valueticketsReward = request.getQueryString("ticketsReward");
        Long ticketsReward;
        if (valueticketsReward != null) {
            ticketsReward = Long.parseLong(valueticketsReward);
        } else {
            ticketsReward = null;
        }
        String valueactivated = request.getQueryString("activated");
        Long activated;
        if (valueactivated != null) {
            activated = Long.parseLong(valueactivated);
        } else {
            activated = null;
        }
        String valueexpires = request.getQueryString("expires");
        Long expires;
        if (valueexpires != null) {
            expires = Long.parseLong(valueexpires);
        } else {
            expires = null;
        }
        String valuenoExpiration = request.getQueryString("noExpiration");
        Boolean noExpiration;
        if (valuenoExpiration != null) {
            noExpiration = Boolean.valueOf(valuenoExpiration);
        } else {
            throw new IllegalArgumentException("'noExpiration' parameter is required");
        }
        String valueavailableLimit = request.getQueryString("availableLimit");
        Integer availableLimit;
        if (valueavailableLimit != null) {
            availableLimit = Integer.parseInt(valueavailableLimit);
        } else {
            throw new IllegalArgumentException("'availableLimit' parameter is required");
        }
        String valueavailableLimitPerUser = request.getQueryString("availableLimitPerUser");
        Integer availableLimitPerUser;
        if (valueavailableLimitPerUser != null) {
            availableLimitPerUser = Integer.parseInt(valueavailableLimitPerUser);
        } else {
            throw new IllegalArgumentException("'availableLimitPerUser' parameter is required");
        }
        String valueaddedLimit = request.getQueryString("addedLimit");
        Integer addedLimit;
        if (valueaddedLimit != null) {
            addedLimit = Integer.parseInt(valueaddedLimit);
        } else {
            throw new IllegalArgumentException("'addedLimit' parameter is required");
        }
        String valueviewLimit = request.getQueryString("viewLimit");
        Integer viewLimit;
        if (valueviewLimit != null) {
            viewLimit = Integer.parseInt(valueviewLimit);
        } else {
            throw new IllegalArgumentException("'viewLimit' parameter is required");
        }
        String valuemaxPrints = request.getQueryString("maxPrints");
        Integer maxPrints;
        if (valuemaxPrints != null) {
            maxPrints = Integer.parseInt(valuemaxPrints);
        } else {
            throw new IllegalArgumentException("'maxPrints' parameter is required");
        }
        String valueticketPriceType = request.getQueryString("ticketPriceType");
        String ticketPriceType;
        if (valueticketPriceType != null) {
            ticketPriceType = valueticketPriceType;
        } else {
            ticketPriceType = null;
        }
        String valueticketPrice = request.getQueryString("ticketPrice");
        Long ticketPrice;
        if (valueticketPrice != null) {
            ticketPrice = Long.parseLong(valueticketPrice);
        } else {
            throw new IllegalArgumentException("'ticketPrice' parameter is required");
        }
        String valuefullPrice = request.getQueryString("fullPrice");
        Double fullPrice;
        if (valuefullPrice != null) {
            fullPrice = Double.parseDouble(valuefullPrice);
        } else {
            throw new IllegalArgumentException("'fullPrice' parameter is required");
        }
        String valuediscountPrice = request.getQueryString("discountPrice");
        Double discountPrice;
        if (valuediscountPrice != null) {
            discountPrice = Double.parseDouble(valuediscountPrice);
        } else {
            throw new IllegalArgumentException("'discountPrice' parameter is required");
        }
        String valueshowRemaining = request.getQueryString("showRemaining");
        Boolean showRemaining;
        if (valueshowRemaining != null) {
            showRemaining = Boolean.valueOf(valueshowRemaining);
        } else {
            showRemaining = null;
        }
        String valueshowRedeemed = request.getQueryString("showRedeemed");
        Boolean showRedeemed;
        if (valueshowRedeemed != null) {
            showRedeemed = Boolean.valueOf(valueshowRedeemed);
        } else {
            showRedeemed = null;
        }
        String valuereplaced = request.getQueryString("replaced");
        Boolean replaced;
        if (valuereplaced != null) {
            replaced = Boolean.valueOf(valuereplaced);
        } else {
            replaced = null;
        }
        String valuefeatured = request.getQueryString("featured");
        Boolean featured;
        if (valuefeatured != null) {
            featured = Boolean.valueOf(valuefeatured);
        } else {
            featured = null;
        }
        String valuespecialOfferType = request.getQueryString("specialOfferType");
        String specialOfferType;
        if (valuespecialOfferType != null) {
            specialOfferType = valuespecialOfferType;
        } else {
            throw new IllegalArgumentException("'specialOfferType' parameter is required");
        }
        String valueofferVisibility = request.getQueryString("offerVisibility");
        String offerVisibility;
        if (valueofferVisibility != null) {
            offerVisibility = valueofferVisibility;
        } else {
            throw new IllegalArgumentException("'offerVisibility' parameter is required");
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valuefilterIds = request.getQueryString("filterIds");
        String filterIds;
        if (valuefilterIds != null) {
            filterIds = valuefilterIds;
        } else {
            filterIds = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            throw new IllegalArgumentException("'active' parameter is required");
        }
        String valuebarcodeAssetId = request.getQueryString("barcodeAssetId");
        Long barcodeAssetId;
        if (valuebarcodeAssetId != null) {
            barcodeAssetId = Long.parseLong(valuebarcodeAssetId);
        } else {
            barcodeAssetId = null;
        }
        String valueimageAssetId = request.getQueryString("imageAssetId");
        Long imageAssetId;
        if (valueimageAssetId != null) {
            imageAssetId = Long.parseLong(valueimageAssetId);
        } else {
            imageAssetId = null;
        }
        String valueimageAssetId1 = request.getQueryString("imageAssetId1");
        Long imageAssetId1;
        if (valueimageAssetId1 != null) {
            imageAssetId1 = Long.parseLong(valueimageAssetId1);
        } else {
            imageAssetId1 = null;
        }
        String valueimageAssetId2 = request.getQueryString("imageAssetId2");
        Long imageAssetId2;
        if (valueimageAssetId2 != null) {
            imageAssetId2 = Long.parseLong(valueimageAssetId2);
        } else {
            imageAssetId2 = null;
        }
        String valueimageAssetId3 = request.getQueryString("imageAssetId3");
        Long imageAssetId3;
        if (valueimageAssetId3 != null) {
            imageAssetId3 = Long.parseLong(valueimageAssetId3);
        } else {
            imageAssetId3 = null;
        }
        String valueimageAssetId4 = request.getQueryString("imageAssetId4");
        Long imageAssetId4;
        if (valueimageAssetId4 != null) {
            imageAssetId4 = Long.parseLong(valueimageAssetId4);
        } else {
            imageAssetId4 = null;
        }
        String valueimageAssetId5 = request.getQueryString("imageAssetId5");
        Long imageAssetId5;
        if (valueimageAssetId5 != null) {
            imageAssetId5 = Long.parseLong(valueimageAssetId5);
        } else {
            imageAssetId5 = null;
        }
        String valuepublisher = request.getQueryString("publisher");
        String publisher;
        if (valuepublisher != null) {
            publisher = valuepublisher;
        } else {
            publisher = null;
        }
        String valueredeemableStart = request.getQueryString("redeemableStart");
        Long redeemableStart;
        if (valueredeemableStart != null) {
            redeemableStart = Long.parseLong(valueredeemableStart);
        } else {
            redeemableStart = null;
        }
        String valueredeemableEnd = request.getQueryString("redeemableEnd");
        Long redeemableEnd;
        if (valueredeemableEnd != null) {
            redeemableEnd = Long.parseLong(valueredeemableEnd);
        } else {
            redeemableEnd = null;
        }
        String valueconditionType = request.getQueryString("conditionType");
        String conditionType;
        if (valueconditionType != null) {
            conditionType = valueconditionType;
        } else {
            conditionType = null;
        }
        String valueisbn = request.getQueryString("isbn");
        String isbn;
        if (valueisbn != null) {
            isbn = valueisbn;
        } else {
            isbn = null;
        }
        String valueasin = request.getQueryString("asin");
        String asin;
        if (valueasin != null) {
            asin = valueasin;
        } else {
            asin = null;
        }
        String valuecatalogNumbers = request.getQueryString("catalogNumbers");
        String catalogNumbers;
        if (valuecatalogNumbers != null) {
            catalogNumbers = valuecatalogNumbers;
        } else {
            catalogNumbers = null;
        }
        String valueparentalRating = request.getQueryString("parentalRating");
        String parentalRating;
        if (valueparentalRating != null) {
            parentalRating = valueparentalRating;
        } else {
            parentalRating = null;
        }
        String valueavailabilityDate = request.getQueryString("availabilityDate");
        Long availabilityDate;
        if (valueavailabilityDate != null) {
            availabilityDate = Long.parseLong(valueavailabilityDate);
        } else {
            availabilityDate = null;
        }
        String valuemediaType = request.getQueryString("mediaType");
        String mediaType;
        if (valuemediaType != null) {
            mediaType = valuemediaType;
        } else {
            mediaType = null;
        }
        String valueduration = request.getQueryString("duration");
        Integer duration;
        if (valueduration != null) {
            duration = Integer.parseInt(valueduration);
        } else {
            duration = null;
        }
        String valueauthor = request.getQueryString("author");
        String author;
        if (valueauthor != null) {
            author = valueauthor;
        } else {
            author = null;
        }
        String valuereleaseDate = request.getQueryString("releaseDate");
        Long releaseDate;
        if (valuereleaseDate != null) {
            releaseDate = Long.parseLong(valuereleaseDate);
        } else {
            releaseDate = null;
        }
        String valuecollectionIds = request.getQueryString("collectionIds");
        String collectionIds;
        if (valuecollectionIds != null) {
            collectionIds = valuecollectionIds;
        } else {
            collectionIds = null;
        }
        String valueavailability = request.getQueryString("availability");
        String availability;
        if (valueavailability != null) {
            availability = valueavailability;
        } else {
            availability = null;
        }
        String valueavailabilitySummary = request.getQueryString("availabilitySummary");
        String availabilitySummary;
        if (valueavailabilitySummary != null) {
            availabilitySummary = valueavailabilitySummary;
        } else {
            availabilitySummary = null;
        }
        return imp.createMediaHttp(request, version, accountId, title, barcodeType, noExpiration, availableLimit, availableLimitPerUser, addedLimit, viewLimit, maxPrints, ticketPrice, fullPrice, discountPrice, specialOfferType, offerVisibility, active, retailerLocationIds, subTitle, details, subDetails, finePrint, barcodeEntry, externalRedeemOptions, externalUrl, ticketsRewardType, ticketsReward, activated, expires, ticketPriceType, showRemaining, showRedeemed, replaced, featured, categoryIds, filterIds, barcodeAssetId, imageAssetId, imageAssetId1, imageAssetId2, imageAssetId3, imageAssetId4, imageAssetId5, publisher, redeemableStart, redeemableEnd, conditionType, isbn, asin, catalogNumbers, parentalRating, availabilityDate, mediaType, duration, author, releaseDate, collectionIds, availability, availabilitySummary);
    }

    @ApiAction
    public Result deleteMedia(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuemediaId = request.getQueryString("mediaId");
        Long mediaId;
        if (valuemediaId != null) {
            mediaId = Long.parseLong(valuemediaId);
        } else {
            throw new IllegalArgumentException("'mediaId' parameter is required");
        }
        return imp.deleteMediaHttp(request, version, accountId, mediaId);
    }

    @ApiAction
    public Result getMedia(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuemediaId = request.getQueryString("mediaId");
        Long mediaId;
        if (valuemediaId != null) {
            mediaId = Long.parseLong(valuemediaId);
        } else {
            throw new IllegalArgumentException("'mediaId' parameter is required");
        }
        return imp.getMediaHttp(request, version, accountId, mediaId);
    }

    @ApiAction
    public Result searchMedia(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            throw new IllegalArgumentException("'activeOnly' parameter is required");
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valuefilterIds = request.getQueryString("filterIds");
        String filterIds;
        if (valuefilterIds != null) {
            filterIds = valuefilterIds;
        } else {
            filterIds = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            throw new IllegalArgumentException("'sortField' parameter is required");
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            throw new IllegalArgumentException("'descending' parameter is required");
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.searchMediaHttp(request, version, accountId, activeOnly, sortField, descending, keyword, categoryIds, filterIds, start, limit);
    }

    @ApiAction
    public Result updateMedia(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuemediaId = request.getQueryString("mediaId");
        Long mediaId;
        if (valuemediaId != null) {
            mediaId = Long.parseLong(valuemediaId);
        } else {
            throw new IllegalArgumentException("'mediaId' parameter is required");
        }
        String valueretailerLocationIds = request.getQueryString("retailerLocationIds");
        String retailerLocationIds;
        if (valueretailerLocationIds != null) {
            retailerLocationIds = valueretailerLocationIds;
        } else {
            retailerLocationIds = null;
        }
        String valueofferLocations = request.getQueryString("offerLocations");
        String offerLocations;
        if (valueofferLocations != null) {
            offerLocations = valueofferLocations;
        } else {
            offerLocations = null;
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            title = null;
        }
        String valuesubTitle = request.getQueryString("subTitle");
        String subTitle;
        if (valuesubTitle != null) {
            subTitle = valuesubTitle;
        } else {
            subTitle = null;
        }
        String valuedetails = request.getQueryString("details");
        String details;
        if (valuedetails != null) {
            details = valuedetails;
        } else {
            details = null;
        }
        String valuesubDetails = request.getQueryString("subDetails");
        String subDetails;
        if (valuesubDetails != null) {
            subDetails = valuesubDetails;
        } else {
            subDetails = null;
        }
        String valuefinePrint = request.getQueryString("finePrint");
        String finePrint;
        if (valuefinePrint != null) {
            finePrint = valuefinePrint;
        } else {
            finePrint = null;
        }
        String valuebarcodeType = request.getQueryString("barcodeType");
        String barcodeType;
        if (valuebarcodeType != null) {
            barcodeType = valuebarcodeType;
        } else {
            barcodeType = null;
        }
        String valuebarcodeEntry = request.getQueryString("barcodeEntry");
        String barcodeEntry;
        if (valuebarcodeEntry != null) {
            barcodeEntry = valuebarcodeEntry;
        } else {
            barcodeEntry = null;
        }
        String valueexternalRedeemOptions = request.getQueryString("externalRedeemOptions");
        String externalRedeemOptions;
        if (valueexternalRedeemOptions != null) {
            externalRedeemOptions = valueexternalRedeemOptions;
        } else {
            externalRedeemOptions = null;
        }
        String valueexternalUrl = request.getQueryString("externalUrl");
        String externalUrl;
        if (valueexternalUrl != null) {
            externalUrl = valueexternalUrl;
        } else {
            externalUrl = null;
        }
        String valueticketsRewardType = request.getQueryString("ticketsRewardType");
        String ticketsRewardType;
        if (valueticketsRewardType != null) {
            ticketsRewardType = valueticketsRewardType;
        } else {
            ticketsRewardType = null;
        }
        String valueticketsReward = request.getQueryString("ticketsReward");
        Long ticketsReward;
        if (valueticketsReward != null) {
            ticketsReward = Long.parseLong(valueticketsReward);
        } else {
            ticketsReward = null;
        }
        String valueactivated = request.getQueryString("activated");
        Long activated;
        if (valueactivated != null) {
            activated = Long.parseLong(valueactivated);
        } else {
            activated = null;
        }
        String valueexpires = request.getQueryString("expires");
        Long expires;
        if (valueexpires != null) {
            expires = Long.parseLong(valueexpires);
        } else {
            expires = null;
        }
        String valuenoExpiration = request.getQueryString("noExpiration");
        Boolean noExpiration;
        if (valuenoExpiration != null) {
            noExpiration = Boolean.valueOf(valuenoExpiration);
        } else {
            noExpiration = null;
        }
        String valueavailableLimit = request.getQueryString("availableLimit");
        Integer availableLimit;
        if (valueavailableLimit != null) {
            availableLimit = Integer.parseInt(valueavailableLimit);
        } else {
            availableLimit = null;
        }
        String valueavailableLimitPerUser = request.getQueryString("availableLimitPerUser");
        Integer availableLimitPerUser;
        if (valueavailableLimitPerUser != null) {
            availableLimitPerUser = Integer.parseInt(valueavailableLimitPerUser);
        } else {
            availableLimitPerUser = null;
        }
        String valueaddedLimit = request.getQueryString("addedLimit");
        Integer addedLimit;
        if (valueaddedLimit != null) {
            addedLimit = Integer.parseInt(valueaddedLimit);
        } else {
            addedLimit = null;
        }
        String valueviewLimit = request.getQueryString("viewLimit");
        Integer viewLimit;
        if (valueviewLimit != null) {
            viewLimit = Integer.parseInt(valueviewLimit);
        } else {
            viewLimit = null;
        }
        String valuemaxPrints = request.getQueryString("maxPrints");
        Integer maxPrints;
        if (valuemaxPrints != null) {
            maxPrints = Integer.parseInt(valuemaxPrints);
        } else {
            maxPrints = null;
        }
        String valueticketPriceType = request.getQueryString("ticketPriceType");
        String ticketPriceType;
        if (valueticketPriceType != null) {
            ticketPriceType = valueticketPriceType;
        } else {
            ticketPriceType = null;
        }
        String valueticketPrice = request.getQueryString("ticketPrice");
        Long ticketPrice;
        if (valueticketPrice != null) {
            ticketPrice = Long.parseLong(valueticketPrice);
        } else {
            ticketPrice = null;
        }
        String valuefullPrice = request.getQueryString("fullPrice");
        Double fullPrice;
        if (valuefullPrice != null) {
            fullPrice = Double.parseDouble(valuefullPrice);
        } else {
            fullPrice = null;
        }
        String valuediscountPrice = request.getQueryString("discountPrice");
        Double discountPrice;
        if (valuediscountPrice != null) {
            discountPrice = Double.parseDouble(valuediscountPrice);
        } else {
            discountPrice = null;
        }
        String valueshowRemaining = request.getQueryString("showRemaining");
        Boolean showRemaining;
        if (valueshowRemaining != null) {
            showRemaining = Boolean.valueOf(valueshowRemaining);
        } else {
            showRemaining = null;
        }
        String valueshowRedeemed = request.getQueryString("showRedeemed");
        Boolean showRedeemed;
        if (valueshowRedeemed != null) {
            showRedeemed = Boolean.valueOf(valueshowRedeemed);
        } else {
            showRedeemed = null;
        }
        String valuereplaced = request.getQueryString("replaced");
        Boolean replaced;
        if (valuereplaced != null) {
            replaced = Boolean.valueOf(valuereplaced);
        } else {
            replaced = null;
        }
        String valuefeatured = request.getQueryString("featured");
        Boolean featured;
        if (valuefeatured != null) {
            featured = Boolean.valueOf(valuefeatured);
        } else {
            featured = null;
        }
        String valuespecialOfferType = request.getQueryString("specialOfferType");
        String specialOfferType;
        if (valuespecialOfferType != null) {
            specialOfferType = valuespecialOfferType;
        } else {
            specialOfferType = null;
        }
        String valueofferVisibility = request.getQueryString("offerVisibility");
        String offerVisibility;
        if (valueofferVisibility != null) {
            offerVisibility = valueofferVisibility;
        } else {
            offerVisibility = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valuefilterIds = request.getQueryString("filterIds");
        String filterIds;
        if (valuefilterIds != null) {
            filterIds = valuefilterIds;
        } else {
            filterIds = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valuebarcodeAssetId = request.getQueryString("barcodeAssetId");
        Long barcodeAssetId;
        if (valuebarcodeAssetId != null) {
            barcodeAssetId = Long.parseLong(valuebarcodeAssetId);
        } else {
            barcodeAssetId = null;
        }
        String valueimageAssetId = request.getQueryString("imageAssetId");
        Long imageAssetId;
        if (valueimageAssetId != null) {
            imageAssetId = Long.parseLong(valueimageAssetId);
        } else {
            imageAssetId = null;
        }
        String valueimageAssetId1 = request.getQueryString("imageAssetId1");
        Long imageAssetId1;
        if (valueimageAssetId1 != null) {
            imageAssetId1 = Long.parseLong(valueimageAssetId1);
        } else {
            imageAssetId1 = null;
        }
        String valueimageAssetId2 = request.getQueryString("imageAssetId2");
        Long imageAssetId2;
        if (valueimageAssetId2 != null) {
            imageAssetId2 = Long.parseLong(valueimageAssetId2);
        } else {
            imageAssetId2 = null;
        }
        String valueimageAssetId3 = request.getQueryString("imageAssetId3");
        Long imageAssetId3;
        if (valueimageAssetId3 != null) {
            imageAssetId3 = Long.parseLong(valueimageAssetId3);
        } else {
            imageAssetId3 = null;
        }
        String valueimageAssetId4 = request.getQueryString("imageAssetId4");
        Long imageAssetId4;
        if (valueimageAssetId4 != null) {
            imageAssetId4 = Long.parseLong(valueimageAssetId4);
        } else {
            imageAssetId4 = null;
        }
        String valueimageAssetId5 = request.getQueryString("imageAssetId5");
        Long imageAssetId5;
        if (valueimageAssetId5 != null) {
            imageAssetId5 = Long.parseLong(valueimageAssetId5);
        } else {
            imageAssetId5 = null;
        }
        String valuepublisher = request.getQueryString("publisher");
        String publisher;
        if (valuepublisher != null) {
            publisher = valuepublisher;
        } else {
            publisher = null;
        }
        String valueredeemableStart = request.getQueryString("redeemableStart");
        Long redeemableStart;
        if (valueredeemableStart != null) {
            redeemableStart = Long.parseLong(valueredeemableStart);
        } else {
            redeemableStart = null;
        }
        String valueredeemableEnd = request.getQueryString("redeemableEnd");
        Long redeemableEnd;
        if (valueredeemableEnd != null) {
            redeemableEnd = Long.parseLong(valueredeemableEnd);
        } else {
            redeemableEnd = null;
        }
        String valueconditionType = request.getQueryString("conditionType");
        String conditionType;
        if (valueconditionType != null) {
            conditionType = valueconditionType;
        } else {
            conditionType = null;
        }
        String valueisbn = request.getQueryString("isbn");
        String isbn;
        if (valueisbn != null) {
            isbn = valueisbn;
        } else {
            isbn = null;
        }
        String valueasin = request.getQueryString("asin");
        String asin;
        if (valueasin != null) {
            asin = valueasin;
        } else {
            asin = null;
        }
        String valuecatalogNumbers = request.getQueryString("catalogNumbers");
        String catalogNumbers;
        if (valuecatalogNumbers != null) {
            catalogNumbers = valuecatalogNumbers;
        } else {
            catalogNumbers = null;
        }
        String valueavailabilityDate = request.getQueryString("availabilityDate");
        Long availabilityDate;
        if (valueavailabilityDate != null) {
            availabilityDate = Long.parseLong(valueavailabilityDate);
        } else {
            availabilityDate = null;
        }
        String valueparentalRating = request.getQueryString("parentalRating");
        String parentalRating;
        if (valueparentalRating != null) {
            parentalRating = valueparentalRating;
        } else {
            parentalRating = null;
        }
        String valuemediaType = request.getQueryString("mediaType");
        String mediaType;
        if (valuemediaType != null) {
            mediaType = valuemediaType;
        } else {
            mediaType = null;
        }
        String valueduration = request.getQueryString("duration");
        Integer duration;
        if (valueduration != null) {
            duration = Integer.parseInt(valueduration);
        } else {
            duration = null;
        }
        String valueauthor = request.getQueryString("author");
        String author;
        if (valueauthor != null) {
            author = valueauthor;
        } else {
            author = null;
        }
        String valuereleaseDate = request.getQueryString("releaseDate");
        Long releaseDate;
        if (valuereleaseDate != null) {
            releaseDate = Long.parseLong(valuereleaseDate);
        } else {
            releaseDate = null;
        }
        String valuecollectionIds = request.getQueryString("collectionIds");
        String collectionIds;
        if (valuecollectionIds != null) {
            collectionIds = valuecollectionIds;
        } else {
            collectionIds = null;
        }
        String valueavailability = request.getQueryString("availability");
        String availability;
        if (valueavailability != null) {
            availability = valueavailability;
        } else {
            availability = null;
        }
        String valueavailabilitySummary = request.getQueryString("availabilitySummary");
        String availabilitySummary;
        if (valueavailabilitySummary != null) {
            availabilitySummary = valueavailabilitySummary;
        } else {
            availabilitySummary = null;
        }
        return imp.updateMediaHttp(request, version, accountId, mediaId, retailerLocationIds, offerLocations, title, subTitle, details, subDetails, finePrint, barcodeType, barcodeEntry, externalRedeemOptions, externalUrl, ticketsRewardType, ticketsReward, activated, expires, noExpiration, availableLimit, availableLimitPerUser, addedLimit, viewLimit, maxPrints, ticketPriceType, ticketPrice, fullPrice, discountPrice, showRemaining, showRedeemed, replaced, featured, specialOfferType, offerVisibility, categoryIds, filterIds, active, barcodeAssetId, imageAssetId, imageAssetId1, imageAssetId2, imageAssetId3, imageAssetId4, imageAssetId5, publisher, redeemableStart, redeemableEnd, conditionType, isbn, asin, catalogNumbers, availabilityDate, parentalRating, mediaType, duration, author, releaseDate, collectionIds, availability, availabilitySummary);
    }

}
