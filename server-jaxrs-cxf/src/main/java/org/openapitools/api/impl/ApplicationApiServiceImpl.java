package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AccountListResponse;
import org.openapitools.model.ApplicationResponse;
import org.openapitools.model.ApplicationSettingsResponse;
import org.openapitools.model.ApplicationShortResponse;
import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.PlacementResponse;
import org.openapitools.model.SirqulResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
public class ApplicationApiServiceImpl implements ApplicationApi {
    /**
     * Create Application
     *
     * Create an application record and one placement record for that application. You can create more placements for this application by using {@link createApplicationPlacement}.
     *
     */
    public ApplicationResponse createApplication(BigDecimal version, String appName, String deviceId, Long accountId, String about, String bundleId, Long appIconAssetId, Long appLogoAssetId, String facebookAppId, String facebookAppSecret, String googleApiKey, Boolean updateEULADate, String eulaVersion, String landingPageUrl, Boolean showInActivities, String activityDescription, String inviteWelcomeText, String invitePageUrl, String urlScheme, String platforms, String downloadUrls, String categoryIds, String scoringType, Integer hintCost, Integer maxScore, Float ticketsPerPoint, Boolean hasGameData, Boolean publicNotifications, Boolean useMatchingAlgorithm, Boolean globalTickets, Float buildVersion, Float apiVersion, String placementName, String placementDescription, String placementSize, Integer placementHeight, Integer placementWidth, Integer placementRefreshInterval, Boolean createObjectStore, Boolean publicContentApproval, Boolean productionMode, Integer minimumSessionLength, Integer sessionGapLength, Boolean localAdsEnabled, String sqootApiKey, String trilatProcessingType, Integer maxSampleSize, Double minRSSI, String modules, Integer authorizedCount, String authorizedServers, String defaultTimezone, String smtpPass, String metaData, String placementMetaData, Boolean ipsFloor, Boolean enableAPNSBadge, Boolean includeInReport, Long defaultAppFilterId, Boolean enableWelcomeEmail, String appleAppId, String appleTeamId, String appleAuthKeyId, File appleAuthKey, String appleIssuerId, String appStoreKeyId, File appStoreKey, File googlePrivateKeyFile, String authorizeNetApiKey, String authorizeNetTransactionKey, String emailSender, String smtpUser, String smtpHost, String vatomBusinessId, String vatomRestClientId, String vatomRestSecretKey, String twilioAccountSID, String twilioAuthToken, String twilioSenderPhoneNumber, String openAISecretKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Ad Placement
     *
     * Creates a new ad placement for an application.
     *
     */
    public PlacementResponse createApplicationPlacement(BigDecimal version, String appKey, String size, String deviceId, Long accountId, String name, String description, Integer height, Integer width, Integer refreshInterval, Long defaultImageId, Boolean active) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Application
     *
     * Set the deleted timestamp to current time. This effectively deletes the application since all queries should ignore any records with a deleted timestamp
     *
     */
    public SirqulResponse deleteApplication(BigDecimal version, Long accountId, String appKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Ad Placement
     *
     * Deletes an ad placement for an application.
     *
     */
    public PlacementResponse deleteApplicationPlacement(BigDecimal version, Long placementId, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Application
     *
     * Get a specific application by appKey
     *
     */
    public ApplicationResponse getApplication(BigDecimal version, String appKey, Long applicationId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Ad Placement
     *
     * Get details of an ad placement
     *
     */
    public PlacementResponse getApplicationPlacement(BigDecimal version, Long placementId, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get API versions
     *
     * Will return a comma separated list of numbers, newest first. For example: 3.0, 2.2, 2.1, 1.8
     *
     */
    public SirqulResponse getApplicationVersions(BigDecimal version) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Application Users
     *
     * Get a list of users per application
     *
     */
    public AccountListResponse getUniqueUsersByApp(BigDecimal version, String appKey, String q, String keyword, Long since, Integer i, Integer start, Integer l, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * List Applications
     *
     * List active applications matching the criteria (as a consumer)
     *
     */
    public List<ApplicationShortResponse> listApplications(BigDecimal version, Long accountId, String q, String keyword, String platforms, String deviceIds, String deviceVersions, String categoryIds, String sortField, Boolean hasAds, Boolean publicNotifications, Boolean filterBillable, Boolean filterContentAdmin, Boolean descending, Integer i, Integer start, Integer l, Integer limit, String applicationIds, Boolean hasObjectStore, Boolean activeOnly) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search for Ad Placements
     *
     * Searches placements for an application.
     *
     */
    public List<PlacementResponse> searchApplicationPlacement(BigDecimal version, String appKey, String deviceId, Long accountId, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search for Application Settings
     *
     * Returns a list of applications that the user has logged into before, and returns specific settings for that application and user
     *
     */
    public ApplicationSettingsResponse searchApplicationSettings(BigDecimal version, String deviceId, Long accountId, Long connectionAccountId, String keyword, String sortField, Boolean descending, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Applications
     *
     * Search for applications matching the criteria that the logged in user has access to
     *
     */
    public List<ApplicationResponse> searchApplications(BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude, String q, String keyword, String qSearchFields, String sortField, Boolean descending, Integer i, Integer start, Integer l, Integer limit, Boolean hasAds, Boolean publicNotifications, Boolean activeOnly) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Application
     *
     * Update an application record
     *
     */
    public ApplicationResponse updateApplication(BigDecimal version, String appKey, String appName, String deviceId, Long accountId, String about, String bundleId, Long appIconAssetId, Long appLogoAssetId, String facebookAppId, String facebookAppSecret, String googleApiKey, Boolean updateEULADate, String eulaVersion, String landingPageUrl, Boolean showInActivities, String activityDescription, String inviteWelcomeText, String invitePageUrl, String urlScheme, String platforms, String downloadUrls, String categoryIds, String scoringType, Integer hintCost, Integer maxScore, Float ticketsPerPoint, Boolean hasGameData, Boolean publicNotifications, Boolean useMatchingAlgorithm, Boolean globalTickets, Float buildVersion, Float apiVersion, String placementName, String placementDescription, String placementSize, Integer placementHeight, Integer placementWidth, Integer placementRefreshInterval, Boolean createObjectStore, Boolean publicContentApproval, Boolean productionMode, Integer minimumSessionLength, Integer sessionGapLength, Boolean localAdsEnabled, String sqootApiKey, String trilatProcessingType, Integer maxSampleSize, Double minRSSI, String modules, Integer authorizedCount, String authorizedServers, String defaultTimezone, String smtpPass, String metaData, String placementMetaData, Boolean ipsFloor, Boolean enableAPNSBadge, Boolean includeInReport, Long defaultAppFilterId, Boolean enableWelcomeEmail, String appleAppId, String appleTeamId, String appleAuthKeyId, File appleAuthKey, String appleIssuerId, String appStoreKeyId, File appStoreKey, File googlePrivateKeyFile, String authorizeNetApiKey, String authorizeNetTransactionKey, String emailSender, String smtpUser, String smtpHost, String vatomBusinessId, String vatomRestClientId, String vatomRestSecretKey, String twilioAccountSID, String twilioAuthToken, String twilioSenderPhoneNumber, String openAISecretKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Change Appliation Status
     *
     * Set the application&#39;s active flag to true/false. This effectively activates or deactivates the application.
     *
     */
    public SirqulResponse updateApplicationActive(BigDecimal version, Long accountId, String appKey, Boolean active) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Ad Placement
     *
     * Updates an ad placement for an application.
     *
     */
    public PlacementResponse updateApplicationPlacement(BigDecimal version, Long placementId, String deviceId, Long accountId, String name, String description, String size, Integer height, Integer width, Integer refreshInterval, Long defaultImageId, Boolean active) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Application Certificate
     *
     * Uploads a certificate for an application that the user has access to.
     *
     */
    public SirqulResponse uploadApplicationCertificate(BigDecimal version, String appKey, String deviceId, Long accountId, File certificate) {
        // TODO: Implement...

        return null;
    }

}
