package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ConsumerInviteResponse
import model.InviteResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class InviteApiController @Inject()(cc: ControllerComponents, api: InviteApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/invite/accept?token=[value]&accountId=[value]&albumId=[value]&missionId=[value]&albumContestId=[value]&offerId=[value]&offerLocationId=[value]&retailerLocationId=[value]&appKey=[value]&autoFriend=[value]&autoAttendEvent=[value]&autoFavoriteOffer=[value]&autoFavoriteOfferLocation=[value]&autoFavoriteRetailerLocation=[value]
    */
  def acceptInvite(): Action[AnyContent] = Action { request =>
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
        
      api.acceptInvite(token, accountId, albumId, missionId, albumContestId, offerId, offerLocationId, retailerLocationId, appKey, autoFriend, autoAttendEvent, autoFavoriteOffer, autoFavoriteOfferLocation, autoFavoriteRetailerLocation)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/invite/albumContest?deviceId=[value]&accountId=[value]&appId=[value]&appKey=[value]&albumContestId=[value]&latitude=[value]&longitude=[value]
    */
  def albumContestInvite(): Action[AnyContent] = Action { request =>
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
        
      api.albumContestInvite(deviceId, accountId, appId, appKey, albumContestId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/invite/album?deviceId=[value]&accountId=[value]&appId=[value]&appKey=[value]&albumId=[value]&latitude=[value]&longitude=[value]
    */
  def albumInvite(): Action[AnyContent] = Action { request =>
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
        
      api.albumInvite(deviceId, accountId, appId, appKey, albumId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/invite/event?accountId=[value]&receiverAccountIds=[value]&appKey=[value]&listingId=[value]&retailerLocationId=[value]
    */
  def eventInvite(): Action[AnyContent] = Action { request =>
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
        
      api.eventInvite(accountId, appKey, listingId, receiverAccountIds, retailerLocationId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/invite/gameLevel?deviceId=[value]&accountId=[value]&appId=[value]&appKey=[value]&gameLevelId=[value]&latitude=[value]&longitude=[value]
    */
  def gameInvite(): Action[AnyContent] = Action { request =>
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
        
      api.gameInvite(deviceId, accountId, appId, appKey, gameLevelId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/invite/get?accountId=[value]&token=[value]&albumId=[value]&missionId=[value]&albumContestId=[value]&offerId=[value]&offerLocationId=[value]&retailerLocationId=[value]&appKey=[value]
    */
  def getInvite(): Action[AnyContent] = Action { request =>
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
        
      api.getInvite(accountId, token, albumId, missionId, albumContestId, offerId, offerLocationId, retailerLocationId, appKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/invite/mission?deviceId=[value]&accountId=[value]&appId=[value]&appKey=[value]&missionId=[value]&latitude=[value]&longitude=[value]
    */
  def missionInvite(): Action[AnyContent] = Action { request =>
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
        
      api.missionInvite(deviceId, accountId, appId, appKey, missionId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/invite/offer?accountId=[value]&appKey=[value]&offerId=[value]
    */
  def offerInvite(): Action[AnyContent] = Action { request =>
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
        
      api.offerInvite(accountId, appKey, offerId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/invite/offerLocation?accountId=[value]&appKey=[value]&offerLocationId=[value]
    */
  def offerLocationInvite(): Action[AnyContent] = Action { request =>
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
        
      api.offerLocationInvite(accountId, appKey, offerLocationId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/invite/retailerLocation?accountId=[value]&appKey=[value]&retailerLocationId=[value]&albumId=[value]
    */
  def retailerLocationInvite(): Action[AnyContent] = Action { request =>
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
        
      api.retailerLocationInvite(accountId, appKey, retailerLocationId, albumId)
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
