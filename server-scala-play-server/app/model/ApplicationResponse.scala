package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ApplicationResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ApplicationResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  applicationId: Option[Long],
  appKey: Option[String],
  title: Option[String],
  currentBuildVersion: Option[String],
  currentApiVersion: Option[String],
  appIcon: Option[AssetShortResponse],
  appLogo: Option[AssetShortResponse],
  active: Option[Boolean],
  about: Option[String],
  landingPageUrl: Option[String],
  landingPageFullUrl: Option[String],
  defaultImageFullUrl: Option[String],
  activityDescription: Option[String],
  platforms: Option[List[PlatformResponse]],
  categories: Option[List[CategoryResponse]],
  placementCount: Option[Int],
  billable: Option[BillableEntityShortResponse],
  hasAds: Option[Boolean],
  publicNotifications: Option[Boolean],
  urlScheme: Option[String],
  global: Option[Boolean],
  downloadUrls: Option[String],
  localAdsEnabled: Option[Boolean],
  trilatSettings: Option[TrilatAppSettings],
  appType: Option[String],
  appName: Option[String],
  bundleId: Option[String],
  scoringType: Option[ApplicationResponse.ScoringType.Value],
  hintCost: Option[Int],
  maxScore: Option[Int],
  ticketsPerPoint: Option[Float],
  hasGameData: Option[Boolean],
  globalTickets: Option[Boolean],
  eulaVersion: Option[String],
  eulaDateUpdated: Option[Long],
  modules: Option[String],
  billableEntityName: Option[String],
  showInActivities: Option[Boolean],
  cssClass: Option[String],
  inviteWelcomeText: Option[String],
  invitePageUrl: Option[String],
  apnsCertificateFileName: Option[String],
  facebookAppId: Option[String],
  facebookAppSecret: Option[String],
  appToken: Option[String],
  googleApiKey: Option[String],
  appRestKey: Option[String],
  publicContentApproval: Option[Boolean],
  productionMode: Option[Boolean],
  minimumSessionLength: Option[Int],
  sessionGapLength: Option[Int],
  sqootApiKey: Option[String],
  amqpEnabled: Option[Boolean],
  authorizedCount: Option[Int],
  authorizedServers: Option[String],
  returning: Option[String]
)

object ApplicationResponse {
  implicit lazy val applicationResponseJsonFormat: Format[ApplicationResponse] = Json.format[ApplicationResponse]

  // noinspection TypeAnnotation
  object ScoringType extends Enumeration {
    val GAMELEVEL = Value("GAME_LEVEL")
    val GAMEOBJECT = Value("GAME_OBJECT")

    type ScoringType = Value
    implicit lazy val ScoringTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

