package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ReportDefinition.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ReportDefinition(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  query: Option[String],
  queryName: Option[String],
  displayName: Option[String],
  columnNames: Option[List[String]],
  nativeSql: Option[Boolean],
  display: Option[Boolean],
  dataSource: Option[ReportDefinition.DataSource.Value],
  maxLimit: Option[Long],
  maxDateRange: Option[Int],
  displayParams: Option[String],
  metaData: Option[String],
  columnNamesRaw: Option[String]
)

object ReportDefinition {
  implicit lazy val reportDefinitionJsonFormat: Format[ReportDefinition] = Json.format[ReportDefinition]

  // noinspection TypeAnnotation
  object DataSource extends Enumeration {
    val WRITE = Value("WRITE")
    val ANALYTIC = Value("ANALYTIC")
    val READ1 = Value("READ1")

    type DataSource = Value
    implicit lazy val DataSourceJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

