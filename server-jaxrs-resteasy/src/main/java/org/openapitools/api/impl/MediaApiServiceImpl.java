package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.MediaOfferResponse;
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
public class MediaApiServiceImpl implements MediaApiService {
      public Response createMedia(Long accountId,String title,String barcodeType,Boolean noExpiration,Integer availableLimit,Integer availableLimitPerUser,Integer addedLimit,Integer viewLimit,Integer maxPrints,Long ticketPrice,Double fullPrice,Double discountPrice,String specialOfferType,String offerVisibility,Boolean active,String retailerLocationIds,String subTitle,String details,String subDetails,String finePrint,String barcodeEntry,String externalRedeemOptions,String externalUrl,String ticketsRewardType,Long ticketsReward,Long activated,Long expires,String ticketPriceType,Boolean showRemaining,Boolean showRedeemed,Boolean replaced,Boolean featured,String categoryIds,String filterIds,Long barcodeAssetId,Long imageAssetId,Long imageAssetId1,Long imageAssetId2,Long imageAssetId3,Long imageAssetId4,Long imageAssetId5,String publisher,Long redeemableStart,Long redeemableEnd,String conditionType,String isbn,String asin,String catalogNumbers,String parentalRating,Long availabilityDate,String mediaType,Integer duration,String author,Long releaseDate,String collectionIds,String availability,String availabilitySummary,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response deleteMedia(Long accountId,Long mediaId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getMedia(Long accountId,Long mediaId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchMedia(Long accountId,Boolean activeOnly,String sortField,Boolean descending,String keyword,String categoryIds,String filterIds,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updateMedia(Long accountId,Long mediaId,String retailerLocationIds,String offerLocations,String title,String subTitle,String details,String subDetails,String finePrint,String barcodeType,String barcodeEntry,String externalRedeemOptions,String externalUrl,String ticketsRewardType,Long ticketsReward,Long activated,Long expires,Boolean noExpiration,Integer availableLimit,Integer availableLimitPerUser,Integer addedLimit,Integer viewLimit,Integer maxPrints,String ticketPriceType,Long ticketPrice,Double fullPrice,Double discountPrice,Boolean showRemaining,Boolean showRedeemed,Boolean replaced,Boolean featured,String specialOfferType,String offerVisibility,String categoryIds,String filterIds,Boolean active,Long barcodeAssetId,Long imageAssetId,Long imageAssetId1,Long imageAssetId2,Long imageAssetId3,Long imageAssetId4,Long imageAssetId5,String publisher,Long redeemableStart,Long redeemableEnd,String conditionType,String isbn,String asin,String catalogNumbers,Long availabilityDate,String parentalRating,String mediaType,Integer duration,String author,Long releaseDate,String collectionIds,String availability,String availabilitySummary,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
