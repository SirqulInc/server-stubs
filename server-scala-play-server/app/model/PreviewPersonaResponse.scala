package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PreviewPersonaResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class PreviewPersonaResponse(
  personaId: Option[Long],
  title: Option[String],
  previewAccounts: Option[List[AccountMiniResponse]],
  active: Option[Boolean],
  date: Option[Long],
  age: Option[Int],
  gender: Option[String],
  gameExperienceLevel: Option[String],
  latitude: Option[Double],
  longitude: Option[Double]
)

object PreviewPersonaResponse {
  implicit lazy val previewPersonaResponseJsonFormat: Format[PreviewPersonaResponse] = Json.format[PreviewPersonaResponse]
}

