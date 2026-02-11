package api

import play.api.libs.json._
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait StripeApi {
  /**
    * Create Stripe Checkout Session
    * Create a Stripe checkout session
    * @param appKey Sirqul Application Key
    * @param stripeParameters Stripe Parameters
    */
  def createStripeCheckoutSession(appKey: String, stripeParameters: String): SirqulResponse
}
