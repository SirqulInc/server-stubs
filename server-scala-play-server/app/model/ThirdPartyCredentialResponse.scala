package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ThirdPartyCredentialResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ThirdPartyCredentialResponse(
  thirdPartyCredentialId: Option[Long],
  thirdPartyId: Option[String],
  thirdPartyName: Option[String],
  network: Option[ThirdPartyNetworkShortResponse],
  updated: Option[Long],
  created: Option[Long]
)

object ThirdPartyCredentialResponse {
  implicit lazy val thirdPartyCredentialResponseJsonFormat: Format[ThirdPartyCredentialResponse] = Json.format[ThirdPartyCredentialResponse]
}

