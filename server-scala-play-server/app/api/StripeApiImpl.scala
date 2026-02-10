package api

import model.BigDecimal
import model.SirqulResponse

/**
  * Provides a default implementation for [[StripeApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class StripeApiImpl extends StripeApi {
  /**
    * @inheritdoc
    */
  override def createStripeCheckoutSession(version: BigDecimal, appKey: String, stripeParameters: String): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }
}
