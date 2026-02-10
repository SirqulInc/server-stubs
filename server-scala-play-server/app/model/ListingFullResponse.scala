package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListingFullResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ListingFullResponse(
  id: Option[Long],
  name: Option[String],
  description: Option[String],
  start: Option[Long],
  end: Option[Long],
  locationName: Option[String],
  locationDescription: Option[String],
  privateListing: Option[Boolean],
  active: Option[Boolean],
  participants: Option[List[ParticipantResponse]],
  owner: Option[AccountShortResponse],
  filters: Option[List[FilterResponse]]
)

object ListingFullResponse {
  implicit lazy val listingFullResponseJsonFormat: Format[ListingFullResponse] = Json.format[ListingFullResponse]
}

