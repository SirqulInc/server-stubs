package api

import model.BigDecimal
import model.JsObject
import model.RankFullResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[RankingApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class RankingApiImpl extends RankingApi {
  /**
    * @inheritdoc
    */
  override def getHistoricalRankings(version: BigDecimal, appKey: String, rankType: String, startDate: Long, endDate: Long, deviceId: Option[String], accountId: Option[Long], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): RankFullResponse = {
    // TODO: Implement better logic

    RankFullResponse(None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getRankings(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], appKey: Option[String], q: Option[String], keyword: Option[String], rankType: Option[String], leaderboardMode: Option[String], withinAccountIds: Option[String], returnUserRank: Option[Boolean], albumId: Option[Long], audienceId: Option[Long], sortField: Option[String], descending: Option[Boolean], i: Option[Int], start: Option[Int], l: Option[Int], limit: Option[Int]): RankFullResponse = {
    // TODO: Implement better logic

    RankFullResponse(None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getUserRank(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appKey: Option[String], rankType: Option[String], returnUserRank: Option[Boolean], leaderboardMode: Option[String], sortField: Option[String], keyword: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): JsObject = {
    // TODO: Implement better logic

    null
  }

  /**
    * @inheritdoc
    */
  override def overrideUserRank(version: BigDecimal, accountId: Long, ownerAccountId: Long, appKey: String, rankType: String, totalScore: Option[Long], totalCount: Option[Long], totalTime: Option[Long], dailyScore: Option[Long], dailyCount: Option[Long], dailyTime: Option[Long], weeklyScore: Option[Long], weeklyCount: Option[Long], weeklyTime: Option[Long], monthlyScore: Option[Long], monthlyCount: Option[Long], monthlyTime: Option[Long], topScore: Option[Long], lowestScore: Option[Long], streakCount: Option[Long], streakBestCount: Option[Long], startDate: Option[Long], endDate: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateRankings(version: BigDecimal, accountId: Long, appKey: String, rankType: String, increment: Option[Long], timeIncrement: Option[Long], tag: Option[String], startDate: Option[Long], endDate: Option[Long], updateGlobal: Option[Boolean], createLeaderboard: Option[Boolean]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }
}
