package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Route.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Route(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  name: Option[String],
  externalId: Option[String],
  hub: Option[ServiceHub],
  program: Option[Program],
  zone: Option[Region],
  vehicle: Option[Vehicle],
  driver: Option[Account],
  concierge: Option[Account],
  scheduled: Option[OffsetDateTime],
  approved: Option[OffsetDateTime],
  started: Option[OffsetDateTime],
  completed: Option[OffsetDateTime],
  totalDistance: Option[Float],
  totalTime: Option[Long],
  estimatedDistance: Option[Double],
  estimatedTime: Option[Long],
  startStop: Option[Stop],
  endStop: Option[Stop],
  stops: Option[List[Stop]],
  shipments: Option[List[Shipment]],
  allShipmentsConfirmed: Option[Boolean],
  shipmentOrderCount: Option[Int],
  polyline: Option[String],
  notes: Option[List[Note]],
  noteCount: Option[Long],
  glympseToken: Option[String],
  enableOptimization: Option[Boolean],
  optimizedDate: Option[OffsetDateTime],
  optimizationStarted: Option[OffsetDateTime],
  optimizationCompleted: Option[OffsetDateTime],
  featured: Option[Boolean],
  image: Option[Asset],
  parent: Option[Route],
  contentName: Option[String]
)

object Route {
  implicit lazy val routeJsonFormat: Format[Route] = Json.format[Route]
}

