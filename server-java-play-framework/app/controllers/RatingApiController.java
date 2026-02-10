package controllers;

import java.math.BigDecimal;
import apimodels.RatingIndexResponse;
import apimodels.RatingResponse;
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
public class RatingApiController extends Controller {
    private final RatingApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private RatingApiController(Config configuration, RatingApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createRating(Http.Request request, BigDecimal version) throws Exception {
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
        String valueratableType = request.getQueryString("ratableType");
        String ratableType;
        if (valueratableType != null) {
            ratableType = valueratableType;
        } else {
            throw new IllegalArgumentException("'ratableType' parameter is required");
        }
        String valueratableId = request.getQueryString("ratableId");
        Long ratableId;
        if (valueratableId != null) {
            ratableId = Long.parseLong(valueratableId);
        } else {
            throw new IllegalArgumentException("'ratableId' parameter is required");
        }
        String valueratingValue = request.getQueryString("ratingValue");
        Integer ratingValue;
        if (valueratingValue != null) {
            ratingValue = Integer.parseInt(valueratingValue);
        } else {
            throw new IllegalArgumentException("'ratingValue' parameter is required");
        }
        String valuecategoryId = request.getQueryString("categoryId");
        Long categoryId;
        if (valuecategoryId != null) {
            categoryId = Long.parseLong(valuecategoryId);
        } else {
            categoryId = null;
        }
        String valuedisplay = request.getQueryString("display");
        String display;
        if (valuedisplay != null) {
            display = valuedisplay;
        } else {
            display = null;
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuelocationDescription = request.getQueryString("locationDescription");
        String locationDescription;
        if (valuelocationDescription != null) {
            locationDescription = valuelocationDescription;
        } else {
            locationDescription = null;
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
        return imp.createRatingHttp(request, version, ratableType, ratableId, ratingValue, deviceId, accountId, categoryId, display, description, locationDescription, latitude, longitude);
    }

    @ApiAction
    public Result deleteRating(Http.Request request, BigDecimal version) throws Exception {
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
        String valueratingId = request.getQueryString("ratingId");
        Long ratingId;
        if (valueratingId != null) {
            ratingId = Long.parseLong(valueratingId);
        } else {
            throw new IllegalArgumentException("'ratingId' parameter is required");
        }
        return imp.deleteRatingHttp(request, version, ratingId, deviceId, accountId);
    }

    @ApiAction
    public Result searchLocationRatingIndexes(Http.Request request, BigDecimal version) throws Exception {
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
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
        String valuesearchRange = request.getQueryString("searchRange");
        Double searchRange;
        if (valuesearchRange != null) {
            searchRange = Double.parseDouble(valuesearchRange);
        } else {
            searchRange = null;
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
        String valuereturnOverallRating = request.getQueryString("returnOverallRating");
        Boolean returnOverallRating;
        if (valuereturnOverallRating != null) {
            returnOverallRating = Boolean.valueOf(valuereturnOverallRating);
        } else {
            returnOverallRating = null;
        }
        String valuedistanceUnit = request.getQueryString("distanceUnit");
        String distanceUnit;
        if (valuedistanceUnit != null) {
            distanceUnit = valuedistanceUnit;
        } else {
            distanceUnit = null;
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
        return imp.searchLocationRatingIndexesHttp(request, version, categoryIds, keyword, locationType, sortField, descending, start, limit, searchRange, latitude, longitude, returnOverallRating, distanceUnit, returnRetailer, returnAssets, returnOffers, returnCategories, returnFilters);
    }

    @ApiAction
    public Result searchRatingIndexes(Http.Request request, BigDecimal version) throws Exception {
        String valueratableType = request.getQueryString("ratableType");
        String ratableType;
        if (valueratableType != null) {
            ratableType = valueratableType;
        } else {
            throw new IllegalArgumentException("'ratableType' parameter is required");
        }
        String valueratableIds = request.getQueryString("ratableIds");
        String ratableIds;
        if (valueratableIds != null) {
            ratableIds = valueratableIds;
        } else {
            ratableIds = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valuesecondaryType = request.getQueryString("secondaryType");
        String secondaryType;
        if (valuesecondaryType != null) {
            secondaryType = valuesecondaryType;
        } else {
            secondaryType = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
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
        String valuereturnRatable = request.getQueryString("returnRatable");
        Boolean returnRatable;
        if (valuereturnRatable != null) {
            returnRatable = Boolean.valueOf(valuereturnRatable);
        } else {
            returnRatable = null;
        }
        String valuereturnOverallRating = request.getQueryString("returnOverallRating");
        Boolean returnOverallRating;
        if (valuereturnOverallRating != null) {
            returnOverallRating = Boolean.valueOf(valuereturnOverallRating);
        } else {
            returnOverallRating = null;
        }
        return imp.searchRatingIndexesHttp(request, version, ratableType, ratableIds, categoryIds, secondaryType, keyword, sortField, descending, start, limit, latitude, longitude, returnRatable, returnOverallRating);
    }

    @ApiAction
    public Result searchRatings(Http.Request request, BigDecimal version) throws Exception {
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
        String valuefilterAccountId = request.getQueryString("filterAccountId");
        Long filterAccountId;
        if (valuefilterAccountId != null) {
            filterAccountId = Long.parseLong(valuefilterAccountId);
        } else {
            filterAccountId = null;
        }
        String valueratableType = request.getQueryString("ratableType");
        String ratableType;
        if (valueratableType != null) {
            ratableType = valueratableType;
        } else {
            ratableType = null;
        }
        String valueratableId = request.getQueryString("ratableId");
        Long ratableId;
        if (valueratableId != null) {
            ratableId = Long.parseLong(valueratableId);
        } else {
            ratableId = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
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
        return imp.searchRatingsHttp(request, version, deviceId, accountId, filterAccountId, ratableType, ratableId, categoryIds, keyword, sortField, descending, start, limit);
    }

    @ApiAction
    public Result updateRating(Http.Request request, BigDecimal version) throws Exception {
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
        String valueratingId = request.getQueryString("ratingId");
        Long ratingId;
        if (valueratingId != null) {
            ratingId = Long.parseLong(valueratingId);
        } else {
            throw new IllegalArgumentException("'ratingId' parameter is required");
        }
        String valueratingValue = request.getQueryString("ratingValue");
        Integer ratingValue;
        if (valueratingValue != null) {
            ratingValue = Integer.parseInt(valueratingValue);
        } else {
            ratingValue = null;
        }
        String valuecategoryId = request.getQueryString("categoryId");
        Long categoryId;
        if (valuecategoryId != null) {
            categoryId = Long.parseLong(valuecategoryId);
        } else {
            categoryId = null;
        }
        String valuedisplay = request.getQueryString("display");
        String display;
        if (valuedisplay != null) {
            display = valuedisplay;
        } else {
            display = null;
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuelocationDescription = request.getQueryString("locationDescription");
        String locationDescription;
        if (valuelocationDescription != null) {
            locationDescription = valuelocationDescription;
        } else {
            locationDescription = null;
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
        return imp.updateRatingHttp(request, version, ratingId, deviceId, accountId, ratingValue, categoryId, display, description, locationDescription, latitude, longitude);
    }

}
