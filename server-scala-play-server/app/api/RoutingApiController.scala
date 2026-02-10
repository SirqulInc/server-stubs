package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.RoutingListResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class RoutingApiController @Inject()(cc: ControllerComponents, api: RoutingApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/routing/compute?data=[value]
    */
  def computeRouting(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): RoutingListResponse = {
      val data = request.getQueryString("data")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("data", "query string")
        }
        
      api.computeRouting(version, data)
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
