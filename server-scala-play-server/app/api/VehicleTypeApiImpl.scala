package api

import model.VehicleType

/**
  * Provides a default implementation for [[VehicleTypeApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class VehicleTypeApiImpl extends VehicleTypeApi {
  /**
    * @inheritdoc
    */
  override def createVehicleType(vehicleType: String, body: Option[VehicleType]): VehicleType = {
    // TODO: Implement better logic

    VehicleType(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteVehicleType(vehicleTypeId: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def getVehicleType(vehicleTypeId: Long): VehicleType = {
    // TODO: Implement better logic

    VehicleType(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchVehicleTypes(sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, retailerId: Option[Long], hubId: Option[Long]): List[VehicleType] = {
    // TODO: Implement better logic

    List.empty[VehicleType]
  }

  /**
    * @inheritdoc
    */
  override def updateVehicleType(vehicleTypeId: Long, vehicleType: String, body: Option[VehicleType]): VehicleType = {
    // TODO: Implement better logic

    VehicleType(None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
