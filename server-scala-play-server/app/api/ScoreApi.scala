package api

import play.api.libs.json._
import model.BigDecimal
import model.ScoreResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait ScoreApi {
  /**
    * Create Score
    * Create a score.  The response object will contain a series of   coded messages detailing what items were completed, the score registered,   and any tickets allocated.  Scoring a  level could complete the pack it   is in, completing that pack could complete the game, which  in turn could   complete the mission.  This completion chain is indicated to the client   via  a list of {@link MessageResponse}.
    * @param accountId The logged in user.
    * @param appKey The game application key to save the score for.
    * @param points The score
    * @param missionId The missionId to score for, ignore if not playing mission.
    * @param gameId The gameId to score for, ignore if not playing mission.
    * @param packId The packId to score for, send -2 if playing community levels.
    * @param gameLevelId The gameLevelId to score for.
    * @param gameObjectId The gameObjectId to score for, ignore if level based scoring.
    * @param timeTaken The time taken to complete task
    * @param highest 
    */
  def createScore(version: BigDecimal, accountId: Long, appKey: String, points: Int, missionId: Option[Long], gameId: Option[Long], packId: Option[Long], gameLevelId: Option[Long], gameObjectId: Option[Long], timeTaken: Option[Int], highest: Option[Boolean]): ScoreResponse

  /**
    * Get Score
    * Get the high score for an item.  Pass in the full path IDs for the score.
    * @param accountId The logged in user.
    * @param appKey The game application key to get the level for.
    * @param missionId The missionId to score for, null if not playing mission.
    * @param gameId The gameId to score for, null if not playing mission.
    * @param packId The packId to score for, null if playing community levels.
    * @param gameLevelId The gameLevelId to score for.
    * @param gameObjectId The gameObjectId to score for, null if level based scoring.
    * @param scoreObjectType The object type to filter scores by (TicketObjectType)
    * @param scoreStatus The status of the score to filter (ScoreStatus)
    */
  def getScore(version: BigDecimal, accountId: Long, appKey: String, missionId: Option[Long], gameId: Option[Long], packId: Option[Long], gameLevelId: Option[Long], gameObjectId: Option[Long], scoreObjectType: Option[String], scoreStatus: Option[String]): ScoreResponse

  /**
    * Search Score
    * Search the scores for an item.  Pass in the full path IDs for the scores.
    * @param accountId The logged in user.
    * @param appKey The game application key to get the level for.
    * @param missionId The missionId to score for, null if not playing mission.
    * @param gameId The gameId to score for, null if not playing mission.
    * @param packId The packId to score for, null if playing community levels.
    * @param gameLevelId The gameLevelId to score for.
    * @param gameObjectId The gameObjectId to score for, null if level based scoring.
    */
  def searchScores(version: BigDecimal, accountId: Long, appKey: String, missionId: Option[Long], gameId: Option[Long], packId: Option[Long], gameLevelId: Option[Long], gameObjectId: Option[Long]): List[ScoreResponse]
}
