package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.TournamentApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.MissionShortResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TournamentResponse;

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

@Path("/tournament")


@io.swagger.annotations.Api(description = "the tournament API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TournamentApi  {

    @Inject TournamentApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Tournament", notes = "Create a tournament.", response = TournamentResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TournamentResponse.class) })
    public Response createTournament( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("title") String title, @NotNull @QueryParam("costToPlay") Integer costToPlay, @NotNull @QueryParam("startDate") Long startDate, @QueryParam("subType") String subType, @QueryParam("imageAssetId") Long imageAssetId, @DefaultValue("600") @QueryParam("secondsBetweenLevels") Integer secondsBetweenLevels, @DefaultValue("600") @QueryParam("secondsForTieBreaker") Integer secondsForTieBreaker, @DefaultValue("86400") @QueryParam("secondsBetweenPacks") Integer secondsBetweenPacks, @DefaultValue("1800") @QueryParam("maximumLevelLength") Integer maximumLevelLength, @QueryParam("costToPlayType") String costToPlayType, @DefaultValue("1") @QueryParam("minimumToPlay") Integer minimumToPlay, @QueryParam("startingLimit") Integer startingLimit, @QueryParam("availableLimit") Integer availableLimit, @QueryParam("description") String description, @QueryParam("metaData") String metaData, @QueryParam("audienceIds") String audienceIds, @QueryParam("active") Boolean active, @DefaultValue("false") @QueryParam("enableBuyBack") Boolean enableBuyBack, @QueryParam("offerIds") String offerIds, @QueryParam("offerAssetId") Long offerAssetId, @DefaultValue("false") @QueryParam("fixedReward") Boolean fixedReward,, allowableValues="EVEN, ALL, FIRST, RANDOM" @DefaultValue("ALL") @QueryParam("splitReward") String splitReward, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("tournamentData") String tournamentData,, allowableValues="TOURNAMENT, POOLPLAY, MULTISTAGE" @DefaultValue("MULTISTAGE") @QueryParam("missionType") String missionType,, allowableValues="PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE" @DefaultValue("PUBLIC") @QueryParam("visibility") String visibility, @DefaultValue("1") @QueryParam("preliminaryGroups") Integer preliminaryGroups, @DefaultValue("1") @QueryParam("preliminaryGroupAdvancements") String preliminaryGroupAdvancements, @DefaultValue("false") @QueryParam("enableMultipleEntries") Boolean enableMultipleEntries, @DefaultValue("false") @QueryParam("enableMultipleVotes") Boolean enableMultipleVotes, @DefaultValue("false") @QueryParam("featured") Boolean featured, @QueryParam("winnerTag") String winnerTag, @QueryParam("tieTag") String tieTag,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createTournament(accountId,appKey,title,costToPlay,startDate,subType,imageAssetId,secondsBetweenLevels,secondsForTieBreaker,secondsBetweenPacks,maximumLevelLength,costToPlayType,minimumToPlay,startingLimit,availableLimit,description,metaData,audienceIds,active,enableBuyBack,offerIds,offerAssetId,fixedReward,splitReward,allocateTickets,tournamentData,missionType,visibility,preliminaryGroups,preliminaryGroupAdvancements,enableMultipleEntries,enableMultipleVotes,featured,winnerTag,tieTag,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Tournament", notes = "Delete a tournament.", response = SirqulResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteTournament( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("missionId") Long missionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteTournament(accountId,missionId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Tournament", notes = "Get a tournament.", response = TournamentResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TournamentResponse.class) })
    public Response getTournament( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("missionId") Long missionId, @QueryParam("joinCode") String joinCode,, allowableValues="ALL, MINE" @QueryParam("includeScores") String includeScores, @DefaultValue("50") @QueryParam("objectPreviewSize") Integer objectPreviewSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTournament(accountId,missionId,joinCode,includeScores,objectPreviewSize,securityContext);
    }
    @GET
    @Path("/object/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Tournament Objects", notes = "Search on game objects of tournaments", response = SirqulResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response searchObjects( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("gameLevelId") Long gameLevelId,, allowableValues="ID, PLAYER_SCORE_COUNT" @DefaultValue("PLAYER_SCORE_COUNT") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchObjects(accountId,gameLevelId,sortField,descending,start,limit,securityContext);
    }
    @GET
    @Path("/round/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Tournament Rounds", notes = "Search for the user's tournament games.", response = SirqulResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response searchRounds( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @DefaultValue("ACCEPTED,ACTIVE") @QueryParam("status") String status,, allowableValues="TOURNAMENT, POOLPLAY" @QueryParam("missionType") String missionType, @DefaultValue("true") @QueryParam("currentOnly") Boolean currentOnly, @DefaultValue("PUBLIC") @QueryParam("visibilities") String visibilities, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchRounds(accountId,appKey,status,missionType,currentOnly,visibilities,start,limit,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Tournaments", notes = "Search for tournaments", response = MissionShortResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionShortResponse.class) })
    public Response searchTournaments( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("subType") String subType, @DefaultValue("false") @QueryParam("includeInactive") Boolean includeInactive, @DefaultValue("MULTISTAGE,TOURNAMENT,POOLPLAY") @QueryParam("missionTypes") String missionTypes,, allowableValues="ALL, UPCOMING, PAST, PRESENT, ACTIVE" @DefaultValue("UPCOMING") @QueryParam("filter") String filter,, allowableValues="ACTIVE, TITLE, DESCRIPTION, CREATED, UPDATED, MISSION_TYPE, OWNER_DISPLAY, START_DATE, END_DATE, STARTING_LIMIT, AVAILABLE_LIMIT, INVITE_COUNT, ACCEPTED_COUNT" @DefaultValue("START_DATE") @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @DefaultValue("PUBLIC") @QueryParam("visibility") String visibility, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchTournaments(accountId,appKey,keyword,subType,includeInactive,missionTypes,filter,sortField,descending,visibility,start,limit,securityContext);
    }
    @POST
    @Path("/score")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Submit Tournament Score", notes = "Submit an array of scores for a tournament match. ", response = SirqulResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response submitTournamentScore( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("missionId") Long missionId, @NotNull @QueryParam("gameId") Long gameId, @NotNull @QueryParam("packId") Long packId, @NotNull @QueryParam("scores") String scores, @QueryParam("gameLevelId") Long gameLevelId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.submitTournamentScore(accountId,appKey,missionId,gameId,packId,scores,gameLevelId,securityContext);
    }
    @POST
    @Path("/vote")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Submit a vote for a multi-stage album tournament.", notes = "Submit a vote for a multi-stage album tournament.", response = SirqulResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response submitTournamentVote( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("missionId") Long missionId, @NotNull @QueryParam("gameObjectId") Long gameObjectId, @QueryParam("deviceId") String deviceId, @DefaultValue("false") @QueryParam("checkIfDeviceAlreadyVoted") Boolean checkIfDeviceAlreadyVoted,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.submitTournamentVote(accountId,appKey,missionId,gameObjectId,deviceId,checkIfDeviceAlreadyVoted,securityContext);
    }
    @POST
    @Path("/substitute")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Substitute Tournament Player", notes = "Service to replace the user's opponent in the current level - pack - mission with an AI account.", response = SirqulResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response substituteTournamentPlayer( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("missionId") Long missionId, @NotNull @QueryParam("packId") Long packId, @NotNull @QueryParam("gameLevelId") Long gameLevelId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.substituteTournamentPlayer(accountId,missionId,packId,gameLevelId,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Tournament", notes = "Update a tournament.", response = TournamentResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TournamentResponse.class) })
    public Response updateTournament( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("missionId") Long missionId, @QueryParam("title") String title, @QueryParam("subType") String subType, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("secondsBetweenLevels") Integer secondsBetweenLevels, @QueryParam("secondsForTieBreaker") Integer secondsForTieBreaker, @QueryParam("secondsBetweenPacks") Integer secondsBetweenPacks, @QueryParam("maximumLevelLength") Integer maximumLevelLength, @QueryParam("costToPlay") Integer costToPlay, @QueryParam("costToPlayType") String costToPlayType, @QueryParam("minimumToPlay") Integer minimumToPlay, @QueryParam("startingLimit") Integer startingLimit, @QueryParam("availableLimit") Integer availableLimit, @QueryParam("description") String description, @QueryParam("metaData") String metaData, @QueryParam("startDate") Long startDate, @QueryParam("audienceIds") String audienceIds, @QueryParam("active") Boolean active, @QueryParam("enableBuyBack") Boolean enableBuyBack, @QueryParam("offerIds") String offerIds, @QueryParam("offerAssetId") Long offerAssetId, @QueryParam("fixedReward") Boolean fixedReward,, allowableValues="EVEN, ALL, FIRST, RANDOM" @QueryParam("splitReward") String splitReward, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("tournamentData") String tournamentData,, allowableValues="PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE" @QueryParam("visibility") String visibility, @QueryParam("preliminaryGroups") Integer preliminaryGroups, @QueryParam("preliminaryGroupAdvancements") String preliminaryGroupAdvancements, @QueryParam("enableMultipleEntries") Boolean enableMultipleEntries, @QueryParam("enableMultipleVotes") Boolean enableMultipleVotes, @QueryParam("featured") Boolean featured, @QueryParam("winnerTag") String winnerTag, @QueryParam("tieTag") String tieTag,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateTournament(accountId,missionId,title,subType,imageAssetId,secondsBetweenLevels,secondsForTieBreaker,secondsBetweenPacks,maximumLevelLength,costToPlay,costToPlayType,minimumToPlay,startingLimit,availableLimit,description,metaData,startDate,audienceIds,active,enableBuyBack,offerIds,offerAssetId,fixedReward,splitReward,allocateTickets,tournamentData,visibility,preliminaryGroups,preliminaryGroupAdvancements,enableMultipleEntries,enableMultipleVotes,featured,winnerTag,tieTag,securityContext);
    }
}
