package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.WrappedProxyItemResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class OpenAIApiController @Inject()(cc: ControllerComponents, api: OpenAIApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/openai/v1/images/generations?accountId=[value]&postBody=[value]&returnRawResponse=[value]
    */
  def imageGeneration(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): WrappedProxyItemResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val postBody = request.getQueryString("postBody")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("postBody", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.imageGeneration(version, accountId, postBody, returnRawResponse)
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
