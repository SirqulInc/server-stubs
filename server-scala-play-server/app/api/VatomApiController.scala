package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class VatomApiController @Inject()(cc: ControllerComponents, api: VatomApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/vatom/me/rels/following/create?accountId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def createFollowing(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomParameters", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.createFollowing(accountId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/vatom/b/spaces/create?accountId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def createSpace(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomParameters", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.createSpace(accountId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/vatom/b/events/create?accountId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def createVatomEvent(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomParameters", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.createVatomEvent(accountId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/vatom/me/rels/following/delete?accountId=[value]&vatomRelsKey=[value]&returnRawResponse=[value]
    */
  def deleteFollowing(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomRelsKey = request.getQueryString("vatomRelsKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomRelsKey", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.deleteFollowing(accountId, vatomRelsKey, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/vatom/b/campaign/points/delete?accountId=[value]&appKey=[value]&vatomCampaignId=[value]&returnRawResponse=[value]
    */
  def deletePointsBalance(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomCampaignId = request.getQueryString("vatomCampaignId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomCampaignId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.deletePointsBalance(accountId, appKey, vatomCampaignId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/vatom/b/spaces/delete?accountId=[value]&appKey=[value]&vatomSpaceId=[value]&returnRawResponse=[value]
    */
  def deleteSpace(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomSpaceId = request.getQueryString("vatomSpaceId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomSpaceId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.deleteSpace(accountId, appKey, vatomSpaceId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/vatom/b/events/delete?accountId=[value]&appKey=[value]&vatomEventId=[value]&returnRawResponse=[value]
    */
  def deleteVatomEvent(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomEventId = request.getQueryString("vatomEventId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomEventId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.deleteVatomEvent(accountId, appKey, vatomEventId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/vatom/vatoms/delete?accountId=[value]&vatomId=[value]&returnRawResponse=[value]
    */
  def deleteVatomNFT(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomId = request.getQueryString("vatomId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.deleteVatomNFT(accountId, vatomId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/vatom/vatoms/execute-action?accountId=[value]&vatomId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def executeActionOnNFT(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomId = request.getQueryString("vatomId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomId", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomParameters", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.executeActionOnNFT(accountId, vatomId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/vatoms/geo-map/search?accountId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def geomapSearch(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomParameters", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.geomapSearch(accountId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/b/behaviors?accountId=[value]&appKey=[value]&returnRawResponse=[value]
    */
  def getBusinessBehaviors(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getBusinessBehaviors(accountId, appKey, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/b/coins/get?accountId=[value]&appKey=[value]&returnRawResponse=[value]
    */
  def getBusinessCoinsBalance(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getBusinessCoinsBalance(accountId, appKey, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/me/businesses?accountId=[value]&returnRawResponse=[value]
    */
  def getBusinessIds(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getBusinessIds(accountId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/b/get?accountId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def getBusinessInfo(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getBusinessInfo(accountId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/b/users?accountId=[value]&appKey=[value]&returnRawResponse=[value]
    */
  def getBusinessUsers(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getBusinessUsers(accountId, appKey, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/b/campaign-groups/entities?accountId=[value]&appKey=[value]&vatomCampaignId=[value]&returnRawResponse=[value]
    */
  def getCampaignGroupEntities(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomCampaignId = request.getQueryString("vatomCampaignId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomCampaignId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getCampaignGroupEntities(accountId, appKey, vatomCampaignId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/b/campaign-groups/rules?accountId=[value]&appKey=[value]&vatomCampaignId=[value]&returnRawResponse=[value]
    */
  def getCampaignGroupRules(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomCampaignId = request.getQueryString("vatomCampaignId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomCampaignId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getCampaignGroupRules(accountId, appKey, vatomCampaignId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/b/campaign-groups/stats?accountId=[value]&appKey=[value]&vatomCampaignId=[value]&returnRawResponse=[value]
    */
  def getCampaignGroupStats(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomCampaignId = request.getQueryString("vatomCampaignId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomCampaignId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getCampaignGroupStats(accountId, appKey, vatomCampaignId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/b/campaign-groups/get?accountId=[value]&appKey=[value]&vatomCampaignId=[value]&returnRawResponse=[value]
    */
  def getCampaignInfo(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomCampaignId = request.getQueryString("vatomCampaignId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomCampaignId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getCampaignInfo(accountId, appKey, vatomCampaignId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/b/events/guests/get?accountId=[value]&appKey=[value]&vatomEventId=[value]&returnRawResponse=[value]
    */
  def getEventGuestList(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomEventId = request.getQueryString("vatomEventId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomEventId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getEventGuestList(accountId, appKey, vatomEventId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/me/inventory?accountId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def getInventory(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomParameters", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getInventory(accountId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/me/rels/following?accountId=[value]&returnRawResponse=[value]
    */
  def getMyFollowing(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getMyFollowing(accountId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/u/campaign/points/get?accountId=[value]&vatomUserId=[value]&vatomCampaignId=[value]&returnRawResponse=[value]
    */
  def getPointsBalance(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomUserId = request.getQueryString("vatomUserId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomUserId", "query string")
        }
        
      val vatomCampaignId = request.getQueryString("vatomCampaignId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomCampaignId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getPointsBalance(accountId, vatomUserId, vatomCampaignId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/b/campaign/u/points/get?accountId=[value]&appKey=[value]&vatomUserId=[value]&vatomCampaignId=[value]&returnRawResponse=[value]
    */
  def getPointsBalanceAsBusiness(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomUserId = request.getQueryString("vatomUserId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomUserId", "query string")
        }
        
      val vatomCampaignId = request.getQueryString("vatomCampaignId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomCampaignId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getPointsBalanceAsBusiness(accountId, appKey, vatomUserId, vatomCampaignId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/b/spaces/get?accountId=[value]&appKey=[value]&vatomSpaceId=[value]&returnRawResponse=[value]
    */
  def getSpace(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomSpaceId = request.getQueryString("vatomSpaceId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomSpaceId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getSpace(accountId, appKey, vatomSpaceId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/b/users/coins/get?accountId=[value]&vatomUserId=[value]&appKey=[value]&returnRawResponse=[value]
    */
  def getUserCoinsAsBusiness(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomUserId = request.getQueryString("vatomUserId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomUserId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getUserCoinsAsBusiness(accountId, vatomUserId, appKey, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/u/coins/get?accountId=[value]&vatomUserId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def getUserCoinsBalance(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomUserId = request.getQueryString("vatomUserId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomUserId", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getUserCoinsBalance(accountId, vatomUserId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/users/rels/followers?accountId=[value]&vatomUserId=[value]&returnRawResponse=[value]
    */
  def getUserFollowers(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomUserId = request.getQueryString("vatomUserId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomUserId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getUserFollowers(accountId, vatomUserId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/users/rels/following?accountId=[value]&vatomUserId=[value]&returnRawResponse=[value]
    */
  def getUserFollowing(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomUserId = request.getQueryString("vatomUserId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomUserId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getUserFollowing(accountId, vatomUserId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/user/get?accountId=[value]&vatomUserId=[value]&returnRawResponse=[value]
    */
  def getUserInfo(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomUserId = request.getQueryString("vatomUserId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomUserId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getUserInfo(accountId, vatomUserId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/me/get?accountId=[value]&returnRawResponse=[value]
    */
  def getUserProfile(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getUserProfile(accountId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/b/events/get?accountId=[value]&appKey=[value]&vatomEventId=[value]&returnRawResponse=[value]
    */
  def getVatomEvent(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomEventId = request.getQueryString("vatomEventId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomEventId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getVatomEvent(accountId, appKey, vatomEventId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/vatoms/get?accountId=[value]&vatomId=[value]&returnRawResponse=[value]
    */
  def getVatomNFT(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomId = request.getQueryString("vatomId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getVatomNFT(accountId, vatomId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/b/communities/search?accountId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def listCommunities(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.listCommunities(accountId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/b/events/search?accountId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def listEvents(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.listEvents(accountId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/b/spaces/search?accountId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def listSpaces(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.listSpaces(accountId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/u/coins/txns/search?accountId=[value]&vatomUserId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def listUserCoinTransactions(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomUserId = request.getQueryString("vatomUserId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomUserId", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.listUserCoinTransactions(accountId, vatomUserId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/b/users/coins/txns/search?accountId=[value]&vatomUserId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def listUserCoinTransactionsAsBusiness(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomUserId = request.getQueryString("vatomUserId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomUserId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.listUserCoinTransactionsAsBusiness(accountId, vatomUserId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/vatom/me/vatoms/actions?accountId=[value]&vatomId=[value]&vatomAction=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def performActionOnNFT(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomId = request.getQueryString("vatomId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomId", "query string")
        }
        
      val vatomAction = request.getQueryString("vatomAction")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomAction", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomParameters", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.performActionOnNFT(accountId, vatomId, vatomAction, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/vatom/b/redemptions?accountId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def redeemNFT(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomParameters", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.redeemNFT(accountId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/vatom/b/users/coins/redeem?accountId=[value]&vatomUserId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def redeemUserCoinsAsBusiness(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomUserId = request.getQueryString("vatomUserId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomUserId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomParameters", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.redeemUserCoinsAsBusiness(accountId, vatomUserId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/b/search?accountId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def searchBusinesses(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.searchBusinesses(accountId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/b/campaign-groups/search?accountId=[value]&appKey=[value]&returnRawResponse=[value]
    */
  def searchCampaignGroups(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.searchCampaignGroups(accountId, appKey, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/me/identities/search?accountId=[value]&returnRawResponse=[value]
    */
  def searchIdentities(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.searchIdentities(accountId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vatom/user-inventory/search?accountId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def searchInventory(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.searchInventory(accountId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/vatom/b/campaigns/send?accountId=[value]&appKey=[value]&vatomCampaignId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def sendNFT(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomCampaignId = request.getQueryString("vatomCampaignId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomCampaignId", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomParameters", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.sendNFT(accountId, appKey, vatomCampaignId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/vatom/b/campaign/u/points/update?accountId=[value]&appKey=[value]&vatomUserId=[value]&vatomCampaignId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def setPointsBalanceAsBusiness(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomUserId = request.getQueryString("vatomUserId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomUserId", "query string")
        }
        
      val vatomCampaignId = request.getQueryString("vatomCampaignId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomCampaignId", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomParameters", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.setPointsBalanceAsBusiness(accountId, appKey, vatomUserId, vatomCampaignId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/vatom/u/coins/transfer?accountId=[value]&vatomUserId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def transferUserCoins(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomUserId = request.getQueryString("vatomUserId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomUserId", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomParameters", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.transferUserCoins(accountId, vatomUserId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/vatom/b/coins/update?accountId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def updateBusinessCoins(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomParameters", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.updateBusinessCoins(accountId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/vatom/b/events/guests/update?accountId=[value]&appKey=[value]&vatomEventId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def updateEventGuestList(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomEventId = request.getQueryString("vatomEventId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomEventId", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomParameters", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.updateEventGuestList(accountId, appKey, vatomEventId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/vatom/b/spaces/update?accountId=[value]&appKey=[value]&vatomSpaceId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def updateSpace(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomSpaceId = request.getQueryString("vatomSpaceId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomSpaceId", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomParameters", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.updateSpace(accountId, appKey, vatomSpaceId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/vatom/b/users/coins/update?accountId=[value]&vatomUserId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def updateUserCoinsAsBusiness(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomUserId = request.getQueryString("vatomUserId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomUserId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomParameters", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.updateUserCoinsAsBusiness(accountId, vatomUserId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/vatom/me/update?accountId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def updateUserProfile(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomParameters", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.updateUserProfile(accountId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/vatom/b/events/update?accountId=[value]&appKey=[value]&vatomEventId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def updateVatomEvent(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val vatomEventId = request.getQueryString("vatomEventId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomEventId", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vatomParameters", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.updateVatomEvent(accountId, appKey, vatomEventId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
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
