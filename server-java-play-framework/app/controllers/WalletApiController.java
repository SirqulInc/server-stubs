package controllers;

import java.math.BigDecimal;
import apimodels.OfferTransactionResponse;
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
public class WalletApiController extends Controller {
    private final WalletApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private WalletApiController(Config configuration, WalletApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createOfferTransaction(Http.Request request, BigDecimal version) throws Exception {
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
        String valueofferCart = request.getQueryString("offerCart");
        String offerCart;
        if (valueofferCart != null) {
            offerCart = valueofferCart;
        } else {
            offerCart = null;
        }
        String valuepromoCode = request.getQueryString("promoCode");
        String promoCode;
        if (valuepromoCode != null) {
            promoCode = valuepromoCode;
        } else {
            promoCode = null;
        }
        String valuecurrencyType = request.getQueryString("currencyType");
        String currencyType;
        if (valuecurrencyType != null) {
            currencyType = valuecurrencyType;
        } else {
            currencyType = "CASH";
        }
        String valueusePoints = request.getQueryString("usePoints");
        Boolean usePoints;
        if (valueusePoints != null) {
            usePoints = Boolean.valueOf(valueusePoints);
        } else {
            usePoints = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuestatus = request.getQueryString("status");
        Integer status;
        if (valuestatus != null) {
            status = Integer.parseInt(valuestatus);
        } else {
            status = null;
        }
        return imp.createOfferTransactionHttp(request, version, deviceId, accountId, offerId, offerLocationId, offerCart, promoCode, currencyType, usePoints, metaData, appKey, status);
    }

    @ApiAction
    public Result deleteOfferTransaction(Http.Request request, BigDecimal version) throws Exception {
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
        String valuetransactionId = request.getQueryString("transactionId");
        Long transactionId;
        if (valuetransactionId != null) {
            transactionId = Long.parseLong(valuetransactionId);
        } else {
            throw new IllegalArgumentException("'transactionId' parameter is required");
        }
        return imp.deleteOfferTransactionHttp(request, version, transactionId, deviceId, accountId);
    }

    @ApiAction
    public Result getOfferTransaction(Http.Request request, BigDecimal version) throws Exception {
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
        String valuetransactionId = request.getQueryString("transactionId");
        Long transactionId;
        if (valuetransactionId != null) {
            transactionId = Long.parseLong(valuetransactionId);
        } else {
            throw new IllegalArgumentException("'transactionId' parameter is required");
        }
        String valueincludeMission = request.getQueryString("includeMission");
        Boolean includeMission;
        if (valueincludeMission != null) {
            includeMission = Boolean.valueOf(valueincludeMission);
        } else {
            includeMission = false;
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
        String valuereturnFullResponse = request.getQueryString("returnFullResponse");
        Boolean returnFullResponse;
        if (valuereturnFullResponse != null) {
            returnFullResponse = Boolean.valueOf(valuereturnFullResponse);
        } else {
            returnFullResponse = true;
        }
        return imp.getOfferTransactionHttp(request, version, transactionId, deviceId, accountId, includeMission, latitude, longitude, returnFullResponse);
    }

    @ApiAction
    public Result previewOfferTransaction(Http.Request request, BigDecimal version) throws Exception {
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
        String valueofferCart = request.getQueryString("offerCart");
        String offerCart;
        if (valueofferCart != null) {
            offerCart = valueofferCart;
        } else {
            offerCart = null;
        }
        String valuepromoCode = request.getQueryString("promoCode");
        String promoCode;
        if (valuepromoCode != null) {
            promoCode = valuepromoCode;
        } else {
            promoCode = null;
        }
        String valuecurrencyType = request.getQueryString("currencyType");
        String currencyType;
        if (valuecurrencyType != null) {
            currencyType = valuecurrencyType;
        } else {
            currencyType = "CASH";
        }
        String valueusePoints = request.getQueryString("usePoints");
        Boolean usePoints;
        if (valueusePoints != null) {
            usePoints = Boolean.valueOf(valueusePoints);
        } else {
            usePoints = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        return imp.previewOfferTransactionHttp(request, version, deviceId, accountId, offerId, offerLocationId, offerCart, promoCode, currencyType, usePoints, metaData, appKey);
    }

    @ApiAction
    public Result searchOfferTransactions(Http.Request request, BigDecimal version) throws Exception {
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
        String valueretailerIds = request.getQueryString("retailerIds");
        String retailerIds;
        if (valueretailerIds != null) {
            retailerIds = valueretailerIds;
        } else {
            retailerIds = null;
        }
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            retailerLocationId = null;
        }
        String valueretailerLocationIds = request.getQueryString("retailerLocationIds");
        String retailerLocationIds;
        if (valueretailerLocationIds != null) {
            retailerLocationIds = valueretailerLocationIds;
        } else {
            retailerLocationIds = null;
        }
        String valueexcludeRetailerLocationIds = request.getQueryString("excludeRetailerLocationIds");
        String excludeRetailerLocationIds;
        if (valueexcludeRetailerLocationIds != null) {
            excludeRetailerLocationIds = valueexcludeRetailerLocationIds;
        } else {
            excludeRetailerLocationIds = null;
        }
        String valueofferId = request.getQueryString("offerId");
        Long offerId;
        if (valueofferId != null) {
            offerId = Long.parseLong(valueofferId);
        } else {
            offerId = null;
        }
        String valueofferIds = request.getQueryString("offerIds");
        String offerIds;
        if (valueofferIds != null) {
            offerIds = valueofferIds;
        } else {
            offerIds = null;
        }
        String valueofferLocationId = request.getQueryString("offerLocationId");
        Long offerLocationId;
        if (valueofferLocationId != null) {
            offerLocationId = Long.parseLong(valueofferLocationId);
        } else {
            offerLocationId = null;
        }
        String valueofferLocationIds = request.getQueryString("offerLocationIds");
        String offerLocationIds;
        if (valueofferLocationIds != null) {
            offerLocationIds = valueofferLocationIds;
        } else {
            offerLocationIds = null;
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
        String valuespecialOfferTypes = request.getQueryString("specialOfferTypes");
        String specialOfferTypes;
        if (valuespecialOfferTypes != null) {
            specialOfferTypes = valuespecialOfferTypes;
        } else {
            specialOfferTypes = null;
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
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = "CREATED";
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = true;
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
        String valuefilterByParentOffer = request.getQueryString("filterByParentOffer");
        Boolean filterByParentOffer;
        if (valuefilterByParentOffer != null) {
            filterByParentOffer = Boolean.valueOf(valuefilterByParentOffer);
        } else {
            filterByParentOffer = false;
        }
        String valuestartedSince = request.getQueryString("startedSince");
        Long startedSince;
        if (valuestartedSince != null) {
            startedSince = Long.parseLong(valuestartedSince);
        } else {
            startedSince = null;
        }
        String valuestartedBefore = request.getQueryString("startedBefore");
        Long startedBefore;
        if (valuestartedBefore != null) {
            startedBefore = Long.parseLong(valuestartedBefore);
        } else {
            startedBefore = null;
        }
        String valueendedSince = request.getQueryString("endedSince");
        Long endedSince;
        if (valueendedSince != null) {
            endedSince = Long.parseLong(valueendedSince);
        } else {
            endedSince = null;
        }
        String valueendedBefore = request.getQueryString("endedBefore");
        Long endedBefore;
        if (valueendedBefore != null) {
            endedBefore = Long.parseLong(valueendedBefore);
        } else {
            endedBefore = null;
        }
        String valueredeemed = request.getQueryString("redeemed");
        Boolean redeemed;
        if (valueredeemed != null) {
            redeemed = Boolean.valueOf(valueredeemed);
        } else {
            redeemed = false;
        }
        String valuestatuses = request.getQueryString("statuses");
        String statuses;
        if (valuestatuses != null) {
            statuses = valuestatuses;
        } else {
            statuses = null;
        }
        String valuereservationsOnly = request.getQueryString("reservationsOnly");
        Boolean reservationsOnly;
        if (valuereservationsOnly != null) {
            reservationsOnly = Boolean.valueOf(valuereservationsOnly);
        } else {
            reservationsOnly = false;
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            activeOnly = false;
        }
        String valuereturnFullResponse = request.getQueryString("returnFullResponse");
        Boolean returnFullResponse;
        if (valuereturnFullResponse != null) {
            returnFullResponse = Boolean.valueOf(valuereturnFullResponse);
        } else {
            returnFullResponse = false;
        }
        String valuerecurringStartedSince = request.getQueryString("recurringStartedSince");
        Long recurringStartedSince;
        if (valuerecurringStartedSince != null) {
            recurringStartedSince = Long.parseLong(valuerecurringStartedSince);
        } else {
            recurringStartedSince = null;
        }
        String valuerecurringStartedBefore = request.getQueryString("recurringStartedBefore");
        Long recurringStartedBefore;
        if (valuerecurringStartedBefore != null) {
            recurringStartedBefore = Long.parseLong(valuerecurringStartedBefore);
        } else {
            recurringStartedBefore = null;
        }
        String valuerecurringExpirationSince = request.getQueryString("recurringExpirationSince");
        Long recurringExpirationSince;
        if (valuerecurringExpirationSince != null) {
            recurringExpirationSince = Long.parseLong(valuerecurringExpirationSince);
        } else {
            recurringExpirationSince = null;
        }
        String valuerecurringExpirationBefore = request.getQueryString("recurringExpirationBefore");
        Long recurringExpirationBefore;
        if (valuerecurringExpirationBefore != null) {
            recurringExpirationBefore = Long.parseLong(valuerecurringExpirationBefore);
        } else {
            recurringExpirationBefore = null;
        }
        return imp.searchOfferTransactionsHttp(request, version, deviceId, accountId, keyword, retailerId, retailerIds, retailerLocationId, retailerLocationIds, excludeRetailerLocationIds, offerId, offerIds, offerLocationId, offerLocationIds, offerType, offerTypes, specialOfferType, specialOfferTypes, categoryIds, filterIds, offerAudienceIds, sortField, descending, start, limit, latitude, longitude, redeemableStartDate, redeemableEndDate, filterByParentOffer, startedSince, startedBefore, endedSince, endedBefore, redeemed, statuses, reservationsOnly, activeOnly, returnFullResponse, recurringStartedSince, recurringStartedBefore, recurringExpirationSince, recurringExpirationBefore);
    }

    @ApiAction
    public Result updateOfferTransaction(Http.Request request, BigDecimal version) throws Exception {
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
        String valuetransactionId = request.getQueryString("transactionId");
        Long transactionId;
        if (valuetransactionId != null) {
            transactionId = Long.parseLong(valuetransactionId);
        } else {
            throw new IllegalArgumentException("'transactionId' parameter is required");
        }
        String valueofferLocationId = request.getQueryString("offerLocationId");
        Long offerLocationId;
        if (valueofferLocationId != null) {
            offerLocationId = Long.parseLong(valueofferLocationId);
        } else {
            offerLocationId = null;
        }
        String valuecurrencyType = request.getQueryString("currencyType");
        String currencyType;
        if (valuecurrencyType != null) {
            currencyType = valuecurrencyType;
        } else {
            currencyType = "CASH";
        }
        String valueusePoints = request.getQueryString("usePoints");
        Boolean usePoints;
        if (valueusePoints != null) {
            usePoints = Boolean.valueOf(valueusePoints);
        } else {
            usePoints = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuestatus = request.getQueryString("status");
        Integer status;
        if (valuestatus != null) {
            status = Integer.parseInt(valuestatus);
        } else {
            throw new IllegalArgumentException("'status' parameter is required");
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
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valuereturnFullResponse = request.getQueryString("returnFullResponse");
        Boolean returnFullResponse;
        if (valuereturnFullResponse != null) {
            returnFullResponse = Boolean.valueOf(valuereturnFullResponse);
        } else {
            returnFullResponse = false;
        }
        String valueexceptionMembershipOfferIds = request.getQueryString("exceptionMembershipOfferIds");
        String exceptionMembershipOfferIds;
        if (valueexceptionMembershipOfferIds != null) {
            exceptionMembershipOfferIds = valueexceptionMembershipOfferIds;
        } else {
            exceptionMembershipOfferIds = null;
        }
        return imp.updateOfferTransactionHttp(request, version, transactionId, status, deviceId, accountId, offerLocationId, currencyType, usePoints, appKey, latitude, longitude, metaData, returnFullResponse, exceptionMembershipOfferIds);
    }

}
