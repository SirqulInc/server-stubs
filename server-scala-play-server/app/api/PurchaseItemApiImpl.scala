package api

import model.BigDecimal
import model.PurchaseItemFullResponse
import model.PurchaseItemResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[PurchaseItemApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class PurchaseItemApiImpl extends PurchaseItemApi {
  /**
    * @inheritdoc
    */
  override def createPurchaseItem(version: BigDecimal, appKey: String, name: String, purchaseType: String, deviceId: Option[String], accountId: Option[Long], description: Option[String], tickets: Option[Int], price: Option[Float], purchaseCode: Option[String], secretKey: Option[String], purchaseLimit: Option[Int], serviceAction: Option[String], coverAssetId: Option[Long], promoAssetId: Option[Long], giftable: Option[Boolean], assetable: Option[Boolean], allocateTickets: Option[Boolean], ticketType: Option[String], points: Option[Long], offerLocationId: Option[Long]): PurchaseItemFullResponse = {
    // TODO: Implement better logic

    PurchaseItemFullResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deletePurchaseItem(version: BigDecimal, purchaseItemId: Long, deviceId: Option[String], accountId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getPurchaseItem(version: BigDecimal, purchaseItemId: Long, deviceId: Option[String], accountId: Option[Long]): PurchaseItemFullResponse = {
    // TODO: Implement better logic

    PurchaseItemFullResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchPurchaseItems(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appKey: Option[String], filterByBillable: Option[Boolean], purchaseType: Option[String], serviceAction: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean]): List[PurchaseItemResponse] = {
    // TODO: Implement better logic

    List.empty[PurchaseItemResponse]
  }

  /**
    * @inheritdoc
    */
  override def updatePurchaseItem(version: BigDecimal, purchaseItemId: Long, deviceId: Option[String], accountId: Option[Long], name: Option[String], description: Option[String], tickets: Option[Int], price: Option[Float], purchaseType: Option[String], purchaseCode: Option[String], secretKey: Option[String], purchaseLimit: Option[Int], serviceAction: Option[String], coverAssetId: Option[Long], promoAssetId: Option[Long], giftable: Option[Boolean], assetable: Option[Boolean], active: Option[Boolean], allocateTickets: Option[Boolean], ticketType: Option[String], points: Option[Long], offerLocationId: Option[Long]): PurchaseItemFullResponse = {
    // TODO: Implement better logic

    PurchaseItemFullResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
