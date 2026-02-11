package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.MissionFormatResponse;
import org.openapitools.model.MissionResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface MissionApiService {
      Response createMission(Long accountId,String title,String description,String subType,Long startDate,Long endDate,Boolean active,String gameLevelIds,String creativeIds,String audienceIds,String missionTask,String formatType,Long offerId,Double balance,Boolean advancedReporting,Boolean allocateTickets,Long ticketCount,String ticketType,Long points,String metaData,String applicationIds,String devices,String deviceIds,String deviceVersions,String locations,String radius,SecurityContext securityContext)
      throws NotFoundException;
      Response createMissionInvite(String deviceId,Long accountId,Long missionId,String joinCode,Boolean includeGameData,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteMission(Long accountId,Long missionId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteMissionInvite(String deviceId,Long accountId,Long missionId,Long missionInviteId,Boolean includeGameData,SecurityContext securityContext)
      throws NotFoundException;
      Response findMissions(String appKey,String suffix,String type,Long accountId,String appVersion,Double latitude,Double longitude,String device,Long deviceIdentifier,String deviceVersion,Integer start,Integer limit,Boolean includeGameData,Boolean includeAudiences,Boolean allocatesTickets,Boolean randomize,Boolean targetedAdsOnly,String missionIds,String audienceOperator,SecurityContext securityContext)
      throws NotFoundException;
      Response getMission(Long accountId,Long missionId,Boolean returnCreative,SecurityContext securityContext)
      throws NotFoundException;
      Response getMissionInvite(String deviceId,Long accountId,Long missionId,Long missionInviteId,Boolean includeGameData,String includeScores,SecurityContext securityContext)
      throws NotFoundException;
      Response importMission(Long accountId,Double latitude,Double longitude,String appKey,String keyword,Integer start,Integer limit,String adSize,SecurityContext securityContext)
      throws NotFoundException;
      Response searchMissionFormats(Integer start,Integer limit,Boolean activeOnly,SecurityContext securityContext)
      throws NotFoundException;
      Response searchMissionInvites(String deviceId,Long accountId,String appKey,String appVersion,Long missionId,String status,Long lastUpdated,Integer start,Integer limit,String keyword,String missionTypes,Boolean filterByBillable,Boolean includeGameData,SecurityContext securityContext)
      throws NotFoundException;
      Response searchMissions(Long accountId,String keyword,String subType,Integer start,Integer limit,Boolean includeGameData,Boolean includeAudiences,Boolean includeInactive,String suffix,String sortField,Boolean descending,SecurityContext securityContext)
      throws NotFoundException;
      Response searchMissionsByBillableEntity(Long accountId,String keyword,Integer start,Integer limit,Boolean includeGameData,Boolean includeAudiences,Boolean includeInactive,String suffix,String sortField,Boolean descending,SecurityContext securityContext)
      throws NotFoundException;
      Response updateMission(Long accountId,Long missionId,String title,String description,String subType,String metaData,Long startDate,Long endDate,Boolean active,String gameLevelIds,String creativeIds,String audienceIds,Long offerId,Double balance,Boolean advancedReporting,Boolean allocateTickets,Long ticketCount,String ticketType,Long points,String applicationIds,String devices,String deviceIds,String deviceVersions,String locations,String radius,SecurityContext securityContext)
      throws NotFoundException;
      Response updateMissionInvite(String deviceId,Long accountId,String appKey,Long missionId,Long missionInviteId,Long packId,Long gameLevelId,String status,String permissionableType,Long permissionableId,Boolean includeGameData,SecurityContext securityContext)
      throws NotFoundException;


}
