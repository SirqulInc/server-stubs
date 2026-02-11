package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.OrderResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrderApiServiceImpl implements OrderApiService {
      public Response createOrder(String appKey,String cart,String deviceId,Long accountId,String description,String currencyType,Long paymentMethodId,String externalOrderId,String externalPaymentId,String remoteRefType,Long externalDate,String promoCode,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response deleteOrder(Long orderId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getOrder(String deviceId,Long accountId,Long orderId,String externalOrderId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response previewOrder(String appKey,String cart,String deviceId,Long accountId,String description,String currencyType,Long paymentMethodId,String externalOrderId,String externalPaymentId,String remoteRefType,Long externalDate,String promoCode,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchOrders(String appKey,String deviceId,Long accountId,Integer start,Integer limit,Boolean descending,Boolean activeOnly,Boolean ignoreCustomerFilter,String orderItemTypes,String orderItemIds,String orderCustomTypes,String orderCustomIds,String sortField,String offerTypes,String specialOfferTypes,String categoryIds,String filterIds,String offerAudienceIds,String transactionAudienceIds,String offerIds,String offerLocationIds,String retailerIds,String retailerLocationIds,String statuses,String keyword,Long redeemableStartDate,Long redeemableEndDate,Long startedSince,Long startedBefore,Long endedSince,Long endedBefore,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updateOrder(Long orderId,String appKey,String cart,String deviceId,Long accountId,Long paymentTransactionId,String description,String currencyType,Long paymentMethodId,String externalPaymentId,Long externalDate,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
