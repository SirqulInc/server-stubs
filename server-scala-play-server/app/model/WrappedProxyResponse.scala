package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for WrappedProxyResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class WrappedProxyResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  returning: Option[String],
  `type`: Option[String],
  responseCode: Option[Int],
  responseRaw: Option[String],
  requestDuration: Option[Long],
  requestEndTime: Option[Long]
)

object WrappedProxyResponse {
  implicit lazy val wrappedProxyResponseJsonFormat: Format[WrappedProxyResponse] = Json.format[WrappedProxyResponse]
}

