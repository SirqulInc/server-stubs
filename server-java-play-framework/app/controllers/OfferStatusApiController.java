package controllers;

import java.math.BigDecimal;
import apimodels.OfferTransactionStatusResponse;
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
public class OfferStatusApiController extends Controller {
    private final OfferStatusApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private OfferStatusApiController(Config configuration, OfferStatusApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createOfferTransactionStatus(Http.Request request, BigDecimal version) throws Exception {
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
        String valuecode = request.getQueryString("code");
        Integer code;
        if (valuecode != null) {
            code = Integer.parseInt(valuecode);
        } else {
            throw new IllegalArgumentException("'code' parameter is required");
        }
        String valuerole = request.getQueryString("role");
        String role;
        if (valuerole != null) {
            role = valuerole;
        } else {
            role = "ANY";
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = true;
        }
        String valueapplicationIds = request.getQueryString("applicationIds");
        String applicationIds;
        if (valueapplicationIds != null) {
            applicationIds = valueapplicationIds;
        } else {
            applicationIds = null;
        }
        return imp.createOfferTransactionStatusHttp(request, version, name, code, deviceId, accountId, latitude, longitude, description, role, active, applicationIds);
    }

    @ApiAction
    public Result deleteOfferTransactionStatus(Http.Request request, BigDecimal version) throws Exception {
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
        String valuestatusId = request.getQueryString("statusId");
        Long statusId;
        if (valuestatusId != null) {
            statusId = Long.parseLong(valuestatusId);
        } else {
            throw new IllegalArgumentException("'statusId' parameter is required");
        }
        return imp.deleteOfferTransactionStatusHttp(request, version, statusId, deviceId, accountId, latitude, longitude);
    }

    @ApiAction
    public Result getOfferTransactionStatus(Http.Request request, BigDecimal version) throws Exception {
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
        String valuestatusId = request.getQueryString("statusId");
        Long statusId;
        if (valuestatusId != null) {
            statusId = Long.parseLong(valuestatusId);
        } else {
            throw new IllegalArgumentException("'statusId' parameter is required");
        }
        return imp.getOfferTransactionStatusHttp(request, version, statusId, deviceId, accountId, latitude, longitude);
    }

    @ApiAction
    public Result searchOfferTransactionStatuses(Http.Request request, BigDecimal version) throws Exception {
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
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuerole = request.getQueryString("role");
        String role;
        if (valuerole != null) {
            role = valuerole;
        } else {
            role = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = "CODE";
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
        String valueincludeInactive = request.getQueryString("includeInactive");
        Boolean includeInactive;
        if (valueincludeInactive != null) {
            includeInactive = Boolean.valueOf(valueincludeInactive);
        } else {
            includeInactive = false;
        }
        return imp.searchOfferTransactionStatusesHttp(request, version, deviceId, accountId, latitude, longitude, keyword, role, appKey, sortField, descending, start, limit, includeInactive);
    }

    @ApiAction
    public Result updateOfferTransactionStatus(Http.Request request, BigDecimal version) throws Exception {
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
        String valuestatusId = request.getQueryString("statusId");
        Long statusId;
        if (valuestatusId != null) {
            statusId = Long.parseLong(valuestatusId);
        } else {
            statusId = null;
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
        String valuecode = request.getQueryString("code");
        Integer code;
        if (valuecode != null) {
            code = Integer.parseInt(valuecode);
        } else {
            code = null;
        }
        String valuerole = request.getQueryString("role");
        String role;
        if (valuerole != null) {
            role = valuerole;
        } else {
            role = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valueapplicationIds = request.getQueryString("applicationIds");
        String applicationIds;
        if (valueapplicationIds != null) {
            applicationIds = valueapplicationIds;
        } else {
            applicationIds = null;
        }
        return imp.updateOfferTransactionStatusHttp(request, version, deviceId, accountId, latitude, longitude, statusId, name, description, code, role, active, applicationIds);
    }

}
