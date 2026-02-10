package controllers;

import java.math.BigDecimal;
import apimodels.GameLevelListResponse;
import apimodels.GameLevelResponse;
import apimodels.QuestionResponse;
import apimodels.SirqulResponse;
import apimodels.WordzWordResponse;

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
public class GameLevelApiController extends Controller {
    private final GameLevelApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private GameLevelApiController(Config configuration, GameLevelApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createGameLevel(Http.Request request, BigDecimal version) throws Exception {
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
            appKey = null;
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("'name' parameter is required");
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuedifficulty = request.getQueryString("difficulty");
        String difficulty;
        if (valuedifficulty != null) {
            difficulty = valuedifficulty;
        } else {
            difficulty = null;
        }
        String valueappVersion = request.getQueryString("appVersion");
        String appVersion;
        if (valueappVersion != null) {
            appVersion = valueappVersion;
        } else {
            appVersion = null;
        }
        String valueassetImageId = request.getQueryString("assetImageId");
        Long assetImageId;
        if (valueassetImageId != null) {
            assetImageId = Long.parseLong(valueassetImageId);
        } else {
            assetImageId = null;
        }
        String valueassetIconId = request.getQueryString("assetIconId");
        Long assetIconId;
        if (valueassetIconId != null) {
            assetIconId = Long.parseLong(valueassetIconId);
        } else {
            assetIconId = null;
        }
        String valuegameData = request.getQueryString("gameData");
        String gameData;
        if (valuegameData != null) {
            gameData = valuegameData;
        } else {
            throw new IllegalArgumentException("'gameData' parameter is required");
        }
        String valuegameDataSuffix = request.getQueryString("gameDataSuffix");
        String gameDataSuffix;
        if (valuegameDataSuffix != null) {
            gameDataSuffix = valuegameDataSuffix;
        } else {
            throw new IllegalArgumentException("'gameDataSuffix' parameter is required");
        }
        String valuevisibility = request.getQueryString("visibility");
        String visibility;
        if (valuevisibility != null) {
            visibility = valuevisibility;
        } else {
            visibility = null;
        }
        String valuefriendGroup = request.getQueryString("friendGroup");
        Boolean friendGroup;
        if (valuefriendGroup != null) {
            friendGroup = Boolean.valueOf(valuefriendGroup);
        } else {
            friendGroup = null;
        }
        String valueconnectionIds = request.getQueryString("connectionIds");
        String connectionIds;
        if (valueconnectionIds != null) {
            connectionIds = valueconnectionIds;
        } else {
            connectionIds = null;
        }
        String valueconnectionGroupIds = request.getQueryString("connectionGroupIds");
        String connectionGroupIds;
        if (valueconnectionGroupIds != null) {
            connectionGroupIds = valueconnectionGroupIds;
        } else {
            connectionGroupIds = null;
        }
        String valuebalance = request.getQueryString("balance");
        Double balance;
        if (valuebalance != null) {
            balance = Double.parseDouble(valuebalance);
        } else {
            balance = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valueallocateTickets = request.getQueryString("allocateTickets");
        Boolean allocateTickets;
        if (valueallocateTickets != null) {
            allocateTickets = Boolean.valueOf(valueallocateTickets);
        } else {
            allocateTickets = null;
        }
        String valueticketCount = request.getQueryString("ticketCount");
        Long ticketCount;
        if (valueticketCount != null) {
            ticketCount = Long.parseLong(valueticketCount);
        } else {
            ticketCount = null;
        }
        String valueticketType = request.getQueryString("ticketType");
        String ticketType;
        if (valueticketType != null) {
            ticketType = valueticketType;
        } else {
            ticketType = null;
        }
        String valuepoints = request.getQueryString("points");
        Long points;
        if (valuepoints != null) {
            points = Long.parseLong(valuepoints);
        } else {
            points = null;
        }
        String valuetutorialTitle = request.getQueryString("tutorialTitle");
        String tutorialTitle;
        if (valuetutorialTitle != null) {
            tutorialTitle = valuetutorialTitle;
        } else {
            tutorialTitle = null;
        }
        String valuetutorialMessage = request.getQueryString("tutorialMessage");
        String tutorialMessage;
        if (valuetutorialMessage != null) {
            tutorialMessage = valuetutorialMessage;
        } else {
            tutorialMessage = null;
        }
        String valuetutorialAlignment = request.getQueryString("tutorialAlignment");
        String tutorialAlignment;
        if (valuetutorialAlignment != null) {
            tutorialAlignment = valuetutorialAlignment;
        } else {
            tutorialAlignment = null;
        }
        String valuetutorialImageAssetId = request.getQueryString("tutorialImageAssetId");
        Long tutorialImageAssetId;
        if (valuetutorialImageAssetId != null) {
            tutorialImageAssetId = Long.parseLong(valuetutorialImageAssetId);
        } else {
            tutorialImageAssetId = null;
        }
        String valueofferId = request.getQueryString("offerId");
        Long offerId;
        if (valueofferId != null) {
            offerId = Long.parseLong(valueofferId);
        } else {
            offerId = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        return imp.createGameLevelHttp(request, version, accountId, name, gameData, gameDataSuffix, appKey, description, difficulty, appVersion, assetImageId, assetIconId, visibility, friendGroup, connectionIds, connectionGroupIds, balance, active, allocateTickets, ticketCount, ticketType, points, tutorialTitle, tutorialMessage, tutorialAlignment, tutorialImageAssetId, offerId, metaData);
    }

    @ApiAction
    public Result deleteGameLevel(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuelevelId = request.getQueryString("levelId");
        Long levelId;
        if (valuelevelId != null) {
            levelId = Long.parseLong(valuelevelId);
        } else {
            throw new IllegalArgumentException("'levelId' parameter is required");
        }
        return imp.deleteGameLevelHttp(request, version, accountId, levelId);
    }

    @ApiAction
    public Result getGameLevel(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuelevelId = request.getQueryString("levelId");
        Long levelId;
        if (valuelevelId != null) {
            levelId = Long.parseLong(valuelevelId);
        } else {
            throw new IllegalArgumentException("'levelId' parameter is required");
        }
        String valueincludeGameData = request.getQueryString("includeGameData");
        Boolean includeGameData;
        if (valueincludeGameData != null) {
            includeGameData = Boolean.valueOf(valueincludeGameData);
        } else {
            includeGameData = null;
        }
        return imp.getGameLevelHttp(request, version, accountId, levelId, includeGameData);
    }

    @ApiAction
    public Result getGameLevelsByApplication(Http.Request request, BigDecimal version) throws Exception {
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
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
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
        String valueappVersion = request.getQueryString("appVersion");
        String appVersion;
        if (valueappVersion != null) {
            appVersion = valueappVersion;
        } else {
            appVersion = null;
        }
        String valueincludeGameData = request.getQueryString("includeGameData");
        Boolean includeGameData;
        if (valueincludeGameData != null) {
            includeGameData = Boolean.valueOf(valueincludeGameData);
        } else {
            includeGameData = null;
        }
        String valuefilters = request.getQueryString("filters");
        String filters;
        if (valuefilters != null) {
            filters = valuefilters;
        } else {
            filters = null;
        }
        return imp.getGameLevelsByApplicationHttp(request, version, accountId, appKey, keyword, sortField, descending, start, limit, appVersion, includeGameData, filters);
    }

    @ApiAction
    public Result getGameLevelsByBillableEntity(Http.Request request, BigDecimal version) throws Exception {
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
            appKey = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
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
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            activeOnly = null;
        }
        String valuestart = request.getQueryString("start");
        Long start;
        if (valuestart != null) {
            start = Long.parseLong(valuestart);
        } else {
            start = null;
        }
        String valuelimit = request.getQueryString("limit");
        Long limit;
        if (valuelimit != null) {
            limit = Long.parseLong(valuelimit);
        } else {
            limit = null;
        }
        return imp.getGameLevelsByBillableEntityHttp(request, version, accountId, appKey, keyword, sortField, descending, activeOnly, start, limit);
    }

    @ApiAction
    public Result getQuestionsInLevel(Http.Request request, BigDecimal version) throws Exception {
        String valuelevelId = request.getQueryString("levelId");
        Long levelId;
        if (valuelevelId != null) {
            levelId = Long.parseLong(valuelevelId);
        } else {
            throw new IllegalArgumentException("'levelId' parameter is required");
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        return imp.getQuestionsInLevelHttp(request, version, levelId, accountId);
    }

    @ApiAction
    public Result getWordsInLevel(Http.Request request, BigDecimal version) throws Exception {
        String valuelevelId = request.getQueryString("levelId");
        Long levelId;
        if (valuelevelId != null) {
            levelId = Long.parseLong(valuelevelId);
        } else {
            throw new IllegalArgumentException("'levelId' parameter is required");
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        return imp.getWordsInLevelHttp(request, version, levelId, accountId);
    }

    @ApiAction
    public Result updateGameLevel(Http.Request request, BigDecimal version) throws Exception {
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
            appKey = null;
        }
        String valuelevelId = request.getQueryString("levelId");
        Long levelId;
        if (valuelevelId != null) {
            levelId = Long.parseLong(valuelevelId);
        } else {
            throw new IllegalArgumentException("'levelId' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuedifficulty = request.getQueryString("difficulty");
        String difficulty;
        if (valuedifficulty != null) {
            difficulty = valuedifficulty;
        } else {
            difficulty = null;
        }
        String valueappVersion = request.getQueryString("appVersion");
        String appVersion;
        if (valueappVersion != null) {
            appVersion = valueappVersion;
        } else {
            appVersion = null;
        }
        String valueassetImageId = request.getQueryString("assetImageId");
        Long assetImageId;
        if (valueassetImageId != null) {
            assetImageId = Long.parseLong(valueassetImageId);
        } else {
            assetImageId = null;
        }
        String valueassetIconId = request.getQueryString("assetIconId");
        Long assetIconId;
        if (valueassetIconId != null) {
            assetIconId = Long.parseLong(valueassetIconId);
        } else {
            assetIconId = null;
        }
        String valuegameData = request.getQueryString("gameData");
        String gameData;
        if (valuegameData != null) {
            gameData = valuegameData;
        } else {
            gameData = null;
        }
        String valuegameDataSuffix = request.getQueryString("gameDataSuffix");
        String gameDataSuffix;
        if (valuegameDataSuffix != null) {
            gameDataSuffix = valuegameDataSuffix;
        } else {
            gameDataSuffix = null;
        }
        String valuevisibility = request.getQueryString("visibility");
        String visibility;
        if (valuevisibility != null) {
            visibility = valuevisibility;
        } else {
            visibility = null;
        }
        String valuefriendGroup = request.getQueryString("friendGroup");
        Boolean friendGroup;
        if (valuefriendGroup != null) {
            friendGroup = Boolean.valueOf(valuefriendGroup);
        } else {
            friendGroup = null;
        }
        String valueconnectionIds = request.getQueryString("connectionIds");
        String connectionIds;
        if (valueconnectionIds != null) {
            connectionIds = valueconnectionIds;
        } else {
            connectionIds = null;
        }
        String valueconnectionGroupIds = request.getQueryString("connectionGroupIds");
        String connectionGroupIds;
        if (valueconnectionGroupIds != null) {
            connectionGroupIds = valueconnectionGroupIds;
        } else {
            connectionGroupIds = null;
        }
        String valuebalance = request.getQueryString("balance");
        Double balance;
        if (valuebalance != null) {
            balance = Double.parseDouble(valuebalance);
        } else {
            balance = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valueallocateTickets = request.getQueryString("allocateTickets");
        Boolean allocateTickets;
        if (valueallocateTickets != null) {
            allocateTickets = Boolean.valueOf(valueallocateTickets);
        } else {
            allocateTickets = null;
        }
        String valueticketCount = request.getQueryString("ticketCount");
        Long ticketCount;
        if (valueticketCount != null) {
            ticketCount = Long.parseLong(valueticketCount);
        } else {
            ticketCount = null;
        }
        String valueticketType = request.getQueryString("ticketType");
        String ticketType;
        if (valueticketType != null) {
            ticketType = valueticketType;
        } else {
            ticketType = null;
        }
        String valuepoints = request.getQueryString("points");
        Long points;
        if (valuepoints != null) {
            points = Long.parseLong(valuepoints);
        } else {
            points = null;
        }
        String valuetutorialTitle = request.getQueryString("tutorialTitle");
        String tutorialTitle;
        if (valuetutorialTitle != null) {
            tutorialTitle = valuetutorialTitle;
        } else {
            tutorialTitle = null;
        }
        String valuetutorialMessage = request.getQueryString("tutorialMessage");
        String tutorialMessage;
        if (valuetutorialMessage != null) {
            tutorialMessage = valuetutorialMessage;
        } else {
            tutorialMessage = null;
        }
        String valuetutorialAlignment = request.getQueryString("tutorialAlignment");
        String tutorialAlignment;
        if (valuetutorialAlignment != null) {
            tutorialAlignment = valuetutorialAlignment;
        } else {
            tutorialAlignment = null;
        }
        String valuetutorialImageAssetId = request.getQueryString("tutorialImageAssetId");
        Long tutorialImageAssetId;
        if (valuetutorialImageAssetId != null) {
            tutorialImageAssetId = Long.parseLong(valuetutorialImageAssetId);
        } else {
            tutorialImageAssetId = null;
        }
        String valueofferId = request.getQueryString("offerId");
        Long offerId;
        if (valueofferId != null) {
            offerId = Long.parseLong(valueofferId);
        } else {
            offerId = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        return imp.updateGameLevelHttp(request, version, accountId, levelId, appKey, name, description, difficulty, appVersion, assetImageId, assetIconId, gameData, gameDataSuffix, visibility, friendGroup, connectionIds, connectionGroupIds, balance, active, allocateTickets, ticketCount, ticketType, points, tutorialTitle, tutorialMessage, tutorialAlignment, tutorialImageAssetId, offerId, metaData);
    }

    @ApiAction
    public Result updateQuestionsInLevel(Http.Request request, BigDecimal version) throws Exception {
        String valuelevelId = request.getQueryString("levelId");
        Long levelId;
        if (valuelevelId != null) {
            levelId = Long.parseLong(valuelevelId);
        } else {
            throw new IllegalArgumentException("'levelId' parameter is required");
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuequestionIds = request.getQueryString("questionIds");
        String questionIds;
        if (valuequestionIds != null) {
            questionIds = valuequestionIds;
        } else {
            throw new IllegalArgumentException("'questionIds' parameter is required");
        }
        return imp.updateQuestionsInLevelHttp(request, version, levelId, accountId, questionIds);
    }

    @ApiAction
    public Result updateWordsInLevel(Http.Request request, BigDecimal version) throws Exception {
        String valuelevelId = request.getQueryString("levelId");
        Long levelId;
        if (valuelevelId != null) {
            levelId = Long.parseLong(valuelevelId);
        } else {
            throw new IllegalArgumentException("'levelId' parameter is required");
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuewordIds = request.getQueryString("wordIds");
        String wordIds;
        if (valuewordIds != null) {
            wordIds = valuewordIds;
        } else {
            throw new IllegalArgumentException("'wordIds' parameter is required");
        }
        return imp.updateWordsInLevelHttp(request, version, levelId, accountId, wordIds);
    }

}
