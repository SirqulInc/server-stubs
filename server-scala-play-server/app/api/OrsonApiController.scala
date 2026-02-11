package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
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

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class OrsonApiController @Inject()(cc: ControllerComponents, api: OrsonApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/orson/ai/addMovie?accountId=[value]&thirdPartyAccountId=[value]&tags=[value]&movieName=[value]&file=[value]&url=[value]&callback=[value]
    */
  def addMovie(): Action[AnyContent] = Action { request =>
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
        
      api.addMovie(accountId, movieName, thirdPartyAccountId, tags, file, url, callback)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/orson/ai/docs?accountId=[value]&doc=[value]&returnTopics=[value]&limit=[value]&offset=[value]
    */
  def aiDocs(): Action[AnyContent] = Action { request =>
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
        
      api.aiDocs(accountId, doc, returnTopics, limit, offset)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/orson/ai/img?accountId=[value]&text=[value]&parseFlag=[value]&fetchFlag=[value]&size=[value]
    */
  def aiFindImages(): Action[AnyContent] = Action { request =>
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
        
      api.aiFindImages(accountId, text, parseFlag, fetchFlag, size)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/orson/ai/tags?accountId=[value]&tags=[value]&conditional=[value]&limit=[value]&offset=[value]
    */
  def aiTags(): Action[AnyContent] = Action { request =>
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
        
      api.aiTags(accountId, tags, conditional, limit, offset)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/orson/ai/text?accountId=[value]&terms=[value]&conditional=[value]&limit=[value]&offset=[value]
    */
  def aiText(): Action[AnyContent] = Action { request =>
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
        
      api.aiText(accountId, terms, conditional, limit, offset)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/orson/ai/batch?accountId=[value]&thirdPartyAccountId=[value]&limit=[value]&operations=[value]&file=[value]&url=[value]&callback=[value]
    */
  def batch(): Action[AnyContent] = Action { request =>
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
        
      api.batch(accountId, thirdPartyAccountId, limit, operations, file, url, callback)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/orson/stories/episodes/instant?accountId=[value]&data=[value]
    */
  def createInstantEpisode(): Action[AnyContent] = Action { request =>
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
        
      api.createInstantEpisode(accountId, data)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/orson/ai/voiceCanvas?accountId=[value]&thirdPartyAccountId=[value]&dimensions=[value]&text=[value]&file=[value]&url=[value]&parseFlag=[value]&fetchFlag=[value]&callback=[value]
    */
  def createVoiceCanvas(): Action[AnyContent] = Action { request =>
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
        
      api.createVoiceCanvas(accountId, dimensions, thirdPartyAccountId, text, file, url, parseFlag, fetchFlag, callback)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/orson/ai/emotion?accountId=[value]&thirdPartyAccountId=[value]&file=[value]&url=[value]&callback=[value]
    */
  def emotion(): Action[AnyContent] = Action { request =>
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
        
      api.emotion(accountId, thirdPartyAccountId, file, url, callback)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/orson/ai/addMovie/:requestId?accountId=[value]
    * @param requestId Orson Request Id
    */
  def getAddMovieResult(requestId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiAddMovieResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getAddMovieResult(requestId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/orson/ai/batch/:requestId?accountId=[value]
    * @param requestId Orson Request Id
    */
  def getBatch(requestId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiBatchResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getBatch(requestId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/orson/ai/emotion/:requestId?accountId=[value]
    * @param requestId Orson Request Id
    */
  def getEmotion(requestId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiEmotionsResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getEmotion(requestId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/orson/stories/episodes/:episodeId/status?accountId=[value]
    * @param episodeId Episode ID
    */
  def getEpisodeStatus(episodeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonEpisodeResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getEpisodeStatus(episodeId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/orson/stories/renders/:renderId/status?accountId=[value]
    * @param renderId Render ID
    */
  def getRenderStatus(renderId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonRenderResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getRenderStatus(renderId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/orson/ai/stt/:requestId?accountId=[value]
    * @param requestId Orson Request Id
    */
  def getSTT(requestId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiSTTResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getSTT(requestId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/orson/ai/tts/:requestId?accountId=[value]
    * @param requestId Orson Request Id
    */
  def getTTS(requestId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiTTSResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getTTS(requestId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/orson/ai/techTune/:requestId?accountId=[value]
    * @param requestId Orson Request Id
    */
  def getTechTune(requestId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiTechTuneResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getTechTune(requestId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/orson/ai/topics/:requestId?accountId=[value]
    * @param requestId Orson Request Id
    */
  def getTopics(requestId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiTopicsResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getTopics(requestId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/orson/ai/voiceCanvas/:requestId?accountId=[value]
    * @param requestId Orson Request Id
    */
  def getVoiceCanvas(requestId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrsonAiVoiceCanvasResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getVoiceCanvas(requestId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/orson/stories/renders?accountId=[value]&data=[value]
    */
  def startVideoRender(): Action[AnyContent] = Action { request =>
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
        
      api.startVideoRender(accountId, data)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/orson/ai/stt?accountId=[value]&thirdPartyAccountId=[value]&sourceLanguage=[value]&targetLanguage=[value]&file=[value]&url=[value]&callback=[value]
    */
  def stt(): Action[AnyContent] = Action { request =>
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
        
      api.stt(accountId, thirdPartyAccountId, sourceLanguage, targetLanguage, file, url, callback)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/orson/ai/topics?accountId=[value]&thirdPartyAccountId=[value]&doc=[value]&file=[value]&url=[value]&limit=[value]&offset=[value]&callback=[value]
    */
  def summarizeTopics(): Action[AnyContent] = Action { request =>
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
        
      api.summarizeTopics(accountId, thirdPartyAccountId, doc, file, url, limit, offset, callback)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/orson/ai/techTune?accountId=[value]&thirdPartyAccountId=[value]&numFacesExpected=[value]&file=[value]&url=[value]&callback=[value]
    */
  def techTune(): Action[AnyContent] = Action { request =>
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
        
      api.techTune(accountId, numFacesExpected, thirdPartyAccountId, file, url, callback)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/orson/ai/tts?accountId=[value]&thirdPartyAccountId=[value]&text=[value]&language=[value]&voice=[value]&callback=[value]
    */
  def tts(): Action[AnyContent] = Action { request =>
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
        
      api.tts(accountId, text, thirdPartyAccountId, language, voice, callback)
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
