package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class ParticipantsApiController @Inject()(cc: ControllerComponents, api: ParticipantsApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/participant/process/all?accountId=[value]&appKey=[value]&useShortNameAsID=[value]
    */
  def processAllParticipants(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        
      val useShortNameAsID = request.getQueryString("useShortNameAsID")
        .map(value => value.toBoolean)
        
      api.processAllParticipants(accountId, appKey, useShortNameAsID)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/participant/process?accountId=[value]&league=[value]&appKey=[value]&useShortNameAsID=[value]&file=[value]
    */
  def processParticipants(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val league = request.getQueryString("league")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("league", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        
      val useShortNameAsID = request.getQueryString("useShortNameAsID")
        .map(value => value.toBoolean)
        
      val file = request.getQueryString("file")
        
      api.processParticipants(accountId, league, appKey, useShortNameAsID, file)
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
