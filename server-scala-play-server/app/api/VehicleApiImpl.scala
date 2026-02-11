package api

import model.Vehicle

/**
  * Provides a default implementation for [[VehicleApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class VehicleApiImpl extends VehicleApi {
  /**
    * @inheritdoc
    */
  override def createVehicle(vehicle: String, body: Option[Vehicle]): Vehicle = {
    // TODO: Implement better logic

    Vehicle(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteVehicle(id: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def getVehicle(id: Long): Vehicle = {
    // TODO: Implement better logic

    Vehicle(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchVehicle(hubId: Long, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, keyword: Option[String]): List[Vehicle] = {
    // TODO: Implement better logic

    List.empty[Vehicle]
  }

  /**
    * @inheritdoc
    */
  override def updateVehicle(id: Long, vehicle: String, body: Option[Vehicle]): Vehicle = {
    // TODO: Implement better logic

    Vehicle(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
