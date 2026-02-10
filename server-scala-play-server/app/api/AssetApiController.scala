package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AssetFullResponse
import model.AssetResponse
import model.AssetShortResponse
import model.BigDecimal
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class AssetApiController @Inject()(cc: ControllerComponents, api: AssetApi) extends AbstractController(cc) {
  /**
    * GET /api/:version/asset/download/:filename
    * @param filename the filename in the following formats: {assetId}-{suffix}.{extension} | {assetId}.{extension} | {assetId}
    */
  def assetDownload(version: BigDecimal, filename: String): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      api.assetDownload(version, filename)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/asset/morph?offerId=[value]&creativeId=[value]&adSize=[value]&width=[value]&height=[value]&backgroundSize=[value]&template=[value]
    */
  def assetMorph(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AssetShortResponse = {
      val offerId = request.getQueryString("offerId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("offerId", "query string")
        }
        
      val creativeId = request.getQueryString("creativeId")
        .map(value => value.toLong)
        
      val adSize = request.getQueryString("adSize")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("adSize", "query string")
        }
        
      val width = request.getQueryString("width")
        .map(value => value.toInt)
        
      val height = request.getQueryString("height")
        .map(value => value.toInt)
        
      val backgroundSize = request.getQueryString("backgroundSize")
        
      val template = request.getQueryString("template")
        
      api.assetMorph(version, offerId, adSize, creativeId, width, height, backgroundSize, template)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/asset/create?returnNulls=[value]&deviceId=[value]&accountId=[value]&albumId=[value]&collectionId=[value]&addToDefaultAlbum=[value]&addToMediaLibrary=[value]&versionCode=[value]&versionName=[value]&metaData=[value]&caption=[value]&assetType=[value]&approvalStatus=[value]&assignedAccountId=[value]&media=[value]&mediaUrl=[value]&mediaString=[value]&mediaStringFileName=[value]&mediaStringContentType=[value]&mediaHeight=[value]&mediaWidth=[value]&attachedMedia=[value]&attachedMediaUrl=[value]&attachedMediaString=[value]&attachedMediaStringFileName=[value]&attachedMediaStringContentType=[value]&attachedMediaHeight=[value]&attachedMediaWidth=[value]&locationDescription=[value]&app=[value]&appKey=[value]&searchTags=[value]&latitude=[value]&longitude=[value]
    */
  def createAsset(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AssetResponse = {
      val returnNulls = request.getQueryString("returnNulls")
        .map(value => value.toBoolean)
        
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val albumId = request.getQueryString("albumId")
        .map(value => value.toLong)
        
      val collectionId = request.getQueryString("collectionId")
        .map(value => value.toLong)
        
      val addToDefaultAlbum = request.getQueryString("addToDefaultAlbum")
        
      val addToMediaLibrary = request.getQueryString("addToMediaLibrary")
        .map(value => value.toBoolean)
        
      val versionCode = request.getQueryString("versionCode")
        .map(value => value.toInt)
        
      val versionName = request.getQueryString("versionName")
        
      val metaData = request.getQueryString("metaData")
        
      val caption = request.getQueryString("caption")
        
      val assetType = request.getQueryString("assetType")
        
      val approvalStatus = request.getQueryString("approvalStatus")
        
      val assignedAccountId = request.getQueryString("assignedAccountId")
        .map(value => value.toLong)
        
      val media = request.getQueryString("media")
        
      val mediaUrl = request.getQueryString("mediaUrl")
        
      val mediaString = request.getQueryString("mediaString")
        
      val mediaStringFileName = request.getQueryString("mediaStringFileName")
        
      val mediaStringContentType = request.getQueryString("mediaStringContentType")
        
      val mediaHeight = request.getQueryString("mediaHeight")
        .map(value => value.toInt)
        
      val mediaWidth = request.getQueryString("mediaWidth")
        .map(value => value.toInt)
        
      val attachedMedia = request.getQueryString("attachedMedia")
        
      val attachedMediaUrl = request.getQueryString("attachedMediaUrl")
        
      val attachedMediaString = request.getQueryString("attachedMediaString")
        
      val attachedMediaStringFileName = request.getQueryString("attachedMediaStringFileName")
        
      val attachedMediaStringContentType = request.getQueryString("attachedMediaStringContentType")
        
      val attachedMediaHeight = request.getQueryString("attachedMediaHeight")
        .map(value => value.toInt)
        
      val attachedMediaWidth = request.getQueryString("attachedMediaWidth")
        .map(value => value.toInt)
        
      val locationDescription = request.getQueryString("locationDescription")
        
      val app = request.getQueryString("app")
        
      val appKey = request.getQueryString("appKey")
        
      val searchTags = request.getQueryString("searchTags")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.createAsset(version, returnNulls, deviceId, accountId, albumId, collectionId, addToDefaultAlbum, addToMediaLibrary, versionCode, versionName, metaData, caption, assetType, approvalStatus, assignedAccountId, media, mediaUrl, mediaString, mediaStringFileName, mediaStringContentType, mediaHeight, mediaWidth, attachedMedia, attachedMediaUrl, attachedMediaString, attachedMediaStringFileName, attachedMediaStringContentType, attachedMediaHeight, attachedMediaWidth, locationDescription, app, appKey, searchTags, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/asset/delete?deviceId=[value]&accountId=[value]&assetId=[value]&latitude=[value]&longitude=[value]
    */
  def deleteAsset(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val assetId = request.getQueryString("assetId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("assetId", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.deleteAsset(version, assetId, deviceId, accountId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/asset/get?deviceId=[value]&accountId=[value]&assetId=[value]&noteDescending=[value]
    */
  def getAsset(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AssetFullResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val assetId = request.getQueryString("assetId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("assetId", "query string")
        }
        
      val noteDescending = request.getQueryString("noteDescending")
        .map(value => value.toBoolean)
        
      api.getAsset(version, assetId, deviceId, accountId, noteDescending)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/asset/remove?deviceId=[value]&accountId=[value]&albumId=[value]&collectionId=[value]&assetId=[value]&removeFromDefaultAlbums=[value]&latitude=[value]&longitude=[value]
    */
  def removeAsset(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val albumId = request.getQueryString("albumId")
        .map(value => value.toLong)
        
      val collectionId = request.getQueryString("collectionId")
        .map(value => value.toLong)
        
      val assetId = request.getQueryString("assetId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("assetId", "query string")
        }
        
      val removeFromDefaultAlbums = request.getQueryString("removeFromDefaultAlbums")
        .map(value => value.toBoolean)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.removeAsset(version, assetId, deviceId, accountId, albumId, collectionId, removeFromDefaultAlbums, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/asset/search?deviceId=[value]&accountId=[value]&albumIds=[value]&assetIds=[value]&appKey=[value]&mediaType=[value]&mimeType=[value]&keyword=[value]&versionCode=[value]&versionName=[value]&updatedSince=[value]&updatedBefore=[value]&sortField=[value]&descending=[value]&searchMediaLibrary=[value]&filterByBillable=[value]&activeOnly=[value]&returnApp=[value]&start=[value]&limit=[value]&searchMode=[value]&assetType=[value]&approvalStatus=[value]&assignedAccountId=[value]
    */
  def searchAssets(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[AssetResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val albumIds = request.getQueryString("albumIds")
        
      val assetIds = request.getQueryString("assetIds")
        
      val appKey = request.getQueryString("appKey")
        
      val mediaType = request.getQueryString("mediaType")
        
      val mimeType = request.getQueryString("mimeType")
        
      val keyword = request.getQueryString("keyword")
        
      val versionCode = request.getQueryString("versionCode")
        .map(value => value.toInt)
        
      val versionName = request.getQueryString("versionName")
        
      val updatedSince = request.getQueryString("updatedSince")
        .map(value => value.toLong)
        
      val updatedBefore = request.getQueryString("updatedBefore")
        .map(value => value.toLong)
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val searchMediaLibrary = request.getQueryString("searchMediaLibrary")
        .map(value => value.toBoolean)
        
      val filterByBillable = request.getQueryString("filterByBillable")
        .map(value => value.toBoolean)
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        
      val returnApp = request.getQueryString("returnApp")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val searchMode = request.getQueryString("searchMode")
        
      val assetType = request.getQueryString("assetType")
        
      val approvalStatus = request.getQueryString("approvalStatus")
        
      val assignedAccountId = request.getQueryString("assignedAccountId")
        .map(value => value.toLong)
        
      api.searchAssets(version, deviceId, accountId, albumIds, assetIds, appKey, mediaType, mimeType, keyword, versionCode, versionName, updatedSince, updatedBefore, sortField, descending, searchMediaLibrary, filterByBillable, activeOnly, returnApp, start, limit, searchMode, assetType, approvalStatus, assignedAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/asset/update?deviceId=[value]&accountId=[value]&assetId=[value]&albumId=[value]&attachedAssetId=[value]&versionCode=[value]&versionName=[value]&metaData=[value]&caption=[value]&assetType=[value]&approvalStatus=[value]&assignedAccountId=[value]&media=[value]&mediaUrl=[value]&mediaString=[value]&mediaStringFileName=[value]&mediaStringContentType=[value]&mediaHeight=[value]&mediaWidth=[value]&attachedMedia=[value]&attachedMediaUrl=[value]&attachedMediaString=[value]&attachedMediaStringFileName=[value]&attachedMediaStringContentType=[value]&attachedMediaHeight=[value]&attachedMediaWidth=[value]&locationDescription=[value]&searchTags=[value]&appKey=[value]&latitude=[value]&longitude=[value]
    */
  def updateAsset(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val assetId = request.getQueryString("assetId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("assetId", "query string")
        }
        
      val albumId = request.getQueryString("albumId")
        .map(value => value.toLong)
        
      val attachedAssetId = request.getQueryString("attachedAssetId")
        .map(value => value.toLong)
        
      val versionCode = request.getQueryString("versionCode")
        .map(value => value.toInt)
        
      val versionName = request.getQueryString("versionName")
        
      val metaData = request.getQueryString("metaData")
        
      val caption = request.getQueryString("caption")
        
      val assetType = request.getQueryString("assetType")
        
      val approvalStatus = request.getQueryString("approvalStatus")
        
      val assignedAccountId = request.getQueryString("assignedAccountId")
        .map(value => value.toLong)
        
      val media = request.getQueryString("media")
        
      val mediaUrl = request.getQueryString("mediaUrl")
        
      val mediaString = request.getQueryString("mediaString")
        
      val mediaStringFileName = request.getQueryString("mediaStringFileName")
        
      val mediaStringContentType = request.getQueryString("mediaStringContentType")
        
      val mediaHeight = request.getQueryString("mediaHeight")
        .map(value => value.toInt)
        
      val mediaWidth = request.getQueryString("mediaWidth")
        .map(value => value.toInt)
        
      val attachedMedia = request.getQueryString("attachedMedia")
        
      val attachedMediaUrl = request.getQueryString("attachedMediaUrl")
        
      val attachedMediaString = request.getQueryString("attachedMediaString")
        
      val attachedMediaStringFileName = request.getQueryString("attachedMediaStringFileName")
        
      val attachedMediaStringContentType = request.getQueryString("attachedMediaStringContentType")
        
      val attachedMediaHeight = request.getQueryString("attachedMediaHeight")
        .map(value => value.toInt)
        
      val attachedMediaWidth = request.getQueryString("attachedMediaWidth")
        .map(value => value.toInt)
        
      val locationDescription = request.getQueryString("locationDescription")
        
      val searchTags = request.getQueryString("searchTags")
        
      val appKey = request.getQueryString("appKey")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.updateAsset(version, assetId, deviceId, accountId, albumId, attachedAssetId, versionCode, versionName, metaData, caption, assetType, approvalStatus, assignedAccountId, media, mediaUrl, mediaString, mediaStringFileName, mediaStringContentType, mediaHeight, mediaWidth, attachedMedia, attachedMediaUrl, attachedMediaString, attachedMediaStringFileName, attachedMediaStringContentType, attachedMediaHeight, attachedMediaWidth, locationDescription, searchTags, appKey, latitude, longitude)
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
