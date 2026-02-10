package api

import model.BigDecimal
import model.LeaderboardResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[LeaderboardApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class LeaderboardApiImpl extends LeaderboardApi {
  /**
    * @inheritdoc
    */
  override def createLeaderboard(version: BigDecimal, accountId: Option[Long], appKey: Option[String], rankType: Option[String], leaderboardMode: Option[String], iconMedia: Option[TemporaryFile], iconAssetId: Option[Long], bannerMedia: Option[TemporaryFile], bannerAssetId: Option[Long], limitation: Option[Int], sortField: Option[String], title: Option[String], description: Option[String], metaData: Option[String]): LeaderboardResponse = {
    // TODO: Implement better logic

    LeaderboardResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteLeaderboard(version: BigDecimal, leaderboardId: Long, accountId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getLeaderboard(version: BigDecimal, leaderboardId: Long, accountId: Option[Long], includeFullRankingList: Option[Boolean]): LeaderboardResponse = {
    // TODO: Implement better logic

    LeaderboardResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchLeaderboards(version: BigDecimal, accountId: Option[Long], appKey: Option[String], globalOnly: Option[Boolean], keyword: Option[String], leaderboardIds: Option[String], rankTypes: Option[String], sortField: Option[String], descending: Option[Boolean], includeInactive: Option[Boolean], includeAppResponse: Option[Boolean], start: Option[Int], limit: Option[Int]): LeaderboardResponse = {
    // TODO: Implement better logic

    LeaderboardResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateLeaderboard(version: BigDecimal, leaderboardId: Long, accountId: Option[Long], appKey: Option[String], rankType: Option[String], leaderboardMode: Option[String], sortField: Option[String], iconMedia: Option[TemporaryFile], iconAssetId: Option[Long], bannerMedia: Option[TemporaryFile], bannerAssetId: Option[Long], limitation: Option[Int], active: Option[Boolean], title: Option[String], description: Option[String], metaData: Option[String]): LeaderboardResponse = {
    // TODO: Implement better logic

    LeaderboardResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
