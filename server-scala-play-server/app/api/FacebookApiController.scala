package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.SirqulResponse
import model.TokenResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class FacebookApiController @Inject()(cc: ControllerComponents, api: FacebookApi) extends AbstractController(cc) {
  /**
    * GET /api/:version/facebook/getfbtoken?deviceId=[value]&accountId=[value]&latitude=[value]&longitude=[value]
    */
  def getToken(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): TokenResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.getToken(version, deviceId, accountId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/facebook/graph?deviceId=[value]&accountId=[value]&event=[value]&permissionableType=[value]&permissionableId=[value]&assetId=[value]&gameType=[value]&appKey=[value]&latitude=[value]&longitude=[value]
    */
  def graphInterface(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val event = request.getQueryString("event")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("event", "query string")
        }
        
      val permissionableType = request.getQueryString("permissionableType")
        
      val permissionableId = request.getQueryString("permissionableId")
        .map(value => value.toLong)
        
      val assetId = request.getQueryString("assetId")
        .map(value => value.toLong)
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.graphInterface(version, event, deviceId, accountId, permissionableType, permissionableId, assetId, gameType, appKey, latitude, longitude)
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
