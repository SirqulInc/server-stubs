package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.LeaderboardResponse;
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
public abstract class LeaderboardApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createLeaderboardHttp(Http.Request request, BigDecimal version, Long accountId, String appKey, String rankType, String leaderboardMode, InputStream iconMedia, Long iconAssetId, InputStream bannerMedia, Long bannerAssetId, Integer limitation, String sortField, String title, String description, String metaData) throws Exception {
        LeaderboardResponse obj = createLeaderboard(request, version, accountId, appKey, rankType, leaderboardMode, iconMedia, iconAssetId, bannerMedia, bannerAssetId, limitation, sortField, title, description, metaData);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract LeaderboardResponse createLeaderboard(Http.Request request, BigDecimal version, Long accountId, String appKey, String rankType, String leaderboardMode, InputStream iconMedia, Long iconAssetId, InputStream bannerMedia, Long bannerAssetId, Integer limitation, String sortField, String title, String description, String metaData) throws Exception;

    public Result deleteLeaderboardHttp(Http.Request request, BigDecimal version, @NotNull Long leaderboardId, Long accountId) throws Exception {
        SirqulResponse obj = deleteLeaderboard(request, version, leaderboardId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteLeaderboard(Http.Request request, BigDecimal version, @NotNull Long leaderboardId, Long accountId) throws Exception;

    public Result getLeaderboardHttp(Http.Request request, BigDecimal version, @NotNull Long leaderboardId, Long accountId, Boolean includeFullRankingList) throws Exception {
        LeaderboardResponse obj = getLeaderboard(request, version, leaderboardId, accountId, includeFullRankingList);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract LeaderboardResponse getLeaderboard(Http.Request request, BigDecimal version, @NotNull Long leaderboardId, Long accountId, Boolean includeFullRankingList) throws Exception;

    public Result searchLeaderboardsHttp(Http.Request request, BigDecimal version, Long accountId, String appKey, Boolean globalOnly, String keyword, String leaderboardIds, String rankTypes, String sortField, Boolean descending, Boolean includeInactive, Boolean includeAppResponse, Integer start, Integer limit) throws Exception {
        LeaderboardResponse obj = searchLeaderboards(request, version, accountId, appKey, globalOnly, keyword, leaderboardIds, rankTypes, sortField, descending, includeInactive, includeAppResponse, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract LeaderboardResponse searchLeaderboards(Http.Request request, BigDecimal version, Long accountId, String appKey, Boolean globalOnly, String keyword, String leaderboardIds, String rankTypes, String sortField, Boolean descending, Boolean includeInactive, Boolean includeAppResponse, Integer start, Integer limit) throws Exception;

    public Result updateLeaderboardHttp(Http.Request request, BigDecimal version, @NotNull Long leaderboardId, Long accountId, String appKey, String rankType, String leaderboardMode, String sortField, InputStream iconMedia, Long iconAssetId, InputStream bannerMedia, Long bannerAssetId, Integer limitation, Boolean active, String title, String description, String metaData) throws Exception {
        LeaderboardResponse obj = updateLeaderboard(request, version, leaderboardId, accountId, appKey, rankType, leaderboardMode, sortField, iconMedia, iconAssetId, bannerMedia, bannerAssetId, limitation, active, title, description, metaData);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract LeaderboardResponse updateLeaderboard(Http.Request request, BigDecimal version, @NotNull Long leaderboardId, Long accountId, String appKey, String rankType, String leaderboardMode, String sortField, InputStream iconMedia, Long iconAssetId, InputStream bannerMedia, Long bannerAssetId, Integer limitation, Boolean active, String title, String description, String metaData) throws Exception;

}
