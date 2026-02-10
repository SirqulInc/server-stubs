package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class VatomApiController @Inject()(cc: ControllerComponents, api: VatomApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/vatom/me/rels/following/create?accountId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def createFollowing(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.createFollowing(version, accountId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/vatom/b/spaces/create?accountId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def createSpace(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.createSpace(version, accountId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/vatom/b/events/create?accountId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def createVatomEvent(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.createVatomEvent(version, accountId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/vatom/me/rels/following/delete?accountId=[value]&vatomRelsKey=[value]&returnRawResponse=[value]
    */
  def deleteFollowing(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.deleteFollowing(version, accountId, vatomRelsKey, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/vatom/b/campaign/points/delete?accountId=[value]&appKey=[value]&vatomCampaignId=[value]&returnRawResponse=[value]
    */
  def deletePointsBalance(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.deletePointsBalance(version, accountId, appKey, vatomCampaignId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/vatom/b/spaces/delete?accountId=[value]&appKey=[value]&vatomSpaceId=[value]&returnRawResponse=[value]
    */
  def deleteSpace(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.deleteSpace(version, accountId, appKey, vatomSpaceId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/vatom/b/events/delete?accountId=[value]&appKey=[value]&vatomEventId=[value]&returnRawResponse=[value]
    */
  def deleteVatomEvent(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.deleteVatomEvent(version, accountId, appKey, vatomEventId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/vatom/vatoms/delete?accountId=[value]&vatomId=[value]&returnRawResponse=[value]
    */
  def deleteVatomNFT(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.deleteVatomNFT(version, accountId, vatomId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/vatom/vatoms/execute-action?accountId=[value]&vatomId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def executeActionOnNFT(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.executeActionOnNFT(version, accountId, vatomId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/vatoms/geo-map/search?accountId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def geomapSearch(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.geomapSearch(version, accountId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/b/behaviors?accountId=[value]&appKey=[value]&returnRawResponse=[value]
    */
  def getBusinessBehaviors(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.getBusinessBehaviors(version, accountId, appKey, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/b/coins/get?accountId=[value]&appKey=[value]&returnRawResponse=[value]
    */
  def getBusinessCoinsBalance(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.getBusinessCoinsBalance(version, accountId, appKey, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/me/businesses?accountId=[value]&returnRawResponse=[value]
    */
  def getBusinessIds(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getBusinessIds(version, accountId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/b/get?accountId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def getBusinessInfo(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.getBusinessInfo(version, accountId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/b/users?accountId=[value]&appKey=[value]&returnRawResponse=[value]
    */
  def getBusinessUsers(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.getBusinessUsers(version, accountId, appKey, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/b/campaign-groups/entities?accountId=[value]&appKey=[value]&vatomCampaignId=[value]&returnRawResponse=[value]
    */
  def getCampaignGroupEntities(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.getCampaignGroupEntities(version, accountId, appKey, vatomCampaignId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/b/campaign-groups/rules?accountId=[value]&appKey=[value]&vatomCampaignId=[value]&returnRawResponse=[value]
    */
  def getCampaignGroupRules(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.getCampaignGroupRules(version, accountId, appKey, vatomCampaignId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/b/campaign-groups/stats?accountId=[value]&appKey=[value]&vatomCampaignId=[value]&returnRawResponse=[value]
    */
  def getCampaignGroupStats(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.getCampaignGroupStats(version, accountId, appKey, vatomCampaignId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/b/campaign-groups/get?accountId=[value]&appKey=[value]&vatomCampaignId=[value]&returnRawResponse=[value]
    */
  def getCampaignInfo(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.getCampaignInfo(version, accountId, appKey, vatomCampaignId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/b/events/guests/get?accountId=[value]&appKey=[value]&vatomEventId=[value]&returnRawResponse=[value]
    */
  def getEventGuestList(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.getEventGuestList(version, accountId, appKey, vatomEventId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/me/inventory?accountId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def getInventory(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.getInventory(version, accountId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/me/rels/following?accountId=[value]&returnRawResponse=[value]
    */
  def getMyFollowing(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getMyFollowing(version, accountId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/u/campaign/points/get?accountId=[value]&vatomUserId=[value]&vatomCampaignId=[value]&returnRawResponse=[value]
    */
  def getPointsBalance(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.getPointsBalance(version, accountId, vatomUserId, vatomCampaignId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/b/campaign/u/points/get?accountId=[value]&appKey=[value]&vatomUserId=[value]&vatomCampaignId=[value]&returnRawResponse=[value]
    */
  def getPointsBalanceAsBusiness(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.getPointsBalanceAsBusiness(version, accountId, appKey, vatomUserId, vatomCampaignId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/b/spaces/get?accountId=[value]&appKey=[value]&vatomSpaceId=[value]&returnRawResponse=[value]
    */
  def getSpace(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.getSpace(version, accountId, appKey, vatomSpaceId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/b/users/coins/get?accountId=[value]&vatomUserId=[value]&appKey=[value]&returnRawResponse=[value]
    */
  def getUserCoinsAsBusiness(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.getUserCoinsAsBusiness(version, accountId, vatomUserId, appKey, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/u/coins/get?accountId=[value]&vatomUserId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def getUserCoinsBalance(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.getUserCoinsBalance(version, accountId, vatomUserId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/users/rels/followers?accountId=[value]&vatomUserId=[value]&returnRawResponse=[value]
    */
  def getUserFollowers(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.getUserFollowers(version, accountId, vatomUserId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/users/rels/following?accountId=[value]&vatomUserId=[value]&returnRawResponse=[value]
    */
  def getUserFollowing(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.getUserFollowing(version, accountId, vatomUserId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/user/get?accountId=[value]&vatomUserId=[value]&returnRawResponse=[value]
    */
  def getUserInfo(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.getUserInfo(version, accountId, vatomUserId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/me/get?accountId=[value]&returnRawResponse=[value]
    */
  def getUserProfile(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.getUserProfile(version, accountId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/b/events/get?accountId=[value]&appKey=[value]&vatomEventId=[value]&returnRawResponse=[value]
    */
  def getVatomEvent(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.getVatomEvent(version, accountId, appKey, vatomEventId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/vatoms/get?accountId=[value]&vatomId=[value]&returnRawResponse=[value]
    */
  def getVatomNFT(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.getVatomNFT(version, accountId, vatomId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/b/communities/search?accountId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def listCommunities(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.listCommunities(version, accountId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/b/events/search?accountId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def listEvents(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.listEvents(version, accountId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/b/spaces/search?accountId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def listSpaces(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.listSpaces(version, accountId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/u/coins/txns/search?accountId=[value]&vatomUserId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def listUserCoinTransactions(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.listUserCoinTransactions(version, accountId, vatomUserId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/b/users/coins/txns/search?accountId=[value]&vatomUserId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def listUserCoinTransactionsAsBusiness(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.listUserCoinTransactionsAsBusiness(version, accountId, vatomUserId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/vatom/me/vatoms/actions?accountId=[value]&vatomId=[value]&vatomAction=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def performActionOnNFT(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.performActionOnNFT(version, accountId, vatomId, vatomAction, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/vatom/b/redemptions?accountId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def redeemNFT(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.redeemNFT(version, accountId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/vatom/b/users/coins/redeem?accountId=[value]&vatomUserId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def redeemUserCoinsAsBusiness(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.redeemUserCoinsAsBusiness(version, accountId, vatomUserId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/b/search?accountId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def searchBusinesses(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.searchBusinesses(version, accountId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/b/campaign-groups/search?accountId=[value]&appKey=[value]&returnRawResponse=[value]
    */
  def searchCampaignGroups(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.searchCampaignGroups(version, accountId, appKey, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/me/identities/search?accountId=[value]&returnRawResponse=[value]
    */
  def searchIdentities(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.searchIdentities(version, accountId, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vatom/user-inventory/search?accountId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def searchInventory(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val vatomParameters = request.getQueryString("vatomParameters")
        
      val returnRawResponse = request.getQueryString("returnRawResponse")
        .map(value => value.toBoolean)
        
      api.searchInventory(version, accountId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/vatom/b/campaigns/send?accountId=[value]&appKey=[value]&vatomCampaignId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def sendNFT(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.sendNFT(version, accountId, appKey, vatomCampaignId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/vatom/b/campaign/u/points/update?accountId=[value]&appKey=[value]&vatomUserId=[value]&vatomCampaignId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def setPointsBalanceAsBusiness(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.setPointsBalanceAsBusiness(version, accountId, appKey, vatomUserId, vatomCampaignId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/vatom/u/coins/transfer?accountId=[value]&vatomUserId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def transferUserCoins(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.transferUserCoins(version, accountId, vatomUserId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/vatom/b/coins/update?accountId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def updateBusinessCoins(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.updateBusinessCoins(version, accountId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/vatom/b/events/guests/update?accountId=[value]&appKey=[value]&vatomEventId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def updateEventGuestList(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.updateEventGuestList(version, accountId, appKey, vatomEventId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/vatom/b/spaces/update?accountId=[value]&appKey=[value]&vatomSpaceId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def updateSpace(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.updateSpace(version, accountId, appKey, vatomSpaceId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/vatom/b/users/coins/update?accountId=[value]&vatomUserId=[value]&appKey=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def updateUserCoinsAsBusiness(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.updateUserCoinsAsBusiness(version, accountId, vatomUserId, appKey, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/vatom/me/update?accountId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def updateUserProfile(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.updateUserProfile(version, accountId, vatomParameters, returnRawResponse)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/vatom/b/events/update?accountId=[value]&appKey=[value]&vatomEventId=[value]&vatomParameters=[value]&returnRawResponse=[value]
    */
  def updateVatomEvent(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.updateVatomEvent(version, accountId, appKey, vatomEventId, vatomParameters, returnRawResponse)
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
