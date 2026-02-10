package controllers;

import java.math.BigDecimal;
import apimodels.ListingFullResponse;
import apimodels.ListingGroupResponse;
import apimodels.ListingResponse;
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
public class ListingApiController extends Controller {
    private final ListingApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ListingApiController(Config configuration, ListingApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createListing(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("'name' parameter is required");
        }
        String valuefilterIds = request.getQueryString("filterIds");
        String filterIds;
        if (valuefilterIds != null) {
            filterIds = valuefilterIds;
        } else {
            filterIds = null;
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuestart = request.getQueryString("start");
        Long start;
        if (valuestart != null) {
            start = Long.parseLong(valuestart);
        } else {
            start = null;
        }
        String valueend = request.getQueryString("end");
        Long end;
        if (valueend != null) {
            end = Long.parseLong(valueend);
        } else {
            end = null;
        }
        String valuelocationName = request.getQueryString("locationName");
        String locationName;
        if (valuelocationName != null) {
            locationName = valuelocationName;
        } else {
            locationName = null;
        }
        String valuelocationDescription = request.getQueryString("locationDescription");
        String locationDescription;
        if (valuelocationDescription != null) {
            locationDescription = valuelocationDescription;
        } else {
            locationDescription = null;
        }
        String valueisPrivate = request.getQueryString("isPrivate");
        Boolean isPrivate;
        if (valueisPrivate != null) {
            isPrivate = Boolean.valueOf(valueisPrivate);
        } else {
            isPrivate = false;
        }
        String valueexternalId = request.getQueryString("externalId");
        String externalId;
        if (valueexternalId != null) {
            externalId = valueexternalId;
        } else {
            externalId = null;
        }
        String valueexternalId2 = request.getQueryString("externalId2");
        String externalId2;
        if (valueexternalId2 != null) {
            externalId2 = valueexternalId2;
        } else {
            externalId2 = null;
        }
        String valueexternalGroupId = request.getQueryString("externalGroupId");
        String externalGroupId;
        if (valueexternalGroupId != null) {
            externalGroupId = valueexternalGroupId;
        } else {
            externalGroupId = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        return imp.createListingHttp(request, version, accountId, name, filterIds, description, start, end, locationName, locationDescription, isPrivate, externalId, externalId2, externalGroupId, active, metaData);
    }

    @ApiAction
    public Result deleteListing(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuelistingId = request.getQueryString("listingId");
        Long listingId;
        if (valuelistingId != null) {
            listingId = Long.parseLong(valuelistingId);
        } else {
            throw new IllegalArgumentException("'listingId' parameter is required");
        }
        return imp.deleteListingHttp(request, version, accountId, listingId);
    }

    @ApiAction
    public Result getListing(Http.Request request, BigDecimal version) throws Exception {
        String valuelistingId = request.getQueryString("listingId");
        Long listingId;
        if (valuelistingId != null) {
            listingId = Long.parseLong(valuelistingId);
        } else {
            throw new IllegalArgumentException("'listingId' parameter is required");
        }
        return imp.getListingHttp(request, version, listingId);
    }

    @ApiAction
    public Result searchListing(Http.Request request, BigDecimal version) throws Exception {
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
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            activeOnly = false;
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
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            startDate = null;
        }
        String valueendDate = request.getQueryString("endDate");
        Long endDate;
        if (valueendDate != null) {
            endDate = Long.parseLong(valueendDate);
        } else {
            endDate = null;
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
        String valueuseListingOrderIds = request.getQueryString("useListingOrderIds");
        Boolean useListingOrderIds;
        if (valueuseListingOrderIds != null) {
            useListingOrderIds = Boolean.valueOf(valueuseListingOrderIds);
        } else {
            useListingOrderIds = true;
        }
        String valueexternalId = request.getQueryString("externalId");
        String externalId;
        if (valueexternalId != null) {
            externalId = valueexternalId;
        } else {
            externalId = null;
        }
        String valueexternalId2 = request.getQueryString("externalId2");
        String externalId2;
        if (valueexternalId2 != null) {
            externalId2 = valueexternalId2;
        } else {
            externalId2 = null;
        }
        String valueexternalGroupId = request.getQueryString("externalGroupId");
        String externalGroupId;
        if (valueexternalGroupId != null) {
            externalGroupId = valueexternalGroupId;
        } else {
            externalGroupId = null;
        }
        return imp.searchListingHttp(request, version, accountId, keyword, start, limit, activeOnly, latitude, longitude, startDate, endDate, categoryIds, filterIds, useListingOrderIds, externalId, externalId2, externalGroupId);
    }

    @ApiAction
    public Result summaryListing(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            startDate = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valuedaysToInclude = request.getQueryString("daysToInclude");
        Integer daysToInclude;
        if (valuedaysToInclude != null) {
            daysToInclude = Integer.parseInt(valuedaysToInclude);
        } else {
            daysToInclude = 15;
        }
        String valueuseListingOrderIds = request.getQueryString("useListingOrderIds");
        Boolean useListingOrderIds;
        if (valueuseListingOrderIds != null) {
            useListingOrderIds = Boolean.valueOf(valueuseListingOrderIds);
        } else {
            useListingOrderIds = true;
        }
        return imp.summaryListingHttp(request, version, accountId, startDate, categoryIds, daysToInclude, useListingOrderIds);
    }

    @ApiAction
    public Result updateListing(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuelistingId = request.getQueryString("listingId");
        Long listingId;
        if (valuelistingId != null) {
            listingId = Long.parseLong(valuelistingId);
        } else {
            throw new IllegalArgumentException("'listingId' parameter is required");
        }
        String valuefilterIds = request.getQueryString("filterIds");
        String filterIds;
        if (valuefilterIds != null) {
            filterIds = valuefilterIds;
        } else {
            filterIds = null;
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuestart = request.getQueryString("start");
        Long start;
        if (valuestart != null) {
            start = Long.parseLong(valuestart);
        } else {
            start = null;
        }
        String valueend = request.getQueryString("end");
        Long end;
        if (valueend != null) {
            end = Long.parseLong(valueend);
        } else {
            end = null;
        }
        String valuelocationName = request.getQueryString("locationName");
        String locationName;
        if (valuelocationName != null) {
            locationName = valuelocationName;
        } else {
            locationName = null;
        }
        String valuelocationDescription = request.getQueryString("locationDescription");
        String locationDescription;
        if (valuelocationDescription != null) {
            locationDescription = valuelocationDescription;
        } else {
            locationDescription = null;
        }
        String valueisPrivate = request.getQueryString("isPrivate");
        Boolean isPrivate;
        if (valueisPrivate != null) {
            isPrivate = Boolean.valueOf(valueisPrivate);
        } else {
            isPrivate = null;
        }
        String valueexternalId = request.getQueryString("externalId");
        String externalId;
        if (valueexternalId != null) {
            externalId = valueexternalId;
        } else {
            externalId = null;
        }
        String valueexternalId2 = request.getQueryString("externalId2");
        String externalId2;
        if (valueexternalId2 != null) {
            externalId2 = valueexternalId2;
        } else {
            externalId2 = null;
        }
        String valueexternalGroupId = request.getQueryString("externalGroupId");
        String externalGroupId;
        if (valueexternalGroupId != null) {
            externalGroupId = valueexternalGroupId;
        } else {
            externalGroupId = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        return imp.updateListingHttp(request, version, accountId, listingId, filterIds, name, description, start, end, locationName, locationDescription, isPrivate, externalId, externalId2, externalGroupId, active, metaData);
    }

}
