package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ActivityResponse
import model.BigDecimal
import model.EntityReference

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class ActivityApiController @Inject()(cc: ControllerComponents, api: ActivityApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/entity/reference
    */
  def createEntityReference(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ActivityResponse = {
      val body = request.body.asJson.map(_.as[EntityReference]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "body")
      }
      api.createEntityReference(version, body)
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
