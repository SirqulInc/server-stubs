package api

import model.BigDecimal
import model.OrsonAiAddMovieResponse
import model.OrsonAiBatchResponse
import model.OrsonAiEmotionsResponse
import model.OrsonAiProtoResponse
import model.OrsonAiSTTResponse
import model.OrsonAiTTSResponse
import model.OrsonAiTechTuneResponse
import model.OrsonAiTopicsResponse
import model.OrsonAiVoiceCanvasResponse
import model.OrsonEpisodeResponse
import model.OrsonRenderResponse
import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[OrsonApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class OrsonApiImpl extends OrsonApi {
  /**
    * @inheritdoc
    */
  override def addMovie(version: BigDecimal, accountId: Long, movieName: String, thirdPartyAccountId: Option[String], tags: Option[String], file: Option[TemporaryFile], url: Option[String], callback: Option[String]): OrsonAiAddMovieResponse = {
    // TODO: Implement better logic

    OrsonAiAddMovieResponse(None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def aiDocs(version: BigDecimal, accountId: Long, doc: String, returnTopics: Option[Boolean], limit: Option[Int], offset: Option[Int]): OrsonAiProtoResponse = {
    // TODO: Implement better logic

    OrsonAiProtoResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def aiFindImages(version: BigDecimal, accountId: Long, text: String, parseFlag: Option[String], fetchFlag: Option[String], size: Option[String]): OrsonAiProtoResponse = {
    // TODO: Implement better logic

    OrsonAiProtoResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def aiTags(version: BigDecimal, accountId: Long, tags: String, conditional: Option[String], limit: Option[Int], offset: Option[Int]): OrsonAiProtoResponse = {
    // TODO: Implement better logic

    OrsonAiProtoResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def aiText(version: BigDecimal, accountId: Long, terms: String, conditional: Option[String], limit: Option[Int], offset: Option[Int]): OrsonAiProtoResponse = {
    // TODO: Implement better logic

    OrsonAiProtoResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def batch(version: BigDecimal, accountId: Long, thirdPartyAccountId: Option[String], limit: Option[Int], operations: Option[String], file: Option[TemporaryFile], url: Option[String], callback: Option[String]): OrsonAiBatchResponse = {
    // TODO: Implement better logic

    OrsonAiBatchResponse(None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createInstantEpisode(version: BigDecimal, accountId: Long, data: String): OrsonEpisodeResponse = {
    // TODO: Implement better logic

    OrsonEpisodeResponse(None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createVoiceCanvas(version: BigDecimal, accountId: Long, dimensions: String, thirdPartyAccountId: Option[String], text: Option[String], file: Option[TemporaryFile], url: Option[String], parseFlag: Option[Boolean], fetchFlag: Option[Boolean], callback: Option[String]): OrsonAiVoiceCanvasResponse = {
    // TODO: Implement better logic

    OrsonAiVoiceCanvasResponse(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def emotion(version: BigDecimal, accountId: Long, thirdPartyAccountId: Option[String], file: Option[TemporaryFile], url: Option[String], callback: Option[String]): OrsonAiEmotionsResponse = {
    // TODO: Implement better logic

    OrsonAiEmotionsResponse(None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getAddMovieResult(version: BigDecimal, requestId: String, accountId: Long): OrsonAiAddMovieResponse = {
    // TODO: Implement better logic

    OrsonAiAddMovieResponse(None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getBatch(version: BigDecimal, requestId: String, accountId: Long): OrsonAiBatchResponse = {
    // TODO: Implement better logic

    OrsonAiBatchResponse(None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getEmotion(version: BigDecimal, requestId: String, accountId: Long): OrsonAiEmotionsResponse = {
    // TODO: Implement better logic

    OrsonAiEmotionsResponse(None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getEpisodeStatus(version: BigDecimal, episodeId: Long, accountId: Long): OrsonEpisodeResponse = {
    // TODO: Implement better logic

    OrsonEpisodeResponse(None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getRenderStatus(version: BigDecimal, renderId: String, accountId: Long): OrsonRenderResponse = {
    // TODO: Implement better logic

    OrsonRenderResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getSTT(version: BigDecimal, requestId: String, accountId: Long): OrsonAiSTTResponse = {
    // TODO: Implement better logic

    OrsonAiSTTResponse(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getTTS(version: BigDecimal, requestId: String, accountId: Long): OrsonAiTTSResponse = {
    // TODO: Implement better logic

    OrsonAiTTSResponse(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getTechTune(version: BigDecimal, requestId: String, accountId: Long): OrsonAiTechTuneResponse = {
    // TODO: Implement better logic

    OrsonAiTechTuneResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getTopics(version: BigDecimal, requestId: String, accountId: Long): OrsonAiTopicsResponse = {
    // TODO: Implement better logic

    OrsonAiTopicsResponse(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getVoiceCanvas(version: BigDecimal, requestId: String, accountId: Long): OrsonAiVoiceCanvasResponse = {
    // TODO: Implement better logic

    OrsonAiVoiceCanvasResponse(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def startVideoRender(version: BigDecimal, accountId: Long, data: String): OrsonRenderResponse = {
    // TODO: Implement better logic

    OrsonRenderResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def stt(version: BigDecimal, accountId: Long, thirdPartyAccountId: Option[String], sourceLanguage: Option[String], targetLanguage: Option[String], file: Option[TemporaryFile], url: Option[String], callback: Option[String]): OrsonAiSTTResponse = {
    // TODO: Implement better logic

    OrsonAiSTTResponse(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def summarizeTopics(version: BigDecimal, accountId: Long, thirdPartyAccountId: Option[String], doc: Option[String], file: Option[TemporaryFile], url: Option[String], limit: Option[Int], offset: Option[Int], callback: Option[String]): OrsonAiTopicsResponse = {
    // TODO: Implement better logic

    OrsonAiTopicsResponse(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def techTune(version: BigDecimal, accountId: Long, numFacesExpected: Int, thirdPartyAccountId: Option[String], file: Option[TemporaryFile], url: Option[String], callback: Option[String]): OrsonAiTechTuneResponse = {
    // TODO: Implement better logic

    OrsonAiTechTuneResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def tts(version: BigDecimal, accountId: Long, text: String, thirdPartyAccountId: Option[String], language: Option[String], voice: Option[String], callback: Option[String]): OrsonAiTTSResponse = {
    // TODO: Implement better logic

    OrsonAiTTSResponse(None, None, None, None)
  }
}
