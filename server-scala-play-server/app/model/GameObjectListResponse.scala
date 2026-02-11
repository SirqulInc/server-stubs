package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GameObjectListResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class GameObjectListResponse(
  start: Option[Int],
  limit: Option[Int],
  countTotal: Option[Long],
  items: Option[List[GameObjectResponse]],
  count: Option[Int],
  hasMoreResults: Option[Boolean]
)

object GameObjectListResponse {
  implicit lazy val gameObjectListResponseJsonFormat: Format[GameObjectListResponse] = Json.format[GameObjectListResponse]
}

