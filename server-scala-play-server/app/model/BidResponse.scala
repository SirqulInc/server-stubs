package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BidResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class BidResponse(
  bidId: Option[Long],
  biddableType: Option[String],
  biddableId: Option[Long],
  amountPerView: Option[Double],
  amountPerAction: Option[Double],
  currentDailyBudget: Option[Double],
  currentBudget: Option[Double],
  currentBudgetExpiration: Option[Long],
  currentBudgetStart: Option[Long],
  budgetAmount: Option[Double],
  budgetSchedule: Option[BidResponse.BudgetSchedule.Value]
)

object BidResponse {
  implicit lazy val bidResponseJsonFormat: Format[BidResponse] = Json.format[BidResponse]

  // noinspection TypeAnnotation
  object BudgetSchedule extends Enumeration {
    val DAILY = Value("DAILY")
    val WEEKLY = Value("WEEKLY")
    val MONTHLY = Value("MONTHLY")
    val YEARLY = Value("YEARLY")

    type BudgetSchedule = Value
    implicit lazy val BudgetScheduleJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

