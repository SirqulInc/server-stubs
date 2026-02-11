package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.MissionFormatResponse;
import org.openapitools.model.MissionResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class MissionApiServiceImpl extends MissionApiService {
    @Override
    public Response createMission( @NotNull Long accountId,  @NotNull String title, String description, String subType, Long startDate, Long endDate, Boolean active, String gameLevelIds, String creativeIds, String audienceIds, String missionTask, String formatType, Long offerId, Double balance, Boolean advancedReporting, Boolean allocateTickets, Long ticketCount, String ticketType, Long points, String metaData, String applicationIds, String devices, String deviceIds, String deviceVersions, String locations, String radius, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createMissionInvite(String deviceId, Long accountId, Long missionId, String joinCode, Boolean includeGameData, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteMission( @NotNull Long accountId,  @NotNull Long missionId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteMissionInvite(String deviceId, Long accountId, Long missionId, Long missionInviteId, Boolean includeGameData, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response findMissions( @NotNull String appKey, String suffix, String type, Long accountId, String appVersion, Double latitude, Double longitude, String device, Long deviceIdentifier, String deviceVersion, Integer start, Integer limit, Boolean includeGameData, Boolean includeAudiences, Boolean allocatesTickets, Boolean randomize, Boolean targetedAdsOnly, String missionIds, String audienceOperator, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getMission( @NotNull Long accountId,  @NotNull Long missionId, Boolean returnCreative, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getMissionInvite(String deviceId, Long accountId, Long missionId, Long missionInviteId, Boolean includeGameData, String includeScores, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response importMission( @NotNull Long accountId,  @NotNull Double latitude,  @NotNull Double longitude,  @NotNull String appKey, String keyword, Integer start, Integer limit, String adSize, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response searchMissionFormats( @NotNull Integer start,  @NotNull Integer limit,  @NotNull Boolean activeOnly, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response searchMissionInvites(String deviceId, Long accountId, String appKey, String appVersion, Long missionId, String status, Long lastUpdated, Integer start, Integer limit, String keyword, String missionTypes, Boolean filterByBillable, Boolean includeGameData, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response searchMissions( @NotNull Long accountId, String keyword, String subType, Integer start, Integer limit, Boolean includeGameData, Boolean includeAudiences, Boolean includeInactive, String suffix, String sortField, Boolean descending, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response searchMissionsByBillableEntity( @NotNull Long accountId, String keyword, Integer start, Integer limit, Boolean includeGameData, Boolean includeAudiences, Boolean includeInactive, String suffix, String sortField, Boolean descending, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateMission( @NotNull Long accountId,  @NotNull Long missionId, String title, String description, String subType, String metaData, Long startDate, Long endDate, Boolean active, String gameLevelIds, String creativeIds, String audienceIds, Long offerId, Double balance, Boolean advancedReporting, Boolean allocateTickets, Long ticketCount, String ticketType, Long points, String applicationIds, String devices, String deviceIds, String deviceVersions, String locations, String radius, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateMissionInvite(String deviceId, Long accountId, String appKey, Long missionId, Long missionInviteId, Long packId, Long gameLevelId, String status, String permissionableType, Long permissionableId, Boolean includeGameData, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
