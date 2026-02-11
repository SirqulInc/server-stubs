package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ProfileResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class TwitterApiController @Inject()(cc: ControllerComponents, api: TwitterApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/twitter/authorize?appKey=[value]
    */
  def authorizeTwitter(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      api.authorizeTwitter(appKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/twitter/login?deviceId=[value]&accessToken=[value]&accessTokenSecret=[value]&appKey=[value]&responseFilters=[value]&latitude=[value]&longitude=[value]
    */
  def loginTwitter(): Action[AnyContent] = Action { request =>
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
        
      api.loginTwitter(accessToken, accessTokenSecret, appKey, responseFilters, deviceId, latitude, longitude)
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
