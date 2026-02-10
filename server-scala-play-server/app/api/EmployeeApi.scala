package api

import play.api.libs.json._
import model.BigDecimal
import model.EmployeeResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait EmployeeApi {
  /**
    * Assign Employee
    * Assign An existing account to be an employee
    * @param accountId The account id of the logged in user
    * @param managerAccountId The account id of the manager to assign under
    * @param employeeAccountId The account id of the user to be assigned as employee
    * @param role The role to assign to the employee (e.g. RETAILER or RETAILER_LIMITED)
    */
  def assignEmployee(version: BigDecimal, accountId: Long, managerAccountId: Long, employeeAccountId: Long, role: Option[String]): EmployeeResponse

  /**
    * Assign Employee to Location
    * Assign or unassign the account to a retailer location.
    * @param accountId The account id of the logged in user
    * @param retailerLocationId The retailer location to apply the change to
    * @param employeeAccountId The account id of the user to apply the change to
    * @param assign If true (default) assign to the location, otherwise remove from the retailer
    */
  def assignToLocationEmployee(version: BigDecimal, accountId: Long, retailerLocationId: Long, employeeAccountId: Option[Long], assign: Option[Boolean]): SirqulResponse

  /**
    * Create Employee
    * Create a new account record with the provided information.
    * @param accountId The account id of the logged in user
    * @param managerAccountId The account id of the manager to assign under
    * @param username The username/email for the new user. This must be unique across the entire the system.
    * @param password The password for the new user
    * @param name a name field
    * @param prefixName The name prefix; Mr, Mrs, etc
    * @param firstName The first name
    * @param middleName The middle name
    * @param lastName The last name
    * @param suffixName The name suffix; Jr, Sr, III, etc
    * @param title The title of the user
    * @param aboutUs Additional about/biography text
    * @param assetId the asset id to set the user&#39;s profile image
    * @param gender The gender
    * @param homePhone The home phone number
    * @param cellPhone The cellular phone number
    * @param cellPhoneCarrier The cellular service provider. This is required for sending SMS. Leave this empty if the provider is not on the list of supported carriers.
    * @param businessPhone The business phone number
    * @param emailAddress The user&#39;s contact email address (NOT the username)
    * @param streetAddress The street address of the user&#39;s contact location
    * @param streetAddress2 Additional address information (such as a suite number, floor number, building name, or PO Box)
    * @param city The city of the user&#39;s contact location
    * @param state The state of the user&#39;s contact location
    * @param zipcode The zipcode of the user&#39;s contact location
    * @param country The country of the user&#39;s contact location
    * @param role The role; RETAILER or RETAILER_LIMITED, defaulted to RETAILER_LIMITED
    * @param retailerLocationIds the retailer location IDs the employee is associated with
    * @param settingsAppKey Determines whether to return the application settings for the employee for a particular application
    * @param appBlob external custom client defined data (per Application)
    * @param assignedDeviceId The device id to assign to the user (used for IPS beacon tracking)
    */
  def createEmployee(version: BigDecimal, accountId: Long, managerAccountId: Long, username: String, password: String, name: Option[String], prefixName: Option[String], firstName: Option[String], middleName: Option[String], lastName: Option[String], suffixName: Option[String], title: Option[String], aboutUs: Option[String], assetId: Option[Long], gender: Option[String], homePhone: Option[String], cellPhone: Option[String], cellPhoneCarrier: Option[String], businessPhone: Option[String], emailAddress: Option[String], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], zipcode: Option[String], country: Option[String], role: Option[String], retailerLocationIds: Option[String], settingsAppKey: Option[String], appBlob: Option[String], assignedDeviceId: Option[String]): EmployeeResponse

  /**
    * Delete Employee
    * Set the deleted date field which marks the record as deleted.
    * @param accountId the id of the logged in user
    * @param employeeAccountId the id of the employee to delete
    */
  def deleteEmployee(version: BigDecimal, accountId: Long, employeeAccountId: Long): SirqulResponse

  /**
    * Get Employee
    * Get the account record for the account id provided.
    * @param accountId the id of logged in user
    * @param employeeAccountId the id of the employee account to get
    * @param settingsAppKey Determines whether to return the application settings for the employee for a particular application
    */
  def getEmployee(version: BigDecimal, accountId: Long, employeeAccountId: Long, settingsAppKey: Option[String]): EmployeeResponse

  /**
    * Search Employees
    * Use the accountId to determine the associated BillableEntity. From there get a list of all accounts associated as managers/employees.
    * @param accountId The account id of the logged in user
    * @param role The role to limit the search to: RETAILER or RETAILER_LIMITED. Leave empty to search on both roles.
    * @param retailerId Filters employees by retailer
    * @param retailerLocationId Filter employees by retailer locations
    * @param q Deprecated parameter
    * @param keyword an optional keyword to search on; ignored if empty
    * @param sortField The field to sort by. Possible values include: DISPLAY, CREATED, UPDATED, ACTIVE, DELETED, LAST_LOGGED_IN, CONTACT_EMAIL, RETAILER_LOCATION_NAME, RETAILER_NAME
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param i Deprecated parameter
    * @param start Start the result set at some index
    * @param l Deprecated parameter
    * @param limit Limit the result to some number
    * @param activeOnly Filter results to only return active employees
    * @param managedOnly Filter results to only employees that you manage
    * @param settingsAppKey Determines whether to return the application settings for the employee for a particular application
    * @param categoryIds Comma separated list of category ids to filter results
    * @param query Legacy/reporting query parameter used for formatting employee responses
    */
  def searchEmployees(version: BigDecimal, accountId: Long, role: Option[String], retailerId: Option[Long], retailerLocationId: Option[Long], q: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], i: Option[Int], start: Option[Int], l: Option[Int], limit: Option[Int], activeOnly: Option[Boolean], managedOnly: Option[Boolean], settingsAppKey: Option[String], categoryIds: Option[String], query: Option[String]): List[EmployeeResponse]

  /**
    * Unassign Employee
    * Unassign An existing account to be an employee
    * @param accountId The account id of the logged in user
    * @param employeeAccountId The account id of the user to be unassigned
    */
  def unassignEmployee(version: BigDecimal, accountId: Long, employeeAccountId: Long): EmployeeResponse

  /**
    * Update Employee
    * Update the account record with the provided information.
    * @param accountId The account id of the logged in user
    * @param employeeAccountId the id of the employee account
    * @param managerAccountId The account id of the manager to assign under
    * @param name a name field
    * @param prefixName The name prefix; Mr, Mrs, etc
    * @param firstName The first name
    * @param middleName The middle name
    * @param lastName The last name
    * @param suffixName The name suffix; Jr, Sr, III, etc
    * @param title The title of the user
    * @param assetId the asset id to set the user&#39;s profile image
    * @param gender The gender {MALE, FEMALE, ANY}
    * @param homePhone The home phone number
    * @param cellPhone The cellular phone number
    * @param cellPhoneCarrier The cellular service provider. This is required for sending SMS. Leave this empty if the provider is not on the list of supported carriers. Supported Carriers: {ATT, QWEST, T_MOBILE, VERIZON, SPRINT, VIRIGIN_MOBILE, NEXTEL, ALLTEL, METRO_PCS, POWERTEL, BOOST_MOBILE, SUNCOM, TRACFONE, US_CELLULAR}
    * @param businessPhone The business phone number
    * @param emailAddress The user&#39;s contact email address (NOT the username)
    * @param streetAddress The street address of the user&#39;s contact location
    * @param streetAddress2 Additional address information (such as a suite number, floor number, building name, or PO Box)
    * @param city The city of the user&#39;s contact location
    * @param state The state of the user&#39;s contact location
    * @param zipcode The zipcode of the user&#39;s contact location
    * @param country The country of the user&#39;s contact location
    * @param role The role; RETAILER or RETAILER_LIMITED, defaulted to RETAILER_LIMITED
    * @param active Sets whether the employee is active or inactive
    * @param password Sets the password for the employee
    * @param retailerLocationIds Sets which retailer locations the employee is assigned to
    * @param settingsAppKey Determines whether to return the application settings for the employee for a particular application
    * @param appBlob external custom client defined data (per Application)
    * @param assignedDeviceId The device id to assign to the user (used for IPS beacon tracking)
    */
  def updateEmployee(version: BigDecimal, accountId: Long, employeeAccountId: Long, managerAccountId: Option[Long], name: Option[String], prefixName: Option[String], firstName: Option[String], middleName: Option[String], lastName: Option[String], suffixName: Option[String], title: Option[String], assetId: Option[Long], gender: Option[String], homePhone: Option[String], cellPhone: Option[String], cellPhoneCarrier: Option[String], businessPhone: Option[String], emailAddress: Option[String], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], zipcode: Option[String], country: Option[String], role: Option[String], active: Option[Boolean], password: Option[String], retailerLocationIds: Option[String], settingsAppKey: Option[String], appBlob: Option[String], assignedDeviceId: Option[String]): EmployeeResponse
}
