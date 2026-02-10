package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.OfferTransactionStatusResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class OfferStatusApiController @Inject()(cc: ControllerComponents, api: OfferStatusApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/offer/status/create?deviceId=[value]&accountId=[value]&latitude=[value]&longitude=[value]&name=[value]&description=[value]&code=[value]&role=[value]&active=[value]&applicationIds=[value]
    */
  def createOfferTransactionStatus(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OfferTransactionStatusResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val name = request.getQueryString("name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("name", "query string")
        }
        
      val description = request.getQueryString("description")
        
      val code = request.getQueryString("code")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("code", "query string")
        }
        
      val role = request.getQueryString("role")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val applicationIds = request.getQueryString("applicationIds")
        
      api.createOfferTransactionStatus(version, name, code, deviceId, accountId, latitude, longitude, description, role, active, applicationIds)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/offer/status/delete?deviceId=[value]&accountId=[value]&latitude=[value]&longitude=[value]&statusId=[value]
    */
  def deleteOfferTransactionStatus(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val statusId = request.getQueryString("statusId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("statusId", "query string")
        }
        
      api.deleteOfferTransactionStatus(version, statusId, deviceId, accountId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/offer/status/get?deviceId=[value]&accountId=[value]&latitude=[value]&longitude=[value]&statusId=[value]
    */
  def getOfferTransactionStatus(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OfferTransactionStatusResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val statusId = request.getQueryString("statusId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("statusId", "query string")
        }
        
      api.getOfferTransactionStatus(version, statusId, deviceId, accountId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/offer/status/search?deviceId=[value]&accountId=[value]&latitude=[value]&longitude=[value]&keyword=[value]&role=[value]&appKey=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&includeInactive=[value]
    */
  def searchOfferTransactionStatuses(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[OfferTransactionStatusResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val keyword = request.getQueryString("keyword")
        
      val role = request.getQueryString("role")
        
      val appKey = request.getQueryString("appKey")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val includeInactive = request.getQueryString("includeInactive")
        .map(value => value.toBoolean)
        
      api.searchOfferTransactionStatuses(version, deviceId, accountId, latitude, longitude, keyword, role, appKey, sortField, descending, start, limit, includeInactive)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/offer/status/update?deviceId=[value]&accountId=[value]&latitude=[value]&longitude=[value]&statusId=[value]&name=[value]&description=[value]&code=[value]&role=[value]&active=[value]&applicationIds=[value]
    */
  def updateOfferTransactionStatus(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OfferTransactionStatusResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val statusId = request.getQueryString("statusId")
        .map(value => value.toLong)
        
      val name = request.getQueryString("name")
        
      val description = request.getQueryString("description")
        
      val code = request.getQueryString("code")
        .map(value => value.toInt)
        
      val role = request.getQueryString("role")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val applicationIds = request.getQueryString("applicationIds")
        
      api.updateOfferTransactionStatus(version, deviceId, accountId, latitude, longitude, statusId, name, description, code, role, active, applicationIds)
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
