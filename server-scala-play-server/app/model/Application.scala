package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Application.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Application(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  title: Option[String],
  about: Option[String],
  certificateUrl: Option[String],
  certificateName: Option[String],
  certificate: Option[BlobFile],
  certificateLastUpdated: Option[OffsetDateTime],
  appDescription: Option[String],
  showInActivities: Option[Boolean],
  cssClass: Option[String],
  inviteWelcomeText: Option[String],
  bundleId: Option[String],
  appType: Option[String],
  scoringType: Option[Application.ScoringType.Value],
  appKey: Option[String],
  appRestKey: Option[String],
  appTokenKey: Option[String],
  hintCost: Option[Int],
  eulaDate: Option[OffsetDateTime],
  eulaVersion: Option[String],
  landingPageUrl: Option[String],
  invitePageUrl: Option[String],
  downloadUrls: Option[String],
  appName: Option[String],
  appIcon: Option[Asset],
  appLogo: Option[Asset],
  billableEntity: Option[BillableEntity],
  facebookAppId: Option[String],
  facebookAppSecret: Option[String],
  twitterAppId: Option[String],
  twitterAppSecret: Option[String],
  twitterCallbackURL: Option[String],
  defaultImage: Option[String],
  modules: Option[String],
  authorizedServers: Option[String],
  authorizedCount: Option[Int],
  activeServers: Option[String],
  licensePeriod: Option[OffsetDateTime],
  hasGameData: Option[Boolean],
  currentBuildVersion: Option[String],
  currentApiVersion: Option[String],
  globalTickets: Option[Boolean],
  ticketsPerPoint: Option[Float],
  maxPointsPerScore: Option[Int],
  useAppCache: Option[Boolean],
  uniqueUserTag: Option[String],
  useMatchingAlgorithm: Option[Boolean],
  platforms: Option[List[Platform]],
  categories: Option[List[Category]],
  placements: Option[List[Placement]],
  hasAdvertisements: Option[Boolean],
  appleAppId: Option[String],
  googleAppId: Option[String],
  googleApiKey: Option[String],
  googleOAuthClientId: Option[String],
  googleOAuthSecret: Option[String],
  googleOAuthAccessToken: Option[String],
  googleOAuthRefreshToken: Option[String],
  baiduApiKey: Option[String],
  baiduSecretKey: Option[String],
  jpushAppKey: Option[String],
  jpushMasterSecret: Option[String],
  xgPushSecretKey: Option[String],
  publicNotifications: Option[Boolean],
  urlScheme: Option[String],
  retailer: Option[Retailer],
  objectStoreSession: Option[String],
  publicContentApproval: Option[Boolean],
  productionMode: Option[Boolean],
  griplyBaseUrl: Option[String],
  minimumSessionLength: Option[Int],
  sessionGapLength: Option[Int],
  processSessionData: Option[Boolean],
  localAdsEnabled: Option[Boolean],
  includeInReport: Option[Boolean],
  sqootApiKey: Option[String],
  amqpEnabled: Option[Boolean],
  trilatSettings: Option[TrilatAppSettings]
)

object Application {
  implicit lazy val applicationJsonFormat: Format[Application] = Json.format[Application]

  // noinspection TypeAnnotation
  object ScoringType extends Enumeration {
    val GAMELEVEL = Value("GAME_LEVEL")
    val GAMEOBJECT = Value("GAME_OBJECT")

    type ScoringType = Value
    implicit lazy val ScoringTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

