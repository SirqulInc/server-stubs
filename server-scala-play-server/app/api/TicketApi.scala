package api

import play.api.libs.json._
import model.BigDecimal
import model.CountResponse
import model.ProfileResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile
import model.TicketListResponse
import model.TicketOfferResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait TicketApi {
  /**
    * Get Ticket Count
    * Gets the ticket count.
    * @param deviceId the id of the device that owns the tickets
    * @param accountId the id of the account that owns the tickets
    * @param gameType this is deprecated.
    * @param appKey the applicationkey
    * @param ticketType the type of ticket
    */
  def getTicketCount(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], appKey: Option[String], ticketType: Option[String]): CountResponse

  /**
    * Get Ticket List
    * Gets the list of tickets.
    * @param deviceId the id of the device that owns the tickets
    * @param accountId the id of the account that owns the tickets
    * @param ticketObjectType comma separated list of TicketObjectType
    * @param actionType comma separated list of TicketActionType
    * @param ticketIds the ids of the tickets to get
    * @param objectIds the ids of the objects to get
    * @param receiptTokens 
    * @param gameType 
    * @param appKey the application key
    */
  def getTicketList(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], ticketObjectType: Option[String], actionType: Option[String], ticketIds: Option[String], objectIds: Option[String], receiptTokens: Option[String], gameType: Option[String], appKey: Option[String]): TicketListResponse

  /**
    * Gift Tickets
    * Gift tickets to another user.
    * @param receiverAccountId the id of the account receiving the tickets
    * @param ticketId the id of the tickets
    * @param deviceId the id of the device
    * @param accountId the id of the gift owner
    * @param assetId the id of the asset
    * @param customMessage a message that can be written to go along with the gift
    * @param gameType the type of game associated with the tickets
    * @param appKey the application key
    */
  def giftPurchase(version: BigDecimal, receiverAccountId: Long, ticketId: Long, deviceId: Option[String], accountId: Option[Long], assetId: Option[Long], customMessage: Option[String], gameType: Option[String], appKey: Option[String]): SirqulResponse

  /**
    * Save Ticket
    * Allow user to acquire a purchase item and generate a ticket record. Used to redeem tickets or add tickets to the system.
    * @param actionType the action being performed, values: COMPLETED, // ADD TICKETS FOR COMPLETING A MISSION, CHALLENGE, GAME, PACK, LEVEL, LEVEL OBJECT REDEEMED, // REMOVE TICKETS FOR BUYING PACKS, HINTS, AND PEN TOOLS OPTIONS, ETC USERS_PLAYED, // ADD TICKETS FOR LEVELS PLAYED BY OTHER USERS TOURNAMENT_OWNER, // ADD TICKETS FOR TOURNAMENTS BY OTHER USERS PURCHASED, // ADD TICKET VIA IN APP PURCHASING SUMATION, // SUMATION OF TICKETS EARNED FROM CHILDREN GIFTED, // TRANSFERING OF PURCHASE ITEMS TO OTHER PEOPLE REFUNDED // FOR REFUNDING TICKETS BACK TO THE USER
    * @param ticketObjectType the type of object being purchased, values: GAME_OBJECT, GAME_LEVEL, PACK, GAME, MISSION, PROFILE, APPLICATION, TICKETS, ASSET, CUSTOM
    * @param returnNulls whether to return nulls or not
    * @param deviceId the device id that owns the tickets
    * @param accountId the account id that owns the tickets
    * @param gameType This parameter is deprecated. deprecated, use the appKey
    * @param appKey the application key
    * @param objectId the ID of the item being purchased
    * @param purchaseCode a unique string identifier defined by the application owner or Executive
    * @param receiptToken a unique transaction identifier from the purchase provider (i.e. the transaction ID from iTunes, Google Play, etc)
    * @param receiptData the receipt/transaction data for validating a purchase via iTunes/Gooogle/etc. This should be in string format.
    * @param count the count of tickets
    * @param ticketType the ticket type
    * @param purchaseProvider the provider for making the purchase {ITUNES, ITUNES_SANDBOX, GOOGLE}
    * @param purchaseType a comma separated list of purchase types { SIRQUL, // purchasing from the sirqul store using tickets IOS, // purchasing from the itunes store for iPhone, iPod, iPod Touch GOOGLE, // purchasing from the google android store AMAZON, // purchasing from the amazon android store MAC, // purchasing from the itunes store for OSX WP8, // purhasing from the windows phone 8 store FREE }
    * @param returnProfileResponse returns a ProfileResponse if true, otherwise will return an AppResponse
    * @param includeProfileResponse if returnProfileResponse is false, will return an AppResponse with profile data if true
    * @param appVersion the application version
    */
  def saveTicket(version: BigDecimal, actionType: String, ticketObjectType: String, returnNulls: Option[Boolean], deviceId: Option[String], accountId: Option[Long], gameType: Option[String], appKey: Option[String], objectId: Option[Long], purchaseCode: Option[String], receiptToken: Option[String], receiptData: Option[String], count: Option[Long], ticketType: Option[String], purchaseProvider: Option[String], purchaseType: Option[String], returnProfileResponse: Option[Boolean], includeProfileResponse: Option[Boolean], appVersion: Option[String]): ProfileResponse

  /**
    * Save Ticket with Reciept
    * Similar to the Save Ticket endpoint but allows the receiptData to be in binary format. This must be a multi-part post
    * @param actionType the action being performed { COMPLETED, // ADD TICKETS FOR COMPLETING A MISSION, CHALLENGE, GAME, PACK, LEVEL, LEVEL OBJECT REDEEMED, // REMOVE TICKETS FOR BUYING PACKS, HINTS, AND PEN TOOLS OPTIONS, ETC USERS_PLAYED, // ADD TICKETS FOR LEVELS PLAYED BY OTHER USERS TOURNAMENT_OWNER, // ADD TICKETS FOR TOURNAMENTS BY OTHER USERS PURCHASED, // ADD TICKET VIA IN APP PURCHASING SUMATION, // SUMATION OF TICKETS EARNED FROM CHILDREN GIFTED, // TRANSFERING OF PURCHASE ITEMS TO OTHER PEOPLE REFUNDED // FOR REFUNDING TICKETS BACK TO THE USER }
    * @param ticketObjectType the type of object being purchased {GAME_OBJECT, GAME_LEVEL, PACK, GAME, MISSION, PROFILE, APPLICATION, TICKETS, ASSET, CUSTOM}
    * @param receiptData the receipt/transaction data for validating a purchase via iTunes/Gooogle/etc. This should be in binary format.
    * @param returnNulls whether to return nulls or not
    * @param deviceId the device id
    * @param accountId the account id
    * @param gameType This parameter is deprecated. deprecated, use the appKey
    * @param appKey the application key
    * @param objectId the ID of the item being purchased
    * @param purchaseCode a unique string identifier defined by the application owner or Executive
    * @param receiptToken a unique transaction identifier from the purchase provider (i.e. the transaction ID from iTunes, Google Play, etc)
    * @param count the count of tickets
    * @param ticketType the ticket type
    * @param purchaseProvider the provider for making the purchase {ITUNES, ITUNES_SANDBOX, GOOGLE}
    * @param purchaseType a comma separated list of purchase types { SIRQUL, // purchasing from the sirqul store using tickets IOS, // purchasing from the itunes store for iPhone, iPod, iPod Touch GOOGLE, // purchasing from the google android store AMAZON, // purchasing from the amazon android store MAC, // purchasing from the itunes store for OSX WP8, // purhasing from the windows phone 8 store FREE }
    * @param returnProfileResponse returns a ProfileResponse if true, otherwise will return an AppResponse
    * @param includeProfileResponse if returnProfileResponse is false, will return an AppResponse with profile data if true
    * @param appVersion the application version
    */
  def saveTicketViaFileUpload(version: BigDecimal, actionType: String, ticketObjectType: String, receiptData: TemporaryFile, returnNulls: Option[Boolean], deviceId: Option[String], accountId: Option[Long], gameType: Option[String], appKey: Option[String], objectId: Option[Long], purchaseCode: Option[String], receiptToken: Option[String], count: Option[Long], ticketType: Option[String], purchaseProvider: Option[String], purchaseType: Option[String], returnProfileResponse: Option[Boolean], includeProfileResponse: Option[Boolean], appVersion: Option[String]): ProfileResponse

  /**
    * Get Ticket Offers
    * Get a list offers for tickets owned by sirqul.  Purchasing these will add the number of tickets to the account specified by the offer.
    */
  def ticketOffers(version: BigDecimal): TicketOfferResponse
}
