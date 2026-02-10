package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserLocationListResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class UserLocationListResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  items: Option[List[UserLocationResponse]],
  userLocationType: Option[UserLocationListResponse.UserLocationType.Value],
  latitude: Option[Double],
  longitude: Option[Double],
  postalCode: Option[String],
  count: Option[Int],
  returning: Option[String]
)

object UserLocationListResponse {
  implicit lazy val userLocationListResponseJsonFormat: Format[UserLocationListResponse] = Json.format[UserLocationListResponse]

  // noinspection TypeAnnotation
  object UserLocationType extends Enumeration {
    val POSTALCODE = Value("POSTALCODE")
    val EXACT = Value("EXACT")

    type UserLocationType = Value
    implicit lazy val UserLocationTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

