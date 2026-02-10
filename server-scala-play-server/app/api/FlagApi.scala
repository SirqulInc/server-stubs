package api

import play.api.libs.json._
import model.BigDecimal
import model.CountResponse
import model.FlagResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait FlagApi {
  /**
    * Create Flag
    * Allows a user to flag an object that the user deems inappropriate or offensive. Flagable objects include accounts, albums, album contests, assets, game levels, and theme descriptors
    * @param flagableType The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, NOTE, OFFER}
    * @param flagableId The flagable object id
    * @param deviceId The unique device identifier that made the request (either deviceId or accountId must be used)
    * @param accountId The unique accountId that made the request (either deviceId or accountId must be used)
    * @param flagDescription An optional description of why is it being flagged
    * @param latitude The current location of the user
    * @param longitude The current location of the user
    */
  def createFlag(version: BigDecimal, flagableType: String, flagableId: Long, deviceId: Option[String], accountId: Option[Long], flagDescription: Option[String], latitude: Option[Double], longitude: Option[Double]): SirqulResponse

  /**
    * Delete Flag
    * Deletes a flag.
    * @param deviceId The unique device identifier that made the request (either deviceId or accountId must be used)
    * @param accountId The unique accountId that made the request (either deviceId or accountId must be used)
    * @param itemBeingFlaggedType This parameter is deprecated.
    * @param itemBeingFlaggedId This parameter is deprecated.
    * @param flagableType The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, OFFER, NOTE}
    * @param flagableId The flagable object id
    */
  def deleteFlag(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], itemBeingFlaggedType: Option[String], itemBeingFlaggedId: Option[Long], flagableType: Option[String], flagableId: Option[Long]): SirqulResponse

  /**
    * Get Flag
    * Gets the details on whether the user has flagged a particular flagable object.
    * @param flagableType The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, NOTE, OFFER}
    * @param flagableId The flagable object id
    * @param deviceId The unique device identifier that made the request (either deviceId or accountId must be used)
    * @param accountId The unique accountId that made the request (either deviceId or accountId must be used)
    * @param latitude The current location of the user
    * @param longitude The current location of the user
    */
  def getFlag(version: BigDecimal, flagableType: String, flagableId: Long, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): FlagResponse

  /**
    * Get Flag Threshold
    * Get the flag threshold value on an object type for a particular application.
    * @param itemBeingFlaggedType The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, OFFER, NOTE}
    * @param appKey The application key
    */
  def getFlagThreshold(version: BigDecimal, itemBeingFlaggedType: String, appKey: String): CountResponse

  /**
    * Update Flag Threshold
    * Update the flag threshold on an object type for a particular application.
    * @param itemBeingFlaggedType The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, OFFER, NOTE}
    * @param threshold The threshold value
    * @param appKey The application key
    * @param deviceId The unique device identifier that made the request (either deviceId or accountId must be used)
    * @param accountId The unique accountId that made the request (either deviceId or accountId must be used)
    */
  def updateFlagThreshold(version: BigDecimal, itemBeingFlaggedType: String, threshold: Long, appKey: String, deviceId: Option[String], accountId: Option[Long]): CountResponse
}
