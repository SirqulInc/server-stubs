package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.MissionApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.MissionFormatResponse;
import org.openapitools.model.MissionResponse;
import org.openapitools.model.SirqulResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/mission")


@io.swagger.annotations.Api(description = "the mission API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class MissionApi  {

    @Inject MissionApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Mission", notes = "Create a user defined mission.", response = MissionResponse.class, tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class) })
    public Response createMission( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("subType") String subType, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("active") Boolean active, @QueryParam("gameLevelIds") String gameLevelIds, @QueryParam("creativeIds") String creativeIds, @QueryParam("audienceIds") String audienceIds, @QueryParam("missionTask") String missionTask, @QueryParam("formatType") String formatType, @QueryParam("offerId") Long offerId, @QueryParam("balance") Double balance, @QueryParam("advancedReporting") Boolean advancedReporting, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketCount") Long ticketCount, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points, @QueryParam("metaData") String metaData, @QueryParam("applicationIds") String applicationIds, @QueryParam("devices") String devices, @QueryParam("deviceIds") String deviceIds, @QueryParam("deviceVersions") String deviceVersions, @QueryParam("locations") String locations, @QueryParam("radius") String radius,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createMission(accountId,title,description,subType,startDate,endDate,active,gameLevelIds,creativeIds,audienceIds,missionTask,formatType,offerId,balance,advancedReporting,allocateTickets,ticketCount,ticketType,points,metaData,applicationIds,devices,deviceIds,deviceVersions,locations,radius,securityContext);
    }
    @POST
    @Path("/invite/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Mission Invite", notes = "Create the mission invite. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided.", response = MissionResponse.class, tags={ "Mission Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class) })
    public Response createMissionInvite( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("missionId") Long missionId, @QueryParam("joinCode") String joinCode, @QueryParam("includeGameData") Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createMissionInvite(deviceId,accountId,missionId,joinCode,includeGameData,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Mission", notes = "Delete a mission.", response = SirqulResponse.class, tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteMission( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("missionId") Long missionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteMission(accountId,missionId,securityContext);
    }
    @POST
    @Path("/invite/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Mission Invite", notes = "Update the mission invite status to quit.", response = SirqulResponse.class, tags={ "Mission Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteMissionInvite( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("missionId") Long missionId, @QueryParam("missionInviteId") Long missionInviteId, @QueryParam("includeGameData") Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteMissionInvite(deviceId,accountId,missionId,missionInviteId,includeGameData,securityContext);
    }
    @GET
    @Path("/find")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Find Missions", notes = "Get a set of ad filtered by the parameters provided.", response = MissionResponse.class, tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class) })
    public Response findMissions( @NotNull @QueryParam("appKey") String appKey, @QueryParam("suffix") String suffix, @QueryParam("type") String type, @QueryParam("accountId") Long accountId, @QueryParam("appVersion") String appVersion, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("device") String device, @QueryParam("deviceIdentifier") Long deviceIdentifier, @QueryParam("deviceVersion") String deviceVersion, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("includeAudiences") Boolean includeAudiences, @QueryParam("allocatesTickets") Boolean allocatesTickets, @QueryParam("randomize") Boolean randomize, @QueryParam("targetedAdsOnly") Boolean targetedAdsOnly, @QueryParam("missionIds") String missionIds, @QueryParam("audienceOperator") String audienceOperator,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.findMissions(appKey,suffix,type,accountId,appVersion,latitude,longitude,device,deviceIdentifier,deviceVersion,start,limit,includeGameData,includeAudiences,allocatesTickets,randomize,targetedAdsOnly,missionIds,audienceOperator,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Mission", notes = "Get a mission.", response = MissionResponse.class, tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class) })
    public Response getMission( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("missionId") Long missionId, @QueryParam("returnCreative") Boolean returnCreative,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getMission(accountId,missionId,returnCreative,securityContext);
    }
    @GET
    @Path("/invite/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Mission Invite", notes = "Get the mission invite. An account can only be invited to a mission one time.", response = MissionResponse.class, tags={ "Mission Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class) })
    public Response getMissionInvite( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("missionId") Long missionId, @QueryParam("missionInviteId") Long missionInviteId, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("includeScores") String includeScores,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getMissionInvite(deviceId,accountId,missionId,missionInviteId,includeGameData,includeScores,securityContext);
    }
    @POST
    @Path("/import")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Import Mission", notes = "Create a mission using a source item such as an offer location.", response = SirqulResponse.class, tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response importMission( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("latitude") Double latitude, @NotNull @QueryParam("longitude") Double longitude, @NotNull @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,, allowableValues="CONFIG, BANNER, LEADERBOARD, SKYSCRAPER, VIDEO, ZIP, INTERSTITIAL, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, CUSTOM6, CUSTOM7, CUSTOM8, CUSTOM9, CUSTOM10" @QueryParam("adSize") String adSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.importMission(accountId,latitude,longitude,appKey,keyword,start,limit,adSize,securityContext);
    }
    @GET
    @Path("/format/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Mission Formats", notes = "Searches on pre-defined mission formats", response = MissionFormatResponse.class, responseContainer = "List", tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionFormatResponse.class, responseContainer = "List") })
    public Response searchMissionFormats( @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchMissionFormats(start,limit,activeOnly,securityContext);
    }
    @GET
    @Path("/invite/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Mission Invites", notes = "Get a list of mission invites that the account has.", response = MissionResponse.class, responseContainer = "List", tags={ "Mission Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class, responseContainer = "List") })
    public Response searchMissionInvites( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("appVersion") String appVersion, @QueryParam("missionId") Long missionId, @QueryParam("status") String status, @QueryParam("lastUpdated") Long lastUpdated, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("keyword") String keyword, @QueryParam("missionTypes") String missionTypes, @QueryParam("filterByBillable") Boolean filterByBillable, @QueryParam("includeGameData") Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchMissionInvites(deviceId,accountId,appKey,appVersion,missionId,status,lastUpdated,start,limit,keyword,missionTypes,filterByBillable,includeGameData,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Missions", notes = "Get the list missions available to the account.  ", response = MissionResponse.class, responseContainer = "List", tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class, responseContainer = "List") })
    public Response searchMissions( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("subType") String subType, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("includeAudiences") Boolean includeAudiences, @QueryParam("includeInactive") Boolean includeInactive, @QueryParam("suffix") String suffix, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchMissions(accountId,keyword,subType,start,limit,includeGameData,includeAudiences,includeInactive,suffix,sortField,descending,securityContext);
    }
    @GET
    @Path("/searchByBillableEntity")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Missions by Billable Entity", notes = "Use the accountId to determine the associated BillableEntity.  From there get a list of all accounts associated as managers.  Get the list missions owned by all associated managers.", response = MissionResponse.class, responseContainer = "List", tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class, responseContainer = "List") })
    public Response searchMissionsByBillableEntity( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("includeAudiences") Boolean includeAudiences, @QueryParam("includeInactive") Boolean includeInactive, @QueryParam("suffix") String suffix, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchMissionsByBillableEntity(accountId,keyword,start,limit,includeGameData,includeAudiences,includeInactive,suffix,sortField,descending,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Mission", notes = "Update a mission.", response = MissionResponse.class, tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class) })
    public Response updateMission( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("missionId") Long missionId, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("subType") String subType, @QueryParam("metaData") String metaData, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("active") Boolean active, @QueryParam("gameLevelIds") String gameLevelIds, @QueryParam("creativeIds") String creativeIds, @QueryParam("audienceIds") String audienceIds, @QueryParam("offerId") Long offerId, @QueryParam("balance") Double balance, @QueryParam("advancedReporting") Boolean advancedReporting, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketCount") Long ticketCount, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points, @QueryParam("applicationIds") String applicationIds, @QueryParam("devices") String devices, @QueryParam("deviceIds") String deviceIds, @QueryParam("deviceVersions") String deviceVersions, @QueryParam("locations") String locations, @QueryParam("radius") String radius,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateMission(accountId,missionId,title,description,subType,metaData,startDate,endDate,active,gameLevelIds,creativeIds,audienceIds,offerId,balance,advancedReporting,allocateTickets,ticketCount,ticketType,points,applicationIds,devices,deviceIds,deviceVersions,locations,radius,securityContext);
    }
    @POST
    @Path("/invite/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Mission Invite", notes = "Update the mission invite status. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided.", response = MissionResponse.class, tags={ "Mission Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class) })
    public Response updateMissionInvite( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("missionId") Long missionId, @QueryParam("missionInviteId") Long missionInviteId, @QueryParam("packId") Long packId, @QueryParam("gameLevelId") Long gameLevelId, @QueryParam("status") String status, @QueryParam("permissionableType") String permissionableType, @QueryParam("permissionableId") Long permissionableId, @QueryParam("includeGameData") Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateMissionInvite(deviceId,accountId,appKey,missionId,missionInviteId,packId,gameLevelId,status,permissionableType,permissionableId,includeGameData,securityContext);
    }
}
