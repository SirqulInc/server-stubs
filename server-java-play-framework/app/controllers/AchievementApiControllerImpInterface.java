package controllers;

import apimodels.AchievementProgressResponse;
import apimodels.AchievementResponse;
import apimodels.AchievementShortResponse;
import apimodels.AchievementTierResponse;
import java.math.BigDecimal;
import java.io.InputStream;
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
public abstract class AchievementApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result apiVersionAchievementTierSearchPostHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, String keyword, Long achievementType, String rankType, String sortField, Boolean descending, Boolean descendingGoal, Long start, Long limit) throws Exception {
        AchievementTierResponse obj = apiVersionAchievementTierSearchPost(request, version, deviceId, accountId, appKey, keyword, achievementType, rankType, sortField, descending, descendingGoal, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AchievementTierResponse apiVersionAchievementTierSearchPost(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, String keyword, Long achievementType, String rankType, String sortField, Boolean descending, Boolean descendingGoal, Long start, Long limit) throws Exception;

    public Result createAchievementHttp(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String title, String deviceId, Long accountId, String analyticsTag, String description, String rankType, Integer rankIncrement, Integer minIncrement, Integer maxIncrement, Boolean validate, Boolean active, String triggerDefinition) throws Exception {
        AchievementResponse obj = createAchievement(request, version, appKey, title, deviceId, accountId, analyticsTag, description, rankType, rankIncrement, minIncrement, maxIncrement, validate, active, triggerDefinition);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AchievementResponse createAchievement(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String title, String deviceId, Long accountId, String analyticsTag, String description, String rankType, Integer rankIncrement, Integer minIncrement, Integer maxIncrement, Boolean validate, Boolean active, String triggerDefinition) throws Exception;

    public Result createAchievementTierHttp(Http.Request request, BigDecimal version, @NotNull Long achievementId, @NotNull Boolean scoreAllInstances, String deviceId, Long accountId, InputStream icon, Long iconAssetId, String title, String description, Long goalCount, Long missionId, Long gameId, Long packId, Long gameLevelId, Integer gameObjectId) throws Exception {
        AchievementTierResponse obj = createAchievementTier(request, version, achievementId, scoreAllInstances, deviceId, accountId, icon, iconAssetId, title, description, goalCount, missionId, gameId, packId, gameLevelId, gameObjectId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AchievementTierResponse createAchievementTier(Http.Request request, BigDecimal version, @NotNull Long achievementId, @NotNull Boolean scoreAllInstances, String deviceId, Long accountId, InputStream icon, Long iconAssetId, String title, String description, Long goalCount, Long missionId, Long gameId, Long packId, Long gameLevelId, Integer gameObjectId) throws Exception;

    public Result deleteAchievementHttp(Http.Request request, BigDecimal version, @NotNull Long achievementId, Long accountId) throws Exception {
        SirqulResponse obj = deleteAchievement(request, version, achievementId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteAchievement(Http.Request request, BigDecimal version, @NotNull Long achievementId, Long accountId) throws Exception;

    public Result deleteAchievementTierHttp(Http.Request request, BigDecimal version, @NotNull Long achievementTierId, Long accountId) throws Exception {
        SirqulResponse obj = deleteAchievementTier(request, version, achievementTierId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteAchievementTier(Http.Request request, BigDecimal version, @NotNull Long achievementTierId, Long accountId) throws Exception;

    public Result getAchievementHttp(Http.Request request, BigDecimal version, @NotNull Long achievementId, String deviceId, Long accountId, String achievementType) throws Exception {
        AchievementTierResponse obj = getAchievement(request, version, achievementId, deviceId, accountId, achievementType);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AchievementTierResponse getAchievement(Http.Request request, BigDecimal version, @NotNull Long achievementId, String deviceId, Long accountId, String achievementType) throws Exception;

    public Result getAchievementTierHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long achievementTierId) throws Exception {
        AchievementTierResponse obj = getAchievementTier(request, version, accountId, achievementTierId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AchievementTierResponse getAchievementTier(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long achievementTierId) throws Exception;

    public Result getUserAchievementsHttp(Http.Request request, BigDecimal version, @NotNull Boolean returnNulls, @NotNull String appKey, @NotNull Boolean includeUndiscovered, String deviceId, Long accountId, String connectionAccountEmail, Long connectionAccountId, String rankType, String achievementType, Double latitude, Double longitude) throws Exception {
        List<AchievementProgressResponse> obj = getUserAchievements(request, version, returnNulls, appKey, includeUndiscovered, deviceId, accountId, connectionAccountEmail, connectionAccountId, rankType, achievementType, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (AchievementProgressResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<AchievementProgressResponse> getUserAchievements(Http.Request request, BigDecimal version, @NotNull Boolean returnNulls, @NotNull String appKey, @NotNull Boolean includeUndiscovered, String deviceId, Long accountId, String connectionAccountEmail, Long connectionAccountId, String rankType, String achievementType, Double latitude, Double longitude) throws Exception;

    public Result listAchievementTagsHttp(Http.Request request, BigDecimal version, String appKey) throws Exception {
        SirqulResponse obj = listAchievementTags(request, version, appKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse listAchievementTags(Http.Request request, BigDecimal version, String appKey) throws Exception;

    public Result listAchievementsHttp(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String deviceId, Long accountId, String appKey, String keyword, String achievementType, String rankType) throws Exception {
        List<AchievementShortResponse> obj = listAchievements(request, version, sortField, descending, start, limit, activeOnly, deviceId, accountId, appKey, keyword, achievementType, rankType);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (AchievementShortResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<AchievementShortResponse> listAchievements(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String deviceId, Long accountId, String appKey, String keyword, String achievementType, String rankType) throws Exception;

    public Result searchAchievementsHttp(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String sortField, @NotNull Boolean descending, @NotNull Boolean includeTiers, @NotNull Boolean includeInactiveTiers, @NotNull Integer start, @NotNull Integer limit, String deviceId, Long accountId, String keyword, String achievementType, String rankType) throws Exception {
        List<AchievementShortResponse> obj = searchAchievements(request, version, appKey, sortField, descending, includeTiers, includeInactiveTiers, start, limit, deviceId, accountId, keyword, achievementType, rankType);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (AchievementShortResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<AchievementShortResponse> searchAchievements(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String sortField, @NotNull Boolean descending, @NotNull Boolean includeTiers, @NotNull Boolean includeInactiveTiers, @NotNull Integer start, @NotNull Integer limit, String deviceId, Long accountId, String keyword, String achievementType, String rankType) throws Exception;

    public Result updateAchievementHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long achievementId, String analyticsTag, String title, String description, String rankType, Integer rankIncrement, Integer minIncrement, Boolean nullMinIncrement, Integer maxIncrement, Boolean nullMaxIncrement, Boolean validate, Boolean active, String triggerDefinition) throws Exception {
        AchievementResponse obj = updateAchievement(request, version, deviceId, accountId, achievementId, analyticsTag, title, description, rankType, rankIncrement, minIncrement, nullMinIncrement, maxIncrement, nullMaxIncrement, validate, active, triggerDefinition);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AchievementResponse updateAchievement(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long achievementId, String analyticsTag, String title, String description, String rankType, Integer rankIncrement, Integer minIncrement, Boolean nullMinIncrement, Integer maxIncrement, Boolean nullMaxIncrement, Boolean validate, Boolean active, String triggerDefinition) throws Exception;

    public Result updateAchievementTierHttp(Http.Request request, BigDecimal version, @NotNull Long achievementTierId, String deviceId, Long accountId, InputStream icon, Long iconAssetId, String title, String description, Long goalCount, Long missionId, Long gameId, Long packId, Long gameLevelId, Long gameObjectId, Boolean scoreAllInstances) throws Exception {
        AchievementTierResponse obj = updateAchievementTier(request, version, achievementTierId, deviceId, accountId, icon, iconAssetId, title, description, goalCount, missionId, gameId, packId, gameLevelId, gameObjectId, scoreAllInstances);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AchievementTierResponse updateAchievementTier(Http.Request request, BigDecimal version, @NotNull Long achievementTierId, String deviceId, Long accountId, InputStream icon, Long iconAssetId, String title, String description, Long goalCount, Long missionId, Long gameId, Long packId, Long gameLevelId, Long gameObjectId, Boolean scoreAllInstances) throws Exception;

    public Result updateUserAchievementHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, Long achievementId, String tag, Long customId, Long increment, Long startDate, Long endDate, Boolean returnProgress) throws Exception {
        SirqulResponse obj = updateUserAchievement(request, version, accountId, achievementId, tag, customId, increment, startDate, endDate, returnProgress);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse updateUserAchievement(Http.Request request, BigDecimal version, @NotNull Long accountId, Long achievementId, String tag, Long customId, Long increment, Long startDate, Long endDate, Boolean returnProgress) throws Exception;

}
