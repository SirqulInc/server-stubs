package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.LevelApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.GameLevelListResponse;
import org.openapitools.model.GameLevelResponse;
import org.openapitools.model.QuestionResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.WordzWordResponse;

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

@Path("/level")


@io.swagger.annotations.Api(description = "the level API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LevelApi  {

    @Inject LevelApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Game Level", notes = "Create a game level. Currently does NOT support game objects.", response = GameLevelResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameLevelResponse.class) })
    public Response createGameLevel( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @NotNull @QueryParam("gameData") String gameData, @NotNull @QueryParam("gameDataSuffix") String gameDataSuffix, @QueryParam("appKey") String appKey, @QueryParam("description") String description, @QueryParam("difficulty") String difficulty, @QueryParam("appVersion") String appVersion, @QueryParam("assetImageId") Long assetImageId, @QueryParam("assetIconId") Long assetIconId, @QueryParam("visibility") String visibility, @QueryParam("friendGroup") Boolean friendGroup, @QueryParam("connectionIds") String connectionIds, @QueryParam("connectionGroupIds") String connectionGroupIds, @QueryParam("balance") Double balance, @QueryParam("active") Boolean active, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketCount") Long ticketCount, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points, @QueryParam("tutorialTitle") String tutorialTitle, @QueryParam("tutorialMessage") String tutorialMessage, @QueryParam("tutorialAlignment") String tutorialAlignment, @QueryParam("tutorialImageAssetId") Long tutorialImageAssetId, @QueryParam("offerId") Long offerId, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createGameLevel(accountId,name,gameData,gameDataSuffix,appKey,description,difficulty,appVersion,assetImageId,assetIconId,visibility,friendGroup,connectionIds,connectionGroupIds,balance,active,allocateTickets,ticketCount,ticketType,points,tutorialTitle,tutorialMessage,tutorialAlignment,tutorialImageAssetId,offerId,metaData,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Game Level", notes = "Delete a game level. The level and account must be valid and have the appropirate permissions to view the content.", response = SirqulResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteGameLevel( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("levelId") Long levelId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteGameLevel(accountId,levelId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Game Level", notes = "Get a game level. The level and account must be valid and have the appropirate permissions to view the content.", response = GameLevelResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameLevelResponse.class) })
    public Response getGameLevel( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("levelId") Long levelId, @QueryParam("includeGameData") Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getGameLevel(accountId,levelId,includeGameData,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Game Levels", notes = "Get a list of levels for an application, just those the account has permissions to view.", response = GameLevelListResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameLevelListResponse.class) })
    public Response getGameLevelsByApplication( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("appVersion") String appVersion, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("filters") String filters,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getGameLevelsByApplication(accountId,appKey,keyword,sortField,descending,start,limit,appVersion,includeGameData,filters,securityContext);
    }
    @GET
    @Path("/searchByBillableEntity")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Game Level by Billable Entity", notes = "Searches on game levels that the logged in user has access to. A user would have access if the creator of the game level is managed under the same BillableEntity.", response = GameLevelResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameLevelResponse.class) })
    public Response getGameLevelsByBillableEntity( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword,, allowableValues="LEVEL_ACTIVE, LEVEL_NAME, LEVEL_DESCRIPTION, LEVEL_CREATED, LEVEL_UPDATED, LEVEL_LIKES, LEVEL_DISLIKES, LEVEL_NOTES, LEVEL_PLAYS, LEVEL_DOWNLOADS, LEVEL_QUITS, LEVEL_COMPLETES, LEVEL_VERSION, LEVEL_MISSION_TYPE, LEVEL_OWNER_DISPLAY, GAME_OWNER_DISPLAY, GAME_TITLE, GAME_DESCRIPTION, GAME_LIKES, GAME_DISLIKES, APP_NAME, APP_SCORING_TYPE" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("start") Long start, @QueryParam("limit") Long limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getGameLevelsByBillableEntity(accountId,appKey,keyword,sortField,descending,activeOnly,start,limit,securityContext);
    }
    @GET
    @Path("/questions/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Level Questions", notes = "Get questions within a level.", response = QuestionResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QuestionResponse.class) })
    public Response getQuestionsInLevel( @NotNull @QueryParam("levelId") Long levelId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getQuestionsInLevel(levelId,accountId,securityContext);
    }
    @GET
    @Path("/words/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Level Words", notes = "Get words within a level.", response = WordzWordResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WordzWordResponse.class) })
    public Response getWordsInLevel( @NotNull @QueryParam("levelId") Long levelId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getWordsInLevel(levelId,accountId,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Game Level", notes = "Update a game level. Currently does NOT support game objects.", response = GameLevelResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameLevelResponse.class) })
    public Response updateGameLevel( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("levelId") Long levelId, @QueryParam("appKey") String appKey, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("difficulty") String difficulty, @QueryParam("appVersion") String appVersion, @QueryParam("assetImageId") Long assetImageId, @QueryParam("assetIconId") Long assetIconId, @QueryParam("gameData") String gameData, @QueryParam("gameDataSuffix") String gameDataSuffix, @QueryParam("visibility") String visibility, @QueryParam("friendGroup") Boolean friendGroup, @QueryParam("connectionIds") String connectionIds, @QueryParam("connectionGroupIds") String connectionGroupIds, @QueryParam("balance") Double balance, @QueryParam("active") Boolean active, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketCount") Long ticketCount, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points, @QueryParam("tutorialTitle") String tutorialTitle, @QueryParam("tutorialMessage") String tutorialMessage, @QueryParam("tutorialAlignment") String tutorialAlignment, @QueryParam("tutorialImageAssetId") Long tutorialImageAssetId, @QueryParam("offerId") Long offerId, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateGameLevel(accountId,levelId,appKey,name,description,difficulty,appVersion,assetImageId,assetIconId,gameData,gameDataSuffix,visibility,friendGroup,connectionIds,connectionGroupIds,balance,active,allocateTickets,ticketCount,ticketType,points,tutorialTitle,tutorialMessage,tutorialAlignment,tutorialImageAssetId,offerId,metaData,securityContext);
    }
    @POST
    @Path("/questions/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Level Questions", notes = "Updates a level with question game objects.", response = SirqulResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateQuestionsInLevel( @NotNull @QueryParam("levelId") Long levelId, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("questionIds") String questionIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateQuestionsInLevel(levelId,accountId,questionIds,securityContext);
    }
    @POST
    @Path("/words/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Level Words", notes = "Updates a level with word game objects.", response = SirqulResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateWordsInLevel( @NotNull @QueryParam("levelId") Long levelId, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("wordIds") String wordIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateWordsInLevel(levelId,accountId,wordIds,securityContext);
    }
}
