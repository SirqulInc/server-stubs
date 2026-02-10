package controllers;

import apimodels.AppResponse;
import java.math.BigDecimal;
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
public class AppDataApiController extends Controller {
    private final AppDataApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private AppDataApiController(Config configuration, AppDataApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getAppData(Http.Request request, BigDecimal version) throws Exception {
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
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueincludeGameData = request.getQueryString("includeGameData");
        Boolean includeGameData;
        if (valueincludeGameData != null) {
            includeGameData = Boolean.valueOf(valueincludeGameData);
        } else {
            includeGameData = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
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
        String valuei = request.getQueryString("_i");
        Integer i;
        if (valuei != null) {
            i = Integer.parseInt(valuei);
        } else {
            i = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuel = request.getQueryString("_l");
        Integer l;
        if (valuel != null) {
            l = Integer.parseInt(valuel);
        } else {
            l = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        String valuegameObjectCount = request.getQueryString("gameObjectCount");
        Boolean gameObjectCount;
        if (valuegameObjectCount != null) {
            gameObjectCount = Boolean.valueOf(valuegameObjectCount);
        } else {
            gameObjectCount = null;
        }
        String valuefilter = request.getQueryString("filter");
        String filter;
        if (valuefilter != null) {
            filter = valuefilter;
        } else {
            filter = null;
        }
        String valuedateCreated = request.getQueryString("dateCreated");
        Long dateCreated;
        if (valuedateCreated != null) {
            dateCreated = Long.parseLong(valuedateCreated);
        } else {
            dateCreated = null;
        }
        String valueownerId = request.getQueryString("ownerId");
        Long ownerId;
        if (valueownerId != null) {
            ownerId = Long.parseLong(valueownerId);
        } else {
            ownerId = null;
        }
        String valuemissionIds = request.getQueryString("missionIds");
        String missionIds;
        if (valuemissionIds != null) {
            missionIds = valuemissionIds;
        } else {
            missionIds = null;
        }
        String valuegameIds = request.getQueryString("gameIds");
        String gameIds;
        if (valuegameIds != null) {
            gameIds = valuegameIds;
        } else {
            gameIds = null;
        }
        String valuepackIds = request.getQueryString("packIds");
        String packIds;
        if (valuepackIds != null) {
            packIds = valuepackIds;
        } else {
            packIds = null;
        }
        String valuegameLevelIds = request.getQueryString("gameLevelIds");
        String gameLevelIds;
        if (valuegameLevelIds != null) {
            gameLevelIds = valuegameLevelIds;
        } else {
            gameLevelIds = null;
        }
        String valueappVersion = request.getQueryString("appVersion");
        String appVersion;
        if (valueappVersion != null) {
            appVersion = valueappVersion;
        } else {
            appVersion = null;
        }
        String valueincludeHigherVersionPacks = request.getQueryString("includeHigherVersionPacks");
        Boolean includeHigherVersionPacks;
        if (valueincludeHigherVersionPacks != null) {
            includeHigherVersionPacks = Boolean.valueOf(valueincludeHigherVersionPacks);
        } else {
            includeHigherVersionPacks = null;
        }
        String valueincludeHigherVersionLevels = request.getQueryString("includeHigherVersionLevels");
        Boolean includeHigherVersionLevels;
        if (valueincludeHigherVersionLevels != null) {
            includeHigherVersionLevels = Boolean.valueOf(valueincludeHigherVersionLevels);
        } else {
            includeHigherVersionLevels = null;
        }
        String valueresponseGroups = request.getQueryString("responseGroups");
        String responseGroups;
        if (valueresponseGroups != null) {
            responseGroups = valueresponseGroups;
        } else {
            responseGroups = null;
        }
        String valuepurchaseType = request.getQueryString("purchaseType");
        String purchaseType;
        if (valuepurchaseType != null) {
            purchaseType = valuepurchaseType;
        } else {
            purchaseType = null;
        }
        return imp.getAppDataHttp(request, version, start, limit, deviceId, accountId, gameType, includeGameData, q, keyword, sortField, descending, i, l, gameObjectCount, filter, dateCreated, ownerId, missionIds, gameIds, packIds, gameLevelIds, appVersion, includeHigherVersionPacks, includeHigherVersionLevels, responseGroups, purchaseType);
    }

    @ApiAction
    public Result postAppData(Http.Request request, BigDecimal version) throws Exception {
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
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            throw new IllegalArgumentException("'gameType' parameter is required");
        }
        String valueincludeGameData = request.getQueryString("includeGameData");
        Boolean includeGameData;
        if (valueincludeGameData != null) {
            includeGameData = Boolean.valueOf(valueincludeGameData);
        } else {
            includeGameData = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
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
        String valuei = request.getQueryString("_i");
        Integer i;
        if (valuei != null) {
            i = Integer.parseInt(valuei);
        } else {
            i = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuel = request.getQueryString("_l");
        Integer l;
        if (valuel != null) {
            l = Integer.parseInt(valuel);
        } else {
            l = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        String valuegameObjectCount = request.getQueryString("gameObjectCount");
        Boolean gameObjectCount;
        if (valuegameObjectCount != null) {
            gameObjectCount = Boolean.valueOf(valuegameObjectCount);
        } else {
            gameObjectCount = null;
        }
        String valuefilter = request.getQueryString("filter");
        String filter;
        if (valuefilter != null) {
            filter = valuefilter;
        } else {
            filter = null;
        }
        String valuedateCreated = request.getQueryString("dateCreated");
        Long dateCreated;
        if (valuedateCreated != null) {
            dateCreated = Long.parseLong(valuedateCreated);
        } else {
            dateCreated = null;
        }
        String valueownerId = request.getQueryString("ownerId");
        Long ownerId;
        if (valueownerId != null) {
            ownerId = Long.parseLong(valueownerId);
        } else {
            ownerId = null;
        }
        String valuemissionIds = request.getQueryString("missionIds");
        String missionIds;
        if (valuemissionIds != null) {
            missionIds = valuemissionIds;
        } else {
            missionIds = null;
        }
        String valuegameIds = request.getQueryString("gameIds");
        String gameIds;
        if (valuegameIds != null) {
            gameIds = valuegameIds;
        } else {
            gameIds = null;
        }
        String valuepackIds = request.getQueryString("packIds");
        String packIds;
        if (valuepackIds != null) {
            packIds = valuepackIds;
        } else {
            packIds = null;
        }
        String valuegameLevelIds = request.getQueryString("gameLevelIds");
        String gameLevelIds;
        if (valuegameLevelIds != null) {
            gameLevelIds = valuegameLevelIds;
        } else {
            gameLevelIds = null;
        }
        String valueappVersion = request.getQueryString("appVersion");
        String appVersion;
        if (valueappVersion != null) {
            appVersion = valueappVersion;
        } else {
            appVersion = null;
        }
        String valueincludeHigherVersionPacks = request.getQueryString("includeHigherVersionPacks");
        Boolean includeHigherVersionPacks;
        if (valueincludeHigherVersionPacks != null) {
            includeHigherVersionPacks = Boolean.valueOf(valueincludeHigherVersionPacks);
        } else {
            includeHigherVersionPacks = null;
        }
        String valueincludeHigherVersionLevels = request.getQueryString("includeHigherVersionLevels");
        Boolean includeHigherVersionLevels;
        if (valueincludeHigherVersionLevels != null) {
            includeHigherVersionLevels = Boolean.valueOf(valueincludeHigherVersionLevels);
        } else {
            includeHigherVersionLevels = null;
        }
        String valueresponseGroups = request.getQueryString("responseGroups");
        String responseGroups;
        if (valueresponseGroups != null) {
            responseGroups = valueresponseGroups;
        } else {
            responseGroups = null;
        }
        String valuepurchaseType = request.getQueryString("purchaseType");
        String purchaseType;
        if (valuepurchaseType != null) {
            purchaseType = valuepurchaseType;
        } else {
            purchaseType = null;
        }
        String valuedata = request.getQueryString("data");
        String data;
        if (valuedata != null) {
            data = valuedata;
        } else {
            throw new IllegalArgumentException("'data' parameter is required");
        }
        return imp.postAppDataHttp(request, version, gameType, start, limit, data, deviceId, accountId, includeGameData, q, keyword, sortField, descending, i, l, gameObjectCount, filter, dateCreated, ownerId, missionIds, gameIds, packIds, gameLevelIds, appVersion, includeHigherVersionPacks, includeHigherVersionLevels, responseGroups, purchaseType);
    }

    @ApiAction
    public Result regenAppData(Http.Request request, BigDecimal version) throws Exception {
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
        String valuebuildVersion = request.getQueryString("buildVersion");
        String buildVersion;
        if (valuebuildVersion != null) {
            buildVersion = valuebuildVersion;
        } else {
            buildVersion = null;
        }
        String valueapiVersion = request.getQueryString("apiVersion");
        String apiVersion;
        if (valueapiVersion != null) {
            apiVersion = valueapiVersion;
        } else {
            apiVersion = null;
        }
        return imp.regenAppDataHttp(request, version, accountId, appKey, buildVersion, apiVersion);
    }

}
