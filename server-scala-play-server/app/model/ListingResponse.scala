package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListingResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ListingResponse(
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
  owner: Option[AccountShortResponse]
)

object ListingResponse {
  implicit lazy val listingResponseJsonFormat: Format[ListingResponse] = Json.format[ListingResponse]
}

