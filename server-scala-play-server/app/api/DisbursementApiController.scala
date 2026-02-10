package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.DisbursementResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class DisbursementApiController @Inject()(cc: ControllerComponents, api: DisbursementApi) extends AbstractController(cc) {
  /**
    * GET /api/:version/disbursement/check?disbursementId=[value]
    */
  def checkDisbursements(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): DisbursementResponse = {
      val disbursementId = request.getQueryString("disbursementId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("disbursementId", "query string")
        }
        
      api.checkDisbursements(version, disbursementId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/disbursement/create?accountId=[value]&receiverAccountId=[value]&originalSenderAccountId=[value]&amount=[value]&provider=[value]&scheduledDate=[value]&title=[value]&comment=[value]&externalId=[value]&introspectionParams=[value]
    */
  def createDisbursement(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): DisbursementResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val receiverAccountId = request.getQueryString("receiverAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("receiverAccountId", "query string")
        }
        
      val originalSenderAccountId = request.getQueryString("originalSenderAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("originalSenderAccountId", "query string")
        }
        
      val amount = request.getQueryString("amount")
        .map(value => BigDecimal(value))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("amount", "query string")
        }
        
      val provider = request.getQueryString("provider")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("provider", "query string")
        }
        
      val scheduledDate = request.getQueryString("scheduledDate")
        .map(value => value.toLong)
        
      val title = request.getQueryString("title")
        
      val comment = request.getQueryString("comment")
        
      val externalId = request.getQueryString("externalId")
        
      val introspectionParams = request.getQueryString("introspectionParams")
        
      api.createDisbursement(version, accountId, receiverAccountId, originalSenderAccountId, amount, provider, scheduledDate, title, comment, externalId, introspectionParams)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/disbursement/get?accountId=[value]&disbursementId=[value]
    */
  def getDisbursement(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): DisbursementResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val disbursementId = request.getQueryString("disbursementId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("disbursementId", "query string")
        }
        
      api.getDisbursement(version, accountId, disbursementId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/disbursement/search?accountId=[value]&receiverAccountId=[value]&statuses=[value]&providers=[value]&beforeDate=[value]&afterDate=[value]&start=[value]&limit=[value]&activeOnly=[value]&externalId=[value]
    */
  def searchDisbursements(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[DisbursementResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val receiverAccountId = request.getQueryString("receiverAccountId")
        .map(value => value.toLong)
        
      val statuses = request.getQueryString("statuses")
        
      val providers = request.getQueryString("providers")
        
      val beforeDate = request.getQueryString("beforeDate")
        .map(value => value.toLong)
        
      val afterDate = request.getQueryString("afterDate")
        .map(value => value.toLong)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        
      val externalId = request.getQueryString("externalId")
        
      api.searchDisbursements(version, accountId, receiverAccountId, statuses, providers, beforeDate, afterDate, start, limit, activeOnly, externalId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/disbursement/update?accountId=[value]&disbursementId=[value]&amount=[value]&provider=[value]&scheduledDate=[value]&title=[value]&comment=[value]&externalId=[value]&retry=[value]&introspectionParams=[value]
    */
  def updateDisbursement(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): DisbursementResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val disbursementId = request.getQueryString("disbursementId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("disbursementId", "query string")
        }
        
      val amount = request.getQueryString("amount")
        .map(value => BigDecimal(value))
        
      val provider = request.getQueryString("provider")
        
      val scheduledDate = request.getQueryString("scheduledDate")
        .map(value => value.toLong)
        
      val title = request.getQueryString("title")
        
      val comment = request.getQueryString("comment")
        
      val externalId = request.getQueryString("externalId")
        
      val retry = request.getQueryString("retry")
        .map(value => value.toBoolean)
        
      val introspectionParams = request.getQueryString("introspectionParams")
        
      api.updateDisbursement(version, accountId, disbursementId, amount, provider, scheduledDate, title, comment, externalId, retry, introspectionParams)
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
