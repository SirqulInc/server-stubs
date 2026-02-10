package controllers;

import java.math.BigDecimal;
import apimodels.ScoreResponse;

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
public abstract class ScoreApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createScoreHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Integer points, Long missionId, Long gameId, Long packId, Long gameLevelId, Long gameObjectId, Integer timeTaken, Boolean highest) throws Exception {
        ScoreResponse obj = createScore(request, version, accountId, appKey, points, missionId, gameId, packId, gameLevelId, gameObjectId, timeTaken, highest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ScoreResponse createScore(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Integer points, Long missionId, Long gameId, Long packId, Long gameLevelId, Long gameObjectId, Integer timeTaken, Boolean highest) throws Exception;

    public Result getScoreHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, Long missionId, Long gameId, Long packId, Long gameLevelId, Long gameObjectId, String scoreObjectType, String scoreStatus) throws Exception {
        ScoreResponse obj = getScore(request, version, accountId, appKey, missionId, gameId, packId, gameLevelId, gameObjectId, scoreObjectType, scoreStatus);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ScoreResponse getScore(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, Long missionId, Long gameId, Long packId, Long gameLevelId, Long gameObjectId, String scoreObjectType, String scoreStatus) throws Exception;

    public Result searchScoresHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, Long missionId, Long gameId, Long packId, Long gameLevelId, Long gameObjectId) throws Exception {
        List<ScoreResponse> obj = searchScores(request, version, accountId, appKey, missionId, gameId, packId, gameLevelId, gameObjectId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (ScoreResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<ScoreResponse> searchScores(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, Long missionId, Long gameId, Long packId, Long gameLevelId, Long gameObjectId) throws Exception;

}
