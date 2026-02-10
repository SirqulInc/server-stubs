package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.TwiMLResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class TwilioApiController @Inject()(cc: ControllerComponents, api: TwilioApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/sms/buyoffer/:appKey?body=[value]&from=[value]&currencyType=[value]
    * @param appKey the application key
    */
  def smsBuyOffer(version: BigDecimal, appKey: String): Action[AnyContent] = Action { request =>
    def executeApi(): TwiMLResponse = {
      val body = request.getQueryString("Body")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("Body", "query string")
        }
        
      val from = request.getQueryString("From")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("From", "query string")
        }
        
      val currencyType = request.getQueryString("currencyType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("currencyType", "query string")
        }
        
      api.smsBuyOffer(version, appKey, body, from, currencyType)
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
