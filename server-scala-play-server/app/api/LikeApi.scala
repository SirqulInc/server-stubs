package api

import play.api.libs.json._
import model.BigDecimal
import model.LikableResponse
import model.SearchResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait LikeApi {
  /**
    * Create Like
    * Allows a user to like or dislike accounts, albums, album contests, assets, game levels, notes, and theme descriptors. Multiple likes\\dislikes on the same object will replace the previous one.
    * @param likableType The type of likable object {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, NOTE, THEME_DESCRIPTOR}
    * @param likableId The id of the likable object
    * @param deviceId The unique device identifier that made the request (either deviceId or accountId must be used)
    * @param accountId The unique accountId that made the request (either deviceId or accountId must be used)
    * @param permissionableType This is used for sending out group notifications. For example, when someone likes an asset which is also a part of an album, everyone in the album will receive a notification. This is achieved by passing in the permissionable type (in this case \&quot;album\&quot;), and the permissionable id (the album id). Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}
    * @param permissionableId The id of the permissionable object (for sending group notifications)
    * @param like determines whether the user likes or dislikes the object
    * @param app This parameter is deprecated. This is deprecated, use \&quot;appKey\&quot; instead.
    * @param gameType This parameter is deprecated. This is deprecated, use \&quot;appKey\&quot; instead.
    * @param appKey the application key
    * @param latitude The current location of the user
    * @param longitude The current location of the user
    */
  def registerLike(version: BigDecimal, likableType: String, likableId: Long, deviceId: Option[String], accountId: Option[Long], permissionableType: Option[String], permissionableId: Option[Long], like: Option[Boolean], app: Option[String], gameType: Option[String], appKey: Option[String], latitude: Option[Double], longitude: Option[Double]): LikableResponse

  /**
    * Delete Like
    * Removes a like. This will make the user \&quot;neutral\&quot;.
    * @param likableType The type of the likable object {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, NOTE, THEME_DESCRIPTOR}
    * @param likableId The id of the likable object
    * @param deviceId The unique device identifier that made the request (either deviceId or accountId must be used)
    * @param accountId The unique accountId that made the request (either deviceId or accountId must be used)
    * @param latitude The current location of the user
    * @param longitude The current location of the user
    */
  def removeLike(version: BigDecimal, likableType: String, likableId: Long, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): LikableResponse

  /**
    * Search Likes
    * Search for likes on a likable object.
    * @param likableType The type of the likable object {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, NOTE, THEME_DESCRIPTOR}
    * @param likableId The id of the likable object
    * @param deviceId The unique device identifier that made the request (either deviceId or accountId must be used)
    * @param accountId The unique accountId that made the request (either deviceId or accountId must be used)
    * @param connectionAccountIds Comma separated list of account IDs for filtering on users
    * @param sortField The field to sort by. Possible values include: ID
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param updatedSince return items that have been updated since this date (time-stamp in milliseconds)
    * @param updatedBefore return items that have been updated before this date (time-stamp in milliseconds)
    * @param start the start index for pagination
    * @param limit the limit for pagination
    */
  def searchLikes(version: BigDecimal, likableType: String, likableId: Long, deviceId: Option[String], accountId: Option[Long], connectionAccountIds: Option[String], sortField: Option[String], descending: Option[Boolean], updatedSince: Option[Long], updatedBefore: Option[Long], start: Option[Int], limit: Option[Int]): SearchResponse
}
