package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.SirqulResponse
import model.TriggerResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class TriggerApiController @Inject()(cc: ControllerComponents, api: TriggerApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/trigger/create?accountId=[value]&name=[value]&appKey=[value]&groupingId=[value]&endpointURL=[value]&payload=[value]&scheduledDate=[value]&startDate=[value]&endDate=[value]&cronExpression=[value]&conditionalInput=[value]&visibility=[value]&active=[value]
    */
  def createTrigger(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): TriggerResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val name = request.getQueryString("name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("name", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        
      val groupingId = request.getQueryString("groupingId")
        
      val endpointURL = request.getQueryString("endpointURL")
        
      val payload = request.getQueryString("payload")
        
      val scheduledDate = request.getQueryString("scheduledDate")
        .map(value => value.toLong)
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val cronExpression = request.getQueryString("cronExpression")
        
      val conditionalInput = request.getQueryString("conditionalInput")
        
      val visibility = request.getQueryString("visibility")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      api.createTrigger(version, accountId, name, appKey, groupingId, endpointURL, payload, scheduledDate, startDate, endDate, cronExpression, conditionalInput, visibility, active)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/trigger/delete?accountId=[value]&triggerId=[value]
    */
  def deleteTrigger(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val triggerId = request.getQueryString("triggerId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("triggerId", "query string")
        }
        
      api.deleteTrigger(version, accountId, triggerId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/trigger/get?accountId=[value]&triggerId=[value]
    */
  def getTrigger(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): TriggerResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val triggerId = request.getQueryString("triggerId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("triggerId", "query string")
        }
        
      api.getTrigger(version, accountId, triggerId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/trigger/search?accountId=[value]&groupingId=[value]&filter=[value]&statuses=[value]&templateTypes=[value]&appKey=[value]&keyword=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]
    */
  def searchTriggers(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[TriggerResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val groupingId = request.getQueryString("groupingId")
        
      val filter = request.getQueryString("filter")
        
      val statuses = request.getQueryString("statuses")
        
      val templateTypes = request.getQueryString("templateTypes")
        
      val appKey = request.getQueryString("appKey")
        
      val keyword = request.getQueryString("keyword")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        
      api.searchTriggers(version, accountId, groupingId, filter, statuses, templateTypes, appKey, keyword, sortField, descending, start, limit, activeOnly)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/trigger/update?triggerId=[value]&accountId=[value]&name=[value]&appKey=[value]&groupingId=[value]&endpointURL=[value]&payload=[value]&scheduledDate=[value]&startDate=[value]&endDate=[value]&cronExpression=[value]&conditionalInput=[value]&visibility=[value]&active=[value]
    */
  def updateTrigger(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): TriggerResponse = {
      val triggerId = request.getQueryString("triggerId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("triggerId", "query string")
        }
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val name = request.getQueryString("name")
        
      val appKey = request.getQueryString("appKey")
        
      val groupingId = request.getQueryString("groupingId")
        
      val endpointURL = request.getQueryString("endpointURL")
        
      val payload = request.getQueryString("payload")
        
      val scheduledDate = request.getQueryString("scheduledDate")
        .map(value => value.toLong)
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val cronExpression = request.getQueryString("cronExpression")
        
      val conditionalInput = request.getQueryString("conditionalInput")
        
      val visibility = request.getQueryString("visibility")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      api.updateTrigger(version, triggerId, accountId, name, appKey, groupingId, endpointURL, payload, scheduledDate, startDate, endDate, cronExpression, conditionalInput, visibility, active)
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
