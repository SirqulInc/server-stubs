package org.openapitools.api;

import org.openapitools.model.ScoreResponse;

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
@Path("/score")
@Api(value = "/", description = "")
public interface ScoreApi  {

    /**
     * Create Score
     *
     * Create a score.  The response object will contain a series of   coded messages detailing what items were completed, the score registered,   and any tickets allocated.  Scoring a  level could complete the pack it   is in, completing that pack could complete the game, which  in turn could   complete the mission.  This completion chain is indicated to the client   via  a list of {@link MessageResponse}.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Score", tags={ "Score" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ScoreResponse.class) })
    public ScoreResponse createScore(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("points") @NotNull Integer points, @QueryParam("missionId") Long missionId, @QueryParam("gameId") Long gameId, @QueryParam("packId") Long packId, @QueryParam("gameLevelId") Long gameLevelId, @QueryParam("gameObjectId") Long gameObjectId, @QueryParam("timeTaken") Integer timeTaken, @QueryParam("highest") Boolean highest);

    /**
     * Get Score
     *
     * Get the high score for an item.  Pass in the full path IDs for the score.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Score", tags={ "Score" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ScoreResponse.class) })
    public ScoreResponse getScore(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("missionId") Long missionId, @QueryParam("gameId") Long gameId, @QueryParam("packId") Long packId, @QueryParam("gameLevelId") Long gameLevelId, @QueryParam("gameObjectId") Long gameObjectId, @QueryParam("scoreObjectType") String scoreObjectType, @QueryParam("scoreStatus") String scoreStatus);

    /**
     * Search Score
     *
     * Search the scores for an item.  Pass in the full path IDs for the scores.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Score", tags={ "Score" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ScoreResponse.class, responseContainer = "List") })
    public List<ScoreResponse> searchScores(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("missionId") Long missionId, @QueryParam("gameId") Long gameId, @QueryParam("packId") Long packId, @QueryParam("gameLevelId") Long gameLevelId, @QueryParam("gameObjectId") Long gameObjectId);
}
