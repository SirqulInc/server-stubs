package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.Program

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class ProgramApiController @Inject()(cc: ControllerComponents, api: ProgramApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/program
    */
  def createProgram(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): Program = {
      val body = request.body.asJson.map(_.as[Program])
      api.createProgram(version, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/:version/program/:id
    * @param id the id of the program
    */
  def deleteProgram(version: BigDecimal, id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.deleteProgram(version, id)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/program/:id
    * @param id the id of the program
    */
  def getProgram(version: BigDecimal, id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Program = {
      api.getProgram(version, id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/program/:id
    * @param id the id of the program
    */
  def postProgram(version: BigDecimal, id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Program = {
      val body = request.body.asJson.map(_.as[Program])
      api.postProgram(version, id, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /api/:version/program/:id
    * @param id the id of the program
    */
  def putProgram(version: BigDecimal, id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Program = {
      val body = request.body.asJson.map(_.as[Program])
      api.putProgram(version, id, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/program?keyword=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]
    */
  def searchPrograms(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[Program] = {
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
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("activeOnly", "query string")
        }
        
      api.searchPrograms(version, sortField, descending, start, limit, activeOnly, keyword)
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
