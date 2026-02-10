package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.RetailerLocationResponse;
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
public class RetailerLocationApiController extends Controller {
    private final RetailerLocationApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private RetailerLocationApiController(Config configuration, RetailerLocationApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createRetailerLocationConsumer(Http.Request request, BigDecimal version) throws Exception {
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
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("'name' parameter is required");
        }
        String valuestreetAddress = request.getQueryString("streetAddress");
        String streetAddress;
        if (valuestreetAddress != null) {
            streetAddress = valuestreetAddress;
        } else {
            streetAddress = null;
        }
        String valuestreetAddress2 = request.getQueryString("streetAddress2");
        String streetAddress2;
        if (valuestreetAddress2 != null) {
            streetAddress2 = valuestreetAddress2;
        } else {
            streetAddress2 = null;
        }
        String valuecity = request.getQueryString("city");
        String city;
        if (valuecity != null) {
            city = valuecity;
        } else {
            city = null;
        }
        String valuestate = request.getQueryString("state");
        String state;
        if (valuestate != null) {
            state = valuestate;
        } else {
            state = null;
        }
        String valuepostalCode = request.getQueryString("postalCode");
        String postalCode;
        if (valuepostalCode != null) {
            postalCode = valuepostalCode;
        } else {
            postalCode = null;
        }
        String valuecountry = request.getQueryString("country");
        String country;
        if (valuecountry != null) {
            country = valuecountry;
        } else {
            country = null;
        }
        String valuebusinessPhone = request.getQueryString("businessPhone");
        String businessPhone;
        if (valuebusinessPhone != null) {
            businessPhone = valuebusinessPhone;
        } else {
            businessPhone = null;
        }
        String valuebusinessPhoneExt = request.getQueryString("businessPhoneExt");
        String businessPhoneExt;
        if (valuebusinessPhoneExt != null) {
            businessPhoneExt = valuebusinessPhoneExt;
        } else {
            businessPhoneExt = null;
        }
        String valuewebsite = request.getQueryString("website");
        String website;
        if (valuewebsite != null) {
            website = valuewebsite;
        } else {
            website = null;
        }
        String valueemail = request.getQueryString("email");
        String email;
        if (valueemail != null) {
            email = valueemail;
        } else {
            email = null;
        }
        String valuedetailsHeader = request.getQueryString("detailsHeader");
        String detailsHeader;
        if (valuedetailsHeader != null) {
            detailsHeader = valuedetailsHeader;
        } else {
            detailsHeader = null;
        }
        String valuedetailsBody = request.getQueryString("detailsBody");
        String detailsBody;
        if (valuedetailsBody != null) {
            detailsBody = valuedetailsBody;
        } else {
            detailsBody = null;
        }
        String valuehours = request.getQueryString("hours");
        String hours;
        if (valuehours != null) {
            hours = valuehours;
        } else {
            hours = null;
        }
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        String valuelogoAssetId = request.getQueryString("logoAssetId");
        Long logoAssetId;
        if (valuelogoAssetId != null) {
            logoAssetId = Long.parseLong(valuelogoAssetId);
        } else {
            logoAssetId = null;
        }
        String valuepicture1AssetId = request.getQueryString("picture1AssetId");
        Long picture1AssetId;
        if (valuepicture1AssetId != null) {
            picture1AssetId = Long.parseLong(valuepicture1AssetId);
        } else {
            picture1AssetId = null;
        }
        String valuepicture2AssetId = request.getQueryString("picture2AssetId");
        Long picture2AssetId;
        if (valuepicture2AssetId != null) {
            picture2AssetId = Long.parseLong(valuepicture2AssetId);
        } else {
            picture2AssetId = null;
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
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valuepublicLocation = request.getQueryString("publicLocation");
        Boolean publicLocation;
        if (valuepublicLocation != null) {
            publicLocation = Boolean.valueOf(valuepublicLocation);
        } else {
            publicLocation = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valuelocationType = request.getQueryString("locationType");
        String locationType;
        if (valuelocationType != null) {
            locationType = valuelocationType;
        } else {
            locationType = null;
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
        return imp.createRetailerLocationConsumerHttp(request, version, appKey, name, deviceId, accountId, streetAddress, streetAddress2, city, state, postalCode, country, businessPhone, businessPhoneExt, website, email, detailsHeader, detailsBody, hours, tags, logoAssetId, picture1AssetId, picture2AssetId, categoryIds, filterIds, metaData, publicLocation, active, locationType, latitude, longitude);
    }

    @ApiAction
    public Result createRetailerLocations(Http.Request request, BigDecimal version) throws Exception {
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
        String valueretailerId = request.getQueryString("retailerId");
        Long retailerId;
        if (valueretailerId != null) {
            retailerId = Long.parseLong(valueretailerId);
        } else {
            throw new IllegalArgumentException("'retailerId' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("'name' parameter is required");
        }
        String valuestreetAddress = request.getQueryString("streetAddress");
        String streetAddress;
        if (valuestreetAddress != null) {
            streetAddress = valuestreetAddress;
        } else {
            throw new IllegalArgumentException("'streetAddress' parameter is required");
        }
        String valuestreetAddress2 = request.getQueryString("streetAddress2");
        String streetAddress2;
        if (valuestreetAddress2 != null) {
            streetAddress2 = valuestreetAddress2;
        } else {
            streetAddress2 = null;
        }
        String valuecity = request.getQueryString("city");
        String city;
        if (valuecity != null) {
            city = valuecity;
        } else {
            throw new IllegalArgumentException("'city' parameter is required");
        }
        String valuestate = request.getQueryString("state");
        String state;
        if (valuestate != null) {
            state = valuestate;
        } else {
            throw new IllegalArgumentException("'state' parameter is required");
        }
        String valuepostalCode = request.getQueryString("postalCode");
        String postalCode;
        if (valuepostalCode != null) {
            postalCode = valuepostalCode;
        } else {
            throw new IllegalArgumentException("'postalCode' parameter is required");
        }
        String valuecountry = request.getQueryString("country");
        String country;
        if (valuecountry != null) {
            country = valuecountry;
        } else {
            country = null;
        }
        String valuebusinessPhone = request.getQueryString("businessPhone");
        String businessPhone;
        if (valuebusinessPhone != null) {
            businessPhone = valuebusinessPhone;
        } else {
            businessPhone = null;
        }
        String valuebusinessPhoneExt = request.getQueryString("businessPhoneExt");
        String businessPhoneExt;
        if (valuebusinessPhoneExt != null) {
            businessPhoneExt = valuebusinessPhoneExt;
        } else {
            businessPhoneExt = null;
        }
        String valuewebsite = request.getQueryString("website");
        String website;
        if (valuewebsite != null) {
            website = valuewebsite;
        } else {
            website = null;
        }
        String valueemail = request.getQueryString("email");
        String email;
        if (valueemail != null) {
            email = valueemail;
        } else {
            email = null;
        }
        String valueinternalId = request.getQueryString("internalId");
        String internalId;
        if (valueinternalId != null) {
            internalId = valueinternalId;
        } else {
            internalId = null;
        }
        String valuedetailsHeader = request.getQueryString("detailsHeader");
        String detailsHeader;
        if (valuedetailsHeader != null) {
            detailsHeader = valuedetailsHeader;
        } else {
            detailsHeader = null;
        }
        String valuedetailsBody = request.getQueryString("detailsBody");
        String detailsBody;
        if (valuedetailsBody != null) {
            detailsBody = valuedetailsBody;
        } else {
            detailsBody = null;
        }
        String valuehours = request.getQueryString("hours");
        String hours;
        if (valuehours != null) {
            hours = valuehours;
        } else {
            hours = null;
        }
        String valuelogo = request.getQueryString("logo");
        InputStream logo;
        if (valuelogo != null) {
            logo = valuelogo;
        } else {
            logo = null;
        }
        String valuelogoAssetId = request.getQueryString("logoAssetId");
        Long logoAssetId;
        if (valuelogoAssetId != null) {
            logoAssetId = Long.parseLong(valuelogoAssetId);
        } else {
            logoAssetId = null;
        }
        String valuepicture1 = request.getQueryString("picture1");
        InputStream picture1;
        if (valuepicture1 != null) {
            picture1 = valuepicture1;
        } else {
            picture1 = null;
        }
        String valuepicture1AssetId = request.getQueryString("picture1AssetId");
        Long picture1AssetId;
        if (valuepicture1AssetId != null) {
            picture1AssetId = Long.parseLong(valuepicture1AssetId);
        } else {
            picture1AssetId = null;
        }
        String valuepicture2 = request.getQueryString("picture2");
        InputStream picture2;
        if (valuepicture2 != null) {
            picture2 = valuepicture2;
        } else {
            picture2 = null;
        }
        String valuepicture2AssetId = request.getQueryString("picture2AssetId");
        Long picture2AssetId;
        if (valuepicture2AssetId != null) {
            picture2AssetId = Long.parseLong(valuepicture2AssetId);
        } else {
            picture2AssetId = null;
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
        String valuebuilding = request.getQueryString("building");
        String building;
        if (valuebuilding != null) {
            building = valuebuilding;
        } else {
            building = null;
        }
        String valuegooglePlaceId = request.getQueryString("googlePlaceId");
        String googlePlaceId;
        if (valuegooglePlaceId != null) {
            googlePlaceId = valuegooglePlaceId;
        } else {
            googlePlaceId = null;
        }
        String valueyelpId = request.getQueryString("yelpId");
        String yelpId;
        if (valueyelpId != null) {
            yelpId = valueyelpId;
        } else {
            yelpId = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valuepublicLocation = request.getQueryString("publicLocation");
        Boolean publicLocation;
        if (valuepublicLocation != null) {
            publicLocation = Boolean.valueOf(valuepublicLocation);
        } else {
            publicLocation = null;
        }
        String valuelocationType = request.getQueryString("locationType");
        String locationType;
        if (valuelocationType != null) {
            locationType = valuelocationType;
        } else {
            locationType = null;
        }
        String valueaudienceIds = request.getQueryString("audienceIds");
        String audienceIds;
        if (valueaudienceIds != null) {
            audienceIds = valueaudienceIds;
        } else {
            audienceIds = null;
        }
        String valueaudienceIdsToAdd = request.getQueryString("audienceIdsToAdd");
        String audienceIdsToAdd;
        if (valueaudienceIdsToAdd != null) {
            audienceIdsToAdd = valueaudienceIdsToAdd;
        } else {
            audienceIdsToAdd = null;
        }
        String valueaudienceIdsToRemove = request.getQueryString("audienceIdsToRemove");
        String audienceIdsToRemove;
        if (valueaudienceIdsToRemove != null) {
            audienceIdsToRemove = valueaudienceIdsToRemove;
        } else {
            audienceIdsToRemove = null;
        }
        String valueresponseFormat = request.getQueryString("responseFormat");
        String responseFormat;
        if (valueresponseFormat != null) {
            responseFormat = valueresponseFormat;
        } else {
            responseFormat = null;
        }
        String valueresponseIncludes = request.getQueryString("responseIncludes");
        String responseIncludes;
        if (valueresponseIncludes != null) {
            responseIncludes = valueresponseIncludes;
        } else {
            responseIncludes = null;
        }
        return imp.createRetailerLocationsHttp(request, version, retailerId, name, streetAddress, city, state, postalCode, deviceId, accountId, streetAddress2, country, businessPhone, businessPhoneExt, website, email, internalId, detailsHeader, detailsBody, hours, logo, logoAssetId, picture1, picture1AssetId, picture2, picture2AssetId, categoryIds, filterIds, latitude, longitude, building, googlePlaceId, yelpId, active, publicLocation, locationType, audienceIds, audienceIdsToAdd, audienceIdsToRemove, responseFormat, responseIncludes);
    }

    @ApiAction
    public Result deleteRetailerLocation(Http.Request request, BigDecimal version) throws Exception {
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
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            retailerLocationId = null;
        }
        return imp.deleteRetailerLocationHttp(request, version, deviceId, accountId, retailerLocationId);
    }

    @ApiAction
    public Result getRetailerLocation(Http.Request request, BigDecimal version) throws Exception {
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
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            throw new IllegalArgumentException("'retailerLocationId' parameter is required");
        }
        String valueretailerLocationToken = request.getQueryString("retailerLocationToken");
        String retailerLocationToken;
        if (valueretailerLocationToken != null) {
            retailerLocationToken = valueretailerLocationToken;
        } else {
            retailerLocationToken = null;
        }
        return imp.getRetailerLocationHttp(request, version, retailerLocationId, deviceId, accountId, retailerLocationToken);
    }

    @ApiAction
    public Result getRetailerLocationConsumer(Http.Request request, BigDecimal version) throws Exception {
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
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            throw new IllegalArgumentException("'retailerLocationId' parameter is required");
        }
        return imp.getRetailerLocationConsumerHttp(request, version, retailerLocationId, deviceId, accountId);
    }

    @ApiAction
    public Result indexedRetailerLocationDistanceSearch(Http.Request request, BigDecimal version) throws Exception {
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
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueaddress = request.getQueryString("address");
        String address;
        if (valueaddress != null) {
            address = valueaddress;
        } else {
            address = null;
        }
        String valuesearchRange = request.getQueryString("searchRange");
        Double searchRange;
        if (valuesearchRange != null) {
            searchRange = Double.parseDouble(valuesearchRange);
        } else {
            throw new IllegalArgumentException("'searchRange' parameter is required");
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
        String valuehasOffers = request.getQueryString("hasOffers");
        Boolean hasOffers;
        if (valuehasOffers != null) {
            hasOffers = Boolean.valueOf(valuehasOffers);
        } else {
            hasOffers = null;
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
        String valueaudiences = request.getQueryString("audiences");
        String audiences;
        if (valueaudiences != null) {
            audiences = valueaudiences;
        } else {
            audiences = null;
        }
        String valueretailerIds = request.getQueryString("retailerIds");
        String retailerIds;
        if (valueretailerIds != null) {
            retailerIds = valueretailerIds;
        } else {
            retailerIds = null;
        }
        String valueretailerLocationIds = request.getQueryString("retailerLocationIds");
        String retailerLocationIds;
        if (valueretailerLocationIds != null) {
            retailerLocationIds = valueretailerLocationIds;
        } else {
            retailerLocationIds = null;
        }
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        String valuelocationType = request.getQueryString("locationType");
        String locationType;
        if (valuelocationType != null) {
            locationType = valuelocationType;
        } else {
            locationType = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = null;
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = null;
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
        String valuekeywordOperator = request.getQueryString("keywordOperator");
        String keywordOperator;
        if (valuekeywordOperator != null) {
            keywordOperator = valuekeywordOperator;
        } else {
            keywordOperator = null;
        }
        String valuesearchExpression = request.getQueryString("searchExpression");
        String searchExpression;
        if (valuesearchExpression != null) {
            searchExpression = valuesearchExpression;
        } else {
            searchExpression = null;
        }
        String valuedistanceUnit = request.getQueryString("distanceUnit");
        String distanceUnit;
        if (valuedistanceUnit != null) {
            distanceUnit = valuedistanceUnit;
        } else {
            distanceUnit = null;
        }
        String valuereturnFavorited = request.getQueryString("returnFavorited");
        Boolean returnFavorited;
        if (valuereturnFavorited != null) {
            returnFavorited = Boolean.valueOf(valuereturnFavorited);
        } else {
            returnFavorited = null;
        }
        String valuereturnRetailer = request.getQueryString("returnRetailer");
        Boolean returnRetailer;
        if (valuereturnRetailer != null) {
            returnRetailer = Boolean.valueOf(valuereturnRetailer);
        } else {
            returnRetailer = null;
        }
        String valuereturnAssets = request.getQueryString("returnAssets");
        Boolean returnAssets;
        if (valuereturnAssets != null) {
            returnAssets = Boolean.valueOf(valuereturnAssets);
        } else {
            returnAssets = null;
        }
        String valuereturnOffers = request.getQueryString("returnOffers");
        Boolean returnOffers;
        if (valuereturnOffers != null) {
            returnOffers = Boolean.valueOf(valuereturnOffers);
        } else {
            returnOffers = null;
        }
        String valuereturnCategories = request.getQueryString("returnCategories");
        Boolean returnCategories;
        if (valuereturnCategories != null) {
            returnCategories = Boolean.valueOf(valuereturnCategories);
        } else {
            returnCategories = null;
        }
        String valuereturnFilters = request.getQueryString("returnFilters");
        Boolean returnFilters;
        if (valuereturnFilters != null) {
            returnFilters = Boolean.valueOf(valuereturnFilters);
        } else {
            returnFilters = null;
        }
        String valuereturnAudiences = request.getQueryString("returnAudiences");
        Boolean returnAudiences;
        if (valuereturnAudiences != null) {
            returnAudiences = Boolean.valueOf(valuereturnAudiences);
        } else {
            returnAudiences = null;
        }
        String valuereturnQrCode = request.getQueryString("returnQrCode");
        Boolean returnQrCode;
        if (valuereturnQrCode != null) {
            returnQrCode = Boolean.valueOf(valuereturnQrCode);
        } else {
            returnQrCode = null;
        }
        String valuereturnExternalCategoryData = request.getQueryString("returnExternalCategoryData");
        Boolean returnExternalCategoryData;
        if (valuereturnExternalCategoryData != null) {
            returnExternalCategoryData = Boolean.valueOf(valuereturnExternalCategoryData);
        } else {
            returnExternalCategoryData = null;
        }
        String valueincludeFavorite = request.getQueryString("includeFavorite");
        Boolean includeFavorite;
        if (valueincludeFavorite != null) {
            includeFavorite = Boolean.valueOf(valueincludeFavorite);
        } else {
            includeFavorite = null;
        }
        String valueincludeLiked = request.getQueryString("includeLiked");
        Boolean includeLiked;
        if (valueincludeLiked != null) {
            includeLiked = Boolean.valueOf(valueincludeLiked);
        } else {
            includeLiked = null;
        }
        String valueincludeRating = request.getQueryString("includeRating");
        Boolean includeRating;
        if (valueincludeRating != null) {
            includeRating = Boolean.valueOf(valueincludeRating);
        } else {
            includeRating = null;
        }
        return imp.indexedRetailerLocationDistanceSearchHttp(request, version, latitude, longitude, searchRange, start, limit, accountId, address, hasOffers, categories, filters, audiences, retailerIds, retailerLocationIds, tags, locationType, sortField, descending, q, keyword, keywordOperator, searchExpression, distanceUnit, returnFavorited, returnRetailer, returnAssets, returnOffers, returnCategories, returnFilters, returnAudiences, returnQrCode, returnExternalCategoryData, includeFavorite, includeLiked, includeRating);
    }

    @ApiAction
    public Result indexedRetailerLocationSearch(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
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
        String valuehasOffers = request.getQueryString("hasOffers");
        Boolean hasOffers;
        if (valuehasOffers != null) {
            hasOffers = Boolean.valueOf(valuehasOffers);
        } else {
            hasOffers = null;
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
        String valueaudiences = request.getQueryString("audiences");
        String audiences;
        if (valueaudiences != null) {
            audiences = valueaudiences;
        } else {
            audiences = null;
        }
        String valueretailerIds = request.getQueryString("retailerIds");
        String retailerIds;
        if (valueretailerIds != null) {
            retailerIds = valueretailerIds;
        } else {
            retailerIds = null;
        }
        String valueretailerLocationIds = request.getQueryString("retailerLocationIds");
        String retailerLocationIds;
        if (valueretailerLocationIds != null) {
            retailerLocationIds = valueretailerLocationIds;
        } else {
            retailerLocationIds = null;
        }
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        String valuelocationType = request.getQueryString("locationType");
        String locationType;
        if (valuelocationType != null) {
            locationType = valuelocationType;
        } else {
            locationType = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = null;
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = null;
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
        String valuekeywordOperator = request.getQueryString("keywordOperator");
        String keywordOperator;
        if (valuekeywordOperator != null) {
            keywordOperator = valuekeywordOperator;
        } else {
            keywordOperator = null;
        }
        String valuesearchExpression = request.getQueryString("searchExpression");
        String searchExpression;
        if (valuesearchExpression != null) {
            searchExpression = valuesearchExpression;
        } else {
            searchExpression = null;
        }
        String valuereturnRetailer = request.getQueryString("returnRetailer");
        Boolean returnRetailer;
        if (valuereturnRetailer != null) {
            returnRetailer = Boolean.valueOf(valuereturnRetailer);
        } else {
            returnRetailer = null;
        }
        String valuereturnAssets = request.getQueryString("returnAssets");
        Boolean returnAssets;
        if (valuereturnAssets != null) {
            returnAssets = Boolean.valueOf(valuereturnAssets);
        } else {
            returnAssets = null;
        }
        String valuereturnOffers = request.getQueryString("returnOffers");
        Boolean returnOffers;
        if (valuereturnOffers != null) {
            returnOffers = Boolean.valueOf(valuereturnOffers);
        } else {
            returnOffers = null;
        }
        String valuereturnCategories = request.getQueryString("returnCategories");
        Boolean returnCategories;
        if (valuereturnCategories != null) {
            returnCategories = Boolean.valueOf(valuereturnCategories);
        } else {
            returnCategories = null;
        }
        String valuereturnFilters = request.getQueryString("returnFilters");
        Boolean returnFilters;
        if (valuereturnFilters != null) {
            returnFilters = Boolean.valueOf(valuereturnFilters);
        } else {
            returnFilters = null;
        }
        String valuereturnAudiences = request.getQueryString("returnAudiences");
        Boolean returnAudiences;
        if (valuereturnAudiences != null) {
            returnAudiences = Boolean.valueOf(valuereturnAudiences);
        } else {
            returnAudiences = null;
        }
        String valuereturnQrCode = request.getQueryString("returnQrCode");
        Boolean returnQrCode;
        if (valuereturnQrCode != null) {
            returnQrCode = Boolean.valueOf(valuereturnQrCode);
        } else {
            returnQrCode = null;
        }
        String valuereturnExternalCategoryData = request.getQueryString("returnExternalCategoryData");
        Boolean returnExternalCategoryData;
        if (valuereturnExternalCategoryData != null) {
            returnExternalCategoryData = Boolean.valueOf(valuereturnExternalCategoryData);
        } else {
            returnExternalCategoryData = null;
        }
        String valueincludeFavorite = request.getQueryString("includeFavorite");
        Boolean includeFavorite;
        if (valueincludeFavorite != null) {
            includeFavorite = Boolean.valueOf(valueincludeFavorite);
        } else {
            includeFavorite = null;
        }
        String valueincludeLiked = request.getQueryString("includeLiked");
        Boolean includeLiked;
        if (valueincludeLiked != null) {
            includeLiked = Boolean.valueOf(valueincludeLiked);
        } else {
            includeLiked = null;
        }
        String valueincludeRating = request.getQueryString("includeRating");
        Boolean includeRating;
        if (valueincludeRating != null) {
            includeRating = Boolean.valueOf(valueincludeRating);
        } else {
            includeRating = null;
        }
        return imp.indexedRetailerLocationSearchHttp(request, version, accountId, start, limit, hasOffers, categories, filters, audiences, retailerIds, retailerLocationIds, tags, locationType, sortField, descending, q, keyword, keywordOperator, searchExpression, returnRetailer, returnAssets, returnOffers, returnCategories, returnFilters, returnAudiences, returnQrCode, returnExternalCategoryData, includeFavorite, includeLiked, includeRating);
    }

    @ApiAction
    public Result searchRetailerLocations(Http.Request request, BigDecimal version) throws Exception {
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
        String valueretailerIds = request.getQueryString("retailerIds");
        String retailerIds;
        if (valueretailerIds != null) {
            retailerIds = valueretailerIds;
        } else {
            retailerIds = null;
        }
        String valueretailerLocationIds = request.getQueryString("retailerLocationIds");
        String retailerLocationIds;
        if (valueretailerLocationIds != null) {
            retailerLocationIds = valueretailerLocationIds;
        } else {
            retailerLocationIds = null;
        }
        String valuelocationType = request.getQueryString("locationType");
        String locationType;
        if (valuelocationType != null) {
            locationType = valuelocationType;
        } else {
            locationType = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = null;
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = null;
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
            start = null;
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
            limit = null;
        }
        String valueshowPublicLocations = request.getQueryString("showPublicLocations");
        Boolean showPublicLocations;
        if (valueshowPublicLocations != null) {
            showPublicLocations = Boolean.valueOf(valueshowPublicLocations);
        } else {
            showPublicLocations = null;
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            activeOnly = null;
        }
        String valuereturnRetailer = request.getQueryString("returnRetailer");
        Boolean returnRetailer;
        if (valuereturnRetailer != null) {
            returnRetailer = Boolean.valueOf(valuereturnRetailer);
        } else {
            returnRetailer = null;
        }
        String valuereturnAssets = request.getQueryString("returnAssets");
        Boolean returnAssets;
        if (valuereturnAssets != null) {
            returnAssets = Boolean.valueOf(valuereturnAssets);
        } else {
            returnAssets = null;
        }
        String valuereturnOffers = request.getQueryString("returnOffers");
        Boolean returnOffers;
        if (valuereturnOffers != null) {
            returnOffers = Boolean.valueOf(valuereturnOffers);
        } else {
            returnOffers = null;
        }
        String valuereturnCategories = request.getQueryString("returnCategories");
        Boolean returnCategories;
        if (valuereturnCategories != null) {
            returnCategories = Boolean.valueOf(valuereturnCategories);
        } else {
            returnCategories = null;
        }
        String valuereturnFilters = request.getQueryString("returnFilters");
        Boolean returnFilters;
        if (valuereturnFilters != null) {
            returnFilters = Boolean.valueOf(valuereturnFilters);
        } else {
            returnFilters = null;
        }
        String valuereturnAudiences = request.getQueryString("returnAudiences");
        Boolean returnAudiences;
        if (valuereturnAudiences != null) {
            returnAudiences = Boolean.valueOf(valuereturnAudiences);
        } else {
            returnAudiences = null;
        }
        String valuereturnQrCode = request.getQueryString("returnQrCode");
        Boolean returnQrCode;
        if (valuereturnQrCode != null) {
            returnQrCode = Boolean.valueOf(valuereturnQrCode);
        } else {
            returnQrCode = null;
        }
        String valueincludeFavorite = request.getQueryString("includeFavorite");
        Boolean includeFavorite;
        if (valueincludeFavorite != null) {
            includeFavorite = Boolean.valueOf(valueincludeFavorite);
        } else {
            includeFavorite = null;
        }
        String valueincludeLiked = request.getQueryString("includeLiked");
        Boolean includeLiked;
        if (valueincludeLiked != null) {
            includeLiked = Boolean.valueOf(valueincludeLiked);
        } else {
            includeLiked = null;
        }
        String valueincludeRating = request.getQueryString("includeRating");
        Boolean includeRating;
        if (valueincludeRating != null) {
            includeRating = Boolean.valueOf(valueincludeRating);
        } else {
            includeRating = null;
        }
        return imp.searchRetailerLocationsHttp(request, version, deviceId, accountId, q, keyword, retailerIds, retailerLocationIds, locationType, sortField, descending, i, start, l, limit, showPublicLocations, activeOnly, returnRetailer, returnAssets, returnOffers, returnCategories, returnFilters, returnAudiences, returnQrCode, includeFavorite, includeLiked, includeRating);
    }

    @ApiAction
    public Result updateRetailerLocations(Http.Request request, BigDecimal version) throws Exception {
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
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            throw new IllegalArgumentException("'retailerLocationId' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valuestreetAddress = request.getQueryString("streetAddress");
        String streetAddress;
        if (valuestreetAddress != null) {
            streetAddress = valuestreetAddress;
        } else {
            streetAddress = null;
        }
        String valuestreetAddress2 = request.getQueryString("streetAddress2");
        String streetAddress2;
        if (valuestreetAddress2 != null) {
            streetAddress2 = valuestreetAddress2;
        } else {
            streetAddress2 = null;
        }
        String valuecity = request.getQueryString("city");
        String city;
        if (valuecity != null) {
            city = valuecity;
        } else {
            city = null;
        }
        String valuestate = request.getQueryString("state");
        String state;
        if (valuestate != null) {
            state = valuestate;
        } else {
            state = null;
        }
        String valuepostalCode = request.getQueryString("postalCode");
        String postalCode;
        if (valuepostalCode != null) {
            postalCode = valuepostalCode;
        } else {
            postalCode = null;
        }
        String valuecountry = request.getQueryString("country");
        String country;
        if (valuecountry != null) {
            country = valuecountry;
        } else {
            country = null;
        }
        String valuebusinessPhone = request.getQueryString("businessPhone");
        String businessPhone;
        if (valuebusinessPhone != null) {
            businessPhone = valuebusinessPhone;
        } else {
            businessPhone = null;
        }
        String valuebusinessPhoneExt = request.getQueryString("businessPhoneExt");
        String businessPhoneExt;
        if (valuebusinessPhoneExt != null) {
            businessPhoneExt = valuebusinessPhoneExt;
        } else {
            businessPhoneExt = null;
        }
        String valuewebsite = request.getQueryString("website");
        String website;
        if (valuewebsite != null) {
            website = valuewebsite;
        } else {
            website = null;
        }
        String valueemail = request.getQueryString("email");
        String email;
        if (valueemail != null) {
            email = valueemail;
        } else {
            email = null;
        }
        String valueinternalId = request.getQueryString("internalId");
        String internalId;
        if (valueinternalId != null) {
            internalId = valueinternalId;
        } else {
            internalId = null;
        }
        String valuedetailsHeader = request.getQueryString("detailsHeader");
        String detailsHeader;
        if (valuedetailsHeader != null) {
            detailsHeader = valuedetailsHeader;
        } else {
            detailsHeader = null;
        }
        String valuedetailsBody = request.getQueryString("detailsBody");
        String detailsBody;
        if (valuedetailsBody != null) {
            detailsBody = valuedetailsBody;
        } else {
            detailsBody = null;
        }
        String valuehours = request.getQueryString("hours");
        String hours;
        if (valuehours != null) {
            hours = valuehours;
        } else {
            hours = null;
        }
        String valuelogo = request.getQueryString("logo");
        InputStream logo;
        if (valuelogo != null) {
            logo = valuelogo;
        } else {
            logo = null;
        }
        String valuelogoAssetId = request.getQueryString("logoAssetId");
        Long logoAssetId;
        if (valuelogoAssetId != null) {
            logoAssetId = Long.parseLong(valuelogoAssetId);
        } else {
            logoAssetId = null;
        }
        String valuepicture1 = request.getQueryString("picture1");
        InputStream picture1;
        if (valuepicture1 != null) {
            picture1 = valuepicture1;
        } else {
            picture1 = null;
        }
        String valuepicture1AssetId = request.getQueryString("picture1AssetId");
        Long picture1AssetId;
        if (valuepicture1AssetId != null) {
            picture1AssetId = Long.parseLong(valuepicture1AssetId);
        } else {
            picture1AssetId = null;
        }
        String valuepicture2 = request.getQueryString("picture2");
        InputStream picture2;
        if (valuepicture2 != null) {
            picture2 = valuepicture2;
        } else {
            picture2 = null;
        }
        String valuepicture2AssetId = request.getQueryString("picture2AssetId");
        Long picture2AssetId;
        if (valuepicture2AssetId != null) {
            picture2AssetId = Long.parseLong(valuepicture2AssetId);
        } else {
            picture2AssetId = null;
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
        String valuebuilding = request.getQueryString("building");
        String building;
        if (valuebuilding != null) {
            building = valuebuilding;
        } else {
            building = null;
        }
        String valuegooglePlaceId = request.getQueryString("googlePlaceId");
        String googlePlaceId;
        if (valuegooglePlaceId != null) {
            googlePlaceId = valuegooglePlaceId;
        } else {
            googlePlaceId = null;
        }
        String valueyelpId = request.getQueryString("yelpId");
        String yelpId;
        if (valueyelpId != null) {
            yelpId = valueyelpId;
        } else {
            yelpId = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valuepaymentProvider = request.getQueryString("paymentProvider");
        String paymentProvider;
        if (valuepaymentProvider != null) {
            paymentProvider = valuepaymentProvider;
        } else {
            paymentProvider = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valuepublicLocation = request.getQueryString("publicLocation");
        Boolean publicLocation;
        if (valuepublicLocation != null) {
            publicLocation = Boolean.valueOf(valuepublicLocation);
        } else {
            publicLocation = null;
        }
        String valuelocationType = request.getQueryString("locationType");
        String locationType;
        if (valuelocationType != null) {
            locationType = valuelocationType;
        } else {
            locationType = null;
        }
        String valueaudienceIds = request.getQueryString("audienceIds");
        String audienceIds;
        if (valueaudienceIds != null) {
            audienceIds = valueaudienceIds;
        } else {
            audienceIds = null;
        }
        String valueaudienceIdsToAdd = request.getQueryString("audienceIdsToAdd");
        String audienceIdsToAdd;
        if (valueaudienceIdsToAdd != null) {
            audienceIdsToAdd = valueaudienceIdsToAdd;
        } else {
            audienceIdsToAdd = null;
        }
        String valueaudienceIdsToRemove = request.getQueryString("audienceIdsToRemove");
        String audienceIdsToRemove;
        if (valueaudienceIdsToRemove != null) {
            audienceIdsToRemove = valueaudienceIdsToRemove;
        } else {
            audienceIdsToRemove = null;
        }
        String valueresponseFormat = request.getQueryString("responseFormat");
        String responseFormat;
        if (valueresponseFormat != null) {
            responseFormat = valueresponseFormat;
        } else {
            responseFormat = null;
        }
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        return imp.updateRetailerLocationsHttp(request, version, retailerLocationId, deviceId, accountId, name, streetAddress, streetAddress2, city, state, postalCode, country, businessPhone, businessPhoneExt, website, email, internalId, detailsHeader, detailsBody, hours, logo, logoAssetId, picture1, picture1AssetId, picture2, picture2AssetId, categoryIds, filterIds, latitude, longitude, building, googlePlaceId, yelpId, metaData, paymentProvider, active, publicLocation, locationType, audienceIds, audienceIdsToAdd, audienceIdsToRemove, responseFormat, tags);
    }

}
