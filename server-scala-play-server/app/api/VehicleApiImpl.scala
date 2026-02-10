package api

import model.BigDecimal
import model.Vehicle

/**
  * Provides a default implementation for [[VehicleApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class VehicleApiImpl extends VehicleApi {
  /**
    * @inheritdoc
    */
  override def createVehicle(version: BigDecimal, vehicle: String, body: Option[Vehicle]): Vehicle = {
    // TODO: Implement better logic

    Vehicle(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteVehicle(version: BigDecimal, id: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def getVehicle(version: BigDecimal, id: Long): Vehicle = {
    // TODO: Implement better logic

    Vehicle(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchVehicle(version: BigDecimal, hubId: Long, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, keyword: Option[String]): List[Vehicle] = {
    // TODO: Implement better logic

    List.empty[Vehicle]
  }

  /**
    * @inheritdoc
    */
  override def updateVehicle(version: BigDecimal, id: Long, vehicle: String, body: Option[Vehicle]): Vehicle = {
    // TODO: Implement better logic

    Vehicle(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
