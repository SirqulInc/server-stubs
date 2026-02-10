package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class StripeApiController @Inject()(cc: ControllerComponents, api: StripeApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/stripe/checkout/session/create?appKey=[value]&stripeParameters=[value]
    */
  def createStripeCheckoutSession(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val stripeParameters = request.getQueryString("stripeParameters")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("stripeParameters", "query string")
        }
        
      api.createStripeCheckoutSession(version, appKey, stripeParameters)
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
