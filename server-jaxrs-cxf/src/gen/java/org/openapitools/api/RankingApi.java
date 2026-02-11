package org.openapitools.api;

import org.openapitools.model.RankFullResponse;
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
@Path("/ranking")
@Api(value = "/", description = "")
public interface RankingApi  {

    /**
     * Search Historical Rankings
     *
     * Get historical leaderboard rankings by time-frame.
     *
     */
    @GET
    @Path("/historical/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Historical Rankings", tags={ "Ranking" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RankFullResponse.class) })
    public RankFullResponse getHistoricalRankings(@QueryParam("appKey") @NotNull String appKey, @QueryParam("rankType") @NotNull String rankType, @QueryParam("startDate") @NotNull Long startDate, @QueryParam("endDate") @NotNull Long endDate, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("sortField") @DefaultValue("TOTAL")String sortField, @QueryParam("descending") @DefaultValue("true")Boolean descending, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("100")Integer limit);

    /**
     * Search Rankings
     *
     * Get leader board rankings. This is an all in one endpoint that can return multiple ranking types and also the current user rank.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Rankings", tags={ "Ranking" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RankFullResponse.class) })
    public RankFullResponse getRankings(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("rankType") @DefaultValue("POINTS,DOWNLOADS,INVITATIONS")String rankType, @QueryParam("leaderboardMode") @DefaultValue("GLOBAL")String leaderboardMode, @QueryParam("withinAccountIds") String withinAccountIds, @QueryParam("returnUserRank") @DefaultValue("true")Boolean returnUserRank, @QueryParam("albumId") Long albumId, @QueryParam("audienceId") Long audienceId, @QueryParam("sortField") @DefaultValue("TOTAL")String sortField, @QueryParam("descending") @DefaultValue("true")Boolean descending, @QueryParam("_i") Integer i, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("_l") Integer l, @QueryParam("limit") @DefaultValue("100")Integer limit);

    /**
     * Get Personal Rankings
     *
     * Returns the user&#39;s ranks for one or more rank types and modes.
     *
     */
    @POST
    @Path("/personal/ranks")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Personal Rankings", tags={ "Ranking" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Object getUserRank(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("rankType") String rankType, @QueryParam("returnUserRank") @DefaultValue("false")Boolean returnUserRank, @QueryParam("leaderboardMode") @DefaultValue("GLOBAL")String leaderboardMode, @QueryParam("sortField") @DefaultValue("TOTAL")String sortField, @QueryParam("keyword") String keyword, @QueryParam("descending") @DefaultValue("true")Boolean descending, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("100")Integer limit);

    /**
     * Override User Rank
     *
     * Allows an admin of an application to override a user&#39;s scores for a leaderboard.
     *
     */
    @POST
    @Path("/override")
    @Produces({ "*/*" })
    @ApiOperation(value = "Override User Rank", tags={ "Ranking" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse overrideUserRank(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("ownerAccountId") @NotNull Long ownerAccountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("rankType") @NotNull String rankType, @QueryParam("totalScore") Long totalScore, @QueryParam("totalCount") Long totalCount, @QueryParam("totalTime") Long totalTime, @QueryParam("dailyScore") Long dailyScore, @QueryParam("dailyCount") Long dailyCount, @QueryParam("dailyTime") Long dailyTime, @QueryParam("weeklyScore") Long weeklyScore, @QueryParam("weeklyCount") Long weeklyCount, @QueryParam("weeklyTime") Long weeklyTime, @QueryParam("monthlyScore") Long monthlyScore, @QueryParam("monthlyCount") Long monthlyCount, @QueryParam("monthlyTime") Long monthlyTime, @QueryParam("topScore") Long topScore, @QueryParam("lowestScore") Long lowestScore, @QueryParam("streakCount") Long streakCount, @QueryParam("streakBestCount") Long streakBestCount, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate);

    /**
     * Update Ranking
     *
     * Update the rank value 
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Ranking", tags={ "Ranking" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse updateRankings(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("rankType") @NotNull String rankType, @QueryParam("increment") @DefaultValue("1")Long increment, @QueryParam("timeIncrement") Long timeIncrement, @QueryParam("tag") String tag, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("updateGlobal") Boolean updateGlobal, @QueryParam("createLeaderboard") @DefaultValue("false")Boolean createLeaderboard);
}
