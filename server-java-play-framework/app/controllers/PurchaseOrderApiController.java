package controllers;

import java.math.BigDecimal;
import apimodels.OrderResponse;
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
public class PurchaseOrderApiController extends Controller {
    private final PurchaseOrderApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private PurchaseOrderApiController(Config configuration, PurchaseOrderApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createOrder(Http.Request request, BigDecimal version) throws Exception {
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
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuecurrencyType = request.getQueryString("currencyType");
        String currencyType;
        if (valuecurrencyType != null) {
            currencyType = valuecurrencyType;
        } else {
            currencyType = "CASH";
        }
        String valuecart = request.getQueryString("cart");
        String cart;
        if (valuecart != null) {
            cart = valuecart;
        } else {
            throw new IllegalArgumentException("'cart' parameter is required");
        }
        String valuepaymentMethodId = request.getQueryString("paymentMethodId");
        Long paymentMethodId;
        if (valuepaymentMethodId != null) {
            paymentMethodId = Long.parseLong(valuepaymentMethodId);
        } else {
            paymentMethodId = null;
        }
        String valueexternalOrderId = request.getQueryString("externalOrderId");
        String externalOrderId;
        if (valueexternalOrderId != null) {
            externalOrderId = valueexternalOrderId;
        } else {
            externalOrderId = null;
        }
        String valueexternalPaymentId = request.getQueryString("externalPaymentId");
        String externalPaymentId;
        if (valueexternalPaymentId != null) {
            externalPaymentId = valueexternalPaymentId;
        } else {
            externalPaymentId = null;
        }
        String valueremoteRefType = request.getQueryString("remoteRefType");
        String remoteRefType;
        if (valueremoteRefType != null) {
            remoteRefType = valueremoteRefType;
        } else {
            remoteRefType = null;
        }
        String valueexternalDate = request.getQueryString("externalDate");
        Long externalDate;
        if (valueexternalDate != null) {
            externalDate = Long.parseLong(valueexternalDate);
        } else {
            externalDate = null;
        }
        String valuepromoCode = request.getQueryString("promoCode");
        String promoCode;
        if (valuepromoCode != null) {
            promoCode = valuepromoCode;
        } else {
            promoCode = null;
        }
        return imp.createOrderHttp(request, version, appKey, cart, deviceId, accountId, description, currencyType, paymentMethodId, externalOrderId, externalPaymentId, remoteRefType, externalDate, promoCode);
    }

    @ApiAction
    public Result deleteOrder(Http.Request request, BigDecimal version) throws Exception {
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
        String valueorderId = request.getQueryString("orderId");
        Long orderId;
        if (valueorderId != null) {
            orderId = Long.parseLong(valueorderId);
        } else {
            throw new IllegalArgumentException("'orderId' parameter is required");
        }
        return imp.deleteOrderHttp(request, version, orderId, deviceId, accountId);
    }

    @ApiAction
    public Result getOrder(Http.Request request, BigDecimal version) throws Exception {
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
        String valueorderId = request.getQueryString("orderId");
        Long orderId;
        if (valueorderId != null) {
            orderId = Long.parseLong(valueorderId);
        } else {
            orderId = null;
        }
        String valueexternalOrderId = request.getQueryString("externalOrderId");
        String externalOrderId;
        if (valueexternalOrderId != null) {
            externalOrderId = valueexternalOrderId;
        } else {
            externalOrderId = null;
        }
        return imp.getOrderHttp(request, version, deviceId, accountId, orderId, externalOrderId);
    }

    @ApiAction
    public Result previewOrder(Http.Request request, BigDecimal version) throws Exception {
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
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuecurrencyType = request.getQueryString("currencyType");
        String currencyType;
        if (valuecurrencyType != null) {
            currencyType = valuecurrencyType;
        } else {
            currencyType = "CASH";
        }
        String valuecart = request.getQueryString("cart");
        String cart;
        if (valuecart != null) {
            cart = valuecart;
        } else {
            throw new IllegalArgumentException("'cart' parameter is required");
        }
        String valuepaymentMethodId = request.getQueryString("paymentMethodId");
        Long paymentMethodId;
        if (valuepaymentMethodId != null) {
            paymentMethodId = Long.parseLong(valuepaymentMethodId);
        } else {
            paymentMethodId = null;
        }
        String valueexternalOrderId = request.getQueryString("externalOrderId");
        String externalOrderId;
        if (valueexternalOrderId != null) {
            externalOrderId = valueexternalOrderId;
        } else {
            externalOrderId = null;
        }
        String valueexternalPaymentId = request.getQueryString("externalPaymentId");
        String externalPaymentId;
        if (valueexternalPaymentId != null) {
            externalPaymentId = valueexternalPaymentId;
        } else {
            externalPaymentId = null;
        }
        String valueremoteRefType = request.getQueryString("remoteRefType");
        String remoteRefType;
        if (valueremoteRefType != null) {
            remoteRefType = valueremoteRefType;
        } else {
            remoteRefType = null;
        }
        String valueexternalDate = request.getQueryString("externalDate");
        Long externalDate;
        if (valueexternalDate != null) {
            externalDate = Long.parseLong(valueexternalDate);
        } else {
            externalDate = null;
        }
        String valuepromoCode = request.getQueryString("promoCode");
        String promoCode;
        if (valuepromoCode != null) {
            promoCode = valuepromoCode;
        } else {
            promoCode = null;
        }
        return imp.previewOrderHttp(request, version, appKey, cart, deviceId, accountId, description, currencyType, paymentMethodId, externalOrderId, externalPaymentId, remoteRefType, externalDate, promoCode);
    }

    @ApiAction
    public Result searchOrders(Http.Request request, BigDecimal version) throws Exception {
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
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = true;
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            activeOnly = false;
        }
        String valueignoreCustomerFilter = request.getQueryString("ignoreCustomerFilter");
        Boolean ignoreCustomerFilter;
        if (valueignoreCustomerFilter != null) {
            ignoreCustomerFilter = Boolean.valueOf(valueignoreCustomerFilter);
        } else {
            ignoreCustomerFilter = false;
        }
        String valueorderItemTypes = request.getQueryString("orderItemTypes");
        String orderItemTypes;
        if (valueorderItemTypes != null) {
            orderItemTypes = valueorderItemTypes;
        } else {
            orderItemTypes = null;
        }
        String valueorderItemIds = request.getQueryString("orderItemIds");
        String orderItemIds;
        if (valueorderItemIds != null) {
            orderItemIds = valueorderItemIds;
        } else {
            orderItemIds = null;
        }
        String valueorderCustomTypes = request.getQueryString("orderCustomTypes");
        String orderCustomTypes;
        if (valueorderCustomTypes != null) {
            orderCustomTypes = valueorderCustomTypes;
        } else {
            orderCustomTypes = null;
        }
        String valueorderCustomIds = request.getQueryString("orderCustomIds");
        String orderCustomIds;
        if (valueorderCustomIds != null) {
            orderCustomIds = valueorderCustomIds;
        } else {
            orderCustomIds = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = "ID";
        }
        String valueofferTypes = request.getQueryString("offerTypes");
        String offerTypes;
        if (valueofferTypes != null) {
            offerTypes = valueofferTypes;
        } else {
            offerTypes = null;
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
        String valuetransactionAudienceIds = request.getQueryString("transactionAudienceIds");
        String transactionAudienceIds;
        if (valuetransactionAudienceIds != null) {
            transactionAudienceIds = valuetransactionAudienceIds;
        } else {
            transactionAudienceIds = null;
        }
        String valueofferIds = request.getQueryString("offerIds");
        String offerIds;
        if (valueofferIds != null) {
            offerIds = valueofferIds;
        } else {
            offerIds = null;
        }
        String valueofferLocationIds = request.getQueryString("offerLocationIds");
        String offerLocationIds;
        if (valueofferLocationIds != null) {
            offerLocationIds = valueofferLocationIds;
        } else {
            offerLocationIds = null;
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
        String valuestatuses = request.getQueryString("statuses");
        String statuses;
        if (valuestatuses != null) {
            statuses = valuestatuses;
        } else {
            statuses = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
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
        return imp.searchOrdersHttp(request, version, appKey, deviceId, accountId, start, limit, descending, activeOnly, ignoreCustomerFilter, orderItemTypes, orderItemIds, orderCustomTypes, orderCustomIds, sortField, offerTypes, specialOfferTypes, categoryIds, filterIds, offerAudienceIds, transactionAudienceIds, offerIds, offerLocationIds, retailerIds, retailerLocationIds, statuses, keyword, redeemableStartDate, redeemableEndDate, startedSince, startedBefore, endedSince, endedBefore);
    }

    @ApiAction
    public Result updateOrder(Http.Request request, BigDecimal version) throws Exception {
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
        String valueorderId = request.getQueryString("orderId");
        Long orderId;
        if (valueorderId != null) {
            orderId = Long.parseLong(valueorderId);
        } else {
            throw new IllegalArgumentException("'orderId' parameter is required");
        }
        String valuepaymentTransactionId = request.getQueryString("paymentTransactionId");
        Long paymentTransactionId;
        if (valuepaymentTransactionId != null) {
            paymentTransactionId = Long.parseLong(valuepaymentTransactionId);
        } else {
            paymentTransactionId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuecurrencyType = request.getQueryString("currencyType");
        String currencyType;
        if (valuecurrencyType != null) {
            currencyType = valuecurrencyType;
        } else {
            currencyType = "CASH";
        }
        String valuecart = request.getQueryString("cart");
        String cart;
        if (valuecart != null) {
            cart = valuecart;
        } else {
            throw new IllegalArgumentException("'cart' parameter is required");
        }
        String valuepaymentMethodId = request.getQueryString("paymentMethodId");
        Long paymentMethodId;
        if (valuepaymentMethodId != null) {
            paymentMethodId = Long.parseLong(valuepaymentMethodId);
        } else {
            paymentMethodId = null;
        }
        String valueexternalPaymentId = request.getQueryString("externalPaymentId");
        String externalPaymentId;
        if (valueexternalPaymentId != null) {
            externalPaymentId = valueexternalPaymentId;
        } else {
            externalPaymentId = null;
        }
        String valueexternalDate = request.getQueryString("externalDate");
        Long externalDate;
        if (valueexternalDate != null) {
            externalDate = Long.parseLong(valueexternalDate);
        } else {
            externalDate = null;
        }
        return imp.updateOrderHttp(request, version, orderId, appKey, cart, deviceId, accountId, paymentTransactionId, description, currencyType, paymentMethodId, externalPaymentId, externalDate);
    }

}
