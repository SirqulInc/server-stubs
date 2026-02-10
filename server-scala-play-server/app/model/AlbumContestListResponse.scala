package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AlbumContestListResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AlbumContestListResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  items: Option[List[AlbumContestResponse]],
  hasMoreResults: Option[Boolean],
  count: Option[Int],
  countTotal: Option[Long],
  returning: Option[String]
)

object AlbumContestListResponse {
  implicit lazy val albumContestListResponseJsonFormat: Format[AlbumContestListResponse] = Json.format[AlbumContestListResponse]
}

