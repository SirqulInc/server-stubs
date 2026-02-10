package model

import play.api.libs.json._
import java.time.OffsetDateTime
import scala.collection.immutable.Set

/**
  * Represents the Swagger definition for Region.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Region(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  latitude: Option[Double],
  longitude: Option[Double],
  locationDescription: Option[String],
  owner: Option[Account],
  shortName: Option[String],
  fullName: Option[String],
  bounds: Option[GeoBox],
  start: Option[OffsetDateTime],
  end: Option[OffsetDateTime],
  polygon: Option[String],
  metaData: Option[String],
  children: Option[Set[Region]],
  parents: Option[Set[Region]],
  postalCodes: Option[Set[PostalCode]],
  regionClass: Option[Region.RegionClass.Value],
  root: Option[Boolean],
  webActive: Option[Boolean],
  adminActive: Option[Boolean],
  visibility: Option[Region.Visibility.Value],
  categories: Option[List[Category]],
  filters: Option[List[Filter]],
  truncatedLatitude: Option[Double],
  truncatedLongitude: Option[Double],
  versionCode: Option[Int],
  display: Option[String],
  contentName: Option[String]
)

object Region {
  implicit lazy val regionJsonFormat: Format[Region] = Json.format[Region]

  // noinspection TypeAnnotation
  object RegionClass extends Enumeration {
    val NATIONAL = Value("NATIONAL")
    val STATE = Value("STATE")
    val COUNTY = Value("COUNTY")
    val METROAREA = Value("METRO_AREA")
    val CITY = Value("CITY")
    val NEIGHBORHOOD = Value("NEIGHBORHOOD")
    val TERRITORY = Value("TERRITORY")
    val CUSTOM = Value("CUSTOM")
    val ZONE = Value("ZONE")

    type RegionClass = Value
    implicit lazy val RegionClassJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Visibility extends Enumeration {
    val PUBLIC = Value("PUBLIC")
    val PRIVATE = Value("PRIVATE")
    val FRIENDS = Value("FRIENDS")

    type Visibility = Value
    implicit lazy val VisibilityJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

