package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RegionLegSummary.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class RegionLegSummary(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  regionId: Option[Long],
  floorId: Option[String],
  retailerLocationId: Option[Long],
  legId: Option[Long]
)

object RegionLegSummary {
  implicit lazy val regionLegSummaryJsonFormat: Format[RegionLegSummary] = Json.format[RegionLegSummary]
}

