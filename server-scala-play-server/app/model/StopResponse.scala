package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for StopResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class StopResponse(
  geoId: Option[String],
  latitude: Option[Double],
  longitude: Option[Double],
  startWindow: Option[Long],
  endWindow: Option[Long],
  `type`: Option[StopResponse.Type.Value],
  eta: Option[Long],
  etd: Option[Long],
  score: Option[Long],
  errorCode: Option[String],
  error: Option[String],
  itemId: Option[String],
  itemSize: Option[Long],
  load: Option[LoadShortResponse],
  floorPlanPath: Option[List[NodeRequest]],
  valid: Option[Boolean]
)

object StopResponse {
  implicit lazy val stopResponseJsonFormat: Format[StopResponse] = Json.format[StopResponse]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val PICKUP = Value("PICKUP")
    val DROPOFF = Value("DROPOFF")
    val START = Value("START")
    val END = Value("END")
    val ROUTING = Value("ROUTING")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

