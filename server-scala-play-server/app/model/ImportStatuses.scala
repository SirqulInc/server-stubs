package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ImportStatuses.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ImportStatuses(
  statuses: Option[List[ShipmentImportStatus]]
)

object ImportStatuses {
  implicit lazy val importStatusesJsonFormat: Format[ImportStatuses] = Json.format[ImportStatuses]
}

