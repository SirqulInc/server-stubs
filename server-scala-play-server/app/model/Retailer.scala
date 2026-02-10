package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Retailer.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Retailer(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  latitude: Option[Double],
  longitude: Option[Double],
  locationDescription: Option[String],
  name: Option[String],
  responsible: Option[Account],
  manager: Option[Account],
  detailsHeader: Option[String],
  detailsBody: Option[String],
  detailsLineLeft1: Option[String],
  detailsLineLeft2: Option[String],
  detailsLineRight1: Option[String],
  metaDescription: Option[String],
  directions: Option[String],
  hours: Option[String],
  homePhone: Option[String],
  cellPhone: Option[String],
  cellCarrier: Option[CellCarrier],
  businessPhone: Option[String],
  businessPhoneExt: Option[String],
  faxNumber: Option[String],
  timeZone: Option[String],
  utcOffset: Option[String],
  code501c3: Option[String],
  emailAddress: Option[String],
  address: Option[Address],
  web: Option[String],
  featured: Option[Boolean],
  listed: Option[Boolean],
  categories: Option[List[Category]],
  territory: Option[Territory],
  locations: Option[List[RetailerLocation]],
  yipitId: Option[Long],
  facebookUrl: Option[String],
  twitterUrl: Option[String],
  visibility: Option[Retailer.Visibility.Value],
  notes: Option[List[Note]],
  noteCount: Option[Long],
  appKey: Option[String],
  categoryTree: Option[String],
  filterTree: Option[String],
  billableId: Option[Long],
  subType: Option[String],
  contentName: Option[String],
  owner: Option[Account]
)

object Retailer {
  implicit lazy val retailerJsonFormat: Format[Retailer] = Json.format[Retailer]

  // noinspection TypeAnnotation
  object Visibility extends Enumeration {
    val PUBLIC = Value("PUBLIC")
    val PRIVATE = Value("PRIVATE")
    val FRIENDS = Value("FRIENDS")

    type Visibility = Value
    implicit lazy val VisibilityJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

