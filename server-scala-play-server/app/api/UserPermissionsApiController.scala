package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.SirqulResponse
import model.UserPermissionsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class UserPermissionsApiController @Inject()(cc: ControllerComponents, api: UserPermissionsApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/consumer/permissions/add?deviceId=[value]&accountId=[value]&permissionableType=[value]&permissionableId=[value]&read=[value]&write=[value]&delete=[value]&add=[value]&connectionIds=[value]&connectionAccountIds=[value]&connectionGroupIds=[value]&pending=[value]&admin=[value]&includeFriendGroup=[value]&latitude=[value]&longitude=[value]&audienceIds=[value]
    */
  def addUsersToPermissionable(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val permissionableType = request.getQueryString("permissionableType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("permissionableType", "query string")
        }
        
      val permissionableId = request.getQueryString("permissionableId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("permissionableId", "query string")
        }
        
      val read = request.getQueryString("read")
        .map(value => value.toBoolean)
        
      val write = request.getQueryString("write")
        .map(value => value.toBoolean)
        
      val delete = request.getQueryString("delete")
        .map(value => value.toBoolean)
        
      val add = request.getQueryString("add")
        .map(value => value.toBoolean)
        
      val connectionIds = request.getQueryString("connectionIds")
        
      val connectionAccountIds = request.getQueryString("connectionAccountIds")
        
      val connectionGroupIds = request.getQueryString("connectionGroupIds")
        
      val pending = request.getQueryString("pending")
        .map(value => value.toBoolean)
        
      val admin = request.getQueryString("admin")
        .map(value => value.toBoolean)
        
      val includeFriendGroup = request.getQueryString("includeFriendGroup")
        .map(value => value.toBoolean)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val audienceIds = request.getQueryString("audienceIds")
        
      api.addUsersToPermissionable(version, permissionableType, permissionableId, deviceId, accountId, read, write, delete, add, connectionIds, connectionAccountIds, connectionGroupIds, pending, admin, includeFriendGroup, latitude, longitude, audienceIds)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/permissionable/approve?deviceId=[value]&accountId=[value]&permissionableType=[value]&permissionableId=[value]&approvalStatus=[value]
    */
  def approvePermissionable(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val permissionableType = request.getQueryString("permissionableType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("permissionableType", "query string")
        }
        
      val permissionableId = request.getQueryString("permissionableId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("permissionableId", "query string")
        }
        
      val approvalStatus = request.getQueryString("approvalStatus")
        
      api.approvePermissionable(version, permissionableType, permissionableId, deviceId, accountId, approvalStatus)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/consumer/permissions/leave?deviceId=[value]&accountId=[value]&permissionableType=[value]&permissionableId=[value]&latitude=[value]&longitude=[value]
    */
  def leaveFromPermissionable(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val permissionableType = request.getQueryString("permissionableType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("permissionableType", "query string")
        }
        
      val permissionableId = request.getQueryString("permissionableId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("permissionableId", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.leaveFromPermissionable(version, permissionableType, permissionableId, deviceId, accountId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/consumer/permissions/remove?deviceId=[value]&accountId=[value]&permissionableType=[value]&permissionableId=[value]&connectionIds=[value]&connectionAccountIds=[value]&connectionGroupIds=[value]&removeFriendGroup=[value]&latitude=[value]&longitude=[value]&audienceIds=[value]
    */
  def removeUsersFromPermissionable(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val permissionableType = request.getQueryString("permissionableType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("permissionableType", "query string")
        }
        
      val permissionableId = request.getQueryString("permissionableId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("permissionableId", "query string")
        }
        
      val connectionIds = request.getQueryString("connectionIds")
        
      val connectionAccountIds = request.getQueryString("connectionAccountIds")
        
      val connectionGroupIds = request.getQueryString("connectionGroupIds")
        
      val removeFriendGroup = request.getQueryString("removeFriendGroup")
        .map(value => value.toBoolean)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val audienceIds = request.getQueryString("audienceIds")
        
      api.removeUsersFromPermissionable(version, permissionableType, permissionableId, deviceId, accountId, connectionIds, connectionAccountIds, connectionGroupIds, removeFriendGroup, latitude, longitude, audienceIds)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/permissions/search?deviceId=[value]&accountId=[value]&connectionAccountId=[value]&connectionAccountIds=[value]&permissionableType=[value]&permissionableId=[value]&keyword=[value]&sortField=[value]&descending=[value]&pending=[value]&admin=[value]&start=[value]&limit=[value]
    */
  def searchPermissionables(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[UserPermissionsResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val connectionAccountId = request.getQueryString("connectionAccountId")
        .map(value => value.toLong)
        
      val connectionAccountIds = request.getQueryString("connectionAccountIds")
        
      val permissionableType = request.getQueryString("permissionableType")
        
      val permissionableId = request.getQueryString("permissionableId")
        .map(value => value.toLong)
        
      val keyword = request.getQueryString("keyword")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val pending = request.getQueryString("pending")
        .map(value => value.toBoolean)
        
      val admin = request.getQueryString("admin")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchPermissionables(version, deviceId, accountId, connectionAccountId, connectionAccountIds, permissionableType, permissionableId, keyword, sortField, descending, pending, admin, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/permissions/distancesearch?deviceId=[value]&accountId=[value]&connectionAccountId=[value]&connectionAccountIds=[value]&permissionableType=[value]&permissionableId=[value]&latitude=[value]&longitude=[value]&searchRange=[value]&keyword=[value]&pending=[value]&admin=[value]&start=[value]&limit=[value]
    */
  def searchPermissionablesFollowingDistance(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[UserPermissionsResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val connectionAccountId = request.getQueryString("connectionAccountId")
        .map(value => value.toLong)
        
      val connectionAccountIds = request.getQueryString("connectionAccountIds")
        
      val permissionableType = request.getQueryString("permissionableType")
        
      val permissionableId = request.getQueryString("permissionableId")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("latitude", "query string")
        }
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("longitude", "query string")
        }
        
      val searchRange = request.getQueryString("searchRange")
        .map(value => value.toDouble)
        
      val keyword = request.getQueryString("keyword")
        
      val pending = request.getQueryString("pending")
        .map(value => value.toBoolean)
        
      val admin = request.getQueryString("admin")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchPermissionablesFollowingDistance(version, latitude, longitude, deviceId, accountId, connectionAccountId, connectionAccountIds, permissionableType, permissionableId, searchRange, keyword, pending, admin, start, limit)
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
