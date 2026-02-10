package api

import play.api.libs.json._
import model.BigDecimal
import model.MediaOfferResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait MediaApi {
  /**
    * Create Media
    * Create a media offering.
    * @param accountId The account id of the logged in user
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
    * @param specialOfferType The special offer type {ALL, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}
    * @param offerVisibility The offer visibility {PUBLIC, REWARDABLE, TRIGGERABLE}
    * @param active Sets the active flag
    * @param retailerLocationIds Comma separated list of retailer location ids. This will assign the offer to these retailer locations.
    * @param subTitle The sub title (255 char limit)
    * @param details The details of the media
    * @param subDetails A string for custom details (255 char limit)
    * @param finePrint The fine print of the media
    * @param barcodeEntry The bar code entry string
    * @param externalRedeemOptions An external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer
    * @param externalUrl The clickUrl of the offer
    * @param ticketsRewardType The type of ticket to reward, null means default type
    * @param ticketsReward Determines how many tickets are awarded
    * @param activated The date of when the offer will be visible to consumers
    * @param expires The date of when the offer expires
    * @param ticketPriceType the type of ticket needed to buy offer
    * @param showRemaining show how many of the media is remaining (if there is a limit)
    * @param showRedeemed show how many of the media has been redeemed
    * @param replaced if the media has been replaced
    * @param featured if the media should be featured or not
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
    * @param conditionType The condition type of the media
    * @param isbn The ISBN id
    * @param asin The ASIN id
    * @param catalogNumbers The list of catelog numbers, comma seperated
    * @param parentalRating The parental control rating
    * @param availabilityDate The date the media is available to use
    * @param mediaType the media type
    * @param duration The total playing time of the media item
    * @param author The created/author of the media item
    * @param releaseDate The date/time of when the media item was originally released
    * @param collectionIds the IDs of the collections this media should be assigned to
    * @param availability ability to assign if this media should active or not
    * @param availabilitySummary ability to assign when the media expires
    */
  def createMedia(version: BigDecimal, accountId: Long, title: String, barcodeType: String, noExpiration: Boolean, availableLimit: Int, availableLimitPerUser: Int, addedLimit: Int, viewLimit: Int, maxPrints: Int, ticketPrice: Long, fullPrice: Double, discountPrice: Double, specialOfferType: String, offerVisibility: String, active: Boolean, retailerLocationIds: Option[String], subTitle: Option[String], details: Option[String], subDetails: Option[String], finePrint: Option[String], barcodeEntry: Option[String], externalRedeemOptions: Option[String], externalUrl: Option[String], ticketsRewardType: Option[String], ticketsReward: Option[Long], activated: Option[Long], expires: Option[Long], ticketPriceType: Option[String], showRemaining: Option[Boolean], showRedeemed: Option[Boolean], replaced: Option[Boolean], featured: Option[Boolean], categoryIds: Option[String], filterIds: Option[String], barcodeAssetId: Option[Long], imageAssetId: Option[Long], imageAssetId1: Option[Long], imageAssetId2: Option[Long], imageAssetId3: Option[Long], imageAssetId4: Option[Long], imageAssetId5: Option[Long], publisher: Option[String], redeemableStart: Option[Long], redeemableEnd: Option[Long], conditionType: Option[String], isbn: Option[String], asin: Option[String], catalogNumbers: Option[String], parentalRating: Option[String], availabilityDate: Option[Long], mediaType: Option[String], duration: Option[Int], author: Option[String], releaseDate: Option[Long], collectionIds: Option[String], availability: Option[String], availabilitySummary: Option[String]): MediaOfferResponse

  /**
    * Delete Media
    * Delete a media offering that the user has permissions to.
    * @param accountId the id of the logged in user
    * @param mediaId the ID of the media to delete
    */
  def deleteMedia(version: BigDecimal, accountId: Long, mediaId: Long): SirqulResponse

  /**
    * Media Get
    * Get a media offering.
    * @param accountId the id of the logged in user
    * @param mediaId the id of the media to get
    */
  def getMedia(version: BigDecimal, accountId: Long, mediaId: Long): MediaOfferResponse

  /**
    * Search Media
    * Searches on events that the account has access to.
    * @param accountId The logged in user.
    * @param activeOnly Return only active results
    * @param sortField The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY, AVAILABILITY_DATE, RELEASE_DATE
    * @param descending The order to return the search results
    * @param keyword The keyword used to search
    * @param categoryIds 
    * @param filterIds 
    * @param start The record to begin the return set on
    * @param limit The number of records to return
    */
  def searchMedia(version: BigDecimal, accountId: Long, activeOnly: Boolean, sortField: String, descending: Boolean, keyword: Option[String], categoryIds: Option[String], filterIds: Option[String], start: Option[Int], limit: Option[Int]): List[MediaOfferResponse]

  /**
    * Update Media
    * Update a media offering.
    * @param accountId The account used to perform the update, must have rights to edit the offer (deviceId or accountId required)
    * @param mediaId 
    * @param retailerLocationIds Comma separated list of retailer location ids. This will assign the offer to these retailer locations.
    * @param offerLocations A list of json data that has offer location specific values.
    * @param title The title (255 char limit)
    * @param subTitle The sub title (255 char limit)
    * @param details The details
    * @param subDetails A string for custom details (255 char limit)
    * @param finePrint The fine print
    * @param barcodeType The bar code type {NONE, UPC, CODE_128, QR, CUSTOM_MEDIA}
    * @param barcodeEntry The bar code entry string
    * @param externalRedeemOptions An external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer.
    * @param externalUrl The clickUrl of the offer
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
    * @param showRemaining The show remaining
    * @param showRedeemed The show redeemed
    * @param replaced The replaced
    * @param featured The featured
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
    * @param conditionType The condition. OfferType PRODUCT only.
    * @param isbn The ISBN id. OfferType PRODUCT only.
    * @param asin The ASIN id. OfferType PRODUCT only.
    * @param catalogNumbers The list of catelog numbers, comma seperated. OfferType PRODUCT only.
    * @param availabilityDate The date available. OfferType PRODUCT only.
    * @param parentalRating The parental control rating. OfferType PRODUCT only.
    * @param mediaType 
    * @param duration The total playing time of the media item. OfferType MEDIA only.
    * @param author The created/author of the media item. OfferType MEDIA only.
    * @param releaseDate The date/time of when the media item was originally released. OfferType MEDIA only.
    * @param collectionIds 
    * @param availability 
    * @param availabilitySummary 
    */
  def updateMedia(version: BigDecimal, accountId: Long, mediaId: Long, retailerLocationIds: Option[String], offerLocations: Option[String], title: Option[String], subTitle: Option[String], details: Option[String], subDetails: Option[String], finePrint: Option[String], barcodeType: Option[String], barcodeEntry: Option[String], externalRedeemOptions: Option[String], externalUrl: Option[String], ticketsRewardType: Option[String], ticketsReward: Option[Long], activated: Option[Long], expires: Option[Long], noExpiration: Option[Boolean], availableLimit: Option[Int], availableLimitPerUser: Option[Int], addedLimit: Option[Int], viewLimit: Option[Int], maxPrints: Option[Int], ticketPriceType: Option[String], ticketPrice: Option[Long], fullPrice: Option[Double], discountPrice: Option[Double], showRemaining: Option[Boolean], showRedeemed: Option[Boolean], replaced: Option[Boolean], featured: Option[Boolean], specialOfferType: Option[String], offerVisibility: Option[String], categoryIds: Option[String], filterIds: Option[String], active: Option[Boolean], barcodeAssetId: Option[Long], imageAssetId: Option[Long], imageAssetId1: Option[Long], imageAssetId2: Option[Long], imageAssetId3: Option[Long], imageAssetId4: Option[Long], imageAssetId5: Option[Long], publisher: Option[String], redeemableStart: Option[Long], redeemableEnd: Option[Long], conditionType: Option[String], isbn: Option[String], asin: Option[String], catalogNumbers: Option[String], availabilityDate: Option[Long], parentalRating: Option[String], mediaType: Option[String], duration: Option[Int], author: Option[String], releaseDate: Option[Long], collectionIds: Option[String], availability: Option[String], availabilitySummary: Option[String]): MediaOfferResponse
}
