package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.MissionResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/api/{version}/mission/invite")
@Api(value = "/", description = "")
public interface MissionInviteApi  {

    /**
     * Create Mission Invite
     *
     * Create the mission invite. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Mission Invite", tags={ "Mission Invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class) })
    public MissionResponse createMissionInvite(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("missionId") Long missionId, @QueryParam("joinCode") String joinCode, @QueryParam("includeGameData") Boolean includeGameData);

    /**
     * Delete Mission Invite
     *
     * Update the mission invite status to quit.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Mission Invite", tags={ "Mission Invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteMissionInvite(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("missionId") Long missionId, @QueryParam("missionInviteId") Long missionInviteId, @QueryParam("includeGameData") Boolean includeGameData);

    /**
     * Get Mission Invite
     *
     * Get the mission invite. An account can only be invited to a mission one time.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Mission Invite", tags={ "Mission Invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class) })
    public MissionResponse getMissionInvite(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("missionId") Long missionId, @QueryParam("missionInviteId") Long missionInviteId, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("includeScores") String includeScores);

    /**
     * Search Mission Invites
     *
     * Get a list of mission invites that the account has.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Mission Invites", tags={ "Mission Invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class, responseContainer = "List") })
    public List<MissionResponse> searchMissionInvites(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("appVersion") String appVersion, @QueryParam("missionId") Long missionId, @QueryParam("status") String status, @QueryParam("lastUpdated") Long lastUpdated, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("keyword") String keyword, @QueryParam("missionTypes") String missionTypes, @QueryParam("filterByBillable") Boolean filterByBillable, @QueryParam("includeGameData") Boolean includeGameData);

    /**
     * Update Mission Invite
     *
     * Update the mission invite status. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Mission Invite", tags={ "Mission Invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class) })
    public MissionResponse updateMissionInvite(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("missionId") Long missionId, @QueryParam("missionInviteId") Long missionInviteId, @QueryParam("packId") Long packId, @QueryParam("gameLevelId") Long gameLevelId, @QueryParam("status") String status, @QueryParam("permissionableType") String permissionableType, @QueryParam("permissionableId") Long permissionableId, @QueryParam("includeGameData") Boolean includeGameData);
}
