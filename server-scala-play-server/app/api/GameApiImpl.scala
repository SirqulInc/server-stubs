package api

import model.BigDecimal
import model.GameResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[GameApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class GameApiImpl extends GameApi {
  /**
    * @inheritdoc
    */
  override def createGame(version: BigDecimal, accountId: Option[Long], appKey: Option[String], title: Option[String], description: Option[String], metaData: Option[String], packIds: Option[String], includeGameData: Option[Boolean]): GameResponse = {
    // TODO: Implement better logic

    GameResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteGame(version: BigDecimal, accountId: Long, gameId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getGame(version: BigDecimal, accountId: Long, gameId: Long, includeGameData: Option[Boolean]): GameResponse = {
    // TODO: Implement better logic

    GameResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchGames(version: BigDecimal, accountId: Long, appKey: String, start: Int, limit: Int, keyword: Option[String], appVersion: Option[String], includeGameData: Option[Boolean], includeInactive: Option[Boolean]): GameResponse = {
    // TODO: Implement better logic

    GameResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateGame(version: BigDecimal, accountId: Option[Long], gameId: Option[Long], appKey: Option[String], title: Option[String], description: Option[String], metaData: Option[String], packIds: Option[String], includeGameData: Option[Boolean]): GameResponse = {
    // TODO: Implement better logic

    GameResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
