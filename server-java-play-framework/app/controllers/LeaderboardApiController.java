package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.LeaderboardResponse;
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
public class LeaderboardApiController extends Controller {
    private final LeaderboardApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private LeaderboardApiController(Config configuration, LeaderboardApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createLeaderboard(Http.Request request, BigDecimal version) throws Exception {
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
        String valueleaderboardMode = request.getQueryString("leaderboardMode");
        String leaderboardMode;
        if (valueleaderboardMode != null) {
            leaderboardMode = valueleaderboardMode;
        } else {
            leaderboardMode = null;
        }
        String valueiconMedia = request.getQueryString("iconMedia");
        InputStream iconMedia;
        if (valueiconMedia != null) {
            iconMedia = valueiconMedia;
        } else {
            iconMedia = null;
        }
        String valueiconAssetId = request.getQueryString("iconAssetId");
        Long iconAssetId;
        if (valueiconAssetId != null) {
            iconAssetId = Long.parseLong(valueiconAssetId);
        } else {
            iconAssetId = null;
        }
        String valuebannerMedia = request.getQueryString("bannerMedia");
        InputStream bannerMedia;
        if (valuebannerMedia != null) {
            bannerMedia = valuebannerMedia;
        } else {
            bannerMedia = null;
        }
        String valuebannerAssetId = request.getQueryString("bannerAssetId");
        Long bannerAssetId;
        if (valuebannerAssetId != null) {
            bannerAssetId = Long.parseLong(valuebannerAssetId);
        } else {
            bannerAssetId = null;
        }
        String valuelimitation = request.getQueryString("limitation");
        Integer limitation;
        if (valuelimitation != null) {
            limitation = Integer.parseInt(valuelimitation);
        } else {
            limitation = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = null;
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            title = null;
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        return imp.createLeaderboardHttp(request, version, accountId, appKey, rankType, leaderboardMode, iconMedia, iconAssetId, bannerMedia, bannerAssetId, limitation, sortField, title, description, metaData);
    }

    @ApiAction
    public Result deleteLeaderboard(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueleaderboardId = request.getQueryString("leaderboardId");
        Long leaderboardId;
        if (valueleaderboardId != null) {
            leaderboardId = Long.parseLong(valueleaderboardId);
        } else {
            throw new IllegalArgumentException("'leaderboardId' parameter is required");
        }
        return imp.deleteLeaderboardHttp(request, version, leaderboardId, accountId);
    }

    @ApiAction
    public Result getLeaderboard(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueleaderboardId = request.getQueryString("leaderboardId");
        Long leaderboardId;
        if (valueleaderboardId != null) {
            leaderboardId = Long.parseLong(valueleaderboardId);
        } else {
            throw new IllegalArgumentException("'leaderboardId' parameter is required");
        }
        String valueincludeFullRankingList = request.getQueryString("includeFullRankingList");
        Boolean includeFullRankingList;
        if (valueincludeFullRankingList != null) {
            includeFullRankingList = Boolean.valueOf(valueincludeFullRankingList);
        } else {
            includeFullRankingList = null;
        }
        return imp.getLeaderboardHttp(request, version, leaderboardId, accountId, includeFullRankingList);
    }

    @ApiAction
    public Result searchLeaderboards(Http.Request request, BigDecimal version) throws Exception {
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
        String valueglobalOnly = request.getQueryString("globalOnly");
        Boolean globalOnly;
        if (valueglobalOnly != null) {
            globalOnly = Boolean.valueOf(valueglobalOnly);
        } else {
            globalOnly = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valueleaderboardIds = request.getQueryString("leaderboardIds");
        String leaderboardIds;
        if (valueleaderboardIds != null) {
            leaderboardIds = valueleaderboardIds;
        } else {
            leaderboardIds = null;
        }
        String valuerankTypes = request.getQueryString("rankTypes");
        String rankTypes;
        if (valuerankTypes != null) {
            rankTypes = valuerankTypes;
        } else {
            rankTypes = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = null;
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = null;
        }
        String valueincludeInactive = request.getQueryString("includeInactive");
        Boolean includeInactive;
        if (valueincludeInactive != null) {
            includeInactive = Boolean.valueOf(valueincludeInactive);
        } else {
            includeInactive = null;
        }
        String valueincludeAppResponse = request.getQueryString("includeAppResponse");
        Boolean includeAppResponse;
        if (valueincludeAppResponse != null) {
            includeAppResponse = Boolean.valueOf(valueincludeAppResponse);
        } else {
            includeAppResponse = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.searchLeaderboardsHttp(request, version, accountId, appKey, globalOnly, keyword, leaderboardIds, rankTypes, sortField, descending, includeInactive, includeAppResponse, start, limit);
    }

    @ApiAction
    public Result updateLeaderboard(Http.Request request, BigDecimal version) throws Exception {
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
        String valueleaderboardId = request.getQueryString("leaderboardId");
        Long leaderboardId;
        if (valueleaderboardId != null) {
            leaderboardId = Long.parseLong(valueleaderboardId);
        } else {
            throw new IllegalArgumentException("'leaderboardId' parameter is required");
        }
        String valuerankType = request.getQueryString("rankType");
        String rankType;
        if (valuerankType != null) {
            rankType = valuerankType;
        } else {
            rankType = null;
        }
        String valueleaderboardMode = request.getQueryString("leaderboardMode");
        String leaderboardMode;
        if (valueleaderboardMode != null) {
            leaderboardMode = valueleaderboardMode;
        } else {
            leaderboardMode = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = null;
        }
        String valueiconMedia = request.getQueryString("iconMedia");
        InputStream iconMedia;
        if (valueiconMedia != null) {
            iconMedia = valueiconMedia;
        } else {
            iconMedia = null;
        }
        String valueiconAssetId = request.getQueryString("iconAssetId");
        Long iconAssetId;
        if (valueiconAssetId != null) {
            iconAssetId = Long.parseLong(valueiconAssetId);
        } else {
            iconAssetId = null;
        }
        String valuebannerMedia = request.getQueryString("bannerMedia");
        InputStream bannerMedia;
        if (valuebannerMedia != null) {
            bannerMedia = valuebannerMedia;
        } else {
            bannerMedia = null;
        }
        String valuebannerAssetId = request.getQueryString("bannerAssetId");
        Long bannerAssetId;
        if (valuebannerAssetId != null) {
            bannerAssetId = Long.parseLong(valuebannerAssetId);
        } else {
            bannerAssetId = null;
        }
        String valuelimitation = request.getQueryString("limitation");
        Integer limitation;
        if (valuelimitation != null) {
            limitation = Integer.parseInt(valuelimitation);
        } else {
            limitation = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            title = null;
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        return imp.updateLeaderboardHttp(request, version, leaderboardId, accountId, appKey, rankType, leaderboardMode, sortField, iconMedia, iconAssetId, bannerMedia, bannerAssetId, limitation, active, title, description, metaData);
    }

}
