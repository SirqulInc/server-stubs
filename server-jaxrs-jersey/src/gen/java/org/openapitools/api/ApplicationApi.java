package org.openapitools.api;

import org.openapitools.api.ApplicationApiService;
import org.openapitools.api.factories.ApplicationApiServiceFactory;

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

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/application")


@io.swagger.annotations.Api(description = "the application API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ApplicationApi  {
   private final ApplicationApiService delegate;

   public ApplicationApi(@Context ServletConfig servletContext) {
      ApplicationApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ApplicationApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ApplicationApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ApplicationApiServiceFactory.getApplicationApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Application", notes = "Create an application record and one placement record for that application. You can create more placements for this application by using {@link createApplicationPlacement}.", response = ApplicationResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationResponse.class)
    })
    public Response createApplication(@ApiParam(value = "The name of the application", required = true) @QueryParam("appName") @NotNull  String appName,@ApiParam(value = "The unique id of the device making the request (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The description of the application") @QueryParam("about")  String about,@ApiParam(value = "The application bundle identifier (format - com.company.appName)") @QueryParam("bundleId")  String bundleId,@ApiParam(value = "The application icon asset id") @QueryParam("appIconAssetId")  Long appIconAssetId,@ApiParam(value = "The application logo asset id") @QueryParam("appLogoAssetId")  Long appLogoAssetId,@ApiParam(value = "The Facebook application id") @QueryParam("facebookAppId")  String facebookAppId,@ApiParam(value = "The Facebook application secret") @QueryParam("facebookAppSecret")  String facebookAppSecret,@ApiParam(value = "This is the either the 'server key' or 'browser key' generated from google to enable Google Cloud Messaging") @QueryParam("googleApiKey")  String googleApiKey,@ApiParam(value = "Determines whether to update the EULA date") @QueryParam("updateEULADate")  Boolean updateEULADate,@ApiParam(value = "The EULA version") @QueryParam("eulaVersion")  String eulaVersion,@ApiParam(value = "The landing page URL") @QueryParam("landingPageUrl")  String landingPageUrl,@ApiParam(value = "Determines whether to show the application in the activity feed") @QueryParam("showInActivities")  Boolean showInActivities,@ApiParam(value = "The description of the application in the activity feed") @QueryParam("activityDescription")  String activityDescription,@ApiParam(value = "The text to display on the invite page") @QueryParam("inviteWelcomeText")  String inviteWelcomeText,@ApiParam(value = "The url to the application invite page") @QueryParam("invitePageUrl")  String invitePageUrl,@ApiParam(value = "The protocal the app uses to load the app via a browser") @QueryParam("urlScheme")  String urlScheme,@ApiParam(value = "A json object with a list of supported platforms.  ```json {   \"platforms\": [     {       \"deviceId\": 1,       \"minimum\": 230,       \"maximum\": 421,       \"downloadUrl\": \"http://app.store.com/download\",       \"description\": \"description and version info\"     }   ] } ``` ") @QueryParam("platforms")  String platforms,@ApiParam(value = "Json formatted downloadUrls.  ```json {   \"ios\": \"the-url-to-app-store\",    \"android\": \"the-url-to-google-play\" } ```  ") @QueryParam("downloadUrls")  String downloadUrls,@ApiParam(value = "List of categories to apply") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "The type of scoring this application will use {GAME_LEVEL, GAME_OBJECT", allowableValues="GAME_LEVEL, GAME_OBJECT", defaultValue = "GAME_LEVEL") @DefaultValue("GAME_LEVEL") @QueryParam("scoringType")  String scoringType,@ApiParam(value = "The cost of hints", defaultValue = "11") @DefaultValue("11") @QueryParam("hintCost")  Integer hintCost,@ApiParam(value = "The maximum score that will be possible", defaultValue = "125") @DefaultValue("125") @QueryParam("maxScore")  Integer maxScore,@ApiParam(value = "The point-to-ticket conversion ratio", defaultValue = "0.037") @DefaultValue("0.037") @QueryParam("ticketsPerPoint")  Float ticketsPerPoint,@ApiParam(value = "Determines whether the application uses services to save custom game objects", defaultValue = "true") @DefaultValue("true") @QueryParam("hasGameData")  Boolean hasGameData,@ApiParam(value = "Public Notifications") @QueryParam("publicNotifications")  Boolean publicNotifications,@ApiParam(value = "Use Matching Algorithm") @QueryParam("useMatchingAlgorithm")  Boolean useMatchingAlgorithm,@ApiParam(value = "Determines whether earned tickets are applied across all applications", defaultValue = "false") @DefaultValue("false") @QueryParam("globalTickets")  Boolean globalTickets,@ApiParam(value = "The current build version of the application", defaultValue = "1") @DefaultValue("1") @QueryParam("buildVersion")  Float buildVersion,@ApiParam(value = "The current API version the application uses") @QueryParam("apiVersion")  Float apiVersion,@ApiParam(value = "The name of the placement") @QueryParam("placementName")  String placementName,@ApiParam(value = "The description of the placement") @QueryParam("placementDescription")  String placementDescription,@ApiParam(value = "The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM (this is required if a placements is to be created)", allowableValues="CONFIG, BANNER, LEADERBOARD, SKYSCRAPER, VIDEO, ZIP, INTERSTITIAL, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, CUSTOM6, CUSTOM7, CUSTOM8, CUSTOM9, CUSTOM10") @QueryParam("placementSize")  String placementSize,@ApiParam(value = "The height of a custom ad size") @QueryParam("placementHeight")  Integer placementHeight,@ApiParam(value = "The width of a custom ad size") @QueryParam("placementWidth")  Integer placementWidth,@ApiParam(value = "The refresh interval in seconds") @QueryParam("placementRefreshInterval")  Integer placementRefreshInterval,@ApiParam(value = "Generate a custom object store to use", defaultValue = "true") @DefaultValue("true") @QueryParam("createObjectStore")  Boolean createObjectStore,@ApiParam(value = "Determine whether or not public content requires admin approval before it becomes public", defaultValue = "false") @DefaultValue("false") @QueryParam("publicContentApproval")  Boolean publicContentApproval,@ApiParam(value = "Determines whether the application uses production or sandbox services", defaultValue = "false") @DefaultValue("false") @QueryParam("productionMode")  Boolean productionMode,@ApiParam(value = "Minimum Session Length") @QueryParam("minimumSessionLength")  Integer minimumSessionLength,@ApiParam(value = "Session Gap Length") @QueryParam("sessionGapLength")  Integer sessionGapLength,@ApiParam(value = "Local Ads Enabled", defaultValue = "false") @DefaultValue("false") @QueryParam("localAdsEnabled")  Boolean localAdsEnabled,@ApiParam(value = "Sqoot Api Key") @QueryParam("sqootApiKey")  String sqootApiKey,@ApiParam(value = "Determines how to process trilateration data. Possible values include: DEFAULT, FINGERPRINT", allowableValues="DEFAULT, FINGERPRINT, FINGERPRINT_V2", defaultValue = "FINGERPRINT") @DefaultValue("FINGERPRINT") @QueryParam("trilatProcessingType")  String trilatProcessingType,@ApiParam(value = "Determines what the maximum sample size during trilateration") @QueryParam("maxSampleSize")  Integer maxSampleSize,@ApiParam(value = "Determines what the minimum acceptable RSSI value") @QueryParam("minRSSI")  Double minRSSI,@ApiParam(value = "List modules allowed to be served by the server, possible values include: COMMON, MEDIA, OFFER, GAME, SOCIAL, CONSUMER_WEBSITE, ALL", defaultValue = "ALL") @DefaultValue("ALL") @QueryParam("modules")  String modules,@ApiParam(value = "How many servers the license will support", defaultValue = "1") @DefaultValue("1") @QueryParam("authorizedCount")  Integer authorizedCount,@ApiParam(value = "The list of ip addresses of servers the license will support, leave null for any server") @QueryParam("authorizedServers")  String authorizedServers,@ApiParam(value = "Sets the default timezone for the app (used for leaderboards and other time specific content)") @QueryParam("defaultTimezone")  String defaultTimezone,@ApiParam(value = "SMTP Pass") @QueryParam("smtpPass")  String smtpPass,@ApiParam(value = "The application meta data. Defined by the client") @QueryParam("metaData")  String metaData,@ApiParam(value = "The ad placement meta data. Defined by the client") @QueryParam("placementMetaData")  String placementMetaData,@ApiParam(value = "Create floor tables for Ips", defaultValue = "false") @DefaultValue("false") @QueryParam("ipsFloor")  Boolean ipsFloor,@ApiParam(value = "Enables setting the APNS badge value in the payload", defaultValue = "true") @DefaultValue("true") @QueryParam("enableAPNSBadge")  Boolean enableAPNSBadge,@ApiParam(value = "Enables using the application in session reports", defaultValue = "true") @DefaultValue("true") @QueryParam("includeInReport")  Boolean includeInReport,@ApiParam(value = "Sets the default filter to use (if none is passed in) for certain search APIs including Album Search.") @QueryParam("defaultAppFilterId")  Long defaultAppFilterId,@ApiParam(value = "Enables whether the default welcome email will be sent for new app users") @QueryParam("enableWelcomeEmail")  Boolean enableWelcomeEmail,@ApiParam(value = "The Apple Application ID") @QueryParam("appleAppId")  String appleAppId,@ApiParam(value = "The Apple Team ID") @QueryParam("appleTeamId")  String appleTeamId,@ApiParam(value = "The Apple Auth Key ID") @QueryParam("appleAuthKeyId")  String appleAuthKeyId,@ApiParam(value = "The Apple Auth Signin Key (p8) File") @QueryParam("appleAuthKey")  File appleAuthKey,@ApiParam(value = "The Apple Issuer ID") @QueryParam("appleIssuerId")  String appleIssuerId,@ApiParam(value = "The Apple App Store Key ID") @QueryParam("appStoreKeyId")  String appStoreKeyId,@ApiParam(value = "The Apple App Store Key (p8) File") @QueryParam("appStoreKey")  File appStoreKey,@ApiParam(value = "This is the private key file for your Google service account.") @QueryParam("googlePrivateKeyFile")  File googlePrivateKeyFile,@ApiParam(value = "Authorize Net Api Key") @QueryParam("authorizeNetApiKey")  String authorizeNetApiKey,@ApiParam(value = "Authorize Net Transaction Key") @QueryParam("authorizeNetTransactionKey")  String authorizeNetTransactionKey,@ApiParam(value = "Email Sender") @QueryParam("emailSender")  String emailSender,@ApiParam(value = "SMTP User") @QueryParam("smtpUser")  String smtpUser,@ApiParam(value = "SMTP Host") @QueryParam("smtpHost")  String smtpHost,@ApiParam(value = "Vatom Business Id") @QueryParam("vatomBusinessId")  String vatomBusinessId,@ApiParam(value = "Vatom REST Client Id") @QueryParam("vatomRestClientId")  String vatomRestClientId,@ApiParam(value = "Vatom Secret Key") @QueryParam("vatomRestSecretKey")  String vatomRestSecretKey,@ApiParam(value = "Twilio Account SID") @QueryParam("twilioAccountSID")  String twilioAccountSID,@ApiParam(value = "Twilio Auth Token") @QueryParam("twilioAuthToken")  String twilioAuthToken,@ApiParam(value = "Twilio Sender Phone Number") @QueryParam("twilioSenderPhoneNumber")  String twilioSenderPhoneNumber,@ApiParam(value = "OpenAI Secret API Key") @QueryParam("openAISecretKey")  String openAISecretKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createApplication(appName, deviceId, accountId, about, bundleId, appIconAssetId, appLogoAssetId, facebookAppId, facebookAppSecret, googleApiKey, updateEULADate, eulaVersion, landingPageUrl, showInActivities, activityDescription, inviteWelcomeText, invitePageUrl, urlScheme, platforms, downloadUrls, categoryIds, scoringType, hintCost, maxScore, ticketsPerPoint, hasGameData, publicNotifications, useMatchingAlgorithm, globalTickets, buildVersion, apiVersion, placementName, placementDescription, placementSize, placementHeight, placementWidth, placementRefreshInterval, createObjectStore, publicContentApproval, productionMode, minimumSessionLength, sessionGapLength, localAdsEnabled, sqootApiKey, trilatProcessingType, maxSampleSize, minRSSI, modules, authorizedCount, authorizedServers, defaultTimezone, smtpPass, metaData, placementMetaData, ipsFloor, enableAPNSBadge, includeInReport, defaultAppFilterId, enableWelcomeEmail, appleAppId, appleTeamId, appleAuthKeyId, appleAuthKey, appleIssuerId, appStoreKeyId, appStoreKey, googlePrivateKeyFile, authorizeNetApiKey, authorizeNetTransactionKey, emailSender, smtpUser, smtpHost, vatomBusinessId, vatomRestClientId, vatomRestSecretKey, twilioAccountSID, twilioAuthToken, twilioSenderPhoneNumber, openAISecretKey, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/placement/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Ad Placement", notes = "Creates a new ad placement for an application.", response = PlacementResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PlacementResponse.class)
    })
    public Response createApplicationPlacement(@ApiParam(value = "The appKey of the application the ad placement is for", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM", required = true, allowableValues="CONFIG, BANNER, LEADERBOARD, SKYSCRAPER, VIDEO, ZIP, INTERSTITIAL, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, CUSTOM6, CUSTOM7, CUSTOM8, CUSTOM9, CUSTOM10") @QueryParam("size") @NotNull  String size,@ApiParam(value = "The unique id of the device making the request (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The name of the placement") @QueryParam("name")  String name,@ApiParam(value = "The description of the placement") @QueryParam("description")  String description,@ApiParam(value = "The height of a custom ad size") @QueryParam("height")  Integer height,@ApiParam(value = "The width of a custom ad size") @QueryParam("width")  Integer width,@ApiParam(value = "The refresh interval in seconds") @QueryParam("refreshInterval")  Integer refreshInterval,@ApiParam(value = "Default Image Id") @QueryParam("defaultImageId")  Long defaultImageId,@ApiParam(value = "Active") @QueryParam("active")  Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createApplicationPlacement(appKey, size, deviceId, accountId, name, description, height, width, refreshInterval, defaultImageId, active, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Application", notes = "Set the deleted timestamp to current time. This effectively deletes the application since all queries should ignore any records with a deleted timestamp", response = SirqulResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteApplication(@ApiParam(value = "The account used to perform the delete, must have rights to edit the application.") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The key of the application to be deleted") @QueryParam("appKey")  String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteApplication(accountId, appKey, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/placement/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Ad Placement", notes = "Deletes an ad placement for an application.", response = PlacementResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PlacementResponse.class)
    })
    public Response deleteApplicationPlacement(@ApiParam(value = "The id of the placement to delete, the user must have rights to the application the ad placement is for", required = true) @QueryParam("placementId") @NotNull  Long placementId,@ApiParam(value = "The unique id of the device making the request (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteApplicationPlacement(placementId, deviceId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Application", notes = "Get a specific application by appKey", response = ApplicationResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationResponse.class)
    })
    public Response getApplication(@ApiParam(value = "The key of the application") @QueryParam("appKey")  String appKey,@ApiParam(value = "Application Id") @QueryParam("applicationId")  Long applicationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getApplication(appKey, applicationId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/placement/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Ad Placement", notes = "Get details of an ad placement", response = PlacementResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PlacementResponse.class)
    })
    public Response getApplicationPlacement(@ApiParam(value = "The id of the placement", required = true) @QueryParam("placementId") @NotNull  Long placementId,@ApiParam(value = "The unique id of the device making the request (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getApplicationPlacement(placementId, deviceId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/versions")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get API versions", notes = "Will return a comma separated list of numbers, newest first. For example: 3.0, 2.2, 2.1, 1.8", response = SirqulResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response getApplicationVersions(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getApplicationVersions(securityContext);
    }
    @javax.ws.rs.GET
    @Path("/users")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Application Users", notes = "Get a list of users per application", response = AccountListResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AccountListResponse.class)
    })
    public Response getUniqueUsersByApp(@ApiParam(value = "The application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Q") @QueryParam("q")  String q,@ApiParam(value = "The keyword used to search") @QueryParam("keyword")  String keyword,@ApiParam(value = "Return accounts that have been active after this date (UNIX time-stamp in milliseconds)") @QueryParam("since")  Long since,@ApiParam(value = "the start of the index") @QueryParam("_i")  Integer i,@ApiParam(value = "The start of the pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "the limit of the index") @QueryParam("_l")  Integer l,@ApiParam(value = "The limit of the pagination", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUniqueUsersByApp(appKey, q, keyword, since, i, start, l, limit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/list")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Applications", notes = "List active applications matching the criteria (as a consumer)", response = ApplicationShortResponse.class, responseContainer = "List", tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationShortResponse.class, responseContainer = "List")
    })
    public Response listApplications(@ApiParam(value = "The account id of the application owner/manager") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Q") @QueryParam("q")  String q,@ApiParam(value = "The keyword used to search for title, about, and description fields") @QueryParam("keyword")  String keyword,@ApiParam(value = "Deprecated, use deviceIds and deviceVersions") @QueryParam("platforms")  String platforms,@ApiParam(value = "The list of targeted device ids, comma separated; possible values are retreived via /api/{version/audience/devices com.sirqul.geoapps.common.service.AudienceApi#getDevices getDevices (pass in deviceId values)") @QueryParam("deviceIds")  String deviceIds,@ApiParam(value = "The list of targeted device version ranges that are aligned  with the provided devices list (see devices param for possible values),  comma separated; examples are: 2.3-X, 0-5.1.4, 4.3.1-6.1.4 where X  is no maximum and 0 is no minimum. ") @QueryParam("deviceVersions")  String deviceVersions,@ApiParam(value = "The list of category ids to filter the list by") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "The column to sort the search on, possible values include: UPDATED (default), CREATED, TITLE", allowableValues="CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, HAS_ADVERTISEMENTS, PUBLIC_NOTIFICATIONS, PLACEMENTS, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY, TITLE, NAME, ABOUT, DESCRIPTION, APPLICATION_ID, APP_TYPE, GAME_TYPE, BUNDLE_ID, SCORING_TYPE, LANDING_PAGE_URL, EULA_VERSION, BUILD_VERSION, API_VERSION", defaultValue = "UPDATED") @DefaultValue("UPDATED") @QueryParam("sortField")  String sortField,@ApiParam(value = "Filter results on whether the application supports ads or not. Ignore this parameter to return all results.") @QueryParam("hasAds")  Boolean hasAds,@ApiParam(value = "Filter results on whether the application is available for public trigger notifications") @QueryParam("publicNotifications")  Boolean publicNotifications,@ApiParam(value = "Determines whether to only return applications that the user has access to") @QueryParam("filterBillable")  Boolean filterBillable,@ApiParam(value = "Determines whether to only return applications that the user is a content admin of") @QueryParam("filterContentAdmin")  Boolean filterContentAdmin,@ApiParam(value = "The order to return the search results", defaultValue = "true") @DefaultValue("true") @QueryParam("descending")  Boolean descending,@ApiParam(value = "the start of the index") @QueryParam("_i")  Integer i,@ApiParam(value = "The start of the pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "The limit of the index") @QueryParam("_l")  Integer l,@ApiParam(value = "The limit of the pagination", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "The list of application ids, comma separated. If provided will ignore all other params.") @QueryParam("applicationIds")  String applicationIds,@ApiParam(value = "Only include applications with a object store (default is false)", defaultValue = "false") @DefaultValue("false") @QueryParam("hasObjectStore")  Boolean hasObjectStore,@ApiParam(value = "Return only active results", defaultValue = "true") @DefaultValue("true") @QueryParam("activeOnly")  Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listApplications(accountId, q, keyword, platforms, deviceIds, deviceVersions, categoryIds, sortField, hasAds, publicNotifications, filterBillable, filterContentAdmin, descending, i, start, l, limit, applicationIds, hasObjectStore, activeOnly, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/placement/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search for Ad Placements", notes = "Searches placements for an application.", response = PlacementResponse.class, responseContainer = "List", tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PlacementResponse.class, responseContainer = "List")
    })
    public Response searchApplicationPlacement(@ApiParam(value = "The key of the application", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The unique id of the device making the request (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The start of the pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "The limit of the pagination", defaultValue = "100") @DefaultValue("100") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchApplicationPlacement(appKey, deviceId, accountId, start, limit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/settings/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search for Application Settings", notes = "Returns a list of applications that the user has logged into before, and returns specific settings for that application and user", response = ApplicationSettingsResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationSettingsResponse.class)
    })
    public Response searchApplicationSettings(@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The account id used to view another person's account") @QueryParam("connectionAccountId")  Long connectionAccountId,@ApiParam(value = "The string to search applications on") @QueryParam("keyword")  String keyword,@ApiParam(value = "The column to sort the search on. Possible values include: CREATED, UPDATED, APPLICATION_TITLE", defaultValue = "APPLICATION_TITLE") @DefaultValue("APPLICATION_TITLE") @QueryParam("sortField")  String sortField,@ApiParam(value = "The order to return the search results", defaultValue = "false") @DefaultValue("false") @QueryParam("descending")  Boolean descending,@ApiParam(value = "The start index for pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "The limit per result set for pagination", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchApplicationSettings(deviceId, accountId, connectionAccountId, keyword, sortField, descending, start, limit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Applications", notes = "Search for applications matching the criteria that the logged in user has access to", response = ApplicationResponse.class, responseContainer = "List", tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationResponse.class, responseContainer = "List")
    })
    public Response searchApplications(@ApiParam(value = "The unique id of the device making the request (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The location of the device") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The location of the device") @QueryParam("longitude")  Double longitude,@ApiParam(value = "Q") @QueryParam("q")  String q,@ApiParam(value = "The keyword used to search") @QueryParam("keyword")  String keyword,@ApiParam(value = "The columns to applied the keyword search to", defaultValue = "NAME,ABOUT,BILLABLE_ENTITY_NAME") @DefaultValue("NAME,ABOUT,BILLABLE_ENTITY_NAME") @QueryParam("qSearchFields")  String qSearchFields,@ApiParam(value = "The column to sort the search on", allowableValues="CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, HAS_ADVERTISEMENTS, PUBLIC_NOTIFICATIONS, PLACEMENTS, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY, TITLE, NAME, ABOUT, DESCRIPTION, APPLICATION_ID, APP_TYPE, GAME_TYPE, BUNDLE_ID, SCORING_TYPE, LANDING_PAGE_URL, EULA_VERSION, BUILD_VERSION, API_VERSION", defaultValue = "APPLICATION_ID") @DefaultValue("APPLICATION_ID") @QueryParam("sortField")  String sortField,@ApiParam(value = "The order to return the search results", defaultValue = "false") @DefaultValue("false") @QueryParam("descending")  Boolean descending,@ApiParam(value = "the start of the index") @QueryParam("_i")  Integer i,@ApiParam(value = "The start of the pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "the limit of the index") @QueryParam("_l")  Integer l,@ApiParam(value = "The limit of the pagination", defaultValue = "100") @DefaultValue("100") @QueryParam("limit")  Integer limit,@ApiParam(value = "Filter results on whether the application supports ads or not. Ignore this parameter to return all results.") @QueryParam("hasAds")  Boolean hasAds,@ApiParam(value = "Filter results on whether the application is available for public trigger notifications") @QueryParam("publicNotifications")  Boolean publicNotifications,@ApiParam(value = "Return only active results", defaultValue = "false") @DefaultValue("false") @QueryParam("activeOnly")  Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchApplications(deviceId, accountId, latitude, longitude, q, keyword, qSearchFields, sortField, descending, i, start, l, limit, hasAds, publicNotifications, activeOnly, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Application", notes = "Update an application record", response = ApplicationResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationResponse.class)
    })
    public Response updateApplication(@ApiParam(value = "The application key for updating an existing application", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The name of the application", required = true) @QueryParam("appName") @NotNull  String appName,@ApiParam(value = "The unique id of the device making the request (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The description of the application") @QueryParam("about")  String about,@ApiParam(value = "The application bundle identifier (format - com.company.appName)") @QueryParam("bundleId")  String bundleId,@ApiParam(value = "The application icon asset id") @QueryParam("appIconAssetId")  Long appIconAssetId,@ApiParam(value = "The application logo asset id") @QueryParam("appLogoAssetId")  Long appLogoAssetId,@ApiParam(value = "The Facebook application id") @QueryParam("facebookAppId")  String facebookAppId,@ApiParam(value = "The Facebook application secret") @QueryParam("facebookAppSecret")  String facebookAppSecret,@ApiParam(value = "This is the either the 'server key' or 'browser key' generated from google to enable Google Cloud Messaging") @QueryParam("googleApiKey")  String googleApiKey,@ApiParam(value = "Determines whether to update the EULA date") @QueryParam("updateEULADate")  Boolean updateEULADate,@ApiParam(value = "The EULA version") @QueryParam("eulaVersion")  String eulaVersion,@ApiParam(value = "The landing page URL") @QueryParam("landingPageUrl")  String landingPageUrl,@ApiParam(value = "Determines whether to show the application in the activity feed") @QueryParam("showInActivities")  Boolean showInActivities,@ApiParam(value = "The description of the application in the activity feed") @QueryParam("activityDescription")  String activityDescription,@ApiParam(value = "The text to display on the invite page") @QueryParam("inviteWelcomeText")  String inviteWelcomeText,@ApiParam(value = "The url to the application invite page") @QueryParam("invitePageUrl")  String invitePageUrl,@ApiParam(value = "The protocal the app uses to load the app via a browser") @QueryParam("urlScheme")  String urlScheme,@ApiParam(value = "A json object with a list of supported platforms.  ```json {   \"platforms\": [     {       \"deviceId\": 1,       \"minimum\": 230,       \"maximum\": 421,       \"downloadUrl\": \"http://app.store.com/download\",       \"description\": \"description and version info\"     }   ] } ``` ") @QueryParam("platforms")  String platforms,@ApiParam(value = "Json formatted downloadUrls.  ```json {   \"ios\": \"the-url-to-app-store\",    \"android\": \"the-url-to-google-play\" } ```  ") @QueryParam("downloadUrls")  String downloadUrls,@ApiParam(value = "List of categories to apply") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "The type of scoring this application will use {GAME_LEVEL, GAME_OBJECT", allowableValues="GAME_LEVEL, GAME_OBJECT", defaultValue = "GAME_LEVEL") @DefaultValue("GAME_LEVEL") @QueryParam("scoringType")  String scoringType,@ApiParam(value = "The cost of hints", defaultValue = "11") @DefaultValue("11") @QueryParam("hintCost")  Integer hintCost,@ApiParam(value = "The maximum score that will be possible", defaultValue = "125") @DefaultValue("125") @QueryParam("maxScore")  Integer maxScore,@ApiParam(value = "The point-to-ticket conversion ratio", defaultValue = "0.037") @DefaultValue("0.037") @QueryParam("ticketsPerPoint")  Float ticketsPerPoint,@ApiParam(value = "Determines whether the application uses services to save custom game objects", defaultValue = "true") @DefaultValue("true") @QueryParam("hasGameData")  Boolean hasGameData,@ApiParam(value = "Public Notifications") @QueryParam("publicNotifications")  Boolean publicNotifications,@ApiParam(value = "Use Matching Algorithm") @QueryParam("useMatchingAlgorithm")  Boolean useMatchingAlgorithm,@ApiParam(value = "Determines whether earned tickets are applied across all applications", defaultValue = "false") @DefaultValue("false") @QueryParam("globalTickets")  Boolean globalTickets,@ApiParam(value = "The current build version of the application", defaultValue = "1") @DefaultValue("1") @QueryParam("buildVersion")  Float buildVersion,@ApiParam(value = "The current API version the application uses") @QueryParam("apiVersion")  Float apiVersion,@ApiParam(value = "The name of the placement") @QueryParam("placementName")  String placementName,@ApiParam(value = "The description of the placement") @QueryParam("placementDescription")  String placementDescription,@ApiParam(value = "The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM (this is required if a placements is to be created)", allowableValues="CONFIG, BANNER, LEADERBOARD, SKYSCRAPER, VIDEO, ZIP, INTERSTITIAL, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, CUSTOM6, CUSTOM7, CUSTOM8, CUSTOM9, CUSTOM10") @QueryParam("placementSize")  String placementSize,@ApiParam(value = "The height of a custom ad size") @QueryParam("placementHeight")  Integer placementHeight,@ApiParam(value = "The width of a custom ad size") @QueryParam("placementWidth")  Integer placementWidth,@ApiParam(value = "The refresh interval in seconds") @QueryParam("placementRefreshInterval")  Integer placementRefreshInterval,@ApiParam(value = "Generate a custom object store to use", defaultValue = "true") @DefaultValue("true") @QueryParam("createObjectStore")  Boolean createObjectStore,@ApiParam(value = "Determine whether or not public content requires admin approval before it becomes public", defaultValue = "false") @DefaultValue("false") @QueryParam("publicContentApproval")  Boolean publicContentApproval,@ApiParam(value = "Determines whether the application uses production or sandbox services", defaultValue = "false") @DefaultValue("false") @QueryParam("productionMode")  Boolean productionMode,@ApiParam(value = "Minimum Session Length") @QueryParam("minimumSessionLength")  Integer minimumSessionLength,@ApiParam(value = "Session Gap Length") @QueryParam("sessionGapLength")  Integer sessionGapLength,@ApiParam(value = "Local Ads Enabled", defaultValue = "false") @DefaultValue("false") @QueryParam("localAdsEnabled")  Boolean localAdsEnabled,@ApiParam(value = "Sqoot Api Key") @QueryParam("sqootApiKey")  String sqootApiKey,@ApiParam(value = "Determines how to process trilateration data. Possible values include: DEFAULT, FINGERPRINT", allowableValues="DEFAULT, FINGERPRINT, FINGERPRINT_V2", defaultValue = "FINGERPRINT") @DefaultValue("FINGERPRINT") @QueryParam("trilatProcessingType")  String trilatProcessingType,@ApiParam(value = "Determines what the maximum sample size during trilateration") @QueryParam("maxSampleSize")  Integer maxSampleSize,@ApiParam(value = "Determines what the minimum acceptable RSSI value") @QueryParam("minRSSI")  Double minRSSI,@ApiParam(value = "List modules allowed to be served by the server, possible values include: COMMON, MEDIA, OFFER, GAME, SOCIAL, CONSUMER_WEBSITE, ALL", defaultValue = "ALL") @DefaultValue("ALL") @QueryParam("modules")  String modules,@ApiParam(value = "How many servers the license will support", defaultValue = "1") @DefaultValue("1") @QueryParam("authorizedCount")  Integer authorizedCount,@ApiParam(value = "The list of ip addresses of servers the license will support, leave null for any server") @QueryParam("authorizedServers")  String authorizedServers,@ApiParam(value = "Sets the default timezone for the app (used for leaderboards and other time specific content)") @QueryParam("defaultTimezone")  String defaultTimezone,@ApiParam(value = "SMTP Pass") @QueryParam("smtpPass")  String smtpPass,@ApiParam(value = "The application meta data. Defined by the client") @QueryParam("metaData")  String metaData,@ApiParam(value = "The ad placement meta data. Defined by the client") @QueryParam("placementMetaData")  String placementMetaData,@ApiParam(value = "Create floor tables for Ips", defaultValue = "false") @DefaultValue("false") @QueryParam("ipsFloor")  Boolean ipsFloor,@ApiParam(value = "Enables setting the APNS badge value in the payload", defaultValue = "true") @DefaultValue("true") @QueryParam("enableAPNSBadge")  Boolean enableAPNSBadge,@ApiParam(value = "Enables using the application in session reports", defaultValue = "true") @DefaultValue("true") @QueryParam("includeInReport")  Boolean includeInReport,@ApiParam(value = "Sets the default filter to use (if none is passed in) for certain search APIs including Album Search.") @QueryParam("defaultAppFilterId")  Long defaultAppFilterId,@ApiParam(value = "Enables whether the default welcome email will be sent for new app users") @QueryParam("enableWelcomeEmail")  Boolean enableWelcomeEmail,@ApiParam(value = "The Apple Application ID") @QueryParam("appleAppId")  String appleAppId,@ApiParam(value = "The Apple Team ID") @QueryParam("appleTeamId")  String appleTeamId,@ApiParam(value = "The Apple Auth Key ID") @QueryParam("appleAuthKeyId")  String appleAuthKeyId,@ApiParam(value = "The Apple Auth Signin Key (p8) File") @QueryParam("appleAuthKey")  File appleAuthKey,@ApiParam(value = "The Apple Issuer ID") @QueryParam("appleIssuerId")  String appleIssuerId,@ApiParam(value = "The Apple App Store Key ID") @QueryParam("appStoreKeyId")  String appStoreKeyId,@ApiParam(value = "The Apple App Store Key (p8) File") @QueryParam("appStoreKey")  File appStoreKey,@ApiParam(value = "This is the private key file for your Google service account.") @QueryParam("googlePrivateKeyFile")  File googlePrivateKeyFile,@ApiParam(value = "Authorize Net Api Key") @QueryParam("authorizeNetApiKey")  String authorizeNetApiKey,@ApiParam(value = "Authorize Net Transaction Key") @QueryParam("authorizeNetTransactionKey")  String authorizeNetTransactionKey,@ApiParam(value = "Email Sender") @QueryParam("emailSender")  String emailSender,@ApiParam(value = "SMTP User") @QueryParam("smtpUser")  String smtpUser,@ApiParam(value = "SMTP Host") @QueryParam("smtpHost")  String smtpHost,@ApiParam(value = "Vatom Business Id") @QueryParam("vatomBusinessId")  String vatomBusinessId,@ApiParam(value = "Vatom REST Client Id") @QueryParam("vatomRestClientId")  String vatomRestClientId,@ApiParam(value = "Vatom Secret Key") @QueryParam("vatomRestSecretKey")  String vatomRestSecretKey,@ApiParam(value = "Twilio Account SID") @QueryParam("twilioAccountSID")  String twilioAccountSID,@ApiParam(value = "Twilio Auth Token") @QueryParam("twilioAuthToken")  String twilioAuthToken,@ApiParam(value = "Twilio Sender Phone Number") @QueryParam("twilioSenderPhoneNumber")  String twilioSenderPhoneNumber,@ApiParam(value = "OpenAI Secret API Key") @QueryParam("openAISecretKey")  String openAISecretKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateApplication(appKey, appName, deviceId, accountId, about, bundleId, appIconAssetId, appLogoAssetId, facebookAppId, facebookAppSecret, googleApiKey, updateEULADate, eulaVersion, landingPageUrl, showInActivities, activityDescription, inviteWelcomeText, invitePageUrl, urlScheme, platforms, downloadUrls, categoryIds, scoringType, hintCost, maxScore, ticketsPerPoint, hasGameData, publicNotifications, useMatchingAlgorithm, globalTickets, buildVersion, apiVersion, placementName, placementDescription, placementSize, placementHeight, placementWidth, placementRefreshInterval, createObjectStore, publicContentApproval, productionMode, minimumSessionLength, sessionGapLength, localAdsEnabled, sqootApiKey, trilatProcessingType, maxSampleSize, minRSSI, modules, authorizedCount, authorizedServers, defaultTimezone, smtpPass, metaData, placementMetaData, ipsFloor, enableAPNSBadge, includeInReport, defaultAppFilterId, enableWelcomeEmail, appleAppId, appleTeamId, appleAuthKeyId, appleAuthKey, appleIssuerId, appStoreKeyId, appStoreKey, googlePrivateKeyFile, authorizeNetApiKey, authorizeNetTransactionKey, emailSender, smtpUser, smtpHost, vatomBusinessId, vatomRestClientId, vatomRestSecretKey, twilioAccountSID, twilioAuthToken, twilioSenderPhoneNumber, openAISecretKey, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/active")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Change Appliation Status", notes = "Set the application's active flag to true/false. This effectively activates or deactivates the application.", response = SirqulResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response updateApplicationActive(@ApiParam(value = "The account used to perform the delete, must have rights to edit the application.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The key of the application to be deleted", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "If true then set to active, false otherwise", required = true) @QueryParam("active") @NotNull  Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateApplicationActive(accountId, appKey, active, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/placement/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Ad Placement", notes = "Updates an ad placement for an application.", response = PlacementResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PlacementResponse.class)
    })
    public Response updateApplicationPlacement(@ApiParam(value = "The id of the placement to update, the user must have rights to the application the ad placement is for", required = true) @QueryParam("placementId") @NotNull  Long placementId,@ApiParam(value = "The unique id of the device making the request (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The name of the placement") @QueryParam("name")  String name,@ApiParam(value = "The description of the placement") @QueryParam("description")  String description,@ApiParam(value = "The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM", allowableValues="CONFIG, BANNER, LEADERBOARD, SKYSCRAPER, VIDEO, ZIP, INTERSTITIAL, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, CUSTOM6, CUSTOM7, CUSTOM8, CUSTOM9, CUSTOM10") @QueryParam("size")  String size,@ApiParam(value = "The height of a custom ad size") @QueryParam("height")  Integer height,@ApiParam(value = "The width of a custom ad size") @QueryParam("width")  Integer width,@ApiParam(value = "The refresh interval in seconds") @QueryParam("refreshInterval")  Integer refreshInterval,@ApiParam(value = "Default Image Id") @QueryParam("defaultImageId")  Long defaultImageId,@ApiParam(value = "Active") @QueryParam("active")  Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateApplicationPlacement(placementId, deviceId, accountId, name, description, size, height, width, refreshInterval, defaultImageId, active, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/certificate/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Application Certificate", notes = "Uploads a certificate for an application that the user has access to.", response = SirqulResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response uploadApplicationCertificate(@ApiParam(value = "The key of the application", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Device Id") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account used to perform the delete, must have rights to edit the application.") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Certificate") @QueryParam("certificate")  File certificate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.uploadApplicationCertificate(appKey, deviceId, accountId, certificate, securityContext);
    }
}
