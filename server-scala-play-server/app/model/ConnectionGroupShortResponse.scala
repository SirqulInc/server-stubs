package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConnectionGroupShortResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ConnectionGroupShortResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  connectionGroupId: Option[Long],
  name: Option[String],
  groupType: Option[ConnectionGroupShortResponse.GroupType.Value],
  thumbnailURL: Option[String],
  returning: Option[String]
)

object ConnectionGroupShortResponse {
  implicit lazy val connectionGroupShortResponseJsonFormat: Format[ConnectionGroupShortResponse] = Json.format[ConnectionGroupShortResponse]

  // noinspection TypeAnnotation
  object GroupType extends Enumeration {
    val PRIVATE = Value("PRIVATE")
    val FRIENDS = Value("FRIENDS")
    val TRUSTED = Value("TRUSTED")
    val BLOCKED = Value("BLOCKED")
    val FOLLOWERS = Value("FOLLOWERS")
    val FOLLOWING = Value("FOLLOWING")
    val PENDING = Value("PENDING")
    val REQUEST = Value("REQUEST")

    type GroupType = Value
    implicit lazy val GroupTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

