package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.MissionFormatResponse;
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
@Path("/api/{version}/mission")
@Api(value = "/", description = "")
public interface MissionApi  {

    /**
     * Create Mission
     *
     * Create a user defined mission.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Mission", tags={ "Mission" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class) })
    public MissionResponse createMission(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("title") @NotNull String title, @QueryParam("description") String description, @QueryParam("subType") String subType, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("active") Boolean active, @QueryParam("gameLevelIds") String gameLevelIds, @QueryParam("creativeIds") String creativeIds, @QueryParam("audienceIds") String audienceIds, @QueryParam("missionTask") String missionTask, @QueryParam("formatType") String formatType, @QueryParam("offerId") Long offerId, @QueryParam("balance") Double balance, @QueryParam("advancedReporting") Boolean advancedReporting, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketCount") Long ticketCount, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points, @QueryParam("metaData") String metaData, @QueryParam("applicationIds") String applicationIds, @QueryParam("devices") String devices, @QueryParam("deviceIds") String deviceIds, @QueryParam("deviceVersions") String deviceVersions, @QueryParam("locations") String locations, @QueryParam("radius") String radius);

    /**
     * Delete Mission
     *
     * Delete a mission.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Mission", tags={ "Mission" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteMission(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("missionId") @NotNull Long missionId);

    /**
     * Find Missions
     *
     * Get a set of ad filtered by the parameters provided.
     *
     */
    @GET
    @Path("/find")
    @Produces({ "*/*" })
    @ApiOperation(value = "Find Missions", tags={ "Mission" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class) })
    public MissionResponse findMissions(@PathParam("version") BigDecimal version, @QueryParam("appKey") @NotNull String appKey, @QueryParam("suffix") String suffix, @QueryParam("type") String type, @QueryParam("accountId") Long accountId, @QueryParam("appVersion") String appVersion, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("device") String device, @QueryParam("deviceIdentifier") Long deviceIdentifier, @QueryParam("deviceVersion") String deviceVersion, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("includeAudiences") Boolean includeAudiences, @QueryParam("allocatesTickets") Boolean allocatesTickets, @QueryParam("randomize") Boolean randomize, @QueryParam("targetedAdsOnly") Boolean targetedAdsOnly, @QueryParam("missionIds") String missionIds, @QueryParam("audienceOperator") String audienceOperator);

    /**
     * Get Mission
     *
     * Get a mission.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Mission", tags={ "Mission" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class) })
    public MissionResponse getMission(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("missionId") @NotNull Long missionId, @QueryParam("returnCreative") Boolean returnCreative);

    /**
     * Import Mission
     *
     * Create a mission using a source item such as an offer location.
     *
     */
    @POST
    @Path("/import")
    @Produces({ "*/*" })
    @ApiOperation(value = "Import Mission", tags={ "Mission" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse importMission(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("latitude") @NotNull Double latitude, @QueryParam("longitude") @NotNull Double longitude, @QueryParam("appKey") @NotNull String appKey, @QueryParam("keyword") String keyword, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("adSize") String adSize);

    /**
     * Search Mission Formats
     *
     * Searches on pre-defined mission formats
     *
     */
    @GET
    @Path("/format/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Mission Formats", tags={ "Mission" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MissionFormatResponse.class, responseContainer = "List") })
    public List<MissionFormatResponse> searchMissionFormats(@PathParam("version") BigDecimal version, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("activeOnly") @NotNull Boolean activeOnly);

    /**
     * Search Missions
     *
     * Get the list missions available to the account.  
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Missions", tags={ "Mission" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class, responseContainer = "List") })
    public List<MissionResponse> searchMissions(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("keyword") String keyword, @QueryParam("subType") String subType, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("includeAudiences") Boolean includeAudiences, @QueryParam("includeInactive") Boolean includeInactive, @QueryParam("suffix") String suffix, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending);

    /**
     * Search Missions by Billable Entity
     *
     * Use the accountId to determine the associated BillableEntity.  From there get a list of all accounts associated as managers.  Get the list missions owned by all associated managers.
     *
     */
    @GET
    @Path("/searchByBillableEntity")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Missions by Billable Entity", tags={ "Mission" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class, responseContainer = "List") })
    public List<MissionResponse> searchMissionsByBillableEntity(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("keyword") String keyword, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("includeAudiences") Boolean includeAudiences, @QueryParam("includeInactive") Boolean includeInactive, @QueryParam("suffix") String suffix, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending);

    /**
     * Update Mission
     *
     * Update a mission.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Mission", tags={ "Mission" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class) })
    public MissionResponse updateMission(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("missionId") @NotNull Long missionId, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("subType") String subType, @QueryParam("metaData") String metaData, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("active") Boolean active, @QueryParam("gameLevelIds") String gameLevelIds, @QueryParam("creativeIds") String creativeIds, @QueryParam("audienceIds") String audienceIds, @QueryParam("offerId") Long offerId, @QueryParam("balance") Double balance, @QueryParam("advancedReporting") Boolean advancedReporting, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketCount") Long ticketCount, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points, @QueryParam("applicationIds") String applicationIds, @QueryParam("devices") String devices, @QueryParam("deviceIds") String deviceIds, @QueryParam("deviceVersions") String deviceVersions, @QueryParam("locations") String locations, @QueryParam("radius") String radius);
}
