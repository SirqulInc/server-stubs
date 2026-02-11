package api

import model.ScoreResponse

/**
  * Provides a default implementation for [[ScoreApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ScoreApiImpl extends ScoreApi {
  /**
    * @inheritdoc
    */
  override def createScore(accountId: Long, appKey: String, points: Int, missionId: Option[Long], gameId: Option[Long], packId: Option[Long], gameLevelId: Option[Long], gameObjectId: Option[Long], timeTaken: Option[Int], highest: Option[Boolean]): ScoreResponse = {
    // TODO: Implement better logic

    ScoreResponse(None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getScore(accountId: Long, appKey: String, missionId: Option[Long], gameId: Option[Long], packId: Option[Long], gameLevelId: Option[Long], gameObjectId: Option[Long], scoreObjectType: Option[String], scoreStatus: Option[String]): ScoreResponse = {
    // TODO: Implement better logic

    ScoreResponse(None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchScores(accountId: Long, appKey: String, missionId: Option[Long], gameId: Option[Long], packId: Option[Long], gameLevelId: Option[Long], gameObjectId: Option[Long]): List[ScoreResponse] = {
    // TODO: Implement better logic

    List.empty[ScoreResponse]
  }
}
