package api

import play.api.libs.json._
import model.BigDecimal
import model.SirqulResponse
import model.TaskResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait TaskApi {
  /**
    * Create Task
    * Create a Task
    * @param accountId The logged in user.
    * @param name The name of the task
    * @param appKey The application to target
    * @param groupingId Client defined identifier for grouping tasks
    * @param endpointURL The URL for making an HTTP call
    * @param payload The parameters for making an HTTP call
    * @param scheduledDate The date and time of the task
    * @param startDate The starting date of the task
    * @param endDate The ending date of the task
    * @param cronExpression The cron expression that represents the task&#39;s schedule
    * @param visibility The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)
    * @param active Sets whether the Task is active or not (inactive Tasks are not processed)
    */
  def createTask(version: BigDecimal, accountId: Long, name: String, appKey: Option[String], groupingId: Option[String], endpointURL: Option[String], payload: Option[String], scheduledDate: Option[Long], startDate: Option[Long], endDate: Option[Long], cronExpression: Option[String], visibility: Option[String], active: Option[Boolean]): TaskResponse

  /**
    * Delete Task
    * Delete a Task
    * @param accountId The logged in user.
    * @param taskId The id of the Task to delete.
    */
  def deleteTask(version: BigDecimal, accountId: Long, taskId: Long): SirqulResponse

  /**
    * Get Task
    * Get a Task
    * @param accountId The logged in user.
    * @param taskId The id of the Task to return.
    */
  def getTask(version: BigDecimal, accountId: Long, taskId: Long): TaskResponse

  /**
    * Search Tasks
    * Search on Tasks
    * @param accountId The logged in user.
    * @param groupingId Filter results by a grouping identifier defined by the client
    * @param filter A comma separated list of filters:  * MINE - Return tasks that the user has created * SHARED - Return tasks that have been shared to the user * FOLLOWER - Return tasks that have been created by the user&#39;&#39;s followers (the content needs to have been APPROVED or FEATURED) * FOLLOWING - Return tasks that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED) * PUBLIC - Return all PUBLIC tasks that have been APPROVED or FEATURED * ALL_PUBLIC - Return all PUBLIC tasks regardless of whether they are approved or not (ignores the approval status) * LIKED - Return all tasks that the user has liked * FEATURED - Return all tasks that have been featured * PENDING - Return all pending tasks 
    * @param statuses Filter results by status (comma separated list). Values include: NEW, ERROR, COMPLETE, PROCESSING, TEMPLATE
    * @param templateTypes Template Types
    * @param appKey Filter the list by a specific application
    * @param keyword Keyword search on the task names.
    * @param sortField The field to sort by. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, SCHEDULED_DATE, START_DATE, END_DATE
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param start Start the result set at some index.
    * @param limit Limit the result to some number.
    * @param activeOnly Determines whether to return only active results
    */
  def searchTasks(version: BigDecimal, accountId: Long, groupingId: Option[String], filter: Option[String], statuses: Option[String], templateTypes: Option[String], appKey: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean]): List[TaskResponse]

  /**
    * Update Task
    * Update a Task
    * @param taskId Task Id
    * @param accountId The logged in user.
    * @param name The name of the task
    * @param appKey The application to target
    * @param groupingId Client defined identifier for grouping tasks
    * @param endpointURL The URL for making an HTTP call
    * @param payload The parameters for making an HTTP call
    * @param scheduledDate The date and time of the task
    * @param startDate The starting date of the task
    * @param endDate The ending date of the task
    * @param cronExpression The cron expression that represents the task&#39;s schedule
    * @param visibility The determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)
    * @param active Sets whether the Task is active or not (inactive Tasks are not processed)
    */
  def updateTask(version: BigDecimal, taskId: Long, accountId: Long, name: Option[String], appKey: Option[String], groupingId: Option[String], endpointURL: Option[String], payload: Option[String], scheduledDate: Option[Long], startDate: Option[Long], endDate: Option[Long], cronExpression: Option[String], visibility: Option[String], active: Option[Boolean]): TaskResponse
}
