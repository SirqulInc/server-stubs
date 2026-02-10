package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class ParticipantsApiController @Inject()(cc: ControllerComponents, api: ParticipantsApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/participant/process/all?accountId=[value]&appKey=[value]&useShortNameAsID=[value]
    */
  def processAllParticipants(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        
      val useShortNameAsID = request.getQueryString("useShortNameAsID")
        .map(value => value.toBoolean)
        
      api.processAllParticipants(version, accountId, appKey, useShortNameAsID)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/participant/process?accountId=[value]&league=[value]&appKey=[value]&useShortNameAsID=[value]&file=[value]
    */
  def processParticipants(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.processParticipants(version, accountId, league, appKey, useShortNameAsID, file)
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
