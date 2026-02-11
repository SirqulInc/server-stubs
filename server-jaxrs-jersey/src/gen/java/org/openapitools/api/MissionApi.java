package org.openapitools.api;

import org.openapitools.api.MissionApiService;
import org.openapitools.api.factories.MissionApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.MissionFormatResponse;
import org.openapitools.model.MissionResponse;
import org.openapitools.model.SirqulResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/mission")


@io.swagger.annotations.Api(description = "the mission API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class MissionApi  {
   private final MissionApiService delegate;

   public MissionApi(@Context ServletConfig servletContext) {
      MissionApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("MissionApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (MissionApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = MissionApiServiceFactory.getMissionApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Mission", notes = "Create a user defined mission.", response = MissionResponse.class, tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class)
    })
    public Response createMission(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The title of the mission", required = true) @QueryParam("title") @NotNull  String title,@ApiParam(value = "The description of the mission") @QueryParam("description")  String description,@ApiParam(value = "Custom string client apps can use for searching/filtering missions") @QueryParam("subType")  String subType,@ApiParam(value = "The date/time to start the mission, send 0 to unset") @QueryParam("startDate")  Long startDate,@ApiParam(value = "The date/time to end the mission, send 0 to unset") @QueryParam("endDate")  Long endDate,@ApiParam(value = "Activate/deactivate the mission") @QueryParam("active")  Boolean active,@ApiParam(value = "the game level ids to include in the mission, comma separated") @QueryParam("gameLevelIds")  String gameLevelIds,@ApiParam(value = "creatives to associate with the mission") @QueryParam("creativeIds")  String creativeIds,@ApiParam(value = "audiences to associate with the mission") @QueryParam("audienceIds")  String audienceIds,@ApiParam(value = "This parameter is deprecated.") @QueryParam("missionTask")  String missionTask,@ApiParam(value = "The string identifier for a mission format (this is not the missionFormatId)") @QueryParam("formatType")  String formatType,@ApiParam(value = "The offerId to give as a reward") @QueryParam("offerId")  Long offerId,@ApiParam(value = "Set the amount of money available to spend, once 0 deactivate mission. Set to a negative value for unlimited.") @QueryParam("balance")  Double balance,@ApiParam(value = "Flag to mark the mission as eligible for advanced reporting") @QueryParam("advancedReporting")  Boolean advancedReporting,@ApiParam(value = "Flag to indicate owner should receive tickets for completed missions") @QueryParam("allocateTickets")  Boolean allocateTickets,@ApiParam(value = "The number of tickets to reward") @QueryParam("ticketCount")  Long ticketCount,@ApiParam(value = "The type of ticket to reward, null means default type") @QueryParam("ticketType")  String ticketType,@ApiParam(value = "The number of points to award for completing a mission") @QueryParam("points")  Long points,@ApiParam(value = "external custom client defined data") @QueryParam("metaData")  String metaData,@ApiParam(value = "Comma separated list of application ids") @QueryParam("applicationIds")  String applicationIds,@ApiParam(value = "Deprecated parameter for device names") @QueryParam("devices")  String devices,@ApiParam(value = "Comma separated list of device ids") @QueryParam("deviceIds")  String deviceIds,@ApiParam(value = "Comma separated list of device version ranges") @QueryParam("deviceVersions")  String deviceVersions,@ApiParam(value = "List of lat/long pairs for mission locations") @QueryParam("locations")  String locations,@ApiParam(value = "Comma separated list of radii for locations") @QueryParam("radius")  String radius,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createMission(accountId, title, description, subType, startDate, endDate, active, gameLevelIds, creativeIds, audienceIds, missionTask, formatType, offerId, balance, advancedReporting, allocateTickets, ticketCount, ticketType, points, metaData, applicationIds, devices, deviceIds, deviceVersions, locations, radius, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/invite/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Mission Invite", notes = "Create the mission invite. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided.", response = MissionResponse.class, tags={ "Mission Invite", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class)
    })
    public Response createMissionInvite(@ApiParam(value = "the device id (deviceId or accountId required).") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required).") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The mission to find the invite for.") @QueryParam("missionId")  Long missionId,@ApiParam(value = "code to be entered for user to join the mission") @QueryParam("joinCode")  String joinCode,@ApiParam(value = "Include the game level data with the mission.") @QueryParam("includeGameData")  Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createMissionInvite(deviceId, accountId, missionId, joinCode, includeGameData, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Mission", notes = "Delete a mission.", response = SirqulResponse.class, tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteMission(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the mission to delete", required = true) @QueryParam("missionId") @NotNull  Long missionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteMission(accountId, missionId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/invite/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Mission Invite", notes = "Update the mission invite status to quit.", response = SirqulResponse.class, tags={ "Mission Invite", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteMissionInvite(@ApiParam(value = "the device id (deviceId or accountId required).") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required).") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The mission to find the invite for (missionId or missionInviteId requried).") @QueryParam("missionId")  Long missionId,@ApiParam(value = "The mission invite id. This checks on the user's billable for permission (missionId or missionInviteId requried).") @QueryParam("missionInviteId")  Long missionInviteId,@ApiParam(value = "Include the game level data with the mission.") @QueryParam("includeGameData")  Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteMissionInvite(deviceId, accountId, missionId, missionInviteId, includeGameData, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/find")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Find Missions", notes = "Get a set of ad filtered by the parameters provided.", response = MissionResponse.class, tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class)
    })
    public Response findMissions(@ApiParam(value = "The application key, if provided return missions specific for the app. Will always return mission levels that are app agnostic.", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The type of mission to get, possible values are: click_banner, click_leaderboard, click_skyscraper, click_full, click_video, or click_zip") @QueryParam("suffix")  String suffix,@ApiParam(value = "The type of ads to get, possible values are: BANNER, LEADERBOARD, SKYSCRAPER, FULL, VIDEO, ZIP, CONFIG. Use this instead of suffix.") @QueryParam("type")  String type,@ApiParam(value = "The logged in user.") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The version of the application, will not return levels newer than the appVersion.") @QueryParam("appVersion")  String appVersion,@ApiParam(value = "The current location of the requesting device") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current location of the requesting device") @QueryParam("longitude")  Double longitude,@ApiParam(value = "Should use deviceId if possible. The name of the requesting device; possible values are: Android, iPhone, iPad, iPod, etc. use /audience/devices for list.") @QueryParam("device")  String device,@ApiParam(value = "The device ID of the requesting device, use /audience/devices for list") @QueryParam("deviceIdentifier")  Long deviceIdentifier,@ApiParam(value = "The requesting device version; examples are: 2.3, 5.1.4, 6.1.4. Supports X, X.X, or X.X.X formated string.") @QueryParam("deviceVersion")  String deviceVersion,@ApiParam(value = "The index into the record set to start with.") @QueryParam("start")  Integer start,@ApiParam(value = "The total number of record to return.") @QueryParam("limit")  Integer limit,@ApiParam(value = "Include the game level data with the mission.") @QueryParam("includeGameData")  Boolean includeGameData,@ApiParam(value = "If true then return the audience data in the response. Default is false.") @QueryParam("includeAudiences")  Boolean includeAudiences,@ApiParam(value = "If true/false only return missions whose game levels allocate (or don't allocate) tickets. Do not provide a value to return both.") @QueryParam("allocatesTickets")  Boolean allocatesTickets,@ApiParam(value = "return a random set of results, default is true. If false returns in natural order.") @QueryParam("randomize")  Boolean randomize,@ApiParam(value = "return only ads targeted to the specific app, no global ads.") @QueryParam("targetedAdsOnly")  Boolean targetedAdsOnly,@ApiParam(value = "return only ads from the specified campaigns.") @QueryParam("missionIds")  String missionIds,@ApiParam(value = "will return the items that have at least 1 or all of their audiences exist in the logged in user’s audiences, depending if the value is OR or AND") @QueryParam("audienceOperator")  String audienceOperator,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.findMissions(appKey, suffix, type, accountId, appVersion, latitude, longitude, device, deviceIdentifier, deviceVersion, start, limit, includeGameData, includeAudiences, allocatesTickets, randomize, targetedAdsOnly, missionIds, audienceOperator, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Mission", notes = "Get a mission.", response = MissionResponse.class, tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class)
    })
    public Response getMission(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The id of the mission to return.", required = true) @QueryParam("missionId") @NotNull  Long missionId,@ApiParam(value = "Return creatives associated with the mission when true") @QueryParam("returnCreative")  Boolean returnCreative,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getMission(accountId, missionId, returnCreative, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/invite/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Mission Invite", notes = "Get the mission invite. An account can only be invited to a mission one time.", response = MissionResponse.class, tags={ "Mission Invite", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class)
    })
    public Response getMissionInvite(@ApiParam(value = "the device id (deviceId or accountId required).") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required).") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The mission to find the invite for (missionId or missionInviteId requried).") @QueryParam("missionId")  Long missionId,@ApiParam(value = "The mission invite id. This checks on the user's billable for permission (missionId or missionInviteId requried).") @QueryParam("missionInviteId")  Long missionInviteId,@ApiParam(value = "Include the game level data with the mission.") @QueryParam("includeGameData")  Boolean includeGameData,@ApiParam(value = "include the scores with the mission") @QueryParam("includeScores")  String includeScores,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getMissionInvite(deviceId, accountId, missionId, missionInviteId, includeGameData, includeScores, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/import")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Import Mission", notes = "Create a mission using a source item such as an offer location.", response = SirqulResponse.class, tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response importMission(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The current location of the requesting device", required = true) @QueryParam("latitude") @NotNull  Double latitude,@ApiParam(value = "The current location of the requesting device", required = true) @QueryParam("longitude") @NotNull  Double longitude,@ApiParam(value = "the application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "the keyword of the mission") @QueryParam("keyword")  String keyword,@ApiParam(value = "The starting index in the result set to return. Default is 0.") @QueryParam("start")  Integer start,@ApiParam(value = "The total number of records to return. Default is 20.") @QueryParam("limit")  Integer limit,@ApiParam(value = "the size of the ad", allowableValues="CONFIG, BANNER, LEADERBOARD, SKYSCRAPER, VIDEO, ZIP, INTERSTITIAL, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, CUSTOM6, CUSTOM7, CUSTOM8, CUSTOM9, CUSTOM10") @QueryParam("adSize")  String adSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.importMission(accountId, latitude, longitude, appKey, keyword, start, limit, adSize, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/format/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Mission Formats", notes = "Searches on pre-defined mission formats", response = MissionFormatResponse.class, responseContainer = "List", tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionFormatResponse.class, responseContainer = "List")
    })
    public Response searchMissionFormats(@ApiParam(value = "The starting index in the result set to return. Default is 0.", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The total number of records to return. Default is 20.", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "Determines whether to return only active results. Default is false.", required = true) @QueryParam("activeOnly") @NotNull  Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchMissionFormats(start, limit, activeOnly, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/invite/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Mission Invites", notes = "Get a list of mission invites that the account has.", response = MissionResponse.class, responseContainer = "List", tags={ "Mission Invite", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class, responseContainer = "List")
    })
    public Response searchMissionInvites(@ApiParam(value = "the device id (deviceId or accountId required).") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required).") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the app to retrieve the data for, use your application key.") @QueryParam("appKey")  String appKey,@ApiParam(value = "the application version, used to version the game level data") @QueryParam("appVersion")  String appVersion,@ApiParam(value = "the mission id to filter on") @QueryParam("missionId")  Long missionId,@ApiParam(value = "The invite status to filter for, comma separated list {AVAILABLE, PENDING, UPDATED, ACCEPTED, ACTIVE, QUIT, COMPLETED, PENDING_REVIEW, REJECTED}") @QueryParam("status")  String status,@ApiParam(value = "Only return invites that have been updated since this date/time (long)") @QueryParam("lastUpdated")  Long lastUpdated,@ApiParam(value = "The index into the record set to start with.") @QueryParam("start")  Integer start,@ApiParam(value = "The total number of record to return.") @QueryParam("limit")  Integer limit,@ApiParam(value = "the keyword to search on") @QueryParam("keyword")  String keyword,@ApiParam(value = "") @QueryParam("missionTypes")  String missionTypes,@ApiParam(value = "filter results by the account's billable") @QueryParam("filterByBillable")  Boolean filterByBillable,@ApiParam(value = "Include the game level data with the mission.") @QueryParam("includeGameData")  Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchMissionInvites(deviceId, accountId, appKey, appVersion, missionId, status, lastUpdated, start, limit, keyword, missionTypes, filterByBillable, includeGameData, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Missions", notes = "Get the list missions available to the account.  ", response = MissionResponse.class, responseContainer = "List", tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class, responseContainer = "List")
    })
    public Response searchMissions(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Filter by keyword") @QueryParam("keyword")  String keyword,@ApiParam(value = "Custom string client apps can use for searching/filtering missions") @QueryParam("subType")  String subType,@ApiParam(value = "The index into the record set to start with. Default is 0.") @QueryParam("start")  Integer start,@ApiParam(value = "The total number of record to return. Default is 20, maximum is 100.") @QueryParam("limit")  Integer limit,@ApiParam(value = "If true then return the game level data in the response. Default is false.") @QueryParam("includeGameData")  Boolean includeGameData,@ApiParam(value = "If true then return the audience data in the response. Default is false.") @QueryParam("includeAudiences")  Boolean includeAudiences,@ApiParam(value = "If true then include inactive missions. Default is false.") @QueryParam("includeInactive")  Boolean includeInactive,@ApiParam(value = "A list of game types to include; click_leaderboard, click_banner, click_skyscraper, click_full, click_video, click_zip, create, vote, question, invite, share, json, xml") @QueryParam("suffix")  String suffix,@ApiParam(value = "The field to sort the search on (for example TITLE)") @QueryParam("sortField")  String sortField,@ApiParam(value = "Whether to sort in descending order (default true)") @QueryParam("descending")  Boolean descending,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchMissions(accountId, keyword, subType, start, limit, includeGameData, includeAudiences, includeInactive, suffix, sortField, descending, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/searchByBillableEntity")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Missions by Billable Entity", notes = "Use the accountId to determine the associated BillableEntity.  From there get a list of all accounts associated as managers.  Get the list missions owned by all associated managers.", response = MissionResponse.class, responseContainer = "List", tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class, responseContainer = "List")
    })
    public Response searchMissionsByBillableEntity(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Filter by keyword") @QueryParam("keyword")  String keyword,@ApiParam(value = "The index into the record set to start with. Default is 0.") @QueryParam("start")  Integer start,@ApiParam(value = "The total number of record to return. Default id 20.") @QueryParam("limit")  Integer limit,@ApiParam(value = "If true then return the game level data in the response. Default is false.") @QueryParam("includeGameData")  Boolean includeGameData,@ApiParam(value = "If true then return the audience data in the response. Default is false.") @QueryParam("includeAudiences")  Boolean includeAudiences,@ApiParam(value = "If true then include inactive missions. Default is false.") @QueryParam("includeInactive")  Boolean includeInactive,@ApiParam(value = "A list of game types to include; click_leaderboard, click_banner, click_skyscraper, click_full, click_video, click_zip, create, vote, question, invite, share, json, xml") @QueryParam("suffix")  String suffix,@ApiParam(value = "The field to sort the search on (for example TITLE)") @QueryParam("sortField")  String sortField,@ApiParam(value = "Whether to sort in descending order (default true)") @QueryParam("descending")  Boolean descending,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchMissionsByBillableEntity(accountId, keyword, start, limit, includeGameData, includeAudiences, includeInactive, suffix, sortField, descending, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Mission", notes = "Update a mission.", response = MissionResponse.class, tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class)
    })
    public Response updateMission(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The id of the mission to update.", required = true) @QueryParam("missionId") @NotNull  Long missionId,@ApiParam(value = "The title of the mission") @QueryParam("title")  String title,@ApiParam(value = "The description of the mission") @QueryParam("description")  String description,@ApiParam(value = "Custom string client apps can use for searching/filtering missions") @QueryParam("subType")  String subType,@ApiParam(value = "external custom client defined data") @QueryParam("metaData")  String metaData,@ApiParam(value = "The date/time to start the mission, send 0 to unset") @QueryParam("startDate")  Long startDate,@ApiParam(value = "The date/time to end the mission, send 0 to unset") @QueryParam("endDate")  Long endDate,@ApiParam(value = "Activate/deactivate the mission") @QueryParam("active")  Boolean active,@ApiParam(value = "the game level ids to include in the mission, comma separated") @QueryParam("gameLevelIds")  String gameLevelIds,@ApiParam(value = "") @QueryParam("creativeIds")  String creativeIds,@ApiParam(value = "") @QueryParam("audienceIds")  String audienceIds,@ApiParam(value = "The offerId to give as a reward") @QueryParam("offerId")  Long offerId,@ApiParam(value = "Replace the amount of money available to spend, once 0 deactivate mission. Set to a negative value for unlimited.") @QueryParam("balance")  Double balance,@ApiParam(value = "Flag to mark the mission as eligible for advanced reporting") @QueryParam("advancedReporting")  Boolean advancedReporting,@ApiParam(value = "Flag to indicate owner should receive tickets for completed missions") @QueryParam("allocateTickets")  Boolean allocateTickets,@ApiParam(value = "The number of tickets to reward") @QueryParam("ticketCount")  Long ticketCount,@ApiParam(value = "The type of ticket to reward, null means default type") @QueryParam("ticketType")  String ticketType,@ApiParam(value = "The number of points to award for completing a mission") @QueryParam("points")  Long points,@ApiParam(value = "Comma separated list of application ids") @QueryParam("applicationIds")  String applicationIds,@ApiParam(value = "Deprecated parameter for device names") @QueryParam("devices")  String devices,@ApiParam(value = "Comma separated list of device ids") @QueryParam("deviceIds")  String deviceIds,@ApiParam(value = "Comma separated list of device version ranges") @QueryParam("deviceVersions")  String deviceVersions,@ApiParam(value = "List of lat/long pairs for mission locations") @QueryParam("locations")  String locations,@ApiParam(value = "Comma separated list of radii for locations") @QueryParam("radius")  String radius,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateMission(accountId, missionId, title, description, subType, metaData, startDate, endDate, active, gameLevelIds, creativeIds, audienceIds, offerId, balance, advancedReporting, allocateTickets, ticketCount, ticketType, points, applicationIds, devices, deviceIds, deviceVersions, locations, radius, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/invite/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Mission Invite", notes = "Update the mission invite status. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided.", response = MissionResponse.class, tags={ "Mission Invite", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class)
    })
    public Response updateMissionInvite(@ApiParam(value = "the device id (deviceId or accountId required).") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required).") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "The mission to find the invite for (missionId or missionInviteId requried).") @QueryParam("missionId")  Long missionId,@ApiParam(value = "The mission invite id. This checks on the user's billable for permission (missionId or missionInviteId requried).") @QueryParam("missionInviteId")  Long missionInviteId,@ApiParam(value = "the pack id to find the invite for") @QueryParam("packId")  Long packId,@ApiParam(value = "the game level id to find the invite for") @QueryParam("gameLevelId")  Long gameLevelId,@ApiParam(value = "The invite status to filter for, comma separated list {AVAILABLE, PENDING, UPDATED, ACCEPTED, ACTIVE, QUIT, COMPLETED, PENDING_REVIEW, REJECTED}") @QueryParam("status")  String status,@ApiParam(value = "This is the content type for missions that require user submission. Note that user submitted content must require a status of PENDING_REVIEW to be accpeted. {ACCOUNT, GAMELEVEL, COLLECTION, ALBUM_CONTEST, THEME_DESCRIPTOR, ALBUM}") @QueryParam("permissionableType")  String permissionableType,@ApiParam(value = "The id of the content being submitted.") @QueryParam("permissionableId")  Long permissionableId,@ApiParam(value = "Include the game level data with the mission.") @QueryParam("includeGameData")  Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateMissionInvite(deviceId, accountId, appKey, missionId, missionInviteId, packId, gameLevelId, status, permissionableType, permissionableId, includeGameData, securityContext);
    }
}
