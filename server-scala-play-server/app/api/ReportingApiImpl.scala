package api

import model.RegionLegSummary
import model.ReportBatchResponse
import model.ReportRegionLegSummaryBatchResponse
import model.ReportResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[ReportingApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ReportingApiImpl extends ReportingApi {
  /**
    * @inheritdoc
    */
  override def createBatch(accountId: Long, status: String, previewLimit: Int, appKey: Option[String], endpoint: Option[String], parameters: Option[String], name: Option[String], startDate: Option[Long], endDate: Option[Long], description: Option[String], pageUrl: Option[String]): ReportBatchResponse = {
    // TODO: Implement better logic

    ReportBatchResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createRegionLegSummaryBatch(body: Option[List[RegionLegSummary]]): ReportRegionLegSummaryBatchResponse = {
    // TODO: Implement better logic

    ReportRegionLegSummaryBatchResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteBatch(accountId: Long, batchId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getReportBatch(accountId: Long, batchId: Long, allResults: Boolean): ReportBatchResponse = {
    // TODO: Implement better logic

    ReportBatchResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def runReport(desc: Boolean, accountId: Option[Long], query: Option[String], parameters: Option[String], order: Option[String], start: Option[Long], limit: Option[Long], responseFormat: Option[String]): ReportResponse = {
    // TODO: Implement better logic

    ReportResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchBatch(accountId: Long, start: Int, limit: Int, names: Option[String], appKey: Option[String], status: Option[String], globalAppSearch: Option[Boolean], startDate: Option[Long], endDate: Option[Long]): List[ReportBatchResponse] = {
    // TODO: Implement better logic

    List.empty[ReportBatchResponse]
  }
}
