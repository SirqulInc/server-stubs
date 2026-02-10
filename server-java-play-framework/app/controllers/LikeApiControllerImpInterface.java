package controllers;

import java.math.BigDecimal;
import apimodels.LikableResponse;
import apimodels.SearchResponse;

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
public abstract class LikeApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result registerLikeHttp(Http.Request request, BigDecimal version, @NotNull String likableType, @NotNull Long likableId, String deviceId, Long accountId, String permissionableType, Long permissionableId, Boolean like, String app, String gameType, String appKey, Double latitude, Double longitude) throws Exception {
        LikableResponse obj = registerLike(request, version, likableType, likableId, deviceId, accountId, permissionableType, permissionableId, like, app, gameType, appKey, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract LikableResponse registerLike(Http.Request request, BigDecimal version, @NotNull String likableType, @NotNull Long likableId, String deviceId, Long accountId, String permissionableType, Long permissionableId, Boolean like, String app, String gameType, String appKey, Double latitude, Double longitude) throws Exception;

    public Result removeLikeHttp(Http.Request request, BigDecimal version, @NotNull String likableType, @NotNull Long likableId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        LikableResponse obj = removeLike(request, version, likableType, likableId, deviceId, accountId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract LikableResponse removeLike(Http.Request request, BigDecimal version, @NotNull String likableType, @NotNull Long likableId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception;

    public Result searchLikesHttp(Http.Request request, BigDecimal version, @NotNull String likableType, @NotNull Long likableId, String deviceId, Long accountId, String connectionAccountIds, String sortField, Boolean descending, Long updatedSince, Long updatedBefore, Integer start, Integer limit) throws Exception {
        SearchResponse obj = searchLikes(request, version, likableType, likableId, deviceId, accountId, connectionAccountIds, sortField, descending, updatedSince, updatedBefore, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SearchResponse searchLikes(Http.Request request, BigDecimal version, @NotNull String likableType, @NotNull Long likableId, String deviceId, Long accountId, String connectionAccountIds, String sortField, Boolean descending, Long updatedSince, Long updatedBefore, Integer start, Integer limit) throws Exception;

}
