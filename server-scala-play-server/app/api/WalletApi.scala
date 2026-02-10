package api

import play.api.libs.json._
import model.BigDecimal
import model.OfferTransactionResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait WalletApi {
  /**
    * Create Wallet Offers
    * Adds offers to the wallet
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param offerId The id of the offer being added (offerId or offeLocationId required)
    * @param offerLocationId The id of the offer location being added (offerId or offeLocationId required)
    * @param offerCart A JSON list of offers to purchase. &#x60;&#x60;&#x60;json [   {     \&quot;offerId\&quot;: 123,     \&quot;offerLocationId\&quot;: 234,     \&quot;quantity\&quot;: 2   },   {     \&quot;offerId\&quot;: 456,     \&quot;offerLocationId\&quot;: 567,     \&quot;quantity\&quot;: 1   } ] &#x60;&#x60;&#x60; 
    * @param promoCode The promoCode
    * @param currencyType Determines the method of purchasing offer. CASH &#x3D; use card on file, POINTS &#x3D; use points, TICKETS &#x3D; use tickets
    * @param usePoints Sets the currencyType to POINTS
    * @param metaData External custom client defined data
    * @param appKey The application requesting the purchase, required when currencyType is TICKETS
    * @param status Custom status value to change to (0 or 1 for redeem, 5 or 6 for membership)
    */
  def createOfferTransaction(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], offerId: Option[Long], offerLocationId: Option[Long], offerCart: Option[String], promoCode: Option[String], currencyType: Option[String], usePoints: Option[Boolean], metaData: Option[String], appKey: Option[String], status: Option[Int]): List[OfferTransactionResponse]

  /**
    * Delete Wallet Offer
    * Removes the transaction from the wallet by setting the deleted date to the current date/time.  Requires a valid account and transactionId.
    * @param transactionId The offer transaction id to remove
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    */
  def deleteOfferTransaction(version: BigDecimal, transactionId: Long, deviceId: Option[String], accountId: Option[Long]): SirqulResponse

  /**
    * Get Wallet Offer
    * @param transactionId The offer transaction id to get details of
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param includeMission If true then include mission data, false to not include
    * @param latitude The latitude location of the user
    * @param longitude The latitude location of the user
    * @param returnFullResponse Determines whether to return a detailed version of the response
    */
  def getOfferTransaction(version: BigDecimal, transactionId: Long, deviceId: Option[String], accountId: Option[Long], includeMission: Option[Boolean], latitude: Option[Double], longitude: Option[Double], returnFullResponse: Option[Boolean]): OfferTransactionResponse

  /**
    * Preview Wallet Offers
    * Preview the final cost of a transaction without charging the user
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param offerId The id of the offer being added (offerId or offeLocationId required)
    * @param offerLocationId The id of the offer location being added (offerId or offeLocationId required)
    * @param offerCart A JSON list of offers to purchase.
    * @param promoCode The promoCode
    * @param currencyType Determines the method of purchasing offer. CASH &#x3D; use card on file, POINTS &#x3D; use points, TICKETS &#x3D; use tickets
    * @param usePoints Sets the currencyType to POINTS
    * @param metaData External custom client defined data
    * @param appKey The application requesting the purchase, required when currencyType is TICKETS
    */
  def previewOfferTransaction(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], offerId: Option[Long], offerLocationId: Option[Long], offerCart: Option[String], promoCode: Option[String], currencyType: Option[String], usePoints: Option[Boolean], metaData: Option[String], appKey: Option[String]): List[OfferTransactionResponse]

  /**
    * Search Wallet Offers
    * Search on active offers currently in the user&#39;s wallet, or past offers the user has already redeemed.
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param keyword The keyword to search for
    * @param retailerId Filter results for this retailer
    * @param retailerIds Filter results for a list of retailers
    * @param retailerLocationId Filter results for this retailer location
    * @param retailerLocationIds Filter results for a list of retailer locations
    * @param excludeRetailerLocationIds Filter results to exclude retailer locations
    * @param offerId Filter results for this offer
    * @param offerIds Filter results for a list of offer
    * @param offerLocationId Filter results for this offer location
    * @param offerLocationIds Filter results for a list of offer locations
    * @param offerType Filter results to return a specific offer type
    * @param offerTypes Filter results to return specific offer types
    * @param specialOfferType Filter results to return a specific special offer type
    * @param specialOfferTypes Filter results to return specific special offer types
    * @param categoryIds Category Ids
    * @param filterIds Filter Ids
    * @param offerAudienceIds Offer Audience Ids
    * @param sortField Determines what to sort the results by
    * @param descending Determines whether the results are in descending order
    * @param start The start index for pagination
    * @param limit The limit for pagination
    * @param latitude The latitude location of the user
    * @param longitude The latitude location of the user
    * @param redeemableStartDate Filter results by the offer redeemable date
    * @param redeemableEndDate Filter results by the offer redeemable date
    * @param filterByParentOffer Apply params to offer&#39;s parent
    * @param startedSince Filter results by the offer start date
    * @param startedBefore Filter results by the offer start date
    * @param endedSince Filter results by the offer end date
    * @param endedBefore Filter results by the offer end date
    * @param redeemed If true return redeemed transactions (status 2), otherwise return active transactions (status 0 or 1)
    * @param statuses Custom status value to change to (0 or 1 for redeem, 5 or 6 for membership)
    * @param reservationsOnly Returns only reservation transactions if true
    * @param activeOnly Active Only
    * @param returnFullResponse Determines whether to return a detailed version of the response
    * @param recurringStartedSince Filter results by the recurring billing start date
    * @param recurringStartedBefore Filter results by the recurring billing start date
    * @param recurringExpirationSince Filter results by the recurring billing expiration date
    * @param recurringExpirationBefore Filter results by the recurring billing expiration date
    */
  def searchOfferTransactions(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], keyword: Option[String], retailerId: Option[Long], retailerIds: Option[String], retailerLocationId: Option[Long], retailerLocationIds: Option[String], excludeRetailerLocationIds: Option[String], offerId: Option[Long], offerIds: Option[String], offerLocationId: Option[Long], offerLocationIds: Option[String], offerType: Option[String], offerTypes: Option[String], specialOfferType: Option[String], specialOfferTypes: Option[String], categoryIds: Option[String], filterIds: Option[String], offerAudienceIds: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], latitude: Option[Double], longitude: Option[Double], redeemableStartDate: Option[Long], redeemableEndDate: Option[Long], filterByParentOffer: Option[Boolean], startedSince: Option[Long], startedBefore: Option[Long], endedSince: Option[Long], endedBefore: Option[Long], redeemed: Option[Boolean], statuses: Option[String], reservationsOnly: Option[Boolean], activeOnly: Option[Boolean], returnFullResponse: Option[Boolean], recurringStartedSince: Option[Long], recurringStartedBefore: Option[Long], recurringExpirationSince: Option[Long], recurringExpirationBefore: Option[Long]): List[OfferTransactionResponse]

  /**
    * Update Wallet Offer
    * Update offer status. The status values are: 0 - not redeemable, 1 - redeemable.  Not redeemable means the customer has received the offer but has not decided to use (or print) it yet.  Until they choose to do this the merchant cannot redeem the offer (has not been given permission yet).   Redeemable means the customer has chosen to use the offer and wishes to redeem it.  Redeemed means the merchant has accepted the offer and the given the customer its value, then marked it a used in the system.  This status change is handled by a merchant end point.
    * @param transactionId The offer transaction id to remove
    * @param status The status value to change to (0 or 1)
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param offerLocationId Offer Location Id
    * @param currencyType Currency Type
    * @param usePoints Use Points
    * @param appKey App Key
    * @param latitude The latitude location of the user
    * @param longitude The latitude location of the user
    * @param metaData External custom client defined data
    * @param returnFullResponse Determines whether to return a detailed version of the response
    * @param exceptionMembershipOfferIds Exception Offers, transaction audiences of these offers won&#39;t be removed out of the account when up
    */
  def updateOfferTransaction(version: BigDecimal, transactionId: Long, status: Int, deviceId: Option[String], accountId: Option[Long], offerLocationId: Option[Long], currencyType: Option[String], usePoints: Option[Boolean], appKey: Option[String], latitude: Option[Double], longitude: Option[Double], metaData: Option[String], returnFullResponse: Option[Boolean], exceptionMembershipOfferIds: Option[String]): OfferTransactionResponse
}
