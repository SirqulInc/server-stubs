package controllers;

import apimodels.AppResponse;
import java.math.BigDecimal;
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
public abstract class AppDataApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getAppDataHttp(Http.Request request, BigDecimal version, @NotNull Integer start, @NotNull Integer limit, String deviceId, Long accountId, String gameType, Boolean includeGameData, String q, String keyword, String sortField, Boolean descending, Integer i, Integer l, Boolean gameObjectCount, String filter, Long dateCreated, Long ownerId, String missionIds, String gameIds, String packIds, String gameLevelIds, String appVersion, Boolean includeHigherVersionPacks, Boolean includeHigherVersionLevels, String responseGroups, String purchaseType) throws Exception {
        AppResponse obj = getAppData(request, version, start, limit, deviceId, accountId, gameType, includeGameData, q, keyword, sortField, descending, i, l, gameObjectCount, filter, dateCreated, ownerId, missionIds, gameIds, packIds, gameLevelIds, appVersion, includeHigherVersionPacks, includeHigherVersionLevels, responseGroups, purchaseType);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AppResponse getAppData(Http.Request request, BigDecimal version, @NotNull Integer start, @NotNull Integer limit, String deviceId, Long accountId, String gameType, Boolean includeGameData, String q, String keyword, String sortField, Boolean descending, Integer i, Integer l, Boolean gameObjectCount, String filter, Long dateCreated, Long ownerId, String missionIds, String gameIds, String packIds, String gameLevelIds, String appVersion, Boolean includeHigherVersionPacks, Boolean includeHigherVersionLevels, String responseGroups, String purchaseType) throws Exception;

    public Result postAppDataHttp(Http.Request request, BigDecimal version, @NotNull String gameType, @NotNull Integer start, @NotNull Integer limit, @NotNull String data, String deviceId, Long accountId, Boolean includeGameData, String q, String keyword, String sortField, Boolean descending, Integer i, Integer l, Boolean gameObjectCount, String filter, Long dateCreated, Long ownerId, String missionIds, String gameIds, String packIds, String gameLevelIds, String appVersion, Boolean includeHigherVersionPacks, Boolean includeHigherVersionLevels, String responseGroups, String purchaseType) throws Exception {
        AppResponse obj = postAppData(request, version, gameType, start, limit, data, deviceId, accountId, includeGameData, q, keyword, sortField, descending, i, l, gameObjectCount, filter, dateCreated, ownerId, missionIds, gameIds, packIds, gameLevelIds, appVersion, includeHigherVersionPacks, includeHigherVersionLevels, responseGroups, purchaseType);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AppResponse postAppData(Http.Request request, BigDecimal version, @NotNull String gameType, @NotNull Integer start, @NotNull Integer limit, @NotNull String data, String deviceId, Long accountId, Boolean includeGameData, String q, String keyword, String sortField, Boolean descending, Integer i, Integer l, Boolean gameObjectCount, String filter, Long dateCreated, Long ownerId, String missionIds, String gameIds, String packIds, String gameLevelIds, String appVersion, Boolean includeHigherVersionPacks, Boolean includeHigherVersionLevels, String responseGroups, String purchaseType) throws Exception;

    public Result regenAppDataHttp(Http.Request request, BigDecimal version, Long accountId, String appKey, String buildVersion, String apiVersion) throws Exception {
        SirqulResponse obj = regenAppData(request, version, accountId, appKey, buildVersion, apiVersion);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse regenAppData(Http.Request request, BigDecimal version, Long accountId, String appKey, String buildVersion, String apiVersion) throws Exception;

}
