package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AccountMiniResponse
import model.AssignmentResponse
import model.AssignmentStatusResponse
import model.BigDecimal
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class AssignmentApiController @Inject()(cc: ControllerComponents, api: AssignmentApi) extends AbstractController(cc) {
  /**
    * GET /api/:version/assignment/assignee/search?accountId=[value]&keyword=[value]
    */
  def assigmentAssigneeAccountSearch(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[AccountMiniResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val keyword = request.getQueryString("keyword")
        
      api.assigmentAssigneeAccountSearch(version, accountId, keyword)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/assignment/create?accountId=[value]&name=[value]&description=[value]&assigneeAccountId=[value]&retailerLocationId=[value]&tags=[value]&active=[value]
    */
  def assignmentCreate(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AssignmentResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val name = request.getQueryString("name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("name", "query string")
        }
        
      val description = request.getQueryString("description")
        
      val assigneeAccountId = request.getQueryString("assigneeAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("assigneeAccountId", "query string")
        }
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        
      val tags = request.getQueryString("tags")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      api.assignmentCreate(version, accountId, name, assigneeAccountId, description, retailerLocationId, tags, active)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/assignment/delete?accountId=[value]&assignmentId=[value]
    */
  def assignmentDelete(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val assignmentId = request.getQueryString("assignmentId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("assignmentId", "query string")
        }
        
      api.assignmentDelete(version, accountId, assignmentId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/assignment/get?accountId=[value]&assignmentId=[value]
    */
  def assignmentGet(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AssignmentResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val assignmentId = request.getQueryString("assignmentId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("assignmentId", "query string")
        }
        
      api.assignmentGet(version, accountId, assignmentId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/assignment/search?accountId=[value]&creatorAccountId=[value]&assigneeAccountIds=[value]&retailerLocationIds=[value]&currentStatusType=[value]&keyword=[value]&sortField=[value]&descending=[value]&activeOnly=[value]&start=[value]&limit=[value]
    */
  def assignmentSearch(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[AssignmentResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val creatorAccountId = request.getQueryString("creatorAccountId")
        .map(value => value.toLong)
        
      val assigneeAccountIds = request.getQueryString("assigneeAccountIds")
        
      val retailerLocationIds = request.getQueryString("retailerLocationIds")
        
      val currentStatusType = request.getQueryString("currentStatusType")
        
      val keyword = request.getQueryString("keyword")
        
      val sortField = request.getQueryString("sortField")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("sortField", "query string")
        }
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("descending", "query string")
        }
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("activeOnly", "query string")
        }
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start", "query string")
        }
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("limit", "query string")
        }
        
      api.assignmentSearch(version, accountId, sortField, descending, activeOnly, start, limit, creatorAccountId, assigneeAccountIds, retailerLocationIds, currentStatusType, keyword)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/assignment/status/create?accountId=[value]&assignmentId=[value]&scheduledNotificationId=[value]&toDo=[value]&connection=[value]&method=[value]&status=[value]&closure=[value]&message=[value]&followUp=[value]&active=[value]
    */
  def assignmentStatusCreate(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AssignmentStatusResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val assignmentId = request.getQueryString("assignmentId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("assignmentId", "query string")
        }
        
      val scheduledNotificationId = request.getQueryString("scheduledNotificationId")
        .map(value => value.toLong)
        
      val toDo = request.getQueryString("toDo")
        
      val connection = request.getQueryString("connection")
        
      val method = request.getQueryString("method")
        
      val status = request.getQueryString("status")
        
      val closure = request.getQueryString("closure")
        
      val message = request.getQueryString("message")
        
      val followUp = request.getQueryString("followUp")
        .map(value => value.toLong)
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      api.assignmentStatusCreate(version, accountId, assignmentId, scheduledNotificationId, toDo, connection, method, status, closure, message, followUp, active)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/assignment/status/delete?accountId=[value]&assignmentStatusId=[value]
    */
  def assignmentStatusDelete(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val assignmentStatusId = request.getQueryString("assignmentStatusId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("assignmentStatusId", "query string")
        }
        
      api.assignmentStatusDelete(version, accountId, assignmentStatusId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/assignment/status/get?accountId=[value]&assignmentStatusId=[value]
    */
  def assignmentStatusGet(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AssignmentStatusResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val assignmentStatusId = request.getQueryString("assignmentStatusId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("assignmentStatusId", "query string")
        }
        
      api.assignmentStatusGet(version, accountId, assignmentStatusId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/assignment/status/search?accountId=[value]&assignmentId=[value]&creatorAccountId=[value]&assigneeAccountId=[value]&retailerLocationId=[value]&statusType=[value]&keyword=[value]&sortField=[value]&descending=[value]&activeOnly=[value]&start=[value]&limit=[value]
    */
  def assignmentStatusSearch(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[AssignmentStatusResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val assignmentId = request.getQueryString("assignmentId")
        .map(value => value.toLong)
        
      val creatorAccountId = request.getQueryString("creatorAccountId")
        .map(value => value.toLong)
        
      val assigneeAccountId = request.getQueryString("assigneeAccountId")
        .map(value => value.toLong)
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        
      val statusType = request.getQueryString("statusType")
        
      val keyword = request.getQueryString("keyword")
        
      val sortField = request.getQueryString("sortField")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("sortField", "query string")
        }
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("descending", "query string")
        }
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("activeOnly", "query string")
        }
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start", "query string")
        }
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("limit", "query string")
        }
        
      api.assignmentStatusSearch(version, accountId, sortField, descending, activeOnly, start, limit, assignmentId, creatorAccountId, assigneeAccountId, retailerLocationId, statusType, keyword)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/assignment/status/update?accountId=[value]&assignmentStatusId=[value]&scheduledNotificationId=[value]&toDo=[value]&connection=[value]&method=[value]&status=[value]&closure=[value]&message=[value]&followUp=[value]&active=[value]
    */
  def assignmentStatusUpdate(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AssignmentStatusResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val assignmentStatusId = request.getQueryString("assignmentStatusId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("assignmentStatusId", "query string")
        }
        
      val scheduledNotificationId = request.getQueryString("scheduledNotificationId")
        .map(value => value.toLong)
        
      val toDo = request.getQueryString("toDo")
        
      val connection = request.getQueryString("connection")
        
      val method = request.getQueryString("method")
        
      val status = request.getQueryString("status")
        
      val closure = request.getQueryString("closure")
        
      val message = request.getQueryString("message")
        
      val followUp = request.getQueryString("followUp")
        .map(value => value.toLong)
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      api.assignmentStatusUpdate(version, accountId, assignmentStatusId, scheduledNotificationId, toDo, connection, method, status, closure, message, followUp, active)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/assignment/update?accountId=[value]&assignmentId=[value]&name=[value]&description=[value]&assigneeAccountId=[value]&retailerLocationId=[value]&tags=[value]&active=[value]
    */
  def assignmentUpdate(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AssignmentResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val assignmentId = request.getQueryString("assignmentId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("assignmentId", "query string")
        }
        
      val name = request.getQueryString("name")
        
      val description = request.getQueryString("description")
        
      val assigneeAccountId = request.getQueryString("assigneeAccountId")
        .map(value => value.toLong)
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        
      val tags = request.getQueryString("tags")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      api.assignmentUpdate(version, accountId, assignmentId, name, description, assigneeAccountId, retailerLocationId, tags, active)
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
