package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ReportBatchResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ReportBatchResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  batchId: Option[Long],
  reportBatchStatus: Option[ReportBatchResponse.ReportBatchStatus.Value],
  errorMessage: Option[String],
  endpoint: Option[String],
  pageUrl: Option[String],
  name: Option[String],
  description: Option[String],
  created: Option[Long],
  updated: Option[Long],
  returning: Option[String]
)

object ReportBatchResponse {
  implicit lazy val reportBatchResponseJsonFormat: Format[ReportBatchResponse] = Json.format[ReportBatchResponse]

  // noinspection TypeAnnotation
  object ReportBatchStatus extends Enumeration {
    val NEW = Value("NEW")
    val ERROR = Value("ERROR")
    val COMPLETE = Value("COMPLETE")
    val PARSEERROR = Value("PARSE_ERROR")
    val PROCESSING = Value("PROCESSING")
    val DUPLICATE = Value("DUPLICATE")
    val SAVEONLY = Value("SAVEONLY")

    type ReportBatchStatus = Value
    implicit lazy val ReportBatchStatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

