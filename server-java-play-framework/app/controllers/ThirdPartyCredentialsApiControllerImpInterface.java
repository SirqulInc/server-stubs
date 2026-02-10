package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.ProfileResponse;
import apimodels.SirqulResponse;
import apimodels.ThirdPartyCredentialResponse;
import apimodels.ThirdPartyNetworkResponse;
import apimodels.ThirdPartyNetworkShortResponse;

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
public abstract class ThirdPartyCredentialsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createCredentialHttp(Http.Request request, BigDecimal version, @NotNull String thirdPartyId, @NotNull String thirdPartyToken, @NotNull String networkUID, @NotNull String appKey, Long accountId, String deviceId, String sessionId, String thirdPartyName, String emailAddress, Boolean signinOnlyMode, String responseFilters, Double latitude, Double longitude, String metaData, String thirdPartyRefreshToken, String audienceIdsToAdd, String audienceIdsToRemove) throws Exception {
        ProfileResponse obj = createCredential(request, version, thirdPartyId, thirdPartyToken, networkUID, appKey, accountId, deviceId, sessionId, thirdPartyName, emailAddress, signinOnlyMode, responseFilters, latitude, longitude, metaData, thirdPartyRefreshToken, audienceIdsToAdd, audienceIdsToRemove);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProfileResponse createCredential(Http.Request request, BigDecimal version, @NotNull String thirdPartyId, @NotNull String thirdPartyToken, @NotNull String networkUID, @NotNull String appKey, Long accountId, String deviceId, String sessionId, String thirdPartyName, String emailAddress, Boolean signinOnlyMode, String responseFilters, Double latitude, Double longitude, String metaData, String thirdPartyRefreshToken, String audienceIdsToAdd, String audienceIdsToRemove) throws Exception;

    public Result createNetworkHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, @NotNull Boolean enableIntrospection, String description, String introspectionMethod, String introspectionURL, String introspectionParams, String requiredRootField, Boolean enableMFA, Integer sizeMFA, Integer shelfLifeMFA, String oauthTokenURL, InputStream oauthPrivateKey, InputStream oauthPublicKey, String oauthClientId, String oauthSecretKey, String body) throws Exception {
        ThirdPartyNetworkResponse obj = createNetwork(request, version, accountId, name, enableIntrospection, description, introspectionMethod, introspectionURL, introspectionParams, requiredRootField, enableMFA, sizeMFA, shelfLifeMFA, oauthTokenURL, oauthPrivateKey, oauthPublicKey, oauthClientId, oauthSecretKey, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ThirdPartyNetworkResponse createNetwork(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, @NotNull Boolean enableIntrospection, String description, String introspectionMethod, String introspectionURL, String introspectionParams, String requiredRootField, Boolean enableMFA, Integer sizeMFA, Integer shelfLifeMFA, String oauthTokenURL, InputStream oauthPrivateKey, InputStream oauthPublicKey, String oauthClientId, String oauthSecretKey, String body) throws Exception;

    public Result deleteCredentialHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String networkUID, @NotNull String thirdPartyId, @NotNull String appKey) throws Exception {
        SirqulResponse obj = deleteCredential(request, version, accountId, networkUID, thirdPartyId, appKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteCredential(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String networkUID, @NotNull String thirdPartyId, @NotNull String appKey) throws Exception;

    public Result deleteNetworkHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String networkUID) throws Exception {
        SirqulResponse obj = deleteNetwork(request, version, accountId, networkUID);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteNetwork(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String networkUID) throws Exception;

    public Result getCredentialHttp(Http.Request request, BigDecimal version, @NotNull String networkUID, @NotNull String appKey, Long accountId, String deviceId, String sessionId, Long thirdPartyCredentialId, String thirdPartyToken, String thirdPartySecret, Boolean createNewAccount, String responseFilters, Double latitude, Double longitude, String audienceIdsToAdd, String audienceIdsToRemove, Long referralAccountId) throws Exception {
        ProfileResponse obj = getCredential(request, version, networkUID, appKey, accountId, deviceId, sessionId, thirdPartyCredentialId, thirdPartyToken, thirdPartySecret, createNewAccount, responseFilters, latitude, longitude, audienceIdsToAdd, audienceIdsToRemove, referralAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProfileResponse getCredential(Http.Request request, BigDecimal version, @NotNull String networkUID, @NotNull String appKey, Long accountId, String deviceId, String sessionId, Long thirdPartyCredentialId, String thirdPartyToken, String thirdPartySecret, Boolean createNewAccount, String responseFilters, Double latitude, Double longitude, String audienceIdsToAdd, String audienceIdsToRemove, Long referralAccountId) throws Exception;

    public Result getNetworkHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String networkUID) throws Exception {
        ThirdPartyNetworkResponse obj = getNetwork(request, version, accountId, networkUID);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ThirdPartyNetworkResponse getNetwork(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String networkUID) throws Exception;

    public Result searchCredentialsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, String keyword, String networkUID, Boolean descending, Integer start, Integer limit) throws Exception {
        List<ThirdPartyCredentialResponse> obj = searchCredentials(request, version, accountId, keyword, networkUID, descending, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (ThirdPartyCredentialResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<ThirdPartyCredentialResponse> searchCredentials(Http.Request request, BigDecimal version, @NotNull Long accountId, String keyword, String networkUID, Boolean descending, Integer start, Integer limit) throws Exception;

    public Result searchNetworksHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String keyword, Boolean filterBillable) throws Exception {
        List<ThirdPartyNetworkShortResponse> obj = searchNetworks(request, version, accountId, sortField, descending, start, limit, activeOnly, keyword, filterBillable);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (ThirdPartyNetworkShortResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<ThirdPartyNetworkShortResponse> searchNetworks(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String keyword, Boolean filterBillable) throws Exception;

    public Result sendMFAChallengeHttp(Http.Request request, BigDecimal version, @NotNull String networkUID, @NotNull String appKey, String thirdPartyToken, Long thirdPartyCredentialId, String deviceId) throws Exception {
        SirqulResponse obj = sendMFAChallenge(request, version, networkUID, appKey, thirdPartyToken, thirdPartyCredentialId, deviceId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse sendMFAChallenge(Http.Request request, BigDecimal version, @NotNull String networkUID, @NotNull String appKey, String thirdPartyToken, Long thirdPartyCredentialId, String deviceId) throws Exception;

    public Result updateCredentialHttp(Http.Request request, BigDecimal version, @NotNull String networkUID, @NotNull String thirdPartyId, @NotNull String appKey, String deviceId, String thirdPartyName, String thirdPartyToken, String responseFilters, String metaData, String thirdPartyRefreshToken) throws Exception {
        ProfileResponse obj = updateCredential(request, version, networkUID, thirdPartyId, appKey, deviceId, thirdPartyName, thirdPartyToken, responseFilters, metaData, thirdPartyRefreshToken);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProfileResponse updateCredential(Http.Request request, BigDecimal version, @NotNull String networkUID, @NotNull String thirdPartyId, @NotNull String appKey, String deviceId, String thirdPartyName, String thirdPartyToken, String responseFilters, String metaData, String thirdPartyRefreshToken) throws Exception;

    public Result updateNetworkHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String networkUID, String name, String description, Boolean enableIntrospection, String introspectionMethod, String introspectionURL, String introspectionParams, String requiredRootField, Boolean enableMFA, Integer sizeMFA, Integer shelfLifeMFA, String oauthTokenURL, InputStream oauthPrivateKey, InputStream oauthPublicKey, String oauthClientId, String oauthSecretKey, String body) throws Exception {
        ThirdPartyNetworkResponse obj = updateNetwork(request, version, accountId, networkUID, name, description, enableIntrospection, introspectionMethod, introspectionURL, introspectionParams, requiredRootField, enableMFA, sizeMFA, shelfLifeMFA, oauthTokenURL, oauthPrivateKey, oauthPublicKey, oauthClientId, oauthSecretKey, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ThirdPartyNetworkResponse updateNetwork(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String networkUID, String name, String description, Boolean enableIntrospection, String introspectionMethod, String introspectionURL, String introspectionParams, String requiredRootField, Boolean enableMFA, Integer sizeMFA, Integer shelfLifeMFA, String oauthTokenURL, InputStream oauthPrivateKey, InputStream oauthPublicKey, String oauthClientId, String oauthSecretKey, String body) throws Exception;

}
