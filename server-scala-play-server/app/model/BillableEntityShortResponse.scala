package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BillableEntityShortResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class BillableEntityShortResponse(
  billableEntityId: Option[Long],
  name: Option[String],
  responsible: Option[ProfileShortResponse]
)

object BillableEntityShortResponse {
  implicit lazy val billableEntityShortResponseJsonFormat: Format[BillableEntityShortResponse] = Json.format[BillableEntityShortResponse]
}

