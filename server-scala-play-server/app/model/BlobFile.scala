package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BlobFile.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class BlobFile(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  owner: Option[Account],
  application: Option[Application],
  folderUri: Option[String],
  fileName: Option[String],
  file: Option[List[ArrayByte]]
)

object BlobFile {
  implicit lazy val blobFileJsonFormat: Format[BlobFile] = Json.format[BlobFile]
}

