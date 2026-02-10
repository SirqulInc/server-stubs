package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.ProfileResponse;
import apimodels.SirqulResponse;
import apimodels.ThirdPartyCredentialResponse;
import apimodels.ThirdPartyNetworkResponse;
import apimodels.ThirdPartyNetworkShortResponse;

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
public class ThirdPartyCredentialsApiController extends Controller {
    private final ThirdPartyCredentialsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ThirdPartyCredentialsApiController(Config configuration, ThirdPartyCredentialsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createCredential(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valuesessionId = request.getQueryString("sessionId");
        String sessionId;
        if (valuesessionId != null) {
            sessionId = valuesessionId;
        } else {
            sessionId = null;
        }
        String valuethirdPartyId = request.getQueryString("thirdPartyId");
        String thirdPartyId;
        if (valuethirdPartyId != null) {
            thirdPartyId = valuethirdPartyId;
        } else {
            throw new IllegalArgumentException("'thirdPartyId' parameter is required");
        }
        String valuethirdPartyName = request.getQueryString("thirdPartyName");
        String thirdPartyName;
        if (valuethirdPartyName != null) {
            thirdPartyName = valuethirdPartyName;
        } else {
            thirdPartyName = null;
        }
        String valuethirdPartyToken = request.getQueryString("thirdPartyToken");
        String thirdPartyToken;
        if (valuethirdPartyToken != null) {
            thirdPartyToken = valuethirdPartyToken;
        } else {
            throw new IllegalArgumentException("'thirdPartyToken' parameter is required");
        }
        String valuenetworkUID = request.getQueryString("networkUID");
        String networkUID;
        if (valuenetworkUID != null) {
            networkUID = valuenetworkUID;
        } else {
            throw new IllegalArgumentException("'networkUID' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valueemailAddress = request.getQueryString("emailAddress");
        String emailAddress;
        if (valueemailAddress != null) {
            emailAddress = valueemailAddress;
        } else {
            emailAddress = null;
        }
        String valuesigninOnlyMode = request.getQueryString("signinOnlyMode");
        Boolean signinOnlyMode;
        if (valuesigninOnlyMode != null) {
            signinOnlyMode = Boolean.valueOf(valuesigninOnlyMode);
        } else {
            signinOnlyMode = false;
        }
        String valueresponseFilters = request.getQueryString("responseFilters");
        String responseFilters;
        if (valueresponseFilters != null) {
            responseFilters = valueresponseFilters;
        } else {
            responseFilters = null;
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
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valuethirdPartyRefreshToken = request.getQueryString("thirdPartyRefreshToken");
        String thirdPartyRefreshToken;
        if (valuethirdPartyRefreshToken != null) {
            thirdPartyRefreshToken = valuethirdPartyRefreshToken;
        } else {
            thirdPartyRefreshToken = null;
        }
        String valueaudienceIdsToAdd = request.getQueryString("audienceIdsToAdd");
        String audienceIdsToAdd;
        if (valueaudienceIdsToAdd != null) {
            audienceIdsToAdd = valueaudienceIdsToAdd;
        } else {
            audienceIdsToAdd = null;
        }
        String valueaudienceIdsToRemove = request.getQueryString("audienceIdsToRemove");
        String audienceIdsToRemove;
        if (valueaudienceIdsToRemove != null) {
            audienceIdsToRemove = valueaudienceIdsToRemove;
        } else {
            audienceIdsToRemove = null;
        }
        return imp.createCredentialHttp(request, version, thirdPartyId, thirdPartyToken, networkUID, appKey, accountId, deviceId, sessionId, thirdPartyName, emailAddress, signinOnlyMode, responseFilters, latitude, longitude, metaData, thirdPartyRefreshToken, audienceIdsToAdd, audienceIdsToRemove);
    }

    @ApiAction
    public Result createNetwork(Http.Request request, BigDecimal version) throws Exception {
        JsonNode nodebody = request.body().asJson();
        String body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), String.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
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
        String valueenableIntrospection = request.getQueryString("enableIntrospection");
        Boolean enableIntrospection;
        if (valueenableIntrospection != null) {
            enableIntrospection = Boolean.valueOf(valueenableIntrospection);
        } else {
            throw new IllegalArgumentException("'enableIntrospection' parameter is required");
        }
        String valueintrospectionMethod = request.getQueryString("introspectionMethod");
        String introspectionMethod;
        if (valueintrospectionMethod != null) {
            introspectionMethod = valueintrospectionMethod;
        } else {
            introspectionMethod = null;
        }
        String valueintrospectionURL = request.getQueryString("introspectionURL");
        String introspectionURL;
        if (valueintrospectionURL != null) {
            introspectionURL = valueintrospectionURL;
        } else {
            introspectionURL = null;
        }
        String valueintrospectionParams = request.getQueryString("introspectionParams");
        String introspectionParams;
        if (valueintrospectionParams != null) {
            introspectionParams = valueintrospectionParams;
        } else {
            introspectionParams = null;
        }
        String valuerequiredRootField = request.getQueryString("requiredRootField");
        String requiredRootField;
        if (valuerequiredRootField != null) {
            requiredRootField = valuerequiredRootField;
        } else {
            requiredRootField = null;
        }
        String valueenableMFA = request.getQueryString("enableMFA");
        Boolean enableMFA;
        if (valueenableMFA != null) {
            enableMFA = Boolean.valueOf(valueenableMFA);
        } else {
            enableMFA = null;
        }
        String valuesizeMFA = request.getQueryString("sizeMFA");
        Integer sizeMFA;
        if (valuesizeMFA != null) {
            sizeMFA = Integer.parseInt(valuesizeMFA);
        } else {
            sizeMFA = null;
        }
        String valueshelfLifeMFA = request.getQueryString("shelfLifeMFA");
        Integer shelfLifeMFA;
        if (valueshelfLifeMFA != null) {
            shelfLifeMFA = Integer.parseInt(valueshelfLifeMFA);
        } else {
            shelfLifeMFA = null;
        }
        String valueoauthTokenURL = request.getQueryString("oauthTokenURL");
        String oauthTokenURL;
        if (valueoauthTokenURL != null) {
            oauthTokenURL = valueoauthTokenURL;
        } else {
            oauthTokenURL = null;
        }
        String valueoauthPrivateKey = request.getQueryString("oauthPrivateKey");
        InputStream oauthPrivateKey;
        if (valueoauthPrivateKey != null) {
            oauthPrivateKey = valueoauthPrivateKey;
        } else {
            oauthPrivateKey = null;
        }
        String valueoauthPublicKey = request.getQueryString("oauthPublicKey");
        InputStream oauthPublicKey;
        if (valueoauthPublicKey != null) {
            oauthPublicKey = valueoauthPublicKey;
        } else {
            oauthPublicKey = null;
        }
        String valueoauthClientId = request.getQueryString("oauthClientId");
        String oauthClientId;
        if (valueoauthClientId != null) {
            oauthClientId = valueoauthClientId;
        } else {
            oauthClientId = null;
        }
        String valueoauthSecretKey = request.getQueryString("oauthSecretKey");
        String oauthSecretKey;
        if (valueoauthSecretKey != null) {
            oauthSecretKey = valueoauthSecretKey;
        } else {
            oauthSecretKey = null;
        }
        return imp.createNetworkHttp(request, version, accountId, name, enableIntrospection, description, introspectionMethod, introspectionURL, introspectionParams, requiredRootField, enableMFA, sizeMFA, shelfLifeMFA, oauthTokenURL, oauthPrivateKey, oauthPublicKey, oauthClientId, oauthSecretKey, body);
    }

    @ApiAction
    public Result deleteCredential(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuenetworkUID = request.getQueryString("networkUID");
        String networkUID;
        if (valuenetworkUID != null) {
            networkUID = valuenetworkUID;
        } else {
            throw new IllegalArgumentException("'networkUID' parameter is required");
        }
        String valuethirdPartyId = request.getQueryString("thirdPartyId");
        String thirdPartyId;
        if (valuethirdPartyId != null) {
            thirdPartyId = valuethirdPartyId;
        } else {
            throw new IllegalArgumentException("'thirdPartyId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        return imp.deleteCredentialHttp(request, version, accountId, networkUID, thirdPartyId, appKey);
    }

    @ApiAction
    public Result deleteNetwork(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuenetworkUID = request.getQueryString("networkUID");
        String networkUID;
        if (valuenetworkUID != null) {
            networkUID = valuenetworkUID;
        } else {
            throw new IllegalArgumentException("'networkUID' parameter is required");
        }
        return imp.deleteNetworkHttp(request, version, accountId, networkUID);
    }

    @ApiAction
    public Result getCredential(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valuesessionId = request.getQueryString("sessionId");
        String sessionId;
        if (valuesessionId != null) {
            sessionId = valuesessionId;
        } else {
            sessionId = null;
        }
        String valuethirdPartyCredentialId = request.getQueryString("thirdPartyCredentialId");
        Long thirdPartyCredentialId;
        if (valuethirdPartyCredentialId != null) {
            thirdPartyCredentialId = Long.parseLong(valuethirdPartyCredentialId);
        } else {
            thirdPartyCredentialId = null;
        }
        String valuethirdPartyToken = request.getQueryString("thirdPartyToken");
        String thirdPartyToken;
        if (valuethirdPartyToken != null) {
            thirdPartyToken = valuethirdPartyToken;
        } else {
            thirdPartyToken = null;
        }
        String valuethirdPartySecret = request.getQueryString("thirdPartySecret");
        String thirdPartySecret;
        if (valuethirdPartySecret != null) {
            thirdPartySecret = valuethirdPartySecret;
        } else {
            thirdPartySecret = null;
        }
        String valuecreateNewAccount = request.getQueryString("createNewAccount");
        Boolean createNewAccount;
        if (valuecreateNewAccount != null) {
            createNewAccount = Boolean.valueOf(valuecreateNewAccount);
        } else {
            createNewAccount = false;
        }
        String valuenetworkUID = request.getQueryString("networkUID");
        String networkUID;
        if (valuenetworkUID != null) {
            networkUID = valuenetworkUID;
        } else {
            throw new IllegalArgumentException("'networkUID' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valueresponseFilters = request.getQueryString("responseFilters");
        String responseFilters;
        if (valueresponseFilters != null) {
            responseFilters = valueresponseFilters;
        } else {
            responseFilters = null;
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
        String valueaudienceIdsToAdd = request.getQueryString("audienceIdsToAdd");
        String audienceIdsToAdd;
        if (valueaudienceIdsToAdd != null) {
            audienceIdsToAdd = valueaudienceIdsToAdd;
        } else {
            audienceIdsToAdd = null;
        }
        String valueaudienceIdsToRemove = request.getQueryString("audienceIdsToRemove");
        String audienceIdsToRemove;
        if (valueaudienceIdsToRemove != null) {
            audienceIdsToRemove = valueaudienceIdsToRemove;
        } else {
            audienceIdsToRemove = null;
        }
        String valuereferralAccountId = request.getQueryString("referralAccountId");
        Long referralAccountId;
        if (valuereferralAccountId != null) {
            referralAccountId = Long.parseLong(valuereferralAccountId);
        } else {
            referralAccountId = null;
        }
        return imp.getCredentialHttp(request, version, networkUID, appKey, accountId, deviceId, sessionId, thirdPartyCredentialId, thirdPartyToken, thirdPartySecret, createNewAccount, responseFilters, latitude, longitude, audienceIdsToAdd, audienceIdsToRemove, referralAccountId);
    }

    @ApiAction
    public Result getNetwork(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuenetworkUID = request.getQueryString("networkUID");
        String networkUID;
        if (valuenetworkUID != null) {
            networkUID = valuenetworkUID;
        } else {
            throw new IllegalArgumentException("'networkUID' parameter is required");
        }
        return imp.getNetworkHttp(request, version, accountId, networkUID);
    }

    @ApiAction
    public Result searchCredentials(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuenetworkUID = request.getQueryString("networkUID");
        String networkUID;
        if (valuenetworkUID != null) {
            networkUID = valuenetworkUID;
        } else {
            networkUID = null;
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = null;
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
        return imp.searchCredentialsHttp(request, version, accountId, keyword, networkUID, descending, start, limit);
    }

    @ApiAction
    public Result searchNetworks(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
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
        String valuefilterBillable = request.getQueryString("filterBillable");
        Boolean filterBillable;
        if (valuefilterBillable != null) {
            filterBillable = Boolean.valueOf(valuefilterBillable);
        } else {
            filterBillable = null;
        }
        return imp.searchNetworksHttp(request, version, accountId, sortField, descending, start, limit, activeOnly, keyword, filterBillable);
    }

    @ApiAction
    public Result sendMFAChallenge(Http.Request request, BigDecimal version) throws Exception {
        String valuethirdPartyToken = request.getQueryString("thirdPartyToken");
        String thirdPartyToken;
        if (valuethirdPartyToken != null) {
            thirdPartyToken = valuethirdPartyToken;
        } else {
            thirdPartyToken = null;
        }
        String valuethirdPartyCredentialId = request.getQueryString("thirdPartyCredentialId");
        Long thirdPartyCredentialId;
        if (valuethirdPartyCredentialId != null) {
            thirdPartyCredentialId = Long.parseLong(valuethirdPartyCredentialId);
        } else {
            thirdPartyCredentialId = null;
        }
        String valuenetworkUID = request.getQueryString("networkUID");
        String networkUID;
        if (valuenetworkUID != null) {
            networkUID = valuenetworkUID;
        } else {
            throw new IllegalArgumentException("'networkUID' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        return imp.sendMFAChallengeHttp(request, version, networkUID, appKey, thirdPartyToken, thirdPartyCredentialId, deviceId);
    }

    @ApiAction
    public Result updateCredential(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valuenetworkUID = request.getQueryString("networkUID");
        String networkUID;
        if (valuenetworkUID != null) {
            networkUID = valuenetworkUID;
        } else {
            throw new IllegalArgumentException("'networkUID' parameter is required");
        }
        String valuethirdPartyId = request.getQueryString("thirdPartyId");
        String thirdPartyId;
        if (valuethirdPartyId != null) {
            thirdPartyId = valuethirdPartyId;
        } else {
            throw new IllegalArgumentException("'thirdPartyId' parameter is required");
        }
        String valuethirdPartyName = request.getQueryString("thirdPartyName");
        String thirdPartyName;
        if (valuethirdPartyName != null) {
            thirdPartyName = valuethirdPartyName;
        } else {
            thirdPartyName = null;
        }
        String valuethirdPartyToken = request.getQueryString("thirdPartyToken");
        String thirdPartyToken;
        if (valuethirdPartyToken != null) {
            thirdPartyToken = valuethirdPartyToken;
        } else {
            thirdPartyToken = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valueresponseFilters = request.getQueryString("responseFilters");
        String responseFilters;
        if (valueresponseFilters != null) {
            responseFilters = valueresponseFilters;
        } else {
            responseFilters = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valuethirdPartyRefreshToken = request.getQueryString("thirdPartyRefreshToken");
        String thirdPartyRefreshToken;
        if (valuethirdPartyRefreshToken != null) {
            thirdPartyRefreshToken = valuethirdPartyRefreshToken;
        } else {
            thirdPartyRefreshToken = null;
        }
        return imp.updateCredentialHttp(request, version, networkUID, thirdPartyId, appKey, deviceId, thirdPartyName, thirdPartyToken, responseFilters, metaData, thirdPartyRefreshToken);
    }

    @ApiAction
    public Result updateNetwork(Http.Request request, BigDecimal version) throws Exception {
        JsonNode nodebody = request.body().asJson();
        String body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), String.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuenetworkUID = request.getQueryString("networkUID");
        String networkUID;
        if (valuenetworkUID != null) {
            networkUID = valuenetworkUID;
        } else {
            throw new IllegalArgumentException("'networkUID' parameter is required");
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
        String valueenableIntrospection = request.getQueryString("enableIntrospection");
        Boolean enableIntrospection;
        if (valueenableIntrospection != null) {
            enableIntrospection = Boolean.valueOf(valueenableIntrospection);
        } else {
            enableIntrospection = null;
        }
        String valueintrospectionMethod = request.getQueryString("introspectionMethod");
        String introspectionMethod;
        if (valueintrospectionMethod != null) {
            introspectionMethod = valueintrospectionMethod;
        } else {
            introspectionMethod = null;
        }
        String valueintrospectionURL = request.getQueryString("introspectionURL");
        String introspectionURL;
        if (valueintrospectionURL != null) {
            introspectionURL = valueintrospectionURL;
        } else {
            introspectionURL = null;
        }
        String valueintrospectionParams = request.getQueryString("introspectionParams");
        String introspectionParams;
        if (valueintrospectionParams != null) {
            introspectionParams = valueintrospectionParams;
        } else {
            introspectionParams = null;
        }
        String valuerequiredRootField = request.getQueryString("requiredRootField");
        String requiredRootField;
        if (valuerequiredRootField != null) {
            requiredRootField = valuerequiredRootField;
        } else {
            requiredRootField = null;
        }
        String valueenableMFA = request.getQueryString("enableMFA");
        Boolean enableMFA;
        if (valueenableMFA != null) {
            enableMFA = Boolean.valueOf(valueenableMFA);
        } else {
            enableMFA = null;
        }
        String valuesizeMFA = request.getQueryString("sizeMFA");
        Integer sizeMFA;
        if (valuesizeMFA != null) {
            sizeMFA = Integer.parseInt(valuesizeMFA);
        } else {
            sizeMFA = null;
        }
        String valueshelfLifeMFA = request.getQueryString("shelfLifeMFA");
        Integer shelfLifeMFA;
        if (valueshelfLifeMFA != null) {
            shelfLifeMFA = Integer.parseInt(valueshelfLifeMFA);
        } else {
            shelfLifeMFA = null;
        }
        String valueoauthTokenURL = request.getQueryString("oauthTokenURL");
        String oauthTokenURL;
        if (valueoauthTokenURL != null) {
            oauthTokenURL = valueoauthTokenURL;
        } else {
            oauthTokenURL = null;
        }
        String valueoauthPrivateKey = request.getQueryString("oauthPrivateKey");
        InputStream oauthPrivateKey;
        if (valueoauthPrivateKey != null) {
            oauthPrivateKey = valueoauthPrivateKey;
        } else {
            oauthPrivateKey = null;
        }
        String valueoauthPublicKey = request.getQueryString("oauthPublicKey");
        InputStream oauthPublicKey;
        if (valueoauthPublicKey != null) {
            oauthPublicKey = valueoauthPublicKey;
        } else {
            oauthPublicKey = null;
        }
        String valueoauthClientId = request.getQueryString("oauthClientId");
        String oauthClientId;
        if (valueoauthClientId != null) {
            oauthClientId = valueoauthClientId;
        } else {
            oauthClientId = null;
        }
        String valueoauthSecretKey = request.getQueryString("oauthSecretKey");
        String oauthSecretKey;
        if (valueoauthSecretKey != null) {
            oauthSecretKey = valueoauthSecretKey;
        } else {
            oauthSecretKey = null;
        }
        return imp.updateNetworkHttp(request, version, accountId, networkUID, name, description, enableIntrospection, introspectionMethod, introspectionURL, introspectionParams, requiredRootField, enableMFA, sizeMFA, shelfLifeMFA, oauthTokenURL, oauthPrivateKey, oauthPublicKey, oauthClientId, oauthSecretKey, body);
    }

}
