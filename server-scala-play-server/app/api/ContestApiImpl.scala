package api

import model.AlbumContestListResponse
import model.AlbumContestResponse
import model.BigDecimal
import model.SirqulResponse

/**
  * Provides a default implementation for [[ContestApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ContestApiImpl extends ContestApi {
  /**
    * @inheritdoc
    */
  override def addOrUpdateAlbumContest(version: BigDecimal, publicRead: Boolean, publicWrite: Boolean, publicDelete: Boolean, publicAdd: Boolean, visibility: String, includeFriendGroup: Boolean, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], appKey: Option[String], contestType: Option[String], albumContestId: Option[Long], title: Option[String], description: Option[String], albumId1: Option[Long], removeAlbum1: Option[Boolean], albumId2: Option[Long], removeAlbum2: Option[Boolean], startDate: Option[Long], endDate: Option[Long], locationDescription: Option[String], connectionIdsToAdd: Option[String], connectionGroupIdsToAdd: Option[String], latitude: Option[Double], longitude: Option[Double]): AlbumContestResponse = {
    // TODO: Implement better logic

    AlbumContestResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def approveAlbumContest(version: BigDecimal, albumContestId: Long, approvalStatus: String, deviceId: Option[String], accountId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteContest(version: BigDecimal, albumContestId: Long, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getAlbumContest(version: BigDecimal, albumContestId: Long, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): AlbumContestResponse = {
    // TODO: Implement better logic

    AlbumContestResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getAlbumContests(version: BigDecimal, filter: String, sortField: String, descending: Boolean, start: Int, limit: Int, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], appKey: Option[String], appType: Option[String], contestType: Option[String], ownerId: Option[Long], q: Option[String], keyword: Option[String], i: Option[Int], l: Option[Int], dateCreated: Option[Long], latitude: Option[Double], longitude: Option[Double]): AlbumContestListResponse = {
    // TODO: Implement better logic

    AlbumContestListResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def voteOnAlbumContest(version: BigDecimal, albumContestId: Long, albumId: Long, deviceId: Option[String], accountId: Option[Long], contestType: Option[String], latitude: Option[Double], longitude: Option[Double]): AlbumContestResponse = {
    // TODO: Implement better logic

    AlbumContestResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
