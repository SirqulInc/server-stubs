package api

import play.api.libs.json._
import model.TwiMLResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait TwilioApi {
  /**
    * Buy Offer by SMS
    * Recieve an SMS payload from Twillio to purchase an offer.
    * @param appKey the application key
    * @param body the message of the text
    * @param from the sender of the sms
    * @param currencyType the type of currency
    */
  def smsBuyOffer(appKey: String, body: String, from: String, currencyType: String): TwiMLResponse
}
