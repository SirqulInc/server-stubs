package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.AccountLoginResponse;
import java.io.File;
import org.openapitools.model.OfferResponse;
import org.openapitools.model.OfferShortResponse;
import org.openapitools.model.OfferTransactionResponse;
import org.openapitools.model.RetailerFullResponse;
import org.openapitools.model.RetailerLocationResponse;
import org.openapitools.model.RetailerOfferResponse;
import org.openapitools.model.RetailerResponse;
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
public class RetailerApiServiceImpl implements RetailerApiService {
      public Response batchUpdateOfferLocations(String data,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response createOffer(Boolean includeOfferLocations,String title,String barcodeType,Boolean noExpiration,Integer availableLimit,Integer availableLimitPerUser,Integer addedLimit,Integer viewLimit,Integer maxPrints,Long ticketPrice,Double fullPrice,Double discountPrice,String offerType,String specialOfferType,String offerVisibility,Boolean active,String deviceId,Long accountId,String tags,Long parentOfferId,String retailerLocationIds,String offerLocations,String subTitle,String details,String subDetails,String finePrint,String barcodeEntry,String externalRedeemOptions,String externalUrl,String externalId,String ticketsRewardType,Long ticketsReward,Long activated,Long expires,String ticketPriceType,Boolean showRemaining,Boolean showRedeemed,Boolean replaced,Boolean featured,String categoryIds,String filterIds,Long barcodeAssetId,Long imageAssetId,Long imageAssetId1,Long imageAssetId2,Long imageAssetId3,Long imageAssetId4,Long imageAssetId5,String publisher,Long redeemableStart,Long redeemableEnd,String brand,String productType,String conditionType,String isbn,String asin,String catalogNumbers,String department,String features,Double minimumPrice,Double width,Double height,Double depth,Double weight,String unit,String studio,String parentalRating,Long publishDate,Long availabilityDate,Long sizeId,Long listingId,String mediaType,Integer duration,String author,Long releaseDate,String collectionIds,Integer rebootTimeHour,Integer rebootTimeMinute,Integer idleTimeoutInSecond,String serialNumber,String udid,String deviceType,Double devicePower,Double deviceInterference,String availability,String availabilitySummary,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response createRetailer(String name,String deviceId,Long accountId,String streetAddress,String streetAddress2,String city,String state,String postalCode,String country,String businessPhone,String businessPhoneExt,String website,String email,String facebookUrl,String twitterUrl,File logo,Long logoAssetId,File picture1,Long picture1AssetId,File picture2,Long picture2AssetId,String categoryIds,String categoryIdsToAdd,String categoryIdsToRemove,String filterIds,Double latitude,Double longitude,String metaData,String searchTags,String retailerType,String visibility,Boolean createDefaultLocation,String responseFormat,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response createRetailerLocations(Long retailerId,String name,String streetAddress,String city,String state,String postalCode,String deviceId,Long accountId,String streetAddress2,String country,String businessPhone,String businessPhoneExt,String website,String email,String internalId,String detailsHeader,String detailsBody,String hours,File logo,Long logoAssetId,File picture1,Long picture1AssetId,File picture2,Long picture2AssetId,String categoryIds,String filterIds,Double latitude,Double longitude,String building,String googlePlaceId,String yelpId,Boolean active,Boolean publicLocation,String locationType,String audienceIds,String audienceIdsToAdd,String audienceIdsToRemove,String responseFormat,String responseIncludes,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response deleteOffer(Long offerId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response deleteOfferLocation(Long offerLocationId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response deleteRetailer(String deviceId,Long accountId,Long retailerId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response deleteRetailerLocation(String deviceId,Long accountId,Long retailerLocationId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getOffer(Long offerId,Boolean includeOfferLocations,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getOfferLocationsForRetailers(String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Boolean includeRetailerLocation,String deviceId,Long accountId,String keyword,Long retailerId,Long retailerLocationId,String offerType,String specialOfferType,String barcodeType,String barcodeEntry,String isbn,String asin,String deviceStatus,Boolean needsNotificationSent,Long lastNotificationSent,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getOffersForRetailers(String offerVisibility,String sortField,Boolean descending,Integer start,Integer limit,Boolean availableOnly,Boolean activeOnly,Boolean includeCategories,Boolean includeFilters,Boolean includeOfferLocations,String deviceId,Long accountId,String categoryIds,String filterIds,String q,String keyword,Long retailerId,Long retailerLocationId,String couponType,String offerType,String offerTypes,String specialOfferType,Integer i,Integer l,String barcodeType,String barcodeEntry,String isbn,String asin,String deviceStatus,Boolean needsNotificationSent,Long lastNotificationSent,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getRetailer(Long retailerId,String deviceId,Long accountId,Boolean includeCounts,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getRetailerLocation(Long retailerLocationId,String deviceId,Long accountId,String retailerLocationToken,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getRetailers(String visibility,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,String deviceId,Long accountId,String q,String keyword,String categoryIds,String filterIds,Integer i,Integer l,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getRetaokiler(Long retailerId,Boolean activeOnly,String keyword,String sortField,Long start,Long limit,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response indexedRetailerLocationDistanceSearch(Double latitude,Double longitude,Double searchRange,Integer start,Integer limit,Long accountId,String address,Boolean hasOffers,String categories,String filters,String audiences,String retailerIds,String retailerLocationIds,String tags,String locationType,String sortField,Boolean descending,String q,String keyword,String keywordOperator,String searchExpression,String distanceUnit,Boolean returnFavorited,Boolean returnRetailer,Boolean returnAssets,Boolean returnOffers,Boolean returnCategories,Boolean returnFilters,Boolean returnAudiences,Boolean returnQrCode,Boolean returnExternalCategoryData,Boolean includeFavorite,Boolean includeLiked,Boolean includeRating,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response indexedRetailerLocationSearch(Long accountId,Integer start,Integer limit,Boolean hasOffers,String categories,String filters,String audiences,String retailerIds,String retailerLocationIds,String tags,String locationType,String sortField,Boolean descending,String q,String keyword,String keywordOperator,String searchExpression,Boolean returnRetailer,Boolean returnAssets,Boolean returnOffers,Boolean returnCategories,Boolean returnFilters,Boolean returnAudiences,Boolean returnQrCode,Boolean returnExternalCategoryData,Boolean includeFavorite,Boolean includeLiked,Boolean includeRating,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response redeemOfferTransaction(Long offerTransactionId,Integer status,String deviceId,Long accountId,Long offerLocationId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response retailerLoginCheck(String username,String password,String deviceId,Double latitude,Double longitude,String appKey,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchOfferTransactionsForRetailers(String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,String deviceId,Long accountId,String q,String keyword,Long retailerId,Long retailerLocationId,Long offerId,Long offerLocationId,Boolean redeemed,Boolean reservationsOnly,String couponType,String offerType,String specialOfferType,String customerAccountIds,String categoryIds,Long redeemableStartDate,Long redeemableEndDate,Integer i,Integer l,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchRetailerLocations(String deviceId,Long accountId,String q,String keyword,String retailerIds,String retailerLocationIds,String locationType,String sortField,Boolean descending,Integer i,Integer start,Integer l,Integer limit,Boolean showPublicLocations,Boolean activeOnly,Boolean returnRetailer,Boolean returnAssets,Boolean returnOffers,Boolean returnCategories,Boolean returnFilters,Boolean returnAudiences,Boolean returnQrCode,Boolean includeFavorite,Boolean includeLiked,Boolean includeRating,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updateOffer(Long offerId,Boolean includeOfferLocations,String deviceId,Long accountId,Long parentOfferId,String retailerLocationIds,String offerLocations,String tags,String title,String subTitle,String details,String subDetails,String finePrint,String barcodeType,String barcodeEntry,String externalRedeemOptions,String externalUrl,String externalId,String ticketsRewardType,Long ticketsReward,Long activated,Long expires,Boolean noExpiration,Integer availableLimit,Integer availableLimitPerUser,Integer addedLimit,Integer viewLimit,Integer maxPrints,String ticketPriceType,Long ticketPrice,Double fullPrice,Double discountPrice,Boolean showRemaining,Boolean showRedeemed,Boolean replaced,Boolean featured,String offerType,String specialOfferType,String offerVisibility,String categoryIds,String filterIds,Boolean active,Long barcodeAssetId,Long imageAssetId,Long imageAssetId1,Long imageAssetId2,Long imageAssetId3,Long imageAssetId4,Long imageAssetId5,String publisher,Long redeemableStart,Long redeemableEnd,String brand,String productType,String conditionType,String isbn,String asin,String catalogNumbers,String department,String features,Double minimumPrice,Double width,Double height,Double depth,Double weight,String unit,String studio,String parentalRating,Long publishDate,Long availabilityDate,Long sizeId,Long listingId,String mediaType,Integer duration,String author,Long releaseDate,String collectionIds,Integer rebootTimeHour,Integer rebootTimeMinute,Integer idleTimeoutInSecond,String serialNumber,String udid,String deviceType,Double devicePower,Double deviceInterference,String availability,String availabilitySummary,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updateOfferStatus(String offerIds,Boolean active,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updateRetailer(Long retailerId,String deviceId,Long accountId,String name,String streetAddress,String streetAddress2,String city,String state,String postalCode,String country,String businessPhone,String businessPhoneExt,String website,String email,String facebookUrl,String twitterUrl,File logo,Long logoAssetId,File picture1,Long picture1AssetId,File picture2,Long picture2AssetId,String categoryIds,String filterIds,Double latitude,Double longitude,String metaData,String searchTags,String retailerType,String visibility,Boolean active,String responseFormat,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updateRetailerLocations(Long retailerLocationId,String deviceId,Long accountId,String name,String streetAddress,String streetAddress2,String city,String state,String postalCode,String country,String businessPhone,String businessPhoneExt,String website,String email,String internalId,String detailsHeader,String detailsBody,String hours,File logo,Long logoAssetId,File picture1,Long picture1AssetId,File picture2,Long picture2AssetId,String categoryIds,String filterIds,Double latitude,Double longitude,String building,String googlePlaceId,String yelpId,String metaData,String paymentProvider,Boolean active,Boolean publicLocation,String locationType,String audienceIds,String audienceIdsToAdd,String audienceIdsToRemove,String responseFormat,String tags,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
