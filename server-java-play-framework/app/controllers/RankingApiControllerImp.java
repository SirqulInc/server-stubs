package controllers;

import java.math.BigDecimal;
import apimodels.RankFullResponse;
import apimodels.SirqulResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RankingApiControllerImp extends RankingApiControllerImpInterface {
    @Override
    public RankFullResponse getHistoricalRankings(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String rankType, @NotNull Long startDate, @NotNull Long endDate, String deviceId, Long accountId, String sortField, Boolean descending, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new RankFullResponse();
    }

    @Override
    public RankFullResponse getRankings(Http.Request request, BigDecimal version, String deviceId, Long accountId, String gameType, String appKey, String q, String keyword, String rankType, String leaderboardMode, String withinAccountIds, Boolean returnUserRank, Long albumId, Long audienceId, String sortField, Boolean descending, Integer i, Integer start, Integer l, Integer limit) throws Exception {
        //Do your magic!!!
        return new RankFullResponse();
    }

    @Override
    public Object getUserRank(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, String rankType, Boolean returnUserRank, String leaderboardMode, String sortField, String keyword, Boolean descending, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new Object();
    }

    @Override
    public SirqulResponse overrideUserRank(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long ownerAccountId, @NotNull String appKey, @NotNull String rankType, Long totalScore, Long totalCount, Long totalTime, Long dailyScore, Long dailyCount, Long dailyTime, Long weeklyScore, Long weeklyCount, Long weeklyTime, Long monthlyScore, Long monthlyCount, Long monthlyTime, Long topScore, Long lowestScore, Long streakCount, Long streakBestCount, Long startDate, Long endDate) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse updateRankings(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String rankType, Long increment, Long timeIncrement, String tag, Long startDate, Long endDate, Boolean updateGlobal, Boolean createLeaderboard) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

}
