package api

import model.AccountMiniResponse
import model.AssignmentResponse
import model.AssignmentStatusResponse
import model.BigDecimal
import model.SirqulResponse

/**
  * Provides a default implementation for [[AssignmentApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class AssignmentApiImpl extends AssignmentApi {
  /**
    * @inheritdoc
    */
  override def assigmentAssigneeAccountSearch(version: BigDecimal, accountId: Long, keyword: Option[String]): List[AccountMiniResponse] = {
    // TODO: Implement better logic

    List.empty[AccountMiniResponse]
  }

  /**
    * @inheritdoc
    */
  override def assignmentCreate(version: BigDecimal, accountId: Long, name: String, assigneeAccountId: Long, description: Option[String], retailerLocationId: Option[Long], tags: Option[String], active: Option[Boolean]): AssignmentResponse = {
    // TODO: Implement better logic

    AssignmentResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def assignmentDelete(version: BigDecimal, accountId: Long, assignmentId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def assignmentGet(version: BigDecimal, accountId: Long, assignmentId: Long): AssignmentResponse = {
    // TODO: Implement better logic

    AssignmentResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def assignmentSearch(version: BigDecimal, accountId: Long, sortField: String, descending: Boolean, activeOnly: Boolean, start: Int, limit: Int, creatorAccountId: Option[Long], assigneeAccountIds: Option[String], retailerLocationIds: Option[String], currentStatusType: Option[String], keyword: Option[String]): List[AssignmentResponse] = {
    // TODO: Implement better logic

    List.empty[AssignmentResponse]
  }

  /**
    * @inheritdoc
    */
  override def assignmentStatusCreate(version: BigDecimal, accountId: Long, assignmentId: Long, scheduledNotificationId: Option[Long], toDo: Option[String], connection: Option[String], method: Option[String], status: Option[String], closure: Option[String], message: Option[String], followUp: Option[Long], active: Option[Boolean]): AssignmentStatusResponse = {
    // TODO: Implement better logic

    AssignmentStatusResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def assignmentStatusDelete(version: BigDecimal, accountId: Long, assignmentStatusId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def assignmentStatusGet(version: BigDecimal, accountId: Long, assignmentStatusId: Long): AssignmentStatusResponse = {
    // TODO: Implement better logic

    AssignmentStatusResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def assignmentStatusSearch(version: BigDecimal, accountId: Long, sortField: String, descending: Boolean, activeOnly: Boolean, start: Int, limit: Int, assignmentId: Option[Long], creatorAccountId: Option[Long], assigneeAccountId: Option[Long], retailerLocationId: Option[Long], statusType: Option[String], keyword: Option[String]): List[AssignmentStatusResponse] = {
    // TODO: Implement better logic

    List.empty[AssignmentStatusResponse]
  }

  /**
    * @inheritdoc
    */
  override def assignmentStatusUpdate(version: BigDecimal, accountId: Long, assignmentStatusId: Long, scheduledNotificationId: Option[Long], toDo: Option[String], connection: Option[String], method: Option[String], status: Option[String], closure: Option[String], message: Option[String], followUp: Option[Long], active: Option[Boolean]): AssignmentStatusResponse = {
    // TODO: Implement better logic

    AssignmentStatusResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def assignmentUpdate(version: BigDecimal, accountId: Long, assignmentId: Long, name: Option[String], description: Option[String], assigneeAccountId: Option[Long], retailerLocationId: Option[Long], tags: Option[String], active: Option[Boolean]): AssignmentResponse = {
    // TODO: Implement better logic

    AssignmentResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
