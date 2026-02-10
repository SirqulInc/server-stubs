package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Listing.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Listing(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  owner: Option[Account],
  name: Option[String],
  description: Option[String],
  start: Option[OffsetDateTime],
  end: Option[OffsetDateTime],
  locationName: Option[String],
  locationDescription: Option[String],
  participants: Option[List[Participant]],
  externalId: Option[String],
  externalGroupId: Option[String],
  filters: Option[List[Filter]],
  `private`: Option[Boolean]
)

object Listing {
  implicit lazy val listingJsonFormat: Format[Listing] = Json.format[Listing]
}

