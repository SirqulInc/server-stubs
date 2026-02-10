package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserLocationSearchResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class UserLocationSearchResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  hasMoreResults: Option[Boolean],
  count: Option[Int],
  userLocations: Option[List[UserLocationListResponse]],
  returning: Option[String]
)

object UserLocationSearchResponse {
  implicit lazy val userLocationSearchResponseJsonFormat: Format[UserLocationSearchResponse] = Json.format[UserLocationSearchResponse]
}

