package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.RankFullResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RankingApiServiceImpl extends RankingApiService {
    @Override
    public Response getHistoricalRankings( @NotNull String appKey,  @NotNull String rankType,  @NotNull Long startDate,  @NotNull Long endDate, String deviceId, Long accountId, String sortField, Boolean descending, Integer start, Integer limit, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getRankings(String deviceId, Long accountId, String gameType, String appKey, String q, String keyword, String rankType, String leaderboardMode, String withinAccountIds, Boolean returnUserRank, Long albumId, Long audienceId, String sortField, Boolean descending, Integer i, Integer start, Integer l, Integer limit, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getUserRank(String deviceId, Long accountId, String appKey, String rankType, Boolean returnUserRank, String leaderboardMode, String sortField, String keyword, Boolean descending, Integer start, Integer limit, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response overrideUserRank( @NotNull Long accountId,  @NotNull Long ownerAccountId,  @NotNull String appKey,  @NotNull String rankType, Long totalScore, Long totalCount, Long totalTime, Long dailyScore, Long dailyCount, Long dailyTime, Long weeklyScore, Long weeklyCount, Long weeklyTime, Long monthlyScore, Long monthlyCount, Long monthlyTime, Long topScore, Long lowestScore, Long streakCount, Long streakBestCount, Long startDate, Long endDate, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateRankings( @NotNull Long accountId,  @NotNull String appKey,  @NotNull String rankType, Long increment, Long timeIncrement, String tag, Long startDate, Long endDate, Boolean updateGlobal, Boolean createLeaderboard, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
