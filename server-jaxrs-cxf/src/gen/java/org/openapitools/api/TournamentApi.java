package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.MissionShortResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TournamentResponse;

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
@Path("/api/{version}/tournament")
@Api(value = "/", description = "")
public interface TournamentApi  {

    /**
     * Create Tournament
     *
     * Create a tournament.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Tournament", tags={ "Tournament" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TournamentResponse.class) })
    public TournamentResponse createTournament(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("title") @NotNull String title, @QueryParam("costToPlay") @NotNull Integer costToPlay, @QueryParam("startDate") @NotNull Long startDate, @QueryParam("subType") String subType, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("secondsBetweenLevels") @DefaultValue("600")Integer secondsBetweenLevels, @QueryParam("secondsForTieBreaker") @DefaultValue("600")Integer secondsForTieBreaker, @QueryParam("secondsBetweenPacks") @DefaultValue("86400")Integer secondsBetweenPacks, @QueryParam("maximumLevelLength") @DefaultValue("1800")Integer maximumLevelLength, @QueryParam("costToPlayType") String costToPlayType, @QueryParam("minimumToPlay") @DefaultValue("1")Integer minimumToPlay, @QueryParam("startingLimit") Integer startingLimit, @QueryParam("availableLimit") Integer availableLimit, @QueryParam("description") String description, @QueryParam("metaData") String metaData, @QueryParam("audienceIds") String audienceIds, @QueryParam("active") Boolean active, @QueryParam("enableBuyBack") @DefaultValue("false")Boolean enableBuyBack, @QueryParam("offerIds") String offerIds, @QueryParam("offerAssetId") Long offerAssetId, @QueryParam("fixedReward") @DefaultValue("false")Boolean fixedReward, @QueryParam("splitReward") @DefaultValue("ALL")String splitReward, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("tournamentData") String tournamentData, @QueryParam("missionType") @DefaultValue("MULTISTAGE")String missionType, @QueryParam("visibility") @DefaultValue("PUBLIC")String visibility, @QueryParam("preliminaryGroups") @DefaultValue("1")Integer preliminaryGroups, @QueryParam("preliminaryGroupAdvancements") @DefaultValue("1")String preliminaryGroupAdvancements, @QueryParam("enableMultipleEntries") @DefaultValue("false")Boolean enableMultipleEntries, @QueryParam("enableMultipleVotes") @DefaultValue("false")Boolean enableMultipleVotes, @QueryParam("featured") @DefaultValue("false")Boolean featured, @QueryParam("winnerTag") String winnerTag, @QueryParam("tieTag") String tieTag);

    /**
     * Delete Tournament
     *
     * Delete a tournament.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Tournament", tags={ "Tournament" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteTournament(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("missionId") @NotNull Long missionId);

    /**
     * Get Tournament
     *
     * Get a tournament.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Tournament", tags={ "Tournament" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TournamentResponse.class) })
    public TournamentResponse getTournament(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("missionId") Long missionId, @QueryParam("joinCode") String joinCode, @QueryParam("includeScores") String includeScores, @QueryParam("objectPreviewSize") @DefaultValue("50")Integer objectPreviewSize);

    /**
     * Search Tournament Objects
     *
     * Search on game objects of tournaments
     *
     */
    @GET
    @Path("/object/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Tournament Objects", tags={ "Tournament" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse searchObjects(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("gameLevelId") @NotNull Long gameLevelId, @QueryParam("sortField") @DefaultValue("PLAYER_SCORE_COUNT")String sortField, @QueryParam("descending") @DefaultValue("true")Boolean descending, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit);

    /**
     * Search Tournament Rounds
     *
     * Search for the user&#39;s tournament games.
     *
     */
    @GET
    @Path("/round/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Tournament Rounds", tags={ "Tournament" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse searchRounds(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("status") @DefaultValue("ACCEPTED,ACTIVE")String status, @QueryParam("missionType") String missionType, @QueryParam("currentOnly") @DefaultValue("true")Boolean currentOnly, @QueryParam("visibilities") @DefaultValue("PUBLIC")String visibilities, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit);

    /**
     * Search Tournaments
     *
     * Search for tournaments
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Tournaments", tags={ "Tournament" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MissionShortResponse.class) })
    public MissionShortResponse searchTournaments(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("keyword") String keyword, @QueryParam("subType") String subType, @QueryParam("includeInactive") @DefaultValue("false")Boolean includeInactive, @QueryParam("missionTypes") @DefaultValue("MULTISTAGE,TOURNAMENT,POOLPLAY")String missionTypes, @QueryParam("filter") @DefaultValue("UPCOMING")String filter, @QueryParam("sortField") @DefaultValue("START_DATE")String sortField, @QueryParam("descending") Boolean descending, @QueryParam("visibility") @DefaultValue("PUBLIC")String visibility, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit);

    /**
     * Submit Tournament Score
     *
     * Submit an array of scores for a tournament match. 
     *
     */
    @POST
    @Path("/score")
    @Produces({ "*/*" })
    @ApiOperation(value = "Submit Tournament Score", tags={ "Tournament" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse submitTournamentScore(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("missionId") @NotNull Long missionId, @QueryParam("gameId") @NotNull Long gameId, @QueryParam("packId") @NotNull Long packId, @QueryParam("scores") @NotNull String scores, @QueryParam("gameLevelId") Long gameLevelId);

    /**
     * Submit a vote for a multi-stage album tournament.
     *
     * Submit a vote for a multi-stage album tournament.
     *
     */
    @POST
    @Path("/vote")
    @Produces({ "*/*" })
    @ApiOperation(value = "Submit a vote for a multi-stage album tournament.", tags={ "Tournament" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse submitTournamentVote(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("missionId") @NotNull Long missionId, @QueryParam("gameObjectId") @NotNull Long gameObjectId, @QueryParam("deviceId") String deviceId, @QueryParam("checkIfDeviceAlreadyVoted") @DefaultValue("false")Boolean checkIfDeviceAlreadyVoted);

    /**
     * Substitute Tournament Player
     *
     * Service to replace the user&#39;s opponent in the current level - pack - mission with an AI account.
     *
     */
    @POST
    @Path("/substitute")
    @Produces({ "*/*" })
    @ApiOperation(value = "Substitute Tournament Player", tags={ "Tournament" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse substituteTournamentPlayer(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("missionId") @NotNull Long missionId, @QueryParam("packId") @NotNull Long packId, @QueryParam("gameLevelId") @NotNull Long gameLevelId);

    /**
     * Update Tournament
     *
     * Update a tournament.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Tournament", tags={ "Tournament" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TournamentResponse.class) })
    public TournamentResponse updateTournament(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("missionId") @NotNull Long missionId, @QueryParam("title") String title, @QueryParam("subType") String subType, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("secondsBetweenLevels") Integer secondsBetweenLevels, @QueryParam("secondsForTieBreaker") Integer secondsForTieBreaker, @QueryParam("secondsBetweenPacks") Integer secondsBetweenPacks, @QueryParam("maximumLevelLength") Integer maximumLevelLength, @QueryParam("costToPlay") Integer costToPlay, @QueryParam("costToPlayType") String costToPlayType, @QueryParam("minimumToPlay") Integer minimumToPlay, @QueryParam("startingLimit") Integer startingLimit, @QueryParam("availableLimit") Integer availableLimit, @QueryParam("description") String description, @QueryParam("metaData") String metaData, @QueryParam("startDate") Long startDate, @QueryParam("audienceIds") String audienceIds, @QueryParam("active") Boolean active, @QueryParam("enableBuyBack") Boolean enableBuyBack, @QueryParam("offerIds") String offerIds, @QueryParam("offerAssetId") Long offerAssetId, @QueryParam("fixedReward") Boolean fixedReward, @QueryParam("splitReward") String splitReward, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("tournamentData") String tournamentData, @QueryParam("visibility") String visibility, @QueryParam("preliminaryGroups") Integer preliminaryGroups, @QueryParam("preliminaryGroupAdvancements") String preliminaryGroupAdvancements, @QueryParam("enableMultipleEntries") Boolean enableMultipleEntries, @QueryParam("enableMultipleVotes") Boolean enableMultipleVotes, @QueryParam("featured") Boolean featured, @QueryParam("winnerTag") String winnerTag, @QueryParam("tieTag") String tieTag);
}
