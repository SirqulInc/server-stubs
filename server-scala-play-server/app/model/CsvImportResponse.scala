package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CsvImportResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class CsvImportResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  batchId: Option[Long],
  csvImportBatchStatus: Option[CsvImportResponse.CsvImportBatchStatus.Value],
  errorMessage: Option[String],
  objectType: Option[CsvImportResponse.ObjectType.Value],
  returning: Option[String]
)

object CsvImportResponse {
  implicit lazy val csvImportResponseJsonFormat: Format[CsvImportResponse] = Json.format[CsvImportResponse]

  // noinspection TypeAnnotation
  object CsvImportBatchStatus extends Enumeration {
    val NEW = Value("NEW")
    val ERROR = Value("ERROR")
    val COMPLETE = Value("COMPLETE")
    val PARSEERROR = Value("PARSE_ERROR")
    val PROCESSING = Value("PROCESSING")
    val DUPLICATE = Value("DUPLICATE")

    type CsvImportBatchStatus = Value
    implicit lazy val CsvImportBatchStatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ObjectType extends Enumeration {
    val OFFERS = Value("OFFERS")
    val RETAILERS = Value("RETAILERS")
    val RETAILERLOCATIONS = Value("RETAILERLOCATIONS")
    val CATEGORIES = Value("CATEGORIES")
    val FILTERS = Value("FILTERS")

    type ObjectType = Value
    implicit lazy val ObjectTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

