package api

import play.api.libs.json._
import model.BigDecimal
import model.OrderResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait PurchaseOrderApi {
  /**
    * Create Order
    * Creates a new purchase with some number of items associated with it. The purchase is added to the order that was created
    * @param appKey The application requesting the purchase
    * @param cart &#x60;&#x60;&#x60;json [   { \&quot;orderItemType\&quot;: \&quot;OFFER\&quot;, \&quot;orderItemId\&quot;: 234, \&quot;orderCustomType\&quot;: \&quot;OfferLocation\&quot;, \&quot;orderCustomId\&quot;: 123, \&quot;retailerLocationId\&quot;: 1234, \&quot;quantity\&quot;: 2 },   { \&quot;orderItemType\&quot;: \&quot;OFFER\&quot;, \&quot;orderItemId\&quot;: 235, \&quot;quantity\&quot;: 2 },   { \&quot;orderItemType\&quot;: \&quot;CUSTOM\&quot;, \&quot;amount\&quot;: 10.50, \&quot;orderCustomType\&quot;: \&quot;ServiceFee\&quot; },   { \&quot;orderItemType\&quot;: \&quot;CUSTOM\&quot;, \&quot;amount\&quot;: 25.10, \&quot;quantity\&quot;: 2, \&quot;orderCustomType\&quot;: \&quot;Hat\&quot;, \&quot;orderCustomId\&quot;: 123 } ] &#x60;&#x60;&#x60; 
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param description A description of the purchase
    * @param currencyType Determines the method of purchasing offer.  * VOID: used for when there is no payment involved (ie. for updating the status of a purchase order)  * CASH: use card on file  * POINTS: use account balance  * TICKETS: use tickets  * REFUND: not allowed for a create, requires a paymentTransactionId.  * CREDIT: add to the account balance  * RELOAD: charge a credit card then add to the account balance  
    * @param paymentMethodId Use a specific payment method (CASH), if not provided use default
    * @param externalOrderId Store identifier from external system
    * @param externalPaymentId Store identifier from external system
    * @param remoteRefType Remote Reference type
    * @param externalDate External Date
    * @param promoCode The Promo Code
    */
  def createOrder(version: BigDecimal, appKey: String, cart: String, deviceId: Option[String], accountId: Option[Long], description: Option[String], currencyType: Option[String], paymentMethodId: Option[Long], externalOrderId: Option[String], externalPaymentId: Option[String], remoteRefType: Option[String], externalDate: Option[Long], promoCode: Option[String]): OrderResponse

  /**
    * Delete Order
    * Removes the transaction from the wallet by setting the deleted date to the current date/time.  Requires a valid account and transactionId.
    * @param orderId Order Id
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    */
  def deleteOrder(version: BigDecimal, orderId: Long, deviceId: Option[String], accountId: Option[Long]): SirqulResponse

  /**
    * Get Order
    * Get an order record
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param orderId The order id to get details of, either orderId or externalOrderId must be provided
    * @param externalOrderId The external order id to get details of, either orderId or externalOrderId must be provided
    */
  def getOrder(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], orderId: Option[Long], externalOrderId: Option[String]): OrderResponse

  /**
    * Preview Order
    * Previews a purchase to see the total cost before making it.
    * @param appKey The application requesting the purchase
    * @param cart A JSON list of items to purchase
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param description A description of the purchase
    * @param currencyType Determines the method of purchasing offer. &#x60;&#x60;&#x60;json {   \&quot;VOID\&quot;: \&quot;used for when there is no payment involved (ie. for updating the status of a purchase order)\&quot;,   \&quot;CASH\&quot;: \&quot;use card on file\&quot;,   \&quot;POINTS\&quot;: \&quot;use account balance\&quot;,   \&quot;TICKETS\&quot;: \&quot;use tickets\&quot;,   \&quot;REFUND\&quot;: \&quot;not allowed for a create, requires a paymentTransactionId\&quot;,   \&quot;CREDIT\&quot;: \&quot;add to the account balance\&quot;,   \&quot;RELOAD\&quot;: \&quot;charge a credit card then add to the account balance\&quot; } &#x60;&#x60;&#x60; 
    * @param paymentMethodId Use a specific payment method (CASH), if not provided use default
    * @param externalOrderId Store identifier from external system
    * @param externalPaymentId Store identifier from external system
    * @param remoteRefType Remote Reference type
    * @param externalDate External Date
    * @param promoCode The Promo Code
    */
  def previewOrder(version: BigDecimal, appKey: String, cart: String, deviceId: Option[String], accountId: Option[Long], description: Option[String], currencyType: Option[String], paymentMethodId: Option[Long], externalOrderId: Option[String], externalPaymentId: Option[String], remoteRefType: Option[String], externalDate: Option[Long], promoCode: Option[String]): OrderResponse

  /**
    * Search Orders
    * Search on active orders by customer
    * @param appKey The application requesting the purchase
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param start The start index for pagination
    * @param limit The limit for pagination
    * @param descending Determines whether to return the resulting list in descending or ascending order
    * @param activeOnly Only return active orders
    * @param ignoreCustomerFilter Determines whether to ignore the customer filter (requires an Admin/Exec account)
    * @param orderItemTypes Filter results by orderItemTypes
    * @param orderItemIds Filter results by orderItemIds
    * @param orderCustomTypes Filter results by orderCustomTypes
    * @param orderCustomIds Filter results by orderCustomIds
    * @param sortField Determines what to sort the results by
    * @param offerTypes Filter results by offer type
    * @param specialOfferTypes Filter results by special offer type
    * @param categoryIds Filter results by category Ids
    * @param filterIds Filter results by filter Ids
    * @param offerAudienceIds Filter results by offer audience Ids
    * @param transactionAudienceIds Filter results by transaction audience Ids
    * @param offerIds Filter results by offer Ids
    * @param offerLocationIds Filter results by offer location Ids
    * @param retailerIds Filter results by retailer Ids
    * @param retailerLocationIds Filter results by retailer location Ids
    * @param statuses Filter results by offer transaction status (0: non-redeemable, 1: redeemable, 2: redeemed, 3: user deleted, 4: unclaimed/rewarded, 5: membership active, 6: membership cancelled)
    * @param keyword The keyword to search for
    * @param redeemableStartDate Filter results by the offer redeemable date
    * @param redeemableEndDate Filter results by the offer redeemable date
    * @param startedSince Filter results by the offer start date
    * @param startedBefore Filter results by the offer start date
    * @param endedSince Filter results by the offer end date
    * @param endedBefore Filter results by the offer end date
    */
  def searchOrders(version: BigDecimal, appKey: String, deviceId: Option[String], accountId: Option[Long], start: Option[Int], limit: Option[Int], descending: Option[Boolean], activeOnly: Option[Boolean], ignoreCustomerFilter: Option[Boolean], orderItemTypes: Option[String], orderItemIds: Option[String], orderCustomTypes: Option[String], orderCustomIds: Option[String], sortField: Option[String], offerTypes: Option[String], specialOfferTypes: Option[String], categoryIds: Option[String], filterIds: Option[String], offerAudienceIds: Option[String], transactionAudienceIds: Option[String], offerIds: Option[String], offerLocationIds: Option[String], retailerIds: Option[String], retailerLocationIds: Option[String], statuses: Option[String], keyword: Option[String], redeemableStartDate: Option[Long], redeemableEndDate: Option[Long], startedSince: Option[Long], startedBefore: Option[Long], endedSince: Option[Long], endedBefore: Option[Long]): List[OrderResponse]

  /**
    * Update Order
    * Updates new purchase with some number of items associated with it. The orderId provided is used to retrieve the record and the payment is added to it.
    * @param orderId The order to add the purchase to, leave null for new order.
    * @param appKey The application requesting the purchase
    * @param cart &#x60;&#x60;&#x60;json [   { \&quot;orderItemType\&quot;: \&quot;OFFER\&quot;, \&quot;orderItemId\&quot;: 234, \&quot;orderCustomType\&quot;: \&quot;OfferLocation\&quot;, \&quot;orderCustomId\&quot;: 123, \&quot;retailerLocationId\&quot;: 1234, \&quot;quantity\&quot;: 2 },   { \&quot;orderItemType\&quot;: \&quot;OFFER\&quot;, \&quot;orderItemId\&quot;: 235, \&quot;quantity\&quot;: 2 },   { \&quot;orderItemType\&quot;: \&quot;CUSTOM\&quot;, \&quot;amount\&quot;: 10.50, \&quot;orderCustomType\&quot;: \&quot;ServiceFee\&quot; },   { \&quot;orderItemType\&quot;: \&quot;CUSTOM\&quot;, \&quot;amount\&quot;: 25.10, \&quot;quantity\&quot;: 2, \&quot;orderCustomType\&quot;: \&quot;Hat\&quot;, \&quot;orderCustomId\&quot;: 123 } ] &#x60;&#x60;&#x60; 
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param paymentTransactionId The payment transaction to apply the refund to
    * @param description A description of the purchase
    * @param currencyType Determines the method of purchasing offer.  * VOID: used for when there is no payment involved (ie. for updating the status of a purchase order)  * CASH: use card on file  * POINTS: use account balance  * TICKETS: use tickets  * REFUND: not allowed for a create, requires a paymentTransactionId.  * CREDIT: add to the account balance  * RELOAD: charge a credit card then add to the account balance  
    * @param paymentMethodId Use a specific payment method (CASH), if not provided use default
    * @param externalPaymentId Store identifier from external system
    * @param externalDate External Date
    */
  def updateOrder(version: BigDecimal, orderId: Long, appKey: String, cart: String, deviceId: Option[String], accountId: Option[Long], paymentTransactionId: Option[Long], description: Option[String], currencyType: Option[String], paymentMethodId: Option[Long], externalPaymentId: Option[String], externalDate: Option[Long]): OrderResponse
}
