package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DriverResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class DriverResponse(
  id: Option[String],
  name: Option[String],
  depot: Option[LocationResponse],
  availability: Option[List[AvailabilityResponse]]
)

object DriverResponse {
  implicit lazy val driverResponseJsonFormat: Format[DriverResponse] = Json.format[DriverResponse]
}

