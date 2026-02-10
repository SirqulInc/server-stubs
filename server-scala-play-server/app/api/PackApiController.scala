package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.PackResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class PackApiController @Inject()(cc: ControllerComponents, api: PackApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/pack/create?accountId=[value]&title=[value]&description=[value]&searchTags=[value]&active=[value]&gameType=[value]&appKey=[value]&packType=[value]&packOrder=[value]&sequenceType=[value]&backgroundId=[value]&imageId=[value]&startDate=[value]&endDate=[value]&authorOverride=[value]&price=[value]&priceType=[value]&gameLevelIds=[value]&inGame=[value]&highest=[value]&allocateTickets=[value]&ticketCount=[value]&ticketType=[value]&points=[value]
    */
  def createPack(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): PackResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val title = request.getQueryString("title")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("title", "query string")
        }
        
      val description = request.getQueryString("description")
        
      val searchTags = request.getQueryString("searchTags")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val packType = request.getQueryString("packType")
        
      val packOrder = request.getQueryString("packOrder")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("packOrder", "query string")
        }
        
      val sequenceType = request.getQueryString("sequenceType")
        
      val backgroundId = request.getQueryString("backgroundId")
        .map(value => value.toLong)
        
      val imageId = request.getQueryString("imageId")
        .map(value => value.toLong)
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val authorOverride = request.getQueryString("authorOverride")
        
      val price = request.getQueryString("price")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("price", "query string")
        }
        
      val priceType = request.getQueryString("priceType")
        
      val gameLevelIds = request.getQueryString("gameLevelIds")
        
      val inGame = request.getQueryString("inGame")
        .map(value => value.toBoolean)
        
      val highest = request.getQueryString("highest")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("highest", "query string")
        }
        
      val allocateTickets = request.getQueryString("allocateTickets")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("allocateTickets", "query string")
        }
        
      val ticketCount = request.getQueryString("ticketCount")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ticketCount", "query string")
        }
        
      val ticketType = request.getQueryString("ticketType")
        
      val points = request.getQueryString("points")
        .map(value => value.toLong)
        
      api.createPack(version, accountId, title, packOrder, price, highest, allocateTickets, ticketCount, description, searchTags, active, gameType, appKey, packType, sequenceType, backgroundId, imageId, startDate, endDate, authorOverride, priceType, gameLevelIds, inGame, ticketType, points)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/pack/delete?accountId=[value]&packId=[value]
    */
  def deletePack(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val packId = request.getQueryString("packId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("packId", "query string")
        }
        
      api.deletePack(version, accountId, packId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/pack/get?accountId=[value]&packId=[value]&includeGameData=[value]
    */
  def getPack(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): PackResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val packId = request.getQueryString("packId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("packId", "query string")
        }
        
      val includeGameData = request.getQueryString("includeGameData")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("includeGameData", "query string")
        }
        
      api.getPack(version, accountId, packId, includeGameData)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/pack/search?accountId=[value]&keyword=[value]&packType=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&includeGameData=[value]&includeInactive=[value]&appKey=[value]
    */
  def searchPacks(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[PackResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val keyword = request.getQueryString("keyword")
        
      val packType = request.getQueryString("packType")
        
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
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val includeGameData = request.getQueryString("includeGameData")
        .map(value => value.toBoolean)
        
      val includeInactive = request.getQueryString("includeInactive")
        .map(value => value.toBoolean)
        
      val appKey = request.getQueryString("appKey")
        
      api.searchPacks(version, accountId, sortField, descending, keyword, packType, start, limit, includeGameData, includeInactive, appKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/pack/update?accountId=[value]&packId=[value]&title=[value]&description=[value]&searchTags=[value]&active=[value]&gameType=[value]&appKey=[value]&packType=[value]&packOrder=[value]&sequenceType=[value]&backgroundId=[value]&imageId=[value]&startDate=[value]&endDate=[value]&authorOverride=[value]&price=[value]&priceType=[value]&gameLevelIds=[value]&inGame=[value]&highest=[value]&allocateTickets=[value]&ticketCount=[value]&ticketType=[value]&points=[value]
    */
  def updatePack(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): PackResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val packId = request.getQueryString("packId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("packId", "query string")
        }
        
      val title = request.getQueryString("title")
        
      val description = request.getQueryString("description")
        
      val searchTags = request.getQueryString("searchTags")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val packType = request.getQueryString("packType")
        
      val packOrder = request.getQueryString("packOrder")
        .map(value => value.toLong)
        
      val sequenceType = request.getQueryString("sequenceType")
        
      val backgroundId = request.getQueryString("backgroundId")
        .map(value => value.toLong)
        
      val imageId = request.getQueryString("imageId")
        .map(value => value.toLong)
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val authorOverride = request.getQueryString("authorOverride")
        
      val price = request.getQueryString("price")
        .map(value => value.toInt)
        
      val priceType = request.getQueryString("priceType")
        
      val gameLevelIds = request.getQueryString("gameLevelIds")
        
      val inGame = request.getQueryString("inGame")
        .map(value => value.toBoolean)
        
      val highest = request.getQueryString("highest")
        .map(value => value.toBoolean)
        
      val allocateTickets = request.getQueryString("allocateTickets")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("allocateTickets", "query string")
        }
        
      val ticketCount = request.getQueryString("ticketCount")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ticketCount", "query string")
        }
        
      val ticketType = request.getQueryString("ticketType")
        
      val points = request.getQueryString("points")
        .map(value => value.toLong)
        
      api.updatePack(version, accountId, packId, allocateTickets, ticketCount, title, description, searchTags, active, gameType, appKey, packType, packOrder, sequenceType, backgroundId, imageId, startDate, endDate, authorOverride, price, priceType, gameLevelIds, inGame, highest, ticketType, points)
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
