package controllers;

import java.math.BigDecimal;
import apimodels.CreativeResponse;
import apimodels.MissionResponse;
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
public class CreativeApiController extends Controller {
    private final CreativeApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private CreativeApiController(Config configuration, CreativeApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result addPreview(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuecreativeId = request.getQueryString("creativeId");
        Long creativeId;
        if (valuecreativeId != null) {
            creativeId = Long.parseLong(valuecreativeId);
        } else {
            throw new IllegalArgumentException("'creativeId' parameter is required");
        }
        return imp.addPreviewHttp(request, version, accountId, creativeId);
    }

    @ApiAction
    public Result adsFind(Http.Request request, BigDecimal version) throws Exception {
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuetype = request.getQueryString("type");
        String type;
        if (valuetype != null) {
            type = valuetype;
        } else {
            type = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueappVersion = request.getQueryString("appVersion");
        String appVersion;
        if (valueappVersion != null) {
            appVersion = valueappVersion;
        } else {
            appVersion = null;
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
        String valuedevice = request.getQueryString("device");
        String device;
        if (valuedevice != null) {
            device = valuedevice;
        } else {
            device = null;
        }
        String valuedeviceIdentifier = request.getQueryString("deviceIdentifier");
        Long deviceIdentifier;
        if (valuedeviceIdentifier != null) {
            deviceIdentifier = Long.parseLong(valuedeviceIdentifier);
        } else {
            deviceIdentifier = null;
        }
        String valuedeviceVersion = request.getQueryString("deviceVersion");
        String deviceVersion;
        if (valuedeviceVersion != null) {
            deviceVersion = valuedeviceVersion;
        } else {
            deviceVersion = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueincludeAudiences = request.getQueryString("includeAudiences");
        Boolean includeAudiences;
        if (valueincludeAudiences != null) {
            includeAudiences = Boolean.valueOf(valueincludeAudiences);
        } else {
            includeAudiences = null;
        }
        String valueallocatesTickets = request.getQueryString("allocatesTickets");
        Boolean allocatesTickets;
        if (valueallocatesTickets != null) {
            allocatesTickets = Boolean.valueOf(valueallocatesTickets);
        } else {
            allocatesTickets = null;
        }
        String valuerandomize = request.getQueryString("randomize");
        Boolean randomize;
        if (valuerandomize != null) {
            randomize = Boolean.valueOf(valuerandomize);
        } else {
            throw new IllegalArgumentException("'randomize' parameter is required");
        }
        String valuetargetedAdsOnly = request.getQueryString("targetedAdsOnly");
        Boolean targetedAdsOnly;
        if (valuetargetedAdsOnly != null) {
            targetedAdsOnly = Boolean.valueOf(valuetargetedAdsOnly);
        } else {
            throw new IllegalArgumentException("'targetedAdsOnly' parameter is required");
        }
        String valuemissionIds = request.getQueryString("missionIds");
        String missionIds;
        if (valuemissionIds != null) {
            missionIds = valuemissionIds;
        } else {
            missionIds = null;
        }
        return imp.adsFindHttp(request, version, appKey, randomize, targetedAdsOnly, type, accountId, appVersion, latitude, longitude, device, deviceIdentifier, deviceVersion, start, limit, includeAudiences, allocatesTickets, missionIds);
    }

    @ApiAction
    public Result createCreative(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("'name' parameter is required");
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valueassetImageId = request.getQueryString("assetImageId");
        Long assetImageId;
        if (valueassetImageId != null) {
            assetImageId = Long.parseLong(valueassetImageId);
        } else {
            assetImageId = null;
        }
        String valueaction = request.getQueryString("action");
        String action;
        if (valueaction != null) {
            action = valueaction;
        } else {
            action = null;
        }
        String valuedata = request.getQueryString("data");
        String data;
        if (valuedata != null) {
            data = valuedata;
        } else {
            data = null;
        }
        String valuesuffix = request.getQueryString("suffix");
        String suffix;
        if (valuesuffix != null) {
            suffix = valuesuffix;
        } else {
            suffix = null;
        }
        String valuetype = request.getQueryString("type");
        String type;
        if (valuetype != null) {
            type = valuetype;
        } else {
            type = null;
        }
        String valuebalance = request.getQueryString("balance");
        Double balance;
        if (valuebalance != null) {
            balance = Double.parseDouble(valuebalance);
        } else {
            balance = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            throw new IllegalArgumentException("'active' parameter is required");
        }
        String valuereferenceId = request.getQueryString("referenceId");
        Long referenceId;
        if (valuereferenceId != null) {
            referenceId = Long.parseLong(valuereferenceId);
        } else {
            referenceId = null;
        }
        String valueappVersion = request.getQueryString("appVersion");
        String appVersion;
        if (valueappVersion != null) {
            appVersion = valueappVersion;
        } else {
            appVersion = null;
        }
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            missionId = null;
        }
        String valueofferId = request.getQueryString("offerId");
        Long offerId;
        if (valueofferId != null) {
            offerId = Long.parseLong(valueofferId);
        } else {
            offerId = null;
        }
        String valuewaitForAsset = request.getQueryString("waitForAsset");
        Boolean waitForAsset;
        if (valuewaitForAsset != null) {
            waitForAsset = Boolean.valueOf(valuewaitForAsset);
        } else {
            throw new IllegalArgumentException("'waitForAsset' parameter is required");
        }
        return imp.createCreativeHttp(request, version, accountId, name, active, waitForAsset, description, assetImageId, action, data, suffix, type, balance, referenceId, appVersion, missionId, offerId);
    }

    @ApiAction
    public Result deleteCreative(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuecreativeId = request.getQueryString("creativeId");
        Long creativeId;
        if (valuecreativeId != null) {
            creativeId = Long.parseLong(valuecreativeId);
        } else {
            throw new IllegalArgumentException("'creativeId' parameter is required");
        }
        return imp.deleteCreativeHttp(request, version, accountId, creativeId);
    }

    @ApiAction
    public Result getCreative(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuecreativeId = request.getQueryString("creativeId");
        Long creativeId;
        if (valuecreativeId != null) {
            creativeId = Long.parseLong(valuecreativeId);
        } else {
            throw new IllegalArgumentException("'creativeId' parameter is required");
        }
        return imp.getCreativeHttp(request, version, accountId, creativeId);
    }

    @ApiAction
    public Result getCreativesByApplication(Http.Request request, BigDecimal version) throws Exception {
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
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            missionId = null;
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
        return imp.getCreativesByApplicationHttp(request, version, accountId, appKey, start, limit, missionId, keyword);
    }

    @ApiAction
    public Result removePreview(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuecreativeId = request.getQueryString("creativeId");
        Long creativeId;
        if (valuecreativeId != null) {
            creativeId = Long.parseLong(valuecreativeId);
        } else {
            throw new IllegalArgumentException("'creativeId' parameter is required");
        }
        return imp.removePreviewHttp(request, version, accountId, creativeId);
    }

    @ApiAction
    public Result updateCreative(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuecreativeId = request.getQueryString("creativeId");
        Long creativeId;
        if (valuecreativeId != null) {
            creativeId = Long.parseLong(valuecreativeId);
        } else {
            throw new IllegalArgumentException("'creativeId' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valueassetImageId = request.getQueryString("assetImageId");
        Long assetImageId;
        if (valueassetImageId != null) {
            assetImageId = Long.parseLong(valueassetImageId);
        } else {
            assetImageId = null;
        }
        String valueaction = request.getQueryString("action");
        String action;
        if (valueaction != null) {
            action = valueaction;
        } else {
            action = null;
        }
        String valuedata = request.getQueryString("data");
        String data;
        if (valuedata != null) {
            data = valuedata;
        } else {
            data = null;
        }
        String valuesuffix = request.getQueryString("suffix");
        String suffix;
        if (valuesuffix != null) {
            suffix = valuesuffix;
        } else {
            suffix = null;
        }
        String valuetype = request.getQueryString("type");
        String type;
        if (valuetype != null) {
            type = valuetype;
        } else {
            type = null;
        }
        String valuebalance = request.getQueryString("balance");
        Double balance;
        if (valuebalance != null) {
            balance = Double.parseDouble(valuebalance);
        } else {
            balance = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valuereferenceId = request.getQueryString("referenceId");
        Long referenceId;
        if (valuereferenceId != null) {
            referenceId = Long.parseLong(valuereferenceId);
        } else {
            referenceId = null;
        }
        String valueappVersion = request.getQueryString("appVersion");
        String appVersion;
        if (valueappVersion != null) {
            appVersion = valueappVersion;
        } else {
            appVersion = null;
        }
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            missionId = null;
        }
        return imp.updateCreativeHttp(request, version, accountId, creativeId, name, description, assetImageId, action, data, suffix, type, balance, active, referenceId, appVersion, missionId);
    }

}
