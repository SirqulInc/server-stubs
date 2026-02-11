package api

import model.JsObject
import model.RouteSettings

/**
  * Provides a default implementation for [[RouteSettingApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class RouteSettingApiImpl extends RouteSettingApi {
  /**
    * @inheritdoc
    */
  override def createRouteSettings(body: Option[RouteSettings]): RouteSettings = {
    // TODO: Implement better logic

    RouteSettings(None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteRouteSettings(routeSettingsId: Long): JsObject = {
    // TODO: Implement better logic

    null
  }

  /**
    * @inheritdoc
    */
  override def getRouteSettings(routeSettingsId: Long): RouteSettings = {
    // TODO: Implement better logic

    RouteSettings(None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchRouteSettings(sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, hubId: Option[Long], programId: Option[Long], keyword: Option[String]): List[RouteSettings] = {
    // TODO: Implement better logic

    List.empty[RouteSettings]
  }

  /**
    * @inheritdoc
    */
  override def updateRouteSettings(routeSettingsId: Long, body: Option[RouteSettings]): RouteSettings = {
    // TODO: Implement better logic

    RouteSettings(None, None, None, None, None, None, None, None, None)
  }
}
