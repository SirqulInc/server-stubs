package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AudienceResponse(
  id: Option[Long],
  name: Option[String],
  latitude: Option[Double],
  longitude: Option[Double],
  radius: Option[Double],
  sendSuggestion: Option[Boolean],
  description: Option[String],
  active: Option[Boolean],
  searchTags: Option[String],
  ownerId: Option[Long],
  gender: Option[String],
  ageGroups: Option[List[AgeGroupResponse]],
  categories: Option[List[CategoryResponse]],
  applications: Option[List[ApplicationShortResponse]],
  devices: Option[List[AudienceDeviceResponse]],
  gameExperienceLevel: Option[String],
  locations: Option[List[GeocodeLatLngResponse]],
  associateType: Option[String],
  associateId: Option[Long],
  associateDescription: Option[String]
)

object AudienceResponse {
  implicit lazy val audienceResponseJsonFormat: Format[AudienceResponse] = Json.format[AudienceResponse]
}

