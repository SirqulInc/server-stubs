package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.ProfileResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class TwitterApiController @Inject()(cc: ControllerComponents, api: TwitterApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/twitter/authorize?appKey=[value]
    */
  def authorizeTwitter(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      api.authorizeTwitter(version, appKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/twitter/login?deviceId=[value]&accessToken=[value]&accessTokenSecret=[value]&appKey=[value]&responseFilters=[value]&latitude=[value]&longitude=[value]
    */
  def loginTwitter(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ProfileResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accessToken = request.getQueryString("accessToken")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accessToken", "query string")
        }
        
      val accessTokenSecret = request.getQueryString("accessTokenSecret")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accessTokenSecret", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val responseFilters = request.getQueryString("responseFilters")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("responseFilters", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.loginTwitter(version, accessToken, accessTokenSecret, appKey, responseFilters, deviceId, latitude, longitude)
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
