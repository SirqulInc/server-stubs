package api

import model.BigDecimal
import model.JsObject
import model.RouteSettings

/**
  * Provides a default implementation for [[RouteSettingApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class RouteSettingApiImpl extends RouteSettingApi {
  /**
    * @inheritdoc
    */
  override def createRouteSettings(version: BigDecimal, body: Option[RouteSettings]): RouteSettings = {
    // TODO: Implement better logic

    RouteSettings(None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteRouteSettings(version: BigDecimal, routeSettingsId: Long): JsObject = {
    // TODO: Implement better logic

    null
  }

  /**
    * @inheritdoc
    */
  override def getRouteSettings(version: BigDecimal, routeSettingsId: Long): RouteSettings = {
    // TODO: Implement better logic

    RouteSettings(None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchRouteSettings(version: BigDecimal, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, hubId: Option[Long], programId: Option[Long], keyword: Option[String]): List[RouteSettings] = {
    // TODO: Implement better logic

    List.empty[RouteSettings]
  }

  /**
    * @inheritdoc
    */
  override def updateRouteSettings(version: BigDecimal, routeSettingsId: Long, body: Option[RouteSettings]): RouteSettings = {
    // TODO: Implement better logic

    RouteSettings(None, None, None, None, None, None, None, None, None)
  }
}
