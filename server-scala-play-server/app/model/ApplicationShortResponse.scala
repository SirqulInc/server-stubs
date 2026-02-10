package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ApplicationShortResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ApplicationShortResponse(
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
  returning: Option[String]
)

object ApplicationShortResponse {
  implicit lazy val applicationShortResponseJsonFormat: Format[ApplicationShortResponse] = Json.format[ApplicationShortResponse]
}

