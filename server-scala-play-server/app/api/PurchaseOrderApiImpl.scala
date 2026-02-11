package api

import model.OrderResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[PurchaseOrderApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class PurchaseOrderApiImpl extends PurchaseOrderApi {
  /**
    * @inheritdoc
    */
  override def createOrder(appKey: String, cart: String, deviceId: Option[String], accountId: Option[Long], description: Option[String], currencyType: Option[String], paymentMethodId: Option[Long], externalOrderId: Option[String], externalPaymentId: Option[String], remoteRefType: Option[String], externalDate: Option[Long], promoCode: Option[String]): OrderResponse = {
    // TODO: Implement better logic

    OrderResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteOrder(orderId: Long, deviceId: Option[String], accountId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getOrder(deviceId: Option[String], accountId: Option[Long], orderId: Option[Long], externalOrderId: Option[String]): OrderResponse = {
    // TODO: Implement better logic

    OrderResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def previewOrder(appKey: String, cart: String, deviceId: Option[String], accountId: Option[Long], description: Option[String], currencyType: Option[String], paymentMethodId: Option[Long], externalOrderId: Option[String], externalPaymentId: Option[String], remoteRefType: Option[String], externalDate: Option[Long], promoCode: Option[String]): OrderResponse = {
    // TODO: Implement better logic

    OrderResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchOrders(appKey: String, deviceId: Option[String], accountId: Option[Long], start: Option[Int], limit: Option[Int], descending: Option[Boolean], activeOnly: Option[Boolean], ignoreCustomerFilter: Option[Boolean], orderItemTypes: Option[String], orderItemIds: Option[String], orderCustomTypes: Option[String], orderCustomIds: Option[String], sortField: Option[String], offerTypes: Option[String], specialOfferTypes: Option[String], categoryIds: Option[String], filterIds: Option[String], offerAudienceIds: Option[String], transactionAudienceIds: Option[String], offerIds: Option[String], offerLocationIds: Option[String], retailerIds: Option[String], retailerLocationIds: Option[String], statuses: Option[String], keyword: Option[String], redeemableStartDate: Option[Long], redeemableEndDate: Option[Long], startedSince: Option[Long], startedBefore: Option[Long], endedSince: Option[Long], endedBefore: Option[Long]): List[OrderResponse] = {
    // TODO: Implement better logic

    List.empty[OrderResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateOrder(orderId: Long, appKey: String, cart: String, deviceId: Option[String], accountId: Option[Long], paymentTransactionId: Option[Long], description: Option[String], currencyType: Option[String], paymentMethodId: Option[Long], externalPaymentId: Option[String], externalDate: Option[Long]): OrderResponse = {
    // TODO: Implement better logic

    OrderResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
