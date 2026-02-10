package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RatingResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class RatingResponse(
  ratingId: Option[Long],
  ratingValue: Option[Int],
  latitude: Option[Double],
  longitude: Option[Double],
  locationDescription: Option[String],
  category: Option[CategoryResponse],
  owner: Option[AccountShortResponse]
)

object RatingResponse {
  implicit lazy val ratingResponseJsonFormat: Format[RatingResponse] = Json.format[RatingResponse]
}

