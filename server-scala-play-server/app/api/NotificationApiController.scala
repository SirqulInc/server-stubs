package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.BlockedNotificationResponse
import model.NotificationMessageListResponse
import model.NotificationRecipientResponse
import model.NotificationRecipientResponseListResponse
import model.NotificationTemplateResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class NotificationApiController @Inject()(cc: ControllerComponents, api: NotificationApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/notification/template/create?accountId=[value]&appKey=[value]&event=[value]&conduit=[value]&title=[value]&body=[value]&tags=[value]
    */
  def createNotificationTemplate(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): NotificationTemplateResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        
      val event = request.getQueryString("event")
        
      val conduit = request.getQueryString("conduit")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("conduit", "query string")
        }
        
      val title = request.getQueryString("title")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("title", "query string")
        }
        
      val body = request.getQueryString("body")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("body", "query string")
        }
        
      val tags = request.getQueryString("tags")
        
      api.createNotificationTemplate(version, accountId, conduit, title, body, appKey, event, tags)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/notification/blocked/batch?accountId=[value]&appKey=[value]&data=[value]
    */
  def createOrUpdateBlockedNotifications(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): BlockedNotificationResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val data = request.getQueryString("data")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("data", "query string")
        }
        
      api.createOrUpdateBlockedNotifications(version, appKey, data, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/notification/template/delete?accountId=[value]&notificationTemplateId=[value]
    */
  def deleteNotificationTemplate(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): NotificationTemplateResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val notificationTemplateId = request.getQueryString("notificationTemplateId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("notificationTemplateId", "query string")
        }
        
      api.deleteNotificationTemplate(version, accountId, notificationTemplateId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/notification/template/get?accountId=[value]&notificationTemplateId=[value]
    */
  def getNotificationTemplate(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): NotificationTemplateResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val notificationTemplateId = request.getQueryString("notificationTemplateId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("notificationTemplateId", "query string")
        }
        
      api.getNotificationTemplate(version, accountId, notificationTemplateId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/notification/search?deviceId=[value]&accountId=[value]&connectionAccountId=[value]&appKey=[value]&eventType=[value]&contentIds=[value]&contentTypes=[value]&parentIds=[value]&parentTypes=[value]&actionCategory=[value]&conduits=[value]&keyword=[value]&returnReadMessages=[value]&markAsRead=[value]&fromDate=[value]&latitude=[value]&longitude=[value]&returnSent=[value]&ignoreFlagged=[value]&start=[value]&limit=[value]
    */
  def getNotifications(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): NotificationMessageListResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val connectionAccountId = request.getQueryString("connectionAccountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val eventType = request.getQueryString("eventType")
        
      val contentIds = request.getQueryString("contentIds")
        
      val contentTypes = request.getQueryString("contentTypes")
        
      val parentIds = request.getQueryString("parentIds")
        
      val parentTypes = request.getQueryString("parentTypes")
        
      val actionCategory = request.getQueryString("actionCategory")
        
      val conduits = request.getQueryString("conduits")
        
      val keyword = request.getQueryString("keyword")
        
      val returnReadMessages = request.getQueryString("returnReadMessages")
        .map(value => value.toBoolean)
        
      val markAsRead = request.getQueryString("markAsRead")
        .map(value => value.toBoolean)
        
      val fromDate = request.getQueryString("fromDate")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val returnSent = request.getQueryString("returnSent")
        .map(value => value.toBoolean)
        
      val ignoreFlagged = request.getQueryString("ignoreFlagged")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getNotifications(version, deviceId, accountId, connectionAccountId, appKey, eventType, contentIds, contentTypes, parentIds, parentTypes, actionCategory, conduits, keyword, returnReadMessages, markAsRead, fromDate, latitude, longitude, returnSent, ignoreFlagged, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/notification/token?deviceId=[value]&accountId=[value]&token=[value]&pushType=[value]&environment=[value]&appKey=[value]&gameType=[value]&active=[value]&latitude=[value]&longitude=[value]
    */
  def registerNotificationToken(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val token = request.getQueryString("token")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("token", "query string")
        }
        
      val pushType = request.getQueryString("pushType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("pushType", "query string")
        }
        
      val environment = request.getQueryString("environment")
        
      val appKey = request.getQueryString("appKey")
        
      val gameType = request.getQueryString("gameType")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.registerNotificationToken(version, token, pushType, deviceId, accountId, environment, appKey, gameType, active, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/notification/blocked/search?accountId=[value]&appKey=[value]&searchTags=[value]&events=[value]&conduits=[value]&customTypes=[value]&contentTypes=[value]&contentIds=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]
    */
  def searchBlockedNotifications(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): BlockedNotificationResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val searchTags = request.getQueryString("searchTags")
        
      val events = request.getQueryString("events")
        
      val conduits = request.getQueryString("conduits")
        
      val customTypes = request.getQueryString("customTypes")
        
      val contentTypes = request.getQueryString("contentTypes")
        
      val contentIds = request.getQueryString("contentIds")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchBlockedNotifications(version, appKey, accountId, searchTags, events, conduits, customTypes, contentTypes, contentIds, sortField, descending, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/notification/template/search?accountId=[value]&appKey=[value]&event=[value]&conduit=[value]&globalOnly=[value]&reservedOnly=[value]&keyword=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]
    */
  def searchNotificationTemplate(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): NotificationTemplateResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        
      val event = request.getQueryString("event")
        
      val conduit = request.getQueryString("conduit")
        
      val globalOnly = request.getQueryString("globalOnly")
        .map(value => value.toBoolean)
        
      val reservedOnly = request.getQueryString("reservedOnly")
        .map(value => value.toBoolean)
        
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
        
      api.searchNotificationTemplate(version, accountId, sortField, descending, start, limit, appKey, event, conduit, globalOnly, reservedOnly, keyword)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/notification/recipient/search?deviceId=[value]&accountId=[value]&appKey=[value]&conduit=[value]&keyword=[value]&audienceId=[value]&audienceIds=[value]&connectionGroupIds=[value]&recipientAccountIds=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]
    */
  def searchRecipients(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[NotificationRecipientResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val conduit = request.getQueryString("conduit")
        
      val keyword = request.getQueryString("keyword")
        
      val audienceId = request.getQueryString("audienceId")
        .map(value => value.toLong)
        
      val audienceIds = request.getQueryString("audienceIds")
        
      val connectionGroupIds = request.getQueryString("connectionGroupIds")
        
      val recipientAccountIds = request.getQueryString("recipientAccountIds")
        
      val sortField = request.getQueryString("sortField")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("sortField", "query string")
        }
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchRecipients(version, sortField, deviceId, accountId, appKey, conduit, keyword, audienceId, audienceIds, connectionGroupIds, recipientAccountIds, descending, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/notification/recipient/search/count?deviceId=[value]&accountId=[value]&appKey=[value]&conduit=[value]&keyword=[value]&audienceId=[value]&audienceIds=[value]&connectionGroupIds=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]
    */
  def searchRecipientsCount(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): NotificationRecipientResponseListResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val conduit = request.getQueryString("conduit")
        
      val keyword = request.getQueryString("keyword")
        
      val audienceId = request.getQueryString("audienceId")
        .map(value => value.toLong)
        
      val audienceIds = request.getQueryString("audienceIds")
        
      val connectionGroupIds = request.getQueryString("connectionGroupIds")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchRecipientsCount(version, deviceId, accountId, appKey, conduit, keyword, audienceId, audienceIds, connectionGroupIds, sortField, descending, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/notification/batch?accountId=[value]&appKey=[value]&conduit=[value]&customMessage=[value]&contentId=[value]&contentName=[value]&contentType=[value]&parentId=[value]&parentType=[value]
    */
  def sendBatchNotifications(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      val conduit = request.getQueryString("conduit")
        
      val customMessage = request.getQueryString("customMessage")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("customMessage", "query string")
        }
        
      val contentId = request.getQueryString("contentId")
        .map(value => value.toLong)
        
      val contentName = request.getQueryString("contentName")
        
      val contentType = request.getQueryString("contentType")
        
      val parentId = request.getQueryString("parentId")
        .map(value => value.toLong)
        
      val parentType = request.getQueryString("parentType")
        
      api.sendBatchNotifications(version, accountId, appKey, customMessage, conduit, contentId, contentName, contentType, parentId, parentType)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/notification/custom?deviceId=[value]&accountId=[value]&receiverAccountIds=[value]&includeFriendGroup=[value]&appKey=[value]&gameType=[value]&conduit=[value]&contentId=[value]&contentName=[value]&contentType=[value]&parentId=[value]&parentType=[value]&actionCategory=[value]&subject=[value]&customMessage=[value]&friendOnlyAPNS=[value]&latitude=[value]&longitude=[value]
    */
  def sendCustomNotifications(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val receiverAccountIds = request.getQueryString("receiverAccountIds")
        
      val includeFriendGroup = request.getQueryString("includeFriendGroup")
        .map(value => value.toBoolean)
        
      val appKey = request.getQueryString("appKey")
        
      val gameType = request.getQueryString("gameType")
        
      val conduit = request.getQueryString("conduit")
        
      val contentId = request.getQueryString("contentId")
        .map(value => value.toLong)
        
      val contentName = request.getQueryString("contentName")
        
      val contentType = request.getQueryString("contentType")
        
      val parentId = request.getQueryString("parentId")
        .map(value => value.toLong)
        
      val parentType = request.getQueryString("parentType")
        
      val actionCategory = request.getQueryString("actionCategory")
        
      val subject = request.getQueryString("subject")
        
      val customMessage = request.getQueryString("customMessage")
        
      val friendOnlyAPNS = request.getQueryString("friendOnlyAPNS")
        .map(value => value.toBoolean)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.sendCustomNotifications(version, deviceId, accountId, receiverAccountIds, includeFriendGroup, appKey, gameType, conduit, contentId, contentName, contentType, parentId, parentType, actionCategory, subject, customMessage, friendOnlyAPNS, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/notification/template/update?accountId=[value]&notificationTemplateId=[value]&title=[value]&body=[value]&tags=[value]
    */
  def updateNotificationTemplate(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): NotificationTemplateResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val notificationTemplateId = request.getQueryString("notificationTemplateId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("notificationTemplateId", "query string")
        }
        
      val title = request.getQueryString("title")
        
      val body = request.getQueryString("body")
        
      val tags = request.getQueryString("tags")
        
      api.updateNotificationTemplate(version, accountId, notificationTemplateId, title, body, tags)
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
