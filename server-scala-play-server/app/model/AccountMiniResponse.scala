package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AccountMiniResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AccountMiniResponse(
  accountId: Option[Long],
  locationDisplay: Option[String],
  display: Option[String],
  username: Option[String],
  accountType: Option[String]
)

object AccountMiniResponse {
  implicit lazy val accountMiniResponseJsonFormat: Format[AccountMiniResponse] = Json.format[AccountMiniResponse]
}

