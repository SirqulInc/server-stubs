package api

import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[ParticipantsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ParticipantsApiImpl extends ParticipantsApi {
  /**
    * @inheritdoc
    */
  override def processAllParticipants(accountId: Long, appKey: Option[String], useShortNameAsID: Option[Boolean]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def processParticipants(accountId: Long, league: String, appKey: Option[String], useShortNameAsID: Option[Boolean], file: Option[TemporaryFile]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }
}
