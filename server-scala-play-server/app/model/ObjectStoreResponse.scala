package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ObjectStoreResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ObjectStoreResponse(
  jsonObject: Option[JsonObject],
  request: Option[List[NameStringValueResponse]]
)

object ObjectStoreResponse {
  implicit lazy val objectStoreResponseJsonFormat: Format[ObjectStoreResponse] = Json.format[ObjectStoreResponse]
}

