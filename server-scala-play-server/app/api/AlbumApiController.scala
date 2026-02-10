package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AlbumFullResponse
import model.AlbumResponse
import model.BigDecimal
import model.SearchResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class AlbumApiController @Inject()(cc: ControllerComponents, api: AlbumApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/album/create?deviceId=[value]&accountId=[value]&title=[value]&assetsToAdd=[value]&media=[value]&mediaURL=[value]&assetId=[value]&attachedMedia=[value]&attachedMediaURL=[value]&coverAssetNullable=[value]&includeCoverInAssetList=[value]&startDate=[value]&endDate=[value]&tags=[value]&description=[value]&albumType=[value]&albumTypeId=[value]&subType=[value]&publicRead=[value]&publicWrite=[value]&publicDelete=[value]&publicAdd=[value]&latitude=[value]&longitude=[value]&locationDescription=[value]&visibility=[value]&gameType=[value]&appKey=[value]&cellPhone=[value]&streetAddress=[value]&streetAddress2=[value]&city=[value]&state=[value]&postalCode=[value]&fullAddress=[value]&anonymous=[value]&metaData=[value]&categoryIds=[value]&categoryFilterIds=[value]&audienceIds=[value]&includeAllAppUsersAsMembers=[value]&includeAudiencesAsMembers=[value]&audienceOperator=[value]&approvalStatus=[value]&linkedObjectType=[value]&linkedObjectId=[value]
    */
  def addAlbumCollection(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SearchResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val title = request.getQueryString("title")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("title", "query string")
        }
        
      val assetsToAdd = request.getQueryString("assetsToAdd")
        
      val media = request.getQueryString("media")
        
      val mediaURL = request.getQueryString("mediaURL")
        
      val assetId = request.getQueryString("assetId")
        .map(value => value.toLong)
        
      val attachedMedia = request.getQueryString("attachedMedia")
        
      val attachedMediaURL = request.getQueryString("attachedMediaURL")
        
      val coverAssetNullable = request.getQueryString("coverAssetNullable")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("coverAssetNullable", "query string")
        }
        
      val includeCoverInAssetList = request.getQueryString("includeCoverInAssetList")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("includeCoverInAssetList", "query string")
        }
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val tags = request.getQueryString("tags")
        
      val description = request.getQueryString("description")
        
      val albumType = request.getQueryString("albumType")
        
      val albumTypeId = request.getQueryString("albumTypeId")
        .map(value => value.toLong)
        
      val subType = request.getQueryString("subType")
        
      val publicRead = request.getQueryString("publicRead")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("publicRead", "query string")
        }
        
      val publicWrite = request.getQueryString("publicWrite")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("publicWrite", "query string")
        }
        
      val publicDelete = request.getQueryString("publicDelete")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("publicDelete", "query string")
        }
        
      val publicAdd = request.getQueryString("publicAdd")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("publicAdd", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val locationDescription = request.getQueryString("locationDescription")
        
      val visibility = request.getQueryString("visibility")
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val cellPhone = request.getQueryString("cellPhone")
        
      val streetAddress = request.getQueryString("streetAddress")
        
      val streetAddress2 = request.getQueryString("streetAddress2")
        
      val city = request.getQueryString("city")
        
      val state = request.getQueryString("state")
        
      val postalCode = request.getQueryString("postalCode")
        
      val fullAddress = request.getQueryString("fullAddress")
        
      val anonymous = request.getQueryString("anonymous")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("anonymous", "query string")
        }
        
      val metaData = request.getQueryString("metaData")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val categoryFilterIds = request.getQueryString("categoryFilterIds")
        
      val audienceIds = request.getQueryString("audienceIds")
        
      val includeAllAppUsersAsMembers = request.getQueryString("includeAllAppUsersAsMembers")
        .map(value => value.toBoolean)
        
      val includeAudiencesAsMembers = request.getQueryString("includeAudiencesAsMembers")
        .map(value => value.toBoolean)
        
      val audienceOperator = request.getQueryString("audienceOperator")
        
      val approvalStatus = request.getQueryString("approvalStatus")
        
      val linkedObjectType = request.getQueryString("linkedObjectType")
        
      val linkedObjectId = request.getQueryString("linkedObjectId")
        .map(value => value.toLong)
        
      api.addAlbumCollection(version, title, coverAssetNullable, includeCoverInAssetList, publicRead, publicWrite, publicDelete, publicAdd, anonymous, deviceId, accountId, assetsToAdd, media, mediaURL, assetId, attachedMedia, attachedMediaURL, startDate, endDate, tags, description, albumType, albumTypeId, subType, latitude, longitude, locationDescription, visibility, gameType, appKey, cellPhone, streetAddress, streetAddress2, city, state, postalCode, fullAddress, metaData, categoryIds, categoryFilterIds, audienceIds, includeAllAppUsersAsMembers, includeAudiencesAsMembers, audienceOperator, approvalStatus, linkedObjectType, linkedObjectId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/album/user/add?deviceId=[value]&accountId=[value]&albumId=[value]&read=[value]&write=[value]&delete=[value]&add=[value]&connections=[value]&connectionGroups=[value]&includeFriendGroup=[value]
    */
  def addAlbumUsers(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val albumId = request.getQueryString("albumId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("albumId", "query string")
        }
        
      val read = request.getQueryString("read")
        .map(value => value.toBoolean)
        
      val write = request.getQueryString("write")
        .map(value => value.toBoolean)
        
      val delete = request.getQueryString("delete")
        .map(value => value.toBoolean)
        
      val add = request.getQueryString("add")
        .map(value => value.toBoolean)
        
      val connections = request.getQueryString("connections")
        
      val connectionGroups = request.getQueryString("connectionGroups")
        
      val includeFriendGroup = request.getQueryString("includeFriendGroup")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("includeFriendGroup", "query string")
        }
        
      api.addAlbumUsers(version, albumId, includeFriendGroup, deviceId, accountId, read, write, delete, add, connections, connectionGroups)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/album/approve?deviceId=[value]&accountId=[value]&albumId=[value]&approvalStatus=[value]&verified=[value]
    */
  def approveAlbum(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val albumId = request.getQueryString("albumId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("albumId", "query string")
        }
        
      val approvalStatus = request.getQueryString("approvalStatus")
        
      val verified = request.getQueryString("verified")
        .map(value => value.toBoolean)
        
      api.approveAlbum(version, albumId, deviceId, accountId, approvalStatus, verified)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/album/get?returnNulls=[value]&deviceId=[value]&accountId=[value]&albumId=[value]&likePreviewSize=[value]&assetPreviewSize=[value]&notePreviewSize=[value]&connectionPreviewSize=[value]&audiencePreviewSize=[value]
    */
  def getAlbumCollection(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AlbumFullResponse = {
      val returnNulls = request.getQueryString("returnNulls")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("returnNulls", "query string")
        }
        
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val albumId = request.getQueryString("albumId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("albumId", "query string")
        }
        
      val likePreviewSize = request.getQueryString("likePreviewSize")
        .map(value => value.toInt)
        
      val assetPreviewSize = request.getQueryString("assetPreviewSize")
        .map(value => value.toInt)
        
      val notePreviewSize = request.getQueryString("notePreviewSize")
        .map(value => value.toInt)
        
      val connectionPreviewSize = request.getQueryString("connectionPreviewSize")
        .map(value => value.toInt)
        
      val audiencePreviewSize = request.getQueryString("audiencePreviewSize")
        .map(value => value.toInt)
        
      api.getAlbumCollection(version, returnNulls, albumId, deviceId, accountId, likePreviewSize, assetPreviewSize, notePreviewSize, connectionPreviewSize, audiencePreviewSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/album/user/leave?deviceId=[value]&accountId=[value]&albumId=[value]
    */
  def leaveAlbum(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val albumId = request.getQueryString("albumId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("albumId", "query string")
        }
        
      api.leaveAlbum(version, albumId, deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/album/delete?deviceId=[value]&accountId=[value]&albumId=[value]
    */
  def removeAlbum(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val albumId = request.getQueryString("albumId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("albumId", "query string")
        }
        
      api.removeAlbum(version, albumId, deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/album/user/delete?deviceId=[value]&accountId=[value]&albumId=[value]&connections=[value]&connectionGroups=[value]&removeFriendGroup=[value]
    */
  def removeAlbumUsers(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val albumId = request.getQueryString("albumId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("albumId", "query string")
        }
        
      val connections = request.getQueryString("connections")
        
      val connectionGroups = request.getQueryString("connectionGroups")
        
      val removeFriendGroup = request.getQueryString("removeFriendGroup")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("removeFriendGroup", "query string")
        }
        
      api.removeAlbumUsers(version, albumId, removeFriendGroup, deviceId, accountId, connections, connectionGroups)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/album/search?deviceId=[value]&accountId=[value]&connectionAccountId=[value]&ownerId=[value]&albumIds=[value]&excludeAlbumIds=[value]&mediaId=[value]&keyword=[value]&filter=[value]&albumType=[value]&albumTypeId=[value]&subType=[value]&includeInactive=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&limitPerAlbumType=[value]&dateCreated=[value]&updatedSince=[value]&updatedBefore=[value]&createdSince=[value]&createdBefore=[value]&startedSince=[value]&startedBefore=[value]&endedSince=[value]&endedBefore=[value]&latitude=[value]&longitude=[value]&range=[value]&appKey=[value]&categoryIds=[value]&categoryFilterIds=[value]&audienceIds=[value]&excludeAudienceIds=[value]&includeLiked=[value]&includeFavorited=[value]&includePermissions=[value]&includeCompletable=[value]&includeRating=[value]&likePreviewSize=[value]&assetPreviewSize=[value]&notePreviewSize=[value]&connectionPreviewSize=[value]&audiencePreviewSize=[value]&searchMode=[value]&stackSearch=[value]&stackWindowSize=[value]&minStackPerPage=[value]&stackPaginationIdentifier=[value]&stackDetails=[value]&flagCountMinimum=[value]&removeFlaggedContent=[value]&verifiedFilter=[value]&linkedObjectType=[value]&linkedObjectId=[value]&orderAudienceId=[value]&ignoreDefaultAppFilter=[value]&searchExpression=[value]&generateAlbums=[value]
    */
  def searchAlbums(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[AlbumFullResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val connectionAccountId = request.getQueryString("connectionAccountId")
        .map(value => value.toLong)
        
      val ownerId = request.getQueryString("ownerId")
        .map(value => value.toLong)
        
      val albumIds = request.getQueryString("albumIds")
        
      val excludeAlbumIds = request.getQueryString("excludeAlbumIds")
        
      val mediaId = request.getQueryString("mediaId")
        .map(value => value.toLong)
        
      val keyword = request.getQueryString("keyword")
        
      val filter = request.getQueryString("filter")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("filter", "query string")
        }
        
      val albumType = request.getQueryString("albumType")
        
      val albumTypeId = request.getQueryString("albumTypeId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("albumTypeId", "query string")
        }
        
      val subType = request.getQueryString("subType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("subType", "query string")
        }
        
      val includeInactive = request.getQueryString("includeInactive")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("includeInactive", "query string")
        }
        
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
        
      val limitPerAlbumType = request.getQueryString("limitPerAlbumType")
        .map(value => value.toInt)
        
      val dateCreated = request.getQueryString("dateCreated")
        .map(value => value.toLong)
        
      val updatedSince = request.getQueryString("updatedSince")
        .map(value => value.toLong)
        
      val updatedBefore = request.getQueryString("updatedBefore")
        .map(value => value.toLong)
        
      val createdSince = request.getQueryString("createdSince")
        .map(value => value.toLong)
        
      val createdBefore = request.getQueryString("createdBefore")
        .map(value => value.toLong)
        
      val startedSince = request.getQueryString("startedSince")
        .map(value => value.toLong)
        
      val startedBefore = request.getQueryString("startedBefore")
        .map(value => value.toLong)
        
      val endedSince = request.getQueryString("endedSince")
        .map(value => value.toLong)
        
      val endedBefore = request.getQueryString("endedBefore")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val range = request.getQueryString("range")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("range", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val categoryFilterIds = request.getQueryString("categoryFilterIds")
        
      val audienceIds = request.getQueryString("audienceIds")
        
      val excludeAudienceIds = request.getQueryString("excludeAudienceIds")
        
      val includeLiked = request.getQueryString("includeLiked")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("includeLiked", "query string")
        }
        
      val includeFavorited = request.getQueryString("includeFavorited")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("includeFavorited", "query string")
        }
        
      val includePermissions = request.getQueryString("includePermissions")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("includePermissions", "query string")
        }
        
      val includeCompletable = request.getQueryString("includeCompletable")
        .map(value => value.toBoolean)
        
      val includeRating = request.getQueryString("includeRating")
        .map(value => value.toBoolean)
        
      val likePreviewSize = request.getQueryString("likePreviewSize")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("likePreviewSize", "query string")
        }
        
      val assetPreviewSize = request.getQueryString("assetPreviewSize")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("assetPreviewSize", "query string")
        }
        
      val notePreviewSize = request.getQueryString("notePreviewSize")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("notePreviewSize", "query string")
        }
        
      val connectionPreviewSize = request.getQueryString("connectionPreviewSize")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("connectionPreviewSize", "query string")
        }
        
      val audiencePreviewSize = request.getQueryString("audiencePreviewSize")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("audiencePreviewSize", "query string")
        }
        
      val searchMode = request.getQueryString("searchMode")
        
      val stackSearch = request.getQueryString("stackSearch")
        .map(value => value.toBoolean)
        
      val stackWindowSize = request.getQueryString("stackWindowSize")
        .map(value => value.toInt)
        
      val minStackPerPage = request.getQueryString("minStackPerPage")
        .map(value => value.toInt)
        
      val stackPaginationIdentifier = request.getQueryString("stackPaginationIdentifier")
        
      val stackDetails = request.getQueryString("stackDetails")
        .map(value => value.toBoolean)
        
      val flagCountMinimum = request.getQueryString("flagCountMinimum")
        .map(value => value.toLong)
        
      val removeFlaggedContent = request.getQueryString("removeFlaggedContent")
        .map(value => value.toBoolean)
        
      val verifiedFilter = request.getQueryString("verifiedFilter")
        .map(value => value.toBoolean)
        
      val linkedObjectType = request.getQueryString("linkedObjectType")
        
      val linkedObjectId = request.getQueryString("linkedObjectId")
        .map(value => value.toLong)
        
      val orderAudienceId = request.getQueryString("orderAudienceId")
        .map(value => value.toLong)
        
      val ignoreDefaultAppFilter = request.getQueryString("ignoreDefaultAppFilter")
        .map(value => value.toBoolean)
        
      val searchExpression = request.getQueryString("searchExpression")
        
      val generateAlbums = request.getQueryString("generateAlbums")
        .map(value => value.toBoolean)
        
      api.searchAlbums(version, filter, albumTypeId, subType, includeInactive, sortField, descending, start, limit, range, includeLiked, includeFavorited, includePermissions, likePreviewSize, assetPreviewSize, notePreviewSize, connectionPreviewSize, audiencePreviewSize, deviceId, accountId, connectionAccountId, ownerId, albumIds, excludeAlbumIds, mediaId, keyword, albumType, limitPerAlbumType, dateCreated, updatedSince, updatedBefore, createdSince, createdBefore, startedSince, startedBefore, endedSince, endedBefore, latitude, longitude, appKey, categoryIds, categoryFilterIds, audienceIds, excludeAudienceIds, includeCompletable, includeRating, searchMode, stackSearch, stackWindowSize, minStackPerPage, stackPaginationIdentifier, stackDetails, flagCountMinimum, removeFlaggedContent, verifiedFilter, linkedObjectType, linkedObjectId, orderAudienceId, ignoreDefaultAppFilter, searchExpression, generateAlbums)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/album/update?deviceId=[value]&accountId=[value]&albumId=[value]&assetsToAdd=[value]&assetsToRemove=[value]&assetId=[value]&media=[value]&mediaURL=[value]&active=[value]&title=[value]&startDate=[value]&endDate=[value]&tags=[value]&description=[value]&albumType=[value]&albumTypeId=[value]&subType=[value]&publicRead=[value]&publicWrite=[value]&publicDelete=[value]&publicAdd=[value]&latitude=[value]&longitude=[value]&locationDescription=[value]&visibility=[value]&cellPhone=[value]&streetAddress=[value]&streetAddress2=[value]&city=[value]&state=[value]&postalCode=[value]&fullAddress=[value]&anonymous=[value]&metaData=[value]&categoryIds=[value]&categoryFilterIds=[value]&audienceIds=[value]&audienceIdsToAdd=[value]&audienceIdsToRemove=[value]&includeAllAppUsersAsMembers=[value]&includeAudiencesAsMembers=[value]&audienceOperator=[value]&linkedObjectType=[value]&linkedObjectId=[value]&indexNow=[value]
    */
  def updateAlbumCollection(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AlbumResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val albumId = request.getQueryString("albumId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("albumId", "query string")
        }
        
      val assetsToAdd = request.getQueryString("assetsToAdd")
        
      val assetsToRemove = request.getQueryString("assetsToRemove")
        
      val assetId = request.getQueryString("assetId")
        .map(value => value.toLong)
        
      val media = request.getQueryString("media")
        
      val mediaURL = request.getQueryString("mediaURL")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val title = request.getQueryString("title")
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val tags = request.getQueryString("tags")
        
      val description = request.getQueryString("description")
        
      val albumType = request.getQueryString("albumType")
        
      val albumTypeId = request.getQueryString("albumTypeId")
        .map(value => value.toLong)
        
      val subType = request.getQueryString("subType")
        
      val publicRead = request.getQueryString("publicRead")
        .map(value => value.toBoolean)
        
      val publicWrite = request.getQueryString("publicWrite")
        .map(value => value.toBoolean)
        
      val publicDelete = request.getQueryString("publicDelete")
        .map(value => value.toBoolean)
        
      val publicAdd = request.getQueryString("publicAdd")
        .map(value => value.toBoolean)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val locationDescription = request.getQueryString("locationDescription")
        
      val visibility = request.getQueryString("visibility")
        
      val cellPhone = request.getQueryString("cellPhone")
        
      val streetAddress = request.getQueryString("streetAddress")
        
      val streetAddress2 = request.getQueryString("streetAddress2")
        
      val city = request.getQueryString("city")
        
      val state = request.getQueryString("state")
        
      val postalCode = request.getQueryString("postalCode")
        
      val fullAddress = request.getQueryString("fullAddress")
        
      val anonymous = request.getQueryString("anonymous")
        .map(value => value.toBoolean)
        
      val metaData = request.getQueryString("metaData")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val categoryFilterIds = request.getQueryString("categoryFilterIds")
        
      val audienceIds = request.getQueryString("audienceIds")
        
      val audienceIdsToAdd = request.getQueryString("audienceIdsToAdd")
        
      val audienceIdsToRemove = request.getQueryString("audienceIdsToRemove")
        
      val includeAllAppUsersAsMembers = request.getQueryString("includeAllAppUsersAsMembers")
        .map(value => value.toBoolean)
        
      val includeAudiencesAsMembers = request.getQueryString("includeAudiencesAsMembers")
        .map(value => value.toBoolean)
        
      val audienceOperator = request.getQueryString("audienceOperator")
        
      val linkedObjectType = request.getQueryString("linkedObjectType")
        
      val linkedObjectId = request.getQueryString("linkedObjectId")
        .map(value => value.toLong)
        
      val indexNow = request.getQueryString("indexNow")
        .map(value => value.toBoolean)
        
      api.updateAlbumCollection(version, albumId, deviceId, accountId, assetsToAdd, assetsToRemove, assetId, media, mediaURL, active, title, startDate, endDate, tags, description, albumType, albumTypeId, subType, publicRead, publicWrite, publicDelete, publicAdd, latitude, longitude, locationDescription, visibility, cellPhone, streetAddress, streetAddress2, city, state, postalCode, fullAddress, anonymous, metaData, categoryIds, categoryFilterIds, audienceIds, audienceIdsToAdd, audienceIdsToRemove, includeAllAppUsersAsMembers, includeAudiencesAsMembers, audienceOperator, linkedObjectType, linkedObjectId, indexNow)
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
