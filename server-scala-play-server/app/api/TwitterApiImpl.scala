package api

import model.ProfileResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[TwitterApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class TwitterApiImpl extends TwitterApi {
  /**
    * @inheritdoc
    */
  override def authorizeTwitter(appKey: String): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def loginTwitter(accessToken: String, accessTokenSecret: String, appKey: String, responseFilters: String, deviceId: Option[String], latitude: Option[Double], longitude: Option[Double]): ProfileResponse = {
    // TODO: Implement better logic

    ProfileResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
