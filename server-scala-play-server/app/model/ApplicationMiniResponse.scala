package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ApplicationMiniResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ApplicationMiniResponse(
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
  returning: Option[String]
)

object ApplicationMiniResponse {
  implicit lazy val applicationMiniResponseJsonFormat: Format[ApplicationMiniResponse] = Json.format[ApplicationMiniResponse]
}

