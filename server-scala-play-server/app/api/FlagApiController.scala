package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.CountResponse
import model.FlagResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class FlagApiController @Inject()(cc: ControllerComponents, api: FlagApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/flag/create?deviceId=[value]&accountId=[value]&flagableType=[value]&flagableId=[value]&flagDescription=[value]&latitude=[value]&longitude=[value]
    */
  def createFlag(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val flagableType = request.getQueryString("flagableType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("flagableType", "query string")
        }
        
      val flagableId = request.getQueryString("flagableId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("flagableId", "query string")
        }
        
      val flagDescription = request.getQueryString("flagDescription")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.createFlag(version, flagableType, flagableId, deviceId, accountId, flagDescription, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/flag/delete?deviceId=[value]&accountId=[value]&itemBeingFlaggedType=[value]&itemBeingFlaggedId=[value]&flagableType=[value]&flagableId=[value]
    */
  def deleteFlag(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val itemBeingFlaggedType = request.getQueryString("itemBeingFlaggedType")
        
      val itemBeingFlaggedId = request.getQueryString("itemBeingFlaggedId")
        .map(value => value.toLong)
        
      val flagableType = request.getQueryString("flagableType")
        
      val flagableId = request.getQueryString("flagableId")
        .map(value => value.toLong)
        
      api.deleteFlag(version, deviceId, accountId, itemBeingFlaggedType, itemBeingFlaggedId, flagableType, flagableId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/flag/get?deviceId=[value]&accountId=[value]&flagableType=[value]&flagableId=[value]&latitude=[value]&longitude=[value]
    */
  def getFlag(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): FlagResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val flagableType = request.getQueryString("flagableType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("flagableType", "query string")
        }
        
      val flagableId = request.getQueryString("flagableId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("flagableId", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.getFlag(version, flagableType, flagableId, deviceId, accountId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/flag/threshold/get?itemBeingFlaggedType=[value]&appKey=[value]
    */
  def getFlagThreshold(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): CountResponse = {
      val itemBeingFlaggedType = request.getQueryString("itemBeingFlaggedType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("itemBeingFlaggedType", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      api.getFlagThreshold(version, itemBeingFlaggedType, appKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/flag/threshold/update?deviceId=[value]&accountId=[value]&itemBeingFlaggedType=[value]&threshold=[value]&appKey=[value]
    */
  def updateFlagThreshold(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): CountResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val itemBeingFlaggedType = request.getQueryString("itemBeingFlaggedType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("itemBeingFlaggedType", "query string")
        }
        
      val threshold = request.getQueryString("threshold")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("threshold", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      api.updateFlagThreshold(version, itemBeingFlaggedType, threshold, appKey, deviceId, accountId)
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
