package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.SirqulResponse
import model.WordzWordResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class WordApiController @Inject()(cc: ControllerComponents, api: WordApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/game/word/create?accountId=[value]&word=[value]&definition=[value]&assetId=[value]&active=[value]&allocateTickets=[value]&ticketCount=[value]&ticketType=[value]&points=[value]
    */
  def createWord(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): WordzWordResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val word = request.getQueryString("word")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("word", "query string")
        }
        
      val definition = request.getQueryString("definition")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("definition", "query string")
        }
        
      val assetId = request.getQueryString("assetId")
        .map(value => value.toLong)
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("active", "query string")
        }
        
      val allocateTickets = request.getQueryString("allocateTickets")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("allocateTickets", "query string")
        }
        
      val ticketCount = request.getQueryString("ticketCount")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ticketCount", "query string")
        }
        
      val ticketType = request.getQueryString("ticketType")
        
      val points = request.getQueryString("points")
        .map(value => value.toLong)
        
      api.createWord(version, accountId, word, definition, active, allocateTickets, ticketCount, assetId, ticketType, points)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/:version/game/word/delete?wordId=[value]&accountId=[value]
    */
  def deleteWord(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val wordId = request.getQueryString("wordId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("wordId", "query string")
        }
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.deleteWord(version, wordId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/game/word/get?wordId=[value]&accountId=[value]
    */
  def getWord(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): WordzWordResponse = {
      val wordId = request.getQueryString("wordId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("wordId", "query string")
        }
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getWord(version, wordId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/game/word/search?accountId=[value]&keyword=[value]&sortField=[value]&descending=[value]&activeOnly=[value]&start=[value]&limit=[value]
    */
  def getWords(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[WordzWordResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val keyword = request.getQueryString("keyword")
        
      val sortField = request.getQueryString("sortField")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("sortField", "query string")
        }
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("descending", "query string")
        }
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("activeOnly", "query string")
        }
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start", "query string")
        }
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("limit", "query string")
        }
        
      api.getWords(version, accountId, sortField, descending, activeOnly, start, limit, keyword)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/game/word/update?wordId=[value]&accountId=[value]&wordText=[value]&definition=[value]&assetId=[value]&active=[value]&allocateTickets=[value]&ticketCount=[value]&ticketType=[value]&points=[value]
    */
  def updateWord(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): WordzWordResponse = {
      val wordId = request.getQueryString("wordId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("wordId", "query string")
        }
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val wordText = request.getQueryString("wordText")
        
      val definition = request.getQueryString("definition")
        
      val assetId = request.getQueryString("assetId")
        .map(value => value.toLong)
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val allocateTickets = request.getQueryString("allocateTickets")
        .map(value => value.toBoolean)
        
      val ticketCount = request.getQueryString("ticketCount")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ticketCount", "query string")
        }
        
      val ticketType = request.getQueryString("ticketType")
        
      val points = request.getQueryString("points")
        .map(value => value.toLong)
        
      api.updateWord(version, wordId, accountId, ticketCount, wordText, definition, assetId, active, allocateTickets, ticketType, points)
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
