package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SubscriptionResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class SubscriptionResponse(
  id: Option[Long],
  subscriptionPlan: Option[SubscriptionPlanResponse],
  promoCode: Option[String],
  active: Option[Boolean]
)

object SubscriptionResponse {
  implicit lazy val subscriptionResponseJsonFormat: Format[SubscriptionResponse] = Json.format[SubscriptionResponse]
}

