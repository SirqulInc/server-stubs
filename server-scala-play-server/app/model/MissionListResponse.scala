package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MissionListResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class MissionListResponse(
  start: Option[Int],
  limit: Option[Int],
  countTotal: Option[Long],
  items: Option[List[MissionResponse]],
  hasMoreResults: Option[Boolean],
  count: Option[Int]
)

object MissionListResponse {
  implicit lazy val missionListResponseJsonFormat: Format[MissionListResponse] = Json.format[MissionListResponse]
}

