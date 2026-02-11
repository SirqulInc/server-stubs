package org.openapitools.api;

import org.openapitools.api.ScoreApiService;
import org.openapitools.api.factories.ScoreApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ScoreResponse;

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

@Path("/score")


@io.swagger.annotations.Api(description = "the score API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ScoreApi  {
   private final ScoreApiService delegate;

   public ScoreApi(@Context ServletConfig servletContext) {
      ScoreApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ScoreApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ScoreApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ScoreApiServiceFactory.getScoreApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Score", notes = "Create a score.  The response object will contain a series of   coded messages detailing what items were completed, the score registered,   and any tickets allocated.  Scoring a  level could complete the pack it   is in, completing that pack could complete the game, which  in turn could   complete the mission.  This completion chain is indicated to the client   via  a list of {@link MessageResponse}.", response = ScoreResponse.class, tags={ "Score", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScoreResponse.class)
    })
    public Response createScore(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The game application key to save the score for.", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The score", required = true) @QueryParam("points") @NotNull  Integer points,@ApiParam(value = "The missionId to score for, ignore if not playing mission.") @QueryParam("missionId")  Long missionId,@ApiParam(value = "The gameId to score for, ignore if not playing mission.") @QueryParam("gameId")  Long gameId,@ApiParam(value = "The packId to score for, send -2 if playing community levels.") @QueryParam("packId")  Long packId,@ApiParam(value = "The gameLevelId to score for.") @QueryParam("gameLevelId")  Long gameLevelId,@ApiParam(value = "The gameObjectId to score for, ignore if level based scoring.") @QueryParam("gameObjectId")  Long gameObjectId,@ApiParam(value = "The time taken to complete task") @QueryParam("timeTaken")  Integer timeTaken,@ApiParam(value = "") @QueryParam("highest")  Boolean highest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createScore(accountId, appKey, points, missionId, gameId, packId, gameLevelId, gameObjectId, timeTaken, highest, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Score", notes = "Get the high score for an item.  Pass in the full path IDs for the score.", response = ScoreResponse.class, tags={ "Score", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScoreResponse.class)
    })
    public Response getScore(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The game application key to get the level for.", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The missionId to score for, null if not playing mission.") @QueryParam("missionId")  Long missionId,@ApiParam(value = "The gameId to score for, null if not playing mission.") @QueryParam("gameId")  Long gameId,@ApiParam(value = "The packId to score for, null if playing community levels.") @QueryParam("packId")  Long packId,@ApiParam(value = "The gameLevelId to score for.") @QueryParam("gameLevelId")  Long gameLevelId,@ApiParam(value = "The gameObjectId to score for, null if level based scoring.") @QueryParam("gameObjectId")  Long gameObjectId,@ApiParam(value = "The object type to filter scores by (TicketObjectType)") @QueryParam("scoreObjectType")  String scoreObjectType,@ApiParam(value = "The status of the score to filter (ScoreStatus)") @QueryParam("scoreStatus")  String scoreStatus,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getScore(accountId, appKey, missionId, gameId, packId, gameLevelId, gameObjectId, scoreObjectType, scoreStatus, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Score", notes = "Search the scores for an item.  Pass in the full path IDs for the scores.", response = ScoreResponse.class, responseContainer = "List", tags={ "Score", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScoreResponse.class, responseContainer = "List")
    })
    public Response searchScores(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The game application key to get the level for.", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The missionId to score for, null if not playing mission.") @QueryParam("missionId")  Long missionId,@ApiParam(value = "The gameId to score for, null if not playing mission.") @QueryParam("gameId")  Long gameId,@ApiParam(value = "The packId to score for, null if playing community levels.") @QueryParam("packId")  Long packId,@ApiParam(value = "The gameLevelId to score for.") @QueryParam("gameLevelId")  Long gameLevelId,@ApiParam(value = "The gameObjectId to score for, null if level based scoring.") @QueryParam("gameObjectId")  Long gameObjectId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchScores(accountId, appKey, missionId, gameId, packId, gameLevelId, gameObjectId, securityContext);
    }
}
