package org.openapitools.api;

import org.openapitools.model.AppResponse;
import java.math.BigDecimal;
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
@Path("/api/{version}/app")
@Api(value = "/", description = "")
public interface AppDataApi  {

    /**
     * Get App Data
     *
     * Get the application data structure.  The basic structure is a   node tree, with the root node being a AppResponse.  The response contains   the user&#39;s profile, messages from the system, and a list of MissionResponse.    A mission can have any number of GameResponses but typically is a single   game type.  A game then has any number of PackResponses which help group   the game levels. Packs are then composed of any number of GameLevelResponses.     Using the various parameters can return the applications default mission   (built-in packs to play), the list of community levels published, the user&#39;s   saved levels, or explicity levels desired.  You can choose to include the   profile or not, or just return parts of the profile.  You can also filter   out game levels that have been published with a higher version of the application.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get App Data", tags={ "AppData" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AppResponse.class) })
    public AppResponse getAppData(@PathParam("version") BigDecimal version, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l, @QueryParam("gameObjectCount") Boolean gameObjectCount, @QueryParam("filter") String filter, @QueryParam("dateCreated") Long dateCreated, @QueryParam("ownerId") Long ownerId, @QueryParam("missionIds") String missionIds, @QueryParam("gameIds") String gameIds, @QueryParam("packIds") String packIds, @QueryParam("gameLevelIds") String gameLevelIds, @QueryParam("appVersion") String appVersion, @QueryParam("includeHigherVersionPacks") Boolean includeHigherVersionPacks, @QueryParam("includeHigherVersionLevels") Boolean includeHigherVersionLevels, @QueryParam("responseGroups") String responseGroups, @QueryParam("purchaseType") String purchaseType);

    /**
     * Create App Data
     *
     * Publish the application data structure.  Can be used to save levels   and scores.  It then returns the application data structure.  The basic   structure is a node tree, with the root node being a AppResponse.  The response   contains the user&#39;s profile, messages from the system, and a list of MissionResponse.    A mission can have any number of GameResponses but typically is a single   game type.  A game then has any number of PackResponses which help group   the game levels. Packs are then composed of any number of GameLevelResponses.      Using the various parameters can return the applications default mission   (built-in packs to play), the list of community levels published, the user&#39;s   saved levels, or explicity levels desired.  You can choose to include the   profile or not, or just return parts of the profile.  You can also filter   out game levels that have been published with a higher version of the application
     *
     */
    @POST
    @Path("/post")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create App Data", tags={ "AppData" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AppResponse.class) })
    public AppResponse postAppData(@PathParam("version") BigDecimal version, @QueryParam("gameType") @NotNull String gameType, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("data") @NotNull String data, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l, @QueryParam("gameObjectCount") Boolean gameObjectCount, @QueryParam("filter") String filter, @QueryParam("dateCreated") Long dateCreated, @QueryParam("ownerId") Long ownerId, @QueryParam("missionIds") String missionIds, @QueryParam("gameIds") String gameIds, @QueryParam("packIds") String packIds, @QueryParam("gameLevelIds") String gameLevelIds, @QueryParam("appVersion") String appVersion, @QueryParam("includeHigherVersionPacks") Boolean includeHigherVersionPacks, @QueryParam("includeHigherVersionLevels") Boolean includeHigherVersionLevels, @QueryParam("responseGroups") String responseGroups, @QueryParam("purchaseType") String purchaseType);

    /**
     * Regenerate App Data
     *
     * Regenerate the app data cache for apps
     *
     */
    @POST
    @Path("/regen")
    @Produces({ "*/*" })
    @ApiOperation(value = "Regenerate App Data", tags={ "AppData" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse regenAppData(@PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("buildVersion") String buildVersion, @QueryParam("apiVersion") String apiVersion);
}
