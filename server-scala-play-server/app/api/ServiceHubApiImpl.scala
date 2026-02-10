package api

import model.BigDecimal
import model.JsObject
import model.ServiceHub

/**
  * Provides a default implementation for [[ServiceHubApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ServiceHubApiImpl extends ServiceHubApi {
  /**
    * @inheritdoc
    */
  override def createServiceHub(version: BigDecimal, body: Option[ServiceHub]): ServiceHub = {
    // TODO: Implement better logic

    ServiceHub(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteServiceHub(version: BigDecimal, id: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def getServiceHub(version: BigDecimal, id: Long): JsObject = {
    // TODO: Implement better logic

    null
  }

  /**
    * @inheritdoc
    */
  override def postServiceHub(version: BigDecimal, id: Long, body: Option[ServiceHub]): ServiceHub = {
    // TODO: Implement better logic

    ServiceHub(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def putServiceHub(version: BigDecimal, id: Long, body: Option[ServiceHub]): ServiceHub = {
    // TODO: Implement better logic

    ServiceHub(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchServiceHubs(version: BigDecimal, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, keyword: Option[String], retailerId: Option[Long]): List[ServiceHub] = {
    // TODO: Implement better logic

    List.empty[ServiceHub]
  }
}
