package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.PurchaseItemListResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile
import model.ThemeDescriptorResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class ThemeDescriptorApiController @Inject()(cc: ControllerComponents, api: ThemeDescriptorApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/consumer/theme?deviceId=[value]&accountId=[value]&gameType=[value]&themeDescriptorId=[value]&title=[value]&description=[value]&publicRead=[value]&publicWrite=[value]&publicDelete=[value]&publicAdd=[value]&visibility=[value]&connectionIdsToAdd=[value]&connectionGroupIdsToAdd=[value]&includeFriendGroup=[value]&appVersion=[value]&colorValueJson=[value]&stringReplacerJson=[value]&customJsonObjects=[value]&iconImage=[value]&sceneAtlasImage=[value]&bgImage=[value]&bgSound=[value]&musicSelection=[value]&completeWithDefaultValues=[value]&locationDescription=[value]&latitude=[value]&longitude=[value]
    */
  def addOrUpdateThemeDescriptor(): Action[AnyContent] = Action { request =>
    def executeApi(): ThemeDescriptorResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val gameType = request.getQueryString("gameType")
        
      val themeDescriptorId = request.getQueryString("themeDescriptorId")
        .map(value => value.toLong)
        
      val title = request.getQueryString("title")
        
      val description = request.getQueryString("description")
        
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
        
      val visibility = request.getQueryString("visibility")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("visibility", "query string")
        }
        
      val connectionIdsToAdd = request.getQueryString("connectionIdsToAdd")
        
      val connectionGroupIdsToAdd = request.getQueryString("connectionGroupIdsToAdd")
        
      val includeFriendGroup = request.getQueryString("includeFriendGroup")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("includeFriendGroup", "query string")
        }
        
      val appVersion = request.getQueryString("appVersion")
        
      val colorValueJson = request.getQueryString("colorValueJson")
        
      val stringReplacerJson = request.getQueryString("stringReplacerJson")
        
      val customJsonObjects = request.getQueryString("customJsonObjects")
        
      val iconImage = request.getQueryString("iconImage")
        
      val sceneAtlasImage = request.getQueryString("sceneAtlasImage")
        
      val bgImage = request.getQueryString("bgImage")
        
      val bgSound = request.getQueryString("bgSound")
        
      val musicSelection = request.getQueryString("musicSelection")
        
      val completeWithDefaultValues = request.getQueryString("completeWithDefaultValues")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("completeWithDefaultValues", "query string")
        }
        
      val locationDescription = request.getQueryString("locationDescription")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.addOrUpdateThemeDescriptor(publicRead, publicWrite, publicDelete, publicAdd, visibility, includeFriendGroup, completeWithDefaultValues, deviceId, accountId, gameType, themeDescriptorId, title, description, connectionIdsToAdd, connectionGroupIdsToAdd, appVersion, colorValueJson, stringReplacerJson, customJsonObjects, iconImage, sceneAtlasImage, bgImage, bgSound, musicSelection, locationDescription, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/consumer/theme/get?deviceId=[value]&accountId=[value]&gameType=[value]&themeDescriptorId=[value]&latitude=[value]&longitude=[value]
    */
  def getThemeDescriptor(): Action[AnyContent] = Action { request =>
    def executeApi(): PurchaseItemListResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val gameType = request.getQueryString("gameType")
        
      val themeDescriptorId = request.getQueryString("themeDescriptorId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("themeDescriptorId", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.getThemeDescriptor(themeDescriptorId, deviceId, accountId, gameType, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/consumer/theme/search?deviceId=[value]&accountId=[value]&gameType=[value]&contestType=[value]&ownerId=[value]&q=[value]&keyword=[value]&filter=[value]&sortField=[value]&descending=[value]&i=[value]&start=[value]&l=[value]&limit=[value]&dateCreated=[value]&appVersion=[value]&latitude=[value]&longitude=[value]
    */
  def getThemeDescriptors(): Action[AnyContent] = Action { request =>
    def executeApi(): PurchaseItemListResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val gameType = request.getQueryString("gameType")
        
      val contestType = request.getQueryString("contestType")
        
      val ownerId = request.getQueryString("ownerId")
        .map(value => value.toLong)
        
      val q = request.getQueryString("q")
        
      val keyword = request.getQueryString("keyword")
        
      val filter = request.getQueryString("filter")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("filter", "query string")
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
        
      val dateCreated = request.getQueryString("dateCreated")
        .map(value => value.toLong)
        
      val appVersion = request.getQueryString("appVersion")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.getThemeDescriptors(filter, sortField, descending, start, limit, deviceId, accountId, gameType, contestType, ownerId, q, keyword, i, l, dateCreated, appVersion, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/consumer/theme/remove?deviceId=[value]&accountId=[value]&gameType=[value]&themeDescriptorId=[value]&latitude=[value]&longitude=[value]
    */
  def removeThemeDescriptor(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val gameType = request.getQueryString("gameType")
        
      val themeDescriptorId = request.getQueryString("themeDescriptorId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("themeDescriptorId", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.removeThemeDescriptor(themeDescriptorId, deviceId, accountId, gameType, latitude, longitude)
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
