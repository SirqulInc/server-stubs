package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OrsonRenderResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class OrsonRenderResponse(
  id: Option[String],
  thirdPartyAccountId: Option[String],
  status: Option[String],
  statusDescription: Option[String],
  completedOn: Option[String],
  responseCode: Option[Int],
  responseRaw: Option[String],
  video: Option[OrsonVideoResponse]
)

object OrsonRenderResponse {
  implicit lazy val orsonRenderResponseJsonFormat: Format[OrsonRenderResponse] = Json.format[OrsonRenderResponse]
}

