package controllers;

import java.math.BigDecimal;
import apimodels.OrderResponse;
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
public abstract class PurchaseOrderApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createOrderHttp(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String cart, String deviceId, Long accountId, String description, String currencyType, Long paymentMethodId, String externalOrderId, String externalPaymentId, String remoteRefType, Long externalDate, String promoCode) throws Exception {
        OrderResponse obj = createOrder(request, version, appKey, cart, deviceId, accountId, description, currencyType, paymentMethodId, externalOrderId, externalPaymentId, remoteRefType, externalDate, promoCode);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrderResponse createOrder(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String cart, String deviceId, Long accountId, String description, String currencyType, Long paymentMethodId, String externalOrderId, String externalPaymentId, String remoteRefType, Long externalDate, String promoCode) throws Exception;

    public Result deleteOrderHttp(Http.Request request, BigDecimal version, @NotNull Long orderId, String deviceId, Long accountId) throws Exception {
        SirqulResponse obj = deleteOrder(request, version, orderId, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteOrder(Http.Request request, BigDecimal version, @NotNull Long orderId, String deviceId, Long accountId) throws Exception;

    public Result getOrderHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long orderId, String externalOrderId) throws Exception {
        OrderResponse obj = getOrder(request, version, deviceId, accountId, orderId, externalOrderId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrderResponse getOrder(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long orderId, String externalOrderId) throws Exception;

    public Result previewOrderHttp(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String cart, String deviceId, Long accountId, String description, String currencyType, Long paymentMethodId, String externalOrderId, String externalPaymentId, String remoteRefType, Long externalDate, String promoCode) throws Exception {
        OrderResponse obj = previewOrder(request, version, appKey, cart, deviceId, accountId, description, currencyType, paymentMethodId, externalOrderId, externalPaymentId, remoteRefType, externalDate, promoCode);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrderResponse previewOrder(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String cart, String deviceId, Long accountId, String description, String currencyType, Long paymentMethodId, String externalOrderId, String externalPaymentId, String remoteRefType, Long externalDate, String promoCode) throws Exception;

    public Result searchOrdersHttp(Http.Request request, BigDecimal version, @NotNull String appKey, String deviceId, Long accountId, Integer start, Integer limit, Boolean descending, Boolean activeOnly, Boolean ignoreCustomerFilter, String orderItemTypes, String orderItemIds, String orderCustomTypes, String orderCustomIds, String sortField, String offerTypes, String specialOfferTypes, String categoryIds, String filterIds, String offerAudienceIds, String transactionAudienceIds, String offerIds, String offerLocationIds, String retailerIds, String retailerLocationIds, String statuses, String keyword, Long redeemableStartDate, Long redeemableEndDate, Long startedSince, Long startedBefore, Long endedSince, Long endedBefore) throws Exception {
        List<OrderResponse> obj = searchOrders(request, version, appKey, deviceId, accountId, start, limit, descending, activeOnly, ignoreCustomerFilter, orderItemTypes, orderItemIds, orderCustomTypes, orderCustomIds, sortField, offerTypes, specialOfferTypes, categoryIds, filterIds, offerAudienceIds, transactionAudienceIds, offerIds, offerLocationIds, retailerIds, retailerLocationIds, statuses, keyword, redeemableStartDate, redeemableEndDate, startedSince, startedBefore, endedSince, endedBefore);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (OrderResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<OrderResponse> searchOrders(Http.Request request, BigDecimal version, @NotNull String appKey, String deviceId, Long accountId, Integer start, Integer limit, Boolean descending, Boolean activeOnly, Boolean ignoreCustomerFilter, String orderItemTypes, String orderItemIds, String orderCustomTypes, String orderCustomIds, String sortField, String offerTypes, String specialOfferTypes, String categoryIds, String filterIds, String offerAudienceIds, String transactionAudienceIds, String offerIds, String offerLocationIds, String retailerIds, String retailerLocationIds, String statuses, String keyword, Long redeemableStartDate, Long redeemableEndDate, Long startedSince, Long startedBefore, Long endedSince, Long endedBefore) throws Exception;

    public Result updateOrderHttp(Http.Request request, BigDecimal version, @NotNull Long orderId, @NotNull String appKey, @NotNull String cart, String deviceId, Long accountId, Long paymentTransactionId, String description, String currencyType, Long paymentMethodId, String externalPaymentId, Long externalDate) throws Exception {
        OrderResponse obj = updateOrder(request, version, orderId, appKey, cart, deviceId, accountId, paymentTransactionId, description, currencyType, paymentMethodId, externalPaymentId, externalDate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrderResponse updateOrder(Http.Request request, BigDecimal version, @NotNull Long orderId, @NotNull String appKey, @NotNull String cart, String deviceId, Long accountId, Long paymentTransactionId, String description, String currencyType, Long paymentMethodId, String externalPaymentId, Long externalDate) throws Exception;

}
