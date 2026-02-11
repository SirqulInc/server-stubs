package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.OrderResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class OrderApiService {
    public abstract Response createOrder( @NotNull String appKey, @NotNull String cart,String deviceId,Long accountId,String description,String currencyType,Long paymentMethodId,String externalOrderId,String externalPaymentId,String remoteRefType,Long externalDate,String promoCode,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteOrder( @NotNull Long orderId,String deviceId,Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getOrder(String deviceId,Long accountId,Long orderId,String externalOrderId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response previewOrder( @NotNull String appKey, @NotNull String cart,String deviceId,Long accountId,String description,String currencyType,Long paymentMethodId,String externalOrderId,String externalPaymentId,String remoteRefType,Long externalDate,String promoCode,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchOrders( @NotNull String appKey,String deviceId,Long accountId,Integer start,Integer limit,Boolean descending,Boolean activeOnly,Boolean ignoreCustomerFilter,String orderItemTypes,String orderItemIds,String orderCustomTypes,String orderCustomIds,String sortField,String offerTypes,String specialOfferTypes,String categoryIds,String filterIds,String offerAudienceIds,String transactionAudienceIds,String offerIds,String offerLocationIds,String retailerIds,String retailerLocationIds,String statuses,String keyword,Long redeemableStartDate,Long redeemableEndDate,Long startedSince,Long startedBefore,Long endedSince,Long endedBefore,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateOrder( @NotNull Long orderId, @NotNull String appKey, @NotNull String cart,String deviceId,Long accountId,Long paymentTransactionId,String description,String currencyType,Long paymentMethodId,String externalPaymentId,Long externalDate,SecurityContext securityContext) throws NotFoundException;
}
