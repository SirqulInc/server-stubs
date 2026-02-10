package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ServiceHub.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ServiceHub(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  latitude: Option[Double],
  longitude: Option[Double],
  locationDescription: Option[String],
  name: Option[String],
  externalId: Option[String],
  business: Option[Retailer],
  location: Option[Location],
  timeZone: Option[String]
)

object ServiceHub {
  implicit lazy val serviceHubJsonFormat: Format[ServiceHub] = Json.format[ServiceHub]
}

