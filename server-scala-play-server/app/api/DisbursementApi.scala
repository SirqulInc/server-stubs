package api

import play.api.libs.json._
import model.BigDecimal
import model.DisbursementResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait DisbursementApi {
  /**
    * Check Disbursements
    * Checks the status of a captured disbrusement to see if it has been settled.
    * @param disbursementId the ID of the disbursement being checked on
    */
  def checkDisbursements(version: BigDecimal, disbursementId: Long): DisbursementResponse

  /**
    * Create Disbursement
    * Creates a Disbursement for sending money to a retailer
    * @param accountId the ID of the logging in user (must be an EXECUTIVE account)
    * @param receiverAccountId the ID of the account receiving the disbursement
    * @param originalSenderAccountId the ID of the original sender account
    * @param amount the dollar amount of the disbursement
    * @param provider the provider (e.g. Authorize.net, Bill.com, etc.)
    * @param scheduledDate the date that the disbursement is scheduled to go out to the payment provider
    * @param title a title given for the disbursement
    * @param comment a comment that could be made for a disbursement
    * @param externalId external ID, which can be used as a way to reference the disbursement
    * @param introspectionParams This is for specifying parameters to make an http callback request for validating that the disbursement is valid
    */
  def createDisbursement(version: BigDecimal, accountId: Long, receiverAccountId: Long, originalSenderAccountId: Long, amount: BigDecimal, provider: String, scheduledDate: Option[Long], title: Option[String], comment: Option[String], externalId: Option[String], introspectionParams: Option[String]): DisbursementResponse

  /**
    * Get Disbursement
    * Get Disbursement details
    * @param accountId The logged in user.
    * @param disbursementId the id of the disbursement
    */
  def getDisbursement(version: BigDecimal, accountId: Long, disbursementId: Long): DisbursementResponse

  /**
    * Search Disbursements
    * Search Disbursements
    * @param accountId the id of the logged in user
    * @param receiverAccountId filter results by the id of the account receiving the disbursement
    * @param statuses comma separated list of status values to search for, possilbe values include: NEW, APPROVED, VALIDATING, ERROR, AUTHORIZED, CAPTURED, SETTLED
    * @param providers comma separated list of payment providers to search for, possbile values include: AUTHORIZE_NET, AMAZON_FPS, BILL_COM
    * @param beforeDate the date for searching disbursements before it has been processed
    * @param afterDate the date for searching disbursements before it has been processed
    * @param start the start index for pagination
    * @param limit the limit per result set for pagination
    * @param activeOnly search on disbursements that are active only
    * @param externalId search results by this external ID (that can be used to reference the disbursement)
    */
  def searchDisbursements(version: BigDecimal, accountId: Long, receiverAccountId: Option[Long], statuses: Option[String], providers: Option[String], beforeDate: Option[Long], afterDate: Option[Long], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean], externalId: Option[String]): List[DisbursementResponse]

  /**
    * Update Disbursement
    * Update Disbursement
    * @param accountId the id of the logged in user
    * @param disbursementId the id of the disbursement being updated
    * @param amount the disbursement dollar amount being updated
    * @param provider the payments and/or billing provider (e.g. Authorize.net, Bill.com, etc.)
    * @param scheduledDate the date that the disbursement is scheduled to go out to the payment provider
    * @param title the title given to the disbursement
    * @param comment a comment that can be made on a disbursement
    * @param externalId an external ID that can be used to reference the disbursement
    * @param retry determines whether to try sending the disbursement again in the case of a previous failure
    * @param introspectionParams for specifying parameters to make an http callback request for validating that the disbursement is valid
    */
  def updateDisbursement(version: BigDecimal, accountId: Long, disbursementId: Long, amount: Option[BigDecimal], provider: Option[String], scheduledDate: Option[Long], title: Option[String], comment: Option[String], externalId: Option[String], retry: Option[Boolean], introspectionParams: Option[String]): DisbursementResponse
}
