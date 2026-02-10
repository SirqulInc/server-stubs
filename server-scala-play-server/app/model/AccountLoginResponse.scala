package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AccountLoginResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AccountLoginResponse(
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
  accountType: Option[String],
  validated: Option[Boolean],
  returning: Option[String]
)

object AccountLoginResponse {
  implicit lazy val accountLoginResponseJsonFormat: Format[AccountLoginResponse] = Json.format[AccountLoginResponse]
}

