package api

import model.BigDecimal
import model.VehicleType

/**
  * Provides a default implementation for [[VehicleTypeApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class VehicleTypeApiImpl extends VehicleTypeApi {
  /**
    * @inheritdoc
    */
  override def createVehicleType(version: BigDecimal, vehicleType: String, body: Option[VehicleType]): VehicleType = {
    // TODO: Implement better logic

    VehicleType(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteVehicleType(version: BigDecimal, vehicleTypeId: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def getVehicleType(version: BigDecimal, vehicleTypeId: Long): VehicleType = {
    // TODO: Implement better logic

    VehicleType(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchVehicleTypes(version: BigDecimal, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, retailerId: Option[Long], hubId: Option[Long]): List[VehicleType] = {
    // TODO: Implement better logic

    List.empty[VehicleType]
  }

  /**
    * @inheritdoc
    */
  override def updateVehicleType(version: BigDecimal, vehicleTypeId: Long, vehicleType: String, body: Option[VehicleType]): VehicleType = {
    // TODO: Implement better logic

    VehicleType(None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
