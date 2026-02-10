package api

import model.BigDecimal
import model.CargoType

/**
  * Provides a default implementation for [[CargoTypeApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class CargoTypeApiImpl extends CargoTypeApi {
  /**
    * @inheritdoc
    */
  override def createCargoType(version: BigDecimal, body: Option[CargoType]): CargoType = {
    // TODO: Implement better logic

    CargoType(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteCargoType(version: BigDecimal, cargoTypeId: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def getCargoType(version: BigDecimal, cargoTypeId: Long): CargoType = {
    // TODO: Implement better logic

    CargoType(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchCargoTypes(version: BigDecimal, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, retailerId: Option[Long], hubId: Option[Long]): List[CargoType] = {
    // TODO: Implement better logic

    List.empty[CargoType]
  }

  /**
    * @inheritdoc
    */
  override def updateCargoType(version: BigDecimal, cargoTypeId: Long, body: Option[CargoType]): CargoType = {
    // TODO: Implement better logic

    CargoType(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
