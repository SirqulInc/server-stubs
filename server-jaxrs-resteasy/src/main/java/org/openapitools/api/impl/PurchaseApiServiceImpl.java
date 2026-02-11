package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.PurchaseItemFullResponse;
import org.openapitools.model.PurchaseItemResponse;
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
public class PurchaseApiServiceImpl implements PurchaseApiService {
      public Response createPurchaseItem(String appKey,String name,String purchaseType,String deviceId,Long accountId,String description,Integer tickets,Float price,String purchaseCode,String secretKey,Integer purchaseLimit,String serviceAction,Long coverAssetId,Long promoAssetId,Boolean giftable,Boolean assetable,Boolean allocateTickets,String ticketType,Long points,Long offerLocationId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response deletePurchaseItem(Long purchaseItemId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getPurchaseItem(Long purchaseItemId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response giftPurchase(Long receiverAccountId,Long ticketId,String deviceId,Long accountId,Long assetId,String customMessage,String gameType,String appKey,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchPurchaseItems(String deviceId,Long accountId,String appKey,Boolean filterByBillable,String purchaseType,String serviceAction,String keyword,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updatePurchaseItem(Long purchaseItemId,String deviceId,Long accountId,String name,String description,Integer tickets,Float price,String purchaseType,String purchaseCode,String secretKey,Integer purchaseLimit,String serviceAction,Long coverAssetId,Long promoAssetId,Boolean giftable,Boolean assetable,Boolean active,Boolean allocateTickets,String ticketType,Long points,Long offerLocationId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
