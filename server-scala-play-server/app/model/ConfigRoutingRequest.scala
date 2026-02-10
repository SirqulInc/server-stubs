package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConfigRoutingRequest.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ConfigRoutingRequest(
  debugMode: Option[Boolean],
  threaded: Option[Boolean],
  threadType: Option[String],
  maxRuntime: Option[Long],
  numberOfMatches: Option[Int],
  maxItineraryTime: Option[Int],
  maxStopsPerVehicle: Option[Int],
  averageCityTimePerMile: Option[Int],
  averageFreewayTimePerMile: Option[Int],
  freewayTravelDistance: Option[Float],
  sameStopBuffer: Option[Double],
  orderAlgorithm: Option[ConfigRoutingRequest.OrderAlgorithm.Value],
  scoreAlgorithm: Option[ConfigRoutingRequest.ScoreAlgorithm.Value]
)

object ConfigRoutingRequest {
  implicit lazy val configRoutingRequestJsonFormat: Format[ConfigRoutingRequest] = Json.format[ConfigRoutingRequest]

  // noinspection TypeAnnotation
  object OrderAlgorithm extends Enumeration {
    val CLOSESTFIRST = Value("CLOSEST_FIRST")
    val FURTHESTFIRST = Value("FURTHEST_FIRST")
    val PICKUPSFIRST = Value("PICKUPS_FIRST")

    type OrderAlgorithm = Value
    implicit lazy val OrderAlgorithmJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ScoreAlgorithm extends Enumeration {
    val FEWESTVEHICLES = Value("FEWEST_VEHICLES")
    val SHORTESTPASSENGERTIME = Value("SHORTEST_PASSENGER_TIME")

    type ScoreAlgorithm = Value
    implicit lazy val ScoreAlgorithmJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

