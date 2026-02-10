package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LikableResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class LikableResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  likeCount: Option[Long],
  dislikeCount: Option[Long],
  returning: Option[String]
)

object LikableResponse {
  implicit lazy val likableResponseJsonFormat: Format[LikableResponse] = Json.format[LikableResponse]
}

