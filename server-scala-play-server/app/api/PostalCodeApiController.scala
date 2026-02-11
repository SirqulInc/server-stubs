package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.PostalCodeResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class PostalCodeApiController @Inject()(cc: ControllerComponents, api: PostalCodeApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/postalCode/create?accountId=[value]&code=[value]&latitude=[value]&longitude=[value]&stateCode=[value]&city=[value]&active=[value]
    */
  def createPostalCode(): Action[AnyContent] = Action { request =>
    def executeApi(): PostalCodeResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val code = request.getQueryString("code")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("code", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("latitude", "query string")
        }
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("longitude", "query string")
        }
        
      val stateCode = request.getQueryString("stateCode")
        
      val city = request.getQueryString("city")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      api.createPostalCode(accountId, code, latitude, longitude, stateCode, city, active)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/postalCode/delete?accountId=[value]&postalCodeId=[value]
    */
  def deletePostalCode(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val postalCodeId = request.getQueryString("postalCodeId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("postalCodeId", "query string")
        }
        
      api.deletePostalCode(accountId, postalCodeId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/postalCode/get?postalCodeId=[value]
    */
  def getPostalCode(): Action[AnyContent] = Action { request =>
    def executeApi(): PostalCodeResponse = {
      val postalCodeId = request.getQueryString("postalCodeId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("postalCodeId", "query string")
        }
        
      api.getPostalCode(postalCodeId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/postalCode/search?latitude=[value]&longitude=[value]&keyword=[value]&miles=[value]&start=[value]&limit=[value]&sortField=[value]&descending=[value]
    */
  def getPostalCodes(): Action[AnyContent] = Action { request =>
    def executeApi(): List[PostalCodeResponse] = {
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val keyword = request.getQueryString("keyword")
        
      val miles = request.getQueryString("miles")
        .map(value => value.toDouble)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val sortField = request.getQueryString("sortField")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("sortField", "query string")
        }
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("descending", "query string")
        }
        
      api.getPostalCodes(sortField, descending, latitude, longitude, keyword, miles, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/postalCode/update?accountId=[value]&postalCodeId=[value]&code=[value]&latitude=[value]&longitude=[value]&stateCode=[value]&city=[value]&active=[value]
    */
  def updatePostalCode(): Action[AnyContent] = Action { request =>
    def executeApi(): PostalCodeResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val postalCodeId = request.getQueryString("postalCodeId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("postalCodeId", "query string")
        }
        
      val code = request.getQueryString("code")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val stateCode = request.getQueryString("stateCode")
        
      val city = request.getQueryString("city")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      api.updatePostalCode(accountId, postalCodeId, code, latitude, longitude, stateCode, city, active)
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
