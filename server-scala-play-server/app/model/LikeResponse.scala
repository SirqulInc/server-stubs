package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LikeResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class LikeResponse(
  account: Option[AccountShortResponse]
)

object LikeResponse {
  implicit lazy val likeResponseJsonFormat: Format[LikeResponse] = Json.format[LikeResponse]
}

