package api

import play.api.libs.json._
import model.BidResponse
import model.BigDecimal
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait BidApi {
  /**
    * Create Bid
    * Creates a bid on a biddable object
    * @param biddableType A biddable object type. Possible values include: CREATIVE (ads).
    * @param biddableId The id of the biddable object
    * @param amountPerView The bid amount for views. For ads, this is the amount that will be taken for each impression.
    * @param amountPerAction The bid amount for actions. For ads, this is the amount that will be taken for each click.
    * @param budgetAmount The allocated budget amount that will be used
    * @param budgetSchedule The schedule for when the allocated budget amount is reset
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    */
  def createBid(version: BigDecimal, biddableType: String, biddableId: Long, amountPerView: Double, amountPerAction: Double, budgetAmount: Double, budgetSchedule: String, deviceId: Option[String], accountId: Option[Long]): BidResponse

  /**
    * Delete Bid
    * Deleted a bid on a biddable object
    * @param bidId The bid id
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    */
  def deleteBid(version: BigDecimal, bidId: Long, deviceId: Option[String], accountId: Option[Long]): SirqulResponse

  /**
    * Get Bid
    * Get the bid details of a biddable object
    * @param bidId The bid id
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    */
  def getBid(version: BigDecimal, bidId: Long, deviceId: Option[String], accountId: Option[Long]): BidResponse

  /**
    * Update Bid
    * Updates a bid on a biddable object
    * @param bidId The bid id
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param amountPerView The bid amount for views. For ads, this is the amount that will be taken for each impression.
    * @param amountPerAction The bid amount for actions. For ads, this is the amount that will be taken for each click.
    * @param budgetAmount The allocated budget amount that will be used
    * @param budgetSchedule The schedule for when the allocated budget amount is reset
    */
  def updateBid(version: BigDecimal, bidId: Long, deviceId: Option[String], accountId: Option[Long], amountPerView: Option[Double], amountPerAction: Option[Double], budgetAmount: Option[Double], budgetSchedule: Option[String]): BidResponse
}
