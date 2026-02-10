package api

import play.api.libs.json._
import model.BigDecimal
import model.CsvImportResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait CSVImportApi {
  /**
    * Detail Status
    * @param accountId the id of the logged in user
    * @param batchId the id of the batch
    * @param responseGroup The group of categories to return: SUMMARY, DETAILS, ERRORS, OR ALL
    * @param start the start of the pagination
    * @param limit the limit of the pagination
    */
  def getStatusCSV(version: BigDecimal, accountId: Long, batchId: Long, responseGroup: String, start: Long, limit: Long): SirqulResponse

  /**
    * Search Status
    * Retrieves batches for a user.
    * @param accountId the id of the account
    * @param start the start of the pagination
    * @param limit the limit of the pagination
    */
  def listStatusCSV(version: BigDecimal, accountId: Long, start: Int, limit: Int): CsvImportResponse

  /**
    * Batch Status
    * Checks status of batch upload.
    * @param accountId the id of the account
    * @param batchId the id of the batch to get its status
    */
  def statusCSV(version: BigDecimal, accountId: Long, batchId: Long): CsvImportResponse

  /**
    * Upload CSV
    * Uploads a CSV import file.
    * @param accountId the id of the account
    * @param uploadType the upload type: OFFERS, RETAILERS, RETAILERLOCATIONS, CATEGORIES, OR FILTERS
    * @param importFile the import file to reference
    * @param fileFormat the format of the file
    * @param appKey the application key
    */
  def uploadCSV(version: BigDecimal, accountId: Long, uploadType: String, importFile: TemporaryFile, fileFormat: String, appKey: Option[String]): CsvImportResponse
}
