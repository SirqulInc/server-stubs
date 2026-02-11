package org.openapitools.api;

import org.openapitools.api.TournamentApiService;
import org.openapitools.api.factories.TournamentApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.MissionShortResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TournamentResponse;

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

@Path("/tournament")


@io.swagger.annotations.Api(description = "the tournament API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TournamentApi  {
   private final TournamentApiService delegate;

   public TournamentApi(@Context ServletConfig servletContext) {
      TournamentApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("TournamentApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (TournamentApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = TournamentApiServiceFactory.getTournamentApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Tournament", notes = "Create a tournament.", response = TournamentResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TournamentResponse.class)
    })
    public Response createTournament(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The appKey the tournament is created for.", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The title of the tournament", required = true) @QueryParam("title") @NotNull  String title,@ApiParam(value = "The number of tickets required to pay to enter the tournament", required = true) @QueryParam("costToPlay") @NotNull  Integer costToPlay,@ApiParam(value = "The date/time to start the tournament", required = true) @QueryParam("startDate") @NotNull  Long startDate,@ApiParam(value = "Custom string client apps can use for searching/filtering tournaments") @QueryParam("subType")  String subType,@ApiParam(value = "The asset ID to attach to the tournament") @QueryParam("imageAssetId")  Long imageAssetId,@ApiParam(value = "The number of seconds in between the start of each tournament game/group", defaultValue = "600") @DefaultValue("600") @QueryParam("secondsBetweenLevels")  Integer secondsBetweenLevels,@ApiParam(value = "The number of seconds to extend the round end time in the case of a tie breaker", defaultValue = "600") @DefaultValue("600") @QueryParam("secondsForTieBreaker")  Integer secondsForTieBreaker,@ApiParam(value = "The number of seconds in between the start of each tournament round", defaultValue = "86400") @DefaultValue("86400") @QueryParam("secondsBetweenPacks")  Integer secondsBetweenPacks,@ApiParam(value = "The maximum number of seconds the match is expected to end at, which gets used to determine when a match should end when there is no activity", defaultValue = "1800") @DefaultValue("1800") @QueryParam("maximumLevelLength")  Integer maximumLevelLength,@ApiParam(value = "The type of ticket required to pay") @QueryParam("costToPlayType")  String costToPlayType,@ApiParam(value = "The minimum number of players required to sign up for the tournament to be played", defaultValue = "1") @DefaultValue("1") @QueryParam("minimumToPlay")  Integer minimumToPlay,@ApiParam(value = "The starting number of players for a tournament (filled with AI's)") @QueryParam("startingLimit")  Integer startingLimit,@ApiParam(value = "The maximum number of players for a tournament (currently 128 but not enforced)") @QueryParam("availableLimit")  Integer availableLimit,@ApiParam(value = "The description of the tournament") @QueryParam("description")  String description,@ApiParam(value = "External custom client defined data") @QueryParam("metaData")  String metaData,@ApiParam(value = "The audiences associated with the tournament") @QueryParam("audienceIds")  String audienceIds,@ApiParam(value = "Activate/deactivate the tournament") @QueryParam("active")  Boolean active,@ApiParam(value = "Determines whether to allow players to buy back into a tournament", defaultValue = "false") @DefaultValue("false") @QueryParam("enableBuyBack")  Boolean enableBuyBack,@ApiParam(value = "The list of offers to give as a reward beyond the tickets") @QueryParam("offerIds")  String offerIds,@ApiParam(value = "The artwork ID to attach to the reward tickets offers") @QueryParam("offerAssetId")  Long offerAssetId,@ApiParam(value = "If set then do not update the ticket reward, auto set to true if offerIds provided", defaultValue = "false") @DefaultValue("false") @QueryParam("fixedReward")  Boolean fixedReward,@ApiParam(value = "Set the rules for handling the reward in case of a tie, values: EVEN split the reward evenly ALL everyone gets the full reward value FIRST first score submitted RANDOM random player who scored", allowableValues="EVEN, ALL, FIRST, RANDOM", defaultValue = "ALL") @DefaultValue("ALL") @QueryParam("splitReward")  String splitReward,@ApiParam(value = "Flag to indicate owner should receive tickets for completed missions") @QueryParam("allocateTickets")  Boolean allocateTickets,@ApiParam(value = "A text based string that will be passed into each tournament setup to populate the content") @QueryParam("tournamentData")  String tournamentData,@ApiParam(value = "The style of tournament to build, options are: TOURNAMENT, POOLPLAY", allowableValues="TOURNAMENT, POOLPLAY, MULTISTAGE", defaultValue = "MULTISTAGE") @DefaultValue("MULTISTAGE") @QueryParam("missionType")  String missionType,@ApiParam(value = "Sets the visibility flag for the tournament", allowableValues="PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE", defaultValue = "PUBLIC") @DefaultValue("PUBLIC") @QueryParam("visibility")  String visibility,@ApiParam(value = "The number of initial preliminary groups in a multi-stage tournament (this is expected to be a power of two number)", defaultValue = "1") @DefaultValue("1") @QueryParam("preliminaryGroups")  Integer preliminaryGroups,@ApiParam(value = "This determines how many people can advance per round in a preliminary group (this is a comma separated list of integers)", defaultValue = "1") @DefaultValue("1") @QueryParam("preliminaryGroupAdvancements")  String preliminaryGroupAdvancements,@ApiParam(value = "This determines if multiple submissions/entries are allowed in a multi-stage album tournament", defaultValue = "false") @DefaultValue("false") @QueryParam("enableMultipleEntries")  Boolean enableMultipleEntries,@ApiParam(value = "This determines if users are allowed to vote multiple times per group in a multi-stage album tournament", defaultValue = "false") @DefaultValue("false") @QueryParam("enableMultipleVotes")  Boolean enableMultipleVotes,@ApiParam(value = "This determines whether the tournament is \"featured\" or not", defaultValue = "false") @DefaultValue("false") @QueryParam("featured")  Boolean featured,@ApiParam(value = "This sets what analytic tag is used when a winner is determined") @QueryParam("winnerTag")  String winnerTag,@ApiParam(value = "This sets what analytic tag is used when a tie has occurred") @QueryParam("tieTag")  String tieTag,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createTournament(accountId, appKey, title, costToPlay, startDate, subType, imageAssetId, secondsBetweenLevels, secondsForTieBreaker, secondsBetweenPacks, maximumLevelLength, costToPlayType, minimumToPlay, startingLimit, availableLimit, description, metaData, audienceIds, active, enableBuyBack, offerIds, offerAssetId, fixedReward, splitReward, allocateTickets, tournamentData, missionType, visibility, preliminaryGroups, preliminaryGroupAdvancements, enableMultipleEntries, enableMultipleVotes, featured, winnerTag, tieTag, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Tournament", notes = "Delete a tournament.", response = SirqulResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteTournament(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the mission to delete", required = true) @QueryParam("missionId") @NotNull  Long missionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteTournament(accountId, missionId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Tournament", notes = "Get a tournament.", response = TournamentResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TournamentResponse.class)
    })
    public Response getTournament(@ApiParam(value = "The id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The id of the mission to return (either missionId or joinCode is required)") @QueryParam("missionId")  Long missionId,@ApiParam(value = "Optional identifier for getting the tournament (either missionId or joinCode is required)") @QueryParam("joinCode")  String joinCode,@ApiParam(value = "Determines which type of scores are returned. Possible values include: ALL, MINE", allowableValues="ALL, MINE") @QueryParam("includeScores")  String includeScores,@ApiParam(value = "Determines the max number of game objects that will get returned for each game level response", defaultValue = "50") @DefaultValue("50") @QueryParam("objectPreviewSize")  Integer objectPreviewSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTournament(accountId, missionId, joinCode, includeScores, objectPreviewSize, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/object/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Tournament Objects", notes = "Search on game objects of tournaments", response = SirqulResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response searchObjects(@ApiParam(value = "the account ID", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the game level id to filter results by", required = true) @QueryParam("gameLevelId") @NotNull  Long gameLevelId,@ApiParam(value = "the field to sort by", allowableValues="ID, PLAYER_SCORE_COUNT", defaultValue = "PLAYER_SCORE_COUNT") @DefaultValue("PLAYER_SCORE_COUNT") @QueryParam("sortField")  String sortField,@ApiParam(value = "determines whether the sorted list is in descending or ascending order", defaultValue = "true") @DefaultValue("true") @QueryParam("descending")  Boolean descending,@ApiParam(value = "the start index for pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "the limit for pagination", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchObjects(accountId, gameLevelId, sortField, descending, start, limit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/round/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Tournament Rounds", notes = "Search for the user's tournament games.", response = SirqulResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response searchRounds(@ApiParam(value = "the account ID", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "comma separated list of statuses to filter results by", defaultValue = "ACCEPTED,ACTIVE") @DefaultValue("ACCEPTED,ACTIVE") @QueryParam("status")  String status,@ApiParam(value = "The style of tournament to search for, options are: TOURNAMENT, POOLPLAY", allowableValues="TOURNAMENT, POOLPLAY") @QueryParam("missionType")  String missionType,@ApiParam(value = "search for games that are flagged current only", defaultValue = "true") @DefaultValue("true") @QueryParam("currentOnly")  Boolean currentOnly,@ApiParam(value = "Filter tournament rounds by the mission visibility flag", defaultValue = "PUBLIC") @DefaultValue("PUBLIC") @QueryParam("visibilities")  String visibilities,@ApiParam(value = "the start index for pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "the limit for pagination", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchRounds(accountId, appKey, status, missionType, currentOnly, visibilities, start, limit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Tournaments", notes = "Search for tournaments", response = MissionShortResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionShortResponse.class)
    })
    public Response searchTournaments(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "the keyword to search tournament on") @QueryParam("keyword")  String keyword,@ApiParam(value = "filter results by subType") @QueryParam("subType")  String subType,@ApiParam(value = "whether to include inactives in the search or not", defaultValue = "false") @DefaultValue("false") @QueryParam("includeInactive")  Boolean includeInactive,@ApiParam(value = "comma separated list of mission types to filter results, possbile values include: TOURNAMENT, POOLPLAY, MULTISTAGE", defaultValue = "MULTISTAGE,TOURNAMENT,POOLPLAY") @DefaultValue("MULTISTAGE,TOURNAMENT,POOLPLAY") @QueryParam("missionTypes")  String missionTypes,@ApiParam(value = "filter tournaments by the tournament's current state", allowableValues="ALL, UPCOMING, PAST, PRESENT, ACTIVE", defaultValue = "UPCOMING") @DefaultValue("UPCOMING") @QueryParam("filter")  String filter,@ApiParam(value = "which field to sort on", allowableValues="ACTIVE, TITLE, DESCRIPTION, CREATED, UPDATED, MISSION_TYPE, OWNER_DISPLAY, START_DATE, END_DATE, STARTING_LIMIT, AVAILABLE_LIMIT, INVITE_COUNT, ACCEPTED_COUNT", defaultValue = "START_DATE") @DefaultValue("START_DATE") @QueryParam("sortField")  String sortField,@ApiParam(value = "Determines whether to return results in descending order. The default value will be true if the filter is \"PAST\", otherwise the default value will be false.") @QueryParam("descending")  Boolean descending,@ApiParam(value = "Comma separated list of visibility flags for search for, possible values include: PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE", defaultValue = "PUBLIC") @DefaultValue("PUBLIC") @QueryParam("visibility")  String visibility,@ApiParam(value = "Start the result set at some index.", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "Limit the result to some number", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchTournaments(accountId, appKey, keyword, subType, includeInactive, missionTypes, filter, sortField, descending, visibility, start, limit, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/score")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Submit Tournament Score", notes = "Submit an array of scores for a tournament match. ", response = SirqulResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response submitTournamentScore(@ApiParam(value = "The logged in user account ID.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The application key.", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The missionId to score for", required = true) @QueryParam("missionId") @NotNull  Long missionId,@ApiParam(value = "The gameId to score for", required = true) @QueryParam("gameId") @NotNull  Long gameId,@ApiParam(value = "The packId to score for", required = true) @QueryParam("packId") @NotNull  Long packId,@ApiParam(value = "a JSON Array of scores to submit for a tournament match ```json [   {     \"accountId\": 2,     \"points\": 3   },   {     \"accountId\": 1777662,     \"points\": 7   } ] ``` ", required = true) @QueryParam("scores") @NotNull  String scores,@ApiParam(value = "The gameLevelId to score for") @QueryParam("gameLevelId")  Long gameLevelId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.submitTournamentScore(accountId, appKey, missionId, gameId, packId, scores, gameLevelId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/vote")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Submit a vote for a multi-stage album tournament.", notes = "Submit a vote for a multi-stage album tournament.", response = SirqulResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response submitTournamentVote(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The application to target", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The tournament's primary id", required = true) @QueryParam("missionId") @NotNull  Long missionId,@ApiParam(value = "The tournament game object the user wants to vote on", required = true) @QueryParam("gameObjectId") @NotNull  Long gameObjectId,@ApiParam(value = "The unique id of the device making the request (optional)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "When true, check if the device already voted to prevent duplicate votes from the same device", defaultValue = "false") @DefaultValue("false") @QueryParam("checkIfDeviceAlreadyVoted")  Boolean checkIfDeviceAlreadyVoted,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.submitTournamentVote(accountId, appKey, missionId, gameObjectId, deviceId, checkIfDeviceAlreadyVoted, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/substitute")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Substitute Tournament Player", notes = "Service to replace the user's opponent in the current level - pack - mission with an AI account.", response = SirqulResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response substituteTournamentPlayer(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the mission", required = true) @QueryParam("missionId") @NotNull  Long missionId,@ApiParam(value = "the id of the pack", required = true) @QueryParam("packId") @NotNull  Long packId,@ApiParam(value = "the id of the game level", required = true) @QueryParam("gameLevelId") @NotNull  Long gameLevelId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.substituteTournamentPlayer(accountId, missionId, packId, gameLevelId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Tournament", notes = "Update a tournament.", response = TournamentResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TournamentResponse.class)
    })
    public Response updateTournament(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The mission/tournament to update", required = true) @QueryParam("missionId") @NotNull  Long missionId,@ApiParam(value = "The title of the tournament") @QueryParam("title")  String title,@ApiParam(value = "Custom string client apps can use for searching/filtering missions") @QueryParam("subType")  String subType,@ApiParam(value = "The asset ID to attach to the tournament") @QueryParam("imageAssetId")  Long imageAssetId,@ApiParam(value = "The number of seconds in between the start of each tournament game") @QueryParam("secondsBetweenLevels")  Integer secondsBetweenLevels,@ApiParam(value = "The number of seconds to extend the round end time in the case of a tie breaker") @QueryParam("secondsForTieBreaker")  Integer secondsForTieBreaker,@ApiParam(value = "The number of seconds in between the start of each tournament round") @QueryParam("secondsBetweenPacks")  Integer secondsBetweenPacks,@ApiParam(value = "The maximum number of seconds the match is expected to end at, which gets used to determine when a match should end when there is no activity") @QueryParam("maximumLevelLength")  Integer maximumLevelLength,@ApiParam(value = "The number of tickets required to pay to enter the tournament") @QueryParam("costToPlay")  Integer costToPlay,@ApiParam(value = "The type of ticket required to pay") @QueryParam("costToPlayType")  String costToPlayType,@ApiParam(value = "The minimum number of players required to sign up for the tournament to be played") @QueryParam("minimumToPlay")  Integer minimumToPlay,@ApiParam(value = "The starting number of players for a tournament (filled with AI's)") @QueryParam("startingLimit")  Integer startingLimit,@ApiParam(value = "The maximum number of players for a tournament (currently 128 but not enforced)") @QueryParam("availableLimit")  Integer availableLimit,@ApiParam(value = "The description of the tournament") @QueryParam("description")  String description,@ApiParam(value = "External custom client defined data") @QueryParam("metaData")  String metaData,@ApiParam(value = "The date/time to start the tournament") @QueryParam("startDate")  Long startDate,@ApiParam(value = "The audiences associated with the tournament") @QueryParam("audienceIds")  String audienceIds,@ApiParam(value = "Activate/deactivate the mission") @QueryParam("active")  Boolean active,@ApiParam(value = "Determines whether to allow players to buy back into a tournament") @QueryParam("enableBuyBack")  Boolean enableBuyBack,@ApiParam(value = "The list of offers to give as a reward beyond the tickets") @QueryParam("offerIds")  String offerIds,@ApiParam(value = "The artwork ID to attach to the reward offer") @QueryParam("offerAssetId")  Long offerAssetId,@ApiParam(value = "If set then do not update the ticket reward, auto set to true if offerIds provided") @QueryParam("fixedReward")  Boolean fixedReward,@ApiParam(value = "Set the rules for handling the reward in case of a tie, values: EVEN split the reward evenly ALL everyone gets the full reward value FIRST first score submitted RANDOM random player who scored", allowableValues="EVEN, ALL, FIRST, RANDOM") @QueryParam("splitReward")  String splitReward,@ApiParam(value = "Flag to indicate owner should receive tickets for completed missions") @QueryParam("allocateTickets")  Boolean allocateTickets,@ApiParam(value = "A text based string that will be passed into each tournament setup to populate the content") @QueryParam("tournamentData")  String tournamentData,@ApiParam(value = "Sets the visibility flag for the tournament", allowableValues="PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE") @QueryParam("visibility")  String visibility,@ApiParam(value = "The number of initial preliminary groups in a multi-stage tournament (this is expected to be a power of two number)") @QueryParam("preliminaryGroups")  Integer preliminaryGroups,@ApiParam(value = "This determines how many people can advance per round in a preliminary group (this is a comma separated list of integers)") @QueryParam("preliminaryGroupAdvancements")  String preliminaryGroupAdvancements,@ApiParam(value = "This determines if multiple submissions/entries are allowed in a multi-stage album tournament") @QueryParam("enableMultipleEntries")  Boolean enableMultipleEntries,@ApiParam(value = "This determines if users are allowed to vote multiple times per group in a multi-stage album tournament") @QueryParam("enableMultipleVotes")  Boolean enableMultipleVotes,@ApiParam(value = "This determines whether the tournament is \"featured\" or not") @QueryParam("featured")  Boolean featured,@ApiParam(value = "This sets what analytic tag is used when a winner is determined") @QueryParam("winnerTag")  String winnerTag,@ApiParam(value = "This sets what analytic tag is used when a winner is determined") @QueryParam("tieTag")  String tieTag,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateTournament(accountId, missionId, title, subType, imageAssetId, secondsBetweenLevels, secondsForTieBreaker, secondsBetweenPacks, maximumLevelLength, costToPlay, costToPlayType, minimumToPlay, startingLimit, availableLimit, description, metaData, startDate, audienceIds, active, enableBuyBack, offerIds, offerAssetId, fixedReward, splitReward, allocateTickets, tournamentData, visibility, preliminaryGroups, preliminaryGroupAdvancements, enableMultipleEntries, enableMultipleVotes, featured, winnerTag, tieTag, securityContext);
    }
}
