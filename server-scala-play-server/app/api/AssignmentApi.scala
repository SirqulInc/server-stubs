package api

import play.api.libs.json._
import model.AccountMiniResponse
import model.AssignmentResponse
import model.AssignmentStatusResponse
import model.BigDecimal
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait AssignmentApi {
  /**
    * Search Assignment Assignees
    * Search for avaiable users for creating or updating assignment.
    * @param accountId The account id sending the request
    * @param keyword The keyword to filter the returned results
    */
  def assigmentAssigneeAccountSearch(version: BigDecimal, accountId: Long, keyword: Option[String]): List[AccountMiniResponse]

  /**
    * Create Assignment
    * Create an assignment.
    * @param accountId the user account id
    * @param name the name for the assignment
    * @param assigneeAccountId the account id to assign to
    * @param description the desciprtion for the assignment
    * @param retailerLocationId the retailer location id
    * @param tags the tags
    * @param active determines whether the assignment is active or inactive
    */
  def assignmentCreate(version: BigDecimal, accountId: Long, name: String, assigneeAccountId: Long, description: Option[String], retailerLocationId: Option[Long], tags: Option[String], active: Option[Boolean]): AssignmentResponse

  /**
    * Delete Assignment
    * Delete an assignment.
    * @param accountId the user account id
    * @param assignmentId the assignment id
    */
  def assignmentDelete(version: BigDecimal, accountId: Long, assignmentId: Long): SirqulResponse

  /**
    * Get Assignment
    * Get the details of an assignment.
    * @param accountId the user account id
    * @param assignmentId the assignment id
    */
  def assignmentGet(version: BigDecimal, accountId: Long, assignmentId: Long): AssignmentResponse

  /**
    * Search Assignments
    * Search for assignments by the given parameters.
    * @param accountId the account sending the request
    * @param sortField sort by table field
    * @param descending return results in descending order or not
    * @param activeOnly return active results only or not
    * @param start The record to begin the return set on
    * @param limit The number of records to return
    * @param creatorAccountId the creator of the assignment
    * @param assigneeAccountIds filter results by assignee accounts. If not provided, all assignments that are assigned to accounts that are managed by the requested account will be returned.
    * @param retailerLocationIds filter results by retailer locations
    * @param currentStatusType filter results by assignment status
    * @param keyword filter results by keyword search that matches the assignee, creator, or retailer location name
    */
  def assignmentSearch(version: BigDecimal, accountId: Long, sortField: String, descending: Boolean, activeOnly: Boolean, start: Int, limit: Int, creatorAccountId: Option[Long], assigneeAccountIds: Option[String], retailerLocationIds: Option[String], currentStatusType: Option[String], keyword: Option[String]): List[AssignmentResponse]

  /**
    * Create Assignment Status
    * Create an assignment status.
    * @param accountId the user account id
    * @param assignmentId the assignment id
    * @param scheduledNotificationId the scheduled notification id for reminders
    * @param toDo the type of to do. Possible values include: SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT
    * @param connection the connection type. Possible values include: INITIAL, FOLLOW_UP, DECLINED
    * @param method the communication method type. Possible values include: PHONE, SITE_VISIT, EMAIL
    * @param status the status type. Possible values include: ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED
    * @param closure the closure type. Possible values include: PHONE, SITE_VISIT, PHONE_SITE, WEB
    * @param message the message from the assignee
    * @param followUp the date to follow up by
    * @param active determines whether the assignment status is active or inactive
    */
  def assignmentStatusCreate(version: BigDecimal, accountId: Long, assignmentId: Long, scheduledNotificationId: Option[Long], toDo: Option[String], connection: Option[String], method: Option[String], status: Option[String], closure: Option[String], message: Option[String], followUp: Option[Long], active: Option[Boolean]): AssignmentStatusResponse

  /**
    * Deletes Assignment Status
    * Deletes an assignment status.
    * @param accountId the user account id
    * @param assignmentStatusId the assignment status id
    */
  def assignmentStatusDelete(version: BigDecimal, accountId: Long, assignmentStatusId: Long): SirqulResponse

  /**
    * Get Assignment Status
    * Get an assignment status.
    * @param accountId the user account id
    * @param assignmentStatusId the assignment status id
    */
  def assignmentStatusGet(version: BigDecimal, accountId: Long, assignmentStatusId: Long): AssignmentStatusResponse

  /**
    * Search Assignment Statuses
    * Search on assignment statuses.
    * @param accountId the user account id
    * @param sortField the field to sort by. Possible values include: ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, CURRENT_STATUS, TODO, CONNECTION, METHOD, STATUS, CLOSURE, MESSAGE, FOLLOW_UP
    * @param descending determines whether the sorted list is in descending or ascending order
    * @param activeOnly determines whether to only return active results
    * @param start the start index for pagination
    * @param limit the limit for pagination
    * @param assignmentId the assignment id
    * @param creatorAccountId filter results by the account who created the status
    * @param assigneeAccountId filter results by the assignee account
    * @param retailerLocationId filter results by by retailer location
    * @param statusType filter results by the status type
    * @param keyword filter results by keyword search
    */
  def assignmentStatusSearch(version: BigDecimal, accountId: Long, sortField: String, descending: Boolean, activeOnly: Boolean, start: Int, limit: Int, assignmentId: Option[Long], creatorAccountId: Option[Long], assigneeAccountId: Option[Long], retailerLocationId: Option[Long], statusType: Option[String], keyword: Option[String]): List[AssignmentStatusResponse]

  /**
    * Update Assignment Status
    * Updates an assignment status.
    * @param accountId the user account id
    * @param assignmentStatusId the assignment status id
    * @param scheduledNotificationId the scheduled notification id for reminders
    * @param toDo the type of to do. Possible values include: SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT
    * @param connection the connection type. Possible values include: INITIAL, FOLLOW_UP, DECLINED
    * @param method the communication method type. Possible values include: PHONE, SITE_VISIT, EMAIL
    * @param status the status type. Possible values include: ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED
    * @param closure the closure type. Possible values include: PHONE, SITE_VISIT, PHONE_SITE, WEB
    * @param message the message from the assignee
    * @param followUp the date to follow up by
    * @param active determines whether the assignment status is active or inactive
    */
  def assignmentStatusUpdate(version: BigDecimal, accountId: Long, assignmentStatusId: Long, scheduledNotificationId: Option[Long], toDo: Option[String], connection: Option[String], method: Option[String], status: Option[String], closure: Option[String], message: Option[String], followUp: Option[Long], active: Option[Boolean]): AssignmentStatusResponse

  /**
    * Update Assignment
    * Updates an assignment.
    * @param accountId the user account id
    * @param assignmentId the assignment id
    * @param name the name of the assignment
    * @param description the description of the assignment
    * @param assigneeAccountId the account id to assign to
    * @param retailerLocationId the retailer location id
    * @param tags the tags
    * @param active determines whether the assignment is active or inactive
    */
  def assignmentUpdate(version: BigDecimal, accountId: Long, assignmentId: Long, name: Option[String], description: Option[String], assigneeAccountId: Option[Long], retailerLocationId: Option[Long], tags: Option[String], active: Option[Boolean]): AssignmentResponse
}
