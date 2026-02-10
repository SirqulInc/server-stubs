package controllers;

import java.math.BigDecimal;
import apimodels.RankFullResponse;
import apimodels.SirqulResponse;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class RankingApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getHistoricalRankingsHttp(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String rankType, @NotNull Long startDate, @NotNull Long endDate, String deviceId, Long accountId, String sortField, Boolean descending, Integer start, Integer limit) throws Exception {
        RankFullResponse obj = getHistoricalRankings(request, version, appKey, rankType, startDate, endDate, deviceId, accountId, sortField, descending, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RankFullResponse getHistoricalRankings(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String rankType, @NotNull Long startDate, @NotNull Long endDate, String deviceId, Long accountId, String sortField, Boolean descending, Integer start, Integer limit) throws Exception;

    public Result getRankingsHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String gameType, String appKey, String q, String keyword, String rankType, String leaderboardMode, String withinAccountIds, Boolean returnUserRank, Long albumId, Long audienceId, String sortField, Boolean descending, Integer i, Integer start, Integer l, Integer limit) throws Exception {
        RankFullResponse obj = getRankings(request, version, deviceId, accountId, gameType, appKey, q, keyword, rankType, leaderboardMode, withinAccountIds, returnUserRank, albumId, audienceId, sortField, descending, i, start, l, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RankFullResponse getRankings(Http.Request request, BigDecimal version, String deviceId, Long accountId, String gameType, String appKey, String q, String keyword, String rankType, String leaderboardMode, String withinAccountIds, Boolean returnUserRank, Long albumId, Long audienceId, String sortField, Boolean descending, Integer i, Integer start, Integer l, Integer limit) throws Exception;

    public Result getUserRankHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, String rankType, Boolean returnUserRank, String leaderboardMode, String sortField, String keyword, Boolean descending, Integer start, Integer limit) throws Exception {
        Object obj = getUserRank(request, version, deviceId, accountId, appKey, rankType, returnUserRank, leaderboardMode, sortField, keyword, descending, start, limit);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Object getUserRank(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, String rankType, Boolean returnUserRank, String leaderboardMode, String sortField, String keyword, Boolean descending, Integer start, Integer limit) throws Exception;

    public Result overrideUserRankHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long ownerAccountId, @NotNull String appKey, @NotNull String rankType, Long totalScore, Long totalCount, Long totalTime, Long dailyScore, Long dailyCount, Long dailyTime, Long weeklyScore, Long weeklyCount, Long weeklyTime, Long monthlyScore, Long monthlyCount, Long monthlyTime, Long topScore, Long lowestScore, Long streakCount, Long streakBestCount, Long startDate, Long endDate) throws Exception {
        SirqulResponse obj = overrideUserRank(request, version, accountId, ownerAccountId, appKey, rankType, totalScore, totalCount, totalTime, dailyScore, dailyCount, dailyTime, weeklyScore, weeklyCount, weeklyTime, monthlyScore, monthlyCount, monthlyTime, topScore, lowestScore, streakCount, streakBestCount, startDate, endDate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse overrideUserRank(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long ownerAccountId, @NotNull String appKey, @NotNull String rankType, Long totalScore, Long totalCount, Long totalTime, Long dailyScore, Long dailyCount, Long dailyTime, Long weeklyScore, Long weeklyCount, Long weeklyTime, Long monthlyScore, Long monthlyCount, Long monthlyTime, Long topScore, Long lowestScore, Long streakCount, Long streakBestCount, Long startDate, Long endDate) throws Exception;

    public Result updateRankingsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String rankType, Long increment, Long timeIncrement, String tag, Long startDate, Long endDate, Boolean updateGlobal, Boolean createLeaderboard) throws Exception {
        SirqulResponse obj = updateRankings(request, version, accountId, appKey, rankType, increment, timeIncrement, tag, startDate, endDate, updateGlobal, createLeaderboard);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse updateRankings(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String rankType, Long increment, Long timeIncrement, String tag, Long startDate, Long endDate, Boolean updateGlobal, Boolean createLeaderboard) throws Exception;

}
