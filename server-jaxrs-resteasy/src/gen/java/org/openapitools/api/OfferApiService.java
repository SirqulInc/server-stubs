package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import java.math.BigDecimal;
import org.openapitools.model.ListCountResponse;
import org.openapitools.model.OfferListResponse;
import org.openapitools.model.OfferResponse;
import org.openapitools.model.OfferShortResponse;
import org.openapitools.model.OfferTransactionStatusResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface OfferApiService {
      Response createOfferTransactionStatus(String name,Integer code,String deviceId,Long accountId,Double latitude,Double longitude,String description,String role,Boolean active,String applicationIds,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteOfferTransactionStatus(Long statusId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response getOfferDetails(String deviceId,Long accountId,Long offerId,Long offerLocationId,Double distance,Double latitude,Double longitude,Boolean includeOfferLocations,Boolean includeRetailerLocations,Boolean includeChildOffers,SecurityContext securityContext)
      throws NotFoundException;
      Response getOfferListCounts(Double latitude,Double longitude,BigDecimal searchRange,String distanceUnit,SecurityContext securityContext)
      throws NotFoundException;
      Response getOfferLocation(Long offerLocationId,String udid,SecurityContext securityContext)
      throws NotFoundException;
      Response getOfferTransactionStatus(Long statusId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response searchOfferTransactionStatuses(String deviceId,Long accountId,Double latitude,Double longitude,String keyword,String role,String appKey,String sortField,Boolean descending,Integer start,Integer limit,Boolean includeInactive,SecurityContext securityContext)
      throws NotFoundException;
      Response searchOffersForConsumer(Double latitude,Double longitude,String recommendationType,Long locationId,Integer start,Integer limit,Integer maxRecommendations,String distanceUnit,String appKey,String deviceId,Long accountId,Double searchRange,String tags,String supportedPostalCodes,String keyword,String categories,String filters,String offerTypes,String type,String sortField,String recommendOfferIds,String retailerLocationIds,Long offerId,Boolean includeMission,Boolean includeCategories,Boolean includeFilters,Boolean includeExpired,Boolean includeFavorite,Boolean closestOfferOnly,String searchExpression,String groupBy,SecurityContext securityContext)
      throws NotFoundException;
      Response topOfferTransactions(Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response updateOfferTransactionStatus(String deviceId,Long accountId,Double latitude,Double longitude,Long statusId,String name,String description,Integer code,String role,Boolean active,String applicationIds,SecurityContext securityContext)
      throws NotFoundException;


}
