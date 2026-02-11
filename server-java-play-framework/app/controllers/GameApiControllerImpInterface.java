package controllers;

import apimodels.GameResponse;
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
public abstract class GameApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createGameHttp(Http.Request request, Long accountId, String appKey, String title, String description, String metaData, String packIds, Boolean includeGameData) throws Exception {
        GameResponse obj = createGame(request, accountId, appKey, title, description, metaData, packIds, includeGameData);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GameResponse createGame(Http.Request request, Long accountId, String appKey, String title, String description, String metaData, String packIds, Boolean includeGameData) throws Exception;

    public Result deleteGameHttp(Http.Request request, @NotNull Long accountId, @NotNull Long gameId) throws Exception {
        SirqulResponse obj = deleteGame(request, accountId, gameId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteGame(Http.Request request, @NotNull Long accountId, @NotNull Long gameId) throws Exception;

    public Result getGameHttp(Http.Request request, @NotNull Long accountId, @NotNull Long gameId, Boolean includeGameData) throws Exception {
        GameResponse obj = getGame(request, accountId, gameId, includeGameData);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GameResponse getGame(Http.Request request, @NotNull Long accountId, @NotNull Long gameId, Boolean includeGameData) throws Exception;

    public Result searchGamesHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull Integer start, @NotNull Integer limit, String keyword, String appVersion, Boolean includeGameData, Boolean includeInactive) throws Exception {
        GameResponse obj = searchGames(request, accountId, appKey, start, limit, keyword, appVersion, includeGameData, includeInactive);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GameResponse searchGames(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull Integer start, @NotNull Integer limit, String keyword, String appVersion, Boolean includeGameData, Boolean includeInactive) throws Exception;

    public Result updateGameHttp(Http.Request request, Long accountId, Long gameId, String appKey, String title, String description, String metaData, String packIds, Boolean includeGameData) throws Exception {
        GameResponse obj = updateGame(request, accountId, gameId, appKey, title, description, metaData, packIds, includeGameData);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GameResponse updateGame(Http.Request request, Long accountId, Long gameId, String appKey, String title, String description, String metaData, String packIds, Boolean includeGameData) throws Exception;

}
