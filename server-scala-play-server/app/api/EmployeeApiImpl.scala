package api

import model.BigDecimal
import model.EmployeeResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[EmployeeApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class EmployeeApiImpl extends EmployeeApi {
  /**
    * @inheritdoc
    */
  override def assignEmployee(version: BigDecimal, accountId: Long, managerAccountId: Long, employeeAccountId: Long, role: Option[String]): EmployeeResponse = {
    // TODO: Implement better logic

    EmployeeResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def assignToLocationEmployee(version: BigDecimal, accountId: Long, retailerLocationId: Long, employeeAccountId: Option[Long], assign: Option[Boolean]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createEmployee(version: BigDecimal, accountId: Long, managerAccountId: Long, username: String, password: String, name: Option[String], prefixName: Option[String], firstName: Option[String], middleName: Option[String], lastName: Option[String], suffixName: Option[String], title: Option[String], aboutUs: Option[String], assetId: Option[Long], gender: Option[String], homePhone: Option[String], cellPhone: Option[String], cellPhoneCarrier: Option[String], businessPhone: Option[String], emailAddress: Option[String], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], zipcode: Option[String], country: Option[String], role: Option[String], retailerLocationIds: Option[String], settingsAppKey: Option[String], appBlob: Option[String], assignedDeviceId: Option[String]): EmployeeResponse = {
    // TODO: Implement better logic

    EmployeeResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteEmployee(version: BigDecimal, accountId: Long, employeeAccountId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getEmployee(version: BigDecimal, accountId: Long, employeeAccountId: Long, settingsAppKey: Option[String]): EmployeeResponse = {
    // TODO: Implement better logic

    EmployeeResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchEmployees(version: BigDecimal, accountId: Long, role: Option[String], retailerId: Option[Long], retailerLocationId: Option[Long], q: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], i: Option[Int], start: Option[Int], l: Option[Int], limit: Option[Int], activeOnly: Option[Boolean], managedOnly: Option[Boolean], settingsAppKey: Option[String], categoryIds: Option[String], query: Option[String]): List[EmployeeResponse] = {
    // TODO: Implement better logic

    List.empty[EmployeeResponse]
  }

  /**
    * @inheritdoc
    */
  override def unassignEmployee(version: BigDecimal, accountId: Long, employeeAccountId: Long): EmployeeResponse = {
    // TODO: Implement better logic

    EmployeeResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateEmployee(version: BigDecimal, accountId: Long, employeeAccountId: Long, managerAccountId: Option[Long], name: Option[String], prefixName: Option[String], firstName: Option[String], middleName: Option[String], lastName: Option[String], suffixName: Option[String], title: Option[String], assetId: Option[Long], gender: Option[String], homePhone: Option[String], cellPhone: Option[String], cellPhoneCarrier: Option[String], businessPhone: Option[String], emailAddress: Option[String], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], zipcode: Option[String], country: Option[String], role: Option[String], active: Option[Boolean], password: Option[String], retailerLocationIds: Option[String], settingsAppKey: Option[String], appBlob: Option[String], assignedDeviceId: Option[String]): EmployeeResponse = {
    // TODO: Implement better logic

    EmployeeResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
