package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for QueueResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class QueueResponse(
  queueId: Option[Long],
  name: Option[String],
  host: Option[String],
  port: Option[Int],
  username: Option[String],
  password: Option[String],
  virtualHost: Option[String],
  workers: Option[Int],
  exchanger: Option[String],
  exchangerType: Option[String],
  handleDelivery: Option[Boolean],
  dataMapping: Option[String],
  analyticTags: Option[String]
)

object QueueResponse {
  implicit lazy val queueResponseJsonFormat: Format[QueueResponse] = Json.format[QueueResponse]
}

