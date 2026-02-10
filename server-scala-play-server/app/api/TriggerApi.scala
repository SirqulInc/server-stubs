package api

import play.api.libs.json._
import model.BigDecimal
import model.SirqulResponse
import model.TriggerResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait TriggerApi {
  /**
    * Create Trigger
    * Create a trigger
    * @param accountId The logged in user
    * @param name The name of the trigger
    * @param appKey The application to target
    * @param groupingId Client defined identifier for grouping triggers
    * @param endpointURL The URL for making an HTTP call
    * @param payload The parameters for making an HTTP call
    * @param scheduledDate The date and time of the next trigger
    * @param startDate The starting date of the trigger
    * @param endDate The ending date of the trigger
    * @param cronExpression The cron expression that represents the trigger&#39;s schedule
    * @param conditionalInput Json input representing conditional logic that has to be met before running the trigger
    * @param visibility The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)
    * @param active Sets whether the Trigger is active or not (inactive Triggers are not processed)
    */
  def createTrigger(version: BigDecimal, accountId: Long, name: String, appKey: Option[String], groupingId: Option[String], endpointURL: Option[String], payload: Option[String], scheduledDate: Option[Long], startDate: Option[Long], endDate: Option[Long], cronExpression: Option[String], conditionalInput: Option[String], visibility: Option[String], active: Option[Boolean]): TriggerResponse

  /**
    * Delete Trigger
    * Mark a trigger as deleted.
    * @param accountId The logged in user.
    * @param triggerId The id of the trigger to delete.
    */
  def deleteTrigger(version: BigDecimal, accountId: Long, triggerId: Long): SirqulResponse

  /**
    * Get Trigger
    * Get a trigger
    * @param accountId The logged in user.
    * @param triggerId The id of the Trigger to return.
    */
  def getTrigger(version: BigDecimal, accountId: Long, triggerId: Long): TriggerResponse

  /**
    * Search Triggers
    * Search for triggers
    * @param accountId The logged in user.
    * @param groupingId Filter results by a grouping identifier defined by the client
    * @param filter A comma separated list of filters. * MINE - Return triggers that the user has created * SHARED - Return triggers that have been shared to the user * FOLLOWER - Return triggers that have been created by the user&#39;&#39;s followers (the content needs to have been APPROVED or FEATURED) * FOLLOWING - Return triggers that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED) * PUBLIC - Return all PUBLIC triggers that have been APPROVED or FEATURED * ALL_PUBLIC - Return all PUBLIC triggers regardless of whether they are approved or not (ignores the approval status) * LIKED - Return all triggers that the user has liked * FEATURED - Return all triggers that have been featured * PENDING - Return all pending triggers 
    * @param statuses Filter results by status (comma separated list). Values include: NEW, ERROR, COMPLETE, PROCESSING, TEMPLATE
    * @param templateTypes Template Types
    * @param appKey Filter the list by a specific application
    * @param keyword Keyword search on the trigger names.
    * @param sortField The field to sort by. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, SCHEDULED_DATE, START_DATE, END_DATE
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param start Start the result set at some index.
    * @param limit Limit the result to some number.
    * @param activeOnly Determines whether to return only active results
    */
  def searchTriggers(version: BigDecimal, accountId: Long, groupingId: Option[String], filter: Option[String], statuses: Option[String], templateTypes: Option[String], appKey: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean]): List[TriggerResponse]

  /**
    * Update Trigger
    * Update a trigger
    * @param triggerId The trigger to update
    * @param accountId The logged in user
    * @param name The name of the trigger
    * @param appKey The application to target
    * @param groupingId Client defined identifier for grouping triggers
    * @param endpointURL The URL for making an HTTP call
    * @param payload The parameters for making an HTTP call
    * @param scheduledDate The date and time of the next trigger
    * @param startDate The starting date of the trigger
    * @param endDate The ending date of the trigger
    * @param cronExpression The cron expression that represents the trigger&#39;s schedule
    * @param conditionalInput Json input representing conditional logic that has to be met before running the trigger
    * @param visibility The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)
    * @param active Sets whether the Trigger is active or not (inactive Triggers are not processed)
    */
  def updateTrigger(version: BigDecimal, triggerId: Long, accountId: Long, name: Option[String], appKey: Option[String], groupingId: Option[String], endpointURL: Option[String], payload: Option[String], scheduledDate: Option[Long], startDate: Option[Long], endDate: Option[Long], cronExpression: Option[String], conditionalInput: Option[String], visibility: Option[String], active: Option[Boolean]): TriggerResponse
}
