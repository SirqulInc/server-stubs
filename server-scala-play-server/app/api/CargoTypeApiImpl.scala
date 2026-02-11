package api

import model.CargoType

/**
  * Provides a default implementation for [[CargoTypeApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class CargoTypeApiImpl extends CargoTypeApi {
  /**
    * @inheritdoc
    */
  override def createCargoType(body: Option[CargoType]): CargoType = {
    // TODO: Implement better logic

    CargoType(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteCargoType(cargoTypeId: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def getCargoType(cargoTypeId: Long): CargoType = {
    // TODO: Implement better logic

    CargoType(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchCargoTypes(sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, retailerId: Option[Long], hubId: Option[Long]): List[CargoType] = {
    // TODO: Implement better logic

    List.empty[CargoType]
  }

  /**
    * @inheritdoc
    */
  override def updateCargoType(cargoTypeId: Long, body: Option[CargoType]): CargoType = {
    // TODO: Implement better logic

    CargoType(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
