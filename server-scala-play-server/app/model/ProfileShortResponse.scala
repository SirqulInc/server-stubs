package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProfileShortResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ProfileShortResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  accountId: Option[Long],
  locationDisplay: Option[String],
  display: Option[String],
  username: Option[String],
  profileImage: Option[String],
  profileAvatar: Option[AssetShortResponse],
  returning: Option[String]
)

object ProfileShortResponse {
  implicit lazy val profileShortResponseJsonFormat: Format[ProfileShortResponse] = Json.format[ProfileShortResponse]
}

