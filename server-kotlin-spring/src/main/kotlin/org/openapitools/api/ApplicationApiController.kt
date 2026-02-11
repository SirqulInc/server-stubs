package org.openapitools.api

import org.openapitools.model.AccountListResponse
import org.openapitools.model.ApplicationResponse
import org.openapitools.model.ApplicationSettingsResponse
import org.openapitools.model.ApplicationShortResponse
import org.openapitools.model.PlacementResponse
import org.openapitools.model.SirqulResponse
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/api/3.18}")
class ApplicationApiController() {

    @Operation(
        summary = "Create Application",
        operationId = "createApplication",
        description = """Create an application record and one placement record for that application. You can create more placements for this application by using {@link createApplicationPlacement}.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ApplicationResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/application/create"
        value = [PATH_CREATE_APPLICATION],
        produces = ["*/*"]
    )
    fun createApplication(
        @NotNull @Parameter(description = "The name of the application", required = true) @Valid @RequestParam(value = "appName", required = true) appName: kotlin.String,
        @Parameter(description = "The unique id of the device making the request (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The description of the application") @Valid @RequestParam(value = "about", required = false) about: kotlin.String?,
        @Parameter(description = "The application bundle identifier (format - com.company.appName)") @Valid @RequestParam(value = "bundleId", required = false) bundleId: kotlin.String?,
        @Parameter(description = "The application icon asset id") @Valid @RequestParam(value = "appIconAssetId", required = false) appIconAssetId: kotlin.Long?,
        @Parameter(description = "The application logo asset id") @Valid @RequestParam(value = "appLogoAssetId", required = false) appLogoAssetId: kotlin.Long?,
        @Parameter(description = "The Facebook application id") @Valid @RequestParam(value = "facebookAppId", required = false) facebookAppId: kotlin.String?,
        @Parameter(description = "The Facebook application secret") @Valid @RequestParam(value = "facebookAppSecret", required = false) facebookAppSecret: kotlin.String?,
        @Parameter(description = "This is the either the 'server key' or 'browser key' generated from google to enable Google Cloud Messaging") @Valid @RequestParam(value = "googleApiKey", required = false) googleApiKey: kotlin.String?,
        @Parameter(description = "Determines whether to update the EULA date") @Valid @RequestParam(value = "updateEULADate", required = false) updateEULADate: kotlin.Boolean?,
        @Parameter(description = "The EULA version") @Valid @RequestParam(value = "eulaVersion", required = false) eulaVersion: kotlin.String?,
        @Parameter(description = "The landing page URL") @Valid @RequestParam(value = "landingPageUrl", required = false) landingPageUrl: kotlin.String?,
        @Parameter(description = "Determines whether to show the application in the activity feed") @Valid @RequestParam(value = "showInActivities", required = false) showInActivities: kotlin.Boolean?,
        @Parameter(description = "The description of the application in the activity feed") @Valid @RequestParam(value = "activityDescription", required = false) activityDescription: kotlin.String?,
        @Parameter(description = "The text to display on the invite page") @Valid @RequestParam(value = "inviteWelcomeText", required = false) inviteWelcomeText: kotlin.String?,
        @Parameter(description = "The url to the application invite page") @Valid @RequestParam(value = "invitePageUrl", required = false) invitePageUrl: kotlin.String?,
        @Parameter(description = "The protocal the app uses to load the app via a browser") @Valid @RequestParam(value = "urlScheme", required = false) urlScheme: kotlin.String?,
        @Parameter(description = "A json object with a list of supported platforms.  ```json {   \"platforms\": [     {       \"deviceId\": 1,       \"minimum\": 230,       \"maximum\": 421,       \"downloadUrl\": \"http://app.store.com/download\",       \"description\": \"description and version info\"     }   ] } ``` ") @Valid @RequestParam(value = "platforms", required = false) platforms: kotlin.String?,
        @Parameter(description = "Json formatted downloadUrls.  ```json {   \"ios\": \"the-url-to-app-store\",    \"android\": \"the-url-to-google-play\" } ```  ") @Valid @RequestParam(value = "downloadUrls", required = false) downloadUrls: kotlin.String?,
        @Parameter(description = "List of categories to apply") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "The type of scoring this application will use {GAME_LEVEL, GAME_OBJECT", schema = Schema(allowableValues = ["GAME_LEVEL", "GAME_OBJECT"], defaultValue = "GAME_LEVEL")) @Valid @RequestParam(value = "scoringType", required = false, defaultValue = "GAME_LEVEL") scoringType: kotlin.String,
        @Parameter(description = "The cost of hints", schema = Schema(defaultValue = "11")) @Valid @RequestParam(value = "hintCost", required = false, defaultValue = "11") hintCost: kotlin.Int,
        @Parameter(description = "The maximum score that will be possible", schema = Schema(defaultValue = "125")) @Valid @RequestParam(value = "maxScore", required = false, defaultValue = "125") maxScore: kotlin.Int,
        @Parameter(description = "The point-to-ticket conversion ratio", schema = Schema(defaultValue = "0.037f")) @Valid @RequestParam(value = "ticketsPerPoint", required = false, defaultValue = "0.037f") ticketsPerPoint: kotlin.Float,
        @Parameter(description = "Determines whether the application uses services to save custom game objects", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "hasGameData", required = false, defaultValue = "true") hasGameData: kotlin.Boolean,
        @Parameter(description = "Public Notifications") @Valid @RequestParam(value = "publicNotifications", required = false) publicNotifications: kotlin.Boolean?,
        @Parameter(description = "Use Matching Algorithm") @Valid @RequestParam(value = "useMatchingAlgorithm", required = false) useMatchingAlgorithm: kotlin.Boolean?,
        @Parameter(description = "Determines whether earned tickets are applied across all applications", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "globalTickets", required = false, defaultValue = "false") globalTickets: kotlin.Boolean,
        @Parameter(description = "The current build version of the application", schema = Schema(defaultValue = "1f")) @Valid @RequestParam(value = "buildVersion", required = false, defaultValue = "1f") buildVersion: kotlin.Float,
        @Parameter(description = "The current API version the application uses") @Valid @RequestParam(value = "apiVersion", required = false) apiVersion: kotlin.Float?,
        @Parameter(description = "The name of the placement") @Valid @RequestParam(value = "placementName", required = false) placementName: kotlin.String?,
        @Parameter(description = "The description of the placement") @Valid @RequestParam(value = "placementDescription", required = false) placementDescription: kotlin.String?,
        @Parameter(description = "The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM (this is required if a placements is to be created)", schema = Schema(allowableValues = ["CONFIG", "BANNER", "LEADERBOARD", "SKYSCRAPER", "VIDEO", "ZIP", "INTERSTITIAL", "CUSTOM1", "CUSTOM2", "CUSTOM3", "CUSTOM4", "CUSTOM5", "CUSTOM6", "CUSTOM7", "CUSTOM8", "CUSTOM9", "CUSTOM10"])) @Valid @RequestParam(value = "placementSize", required = false) placementSize: kotlin.String?,
        @Parameter(description = "The height of a custom ad size") @Valid @RequestParam(value = "placementHeight", required = false) placementHeight: kotlin.Int?,
        @Parameter(description = "The width of a custom ad size") @Valid @RequestParam(value = "placementWidth", required = false) placementWidth: kotlin.Int?,
        @Parameter(description = "The refresh interval in seconds") @Valid @RequestParam(value = "placementRefreshInterval", required = false) placementRefreshInterval: kotlin.Int?,
        @Parameter(description = "Generate a custom object store to use", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "createObjectStore", required = false, defaultValue = "true") createObjectStore: kotlin.Boolean,
        @Parameter(description = "Determine whether or not public content requires admin approval before it becomes public", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "publicContentApproval", required = false, defaultValue = "false") publicContentApproval: kotlin.Boolean,
        @Parameter(description = "Determines whether the application uses production or sandbox services", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "productionMode", required = false, defaultValue = "false") productionMode: kotlin.Boolean,
        @Parameter(description = "Minimum Session Length") @Valid @RequestParam(value = "minimumSessionLength", required = false) minimumSessionLength: kotlin.Int?,
        @Parameter(description = "Session Gap Length") @Valid @RequestParam(value = "sessionGapLength", required = false) sessionGapLength: kotlin.Int?,
        @Parameter(description = "Local Ads Enabled", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "localAdsEnabled", required = false, defaultValue = "false") localAdsEnabled: kotlin.Boolean,
        @Parameter(description = "Sqoot Api Key") @Valid @RequestParam(value = "sqootApiKey", required = false) sqootApiKey: kotlin.String?,
        @Parameter(description = "Determines how to process trilateration data. Possible values include: DEFAULT, FINGERPRINT", schema = Schema(allowableValues = ["DEFAULT", "FINGERPRINT", "FINGERPRINT_V2"], defaultValue = "FINGERPRINT")) @Valid @RequestParam(value = "trilatProcessingType", required = false, defaultValue = "FINGERPRINT") trilatProcessingType: kotlin.String,
        @Parameter(description = "Determines what the maximum sample size during trilateration") @Valid @RequestParam(value = "maxSampleSize", required = false) maxSampleSize: kotlin.Int?,
        @Parameter(description = "Determines what the minimum acceptable RSSI value") @Valid @RequestParam(value = "minRSSI", required = false) minRSSI: kotlin.Double?,
        @Parameter(description = "List modules allowed to be served by the server, possible values include: COMMON, MEDIA, OFFER, GAME, SOCIAL, CONSUMER_WEBSITE, ALL", schema = Schema(defaultValue = "ALL")) @Valid @RequestParam(value = "modules", required = false, defaultValue = "ALL") modules: kotlin.String,
        @Parameter(description = "How many servers the license will support", schema = Schema(defaultValue = "1")) @Valid @RequestParam(value = "authorizedCount", required = false, defaultValue = "1") authorizedCount: kotlin.Int,
        @Parameter(description = "The list of ip addresses of servers the license will support, leave null for any server") @Valid @RequestParam(value = "authorizedServers", required = false) authorizedServers: kotlin.String?,
        @Parameter(description = "Sets the default timezone for the app (used for leaderboards and other time specific content)") @Valid @RequestParam(value = "defaultTimezone", required = false) defaultTimezone: kotlin.String?,
        @Parameter(description = "SMTP Pass") @Valid @RequestParam(value = "smtpPass", required = false) smtpPass: kotlin.String?,
        @Parameter(description = "The application meta data. Defined by the client") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "The ad placement meta data. Defined by the client") @Valid @RequestParam(value = "placementMetaData", required = false) placementMetaData: kotlin.String?,
        @Parameter(description = "Create floor tables for Ips", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "ipsFloor", required = false, defaultValue = "false") ipsFloor: kotlin.Boolean,
        @Parameter(description = "Enables setting the APNS badge value in the payload", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "enableAPNSBadge", required = false, defaultValue = "true") enableAPNSBadge: kotlin.Boolean,
        @Parameter(description = "Enables using the application in session reports", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "includeInReport", required = false, defaultValue = "true") includeInReport: kotlin.Boolean,
        @Parameter(description = "Sets the default filter to use (if none is passed in) for certain search APIs including Album Search.") @Valid @RequestParam(value = "defaultAppFilterId", required = false) defaultAppFilterId: kotlin.Long?,
        @Parameter(description = "Enables whether the default welcome email will be sent for new app users") @Valid @RequestParam(value = "enableWelcomeEmail", required = false) enableWelcomeEmail: kotlin.Boolean?,
        @Parameter(description = "The Apple Application ID") @Valid @RequestParam(value = "appleAppId", required = false) appleAppId: kotlin.String?,
        @Parameter(description = "The Apple Team ID") @Valid @RequestParam(value = "appleTeamId", required = false) appleTeamId: kotlin.String?,
        @Parameter(description = "The Apple Auth Key ID") @Valid @RequestParam(value = "appleAuthKeyId", required = false) appleAuthKeyId: kotlin.String?,
        @Parameter(description = "The Apple Auth Signin Key (p8) File") @Valid @RequestParam(value = "appleAuthKey", required = false) appleAuthKey: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "The Apple Issuer ID") @Valid @RequestParam(value = "appleIssuerId", required = false) appleIssuerId: kotlin.String?,
        @Parameter(description = "The Apple App Store Key ID") @Valid @RequestParam(value = "appStoreKeyId", required = false) appStoreKeyId: kotlin.String?,
        @Parameter(description = "The Apple App Store Key (p8) File") @Valid @RequestParam(value = "appStoreKey", required = false) appStoreKey: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "This is the private key file for your Google service account.") @Valid @RequestParam(value = "googlePrivateKeyFile", required = false) googlePrivateKeyFile: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "Authorize Net Api Key") @Valid @RequestParam(value = "authorizeNetApiKey", required = false) authorizeNetApiKey: kotlin.String?,
        @Parameter(description = "Authorize Net Transaction Key") @Valid @RequestParam(value = "authorizeNetTransactionKey", required = false) authorizeNetTransactionKey: kotlin.String?,
        @Parameter(description = "Email Sender") @Valid @RequestParam(value = "emailSender", required = false) emailSender: kotlin.String?,
        @Parameter(description = "SMTP User") @Valid @RequestParam(value = "smtpUser", required = false) smtpUser: kotlin.String?,
        @Parameter(description = "SMTP Host") @Valid @RequestParam(value = "smtpHost", required = false) smtpHost: kotlin.String?,
        @Parameter(description = "Vatom Business Id") @Valid @RequestParam(value = "vatomBusinessId", required = false) vatomBusinessId: kotlin.String?,
        @Parameter(description = "Vatom REST Client Id") @Valid @RequestParam(value = "vatomRestClientId", required = false) vatomRestClientId: kotlin.String?,
        @Parameter(description = "Vatom Secret Key") @Valid @RequestParam(value = "vatomRestSecretKey", required = false) vatomRestSecretKey: kotlin.String?,
        @Parameter(description = "Twilio Account SID") @Valid @RequestParam(value = "twilioAccountSID", required = false) twilioAccountSID: kotlin.String?,
        @Parameter(description = "Twilio Auth Token") @Valid @RequestParam(value = "twilioAuthToken", required = false) twilioAuthToken: kotlin.String?,
        @Parameter(description = "Twilio Sender Phone Number") @Valid @RequestParam(value = "twilioSenderPhoneNumber", required = false) twilioSenderPhoneNumber: kotlin.String?,
        @Parameter(description = "OpenAI Secret API Key") @Valid @RequestParam(value = "openAISecretKey", required = false) openAISecretKey: kotlin.String?
    ): ResponseEntity<ApplicationResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Ad Placement",
        operationId = "createApplicationPlacement",
        description = """Creates a new ad placement for an application.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PlacementResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/application/placement/create"
        value = [PATH_CREATE_APPLICATION_PLACEMENT],
        produces = ["*/*"]
    )
    fun createApplicationPlacement(
        @NotNull @Parameter(description = "The appKey of the application the ad placement is for", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM", required = true, schema = Schema(allowableValues = ["CONFIG", "BANNER", "LEADERBOARD", "SKYSCRAPER", "VIDEO", "ZIP", "INTERSTITIAL", "CUSTOM1", "CUSTOM2", "CUSTOM3", "CUSTOM4", "CUSTOM5", "CUSTOM6", "CUSTOM7", "CUSTOM8", "CUSTOM9", "CUSTOM10"])) @Valid @RequestParam(value = "size", required = true) size: kotlin.String,
        @Parameter(description = "The unique id of the device making the request (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The name of the placement") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "The description of the placement") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "The height of a custom ad size") @Valid @RequestParam(value = "height", required = false) height: kotlin.Int?,
        @Parameter(description = "The width of a custom ad size") @Valid @RequestParam(value = "width", required = false) width: kotlin.Int?,
        @Parameter(description = "The refresh interval in seconds") @Valid @RequestParam(value = "refreshInterval", required = false) refreshInterval: kotlin.Int?,
        @Parameter(description = "Default Image Id") @Valid @RequestParam(value = "defaultImageId", required = false) defaultImageId: kotlin.Long?,
        @Parameter(description = "Active") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?
    ): ResponseEntity<PlacementResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Application",
        operationId = "deleteApplication",
        description = """Set the deleted timestamp to current time. This effectively deletes the application since all queries should ignore any records with a deleted timestamp""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/application/delete"
        value = [PATH_DELETE_APPLICATION],
        produces = ["*/*"]
    )
    fun deleteApplication(
        @Parameter(description = "The account used to perform the delete, must have rights to edit the application.") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The key of the application to be deleted") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Ad Placement",
        operationId = "deleteApplicationPlacement",
        description = """Deletes an ad placement for an application.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PlacementResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/application/placement/delete"
        value = [PATH_DELETE_APPLICATION_PLACEMENT],
        produces = ["*/*"]
    )
    fun deleteApplicationPlacement(
        @NotNull @Parameter(description = "The id of the placement to delete, the user must have rights to the application the ad placement is for", required = true) @Valid @RequestParam(value = "placementId", required = true) placementId: kotlin.Long,
        @Parameter(description = "The unique id of the device making the request (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<PlacementResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Application",
        operationId = "getApplication",
        description = """Get a specific application by appKey""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ApplicationResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/application/get"
        value = [PATH_GET_APPLICATION],
        produces = ["*/*"]
    )
    fun getApplication(
        @Parameter(description = "The key of the application") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Application Id") @Valid @RequestParam(value = "applicationId", required = false) applicationId: kotlin.Long?
    ): ResponseEntity<ApplicationResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Ad Placement",
        operationId = "getApplicationPlacement",
        description = """Get details of an ad placement""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PlacementResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/application/placement/get"
        value = [PATH_GET_APPLICATION_PLACEMENT],
        produces = ["*/*"]
    )
    fun getApplicationPlacement(
        @NotNull @Parameter(description = "The id of the placement", required = true) @Valid @RequestParam(value = "placementId", required = true) placementId: kotlin.Long,
        @Parameter(description = "The unique id of the device making the request (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<PlacementResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get API versions",
        operationId = "getApplicationVersions",
        description = """Will return a comma separated list of numbers, newest first. For example: 3.0, 2.2, 2.1, 1.8""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/application/versions"
        value = [PATH_GET_APPLICATION_VERSIONS],
        produces = ["*/*"]
    )
    fun getApplicationVersions(): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Application Users",
        operationId = "getUniqueUsersByApp",
        description = """Get a list of users per application""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AccountListResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/application/users"
        value = [PATH_GET_UNIQUE_USERS_BY_APP],
        produces = ["*/*"]
    )
    fun getUniqueUsersByApp(
        @NotNull @Parameter(description = "The application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "Q") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?,
        @Parameter(description = "The keyword used to search") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "Return accounts that have been active after this date (UNIX time-stamp in milliseconds)") @Valid @RequestParam(value = "since", required = false) since: kotlin.Long?,
        @Parameter(description = "the start of the index") @Valid @RequestParam(value = "_i", required = false) i: kotlin.Int?,
        @Parameter(description = "The start of the pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "the limit of the index") @Valid @RequestParam(value = "_l", required = false) l: kotlin.Int?,
        @Parameter(description = "The limit of the pagination", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int
    ): ResponseEntity<AccountListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List Applications",
        operationId = "listApplications",
        description = """List active applications matching the criteria (as a consumer)""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = ApplicationShortResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/application/list"
        value = [PATH_LIST_APPLICATIONS],
        produces = ["*/*"]
    )
    fun listApplications(
        @Parameter(description = "The account id of the application owner/manager") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Q") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?,
        @Parameter(description = "The keyword used to search for title, about, and description fields") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "Deprecated, use deviceIds and deviceVersions") @Valid @RequestParam(value = "platforms", required = false) platforms: kotlin.String?,
        @Parameter(description = "The list of targeted device ids, comma separated; possible values are retreived via /api/{version/audience/devices com.sirqul.geoapps.common.service.AudienceApi#getDevices getDevices (pass in deviceId values)") @Valid @RequestParam(value = "deviceIds", required = false) deviceIds: kotlin.String?,
        @Parameter(description = "The list of targeted device version ranges that are aligned  with the provided devices list (see devices param for possible values),  comma separated; examples are: 2.3-X, 0-5.1.4, 4.3.1-6.1.4 where X  is no maximum and 0 is no minimum. ") @Valid @RequestParam(value = "deviceVersions", required = false) deviceVersions: kotlin.String?,
        @Parameter(description = "The list of category ids to filter the list by") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "The column to sort the search on, possible values include: UPDATED (default), CREATED, TITLE", schema = Schema(allowableValues = ["CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "HAS_ADVERTISEMENTS", "PUBLIC_NOTIFICATIONS", "PLACEMENTS", "BILLABLE_ENTITY_ID", "BILLABLE_ENTITY_NAME", "RESPONSIBLE_DISPLAY", "TITLE", "NAME", "ABOUT", "DESCRIPTION", "APPLICATION_ID", "APP_TYPE", "GAME_TYPE", "BUNDLE_ID", "SCORING_TYPE", "LANDING_PAGE_URL", "EULA_VERSION", "BUILD_VERSION", "API_VERSION"], defaultValue = "UPDATED")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "UPDATED") sortField: kotlin.String,
        @Parameter(description = "Filter results on whether the application supports ads or not. Ignore this parameter to return all results.") @Valid @RequestParam(value = "hasAds", required = false) hasAds: kotlin.Boolean?,
        @Parameter(description = "Filter results on whether the application is available for public trigger notifications") @Valid @RequestParam(value = "publicNotifications", required = false) publicNotifications: kotlin.Boolean?,
        @Parameter(description = "Determines whether to only return applications that the user has access to") @Valid @RequestParam(value = "filterBillable", required = false) filterBillable: kotlin.Boolean?,
        @Parameter(description = "Determines whether to only return applications that the user is a content admin of") @Valid @RequestParam(value = "filterContentAdmin", required = false) filterContentAdmin: kotlin.Boolean?,
        @Parameter(description = "The order to return the search results", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "true") descending: kotlin.Boolean,
        @Parameter(description = "the start of the index") @Valid @RequestParam(value = "_i", required = false) i: kotlin.Int?,
        @Parameter(description = "The start of the pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "The limit of the index") @Valid @RequestParam(value = "_l", required = false) l: kotlin.Int?,
        @Parameter(description = "The limit of the pagination", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "The list of application ids, comma separated. If provided will ignore all other params.") @Valid @RequestParam(value = "applicationIds", required = false) applicationIds: kotlin.String?,
        @Parameter(description = "Only include applications with a object store (default is false)", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "hasObjectStore", required = false, defaultValue = "false") hasObjectStore: kotlin.Boolean,
        @Parameter(description = "Return only active results", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "activeOnly", required = false, defaultValue = "true") activeOnly: kotlin.Boolean
    ): ResponseEntity<List<ApplicationShortResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search for Ad Placements",
        operationId = "searchApplicationPlacement",
        description = """Searches placements for an application.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = PlacementResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/application/placement/search"
        value = [PATH_SEARCH_APPLICATION_PLACEMENT],
        produces = ["*/*"]
    )
    fun searchApplicationPlacement(
        @NotNull @Parameter(description = "The key of the application", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "The unique id of the device making the request (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The start of the pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "The limit of the pagination", schema = Schema(defaultValue = "100")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "100") limit: kotlin.Int
    ): ResponseEntity<List<PlacementResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search for Application Settings",
        operationId = "searchApplicationSettings",
        description = """Returns a list of applications that the user has logged into before, and returns specific settings for that application and user""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ApplicationSettingsResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/application/settings/search"
        value = [PATH_SEARCH_APPLICATION_SETTINGS],
        produces = ["*/*"]
    )
    fun searchApplicationSettings(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The account id used to view another person's account") @Valid @RequestParam(value = "connectionAccountId", required = false) connectionAccountId: kotlin.Long?,
        @Parameter(description = "The string to search applications on") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "The column to sort the search on. Possible values include: CREATED, UPDATED, APPLICATION_TITLE", schema = Schema(defaultValue = "APPLICATION_TITLE")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "APPLICATION_TITLE") sortField: kotlin.String,
        @Parameter(description = "The order to return the search results", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "false") descending: kotlin.Boolean,
        @Parameter(description = "The start index for pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "The limit per result set for pagination", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int
    ): ResponseEntity<ApplicationSettingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Applications",
        operationId = "searchApplications",
        description = """Search for applications matching the criteria that the logged in user has access to""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = ApplicationResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/application/search"
        value = [PATH_SEARCH_APPLICATIONS],
        produces = ["*/*"]
    )
    fun searchApplications(
        @Parameter(description = "The unique id of the device making the request (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The location of the device") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The location of the device") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "Q") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?,
        @Parameter(description = "The keyword used to search") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "The columns to applied the keyword search to", schema = Schema(defaultValue = "NAME,ABOUT,BILLABLE_ENTITY_NAME")) @Valid @RequestParam(value = "qSearchFields", required = false, defaultValue = "NAME,ABOUT,BILLABLE_ENTITY_NAME") qSearchFields: kotlin.String,
        @Parameter(description = "The column to sort the search on", schema = Schema(allowableValues = ["CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "HAS_ADVERTISEMENTS", "PUBLIC_NOTIFICATIONS", "PLACEMENTS", "BILLABLE_ENTITY_ID", "BILLABLE_ENTITY_NAME", "RESPONSIBLE_DISPLAY", "TITLE", "NAME", "ABOUT", "DESCRIPTION", "APPLICATION_ID", "APP_TYPE", "GAME_TYPE", "BUNDLE_ID", "SCORING_TYPE", "LANDING_PAGE_URL", "EULA_VERSION", "BUILD_VERSION", "API_VERSION"], defaultValue = "APPLICATION_ID")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "APPLICATION_ID") sortField: kotlin.String,
        @Parameter(description = "The order to return the search results", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "false") descending: kotlin.Boolean,
        @Parameter(description = "the start of the index") @Valid @RequestParam(value = "_i", required = false) i: kotlin.Int?,
        @Parameter(description = "The start of the pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "the limit of the index") @Valid @RequestParam(value = "_l", required = false) l: kotlin.Int?,
        @Parameter(description = "The limit of the pagination", schema = Schema(defaultValue = "100")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "100") limit: kotlin.Int,
        @Parameter(description = "Filter results on whether the application supports ads or not. Ignore this parameter to return all results.") @Valid @RequestParam(value = "hasAds", required = false) hasAds: kotlin.Boolean?,
        @Parameter(description = "Filter results on whether the application is available for public trigger notifications") @Valid @RequestParam(value = "publicNotifications", required = false) publicNotifications: kotlin.Boolean?,
        @Parameter(description = "Return only active results", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "activeOnly", required = false, defaultValue = "false") activeOnly: kotlin.Boolean
    ): ResponseEntity<List<ApplicationResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Application",
        operationId = "updateApplication",
        description = """Update an application record""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ApplicationResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/application/update"
        value = [PATH_UPDATE_APPLICATION],
        produces = ["*/*"]
    )
    fun updateApplication(
        @NotNull @Parameter(description = "The application key for updating an existing application", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The name of the application", required = true) @Valid @RequestParam(value = "appName", required = true) appName: kotlin.String,
        @Parameter(description = "The unique id of the device making the request (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The description of the application") @Valid @RequestParam(value = "about", required = false) about: kotlin.String?,
        @Parameter(description = "The application bundle identifier (format - com.company.appName)") @Valid @RequestParam(value = "bundleId", required = false) bundleId: kotlin.String?,
        @Parameter(description = "The application icon asset id") @Valid @RequestParam(value = "appIconAssetId", required = false) appIconAssetId: kotlin.Long?,
        @Parameter(description = "The application logo asset id") @Valid @RequestParam(value = "appLogoAssetId", required = false) appLogoAssetId: kotlin.Long?,
        @Parameter(description = "The Facebook application id") @Valid @RequestParam(value = "facebookAppId", required = false) facebookAppId: kotlin.String?,
        @Parameter(description = "The Facebook application secret") @Valid @RequestParam(value = "facebookAppSecret", required = false) facebookAppSecret: kotlin.String?,
        @Parameter(description = "This is the either the 'server key' or 'browser key' generated from google to enable Google Cloud Messaging") @Valid @RequestParam(value = "googleApiKey", required = false) googleApiKey: kotlin.String?,
        @Parameter(description = "Determines whether to update the EULA date") @Valid @RequestParam(value = "updateEULADate", required = false) updateEULADate: kotlin.Boolean?,
        @Parameter(description = "The EULA version") @Valid @RequestParam(value = "eulaVersion", required = false) eulaVersion: kotlin.String?,
        @Parameter(description = "The landing page URL") @Valid @RequestParam(value = "landingPageUrl", required = false) landingPageUrl: kotlin.String?,
        @Parameter(description = "Determines whether to show the application in the activity feed") @Valid @RequestParam(value = "showInActivities", required = false) showInActivities: kotlin.Boolean?,
        @Parameter(description = "The description of the application in the activity feed") @Valid @RequestParam(value = "activityDescription", required = false) activityDescription: kotlin.String?,
        @Parameter(description = "The text to display on the invite page") @Valid @RequestParam(value = "inviteWelcomeText", required = false) inviteWelcomeText: kotlin.String?,
        @Parameter(description = "The url to the application invite page") @Valid @RequestParam(value = "invitePageUrl", required = false) invitePageUrl: kotlin.String?,
        @Parameter(description = "The protocal the app uses to load the app via a browser") @Valid @RequestParam(value = "urlScheme", required = false) urlScheme: kotlin.String?,
        @Parameter(description = "A json object with a list of supported platforms.  ```json {   \"platforms\": [     {       \"deviceId\": 1,       \"minimum\": 230,       \"maximum\": 421,       \"downloadUrl\": \"http://app.store.com/download\",       \"description\": \"description and version info\"     }   ] } ``` ") @Valid @RequestParam(value = "platforms", required = false) platforms: kotlin.String?,
        @Parameter(description = "Json formatted downloadUrls.  ```json {   \"ios\": \"the-url-to-app-store\",    \"android\": \"the-url-to-google-play\" } ```  ") @Valid @RequestParam(value = "downloadUrls", required = false) downloadUrls: kotlin.String?,
        @Parameter(description = "List of categories to apply") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "The type of scoring this application will use {GAME_LEVEL, GAME_OBJECT", schema = Schema(allowableValues = ["GAME_LEVEL", "GAME_OBJECT"], defaultValue = "GAME_LEVEL")) @Valid @RequestParam(value = "scoringType", required = false, defaultValue = "GAME_LEVEL") scoringType: kotlin.String,
        @Parameter(description = "The cost of hints", schema = Schema(defaultValue = "11")) @Valid @RequestParam(value = "hintCost", required = false, defaultValue = "11") hintCost: kotlin.Int,
        @Parameter(description = "The maximum score that will be possible", schema = Schema(defaultValue = "125")) @Valid @RequestParam(value = "maxScore", required = false, defaultValue = "125") maxScore: kotlin.Int,
        @Parameter(description = "The point-to-ticket conversion ratio", schema = Schema(defaultValue = "0.037f")) @Valid @RequestParam(value = "ticketsPerPoint", required = false, defaultValue = "0.037f") ticketsPerPoint: kotlin.Float,
        @Parameter(description = "Determines whether the application uses services to save custom game objects", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "hasGameData", required = false, defaultValue = "true") hasGameData: kotlin.Boolean,
        @Parameter(description = "Public Notifications") @Valid @RequestParam(value = "publicNotifications", required = false) publicNotifications: kotlin.Boolean?,
        @Parameter(description = "Use Matching Algorithm") @Valid @RequestParam(value = "useMatchingAlgorithm", required = false) useMatchingAlgorithm: kotlin.Boolean?,
        @Parameter(description = "Determines whether earned tickets are applied across all applications", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "globalTickets", required = false, defaultValue = "false") globalTickets: kotlin.Boolean,
        @Parameter(description = "The current build version of the application", schema = Schema(defaultValue = "1f")) @Valid @RequestParam(value = "buildVersion", required = false, defaultValue = "1f") buildVersion: kotlin.Float,
        @Parameter(description = "The current API version the application uses") @Valid @RequestParam(value = "apiVersion", required = false) apiVersion: kotlin.Float?,
        @Parameter(description = "The name of the placement") @Valid @RequestParam(value = "placementName", required = false) placementName: kotlin.String?,
        @Parameter(description = "The description of the placement") @Valid @RequestParam(value = "placementDescription", required = false) placementDescription: kotlin.String?,
        @Parameter(description = "The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM (this is required if a placements is to be created)", schema = Schema(allowableValues = ["CONFIG", "BANNER", "LEADERBOARD", "SKYSCRAPER", "VIDEO", "ZIP", "INTERSTITIAL", "CUSTOM1", "CUSTOM2", "CUSTOM3", "CUSTOM4", "CUSTOM5", "CUSTOM6", "CUSTOM7", "CUSTOM8", "CUSTOM9", "CUSTOM10"])) @Valid @RequestParam(value = "placementSize", required = false) placementSize: kotlin.String?,
        @Parameter(description = "The height of a custom ad size") @Valid @RequestParam(value = "placementHeight", required = false) placementHeight: kotlin.Int?,
        @Parameter(description = "The width of a custom ad size") @Valid @RequestParam(value = "placementWidth", required = false) placementWidth: kotlin.Int?,
        @Parameter(description = "The refresh interval in seconds") @Valid @RequestParam(value = "placementRefreshInterval", required = false) placementRefreshInterval: kotlin.Int?,
        @Parameter(description = "Generate a custom object store to use", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "createObjectStore", required = false, defaultValue = "true") createObjectStore: kotlin.Boolean,
        @Parameter(description = "Determine whether or not public content requires admin approval before it becomes public", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "publicContentApproval", required = false, defaultValue = "false") publicContentApproval: kotlin.Boolean,
        @Parameter(description = "Determines whether the application uses production or sandbox services", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "productionMode", required = false, defaultValue = "false") productionMode: kotlin.Boolean,
        @Parameter(description = "Minimum Session Length") @Valid @RequestParam(value = "minimumSessionLength", required = false) minimumSessionLength: kotlin.Int?,
        @Parameter(description = "Session Gap Length") @Valid @RequestParam(value = "sessionGapLength", required = false) sessionGapLength: kotlin.Int?,
        @Parameter(description = "Local Ads Enabled", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "localAdsEnabled", required = false, defaultValue = "false") localAdsEnabled: kotlin.Boolean,
        @Parameter(description = "Sqoot Api Key") @Valid @RequestParam(value = "sqootApiKey", required = false) sqootApiKey: kotlin.String?,
        @Parameter(description = "Determines how to process trilateration data. Possible values include: DEFAULT, FINGERPRINT", schema = Schema(allowableValues = ["DEFAULT", "FINGERPRINT", "FINGERPRINT_V2"], defaultValue = "FINGERPRINT")) @Valid @RequestParam(value = "trilatProcessingType", required = false, defaultValue = "FINGERPRINT") trilatProcessingType: kotlin.String,
        @Parameter(description = "Determines what the maximum sample size during trilateration") @Valid @RequestParam(value = "maxSampleSize", required = false) maxSampleSize: kotlin.Int?,
        @Parameter(description = "Determines what the minimum acceptable RSSI value") @Valid @RequestParam(value = "minRSSI", required = false) minRSSI: kotlin.Double?,
        @Parameter(description = "List modules allowed to be served by the server, possible values include: COMMON, MEDIA, OFFER, GAME, SOCIAL, CONSUMER_WEBSITE, ALL", schema = Schema(defaultValue = "ALL")) @Valid @RequestParam(value = "modules", required = false, defaultValue = "ALL") modules: kotlin.String,
        @Parameter(description = "How many servers the license will support", schema = Schema(defaultValue = "1")) @Valid @RequestParam(value = "authorizedCount", required = false, defaultValue = "1") authorizedCount: kotlin.Int,
        @Parameter(description = "The list of ip addresses of servers the license will support, leave null for any server") @Valid @RequestParam(value = "authorizedServers", required = false) authorizedServers: kotlin.String?,
        @Parameter(description = "Sets the default timezone for the app (used for leaderboards and other time specific content)") @Valid @RequestParam(value = "defaultTimezone", required = false) defaultTimezone: kotlin.String?,
        @Parameter(description = "SMTP Pass") @Valid @RequestParam(value = "smtpPass", required = false) smtpPass: kotlin.String?,
        @Parameter(description = "The application meta data. Defined by the client") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "The ad placement meta data. Defined by the client") @Valid @RequestParam(value = "placementMetaData", required = false) placementMetaData: kotlin.String?,
        @Parameter(description = "Create floor tables for Ips", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "ipsFloor", required = false, defaultValue = "false") ipsFloor: kotlin.Boolean,
        @Parameter(description = "Enables setting the APNS badge value in the payload", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "enableAPNSBadge", required = false, defaultValue = "true") enableAPNSBadge: kotlin.Boolean,
        @Parameter(description = "Enables using the application in session reports", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "includeInReport", required = false, defaultValue = "true") includeInReport: kotlin.Boolean,
        @Parameter(description = "Sets the default filter to use (if none is passed in) for certain search APIs including Album Search.") @Valid @RequestParam(value = "defaultAppFilterId", required = false) defaultAppFilterId: kotlin.Long?,
        @Parameter(description = "Enables whether the default welcome email will be sent for new app users") @Valid @RequestParam(value = "enableWelcomeEmail", required = false) enableWelcomeEmail: kotlin.Boolean?,
        @Parameter(description = "The Apple Application ID") @Valid @RequestParam(value = "appleAppId", required = false) appleAppId: kotlin.String?,
        @Parameter(description = "The Apple Team ID") @Valid @RequestParam(value = "appleTeamId", required = false) appleTeamId: kotlin.String?,
        @Parameter(description = "The Apple Auth Key ID") @Valid @RequestParam(value = "appleAuthKeyId", required = false) appleAuthKeyId: kotlin.String?,
        @Parameter(description = "The Apple Auth Signin Key (p8) File") @Valid @RequestParam(value = "appleAuthKey", required = false) appleAuthKey: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "The Apple Issuer ID") @Valid @RequestParam(value = "appleIssuerId", required = false) appleIssuerId: kotlin.String?,
        @Parameter(description = "The Apple App Store Key ID") @Valid @RequestParam(value = "appStoreKeyId", required = false) appStoreKeyId: kotlin.String?,
        @Parameter(description = "The Apple App Store Key (p8) File") @Valid @RequestParam(value = "appStoreKey", required = false) appStoreKey: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "This is the private key file for your Google service account.") @Valid @RequestParam(value = "googlePrivateKeyFile", required = false) googlePrivateKeyFile: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "Authorize Net Api Key") @Valid @RequestParam(value = "authorizeNetApiKey", required = false) authorizeNetApiKey: kotlin.String?,
        @Parameter(description = "Authorize Net Transaction Key") @Valid @RequestParam(value = "authorizeNetTransactionKey", required = false) authorizeNetTransactionKey: kotlin.String?,
        @Parameter(description = "Email Sender") @Valid @RequestParam(value = "emailSender", required = false) emailSender: kotlin.String?,
        @Parameter(description = "SMTP User") @Valid @RequestParam(value = "smtpUser", required = false) smtpUser: kotlin.String?,
        @Parameter(description = "SMTP Host") @Valid @RequestParam(value = "smtpHost", required = false) smtpHost: kotlin.String?,
        @Parameter(description = "Vatom Business Id") @Valid @RequestParam(value = "vatomBusinessId", required = false) vatomBusinessId: kotlin.String?,
        @Parameter(description = "Vatom REST Client Id") @Valid @RequestParam(value = "vatomRestClientId", required = false) vatomRestClientId: kotlin.String?,
        @Parameter(description = "Vatom Secret Key") @Valid @RequestParam(value = "vatomRestSecretKey", required = false) vatomRestSecretKey: kotlin.String?,
        @Parameter(description = "Twilio Account SID") @Valid @RequestParam(value = "twilioAccountSID", required = false) twilioAccountSID: kotlin.String?,
        @Parameter(description = "Twilio Auth Token") @Valid @RequestParam(value = "twilioAuthToken", required = false) twilioAuthToken: kotlin.String?,
        @Parameter(description = "Twilio Sender Phone Number") @Valid @RequestParam(value = "twilioSenderPhoneNumber", required = false) twilioSenderPhoneNumber: kotlin.String?,
        @Parameter(description = "OpenAI Secret API Key") @Valid @RequestParam(value = "openAISecretKey", required = false) openAISecretKey: kotlin.String?
    ): ResponseEntity<ApplicationResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Change Appliation Status",
        operationId = "updateApplicationActive",
        description = """Set the application's active flag to true/false. This effectively activates or deactivates the application.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/application/active"
        value = [PATH_UPDATE_APPLICATION_ACTIVE],
        produces = ["*/*"]
    )
    fun updateApplicationActive(
        @NotNull @Parameter(description = "The account used to perform the delete, must have rights to edit the application.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The key of the application to be deleted", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "If true then set to active, false otherwise", required = true) @Valid @RequestParam(value = "active", required = true) active: kotlin.Boolean
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Ad Placement",
        operationId = "updateApplicationPlacement",
        description = """Updates an ad placement for an application.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PlacementResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/application/placement/update"
        value = [PATH_UPDATE_APPLICATION_PLACEMENT],
        produces = ["*/*"]
    )
    fun updateApplicationPlacement(
        @NotNull @Parameter(description = "The id of the placement to update, the user must have rights to the application the ad placement is for", required = true) @Valid @RequestParam(value = "placementId", required = true) placementId: kotlin.Long,
        @Parameter(description = "The unique id of the device making the request (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The name of the placement") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "The description of the placement") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM", schema = Schema(allowableValues = ["CONFIG", "BANNER", "LEADERBOARD", "SKYSCRAPER", "VIDEO", "ZIP", "INTERSTITIAL", "CUSTOM1", "CUSTOM2", "CUSTOM3", "CUSTOM4", "CUSTOM5", "CUSTOM6", "CUSTOM7", "CUSTOM8", "CUSTOM9", "CUSTOM10"])) @Valid @RequestParam(value = "size", required = false) size: kotlin.String?,
        @Parameter(description = "The height of a custom ad size") @Valid @RequestParam(value = "height", required = false) height: kotlin.Int?,
        @Parameter(description = "The width of a custom ad size") @Valid @RequestParam(value = "width", required = false) width: kotlin.Int?,
        @Parameter(description = "The refresh interval in seconds") @Valid @RequestParam(value = "refreshInterval", required = false) refreshInterval: kotlin.Int?,
        @Parameter(description = "Default Image Id") @Valid @RequestParam(value = "defaultImageId", required = false) defaultImageId: kotlin.Long?,
        @Parameter(description = "Active") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?
    ): ResponseEntity<PlacementResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Application Certificate",
        operationId = "uploadApplicationCertificate",
        description = """Uploads a certificate for an application that the user has access to.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/application/certificate/create"
        value = [PATH_UPLOAD_APPLICATION_CERTIFICATE],
        produces = ["*/*"]
    )
    fun uploadApplicationCertificate(
        @NotNull @Parameter(description = "The key of the application", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "Device Id") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account used to perform the delete, must have rights to edit the application.") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Certificate") @Valid @RequestParam(value = "certificate", required = false) certificate: org.springframework.web.multipart.MultipartFile
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_APPLICATION: String = "/application/create"
        const val PATH_CREATE_APPLICATION_PLACEMENT: String = "/application/placement/create"
        const val PATH_DELETE_APPLICATION: String = "/application/delete"
        const val PATH_DELETE_APPLICATION_PLACEMENT: String = "/application/placement/delete"
        const val PATH_GET_APPLICATION: String = "/application/get"
        const val PATH_GET_APPLICATION_PLACEMENT: String = "/application/placement/get"
        const val PATH_GET_APPLICATION_VERSIONS: String = "/application/versions"
        const val PATH_GET_UNIQUE_USERS_BY_APP: String = "/application/users"
        const val PATH_LIST_APPLICATIONS: String = "/application/list"
        const val PATH_SEARCH_APPLICATION_PLACEMENT: String = "/application/placement/search"
        const val PATH_SEARCH_APPLICATION_SETTINGS: String = "/application/settings/search"
        const val PATH_SEARCH_APPLICATIONS: String = "/application/search"
        const val PATH_UPDATE_APPLICATION: String = "/application/update"
        const val PATH_UPDATE_APPLICATION_ACTIVE: String = "/application/active"
        const val PATH_UPDATE_APPLICATION_PLACEMENT: String = "/application/placement/update"
        const val PATH_UPLOAD_APPLICATION_CERTIFICATE: String = "/application/certificate/create"
    }
}
