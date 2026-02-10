package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OrderItemRequest.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class OrderItemRequest(
  orderItemType: Option[OrderItemRequest.OrderItemType.Value],
  orderItemId: Option[Long],
  offerName: Option[String],
  orderCustomType: Option[String],
  orderCustomId: Option[String],
  retailerLocationId: Option[Long],
  quantity: Option[Int],
  amount: Option[Double],
  tax: Option[Double],
  reserveStartDate: Option[Long],
  reserveEndDate: Option[Long],
  message: Option[String]
)

object OrderItemRequest {
  implicit lazy val orderItemRequestJsonFormat: Format[OrderItemRequest] = Json.format[OrderItemRequest]

  // noinspection TypeAnnotation
  object OrderItemType extends Enumeration {
    val OFFER = Value("OFFER")
    val CUSTOM = Value("CUSTOM")

    type OrderItemType = Value
    implicit lazy val OrderItemTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

