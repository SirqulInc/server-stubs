package api

import model.AccountListResponse
import model.ApplicationResponse
import model.ApplicationSettingsResponse
import model.ApplicationShortResponse
import model.BigDecimal
import model.PlacementResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[ApplicationApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ApplicationApiImpl extends ApplicationApi {
  /**
    * @inheritdoc
    */
  override def createApplication(version: BigDecimal, appName: String, deviceId: Option[String], accountId: Option[Long], about: Option[String], bundleId: Option[String], appIconAssetId: Option[Long], appLogoAssetId: Option[Long], facebookAppId: Option[String], facebookAppSecret: Option[String], googleApiKey: Option[String], updateEULADate: Option[Boolean], eulaVersion: Option[String], landingPageUrl: Option[String], showInActivities: Option[Boolean], activityDescription: Option[String], inviteWelcomeText: Option[String], invitePageUrl: Option[String], urlScheme: Option[String], platforms: Option[String], downloadUrls: Option[String], categoryIds: Option[String], scoringType: Option[String], hintCost: Option[Int], maxScore: Option[Int], ticketsPerPoint: Option[Float], hasGameData: Option[Boolean], publicNotifications: Option[Boolean], useMatchingAlgorithm: Option[Boolean], globalTickets: Option[Boolean], buildVersion: Option[Float], apiVersion: Option[Float], placementName: Option[String], placementDescription: Option[String], placementSize: Option[String], placementHeight: Option[Int], placementWidth: Option[Int], placementRefreshInterval: Option[Int], createObjectStore: Option[Boolean], publicContentApproval: Option[Boolean], productionMode: Option[Boolean], minimumSessionLength: Option[Int], sessionGapLength: Option[Int], localAdsEnabled: Option[Boolean], sqootApiKey: Option[String], trilatProcessingType: Option[String], maxSampleSize: Option[Int], minRSSI: Option[Double], modules: Option[String], authorizedCount: Option[Int], authorizedServers: Option[String], defaultTimezone: Option[String], smtpPass: Option[String], metaData: Option[String], placementMetaData: Option[String], ipsFloor: Option[Boolean], enableAPNSBadge: Option[Boolean], includeInReport: Option[Boolean], defaultAppFilterId: Option[Long], enableWelcomeEmail: Option[Boolean], appleAppId: Option[String], appleTeamId: Option[String], appleAuthKeyId: Option[String], appleAuthKey: Option[TemporaryFile], appleIssuerId: Option[String], appStoreKeyId: Option[String], appStoreKey: Option[TemporaryFile], googlePrivateKeyFile: Option[TemporaryFile], authorizeNetApiKey: Option[String], authorizeNetTransactionKey: Option[String], emailSender: Option[String], smtpUser: Option[String], smtpHost: Option[String], vatomBusinessId: Option[String], vatomRestClientId: Option[String], vatomRestSecretKey: Option[String], twilioAccountSID: Option[String], twilioAuthToken: Option[String], twilioSenderPhoneNumber: Option[String], openAISecretKey: Option[String]): ApplicationResponse = {
    // TODO: Implement better logic

    ApplicationResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createApplicationPlacement(version: BigDecimal, appKey: String, size: String, deviceId: Option[String], accountId: Option[Long], name: Option[String], description: Option[String], height: Option[Int], width: Option[Int], refreshInterval: Option[Int], defaultImageId: Option[Long], active: Option[Boolean]): PlacementResponse = {
    // TODO: Implement better logic

    PlacementResponse(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteApplication(version: BigDecimal, accountId: Option[Long], appKey: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteApplicationPlacement(version: BigDecimal, placementId: Long, deviceId: Option[String], accountId: Option[Long]): PlacementResponse = {
    // TODO: Implement better logic

    PlacementResponse(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getApplication(version: BigDecimal, appKey: Option[String], applicationId: Option[Long]): ApplicationResponse = {
    // TODO: Implement better logic

    ApplicationResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getApplicationPlacement(version: BigDecimal, placementId: Long, deviceId: Option[String], accountId: Option[Long]): PlacementResponse = {
    // TODO: Implement better logic

    PlacementResponse(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getApplicationVersions(version: BigDecimal): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getUniqueUsersByApp(version: BigDecimal, appKey: String, q: Option[String], keyword: Option[String], since: Option[Long], i: Option[Int], start: Option[Int], l: Option[Int], limit: Option[Int]): AccountListResponse = {
    // TODO: Implement better logic

    AccountListResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def listApplications(version: BigDecimal, accountId: Option[Long], q: Option[String], keyword: Option[String], platforms: Option[String], deviceIds: Option[String], deviceVersions: Option[String], categoryIds: Option[String], sortField: Option[String], hasAds: Option[Boolean], publicNotifications: Option[Boolean], filterBillable: Option[Boolean], filterContentAdmin: Option[Boolean], descending: Option[Boolean], i: Option[Int], start: Option[Int], l: Option[Int], limit: Option[Int], applicationIds: Option[String], hasObjectStore: Option[Boolean], activeOnly: Option[Boolean]): List[ApplicationShortResponse] = {
    // TODO: Implement better logic

    List.empty[ApplicationShortResponse]
  }

  /**
    * @inheritdoc
    */
  override def searchApplicationPlacement(version: BigDecimal, appKey: String, deviceId: Option[String], accountId: Option[Long], start: Option[Int], limit: Option[Int]): List[PlacementResponse] = {
    // TODO: Implement better logic

    List.empty[PlacementResponse]
  }

  /**
    * @inheritdoc
    */
  override def searchApplicationSettings(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], connectionAccountId: Option[Long], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): ApplicationSettingsResponse = {
    // TODO: Implement better logic

    ApplicationSettingsResponse(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchApplications(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double], q: Option[String], keyword: Option[String], qSearchFields: Option[String], sortField: Option[String], descending: Option[Boolean], i: Option[Int], start: Option[Int], l: Option[Int], limit: Option[Int], hasAds: Option[Boolean], publicNotifications: Option[Boolean], activeOnly: Option[Boolean]): List[ApplicationResponse] = {
    // TODO: Implement better logic

    List.empty[ApplicationResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateApplication(version: BigDecimal, appKey: String, appName: String, deviceId: Option[String], accountId: Option[Long], about: Option[String], bundleId: Option[String], appIconAssetId: Option[Long], appLogoAssetId: Option[Long], facebookAppId: Option[String], facebookAppSecret: Option[String], googleApiKey: Option[String], updateEULADate: Option[Boolean], eulaVersion: Option[String], landingPageUrl: Option[String], showInActivities: Option[Boolean], activityDescription: Option[String], inviteWelcomeText: Option[String], invitePageUrl: Option[String], urlScheme: Option[String], platforms: Option[String], downloadUrls: Option[String], categoryIds: Option[String], scoringType: Option[String], hintCost: Option[Int], maxScore: Option[Int], ticketsPerPoint: Option[Float], hasGameData: Option[Boolean], publicNotifications: Option[Boolean], useMatchingAlgorithm: Option[Boolean], globalTickets: Option[Boolean], buildVersion: Option[Float], apiVersion: Option[Float], placementName: Option[String], placementDescription: Option[String], placementSize: Option[String], placementHeight: Option[Int], placementWidth: Option[Int], placementRefreshInterval: Option[Int], createObjectStore: Option[Boolean], publicContentApproval: Option[Boolean], productionMode: Option[Boolean], minimumSessionLength: Option[Int], sessionGapLength: Option[Int], localAdsEnabled: Option[Boolean], sqootApiKey: Option[String], trilatProcessingType: Option[String], maxSampleSize: Option[Int], minRSSI: Option[Double], modules: Option[String], authorizedCount: Option[Int], authorizedServers: Option[String], defaultTimezone: Option[String], smtpPass: Option[String], metaData: Option[String], placementMetaData: Option[String], ipsFloor: Option[Boolean], enableAPNSBadge: Option[Boolean], includeInReport: Option[Boolean], defaultAppFilterId: Option[Long], enableWelcomeEmail: Option[Boolean], appleAppId: Option[String], appleTeamId: Option[String], appleAuthKeyId: Option[String], appleAuthKey: Option[TemporaryFile], appleIssuerId: Option[String], appStoreKeyId: Option[String], appStoreKey: Option[TemporaryFile], googlePrivateKeyFile: Option[TemporaryFile], authorizeNetApiKey: Option[String], authorizeNetTransactionKey: Option[String], emailSender: Option[String], smtpUser: Option[String], smtpHost: Option[String], vatomBusinessId: Option[String], vatomRestClientId: Option[String], vatomRestSecretKey: Option[String], twilioAccountSID: Option[String], twilioAuthToken: Option[String], twilioSenderPhoneNumber: Option[String], openAISecretKey: Option[String]): ApplicationResponse = {
    // TODO: Implement better logic

    ApplicationResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateApplicationActive(version: BigDecimal, accountId: Long, appKey: String, active: Boolean): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateApplicationPlacement(version: BigDecimal, placementId: Long, deviceId: Option[String], accountId: Option[Long], name: Option[String], description: Option[String], size: Option[String], height: Option[Int], width: Option[Int], refreshInterval: Option[Int], defaultImageId: Option[Long], active: Option[Boolean]): PlacementResponse = {
    // TODO: Implement better logic

    PlacementResponse(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def uploadApplicationCertificate(version: BigDecimal, appKey: String, deviceId: Option[String], accountId: Option[Long], certificate: Option[TemporaryFile]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }
}
