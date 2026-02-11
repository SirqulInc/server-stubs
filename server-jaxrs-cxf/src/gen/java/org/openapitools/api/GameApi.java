package org.openapitools.api;

import org.openapitools.model.GameResponse;
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
@Path("/game")
@Api(value = "/", description = "")
public interface GameApi  {

    /**
     * Create a Game
     *
     * Create a Game.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create a Game", tags={ "Game" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = GameResponse.class) })
    public GameResponse createGame(@QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("metaData") String metaData, @QueryParam("packIds") String packIds, @QueryParam("includeGameData") Boolean includeGameData);

    /**
     * Delete a Game
     *
     * Delete a game.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete a Game", tags={ "Game" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteGame(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("gameId") @NotNull Long gameId);

    /**
     * Get a Game by id
     *
     * Get a Game by id.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get a Game by id", tags={ "Game" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = GameResponse.class) })
    public GameResponse getGame(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("gameId") @NotNull Long gameId, @QueryParam("includeGameData") Boolean includeGameData);

    /**
     * Search a Game
     *
     * Get a list of games for an application, just those the account has permissions to view.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search a Game", tags={ "Game" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = GameResponse.class) })
    public GameResponse searchGames(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("keyword") String keyword, @QueryParam("appVersion") String appVersion, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("includeInactive") Boolean includeInactive);

    /**
     * Update a Game
     *
     * Update a Game
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update a Game", tags={ "Game" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = GameResponse.class) })
    public GameResponse updateGame(@QueryParam("accountId") Long accountId, @QueryParam("gameId") Long gameId, @QueryParam("appKey") String appKey, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("metaData") String metaData, @QueryParam("packIds") String packIds, @QueryParam("includeGameData") Boolean includeGameData);
}
