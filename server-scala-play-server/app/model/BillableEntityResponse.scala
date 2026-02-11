package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BillableEntityResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class BillableEntityResponse(
  billableEntityId: Option[Long],
  name: Option[String],
  responsible: Option[ProfileShortResponse],
  contact: Option[ContactInfoResponse],
  subscription: Option[SubscriptionResponse],
  payment: Option[PaymentTypesResponse]
)

object BillableEntityResponse {
  implicit lazy val billableEntityResponseJsonFormat: Format[BillableEntityResponse] = Json.format[BillableEntityResponse]
}

