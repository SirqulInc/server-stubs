package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ApplicationApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AccountListResponse;
import org.openapitools.model.ApplicationResponse;
import org.openapitools.model.ApplicationSettingsResponse;
import org.openapitools.model.ApplicationShortResponse;
import java.io.File;
import org.openapitools.model.PlacementResponse;
import org.openapitools.model.SirqulResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/application")


@io.swagger.annotations.Api(description = "the application API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ApplicationApi  {

    @Inject ApplicationApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Application", notes = "Create an application record and one placement record for that application. You can create more placements for this application by using {@link createApplicationPlacement}.", response = ApplicationResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationResponse.class) })
    public Response createApplication( @NotNull @QueryParam("appName") String appName, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("about") String about, @QueryParam("bundleId") String bundleId, @QueryParam("appIconAssetId") Long appIconAssetId, @QueryParam("appLogoAssetId") Long appLogoAssetId, @QueryParam("facebookAppId") String facebookAppId, @QueryParam("facebookAppSecret") String facebookAppSecret, @QueryParam("googleApiKey") String googleApiKey, @QueryParam("updateEULADate") Boolean updateEULADate, @QueryParam("eulaVersion") String eulaVersion, @QueryParam("landingPageUrl") String landingPageUrl, @QueryParam("showInActivities") Boolean showInActivities, @QueryParam("activityDescription") String activityDescription, @QueryParam("inviteWelcomeText") String inviteWelcomeText, @QueryParam("invitePageUrl") String invitePageUrl, @QueryParam("urlScheme") String urlScheme, @QueryParam("platforms") String platforms, @QueryParam("downloadUrls") String downloadUrls, @QueryParam("categoryIds") String categoryIds,, allowableValues="GAME_LEVEL, GAME_OBJECT" @DefaultValue("GAME_LEVEL") @QueryParam("scoringType") String scoringType, @DefaultValue("11") @QueryParam("hintCost") Integer hintCost, @DefaultValue("125") @QueryParam("maxScore") Integer maxScore, @DefaultValue("0.037") @QueryParam("ticketsPerPoint") Float ticketsPerPoint, @DefaultValue("true") @QueryParam("hasGameData") Boolean hasGameData, @QueryParam("publicNotifications") Boolean publicNotifications, @QueryParam("useMatchingAlgorithm") Boolean useMatchingAlgorithm, @DefaultValue("false") @QueryParam("globalTickets") Boolean globalTickets, @DefaultValue("1") @QueryParam("buildVersion") Float buildVersion, @QueryParam("apiVersion") Float apiVersion, @QueryParam("placementName") String placementName, @QueryParam("placementDescription") String placementDescription,, allowableValues="CONFIG, BANNER, LEADERBOARD, SKYSCRAPER, VIDEO, ZIP, INTERSTITIAL, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, CUSTOM6, CUSTOM7, CUSTOM8, CUSTOM9, CUSTOM10" @QueryParam("placementSize") String placementSize, @QueryParam("placementHeight") Integer placementHeight, @QueryParam("placementWidth") Integer placementWidth, @QueryParam("placementRefreshInterval") Integer placementRefreshInterval, @DefaultValue("true") @QueryParam("createObjectStore") Boolean createObjectStore, @DefaultValue("false") @QueryParam("publicContentApproval") Boolean publicContentApproval, @DefaultValue("false") @QueryParam("productionMode") Boolean productionMode, @QueryParam("minimumSessionLength") Integer minimumSessionLength, @QueryParam("sessionGapLength") Integer sessionGapLength, @DefaultValue("false") @QueryParam("localAdsEnabled") Boolean localAdsEnabled, @QueryParam("sqootApiKey") String sqootApiKey,, allowableValues="DEFAULT, FINGERPRINT, FINGERPRINT_V2" @DefaultValue("FINGERPRINT") @QueryParam("trilatProcessingType") String trilatProcessingType, @QueryParam("maxSampleSize") Integer maxSampleSize, @QueryParam("minRSSI") Double minRSSI, @DefaultValue("ALL") @QueryParam("modules") String modules, @DefaultValue("1") @QueryParam("authorizedCount") Integer authorizedCount, @QueryParam("authorizedServers") String authorizedServers, @QueryParam("defaultTimezone") String defaultTimezone, @QueryParam("smtpPass") String smtpPass, @QueryParam("metaData") String metaData, @QueryParam("placementMetaData") String placementMetaData, @DefaultValue("false") @QueryParam("ipsFloor") Boolean ipsFloor, @DefaultValue("true") @QueryParam("enableAPNSBadge") Boolean enableAPNSBadge, @DefaultValue("true") @QueryParam("includeInReport") Boolean includeInReport, @QueryParam("defaultAppFilterId") Long defaultAppFilterId, @QueryParam("enableWelcomeEmail") Boolean enableWelcomeEmail, @QueryParam("appleAppId") String appleAppId, @QueryParam("appleTeamId") String appleTeamId, @QueryParam("appleAuthKeyId") String appleAuthKeyId, @QueryParam("appleAuthKey") File appleAuthKey, @QueryParam("appleIssuerId") String appleIssuerId, @QueryParam("appStoreKeyId") String appStoreKeyId, @QueryParam("appStoreKey") File appStoreKey, @QueryParam("googlePrivateKeyFile") File googlePrivateKeyFile, @QueryParam("authorizeNetApiKey") String authorizeNetApiKey, @QueryParam("authorizeNetTransactionKey") String authorizeNetTransactionKey, @QueryParam("emailSender") String emailSender, @QueryParam("smtpUser") String smtpUser, @QueryParam("smtpHost") String smtpHost, @QueryParam("vatomBusinessId") String vatomBusinessId, @QueryParam("vatomRestClientId") String vatomRestClientId, @QueryParam("vatomRestSecretKey") String vatomRestSecretKey, @QueryParam("twilioAccountSID") String twilioAccountSID, @QueryParam("twilioAuthToken") String twilioAuthToken, @QueryParam("twilioSenderPhoneNumber") String twilioSenderPhoneNumber, @QueryParam("openAISecretKey") String openAISecretKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createApplication(appName,deviceId,accountId,about,bundleId,appIconAssetId,appLogoAssetId,facebookAppId,facebookAppSecret,googleApiKey,updateEULADate,eulaVersion,landingPageUrl,showInActivities,activityDescription,inviteWelcomeText,invitePageUrl,urlScheme,platforms,downloadUrls,categoryIds,scoringType,hintCost,maxScore,ticketsPerPoint,hasGameData,publicNotifications,useMatchingAlgorithm,globalTickets,buildVersion,apiVersion,placementName,placementDescription,placementSize,placementHeight,placementWidth,placementRefreshInterval,createObjectStore,publicContentApproval,productionMode,minimumSessionLength,sessionGapLength,localAdsEnabled,sqootApiKey,trilatProcessingType,maxSampleSize,minRSSI,modules,authorizedCount,authorizedServers,defaultTimezone,smtpPass,metaData,placementMetaData,ipsFloor,enableAPNSBadge,includeInReport,defaultAppFilterId,enableWelcomeEmail,appleAppId,appleTeamId,appleAuthKeyId,appleAuthKey,appleIssuerId,appStoreKeyId,appStoreKey,googlePrivateKeyFile,authorizeNetApiKey,authorizeNetTransactionKey,emailSender,smtpUser,smtpHost,vatomBusinessId,vatomRestClientId,vatomRestSecretKey,twilioAccountSID,twilioAuthToken,twilioSenderPhoneNumber,openAISecretKey,securityContext);
    }
    @POST
    @Path("/placement/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Ad Placement", notes = "Creates a new ad placement for an application.", response = PlacementResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PlacementResponse.class) })
    public Response createApplicationPlacement( @NotNull @QueryParam("appKey") String appKey, @NotNull, allowableValues="CONFIG, BANNER, LEADERBOARD, SKYSCRAPER, VIDEO, ZIP, INTERSTITIAL, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, CUSTOM6, CUSTOM7, CUSTOM8, CUSTOM9, CUSTOM10" @QueryParam("size") String size, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("height") Integer height, @QueryParam("width") Integer width, @QueryParam("refreshInterval") Integer refreshInterval, @QueryParam("defaultImageId") Long defaultImageId, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createApplicationPlacement(appKey,size,deviceId,accountId,name,description,height,width,refreshInterval,defaultImageId,active,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Application", notes = "Set the deleted timestamp to current time. This effectively deletes the application since all queries should ignore any records with a deleted timestamp", response = SirqulResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteApplication( @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteApplication(accountId,appKey,securityContext);
    }
    @POST
    @Path("/placement/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Ad Placement", notes = "Deletes an ad placement for an application.", response = PlacementResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PlacementResponse.class) })
    public Response deleteApplicationPlacement( @NotNull @QueryParam("placementId") Long placementId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteApplicationPlacement(placementId,deviceId,accountId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Application", notes = "Get a specific application by appKey", response = ApplicationResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationResponse.class) })
    public Response getApplication( @QueryParam("appKey") String appKey, @QueryParam("applicationId") Long applicationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getApplication(appKey,applicationId,securityContext);
    }
    @GET
    @Path("/placement/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Ad Placement", notes = "Get details of an ad placement", response = PlacementResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PlacementResponse.class) })
    public Response getApplicationPlacement( @NotNull @QueryParam("placementId") Long placementId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getApplicationPlacement(placementId,deviceId,accountId,securityContext);
    }
    @GET
    @Path("/versions")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get API versions", notes = "Will return a comma separated list of numbers, newest first. For example: 3.0, 2.2, 2.1, 1.8", response = SirqulResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response getApplicationVersions(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getApplicationVersions(securityContext);
    }
    @GET
    @Path("/users")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Application Users", notes = "Get a list of users per application", response = AccountListResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AccountListResponse.class) })
    public Response getUniqueUsersByApp( @NotNull @QueryParam("appKey") String appKey, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("since") Long since, @QueryParam("_i") Integer i, @DefaultValue("0") @QueryParam("start") Integer start, @QueryParam("_l") Integer l, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUniqueUsersByApp(appKey,q,keyword,since,i,start,l,limit,securityContext);
    }
    @GET
    @Path("/list")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Applications", notes = "List active applications matching the criteria (as a consumer)", response = ApplicationShortResponse.class, responseContainer = "List", tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationShortResponse.class, responseContainer = "List") })
    public Response listApplications( @QueryParam("accountId") Long accountId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("platforms") String platforms, @QueryParam("deviceIds") String deviceIds, @QueryParam("deviceVersions") String deviceVersions, @QueryParam("categoryIds") String categoryIds,, allowableValues="CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, HAS_ADVERTISEMENTS, PUBLIC_NOTIFICATIONS, PLACEMENTS, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY, TITLE, NAME, ABOUT, DESCRIPTION, APPLICATION_ID, APP_TYPE, GAME_TYPE, BUNDLE_ID, SCORING_TYPE, LANDING_PAGE_URL, EULA_VERSION, BUILD_VERSION, API_VERSION" @DefaultValue("UPDATED") @QueryParam("sortField") String sortField, @QueryParam("hasAds") Boolean hasAds, @QueryParam("publicNotifications") Boolean publicNotifications, @QueryParam("filterBillable") Boolean filterBillable, @QueryParam("filterContentAdmin") Boolean filterContentAdmin, @DefaultValue("true") @QueryParam("descending") Boolean descending, @QueryParam("_i") Integer i, @DefaultValue("0") @QueryParam("start") Integer start, @QueryParam("_l") Integer l, @DefaultValue("20") @QueryParam("limit") Integer limit, @QueryParam("applicationIds") String applicationIds, @DefaultValue("false") @QueryParam("hasObjectStore") Boolean hasObjectStore, @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listApplications(accountId,q,keyword,platforms,deviceIds,deviceVersions,categoryIds,sortField,hasAds,publicNotifications,filterBillable,filterContentAdmin,descending,i,start,l,limit,applicationIds,hasObjectStore,activeOnly,securityContext);
    }
    @GET
    @Path("/placement/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search for Ad Placements", notes = "Searches placements for an application.", response = PlacementResponse.class, responseContainer = "List", tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PlacementResponse.class, responseContainer = "List") })
    public Response searchApplicationPlacement( @NotNull @QueryParam("appKey") String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("100") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchApplicationPlacement(appKey,deviceId,accountId,start,limit,securityContext);
    }
    @GET
    @Path("/settings/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search for Application Settings", notes = "Returns a list of applications that the user has logged into before, and returns specific settings for that application and user", response = ApplicationSettingsResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationSettingsResponse.class) })
    public Response searchApplicationSettings( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("keyword") String keyword, @DefaultValue("APPLICATION_TITLE") @QueryParam("sortField") String sortField, @DefaultValue("false") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchApplicationSettings(deviceId,accountId,connectionAccountId,keyword,sortField,descending,start,limit,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Applications", notes = "Search for applications matching the criteria that the logged in user has access to", response = ApplicationResponse.class, responseContainer = "List", tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationResponse.class, responseContainer = "List") })
    public Response searchApplications( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @DefaultValue("NAME,ABOUT,BILLABLE_ENTITY_NAME") @QueryParam("qSearchFields") String qSearchFields,, allowableValues="CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, HAS_ADVERTISEMENTS, PUBLIC_NOTIFICATIONS, PLACEMENTS, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY, TITLE, NAME, ABOUT, DESCRIPTION, APPLICATION_ID, APP_TYPE, GAME_TYPE, BUNDLE_ID, SCORING_TYPE, LANDING_PAGE_URL, EULA_VERSION, BUILD_VERSION, API_VERSION" @DefaultValue("APPLICATION_ID") @QueryParam("sortField") String sortField, @DefaultValue("false") @QueryParam("descending") Boolean descending, @QueryParam("_i") Integer i, @DefaultValue("0") @QueryParam("start") Integer start, @QueryParam("_l") Integer l, @DefaultValue("100") @QueryParam("limit") Integer limit, @QueryParam("hasAds") Boolean hasAds, @QueryParam("publicNotifications") Boolean publicNotifications, @DefaultValue("false") @QueryParam("activeOnly") Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchApplications(deviceId,accountId,latitude,longitude,q,keyword,qSearchFields,sortField,descending,i,start,l,limit,hasAds,publicNotifications,activeOnly,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Application", notes = "Update an application record", response = ApplicationResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationResponse.class) })
    public Response updateApplication( @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("appName") String appName, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("about") String about, @QueryParam("bundleId") String bundleId, @QueryParam("appIconAssetId") Long appIconAssetId, @QueryParam("appLogoAssetId") Long appLogoAssetId, @QueryParam("facebookAppId") String facebookAppId, @QueryParam("facebookAppSecret") String facebookAppSecret, @QueryParam("googleApiKey") String googleApiKey, @QueryParam("updateEULADate") Boolean updateEULADate, @QueryParam("eulaVersion") String eulaVersion, @QueryParam("landingPageUrl") String landingPageUrl, @QueryParam("showInActivities") Boolean showInActivities, @QueryParam("activityDescription") String activityDescription, @QueryParam("inviteWelcomeText") String inviteWelcomeText, @QueryParam("invitePageUrl") String invitePageUrl, @QueryParam("urlScheme") String urlScheme, @QueryParam("platforms") String platforms, @QueryParam("downloadUrls") String downloadUrls, @QueryParam("categoryIds") String categoryIds,, allowableValues="GAME_LEVEL, GAME_OBJECT" @DefaultValue("GAME_LEVEL") @QueryParam("scoringType") String scoringType, @DefaultValue("11") @QueryParam("hintCost") Integer hintCost, @DefaultValue("125") @QueryParam("maxScore") Integer maxScore, @DefaultValue("0.037") @QueryParam("ticketsPerPoint") Float ticketsPerPoint, @DefaultValue("true") @QueryParam("hasGameData") Boolean hasGameData, @QueryParam("publicNotifications") Boolean publicNotifications, @QueryParam("useMatchingAlgorithm") Boolean useMatchingAlgorithm, @DefaultValue("false") @QueryParam("globalTickets") Boolean globalTickets, @DefaultValue("1") @QueryParam("buildVersion") Float buildVersion, @QueryParam("apiVersion") Float apiVersion, @QueryParam("placementName") String placementName, @QueryParam("placementDescription") String placementDescription,, allowableValues="CONFIG, BANNER, LEADERBOARD, SKYSCRAPER, VIDEO, ZIP, INTERSTITIAL, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, CUSTOM6, CUSTOM7, CUSTOM8, CUSTOM9, CUSTOM10" @QueryParam("placementSize") String placementSize, @QueryParam("placementHeight") Integer placementHeight, @QueryParam("placementWidth") Integer placementWidth, @QueryParam("placementRefreshInterval") Integer placementRefreshInterval, @DefaultValue("true") @QueryParam("createObjectStore") Boolean createObjectStore, @DefaultValue("false") @QueryParam("publicContentApproval") Boolean publicContentApproval, @DefaultValue("false") @QueryParam("productionMode") Boolean productionMode, @QueryParam("minimumSessionLength") Integer minimumSessionLength, @QueryParam("sessionGapLength") Integer sessionGapLength, @DefaultValue("false") @QueryParam("localAdsEnabled") Boolean localAdsEnabled, @QueryParam("sqootApiKey") String sqootApiKey,, allowableValues="DEFAULT, FINGERPRINT, FINGERPRINT_V2" @DefaultValue("FINGERPRINT") @QueryParam("trilatProcessingType") String trilatProcessingType, @QueryParam("maxSampleSize") Integer maxSampleSize, @QueryParam("minRSSI") Double minRSSI, @DefaultValue("ALL") @QueryParam("modules") String modules, @DefaultValue("1") @QueryParam("authorizedCount") Integer authorizedCount, @QueryParam("authorizedServers") String authorizedServers, @QueryParam("defaultTimezone") String defaultTimezone, @QueryParam("smtpPass") String smtpPass, @QueryParam("metaData") String metaData, @QueryParam("placementMetaData") String placementMetaData, @DefaultValue("false") @QueryParam("ipsFloor") Boolean ipsFloor, @DefaultValue("true") @QueryParam("enableAPNSBadge") Boolean enableAPNSBadge, @DefaultValue("true") @QueryParam("includeInReport") Boolean includeInReport, @QueryParam("defaultAppFilterId") Long defaultAppFilterId, @QueryParam("enableWelcomeEmail") Boolean enableWelcomeEmail, @QueryParam("appleAppId") String appleAppId, @QueryParam("appleTeamId") String appleTeamId, @QueryParam("appleAuthKeyId") String appleAuthKeyId, @QueryParam("appleAuthKey") File appleAuthKey, @QueryParam("appleIssuerId") String appleIssuerId, @QueryParam("appStoreKeyId") String appStoreKeyId, @QueryParam("appStoreKey") File appStoreKey, @QueryParam("googlePrivateKeyFile") File googlePrivateKeyFile, @QueryParam("authorizeNetApiKey") String authorizeNetApiKey, @QueryParam("authorizeNetTransactionKey") String authorizeNetTransactionKey, @QueryParam("emailSender") String emailSender, @QueryParam("smtpUser") String smtpUser, @QueryParam("smtpHost") String smtpHost, @QueryParam("vatomBusinessId") String vatomBusinessId, @QueryParam("vatomRestClientId") String vatomRestClientId, @QueryParam("vatomRestSecretKey") String vatomRestSecretKey, @QueryParam("twilioAccountSID") String twilioAccountSID, @QueryParam("twilioAuthToken") String twilioAuthToken, @QueryParam("twilioSenderPhoneNumber") String twilioSenderPhoneNumber, @QueryParam("openAISecretKey") String openAISecretKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateApplication(appKey,appName,deviceId,accountId,about,bundleId,appIconAssetId,appLogoAssetId,facebookAppId,facebookAppSecret,googleApiKey,updateEULADate,eulaVersion,landingPageUrl,showInActivities,activityDescription,inviteWelcomeText,invitePageUrl,urlScheme,platforms,downloadUrls,categoryIds,scoringType,hintCost,maxScore,ticketsPerPoint,hasGameData,publicNotifications,useMatchingAlgorithm,globalTickets,buildVersion,apiVersion,placementName,placementDescription,placementSize,placementHeight,placementWidth,placementRefreshInterval,createObjectStore,publicContentApproval,productionMode,minimumSessionLength,sessionGapLength,localAdsEnabled,sqootApiKey,trilatProcessingType,maxSampleSize,minRSSI,modules,authorizedCount,authorizedServers,defaultTimezone,smtpPass,metaData,placementMetaData,ipsFloor,enableAPNSBadge,includeInReport,defaultAppFilterId,enableWelcomeEmail,appleAppId,appleTeamId,appleAuthKeyId,appleAuthKey,appleIssuerId,appStoreKeyId,appStoreKey,googlePrivateKeyFile,authorizeNetApiKey,authorizeNetTransactionKey,emailSender,smtpUser,smtpHost,vatomBusinessId,vatomRestClientId,vatomRestSecretKey,twilioAccountSID,twilioAuthToken,twilioSenderPhoneNumber,openAISecretKey,securityContext);
    }
    @POST
    @Path("/active")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Change Appliation Status", notes = "Set the application's active flag to true/false. This effectively activates or deactivates the application.", response = SirqulResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateApplicationActive( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateApplicationActive(accountId,appKey,active,securityContext);
    }
    @POST
    @Path("/placement/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Ad Placement", notes = "Updates an ad placement for an application.", response = PlacementResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PlacementResponse.class) })
    public Response updateApplicationPlacement( @NotNull @QueryParam("placementId") Long placementId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("description") String description,, allowableValues="CONFIG, BANNER, LEADERBOARD, SKYSCRAPER, VIDEO, ZIP, INTERSTITIAL, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, CUSTOM6, CUSTOM7, CUSTOM8, CUSTOM9, CUSTOM10" @QueryParam("size") String size, @QueryParam("height") Integer height, @QueryParam("width") Integer width, @QueryParam("refreshInterval") Integer refreshInterval, @QueryParam("defaultImageId") Long defaultImageId, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateApplicationPlacement(placementId,deviceId,accountId,name,description,size,height,width,refreshInterval,defaultImageId,active,securityContext);
    }
    @POST
    @Path("/certificate/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Application Certificate", notes = "Uploads a certificate for an application that the user has access to.", response = SirqulResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response uploadApplicationCertificate( @NotNull @QueryParam("appKey") String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("certificate") File certificate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.uploadApplicationCertificate(appKey,deviceId,accountId,certificate,securityContext);
    }
}
