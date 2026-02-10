package controllers;

import java.math.BigDecimal;
import apimodels.OrderResponse;
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
public class PurchaseOrderApiControllerImp extends PurchaseOrderApiControllerImpInterface {
    @Override
    public OrderResponse createOrder(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String cart, String deviceId, Long accountId, String description, String currencyType, Long paymentMethodId, String externalOrderId, String externalPaymentId, String remoteRefType, Long externalDate, String promoCode) throws Exception {
        //Do your magic!!!
        return new OrderResponse();
    }

    @Override
    public SirqulResponse deleteOrder(Http.Request request, BigDecimal version, @NotNull Long orderId, String deviceId, Long accountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public OrderResponse getOrder(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long orderId, String externalOrderId) throws Exception {
        //Do your magic!!!
        return new OrderResponse();
    }

    @Override
    public OrderResponse previewOrder(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String cart, String deviceId, Long accountId, String description, String currencyType, Long paymentMethodId, String externalOrderId, String externalPaymentId, String remoteRefType, Long externalDate, String promoCode) throws Exception {
        //Do your magic!!!
        return new OrderResponse();
    }

    @Override
    public List<OrderResponse> searchOrders(Http.Request request, BigDecimal version, @NotNull String appKey, String deviceId, Long accountId, Integer start, Integer limit, Boolean descending, Boolean activeOnly, Boolean ignoreCustomerFilter, String orderItemTypes, String orderItemIds, String orderCustomTypes, String orderCustomIds, String sortField, String offerTypes, String specialOfferTypes, String categoryIds, String filterIds, String offerAudienceIds, String transactionAudienceIds, String offerIds, String offerLocationIds, String retailerIds, String retailerLocationIds, String statuses, String keyword, Long redeemableStartDate, Long redeemableEndDate, Long startedSince, Long startedBefore, Long endedSince, Long endedBefore) throws Exception {
        //Do your magic!!!
        return new ArrayList<OrderResponse>();
    }

    @Override
    public OrderResponse updateOrder(Http.Request request, BigDecimal version, @NotNull Long orderId, @NotNull String appKey, @NotNull String cart, String deviceId, Long accountId, Long paymentTransactionId, String description, String currencyType, Long paymentMethodId, String externalPaymentId, Long externalDate) throws Exception {
        //Do your magic!!!
        return new OrderResponse();
    }

}
