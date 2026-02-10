package controllers;

import java.math.BigDecimal;
import apimodels.LikableResponse;
import apimodels.SearchResponse;

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
public class LikeApiController extends Controller {
    private final LikeApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private LikeApiController(Config configuration, LikeApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result registerLike(Http.Request request, BigDecimal version) throws Exception {
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
        String valuelikableType = request.getQueryString("likableType");
        String likableType;
        if (valuelikableType != null) {
            likableType = valuelikableType;
        } else {
            throw new IllegalArgumentException("'likableType' parameter is required");
        }
        String valuelikableId = request.getQueryString("likableId");
        Long likableId;
        if (valuelikableId != null) {
            likableId = Long.parseLong(valuelikableId);
        } else {
            throw new IllegalArgumentException("'likableId' parameter is required");
        }
        String valuepermissionableType = request.getQueryString("permissionableType");
        String permissionableType;
        if (valuepermissionableType != null) {
            permissionableType = valuepermissionableType;
        } else {
            permissionableType = null;
        }
        String valuepermissionableId = request.getQueryString("permissionableId");
        Long permissionableId;
        if (valuepermissionableId != null) {
            permissionableId = Long.parseLong(valuepermissionableId);
        } else {
            permissionableId = null;
        }
        String valuelike = request.getQueryString("like");
        Boolean like;
        if (valuelike != null) {
            like = Boolean.valueOf(valuelike);
        } else {
            like = null;
        }
        String valueapp = request.getQueryString("app");
        String app;
        if (valueapp != null) {
            app = valueapp;
        } else {
            app = null;
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
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
        return imp.registerLikeHttp(request, version, likableType, likableId, deviceId, accountId, permissionableType, permissionableId, like, app, gameType, appKey, latitude, longitude);
    }

    @ApiAction
    public Result removeLike(Http.Request request, BigDecimal version) throws Exception {
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
        String valuelikableType = request.getQueryString("likableType");
        String likableType;
        if (valuelikableType != null) {
            likableType = valuelikableType;
        } else {
            throw new IllegalArgumentException("'likableType' parameter is required");
        }
        String valuelikableId = request.getQueryString("likableId");
        Long likableId;
        if (valuelikableId != null) {
            likableId = Long.parseLong(valuelikableId);
        } else {
            throw new IllegalArgumentException("'likableId' parameter is required");
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
        return imp.removeLikeHttp(request, version, likableType, likableId, deviceId, accountId, latitude, longitude);
    }

    @ApiAction
    public Result searchLikes(Http.Request request, BigDecimal version) throws Exception {
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
        String valueconnectionAccountIds = request.getQueryString("connectionAccountIds");
        String connectionAccountIds;
        if (valueconnectionAccountIds != null) {
            connectionAccountIds = valueconnectionAccountIds;
        } else {
            connectionAccountIds = null;
        }
        String valuelikableType = request.getQueryString("likableType");
        String likableType;
        if (valuelikableType != null) {
            likableType = valuelikableType;
        } else {
            throw new IllegalArgumentException("'likableType' parameter is required");
        }
        String valuelikableId = request.getQueryString("likableId");
        Long likableId;
        if (valuelikableId != null) {
            likableId = Long.parseLong(valuelikableId);
        } else {
            throw new IllegalArgumentException("'likableId' parameter is required");
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = "ID";
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = true;
        }
        String valueupdatedSince = request.getQueryString("updatedSince");
        Long updatedSince;
        if (valueupdatedSince != null) {
            updatedSince = Long.parseLong(valueupdatedSince);
        } else {
            updatedSince = null;
        }
        String valueupdatedBefore = request.getQueryString("updatedBefore");
        Long updatedBefore;
        if (valueupdatedBefore != null) {
            updatedBefore = Long.parseLong(valueupdatedBefore);
        } else {
            updatedBefore = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        return imp.searchLikesHttp(request, version, likableType, likableId, deviceId, accountId, connectionAccountIds, sortField, descending, updatedSince, updatedBefore, start, limit);
    }

}
