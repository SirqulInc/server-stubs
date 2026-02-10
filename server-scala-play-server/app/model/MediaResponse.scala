package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MediaResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class MediaResponse(
  mediaType: Option[String],
  duration: Option[Int],
  author: Option[String],
  releaseDate: Option[Long]
)

object MediaResponse {
  implicit lazy val mediaResponseJsonFormat: Format[MediaResponse] = Json.format[MediaResponse]
}

