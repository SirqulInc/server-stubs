package controllers;

import java.math.BigDecimal;
import apimodels.CountResponse;
import apimodels.FlagResponse;
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
public class FlagApiController extends Controller {
    private final FlagApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private FlagApiController(Config configuration, FlagApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createFlag(Http.Request request, BigDecimal version) throws Exception {
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
        String valueflagableType = request.getQueryString("flagableType");
        String flagableType;
        if (valueflagableType != null) {
            flagableType = valueflagableType;
        } else {
            throw new IllegalArgumentException("'flagableType' parameter is required");
        }
        String valueflagableId = request.getQueryString("flagableId");
        Long flagableId;
        if (valueflagableId != null) {
            flagableId = Long.parseLong(valueflagableId);
        } else {
            throw new IllegalArgumentException("'flagableId' parameter is required");
        }
        String valueflagDescription = request.getQueryString("flagDescription");
        String flagDescription;
        if (valueflagDescription != null) {
            flagDescription = valueflagDescription;
        } else {
            flagDescription = null;
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
        return imp.createFlagHttp(request, version, flagableType, flagableId, deviceId, accountId, flagDescription, latitude, longitude);
    }

    @ApiAction
    public Result deleteFlag(Http.Request request, BigDecimal version) throws Exception {
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
        String valueitemBeingFlaggedType = request.getQueryString("itemBeingFlaggedType");
        String itemBeingFlaggedType;
        if (valueitemBeingFlaggedType != null) {
            itemBeingFlaggedType = valueitemBeingFlaggedType;
        } else {
            itemBeingFlaggedType = null;
        }
        String valueitemBeingFlaggedId = request.getQueryString("itemBeingFlaggedId");
        Long itemBeingFlaggedId;
        if (valueitemBeingFlaggedId != null) {
            itemBeingFlaggedId = Long.parseLong(valueitemBeingFlaggedId);
        } else {
            itemBeingFlaggedId = null;
        }
        String valueflagableType = request.getQueryString("flagableType");
        String flagableType;
        if (valueflagableType != null) {
            flagableType = valueflagableType;
        } else {
            flagableType = null;
        }
        String valueflagableId = request.getQueryString("flagableId");
        Long flagableId;
        if (valueflagableId != null) {
            flagableId = Long.parseLong(valueflagableId);
        } else {
            flagableId = null;
        }
        return imp.deleteFlagHttp(request, version, deviceId, accountId, itemBeingFlaggedType, itemBeingFlaggedId, flagableType, flagableId);
    }

    @ApiAction
    public Result getFlag(Http.Request request, BigDecimal version) throws Exception {
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
        String valueflagableType = request.getQueryString("flagableType");
        String flagableType;
        if (valueflagableType != null) {
            flagableType = valueflagableType;
        } else {
            throw new IllegalArgumentException("'flagableType' parameter is required");
        }
        String valueflagableId = request.getQueryString("flagableId");
        Long flagableId;
        if (valueflagableId != null) {
            flagableId = Long.parseLong(valueflagableId);
        } else {
            throw new IllegalArgumentException("'flagableId' parameter is required");
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
        return imp.getFlagHttp(request, version, flagableType, flagableId, deviceId, accountId, latitude, longitude);
    }

    @ApiAction
    public Result getFlagThreshold(Http.Request request, BigDecimal version) throws Exception {
        String valueitemBeingFlaggedType = request.getQueryString("itemBeingFlaggedType");
        String itemBeingFlaggedType;
        if (valueitemBeingFlaggedType != null) {
            itemBeingFlaggedType = valueitemBeingFlaggedType;
        } else {
            throw new IllegalArgumentException("'itemBeingFlaggedType' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        return imp.getFlagThresholdHttp(request, version, itemBeingFlaggedType, appKey);
    }

    @ApiAction
    public Result updateFlagThreshold(Http.Request request, BigDecimal version) throws Exception {
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
        String valueitemBeingFlaggedType = request.getQueryString("itemBeingFlaggedType");
        String itemBeingFlaggedType;
        if (valueitemBeingFlaggedType != null) {
            itemBeingFlaggedType = valueitemBeingFlaggedType;
        } else {
            throw new IllegalArgumentException("'itemBeingFlaggedType' parameter is required");
        }
        String valuethreshold = request.getQueryString("threshold");
        Long threshold;
        if (valuethreshold != null) {
            threshold = Long.parseLong(valuethreshold);
        } else {
            throw new IllegalArgumentException("'threshold' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        return imp.updateFlagThresholdHttp(request, version, itemBeingFlaggedType, threshold, appKey, deviceId, accountId);
    }

}
