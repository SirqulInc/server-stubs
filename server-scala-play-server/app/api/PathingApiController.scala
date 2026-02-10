package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.PathingResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class PathingApiController @Inject()(cc: ControllerComponents, api: PathingApi) extends AbstractController(cc) {
  /**
    * GET /api/:version/pathing/compute?data=[value]&units=[value]&reducePath=[value]&directions=[value]
    */
  def computePath(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): PathingResponse = {
      val data = request.getQueryString("data")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("data", "query string")
        }
        
      val units = request.getQueryString("units")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("units", "query string")
        }
        
      val reducePath = request.getQueryString("reducePath")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("reducePath", "query string")
        }
        
      val directions = request.getQueryString("directions")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("directions", "query string")
        }
        
      api.computePath(version, data, units, reducePath, directions)
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
