package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
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

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class OrsonApiController @Inject()(cc: ControllerComponents, api: OrsonApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/orson/ai/addMovie?accountId=[value]&thirdPartyAccountId=[value]&tags=[value]&movieName=[value]&file=[value]&url=[value]&callback=[value]
    */
  def addMovie(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiAddMovieResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val thirdPartyAccountId = request.getQueryString("thirdPartyAccountId")
        
      val tags = request.getQueryString("tags")
        
      val movieName = request.getQueryString("movieName")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("movieName", "query string")
        }
        
      val file = request.getQueryString("file")
        
      val url = request.getQueryString("url")
        
      val callback = request.getQueryString("callback")
        
      api.addMovie(version, accountId, movieName, thirdPartyAccountId, tags, file, url, callback)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/orson/ai/docs?accountId=[value]&doc=[value]&returnTopics=[value]&limit=[value]&offset=[value]
    */
  def aiDocs(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiProtoResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val doc = request.getQueryString("doc")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("doc", "query string")
        }
        
      val returnTopics = request.getQueryString("return_topics")
        .map(value => value.toBoolean)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      api.aiDocs(version, accountId, doc, returnTopics, limit, offset)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/orson/ai/img?accountId=[value]&text=[value]&parseFlag=[value]&fetchFlag=[value]&size=[value]
    */
  def aiFindImages(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiProtoResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val text = request.getQueryString("text")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("text", "query string")
        }
        
      val parseFlag = request.getQueryString("parse_flag")
        
      val fetchFlag = request.getQueryString("fetch_flag")
        
      val size = request.getQueryString("size")
        
      api.aiFindImages(version, accountId, text, parseFlag, fetchFlag, size)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/orson/ai/tags?accountId=[value]&tags=[value]&conditional=[value]&limit=[value]&offset=[value]
    */
  def aiTags(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiProtoResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val tags = request.getQueryString("tags")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("tags", "query string")
        }
        
      val conditional = request.getQueryString("conditional")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      api.aiTags(version, accountId, tags, conditional, limit, offset)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/orson/ai/text?accountId=[value]&terms=[value]&conditional=[value]&limit=[value]&offset=[value]
    */
  def aiText(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiProtoResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val terms = request.getQueryString("terms")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("terms", "query string")
        }
        
      val conditional = request.getQueryString("conditional")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      api.aiText(version, accountId, terms, conditional, limit, offset)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/orson/ai/batch?accountId=[value]&thirdPartyAccountId=[value]&limit=[value]&operations=[value]&file=[value]&url=[value]&callback=[value]
    */
  def batch(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiBatchResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val thirdPartyAccountId = request.getQueryString("thirdPartyAccountId")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val operations = request.getQueryString("operations")
        
      val file = request.getQueryString("file")
        
      val url = request.getQueryString("url")
        
      val callback = request.getQueryString("callback")
        
      api.batch(version, accountId, thirdPartyAccountId, limit, operations, file, url, callback)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/orson/stories/episodes/instant?accountId=[value]&data=[value]
    */
  def createInstantEpisode(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonEpisodeResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val data = request.getQueryString("data")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("data", "query string")
        }
        
      api.createInstantEpisode(version, accountId, data)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/orson/ai/voiceCanvas?accountId=[value]&thirdPartyAccountId=[value]&dimensions=[value]&text=[value]&file=[value]&url=[value]&parseFlag=[value]&fetchFlag=[value]&callback=[value]
    */
  def createVoiceCanvas(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiVoiceCanvasResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val thirdPartyAccountId = request.getQueryString("thirdPartyAccountId")
        
      val dimensions = request.getQueryString("dimensions")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("dimensions", "query string")
        }
        
      val text = request.getQueryString("text")
        
      val file = request.getQueryString("file")
        
      val url = request.getQueryString("url")
        
      val parseFlag = request.getQueryString("parseFlag")
        .map(value => value.toBoolean)
        
      val fetchFlag = request.getQueryString("fetchFlag")
        .map(value => value.toBoolean)
        
      val callback = request.getQueryString("callback")
        
      api.createVoiceCanvas(version, accountId, dimensions, thirdPartyAccountId, text, file, url, parseFlag, fetchFlag, callback)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/orson/ai/emotion?accountId=[value]&thirdPartyAccountId=[value]&file=[value]&url=[value]&callback=[value]
    */
  def emotion(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiEmotionsResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val thirdPartyAccountId = request.getQueryString("thirdPartyAccountId")
        
      val file = request.getQueryString("file")
        
      val url = request.getQueryString("url")
        
      val callback = request.getQueryString("callback")
        
      api.emotion(version, accountId, thirdPartyAccountId, file, url, callback)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/orson/ai/addMovie/:requestId?accountId=[value]
    * @param requestId Orson Request Id
    */
  def getAddMovieResult(version: BigDecimal, requestId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiAddMovieResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getAddMovieResult(version, requestId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/orson/ai/batch/:requestId?accountId=[value]
    * @param requestId Orson Request Id
    */
  def getBatch(version: BigDecimal, requestId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiBatchResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getBatch(version, requestId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/orson/ai/emotion/:requestId?accountId=[value]
    * @param requestId Orson Request Id
    */
  def getEmotion(version: BigDecimal, requestId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiEmotionsResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getEmotion(version, requestId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/orson/stories/episodes/:episodeId/status?accountId=[value]
    * @param episodeId Episode ID
    */
  def getEpisodeStatus(version: BigDecimal, episodeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonEpisodeResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getEpisodeStatus(version, episodeId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/orson/stories/renders/:renderId/status?accountId=[value]
    * @param renderId Render ID
    */
  def getRenderStatus(version: BigDecimal, renderId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonRenderResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getRenderStatus(version, renderId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/orson/ai/stt/:requestId?accountId=[value]
    * @param requestId Orson Request Id
    */
  def getSTT(version: BigDecimal, requestId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiSTTResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getSTT(version, requestId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/orson/ai/tts/:requestId?accountId=[value]
    * @param requestId Orson Request Id
    */
  def getTTS(version: BigDecimal, requestId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiTTSResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getTTS(version, requestId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/orson/ai/techTune/:requestId?accountId=[value]
    * @param requestId Orson Request Id
    */
  def getTechTune(version: BigDecimal, requestId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiTechTuneResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getTechTune(version, requestId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/orson/ai/topics/:requestId?accountId=[value]
    * @param requestId Orson Request Id
    */
  def getTopics(version: BigDecimal, requestId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiTopicsResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getTopics(version, requestId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/orson/ai/voiceCanvas/:requestId?accountId=[value]
    * @param requestId Orson Request Id
    */
  def getVoiceCanvas(version: BigDecimal, requestId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiVoiceCanvasResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getVoiceCanvas(version, requestId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/orson/stories/renders?accountId=[value]&data=[value]
    */
  def startVideoRender(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonRenderResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val data = request.getQueryString("data")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("data", "query string")
        }
        
      api.startVideoRender(version, accountId, data)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/orson/ai/stt?accountId=[value]&thirdPartyAccountId=[value]&sourceLanguage=[value]&targetLanguage=[value]&file=[value]&url=[value]&callback=[value]
    */
  def stt(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiSTTResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val thirdPartyAccountId = request.getQueryString("thirdPartyAccountId")
        
      val sourceLanguage = request.getQueryString("sourceLanguage")
        
      val targetLanguage = request.getQueryString("targetLanguage")
        
      val file = request.getQueryString("file")
        
      val url = request.getQueryString("url")
        
      val callback = request.getQueryString("callback")
        
      api.stt(version, accountId, thirdPartyAccountId, sourceLanguage, targetLanguage, file, url, callback)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/orson/ai/topics?accountId=[value]&thirdPartyAccountId=[value]&doc=[value]&file=[value]&url=[value]&limit=[value]&offset=[value]&callback=[value]
    */
  def summarizeTopics(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiTopicsResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val thirdPartyAccountId = request.getQueryString("thirdPartyAccountId")
        
      val doc = request.getQueryString("doc")
        
      val file = request.getQueryString("file")
        
      val url = request.getQueryString("url")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val callback = request.getQueryString("callback")
        
      api.summarizeTopics(version, accountId, thirdPartyAccountId, doc, file, url, limit, offset, callback)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/orson/ai/techTune?accountId=[value]&thirdPartyAccountId=[value]&numFacesExpected=[value]&file=[value]&url=[value]&callback=[value]
    */
  def techTune(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiTechTuneResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val thirdPartyAccountId = request.getQueryString("thirdPartyAccountId")
        
      val numFacesExpected = request.getQueryString("numFacesExpected")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("numFacesExpected", "query string")
        }
        
      val file = request.getQueryString("file")
        
      val url = request.getQueryString("url")
        
      val callback = request.getQueryString("callback")
        
      api.techTune(version, accountId, numFacesExpected, thirdPartyAccountId, file, url, callback)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/orson/ai/tts?accountId=[value]&thirdPartyAccountId=[value]&text=[value]&language=[value]&voice=[value]&callback=[value]
    */
  def tts(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiTTSResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val thirdPartyAccountId = request.getQueryString("thirdPartyAccountId")
        
      val text = request.getQueryString("text")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("text", "query string")
        }
        
      val language = request.getQueryString("language")
        
      val voice = request.getQueryString("voice")
        
      val callback = request.getQueryString("callback")
        
      api.tts(version, accountId, text, thirdPartyAccountId, language, voice, callback)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
