package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ApplicationConfigResponse
import model.BigDecimal
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class ApplicationConfigApiController @Inject()(cc: ControllerComponents, api: ApplicationConfigApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/appconfig/create?accountId=[value]&appKey=[value]&configVersion=[value]&assetId=[value]&retailerId=[value]&retailerLocationId=[value]&udid=[value]
    */
  def createApplicationConfig(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ApplicationConfigResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val configVersion = request.getQueryString("configVersion")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("configVersion", "query string")
        }
        
      val assetId = request.getQueryString("assetId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("assetId", "query string")
        }
        
      val retailerId = request.getQueryString("retailerId")
        .map(value => value.toLong)
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        
      val udid = request.getQueryString("udid")
        
      api.createApplicationConfig(version, accountId, appKey, configVersion, assetId, retailerId, retailerLocationId, udid)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/appconfig/delete?accountId=[value]&configId=[value]
    */
  def deleteApplicationConfig(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val configId = request.getQueryString("configId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("configId", "query string")
        }
        
      api.deleteApplicationConfig(version, accountId, configId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/appconfig/get?accountId=[value]&configId=[value]
    */
  def getApplicationConfig(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ApplicationConfigResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val configId = request.getQueryString("configId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("configId", "query string")
        }
        
      api.getApplicationConfig(version, accountId, configId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/appconfig/getbyversion?appKey=[value]&configVersion=[value]&retailerId=[value]&retailerLocationId=[value]&udid=[value]&allowOlderVersions=[value]
    */
  def getApplicationConfigByConfigVersion(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ApplicationConfigResponse = {
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val configVersion = request.getQueryString("configVersion")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("configVersion", "query string")
        }
        
      val retailerId = request.getQueryString("retailerId")
        .map(value => value.toLong)
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        
      val udid = request.getQueryString("udid")
        
      val allowOlderVersions = request.getQueryString("allowOlderVersions")
        .map(value => value.toBoolean)
        
      api.getApplicationConfigByConfigVersion(version, appKey, configVersion, retailerId, retailerLocationId, udid, allowOlderVersions)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/appconfig/search?accountId=[value]&appKey=[value]&retailerId=[value]&retailerLocationId=[value]&udid=[value]&configVersion=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]
    */
  def searchApplicationConfig(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[ApplicationConfigResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        
      val retailerId = request.getQueryString("retailerId")
        .map(value => value.toLong)
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        
      val udid = request.getQueryString("udid")
        
      val configVersion = request.getQueryString("configVersion")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchApplicationConfig(version, accountId, appKey, retailerId, retailerLocationId, udid, configVersion, sortField, descending, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/appconfig/update?accountId=[value]&configId=[value]&appKey=[value]&configVersion=[value]&assetId=[value]&retailerId=[value]&retailerLocationId=[value]&udid=[value]
    */
  def updateApplicationConfig(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ApplicationConfigResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val configId = request.getQueryString("configId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("configId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        
      val configVersion = request.getQueryString("configVersion")
        
      val assetId = request.getQueryString("assetId")
        .map(value => value.toLong)
        
      val retailerId = request.getQueryString("retailerId")
        .map(value => value.toLong)
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        
      val udid = request.getQueryString("udid")
        
      api.updateApplicationConfig(version, accountId, configId, appKey, configVersion, assetId, retailerId, retailerLocationId, udid)
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
