package api

import model.LikableResponse
import model.SearchResponse

/**
  * Provides a default implementation for [[LikeApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class LikeApiImpl extends LikeApi {
  /**
    * @inheritdoc
    */
  override def registerLike(likableType: String, likableId: Long, deviceId: Option[String], accountId: Option[Long], permissionableType: Option[String], permissionableId: Option[Long], like: Option[Boolean], app: Option[String], gameType: Option[String], appKey: Option[String], latitude: Option[Double], longitude: Option[Double]): LikableResponse = {
    // TODO: Implement better logic

    LikableResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def removeLike(likableType: String, likableId: Long, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): LikableResponse = {
    // TODO: Implement better logic

    LikableResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchLikes(likableType: String, likableId: Long, deviceId: Option[String], accountId: Option[Long], connectionAccountIds: Option[String], sortField: Option[String], descending: Option[Boolean], updatedSince: Option[Long], updatedBefore: Option[Long], start: Option[Int], limit: Option[Int]): SearchResponse = {
    // TODO: Implement better logic

    SearchResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
