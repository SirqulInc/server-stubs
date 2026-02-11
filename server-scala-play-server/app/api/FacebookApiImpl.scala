package api

import model.SirqulResponse
import model.TokenResponse

/**
  * Provides a default implementation for [[FacebookApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class FacebookApiImpl extends FacebookApi {
  /**
    * @inheritdoc
    */
  override def getToken(deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): TokenResponse = {
    // TODO: Implement better logic

    TokenResponse(None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def graphInterface(event: String, deviceId: Option[String], accountId: Option[Long], permissionableType: Option[String], permissionableId: Option[Long], assetId: Option[Long], gameType: Option[String], appKey: Option[String], latitude: Option[Double], longitude: Option[Double]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }
}
