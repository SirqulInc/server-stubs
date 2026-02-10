package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.ProfileResponse;
import apimodels.SirqulResponse;
import apimodels.ThirdPartyCredentialResponse;
import apimodels.ThirdPartyNetworkResponse;
import apimodels.ThirdPartyNetworkShortResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ThirdPartyCredentialsApiControllerImp extends ThirdPartyCredentialsApiControllerImpInterface {
    @Override
    public ProfileResponse createCredential(Http.Request request, BigDecimal version, @NotNull String thirdPartyId, @NotNull String thirdPartyToken, @NotNull String networkUID, @NotNull String appKey, Long accountId, String deviceId, String sessionId, String thirdPartyName, String emailAddress, Boolean signinOnlyMode, String responseFilters, Double latitude, Double longitude, String metaData, String thirdPartyRefreshToken, String audienceIdsToAdd, String audienceIdsToRemove) throws Exception {
        //Do your magic!!!
        return new ProfileResponse();
    }

    @Override
    public ThirdPartyNetworkResponse createNetwork(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, @NotNull Boolean enableIntrospection, String description, String introspectionMethod, String introspectionURL, String introspectionParams, String requiredRootField, Boolean enableMFA, Integer sizeMFA, Integer shelfLifeMFA, String oauthTokenURL, InputStream oauthPrivateKey, InputStream oauthPublicKey, String oauthClientId, String oauthSecretKey, String body) throws Exception {
        //Do your magic!!!
        return new ThirdPartyNetworkResponse();
    }

    @Override
    public SirqulResponse deleteCredential(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String networkUID, @NotNull String thirdPartyId, @NotNull String appKey) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse deleteNetwork(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String networkUID) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public ProfileResponse getCredential(Http.Request request, BigDecimal version, @NotNull String networkUID, @NotNull String appKey, Long accountId, String deviceId, String sessionId, Long thirdPartyCredentialId, String thirdPartyToken, String thirdPartySecret, Boolean createNewAccount, String responseFilters, Double latitude, Double longitude, String audienceIdsToAdd, String audienceIdsToRemove, Long referralAccountId) throws Exception {
        //Do your magic!!!
        return new ProfileResponse();
    }

    @Override
    public ThirdPartyNetworkResponse getNetwork(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String networkUID) throws Exception {
        //Do your magic!!!
        return new ThirdPartyNetworkResponse();
    }

    @Override
    public List<ThirdPartyCredentialResponse> searchCredentials(Http.Request request, BigDecimal version, @NotNull Long accountId, String keyword, String networkUID, Boolean descending, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new ArrayList<ThirdPartyCredentialResponse>();
    }

    @Override
    public List<ThirdPartyNetworkShortResponse> searchNetworks(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String keyword, Boolean filterBillable) throws Exception {
        //Do your magic!!!
        return new ArrayList<ThirdPartyNetworkShortResponse>();
    }

    @Override
    public SirqulResponse sendMFAChallenge(Http.Request request, BigDecimal version, @NotNull String networkUID, @NotNull String appKey, String thirdPartyToken, Long thirdPartyCredentialId, String deviceId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public ProfileResponse updateCredential(Http.Request request, BigDecimal version, @NotNull String networkUID, @NotNull String thirdPartyId, @NotNull String appKey, String deviceId, String thirdPartyName, String thirdPartyToken, String responseFilters, String metaData, String thirdPartyRefreshToken) throws Exception {
        //Do your magic!!!
        return new ProfileResponse();
    }

    @Override
    public ThirdPartyNetworkResponse updateNetwork(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String networkUID, String name, String description, Boolean enableIntrospection, String introspectionMethod, String introspectionURL, String introspectionParams, String requiredRootField, Boolean enableMFA, Integer sizeMFA, Integer shelfLifeMFA, String oauthTokenURL, InputStream oauthPrivateKey, InputStream oauthPublicKey, String oauthClientId, String oauthSecretKey, String body) throws Exception {
        //Do your magic!!!
        return new ThirdPartyNetworkResponse();
    }

}
