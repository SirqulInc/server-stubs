package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.ConnectionGroupResponse
import model.ConnectionInfoResponse
import model.ConnectionListResponse
import model.ConnectionResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class ConnectionApiController @Inject()(cc: ControllerComponents, api: ConnectionApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/consumer/connection/group/addConnection?returnNulls=[value]&deviceId=[value]&accountId=[value]&connectionId=[value]&connectionAccountId=[value]&pendingId=[value]&groupId=[value]&latitude=[value]&longitude=[value]
    */
  def addConnectionToGroup(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val returnNulls = request.getQueryString("returnNulls")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("returnNulls", "query string")
        }
        
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val connectionId = request.getQueryString("connectionId")
        .map(value => value.toLong)
        
      val connectionAccountId = request.getQueryString("connectionAccountId")
        .map(value => value.toLong)
        
      val pendingId = request.getQueryString("pendingId")
        .map(value => value.toLong)
        
      val groupId = request.getQueryString("groupId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("groupId", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.addConnectionToGroup(version, returnNulls, groupId, deviceId, accountId, connectionId, connectionAccountId, pendingId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/connection/group/addConnections?deviceId=[value]&accountId=[value]&connectionIds=[value]&connectionAccountIds=[value]&connectionGroupId=[value]&latitude=[value]&longitude=[value]
    */
  def addConnectionsToGroup(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val connectionIds = request.getQueryString("connectionIds")
        
      val connectionAccountIds = request.getQueryString("connectionAccountIds")
        
      val connectionGroupId = request.getQueryString("connectionGroupId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("connectionGroupId", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.addConnectionsToGroup(version, connectionGroupId, deviceId, accountId, connectionIds, connectionAccountIds, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/consumer/connection/group/addSubGroup?returnNulls=[value]&deviceId=[value]&accountId=[value]&groupId=[value]&subGroupIds=[value]&latitude=[value]&longitude=[value]
    */
  def addSubGroups(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ConnectionGroupResponse = {
      val returnNulls = request.getQueryString("returnNulls")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("returnNulls", "query string")
        }
        
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val groupId = request.getQueryString("groupId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("groupId", "query string")
        }
        
      val subGroupIds = request.getQueryString("subGroupIds")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("subGroupIds", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.addSubGroups(version, returnNulls, groupId, subGroupIds, deviceId, accountId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/consumer/connection/add?deviceId=[value]&accountId=[value]&connectionId=[value]&connectionAccountId=[value]&pendingId=[value]&groupId=[value]&gameType=[value]&appKey=[value]&isTrusted=[value]&ignoreFriendRequest=[value]&isContact=[value]&isBlocked=[value]&isFollowing=[value]&connectionResponse=[value]
    */
  def createOrUpdateConnection(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ConnectionResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val connectionId = request.getQueryString("connectionId")
        .map(value => value.toLong)
        
      val connectionAccountId = request.getQueryString("connectionAccountId")
        .map(value => value.toLong)
        
      val pendingId = request.getQueryString("pendingId")
        .map(value => value.toLong)
        
      val groupId = request.getQueryString("groupId")
        .map(value => value.toLong)
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val isTrusted = request.getQueryString("isTrusted")
        .map(value => value.toBoolean)
        
      val ignoreFriendRequest = request.getQueryString("ignoreFriendRequest")
        .map(value => value.toBoolean)
        
      val isContact = request.getQueryString("isContact")
        .map(value => value.toBoolean)
        
      val isBlocked = request.getQueryString("isBlocked")
        .map(value => value.toBoolean)
        
      val isFollowing = request.getQueryString("isFollowing")
        .map(value => value.toBoolean)
        
      val connectionResponse = request.getQueryString("connectionResponse")
        .map(value => value.toBoolean)
        
      api.createOrUpdateConnection(version, deviceId, accountId, connectionId, connectionAccountId, pendingId, groupId, gameType, appKey, isTrusted, ignoreFriendRequest, isContact, isBlocked, isFollowing, connectionResponse)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/consumer/connection/group?returnNulls=[value]&deviceId=[value]&accountId=[value]&name=[value]&groupId=[value]&assetId=[value]&connections=[value]&description=[value]&canViewProfileInfo=[value]&canViewGameInfo=[value]&canViewFriendInfo=[value]&active=[value]&latitude=[value]&longitude=[value]
    */
  def createOrUpdateGroup(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val returnNulls = request.getQueryString("returnNulls")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("returnNulls", "query string")
        }
        
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val name = request.getQueryString("name")
        
      val groupId = request.getQueryString("groupId")
        .map(value => value.toLong)
        
      val assetId = request.getQueryString("assetId")
        .map(value => value.toLong)
        
      val connections = request.getQueryString("connections")
        
      val description = request.getQueryString("description")
        
      val canViewProfileInfo = request.getQueryString("canViewProfileInfo")
        .map(value => value.toBoolean)
        
      val canViewGameInfo = request.getQueryString("canViewGameInfo")
        .map(value => value.toBoolean)
        
      val canViewFriendInfo = request.getQueryString("canViewFriendInfo")
        .map(value => value.toBoolean)
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.createOrUpdateGroup(version, returnNulls, deviceId, accountId, name, groupId, assetId, connections, description, canViewProfileInfo, canViewGameInfo, canViewFriendInfo, active, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/consumer/follow/accept?accountId=[value]&connectionAccountId=[value]&appKey=[value]
    */
  def followAccept(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val connectionAccountId = request.getQueryString("connectionAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("connectionAccountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      api.followAccept(version, accountId, connectionAccountId, appKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/consumer/follow/reject?accountId=[value]&connectionAccountId=[value]&appKey=[value]
    */
  def followReject(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val connectionAccountId = request.getQueryString("connectionAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("connectionAccountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      api.followReject(version, accountId, connectionAccountId, appKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/consumer/follow/remove?accountId=[value]&connectionAccountId=[value]&appKey=[value]
    */
  def followRemove(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val connectionAccountId = request.getQueryString("connectionAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("connectionAccountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      api.followRemove(version, accountId, connectionAccountId, appKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/consumer/follow/request?accountId=[value]&connectionAccountId=[value]&appKey=[value]&approvalNeeded=[value]
    */
  def followRequest(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val connectionAccountId = request.getQueryString("connectionAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("connectionAccountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val approvalNeeded = request.getQueryString("approvalNeeded")
        .map(value => value.toBoolean)
        
      api.followRequest(version, accountId, connectionAccountId, appKey, approvalNeeded)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/consumer/friend/accept?deviceId=[value]&accountId=[value]&friendAccountId=[value]&gameType=[value]&appKey=[value]&notifyFriend=[value]&notificationMessage=[value]
    */
  def friendAccept(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val friendAccountId = request.getQueryString("friendAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("friendAccountId", "query string")
        }
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val notifyFriend = request.getQueryString("notifyFriend")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("notifyFriend", "query string")
        }
        
      val notificationMessage = request.getQueryString("notificationMessage")
        
      api.friendAccept(version, friendAccountId, notifyFriend, deviceId, accountId, gameType, appKey, notificationMessage)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/consumer/friend/reject?deviceId=[value]&accountId=[value]&friendAccountId=[value]&gameType=[value]&appKey=[value]&notifyFriend=[value]&notificationMessage=[value]
    */
  def friendReject(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val friendAccountId = request.getQueryString("friendAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("friendAccountId", "query string")
        }
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val notifyFriend = request.getQueryString("notifyFriend")
        .map(value => value.toBoolean)
        
      val notificationMessage = request.getQueryString("notificationMessage")
        
      api.friendReject(version, friendAccountId, deviceId, accountId, gameType, appKey, notifyFriend, notificationMessage)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/consumer/friend/remove?deviceId=[value]&accountId=[value]&friendAccountId=[value]&notifyFriend=[value]&removeFromGroups=[value]
    */
  def friendRemove(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val friendAccountId = request.getQueryString("friendAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("friendAccountId", "query string")
        }
        
      val notifyFriend = request.getQueryString("notifyFriend")
        .map(value => value.toBoolean)
        
      val removeFromGroups = request.getQueryString("removeFromGroups")
        .map(value => value.toBoolean)
        
      api.friendRemove(version, friendAccountId, deviceId, accountId, notifyFriend, removeFromGroups)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/consumer/friend/request?deviceId=[value]&accountId=[value]&friendAccountId=[value]&gameType=[value]&appKey=[value]&notificationMessage=[value]
    */
  def friendRequest(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val friendAccountId = request.getQueryString("friendAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("friendAccountId", "query string")
        }
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val notificationMessage = request.getQueryString("notificationMessage")
        
      api.friendRequest(version, friendAccountId, deviceId, accountId, gameType, appKey, notificationMessage)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/consumer/connection/getRequested?deviceId=[value]&accountId=[value]
    */
  def getConnectionSentFriendRequests(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ConnectionListResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      api.getConnectionSentFriendRequests(version, deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/consumer/connection/get?returnNulls=[value]&deviceId=[value]&accountId=[value]&connectionAccountId=[value]&filter=[value]&q=[value]&keyword=[value]&sortField=[value]&descending=[value]&i=[value]&start=[value]&l=[value]&limit=[value]&latitude=[value]&longitude=[value]
    */
  def getConnections(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ConnectionListResponse = {
      val returnNulls = request.getQueryString("returnNulls")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("returnNulls", "query string")
        }
        
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val connectionAccountId = request.getQueryString("connectionAccountId")
        .map(value => value.toLong)
        
      val filter = request.getQueryString("filter")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("filter", "query string")
        }
        
      val q = request.getQueryString("q")
        
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
        
      val i = request.getQueryString("_i")
        .map(value => value.toInt)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start", "query string")
        }
        
      val l = request.getQueryString("_l")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("limit", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.getConnections(version, returnNulls, filter, sortField, descending, start, limit, deviceId, accountId, connectionAccountId, q, keyword, i, l, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/consumer/connection/group/details/get?deviceId=[value]&accountId=[value]&groupId=[value]&combineConnections=[value]&latitude=[value]&longitude=[value]
    */
  def getGroupDetails(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ConnectionGroupResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val groupId = request.getQueryString("groupId")
        .map(value => value.toLong)
        
      val combineConnections = request.getQueryString("combineConnections")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("combineConnections", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.getGroupDetails(version, combineConnections, deviceId, accountId, groupId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/connection/group/search?deviceId=[value]&accountId=[value]&latitude=[value]&longitude=[value]&keyword=[value]&sortField=[value]&descending=[value]&activeOnly=[value]&start=[value]&limit=[value]
    */
  def groupSearch(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[ConnectionInfoResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
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
        
      api.groupSearch(version, sortField, descending, activeOnly, start, limit, deviceId, accountId, latitude, longitude, keyword)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/consumer/connection/group/removeConnection?returnNulls=[value]&deviceId=[value]&accountId=[value]&connectionId=[value]&connectionAccountId=[value]&pendingId=[value]&groupId=[value]&latitude=[value]&longitude=[value]
    */
  def removeConnectionFromGroup(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val returnNulls = request.getQueryString("returnNulls")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("returnNulls", "query string")
        }
        
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val connectionId = request.getQueryString("connectionId")
        .map(value => value.toLong)
        
      val connectionAccountId = request.getQueryString("connectionAccountId")
        .map(value => value.toLong)
        
      val pendingId = request.getQueryString("pendingId")
        .map(value => value.toLong)
        
      val groupId = request.getQueryString("groupId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("groupId", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.removeConnectionFromGroup(version, returnNulls, groupId, deviceId, accountId, connectionId, connectionAccountId, pendingId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/connection/group/removeConnections?deviceId=[value]&accountId=[value]&connectionIds=[value]&connectionAccountIds=[value]&connectionGroupId=[value]&latitude=[value]&longitude=[value]
    */
  def removeConnectionsFromGroup(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val connectionIds = request.getQueryString("connectionIds")
        
      val connectionAccountIds = request.getQueryString("connectionAccountIds")
        
      val connectionGroupId = request.getQueryString("connectionGroupId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("connectionGroupId", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.removeConnectionsFromGroup(version, connectionGroupId, deviceId, accountId, connectionIds, connectionAccountIds, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/consumer/connection/group/remove?returnNulls=[value]&deviceId=[value]&accountId=[value]&groupId=[value]&latitude=[value]&longitude=[value]
    */
  def removeGroup(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val returnNulls = request.getQueryString("returnNulls")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("returnNulls", "query string")
        }
        
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val groupId = request.getQueryString("groupId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("groupId", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.removeGroup(version, returnNulls, groupId, deviceId, accountId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/consumer/connection/group/removeSubGroup?returnNulls=[value]&deviceId=[value]&accountId=[value]&groupId=[value]&subGroupIds=[value]&latitude=[value]&longitude=[value]
    */
  def removeSubGroups(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val returnNulls = request.getQueryString("returnNulls")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("returnNulls", "query string")
        }
        
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val groupId = request.getQueryString("groupId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("groupId", "query string")
        }
        
      val subGroupIds = request.getQueryString("subGroupIds")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("subGroupIds", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.removeSubGroups(version, returnNulls, groupId, subGroupIds, deviceId, accountId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/connection/search?returnNulls=[value]&deviceId=[value]&accountId=[value]&q=[value]&keyword=[value]&latitude=[value]&longitude=[value]&gameType=[value]&appKey=[value]&i=[value]&start=[value]&l=[value]&limit=[value]&sortField=[value]&hasLocation=[value]
    */
  def searchConnections(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ConnectionListResponse = {
      val returnNulls = request.getQueryString("returnNulls")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("returnNulls", "query string")
        }
        
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val q = request.getQueryString("q")
        
      val keyword = request.getQueryString("keyword")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val i = request.getQueryString("_i")
        .map(value => value.toInt)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start", "query string")
        }
        
      val l = request.getQueryString("_l")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("limit", "query string")
        }
        
      val sortField = request.getQueryString("sortField")
        
      val hasLocation = request.getQueryString("hasLocation")
        .map(value => value.toBoolean)
        
      api.searchConnections(version, returnNulls, start, limit, deviceId, accountId, q, keyword, latitude, longitude, gameType, appKey, i, l, sortField, hasLocation)
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
