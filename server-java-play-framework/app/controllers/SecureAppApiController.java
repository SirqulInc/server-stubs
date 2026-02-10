package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.PaymentRequest;
import apimodels.ProfileResponse;
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
public class SecureAppApiController extends Controller {
    private final SecureAppApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private SecureAppApiController(Config configuration, SecureAppApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createSecureApplication(Http.Request request, BigDecimal version) throws Exception {
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
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = true;
        }
        String valuekeyCert = request.getQueryString("keyCert");
        InputStream keyCert;
        if (valuekeyCert != null) {
            keyCert = valuekeyCert;
        } else {
            throw new IllegalArgumentException("'keyCert' parameter is required");
        }
        String valuetrustStore = request.getQueryString("trustStore");
        InputStream trustStore;
        if (valuetrustStore != null) {
            trustStore = valuetrustStore;
        } else {
            throw new IllegalArgumentException("'trustStore' parameter is required");
        }
        String valueusername = request.getQueryString("username");
        String username;
        if (valueusername != null) {
            username = valueusername;
        } else {
            throw new IllegalArgumentException("'username' parameter is required");
        }
        String valuepassword = request.getQueryString("password");
        String password;
        if (valuepassword != null) {
            password = valuepassword;
        } else {
            throw new IllegalArgumentException("'password' parameter is required");
        }
        String valuebiometricType = request.getQueryString("biometricType");
        String biometricType;
        if (valuebiometricType != null) {
            biometricType = valuebiometricType;
        } else {
            biometricType = "FACIAL";
        }
        String valuebiometricPosition = request.getQueryString("biometricPosition");
        String biometricPosition;
        if (valuebiometricPosition != null) {
            biometricPosition = valuebiometricPosition;
        } else {
            biometricPosition = "UNKNOWN";
        }
        String valuebiometricPosition2 = request.getQueryString("biometricPosition2");
        String biometricPosition2;
        if (valuebiometricPosition2 != null) {
            biometricPosition2 = valuebiometricPosition2;
        } else {
            biometricPosition2 = "UNKNOWN";
        }
        return imp.createSecureApplicationHttp(request, version, accountId, appKey, keyCert, trustStore, username, password, active, biometricType, biometricPosition, biometricPosition2);
    }

    @ApiAction
    public Result deleteSecureApplication(Http.Request request, BigDecimal version) throws Exception {
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
        return imp.deleteSecureApplicationHttp(request, version, accountId, appKey);
    }

    @ApiAction
    public Result loginSecure(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuebiometricFile = request.getQueryString("biometricFile");
        InputStream biometricFile;
        if (valuebiometricFile != null) {
            biometricFile = valuebiometricFile;
        } else {
            throw new IllegalArgumentException("'biometricFile' parameter is required");
        }
        String valuebiometricFile2 = request.getQueryString("biometricFile2");
        InputStream biometricFile2;
        if (valuebiometricFile2 != null) {
            biometricFile2 = valuebiometricFile2;
        } else {
            biometricFile2 = null;
        }
        String valueageRestriction = request.getQueryString("ageRestriction");
        Integer ageRestriction;
        if (valueageRestriction != null) {
            ageRestriction = Integer.parseInt(valueageRestriction);
        } else {
            ageRestriction = 0;
        }
        String valuereturnProfile = request.getQueryString("returnProfile");
        Boolean returnProfile;
        if (valuereturnProfile != null) {
            returnProfile = Boolean.valueOf(valuereturnProfile);
        } else {
            returnProfile = false;
        }
        String valueresponseFilters = request.getQueryString("responseFilters");
        String responseFilters;
        if (valueresponseFilters != null) {
            responseFilters = valueresponseFilters;
        } else {
            responseFilters = "PROFILE";
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
        return imp.loginSecureHttp(request, version, appKey, biometricFile, deviceId, biometricFile2, ageRestriction, returnProfile, responseFilters, latitude, longitude);
    }

    @ApiAction
    public Result purchaseSecure(Http.Request request, BigDecimal version) throws Exception {
        JsonNode nodebody = request.body().asJson();
        PaymentRequest body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), PaymentRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            throw new IllegalArgumentException("'body' parameter is required");
        }
        return imp.purchaseSecureHttp(request, version, body);
    }

    @ApiAction
    public Result resetSecure(Http.Request request, BigDecimal version) throws Exception {
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
        return imp.resetSecureHttp(request, version, accountId, appKey);
    }

    @ApiAction
    public Result updateSecureApplication(Http.Request request, BigDecimal version) throws Exception {
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
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valuekeyCert = request.getQueryString("keyCert");
        InputStream keyCert;
        if (valuekeyCert != null) {
            keyCert = valuekeyCert;
        } else {
            keyCert = null;
        }
        String valuetrustStore = request.getQueryString("trustStore");
        InputStream trustStore;
        if (valuetrustStore != null) {
            trustStore = valuetrustStore;
        } else {
            trustStore = null;
        }
        String valueusername = request.getQueryString("username");
        String username;
        if (valueusername != null) {
            username = valueusername;
        } else {
            username = null;
        }
        String valuepassword = request.getQueryString("password");
        String password;
        if (valuepassword != null) {
            password = valuepassword;
        } else {
            password = null;
        }
        String valuebiometricType = request.getQueryString("biometricType");
        String biometricType;
        if (valuebiometricType != null) {
            biometricType = valuebiometricType;
        } else {
            biometricType = null;
        }
        String valuebiometricPosition = request.getQueryString("biometricPosition");
        String biometricPosition;
        if (valuebiometricPosition != null) {
            biometricPosition = valuebiometricPosition;
        } else {
            biometricPosition = null;
        }
        String valuebiometricPosition2 = request.getQueryString("biometricPosition2");
        String biometricPosition2;
        if (valuebiometricPosition2 != null) {
            biometricPosition2 = valuebiometricPosition2;
        } else {
            biometricPosition2 = null;
        }
        return imp.updateSecureApplicationHttp(request, version, accountId, appKey, active, keyCert, trustStore, username, password, biometricType, biometricPosition, biometricPosition2);
    }

}
