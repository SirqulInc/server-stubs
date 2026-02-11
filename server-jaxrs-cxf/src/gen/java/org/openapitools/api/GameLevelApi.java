package org.openapitools.api;

import org.openapitools.model.GameLevelListResponse;
import org.openapitools.model.GameLevelResponse;
import org.openapitools.model.QuestionResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.WordzWordResponse;

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
@Path("/level")
@Api(value = "/", description = "")
public interface GameLevelApi  {

    /**
     * Create Game Level
     *
     * Create a game level. Currently does NOT support game objects.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Game Level", tags={ "Game Level" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = GameLevelResponse.class) })
    public GameLevelResponse createGameLevel(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("name") @NotNull String name, @QueryParam("gameData") @NotNull String gameData, @QueryParam("gameDataSuffix") @NotNull String gameDataSuffix, @QueryParam("appKey") String appKey, @QueryParam("description") String description, @QueryParam("difficulty") String difficulty, @QueryParam("appVersion") String appVersion, @QueryParam("assetImageId") Long assetImageId, @QueryParam("assetIconId") Long assetIconId, @QueryParam("visibility") String visibility, @QueryParam("friendGroup") Boolean friendGroup, @QueryParam("connectionIds") String connectionIds, @QueryParam("connectionGroupIds") String connectionGroupIds, @QueryParam("balance") Double balance, @QueryParam("active") Boolean active, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketCount") Long ticketCount, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points, @QueryParam("tutorialTitle") String tutorialTitle, @QueryParam("tutorialMessage") String tutorialMessage, @QueryParam("tutorialAlignment") String tutorialAlignment, @QueryParam("tutorialImageAssetId") Long tutorialImageAssetId, @QueryParam("offerId") Long offerId, @QueryParam("metaData") String metaData);

    /**
     * Delete Game Level
     *
     * Delete a game level. The level and account must be valid and have the appropirate permissions to view the content.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Game Level", tags={ "Game Level" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteGameLevel(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("levelId") @NotNull Long levelId);

    /**
     * Get Game Level
     *
     * Get a game level. The level and account must be valid and have the appropirate permissions to view the content.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Game Level", tags={ "Game Level" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = GameLevelResponse.class) })
    public GameLevelResponse getGameLevel(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("levelId") @NotNull Long levelId, @QueryParam("includeGameData") Boolean includeGameData);

    /**
     * Search Game Levels
     *
     * Get a list of levels for an application, just those the account has permissions to view.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Game Levels", tags={ "Game Level" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = GameLevelListResponse.class) })
    public GameLevelListResponse getGameLevelsByApplication(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("keyword") String keyword, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("appVersion") String appVersion, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("filters") String filters);

    /**
     * Search Game Level by Billable Entity
     *
     * Searches on game levels that the logged in user has access to. A user would have access if the creator of the game level is managed under the same BillableEntity.
     *
     */
    @GET
    @Path("/searchByBillableEntity")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Game Level by Billable Entity", tags={ "Game Level" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = GameLevelResponse.class) })
    public GameLevelResponse getGameLevelsByBillableEntity(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("start") Long start, @QueryParam("limit") Long limit);

    /**
     * Get Level Questions
     *
     * Get questions within a level.
     *
     */
    @GET
    @Path("/questions/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Level Questions", tags={ "Game Level" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = QuestionResponse.class) })
    public QuestionResponse getQuestionsInLevel(@QueryParam("levelId") @NotNull Long levelId, @QueryParam("accountId") @NotNull Long accountId);

    /**
     * Get Level Words
     *
     * Get words within a level.
     *
     */
    @GET
    @Path("/words/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Level Words", tags={ "Game Level" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = WordzWordResponse.class) })
    public WordzWordResponse getWordsInLevel(@QueryParam("levelId") @NotNull Long levelId, @QueryParam("accountId") @NotNull Long accountId);

    /**
     * Update Game Level
     *
     * Update a game level. Currently does NOT support game objects.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Game Level", tags={ "Game Level" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = GameLevelResponse.class) })
    public GameLevelResponse updateGameLevel(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("levelId") @NotNull Long levelId, @QueryParam("appKey") String appKey, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("difficulty") String difficulty, @QueryParam("appVersion") String appVersion, @QueryParam("assetImageId") Long assetImageId, @QueryParam("assetIconId") Long assetIconId, @QueryParam("gameData") String gameData, @QueryParam("gameDataSuffix") String gameDataSuffix, @QueryParam("visibility") String visibility, @QueryParam("friendGroup") Boolean friendGroup, @QueryParam("connectionIds") String connectionIds, @QueryParam("connectionGroupIds") String connectionGroupIds, @QueryParam("balance") Double balance, @QueryParam("active") Boolean active, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketCount") Long ticketCount, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points, @QueryParam("tutorialTitle") String tutorialTitle, @QueryParam("tutorialMessage") String tutorialMessage, @QueryParam("tutorialAlignment") String tutorialAlignment, @QueryParam("tutorialImageAssetId") Long tutorialImageAssetId, @QueryParam("offerId") Long offerId, @QueryParam("metaData") String metaData);

    /**
     * Update Level Questions
     *
     * Updates a level with question game objects.
     *
     */
    @POST
    @Path("/questions/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Level Questions", tags={ "Game Level" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse updateQuestionsInLevel(@QueryParam("levelId") @NotNull Long levelId, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("questionIds") @NotNull String questionIds);

    /**
     * Update Level Words
     *
     * Updates a level with word game objects.
     *
     */
    @POST
    @Path("/words/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Level Words", tags={ "Game Level" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse updateWordsInLevel(@QueryParam("levelId") @NotNull Long levelId, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("wordIds") @NotNull String wordIds);
}
