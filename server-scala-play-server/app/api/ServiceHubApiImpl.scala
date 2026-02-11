package api

import model.JsObject
import model.ServiceHub

/**
  * Provides a default implementation for [[ServiceHubApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ServiceHubApiImpl extends ServiceHubApi {
  /**
    * @inheritdoc
    */
  override def createServiceHub(body: Option[ServiceHub]): ServiceHub = {
    // TODO: Implement better logic

    ServiceHub(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteServiceHub(id: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def getServiceHub(id: Long): JsObject = {
    // TODO: Implement better logic

    null
  }

  /**
    * @inheritdoc
    */
  override def postServiceHub(id: Long, body: Option[ServiceHub]): ServiceHub = {
    // TODO: Implement better logic

    ServiceHub(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def putServiceHub(id: Long, body: Option[ServiceHub]): ServiceHub = {
    // TODO: Implement better logic

    ServiceHub(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchServiceHubs(sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, keyword: Option[String], retailerId: Option[Long]): List[ServiceHub] = {
    // TODO: Implement better logic

    List.empty[ServiceHub]
  }
}
