package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.JsObject
import model.RouteSettings

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class RouteSettingApiController @Inject()(cc: ControllerComponents, api: RouteSettingApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/route/setting
    */
  def createRouteSettings(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): RouteSettings = {
      val body = request.body.asJson.map(_.as[RouteSettings])
      api.createRouteSettings(version, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/:version/route/setting/:routeSettingsId
    * @param routeSettingsId the id of the route setting to delete
    */
  def deleteRouteSettings(version: BigDecimal, routeSettingsId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): JsObject = {
      api.deleteRouteSettings(version, routeSettingsId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/route/setting/:routeSettingsId
    * @param routeSettingsId the id of the route settings to get
    */
  def getRouteSettings(version: BigDecimal, routeSettingsId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): RouteSettings = {
      api.getRouteSettings(version, routeSettingsId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/route/setting?hubId=[value]&programId=[value]&keyword=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]
    */
  def searchRouteSettings(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[RouteSettings] = {
      val hubId = request.getQueryString("hubId")
        .map(value => value.toLong)
        
      val programId = request.getQueryString("programId")
        .map(value => value.toLong)
        
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
        
      api.searchRouteSettings(version, sortField, descending, start, limit, activeOnly, hubId, programId, keyword)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /api/:version/route/setting/:routeSettingsId
    * @param routeSettingsId the id of the route settings to update
    */
  def updateRouteSettings(version: BigDecimal, routeSettingsId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): RouteSettings = {
      val body = request.body.asJson.map(_.as[RouteSettings])
      api.updateRouteSettings(version, routeSettingsId, body)
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
