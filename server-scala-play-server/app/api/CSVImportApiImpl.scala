package api

import model.BigDecimal
import model.CsvImportResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[CSVImportApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class CSVImportApiImpl extends CSVImportApi {
  /**
    * @inheritdoc
    */
  override def getStatusCSV(version: BigDecimal, accountId: Long, batchId: Long, responseGroup: String, start: Long, limit: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def listStatusCSV(version: BigDecimal, accountId: Long, start: Int, limit: Int): CsvImportResponse = {
    // TODO: Implement better logic

    CsvImportResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def statusCSV(version: BigDecimal, accountId: Long, batchId: Long): CsvImportResponse = {
    // TODO: Implement better logic

    CsvImportResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def uploadCSV(version: BigDecimal, accountId: Long, uploadType: String, importFile: TemporaryFile, fileFormat: String, appKey: Option[String]): CsvImportResponse = {
    // TODO: Implement better logic

    CsvImportResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
