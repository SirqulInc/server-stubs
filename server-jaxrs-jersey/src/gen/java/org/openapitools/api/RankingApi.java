package org.openapitools.api;

import org.openapitools.api.RankingApiService;
import org.openapitools.api.factories.RankingApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.RankFullResponse;
import org.openapitools.model.SirqulResponse;

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

@Path("/ranking")


@io.swagger.annotations.Api(description = "the ranking API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RankingApi  {
   private final RankingApiService delegate;

   public RankingApi(@Context ServletConfig servletContext) {
      RankingApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("RankingApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (RankingApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = RankingApiServiceFactory.getRankingApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    @Path("/historical/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Historical Rankings", notes = "Get historical leaderboard rankings by time-frame.", response = RankFullResponse.class, tags={ "Ranking", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RankFullResponse.class)
    })
    public Response getHistoricalRankings(@ApiParam(value = "the application key for filtering results by application", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "the rank type to return", required = true) @QueryParam("rankType") @NotNull  String rankType,@ApiParam(value = "timestamp in milliseconds to filter results with", required = true) @QueryParam("startDate") @NotNull  Long startDate,@ApiParam(value = "timestamp in milliseconds to filter results with", required = true) @QueryParam("endDate") @NotNull  Long endDate,@ApiParam(value = "a unique id given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user") @QueryParam("accountId")  Long accountId,@ApiParam(value = "determines how to order and rank the results. Possible values include: TOTAL, MONTHLY, WEEKLY, DAILY, TOP, LOWEST", defaultValue = "TOTAL") @DefaultValue("TOTAL") @QueryParam("sortField")  String sortField,@ApiParam(value = "determines whether to return results in ascending or descending order", defaultValue = "true") @DefaultValue("true") @QueryParam("descending")  Boolean descending,@ApiParam(value = "the start index for pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "the limit for pagination", defaultValue = "100") @DefaultValue("100") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getHistoricalRankings(appKey, rankType, startDate, endDate, deviceId, accountId, sortField, descending, start, limit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Rankings", notes = "Get leader board rankings. This is an all in one endpoint that can return multiple ranking types and also the current user rank.", response = RankFullResponse.class, tags={ "Ranking", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RankFullResponse.class)
    })
    public Response getRankings(@ApiParam(value = "a unique id given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "This parameter is deprecated.") @QueryParam("gameType")  String gameType,@ApiParam(value = "the application key for filtering results by application (required for non-EXECUTIVE users)") @QueryParam("appKey")  String appKey,@ApiParam(value = "This parameter is deprecated.") @QueryParam("q")  String q,@ApiParam(value = "keyword to search for") @QueryParam("keyword")  String keyword,@ApiParam(value = "a comma separated list of rank types to return. Possible default rank types: POINTS, DOWNLOADS, INVITATIONS", defaultValue = "POINTS,DOWNLOADS,INVITATIONS") @DefaultValue("POINTS,DOWNLOADS,INVITATIONS") @QueryParam("rankType")  String rankType,@ApiParam(value = "the type of search to perform. Possible values include: GLOBAL - searches scores globally (all users in the system are included in the ranking) LOCAL - filters results by select users and on users that have logged into the same device CUSTOM - allows for custom filtering using the params: withinAccountIds, albumId, audienceId", defaultValue = "GLOBAL") @DefaultValue("GLOBAL") @QueryParam("leaderboardMode")  String leaderboardMode,@ApiParam(value = "comma separated list of account ids. If performing a LOCAL or CUSTOM search, the query will include these accounts.") @QueryParam("withinAccountIds")  String withinAccountIds,@ApiParam(value = "determines whether to return the user's current rank in the response. This can be turned off for sequential paginated requests.", defaultValue = "true") @DefaultValue("true") @QueryParam("returnUserRank")  Boolean returnUserRank,@ApiParam(value = "album id to use when performing CUSTOM filters") @QueryParam("albumId")  Long albumId,@ApiParam(value = "audience id to use when performing CUSTOM filters") @QueryParam("audienceId")  Long audienceId,@ApiParam(value = "determines how to order and rank the results. Possible values include: TOTAL - order results by total score MONTHLY - order results by monthly score WEEKLY - order results by weekly score DAILY - order results by daily score TOP - order results by top score LOWEST - order results by lowest score", defaultValue = "TOTAL") @DefaultValue("TOTAL") @QueryParam("sortField")  String sortField,@ApiParam(value = "determines whether to return results in ascending or descending order", defaultValue = "true") @DefaultValue("true") @QueryParam("descending")  Boolean descending,@ApiParam(value = "This parameter is deprecated.") @QueryParam("_i")  Integer i,@ApiParam(value = "the start index for pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "This parameter is deprecated.") @QueryParam("_l")  Integer l,@ApiParam(value = "the limit for pagination", defaultValue = "100") @DefaultValue("100") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getRankings(deviceId, accountId, gameType, appKey, q, keyword, rankType, leaderboardMode, withinAccountIds, returnUserRank, albumId, audienceId, sortField, descending, i, start, l, limit, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/personal/ranks")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Personal Rankings", notes = "Returns the user's ranks for one or more rank types and modes.", response = Object.class, tags={ "Ranking", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Object.class)
    })
    public Response getUserRank(@ApiParam(value = "a unique id given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the application key for filtering results by application (required)") @QueryParam("appKey")  String appKey,@ApiParam(value = "pass in all rankTypes and children rankTypes") @QueryParam("rankType")  String rankType,@ApiParam(value = "determines whether to return the user's current rank in the response, for each rankType", defaultValue = "false") @DefaultValue("false") @QueryParam("returnUserRank")  Boolean returnUserRank,@ApiParam(value = "the type of search to perform. Possible values include: GLOBAL, LOCAL, SEARCH, CUSTOM", defaultValue = "GLOBAL") @DefaultValue("GLOBAL") @QueryParam("leaderboardMode")  String leaderboardMode,@ApiParam(value = "determines how to order and rank the results. Possible values include: TOTAL, MONTHLY, WEEKLY, DAILY, TOP, LOWEST", defaultValue = "TOTAL") @DefaultValue("TOTAL") @QueryParam("sortField")  String sortField,@ApiParam(value = "keyword to search for (on rankType)") @QueryParam("keyword")  String keyword,@ApiParam(value = "determines whether to return results in descending order", defaultValue = "true") @DefaultValue("true") @QueryParam("descending")  Boolean descending,@ApiParam(value = "the start index for pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "the limit for pagination", defaultValue = "100") @DefaultValue("100") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserRank(deviceId, accountId, appKey, rankType, returnUserRank, leaderboardMode, sortField, keyword, descending, start, limit, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/override")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Override User Rank", notes = "Allows an admin of an application to override a user's scores for a leaderboard.", response = SirqulResponse.class, tags={ "Ranking", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response overrideUserRank(@ApiParam(value = "the logged in user's account id (must have permissions to manage data for the application)", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the end user's account id to override", required = true) @QueryParam("ownerAccountId") @NotNull  Long ownerAccountId,@ApiParam(value = "the application key the leaderboard is for", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "the rankType of the leaderboard", required = true) @QueryParam("rankType") @NotNull  String rankType,@ApiParam(value = "the total score to update") @QueryParam("totalScore")  Long totalScore,@ApiParam(value = "the total count to update") @QueryParam("totalCount")  Long totalCount,@ApiParam(value = "the total time to update") @QueryParam("totalTime")  Long totalTime,@ApiParam(value = "the daily score to update") @QueryParam("dailyScore")  Long dailyScore,@ApiParam(value = "the daily count to update") @QueryParam("dailyCount")  Long dailyCount,@ApiParam(value = "the daily time to update") @QueryParam("dailyTime")  Long dailyTime,@ApiParam(value = "the weekly score to update") @QueryParam("weeklyScore")  Long weeklyScore,@ApiParam(value = "the weekly count to update") @QueryParam("weeklyCount")  Long weeklyCount,@ApiParam(value = "the weekly time to update") @QueryParam("weeklyTime")  Long weeklyTime,@ApiParam(value = "the monthly score to update") @QueryParam("monthlyScore")  Long monthlyScore,@ApiParam(value = "the monthly count to update") @QueryParam("monthlyCount")  Long monthlyCount,@ApiParam(value = "the monthly time to update") @QueryParam("monthlyTime")  Long monthlyTime,@ApiParam(value = "the top score to update") @QueryParam("topScore")  Long topScore,@ApiParam(value = "the lowest score to update") @QueryParam("lowestScore")  Long lowestScore,@ApiParam(value = "the streak count to update") @QueryParam("streakCount")  Long streakCount,@ApiParam(value = "the best streak count to update") @QueryParam("streakBestCount")  Long streakBestCount,@ApiParam(value = "the start date to update") @QueryParam("startDate")  Long startDate,@ApiParam(value = "the end date to update") @QueryParam("endDate")  Long endDate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.overrideUserRank(accountId, ownerAccountId, appKey, rankType, totalScore, totalCount, totalTime, dailyScore, dailyCount, dailyTime, weeklyScore, weeklyCount, weeklyTime, monthlyScore, monthlyCount, monthlyTime, topScore, lowestScore, streakCount, streakBestCount, startDate, endDate, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Ranking", notes = "Update the rank value ", response = SirqulResponse.class, tags={ "Ranking", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response updateRankings(@ApiParam(value = "the account id of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the application key for filtering results by application", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "a unique label for identifying the ranking. This can be any alphanumeric string (no spaces or special characters) with a maximum length of 64 characters. There are also default rank types to use which include: POINTS, DOWNLOADS, INVITATIONS, CREATIONS, VOTES, REDEEMED, ACTIONS", required = true) @QueryParam("rankType") @NotNull  String rankType,@ApiParam(value = "the value to increment", defaultValue = "1") @DefaultValue("1") @QueryParam("increment")  Long increment,@ApiParam(value = "the time value to increment") @QueryParam("timeIncrement")  Long timeIncrement,@ApiParam(value = "the analytic tag for this achievement (used to validate scores)") @QueryParam("tag")  String tag,@ApiParam(value = "custom date you can save along with the score for the user") @QueryParam("startDate")  Long startDate,@ApiParam(value = "custom date you can save along with the score for the user") @QueryParam("endDate")  Long endDate,@ApiParam(value = "update the global rankings if true, default is false") @QueryParam("updateGlobal")  Boolean updateGlobal,@ApiParam(value = "create the leaderboard if it does not exist (default false)", defaultValue = "false") @DefaultValue("false") @QueryParam("createLeaderboard")  Boolean createLeaderboard,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateRankings(accountId, appKey, rankType, increment, timeIncrement, tag, startDate, endDate, updateGlobal, createLeaderboard, securityContext);
    }
}
