package controllers;

import apimodels.AchievementProgressResponse;
import apimodels.AchievementResponse;
import apimodels.AchievementShortResponse;
import apimodels.AchievementTierResponse;
import java.math.BigDecimal;
import java.io.InputStream;
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
public class AchievementApiController extends Controller {
    private final AchievementApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private AchievementApiController(Config configuration, AchievementApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result apiVersionAchievementTierSearchPost(Http.Request request, BigDecimal version) throws Exception {
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
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valueachievementType = request.getQueryString("achievementType");
        Long achievementType;
        if (valueachievementType != null) {
            achievementType = Long.parseLong(valueachievementType);
        } else {
            achievementType = null;
        }
        String valuerankType = request.getQueryString("rankType");
        String rankType;
        if (valuerankType != null) {
            rankType = valuerankType;
        } else {
            rankType = null;
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
        String valuedescendingGoal = request.getQueryString("descendingGoal");
        Boolean descendingGoal;
        if (valuedescendingGoal != null) {
            descendingGoal = Boolean.valueOf(valuedescendingGoal);
        } else {
            descendingGoal = null;
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
        return imp.apiVersionAchievementTierSearchPostHttp(request, version, deviceId, accountId, appKey, keyword, achievementType, rankType, sortField, descending, descendingGoal, start, limit);
    }

    @ApiAction
    public Result createAchievement(Http.Request request, BigDecimal version) throws Exception {
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
        String valueanalyticsTag = request.getQueryString("analyticsTag");
        String analyticsTag;
        if (valueanalyticsTag != null) {
            analyticsTag = valueanalyticsTag;
        } else {
            analyticsTag = null;
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            throw new IllegalArgumentException("'title' parameter is required");
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuerankType = request.getQueryString("rankType");
        String rankType;
        if (valuerankType != null) {
            rankType = valuerankType;
        } else {
            rankType = null;
        }
        String valuerankIncrement = request.getQueryString("rankIncrement");
        Integer rankIncrement;
        if (valuerankIncrement != null) {
            rankIncrement = Integer.parseInt(valuerankIncrement);
        } else {
            rankIncrement = null;
        }
        String valueminIncrement = request.getQueryString("minIncrement");
        Integer minIncrement;
        if (valueminIncrement != null) {
            minIncrement = Integer.parseInt(valueminIncrement);
        } else {
            minIncrement = null;
        }
        String valuemaxIncrement = request.getQueryString("maxIncrement");
        Integer maxIncrement;
        if (valuemaxIncrement != null) {
            maxIncrement = Integer.parseInt(valuemaxIncrement);
        } else {
            maxIncrement = null;
        }
        String valuevalidate = request.getQueryString("validate");
        Boolean validate;
        if (valuevalidate != null) {
            validate = Boolean.valueOf(valuevalidate);
        } else {
            validate = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valuetriggerDefinition = request.getQueryString("triggerDefinition");
        String triggerDefinition;
        if (valuetriggerDefinition != null) {
            triggerDefinition = valuetriggerDefinition;
        } else {
            triggerDefinition = null;
        }
        return imp.createAchievementHttp(request, version, appKey, title, deviceId, accountId, analyticsTag, description, rankType, rankIncrement, minIncrement, maxIncrement, validate, active, triggerDefinition);
    }

    @ApiAction
    public Result createAchievementTier(Http.Request request, BigDecimal version) throws Exception {
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
        String valueachievementId = request.getQueryString("achievementId");
        Long achievementId;
        if (valueachievementId != null) {
            achievementId = Long.parseLong(valueachievementId);
        } else {
            throw new IllegalArgumentException("'achievementId' parameter is required");
        }
        String valueicon = request.getQueryString("icon");
        InputStream icon;
        if (valueicon != null) {
            icon = valueicon;
        } else {
            icon = null;
        }
        String valueiconAssetId = request.getQueryString("iconAssetId");
        Long iconAssetId;
        if (valueiconAssetId != null) {
            iconAssetId = Long.parseLong(valueiconAssetId);
        } else {
            iconAssetId = null;
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
        String valuegoalCount = request.getQueryString("goalCount");
        Long goalCount;
        if (valuegoalCount != null) {
            goalCount = Long.parseLong(valuegoalCount);
        } else {
            goalCount = null;
        }
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            missionId = null;
        }
        String valuegameId = request.getQueryString("gameId");
        Long gameId;
        if (valuegameId != null) {
            gameId = Long.parseLong(valuegameId);
        } else {
            gameId = null;
        }
        String valuepackId = request.getQueryString("packId");
        Long packId;
        if (valuepackId != null) {
            packId = Long.parseLong(valuepackId);
        } else {
            packId = null;
        }
        String valuegameLevelId = request.getQueryString("gameLevelId");
        Long gameLevelId;
        if (valuegameLevelId != null) {
            gameLevelId = Long.parseLong(valuegameLevelId);
        } else {
            gameLevelId = null;
        }
        String valuegameObjectId = request.getQueryString("gameObjectId");
        Integer gameObjectId;
        if (valuegameObjectId != null) {
            gameObjectId = Integer.parseInt(valuegameObjectId);
        } else {
            gameObjectId = null;
        }
        String valuescoreAllInstances = request.getQueryString("scoreAllInstances");
        Boolean scoreAllInstances;
        if (valuescoreAllInstances != null) {
            scoreAllInstances = Boolean.valueOf(valuescoreAllInstances);
        } else {
            throw new IllegalArgumentException("'scoreAllInstances' parameter is required");
        }
        return imp.createAchievementTierHttp(request, version, achievementId, scoreAllInstances, deviceId, accountId, icon, iconAssetId, title, description, goalCount, missionId, gameId, packId, gameLevelId, gameObjectId);
    }

    @ApiAction
    public Result deleteAchievement(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueachievementId = request.getQueryString("achievementId");
        Long achievementId;
        if (valueachievementId != null) {
            achievementId = Long.parseLong(valueachievementId);
        } else {
            throw new IllegalArgumentException("'achievementId' parameter is required");
        }
        return imp.deleteAchievementHttp(request, version, achievementId, accountId);
    }

    @ApiAction
    public Result deleteAchievementTier(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueachievementTierId = request.getQueryString("achievementTierId");
        Long achievementTierId;
        if (valueachievementTierId != null) {
            achievementTierId = Long.parseLong(valueachievementTierId);
        } else {
            throw new IllegalArgumentException("'achievementTierId' parameter is required");
        }
        return imp.deleteAchievementTierHttp(request, version, achievementTierId, accountId);
    }

    @ApiAction
    public Result getAchievement(Http.Request request, BigDecimal version) throws Exception {
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
        String valueachievementId = request.getQueryString("achievementId");
        Long achievementId;
        if (valueachievementId != null) {
            achievementId = Long.parseLong(valueachievementId);
        } else {
            throw new IllegalArgumentException("'achievementId' parameter is required");
        }
        String valueachievementType = request.getQueryString("achievementType");
        String achievementType;
        if (valueachievementType != null) {
            achievementType = valueachievementType;
        } else {
            achievementType = null;
        }
        return imp.getAchievementHttp(request, version, achievementId, deviceId, accountId, achievementType);
    }

    @ApiAction
    public Result getAchievementTier(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueachievementTierId = request.getQueryString("achievementTierId");
        Long achievementTierId;
        if (valueachievementTierId != null) {
            achievementTierId = Long.parseLong(valueachievementTierId);
        } else {
            throw new IllegalArgumentException("'achievementTierId' parameter is required");
        }
        return imp.getAchievementTierHttp(request, version, accountId, achievementTierId);
    }

    @ApiAction
    public Result getUserAchievements(Http.Request request, BigDecimal version) throws Exception {
        String valuereturnNulls = request.getQueryString("returnNulls");
        Boolean returnNulls;
        if (valuereturnNulls != null) {
            returnNulls = Boolean.valueOf(valuereturnNulls);
        } else {
            throw new IllegalArgumentException("'returnNulls' parameter is required");
        }
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
        String valueconnectionAccountEmail = request.getQueryString("connectionAccountEmail");
        String connectionAccountEmail;
        if (valueconnectionAccountEmail != null) {
            connectionAccountEmail = valueconnectionAccountEmail;
        } else {
            connectionAccountEmail = null;
        }
        String valueconnectionAccountId = request.getQueryString("connectionAccountId");
        Long connectionAccountId;
        if (valueconnectionAccountId != null) {
            connectionAccountId = Long.parseLong(valueconnectionAccountId);
        } else {
            connectionAccountId = null;
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
            rankType = null;
        }
        String valueachievementType = request.getQueryString("achievementType");
        String achievementType;
        if (valueachievementType != null) {
            achievementType = valueachievementType;
        } else {
            achievementType = null;
        }
        String valueincludeUndiscovered = request.getQueryString("includeUndiscovered");
        Boolean includeUndiscovered;
        if (valueincludeUndiscovered != null) {
            includeUndiscovered = Boolean.valueOf(valueincludeUndiscovered);
        } else {
            throw new IllegalArgumentException("'includeUndiscovered' parameter is required");
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        return imp.getUserAchievementsHttp(request, version, returnNulls, appKey, includeUndiscovered, deviceId, accountId, connectionAccountEmail, connectionAccountId, rankType, achievementType, latitude, longitude);
    }

    @ApiAction
    public Result listAchievementTags(Http.Request request, BigDecimal version) throws Exception {
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        return imp.listAchievementTagsHttp(request, version, appKey);
    }

    @ApiAction
    public Result listAchievements(Http.Request request, BigDecimal version) throws Exception {
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
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valueachievementType = request.getQueryString("achievementType");
        String achievementType;
        if (valueachievementType != null) {
            achievementType = valueachievementType;
        } else {
            achievementType = null;
        }
        String valuerankType = request.getQueryString("rankType");
        String rankType;
        if (valuerankType != null) {
            rankType = valuerankType;
        } else {
            rankType = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            throw new IllegalArgumentException("'sortField' parameter is required");
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            throw new IllegalArgumentException("'descending' parameter is required");
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            throw new IllegalArgumentException("'activeOnly' parameter is required");
        }
        return imp.listAchievementsHttp(request, version, sortField, descending, start, limit, activeOnly, deviceId, accountId, appKey, keyword, achievementType, rankType);
    }

    @ApiAction
    public Result searchAchievements(Http.Request request, BigDecimal version) throws Exception {
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
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valueachievementType = request.getQueryString("achievementType");
        String achievementType;
        if (valueachievementType != null) {
            achievementType = valueachievementType;
        } else {
            achievementType = null;
        }
        String valuerankType = request.getQueryString("rankType");
        String rankType;
        if (valuerankType != null) {
            rankType = valuerankType;
        } else {
            rankType = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            throw new IllegalArgumentException("'sortField' parameter is required");
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            throw new IllegalArgumentException("'descending' parameter is required");
        }
        String valueincludeTiers = request.getQueryString("includeTiers");
        Boolean includeTiers;
        if (valueincludeTiers != null) {
            includeTiers = Boolean.valueOf(valueincludeTiers);
        } else {
            throw new IllegalArgumentException("'includeTiers' parameter is required");
        }
        String valueincludeInactiveTiers = request.getQueryString("includeInactiveTiers");
        Boolean includeInactiveTiers;
        if (valueincludeInactiveTiers != null) {
            includeInactiveTiers = Boolean.valueOf(valueincludeInactiveTiers);
        } else {
            throw new IllegalArgumentException("'includeInactiveTiers' parameter is required");
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        return imp.searchAchievementsHttp(request, version, appKey, sortField, descending, includeTiers, includeInactiveTiers, start, limit, deviceId, accountId, keyword, achievementType, rankType);
    }

    @ApiAction
    public Result updateAchievement(Http.Request request, BigDecimal version) throws Exception {
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
        String valueachievementId = request.getQueryString("achievementId");
        Long achievementId;
        if (valueachievementId != null) {
            achievementId = Long.parseLong(valueachievementId);
        } else {
            achievementId = null;
        }
        String valueanalyticsTag = request.getQueryString("analyticsTag");
        String analyticsTag;
        if (valueanalyticsTag != null) {
            analyticsTag = valueanalyticsTag;
        } else {
            analyticsTag = null;
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
        String valuerankType = request.getQueryString("rankType");
        String rankType;
        if (valuerankType != null) {
            rankType = valuerankType;
        } else {
            rankType = null;
        }
        String valuerankIncrement = request.getQueryString("rankIncrement");
        Integer rankIncrement;
        if (valuerankIncrement != null) {
            rankIncrement = Integer.parseInt(valuerankIncrement);
        } else {
            rankIncrement = null;
        }
        String valueminIncrement = request.getQueryString("minIncrement");
        Integer minIncrement;
        if (valueminIncrement != null) {
            minIncrement = Integer.parseInt(valueminIncrement);
        } else {
            minIncrement = null;
        }
        String valuenullMinIncrement = request.getQueryString("nullMinIncrement");
        Boolean nullMinIncrement;
        if (valuenullMinIncrement != null) {
            nullMinIncrement = Boolean.valueOf(valuenullMinIncrement);
        } else {
            nullMinIncrement = null;
        }
        String valuemaxIncrement = request.getQueryString("maxIncrement");
        Integer maxIncrement;
        if (valuemaxIncrement != null) {
            maxIncrement = Integer.parseInt(valuemaxIncrement);
        } else {
            maxIncrement = null;
        }
        String valuenullMaxIncrement = request.getQueryString("nullMaxIncrement");
        Boolean nullMaxIncrement;
        if (valuenullMaxIncrement != null) {
            nullMaxIncrement = Boolean.valueOf(valuenullMaxIncrement);
        } else {
            nullMaxIncrement = null;
        }
        String valuevalidate = request.getQueryString("validate");
        Boolean validate;
        if (valuevalidate != null) {
            validate = Boolean.valueOf(valuevalidate);
        } else {
            validate = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valuetriggerDefinition = request.getQueryString("triggerDefinition");
        String triggerDefinition;
        if (valuetriggerDefinition != null) {
            triggerDefinition = valuetriggerDefinition;
        } else {
            triggerDefinition = null;
        }
        return imp.updateAchievementHttp(request, version, deviceId, accountId, achievementId, analyticsTag, title, description, rankType, rankIncrement, minIncrement, nullMinIncrement, maxIncrement, nullMaxIncrement, validate, active, triggerDefinition);
    }

    @ApiAction
    public Result updateAchievementTier(Http.Request request, BigDecimal version) throws Exception {
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
        String valueachievementTierId = request.getQueryString("achievementTierId");
        Long achievementTierId;
        if (valueachievementTierId != null) {
            achievementTierId = Long.parseLong(valueachievementTierId);
        } else {
            throw new IllegalArgumentException("'achievementTierId' parameter is required");
        }
        String valueicon = request.getQueryString("icon");
        InputStream icon;
        if (valueicon != null) {
            icon = valueicon;
        } else {
            icon = null;
        }
        String valueiconAssetId = request.getQueryString("iconAssetId");
        Long iconAssetId;
        if (valueiconAssetId != null) {
            iconAssetId = Long.parseLong(valueiconAssetId);
        } else {
            iconAssetId = null;
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
        String valuegoalCount = request.getQueryString("goalCount");
        Long goalCount;
        if (valuegoalCount != null) {
            goalCount = Long.parseLong(valuegoalCount);
        } else {
            goalCount = null;
        }
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            missionId = null;
        }
        String valuegameId = request.getQueryString("gameId");
        Long gameId;
        if (valuegameId != null) {
            gameId = Long.parseLong(valuegameId);
        } else {
            gameId = null;
        }
        String valuepackId = request.getQueryString("packId");
        Long packId;
        if (valuepackId != null) {
            packId = Long.parseLong(valuepackId);
        } else {
            packId = null;
        }
        String valuegameLevelId = request.getQueryString("gameLevelId");
        Long gameLevelId;
        if (valuegameLevelId != null) {
            gameLevelId = Long.parseLong(valuegameLevelId);
        } else {
            gameLevelId = null;
        }
        String valuegameObjectId = request.getQueryString("gameObjectId");
        Long gameObjectId;
        if (valuegameObjectId != null) {
            gameObjectId = Long.parseLong(valuegameObjectId);
        } else {
            gameObjectId = null;
        }
        String valuescoreAllInstances = request.getQueryString("scoreAllInstances");
        Boolean scoreAllInstances;
        if (valuescoreAllInstances != null) {
            scoreAllInstances = Boolean.valueOf(valuescoreAllInstances);
        } else {
            scoreAllInstances = null;
        }
        return imp.updateAchievementTierHttp(request, version, achievementTierId, deviceId, accountId, icon, iconAssetId, title, description, goalCount, missionId, gameId, packId, gameLevelId, gameObjectId, scoreAllInstances);
    }

    @ApiAction
    public Result updateUserAchievement(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueachievementId = request.getQueryString("achievementId");
        Long achievementId;
        if (valueachievementId != null) {
            achievementId = Long.parseLong(valueachievementId);
        } else {
            achievementId = null;
        }
        String valuetag = request.getQueryString("tag");
        String tag;
        if (valuetag != null) {
            tag = valuetag;
        } else {
            tag = null;
        }
        String valuecustomId = request.getQueryString("customId");
        Long customId;
        if (valuecustomId != null) {
            customId = Long.parseLong(valuecustomId);
        } else {
            customId = null;
        }
        String valueincrement = request.getQueryString("increment");
        Long increment;
        if (valueincrement != null) {
            increment = Long.parseLong(valueincrement);
        } else {
            increment = null;
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
        String valuereturnProgress = request.getQueryString("returnProgress");
        Boolean returnProgress;
        if (valuereturnProgress != null) {
            returnProgress = Boolean.valueOf(valuereturnProgress);
        } else {
            returnProgress = null;
        }
        return imp.updateUserAchievementHttp(request, version, accountId, achievementId, tag, customId, increment, startDate, endDate, returnProgress);
    }

}
