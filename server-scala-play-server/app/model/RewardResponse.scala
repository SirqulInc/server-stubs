package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RewardResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class RewardResponse(
  offerId: Option[Long],
  title: Option[String],
  subTitle: Option[String],
  details: Option[String],
  artwork: Option[AssetShortResponse],
  finePrint: Option[String],
  redemptionCode: Option[String],
  redemptionStatus: Option[Int],
  transactionId: Option[Long],
  estimatedValue: Option[Double]
)

object RewardResponse {
  implicit lazy val rewardResponseJsonFormat: Format[RewardResponse] = Json.format[RewardResponse]
}

