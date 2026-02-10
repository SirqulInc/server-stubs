package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.NoteResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class NoteApiController @Inject()(cc: ControllerComponents, api: NoteApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/note/batch?deviceId=[value]&accountId=[value]&notableId=[value]&notableType=[value]&batchOperation=[value]
    */
  def batchOperation(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val notableId = request.getQueryString("notableId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("notableId", "query string")
        }
        
      val notableType = request.getQueryString("notableType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("notableType", "query string")
        }
        
      val batchOperation = request.getQueryString("batchOperation")
        
      api.batchOperation(version, notableId, notableType, deviceId, accountId, batchOperation)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/note/create?deviceId=[value]&accountId=[value]&notableType=[value]&notableId=[value]&comment=[value]&noteType=[value]&assetIds=[value]&tags=[value]&permissionableType=[value]&permissionableId=[value]&appKey=[value]&locationDescription=[value]&latitude=[value]&longitude=[value]&metaData=[value]&receiverAccountIds=[value]&returnFullResponse=[value]&initializeAsset=[value]&assetReturnNulls=[value]&assetAlbumId=[value]&assetCollectionId=[value]&assetAddToDefaultAlbum=[value]&assetAddToMediaLibrary=[value]&assetVersionCode=[value]&assetVersionName=[value]&assetMetaData=[value]&assetCaption=[value]&assetMedia=[value]&assetMediaUrl=[value]&assetMediaString=[value]&assetMediaStringFileName=[value]&assetMediaStringContentType=[value]&assetAttachedMedia=[value]&assetAttachedMediaUrl=[value]&assetAttachedMediaString=[value]&assetAttachedMediaStringFileName=[value]&assetAttachedMediaStringContentType=[value]&assetLocationDescription=[value]&assetApp=[value]&assetSearchTags=[value]&assetLatitude=[value]&assetLongitude=[value]
    */
  def createNote(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): NoteResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val notableType = request.getQueryString("notableType")
        
      val notableId = request.getQueryString("notableId")
        .map(value => value.toLong)
        
      val comment = request.getQueryString("comment")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("comment", "query string")
        }
        
      val noteType = request.getQueryString("noteType")
        
      val assetIds = request.getQueryString("assetIds")
        
      val tags = request.getQueryString("tags")
        
      val permissionableType = request.getQueryString("permissionableType")
        
      val permissionableId = request.getQueryString("permissionableId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val locationDescription = request.getQueryString("locationDescription")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val metaData = request.getQueryString("metaData")
        
      val receiverAccountIds = request.getQueryString("receiverAccountIds")
        
      val returnFullResponse = request.getQueryString("returnFullResponse")
        .map(value => value.toBoolean)
        
      val initializeAsset = request.getQueryString("initializeAsset")
        .map(value => value.toBoolean)
        
      val assetReturnNulls = request.getQueryString("assetReturnNulls")
        .map(value => value.toBoolean)
        
      val assetAlbumId = request.getQueryString("assetAlbumId")
        .map(value => value.toLong)
        
      val assetCollectionId = request.getQueryString("assetCollectionId")
        .map(value => value.toLong)
        
      val assetAddToDefaultAlbum = request.getQueryString("assetAddToDefaultAlbum")
        
      val assetAddToMediaLibrary = request.getQueryString("assetAddToMediaLibrary")
        .map(value => value.toBoolean)
        
      val assetVersionCode = request.getQueryString("assetVersionCode")
        .map(value => value.toInt)
        
      val assetVersionName = request.getQueryString("assetVersionName")
        
      val assetMetaData = request.getQueryString("assetMetaData")
        
      val assetCaption = request.getQueryString("assetCaption")
        
      val assetMedia = request.getQueryString("assetMedia")
        
      val assetMediaUrl = request.getQueryString("assetMediaUrl")
        
      val assetMediaString = request.getQueryString("assetMediaString")
        
      val assetMediaStringFileName = request.getQueryString("assetMediaStringFileName")
        
      val assetMediaStringContentType = request.getQueryString("assetMediaStringContentType")
        
      val assetAttachedMedia = request.getQueryString("assetAttachedMedia")
        
      val assetAttachedMediaUrl = request.getQueryString("assetAttachedMediaUrl")
        
      val assetAttachedMediaString = request.getQueryString("assetAttachedMediaString")
        
      val assetAttachedMediaStringFileName = request.getQueryString("assetAttachedMediaStringFileName")
        
      val assetAttachedMediaStringContentType = request.getQueryString("assetAttachedMediaStringContentType")
        
      val assetLocationDescription = request.getQueryString("assetLocationDescription")
        
      val assetApp = request.getQueryString("assetApp")
        
      val assetSearchTags = request.getQueryString("assetSearchTags")
        
      val assetLatitude = request.getQueryString("assetLatitude")
        .map(value => value.toDouble)
        
      val assetLongitude = request.getQueryString("assetLongitude")
        .map(value => BigDecimal(value))
        
      api.createNote(version, comment, deviceId, accountId, notableType, notableId, noteType, assetIds, tags, permissionableType, permissionableId, appKey, locationDescription, latitude, longitude, metaData, receiverAccountIds, returnFullResponse, initializeAsset, assetReturnNulls, assetAlbumId, assetCollectionId, assetAddToDefaultAlbum, assetAddToMediaLibrary, assetVersionCode, assetVersionName, assetMetaData, assetCaption, assetMedia, assetMediaUrl, assetMediaString, assetMediaStringFileName, assetMediaStringContentType, assetAttachedMedia, assetAttachedMediaUrl, assetAttachedMediaString, assetAttachedMediaStringFileName, assetAttachedMediaStringContentType, assetLocationDescription, assetApp, assetSearchTags, assetLatitude, assetLongitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/note/delete?deviceId=[value]&accountId=[value]&noteId=[value]&latitude=[value]&longitude=[value]&appKey=[value]
    */
  def deleteNote(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val noteId = request.getQueryString("noteId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("noteId", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val appKey = request.getQueryString("appKey")
        
      api.deleteNote(version, noteId, deviceId, accountId, latitude, longitude, appKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/note/get?deviceId=[value]&accountId=[value]&returnFullResponse=[value]&noteId=[value]
    */
  def getNote(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val returnFullResponse = request.getQueryString("returnFullResponse")
        .map(value => value.toBoolean)
        
      val noteId = request.getQueryString("noteId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("noteId", "query string")
        }
        
      api.getNote(version, noteId, deviceId, accountId, returnFullResponse)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/note/search?deviceId=[value]&accountId=[value]&notableType=[value]&notableId=[value]&noteTypes=[value]&appKey=[value]&keyword=[value]&flagCountMinimum=[value]&flagsExceedThreshold=[value]&includeInactive=[value]&sortField=[value]&descending=[value]&returnFullResponse=[value]&updatedSince=[value]&updatedBefore=[value]&start=[value]&limit=[value]
    */
  def searchNotes(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[NoteResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val notableType = request.getQueryString("notableType")
        
      val notableId = request.getQueryString("notableId")
        .map(value => value.toLong)
        
      val noteTypes = request.getQueryString("noteTypes")
        
      val appKey = request.getQueryString("appKey")
        
      val keyword = request.getQueryString("keyword")
        
      val flagCountMinimum = request.getQueryString("flagCountMinimum")
        .map(value => value.toLong)
        
      val flagsExceedThreshold = request.getQueryString("flagsExceedThreshold")
        .map(value => value.toBoolean)
        
      val includeInactive = request.getQueryString("includeInactive")
        .map(value => value.toBoolean)
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val returnFullResponse = request.getQueryString("returnFullResponse")
        .map(value => value.toBoolean)
        
      val updatedSince = request.getQueryString("updatedSince")
        .map(value => value.toLong)
        
      val updatedBefore = request.getQueryString("updatedBefore")
        .map(value => value.toLong)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchNotes(version, deviceId, accountId, notableType, notableId, noteTypes, appKey, keyword, flagCountMinimum, flagsExceedThreshold, includeInactive, sortField, descending, returnFullResponse, updatedSince, updatedBefore, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/note/update?deviceId=[value]&accountId=[value]&noteId=[value]&comment=[value]&noteType=[value]&assetIds=[value]&tags=[value]&permissionableType=[value]&permissionableId=[value]&appKey=[value]&locationDescription=[value]&latitude=[value]&longitude=[value]&metaData=[value]&returnFullResponse=[value]&active=[value]&updateAsset=[value]&assetReturnNulls=[value]&assetAlbumId=[value]&assetCollectionId=[value]&assetAddToDefaultAlbum=[value]&assetAddToMediaLibrary=[value]&assetVersionCode=[value]&assetVersionName=[value]&assetMetaData=[value]&assetCaption=[value]&assetMedia=[value]&assetMediaUrl=[value]&assetMediaString=[value]&assetMediaStringFileName=[value]&assetMediaStringContentType=[value]&assetAttachedMedia=[value]&assetAttachedMediaUrl=[value]&assetAttachedMediaString=[value]&assetAttachedMediaStringFileName=[value]&assetAttachedMediaStringContentType=[value]&assetLocationDescription=[value]&assetApp=[value]&assetSearchTags=[value]&assetLatitude=[value]&assetLongitude=[value]
    */
  def updateNote(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): NoteResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val noteId = request.getQueryString("noteId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("noteId", "query string")
        }
        
      val comment = request.getQueryString("comment")
        
      val noteType = request.getQueryString("noteType")
        
      val assetIds = request.getQueryString("assetIds")
        
      val tags = request.getQueryString("tags")
        
      val permissionableType = request.getQueryString("permissionableType")
        
      val permissionableId = request.getQueryString("permissionableId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val locationDescription = request.getQueryString("locationDescription")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val metaData = request.getQueryString("metaData")
        
      val returnFullResponse = request.getQueryString("returnFullResponse")
        .map(value => value.toBoolean)
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val updateAsset = request.getQueryString("updateAsset")
        .map(value => value.toBoolean)
        
      val assetReturnNulls = request.getQueryString("assetReturnNulls")
        .map(value => value.toBoolean)
        
      val assetAlbumId = request.getQueryString("assetAlbumId")
        .map(value => value.toLong)
        
      val assetCollectionId = request.getQueryString("assetCollectionId")
        .map(value => value.toLong)
        
      val assetAddToDefaultAlbum = request.getQueryString("assetAddToDefaultAlbum")
        
      val assetAddToMediaLibrary = request.getQueryString("assetAddToMediaLibrary")
        .map(value => value.toBoolean)
        
      val assetVersionCode = request.getQueryString("assetVersionCode")
        .map(value => value.toInt)
        
      val assetVersionName = request.getQueryString("assetVersionName")
        
      val assetMetaData = request.getQueryString("assetMetaData")
        
      val assetCaption = request.getQueryString("assetCaption")
        
      val assetMedia = request.getQueryString("assetMedia")
        
      val assetMediaUrl = request.getQueryString("assetMediaUrl")
        
      val assetMediaString = request.getQueryString("assetMediaString")
        
      val assetMediaStringFileName = request.getQueryString("assetMediaStringFileName")
        
      val assetMediaStringContentType = request.getQueryString("assetMediaStringContentType")
        
      val assetAttachedMedia = request.getQueryString("assetAttachedMedia")
        
      val assetAttachedMediaUrl = request.getQueryString("assetAttachedMediaUrl")
        
      val assetAttachedMediaString = request.getQueryString("assetAttachedMediaString")
        
      val assetAttachedMediaStringFileName = request.getQueryString("assetAttachedMediaStringFileName")
        
      val assetAttachedMediaStringContentType = request.getQueryString("assetAttachedMediaStringContentType")
        
      val assetLocationDescription = request.getQueryString("assetLocationDescription")
        
      val assetApp = request.getQueryString("assetApp")
        
      val assetSearchTags = request.getQueryString("assetSearchTags")
        
      val assetLatitude = request.getQueryString("assetLatitude")
        .map(value => value.toDouble)
        
      val assetLongitude = request.getQueryString("assetLongitude")
        .map(value => value.toDouble)
        
      api.updateNote(version, noteId, deviceId, accountId, comment, noteType, assetIds, tags, permissionableType, permissionableId, appKey, locationDescription, latitude, longitude, metaData, returnFullResponse, active, updateAsset, assetReturnNulls, assetAlbumId, assetCollectionId, assetAddToDefaultAlbum, assetAddToMediaLibrary, assetVersionCode, assetVersionName, assetMetaData, assetCaption, assetMedia, assetMediaUrl, assetMediaString, assetMediaStringFileName, assetMediaStringContentType, assetAttachedMedia, assetAttachedMediaUrl, assetAttachedMediaString, assetAttachedMediaStringFileName, assetAttachedMediaStringContentType, assetLocationDescription, assetApp, assetSearchTags, assetLatitude, assetLongitude)
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
