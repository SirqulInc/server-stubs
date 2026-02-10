package api

import play.api.libs.json._
import model.BigDecimal
import model.SirqulResponse
import model.TokenResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait FacebookApi {
  /**
    * Get Facebook Token
    * Gets a user&#39;s Facebook token.
    * @param deviceId a unique id given by the device (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param latitude used to update the user&#39;s current location
    * @param longitude used to update the user&#39;s current location
    */
  def getToken(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): TokenResponse

  /**
    * Post to Facebook
    * Make Facebook posts on behalf of the user.
    * @param event the type of Sirqul event {DOWNLOADED_APP, CHALLENGE, LEVEL_COMPLETED, LEVEL_CREATED}
    * @param deviceId a unique id given by the device (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param permissionableType for posting about information related to an object. Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}
    * @param permissionableId the object id
    * @param assetId used to include an asset on a Facebook post
    * @param gameType This parameter is deprecated.
    * @param appKey the application key
    * @param latitude used to update the user&#39;s current location
    * @param longitude used to update the user&#39;s current location
    */
  def graphInterface(version: BigDecimal, event: String, deviceId: Option[String], accountId: Option[Long], permissionableType: Option[String], permissionableId: Option[Long], assetId: Option[Long], gameType: Option[String], appKey: Option[String], latitude: Option[Double], longitude: Option[Double]): SirqulResponse
}
