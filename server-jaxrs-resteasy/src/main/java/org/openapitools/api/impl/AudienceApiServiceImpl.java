package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.AgeGroupResponse;
import org.openapitools.model.AudienceDeviceResponse;
import org.openapitools.model.AudienceResponse;
import org.openapitools.model.OfferListResponse;
import org.openapitools.model.SearchResponse;
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
public class AudienceApiServiceImpl implements AudienceApiService {
      public Response createAudience(Long accountId,String name,String description,String searchTags,String gender,String ageGroups,String categoryIds,String applicationIds,String gameExperienceLevel,String devices,String deviceIds,String deviceVersions,String locations,String radius,Integer startTimeOffset,Integer endTimeOffset,Boolean sendSuggestion,String associateDescription,String associateType,Long associateId,String groupingId,String metaData,String visibility,String audienceType,Boolean useOrder,String cohortRegionsData,String appKey,String trilaterationTypes,Boolean uniqueName,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response deleteAudience(Long accountId,Long audienceId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getAgeGroups(SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getAudience(Long accountId,Long audienceId,String appKey,Boolean returnAccountCount,Boolean returnAlbumCount,String albumTypesForCount,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getAudienceList(Long accountId,String albumIds,String keyword,String keywordFields,String sortField,Boolean descending,Integer start,Integer limit,Boolean sendSuggestion,Boolean activeOnly,Boolean groupByGroupingId,String appKey,Boolean returnGlobal,Boolean exactKeyword,String audienceType,String audienceTypes,Boolean returnAccountCount,Boolean returnAlbumCount,String albumTypesForCount,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getDevices(Boolean includeInactive,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getExperiences(SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getGroupedAudiences(Long accountId,String audienceGroupingId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response listByAccount(Long accountId,Integer limit,String suggestionType,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response listByAudience(Integer limit,String gender,Integer age,String categoryIds,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response listLastestByAccount(Long accountId,Integer timeframe,String suggestionType,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response sendByAccount(Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updateAudience(Long accountId,Long audienceId,String name,String description,String searchTags,String gender,String ageGroups,String categoryIds,String applicationIds,String gameExperienceLevel,String devices,String deviceIds,String deviceVersions,String locations,String radius,Boolean active,Boolean sendSuggestion,Integer startTimeOffset,Integer endTimeOffset,String associateDescription,String associateType,Long associateId,String groupingId,String metaData,String visibility,String audienceType,Boolean useOrder,String cohortRegionsData,String appKey,String trilaterationTypes,Boolean uniqueName,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
