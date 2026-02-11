package api

import model.SirqulResponse
import model.WordzWordResponse

/**
  * Provides a default implementation for [[WordApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class WordApiImpl extends WordApi {
  /**
    * @inheritdoc
    */
  override def createWord(accountId: Long, word: String, definition: String, active: Boolean, allocateTickets: Boolean, ticketCount: Long, assetId: Option[Long], ticketType: Option[String], points: Option[Long]): WordzWordResponse = {
    // TODO: Implement better logic

    WordzWordResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteWord(wordId: Long, accountId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getWord(wordId: Long, accountId: Long): WordzWordResponse = {
    // TODO: Implement better logic

    WordzWordResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getWords(accountId: Long, sortField: String, descending: Boolean, activeOnly: Boolean, start: Int, limit: Int, keyword: Option[String]): List[WordzWordResponse] = {
    // TODO: Implement better logic

    List.empty[WordzWordResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateWord(wordId: Long, accountId: Long, ticketCount: Long, wordText: Option[String], definition: Option[String], assetId: Option[Long], active: Option[Boolean], allocateTickets: Option[Boolean], ticketType: Option[String], points: Option[Long]): WordzWordResponse = {
    // TODO: Implement better logic

    WordzWordResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
