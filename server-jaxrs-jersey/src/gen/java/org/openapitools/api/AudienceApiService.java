package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.AgeGroupResponse;
import org.openapitools.model.AudienceDeviceResponse;
import org.openapitools.model.AudienceResponse;
import org.openapitools.model.OfferListResponse;
import org.openapitools.model.SearchResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class AudienceApiService {
    public abstract Response createAudience( @NotNull Long accountId, @NotNull String name,String description,String searchTags,String gender,String ageGroups,String categoryIds,String applicationIds,String gameExperienceLevel,String devices,String deviceIds,String deviceVersions,String locations,String radius,Integer startTimeOffset,Integer endTimeOffset,Boolean sendSuggestion,String associateDescription,String associateType,Long associateId,String groupingId,String metaData,String visibility,String audienceType,Boolean useOrder,String cohortRegionsData,String appKey,String trilaterationTypes,Boolean uniqueName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteAudience( @NotNull Long accountId, @NotNull Long audienceId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAgeGroups(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAudience( @NotNull Long accountId, @NotNull Long audienceId,String appKey,Boolean returnAccountCount,Boolean returnAlbumCount,String albumTypesForCount,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAudienceList(Long accountId,String albumIds,String keyword,String keywordFields,String sortField,Boolean descending,Integer start,Integer limit,Boolean sendSuggestion,Boolean activeOnly,Boolean groupByGroupingId,String appKey,Boolean returnGlobal,Boolean exactKeyword,String audienceType,String audienceTypes,Boolean returnAccountCount,Boolean returnAlbumCount,String albumTypesForCount,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getDevices( @NotNull Boolean includeInactive,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getExperiences(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getGroupedAudiences( @NotNull Long accountId, @NotNull String audienceGroupingId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listByAccount( @NotNull Long accountId, @NotNull Integer limit, @NotNull String suggestionType,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listByAudience( @NotNull Integer limit,String gender,Integer age,String categoryIds,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listLastestByAccount( @NotNull Long accountId, @NotNull Integer timeframe, @NotNull String suggestionType,SecurityContext securityContext) throws NotFoundException;
    public abstract Response sendByAccount( @NotNull Long accountId, @NotNull Double latitude, @NotNull Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateAudience( @NotNull Long accountId, @NotNull Long audienceId,String name,String description,String searchTags,String gender,String ageGroups,String categoryIds,String applicationIds,String gameExperienceLevel,String devices,String deviceIds,String deviceVersions,String locations,String radius,Boolean active,Boolean sendSuggestion,Integer startTimeOffset,Integer endTimeOffset,String associateDescription,String associateType,Long associateId,String groupingId,String metaData,String visibility,String audienceType,Boolean useOrder,String cohortRegionsData,String appKey,String trilaterationTypes,Boolean uniqueName,SecurityContext securityContext) throws NotFoundException;
}
