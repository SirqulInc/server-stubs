package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ScoreApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ScoreResponse;

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

@Path("/score")


@io.swagger.annotations.Api(description = "the score API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ScoreApi  {

    @Inject ScoreApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Score", notes = "Create a score.  The response object will contain a series of   coded messages detailing what items were completed, the score registered,   and any tickets allocated.  Scoring a  level could complete the pack it   is in, completing that pack could complete the game, which  in turn could   complete the mission.  This completion chain is indicated to the client   via  a list of {@link MessageResponse}.", response = ScoreResponse.class, tags={ "Score", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScoreResponse.class) })
    public Response createScore( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("points") Integer points, @QueryParam("missionId") Long missionId, @QueryParam("gameId") Long gameId, @QueryParam("packId") Long packId, @QueryParam("gameLevelId") Long gameLevelId, @QueryParam("gameObjectId") Long gameObjectId, @QueryParam("timeTaken") Integer timeTaken, @QueryParam("highest") Boolean highest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createScore(accountId,appKey,points,missionId,gameId,packId,gameLevelId,gameObjectId,timeTaken,highest,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Score", notes = "Get the high score for an item.  Pass in the full path IDs for the score.", response = ScoreResponse.class, tags={ "Score", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScoreResponse.class) })
    public Response getScore( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("missionId") Long missionId, @QueryParam("gameId") Long gameId, @QueryParam("packId") Long packId, @QueryParam("gameLevelId") Long gameLevelId, @QueryParam("gameObjectId") Long gameObjectId, @QueryParam("scoreObjectType") String scoreObjectType, @QueryParam("scoreStatus") String scoreStatus,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getScore(accountId,appKey,missionId,gameId,packId,gameLevelId,gameObjectId,scoreObjectType,scoreStatus,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Score", notes = "Search the scores for an item.  Pass in the full path IDs for the scores.", response = ScoreResponse.class, responseContainer = "List", tags={ "Score", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScoreResponse.class, responseContainer = "List") })
    public Response searchScores( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("missionId") Long missionId, @QueryParam("gameId") Long gameId, @QueryParam("packId") Long packId, @QueryParam("gameLevelId") Long gameLevelId, @QueryParam("gameObjectId") Long gameObjectId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchScores(accountId,appKey,missionId,gameId,packId,gameLevelId,gameObjectId,securityContext);
    }
}
