package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.ConsumerInviteResponse
import model.InviteResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class InviteApiController @Inject()(cc: ControllerComponents, api: InviteApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/invite/accept?token=[value]&accountId=[value]&albumId=[value]&missionId=[value]&albumContestId=[value]&offerId=[value]&offerLocationId=[value]&retailerLocationId=[value]&appKey=[value]&autoFriend=[value]&autoAttendEvent=[value]&autoFavoriteOffer=[value]&autoFavoriteOfferLocation=[value]&autoFavoriteRetailerLocation=[value]
    */
  def acceptInvite(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ConsumerInviteResponse = {
      val token = request.getQueryString("token")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("token", "query string")
        }
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val albumId = request.getQueryString("albumId")
        .map(value => value.toLong)
        
      val missionId = request.getQueryString("missionId")
        .map(value => value.toLong)
        
      val albumContestId = request.getQueryString("albumContestId")
        .map(value => value.toLong)
        
      val offerId = request.getQueryString("offerId")
        .map(value => value.toLong)
        
      val offerLocationId = request.getQueryString("offerLocationId")
        .map(value => value.toLong)
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val autoFriend = request.getQueryString("autoFriend")
        .map(value => value.toBoolean)
        
      val autoAttendEvent = request.getQueryString("autoAttendEvent")
        .map(value => value.toBoolean)
        
      val autoFavoriteOffer = request.getQueryString("autoFavoriteOffer")
        .map(value => value.toBoolean)
        
      val autoFavoriteOfferLocation = request.getQueryString("autoFavoriteOfferLocation")
        .map(value => value.toBoolean)
        
      val autoFavoriteRetailerLocation = request.getQueryString("autoFavoriteRetailerLocation")
        .map(value => value.toBoolean)
        
      api.acceptInvite(version, token, accountId, albumId, missionId, albumContestId, offerId, offerLocationId, retailerLocationId, appKey, autoFriend, autoAttendEvent, autoFavoriteOffer, autoFavoriteOfferLocation, autoFavoriteRetailerLocation)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/invite/albumContest?deviceId=[value]&accountId=[value]&appId=[value]&appKey=[value]&albumContestId=[value]&latitude=[value]&longitude=[value]
    */
  def albumContestInvite(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): InviteResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appId = request.getQueryString("appId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val albumContestId = request.getQueryString("albumContestId")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.albumContestInvite(version, deviceId, accountId, appId, appKey, albumContestId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/invite/album?deviceId=[value]&accountId=[value]&appId=[value]&appKey=[value]&albumId=[value]&latitude=[value]&longitude=[value]
    */
  def albumInvite(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): InviteResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appId = request.getQueryString("appId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val albumId = request.getQueryString("albumId")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.albumInvite(version, deviceId, accountId, appId, appKey, albumId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/invite/event?accountId=[value]&receiverAccountIds=[value]&appKey=[value]&listingId=[value]&retailerLocationId=[value]
    */
  def eventInvite(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): InviteResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val receiverAccountIds = request.getQueryString("receiverAccountIds")
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val listingId = request.getQueryString("listingId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("listingId", "query string")
        }
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        
      api.eventInvite(version, accountId, appKey, listingId, receiverAccountIds, retailerLocationId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/invite/gameLevel?deviceId=[value]&accountId=[value]&appId=[value]&appKey=[value]&gameLevelId=[value]&latitude=[value]&longitude=[value]
    */
  def gameInvite(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): InviteResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appId = request.getQueryString("appId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val gameLevelId = request.getQueryString("gameLevelId")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.gameInvite(version, deviceId, accountId, appId, appKey, gameLevelId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/invite/get?accountId=[value]&token=[value]&albumId=[value]&missionId=[value]&albumContestId=[value]&offerId=[value]&offerLocationId=[value]&retailerLocationId=[value]&appKey=[value]
    */
  def getInvite(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val token = request.getQueryString("token")
        
      val albumId = request.getQueryString("albumId")
        .map(value => value.toLong)
        
      val missionId = request.getQueryString("missionId")
        .map(value => value.toLong)
        
      val albumContestId = request.getQueryString("albumContestId")
        .map(value => value.toLong)
        
      val offerId = request.getQueryString("offerId")
        .map(value => value.toLong)
        
      val offerLocationId = request.getQueryString("offerLocationId")
        .map(value => value.toLong)
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      api.getInvite(version, accountId, token, albumId, missionId, albumContestId, offerId, offerLocationId, retailerLocationId, appKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/invite/mission?deviceId=[value]&accountId=[value]&appId=[value]&appKey=[value]&missionId=[value]&latitude=[value]&longitude=[value]
    */
  def missionInvite(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): InviteResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appId = request.getQueryString("appId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val missionId = request.getQueryString("missionId")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.missionInvite(version, deviceId, accountId, appId, appKey, missionId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/invite/offer?accountId=[value]&appKey=[value]&offerId=[value]
    */
  def offerInvite(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): InviteResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val offerId = request.getQueryString("offerId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("offerId", "query string")
        }
        
      api.offerInvite(version, accountId, appKey, offerId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/invite/offerLocation?accountId=[value]&appKey=[value]&offerLocationId=[value]
    */
  def offerLocationInvite(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): InviteResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val offerLocationId = request.getQueryString("offerLocationId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("offerLocationId", "query string")
        }
        
      api.offerLocationInvite(version, accountId, appKey, offerLocationId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/invite/retailerLocation?accountId=[value]&appKey=[value]&retailerLocationId=[value]&albumId=[value]
    */
  def retailerLocationInvite(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): InviteResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("retailerLocationId", "query string")
        }
        
      val albumId = request.getQueryString("albumId")
        .map(value => value.toLong)
        
      api.retailerLocationInvite(version, accountId, appKey, retailerLocationId, albumId)
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
