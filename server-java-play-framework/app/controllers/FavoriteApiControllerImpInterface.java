package controllers;

import apimodels.AccountResponse;
import java.math.BigDecimal;
import apimodels.SearchResponse;
import apimodels.SirqulResponse;
import apimodels.WrappedResponse;

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
public abstract class FavoriteApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result addFavoriteHttp(Http.Request request, BigDecimal version, @NotNull Long favoritableId, @NotNull String favoritableType, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        WrappedResponse obj = addFavorite(request, version, favoritableId, favoritableType, deviceId, accountId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract WrappedResponse addFavorite(Http.Request request, BigDecimal version, @NotNull Long favoritableId, @NotNull String favoritableType, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception;

    public Result deleteFavoriteHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long favoriteId, Long favoritableId, String favoritableType) throws Exception {
        SirqulResponse obj = deleteFavorite(request, version, deviceId, accountId, favoriteId, favoritableId, favoritableType);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteFavorite(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long favoriteId, Long favoritableId, String favoritableType) throws Exception;

    public Result getFavoriteHttp(Http.Request request, BigDecimal version, @NotNull Long favoriteId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        WrappedResponse obj = getFavorite(request, version, favoriteId, deviceId, accountId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract WrappedResponse getFavorite(Http.Request request, BigDecimal version, @NotNull Long favoriteId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception;

    public Result searchFavoritesHttp(Http.Request request, BigDecimal version, @NotNull String favoritableType, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, @NotNull Boolean returnFullResponse, String deviceId, Long accountId, Long connectionAccountId, String secondaryType, String keyword, Double latitude, Double longitude) throws Exception {
        SearchResponse obj = searchFavorites(request, version, favoritableType, sortField, descending, start, limit, activeOnly, returnFullResponse, deviceId, accountId, connectionAccountId, secondaryType, keyword, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SearchResponse searchFavorites(Http.Request request, BigDecimal version, @NotNull String favoritableType, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, @NotNull Boolean returnFullResponse, String deviceId, Long accountId, Long connectionAccountId, String secondaryType, String keyword, Double latitude, Double longitude) throws Exception;

    public Result whoHasFavoritedHttp(Http.Request request, BigDecimal version, @NotNull Long favoritableId, @NotNull String favoritableType, @NotNull Integer start, @NotNull Integer limit, String deviceId, Long accountId, Double latitude, Double longitude, String keyword) throws Exception {
        List<AccountResponse> obj = whoHasFavorited(request, version, favoritableId, favoritableType, start, limit, deviceId, accountId, latitude, longitude, keyword);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (AccountResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<AccountResponse> whoHasFavorited(Http.Request request, BigDecimal version, @NotNull Long favoritableId, @NotNull String favoritableType, @NotNull Integer start, @NotNull Integer limit, String deviceId, Long accountId, Double latitude, Double longitude, String keyword) throws Exception;

}
