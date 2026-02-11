package api

import model.SirqulResponse
import model.TriggerResponse

/**
  * Provides a default implementation for [[TriggerApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class TriggerApiImpl extends TriggerApi {
  /**
    * @inheritdoc
    */
  override def createTrigger(accountId: Long, name: String, appKey: Option[String], groupingId: Option[String], endpointURL: Option[String], payload: Option[String], scheduledDate: Option[Long], startDate: Option[Long], endDate: Option[Long], cronExpression: Option[String], conditionalInput: Option[String], visibility: Option[String], active: Option[Boolean]): TriggerResponse = {
    // TODO: Implement better logic

    TriggerResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteTrigger(accountId: Long, triggerId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getTrigger(accountId: Long, triggerId: Long): TriggerResponse = {
    // TODO: Implement better logic

    TriggerResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchTriggers(accountId: Long, groupingId: Option[String], filter: Option[String], statuses: Option[String], templateTypes: Option[String], appKey: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean]): List[TriggerResponse] = {
    // TODO: Implement better logic

    List.empty[TriggerResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateTrigger(triggerId: Long, accountId: Long, name: Option[String], appKey: Option[String], groupingId: Option[String], endpointURL: Option[String], payload: Option[String], scheduledDate: Option[Long], startDate: Option[Long], endDate: Option[Long], cronExpression: Option[String], conditionalInput: Option[String], visibility: Option[String], active: Option[Boolean]): TriggerResponse = {
    // TODO: Implement better logic

    TriggerResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
