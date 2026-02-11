package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.RankingApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.RankFullResponse;
import org.openapitools.model.SirqulResponse;

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

@Path("/ranking")


@io.swagger.annotations.Api(description = "the ranking API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RankingApi  {

    @Inject RankingApiService service;

    @GET
    @Path("/historical/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Historical Rankings", notes = "Get historical leaderboard rankings by time-frame.", response = RankFullResponse.class, tags={ "Ranking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RankFullResponse.class) })
    public Response getHistoricalRankings( @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("rankType") String rankType, @NotNull @QueryParam("startDate") Long startDate, @NotNull @QueryParam("endDate") Long endDate, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("TOTAL") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("100") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getHistoricalRankings(appKey,rankType,startDate,endDate,deviceId,accountId,sortField,descending,start,limit,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Rankings", notes = "Get leader board rankings. This is an all in one endpoint that can return multiple ranking types and also the current user rank.", response = RankFullResponse.class, tags={ "Ranking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RankFullResponse.class) })
    public Response getRankings( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @DefaultValue("POINTS,DOWNLOADS,INVITATIONS") @QueryParam("rankType") String rankType, @DefaultValue("GLOBAL") @QueryParam("leaderboardMode") String leaderboardMode, @QueryParam("withinAccountIds") String withinAccountIds, @DefaultValue("true") @QueryParam("returnUserRank") Boolean returnUserRank, @QueryParam("albumId") Long albumId, @QueryParam("audienceId") Long audienceId, @DefaultValue("TOTAL") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @QueryParam("_i") Integer i, @DefaultValue("0") @QueryParam("start") Integer start, @QueryParam("_l") Integer l, @DefaultValue("100") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRankings(deviceId,accountId,gameType,appKey,q,keyword,rankType,leaderboardMode,withinAccountIds,returnUserRank,albumId,audienceId,sortField,descending,i,start,l,limit,securityContext);
    }
    @POST
    @Path("/personal/ranks")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Personal Rankings", notes = "Returns the user's ranks for one or more rank types and modes.", response = Object.class, tags={ "Ranking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response getUserRank( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("rankType") String rankType, @DefaultValue("false") @QueryParam("returnUserRank") Boolean returnUserRank, @DefaultValue("GLOBAL") @QueryParam("leaderboardMode") String leaderboardMode, @DefaultValue("TOTAL") @QueryParam("sortField") String sortField, @QueryParam("keyword") String keyword, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("100") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUserRank(deviceId,accountId,appKey,rankType,returnUserRank,leaderboardMode,sortField,keyword,descending,start,limit,securityContext);
    }
    @POST
    @Path("/override")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Override User Rank", notes = "Allows an admin of an application to override a user's scores for a leaderboard.", response = SirqulResponse.class, tags={ "Ranking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response overrideUserRank( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("ownerAccountId") Long ownerAccountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("rankType") String rankType, @QueryParam("totalScore") Long totalScore, @QueryParam("totalCount") Long totalCount, @QueryParam("totalTime") Long totalTime, @QueryParam("dailyScore") Long dailyScore, @QueryParam("dailyCount") Long dailyCount, @QueryParam("dailyTime") Long dailyTime, @QueryParam("weeklyScore") Long weeklyScore, @QueryParam("weeklyCount") Long weeklyCount, @QueryParam("weeklyTime") Long weeklyTime, @QueryParam("monthlyScore") Long monthlyScore, @QueryParam("monthlyCount") Long monthlyCount, @QueryParam("monthlyTime") Long monthlyTime, @QueryParam("topScore") Long topScore, @QueryParam("lowestScore") Long lowestScore, @QueryParam("streakCount") Long streakCount, @QueryParam("streakBestCount") Long streakBestCount, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.overrideUserRank(accountId,ownerAccountId,appKey,rankType,totalScore,totalCount,totalTime,dailyScore,dailyCount,dailyTime,weeklyScore,weeklyCount,weeklyTime,monthlyScore,monthlyCount,monthlyTime,topScore,lowestScore,streakCount,streakBestCount,startDate,endDate,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Ranking", notes = "Update the rank value ", response = SirqulResponse.class, tags={ "Ranking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateRankings( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("rankType") String rankType, @DefaultValue("1") @QueryParam("increment") Long increment, @QueryParam("timeIncrement") Long timeIncrement, @QueryParam("tag") String tag, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("updateGlobal") Boolean updateGlobal, @DefaultValue("false") @QueryParam("createLeaderboard") Boolean createLeaderboard,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateRankings(accountId,appKey,rankType,increment,timeIncrement,tag,startDate,endDate,updateGlobal,createLeaderboard,securityContext);
    }
}
