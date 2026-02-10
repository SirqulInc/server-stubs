package controllers;

import apimodels.AccountResponse;
import java.math.BigDecimal;
import apimodels.SearchResponse;
import apimodels.SirqulResponse;
import apimodels.WrappedResponse;

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
public class FavoriteApiController extends Controller {
    private final FavoriteApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private FavoriteApiController(Config configuration, FavoriteApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result addFavorite(Http.Request request, BigDecimal version) throws Exception {
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
        String valuefavoritableId = request.getQueryString("favoritableId");
        Long favoritableId;
        if (valuefavoritableId != null) {
            favoritableId = Long.parseLong(valuefavoritableId);
        } else {
            throw new IllegalArgumentException("'favoritableId' parameter is required");
        }
        String valuefavoritableType = request.getQueryString("favoritableType");
        String favoritableType;
        if (valuefavoritableType != null) {
            favoritableType = valuefavoritableType;
        } else {
            throw new IllegalArgumentException("'favoritableType' parameter is required");
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
        return imp.addFavoriteHttp(request, version, favoritableId, favoritableType, deviceId, accountId, latitude, longitude);
    }

    @ApiAction
    public Result deleteFavorite(Http.Request request, BigDecimal version) throws Exception {
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
        String valuefavoriteId = request.getQueryString("favoriteId");
        Long favoriteId;
        if (valuefavoriteId != null) {
            favoriteId = Long.parseLong(valuefavoriteId);
        } else {
            favoriteId = null;
        }
        String valuefavoritableId = request.getQueryString("favoritableId");
        Long favoritableId;
        if (valuefavoritableId != null) {
            favoritableId = Long.parseLong(valuefavoritableId);
        } else {
            favoritableId = null;
        }
        String valuefavoritableType = request.getQueryString("favoritableType");
        String favoritableType;
        if (valuefavoritableType != null) {
            favoritableType = valuefavoritableType;
        } else {
            favoritableType = null;
        }
        return imp.deleteFavoriteHttp(request, version, deviceId, accountId, favoriteId, favoritableId, favoritableType);
    }

    @ApiAction
    public Result getFavorite(Http.Request request, BigDecimal version) throws Exception {
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
        String valuefavoriteId = request.getQueryString("favoriteId");
        Long favoriteId;
        if (valuefavoriteId != null) {
            favoriteId = Long.parseLong(valuefavoriteId);
        } else {
            throw new IllegalArgumentException("'favoriteId' parameter is required");
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
        return imp.getFavoriteHttp(request, version, favoriteId, deviceId, accountId, latitude, longitude);
    }

    @ApiAction
    public Result searchFavorites(Http.Request request, BigDecimal version) throws Exception {
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
        String valueconnectionAccountId = request.getQueryString("connectionAccountId");
        Long connectionAccountId;
        if (valueconnectionAccountId != null) {
            connectionAccountId = Long.parseLong(valueconnectionAccountId);
        } else {
            connectionAccountId = null;
        }
        String valuefavoritableType = request.getQueryString("favoritableType");
        String favoritableType;
        if (valuefavoritableType != null) {
            favoritableType = valuefavoritableType;
        } else {
            throw new IllegalArgumentException("'favoritableType' parameter is required");
        }
        String valuesecondaryType = request.getQueryString("secondaryType");
        String secondaryType;
        if (valuesecondaryType != null) {
            secondaryType = valuesecondaryType;
        } else {
            secondaryType = null;
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
        String valuereturnFullResponse = request.getQueryString("returnFullResponse");
        Boolean returnFullResponse;
        if (valuereturnFullResponse != null) {
            returnFullResponse = Boolean.valueOf(valuereturnFullResponse);
        } else {
            throw new IllegalArgumentException("'returnFullResponse' parameter is required");
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
        return imp.searchFavoritesHttp(request, version, favoritableType, sortField, descending, start, limit, activeOnly, returnFullResponse, deviceId, accountId, connectionAccountId, secondaryType, keyword, latitude, longitude);
    }

    @ApiAction
    public Result whoHasFavorited(Http.Request request, BigDecimal version) throws Exception {
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
        String valuefavoritableId = request.getQueryString("favoritableId");
        Long favoritableId;
        if (valuefavoritableId != null) {
            favoritableId = Long.parseLong(valuefavoritableId);
        } else {
            throw new IllegalArgumentException("'favoritableId' parameter is required");
        }
        String valuefavoritableType = request.getQueryString("favoritableType");
        String favoritableType;
        if (valuefavoritableType != null) {
            favoritableType = valuefavoritableType;
        } else {
            throw new IllegalArgumentException("'favoritableType' parameter is required");
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
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
        return imp.whoHasFavoritedHttp(request, version, favoritableId, favoritableType, start, limit, deviceId, accountId, latitude, longitude, keyword);
    }

}
