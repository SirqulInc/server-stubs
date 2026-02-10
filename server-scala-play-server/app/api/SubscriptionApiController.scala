package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ApplicationUsageResponse
import model.BigDecimal
import model.SirqulResponse
import model.SubscriptionPlanResponse
import model.SubscriptionResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class SubscriptionApiController @Inject()(cc: ControllerComponents, api: SubscriptionApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/subscription/create?accountId=[value]&planId=[value]&promoCode=[value]
    */
  def createSubscription(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SubscriptionResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val planId = request.getQueryString("planId")
        .map(value => value.toLong)
        
      val promoCode = request.getQueryString("promoCode")
        
      api.createSubscription(version, accountId, planId, promoCode)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/subscription/delete?accountId=[value]
    */
  def deleteSubscription(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.deleteSubscription(version, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/subscription/get?accountId=[value]
    */
  def getSubscription(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SubscriptionResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getSubscription(version, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/subscription/plan/get?planId=[value]
    */
  def getSubscriptionPlan(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SubscriptionPlanResponse = {
      val planId = request.getQueryString("planId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("planId", "query string")
        }
        
      api.getSubscriptionPlan(version, planId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/subscription/plan/list?visible=[value]&role=[value]
    */
  def getSubscriptionPlans(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[SubscriptionPlanResponse] = {
      val visible = request.getQueryString("visible")
        .map(value => value.toBoolean)
        
      val role = request.getQueryString("role")
        
      api.getSubscriptionPlans(version, visible, role)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/subscription/usage/get?accountId=[value]&applicationId=[value]&start=[value]&end=[value]
    */
  def getSubscriptionUsage(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ApplicationUsageResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val applicationId = request.getQueryString("applicationId")
        .map(value => value.toLong)
        
      val start = request.getQueryString("start")
        .map(value => value.toLong)
        
      val end = request.getQueryString("end")
        .map(value => value.toLong)
        
      api.getSubscriptionUsage(version, accountId, applicationId, start, end)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/subscription/update?accountId=[value]&planId=[value]&promoCode=[value]&active=[value]
    */
  def updateSubscription(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SubscriptionResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val planId = request.getQueryString("planId")
        .map(value => value.toLong)
        
      val promoCode = request.getQueryString("promoCode")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      api.updateSubscription(version, accountId, planId, promoCode, active)
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
