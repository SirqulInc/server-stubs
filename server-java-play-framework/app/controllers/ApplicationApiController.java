package controllers;

import apimodels.AccountListResponse;
import apimodels.ApplicationResponse;
import apimodels.ApplicationSettingsResponse;
import apimodels.ApplicationShortResponse;
import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.PlacementResponse;
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
public class ApplicationApiController extends Controller {
    private final ApplicationApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ApplicationApiController(Config configuration, ApplicationApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createApplication(Http.Request request, BigDecimal version) throws Exception {
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
        String valueappName = request.getQueryString("appName");
        String appName;
        if (valueappName != null) {
            appName = valueappName;
        } else {
            throw new IllegalArgumentException("'appName' parameter is required");
        }
        String valueabout = request.getQueryString("about");
        String about;
        if (valueabout != null) {
            about = valueabout;
        } else {
            about = null;
        }
        String valuebundleId = request.getQueryString("bundleId");
        String bundleId;
        if (valuebundleId != null) {
            bundleId = valuebundleId;
        } else {
            bundleId = null;
        }
        String valueappIconAssetId = request.getQueryString("appIconAssetId");
        Long appIconAssetId;
        if (valueappIconAssetId != null) {
            appIconAssetId = Long.parseLong(valueappIconAssetId);
        } else {
            appIconAssetId = null;
        }
        String valueappLogoAssetId = request.getQueryString("appLogoAssetId");
        Long appLogoAssetId;
        if (valueappLogoAssetId != null) {
            appLogoAssetId = Long.parseLong(valueappLogoAssetId);
        } else {
            appLogoAssetId = null;
        }
        String valuefacebookAppId = request.getQueryString("facebookAppId");
        String facebookAppId;
        if (valuefacebookAppId != null) {
            facebookAppId = valuefacebookAppId;
        } else {
            facebookAppId = null;
        }
        String valuefacebookAppSecret = request.getQueryString("facebookAppSecret");
        String facebookAppSecret;
        if (valuefacebookAppSecret != null) {
            facebookAppSecret = valuefacebookAppSecret;
        } else {
            facebookAppSecret = null;
        }
        String valuegoogleApiKey = request.getQueryString("googleApiKey");
        String googleApiKey;
        if (valuegoogleApiKey != null) {
            googleApiKey = valuegoogleApiKey;
        } else {
            googleApiKey = null;
        }
        String valueupdateEULADate = request.getQueryString("updateEULADate");
        Boolean updateEULADate;
        if (valueupdateEULADate != null) {
            updateEULADate = Boolean.valueOf(valueupdateEULADate);
        } else {
            updateEULADate = null;
        }
        String valueeulaVersion = request.getQueryString("eulaVersion");
        String eulaVersion;
        if (valueeulaVersion != null) {
            eulaVersion = valueeulaVersion;
        } else {
            eulaVersion = null;
        }
        String valuelandingPageUrl = request.getQueryString("landingPageUrl");
        String landingPageUrl;
        if (valuelandingPageUrl != null) {
            landingPageUrl = valuelandingPageUrl;
        } else {
            landingPageUrl = null;
        }
        String valueshowInActivities = request.getQueryString("showInActivities");
        Boolean showInActivities;
        if (valueshowInActivities != null) {
            showInActivities = Boolean.valueOf(valueshowInActivities);
        } else {
            showInActivities = null;
        }
        String valueactivityDescription = request.getQueryString("activityDescription");
        String activityDescription;
        if (valueactivityDescription != null) {
            activityDescription = valueactivityDescription;
        } else {
            activityDescription = null;
        }
        String valueinviteWelcomeText = request.getQueryString("inviteWelcomeText");
        String inviteWelcomeText;
        if (valueinviteWelcomeText != null) {
            inviteWelcomeText = valueinviteWelcomeText;
        } else {
            inviteWelcomeText = null;
        }
        String valueinvitePageUrl = request.getQueryString("invitePageUrl");
        String invitePageUrl;
        if (valueinvitePageUrl != null) {
            invitePageUrl = valueinvitePageUrl;
        } else {
            invitePageUrl = null;
        }
        String valueurlScheme = request.getQueryString("urlScheme");
        String urlScheme;
        if (valueurlScheme != null) {
            urlScheme = valueurlScheme;
        } else {
            urlScheme = null;
        }
        String valueplatforms = request.getQueryString("platforms");
        String platforms;
        if (valueplatforms != null) {
            platforms = valueplatforms;
        } else {
            platforms = null;
        }
        String valuedownloadUrls = request.getQueryString("downloadUrls");
        String downloadUrls;
        if (valuedownloadUrls != null) {
            downloadUrls = valuedownloadUrls;
        } else {
            downloadUrls = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valuescoringType = request.getQueryString("scoringType");
        String scoringType;
        if (valuescoringType != null) {
            scoringType = valuescoringType;
        } else {
            scoringType = "GAME_LEVEL";
        }
        String valuehintCost = request.getQueryString("hintCost");
        Integer hintCost;
        if (valuehintCost != null) {
            hintCost = Integer.parseInt(valuehintCost);
        } else {
            hintCost = 11;
        }
        String valuemaxScore = request.getQueryString("maxScore");
        Integer maxScore;
        if (valuemaxScore != null) {
            maxScore = Integer.parseInt(valuemaxScore);
        } else {
            maxScore = 125;
        }
        String valueticketsPerPoint = request.getQueryString("ticketsPerPoint");
        Float ticketsPerPoint;
        if (valueticketsPerPoint != null) {
            ticketsPerPoint = Float.parseFloat(valueticketsPerPoint);
        } else {
            ticketsPerPoint = 0.037;
        }
        String valuehasGameData = request.getQueryString("hasGameData");
        Boolean hasGameData;
        if (valuehasGameData != null) {
            hasGameData = Boolean.valueOf(valuehasGameData);
        } else {
            hasGameData = true;
        }
        String valuepublicNotifications = request.getQueryString("publicNotifications");
        Boolean publicNotifications;
        if (valuepublicNotifications != null) {
            publicNotifications = Boolean.valueOf(valuepublicNotifications);
        } else {
            publicNotifications = null;
        }
        String valueuseMatchingAlgorithm = request.getQueryString("useMatchingAlgorithm");
        Boolean useMatchingAlgorithm;
        if (valueuseMatchingAlgorithm != null) {
            useMatchingAlgorithm = Boolean.valueOf(valueuseMatchingAlgorithm);
        } else {
            useMatchingAlgorithm = null;
        }
        String valueglobalTickets = request.getQueryString("globalTickets");
        Boolean globalTickets;
        if (valueglobalTickets != null) {
            globalTickets = Boolean.valueOf(valueglobalTickets);
        } else {
            globalTickets = false;
        }
        String valuebuildVersion = request.getQueryString("buildVersion");
        Float buildVersion;
        if (valuebuildVersion != null) {
            buildVersion = Float.parseFloat(valuebuildVersion);
        } else {
            buildVersion = 1;
        }
        String valueapiVersion = request.getQueryString("apiVersion");
        Float apiVersion;
        if (valueapiVersion != null) {
            apiVersion = Float.parseFloat(valueapiVersion);
        } else {
            apiVersion = null;
        }
        String valueplacementName = request.getQueryString("placementName");
        String placementName;
        if (valueplacementName != null) {
            placementName = valueplacementName;
        } else {
            placementName = null;
        }
        String valueplacementDescription = request.getQueryString("placementDescription");
        String placementDescription;
        if (valueplacementDescription != null) {
            placementDescription = valueplacementDescription;
        } else {
            placementDescription = null;
        }
        String valueplacementSize = request.getQueryString("placementSize");
        String placementSize;
        if (valueplacementSize != null) {
            placementSize = valueplacementSize;
        } else {
            placementSize = null;
        }
        String valueplacementHeight = request.getQueryString("placementHeight");
        Integer placementHeight;
        if (valueplacementHeight != null) {
            placementHeight = Integer.parseInt(valueplacementHeight);
        } else {
            placementHeight = null;
        }
        String valueplacementWidth = request.getQueryString("placementWidth");
        Integer placementWidth;
        if (valueplacementWidth != null) {
            placementWidth = Integer.parseInt(valueplacementWidth);
        } else {
            placementWidth = null;
        }
        String valueplacementRefreshInterval = request.getQueryString("placementRefreshInterval");
        Integer placementRefreshInterval;
        if (valueplacementRefreshInterval != null) {
            placementRefreshInterval = Integer.parseInt(valueplacementRefreshInterval);
        } else {
            placementRefreshInterval = null;
        }
        String valuecreateObjectStore = request.getQueryString("createObjectStore");
        Boolean createObjectStore;
        if (valuecreateObjectStore != null) {
            createObjectStore = Boolean.valueOf(valuecreateObjectStore);
        } else {
            createObjectStore = true;
        }
        String valuepublicContentApproval = request.getQueryString("publicContentApproval");
        Boolean publicContentApproval;
        if (valuepublicContentApproval != null) {
            publicContentApproval = Boolean.valueOf(valuepublicContentApproval);
        } else {
            publicContentApproval = false;
        }
        String valueproductionMode = request.getQueryString("productionMode");
        Boolean productionMode;
        if (valueproductionMode != null) {
            productionMode = Boolean.valueOf(valueproductionMode);
        } else {
            productionMode = false;
        }
        String valueminimumSessionLength = request.getQueryString("minimumSessionLength");
        Integer minimumSessionLength;
        if (valueminimumSessionLength != null) {
            minimumSessionLength = Integer.parseInt(valueminimumSessionLength);
        } else {
            minimumSessionLength = null;
        }
        String valuesessionGapLength = request.getQueryString("sessionGapLength");
        Integer sessionGapLength;
        if (valuesessionGapLength != null) {
            sessionGapLength = Integer.parseInt(valuesessionGapLength);
        } else {
            sessionGapLength = null;
        }
        String valuelocalAdsEnabled = request.getQueryString("localAdsEnabled");
        Boolean localAdsEnabled;
        if (valuelocalAdsEnabled != null) {
            localAdsEnabled = Boolean.valueOf(valuelocalAdsEnabled);
        } else {
            localAdsEnabled = false;
        }
        String valuesqootApiKey = request.getQueryString("sqootApiKey");
        String sqootApiKey;
        if (valuesqootApiKey != null) {
            sqootApiKey = valuesqootApiKey;
        } else {
            sqootApiKey = null;
        }
        String valuetrilatProcessingType = request.getQueryString("trilatProcessingType");
        String trilatProcessingType;
        if (valuetrilatProcessingType != null) {
            trilatProcessingType = valuetrilatProcessingType;
        } else {
            trilatProcessingType = "FINGERPRINT";
        }
        String valuemaxSampleSize = request.getQueryString("maxSampleSize");
        Integer maxSampleSize;
        if (valuemaxSampleSize != null) {
            maxSampleSize = Integer.parseInt(valuemaxSampleSize);
        } else {
            maxSampleSize = null;
        }
        String valueminRSSI = request.getQueryString("minRSSI");
        Double minRSSI;
        if (valueminRSSI != null) {
            minRSSI = Double.parseDouble(valueminRSSI);
        } else {
            minRSSI = null;
        }
        String valuemodules = request.getQueryString("modules");
        String modules;
        if (valuemodules != null) {
            modules = valuemodules;
        } else {
            modules = "ALL";
        }
        String valueauthorizedCount = request.getQueryString("authorizedCount");
        Integer authorizedCount;
        if (valueauthorizedCount != null) {
            authorizedCount = Integer.parseInt(valueauthorizedCount);
        } else {
            authorizedCount = 1;
        }
        String valueauthorizedServers = request.getQueryString("authorizedServers");
        String authorizedServers;
        if (valueauthorizedServers != null) {
            authorizedServers = valueauthorizedServers;
        } else {
            authorizedServers = null;
        }
        String valuedefaultTimezone = request.getQueryString("defaultTimezone");
        String defaultTimezone;
        if (valuedefaultTimezone != null) {
            defaultTimezone = valuedefaultTimezone;
        } else {
            defaultTimezone = null;
        }
        String valuesmtpPass = request.getQueryString("smtpPass");
        String smtpPass;
        if (valuesmtpPass != null) {
            smtpPass = valuesmtpPass;
        } else {
            smtpPass = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valueplacementMetaData = request.getQueryString("placementMetaData");
        String placementMetaData;
        if (valueplacementMetaData != null) {
            placementMetaData = valueplacementMetaData;
        } else {
            placementMetaData = null;
        }
        String valueipsFloor = request.getQueryString("ipsFloor");
        Boolean ipsFloor;
        if (valueipsFloor != null) {
            ipsFloor = Boolean.valueOf(valueipsFloor);
        } else {
            ipsFloor = false;
        }
        String valueenableAPNSBadge = request.getQueryString("enableAPNSBadge");
        Boolean enableAPNSBadge;
        if (valueenableAPNSBadge != null) {
            enableAPNSBadge = Boolean.valueOf(valueenableAPNSBadge);
        } else {
            enableAPNSBadge = true;
        }
        String valueincludeInReport = request.getQueryString("includeInReport");
        Boolean includeInReport;
        if (valueincludeInReport != null) {
            includeInReport = Boolean.valueOf(valueincludeInReport);
        } else {
            includeInReport = true;
        }
        String valuedefaultAppFilterId = request.getQueryString("defaultAppFilterId");
        Long defaultAppFilterId;
        if (valuedefaultAppFilterId != null) {
            defaultAppFilterId = Long.parseLong(valuedefaultAppFilterId);
        } else {
            defaultAppFilterId = null;
        }
        String valueenableWelcomeEmail = request.getQueryString("enableWelcomeEmail");
        Boolean enableWelcomeEmail;
        if (valueenableWelcomeEmail != null) {
            enableWelcomeEmail = Boolean.valueOf(valueenableWelcomeEmail);
        } else {
            enableWelcomeEmail = null;
        }
        String valueappleAppId = request.getQueryString("appleAppId");
        String appleAppId;
        if (valueappleAppId != null) {
            appleAppId = valueappleAppId;
        } else {
            appleAppId = null;
        }
        String valueappleTeamId = request.getQueryString("appleTeamId");
        String appleTeamId;
        if (valueappleTeamId != null) {
            appleTeamId = valueappleTeamId;
        } else {
            appleTeamId = null;
        }
        String valueappleAuthKeyId = request.getQueryString("appleAuthKeyId");
        String appleAuthKeyId;
        if (valueappleAuthKeyId != null) {
            appleAuthKeyId = valueappleAuthKeyId;
        } else {
            appleAuthKeyId = null;
        }
        String valueappleAuthKey = request.getQueryString("appleAuthKey");
        InputStream appleAuthKey;
        if (valueappleAuthKey != null) {
            appleAuthKey = valueappleAuthKey;
        } else {
            appleAuthKey = null;
        }
        String valueappleIssuerId = request.getQueryString("appleIssuerId");
        String appleIssuerId;
        if (valueappleIssuerId != null) {
            appleIssuerId = valueappleIssuerId;
        } else {
            appleIssuerId = null;
        }
        String valueappStoreKeyId = request.getQueryString("appStoreKeyId");
        String appStoreKeyId;
        if (valueappStoreKeyId != null) {
            appStoreKeyId = valueappStoreKeyId;
        } else {
            appStoreKeyId = null;
        }
        String valueappStoreKey = request.getQueryString("appStoreKey");
        InputStream appStoreKey;
        if (valueappStoreKey != null) {
            appStoreKey = valueappStoreKey;
        } else {
            appStoreKey = null;
        }
        String valuegooglePrivateKeyFile = request.getQueryString("googlePrivateKeyFile");
        InputStream googlePrivateKeyFile;
        if (valuegooglePrivateKeyFile != null) {
            googlePrivateKeyFile = valuegooglePrivateKeyFile;
        } else {
            googlePrivateKeyFile = null;
        }
        String valueauthorizeNetApiKey = request.getQueryString("authorizeNetApiKey");
        String authorizeNetApiKey;
        if (valueauthorizeNetApiKey != null) {
            authorizeNetApiKey = valueauthorizeNetApiKey;
        } else {
            authorizeNetApiKey = null;
        }
        String valueauthorizeNetTransactionKey = request.getQueryString("authorizeNetTransactionKey");
        String authorizeNetTransactionKey;
        if (valueauthorizeNetTransactionKey != null) {
            authorizeNetTransactionKey = valueauthorizeNetTransactionKey;
        } else {
            authorizeNetTransactionKey = null;
        }
        String valueemailSender = request.getQueryString("emailSender");
        String emailSender;
        if (valueemailSender != null) {
            emailSender = valueemailSender;
        } else {
            emailSender = null;
        }
        String valuesmtpUser = request.getQueryString("smtpUser");
        String smtpUser;
        if (valuesmtpUser != null) {
            smtpUser = valuesmtpUser;
        } else {
            smtpUser = null;
        }
        String valuesmtpHost = request.getQueryString("smtpHost");
        String smtpHost;
        if (valuesmtpHost != null) {
            smtpHost = valuesmtpHost;
        } else {
            smtpHost = null;
        }
        String valuevatomBusinessId = request.getQueryString("vatomBusinessId");
        String vatomBusinessId;
        if (valuevatomBusinessId != null) {
            vatomBusinessId = valuevatomBusinessId;
        } else {
            vatomBusinessId = null;
        }
        String valuevatomRestClientId = request.getQueryString("vatomRestClientId");
        String vatomRestClientId;
        if (valuevatomRestClientId != null) {
            vatomRestClientId = valuevatomRestClientId;
        } else {
            vatomRestClientId = null;
        }
        String valuevatomRestSecretKey = request.getQueryString("vatomRestSecretKey");
        String vatomRestSecretKey;
        if (valuevatomRestSecretKey != null) {
            vatomRestSecretKey = valuevatomRestSecretKey;
        } else {
            vatomRestSecretKey = null;
        }
        String valuetwilioAccountSID = request.getQueryString("twilioAccountSID");
        String twilioAccountSID;
        if (valuetwilioAccountSID != null) {
            twilioAccountSID = valuetwilioAccountSID;
        } else {
            twilioAccountSID = null;
        }
        String valuetwilioAuthToken = request.getQueryString("twilioAuthToken");
        String twilioAuthToken;
        if (valuetwilioAuthToken != null) {
            twilioAuthToken = valuetwilioAuthToken;
        } else {
            twilioAuthToken = null;
        }
        String valuetwilioSenderPhoneNumber = request.getQueryString("twilioSenderPhoneNumber");
        String twilioSenderPhoneNumber;
        if (valuetwilioSenderPhoneNumber != null) {
            twilioSenderPhoneNumber = valuetwilioSenderPhoneNumber;
        } else {
            twilioSenderPhoneNumber = null;
        }
        String valueopenAISecretKey = request.getQueryString("openAISecretKey");
        String openAISecretKey;
        if (valueopenAISecretKey != null) {
            openAISecretKey = valueopenAISecretKey;
        } else {
            openAISecretKey = null;
        }
        return imp.createApplicationHttp(request, version, appName, deviceId, accountId, about, bundleId, appIconAssetId, appLogoAssetId, facebookAppId, facebookAppSecret, googleApiKey, updateEULADate, eulaVersion, landingPageUrl, showInActivities, activityDescription, inviteWelcomeText, invitePageUrl, urlScheme, platforms, downloadUrls, categoryIds, scoringType, hintCost, maxScore, ticketsPerPoint, hasGameData, publicNotifications, useMatchingAlgorithm, globalTickets, buildVersion, apiVersion, placementName, placementDescription, placementSize, placementHeight, placementWidth, placementRefreshInterval, createObjectStore, publicContentApproval, productionMode, minimumSessionLength, sessionGapLength, localAdsEnabled, sqootApiKey, trilatProcessingType, maxSampleSize, minRSSI, modules, authorizedCount, authorizedServers, defaultTimezone, smtpPass, metaData, placementMetaData, ipsFloor, enableAPNSBadge, includeInReport, defaultAppFilterId, enableWelcomeEmail, appleAppId, appleTeamId, appleAuthKeyId, appleAuthKey, appleIssuerId, appStoreKeyId, appStoreKey, googlePrivateKeyFile, authorizeNetApiKey, authorizeNetTransactionKey, emailSender, smtpUser, smtpHost, vatomBusinessId, vatomRestClientId, vatomRestSecretKey, twilioAccountSID, twilioAuthToken, twilioSenderPhoneNumber, openAISecretKey);
    }

    @ApiAction
    public Result createApplicationPlacement(Http.Request request, BigDecimal version) throws Exception {
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
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
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
        String valuesize = request.getQueryString("size");
        String size;
        if (valuesize != null) {
            size = valuesize;
        } else {
            throw new IllegalArgumentException("'size' parameter is required");
        }
        String valueheight = request.getQueryString("height");
        Integer height;
        if (valueheight != null) {
            height = Integer.parseInt(valueheight);
        } else {
            height = null;
        }
        String valuewidth = request.getQueryString("width");
        Integer width;
        if (valuewidth != null) {
            width = Integer.parseInt(valuewidth);
        } else {
            width = null;
        }
        String valuerefreshInterval = request.getQueryString("refreshInterval");
        Integer refreshInterval;
        if (valuerefreshInterval != null) {
            refreshInterval = Integer.parseInt(valuerefreshInterval);
        } else {
            refreshInterval = null;
        }
        String valuedefaultImageId = request.getQueryString("defaultImageId");
        Long defaultImageId;
        if (valuedefaultImageId != null) {
            defaultImageId = Long.parseLong(valuedefaultImageId);
        } else {
            defaultImageId = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        return imp.createApplicationPlacementHttp(request, version, appKey, size, deviceId, accountId, name, description, height, width, refreshInterval, defaultImageId, active);
    }

    @ApiAction
    public Result deleteApplication(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        return imp.deleteApplicationHttp(request, version, accountId, appKey);
    }

    @ApiAction
    public Result deleteApplicationPlacement(Http.Request request, BigDecimal version) throws Exception {
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
        String valueplacementId = request.getQueryString("placementId");
        Long placementId;
        if (valueplacementId != null) {
            placementId = Long.parseLong(valueplacementId);
        } else {
            throw new IllegalArgumentException("'placementId' parameter is required");
        }
        return imp.deleteApplicationPlacementHttp(request, version, placementId, deviceId, accountId);
    }

    @ApiAction
    public Result getApplication(Http.Request request, BigDecimal version) throws Exception {
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueapplicationId = request.getQueryString("applicationId");
        Long applicationId;
        if (valueapplicationId != null) {
            applicationId = Long.parseLong(valueapplicationId);
        } else {
            applicationId = null;
        }
        return imp.getApplicationHttp(request, version, appKey, applicationId);
    }

    @ApiAction
    public Result getApplicationPlacement(Http.Request request, BigDecimal version) throws Exception {
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
        String valueplacementId = request.getQueryString("placementId");
        Long placementId;
        if (valueplacementId != null) {
            placementId = Long.parseLong(valueplacementId);
        } else {
            throw new IllegalArgumentException("'placementId' parameter is required");
        }
        return imp.getApplicationPlacementHttp(request, version, placementId, deviceId, accountId);
    }

    @ApiAction
    public Result getApplicationVersions(Http.Request request, BigDecimal version) throws Exception {
        return imp.getApplicationVersionsHttp(request, version);
    }

    @ApiAction
    public Result getUniqueUsersByApp(Http.Request request, BigDecimal version) throws Exception {
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuesince = request.getQueryString("since");
        Long since;
        if (valuesince != null) {
            since = Long.parseLong(valuesince);
        } else {
            since = null;
        }
        String valuei = request.getQueryString("_i");
        Integer i;
        if (valuei != null) {
            i = Integer.parseInt(valuei);
        } else {
            i = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuel = request.getQueryString("_l");
        Integer l;
        if (valuel != null) {
            l = Integer.parseInt(valuel);
        } else {
            l = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        return imp.getUniqueUsersByAppHttp(request, version, appKey, q, keyword, since, i, start, l, limit);
    }

    @ApiAction
    public Result listApplications(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valueplatforms = request.getQueryString("platforms");
        String platforms;
        if (valueplatforms != null) {
            platforms = valueplatforms;
        } else {
            platforms = null;
        }
        String valuedeviceIds = request.getQueryString("deviceIds");
        String deviceIds;
        if (valuedeviceIds != null) {
            deviceIds = valuedeviceIds;
        } else {
            deviceIds = null;
        }
        String valuedeviceVersions = request.getQueryString("deviceVersions");
        String deviceVersions;
        if (valuedeviceVersions != null) {
            deviceVersions = valuedeviceVersions;
        } else {
            deviceVersions = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = "UPDATED";
        }
        String valuehasAds = request.getQueryString("hasAds");
        Boolean hasAds;
        if (valuehasAds != null) {
            hasAds = Boolean.valueOf(valuehasAds);
        } else {
            hasAds = null;
        }
        String valuepublicNotifications = request.getQueryString("publicNotifications");
        Boolean publicNotifications;
        if (valuepublicNotifications != null) {
            publicNotifications = Boolean.valueOf(valuepublicNotifications);
        } else {
            publicNotifications = null;
        }
        String valuefilterBillable = request.getQueryString("filterBillable");
        Boolean filterBillable;
        if (valuefilterBillable != null) {
            filterBillable = Boolean.valueOf(valuefilterBillable);
        } else {
            filterBillable = null;
        }
        String valuefilterContentAdmin = request.getQueryString("filterContentAdmin");
        Boolean filterContentAdmin;
        if (valuefilterContentAdmin != null) {
            filterContentAdmin = Boolean.valueOf(valuefilterContentAdmin);
        } else {
            filterContentAdmin = null;
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = true;
        }
        String valuei = request.getQueryString("_i");
        Integer i;
        if (valuei != null) {
            i = Integer.parseInt(valuei);
        } else {
            i = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuel = request.getQueryString("_l");
        Integer l;
        if (valuel != null) {
            l = Integer.parseInt(valuel);
        } else {
            l = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        String valueapplicationIds = request.getQueryString("applicationIds");
        String applicationIds;
        if (valueapplicationIds != null) {
            applicationIds = valueapplicationIds;
        } else {
            applicationIds = null;
        }
        String valuehasObjectStore = request.getQueryString("hasObjectStore");
        Boolean hasObjectStore;
        if (valuehasObjectStore != null) {
            hasObjectStore = Boolean.valueOf(valuehasObjectStore);
        } else {
            hasObjectStore = false;
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            activeOnly = true;
        }
        return imp.listApplicationsHttp(request, version, accountId, q, keyword, platforms, deviceIds, deviceVersions, categoryIds, sortField, hasAds, publicNotifications, filterBillable, filterContentAdmin, descending, i, start, l, limit, applicationIds, hasObjectStore, activeOnly);
    }

    @ApiAction
    public Result searchApplicationPlacement(Http.Request request, BigDecimal version) throws Exception {
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
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
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
            limit = 100;
        }
        return imp.searchApplicationPlacementHttp(request, version, appKey, deviceId, accountId, start, limit);
    }

    @ApiAction
    public Result searchApplicationSettings(Http.Request request, BigDecimal version) throws Exception {
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
        String valueconnectionAccountId = request.getQueryString("connectionAccountId");
        Long connectionAccountId;
        if (valueconnectionAccountId != null) {
            connectionAccountId = Long.parseLong(valueconnectionAccountId);
        } else {
            connectionAccountId = null;
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
            sortField = "APPLICATION_TITLE";
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = false;
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
        return imp.searchApplicationSettingsHttp(request, version, deviceId, accountId, connectionAccountId, keyword, sortField, descending, start, limit);
    }

    @ApiAction
    public Result searchApplications(Http.Request request, BigDecimal version) throws Exception {
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
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valueqSearchFields = request.getQueryString("qSearchFields");
        String qSearchFields;
        if (valueqSearchFields != null) {
            qSearchFields = valueqSearchFields;
        } else {
            qSearchFields = "NAME,ABOUT,BILLABLE_ENTITY_NAME";
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = "APPLICATION_ID";
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = false;
        }
        String valuei = request.getQueryString("_i");
        Integer i;
        if (valuei != null) {
            i = Integer.parseInt(valuei);
        } else {
            i = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuel = request.getQueryString("_l");
        Integer l;
        if (valuel != null) {
            l = Integer.parseInt(valuel);
        } else {
            l = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 100;
        }
        String valuehasAds = request.getQueryString("hasAds");
        Boolean hasAds;
        if (valuehasAds != null) {
            hasAds = Boolean.valueOf(valuehasAds);
        } else {
            hasAds = null;
        }
        String valuepublicNotifications = request.getQueryString("publicNotifications");
        Boolean publicNotifications;
        if (valuepublicNotifications != null) {
            publicNotifications = Boolean.valueOf(valuepublicNotifications);
        } else {
            publicNotifications = null;
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            activeOnly = false;
        }
        return imp.searchApplicationsHttp(request, version, deviceId, accountId, latitude, longitude, q, keyword, qSearchFields, sortField, descending, i, start, l, limit, hasAds, publicNotifications, activeOnly);
    }

    @ApiAction
    public Result updateApplication(Http.Request request, BigDecimal version) throws Exception {
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
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valueappName = request.getQueryString("appName");
        String appName;
        if (valueappName != null) {
            appName = valueappName;
        } else {
            throw new IllegalArgumentException("'appName' parameter is required");
        }
        String valueabout = request.getQueryString("about");
        String about;
        if (valueabout != null) {
            about = valueabout;
        } else {
            about = null;
        }
        String valuebundleId = request.getQueryString("bundleId");
        String bundleId;
        if (valuebundleId != null) {
            bundleId = valuebundleId;
        } else {
            bundleId = null;
        }
        String valueappIconAssetId = request.getQueryString("appIconAssetId");
        Long appIconAssetId;
        if (valueappIconAssetId != null) {
            appIconAssetId = Long.parseLong(valueappIconAssetId);
        } else {
            appIconAssetId = null;
        }
        String valueappLogoAssetId = request.getQueryString("appLogoAssetId");
        Long appLogoAssetId;
        if (valueappLogoAssetId != null) {
            appLogoAssetId = Long.parseLong(valueappLogoAssetId);
        } else {
            appLogoAssetId = null;
        }
        String valuefacebookAppId = request.getQueryString("facebookAppId");
        String facebookAppId;
        if (valuefacebookAppId != null) {
            facebookAppId = valuefacebookAppId;
        } else {
            facebookAppId = null;
        }
        String valuefacebookAppSecret = request.getQueryString("facebookAppSecret");
        String facebookAppSecret;
        if (valuefacebookAppSecret != null) {
            facebookAppSecret = valuefacebookAppSecret;
        } else {
            facebookAppSecret = null;
        }
        String valuegoogleApiKey = request.getQueryString("googleApiKey");
        String googleApiKey;
        if (valuegoogleApiKey != null) {
            googleApiKey = valuegoogleApiKey;
        } else {
            googleApiKey = null;
        }
        String valueupdateEULADate = request.getQueryString("updateEULADate");
        Boolean updateEULADate;
        if (valueupdateEULADate != null) {
            updateEULADate = Boolean.valueOf(valueupdateEULADate);
        } else {
            updateEULADate = null;
        }
        String valueeulaVersion = request.getQueryString("eulaVersion");
        String eulaVersion;
        if (valueeulaVersion != null) {
            eulaVersion = valueeulaVersion;
        } else {
            eulaVersion = null;
        }
        String valuelandingPageUrl = request.getQueryString("landingPageUrl");
        String landingPageUrl;
        if (valuelandingPageUrl != null) {
            landingPageUrl = valuelandingPageUrl;
        } else {
            landingPageUrl = null;
        }
        String valueshowInActivities = request.getQueryString("showInActivities");
        Boolean showInActivities;
        if (valueshowInActivities != null) {
            showInActivities = Boolean.valueOf(valueshowInActivities);
        } else {
            showInActivities = null;
        }
        String valueactivityDescription = request.getQueryString("activityDescription");
        String activityDescription;
        if (valueactivityDescription != null) {
            activityDescription = valueactivityDescription;
        } else {
            activityDescription = null;
        }
        String valueinviteWelcomeText = request.getQueryString("inviteWelcomeText");
        String inviteWelcomeText;
        if (valueinviteWelcomeText != null) {
            inviteWelcomeText = valueinviteWelcomeText;
        } else {
            inviteWelcomeText = null;
        }
        String valueinvitePageUrl = request.getQueryString("invitePageUrl");
        String invitePageUrl;
        if (valueinvitePageUrl != null) {
            invitePageUrl = valueinvitePageUrl;
        } else {
            invitePageUrl = null;
        }
        String valueurlScheme = request.getQueryString("urlScheme");
        String urlScheme;
        if (valueurlScheme != null) {
            urlScheme = valueurlScheme;
        } else {
            urlScheme = null;
        }
        String valueplatforms = request.getQueryString("platforms");
        String platforms;
        if (valueplatforms != null) {
            platforms = valueplatforms;
        } else {
            platforms = null;
        }
        String valuedownloadUrls = request.getQueryString("downloadUrls");
        String downloadUrls;
        if (valuedownloadUrls != null) {
            downloadUrls = valuedownloadUrls;
        } else {
            downloadUrls = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valuescoringType = request.getQueryString("scoringType");
        String scoringType;
        if (valuescoringType != null) {
            scoringType = valuescoringType;
        } else {
            scoringType = "GAME_LEVEL";
        }
        String valuehintCost = request.getQueryString("hintCost");
        Integer hintCost;
        if (valuehintCost != null) {
            hintCost = Integer.parseInt(valuehintCost);
        } else {
            hintCost = 11;
        }
        String valuemaxScore = request.getQueryString("maxScore");
        Integer maxScore;
        if (valuemaxScore != null) {
            maxScore = Integer.parseInt(valuemaxScore);
        } else {
            maxScore = 125;
        }
        String valueticketsPerPoint = request.getQueryString("ticketsPerPoint");
        Float ticketsPerPoint;
        if (valueticketsPerPoint != null) {
            ticketsPerPoint = Float.parseFloat(valueticketsPerPoint);
        } else {
            ticketsPerPoint = 0.037;
        }
        String valuehasGameData = request.getQueryString("hasGameData");
        Boolean hasGameData;
        if (valuehasGameData != null) {
            hasGameData = Boolean.valueOf(valuehasGameData);
        } else {
            hasGameData = true;
        }
        String valuepublicNotifications = request.getQueryString("publicNotifications");
        Boolean publicNotifications;
        if (valuepublicNotifications != null) {
            publicNotifications = Boolean.valueOf(valuepublicNotifications);
        } else {
            publicNotifications = null;
        }
        String valueuseMatchingAlgorithm = request.getQueryString("useMatchingAlgorithm");
        Boolean useMatchingAlgorithm;
        if (valueuseMatchingAlgorithm != null) {
            useMatchingAlgorithm = Boolean.valueOf(valueuseMatchingAlgorithm);
        } else {
            useMatchingAlgorithm = null;
        }
        String valueglobalTickets = request.getQueryString("globalTickets");
        Boolean globalTickets;
        if (valueglobalTickets != null) {
            globalTickets = Boolean.valueOf(valueglobalTickets);
        } else {
            globalTickets = false;
        }
        String valuebuildVersion = request.getQueryString("buildVersion");
        Float buildVersion;
        if (valuebuildVersion != null) {
            buildVersion = Float.parseFloat(valuebuildVersion);
        } else {
            buildVersion = 1;
        }
        String valueapiVersion = request.getQueryString("apiVersion");
        Float apiVersion;
        if (valueapiVersion != null) {
            apiVersion = Float.parseFloat(valueapiVersion);
        } else {
            apiVersion = null;
        }
        String valueplacementName = request.getQueryString("placementName");
        String placementName;
        if (valueplacementName != null) {
            placementName = valueplacementName;
        } else {
            placementName = null;
        }
        String valueplacementDescription = request.getQueryString("placementDescription");
        String placementDescription;
        if (valueplacementDescription != null) {
            placementDescription = valueplacementDescription;
        } else {
            placementDescription = null;
        }
        String valueplacementSize = request.getQueryString("placementSize");
        String placementSize;
        if (valueplacementSize != null) {
            placementSize = valueplacementSize;
        } else {
            placementSize = null;
        }
        String valueplacementHeight = request.getQueryString("placementHeight");
        Integer placementHeight;
        if (valueplacementHeight != null) {
            placementHeight = Integer.parseInt(valueplacementHeight);
        } else {
            placementHeight = null;
        }
        String valueplacementWidth = request.getQueryString("placementWidth");
        Integer placementWidth;
        if (valueplacementWidth != null) {
            placementWidth = Integer.parseInt(valueplacementWidth);
        } else {
            placementWidth = null;
        }
        String valueplacementRefreshInterval = request.getQueryString("placementRefreshInterval");
        Integer placementRefreshInterval;
        if (valueplacementRefreshInterval != null) {
            placementRefreshInterval = Integer.parseInt(valueplacementRefreshInterval);
        } else {
            placementRefreshInterval = null;
        }
        String valuecreateObjectStore = request.getQueryString("createObjectStore");
        Boolean createObjectStore;
        if (valuecreateObjectStore != null) {
            createObjectStore = Boolean.valueOf(valuecreateObjectStore);
        } else {
            createObjectStore = true;
        }
        String valuepublicContentApproval = request.getQueryString("publicContentApproval");
        Boolean publicContentApproval;
        if (valuepublicContentApproval != null) {
            publicContentApproval = Boolean.valueOf(valuepublicContentApproval);
        } else {
            publicContentApproval = false;
        }
        String valueproductionMode = request.getQueryString("productionMode");
        Boolean productionMode;
        if (valueproductionMode != null) {
            productionMode = Boolean.valueOf(valueproductionMode);
        } else {
            productionMode = false;
        }
        String valueminimumSessionLength = request.getQueryString("minimumSessionLength");
        Integer minimumSessionLength;
        if (valueminimumSessionLength != null) {
            minimumSessionLength = Integer.parseInt(valueminimumSessionLength);
        } else {
            minimumSessionLength = null;
        }
        String valuesessionGapLength = request.getQueryString("sessionGapLength");
        Integer sessionGapLength;
        if (valuesessionGapLength != null) {
            sessionGapLength = Integer.parseInt(valuesessionGapLength);
        } else {
            sessionGapLength = null;
        }
        String valuelocalAdsEnabled = request.getQueryString("localAdsEnabled");
        Boolean localAdsEnabled;
        if (valuelocalAdsEnabled != null) {
            localAdsEnabled = Boolean.valueOf(valuelocalAdsEnabled);
        } else {
            localAdsEnabled = false;
        }
        String valuesqootApiKey = request.getQueryString("sqootApiKey");
        String sqootApiKey;
        if (valuesqootApiKey != null) {
            sqootApiKey = valuesqootApiKey;
        } else {
            sqootApiKey = null;
        }
        String valuetrilatProcessingType = request.getQueryString("trilatProcessingType");
        String trilatProcessingType;
        if (valuetrilatProcessingType != null) {
            trilatProcessingType = valuetrilatProcessingType;
        } else {
            trilatProcessingType = "FINGERPRINT";
        }
        String valuemaxSampleSize = request.getQueryString("maxSampleSize");
        Integer maxSampleSize;
        if (valuemaxSampleSize != null) {
            maxSampleSize = Integer.parseInt(valuemaxSampleSize);
        } else {
            maxSampleSize = null;
        }
        String valueminRSSI = request.getQueryString("minRSSI");
        Double minRSSI;
        if (valueminRSSI != null) {
            minRSSI = Double.parseDouble(valueminRSSI);
        } else {
            minRSSI = null;
        }
        String valuemodules = request.getQueryString("modules");
        String modules;
        if (valuemodules != null) {
            modules = valuemodules;
        } else {
            modules = "ALL";
        }
        String valueauthorizedCount = request.getQueryString("authorizedCount");
        Integer authorizedCount;
        if (valueauthorizedCount != null) {
            authorizedCount = Integer.parseInt(valueauthorizedCount);
        } else {
            authorizedCount = 1;
        }
        String valueauthorizedServers = request.getQueryString("authorizedServers");
        String authorizedServers;
        if (valueauthorizedServers != null) {
            authorizedServers = valueauthorizedServers;
        } else {
            authorizedServers = null;
        }
        String valuedefaultTimezone = request.getQueryString("defaultTimezone");
        String defaultTimezone;
        if (valuedefaultTimezone != null) {
            defaultTimezone = valuedefaultTimezone;
        } else {
            defaultTimezone = null;
        }
        String valuesmtpPass = request.getQueryString("smtpPass");
        String smtpPass;
        if (valuesmtpPass != null) {
            smtpPass = valuesmtpPass;
        } else {
            smtpPass = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valueplacementMetaData = request.getQueryString("placementMetaData");
        String placementMetaData;
        if (valueplacementMetaData != null) {
            placementMetaData = valueplacementMetaData;
        } else {
            placementMetaData = null;
        }
        String valueipsFloor = request.getQueryString("ipsFloor");
        Boolean ipsFloor;
        if (valueipsFloor != null) {
            ipsFloor = Boolean.valueOf(valueipsFloor);
        } else {
            ipsFloor = false;
        }
        String valueenableAPNSBadge = request.getQueryString("enableAPNSBadge");
        Boolean enableAPNSBadge;
        if (valueenableAPNSBadge != null) {
            enableAPNSBadge = Boolean.valueOf(valueenableAPNSBadge);
        } else {
            enableAPNSBadge = true;
        }
        String valueincludeInReport = request.getQueryString("includeInReport");
        Boolean includeInReport;
        if (valueincludeInReport != null) {
            includeInReport = Boolean.valueOf(valueincludeInReport);
        } else {
            includeInReport = true;
        }
        String valuedefaultAppFilterId = request.getQueryString("defaultAppFilterId");
        Long defaultAppFilterId;
        if (valuedefaultAppFilterId != null) {
            defaultAppFilterId = Long.parseLong(valuedefaultAppFilterId);
        } else {
            defaultAppFilterId = null;
        }
        String valueenableWelcomeEmail = request.getQueryString("enableWelcomeEmail");
        Boolean enableWelcomeEmail;
        if (valueenableWelcomeEmail != null) {
            enableWelcomeEmail = Boolean.valueOf(valueenableWelcomeEmail);
        } else {
            enableWelcomeEmail = null;
        }
        String valueappleAppId = request.getQueryString("appleAppId");
        String appleAppId;
        if (valueappleAppId != null) {
            appleAppId = valueappleAppId;
        } else {
            appleAppId = null;
        }
        String valueappleTeamId = request.getQueryString("appleTeamId");
        String appleTeamId;
        if (valueappleTeamId != null) {
            appleTeamId = valueappleTeamId;
        } else {
            appleTeamId = null;
        }
        String valueappleAuthKeyId = request.getQueryString("appleAuthKeyId");
        String appleAuthKeyId;
        if (valueappleAuthKeyId != null) {
            appleAuthKeyId = valueappleAuthKeyId;
        } else {
            appleAuthKeyId = null;
        }
        String valueappleAuthKey = request.getQueryString("appleAuthKey");
        InputStream appleAuthKey;
        if (valueappleAuthKey != null) {
            appleAuthKey = valueappleAuthKey;
        } else {
            appleAuthKey = null;
        }
        String valueappleIssuerId = request.getQueryString("appleIssuerId");
        String appleIssuerId;
        if (valueappleIssuerId != null) {
            appleIssuerId = valueappleIssuerId;
        } else {
            appleIssuerId = null;
        }
        String valueappStoreKeyId = request.getQueryString("appStoreKeyId");
        String appStoreKeyId;
        if (valueappStoreKeyId != null) {
            appStoreKeyId = valueappStoreKeyId;
        } else {
            appStoreKeyId = null;
        }
        String valueappStoreKey = request.getQueryString("appStoreKey");
        InputStream appStoreKey;
        if (valueappStoreKey != null) {
            appStoreKey = valueappStoreKey;
        } else {
            appStoreKey = null;
        }
        String valuegooglePrivateKeyFile = request.getQueryString("googlePrivateKeyFile");
        InputStream googlePrivateKeyFile;
        if (valuegooglePrivateKeyFile != null) {
            googlePrivateKeyFile = valuegooglePrivateKeyFile;
        } else {
            googlePrivateKeyFile = null;
        }
        String valueauthorizeNetApiKey = request.getQueryString("authorizeNetApiKey");
        String authorizeNetApiKey;
        if (valueauthorizeNetApiKey != null) {
            authorizeNetApiKey = valueauthorizeNetApiKey;
        } else {
            authorizeNetApiKey = null;
        }
        String valueauthorizeNetTransactionKey = request.getQueryString("authorizeNetTransactionKey");
        String authorizeNetTransactionKey;
        if (valueauthorizeNetTransactionKey != null) {
            authorizeNetTransactionKey = valueauthorizeNetTransactionKey;
        } else {
            authorizeNetTransactionKey = null;
        }
        String valueemailSender = request.getQueryString("emailSender");
        String emailSender;
        if (valueemailSender != null) {
            emailSender = valueemailSender;
        } else {
            emailSender = null;
        }
        String valuesmtpUser = request.getQueryString("smtpUser");
        String smtpUser;
        if (valuesmtpUser != null) {
            smtpUser = valuesmtpUser;
        } else {
            smtpUser = null;
        }
        String valuesmtpHost = request.getQueryString("smtpHost");
        String smtpHost;
        if (valuesmtpHost != null) {
            smtpHost = valuesmtpHost;
        } else {
            smtpHost = null;
        }
        String valuevatomBusinessId = request.getQueryString("vatomBusinessId");
        String vatomBusinessId;
        if (valuevatomBusinessId != null) {
            vatomBusinessId = valuevatomBusinessId;
        } else {
            vatomBusinessId = null;
        }
        String valuevatomRestClientId = request.getQueryString("vatomRestClientId");
        String vatomRestClientId;
        if (valuevatomRestClientId != null) {
            vatomRestClientId = valuevatomRestClientId;
        } else {
            vatomRestClientId = null;
        }
        String valuevatomRestSecretKey = request.getQueryString("vatomRestSecretKey");
        String vatomRestSecretKey;
        if (valuevatomRestSecretKey != null) {
            vatomRestSecretKey = valuevatomRestSecretKey;
        } else {
            vatomRestSecretKey = null;
        }
        String valuetwilioAccountSID = request.getQueryString("twilioAccountSID");
        String twilioAccountSID;
        if (valuetwilioAccountSID != null) {
            twilioAccountSID = valuetwilioAccountSID;
        } else {
            twilioAccountSID = null;
        }
        String valuetwilioAuthToken = request.getQueryString("twilioAuthToken");
        String twilioAuthToken;
        if (valuetwilioAuthToken != null) {
            twilioAuthToken = valuetwilioAuthToken;
        } else {
            twilioAuthToken = null;
        }
        String valuetwilioSenderPhoneNumber = request.getQueryString("twilioSenderPhoneNumber");
        String twilioSenderPhoneNumber;
        if (valuetwilioSenderPhoneNumber != null) {
            twilioSenderPhoneNumber = valuetwilioSenderPhoneNumber;
        } else {
            twilioSenderPhoneNumber = null;
        }
        String valueopenAISecretKey = request.getQueryString("openAISecretKey");
        String openAISecretKey;
        if (valueopenAISecretKey != null) {
            openAISecretKey = valueopenAISecretKey;
        } else {
            openAISecretKey = null;
        }
        return imp.updateApplicationHttp(request, version, appKey, appName, deviceId, accountId, about, bundleId, appIconAssetId, appLogoAssetId, facebookAppId, facebookAppSecret, googleApiKey, updateEULADate, eulaVersion, landingPageUrl, showInActivities, activityDescription, inviteWelcomeText, invitePageUrl, urlScheme, platforms, downloadUrls, categoryIds, scoringType, hintCost, maxScore, ticketsPerPoint, hasGameData, publicNotifications, useMatchingAlgorithm, globalTickets, buildVersion, apiVersion, placementName, placementDescription, placementSize, placementHeight, placementWidth, placementRefreshInterval, createObjectStore, publicContentApproval, productionMode, minimumSessionLength, sessionGapLength, localAdsEnabled, sqootApiKey, trilatProcessingType, maxSampleSize, minRSSI, modules, authorizedCount, authorizedServers, defaultTimezone, smtpPass, metaData, placementMetaData, ipsFloor, enableAPNSBadge, includeInReport, defaultAppFilterId, enableWelcomeEmail, appleAppId, appleTeamId, appleAuthKeyId, appleAuthKey, appleIssuerId, appStoreKeyId, appStoreKey, googlePrivateKeyFile, authorizeNetApiKey, authorizeNetTransactionKey, emailSender, smtpUser, smtpHost, vatomBusinessId, vatomRestClientId, vatomRestSecretKey, twilioAccountSID, twilioAuthToken, twilioSenderPhoneNumber, openAISecretKey);
    }

    @ApiAction
    public Result updateApplicationActive(Http.Request request, BigDecimal version) throws Exception {
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
            throw new IllegalArgumentException("'active' parameter is required");
        }
        return imp.updateApplicationActiveHttp(request, version, accountId, appKey, active);
    }

    @ApiAction
    public Result updateApplicationPlacement(Http.Request request, BigDecimal version) throws Exception {
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
        String valueplacementId = request.getQueryString("placementId");
        Long placementId;
        if (valueplacementId != null) {
            placementId = Long.parseLong(valueplacementId);
        } else {
            throw new IllegalArgumentException("'placementId' parameter is required");
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
        String valuesize = request.getQueryString("size");
        String size;
        if (valuesize != null) {
            size = valuesize;
        } else {
            size = null;
        }
        String valueheight = request.getQueryString("height");
        Integer height;
        if (valueheight != null) {
            height = Integer.parseInt(valueheight);
        } else {
            height = null;
        }
        String valuewidth = request.getQueryString("width");
        Integer width;
        if (valuewidth != null) {
            width = Integer.parseInt(valuewidth);
        } else {
            width = null;
        }
        String valuerefreshInterval = request.getQueryString("refreshInterval");
        Integer refreshInterval;
        if (valuerefreshInterval != null) {
            refreshInterval = Integer.parseInt(valuerefreshInterval);
        } else {
            refreshInterval = null;
        }
        String valuedefaultImageId = request.getQueryString("defaultImageId");
        Long defaultImageId;
        if (valuedefaultImageId != null) {
            defaultImageId = Long.parseLong(valuedefaultImageId);
        } else {
            defaultImageId = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        return imp.updateApplicationPlacementHttp(request, version, placementId, deviceId, accountId, name, description, size, height, width, refreshInterval, defaultImageId, active);
    }

    @ApiAction
    public Result uploadApplicationCertificate(Http.Request request, BigDecimal version) throws Exception {
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
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuecertificate = request.getQueryString("certificate");
        InputStream certificate;
        if (valuecertificate != null) {
            certificate = valuecertificate;
        } else {
            certificate = null;
        }
        return imp.uploadApplicationCertificateHttp(request, version, appKey, deviceId, accountId, certificate);
    }

}
