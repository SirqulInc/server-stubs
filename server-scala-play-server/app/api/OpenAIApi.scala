package api

import play.api.libs.json._
import model.BigDecimal
import model.WrappedProxyItemResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait OpenAIApi {
  /**
    * Generate images with OpenAI
    * Generate images with OpenAI.
    * @param accountId Sirqul Account Id
    * @param postBody Post Body Parameters
    * @param returnRawResponse Return raw response
    */
  def imageGeneration(version: BigDecimal, accountId: Long, postBody: String, returnRawResponse: Option[Boolean]): WrappedProxyItemResponse
}
