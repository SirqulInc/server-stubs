package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ApplicationUsageResponse
import model.SirqulResponse
import model.SubscriptionPlanResponse
import model.SubscriptionResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class SubscriptionApiController @Inject()(cc: ControllerComponents, api: SubscriptionApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/subscription/create?accountId=[value]&planId=[value]&promoCode=[value]
    */
  def createSubscription(): Action[AnyContent] = Action { request =>
    def executeApi(): SubscriptionResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val planId = request.getQueryString("planId")
        .map(value => value.toLong)
        
      val promoCode = request.getQueryString("promoCode")
        
      api.createSubscription(accountId, planId, promoCode)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/subscription/delete?accountId=[value]
    */
  def deleteSubscription(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.deleteSubscription(accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/subscription/get?accountId=[value]
    */
  def getSubscription(): Action[AnyContent] = Action { request =>
    def executeApi(): SubscriptionResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getSubscription(accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/subscription/plan/get?planId=[value]
    */
  def getSubscriptionPlan(): Action[AnyContent] = Action { request =>
    def executeApi(): SubscriptionPlanResponse = {
      val planId = request.getQueryString("planId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("planId", "query string")
        }
        
      api.getSubscriptionPlan(planId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/subscription/plan/list?visible=[value]&role=[value]
    */
  def getSubscriptionPlans(): Action[AnyContent] = Action { request =>
    def executeApi(): List[SubscriptionPlanResponse] = {
      val visible = request.getQueryString("visible")
        .map(value => value.toBoolean)
        
      val role = request.getQueryString("role")
        
      api.getSubscriptionPlans(visible, role)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/subscription/usage/get?accountId=[value]&applicationId=[value]&start=[value]&end=[value]
    */
  def getSubscriptionUsage(): Action[AnyContent] = Action { request =>
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
        
      api.getSubscriptionUsage(accountId, applicationId, start, end)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/subscription/update?accountId=[value]&planId=[value]&promoCode=[value]&active=[value]
    */
  def updateSubscription(): Action[AnyContent] = Action { request =>
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
        
      api.updateSubscription(accountId, planId, promoCode, active)
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
