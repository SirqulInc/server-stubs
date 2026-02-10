package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.Stop

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class StopApiController @Inject()(cc: ControllerComponents, api: StopApi) extends AbstractController(cc) {
  /**
    * GET /api/:version/stop/:id
    * @param id the id of the stop to get
    */
  def getStop(version: BigDecimal, id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Stop = {
      api.getStop(version, id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /api/:version/stop/:id
    * @param id the id of the stop to update
    */
  def updateStop(version: BigDecimal, id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Stop = {
      val body = request.body.asJson.map(_.as[Stop])
      api.updateStop(version, id, body)
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
