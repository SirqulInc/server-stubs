package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Location.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Location(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  latitude: Option[Double],
  longitude: Option[Double],
  locationDescription: Option[String],
  name: Option[String],
  territory: Option[Territory],
  hub: Option[ServiceHub],
  picture: Option[Asset],
  notes: Option[List[Note]],
  noteCount: Option[Long],
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
  program: Option[Program],
  visibility: Option[Location.Visibility.Value],
  groupingId: Option[String],
  destination: Option[Boolean],
  dockingTime: Option[Long],
  usageCount: Option[Long],
  timeFramesAllowed: Option[String],
  likes: Option[List[YayOrNay]],
  likeCount: Option[Long],
  dislikeCount: Option[Long],
  ownerDisplay: Option[String],
  contentName: Option[String]
)

object Location {
  implicit lazy val locationJsonFormat: Format[Location] = Json.format[Location]

  // noinspection TypeAnnotation
  object Visibility extends Enumeration {
    val PUBLIC = Value("PUBLIC")
    val PRIVATE = Value("PRIVATE")
    val FRIENDS = Value("FRIENDS")

    type Visibility = Value
    implicit lazy val VisibilityJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

