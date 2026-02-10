package api

import model.BigDecimal
import model.WrappedProxyItemResponse

/**
  * Provides a default implementation for [[OpenAIApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class OpenAIApiImpl extends OpenAIApi {
  /**
    * @inheritdoc
    */
  override def imageGeneration(version: BigDecimal, accountId: Long, postBody: String, returnRawResponse: Option[Boolean]): WrappedProxyItemResponse = {
    // TODO: Implement better logic

    WrappedProxyItemResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
