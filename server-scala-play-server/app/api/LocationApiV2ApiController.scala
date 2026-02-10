package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.Location
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class LocationApiV2ApiController @Inject()(cc: ControllerComponents, api: LocationApiV2Api) extends AbstractController(cc) {
  /**
    * POST /api/:version/location
    */
  def createLocationV2(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val body = request.body.asJson.map(_.as[Location])
      api.createLocationV2(version, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/location/:id
    * @param id the id of the location to update
    */
  def updateLocationV2(version: BigDecimal, id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val body = request.body.asJson.map(_.as[Location])
      api.updateLocationV2(version, id, body)
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
