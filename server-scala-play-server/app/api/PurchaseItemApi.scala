package api

import play.api.libs.json._
import model.BigDecimal
import model.PurchaseItemFullResponse
import model.PurchaseItemResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait PurchaseItemApi {
  /**
    * Create Purchase
    * Creates a purchase item for in app purchases
    * @param appKey The application key that the purchase can be used in
    * @param name The name of the purchase item
    * @param purchaseType The purchase provider &lt;ul&gt; &lt;li&gt;SIRQUL - the Sirqul store to make purchases using tickets&lt;/li&gt; &lt;li&gt;IOS - the iTunes store for iPhone, iPod, iPod Touch&lt;/li&gt; &lt;li&gt;GOOGLE - the Google Play store&lt;/li&gt; &lt;li&gt;AMAZON - the Amazon Android store&lt;/li&gt; &lt;li&gt;MAC - the iTunes store for OSX&lt;/li&gt; &lt;li&gt;WP8 - the Windows Phone 8 store&lt;/li&gt; &lt;li&gt;FREE - used for purchase items that are free (can be used for development/testing purposes)&lt;/li&gt; &lt;/ul&gt;
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param description The description of the purchase item
    * @param tickets How much the purchase item is worth in tickets
    * @param price How much the purchase item will cost in real money
    * @param purchaseCode The unique identifier used by purchase providers to identify in-app-purchases
    * @param secretKey A secret key from purchase providers that would be used for validation
    * @param purchaseLimit How many times a user acquire the same purchase item
    * @param serviceAction Determines whether the purchase item will enable certain features &lt;ul&gt; &lt;li&gt;DAY_PREMIUM - subscribes a user for a day of membership&lt;/li&gt; &lt;li&gt;WEEK_PREMIUM - subscribes a user for a week of membership&lt;/li&gt; &lt;li&gt;MONTH_PREMIUM - subscribes a user for a month of membership&lt;/li&gt; &lt;li&gt;ADD_TICKET - allows a user to add more tickets to their account&lt;/li&gt; &lt;li&gt;ADD_GIFT - allows a user to send/recieve the purchase item as a gift&lt;/li&gt; &lt;/ul&gt;
    * @param coverAssetId The cover image of the purchase item
    * @param promoAssetId An application specific asset that can be used to store/provide additional data
    * @param giftable Determines whether the purchase item can be gifted to other users
    * @param assetable Determines whether users can attach their own media/asset to the purchase item
    * @param allocateTickets Flag to indicate owner should receive tickets for completed missions
    * @param ticketType The type of ticket to reward, null means default type
    * @param points The number of points to award for completing a mission
    * @param offerLocationId The offer location that will get added to the user&#39;s wallet after purchase.
    */
  def createPurchaseItem(version: BigDecimal, appKey: String, name: String, purchaseType: String, deviceId: Option[String], accountId: Option[Long], description: Option[String], tickets: Option[Int], price: Option[Float], purchaseCode: Option[String], secretKey: Option[String], purchaseLimit: Option[Int], serviceAction: Option[String], coverAssetId: Option[Long], promoAssetId: Option[Long], giftable: Option[Boolean], assetable: Option[Boolean], allocateTickets: Option[Boolean], ticketType: Option[String], points: Option[Long], offerLocationId: Option[Long]): PurchaseItemFullResponse

  /**
    * Delete Purchase
    * Marks the purchase item as deleted
    * @param purchaseItemId The purchase item id
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    */
  def deletePurchaseItem(version: BigDecimal, purchaseItemId: Long, deviceId: Option[String], accountId: Option[Long]): SirqulResponse

  /**
    * Get Purchase
    * Get detailed information about a purchase item
    * @param purchaseItemId The purchase item id
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    */
  def getPurchaseItem(version: BigDecimal, purchaseItemId: Long, deviceId: Option[String], accountId: Option[Long]): PurchaseItemFullResponse

  /**
    * Search Purchases
    * Search for purchasable items from the system
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param appKey The application key to filter results by application
    * @param filterByBillable Determines whether to filter results by the user&#39;s billable entity
    * @param purchaseType A comma separated list of purchase providers to filter by. Possible values include: &lt;ul&gt; &lt;li&gt;SIRQUL - purchases from the Sirqul store using tickets&lt;/li&gt; &lt;li&gt;IOS - purchases from the iTunes store for iPhone, iPod, iPod Touch&lt;/li&gt; &lt;li&gt;GOOGLE - purchases from the Google Play store&lt;/li&gt; &lt;li&gt;AMAZON - purchases from the Amazon Android store&lt;/li&gt; &lt;li&gt;MAC - purchases from the iTunes store for OSX&lt;/li&gt; &lt;li&gt;WP8 - purchases from the Windows Phone 8 store&lt;/li&gt; &lt;li&gt;FREE - purchases that are free (can be used for development/testing purposes)&lt;/li&gt; &lt;/ul&gt;
    * @param serviceAction A comma separated list of service actions to filter results by. Possible values include: &lt;ul&gt; &lt;li&gt;DAY_PREMIUM - purchases that subscribes a user for a day of membership&lt;/li&gt; &lt;li&gt;WEEK_PREMIUM - purchases that subscribes a user for a week of membership&lt;/li&gt; &lt;li&gt;MONTH_PREMIUM - purchases that subscribes a user for a month of membership&lt;/li&gt; &lt;li&gt;ADD_TICKET - purchases that allow users to add more tickets&lt;/li&gt; &lt;li&gt;ADD_GIFT - purchases that allow users to recieve gifts&lt;/li&gt; &lt;/ul&gt;
    * @param keyword The keyword used to search
    * @param sortField The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY
    * @param descending The order to return the search results
    * @param start The record to begin the return set on
    * @param limit The number of records to return
    * @param activeOnly Return only active results
    */
  def searchPurchaseItems(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appKey: Option[String], filterByBillable: Option[Boolean], purchaseType: Option[String], serviceAction: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean]): List[PurchaseItemResponse]

  /**
    * Update Purchase
    * Updates a purchase item for in app purchases
    * @param purchaseItemId The purchase item id
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param name The name of the purchase item
    * @param description The description of the purchase item
    * @param tickets How much the purchase item is worth in tickets
    * @param price How much the purchase item will cost in real money
    * @param purchaseType The purchase provider &lt;ul&gt; &lt;li&gt;SIRQUL - the Sirqul store to make purchases using tickets&lt;/li&gt; &lt;li&gt;IOS - the iTunes store for iPhone, iPod, iPod Touch&lt;/li&gt; &lt;li&gt;GOOGLE - the Google Play store&lt;/li&gt; &lt;li&gt;AMAZON - the Amazon Android store&lt;/li&gt; &lt;li&gt;MAC - the iTunes store for OSX&lt;/li&gt; &lt;li&gt;WP8 - the Windows Phone 8 store&lt;/li&gt; &lt;li&gt;FREE - used for purchase items that are free (can be used for development/testing purposes)&lt;/li&gt; &lt;/ul&gt;
    * @param purchaseCode The unique identifier used by purchase providers to identify in-app-purchases
    * @param secretKey A secret key from purchase providers that would be used for validation
    * @param purchaseLimit How many times a user acquire the same purchase item
    * @param serviceAction Determines whether the purchase item will enable certain features &lt;ul&gt; &lt;li&gt;DAY_PREMIUM - subscribes a user for a day of membership&lt;/li&gt; &lt;li&gt;WEEK_PREMIUM - subscribes a user for a week of membership&lt;/li&gt; &lt;li&gt;MONTH_PREMIUM - subscribes a user for a month of membership&lt;/li&gt; &lt;li&gt;ADD_TICKET - allows a user to add more tickets to their account&lt;/li&gt; &lt;li&gt;ADD_GIFT - allows a user to send/recieve the purchase item as a gift&lt;/li&gt; &lt;/ul&gt;
    * @param coverAssetId The cover image of the purchase item
    * @param promoAssetId An application specific asset that can be used to store/provide additional data
    * @param giftable Determines whether the purchase item can be gifted to other users
    * @param assetable Determines whether users can attach their own media/asset to the purchase item
    * @param active Sets whether the purchase item is active or inactive (hidden from consumers)
    * @param allocateTickets Flag to indicate owner should receive tickets for completed missions
    * @param ticketType The type of ticket to reward, null means default type
    * @param points The number of points to award for completing a mission
    * @param offerLocationId The offer location that will get added to the user&#39;s wallet after purchase.
    */
  def updatePurchaseItem(version: BigDecimal, purchaseItemId: Long, deviceId: Option[String], accountId: Option[Long], name: Option[String], description: Option[String], tickets: Option[Int], price: Option[Float], purchaseType: Option[String], purchaseCode: Option[String], secretKey: Option[String], purchaseLimit: Option[Int], serviceAction: Option[String], coverAssetId: Option[Long], promoAssetId: Option[Long], giftable: Option[Boolean], assetable: Option[Boolean], active: Option[Boolean], allocateTickets: Option[Boolean], ticketType: Option[String], points: Option[Long], offerLocationId: Option[Long]): PurchaseItemFullResponse
}
