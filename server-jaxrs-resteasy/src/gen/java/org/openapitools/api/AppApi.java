package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AppApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AppResponse;
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

@Path("/app")


@io.swagger.annotations.Api(description = "the app API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AppApi  {

    @Inject AppApiService service;

    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get App Data", notes = "Get the application data structure.  The basic structure is a   node tree, with the root node being a AppResponse.  The response contains   the user's profile, messages from the system, and a list of MissionResponse.    A mission can have any number of GameResponses but typically is a single   game type.  A game then has any number of PackResponses which help group   the game levels. Packs are then composed of any number of GameLevelResponses.     Using the various parameters can return the applications default mission   (built-in packs to play), the list of community levels published, the user's   saved levels, or explicity levels desired.  You can choose to include the   profile or not, or just return parts of the profile.  You can also filter   out game levels that have been published with a higher version of the application.", response = AppResponse.class, tags={ "AppData", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AppResponse.class) })
    public Response getAppData( @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l, @QueryParam("gameObjectCount") Boolean gameObjectCount, @QueryParam("filter") String filter, @QueryParam("dateCreated") Long dateCreated, @QueryParam("ownerId") Long ownerId, @QueryParam("missionIds") String missionIds, @QueryParam("gameIds") String gameIds, @QueryParam("packIds") String packIds, @QueryParam("gameLevelIds") String gameLevelIds, @QueryParam("appVersion") String appVersion, @QueryParam("includeHigherVersionPacks") Boolean includeHigherVersionPacks, @QueryParam("includeHigherVersionLevels") Boolean includeHigherVersionLevels, @QueryParam("responseGroups") String responseGroups, @QueryParam("purchaseType") String purchaseType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAppData(start,limit,deviceId,accountId,gameType,includeGameData,q,keyword,sortField,descending,i,l,gameObjectCount,filter,dateCreated,ownerId,missionIds,gameIds,packIds,gameLevelIds,appVersion,includeHigherVersionPacks,includeHigherVersionLevels,responseGroups,purchaseType,securityContext);
    }
    @POST
    @Path("/post")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create App Data", notes = "Publish the application data structure.  Can be used to save levels   and scores.  It then returns the application data structure.  The basic   structure is a node tree, with the root node being a AppResponse.  The response   contains the user's profile, messages from the system, and a list of MissionResponse.    A mission can have any number of GameResponses but typically is a single   game type.  A game then has any number of PackResponses which help group   the game levels. Packs are then composed of any number of GameLevelResponses.      Using the various parameters can return the applications default mission   (built-in packs to play), the list of community levels published, the user's   saved levels, or explicity levels desired.  You can choose to include the   profile or not, or just return parts of the profile.  You can also filter   out game levels that have been published with a higher version of the application", response = AppResponse.class, tags={ "AppData", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AppResponse.class) })
    public Response postAppData( @NotNull @QueryParam("gameType") String gameType, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("data") String data, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l, @QueryParam("gameObjectCount") Boolean gameObjectCount, @QueryParam("filter") String filter, @QueryParam("dateCreated") Long dateCreated, @QueryParam("ownerId") Long ownerId, @QueryParam("missionIds") String missionIds, @QueryParam("gameIds") String gameIds, @QueryParam("packIds") String packIds, @QueryParam("gameLevelIds") String gameLevelIds, @QueryParam("appVersion") String appVersion, @QueryParam("includeHigherVersionPacks") Boolean includeHigherVersionPacks, @QueryParam("includeHigherVersionLevels") Boolean includeHigherVersionLevels, @QueryParam("responseGroups") String responseGroups, @QueryParam("purchaseType") String purchaseType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postAppData(gameType,start,limit,data,deviceId,accountId,includeGameData,q,keyword,sortField,descending,i,l,gameObjectCount,filter,dateCreated,ownerId,missionIds,gameIds,packIds,gameLevelIds,appVersion,includeHigherVersionPacks,includeHigherVersionLevels,responseGroups,purchaseType,securityContext);
    }
    @POST
    @Path("/regen")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Regenerate App Data", notes = "Regenerate the app data cache for apps", response = SirqulResponse.class, tags={ "AppData", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response regenAppData( @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("buildVersion") String buildVersion, @QueryParam("apiVersion") String apiVersion,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.regenAppData(accountId,appKey,buildVersion,apiVersion,securityContext);
    }
}
