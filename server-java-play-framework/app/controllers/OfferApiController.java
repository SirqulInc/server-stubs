package controllers;

import java.math.BigDecimal;
import apimodels.ListCountResponse;
import apimodels.OfferListResponse;
import apimodels.OfferResponse;
import apimodels.OfferShortResponse;
import apimodels.OfferTransactionResponse;
import apimodels.RetailerOfferResponse;
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
public class OfferApiController extends Controller {
    private final OfferApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private OfferApiController(Config configuration, OfferApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result batchUpdateOfferLocations(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuedata = request.getQueryString("data");
        String data;
        if (valuedata != null) {
            data = valuedata;
        } else {
            throw new IllegalArgumentException("'data' parameter is required");
        }
        return imp.batchUpdateOfferLocationsHttp(request, version, data, deviceId, accountId);
    }

    @ApiAction
    public Result createOffer(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        String valueparentOfferId = request.getQueryString("parentOfferId");
        Long parentOfferId;
        if (valueparentOfferId != null) {
            parentOfferId = Long.parseLong(valueparentOfferId);
        } else {
            parentOfferId = null;
        }
        String valueincludeOfferLocations = request.getQueryString("includeOfferLocations");
        Boolean includeOfferLocations;
        if (valueincludeOfferLocations != null) {
            includeOfferLocations = Boolean.valueOf(valueincludeOfferLocations);
        } else {
            throw new IllegalArgumentException("'includeOfferLocations' parameter is required");
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
        String valueexternalId = request.getQueryString("externalId");
        String externalId;
        if (valueexternalId != null) {
            externalId = valueexternalId;
        } else {
            externalId = null;
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
        String valueofferType = request.getQueryString("offerType");
        String offerType;
        if (valueofferType != null) {
            offerType = valueofferType;
        } else {
            throw new IllegalArgumentException("'offerType' parameter is required");
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
        String valuebrand = request.getQueryString("brand");
        String brand;
        if (valuebrand != null) {
            brand = valuebrand;
        } else {
            brand = null;
        }
        String valueproductType = request.getQueryString("productType");
        String productType;
        if (valueproductType != null) {
            productType = valueproductType;
        } else {
            productType = null;
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
        String valuedepartment = request.getQueryString("department");
        String department;
        if (valuedepartment != null) {
            department = valuedepartment;
        } else {
            department = null;
        }
        String valuefeatures = request.getQueryString("features");
        String features;
        if (valuefeatures != null) {
            features = valuefeatures;
        } else {
            features = null;
        }
        String valueminimumPrice = request.getQueryString("minimumPrice");
        Double minimumPrice;
        if (valueminimumPrice != null) {
            minimumPrice = Double.parseDouble(valueminimumPrice);
        } else {
            minimumPrice = null;
        }
        String valuewidth = request.getQueryString("width");
        Double width;
        if (valuewidth != null) {
            width = Double.parseDouble(valuewidth);
        } else {
            width = null;
        }
        String valueheight = request.getQueryString("height");
        Double height;
        if (valueheight != null) {
            height = Double.parseDouble(valueheight);
        } else {
            height = null;
        }
        String valuedepth = request.getQueryString("depth");
        Double depth;
        if (valuedepth != null) {
            depth = Double.parseDouble(valuedepth);
        } else {
            depth = null;
        }
        String valueweight = request.getQueryString("weight");
        Double weight;
        if (valueweight != null) {
            weight = Double.parseDouble(valueweight);
        } else {
            weight = null;
        }
        String valueunit = request.getQueryString("unit");
        String unit;
        if (valueunit != null) {
            unit = valueunit;
        } else {
            unit = null;
        }
        String valuestudio = request.getQueryString("studio");
        String studio;
        if (valuestudio != null) {
            studio = valuestudio;
        } else {
            studio = null;
        }
        String valueparentalRating = request.getQueryString("parentalRating");
        String parentalRating;
        if (valueparentalRating != null) {
            parentalRating = valueparentalRating;
        } else {
            parentalRating = null;
        }
        String valuepublishDate = request.getQueryString("publishDate");
        Long publishDate;
        if (valuepublishDate != null) {
            publishDate = Long.parseLong(valuepublishDate);
        } else {
            publishDate = null;
        }
        String valueavailabilityDate = request.getQueryString("availabilityDate");
        Long availabilityDate;
        if (valueavailabilityDate != null) {
            availabilityDate = Long.parseLong(valueavailabilityDate);
        } else {
            availabilityDate = null;
        }
        String valuesizeId = request.getQueryString("sizeId");
        Long sizeId;
        if (valuesizeId != null) {
            sizeId = Long.parseLong(valuesizeId);
        } else {
            sizeId = null;
        }
        String valuelistingId = request.getQueryString("listingId");
        Long listingId;
        if (valuelistingId != null) {
            listingId = Long.parseLong(valuelistingId);
        } else {
            listingId = null;
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
        String valuerebootTimeHour = request.getQueryString("rebootTimeHour");
        Integer rebootTimeHour;
        if (valuerebootTimeHour != null) {
            rebootTimeHour = Integer.parseInt(valuerebootTimeHour);
        } else {
            rebootTimeHour = null;
        }
        String valuerebootTimeMinute = request.getQueryString("rebootTimeMinute");
        Integer rebootTimeMinute;
        if (valuerebootTimeMinute != null) {
            rebootTimeMinute = Integer.parseInt(valuerebootTimeMinute);
        } else {
            rebootTimeMinute = null;
        }
        String valueidleTimeoutInSecond = request.getQueryString("idleTimeoutInSecond");
        Integer idleTimeoutInSecond;
        if (valueidleTimeoutInSecond != null) {
            idleTimeoutInSecond = Integer.parseInt(valueidleTimeoutInSecond);
        } else {
            idleTimeoutInSecond = null;
        }
        String valueserialNumber = request.getQueryString("serialNumber");
        String serialNumber;
        if (valueserialNumber != null) {
            serialNumber = valueserialNumber;
        } else {
            serialNumber = null;
        }
        String valueudid = request.getQueryString("udid");
        String udid;
        if (valueudid != null) {
            udid = valueudid;
        } else {
            udid = null;
        }
        String valuedeviceType = request.getQueryString("deviceType");
        String deviceType;
        if (valuedeviceType != null) {
            deviceType = valuedeviceType;
        } else {
            deviceType = null;
        }
        String valuedevicePower = request.getQueryString("devicePower");
        Double devicePower;
        if (valuedevicePower != null) {
            devicePower = Double.parseDouble(valuedevicePower);
        } else {
            devicePower = null;
        }
        String valuedeviceInterference = request.getQueryString("deviceInterference");
        Double deviceInterference;
        if (valuedeviceInterference != null) {
            deviceInterference = Double.parseDouble(valuedeviceInterference);
        } else {
            deviceInterference = null;
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
        return imp.createOfferHttp(request, version, includeOfferLocations, title, barcodeType, noExpiration, availableLimit, availableLimitPerUser, addedLimit, viewLimit, maxPrints, ticketPrice, fullPrice, discountPrice, offerType, specialOfferType, offerVisibility, active, deviceId, accountId, tags, parentOfferId, retailerLocationIds, offerLocations, subTitle, details, subDetails, finePrint, barcodeEntry, externalRedeemOptions, externalUrl, externalId, ticketsRewardType, ticketsReward, activated, expires, ticketPriceType, showRemaining, showRedeemed, replaced, featured, categoryIds, filterIds, barcodeAssetId, imageAssetId, imageAssetId1, imageAssetId2, imageAssetId3, imageAssetId4, imageAssetId5, publisher, redeemableStart, redeemableEnd, brand, productType, conditionType, isbn, asin, catalogNumbers, department, features, minimumPrice, width, height, depth, weight, unit, studio, parentalRating, publishDate, availabilityDate, sizeId, listingId, mediaType, duration, author, releaseDate, collectionIds, rebootTimeHour, rebootTimeMinute, idleTimeoutInSecond, serialNumber, udid, deviceType, devicePower, deviceInterference, availability, availabilitySummary);
    }

    @ApiAction
    public Result deleteOffer(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueofferId = request.getQueryString("offerId");
        Long offerId;
        if (valueofferId != null) {
            offerId = Long.parseLong(valueofferId);
        } else {
            throw new IllegalArgumentException("'offerId' parameter is required");
        }
        return imp.deleteOfferHttp(request, version, offerId, deviceId, accountId);
    }

    @ApiAction
    public Result deleteOfferLocation(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueofferLocationId = request.getQueryString("offerLocationId");
        Long offerLocationId;
        if (valueofferLocationId != null) {
            offerLocationId = Long.parseLong(valueofferLocationId);
        } else {
            throw new IllegalArgumentException("'offerLocationId' parameter is required");
        }
        return imp.deleteOfferLocationHttp(request, version, offerLocationId, deviceId, accountId);
    }

    @ApiAction
    public Result getOffer(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueofferId = request.getQueryString("offerId");
        Long offerId;
        if (valueofferId != null) {
            offerId = Long.parseLong(valueofferId);
        } else {
            throw new IllegalArgumentException("'offerId' parameter is required");
        }
        String valueincludeOfferLocations = request.getQueryString("includeOfferLocations");
        Boolean includeOfferLocations;
        if (valueincludeOfferLocations != null) {
            includeOfferLocations = Boolean.valueOf(valueincludeOfferLocations);
        } else {
            throw new IllegalArgumentException("'includeOfferLocations' parameter is required");
        }
        return imp.getOfferHttp(request, version, offerId, includeOfferLocations, deviceId, accountId);
    }

    @ApiAction
    public Result getOfferDetails(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueofferId = request.getQueryString("offerId");
        Long offerId;
        if (valueofferId != null) {
            offerId = Long.parseLong(valueofferId);
        } else {
            offerId = null;
        }
        String valueofferLocationId = request.getQueryString("offerLocationId");
        Long offerLocationId;
        if (valueofferLocationId != null) {
            offerLocationId = Long.parseLong(valueofferLocationId);
        } else {
            offerLocationId = null;
        }
        String valuedistance = request.getQueryString("distance");
        Double distance;
        if (valuedistance != null) {
            distance = Double.parseDouble(valuedistance);
        } else {
            distance = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        String valueincludeOfferLocations = request.getQueryString("includeOfferLocations");
        Boolean includeOfferLocations;
        if (valueincludeOfferLocations != null) {
            includeOfferLocations = Boolean.valueOf(valueincludeOfferLocations);
        } else {
            includeOfferLocations = false;
        }
        String valueincludeRetailerLocations = request.getQueryString("includeRetailerLocations");
        Boolean includeRetailerLocations;
        if (valueincludeRetailerLocations != null) {
            includeRetailerLocations = Boolean.valueOf(valueincludeRetailerLocations);
        } else {
            includeRetailerLocations = false;
        }
        String valueincludeChildOffers = request.getQueryString("includeChildOffers");
        Boolean includeChildOffers;
        if (valueincludeChildOffers != null) {
            includeChildOffers = Boolean.valueOf(valueincludeChildOffers);
        } else {
            includeChildOffers = false;
        }
        return imp.getOfferDetailsHttp(request, version, deviceId, accountId, offerId, offerLocationId, distance, latitude, longitude, includeOfferLocations, includeRetailerLocations, includeChildOffers);
    }

    @ApiAction
    public Result getOfferListCounts(Http.Request request, BigDecimal version) throws Exception {
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            throw new IllegalArgumentException("'latitude' parameter is required");
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            throw new IllegalArgumentException("'longitude' parameter is required");
        }
        String valuesearchRange = request.getQueryString("searchRange");
        BigDecimal searchRange;
        if (valuesearchRange != null) {
            searchRange = new BigDecimal(valuesearchRange);
        } else {
            searchRange = 5;
        }
        String valuedistanceUnit = request.getQueryString("distanceUnit");
        String distanceUnit;
        if (valuedistanceUnit != null) {
            distanceUnit = valuedistanceUnit;
        } else {
            distanceUnit = "MILES";
        }
        return imp.getOfferListCountsHttp(request, version, latitude, longitude, searchRange, distanceUnit);
    }

    @ApiAction
    public Result getOfferLocation(Http.Request request, BigDecimal version) throws Exception {
        String valueofferLocationId = request.getQueryString("offerLocationId");
        Long offerLocationId;
        if (valueofferLocationId != null) {
            offerLocationId = Long.parseLong(valueofferLocationId);
        } else {
            offerLocationId = null;
        }
        String valueudid = request.getQueryString("udid");
        String udid;
        if (valueudid != null) {
            udid = valueudid;
        } else {
            udid = null;
        }
        return imp.getOfferLocationHttp(request, version, offerLocationId, udid);
    }

    @ApiAction
    public Result getOfferLocationsForRetailers(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valueretailerId = request.getQueryString("retailerId");
        Long retailerId;
        if (valueretailerId != null) {
            retailerId = Long.parseLong(valueretailerId);
        } else {
            retailerId = null;
        }
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            retailerLocationId = null;
        }
        String valueofferType = request.getQueryString("offerType");
        String offerType;
        if (valueofferType != null) {
            offerType = valueofferType;
        } else {
            offerType = null;
        }
        String valuespecialOfferType = request.getQueryString("specialOfferType");
        String specialOfferType;
        if (valuespecialOfferType != null) {
            specialOfferType = valuespecialOfferType;
        } else {
            specialOfferType = null;
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
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            throw new IllegalArgumentException("'activeOnly' parameter is required");
        }
        String valueincludeRetailerLocation = request.getQueryString("includeRetailerLocation");
        Boolean includeRetailerLocation;
        if (valueincludeRetailerLocation != null) {
            includeRetailerLocation = Boolean.valueOf(valueincludeRetailerLocation);
        } else {
            throw new IllegalArgumentException("'includeRetailerLocation' parameter is required");
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
        String valuedeviceStatus = request.getQueryString("deviceStatus");
        String deviceStatus;
        if (valuedeviceStatus != null) {
            deviceStatus = valuedeviceStatus;
        } else {
            deviceStatus = null;
        }
        String valueneedsNotificationSent = request.getQueryString("needsNotificationSent");
        Boolean needsNotificationSent;
        if (valueneedsNotificationSent != null) {
            needsNotificationSent = Boolean.valueOf(valueneedsNotificationSent);
        } else {
            needsNotificationSent = null;
        }
        String valuelastNotificationSent = request.getQueryString("lastNotificationSent");
        Long lastNotificationSent;
        if (valuelastNotificationSent != null) {
            lastNotificationSent = Long.parseLong(valuelastNotificationSent);
        } else {
            lastNotificationSent = null;
        }
        return imp.getOfferLocationsForRetailersHttp(request, version, sortField, descending, start, limit, activeOnly, includeRetailerLocation, deviceId, accountId, keyword, retailerId, retailerLocationId, offerType, specialOfferType, barcodeType, barcodeEntry, isbn, asin, deviceStatus, needsNotificationSent, lastNotificationSent);
    }

    @ApiAction
    public Result getOffersForRetailers(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
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
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valueretailerId = request.getQueryString("retailerId");
        Long retailerId;
        if (valueretailerId != null) {
            retailerId = Long.parseLong(valueretailerId);
        } else {
            retailerId = null;
        }
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            retailerLocationId = null;
        }
        String valuecouponType = request.getQueryString("couponType");
        String couponType;
        if (valuecouponType != null) {
            couponType = valuecouponType;
        } else {
            couponType = null;
        }
        String valueofferType = request.getQueryString("offerType");
        String offerType;
        if (valueofferType != null) {
            offerType = valueofferType;
        } else {
            offerType = null;
        }
        String valueofferTypes = request.getQueryString("offerTypes");
        String offerTypes;
        if (valueofferTypes != null) {
            offerTypes = valueofferTypes;
        } else {
            offerTypes = null;
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
            throw new IllegalArgumentException("'offerVisibility' parameter is required");
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
        String valuei = request.getQueryString("_i");
        Integer i;
        if (valuei != null) {
            i = Integer.parseInt(valuei);
        } else {
            i = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuel = request.getQueryString("_l");
        Integer l;
        if (valuel != null) {
            l = Integer.parseInt(valuel);
        } else {
            l = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        String valueavailableOnly = request.getQueryString("availableOnly");
        Boolean availableOnly;
        if (valueavailableOnly != null) {
            availableOnly = Boolean.valueOf(valueavailableOnly);
        } else {
            throw new IllegalArgumentException("'availableOnly' parameter is required");
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            throw new IllegalArgumentException("'activeOnly' parameter is required");
        }
        String valueincludeCategories = request.getQueryString("includeCategories");
        Boolean includeCategories;
        if (valueincludeCategories != null) {
            includeCategories = Boolean.valueOf(valueincludeCategories);
        } else {
            throw new IllegalArgumentException("'includeCategories' parameter is required");
        }
        String valueincludeFilters = request.getQueryString("includeFilters");
        Boolean includeFilters;
        if (valueincludeFilters != null) {
            includeFilters = Boolean.valueOf(valueincludeFilters);
        } else {
            throw new IllegalArgumentException("'includeFilters' parameter is required");
        }
        String valueincludeOfferLocations = request.getQueryString("includeOfferLocations");
        Boolean includeOfferLocations;
        if (valueincludeOfferLocations != null) {
            includeOfferLocations = Boolean.valueOf(valueincludeOfferLocations);
        } else {
            throw new IllegalArgumentException("'includeOfferLocations' parameter is required");
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
        String valuedeviceStatus = request.getQueryString("deviceStatus");
        String deviceStatus;
        if (valuedeviceStatus != null) {
            deviceStatus = valuedeviceStatus;
        } else {
            deviceStatus = null;
        }
        String valueneedsNotificationSent = request.getQueryString("needsNotificationSent");
        Boolean needsNotificationSent;
        if (valueneedsNotificationSent != null) {
            needsNotificationSent = Boolean.valueOf(valueneedsNotificationSent);
        } else {
            needsNotificationSent = null;
        }
        String valuelastNotificationSent = request.getQueryString("lastNotificationSent");
        Long lastNotificationSent;
        if (valuelastNotificationSent != null) {
            lastNotificationSent = Long.parseLong(valuelastNotificationSent);
        } else {
            lastNotificationSent = null;
        }
        return imp.getOffersForRetailersHttp(request, version, offerVisibility, sortField, descending, start, limit, availableOnly, activeOnly, includeCategories, includeFilters, includeOfferLocations, deviceId, accountId, categoryIds, filterIds, q, keyword, retailerId, retailerLocationId, couponType, offerType, offerTypes, specialOfferType, i, l, barcodeType, barcodeEntry, isbn, asin, deviceStatus, needsNotificationSent, lastNotificationSent);
    }

    @ApiAction
    public Result redeemOfferTransaction(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueofferTransactionId = request.getQueryString("offerTransactionId");
        Long offerTransactionId;
        if (valueofferTransactionId != null) {
            offerTransactionId = Long.parseLong(valueofferTransactionId);
        } else {
            throw new IllegalArgumentException("'offerTransactionId' parameter is required");
        }
        String valueofferLocationId = request.getQueryString("offerLocationId");
        Long offerLocationId;
        if (valueofferLocationId != null) {
            offerLocationId = Long.parseLong(valueofferLocationId);
        } else {
            offerLocationId = null;
        }
        String valuestatus = request.getQueryString("status");
        Integer status;
        if (valuestatus != null) {
            status = Integer.parseInt(valuestatus);
        } else {
            throw new IllegalArgumentException("'status' parameter is required");
        }
        return imp.redeemOfferTransactionHttp(request, version, offerTransactionId, status, deviceId, accountId, offerLocationId);
    }

    @ApiAction
    public Result searchOfferTransactionsForRetailers(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valueretailerId = request.getQueryString("retailerId");
        Long retailerId;
        if (valueretailerId != null) {
            retailerId = Long.parseLong(valueretailerId);
        } else {
            retailerId = null;
        }
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            retailerLocationId = null;
        }
        String valueofferId = request.getQueryString("offerId");
        Long offerId;
        if (valueofferId != null) {
            offerId = Long.parseLong(valueofferId);
        } else {
            offerId = null;
        }
        String valueofferLocationId = request.getQueryString("offerLocationId");
        Long offerLocationId;
        if (valueofferLocationId != null) {
            offerLocationId = Long.parseLong(valueofferLocationId);
        } else {
            offerLocationId = null;
        }
        String valueredeemed = request.getQueryString("redeemed");
        Boolean redeemed;
        if (valueredeemed != null) {
            redeemed = Boolean.valueOf(valueredeemed);
        } else {
            redeemed = null;
        }
        String valuereservationsOnly = request.getQueryString("reservationsOnly");
        Boolean reservationsOnly;
        if (valuereservationsOnly != null) {
            reservationsOnly = Boolean.valueOf(valuereservationsOnly);
        } else {
            reservationsOnly = null;
        }
        String valuecouponType = request.getQueryString("couponType");
        String couponType;
        if (valuecouponType != null) {
            couponType = valuecouponType;
        } else {
            couponType = null;
        }
        String valueofferType = request.getQueryString("offerType");
        String offerType;
        if (valueofferType != null) {
            offerType = valueofferType;
        } else {
            offerType = null;
        }
        String valuespecialOfferType = request.getQueryString("specialOfferType");
        String specialOfferType;
        if (valuespecialOfferType != null) {
            specialOfferType = valuespecialOfferType;
        } else {
            specialOfferType = null;
        }
        String valuecustomerAccountIds = request.getQueryString("customerAccountIds");
        String customerAccountIds;
        if (valuecustomerAccountIds != null) {
            customerAccountIds = valuecustomerAccountIds;
        } else {
            customerAccountIds = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valueredeemableStartDate = request.getQueryString("redeemableStartDate");
        Long redeemableStartDate;
        if (valueredeemableStartDate != null) {
            redeemableStartDate = Long.parseLong(valueredeemableStartDate);
        } else {
            redeemableStartDate = null;
        }
        String valueredeemableEndDate = request.getQueryString("redeemableEndDate");
        Long redeemableEndDate;
        if (valueredeemableEndDate != null) {
            redeemableEndDate = Long.parseLong(valueredeemableEndDate);
        } else {
            redeemableEndDate = null;
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
        String valuei = request.getQueryString("_i");
        Integer i;
        if (valuei != null) {
            i = Integer.parseInt(valuei);
        } else {
            i = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuel = request.getQueryString("_l");
        Integer l;
        if (valuel != null) {
            l = Integer.parseInt(valuel);
        } else {
            l = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            throw new IllegalArgumentException("'activeOnly' parameter is required");
        }
        return imp.searchOfferTransactionsForRetailersHttp(request, version, sortField, descending, start, limit, activeOnly, deviceId, accountId, q, keyword, retailerId, retailerLocationId, offerId, offerLocationId, redeemed, reservationsOnly, couponType, offerType, specialOfferType, customerAccountIds, categoryIds, redeemableStartDate, redeemableEndDate, i, l);
    }

    @ApiAction
    public Result searchOffersForConsumer(Http.Request request, BigDecimal version) throws Exception {
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            throw new IllegalArgumentException("'latitude' parameter is required");
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            throw new IllegalArgumentException("'longitude' parameter is required");
        }
        String valuesearchRange = request.getQueryString("searchRange");
        Double searchRange;
        if (valuesearchRange != null) {
            searchRange = Double.parseDouble(valuesearchRange);
        } else {
            searchRange = 5;
        }
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        String valuesupportedPostalCodes = request.getQueryString("supportedPostalCodes");
        String supportedPostalCodes;
        if (valuesupportedPostalCodes != null) {
            supportedPostalCodes = valuesupportedPostalCodes;
        } else {
            supportedPostalCodes = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuecategories = request.getQueryString("categories");
        String categories;
        if (valuecategories != null) {
            categories = valuecategories;
        } else {
            categories = null;
        }
        String valuefilters = request.getQueryString("filters");
        String filters;
        if (valuefilters != null) {
            filters = valuefilters;
        } else {
            filters = null;
        }
        String valueofferTypes = request.getQueryString("offerTypes");
        String offerTypes;
        if (valueofferTypes != null) {
            offerTypes = valueofferTypes;
        } else {
            offerTypes = "COUPON, VOUCHER";
        }
        String valuetype = request.getQueryString("type");
        String type;
        if (valuetype != null) {
            type = valuetype;
        } else {
            type = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = null;
        }
        String valuerecommendOfferIds = request.getQueryString("recommendOfferIds");
        String recommendOfferIds;
        if (valuerecommendOfferIds != null) {
            recommendOfferIds = valuerecommendOfferIds;
        } else {
            recommendOfferIds = null;
        }
        String valuerecommendationType = request.getQueryString("recommendationType");
        String recommendationType;
        if (valuerecommendationType != null) {
            recommendationType = valuerecommendationType;
        } else {
            throw new IllegalArgumentException("'recommendationType' parameter is required");
        }
        String valuelocationId = request.getQueryString("locationId");
        Long locationId;
        if (valuelocationId != null) {
            locationId = Long.parseLong(valuelocationId);
        } else {
            throw new IllegalArgumentException("'locationId' parameter is required");
        }
        String valueretailerLocationIds = request.getQueryString("retailerLocationIds");
        String retailerLocationIds;
        if (valueretailerLocationIds != null) {
            retailerLocationIds = valueretailerLocationIds;
        } else {
            retailerLocationIds = null;
        }
        String valueofferId = request.getQueryString("offerId");
        Long offerId;
        if (valueofferId != null) {
            offerId = Long.parseLong(valueofferId);
        } else {
            offerId = null;
        }
        String valueincludeMission = request.getQueryString("includeMission");
        Boolean includeMission;
        if (valueincludeMission != null) {
            includeMission = Boolean.valueOf(valueincludeMission);
        } else {
            includeMission = null;
        }
        String valueincludeCategories = request.getQueryString("includeCategories");
        Boolean includeCategories;
        if (valueincludeCategories != null) {
            includeCategories = Boolean.valueOf(valueincludeCategories);
        } else {
            includeCategories = null;
        }
        String valueincludeFilters = request.getQueryString("includeFilters");
        Boolean includeFilters;
        if (valueincludeFilters != null) {
            includeFilters = Boolean.valueOf(valueincludeFilters);
        } else {
            includeFilters = null;
        }
        String valueincludeExpired = request.getQueryString("includeExpired");
        Boolean includeExpired;
        if (valueincludeExpired != null) {
            includeExpired = Boolean.valueOf(valueincludeExpired);
        } else {
            includeExpired = null;
        }
        String valueincludeFavorite = request.getQueryString("includeFavorite");
        Boolean includeFavorite;
        if (valueincludeFavorite != null) {
            includeFavorite = Boolean.valueOf(valueincludeFavorite);
        } else {
            includeFavorite = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        String valuemaxRecommendations = request.getQueryString("maxRecommendations");
        Integer maxRecommendations;
        if (valuemaxRecommendations != null) {
            maxRecommendations = Integer.parseInt(valuemaxRecommendations);
        } else {
            throw new IllegalArgumentException("'maxRecommendations' parameter is required");
        }
        String valuedistanceUnit = request.getQueryString("distanceUnit");
        String distanceUnit;
        if (valuedistanceUnit != null) {
            distanceUnit = valuedistanceUnit;
        } else {
            throw new IllegalArgumentException("'distanceUnit' parameter is required");
        }
        String valueclosestOfferOnly = request.getQueryString("closestOfferOnly");
        Boolean closestOfferOnly;
        if (valueclosestOfferOnly != null) {
            closestOfferOnly = Boolean.valueOf(valueclosestOfferOnly);
        } else {
            closestOfferOnly = null;
        }
        String valuesearchExpression = request.getQueryString("searchExpression");
        String searchExpression;
        if (valuesearchExpression != null) {
            searchExpression = valuesearchExpression;
        } else {
            searchExpression = null;
        }
        String valuegroupBy = request.getQueryString("groupBy");
        String groupBy;
        if (valuegroupBy != null) {
            groupBy = valuegroupBy;
        } else {
            groupBy = null;
        }
        return imp.searchOffersForConsumerHttp(request, version, latitude, longitude, recommendationType, locationId, start, limit, maxRecommendations, distanceUnit, appKey, deviceId, accountId, searchRange, tags, supportedPostalCodes, keyword, categories, filters, offerTypes, type, sortField, recommendOfferIds, retailerLocationIds, offerId, includeMission, includeCategories, includeFilters, includeExpired, includeFavorite, closestOfferOnly, searchExpression, groupBy);
    }

    @ApiAction
    public Result topOfferTransactions(Http.Request request, BigDecimal version) throws Exception {
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        return imp.topOfferTransactionsHttp(request, version, start, limit);
    }

    @ApiAction
    public Result updateOffer(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueofferId = request.getQueryString("offerId");
        Long offerId;
        if (valueofferId != null) {
            offerId = Long.parseLong(valueofferId);
        } else {
            throw new IllegalArgumentException("'offerId' parameter is required");
        }
        String valueparentOfferId = request.getQueryString("parentOfferId");
        Long parentOfferId;
        if (valueparentOfferId != null) {
            parentOfferId = Long.parseLong(valueparentOfferId);
        } else {
            parentOfferId = null;
        }
        String valueincludeOfferLocations = request.getQueryString("includeOfferLocations");
        Boolean includeOfferLocations;
        if (valueincludeOfferLocations != null) {
            includeOfferLocations = Boolean.valueOf(valueincludeOfferLocations);
        } else {
            throw new IllegalArgumentException("'includeOfferLocations' parameter is required");
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
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
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
        String valueexternalId = request.getQueryString("externalId");
        String externalId;
        if (valueexternalId != null) {
            externalId = valueexternalId;
        } else {
            externalId = null;
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
        String valueofferType = request.getQueryString("offerType");
        String offerType;
        if (valueofferType != null) {
            offerType = valueofferType;
        } else {
            offerType = null;
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
        String valuebrand = request.getQueryString("brand");
        String brand;
        if (valuebrand != null) {
            brand = valuebrand;
        } else {
            brand = null;
        }
        String valueproductType = request.getQueryString("productType");
        String productType;
        if (valueproductType != null) {
            productType = valueproductType;
        } else {
            productType = null;
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
        String valuedepartment = request.getQueryString("department");
        String department;
        if (valuedepartment != null) {
            department = valuedepartment;
        } else {
            department = null;
        }
        String valuefeatures = request.getQueryString("features");
        String features;
        if (valuefeatures != null) {
            features = valuefeatures;
        } else {
            features = null;
        }
        String valueminimumPrice = request.getQueryString("minimumPrice");
        Double minimumPrice;
        if (valueminimumPrice != null) {
            minimumPrice = Double.parseDouble(valueminimumPrice);
        } else {
            minimumPrice = null;
        }
        String valuewidth = request.getQueryString("width");
        Double width;
        if (valuewidth != null) {
            width = Double.parseDouble(valuewidth);
        } else {
            width = null;
        }
        String valueheight = request.getQueryString("height");
        Double height;
        if (valueheight != null) {
            height = Double.parseDouble(valueheight);
        } else {
            height = null;
        }
        String valuedepth = request.getQueryString("depth");
        Double depth;
        if (valuedepth != null) {
            depth = Double.parseDouble(valuedepth);
        } else {
            depth = null;
        }
        String valueweight = request.getQueryString("weight");
        Double weight;
        if (valueweight != null) {
            weight = Double.parseDouble(valueweight);
        } else {
            weight = null;
        }
        String valueunit = request.getQueryString("unit");
        String unit;
        if (valueunit != null) {
            unit = valueunit;
        } else {
            unit = null;
        }
        String valuestudio = request.getQueryString("studio");
        String studio;
        if (valuestudio != null) {
            studio = valuestudio;
        } else {
            studio = null;
        }
        String valueparentalRating = request.getQueryString("parentalRating");
        String parentalRating;
        if (valueparentalRating != null) {
            parentalRating = valueparentalRating;
        } else {
            parentalRating = null;
        }
        String valuepublishDate = request.getQueryString("publishDate");
        Long publishDate;
        if (valuepublishDate != null) {
            publishDate = Long.parseLong(valuepublishDate);
        } else {
            publishDate = null;
        }
        String valueavailabilityDate = request.getQueryString("availabilityDate");
        Long availabilityDate;
        if (valueavailabilityDate != null) {
            availabilityDate = Long.parseLong(valueavailabilityDate);
        } else {
            availabilityDate = null;
        }
        String valuesizeId = request.getQueryString("sizeId");
        Long sizeId;
        if (valuesizeId != null) {
            sizeId = Long.parseLong(valuesizeId);
        } else {
            sizeId = null;
        }
        String valuelistingId = request.getQueryString("listingId");
        Long listingId;
        if (valuelistingId != null) {
            listingId = Long.parseLong(valuelistingId);
        } else {
            listingId = null;
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
        String valuerebootTimeHour = request.getQueryString("rebootTimeHour");
        Integer rebootTimeHour;
        if (valuerebootTimeHour != null) {
            rebootTimeHour = Integer.parseInt(valuerebootTimeHour);
        } else {
            rebootTimeHour = null;
        }
        String valuerebootTimeMinute = request.getQueryString("rebootTimeMinute");
        Integer rebootTimeMinute;
        if (valuerebootTimeMinute != null) {
            rebootTimeMinute = Integer.parseInt(valuerebootTimeMinute);
        } else {
            rebootTimeMinute = null;
        }
        String valueidleTimeoutInSecond = request.getQueryString("idleTimeoutInSecond");
        Integer idleTimeoutInSecond;
        if (valueidleTimeoutInSecond != null) {
            idleTimeoutInSecond = Integer.parseInt(valueidleTimeoutInSecond);
        } else {
            idleTimeoutInSecond = null;
        }
        String valueserialNumber = request.getQueryString("serialNumber");
        String serialNumber;
        if (valueserialNumber != null) {
            serialNumber = valueserialNumber;
        } else {
            serialNumber = null;
        }
        String valueudid = request.getQueryString("udid");
        String udid;
        if (valueudid != null) {
            udid = valueudid;
        } else {
            udid = null;
        }
        String valuedeviceType = request.getQueryString("deviceType");
        String deviceType;
        if (valuedeviceType != null) {
            deviceType = valuedeviceType;
        } else {
            deviceType = null;
        }
        String valuedevicePower = request.getQueryString("devicePower");
        Double devicePower;
        if (valuedevicePower != null) {
            devicePower = Double.parseDouble(valuedevicePower);
        } else {
            devicePower = null;
        }
        String valuedeviceInterference = request.getQueryString("deviceInterference");
        Double deviceInterference;
        if (valuedeviceInterference != null) {
            deviceInterference = Double.parseDouble(valuedeviceInterference);
        } else {
            deviceInterference = null;
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
        return imp.updateOfferHttp(request, version, offerId, includeOfferLocations, deviceId, accountId, parentOfferId, retailerLocationIds, offerLocations, tags, title, subTitle, details, subDetails, finePrint, barcodeType, barcodeEntry, externalRedeemOptions, externalUrl, externalId, ticketsRewardType, ticketsReward, activated, expires, noExpiration, availableLimit, availableLimitPerUser, addedLimit, viewLimit, maxPrints, ticketPriceType, ticketPrice, fullPrice, discountPrice, showRemaining, showRedeemed, replaced, featured, offerType, specialOfferType, offerVisibility, categoryIds, filterIds, active, barcodeAssetId, imageAssetId, imageAssetId1, imageAssetId2, imageAssetId3, imageAssetId4, imageAssetId5, publisher, redeemableStart, redeemableEnd, brand, productType, conditionType, isbn, asin, catalogNumbers, department, features, minimumPrice, width, height, depth, weight, unit, studio, parentalRating, publishDate, availabilityDate, sizeId, listingId, mediaType, duration, author, releaseDate, collectionIds, rebootTimeHour, rebootTimeMinute, idleTimeoutInSecond, serialNumber, udid, deviceType, devicePower, deviceInterference, availability, availabilitySummary);
    }

    @ApiAction
    public Result updateOfferStatus(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueofferIds = request.getQueryString("offerIds");
        String offerIds;
        if (valueofferIds != null) {
            offerIds = valueofferIds;
        } else {
            throw new IllegalArgumentException("'offerIds' parameter is required");
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            throw new IllegalArgumentException("'active' parameter is required");
        }
        return imp.updateOfferStatusHttp(request, version, offerIds, active, deviceId, accountId);
    }

}
