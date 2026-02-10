package api

import play.api.libs.json._
import model.BigDecimal
import model.RegionLegSummary
import model.ReportBatchResponse
import model.ReportRegionLegSummaryBatchResponse
import model.ReportResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait ReportingApi {
  /**
    * Create Offline Report
    * Create an entry for the batch for offline report
    * @param accountId The account id of the user for passing account related params
    * @param status the status of the report
    * @param previewLimit the limit on how much you can preview of the batch report
    * @param appKey The application key for passing application related params
    * @param endpoint 
    * @param parameters a json structure list of the parameter values, example: &#x60;&#x60;&#x60;json {   \&quot;string\&quot;:\&quot;value\&quot;,    \&quot;number\&quot;:3.345,   \&quot;date\&quot;:\&quot;2014-05-01 00:00:00\&quot; } &#x60;&#x60;&#x60; 
    * @param name name of the batch report
    * @param startDate the start date of the batch report
    * @param endDate the end date of the batch report
    * @param description the description of the batch report
    * @param pageUrl 
    */
  def createBatch(version: BigDecimal, accountId: Long, status: String, previewLimit: Int, appKey: Option[String], endpoint: Option[String], parameters: Option[String], name: Option[String], startDate: Option[Long], endDate: Option[Long], description: Option[String], pageUrl: Option[String]): ReportBatchResponse

  /**
    * Create Offline Report
    * Create an entry for the batch for offline report
    */
  def createRegionLegSummaryBatch(version: BigDecimal, body: Option[List[RegionLegSummary]]): ReportRegionLegSummaryBatchResponse

  /**
    * Delete Offline Report
    * Deletes a batch report.
    * @param accountId the id of the account
    * @param batchId the id of the batch to delete
    */
  def deleteBatch(version: BigDecimal, accountId: Long, batchId: Long): SirqulResponse

  /**
    * Get Offline Report
    * Checks status of batch report.
    * @param accountId the id of the logged in user
    * @param batchId returned by /report/batch/create
    * @param allResults whether to return all batch results or not
    */
  def getReportBatch(version: BigDecimal, accountId: Long, batchId: Long, allResults: Boolean): ReportBatchResponse

  /**
    * Run Report
    *  This endpoint allows you to run a set of predefined reports that can be used to understand your users&#39; behavior as well as trends within your application.
    * @param desc If true then descending order, false is ascending
    * @param accountId The account id of the user for passing account related params
    * @param query The named identifier of the query
    * @param parameters Parameter values used in the query in JSON format, example: &#x60;&#x60;&#x60;json {   \&quot;string\&quot;:\&quot;value\&quot;,    \&quot;number\&quot;:3.345,   \&quot;date\&quot;:\&quot;2014-05-01 00:00:00\&quot; } &#x60;&#x60;&#x60; 
    * @param order The order to use, must be a column name (see response results for list of column names)
    * @param start The start of the pagination
    * @param limit The limit of the pagination
    * @param responseFormat Determines what response format to return. Options are: JSON or CSV
    */
  def runReport(version: BigDecimal, desc: Boolean, accountId: Option[Long], query: Option[String], parameters: Option[String], order: Option[String], start: Option[Long], limit: Option[Long], responseFormat: Option[String]): ReportResponse

  /**
    * Search Offline Reports
    * Retrieves batches for a user..
    * @param accountId the id of the account logged in
    * @param start the start of the index and/or pagination
    * @param limit the limit of the index and/or pagination
    * @param names the names of the report batch to search on
    * @param appKey the application key
    * @param status the report batch status
    * @param globalAppSearch the global app to search on
    * @param startDate the start date of the report batch to search on
    * @param endDate the end date of the report batch to search on
    */
  def searchBatch(version: BigDecimal, accountId: Long, start: Int, limit: Int, names: Option[String], appKey: Option[String], status: Option[String], globalAppSearch: Option[Boolean], startDate: Option[Long], endDate: Option[Long]): List[ReportBatchResponse]
}
