package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.OfferTransactionResponse;
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
public class WalletApiServiceImpl implements WalletApiService {
      public Response createOfferTransaction(String deviceId,Long accountId,Long offerId,Long offerLocationId,String offerCart,String promoCode,String currencyType,Boolean usePoints,String metaData,String appKey,Integer status,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response deleteOfferTransaction(Long transactionId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getOfferTransaction(Long transactionId,String deviceId,Long accountId,Boolean includeMission,Double latitude,Double longitude,Boolean returnFullResponse,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response previewOfferTransaction(String deviceId,Long accountId,Long offerId,Long offerLocationId,String offerCart,String promoCode,String currencyType,Boolean usePoints,String metaData,String appKey,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchOfferTransactions(String deviceId,Long accountId,String keyword,Long retailerId,String retailerIds,Long retailerLocationId,String retailerLocationIds,String excludeRetailerLocationIds,Long offerId,String offerIds,Long offerLocationId,String offerLocationIds,String offerType,String offerTypes,String specialOfferType,String specialOfferTypes,String categoryIds,String filterIds,String offerAudienceIds,String sortField,Boolean descending,Integer start,Integer limit,Double latitude,Double longitude,Long redeemableStartDate,Long redeemableEndDate,Boolean filterByParentOffer,Long startedSince,Long startedBefore,Long endedSince,Long endedBefore,Boolean redeemed,String statuses,Boolean reservationsOnly,Boolean activeOnly,Boolean returnFullResponse,Long recurringStartedSince,Long recurringStartedBefore,Long recurringExpirationSince,Long recurringExpirationBefore,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updateOfferTransaction(Long transactionId,Integer status,String deviceId,Long accountId,Long offerLocationId,String currencyType,Boolean usePoints,String appKey,Double latitude,Double longitude,String metaData,Boolean returnFullResponse,String exceptionMembershipOfferIds,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
