package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.RankFullResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface RankingApiService {
      Response getHistoricalRankings(String appKey,String rankType,Long startDate,Long endDate,String deviceId,Long accountId,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getRankings(String deviceId,Long accountId,String gameType,String appKey,String q,String keyword,String rankType,String leaderboardMode,String withinAccountIds,Boolean returnUserRank,Long albumId,Long audienceId,String sortField,Boolean descending,Integer i,Integer start,Integer l,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getUserRank(String deviceId,Long accountId,String appKey,String rankType,Boolean returnUserRank,String leaderboardMode,String sortField,String keyword,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response overrideUserRank(Long accountId,Long ownerAccountId,String appKey,String rankType,Long totalScore,Long totalCount,Long totalTime,Long dailyScore,Long dailyCount,Long dailyTime,Long weeklyScore,Long weeklyCount,Long weeklyTime,Long monthlyScore,Long monthlyCount,Long monthlyTime,Long topScore,Long lowestScore,Long streakCount,Long streakBestCount,Long startDate,Long endDate,SecurityContext securityContext)
      throws NotFoundException;
      Response updateRankings(Long accountId,String appKey,String rankType,Long increment,Long timeIncrement,String tag,Long startDate,Long endDate,Boolean updateGlobal,Boolean createLeaderboard,SecurityContext securityContext)
      throws NotFoundException;


}
