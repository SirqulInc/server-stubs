package controllers;

import java.math.BigDecimal;
import apimodels.GameLevelListResponse;
import apimodels.GameLevelResponse;
import apimodels.QuestionResponse;
import apimodels.SirqulResponse;
import apimodels.WordzWordResponse;

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
public abstract class GameLevelApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createGameLevelHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, @NotNull String gameData, @NotNull String gameDataSuffix, String appKey, String description, String difficulty, String appVersion, Long assetImageId, Long assetIconId, String visibility, Boolean friendGroup, String connectionIds, String connectionGroupIds, Double balance, Boolean active, Boolean allocateTickets, Long ticketCount, String ticketType, Long points, String tutorialTitle, String tutorialMessage, String tutorialAlignment, Long tutorialImageAssetId, Long offerId, String metaData) throws Exception {
        GameLevelResponse obj = createGameLevel(request, version, accountId, name, gameData, gameDataSuffix, appKey, description, difficulty, appVersion, assetImageId, assetIconId, visibility, friendGroup, connectionIds, connectionGroupIds, balance, active, allocateTickets, ticketCount, ticketType, points, tutorialTitle, tutorialMessage, tutorialAlignment, tutorialImageAssetId, offerId, metaData);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GameLevelResponse createGameLevel(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, @NotNull String gameData, @NotNull String gameDataSuffix, String appKey, String description, String difficulty, String appVersion, Long assetImageId, Long assetIconId, String visibility, Boolean friendGroup, String connectionIds, String connectionGroupIds, Double balance, Boolean active, Boolean allocateTickets, Long ticketCount, String ticketType, Long points, String tutorialTitle, String tutorialMessage, String tutorialAlignment, Long tutorialImageAssetId, Long offerId, String metaData) throws Exception;

    public Result deleteGameLevelHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long levelId) throws Exception {
        SirqulResponse obj = deleteGameLevel(request, version, accountId, levelId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteGameLevel(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long levelId) throws Exception;

    public Result getGameLevelHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long levelId, Boolean includeGameData) throws Exception {
        GameLevelResponse obj = getGameLevel(request, version, accountId, levelId, includeGameData);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GameLevelResponse getGameLevel(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long levelId, Boolean includeGameData) throws Exception;

    public Result getGameLevelsByApplicationHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String keyword, String sortField, Boolean descending, Integer start, Integer limit, String appVersion, Boolean includeGameData, String filters) throws Exception {
        GameLevelListResponse obj = getGameLevelsByApplication(request, version, accountId, appKey, keyword, sortField, descending, start, limit, appVersion, includeGameData, filters);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GameLevelListResponse getGameLevelsByApplication(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String keyword, String sortField, Boolean descending, Integer start, Integer limit, String appVersion, Boolean includeGameData, String filters) throws Exception;

    public Result getGameLevelsByBillableEntityHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, String appKey, String keyword, String sortField, Boolean descending, Boolean activeOnly, Long start, Long limit) throws Exception {
        GameLevelResponse obj = getGameLevelsByBillableEntity(request, version, accountId, appKey, keyword, sortField, descending, activeOnly, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GameLevelResponse getGameLevelsByBillableEntity(Http.Request request, BigDecimal version, @NotNull Long accountId, String appKey, String keyword, String sortField, Boolean descending, Boolean activeOnly, Long start, Long limit) throws Exception;

    public Result getQuestionsInLevelHttp(Http.Request request, BigDecimal version, @NotNull Long levelId, @NotNull Long accountId) throws Exception {
        QuestionResponse obj = getQuestionsInLevel(request, version, levelId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract QuestionResponse getQuestionsInLevel(Http.Request request, BigDecimal version, @NotNull Long levelId, @NotNull Long accountId) throws Exception;

    public Result getWordsInLevelHttp(Http.Request request, BigDecimal version, @NotNull Long levelId, @NotNull Long accountId) throws Exception {
        WordzWordResponse obj = getWordsInLevel(request, version, levelId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract WordzWordResponse getWordsInLevel(Http.Request request, BigDecimal version, @NotNull Long levelId, @NotNull Long accountId) throws Exception;

    public Result updateGameLevelHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long levelId, String appKey, String name, String description, String difficulty, String appVersion, Long assetImageId, Long assetIconId, String gameData, String gameDataSuffix, String visibility, Boolean friendGroup, String connectionIds, String connectionGroupIds, Double balance, Boolean active, Boolean allocateTickets, Long ticketCount, String ticketType, Long points, String tutorialTitle, String tutorialMessage, String tutorialAlignment, Long tutorialImageAssetId, Long offerId, String metaData) throws Exception {
        GameLevelResponse obj = updateGameLevel(request, version, accountId, levelId, appKey, name, description, difficulty, appVersion, assetImageId, assetIconId, gameData, gameDataSuffix, visibility, friendGroup, connectionIds, connectionGroupIds, balance, active, allocateTickets, ticketCount, ticketType, points, tutorialTitle, tutorialMessage, tutorialAlignment, tutorialImageAssetId, offerId, metaData);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GameLevelResponse updateGameLevel(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long levelId, String appKey, String name, String description, String difficulty, String appVersion, Long assetImageId, Long assetIconId, String gameData, String gameDataSuffix, String visibility, Boolean friendGroup, String connectionIds, String connectionGroupIds, Double balance, Boolean active, Boolean allocateTickets, Long ticketCount, String ticketType, Long points, String tutorialTitle, String tutorialMessage, String tutorialAlignment, Long tutorialImageAssetId, Long offerId, String metaData) throws Exception;

    public Result updateQuestionsInLevelHttp(Http.Request request, BigDecimal version, @NotNull Long levelId, @NotNull Long accountId, @NotNull String questionIds) throws Exception {
        SirqulResponse obj = updateQuestionsInLevel(request, version, levelId, accountId, questionIds);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse updateQuestionsInLevel(Http.Request request, BigDecimal version, @NotNull Long levelId, @NotNull Long accountId, @NotNull String questionIds) throws Exception;

    public Result updateWordsInLevelHttp(Http.Request request, BigDecimal version, @NotNull Long levelId, @NotNull Long accountId, @NotNull String wordIds) throws Exception {
        SirqulResponse obj = updateWordsInLevel(request, version, levelId, accountId, wordIds);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse updateWordsInLevel(Http.Request request, BigDecimal version, @NotNull Long levelId, @NotNull Long accountId, @NotNull String wordIds) throws Exception;

}
