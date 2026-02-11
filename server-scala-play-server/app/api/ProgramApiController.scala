package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Program

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class ProgramApiController @Inject()(cc: ControllerComponents, api: ProgramApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/program
    */
  def createProgram(): Action[AnyContent] = Action { request =>
    def executeApi(): Program = {
      val body = request.body.asJson.map(_.as[Program])
      api.createProgram(body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/3.18/program/:id
    * @param id the id of the program
    */
  def deleteProgram(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.deleteProgram(id)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/program/:id
    * @param id the id of the program
    */
  def getProgram(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Program = {
      api.getProgram(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/program/:id
    * @param id the id of the program
    */
  def postProgram(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Program = {
      val body = request.body.asJson.map(_.as[Program])
      api.postProgram(id, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /api/3.18/program/:id
    * @param id the id of the program
    */
  def putProgram(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Program = {
      val body = request.body.asJson.map(_.as[Program])
      api.putProgram(id, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/program?keyword=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]
    */
  def searchPrograms(): Action[AnyContent] = Action { request =>
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
        
      api.searchPrograms(sortField, descending, start, limit, activeOnly, keyword)
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
