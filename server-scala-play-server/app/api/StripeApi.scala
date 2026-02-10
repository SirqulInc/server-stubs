package api

import play.api.libs.json._
import model.BigDecimal
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait StripeApi {
  /**
    * Create Stripe Checkout Session
    * Create a Stripe checkout session
    * @param appKey Sirqul Application Key
    * @param stripeParameters Stripe Parameters
    */
  def createStripeCheckoutSession(version: BigDecimal, appKey: String, stripeParameters: String): SirqulResponse
}
