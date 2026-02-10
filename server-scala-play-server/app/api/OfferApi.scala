package api

import play.api.libs.json._
import model.BigDecimal
import model.ListCountResponse
import model.OfferListResponse
import model.OfferResponse
import model.OfferShortResponse
import model.OfferTransactionResponse
import model.RetailerOfferResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait OfferApi {
  /**
    * Update Offer Locations
    * Batch update offer locations.
    * @param data JSON string in the following format: &#x60;&#x60;&#x60;json [{   \&quot;offerLocationId\&quot;: 1705,   \&quot;latitude\&quot;: 54.0,   \&quot;longitude\&quot;: -122.0,   \&quot;altitude\&quot;: 1.0,   \&quot;locationDetail\&quot;: \&quot;floor 1\&quot;,   \&quot;locationDescription\&quot;: \&quot;behind the Coke sign\&quot; }, {   \&quot;offerLocationId\&quot;: 1704,   \&quot;latitude\&quot;: 54.1,   \&quot;longitude\&quot;: -122.1 }] &#x60;&#x60;&#x60; 
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    */
  def batchUpdateOfferLocations(version: BigDecimal, data: String, deviceId: Option[String], accountId: Option[Long]): SirqulResponse

  /**
    * Create Offer
    * Create an offer and assign it to the provided retailer locations.
    * @param includeOfferLocations If true return all the offer locations associated with the offer
    * @param title The title (255 char limit)
    * @param barcodeType The bar code type {NONE, UPC, CODE_128, QR, CUSTOM_MEDIA}
    * @param noExpiration Overrides the expiration date so that the offer does not expire
    * @param availableLimit The limit of how many times the offer can be used by consumers
    * @param availableLimitPerUser The limit of how many times a user can used the same offer
    * @param addedLimit The limit of how many times the offer can be added to consumer wallets
    * @param viewLimit The limit of how many times the offer can be viewed
    * @param maxPrints The maximum number of times the offer can be printed
    * @param ticketPrice The cost of the offer in tickets
    * @param fullPrice The retail/full price cost of the offer in real currency
    * @param discountPrice The cost of the offer at a discounted price (what the consumer pays)
    * @param offerType The offer type {VOUCHER, COUPON, PRODUCT, EVENT, MEDIA, DEVICE}
    * @param specialOfferType The special offer type {ALL, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}
    * @param offerVisibility The offer visibility {PUBLIC, REWARDABLE, TRIGGERABLE}
    * @param active Sets the active flag
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id (deviceId or accountId required)
    * @param tags Custom string field for doing full-text searches
    * @param parentOfferId the parent offer id
    * @param retailerLocationIds Comma separated list of retailer location ids. This will assign the offer to these retailer locations.
    * @param offerLocations A list of json data that has offer location specific values.
    * @param subTitle The sub title (255 char limit)
    * @param details The details
    * @param subDetails A string for custom details (255 char limit)
    * @param finePrint The fine print
    * @param barcodeEntry The bar code entry string
    * @param externalRedeemOptions An external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer
    * @param externalUrl The clickUrl of the offer
    * @param externalId an external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer
    * @param ticketsRewardType The type of ticket to reward, null means default type
    * @param ticketsReward Determines how many tickets are awarded
    * @param activated The date of when the offer will be visible to consumers
    * @param expires The date of when the offer expires
    * @param ticketPriceType the type of ticket needed to buy offer
    * @param showRemaining show remaining offers available
    * @param showRedeemed show how many offers have been redeemed
    * @param replaced 
    * @param featured flag if offer is featured or not
    * @param categoryIds Comma separated list of category ids
    * @param filterIds Comma separated list of filter ids
    * @param barcodeAssetId The id of the barcode asset
    * @param imageAssetId The id of the an offer asset
    * @param imageAssetId1 The id of the an offer asset
    * @param imageAssetId2 The id of the an offer asset
    * @param imageAssetId3 The id of the an offer asset
    * @param imageAssetId4 The id of the an offer asset
    * @param imageAssetId5 The id of the an offer asset
    * @param publisher The maker of the item.
    * @param redeemableStart The redeemable start date/time of the offer.
    * @param redeemableEnd The redeemable start date/time of the offer.
    * @param brand The brand. OfferType PRODUCT only.
    * @param productType The product type. OfferType PRODUCT only.
    * @param conditionType The condition. OfferType PRODUCT only.
    * @param isbn The ISBN id. OfferType PRODUCT only.
    * @param asin The ASIN id. OfferType PRODUCT only.
    * @param catalogNumbers The list of catelog numbers, comma seperated. OfferType PRODUCT only.
    * @param department The department name. The OfferType PRODUCT only.
    * @param features The list of features, comma seperated. OfferType PRODUCT only.
    * @param minimumPrice The MAP price. OfferType PRODUCT only.
    * @param width The width of the item. OfferType PRODUCT only.
    * @param height The height of the item. OfferType PRODUCT only.
    * @param depth The depth of the item. OfferType PRODUCT only.
    * @param weight The weight of the item. OfferType PRODUCT only.
    * @param unit The unit of measurement. OfferType PRODUCT only.
    * @param studio The studio name. OfferType PRODUCT only.
    * @param parentalRating The parental control rating. OfferType PRODUCT only.
    * @param publishDate The date published. OfferType PRODUCT only.
    * @param availabilityDate The date available. OfferType PRODUCT only.
    * @param sizeId 
    * @param listingId The ID of the event listing
    * @param mediaType the media type of the offer
    * @param duration The total playing time of the media item. OfferType MEDIA only.
    * @param author The created/author of the media item. OfferType MEDIA only.
    * @param releaseDate The date/time of when the media item was originally released. OfferType MEDIA only.
    * @param collectionIds 
    * @param rebootTimeHour The reboot hour time ranging from 0 to 23
    * @param rebootTimeMinute The reboot minute time ranging from 0 to 59
    * @param idleTimeoutInSecond If the device is idle for idleTimeoutInSecond then the device should timeout
    * @param serialNumber The serial number on the device
    * @param udid The unique device id for the device
    * @param deviceType The type of the device, for example: \&quot;Kiosk\&quot;, \&quot;Beacon\&quot;.
    * @param devicePower Edysen device power level setting
    * @param deviceInterference Edysen device inteference setting
    * @param availability 
    * @param availabilitySummary 
    */
  def createOffer(version: BigDecimal, includeOfferLocations: Boolean, title: String, barcodeType: String, noExpiration: Boolean, availableLimit: Int, availableLimitPerUser: Int, addedLimit: Int, viewLimit: Int, maxPrints: Int, ticketPrice: Long, fullPrice: Double, discountPrice: Double, offerType: String, specialOfferType: String, offerVisibility: String, active: Boolean, deviceId: Option[String], accountId: Option[Long], tags: Option[String], parentOfferId: Option[Long], retailerLocationIds: Option[String], offerLocations: Option[String], subTitle: Option[String], details: Option[String], subDetails: Option[String], finePrint: Option[String], barcodeEntry: Option[String], externalRedeemOptions: Option[String], externalUrl: Option[String], externalId: Option[String], ticketsRewardType: Option[String], ticketsReward: Option[Long], activated: Option[Long], expires: Option[Long], ticketPriceType: Option[String], showRemaining: Option[Boolean], showRedeemed: Option[Boolean], replaced: Option[Boolean], featured: Option[Boolean], categoryIds: Option[String], filterIds: Option[String], barcodeAssetId: Option[Long], imageAssetId: Option[Long], imageAssetId1: Option[Long], imageAssetId2: Option[Long], imageAssetId3: Option[Long], imageAssetId4: Option[Long], imageAssetId5: Option[Long], publisher: Option[String], redeemableStart: Option[Long], redeemableEnd: Option[Long], brand: Option[String], productType: Option[String], conditionType: Option[String], isbn: Option[String], asin: Option[String], catalogNumbers: Option[String], department: Option[String], features: Option[String], minimumPrice: Option[Double], width: Option[Double], height: Option[Double], depth: Option[Double], weight: Option[Double], unit: Option[String], studio: Option[String], parentalRating: Option[String], publishDate: Option[Long], availabilityDate: Option[Long], sizeId: Option[Long], listingId: Option[Long], mediaType: Option[String], duration: Option[Int], author: Option[String], releaseDate: Option[Long], collectionIds: Option[String], rebootTimeHour: Option[Int], rebootTimeMinute: Option[Int], idleTimeoutInSecond: Option[Int], serialNumber: Option[String], udid: Option[String], deviceType: Option[String], devicePower: Option[Double], deviceInterference: Option[Double], availability: Option[String], availabilitySummary: Option[String]): RetailerOfferResponse

  /**
    * Delete Offer
    * Set the deleted timestamp to current time. This effectively deletes the offer since all queries should ignore any records with a deleted time stamp.
    * @param offerId The ID of the offer to be deleted
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account used to perform the delete, must have rights to edit the offer.
    */
  def deleteOffer(version: BigDecimal, offerId: Long, deviceId: Option[String], accountId: Option[Long]): SirqulResponse

  /**
    * Delete Offer Location
    * Set the deleted timestamp to current time. This effectively deletes the offer location since all queries should ignore any records with a deleted time stamp.
    * @param offerLocationId The ID of the offer location to be deleted
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account used to perform the delete, must have rights to edit the offer location.
    */
  def deleteOfferLocation(version: BigDecimal, offerLocationId: Long, deviceId: Option[String], accountId: Option[Long]): SirqulResponse

  /**
    * Get Offer
    * Gets the details of an offer that the user has access to.
    * @param offerId The id of the offer
    * @param includeOfferLocations 
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id (deviceId or accountId required)
    */
  def getOffer(version: BigDecimal, offerId: Long, includeOfferLocations: Boolean, deviceId: Option[String], accountId: Option[Long]): RetailerOfferResponse

  /**
    * Get Offer
    * Gets offer or offer location details as a consumer.  Will check if it is a favorite if the deviceId/accountId is provided.  If the offerId is provided it will look up the main offer and ignore the the offerLocationId. If no offerId is provided then an offerLocationId must be specified.
    * @param deviceId The device id for returning account information (i.e. favorites)
    * @param accountId The account id for returning account information (i.e. favorites)
    * @param offerId The offer id (either offeLocationId or offerId must be provided)
    * @param offerLocationId The offer location id (either offeLocationId or offerId must be provided)
    * @param distance The distance of the offer from the user&#39;s current location (this is returned when the offer is searched)
    * @param latitude The latitude to calculate distance from the offer
    * @param longitude The longitude to calculate distance from the offer
    * @param includeOfferLocations Determines whether to return offer locations for the offer
    * @param includeRetailerLocations Determines whether to return the retailer location info for each offer location response (includeOfferLocations must also be true for this to work)
    * @param includeChildOffers Determines whether to include child offers in the response
    */
  def getOfferDetails(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], offerId: Option[Long], offerLocationId: Option[Long], distance: Option[Double], latitude: Option[Double], longitude: Option[Double], includeOfferLocations: Option[Boolean], includeRetailerLocations: Option[Boolean], includeChildOffers: Option[Boolean]): OfferResponse

  /**
    * Get Offers (Counts)
    * Gets the offer list counts.
    * @param latitude The latitude of where the search will center at
    * @param longitude The longitude of where the search will center at
    * @param searchRange The range of the search
    * @param distanceUnit The units to use for distance calculations (e.g. MILES, KILOMETERS)
    */
  def getOfferListCounts(version: BigDecimal, latitude: Double, longitude: Double, searchRange: Option[BigDecimal], distanceUnit: Option[String]): ListCountResponse

  /**
    * Get Offer Location
    * Gets the offer location by offer location id or udid (of a device)
    * @param offerLocationId the id of the offer location to get
    * @param udid the UDID of the device
    */
  def getOfferLocation(version: BigDecimal, offerLocationId: Option[Long], udid: Option[String]): OfferShortResponse

  /**
    * Search Offer Locations
    * Searches on offer locations, which are records that represent an offer that has been assigned to a retailer location. If an offer does not have any locations assigned, then it will NOT be returned.
    * @param sortField The column to sort the results on. Default is \&quot;TITLE\&quot;, which will sort the results by the offer title. Possible input values: {CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, RETAILER_ID,RETAILER_LOCATION_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY}
    * @param descending The order to return the results. Default is false, which will return the results in ascending order.
    * @param start The index into the record set to start with. Default is 0.
    * @param limit The total number of records to return. Default is 20.
    * @param activeOnly Determines whether to return only active results. Default is false.
    * @param includeRetailerLocation 
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param keyword The keyword used to search
    * @param retailerId Filter results for a specific retailer
    * @param retailerLocationId Filter results for a specific retailer location
    * @param offerType Filter results to only return COUPON, VOUCHER, PRODUCT, MEDIA, or EVENT offers
    * @param specialOfferType Filter results to only return REGULAR_OFFER, ACT_NOW, GET_THERE_NOW offer specials
    * @param barcodeType 
    * @param barcodeEntry 
    * @param isbn 
    * @param asin 
    * @param deviceStatus Edysen device status, running, warning, or down
    * @param needsNotificationSent 
    * @param lastNotificationSent 
    */
  def getOfferLocationsForRetailers(version: BigDecimal, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, includeRetailerLocation: Boolean, deviceId: Option[String], accountId: Option[Long], keyword: Option[String], retailerId: Option[Long], retailerLocationId: Option[Long], offerType: Option[String], specialOfferType: Option[String], barcodeType: Option[String], barcodeEntry: Option[String], isbn: Option[String], asin: Option[String], deviceStatus: Option[String], needsNotificationSent: Option[Boolean], lastNotificationSent: Option[Long]): List[OfferShortResponse]

  /**
    * Search Offers
    * Searches on offers that the account has access to.
    * @param offerVisibility 
    * @param sortField The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY
    * @param descending The order to return the search results
    * @param start The record to begin the return set on
    * @param limit The number of records to return
    * @param availableOnly Return only results that are currently being promoted (is activated and not expired)
    * @param activeOnly Return only active results
    * @param includeCategories 
    * @param includeFilters 
    * @param includeOfferLocations 
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param categoryIds 
    * @param filterIds 
    * @param q This parameter is deprecated.
    * @param keyword The keyword used to search
    * @param retailerId the id of the retailer
    * @param retailerLocationId the id of the retailer location
    * @param couponType This parameter is deprecated.
    * @param offerType This parameter is deprecated. Use offer types. Filter results to only return COUPON, VOUCHER, PRODUCT, MEDIA, or EVENT offers
    * @param offerTypes Comma separated list of offer types {COUPON, VOUCHER, PRODUCT, MEDIA, EVENT, DEVICE}
    * @param specialOfferType Filter results to only return REGULAR_OFFER, ACT_NOW, GET_THERE_NOW offer specials
    * @param i This parameter is deprecated.
    * @param l This parameter is deprecated.
    * @param barcodeType 
    * @param barcodeEntry 
    * @param isbn 
    * @param asin 
    * @param deviceStatus Edysen device status
    * @param needsNotificationSent 
    * @param lastNotificationSent 
    */
  def getOffersForRetailers(version: BigDecimal, offerVisibility: String, sortField: String, descending: Boolean, start: Int, limit: Int, availableOnly: Boolean, activeOnly: Boolean, includeCategories: Boolean, includeFilters: Boolean, includeOfferLocations: Boolean, deviceId: Option[String], accountId: Option[Long], categoryIds: Option[String], filterIds: Option[String], q: Option[String], keyword: Option[String], retailerId: Option[Long], retailerLocationId: Option[Long], couponType: Option[String], offerType: Option[String], offerTypes: Option[String], specialOfferType: Option[String], i: Option[Int], l: Option[Int], barcodeType: Option[String], barcodeEntry: Option[String], isbn: Option[String], asin: Option[String], deviceStatus: Option[String], needsNotificationSent: Option[Boolean], lastNotificationSent: Option[Long]): List[OfferResponse]

  /**
    * Update Offer Transaction
    * Redeems an offer.
    * @param offerTransactionId the OfferTransaction ID of the transaction being redeemed
    * @param status the status to set the offer transaction to - 1 sets it to redeemable and 2 sets it to redeemed
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param offerLocationId the OfferLocation ID where the offer is being redeemed
    */
  def redeemOfferTransaction(version: BigDecimal, offerTransactionId: Long, status: Int, deviceId: Option[String], accountId: Option[Long], offerLocationId: Option[Long]): SirqulResponse

  /**
    * Search Offer Transactions
    * Searches on offer transactions for offers that the account has access to.
    * @param sortField Determines what to sort the results by {CREATED, UPDATED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY}
    * @param descending Determines whether the results are in descending order
    * @param start The start index for pagination
    * @param limit The limit for pagination
    * @param activeOnly Determines whether to only return active offer transactions
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param q This parameter is deprecated.
    * @param keyword The keyword to search for
    * @param retailerId Filter results for this retailer
    * @param retailerLocationId Filter results for this retailer location
    * @param offerId Filter results for this offer
    * @param offerLocationId Filter results for this offer location
    * @param redeemed if true return redeemed transactions (status 2), if false return active transactions (status 0 or 1)
    * @param reservationsOnly returns only reservation transactions if true
    * @param couponType This parameter is deprecated.
    * @param offerType Filter results to only return COUPON, VOUCHER, PRODUCT, MEDIA, or EVENT offers
    * @param specialOfferType Filter results to only return REGULAR_OFFER, ACT_NOW, GET_THERE_NOW offer specials
    * @param customerAccountIds Filter results by accounts
    * @param categoryIds 
    * @param redeemableStartDate 
    * @param redeemableEndDate 
    * @param i This parameter is deprecated.
    * @param l This parameter is deprecated.
    */
  def searchOfferTransactionsForRetailers(version: BigDecimal, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, deviceId: Option[String], accountId: Option[Long], q: Option[String], keyword: Option[String], retailerId: Option[Long], retailerLocationId: Option[Long], offerId: Option[Long], offerLocationId: Option[Long], redeemed: Option[Boolean], reservationsOnly: Option[Boolean], couponType: Option[String], offerType: Option[String], specialOfferType: Option[String], customerAccountIds: Option[String], categoryIds: Option[String], redeemableStartDate: Option[Long], redeemableEndDate: Option[Long], i: Option[Int], l: Option[Int]): List[OfferTransactionResponse]

  /**
    * Search Offers
    * Searches for offers as a consumer.
    * @param latitude The latitude of where the search will center at
    * @param longitude The longitude of where the search will center at
    * @param recommendationType The method to use to gather recommendations: WALLET base relevance on items in users wallets CLICKS base relevance on items users have clicked on BLENDED blend using all methods available
    * @param locationId This parameter is deprecated. The location id
    * @param start The start index for pagination
    * @param limit The limit for pagination
    * @param maxRecommendations 
    * @param distanceUnit 
    * @param appKey The application key used to identify the application
    * @param deviceId The device id for returning account information (i.e. offer transactions made by the user)
    * @param accountId The account id for returning account information (i.e. offer transactions made by the user)
    * @param searchRange The range of the search
    * @param tags Does a full-text search on tags
    * @param supportedPostalCodes supported postal codes
    * @param keyword The keyword to filter results by
    * @param categories Comma separate list of category ids
    * @param filters Comma separated list of filter ids
    * @param offerTypes Comma separated list of offer types {COUPON, VOUCHER, PRODUCT, MEDIA, EVENT, DEVICE}
    * @param `type` The special offer type {ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}
    * @param sortField The field to sort the result set on:DISTANCE Sort the offers nearest to farthest BUSINESS_NAME Sort the offers alphabetically by location name SHUFFLE Sort the nearest offers randomly USERPREFS accountId must accompany this parameter. Gives the first X recommendations where X equals the parameter maxRecommendations
    * @param recommendOfferIds Return recommendations based on these offers IDs
    * @param retailerLocationIds Only return offer locations for the specific retailer locations.
    * @param offerId Only return offer locations for the specific offer.
    * @param includeMission If true include the mission response as part of the offer. Default is false.
    * @param includeCategories If true include the category list response as part of the offer. Default is false.
    * @param includeFilters If true include the filter list response as part of the offer. Default is false.
    * @param includeExpired If true then ignore the expired dates. Default is false.
    * @param includeFavorite If true then ignore the favorite. Default is false.
    * @param closestOfferOnly This parameter is deprecated. see groupBy. If true then it only returns the offer location for an offer closest to the given lat/lon
    * @param searchExpression 
    * @param groupBy groups the results by a certain field. For example, if you want to return the closest offer location of an offer, then pass in groupBy&#x3D;OFFER_ID and sortField&#x3D;DISTANCE (to sort by distance).
    */
  def searchOffersForConsumer(version: BigDecimal, latitude: Double, longitude: Double, recommendationType: String, locationId: Long, start: Int, limit: Int, maxRecommendations: Int, distanceUnit: String, appKey: Option[String], deviceId: Option[String], accountId: Option[Long], searchRange: Option[Double], tags: Option[String], supportedPostalCodes: Option[String], keyword: Option[String], categories: Option[String], filters: Option[String], offerTypes: Option[String], `type`: Option[String], sortField: Option[String], recommendOfferIds: Option[String], retailerLocationIds: Option[String], offerId: Option[Long], includeMission: Option[Boolean], includeCategories: Option[Boolean], includeFilters: Option[Boolean], includeExpired: Option[Boolean], includeFavorite: Option[Boolean], closestOfferOnly: Option[Boolean], searchExpression: Option[String], groupBy: Option[String]): OfferListResponse

  /**
    * Get Offers (Top)
    * Gets the top active offers.
    * @param start The index into the record set to start with. Default is 0.
    * @param limit The total number of record to return. Default id 20.
    */
  def topOfferTransactions(version: BigDecimal, start: Option[Int], limit: Option[Int]): OfferListResponse

  /**
    * Update Offer
    * Update an offer, must provide a current list of retailer locations or the current offer locations will be marked as deleted.
    * @param offerId The offer to update
    * @param includeOfferLocations If true return all the offer locations associated with the offer
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account used to perform the update, must have rights to edit the offer (deviceId or accountId required)
    * @param parentOfferId 
    * @param retailerLocationIds Comma separated list of retailer location ids. This will assign the offer to these retailer locations.
    * @param offerLocations A list of json data that has offer location specific values.
    * @param tags Custom string field for doing full-text searches
    * @param title The title (255 char limit)
    * @param subTitle The sub title (255 char limit)
    * @param details The details
    * @param subDetails A string for custom details (255 char limit)
    * @param finePrint The fine print
    * @param barcodeType The bar code type {NONE, UPC, CODE_128, QR, CUSTOM_MEDIA}
    * @param barcodeEntry The bar code entry string
    * @param externalRedeemOptions An external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer.
    * @param externalUrl The clickUrl of the offer
    * @param externalId 
    * @param ticketsRewardType The type of ticket to reward, null means default type
    * @param ticketsReward Determines how many tickets are awarded
    * @param activated The date of when the offer will be visible to consumers
    * @param expires The date of when the offer expires
    * @param noExpiration Overrides the expiration date so that the offer does not expire
    * @param availableLimit The limit of how many times the offer can be used by consumers
    * @param availableLimitPerUser The limit of how many times a user can used the same offer
    * @param addedLimit The limit of how many times the offer can be added to consumer wallets
    * @param viewLimit 
    * @param maxPrints The maximum number of times the offer can be printed
    * @param ticketPriceType the type of ticket needed to buy the offer
    * @param ticketPrice The cost of the offer in tickets
    * @param fullPrice The retail/full price cost of the offer in real currency
    * @param discountPrice The cost of the offer at a discounted price (what the consumer pays)
    * @param showRemaining show remaining offers available
    * @param showRedeemed show how many offers have been redeemed
    * @param replaced 
    * @param featured whether the offer is featured or not
    * @param offerType The offer type {VOUCHER, COUPON, PRODUCT, MEDIA, EVENT}
    * @param specialOfferType The special offer type {ALL, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}
    * @param offerVisibility The offer visibility {PUBLIC, REWARDABLE, TRIGGERABLE}
    * @param categoryIds Comma separated list of category ids
    * @param filterIds Comma separated list of filter ids
    * @param active Sets the active flag
    * @param barcodeAssetId The id of the barcode asset
    * @param imageAssetId The id of the an offer asset
    * @param imageAssetId1 The id of the an offer asset
    * @param imageAssetId2 The id of the an offer asset
    * @param imageAssetId3 The id of the an offer asset
    * @param imageAssetId4 The id of the an offer asset
    * @param imageAssetId5 The id of the an offer asset
    * @param publisher The maker of the item.
    * @param redeemableStart The redeemable start date/time of the offer.
    * @param redeemableEnd The redeemable start date/time of the offer.
    * @param brand The brand. OfferType PRODUCT only.
    * @param productType The product type. OfferType PRODUCT only.
    * @param conditionType The condition. OfferType PRODUCT only.
    * @param isbn The ISBN id. OfferType PRODUCT only.
    * @param asin The ASIN id. OfferType PRODUCT only.
    * @param catalogNumbers The list of catelog numbers, comma seperated. OfferType PRODUCT only.
    * @param department The department name. The OfferType PRODUCT only.
    * @param features The list of features, comma seperated. OfferType PRODUCT only.
    * @param minimumPrice The MAP price. OfferType PRODUCT only.
    * @param width The width of the item. OfferType PRODUCT only.
    * @param height The height of the item. OfferType PRODUCT only.
    * @param depth The depth of the item. OfferType PRODUCT only.
    * @param weight The weight of the item. OfferType PRODUCT only.
    * @param unit The unit of measurement. OfferType PRODUCT only.
    * @param studio The studio name. OfferType PRODUCT only.
    * @param parentalRating The parental control rating. OfferType PRODUCT only.
    * @param publishDate The date published. OfferType PRODUCT only.
    * @param availabilityDate The date available. OfferType PRODUCT only.
    * @param sizeId The size Id. OfferType PRODUCT only.
    * @param listingId The ID of the event listing
    * @param mediaType 
    * @param duration The total playing time of the media item. OfferType MEDIA only.
    * @param author The created/author of the media item. OfferType MEDIA only.
    * @param releaseDate The date/time of when the media item was originally released. OfferType MEDIA only.
    * @param collectionIds 
    * @param rebootTimeHour The reboot hour time ranging from 0 to 23
    * @param rebootTimeMinute The reboot minute time ranging from 0 to 59
    * @param idleTimeoutInSecond If the device is idle for idleTimeoutInSecond then the device should timeout
    * @param serialNumber The serial number on the device
    * @param udid The unique device id for the device
    * @param deviceType The type of the device, for example: \&quot;Kiosk\&quot;, \&quot;Beacon\&quot;.
    * @param devicePower RSSI reading at 1 meter from device (-10 to -140)
    * @param deviceInterference 
    * @param availability 
    * @param availabilitySummary 
    */
  def updateOffer(version: BigDecimal, offerId: Long, includeOfferLocations: Boolean, deviceId: Option[String], accountId: Option[Long], parentOfferId: Option[Long], retailerLocationIds: Option[String], offerLocations: Option[String], tags: Option[String], title: Option[String], subTitle: Option[String], details: Option[String], subDetails: Option[String], finePrint: Option[String], barcodeType: Option[String], barcodeEntry: Option[String], externalRedeemOptions: Option[String], externalUrl: Option[String], externalId: Option[String], ticketsRewardType: Option[String], ticketsReward: Option[Long], activated: Option[Long], expires: Option[Long], noExpiration: Option[Boolean], availableLimit: Option[Int], availableLimitPerUser: Option[Int], addedLimit: Option[Int], viewLimit: Option[Int], maxPrints: Option[Int], ticketPriceType: Option[String], ticketPrice: Option[Long], fullPrice: Option[Double], discountPrice: Option[Double], showRemaining: Option[Boolean], showRedeemed: Option[Boolean], replaced: Option[Boolean], featured: Option[Boolean], offerType: Option[String], specialOfferType: Option[String], offerVisibility: Option[String], categoryIds: Option[String], filterIds: Option[String], active: Option[Boolean], barcodeAssetId: Option[Long], imageAssetId: Option[Long], imageAssetId1: Option[Long], imageAssetId2: Option[Long], imageAssetId3: Option[Long], imageAssetId4: Option[Long], imageAssetId5: Option[Long], publisher: Option[String], redeemableStart: Option[Long], redeemableEnd: Option[Long], brand: Option[String], productType: Option[String], conditionType: Option[String], isbn: Option[String], asin: Option[String], catalogNumbers: Option[String], department: Option[String], features: Option[String], minimumPrice: Option[Double], width: Option[Double], height: Option[Double], depth: Option[Double], weight: Option[Double], unit: Option[String], studio: Option[String], parentalRating: Option[String], publishDate: Option[Long], availabilityDate: Option[Long], sizeId: Option[Long], listingId: Option[Long], mediaType: Option[String], duration: Option[Int], author: Option[String], releaseDate: Option[Long], collectionIds: Option[String], rebootTimeHour: Option[Int], rebootTimeMinute: Option[Int], idleTimeoutInSecond: Option[Int], serialNumber: Option[String], udid: Option[String], deviceType: Option[String], devicePower: Option[Double], deviceInterference: Option[Double], availability: Option[String], availabilitySummary: Option[String]): RetailerOfferResponse

  /**
    * Activate Offer
    * Sets the activated date on offers. This will make offers visible for consumers.
    * @param offerIds Comma separated list of offer ids
    * @param active Determines whether to make the offer active as well
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account used to perform the activation, must have rights to edit the offer.
    */
  def updateOfferStatus(version: BigDecimal, offerIds: String, active: Boolean, deviceId: Option[String], accountId: Option[Long]): SirqulResponse
}
