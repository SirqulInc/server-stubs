package org.openapitools.api;

import org.openapitools.model.AccountListResponse;
import org.openapitools.model.ApplicationResponse;
import org.openapitools.model.ApplicationSettingsResponse;
import org.openapitools.model.ApplicationShortResponse;
import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.PlacementResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/api/{version}/application")
@Api(value = "/", description = "")
public interface ApplicationApi  {

    /**
     * Create Application
     *
     * Create an application record and one placement record for that application. You can create more placements for this application by using {@link createApplicationPlacement}.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Application", tags={ "Application" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ApplicationResponse.class) })
    public ApplicationResponse createApplication(@PathParam("version") BigDecimal version, @QueryParam("appName") @NotNull String appName, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("about") String about, @QueryParam("bundleId") String bundleId, @QueryParam("appIconAssetId") Long appIconAssetId, @QueryParam("appLogoAssetId") Long appLogoAssetId, @QueryParam("facebookAppId") String facebookAppId, @QueryParam("facebookAppSecret") String facebookAppSecret, @QueryParam("googleApiKey") String googleApiKey, @QueryParam("updateEULADate") Boolean updateEULADate, @QueryParam("eulaVersion") String eulaVersion, @QueryParam("landingPageUrl") String landingPageUrl, @QueryParam("showInActivities") Boolean showInActivities, @QueryParam("activityDescription") String activityDescription, @QueryParam("inviteWelcomeText") String inviteWelcomeText, @QueryParam("invitePageUrl") String invitePageUrl, @QueryParam("urlScheme") String urlScheme, @QueryParam("platforms") String platforms, @QueryParam("downloadUrls") String downloadUrls, @QueryParam("categoryIds") String categoryIds, @QueryParam("scoringType") @DefaultValue("GAME_LEVEL")String scoringType, @QueryParam("hintCost") @DefaultValue("11")Integer hintCost, @QueryParam("maxScore") @DefaultValue("125")Integer maxScore, @QueryParam("ticketsPerPoint") @DefaultValue("0.037")Float ticketsPerPoint, @QueryParam("hasGameData") @DefaultValue("true")Boolean hasGameData, @QueryParam("publicNotifications") Boolean publicNotifications, @QueryParam("useMatchingAlgorithm") Boolean useMatchingAlgorithm, @QueryParam("globalTickets") @DefaultValue("false")Boolean globalTickets, @QueryParam("buildVersion") @DefaultValue("1")Float buildVersion, @QueryParam("apiVersion") Float apiVersion, @QueryParam("placementName") String placementName, @QueryParam("placementDescription") String placementDescription, @QueryParam("placementSize") String placementSize, @QueryParam("placementHeight") Integer placementHeight, @QueryParam("placementWidth") Integer placementWidth, @QueryParam("placementRefreshInterval") Integer placementRefreshInterval, @QueryParam("createObjectStore") @DefaultValue("true")Boolean createObjectStore, @QueryParam("publicContentApproval") @DefaultValue("false")Boolean publicContentApproval, @QueryParam("productionMode") @DefaultValue("false")Boolean productionMode, @QueryParam("minimumSessionLength") Integer minimumSessionLength, @QueryParam("sessionGapLength") Integer sessionGapLength, @QueryParam("localAdsEnabled") @DefaultValue("false")Boolean localAdsEnabled, @QueryParam("sqootApiKey") String sqootApiKey, @QueryParam("trilatProcessingType") @DefaultValue("FINGERPRINT")String trilatProcessingType, @QueryParam("maxSampleSize") Integer maxSampleSize, @QueryParam("minRSSI") Double minRSSI, @QueryParam("modules") @DefaultValue("ALL")String modules, @QueryParam("authorizedCount") @DefaultValue("1")Integer authorizedCount, @QueryParam("authorizedServers") String authorizedServers, @QueryParam("defaultTimezone") String defaultTimezone, @QueryParam("smtpPass") String smtpPass, @QueryParam("metaData") String metaData, @QueryParam("placementMetaData") String placementMetaData, @QueryParam("ipsFloor") @DefaultValue("false")Boolean ipsFloor, @QueryParam("enableAPNSBadge") @DefaultValue("true")Boolean enableAPNSBadge, @QueryParam("includeInReport") @DefaultValue("true")Boolean includeInReport, @QueryParam("defaultAppFilterId") Long defaultAppFilterId, @QueryParam("enableWelcomeEmail") Boolean enableWelcomeEmail, @QueryParam("appleAppId") String appleAppId, @QueryParam("appleTeamId") String appleTeamId, @QueryParam("appleAuthKeyId") String appleAuthKeyId, @QueryParam("appleAuthKey") File appleAuthKey, @QueryParam("appleIssuerId") String appleIssuerId, @QueryParam("appStoreKeyId") String appStoreKeyId, @QueryParam("appStoreKey") File appStoreKey, @QueryParam("googlePrivateKeyFile") File googlePrivateKeyFile, @QueryParam("authorizeNetApiKey") String authorizeNetApiKey, @QueryParam("authorizeNetTransactionKey") String authorizeNetTransactionKey, @QueryParam("emailSender") String emailSender, @QueryParam("smtpUser") String smtpUser, @QueryParam("smtpHost") String smtpHost, @QueryParam("vatomBusinessId") String vatomBusinessId, @QueryParam("vatomRestClientId") String vatomRestClientId, @QueryParam("vatomRestSecretKey") String vatomRestSecretKey, @QueryParam("twilioAccountSID") String twilioAccountSID, @QueryParam("twilioAuthToken") String twilioAuthToken, @QueryParam("twilioSenderPhoneNumber") String twilioSenderPhoneNumber, @QueryParam("openAISecretKey") String openAISecretKey);

    /**
     * Create Ad Placement
     *
     * Creates a new ad placement for an application.
     *
     */
    @POST
    @Path("/placement/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Ad Placement", tags={ "Application" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PlacementResponse.class) })
    public PlacementResponse createApplicationPlacement(@PathParam("version") BigDecimal version, @QueryParam("appKey") @NotNull String appKey, @QueryParam("size") @NotNull String size, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("height") Integer height, @QueryParam("width") Integer width, @QueryParam("refreshInterval") Integer refreshInterval, @QueryParam("defaultImageId") Long defaultImageId, @QueryParam("active") Boolean active);

    /**
     * Delete Application
     *
     * Set the deleted timestamp to current time. This effectively deletes the application since all queries should ignore any records with a deleted timestamp
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Application", tags={ "Application" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteApplication(@PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey);

    /**
     * Delete Ad Placement
     *
     * Deletes an ad placement for an application.
     *
     */
    @POST
    @Path("/placement/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Ad Placement", tags={ "Application" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PlacementResponse.class) })
    public PlacementResponse deleteApplicationPlacement(@PathParam("version") BigDecimal version, @QueryParam("placementId") @NotNull Long placementId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Get Application
     *
     * Get a specific application by appKey
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Application", tags={ "Application" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ApplicationResponse.class) })
    public ApplicationResponse getApplication(@PathParam("version") BigDecimal version, @QueryParam("appKey") String appKey, @QueryParam("applicationId") Long applicationId);

    /**
     * Get Ad Placement
     *
     * Get details of an ad placement
     *
     */
    @GET
    @Path("/placement/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Ad Placement", tags={ "Application" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PlacementResponse.class) })
    public PlacementResponse getApplicationPlacement(@PathParam("version") BigDecimal version, @QueryParam("placementId") @NotNull Long placementId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Get API versions
     *
     * Will return a comma separated list of numbers, newest first. For example: 3.0, 2.2, 2.1, 1.8
     *
     */
    @GET
    @Path("/versions")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get API versions", tags={ "Application" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse getApplicationVersions(@PathParam("version") BigDecimal version);

    /**
     * Search Application Users
     *
     * Get a list of users per application
     *
     */
    @GET
    @Path("/users")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Application Users", tags={ "Application" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AccountListResponse.class) })
    public AccountListResponse getUniqueUsersByApp(@PathParam("version") BigDecimal version, @QueryParam("appKey") @NotNull String appKey, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("since") Long since, @QueryParam("_i") Integer i, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("_l") Integer l, @QueryParam("limit") @DefaultValue("20")Integer limit);

    /**
     * List Applications
     *
     * List active applications matching the criteria (as a consumer)
     *
     */
    @GET
    @Path("/list")
    @Produces({ "*/*" })
    @ApiOperation(value = "List Applications", tags={ "Application" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ApplicationShortResponse.class, responseContainer = "List") })
    public List<ApplicationShortResponse> listApplications(@PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("platforms") String platforms, @QueryParam("deviceIds") String deviceIds, @QueryParam("deviceVersions") String deviceVersions, @QueryParam("categoryIds") String categoryIds, @QueryParam("sortField") @DefaultValue("UPDATED")String sortField, @QueryParam("hasAds") Boolean hasAds, @QueryParam("publicNotifications") Boolean publicNotifications, @QueryParam("filterBillable") Boolean filterBillable, @QueryParam("filterContentAdmin") Boolean filterContentAdmin, @QueryParam("descending") @DefaultValue("true")Boolean descending, @QueryParam("_i") Integer i, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("_l") Integer l, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("applicationIds") String applicationIds, @QueryParam("hasObjectStore") @DefaultValue("false")Boolean hasObjectStore, @QueryParam("activeOnly") @DefaultValue("true")Boolean activeOnly);

    /**
     * Search for Ad Placements
     *
     * Searches placements for an application.
     *
     */
    @GET
    @Path("/placement/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search for Ad Placements", tags={ "Application" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PlacementResponse.class, responseContainer = "List") })
    public List<PlacementResponse> searchApplicationPlacement(@PathParam("version") BigDecimal version, @QueryParam("appKey") @NotNull String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("100")Integer limit);

    /**
     * Search for Application Settings
     *
     * Returns a list of applications that the user has logged into before, and returns specific settings for that application and user
     *
     */
    @GET
    @Path("/settings/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search for Application Settings", tags={ "Application" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ApplicationSettingsResponse.class) })
    public ApplicationSettingsResponse searchApplicationSettings(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("keyword") String keyword, @QueryParam("sortField") @DefaultValue("APPLICATION_TITLE")String sortField, @QueryParam("descending") @DefaultValue("false")Boolean descending, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit);

    /**
     * Search Applications
     *
     * Search for applications matching the criteria that the logged in user has access to
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Applications", tags={ "Application" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ApplicationResponse.class, responseContainer = "List") })
    public List<ApplicationResponse> searchApplications(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("qSearchFields") @DefaultValue("NAME,ABOUT,BILLABLE_ENTITY_NAME")String qSearchFields, @QueryParam("sortField") @DefaultValue("APPLICATION_ID")String sortField, @QueryParam("descending") @DefaultValue("false")Boolean descending, @QueryParam("_i") Integer i, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("_l") Integer l, @QueryParam("limit") @DefaultValue("100")Integer limit, @QueryParam("hasAds") Boolean hasAds, @QueryParam("publicNotifications") Boolean publicNotifications, @QueryParam("activeOnly") @DefaultValue("false")Boolean activeOnly);

    /**
     * Update Application
     *
     * Update an application record
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Application", tags={ "Application" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ApplicationResponse.class) })
    public ApplicationResponse updateApplication(@PathParam("version") BigDecimal version, @QueryParam("appKey") @NotNull String appKey, @QueryParam("appName") @NotNull String appName, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("about") String about, @QueryParam("bundleId") String bundleId, @QueryParam("appIconAssetId") Long appIconAssetId, @QueryParam("appLogoAssetId") Long appLogoAssetId, @QueryParam("facebookAppId") String facebookAppId, @QueryParam("facebookAppSecret") String facebookAppSecret, @QueryParam("googleApiKey") String googleApiKey, @QueryParam("updateEULADate") Boolean updateEULADate, @QueryParam("eulaVersion") String eulaVersion, @QueryParam("landingPageUrl") String landingPageUrl, @QueryParam("showInActivities") Boolean showInActivities, @QueryParam("activityDescription") String activityDescription, @QueryParam("inviteWelcomeText") String inviteWelcomeText, @QueryParam("invitePageUrl") String invitePageUrl, @QueryParam("urlScheme") String urlScheme, @QueryParam("platforms") String platforms, @QueryParam("downloadUrls") String downloadUrls, @QueryParam("categoryIds") String categoryIds, @QueryParam("scoringType") @DefaultValue("GAME_LEVEL")String scoringType, @QueryParam("hintCost") @DefaultValue("11")Integer hintCost, @QueryParam("maxScore") @DefaultValue("125")Integer maxScore, @QueryParam("ticketsPerPoint") @DefaultValue("0.037")Float ticketsPerPoint, @QueryParam("hasGameData") @DefaultValue("true")Boolean hasGameData, @QueryParam("publicNotifications") Boolean publicNotifications, @QueryParam("useMatchingAlgorithm") Boolean useMatchingAlgorithm, @QueryParam("globalTickets") @DefaultValue("false")Boolean globalTickets, @QueryParam("buildVersion") @DefaultValue("1")Float buildVersion, @QueryParam("apiVersion") Float apiVersion, @QueryParam("placementName") String placementName, @QueryParam("placementDescription") String placementDescription, @QueryParam("placementSize") String placementSize, @QueryParam("placementHeight") Integer placementHeight, @QueryParam("placementWidth") Integer placementWidth, @QueryParam("placementRefreshInterval") Integer placementRefreshInterval, @QueryParam("createObjectStore") @DefaultValue("true")Boolean createObjectStore, @QueryParam("publicContentApproval") @DefaultValue("false")Boolean publicContentApproval, @QueryParam("productionMode") @DefaultValue("false")Boolean productionMode, @QueryParam("minimumSessionLength") Integer minimumSessionLength, @QueryParam("sessionGapLength") Integer sessionGapLength, @QueryParam("localAdsEnabled") @DefaultValue("false")Boolean localAdsEnabled, @QueryParam("sqootApiKey") String sqootApiKey, @QueryParam("trilatProcessingType") @DefaultValue("FINGERPRINT")String trilatProcessingType, @QueryParam("maxSampleSize") Integer maxSampleSize, @QueryParam("minRSSI") Double minRSSI, @QueryParam("modules") @DefaultValue("ALL")String modules, @QueryParam("authorizedCount") @DefaultValue("1")Integer authorizedCount, @QueryParam("authorizedServers") String authorizedServers, @QueryParam("defaultTimezone") String defaultTimezone, @QueryParam("smtpPass") String smtpPass, @QueryParam("metaData") String metaData, @QueryParam("placementMetaData") String placementMetaData, @QueryParam("ipsFloor") @DefaultValue("false")Boolean ipsFloor, @QueryParam("enableAPNSBadge") @DefaultValue("true")Boolean enableAPNSBadge, @QueryParam("includeInReport") @DefaultValue("true")Boolean includeInReport, @QueryParam("defaultAppFilterId") Long defaultAppFilterId, @QueryParam("enableWelcomeEmail") Boolean enableWelcomeEmail, @QueryParam("appleAppId") String appleAppId, @QueryParam("appleTeamId") String appleTeamId, @QueryParam("appleAuthKeyId") String appleAuthKeyId, @QueryParam("appleAuthKey") File appleAuthKey, @QueryParam("appleIssuerId") String appleIssuerId, @QueryParam("appStoreKeyId") String appStoreKeyId, @QueryParam("appStoreKey") File appStoreKey, @QueryParam("googlePrivateKeyFile") File googlePrivateKeyFile, @QueryParam("authorizeNetApiKey") String authorizeNetApiKey, @QueryParam("authorizeNetTransactionKey") String authorizeNetTransactionKey, @QueryParam("emailSender") String emailSender, @QueryParam("smtpUser") String smtpUser, @QueryParam("smtpHost") String smtpHost, @QueryParam("vatomBusinessId") String vatomBusinessId, @QueryParam("vatomRestClientId") String vatomRestClientId, @QueryParam("vatomRestSecretKey") String vatomRestSecretKey, @QueryParam("twilioAccountSID") String twilioAccountSID, @QueryParam("twilioAuthToken") String twilioAuthToken, @QueryParam("twilioSenderPhoneNumber") String twilioSenderPhoneNumber, @QueryParam("openAISecretKey") String openAISecretKey);

    /**
     * Change Appliation Status
     *
     * Set the application&#39;s active flag to true/false. This effectively activates or deactivates the application.
     *
     */
    @POST
    @Path("/active")
    @Produces({ "*/*" })
    @ApiOperation(value = "Change Appliation Status", tags={ "Application" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse updateApplicationActive(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("active") @NotNull Boolean active);

    /**
     * Update Ad Placement
     *
     * Updates an ad placement for an application.
     *
     */
    @POST
    @Path("/placement/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Ad Placement", tags={ "Application" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PlacementResponse.class) })
    public PlacementResponse updateApplicationPlacement(@PathParam("version") BigDecimal version, @QueryParam("placementId") @NotNull Long placementId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("size") String size, @QueryParam("height") Integer height, @QueryParam("width") Integer width, @QueryParam("refreshInterval") Integer refreshInterval, @QueryParam("defaultImageId") Long defaultImageId, @QueryParam("active") Boolean active);

    /**
     * Create Application Certificate
     *
     * Uploads a certificate for an application that the user has access to.
     *
     */
    @POST
    @Path("/certificate/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Application Certificate", tags={ "Application" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse uploadApplicationCertificate(@PathParam("version") BigDecimal version, @QueryParam("appKey") @NotNull String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("certificate") File certificate);
}
