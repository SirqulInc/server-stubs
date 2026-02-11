package api

import model.TwiMLResponse

/**
  * Provides a default implementation for [[TwilioApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class TwilioApiImpl extends TwilioApi {
  /**
    * @inheritdoc
    */
  override def smsBuyOffer(appKey: String, body: String, from: String, currencyType: String): TwiMLResponse = {
    // TODO: Implement better logic

    TwiMLResponse(None, None, None, None)
  }
}
