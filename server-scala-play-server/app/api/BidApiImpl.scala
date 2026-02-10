package api

import model.BidResponse
import model.BigDecimal
import model.SirqulResponse

/**
  * Provides a default implementation for [[BidApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class BidApiImpl extends BidApi {
  /**
    * @inheritdoc
    */
  override def createBid(version: BigDecimal, biddableType: String, biddableId: Long, amountPerView: Double, amountPerAction: Double, budgetAmount: Double, budgetSchedule: String, deviceId: Option[String], accountId: Option[Long]): BidResponse = {
    // TODO: Implement better logic

    BidResponse(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteBid(version: BigDecimal, bidId: Long, deviceId: Option[String], accountId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getBid(version: BigDecimal, bidId: Long, deviceId: Option[String], accountId: Option[Long]): BidResponse = {
    // TODO: Implement better logic

    BidResponse(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateBid(version: BigDecimal, bidId: Long, deviceId: Option[String], accountId: Option[Long], amountPerView: Option[Double], amountPerAction: Option[Double], budgetAmount: Option[Double], budgetSchedule: Option[String]): BidResponse = {
    // TODO: Implement better logic

    BidResponse(None, None, None, None, None, None, None, None, None, None, None)
  }
}
