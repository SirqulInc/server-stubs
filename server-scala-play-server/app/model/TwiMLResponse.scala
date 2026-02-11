package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TwiMLResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class TwiMLResponse(
  tag: Option[String],
  body: Option[String],
  attributes: Option[Map[String, String]],
  children: Option[List[Verb]]
)

object TwiMLResponse {
  implicit lazy val twiMLResponseJsonFormat: Format[TwiMLResponse] = Json.format[TwiMLResponse]
}

