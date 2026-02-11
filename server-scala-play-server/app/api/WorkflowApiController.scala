package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class WorkflowApiController @Inject()(cc: ControllerComponents, api: WorkflowApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/workflow/run?accountId=[value]&workflowId=[value]&skuId=[value]&versionCode=[value]&parameters=[value]
    */
  def runWorkflow(): Action[AnyContent] = Action { request =>
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
        
      api.runWorkflow(accountId, workflowId, skuId, versionCode, parameters)
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
