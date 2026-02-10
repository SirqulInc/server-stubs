package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SubscriptionOptionResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class SubscriptionOptionResponse(
  id: Option[Long],
  name: Option[String],
  price: Option[Double],
  quantity: Option[Int],
  threshold: Option[Int],
  visible: Option[Boolean],
  optionType: Option[String]
)

object SubscriptionOptionResponse {
  implicit lazy val subscriptionOptionResponseJsonFormat: Format[SubscriptionOptionResponse] = Json.format[SubscriptionOptionResponse]
}

