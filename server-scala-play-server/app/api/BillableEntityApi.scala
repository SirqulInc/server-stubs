package api

import play.api.libs.json._
import model.BigDecimal
import model.BillableEntityResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait BillableEntityApi {
  /**
    * Create Billable
    * reate a billable entity for an account. The creator is assumed to be the responsible account. An account can only have one billable entity
    * @param deviceId The unique device identifier that made the request (either deviceId or accountId must be used)
    * @param accountId The unique accountId that made the request (either deviceId or accountId must be used)
    * @param name The name of the entity responsible for billing 
    * @param streetAddress The street address of the billable entity
    * @param streetAddress2 Additional address information (such as a suite number, floor number, building name, or PO Box) 
    * @param city The city of the billable entity
    * @param state The state of the billable entity
    * @param postalCode The postal code of the billable entity
    * @param businessPhone The business phone of the billable entity
    * @param businessPhoneExt The business phone extension
    * @param authorizeNetApiKey Authorize Net Api Key
    * @param authorizeNetTransactionKey Authorize Net Transaction Key
    */
  def createBillableEntity(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], name: Option[String], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], postalCode: Option[String], businessPhone: Option[String], businessPhoneExt: Option[String], authorizeNetApiKey: Option[String], authorizeNetTransactionKey: Option[String]): BillableEntityResponse

  /**
    * Delete Billable
    * Mark the billable as deleted
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account used to perform the delete, must have rights to edit the billable entity.
    */
  def deleteBillableEntity(version: BigDecimal, deviceId: Option[String], accountId: Option[Long]): SirqulResponse

  /**
    * Get Billable
    * Used to determine the associated BillableEntity of an account
    * @param deviceId The unique device identifier that made the request (either deviceId or accountId must be used)
    * @param accountId The unique accountId that made the request (either deviceId or accountId must be used)
    * @param includeCounts Determines whether to include the retailer dash board counts into the response
    * @param includePayments Whether to enable payments or not
    */
  def getBillableEntity(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], includeCounts: Option[Boolean], includePayments: Option[Boolean]): BillableEntityResponse

  /**
    * Update Billable
    * Updates the billable record for an account
    * @param deviceId The unique device identifier that made the request (either deviceId or accountId must be used)
    * @param accountId The unique accountId that made the request (either deviceId or accountId must be used). The account must have rights to edit the billable entity.
    * @param name The name of the entity responsible for billing 
    * @param streetAddress The street address of the billable entity
    * @param streetAddress2 Additional address information (such as a suite number, floor number, building name, or PO Box) 
    * @param city The city of the billable entity
    * @param state The state of the billable entity
    * @param postalCode The postal code of the billable entity
    * @param businessPhone The business phone of the billable entity
    * @param businessPhoneExt The business phone extension of the billable entity
    * @param authorizeNetApiKey Authorize Net Api Key of the billable entity
    * @param authorizeNetTransactionKey Authorize Net Transaction Key of the billable entity
    */
  def updateBillableEntity(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], name: Option[String], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], postalCode: Option[String], businessPhone: Option[String], businessPhoneExt: Option[String], authorizeNetApiKey: Option[String], authorizeNetTransactionKey: Option[String]): BillableEntityResponse
}
