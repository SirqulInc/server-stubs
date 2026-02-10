package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ThirdPartyNetwork.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ThirdPartyNetwork(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  networkUID: Option[String],
  name: Option[String],
  description: Option[String],
  introspectionMethod: Option[ThirdPartyNetwork.IntrospectionMethod.Value],
  introspectionURL: Option[String],
  introspectionParams: Option[String],
  requiredRootField: Option[String],
  billableEntity: Option[BillableEntity],
  supportedNetwork: Option[ThirdPartyNetwork.SupportedNetwork.Value],
  enableIntrospection: Option[Boolean]
)

object ThirdPartyNetwork {
  implicit lazy val thirdPartyNetworkJsonFormat: Format[ThirdPartyNetwork] = Json.format[ThirdPartyNetwork]

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

  // noinspection TypeAnnotation
  object SupportedNetwork extends Enumeration {
    val FACEBOOK = Value("FACEBOOK")
    val TWITTER = Value("TWITTER")
    val CLEAR = Value("CLEAR")
    val USERNAME = Value("USERNAME")
    val PHONE = Value("PHONE")
    val UNKNOWN = Value("UNKNOWN")
    val CUSTOM = Value("CUSTOM")

    type SupportedNetwork = Value
    implicit lazy val SupportedNetworkJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

