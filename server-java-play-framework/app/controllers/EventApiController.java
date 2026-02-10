package controllers;

import java.math.BigDecimal;
import apimodels.EventAttendanceResponse;
import apimodels.OfferResponse;
import apimodels.OfferShortResponse;
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
public class EventApiController extends Controller {
    private final EventApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private EventApiController(Config configuration, EventApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result attendEvent(Http.Request request, BigDecimal version) throws Exception {
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
            appKey = null;
        }
        String valuelistingId = request.getQueryString("listingId");
        Long listingId;
        if (valuelistingId != null) {
            listingId = Long.parseLong(valuelistingId);
        } else {
            listingId = null;
        }
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            retailerLocationId = null;
        }
        String valueofferLocationId = request.getQueryString("offerLocationId");
        Long offerLocationId;
        if (valueofferLocationId != null) {
            offerLocationId = Long.parseLong(valueofferLocationId);
        } else {
            offerLocationId = null;
        }
        String valuetransactionId = request.getQueryString("transactionId");
        Long transactionId;
        if (valuetransactionId != null) {
            transactionId = Long.parseLong(valuetransactionId);
        } else {
            transactionId = null;
        }
        String valuestatus = request.getQueryString("status");
        Integer status;
        if (valuestatus != null) {
            status = Integer.parseInt(valuestatus);
        } else {
            status = null;
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
        return imp.attendEventHttp(request, version, deviceId, accountId, appKey, listingId, retailerLocationId, offerLocationId, transactionId, status, latitude, longitude);
    }

    @ApiAction
    public Result createEvent(Http.Request request, BigDecimal version) throws Exception {
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
        String valueimageAssetId = request.getQueryString("imageAssetId");
        Long imageAssetId;
        if (valueimageAssetId != null) {
            imageAssetId = Long.parseLong(valueimageAssetId);
        } else {
            imageAssetId = null;
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
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        return imp.createEventHttp(request, version, accountId, title, retailerLocationIds, subTitle, details, categoryIds, filterIds, active, imageAssetId, redeemableStart, redeemableEnd, metaData);
    }

    @ApiAction
    public Result deleteEvent(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueeventId = request.getQueryString("eventId");
        Long eventId;
        if (valueeventId != null) {
            eventId = Long.parseLong(valueeventId);
        } else {
            throw new IllegalArgumentException("'eventId' parameter is required");
        }
        return imp.deleteEventHttp(request, version, accountId, eventId);
    }

    @ApiAction
    public Result getEvent(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueeventId = request.getQueryString("eventId");
        Long eventId;
        if (valueeventId != null) {
            eventId = Long.parseLong(valueeventId);
        } else {
            throw new IllegalArgumentException("'eventId' parameter is required");
        }
        return imp.getEventHttp(request, version, accountId, eventId);
    }

    @ApiAction
    public Result searchEventTransactions(Http.Request request, BigDecimal version) throws Exception {
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
            appKey = null;
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
        String valueexcludeRetailerLocationId = request.getQueryString("excludeRetailerLocationId");
        Long excludeRetailerLocationId;
        if (valueexcludeRetailerLocationId != null) {
            excludeRetailerLocationId = Long.parseLong(valueexcludeRetailerLocationId);
        } else {
            excludeRetailerLocationId = null;
        }
        String valuelistingId = request.getQueryString("listingId");
        Long listingId;
        if (valuelistingId != null) {
            listingId = Long.parseLong(valuelistingId);
        } else {
            listingId = null;
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
        String valuecustomerAccountIds = request.getQueryString("customerAccountIds");
        String customerAccountIds;
        if (valuecustomerAccountIds != null) {
            customerAccountIds = valuecustomerAccountIds;
        } else {
            customerAccountIds = null;
        }
        String valueaffiliatedCategoryIds = request.getQueryString("affiliatedCategoryIds");
        String affiliatedCategoryIds;
        if (valueaffiliatedCategoryIds != null) {
            affiliatedCategoryIds = valueaffiliatedCategoryIds;
        } else {
            affiliatedCategoryIds = null;
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
        String valuestatuses = request.getQueryString("statuses");
        String statuses;
        if (valuestatuses != null) {
            statuses = valuestatuses;
        } else {
            statuses = null;
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
        return imp.searchEventTransactionsHttp(request, version, deviceId, accountId, appKey, keyword, retailerId, retailerLocationId, excludeRetailerLocationId, listingId, offerId, offerLocationId, customerAccountIds, affiliatedCategoryIds, startDate, endDate, statuses, sortField, descending, start, limit);
    }

    @ApiAction
    public Result searchEvents(Http.Request request, BigDecimal version) throws Exception {
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
            activeOnly = null;
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
        String valueofferAudienceIds = request.getQueryString("offerAudienceIds");
        String offerAudienceIds;
        if (valueofferAudienceIds != null) {
            offerAudienceIds = valueofferAudienceIds;
        } else {
            offerAudienceIds = null;
        }
        String valuetransactionAudienceIds = request.getQueryString("transactionAudienceIds");
        String transactionAudienceIds;
        if (valuetransactionAudienceIds != null) {
            transactionAudienceIds = valuetransactionAudienceIds;
        } else {
            transactionAudienceIds = null;
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
        return imp.searchEventsHttp(request, version, accountId, keyword, activeOnly, categoryIds, filterIds, offerAudienceIds, transactionAudienceIds, sortField, descending, startDate, endDate, start, limit);
    }

    @ApiAction
    public Result updateEvent(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueeventId = request.getQueryString("eventId");
        Long eventId;
        if (valueeventId != null) {
            eventId = Long.parseLong(valueeventId);
        } else {
            throw new IllegalArgumentException("'eventId' parameter is required");
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
        String valueimageAssetId = request.getQueryString("imageAssetId");
        Long imageAssetId;
        if (valueimageAssetId != null) {
            imageAssetId = Long.parseLong(valueimageAssetId);
        } else {
            imageAssetId = null;
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
        return imp.updateEventHttp(request, version, accountId, eventId, retailerLocationIds, title, subTitle, details, categoryIds, filterIds, active, imageAssetId, redeemableStart, redeemableEnd);
    }

}
