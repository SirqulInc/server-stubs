package api

import model.BigDecimal
import model.MissionShortResponse
import model.SirqulResponse
import model.TournamentResponse

/**
  * Provides a default implementation for [[TournamentApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class TournamentApiImpl extends TournamentApi {
  /**
    * @inheritdoc
    */
  override def createTournament(version: BigDecimal, accountId: Long, appKey: String, title: String, costToPlay: Int, startDate: Long, subType: Option[String], imageAssetId: Option[Long], secondsBetweenLevels: Option[Int], secondsForTieBreaker: Option[Int], secondsBetweenPacks: Option[Int], maximumLevelLength: Option[Int], costToPlayType: Option[String], minimumToPlay: Option[Int], startingLimit: Option[Int], availableLimit: Option[Int], description: Option[String], metaData: Option[String], audienceIds: Option[String], active: Option[Boolean], enableBuyBack: Option[Boolean], offerIds: Option[String], offerAssetId: Option[Long], fixedReward: Option[Boolean], splitReward: Option[String], allocateTickets: Option[Boolean], tournamentData: Option[String], missionType: Option[String], visibility: Option[String], preliminaryGroups: Option[Int], preliminaryGroupAdvancements: Option[String], enableMultipleEntries: Option[Boolean], enableMultipleVotes: Option[Boolean], featured: Option[Boolean], winnerTag: Option[String], tieTag: Option[String]): TournamentResponse = {
    // TODO: Implement better logic

    TournamentResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteTournament(version: BigDecimal, accountId: Long, missionId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getTournament(version: BigDecimal, accountId: Long, missionId: Option[Long], joinCode: Option[String], includeScores: Option[String], objectPreviewSize: Option[Int]): TournamentResponse = {
    // TODO: Implement better logic

    TournamentResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchObjects(version: BigDecimal, accountId: Long, gameLevelId: Long, sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchRounds(version: BigDecimal, accountId: Long, appKey: String, status: Option[String], missionType: Option[String], currentOnly: Option[Boolean], visibilities: Option[String], start: Option[Int], limit: Option[Int]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchTournaments(version: BigDecimal, accountId: Long, appKey: String, keyword: Option[String], subType: Option[String], includeInactive: Option[Boolean], missionTypes: Option[String], filter: Option[String], sortField: Option[String], descending: Option[Boolean], visibility: Option[String], start: Option[Int], limit: Option[Int]): MissionShortResponse = {
    // TODO: Implement better logic

    MissionShortResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def submitTournamentScore(version: BigDecimal, accountId: Long, appKey: String, missionId: Long, gameId: Long, packId: Long, scores: String, gameLevelId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def submitTournamentVote(version: BigDecimal, accountId: Long, appKey: String, missionId: Long, gameObjectId: Long, deviceId: Option[String], checkIfDeviceAlreadyVoted: Option[Boolean]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def substituteTournamentPlayer(version: BigDecimal, accountId: Long, missionId: Long, packId: Long, gameLevelId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateTournament(version: BigDecimal, accountId: Long, missionId: Long, title: Option[String], subType: Option[String], imageAssetId: Option[Long], secondsBetweenLevels: Option[Int], secondsForTieBreaker: Option[Int], secondsBetweenPacks: Option[Int], maximumLevelLength: Option[Int], costToPlay: Option[Int], costToPlayType: Option[String], minimumToPlay: Option[Int], startingLimit: Option[Int], availableLimit: Option[Int], description: Option[String], metaData: Option[String], startDate: Option[Long], audienceIds: Option[String], active: Option[Boolean], enableBuyBack: Option[Boolean], offerIds: Option[String], offerAssetId: Option[Long], fixedReward: Option[Boolean], splitReward: Option[String], allocateTickets: Option[Boolean], tournamentData: Option[String], visibility: Option[String], preliminaryGroups: Option[Int], preliminaryGroupAdvancements: Option[String], enableMultipleEntries: Option[Boolean], enableMultipleVotes: Option[Boolean], featured: Option[Boolean], winnerTag: Option[String], tieTag: Option[String]): TournamentResponse = {
    // TODO: Implement better logic

    TournamentResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
