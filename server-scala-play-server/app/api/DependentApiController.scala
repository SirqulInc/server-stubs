package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Account
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class DependentApiController @Inject()(cc: ControllerComponents, api: DependentApi) extends AbstractController(cc) {
  /**
    * PUT /api/3.18/cargo/dependent/:accountId
    * @param accountId the id of the parent account to create a dependent for
    */
  def create(accountId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val body = request.body.asJson.map(_.as[Account])
      api.create(accountId, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/cargo/dependent/:accountId
    * @param accountId the id of the parent account to get a list of dependents
    */
  def getDependents(accountId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      api.getDependents(accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/3.18/cargo/dependent/:accountId
    * @param accountId the id of the parent account tied to the dependent
    * @param dependentId the id of the dependent to delete
    */
  def removeDependent(accountId: Long, dependentId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.removeDependent(accountId, dependentId)
    }

    executeApi()
    Ok
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
