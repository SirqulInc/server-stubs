package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ThirdPartyNetworkShortResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ThirdPartyNetworkShortResponse(
  updated: Option[Long],
  created: Option[Long],
  active: Option[Boolean],
  name: Option[String],
  description: Option[String],
  networkUID: Option[String],
  network: Option[ThirdPartyNetworkShortResponse.Network.Value]
)

object ThirdPartyNetworkShortResponse {
  implicit lazy val thirdPartyNetworkShortResponseJsonFormat: Format[ThirdPartyNetworkShortResponse] = Json.format[ThirdPartyNetworkShortResponse]

  // noinspection TypeAnnotation
  object Network extends Enumeration {
    val FACEBOOK = Value("FACEBOOK")
    val TWITTER = Value("TWITTER")
    val CLEAR = Value("CLEAR")
    val USERNAME = Value("USERNAME")
    val PHONE = Value("PHONE")
    val UNKNOWN = Value("UNKNOWN")
    val CUSTOM = Value("CUSTOM")

    type Network = Value
    implicit lazy val NetworkJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

