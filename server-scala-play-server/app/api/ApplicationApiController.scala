package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AccountListResponse
import model.ApplicationResponse
import model.ApplicationSettingsResponse
import model.ApplicationShortResponse
import model.PlacementResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class ApplicationApiController @Inject()(cc: ControllerComponents, api: ApplicationApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/application/create?deviceId=[value]&accountId=[value]&appName=[value]&about=[value]&bundleId=[value]&appIconAssetId=[value]&appLogoAssetId=[value]&facebookAppId=[value]&facebookAppSecret=[value]&googleApiKey=[value]&updateEULADate=[value]&eulaVersion=[value]&landingPageUrl=[value]&showInActivities=[value]&activityDescription=[value]&inviteWelcomeText=[value]&invitePageUrl=[value]&urlScheme=[value]&platforms=[value]&downloadUrls=[value]&categoryIds=[value]&scoringType=[value]&hintCost=[value]&maxScore=[value]&ticketsPerPoint=[value]&hasGameData=[value]&publicNotifications=[value]&useMatchingAlgorithm=[value]&globalTickets=[value]&buildVersion=[value]&apiVersion=[value]&placementName=[value]&placementDescription=[value]&placementSize=[value]&placementHeight=[value]&placementWidth=[value]&placementRefreshInterval=[value]&createObjectStore=[value]&publicContentApproval=[value]&productionMode=[value]&minimumSessionLength=[value]&sessionGapLength=[value]&localAdsEnabled=[value]&sqootApiKey=[value]&trilatProcessingType=[value]&maxSampleSize=[value]&minRSSI=[value]&modules=[value]&authorizedCount=[value]&authorizedServers=[value]&defaultTimezone=[value]&smtpPass=[value]&metaData=[value]&placementMetaData=[value]&ipsFloor=[value]&enableAPNSBadge=[value]&includeInReport=[value]&defaultAppFilterId=[value]&enableWelcomeEmail=[value]&appleAppId=[value]&appleTeamId=[value]&appleAuthKeyId=[value]&appleAuthKey=[value]&appleIssuerId=[value]&appStoreKeyId=[value]&appStoreKey=[value]&googlePrivateKeyFile=[value]&authorizeNetApiKey=[value]&authorizeNetTransactionKey=[value]&emailSender=[value]&smtpUser=[value]&smtpHost=[value]&vatomBusinessId=[value]&vatomRestClientId=[value]&vatomRestSecretKey=[value]&twilioAccountSID=[value]&twilioAuthToken=[value]&twilioSenderPhoneNumber=[value]&openAISecretKey=[value]
    */
  def createApplication(): Action[AnyContent] = Action { request =>
    def executeApi(): ApplicationResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appName = request.getQueryString("appName")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appName", "query string")
        }
        
      val about = request.getQueryString("about")
        
      val bundleId = request.getQueryString("bundleId")
        
      val appIconAssetId = request.getQueryString("appIconAssetId")
        .map(value => value.toLong)
        
      val appLogoAssetId = request.getQueryString("appLogoAssetId")
        .map(value => value.toLong)
        
      val facebookAppId = request.getQueryString("facebookAppId")
        
      val facebookAppSecret = request.getQueryString("facebookAppSecret")
        
      val googleApiKey = request.getQueryString("googleApiKey")
        
      val updateEULADate = request.getQueryString("updateEULADate")
        .map(value => value.toBoolean)
        
      val eulaVersion = request.getQueryString("eulaVersion")
        
      val landingPageUrl = request.getQueryString("landingPageUrl")
        
      val showInActivities = request.getQueryString("showInActivities")
        .map(value => value.toBoolean)
        
      val activityDescription = request.getQueryString("activityDescription")
        
      val inviteWelcomeText = request.getQueryString("inviteWelcomeText")
        
      val invitePageUrl = request.getQueryString("invitePageUrl")
        
      val urlScheme = request.getQueryString("urlScheme")
        
      val platforms = request.getQueryString("platforms")
        
      val downloadUrls = request.getQueryString("downloadUrls")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val scoringType = request.getQueryString("scoringType")
        
      val hintCost = request.getQueryString("hintCost")
        .map(value => value.toInt)
        
      val maxScore = request.getQueryString("maxScore")
        .map(value => value.toInt)
        
      val ticketsPerPoint = request.getQueryString("ticketsPerPoint")
        .map(value => value.toFloat)
        
      val hasGameData = request.getQueryString("hasGameData")
        .map(value => value.toBoolean)
        
      val publicNotifications = request.getQueryString("publicNotifications")
        .map(value => value.toBoolean)
        
      val useMatchingAlgorithm = request.getQueryString("useMatchingAlgorithm")
        .map(value => value.toBoolean)
        
      val globalTickets = request.getQueryString("globalTickets")
        .map(value => value.toBoolean)
        
      val buildVersion = request.getQueryString("buildVersion")
        .map(value => value.toFloat)
        
      val apiVersion = request.getQueryString("apiVersion")
        .map(value => value.toFloat)
        
      val placementName = request.getQueryString("placementName")
        
      val placementDescription = request.getQueryString("placementDescription")
        
      val placementSize = request.getQueryString("placementSize")
        
      val placementHeight = request.getQueryString("placementHeight")
        .map(value => value.toInt)
        
      val placementWidth = request.getQueryString("placementWidth")
        .map(value => value.toInt)
        
      val placementRefreshInterval = request.getQueryString("placementRefreshInterval")
        .map(value => value.toInt)
        
      val createObjectStore = request.getQueryString("createObjectStore")
        .map(value => value.toBoolean)
        
      val publicContentApproval = request.getQueryString("publicContentApproval")
        .map(value => value.toBoolean)
        
      val productionMode = request.getQueryString("productionMode")
        .map(value => value.toBoolean)
        
      val minimumSessionLength = request.getQueryString("minimumSessionLength")
        .map(value => value.toInt)
        
      val sessionGapLength = request.getQueryString("sessionGapLength")
        .map(value => value.toInt)
        
      val localAdsEnabled = request.getQueryString("localAdsEnabled")
        .map(value => value.toBoolean)
        
      val sqootApiKey = request.getQueryString("sqootApiKey")
        
      val trilatProcessingType = request.getQueryString("trilatProcessingType")
        
      val maxSampleSize = request.getQueryString("maxSampleSize")
        .map(value => value.toInt)
        
      val minRSSI = request.getQueryString("minRSSI")
        .map(value => value.toDouble)
        
      val modules = request.getQueryString("modules")
        
      val authorizedCount = request.getQueryString("authorizedCount")
        .map(value => value.toInt)
        
      val authorizedServers = request.getQueryString("authorizedServers")
        
      val defaultTimezone = request.getQueryString("defaultTimezone")
        
      val smtpPass = request.getQueryString("smtpPass")
        
      val metaData = request.getQueryString("metaData")
        
      val placementMetaData = request.getQueryString("placementMetaData")
        
      val ipsFloor = request.getQueryString("ipsFloor")
        .map(value => value.toBoolean)
        
      val enableAPNSBadge = request.getQueryString("enableAPNSBadge")
        .map(value => value.toBoolean)
        
      val includeInReport = request.getQueryString("includeInReport")
        .map(value => value.toBoolean)
        
      val defaultAppFilterId = request.getQueryString("defaultAppFilterId")
        .map(value => value.toLong)
        
      val enableWelcomeEmail = request.getQueryString("enableWelcomeEmail")
        .map(value => value.toBoolean)
        
      val appleAppId = request.getQueryString("appleAppId")
        
      val appleTeamId = request.getQueryString("appleTeamId")
        
      val appleAuthKeyId = request.getQueryString("appleAuthKeyId")
        
      val appleAuthKey = request.getQueryString("appleAuthKey")
        
      val appleIssuerId = request.getQueryString("appleIssuerId")
        
      val appStoreKeyId = request.getQueryString("appStoreKeyId")
        
      val appStoreKey = request.getQueryString("appStoreKey")
        
      val googlePrivateKeyFile = request.getQueryString("googlePrivateKeyFile")
        
      val authorizeNetApiKey = request.getQueryString("authorizeNetApiKey")
        
      val authorizeNetTransactionKey = request.getQueryString("authorizeNetTransactionKey")
        
      val emailSender = request.getQueryString("emailSender")
        
      val smtpUser = request.getQueryString("smtpUser")
        
      val smtpHost = request.getQueryString("smtpHost")
        
      val vatomBusinessId = request.getQueryString("vatomBusinessId")
        
      val vatomRestClientId = request.getQueryString("vatomRestClientId")
        
      val vatomRestSecretKey = request.getQueryString("vatomRestSecretKey")
        
      val twilioAccountSID = request.getQueryString("twilioAccountSID")
        
      val twilioAuthToken = request.getQueryString("twilioAuthToken")
        
      val twilioSenderPhoneNumber = request.getQueryString("twilioSenderPhoneNumber")
        
      val openAISecretKey = request.getQueryString("openAISecretKey")
        
      api.createApplication(appName, deviceId, accountId, about, bundleId, appIconAssetId, appLogoAssetId, facebookAppId, facebookAppSecret, googleApiKey, updateEULADate, eulaVersion, landingPageUrl, showInActivities, activityDescription, inviteWelcomeText, invitePageUrl, urlScheme, platforms, downloadUrls, categoryIds, scoringType, hintCost, maxScore, ticketsPerPoint, hasGameData, publicNotifications, useMatchingAlgorithm, globalTickets, buildVersion, apiVersion, placementName, placementDescription, placementSize, placementHeight, placementWidth, placementRefreshInterval, createObjectStore, publicContentApproval, productionMode, minimumSessionLength, sessionGapLength, localAdsEnabled, sqootApiKey, trilatProcessingType, maxSampleSize, minRSSI, modules, authorizedCount, authorizedServers, defaultTimezone, smtpPass, metaData, placementMetaData, ipsFloor, enableAPNSBadge, includeInReport, defaultAppFilterId, enableWelcomeEmail, appleAppId, appleTeamId, appleAuthKeyId, appleAuthKey, appleIssuerId, appStoreKeyId, appStoreKey, googlePrivateKeyFile, authorizeNetApiKey, authorizeNetTransactionKey, emailSender, smtpUser, smtpHost, vatomBusinessId, vatomRestClientId, vatomRestSecretKey, twilioAccountSID, twilioAuthToken, twilioSenderPhoneNumber, openAISecretKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/application/placement/create?deviceId=[value]&accountId=[value]&appKey=[value]&name=[value]&description=[value]&size=[value]&height=[value]&width=[value]&refreshInterval=[value]&defaultImageId=[value]&active=[value]
    */
  def createApplicationPlacement(): Action[AnyContent] = Action { request =>
    def executeApi(): PlacementResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val name = request.getQueryString("name")
        
      val description = request.getQueryString("description")
        
      val size = request.getQueryString("size")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("size", "query string")
        }
        
      val height = request.getQueryString("height")
        .map(value => value.toInt)
        
      val width = request.getQueryString("width")
        .map(value => value.toInt)
        
      val refreshInterval = request.getQueryString("refreshInterval")
        .map(value => value.toInt)
        
      val defaultImageId = request.getQueryString("defaultImageId")
        .map(value => value.toLong)
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      api.createApplicationPlacement(appKey, size, deviceId, accountId, name, description, height, width, refreshInterval, defaultImageId, active)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/application/delete?accountId=[value]&appKey=[value]
    */
  def deleteApplication(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      api.deleteApplication(accountId, appKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/application/placement/delete?deviceId=[value]&accountId=[value]&placementId=[value]
    */
  def deleteApplicationPlacement(): Action[AnyContent] = Action { request =>
    def executeApi(): PlacementResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val placementId = request.getQueryString("placementId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("placementId", "query string")
        }
        
      api.deleteApplicationPlacement(placementId, deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/application/get?appKey=[value]&applicationId=[value]
    */
  def getApplication(): Action[AnyContent] = Action { request =>
    def executeApi(): ApplicationResponse = {
      val appKey = request.getQueryString("appKey")
        
      val applicationId = request.getQueryString("applicationId")
        .map(value => value.toLong)
        
      api.getApplication(appKey, applicationId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/application/placement/get?deviceId=[value]&accountId=[value]&placementId=[value]
    */
  def getApplicationPlacement(): Action[AnyContent] = Action { request =>
    def executeApi(): PlacementResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val placementId = request.getQueryString("placementId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("placementId", "query string")
        }
        
      api.getApplicationPlacement(placementId, deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/application/versions
    */
  def getApplicationVersions(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      api.getApplicationVersions()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/application/users?appKey=[value]&q=[value]&keyword=[value]&since=[value]&i=[value]&start=[value]&l=[value]&limit=[value]
    */
  def getUniqueUsersByApp(): Action[AnyContent] = Action { request =>
    def executeApi(): AccountListResponse = {
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val q = request.getQueryString("q")
        
      val keyword = request.getQueryString("keyword")
        
      val since = request.getQueryString("since")
        .map(value => value.toLong)
        
      val i = request.getQueryString("_i")
        .map(value => value.toInt)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val l = request.getQueryString("_l")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getUniqueUsersByApp(appKey, q, keyword, since, i, start, l, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/application/list?accountId=[value]&q=[value]&keyword=[value]&platforms=[value]&deviceIds=[value]&deviceVersions=[value]&categoryIds=[value]&sortField=[value]&hasAds=[value]&publicNotifications=[value]&filterBillable=[value]&filterContentAdmin=[value]&descending=[value]&i=[value]&start=[value]&l=[value]&limit=[value]&applicationIds=[value]&hasObjectStore=[value]&activeOnly=[value]
    */
  def listApplications(): Action[AnyContent] = Action { request =>
    def executeApi(): List[ApplicationShortResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val q = request.getQueryString("q")
        
      val keyword = request.getQueryString("keyword")
        
      val platforms = request.getQueryString("platforms")
        
      val deviceIds = request.getQueryString("deviceIds")
        
      val deviceVersions = request.getQueryString("deviceVersions")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val sortField = request.getQueryString("sortField")
        
      val hasAds = request.getQueryString("hasAds")
        .map(value => value.toBoolean)
        
      val publicNotifications = request.getQueryString("publicNotifications")
        .map(value => value.toBoolean)
        
      val filterBillable = request.getQueryString("filterBillable")
        .map(value => value.toBoolean)
        
      val filterContentAdmin = request.getQueryString("filterContentAdmin")
        .map(value => value.toBoolean)
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val i = request.getQueryString("_i")
        .map(value => value.toInt)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val l = request.getQueryString("_l")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val applicationIds = request.getQueryString("applicationIds")
        
      val hasObjectStore = request.getQueryString("hasObjectStore")
        .map(value => value.toBoolean)
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        
      api.listApplications(accountId, q, keyword, platforms, deviceIds, deviceVersions, categoryIds, sortField, hasAds, publicNotifications, filterBillable, filterContentAdmin, descending, i, start, l, limit, applicationIds, hasObjectStore, activeOnly)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/application/placement/search?deviceId=[value]&accountId=[value]&appKey=[value]&start=[value]&limit=[value]
    */
  def searchApplicationPlacement(): Action[AnyContent] = Action { request =>
    def executeApi(): List[PlacementResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchApplicationPlacement(appKey, deviceId, accountId, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/application/settings/search?deviceId=[value]&accountId=[value]&connectionAccountId=[value]&keyword=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]
    */
  def searchApplicationSettings(): Action[AnyContent] = Action { request =>
    def executeApi(): ApplicationSettingsResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val connectionAccountId = request.getQueryString("connectionAccountId")
        .map(value => value.toLong)
        
      val keyword = request.getQueryString("keyword")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchApplicationSettings(deviceId, accountId, connectionAccountId, keyword, sortField, descending, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/application/search?deviceId=[value]&accountId=[value]&latitude=[value]&longitude=[value]&q=[value]&keyword=[value]&qSearchFields=[value]&sortField=[value]&descending=[value]&i=[value]&start=[value]&l=[value]&limit=[value]&hasAds=[value]&publicNotifications=[value]&activeOnly=[value]
    */
  def searchApplications(): Action[AnyContent] = Action { request =>
    def executeApi(): List[ApplicationResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val q = request.getQueryString("q")
        
      val keyword = request.getQueryString("keyword")
        
      val qSearchFields = request.getQueryString("qSearchFields")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val i = request.getQueryString("_i")
        .map(value => value.toInt)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val l = request.getQueryString("_l")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val hasAds = request.getQueryString("hasAds")
        .map(value => value.toBoolean)
        
      val publicNotifications = request.getQueryString("publicNotifications")
        .map(value => value.toBoolean)
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        
      api.searchApplications(deviceId, accountId, latitude, longitude, q, keyword, qSearchFields, sortField, descending, i, start, l, limit, hasAds, publicNotifications, activeOnly)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/application/update?deviceId=[value]&accountId=[value]&appKey=[value]&appName=[value]&about=[value]&bundleId=[value]&appIconAssetId=[value]&appLogoAssetId=[value]&facebookAppId=[value]&facebookAppSecret=[value]&googleApiKey=[value]&updateEULADate=[value]&eulaVersion=[value]&landingPageUrl=[value]&showInActivities=[value]&activityDescription=[value]&inviteWelcomeText=[value]&invitePageUrl=[value]&urlScheme=[value]&platforms=[value]&downloadUrls=[value]&categoryIds=[value]&scoringType=[value]&hintCost=[value]&maxScore=[value]&ticketsPerPoint=[value]&hasGameData=[value]&publicNotifications=[value]&useMatchingAlgorithm=[value]&globalTickets=[value]&buildVersion=[value]&apiVersion=[value]&placementName=[value]&placementDescription=[value]&placementSize=[value]&placementHeight=[value]&placementWidth=[value]&placementRefreshInterval=[value]&createObjectStore=[value]&publicContentApproval=[value]&productionMode=[value]&minimumSessionLength=[value]&sessionGapLength=[value]&localAdsEnabled=[value]&sqootApiKey=[value]&trilatProcessingType=[value]&maxSampleSize=[value]&minRSSI=[value]&modules=[value]&authorizedCount=[value]&authorizedServers=[value]&defaultTimezone=[value]&smtpPass=[value]&metaData=[value]&placementMetaData=[value]&ipsFloor=[value]&enableAPNSBadge=[value]&includeInReport=[value]&defaultAppFilterId=[value]&enableWelcomeEmail=[value]&appleAppId=[value]&appleTeamId=[value]&appleAuthKeyId=[value]&appleAuthKey=[value]&appleIssuerId=[value]&appStoreKeyId=[value]&appStoreKey=[value]&googlePrivateKeyFile=[value]&authorizeNetApiKey=[value]&authorizeNetTransactionKey=[value]&emailSender=[value]&smtpUser=[value]&smtpHost=[value]&vatomBusinessId=[value]&vatomRestClientId=[value]&vatomRestSecretKey=[value]&twilioAccountSID=[value]&twilioAuthToken=[value]&twilioSenderPhoneNumber=[value]&openAISecretKey=[value]
    */
  def updateApplication(): Action[AnyContent] = Action { request =>
    def executeApi(): ApplicationResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val appName = request.getQueryString("appName")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appName", "query string")
        }
        
      val about = request.getQueryString("about")
        
      val bundleId = request.getQueryString("bundleId")
        
      val appIconAssetId = request.getQueryString("appIconAssetId")
        .map(value => value.toLong)
        
      val appLogoAssetId = request.getQueryString("appLogoAssetId")
        .map(value => value.toLong)
        
      val facebookAppId = request.getQueryString("facebookAppId")
        
      val facebookAppSecret = request.getQueryString("facebookAppSecret")
        
      val googleApiKey = request.getQueryString("googleApiKey")
        
      val updateEULADate = request.getQueryString("updateEULADate")
        .map(value => value.toBoolean)
        
      val eulaVersion = request.getQueryString("eulaVersion")
        
      val landingPageUrl = request.getQueryString("landingPageUrl")
        
      val showInActivities = request.getQueryString("showInActivities")
        .map(value => value.toBoolean)
        
      val activityDescription = request.getQueryString("activityDescription")
        
      val inviteWelcomeText = request.getQueryString("inviteWelcomeText")
        
      val invitePageUrl = request.getQueryString("invitePageUrl")
        
      val urlScheme = request.getQueryString("urlScheme")
        
      val platforms = request.getQueryString("platforms")
        
      val downloadUrls = request.getQueryString("downloadUrls")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val scoringType = request.getQueryString("scoringType")
        
      val hintCost = request.getQueryString("hintCost")
        .map(value => value.toInt)
        
      val maxScore = request.getQueryString("maxScore")
        .map(value => value.toInt)
        
      val ticketsPerPoint = request.getQueryString("ticketsPerPoint")
        .map(value => value.toFloat)
        
      val hasGameData = request.getQueryString("hasGameData")
        .map(value => value.toBoolean)
        
      val publicNotifications = request.getQueryString("publicNotifications")
        .map(value => value.toBoolean)
        
      val useMatchingAlgorithm = request.getQueryString("useMatchingAlgorithm")
        .map(value => value.toBoolean)
        
      val globalTickets = request.getQueryString("globalTickets")
        .map(value => value.toBoolean)
        
      val buildVersion = request.getQueryString("buildVersion")
        .map(value => value.toFloat)
        
      val apiVersion = request.getQueryString("apiVersion")
        .map(value => value.toFloat)
        
      val placementName = request.getQueryString("placementName")
        
      val placementDescription = request.getQueryString("placementDescription")
        
      val placementSize = request.getQueryString("placementSize")
        
      val placementHeight = request.getQueryString("placementHeight")
        .map(value => value.toInt)
        
      val placementWidth = request.getQueryString("placementWidth")
        .map(value => value.toInt)
        
      val placementRefreshInterval = request.getQueryString("placementRefreshInterval")
        .map(value => value.toInt)
        
      val createObjectStore = request.getQueryString("createObjectStore")
        .map(value => value.toBoolean)
        
      val publicContentApproval = request.getQueryString("publicContentApproval")
        .map(value => value.toBoolean)
        
      val productionMode = request.getQueryString("productionMode")
        .map(value => value.toBoolean)
        
      val minimumSessionLength = request.getQueryString("minimumSessionLength")
        .map(value => value.toInt)
        
      val sessionGapLength = request.getQueryString("sessionGapLength")
        .map(value => value.toInt)
        
      val localAdsEnabled = request.getQueryString("localAdsEnabled")
        .map(value => value.toBoolean)
        
      val sqootApiKey = request.getQueryString("sqootApiKey")
        
      val trilatProcessingType = request.getQueryString("trilatProcessingType")
        
      val maxSampleSize = request.getQueryString("maxSampleSize")
        .map(value => value.toInt)
        
      val minRSSI = request.getQueryString("minRSSI")
        .map(value => value.toDouble)
        
      val modules = request.getQueryString("modules")
        
      val authorizedCount = request.getQueryString("authorizedCount")
        .map(value => value.toInt)
        
      val authorizedServers = request.getQueryString("authorizedServers")
        
      val defaultTimezone = request.getQueryString("defaultTimezone")
        
      val smtpPass = request.getQueryString("smtpPass")
        
      val metaData = request.getQueryString("metaData")
        
      val placementMetaData = request.getQueryString("placementMetaData")
        
      val ipsFloor = request.getQueryString("ipsFloor")
        .map(value => value.toBoolean)
        
      val enableAPNSBadge = request.getQueryString("enableAPNSBadge")
        .map(value => value.toBoolean)
        
      val includeInReport = request.getQueryString("includeInReport")
        .map(value => value.toBoolean)
        
      val defaultAppFilterId = request.getQueryString("defaultAppFilterId")
        .map(value => value.toLong)
        
      val enableWelcomeEmail = request.getQueryString("enableWelcomeEmail")
        .map(value => value.toBoolean)
        
      val appleAppId = request.getQueryString("appleAppId")
        
      val appleTeamId = request.getQueryString("appleTeamId")
        
      val appleAuthKeyId = request.getQueryString("appleAuthKeyId")
        
      val appleAuthKey = request.getQueryString("appleAuthKey")
        
      val appleIssuerId = request.getQueryString("appleIssuerId")
        
      val appStoreKeyId = request.getQueryString("appStoreKeyId")
        
      val appStoreKey = request.getQueryString("appStoreKey")
        
      val googlePrivateKeyFile = request.getQueryString("googlePrivateKeyFile")
        
      val authorizeNetApiKey = request.getQueryString("authorizeNetApiKey")
        
      val authorizeNetTransactionKey = request.getQueryString("authorizeNetTransactionKey")
        
      val emailSender = request.getQueryString("emailSender")
        
      val smtpUser = request.getQueryString("smtpUser")
        
      val smtpHost = request.getQueryString("smtpHost")
        
      val vatomBusinessId = request.getQueryString("vatomBusinessId")
        
      val vatomRestClientId = request.getQueryString("vatomRestClientId")
        
      val vatomRestSecretKey = request.getQueryString("vatomRestSecretKey")
        
      val twilioAccountSID = request.getQueryString("twilioAccountSID")
        
      val twilioAuthToken = request.getQueryString("twilioAuthToken")
        
      val twilioSenderPhoneNumber = request.getQueryString("twilioSenderPhoneNumber")
        
      val openAISecretKey = request.getQueryString("openAISecretKey")
        
      api.updateApplication(appKey, appName, deviceId, accountId, about, bundleId, appIconAssetId, appLogoAssetId, facebookAppId, facebookAppSecret, googleApiKey, updateEULADate, eulaVersion, landingPageUrl, showInActivities, activityDescription, inviteWelcomeText, invitePageUrl, urlScheme, platforms, downloadUrls, categoryIds, scoringType, hintCost, maxScore, ticketsPerPoint, hasGameData, publicNotifications, useMatchingAlgorithm, globalTickets, buildVersion, apiVersion, placementName, placementDescription, placementSize, placementHeight, placementWidth, placementRefreshInterval, createObjectStore, publicContentApproval, productionMode, minimumSessionLength, sessionGapLength, localAdsEnabled, sqootApiKey, trilatProcessingType, maxSampleSize, minRSSI, modules, authorizedCount, authorizedServers, defaultTimezone, smtpPass, metaData, placementMetaData, ipsFloor, enableAPNSBadge, includeInReport, defaultAppFilterId, enableWelcomeEmail, appleAppId, appleTeamId, appleAuthKeyId, appleAuthKey, appleIssuerId, appStoreKeyId, appStoreKey, googlePrivateKeyFile, authorizeNetApiKey, authorizeNetTransactionKey, emailSender, smtpUser, smtpHost, vatomBusinessId, vatomRestClientId, vatomRestSecretKey, twilioAccountSID, twilioAuthToken, twilioSenderPhoneNumber, openAISecretKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/application/active?accountId=[value]&appKey=[value]&active=[value]
    */
  def updateApplicationActive(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("active", "query string")
        }
        
      api.updateApplicationActive(accountId, appKey, active)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/application/placement/update?deviceId=[value]&accountId=[value]&placementId=[value]&name=[value]&description=[value]&size=[value]&height=[value]&width=[value]&refreshInterval=[value]&defaultImageId=[value]&active=[value]
    */
  def updateApplicationPlacement(): Action[AnyContent] = Action { request =>
    def executeApi(): PlacementResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val placementId = request.getQueryString("placementId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("placementId", "query string")
        }
        
      val name = request.getQueryString("name")
        
      val description = request.getQueryString("description")
        
      val size = request.getQueryString("size")
        
      val height = request.getQueryString("height")
        .map(value => value.toInt)
        
      val width = request.getQueryString("width")
        .map(value => value.toInt)
        
      val refreshInterval = request.getQueryString("refreshInterval")
        .map(value => value.toInt)
        
      val defaultImageId = request.getQueryString("defaultImageId")
        .map(value => value.toLong)
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      api.updateApplicationPlacement(placementId, deviceId, accountId, name, description, size, height, width, refreshInterval, defaultImageId, active)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/application/certificate/create?deviceId=[value]&accountId=[value]&appKey=[value]&certificate=[value]
    */
  def uploadApplicationCertificate(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val certificate = request.getQueryString("certificate")
        
      api.uploadApplicationCertificate(appKey, deviceId, accountId, certificate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
