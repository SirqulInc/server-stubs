package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SubscriptionPlan.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class SubscriptionPlan(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  name: Option[String],
  description: Option[String],
  options: Option[List[SubscriptionOption]],
  price: Option[Double],
  promo: Option[Double],
  transactionFee: Option[Double],
  role: Option[String],
  defaultPlan: Option[Boolean],
  visible: Option[Boolean],
  image: Option[Asset]
)

object SubscriptionPlan {
  implicit lazy val subscriptionPlanJsonFormat: Format[SubscriptionPlan] = Json.format[SubscriptionPlan]
}

