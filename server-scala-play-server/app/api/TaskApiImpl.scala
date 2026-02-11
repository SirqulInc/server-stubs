package api

import model.SirqulResponse
import model.TaskResponse

/**
  * Provides a default implementation for [[TaskApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class TaskApiImpl extends TaskApi {
  /**
    * @inheritdoc
    */
  override def createTask(accountId: Long, name: String, appKey: Option[String], groupingId: Option[String], endpointURL: Option[String], payload: Option[String], scheduledDate: Option[Long], startDate: Option[Long], endDate: Option[Long], cronExpression: Option[String], visibility: Option[String], active: Option[Boolean]): TaskResponse = {
    // TODO: Implement better logic

    TaskResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteTask(accountId: Long, taskId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getTask(accountId: Long, taskId: Long): TaskResponse = {
    // TODO: Implement better logic

    TaskResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchTasks(accountId: Long, groupingId: Option[String], filter: Option[String], statuses: Option[String], templateTypes: Option[String], appKey: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean]): List[TaskResponse] = {
    // TODO: Implement better logic

    List.empty[TaskResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateTask(taskId: Long, accountId: Long, name: Option[String], appKey: Option[String], groupingId: Option[String], endpointURL: Option[String], payload: Option[String], scheduledDate: Option[Long], startDate: Option[Long], endDate: Option[Long], cronExpression: Option[String], visibility: Option[String], active: Option[Boolean]): TaskResponse = {
    // TODO: Implement better logic

    TaskResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
