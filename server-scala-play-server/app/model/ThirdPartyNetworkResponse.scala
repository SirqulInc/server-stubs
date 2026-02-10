package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ThirdPartyNetworkResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ThirdPartyNetworkResponse(
  updated: Option[Long],
  created: Option[Long],
  active: Option[Boolean],
  name: Option[String],
  description: Option[String],
  networkUID: Option[String],
  network: Option[ThirdPartyNetworkResponse.Network.Value],
  introspectionMethod: Option[ThirdPartyNetworkResponse.IntrospectionMethod.Value],
  enableIntrospection: Option[Boolean],
  introspectionURL: Option[String],
  introspectionParams: Option[String],
  requiredRootField: Option[String]
)

object ThirdPartyNetworkResponse {
  implicit lazy val thirdPartyNetworkResponseJsonFormat: Format[ThirdPartyNetworkResponse] = Json.format[ThirdPartyNetworkResponse]

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

  // noinspection TypeAnnotation
  object IntrospectionMethod extends Enumeration {
    val GET = Value("GET")
    val HEAD = Value("HEAD")
    val POST = Value("POST")
    val PUT = Value("PUT")
    val PATCH = Value("PATCH")
    val DELETE = Value("DELETE")
    val OPTIONS = Value("OPTIONS")
    val TRACE = Value("TRACE")

    type IntrospectionMethod = Value
    implicit lazy val IntrospectionMethodJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

