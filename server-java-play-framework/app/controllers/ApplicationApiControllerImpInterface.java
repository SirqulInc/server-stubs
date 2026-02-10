package controllers;

import apimodels.AccountListResponse;
import apimodels.ApplicationResponse;
import apimodels.ApplicationSettingsResponse;
import apimodels.ApplicationShortResponse;
import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.PlacementResponse;
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
public abstract class ApplicationApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createApplicationHttp(Http.Request request, BigDecimal version, @NotNull String appName, String deviceId, Long accountId, String about, String bundleId, Long appIconAssetId, Long appLogoAssetId, String facebookAppId, String facebookAppSecret, String googleApiKey, Boolean updateEULADate, String eulaVersion, String landingPageUrl, Boolean showInActivities, String activityDescription, String inviteWelcomeText, String invitePageUrl, String urlScheme, String platforms, String downloadUrls, String categoryIds, String scoringType, Integer hintCost, Integer maxScore, Float ticketsPerPoint, Boolean hasGameData, Boolean publicNotifications, Boolean useMatchingAlgorithm, Boolean globalTickets, Float buildVersion, Float apiVersion, String placementName, String placementDescription, String placementSize, Integer placementHeight, Integer placementWidth, Integer placementRefreshInterval, Boolean createObjectStore, Boolean publicContentApproval, Boolean productionMode, Integer minimumSessionLength, Integer sessionGapLength, Boolean localAdsEnabled, String sqootApiKey, String trilatProcessingType, Integer maxSampleSize, Double minRSSI, String modules, Integer authorizedCount, String authorizedServers, String defaultTimezone, String smtpPass, String metaData, String placementMetaData, Boolean ipsFloor, Boolean enableAPNSBadge, Boolean includeInReport, Long defaultAppFilterId, Boolean enableWelcomeEmail, String appleAppId, String appleTeamId, String appleAuthKeyId, InputStream appleAuthKey, String appleIssuerId, String appStoreKeyId, InputStream appStoreKey, InputStream googlePrivateKeyFile, String authorizeNetApiKey, String authorizeNetTransactionKey, String emailSender, String smtpUser, String smtpHost, String vatomBusinessId, String vatomRestClientId, String vatomRestSecretKey, String twilioAccountSID, String twilioAuthToken, String twilioSenderPhoneNumber, String openAISecretKey) throws Exception {
        ApplicationResponse obj = createApplication(request, version, appName, deviceId, accountId, about, bundleId, appIconAssetId, appLogoAssetId, facebookAppId, facebookAppSecret, googleApiKey, updateEULADate, eulaVersion, landingPageUrl, showInActivities, activityDescription, inviteWelcomeText, invitePageUrl, urlScheme, platforms, downloadUrls, categoryIds, scoringType, hintCost, maxScore, ticketsPerPoint, hasGameData, publicNotifications, useMatchingAlgorithm, globalTickets, buildVersion, apiVersion, placementName, placementDescription, placementSize, placementHeight, placementWidth, placementRefreshInterval, createObjectStore, publicContentApproval, productionMode, minimumSessionLength, sessionGapLength, localAdsEnabled, sqootApiKey, trilatProcessingType, maxSampleSize, minRSSI, modules, authorizedCount, authorizedServers, defaultTimezone, smtpPass, metaData, placementMetaData, ipsFloor, enableAPNSBadge, includeInReport, defaultAppFilterId, enableWelcomeEmail, appleAppId, appleTeamId, appleAuthKeyId, appleAuthKey, appleIssuerId, appStoreKeyId, appStoreKey, googlePrivateKeyFile, authorizeNetApiKey, authorizeNetTransactionKey, emailSender, smtpUser, smtpHost, vatomBusinessId, vatomRestClientId, vatomRestSecretKey, twilioAccountSID, twilioAuthToken, twilioSenderPhoneNumber, openAISecretKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ApplicationResponse createApplication(Http.Request request, BigDecimal version, @NotNull String appName, String deviceId, Long accountId, String about, String bundleId, Long appIconAssetId, Long appLogoAssetId, String facebookAppId, String facebookAppSecret, String googleApiKey, Boolean updateEULADate, String eulaVersion, String landingPageUrl, Boolean showInActivities, String activityDescription, String inviteWelcomeText, String invitePageUrl, String urlScheme, String platforms, String downloadUrls, String categoryIds, String scoringType, Integer hintCost, Integer maxScore, Float ticketsPerPoint, Boolean hasGameData, Boolean publicNotifications, Boolean useMatchingAlgorithm, Boolean globalTickets, Float buildVersion, Float apiVersion, String placementName, String placementDescription, String placementSize, Integer placementHeight, Integer placementWidth, Integer placementRefreshInterval, Boolean createObjectStore, Boolean publicContentApproval, Boolean productionMode, Integer minimumSessionLength, Integer sessionGapLength, Boolean localAdsEnabled, String sqootApiKey, String trilatProcessingType, Integer maxSampleSize, Double minRSSI, String modules, Integer authorizedCount, String authorizedServers, String defaultTimezone, String smtpPass, String metaData, String placementMetaData, Boolean ipsFloor, Boolean enableAPNSBadge, Boolean includeInReport, Long defaultAppFilterId, Boolean enableWelcomeEmail, String appleAppId, String appleTeamId, String appleAuthKeyId, InputStream appleAuthKey, String appleIssuerId, String appStoreKeyId, InputStream appStoreKey, InputStream googlePrivateKeyFile, String authorizeNetApiKey, String authorizeNetTransactionKey, String emailSender, String smtpUser, String smtpHost, String vatomBusinessId, String vatomRestClientId, String vatomRestSecretKey, String twilioAccountSID, String twilioAuthToken, String twilioSenderPhoneNumber, String openAISecretKey) throws Exception;

    public Result createApplicationPlacementHttp(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String size, String deviceId, Long accountId, String name, String description, Integer height, Integer width, Integer refreshInterval, Long defaultImageId, Boolean active) throws Exception {
        PlacementResponse obj = createApplicationPlacement(request, version, appKey, size, deviceId, accountId, name, description, height, width, refreshInterval, defaultImageId, active);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PlacementResponse createApplicationPlacement(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String size, String deviceId, Long accountId, String name, String description, Integer height, Integer width, Integer refreshInterval, Long defaultImageId, Boolean active) throws Exception;

    public Result deleteApplicationHttp(Http.Request request, BigDecimal version, Long accountId, String appKey) throws Exception {
        SirqulResponse obj = deleteApplication(request, version, accountId, appKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteApplication(Http.Request request, BigDecimal version, Long accountId, String appKey) throws Exception;

    public Result deleteApplicationPlacementHttp(Http.Request request, BigDecimal version, @NotNull Long placementId, String deviceId, Long accountId) throws Exception {
        PlacementResponse obj = deleteApplicationPlacement(request, version, placementId, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PlacementResponse deleteApplicationPlacement(Http.Request request, BigDecimal version, @NotNull Long placementId, String deviceId, Long accountId) throws Exception;

    public Result getApplicationHttp(Http.Request request, BigDecimal version, String appKey, Long applicationId) throws Exception {
        ApplicationResponse obj = getApplication(request, version, appKey, applicationId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ApplicationResponse getApplication(Http.Request request, BigDecimal version, String appKey, Long applicationId) throws Exception;

    public Result getApplicationPlacementHttp(Http.Request request, BigDecimal version, @NotNull Long placementId, String deviceId, Long accountId) throws Exception {
        PlacementResponse obj = getApplicationPlacement(request, version, placementId, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PlacementResponse getApplicationPlacement(Http.Request request, BigDecimal version, @NotNull Long placementId, String deviceId, Long accountId) throws Exception;

    public Result getApplicationVersionsHttp(Http.Request request, BigDecimal version) throws Exception {
        SirqulResponse obj = getApplicationVersions(request, version);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse getApplicationVersions(Http.Request request, BigDecimal version) throws Exception;

    public Result getUniqueUsersByAppHttp(Http.Request request, BigDecimal version, @NotNull String appKey, String q, String keyword, Long since, Integer i, Integer start, Integer l, Integer limit) throws Exception {
        AccountListResponse obj = getUniqueUsersByApp(request, version, appKey, q, keyword, since, i, start, l, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AccountListResponse getUniqueUsersByApp(Http.Request request, BigDecimal version, @NotNull String appKey, String q, String keyword, Long since, Integer i, Integer start, Integer l, Integer limit) throws Exception;

    public Result listApplicationsHttp(Http.Request request, BigDecimal version, Long accountId, String q, String keyword, String platforms, String deviceIds, String deviceVersions, String categoryIds, String sortField, Boolean hasAds, Boolean publicNotifications, Boolean filterBillable, Boolean filterContentAdmin, Boolean descending, Integer i, Integer start, Integer l, Integer limit, String applicationIds, Boolean hasObjectStore, Boolean activeOnly) throws Exception {
        List<ApplicationShortResponse> obj = listApplications(request, version, accountId, q, keyword, platforms, deviceIds, deviceVersions, categoryIds, sortField, hasAds, publicNotifications, filterBillable, filterContentAdmin, descending, i, start, l, limit, applicationIds, hasObjectStore, activeOnly);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (ApplicationShortResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<ApplicationShortResponse> listApplications(Http.Request request, BigDecimal version, Long accountId, String q, String keyword, String platforms, String deviceIds, String deviceVersions, String categoryIds, String sortField, Boolean hasAds, Boolean publicNotifications, Boolean filterBillable, Boolean filterContentAdmin, Boolean descending, Integer i, Integer start, Integer l, Integer limit, String applicationIds, Boolean hasObjectStore, Boolean activeOnly) throws Exception;

    public Result searchApplicationPlacementHttp(Http.Request request, BigDecimal version, @NotNull String appKey, String deviceId, Long accountId, Integer start, Integer limit) throws Exception {
        List<PlacementResponse> obj = searchApplicationPlacement(request, version, appKey, deviceId, accountId, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (PlacementResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<PlacementResponse> searchApplicationPlacement(Http.Request request, BigDecimal version, @NotNull String appKey, String deviceId, Long accountId, Integer start, Integer limit) throws Exception;

    public Result searchApplicationSettingsHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long connectionAccountId, String keyword, String sortField, Boolean descending, Integer start, Integer limit) throws Exception {
        ApplicationSettingsResponse obj = searchApplicationSettings(request, version, deviceId, accountId, connectionAccountId, keyword, sortField, descending, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ApplicationSettingsResponse searchApplicationSettings(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long connectionAccountId, String keyword, String sortField, Boolean descending, Integer start, Integer limit) throws Exception;

    public Result searchApplicationsHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude, String q, String keyword, String qSearchFields, String sortField, Boolean descending, Integer i, Integer start, Integer l, Integer limit, Boolean hasAds, Boolean publicNotifications, Boolean activeOnly) throws Exception {
        List<ApplicationResponse> obj = searchApplications(request, version, deviceId, accountId, latitude, longitude, q, keyword, qSearchFields, sortField, descending, i, start, l, limit, hasAds, publicNotifications, activeOnly);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (ApplicationResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<ApplicationResponse> searchApplications(Http.Request request, BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude, String q, String keyword, String qSearchFields, String sortField, Boolean descending, Integer i, Integer start, Integer l, Integer limit, Boolean hasAds, Boolean publicNotifications, Boolean activeOnly) throws Exception;

    public Result updateApplicationHttp(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String appName, String deviceId, Long accountId, String about, String bundleId, Long appIconAssetId, Long appLogoAssetId, String facebookAppId, String facebookAppSecret, String googleApiKey, Boolean updateEULADate, String eulaVersion, String landingPageUrl, Boolean showInActivities, String activityDescription, String inviteWelcomeText, String invitePageUrl, String urlScheme, String platforms, String downloadUrls, String categoryIds, String scoringType, Integer hintCost, Integer maxScore, Float ticketsPerPoint, Boolean hasGameData, Boolean publicNotifications, Boolean useMatchingAlgorithm, Boolean globalTickets, Float buildVersion, Float apiVersion, String placementName, String placementDescription, String placementSize, Integer placementHeight, Integer placementWidth, Integer placementRefreshInterval, Boolean createObjectStore, Boolean publicContentApproval, Boolean productionMode, Integer minimumSessionLength, Integer sessionGapLength, Boolean localAdsEnabled, String sqootApiKey, String trilatProcessingType, Integer maxSampleSize, Double minRSSI, String modules, Integer authorizedCount, String authorizedServers, String defaultTimezone, String smtpPass, String metaData, String placementMetaData, Boolean ipsFloor, Boolean enableAPNSBadge, Boolean includeInReport, Long defaultAppFilterId, Boolean enableWelcomeEmail, String appleAppId, String appleTeamId, String appleAuthKeyId, InputStream appleAuthKey, String appleIssuerId, String appStoreKeyId, InputStream appStoreKey, InputStream googlePrivateKeyFile, String authorizeNetApiKey, String authorizeNetTransactionKey, String emailSender, String smtpUser, String smtpHost, String vatomBusinessId, String vatomRestClientId, String vatomRestSecretKey, String twilioAccountSID, String twilioAuthToken, String twilioSenderPhoneNumber, String openAISecretKey) throws Exception {
        ApplicationResponse obj = updateApplication(request, version, appKey, appName, deviceId, accountId, about, bundleId, appIconAssetId, appLogoAssetId, facebookAppId, facebookAppSecret, googleApiKey, updateEULADate, eulaVersion, landingPageUrl, showInActivities, activityDescription, inviteWelcomeText, invitePageUrl, urlScheme, platforms, downloadUrls, categoryIds, scoringType, hintCost, maxScore, ticketsPerPoint, hasGameData, publicNotifications, useMatchingAlgorithm, globalTickets, buildVersion, apiVersion, placementName, placementDescription, placementSize, placementHeight, placementWidth, placementRefreshInterval, createObjectStore, publicContentApproval, productionMode, minimumSessionLength, sessionGapLength, localAdsEnabled, sqootApiKey, trilatProcessingType, maxSampleSize, minRSSI, modules, authorizedCount, authorizedServers, defaultTimezone, smtpPass, metaData, placementMetaData, ipsFloor, enableAPNSBadge, includeInReport, defaultAppFilterId, enableWelcomeEmail, appleAppId, appleTeamId, appleAuthKeyId, appleAuthKey, appleIssuerId, appStoreKeyId, appStoreKey, googlePrivateKeyFile, authorizeNetApiKey, authorizeNetTransactionKey, emailSender, smtpUser, smtpHost, vatomBusinessId, vatomRestClientId, vatomRestSecretKey, twilioAccountSID, twilioAuthToken, twilioSenderPhoneNumber, openAISecretKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ApplicationResponse updateApplication(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String appName, String deviceId, Long accountId, String about, String bundleId, Long appIconAssetId, Long appLogoAssetId, String facebookAppId, String facebookAppSecret, String googleApiKey, Boolean updateEULADate, String eulaVersion, String landingPageUrl, Boolean showInActivities, String activityDescription, String inviteWelcomeText, String invitePageUrl, String urlScheme, String platforms, String downloadUrls, String categoryIds, String scoringType, Integer hintCost, Integer maxScore, Float ticketsPerPoint, Boolean hasGameData, Boolean publicNotifications, Boolean useMatchingAlgorithm, Boolean globalTickets, Float buildVersion, Float apiVersion, String placementName, String placementDescription, String placementSize, Integer placementHeight, Integer placementWidth, Integer placementRefreshInterval, Boolean createObjectStore, Boolean publicContentApproval, Boolean productionMode, Integer minimumSessionLength, Integer sessionGapLength, Boolean localAdsEnabled, String sqootApiKey, String trilatProcessingType, Integer maxSampleSize, Double minRSSI, String modules, Integer authorizedCount, String authorizedServers, String defaultTimezone, String smtpPass, String metaData, String placementMetaData, Boolean ipsFloor, Boolean enableAPNSBadge, Boolean includeInReport, Long defaultAppFilterId, Boolean enableWelcomeEmail, String appleAppId, String appleTeamId, String appleAuthKeyId, InputStream appleAuthKey, String appleIssuerId, String appStoreKeyId, InputStream appStoreKey, InputStream googlePrivateKeyFile, String authorizeNetApiKey, String authorizeNetTransactionKey, String emailSender, String smtpUser, String smtpHost, String vatomBusinessId, String vatomRestClientId, String vatomRestSecretKey, String twilioAccountSID, String twilioAuthToken, String twilioSenderPhoneNumber, String openAISecretKey) throws Exception;

    public Result updateApplicationActiveHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Boolean active) throws Exception {
        SirqulResponse obj = updateApplicationActive(request, version, accountId, appKey, active);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse updateApplicationActive(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Boolean active) throws Exception;

    public Result updateApplicationPlacementHttp(Http.Request request, BigDecimal version, @NotNull Long placementId, String deviceId, Long accountId, String name, String description, String size, Integer height, Integer width, Integer refreshInterval, Long defaultImageId, Boolean active) throws Exception {
        PlacementResponse obj = updateApplicationPlacement(request, version, placementId, deviceId, accountId, name, description, size, height, width, refreshInterval, defaultImageId, active);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PlacementResponse updateApplicationPlacement(Http.Request request, BigDecimal version, @NotNull Long placementId, String deviceId, Long accountId, String name, String description, String size, Integer height, Integer width, Integer refreshInterval, Long defaultImageId, Boolean active) throws Exception;

    public Result uploadApplicationCertificateHttp(Http.Request request, BigDecimal version, @NotNull String appKey, String deviceId, Long accountId, InputStream certificate) throws Exception {
        SirqulResponse obj = uploadApplicationCertificate(request, version, appKey, deviceId, accountId, certificate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse uploadApplicationCertificate(Http.Request request, BigDecimal version, @NotNull String appKey, String deviceId, Long accountId, InputStream certificate) throws Exception;

}
