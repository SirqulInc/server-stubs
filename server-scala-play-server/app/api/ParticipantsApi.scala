package api

import play.api.libs.json._
import model.BigDecimal
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait ParticipantsApi {
  /**
    * Process All Participant Feeds
    * Processes all supported participant feeds.
    * @param accountId The account id of the user
    * @param appKey The application key used to identify the application
    * @param useShortNameAsID Whether to use short name as the participant ID
    */
  def processAllParticipants(version: BigDecimal, accountId: Long, appKey: Option[String], useShortNameAsID: Option[Boolean]): SirqulResponse

  /**
    * Process Participants Feed
    * Processes a participant feed or uploaded file for a specific league.
    * @param accountId The account id of the user
    * @param league The league identifier to process
    * @param appKey The application key used to identify the application
    * @param useShortNameAsID Whether to use short name as the participant ID
    * @param file Multipart file containing participant feed contents
    */
  def processParticipants(version: BigDecimal, accountId: Long, league: String, appKey: Option[String], useShortNameAsID: Option[Boolean], file: Option[TemporaryFile]): SirqulResponse
}
