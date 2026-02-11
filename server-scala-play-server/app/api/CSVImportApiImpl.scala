package api

import model.CsvImportResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[CSVImportApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class CSVImportApiImpl extends CSVImportApi {
  /**
    * @inheritdoc
    */
  override def getStatusCSV(accountId: Long, batchId: Long, responseGroup: String, start: Long, limit: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def listStatusCSV(accountId: Long, start: Int, limit: Int): CsvImportResponse = {
    // TODO: Implement better logic

    CsvImportResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def statusCSV(accountId: Long, batchId: Long): CsvImportResponse = {
    // TODO: Implement better logic

    CsvImportResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def uploadCSV(accountId: Long, uploadType: String, importFile: TemporaryFile, fileFormat: String, appKey: Option[String]): CsvImportResponse = {
    // TODO: Implement better logic

    CsvImportResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
