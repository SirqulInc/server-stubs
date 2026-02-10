package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.QuestionResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class QuestionApiController @Inject()(cc: ControllerComponents, api: QuestionApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/game/question/create?accountId=[value]&question=[value]&answers=[value]&tags=[value]&videoURL=[value]&assetId=[value]&active=[value]&allocateTickets=[value]&ticketCount=[value]&ticketType=[value]&points=[value]
    */
  def createQuestion(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): QuestionResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val question = request.getQueryString("question")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("question", "query string")
        }
        
      val answers = request.getQueryString("answers")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("answers", "query string")
        }
        
      val tags = request.getQueryString("tags")
        
      val videoURL = request.getQueryString("videoURL")
        
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
        
      api.createQuestion(version, accountId, question, answers, active, allocateTickets, ticketCount, tags, videoURL, assetId, ticketType, points)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/game/question/delete?questionId=[value]&accountId=[value]
    */
  def deleteQuestion(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val questionId = request.getQueryString("questionId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("questionId", "query string")
        }
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.deleteQuestion(version, questionId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/game/question/get?questionId=[value]&accountId=[value]
    */
  def getQuestion(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): QuestionResponse = {
      val questionId = request.getQueryString("questionId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("questionId", "query string")
        }
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getQuestion(version, questionId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/game/question/search?accountId=[value]&keyword=[value]&sortField=[value]&descending=[value]&activeOnly=[value]&start=[value]&limit=[value]
    */
  def searchQuestions(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[QuestionResponse] = {
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
        
      api.searchQuestions(version, accountId, sortField, descending, activeOnly, start, limit, keyword)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/game/question/update?questionId=[value]&accountId=[value]&question=[value]&answers=[value]&tags=[value]&videoURL=[value]&assetId=[value]&active=[value]&allocateTickets=[value]&ticketCount=[value]&ticketType=[value]&points=[value]
    */
  def updateQuestion(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): QuestionResponse = {
      val questionId = request.getQueryString("questionId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("questionId", "query string")
        }
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val question = request.getQueryString("question")
        
      val answers = request.getQueryString("answers")
        
      val tags = request.getQueryString("tags")
        
      val videoURL = request.getQueryString("videoURL")
        
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
        
      api.updateQuestion(version, questionId, accountId, ticketCount, question, answers, tags, videoURL, assetId, active, allocateTickets, ticketType, points)
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
