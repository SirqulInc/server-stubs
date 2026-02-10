package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssetShortResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AssetShortResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  assetId: Option[Long],
  fileName: Option[String],
  caption: Option[String],
  mediaType: Option[String],
  thumbnailURL: Option[String],
  coverURL: Option[String],
  fullURL: Option[String],
  assetVersion: Option[String],
  versionName: Option[String],
  versionCode: Option[Int],
  returning: Option[String]
)

object AssetShortResponse {
  implicit lazy val assetShortResponseJsonFormat: Format[AssetShortResponse] = Json.format[AssetShortResponse]
}

