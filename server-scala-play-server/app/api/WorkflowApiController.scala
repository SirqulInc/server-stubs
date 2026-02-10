package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class WorkflowApiController @Inject()(cc: ControllerComponents, api: WorkflowApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/workflow/run?accountId=[value]&workflowId=[value]&skuId=[value]&versionCode=[value]&parameters=[value]
    */
  def runWorkflow(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val workflowId = request.getQueryString("workflowId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("workflowId", "query string")
        }
        
      val skuId = request.getQueryString("skuId")
        .map(value => value.toLong)
        
      val versionCode = request.getQueryString("versionCode")
        .map(value => value.toInt)
        
      val parameters = request.getQueryString("parameters")
        
      api.runWorkflow(version, accountId, workflowId, skuId, versionCode, parameters)
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
