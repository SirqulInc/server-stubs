package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for ApplicationUsageResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ApplicationUsageResponse(
  billableEntity: Option[BillableEntityResponse],
  applicationId: Option[Long],
  invoiceDate: Option[OffsetDateTime],
  balance: Option[Double],
  totalRequests: Option[Long],
  totalDataStorage: Option[Long],
  totalMediaStorage: Option[Long],
  totalNotifications: Option[Long],
  maxMissions: Option[Long],
  maxVouchers: Option[Long],
  maxCoupons: Option[Long],
  maxProducts: Option[Long],
  maxEvents: Option[Long],
  maxMedia: Option[Long],
  maxLocations: Option[Long]
)

object ApplicationUsageResponse {
  implicit lazy val applicationUsageResponseJsonFormat: Format[ApplicationUsageResponse] = Json.format[ApplicationUsageResponse]
}

