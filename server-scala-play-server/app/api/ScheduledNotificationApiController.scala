package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.ScheduledNotificationFullResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class ScheduledNotificationApiController @Inject()(cc: ControllerComponents, api: ScheduledNotificationApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/notification/schedule/create?accountId=[value]&name=[value]&`type`=[value]&message=[value]&contentId=[value]&contentName=[value]&contentType=[value]&parentId=[value]&parentType=[value]&appKey=[value]&groupingId=[value]&connectionGroupIds=[value]&connectionAccountIds=[value]&audienceId=[value]&audienceIds=[value]&albumIds=[value]&reportId=[value]&reportParams=[value]&endpointURL=[value]&payload=[value]&scheduledDate=[value]&startDate=[value]&endDate=[value]&cronExpression=[value]&cronType=[value]&metaData=[value]&conditionalInput=[value]&templateType=[value]&visibility=[value]&active=[value]&sendNow=[value]&eventType=[value]&deepLinkURI=[value]&sendToAll=[value]
    */
  def createScheduledNotification(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ScheduledNotificationFullResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val name = request.getQueryString("name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("name", "query string")
        }
        
      val `type` = request.getQueryString("type")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("type", "query string")
        }
        
      val message = request.getQueryString("message")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("message", "query string")
        }
        
      val contentId = request.getQueryString("contentId")
        .map(value => value.toLong)
        
      val contentName = request.getQueryString("contentName")
        
      val contentType = request.getQueryString("contentType")
        
      val parentId = request.getQueryString("parentId")
        .map(value => value.toLong)
        
      val parentType = request.getQueryString("parentType")
        
      val appKey = request.getQueryString("appKey")
        
      val groupingId = request.getQueryString("groupingId")
        
      val connectionGroupIds = request.getQueryString("connectionGroupIds")
        
      val connectionAccountIds = request.getQueryString("connectionAccountIds")
        
      val audienceId = request.getQueryString("audienceId")
        .map(value => value.toLong)
        
      val audienceIds = request.getQueryString("audienceIds")
        
      val albumIds = request.getQueryString("albumIds")
        
      val reportId = request.getQueryString("reportId")
        .map(value => value.toLong)
        
      val reportParams = request.getQueryString("reportParams")
        
      val endpointURL = request.getQueryString("endpointURL")
        
      val payload = request.getQueryString("payload")
        
      val scheduledDate = request.getQueryString("scheduledDate")
        .map(value => value.toLong)
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val cronExpression = request.getQueryString("cronExpression")
        
      val cronType = request.getQueryString("cronType")
        
      val metaData = request.getQueryString("metaData")
        
      val conditionalInput = request.getQueryString("conditionalInput")
        
      val templateType = request.getQueryString("templateType")
        
      val visibility = request.getQueryString("visibility")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val sendNow = request.getQueryString("sendNow")
        .map(value => value.toBoolean)
        
      val eventType = request.getQueryString("eventType")
        
      val deepLinkURI = request.getQueryString("deepLinkURI")
        
      val sendToAll = request.getQueryString("sendToAll")
        .map(value => value.toBoolean)
        
      api.createScheduledNotification(version, accountId, name, `type`, message, contentId, contentName, contentType, parentId, parentType, appKey, groupingId, connectionGroupIds, connectionAccountIds, audienceId, audienceIds, albumIds, reportId, reportParams, endpointURL, payload, scheduledDate, startDate, endDate, cronExpression, cronType, metaData, conditionalInput, templateType, visibility, active, sendNow, eventType, deepLinkURI, sendToAll)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/notification/schedule/delete?accountId=[value]&scheduledNotificationId=[value]&deleteByGroupingId=[value]
    */
  def deleteScheduledNotification(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ScheduledNotificationFullResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val scheduledNotificationId = request.getQueryString("scheduledNotificationId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("scheduledNotificationId", "query string")
        }
        
      val deleteByGroupingId = request.getQueryString("deleteByGroupingId")
        .map(value => value.toBoolean)
        
      api.deleteScheduledNotification(version, accountId, scheduledNotificationId, deleteByGroupingId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/notification/schedule/get?accountId=[value]&scheduledNotificationId=[value]
    */
  def getScheduledNotification(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ScheduledNotificationFullResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val scheduledNotificationId = request.getQueryString("scheduledNotificationId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("scheduledNotificationId", "query string")
        }
        
      api.getScheduledNotification(version, accountId, scheduledNotificationId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/notification/schedule/generate?accountId=[value]&appKey=[value]&reportName=[value]&reportParams=[value]&message=[value]&offset=[value]&`type`=[value]&recipientReportId=[value]
    */
  def scheduleNotificationListings(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val reportName = request.getQueryString("reportName")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("reportName", "query string")
        }
        
      val reportParams = request.getQueryString("reportParams")
        
      val message = request.getQueryString("message")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("message", "query string")
        }
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("offset", "query string")
        }
        
      val `type` = request.getQueryString("type")
        
      val recipientReportId = request.getQueryString("recipientReportId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("recipientReportId", "query string")
        }
        
      api.scheduleNotificationListings(version, accountId, appKey, reportName, message, offset, recipientReportId, reportParams, `type`)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/notification/schedule/search?accountId=[value]&groupingId=[value]&audienceId=[value]&filter=[value]&types=[value]&contentIds=[value]&contentTypes=[value]&parentIds=[value]&parentTypes=[value]&statuses=[value]&templateTypes=[value]&appKey=[value]&keyword=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]&groupByGroupingId=[value]&returnAudienceAccountCount=[value]
    */
  def searchScheduledNotifications(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ScheduledNotificationFullResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val groupingId = request.getQueryString("groupingId")
        
      val audienceId = request.getQueryString("audienceId")
        .map(value => value.toLong)
        
      val filter = request.getQueryString("filter")
        
      val types = request.getQueryString("types")
        
      val contentIds = request.getQueryString("contentIds")
        
      val contentTypes = request.getQueryString("contentTypes")
        
      val parentIds = request.getQueryString("parentIds")
        
      val parentTypes = request.getQueryString("parentTypes")
        
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
        
      val groupByGroupingId = request.getQueryString("groupByGroupingId")
        .map(value => value.toBoolean)
        
      val returnAudienceAccountCount = request.getQueryString("returnAudienceAccountCount")
        .map(value => value.toBoolean)
        
      api.searchScheduledNotifications(version, accountId, groupingId, audienceId, filter, types, contentIds, contentTypes, parentIds, parentTypes, statuses, templateTypes, appKey, keyword, sortField, descending, start, limit, activeOnly, groupByGroupingId, returnAudienceAccountCount)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/notification/schedule/update?scheduledNotificationId=[value]&accountId=[value]&name=[value]&`type`=[value]&message=[value]&payload=[value]&contentId=[value]&contentName=[value]&contentType=[value]&parentId=[value]&parentType=[value]&appKey=[value]&groupingId=[value]&connectionGroupIds=[value]&connectionAccountIds=[value]&audienceId=[value]&audienceIds=[value]&albumIds=[value]&reportId=[value]&reportParams=[value]&endpointURL=[value]&scheduledDate=[value]&startDate=[value]&endDate=[value]&cronExpression=[value]&cronType=[value]&metaData=[value]&conditionalInput=[value]&templateType=[value]&visibility=[value]&active=[value]&errorMessage=[value]&status=[value]&updateByGroupingId=[value]&sendNow=[value]&eventType=[value]&deepLinkURI=[value]&sendToAll=[value]
    */
  def updateScheduledNotification(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ScheduledNotificationFullResponse = {
      val scheduledNotificationId = request.getQueryString("scheduledNotificationId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("scheduledNotificationId", "query string")
        }
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val name = request.getQueryString("name")
        
      val `type` = request.getQueryString("type")
        
      val message = request.getQueryString("message")
        
      val payload = request.getQueryString("payload")
        
      val contentId = request.getQueryString("contentId")
        .map(value => value.toLong)
        
      val contentName = request.getQueryString("contentName")
        
      val contentType = request.getQueryString("contentType")
        
      val parentId = request.getQueryString("parentId")
        .map(value => value.toLong)
        
      val parentType = request.getQueryString("parentType")
        
      val appKey = request.getQueryString("appKey")
        
      val groupingId = request.getQueryString("groupingId")
        
      val connectionGroupIds = request.getQueryString("connectionGroupIds")
        
      val connectionAccountIds = request.getQueryString("connectionAccountIds")
        
      val audienceId = request.getQueryString("audienceId")
        .map(value => value.toLong)
        
      val audienceIds = request.getQueryString("audienceIds")
        
      val albumIds = request.getQueryString("albumIds")
        
      val reportId = request.getQueryString("reportId")
        .map(value => value.toLong)
        
      val reportParams = request.getQueryString("reportParams")
        
      val endpointURL = request.getQueryString("endpointURL")
        
      val scheduledDate = request.getQueryString("scheduledDate")
        .map(value => value.toLong)
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val cronExpression = request.getQueryString("cronExpression")
        
      val cronType = request.getQueryString("cronType")
        
      val metaData = request.getQueryString("metaData")
        
      val conditionalInput = request.getQueryString("conditionalInput")
        
      val templateType = request.getQueryString("templateType")
        
      val visibility = request.getQueryString("visibility")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val errorMessage = request.getQueryString("errorMessage")
        
      val status = request.getQueryString("status")
        
      val updateByGroupingId = request.getQueryString("updateByGroupingId")
        .map(value => value.toBoolean)
        
      val sendNow = request.getQueryString("sendNow")
        .map(value => value.toBoolean)
        
      val eventType = request.getQueryString("eventType")
        
      val deepLinkURI = request.getQueryString("deepLinkURI")
        
      val sendToAll = request.getQueryString("sendToAll")
        .map(value => value.toBoolean)
        
      api.updateScheduledNotification(version, scheduledNotificationId, accountId, name, `type`, message, payload, contentId, contentName, contentType, parentId, parentType, appKey, groupingId, connectionGroupIds, connectionAccountIds, audienceId, audienceIds, albumIds, reportId, reportParams, endpointURL, scheduledDate, startDate, endDate, cronExpression, cronType, metaData, conditionalInput, templateType, visibility, active, errorMessage, status, updateByGroupingId, sendNow, eventType, deepLinkURI, sendToAll)
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
