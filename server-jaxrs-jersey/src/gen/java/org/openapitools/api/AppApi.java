package org.openapitools.api;

import org.openapitools.api.AppApiService;
import org.openapitools.api.factories.AppApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AppResponse;
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

@Path("/app")


@io.swagger.annotations.Api(description = "the app API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AppApi  {
   private final AppApiService delegate;

   public AppApi(@Context ServletConfig servletContext) {
      AppApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AppApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AppApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = AppApiServiceFactory.getAppApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get App Data", notes = "Get the application data structure.  The basic structure is a   node tree, with the root node being a AppResponse.  The response contains   the user's profile, messages from the system, and a list of MissionResponse.    A mission can have any number of GameResponses but typically is a single   game type.  A game then has any number of PackResponses which help group   the game levels. Packs are then composed of any number of GameLevelResponses.     Using the various parameters can return the applications default mission   (built-in packs to play), the list of community levels published, the user's   saved levels, or explicity levels desired.  You can choose to include the   profile or not, or just return parts of the profile.  You can also filter   out game levels that have been published with a higher version of the application.", response = AppResponse.class, tags={ "AppData", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AppResponse.class)
    })
    public Response getAppData(@ApiParam(value = "start the search results at a record.", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "limit the search results to some number.", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "the device id (deviceId or accountId required).") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required).") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the game to retrieve the data for, use your application key.") @QueryParam("gameType")  String gameType,@ApiParam(value = "if true then include the game data blob, otherwise don't include.") @QueryParam("includeGameData")  Boolean includeGameData,@ApiParam(value = "This parameter is deprecated.") @QueryParam("q")  String q,@ApiParam(value = "query string used to filter the search results when looking for community and saved levels.") @QueryParam("keyword")  String keyword,@ApiParam(value = "how to sort the results when looking for community and saved levels. possible values are: LEVEL_NAME, LEVEL_CREATED, LEVEL_UPDATED, LEVEL_LIKES, LEVEL_DISLIKES, LEVEL_NOTES, LEVEL_PLAYS.") @QueryParam("sortField")  String sortField,@ApiParam(value = "order the search results descending or ascending when looking for community and saved levels.") @QueryParam("descending")  Boolean descending,@ApiParam(value = "This parameter is deprecated.") @QueryParam("_i")  Integer i,@ApiParam(value = "This parameter is deprecated.") @QueryParam("_l")  Integer l,@ApiParam(value = "if true then include the game object count, otherwise don't include.") @QueryParam("gameObjectCount")  Boolean gameObjectCount,@ApiParam(value = "restrict the search to items with certain permissions, possible values are: MINE, FRIENDS, PUBLIC, ALL_PUBLIC, ALL, LIKED") @QueryParam("filter")  String filter,@ApiParam(value = "restrict the search to items created less then date") @QueryParam("dateCreated")  Long dateCreated,@ApiParam(value = "get levels owned by a particular account") @QueryParam("ownerId")  Long ownerId,@ApiParam(value = "get missions by specified id, comman seperated list of long ids") @QueryParam("missionIds")  String missionIds,@ApiParam(value = "get games by specified id, comman seperated list of long ids") @QueryParam("gameIds")  String gameIds,@ApiParam(value = "get packs by specified id, comman seperated list of long ids") @QueryParam("packIds")  String packIds,@ApiParam(value = "get game levels by specified id, comman seperated list of long ids") @QueryParam("gameLevelIds")  String gameLevelIds,@ApiParam(value = "the application version, used to versin the game level data") @QueryParam("appVersion")  String appVersion,@ApiParam(value = "default is false and will not include any packs that have levels above the specified appVersion. If true then will return all levels regardless of version.") @QueryParam("includeHigherVersionPacks")  Boolean includeHigherVersionPacks,@ApiParam(value = "default is false and will not include any levels above the specified appVersion. If true then will return all levels regardless of version.") @QueryParam("includeHigherVersionLevels")  Boolean includeHigherVersionLevels,@ApiParam(value = "use response groups to include large parts of the structure. possible values are: * MISSION_DEFAULT (default) - include the default mission (built-in packs), excludes all other mission groups * MISSION_DEFAULT_LEVELS_SAVED - include saved levels, excludes all other mission groups * MISSION_DEFAULT_LEVELS_COMMUNITY - include community levels, excludes all other mission groups * MISSION_INVITED (default) - include challenges sent to user * PROFILE (default) - include entire profile * PROFILE_DATA - only include profile date (exclude friends) * PROFILE_FRIENDS - include friends list ") @QueryParam("responseGroups")  String responseGroups,@ApiParam(value = "the will return the correct in app purchases for the device, possible values are: * SIRQUL (default) - purchasing from the sirqul store using tickets * IOS - purchasing from the itunes store for iPhone, iPod, iPod Touch * GOOGLE - purchasing from the google android store * AMAZON - purchasing from the amazon android store * MAC - purchasing from the itunes store for OSX * FREE - the item is free to purchase ") @QueryParam("purchaseType")  String purchaseType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAppData(start, limit, deviceId, accountId, gameType, includeGameData, q, keyword, sortField, descending, i, l, gameObjectCount, filter, dateCreated, ownerId, missionIds, gameIds, packIds, gameLevelIds, appVersion, includeHigherVersionPacks, includeHigherVersionLevels, responseGroups, purchaseType, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/post")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create App Data", notes = "Publish the application data structure.  Can be used to save levels   and scores.  It then returns the application data structure.  The basic   structure is a node tree, with the root node being a AppResponse.  The response   contains the user's profile, messages from the system, and a list of MissionResponse.    A mission can have any number of GameResponses but typically is a single   game type.  A game then has any number of PackResponses which help group   the game levels. Packs are then composed of any number of GameLevelResponses.      Using the various parameters can return the applications default mission   (built-in packs to play), the list of community levels published, the user's   saved levels, or explicity levels desired.  You can choose to include the   profile or not, or just return parts of the profile.  You can also filter   out game levels that have been published with a higher version of the application", response = AppResponse.class, tags={ "AppData", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AppResponse.class)
    })
    public Response postAppData(@ApiParam(value = "the game to retrieve the data for, use your application key.", required = true) @QueryParam("gameType") @NotNull  String gameType,@ApiParam(value = "start the search results at a record.", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "limit the search results to some number.", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "The analytic data AnalyticListResponse", required = true) @QueryParam("data") @NotNull  String data,@ApiParam(value = "the device id (deviceId or accountId required).") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required).") @QueryParam("accountId")  Long accountId,@ApiParam(value = "if true then include the game data blob, otherwise don't include.") @QueryParam("includeGameData")  Boolean includeGameData,@ApiParam(value = "This parameter is deprecated.") @QueryParam("q")  String q,@ApiParam(value = "query string used to filter the search results when looking for community and saved levels.") @QueryParam("keyword")  String keyword,@ApiParam(value = "how to sort the results when looking for community and saved levels. possible values are: LEVEL_NAME, LEVEL_CREATED, LEVEL_UPDATED, LEVEL_LIKES, LEVEL_DISLIKES, LEVEL_NOTES, LEVEL_PLAYS.") @QueryParam("sortField")  String sortField,@ApiParam(value = "order the search results descending or ascending when looking for community and saved levels.") @QueryParam("descending")  Boolean descending,@ApiParam(value = "This parameter is deprecated.") @QueryParam("_i")  Integer i,@ApiParam(value = "This parameter is deprecated.") @QueryParam("_l")  Integer l,@ApiParam(value = "if true then include the game object count, otherwise don't include.") @QueryParam("gameObjectCount")  Boolean gameObjectCount,@ApiParam(value = "restrict the search to items with certain permissions, possible values are: MINE, FRIENDS, PUBLIC, ALL_PUBLIC, ALL, LIKED") @QueryParam("filter")  String filter,@ApiParam(value = "restrict the search to items created less then date") @QueryParam("dateCreated")  Long dateCreated,@ApiParam(value = "get levels owned by a particular account") @QueryParam("ownerId")  Long ownerId,@ApiParam(value = "get missions by specified id, comman seperated list of long ids") @QueryParam("missionIds")  String missionIds,@ApiParam(value = "get games by specified id, comman seperated list of long ids") @QueryParam("gameIds")  String gameIds,@ApiParam(value = "get packs by specified id, comman seperated list of long ids") @QueryParam("packIds")  String packIds,@ApiParam(value = "get game levels by specified id, comman seperated list of long ids") @QueryParam("gameLevelIds")  String gameLevelIds,@ApiParam(value = "the application version, used to versin the game level data") @QueryParam("appVersion")  String appVersion,@ApiParam(value = "default is false and will not include any packs that have levels above the specified appVersion. If true then will return all levels regardless of version.") @QueryParam("includeHigherVersionPacks")  Boolean includeHigherVersionPacks,@ApiParam(value = "default is false and will not include any levels above the specified appVersion. If true then will return all levels regardless of version.") @QueryParam("includeHigherVersionLevels")  Boolean includeHigherVersionLevels,@ApiParam(value = "use response groups to include large parts of the structure. possible values are: * MISSION_DEFAULT (default) - include the default mission (built-in packs), excludes all other mission groups * MISSION_DEFAULT_LEVELS_SAVED - include saved levels, excludes all other mission groups * MISSION_DEFAULT_LEVELS_COMMUNITY - include community levels, excludes all other mission groups * MISSION_INVITED (default) - include challenges sent to user * PROFILE (default) - include entire profile * PROFILE_DATA - only include profile date (exclude friends) * PROFILE_FRIENDS - include friends list ") @QueryParam("responseGroups")  String responseGroups,@ApiParam(value = "the will return the correct in app purchases for the device, possible values are: * SIRQUL (default) - purchasing from the sirqul store using tickets * IOS - purchasing from the itunes store for iPhone, iPod, iPod Touch * GOOGLE - purchasing from the google android store * AMAZON - purchasing from the amazon android store * MAC - purchasing from the itunes store for OSX * FREE - the item is free to purchase ") @QueryParam("purchaseType")  String purchaseType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postAppData(gameType, start, limit, data, deviceId, accountId, includeGameData, q, keyword, sortField, descending, i, l, gameObjectCount, filter, dateCreated, ownerId, missionIds, gameIds, packIds, gameLevelIds, appVersion, includeHigherVersionPacks, includeHigherVersionLevels, responseGroups, purchaseType, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/regen")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Regenerate App Data", notes = "Regenerate the app data cache for apps", response = SirqulResponse.class, tags={ "AppData", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response regenAppData(@ApiParam(value = "the account id of the user") @QueryParam("accountId")  Long accountId,@ApiParam(value = "process a specific application, if null process all apps with caches") @QueryParam("appKey")  String appKey,@ApiParam(value = "create a specific version, if null use current version. Be careful if processing all") @QueryParam("buildVersion")  String buildVersion,@ApiParam(value = "create a specific version, if null use current version. Be careful if processing all") @QueryParam("apiVersion")  String apiVersion,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.regenAppData(accountId, appKey, buildVersion, apiVersion, securityContext);
    }
}
