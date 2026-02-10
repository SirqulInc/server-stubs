package controllers;

import apimodels.ApplicationConfigResponse;
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
public class ApplicationConfigApiController extends Controller {
    private final ApplicationConfigApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ApplicationConfigApiController(Config configuration, ApplicationConfigApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createApplicationConfig(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valueconfigVersion = request.getQueryString("configVersion");
        String configVersion;
        if (valueconfigVersion != null) {
            configVersion = valueconfigVersion;
        } else {
            throw new IllegalArgumentException("'configVersion' parameter is required");
        }
        String valueassetId = request.getQueryString("assetId");
        Long assetId;
        if (valueassetId != null) {
            assetId = Long.parseLong(valueassetId);
        } else {
            throw new IllegalArgumentException("'assetId' parameter is required");
        }
        String valueretailerId = request.getQueryString("retailerId");
        Long retailerId;
        if (valueretailerId != null) {
            retailerId = Long.parseLong(valueretailerId);
        } else {
            retailerId = null;
        }
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            retailerLocationId = null;
        }
        String valueudid = request.getQueryString("udid");
        String udid;
        if (valueudid != null) {
            udid = valueudid;
        } else {
            udid = null;
        }
        return imp.createApplicationConfigHttp(request, version, accountId, appKey, configVersion, assetId, retailerId, retailerLocationId, udid);
    }

    @ApiAction
    public Result deleteApplicationConfig(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueconfigId = request.getQueryString("configId");
        Long configId;
        if (valueconfigId != null) {
            configId = Long.parseLong(valueconfigId);
        } else {
            throw new IllegalArgumentException("'configId' parameter is required");
        }
        return imp.deleteApplicationConfigHttp(request, version, accountId, configId);
    }

    @ApiAction
    public Result getApplicationConfig(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueconfigId = request.getQueryString("configId");
        Long configId;
        if (valueconfigId != null) {
            configId = Long.parseLong(valueconfigId);
        } else {
            throw new IllegalArgumentException("'configId' parameter is required");
        }
        return imp.getApplicationConfigHttp(request, version, accountId, configId);
    }

    @ApiAction
    public Result getApplicationConfigByConfigVersion(Http.Request request, BigDecimal version) throws Exception {
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valueconfigVersion = request.getQueryString("configVersion");
        String configVersion;
        if (valueconfigVersion != null) {
            configVersion = valueconfigVersion;
        } else {
            throw new IllegalArgumentException("'configVersion' parameter is required");
        }
        String valueretailerId = request.getQueryString("retailerId");
        Long retailerId;
        if (valueretailerId != null) {
            retailerId = Long.parseLong(valueretailerId);
        } else {
            retailerId = null;
        }
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            retailerLocationId = null;
        }
        String valueudid = request.getQueryString("udid");
        String udid;
        if (valueudid != null) {
            udid = valueudid;
        } else {
            udid = null;
        }
        String valueallowOlderVersions = request.getQueryString("allowOlderVersions");
        Boolean allowOlderVersions;
        if (valueallowOlderVersions != null) {
            allowOlderVersions = Boolean.valueOf(valueallowOlderVersions);
        } else {
            allowOlderVersions = false;
        }
        return imp.getApplicationConfigByConfigVersionHttp(request, version, appKey, configVersion, retailerId, retailerLocationId, udid, allowOlderVersions);
    }

    @ApiAction
    public Result searchApplicationConfig(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueretailerId = request.getQueryString("retailerId");
        Long retailerId;
        if (valueretailerId != null) {
            retailerId = Long.parseLong(valueretailerId);
        } else {
            retailerId = null;
        }
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            retailerLocationId = null;
        }
        String valueudid = request.getQueryString("udid");
        String udid;
        if (valueudid != null) {
            udid = valueudid;
        } else {
            udid = null;
        }
        String valueconfigVersion = request.getQueryString("configVersion");
        String configVersion;
        if (valueconfigVersion != null) {
            configVersion = valueconfigVersion;
        } else {
            configVersion = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = "CONFIG_VERSION_INDEX";
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = true;
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
        return imp.searchApplicationConfigHttp(request, version, accountId, appKey, retailerId, retailerLocationId, udid, configVersion, sortField, descending, start, limit);
    }

    @ApiAction
    public Result updateApplicationConfig(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueconfigId = request.getQueryString("configId");
        Long configId;
        if (valueconfigId != null) {
            configId = Long.parseLong(valueconfigId);
        } else {
            throw new IllegalArgumentException("'configId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueconfigVersion = request.getQueryString("configVersion");
        String configVersion;
        if (valueconfigVersion != null) {
            configVersion = valueconfigVersion;
        } else {
            configVersion = null;
        }
        String valueassetId = request.getQueryString("assetId");
        Long assetId;
        if (valueassetId != null) {
            assetId = Long.parseLong(valueassetId);
        } else {
            assetId = null;
        }
        String valueretailerId = request.getQueryString("retailerId");
        Long retailerId;
        if (valueretailerId != null) {
            retailerId = Long.parseLong(valueretailerId);
        } else {
            retailerId = null;
        }
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            retailerLocationId = null;
        }
        String valueudid = request.getQueryString("udid");
        String udid;
        if (valueudid != null) {
            udid = valueudid;
        } else {
            udid = null;
        }
        return imp.updateApplicationConfigHttp(request, version, accountId, configId, appKey, configVersion, assetId, retailerId, retailerLocationId, udid);
    }

}
