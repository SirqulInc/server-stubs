package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ThirdPartyCredentials.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ThirdPartyCredentials(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  account: Option[Account],
  thirdPartyNetwork: Option[ThirdPartyNetwork],
  thirdPartyUID: Option[Long],
  thirdPartyId: Option[String],
  thirdPartyToken: Option[String],
  thirdPartySecret: Option[String],
  thirdPartyName: Option[String],
  thirdPartyUnencryptedToken: Option[String]
)

object ThirdPartyCredentials {
  implicit lazy val thirdPartyCredentialsJsonFormat: Format[ThirdPartyCredentials] = Json.format[ThirdPartyCredentials]
}

