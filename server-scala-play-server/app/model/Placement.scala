package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Placement.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Placement(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  application: Option[Application],
  name: Option[String],
  description: Option[String],
  size: Option[Placement.Size.Value],
  clickType: Option[Placement.ClickType.Value],
  height: Option[Int],
  width: Option[Int],
  refreshInterval: Option[Int],
  defaultImage: Option[Asset]
)

object Placement {
  implicit lazy val placementJsonFormat: Format[Placement] = Json.format[Placement]

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

  // noinspection TypeAnnotation
  object ClickType extends Enumeration {
    val CONFIG = Value("CONFIG")
    val PURCHASE = Value("PURCHASE")
    val BANNER = Value("BANNER")
    val LEADERBOARD = Value("LEADERBOARD")
    val SKYSCRAPER = Value("SKYSCRAPER")
    val VIDEO = Value("VIDEO")
    val ZIP = Value("ZIP")
    val FULL = Value("FULL")
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

    type ClickType = Value
    implicit lazy val ClickTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

