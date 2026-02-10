package controllers;

import java.math.BigDecimal;
import apimodels.RankFullResponse;
import apimodels.SirqulResponse;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RankingApiController extends Controller {
    private final RankingApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private RankingApiController(Config configuration, RankingApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getHistoricalRankings(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuerankType = request.getQueryString("rankType");
        String rankType;
        if (valuerankType != null) {
            rankType = valuerankType;
        } else {
            throw new IllegalArgumentException("'rankType' parameter is required");
        }
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            throw new IllegalArgumentException("'startDate' parameter is required");
        }
        String valueendDate = request.getQueryString("endDate");
        Long endDate;
        if (valueendDate != null) {
            endDate = Long.parseLong(valueendDate);
        } else {
            throw new IllegalArgumentException("'endDate' parameter is required");
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = "TOTAL";
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = true;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 100;
        }
        return imp.getHistoricalRankingsHttp(request, version, appKey, rankType, startDate, endDate, deviceId, accountId, sortField, descending, start, limit);
    }

    @ApiAction
    public Result getRankings(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuerankType = request.getQueryString("rankType");
        String rankType;
        if (valuerankType != null) {
            rankType = valuerankType;
        } else {
            rankType = "POINTS,DOWNLOADS,INVITATIONS";
        }
        String valueleaderboardMode = request.getQueryString("leaderboardMode");
        String leaderboardMode;
        if (valueleaderboardMode != null) {
            leaderboardMode = valueleaderboardMode;
        } else {
            leaderboardMode = "GLOBAL";
        }
        String valuewithinAccountIds = request.getQueryString("withinAccountIds");
        String withinAccountIds;
        if (valuewithinAccountIds != null) {
            withinAccountIds = valuewithinAccountIds;
        } else {
            withinAccountIds = null;
        }
        String valuereturnUserRank = request.getQueryString("returnUserRank");
        Boolean returnUserRank;
        if (valuereturnUserRank != null) {
            returnUserRank = Boolean.valueOf(valuereturnUserRank);
        } else {
            returnUserRank = true;
        }
        String valuealbumId = request.getQueryString("albumId");
        Long albumId;
        if (valuealbumId != null) {
            albumId = Long.parseLong(valuealbumId);
        } else {
            albumId = null;
        }
        String valueaudienceId = request.getQueryString("audienceId");
        Long audienceId;
        if (valueaudienceId != null) {
            audienceId = Long.parseLong(valueaudienceId);
        } else {
            audienceId = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = "TOTAL";
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = true;
        }
        String valuei = request.getQueryString("_i");
        Integer i;
        if (valuei != null) {
            i = Integer.parseInt(valuei);
        } else {
            i = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuel = request.getQueryString("_l");
        Integer l;
        if (valuel != null) {
            l = Integer.parseInt(valuel);
        } else {
            l = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 100;
        }
        return imp.getRankingsHttp(request, version, deviceId, accountId, gameType, appKey, q, keyword, rankType, leaderboardMode, withinAccountIds, returnUserRank, albumId, audienceId, sortField, descending, i, start, l, limit);
    }

    @ApiAction
    public Result getUserRank(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuerankType = request.getQueryString("rankType");
        String rankType;
        if (valuerankType != null) {
            rankType = valuerankType;
        } else {
            rankType = null;
        }
        String valuereturnUserRank = request.getQueryString("returnUserRank");
        Boolean returnUserRank;
        if (valuereturnUserRank != null) {
            returnUserRank = Boolean.valueOf(valuereturnUserRank);
        } else {
            returnUserRank = false;
        }
        String valueleaderboardMode = request.getQueryString("leaderboardMode");
        String leaderboardMode;
        if (valueleaderboardMode != null) {
            leaderboardMode = valueleaderboardMode;
        } else {
            leaderboardMode = "GLOBAL";
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = "TOTAL";
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = true;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 100;
        }
        return imp.getUserRankHttp(request, version, deviceId, accountId, appKey, rankType, returnUserRank, leaderboardMode, sortField, keyword, descending, start, limit);
    }

    @ApiAction
    public Result overrideUserRank(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueownerAccountId = request.getQueryString("ownerAccountId");
        Long ownerAccountId;
        if (valueownerAccountId != null) {
            ownerAccountId = Long.parseLong(valueownerAccountId);
        } else {
            throw new IllegalArgumentException("'ownerAccountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuerankType = request.getQueryString("rankType");
        String rankType;
        if (valuerankType != null) {
            rankType = valuerankType;
        } else {
            throw new IllegalArgumentException("'rankType' parameter is required");
        }
        String valuetotalScore = request.getQueryString("totalScore");
        Long totalScore;
        if (valuetotalScore != null) {
            totalScore = Long.parseLong(valuetotalScore);
        } else {
            totalScore = null;
        }
        String valuetotalCount = request.getQueryString("totalCount");
        Long totalCount;
        if (valuetotalCount != null) {
            totalCount = Long.parseLong(valuetotalCount);
        } else {
            totalCount = null;
        }
        String valuetotalTime = request.getQueryString("totalTime");
        Long totalTime;
        if (valuetotalTime != null) {
            totalTime = Long.parseLong(valuetotalTime);
        } else {
            totalTime = null;
        }
        String valuedailyScore = request.getQueryString("dailyScore");
        Long dailyScore;
        if (valuedailyScore != null) {
            dailyScore = Long.parseLong(valuedailyScore);
        } else {
            dailyScore = null;
        }
        String valuedailyCount = request.getQueryString("dailyCount");
        Long dailyCount;
        if (valuedailyCount != null) {
            dailyCount = Long.parseLong(valuedailyCount);
        } else {
            dailyCount = null;
        }
        String valuedailyTime = request.getQueryString("dailyTime");
        Long dailyTime;
        if (valuedailyTime != null) {
            dailyTime = Long.parseLong(valuedailyTime);
        } else {
            dailyTime = null;
        }
        String valueweeklyScore = request.getQueryString("weeklyScore");
        Long weeklyScore;
        if (valueweeklyScore != null) {
            weeklyScore = Long.parseLong(valueweeklyScore);
        } else {
            weeklyScore = null;
        }
        String valueweeklyCount = request.getQueryString("weeklyCount");
        Long weeklyCount;
        if (valueweeklyCount != null) {
            weeklyCount = Long.parseLong(valueweeklyCount);
        } else {
            weeklyCount = null;
        }
        String valueweeklyTime = request.getQueryString("weeklyTime");
        Long weeklyTime;
        if (valueweeklyTime != null) {
            weeklyTime = Long.parseLong(valueweeklyTime);
        } else {
            weeklyTime = null;
        }
        String valuemonthlyScore = request.getQueryString("monthlyScore");
        Long monthlyScore;
        if (valuemonthlyScore != null) {
            monthlyScore = Long.parseLong(valuemonthlyScore);
        } else {
            monthlyScore = null;
        }
        String valuemonthlyCount = request.getQueryString("monthlyCount");
        Long monthlyCount;
        if (valuemonthlyCount != null) {
            monthlyCount = Long.parseLong(valuemonthlyCount);
        } else {
            monthlyCount = null;
        }
        String valuemonthlyTime = request.getQueryString("monthlyTime");
        Long monthlyTime;
        if (valuemonthlyTime != null) {
            monthlyTime = Long.parseLong(valuemonthlyTime);
        } else {
            monthlyTime = null;
        }
        String valuetopScore = request.getQueryString("topScore");
        Long topScore;
        if (valuetopScore != null) {
            topScore = Long.parseLong(valuetopScore);
        } else {
            topScore = null;
        }
        String valuelowestScore = request.getQueryString("lowestScore");
        Long lowestScore;
        if (valuelowestScore != null) {
            lowestScore = Long.parseLong(valuelowestScore);
        } else {
            lowestScore = null;
        }
        String valuestreakCount = request.getQueryString("streakCount");
        Long streakCount;
        if (valuestreakCount != null) {
            streakCount = Long.parseLong(valuestreakCount);
        } else {
            streakCount = null;
        }
        String valuestreakBestCount = request.getQueryString("streakBestCount");
        Long streakBestCount;
        if (valuestreakBestCount != null) {
            streakBestCount = Long.parseLong(valuestreakBestCount);
        } else {
            streakBestCount = null;
        }
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            startDate = null;
        }
        String valueendDate = request.getQueryString("endDate");
        Long endDate;
        if (valueendDate != null) {
            endDate = Long.parseLong(valueendDate);
        } else {
            endDate = null;
        }
        return imp.overrideUserRankHttp(request, version, accountId, ownerAccountId, appKey, rankType, totalScore, totalCount, totalTime, dailyScore, dailyCount, dailyTime, weeklyScore, weeklyCount, weeklyTime, monthlyScore, monthlyCount, monthlyTime, topScore, lowestScore, streakCount, streakBestCount, startDate, endDate);
    }

    @ApiAction
    public Result updateRankings(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuerankType = request.getQueryString("rankType");
        String rankType;
        if (valuerankType != null) {
            rankType = valuerankType;
        } else {
            throw new IllegalArgumentException("'rankType' parameter is required");
        }
        String valueincrement = request.getQueryString("increment");
        Long increment;
        if (valueincrement != null) {
            increment = Long.parseLong(valueincrement);
        } else {
            increment = 1;
        }
        String valuetimeIncrement = request.getQueryString("timeIncrement");
        Long timeIncrement;
        if (valuetimeIncrement != null) {
            timeIncrement = Long.parseLong(valuetimeIncrement);
        } else {
            timeIncrement = null;
        }
        String valuetag = request.getQueryString("tag");
        String tag;
        if (valuetag != null) {
            tag = valuetag;
        } else {
            tag = null;
        }
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            startDate = null;
        }
        String valueendDate = request.getQueryString("endDate");
        Long endDate;
        if (valueendDate != null) {
            endDate = Long.parseLong(valueendDate);
        } else {
            endDate = null;
        }
        String valueupdateGlobal = request.getQueryString("updateGlobal");
        Boolean updateGlobal;
        if (valueupdateGlobal != null) {
            updateGlobal = Boolean.valueOf(valueupdateGlobal);
        } else {
            updateGlobal = null;
        }
        String valuecreateLeaderboard = request.getQueryString("createLeaderboard");
        Boolean createLeaderboard;
        if (valuecreateLeaderboard != null) {
            createLeaderboard = Boolean.valueOf(valuecreateLeaderboard);
        } else {
            createLeaderboard = false;
        }
        return imp.updateRankingsHttp(request, version, accountId, appKey, rankType, increment, timeIncrement, tag, startDate, endDate, updateGlobal, createLeaderboard);
    }

}
