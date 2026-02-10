package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PlacementResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class PlacementResponse(
  placementId: Option[Long],
  name: Option[String],
  description: Option[String],
  size: Option[PlacementResponse.Size.Value],
  height: Option[Int],
  width: Option[Int],
  refreshInterval: Option[Int],
  appName: Option[String],
  appKey: Option[String],
  active: Option[Boolean],
  defaultImage: Option[AssetShortResponse]
)

object PlacementResponse {
  implicit lazy val placementResponseJsonFormat: Format[PlacementResponse] = Json.format[PlacementResponse]

  // noinspection TypeAnnotation
  object Size extends Enumeration {
    val CONFIG = Value("CONFIG")
    val BANNER = Value("BANNER")
    val LEADERBOARD = Value("LEADERBOARD")
    val SKYSCRAPER = Value("SKYSCRAPER")
    val VIDEO = Value("VIDEO")
    val ZIP = Value("ZIP")
    val INTERSTITIAL = Value("INTERSTITIAL")
    val CUSTOM1 = Value("CUSTOM1")
    val CUSTOM2 = Value("CUSTOM2")
    val CUSTOM3 = Value("CUSTOM3")
    val CUSTOM4 = Value("CUSTOM4")
    val CUSTOM5 = Value("CUSTOM5")
    val CUSTOM6 = Value("CUSTOM6")
    val CUSTOM7 = Value("CUSTOM7")
    val CUSTOM8 = Value("CUSTOM8")
    val CUSTOM9 = Value("CUSTOM9")
    val CUSTOM10 = Value("CUSTOM10")

    type Size = Value
    implicit lazy val SizeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

