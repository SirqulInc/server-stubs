package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Location
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class LocationApiV2ApiController @Inject()(cc: ControllerComponents, api: LocationApiV2Api) extends AbstractController(cc) {
  /**
    * POST /api/3.18/location
    */
  def createLocationV2(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val body = request.body.asJson.map(_.as[Location])
      api.createLocationV2(body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/location/:id
    * @param id the id of the location to update
    */
  def updateLocationV2(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val body = request.body.asJson.map(_.as[Location])
      api.updateLocationV2(id, body)
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
