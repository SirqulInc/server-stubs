package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.JsObject
import model.ServiceHub

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class ServiceHubApiController @Inject()(cc: ControllerComponents, api: ServiceHubApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/hub
    */
  def createServiceHub(): Action[AnyContent] = Action { request =>
    def executeApi(): ServiceHub = {
      val body = request.body.asJson.map(_.as[ServiceHub])
      api.createServiceHub(body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/3.18/hub/:id
    * @param id the id of the service hub to delete
    */
  def deleteServiceHub(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.deleteServiceHub(id)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/hub/:id
    * @param id the id of the service hub to get
    */
  def getServiceHub(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): JsObject = {
      api.getServiceHub(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/hub/:id
    * @param id the id of the service hub
    */
  def postServiceHub(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): ServiceHub = {
      val body = request.body.asJson.map(_.as[ServiceHub])
      api.postServiceHub(id, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /api/3.18/hub/:id
    * @param id the id of the service hub
    */
  def putServiceHub(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): ServiceHub = {
      val body = request.body.asJson.map(_.as[ServiceHub])
      api.putServiceHub(id, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/hub?keyword=[value]&retailerId=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]
    */
  def searchServiceHubs(): Action[AnyContent] = Action { request =>
    def executeApi(): List[ServiceHub] = {
      val keyword = request.getQueryString("keyword")
        
      val retailerId = request.getQueryString("retailerId")
        .map(value => value.toLong)
        
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
        
      api.searchServiceHubs(sortField, descending, start, limit, activeOnly, keyword, retailerId)
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
