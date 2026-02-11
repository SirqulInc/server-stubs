package org.openapitools.api;

import org.openapitools.api.LevelApiService;
import org.openapitools.api.factories.LevelApiServiceFactory;

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

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/level")


@io.swagger.annotations.Api(description = "the level API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LevelApi  {
   private final LevelApiService delegate;

   public LevelApi(@Context ServletConfig servletContext) {
      LevelApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("LevelApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (LevelApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = LevelApiServiceFactory.getLevelApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Game Level", notes = "Create a game level. Currently does NOT support game objects.", response = GameLevelResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameLevelResponse.class)
    })
    public Response createGameLevel(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The name of the level.", required = true) @QueryParam("name") @NotNull  String name,@ApiParam(value = "The game level data: xml, json, or other text based format.", required = true) @QueryParam("gameData") @NotNull  String gameData,@ApiParam(value = "The game level data format type.", required = true) @QueryParam("gameDataSuffix") @NotNull  String gameDataSuffix,@ApiParam(value = "The game application key to save the level for.") @QueryParam("appKey")  String appKey,@ApiParam(value = "The description of the level.") @QueryParam("description")  String description,@ApiParam(value = "The difficulty, possible values are: VERY_EASY, EASY, MEDIUM, HARD, VERY_HARD.") @QueryParam("difficulty")  String difficulty,@ApiParam(value = "The version number of the application required to correctly load/play the level.") @QueryParam("appVersion")  String appVersion,@ApiParam(value = "The asset Id of the level image.") @QueryParam("assetImageId")  Long assetImageId,@ApiParam(value = "The asset Id of the level icon.") @QueryParam("assetIconId")  Long assetIconId,@ApiParam(value = "Is the level visible to others, possible values are: PUBLIC, PRIVATE.") @QueryParam("visibility")  String visibility,@ApiParam(value = "Make the level be readable by all friends.") @QueryParam("friendGroup")  Boolean friendGroup,@ApiParam(value = "Make the level be readable by connections in this list.") @QueryParam("connectionIds")  String connectionIds,@ApiParam(value = "Make the level be readable by connection groups in this list.") @QueryParam("connectionGroupIds")  String connectionGroupIds,@ApiParam(value = "Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.") @QueryParam("balance")  Double balance,@ApiParam(value = "If true set the game level as active. Default is false.") @QueryParam("active")  Boolean active,@ApiParam(value = "If true then scoring will give tickets. Default is false.") @QueryParam("allocateTickets")  Boolean allocateTickets,@ApiParam(value = "The number of tickets to reward") @QueryParam("ticketCount")  Long ticketCount,@ApiParam(value = "The type of ticket to reward, null means default type") @QueryParam("ticketType")  String ticketType,@ApiParam(value = "The number of points to award for completing a level") @QueryParam("points")  Long points,@ApiParam(value = "Title of the tutorial.") @QueryParam("tutorialTitle")  String tutorialTitle,@ApiParam(value = "Message of the tutotrial.") @QueryParam("tutorialMessage")  String tutorialMessage,@ApiParam(value = "Alignment of the tutorial image. Default to NONE. Possible values are: NONE, IMAGE_ABOVE, IMAGE_BELOW, IMAGE_LEFT, IMAGE_RIGHT, IMAGE_ONLY, TEXT_ONLY") @QueryParam("tutorialAlignment")  String tutorialAlignment,@ApiParam(value = "Asset id of the tutorial image.") @QueryParam("tutorialImageAssetId")  Long tutorialImageAssetId,@ApiParam(value = "id of the offer") @QueryParam("offerId")  Long offerId,@ApiParam(value = "external custom client defined data") @QueryParam("metaData")  String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createGameLevel(accountId, name, gameData, gameDataSuffix, appKey, description, difficulty, appVersion, assetImageId, assetIconId, visibility, friendGroup, connectionIds, connectionGroupIds, balance, active, allocateTickets, ticketCount, ticketType, points, tutorialTitle, tutorialMessage, tutorialAlignment, tutorialImageAssetId, offerId, metaData, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Game Level", notes = "Delete a game level. The level and account must be valid and have the appropirate permissions to view the content.", response = SirqulResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteGameLevel(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The id of the level to return.", required = true) @QueryParam("levelId") @NotNull  Long levelId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteGameLevel(accountId, levelId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Game Level", notes = "Get a game level. The level and account must be valid and have the appropirate permissions to view the content.", response = GameLevelResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameLevelResponse.class)
    })
    public Response getGameLevel(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The id of the level to return.", required = true) @QueryParam("levelId") @NotNull  Long levelId,@ApiParam(value = "If true include the game level data, otherwise don't. default is false.") @QueryParam("includeGameData")  Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getGameLevel(accountId, levelId, includeGameData, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Game Levels", notes = "Get a list of levels for an application, just those the account has permissions to view.", response = GameLevelListResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameLevelListResponse.class)
    })
    public Response getGameLevelsByApplication(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Match the keyword to the owner name or level name.") @QueryParam("keyword")  String keyword,@ApiParam(value = "what field to sort on") @QueryParam("sortField")  String sortField,@ApiParam(value = "whether to return levels in ascending or descending order") @QueryParam("descending")  Boolean descending,@ApiParam(value = "Start the result set at some index.") @QueryParam("start")  Integer start,@ApiParam(value = "Limit the result to some number.") @QueryParam("limit")  Integer limit,@ApiParam(value = "The maximum version of the level to return.") @QueryParam("appVersion")  String appVersion,@ApiParam(value = "If true include the game level data, otherwise don't. default is false.") @QueryParam("includeGameData")  Boolean includeGameData,@ApiParam(value = "") @QueryParam("filters")  String filters,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getGameLevelsByApplication(accountId, appKey, keyword, sortField, descending, start, limit, appVersion, includeGameData, filters, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/searchByBillableEntity")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Game Level by Billable Entity", notes = "Searches on game levels that the logged in user has access to. A user would have access if the creator of the game level is managed under the same BillableEntity.", response = GameLevelResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameLevelResponse.class)
    })
    public Response getGameLevelsByBillableEntity(@ApiParam(value = "The account id of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "The keyword used to search") @QueryParam("keyword")  String keyword,@ApiParam(value = "The column to sort the search on", allowableValues="LEVEL_ACTIVE, LEVEL_NAME, LEVEL_DESCRIPTION, LEVEL_CREATED, LEVEL_UPDATED, LEVEL_LIKES, LEVEL_DISLIKES, LEVEL_NOTES, LEVEL_PLAYS, LEVEL_DOWNLOADS, LEVEL_QUITS, LEVEL_COMPLETES, LEVEL_VERSION, LEVEL_MISSION_TYPE, LEVEL_OWNER_DISPLAY, GAME_OWNER_DISPLAY, GAME_TITLE, GAME_DESCRIPTION, GAME_LIKES, GAME_DISLIKES, APP_NAME, APP_SCORING_TYPE") @QueryParam("sortField")  String sortField,@ApiParam(value = "The order to return the search results") @QueryParam("descending")  Boolean descending,@ApiParam(value = "Return only active results") @QueryParam("activeOnly")  Boolean activeOnly,@ApiParam(value = "The record to begin the return set on") @QueryParam("start")  Long start,@ApiParam(value = "The number of records to return") @QueryParam("limit")  Long limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getGameLevelsByBillableEntity(accountId, appKey, keyword, sortField, descending, activeOnly, start, limit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/questions/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Level Questions", notes = "Get questions within a level.", response = QuestionResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QuestionResponse.class)
    })
    public Response getQuestionsInLevel(@ApiParam(value = "the id of the level to get questions from", required = true) @QueryParam("levelId") @NotNull  Long levelId,@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getQuestionsInLevel(levelId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/words/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Level Words", notes = "Get words within a level.", response = WordzWordResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WordzWordResponse.class)
    })
    public Response getWordsInLevel(@ApiParam(value = "the id of the level to get words for", required = true) @QueryParam("levelId") @NotNull  Long levelId,@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getWordsInLevel(levelId, accountId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Game Level", notes = "Update a game level. Currently does NOT support game objects.", response = GameLevelResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameLevelResponse.class)
    })
    public Response updateGameLevel(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "If update then include the level Id.", required = true) @QueryParam("levelId") @NotNull  Long levelId,@ApiParam(value = "The game application key to save the level for.") @QueryParam("appKey")  String appKey,@ApiParam(value = "The name of the level.") @QueryParam("name")  String name,@ApiParam(value = "The description of the level.") @QueryParam("description")  String description,@ApiParam(value = "The difficulty, possible values are: VERY_EASY, EASY, MEDIUM, HARD, VERY_HARD.") @QueryParam("difficulty")  String difficulty,@ApiParam(value = "The version number of the applicatuion required to correctly load/play the level.") @QueryParam("appVersion")  String appVersion,@ApiParam(value = "The asset Id of the level image.") @QueryParam("assetImageId")  Long assetImageId,@ApiParam(value = "The asset Id of the level icon.") @QueryParam("assetIconId")  Long assetIconId,@ApiParam(value = "The game level data: xml, json, or other texted based format.") @QueryParam("gameData")  String gameData,@ApiParam(value = "The game level data format type.") @QueryParam("gameDataSuffix")  String gameDataSuffix,@ApiParam(value = "Is the level visible to others, possible values are: PUBLIC, PRIVATE.") @QueryParam("visibility")  String visibility,@ApiParam(value = "Make the level be readable by all friends.") @QueryParam("friendGroup")  Boolean friendGroup,@ApiParam(value = "Make the level be readable by connections in this list.") @QueryParam("connectionIds")  String connectionIds,@ApiParam(value = "Make the level be readable by connection groups in this list.") @QueryParam("connectionGroupIds")  String connectionGroupIds,@ApiParam(value = "Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.") @QueryParam("balance")  Double balance,@ApiParam(value = "If true set the game level as active.") @QueryParam("active")  Boolean active,@ApiParam(value = "If true then scoring will give tickets.") @QueryParam("allocateTickets")  Boolean allocateTickets,@ApiParam(value = "The number of tickets to reward") @QueryParam("ticketCount")  Long ticketCount,@ApiParam(value = "The type of ticket to reward, null means default type") @QueryParam("ticketType")  String ticketType,@ApiParam(value = "The number of points to award for completing a level") @QueryParam("points")  Long points,@ApiParam(value = "Title of the tutorial.") @QueryParam("tutorialTitle")  String tutorialTitle,@ApiParam(value = "Message of the tutorial.") @QueryParam("tutorialMessage")  String tutorialMessage,@ApiParam(value = "Alignment of the tutorial image, possible values are: NONE, IMAGE_ABOVE, IMAGE_BELOW, IMAGE_LEFT, IMAGE_RIGHT, IMAGE_ONLY, TEXT_ONLY") @QueryParam("tutorialAlignment")  String tutorialAlignment,@ApiParam(value = "Asset id of the tutorial image.") @QueryParam("tutorialImageAssetId")  Long tutorialImageAssetId,@ApiParam(value = "") @QueryParam("offerId")  Long offerId,@ApiParam(value = "external custom client defined data") @QueryParam("metaData")  String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateGameLevel(accountId, levelId, appKey, name, description, difficulty, appVersion, assetImageId, assetIconId, gameData, gameDataSuffix, visibility, friendGroup, connectionIds, connectionGroupIds, balance, active, allocateTickets, ticketCount, ticketType, points, tutorialTitle, tutorialMessage, tutorialAlignment, tutorialImageAssetId, offerId, metaData, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/questions/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Level Questions", notes = "Updates a level with question game objects.", response = SirqulResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response updateQuestionsInLevel(@ApiParam(value = "the id of the level to update questions on", required = true) @QueryParam("levelId") @NotNull  Long levelId,@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the IDs of the questions to update", required = true) @QueryParam("questionIds") @NotNull  String questionIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateQuestionsInLevel(levelId, accountId, questionIds, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/words/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Level Words", notes = "Updates a level with word game objects.", response = SirqulResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response updateWordsInLevel(@ApiParam(value = "the id of the level to update words for", required = true) @QueryParam("levelId") @NotNull  Long levelId,@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the ids of the words to update for the level", required = true) @QueryParam("wordIds") @NotNull  String wordIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateWordsInLevel(levelId, accountId, wordIds, securityContext);
    }
}
