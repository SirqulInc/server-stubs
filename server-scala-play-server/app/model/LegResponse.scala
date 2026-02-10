package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LegResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class LegResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  appKey: Option[String],
  distance: Option[Double],
  duration: Option[Long],
  startLatitude: Option[Double],
  startLongitude: Option[Double],
  startAltitude: Option[Double],
  startDate: Option[Long],
  endLatitude: Option[Double],
  endLongitude: Option[Double],
  endAltitude: Option[Double],
  endDate: Option[Long],
  created: Option[Long],
  tags: Option[String],
  deviceId: Option[String],
  accountId: Option[Long],
  deviceSignature: Option[String],
  parentAccountId: Option[Long],
  steps: Option[List[StepResponse]],
  `type`: Option[String],
  returning: Option[String]
)

object LegResponse {
  implicit lazy val legResponseJsonFormat: Format[LegResponse] = Json.format[LegResponse]
}

