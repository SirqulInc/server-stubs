package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BidResponse
import model.BigDecimal
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class BidApiController @Inject()(cc: ControllerComponents, api: BidApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/bid/create?deviceId=[value]&accountId=[value]&biddableType=[value]&biddableId=[value]&amountPerView=[value]&amountPerAction=[value]&budgetAmount=[value]&budgetSchedule=[value]
    */
  def createBid(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): BidResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val biddableType = request.getQueryString("biddableType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("biddableType", "query string")
        }
        
      val biddableId = request.getQueryString("biddableId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("biddableId", "query string")
        }
        
      val amountPerView = request.getQueryString("amountPerView")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("amountPerView", "query string")
        }
        
      val amountPerAction = request.getQueryString("amountPerAction")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("amountPerAction", "query string")
        }
        
      val budgetAmount = request.getQueryString("budgetAmount")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("budgetAmount", "query string")
        }
        
      val budgetSchedule = request.getQueryString("budgetSchedule")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("budgetSchedule", "query string")
        }
        
      api.createBid(version, biddableType, biddableId, amountPerView, amountPerAction, budgetAmount, budgetSchedule, deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/bid/delete?deviceId=[value]&accountId=[value]&bidId=[value]
    */
  def deleteBid(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val bidId = request.getQueryString("bidId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("bidId", "query string")
        }
        
      api.deleteBid(version, bidId, deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/bid/get?deviceId=[value]&accountId=[value]&bidId=[value]
    */
  def getBid(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): BidResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val bidId = request.getQueryString("bidId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("bidId", "query string")
        }
        
      api.getBid(version, bidId, deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/bid/update?deviceId=[value]&accountId=[value]&bidId=[value]&amountPerView=[value]&amountPerAction=[value]&budgetAmount=[value]&budgetSchedule=[value]
    */
  def updateBid(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): BidResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val bidId = request.getQueryString("bidId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("bidId", "query string")
        }
        
      val amountPerView = request.getQueryString("amountPerView")
        .map(value => value.toDouble)
        
      val amountPerAction = request.getQueryString("amountPerAction")
        .map(value => value.toDouble)
        
      val budgetAmount = request.getQueryString("budgetAmount")
        .map(value => value.toDouble)
        
      val budgetSchedule = request.getQueryString("budgetSchedule")
        
      api.updateBid(version, bidId, deviceId, accountId, amountPerView, amountPerAction, budgetAmount, budgetSchedule)
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
