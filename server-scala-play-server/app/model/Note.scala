package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Note.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Note(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  latitude: Option[Double],
  longitude: Option[Double],
  locationDescription: Option[String],
  owner: Option[Account],
  notableType: Option[String],
  notableId: Option[Long],
  noteTag: Option[String],
  notes: Option[List[Note]],
  likes: Option[List[YayOrNay]],
  assets: Option[List[Asset]],
  noteDescription: Option[String],
  likeCount: Option[Long],
  dislikeCount: Option[Long],
  noteCount: Option[Long],
  flags: Option[List[Flag]],
  flagCount: Option[Long],
  flagThreshold: Option[FlagThreshold],
  contentName: Option[String],
  defaultThreshold: Option[Long]
)

object Note {
  implicit lazy val noteJsonFormat: Format[Note] = Json.format[Note]
}

